package design.mechitoua.patterns.structural.facade;

import java.sql.Connection;

public interface HtmlReport {
    public abstract void generateHtmlReport(Connection connection, String tableName);
}
