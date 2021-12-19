package design.mechitoua.patterns.structural.facade.client;

import java.sql.Connection;

import design.mechitoua.patterns.structural.facade.ExcelReport;
import design.mechitoua.patterns.structural.facade.HtmlReport;
import design.mechitoua.patterns.structural.facade.PdfReport;
import design.mechitoua.patterns.structural.facade.impl.ExcelReportImpl;
import design.mechitoua.patterns.structural.facade.impl.HtmlReportImpl;
import design.mechitoua.patterns.structural.facade.impl.PdfReportImpl;
import design.mechitoua.patterns.structural.facade.impl.ReportFacade;

public class Client {
    public static void main(String[] args) {
        Connection connection = null;
        String tableName = "employees";

        // without using facade pattern
        PdfReport pdfReport = new PdfReportImpl();
        pdfReport.generatePdfReport(connection, tableName);

        HtmlReport htmlReport = new HtmlReportImpl();
        htmlReport.generateHtmlReport(connection, tableName);

        ExcelReport excelReport = new ExcelReportImpl();
        excelReport.generateExcelReport(connection, tableName);
        System.out.println("---------------------- using facade --------------------------------");

        // using facade pattern
        ReportFacade reportFacade = new ReportFacade();
        reportFacade.generatePdfReport(connection, tableName);
        reportFacade.generateHtmlReport(connection, tableName);
        reportFacade.generateExcelReport(connection, tableName);
    }
}
