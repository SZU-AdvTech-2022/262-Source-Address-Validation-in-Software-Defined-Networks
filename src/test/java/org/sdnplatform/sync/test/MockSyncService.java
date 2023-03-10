package org.sdnplatform.sync.test;
import java.util.Collection;
import java.util.HashMap;
import org.sdnplatform.sync.ISyncService;
import org.sdnplatform.sync.error.SyncException;
import org.sdnplatform.sync.error.UnknownStoreException;
import org.sdnplatform.sync.internal.AbstractSyncManager;
import org.sdnplatform.sync.internal.store.IStorageEngine;
import org.sdnplatform.sync.internal.store.IStore;
import org.sdnplatform.sync.internal.store.InMemoryStorageEngine;
import org.sdnplatform.sync.internal.store.ListenerStorageEngine;
import org.sdnplatform.sync.internal.store.MappingStoreListener;
import org.sdnplatform.sync.internal.util.ByteArray;
import net.floodlightcontroller.core.module.FloodlightModuleContext;
import net.floodlightcontroller.core.module.FloodlightModuleException;
import net.floodlightcontroller.core.module.IFloodlightService;
public class MockSyncService extends AbstractSyncManager {
    private HashMap<String,ListenerStorageEngine> localStores =
            new HashMap<String, ListenerStorageEngine>();
    @Override
    public void registerStore(String storeName, Scope scope)
            throws SyncException {
        ListenerStorageEngine store = localStores.get(storeName);
        if (store != null) return;
        IStorageEngine<ByteArray, byte[]> memstore =
                new InMemoryStorageEngine<ByteArray, byte[]>(storeName);
        store = new ListenerStorageEngine(memstore, null);
        localStores.put(storeName, store);
    }
    @Override
    public void registerPersistentStore(String storeName, Scope scope)
            throws SyncException {
        registerStore(storeName, scope);
    }
    @Override
    public void init(FloodlightModuleContext context)
                    throws FloodlightModuleException {
    }
    @Override
    public void startUp(FloodlightModuleContext context)
            throws FloodlightModuleException {
    }
    @Override
    public Collection<Class<? extends IFloodlightService>>
            getModuleDependencies() {
        return null;
    }
    @Override
    public IStore<ByteArray, byte[]>
            getStore(String storeName) throws UnknownStoreException {
        return localStores.get(storeName);
    }
    @Override
    public short getLocalNodeId() {
        return Short.MAX_VALUE;
    }
    @Override
    public void addListener(String storeName, MappingStoreListener listener)
            throws UnknownStoreException {
        ListenerStorageEngine store = localStores.get(storeName);
        if (store == null) 
            throw new UnknownStoreException("Store " + storeName + 
                                            " has not been registered");
        store.addListener(listener);
    }
    @Override
    public void shutdown() {
    }
    public void reset() {
        localStores = new HashMap<String, ListenerStorageEngine>();
    }
}
