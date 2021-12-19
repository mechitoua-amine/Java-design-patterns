package design.mechitoua.patterns.structural.facade.impl;

import java.sql.Connection;

import design.mechitoua.patterns.structural.facade.ExcelReport;
import design.mechitoua.patterns.structural.facade.HtmlReport;
import design.mechitoua.patterns.structural.facade.PdfReport;

public class ReportFacade {
    private PdfReport pdfReport;
    private HtmlReport htmlReport;
    private ExcelReport excelReport;

    public ReportFacade() {
        pdfReport = new PdfReportImpl();
        htmlReport = new HtmlReportImpl();
        excelReport = new ExcelReportImpl();
    }

    public void generatePdfReport(Connection connection, String tableName) {
        pdfReport.generatePdfReport(connection, tableName);
    }

    public void generateHtmlReport(Connection connection, String tableName) {
        htmlReport.generateHtmlReport(connection, tableName);
    }

    public void generateExcelReport(Connection connection, String tableName) {
        excelReport.generateExcelReport(connection, tableName);
    }
}
