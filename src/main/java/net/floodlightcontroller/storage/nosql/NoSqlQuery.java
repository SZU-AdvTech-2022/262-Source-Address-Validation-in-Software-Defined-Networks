package net.floodlightcontroller.storage.nosql;
import java.util.HashMap;
import java.util.Map;
import net.floodlightcontroller.storage.IPredicate;
import net.floodlightcontroller.storage.IQuery;
import net.floodlightcontroller.storage.RowOrdering;
public class NoSqlQuery implements IQuery {
    private String tableName;
    private String[] columnNameList;
    private IPredicate predicate;
    private RowOrdering rowOrdering;
    private Map<String,Comparable<?>> parameterMap;
    NoSqlQuery(String className, String[] columnNameList, IPredicate predicate, RowOrdering rowOrdering) {
        this.tableName = className;
        this.columnNameList = columnNameList;
        this.predicate = predicate;
        this.rowOrdering = rowOrdering;
    }
    @Override
    public void setParameter(String name, Object value) {
        if (parameterMap == null)
            parameterMap = new HashMap<String,Comparable<?>>();
        parameterMap.put(name, (Comparable<?>)value);
    }
    @Override
    public String getTableName() {
        return tableName;
    }
    String[] getColumnNameList() {
        return columnNameList;
    }
    IPredicate getPredicate() {
        return predicate;
    }
    RowOrdering getRowOrdering() {
        return rowOrdering;
    }
    Comparable<?> getParameter(String name) {
        Comparable<?> value = null;
        if (parameterMap != null) {
            value = parameterMap.get(name);
        }
        return value;
    }
    Map<String,Comparable<?>> getParameterMap() {
        return parameterMap;
    }
}
