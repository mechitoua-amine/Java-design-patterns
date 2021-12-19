package design.mechitoua.patterns.structural.facade.impl;

import java.sql.Connection;

import design.mechitoua.patterns.structural.facade.ExcelReport;

public class ExcelReportImpl implements ExcelReport {

    @Override
    public void generateExcelReport(Connection connection, String tableName) {
        System.out.println("Generating Excel report for table " + tableName);
    }

}
