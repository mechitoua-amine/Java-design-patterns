package design.mechitoua.patterns.structural.facade.impl;

import java.sql.Connection;

import design.mechitoua.patterns.structural.facade.HtmlReport;

public class HtmlReportImpl implements HtmlReport {

    @Override
    public void generateHtmlReport(Connection connection, String tableName) {
        System.out.println("Generating HTML report for table " + tableName);
    }

}
