package design.mechitoua.patterns.structural.facade.impl;

import java.sql.Connection;

import design.mechitoua.patterns.structural.facade.PdfReport;

public class PdfReportImpl implements PdfReport {

    @Override
    public void generatePdfReport(Connection connection, String tableName) {
        System.out.println("Generating PDF report for table " + tableName);
    }

}
