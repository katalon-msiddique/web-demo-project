
/**
 * This class is generated automatically by Katalon Studio and should not be modified or deleted.
 */

import org.apache.poi.ss.usermodel.Sheet

import java.lang.String

import org.apache.poi.ss.usermodel.Workbook

import java.util.Map

import java.lang.Object

import org.apache.poi.ss.usermodel.Cell

import java.util.List

import org.apache.poi.ss.usermodel.Row

import com.kms.katalon.core.context.TestCaseContext

import com.kms.katalon.core.context.TestSuiteContext



def static "com.kms.katalon.keyword.excel.ExcelKeywords.getCellValueByRangeAddress"(
    	Sheet sheet	
     , 	String topLeftAddress	
     , 	String rightBottomAddress	) {
    (new com.kms.katalon.keyword.excel.ExcelKeywords()).getCellValueByRangeAddress(
        	sheet
         , 	topLeftAddress
         , 	rightBottomAddress)
}


def static "com.kms.katalon.keyword.excel.ExcelKeywords.createExcelSheet"(
    	Workbook workbook	) {
    (new com.kms.katalon.keyword.excel.ExcelKeywords()).createExcelSheet(
        	workbook)
}


def static "com.kms.katalon.keyword.excel.ExcelKeywords.createExcelSheet"(
    	Workbook workbook	
     , 	String sheetName	) {
    (new com.kms.katalon.keyword.excel.ExcelKeywords()).createExcelSheet(
        	workbook
         , 	sheetName)
}


def static "com.kms.katalon.keyword.excel.ExcelKeywords.getSheetNames"(
    	Workbook workbook	) {
    (new com.kms.katalon.keyword.excel.ExcelKeywords()).getSheetNames(
        	workbook)
}


def static "com.kms.katalon.keyword.excel.ExcelKeywords.createExcelFile"(
    	String filePath	) {
    (new com.kms.katalon.keyword.excel.ExcelKeywords()).createExcelFile(
        	filePath)
}


def static "com.kms.katalon.keyword.excel.ExcelKeywords.getCellByIndex"(
    	Sheet sheet	
     , 	int rowIdx	
     , 	int colIdx	) {
    (new com.kms.katalon.keyword.excel.ExcelKeywords()).getCellByIndex(
        	sheet
         , 	rowIdx
         , 	colIdx)
}


def static "com.kms.katalon.keyword.excel.ExcelKeywords.getRowIndexByCellContent"(
    	Sheet sheet	
     , 	String cellContent	
     , 	int columnIdxForCell	) {
    (new com.kms.katalon.keyword.excel.ExcelKeywords()).getRowIndexByCellContent(
        	sheet
         , 	cellContent
         , 	columnIdxForCell)
}


def static "com.kms.katalon.keyword.excel.ExcelKeywords.setValueToCellByAddresses"(
    	Sheet sheet	
     , 	Map content	) {
    (new com.kms.katalon.keyword.excel.ExcelKeywords()).setValueToCellByAddresses(
        	sheet
         , 	content)
}


def static "com.kms.katalon.keyword.excel.ExcelKeywords.setValueToCellByIndex"(
    	Sheet sheet	
     , 	int rowIndex	
     , 	int colIndex	
     , 	Object value	) {
    (new com.kms.katalon.keyword.excel.ExcelKeywords()).setValueToCellByIndex(
        	sheet
         , 	rowIndex
         , 	colIndex
         , 	value)
}


def static "com.kms.katalon.keyword.excel.ExcelKeywords.saveWorkbook"(
    	String filePath	
     , 	Workbook workbook	) {
    (new com.kms.katalon.keyword.excel.ExcelKeywords()).saveWorkbook(
        	filePath
         , 	workbook)
}


def static "com.kms.katalon.keyword.excel.ExcelKeywords.getCellIndexByAddress"(
    	Sheet sheet	
     , 	String cellAddress	) {
    (new com.kms.katalon.keyword.excel.ExcelKeywords()).getCellIndexByAddress(
        	sheet
         , 	cellAddress)
}


def static "com.kms.katalon.keyword.excel.ExcelKeywords.getCellValueByIndex"(
    	Sheet sheet	
     , 	int rowIdx	
     , 	int colIdx	) {
    (new com.kms.katalon.keyword.excel.ExcelKeywords()).getCellValueByIndex(
        	sheet
         , 	rowIdx
         , 	colIdx)
}


def static "com.kms.katalon.keyword.excel.ExcelKeywords.compareTwoCells"(
    	Cell cell1	
     , 	Cell cell2	) {
    (new com.kms.katalon.keyword.excel.ExcelKeywords()).compareTwoCells(
        	cell1
         , 	cell2)
}


def static "com.kms.katalon.keyword.excel.ExcelKeywords.compareTwoCells"(
    	Cell cell1	
     , 	Cell cell2	
     , 	boolean isValueOnly	) {
    (new com.kms.katalon.keyword.excel.ExcelKeywords()).compareTwoCells(
        	cell1
         , 	cell2
         , 	isValueOnly)
}


def static "com.kms.katalon.keyword.excel.ExcelKeywords.getDataRows"(
    	Sheet sheet	
     , 	java.util.List<java.lang.Integer> rowIndexs	) {
    (new com.kms.katalon.keyword.excel.ExcelKeywords()).getDataRows(
        	sheet
         , 	rowIndexs)
}


def static "com.kms.katalon.keyword.excel.ExcelKeywords.getCellByAddress"(
    	Sheet sheet	
     , 	String cellAddress	) {
    (new com.kms.katalon.keyword.excel.ExcelKeywords()).getCellByAddress(
        	sheet
         , 	cellAddress)
}


def static "com.kms.katalon.keyword.excel.ExcelKeywords.compareTwoExcels"(
    	Workbook workbook1	
     , 	Workbook workbook2	
     , 	boolean isValueOnly	) {
    (new com.kms.katalon.keyword.excel.ExcelKeywords()).compareTwoExcels(
        	workbook1
         , 	workbook2
         , 	isValueOnly)
}


def static "com.kms.katalon.keyword.excel.ExcelKeywords.compareTwoExcels"(
    	Workbook workbook1	
     , 	Workbook workbook2	) {
    (new com.kms.katalon.keyword.excel.ExcelKeywords()).compareTwoExcels(
        	workbook1
         , 	workbook2)
}


def static "com.kms.katalon.keyword.excel.ExcelKeywords.getExcelSheetByName"(
    	String filePath	
     , 	String sheetName	) {
    (new com.kms.katalon.keyword.excel.ExcelKeywords()).getExcelSheetByName(
        	filePath
         , 	sheetName)
}


def static "com.kms.katalon.keyword.excel.ExcelKeywords.getExcelSheet"(
    	String filePath	) {
    (new com.kms.katalon.keyword.excel.ExcelKeywords()).getExcelSheet(
        	filePath)
}


def static "com.kms.katalon.keyword.excel.ExcelKeywords.getExcelSheet"(
    	Workbook wbs	
     , 	String sheetName	) {
    (new com.kms.katalon.keyword.excel.ExcelKeywords()).getExcelSheet(
        	wbs
         , 	sheetName)
}


def static "com.kms.katalon.keyword.excel.ExcelKeywords.getExcelSheet"(
    	String filePath	
     , 	int sheetIndex	) {
    (new com.kms.katalon.keyword.excel.ExcelKeywords()).getExcelSheet(
        	filePath
         , 	sheetIndex)
}


def static "com.kms.katalon.keyword.excel.ExcelKeywords.getExcelSheet"(
    	Workbook wbs	) {
    (new com.kms.katalon.keyword.excel.ExcelKeywords()).getExcelSheet(
        	wbs)
}


def static "com.kms.katalon.keyword.excel.ExcelKeywords.getColumnsByIndex"(
    	Sheet sheet	
     , 	java.util.List<java.lang.Integer> columnIndexes	) {
    (new com.kms.katalon.keyword.excel.ExcelKeywords()).getColumnsByIndex(
        	sheet
         , 	columnIndexes)
}


def static "com.kms.katalon.keyword.excel.ExcelKeywords.getWorkbook"(
    	String filePath	) {
    (new com.kms.katalon.keyword.excel.ExcelKeywords()).getWorkbook(
        	filePath)
}


def static "com.kms.katalon.keyword.excel.ExcelKeywords.createExcelSheets"(
    	Workbook workbook	
     , 	java.util.List<String> sheetNames	) {
    (new com.kms.katalon.keyword.excel.ExcelKeywords()).createExcelSheets(
        	workbook
         , 	sheetNames)
}


def static "com.kms.katalon.keyword.excel.ExcelKeywords.createWorkbook"(
    	String filePath	) {
    (new com.kms.katalon.keyword.excel.ExcelKeywords()).createWorkbook(
        	filePath)
}


def static "com.kms.katalon.keyword.excel.ExcelKeywords.compareTwoSheets"(
    	Sheet sheet1	
     , 	Sheet sheet2	) {
    (new com.kms.katalon.keyword.excel.ExcelKeywords()).compareTwoSheets(
        	sheet1
         , 	sheet2)
}


def static "com.kms.katalon.keyword.excel.ExcelKeywords.compareTwoSheets"(
    	Sheet sheet1	
     , 	Sheet sheet2	
     , 	boolean isValueOnly	) {
    (new com.kms.katalon.keyword.excel.ExcelKeywords()).compareTwoSheets(
        	sheet1
         , 	sheet2
         , 	isValueOnly)
}


def static "com.kms.katalon.keyword.excel.ExcelKeywords.getCellValueByAddress"(
    	Sheet sheet	
     , 	String cellAddress	) {
    (new com.kms.katalon.keyword.excel.ExcelKeywords()).getCellValueByAddress(
        	sheet
         , 	cellAddress)
}


def static "com.kms.katalon.keyword.excel.ExcelKeywords.setValueToCellByAddress"(
    	Sheet sheet	
     , 	String cellAddress	
     , 	Object value	) {
    (new com.kms.katalon.keyword.excel.ExcelKeywords()).setValueToCellByAddress(
        	sheet
         , 	cellAddress
         , 	value)
}


def static "com.kms.katalon.keyword.excel.ExcelKeywords.compareTwoRows"(
    	Row row1	
     , 	Row row2	
     , 	boolean isValueOnly	) {
    (new com.kms.katalon.keyword.excel.ExcelKeywords()).compareTwoRows(
        	row1
         , 	row2
         , 	isValueOnly)
}


def static "com.kms.katalon.keyword.excel.ExcelKeywords.compareTwoRows"(
    	Row row1	
     , 	Row row2	) {
    (new com.kms.katalon.keyword.excel.ExcelKeywords()).compareTwoRows(
        	row1
         , 	row2)
}


def static "com.kms.katalon.keyword.excel.ExcelKeywords.getMapOfKeyValueRows"(
    	Sheet sheet	
     , 	int keyRowIdx	
     , 	int valueRowIdx	) {
    (new com.kms.katalon.keyword.excel.ExcelKeywords()).getMapOfKeyValueRows(
        	sheet
         , 	keyRowIdx
         , 	valueRowIdx)
}


def static "com.kms.katalon.keyword.excel.ExcelKeywords.getCellValue"(
    	Cell cell	) {
    (new com.kms.katalon.keyword.excel.ExcelKeywords()).getCellValue(
        	cell)
}


def static "com.kms.katalon.keyword.excel.ExcelKeywords.getTableContent"(
    	Sheet sheet	
     , 	int startRow	
     , 	int endRow	) {
    (new com.kms.katalon.keyword.excel.ExcelKeywords()).getTableContent(
        	sheet
         , 	startRow
         , 	endRow)
}


def static "com.kms.katalon.keyword.excel.ExcelKeywords.getCellValuesByRangeIndexes"(
    	Sheet sheet	
     , 	int rowInd1	
     , 	int colInd1	
     , 	int rowInd2	
     , 	int colInd2	) {
    (new com.kms.katalon.keyword.excel.ExcelKeywords()).getCellValuesByRangeIndexes(
        	sheet
         , 	rowInd1
         , 	colInd1
         , 	rowInd2
         , 	colInd2)
}


def static "com.kms.katalon.keyword.excel.ExcelKeywords.locateCell"(
    	Sheet sheet	
     , 	Object cellContent	) {
    (new com.kms.katalon.keyword.excel.ExcelKeywords()).locateCell(
        	sheet
         , 	cellContent)
}


def static "com.katalon.extent.report.ExtentReport.deleteFolderContents"() {
    (new com.katalon.extent.report.ExtentReport()).deleteFolderContents()
}


def static "com.katalon.extent.report.ExtentReport.flushEReport"() {
    (new com.katalon.extent.report.ExtentReport()).flushEReport()
}


def static "com.katalon.extent.report.ExtentReport.takeScreenshotFailure"(
    	TestCaseContext testCaseContext	) {
    (new com.katalon.extent.report.ExtentReport()).takeScreenshotFailure(
        	testCaseContext)
}


def static "com.katalon.extent.report.ExtentReport.attachEReport"(
    	TestSuiteContext testSuiteContext	
     , 	String setDocumentTitle	
     , 	String setReportTitle	
     , 	String projectDir	) {
    (new com.katalon.extent.report.ExtentReport()).attachEReport(
        	testSuiteContext
         , 	setDocumentTitle
         , 	setReportTitle
         , 	projectDir)
}


def static "com.katalon.extent.report.ExtentReport.attachEReport"(
    	TestSuiteContext testSuiteContext	
     , 	String setDocumentTitle	
     , 	String setReportTitle	) {
    (new com.katalon.extent.report.ExtentReport()).attachEReport(
        	testSuiteContext
         , 	setDocumentTitle
         , 	setReportTitle)
}


def static "com.katalon.extent.report.ExtentReport.startEReport"(
    	TestCaseContext testCaseContext	) {
    (new com.katalon.extent.report.ExtentReport()).startEReport(
        	testCaseContext)
}


def static "com.katalon.extent.report.ExtentReport.addScreenshot"() {
    (new com.katalon.extent.report.ExtentReport()).addScreenshot()
}


def static "com.katalon.extent.report.ExtentReport.addScreenshot"(
    	String newScreenshotpath	) {
    (new com.katalon.extent.report.ExtentReport()).addScreenshot(
        	newScreenshotpath)
}


def static "com.katalon.extent.report.ExtentReport.attachLog"(
    	String details	) {
    (new com.katalon.extent.report.ExtentReport()).attachLog(
        	details)
}


def static "com.kms.katalon.keyword.pdf.PDF.getPageNumber"(
    	String file	) {
    (new com.kms.katalon.keyword.pdf.PDF()).getPageNumber(
        	file)
}


def static "com.kms.katalon.keyword.pdf.PDF.compareAllPages"(
    	String file1	
     , 	String file2	
     , 	Object excludePattern	) {
    (new com.kms.katalon.keyword.pdf.PDF()).compareAllPages(
        	file1
         , 	file2
         , 	excludePattern)
}


def static "com.kms.katalon.keyword.pdf.PDF.extractAllImages"(
    	String file	) {
    (new com.kms.katalon.keyword.pdf.PDF()).extractAllImages(
        	file)
}


def static "com.kms.katalon.keyword.pdf.PDF.saveAllPagesAsImages"(
    	String file	) {
    (new com.kms.katalon.keyword.pdf.PDF()).saveAllPagesAsImages(
        	file)
}


def static "com.kms.katalon.keyword.pdf.PDF.compareFromPage"(
    	String file1	
     , 	String file2	
     , 	int startPage	
     , 	Object excludePattern	) {
    (new com.kms.katalon.keyword.pdf.PDF()).compareFromPage(
        	file1
         , 	file2
         , 	startPage
         , 	excludePattern)
}


def static "com.kms.katalon.keyword.pdf.PDF.savePageRangeAsImages"(
    	String file	
     , 	int startPage	
     , 	int endPage	) {
    (new com.kms.katalon.keyword.pdf.PDF()).savePageRangeAsImages(
        	file
         , 	startPage
         , 	endPage)
}


def static "com.kms.katalon.keyword.pdf.PDF.savePageAsImage"(
    	String file	
     , 	int startPage	) {
    (new com.kms.katalon.keyword.pdf.PDF()).savePageAsImage(
        	file
         , 	startPage)
}


def static "com.kms.katalon.keyword.pdf.PDF.compareByPixel"(
    	String file1	
     , 	String file2	
     , 	int startPage	
     , 	int endPage	
     , 	boolean highlightImageDifferences	
     , 	boolean showAllDifferences	) {
    (new com.kms.katalon.keyword.pdf.PDF()).compareByPixel(
        	file1
         , 	file2
         , 	startPage
         , 	endPage
         , 	highlightImageDifferences
         , 	showAllDifferences)
}


def static "com.kms.katalon.keyword.pdf.PDF.extractImagesFromPage"(
    	String file	
     , 	int startPage	) {
    (new com.kms.katalon.keyword.pdf.PDF()).extractImagesFromPage(
        	file
         , 	startPage)
}


def static "com.kms.katalon.keyword.pdf.PDF.extractImagesInPageRange"(
    	String file	
     , 	int startPage	
     , 	int endPage	) {
    (new com.kms.katalon.keyword.pdf.PDF()).extractImagesInPageRange(
        	file
         , 	startPage
         , 	endPage)
}


def static "com.kms.katalon.keyword.pdf.PDF.compareInPageRange"(
    	String file1	
     , 	String file2	
     , 	int startPage	
     , 	int endPage	
     , 	Object excludePattern	) {
    (new com.kms.katalon.keyword.pdf.PDF()).compareInPageRange(
        	file1
         , 	file2
         , 	startPage
         , 	endPage
         , 	excludePattern)
}


def static "com.kms.katalon.keyword.pdf.PDF.getTextFromPage"(
    	String file	
     , 	int startPage	) {
    (new com.kms.katalon.keyword.pdf.PDF()).getTextFromPage(
        	file
         , 	startPage)
}


def static "com.kms.katalon.keyword.pdf.PDF.getTextInPageRange"(
    	String file	
     , 	int startPage	
     , 	int endPage	) {
    (new com.kms.katalon.keyword.pdf.PDF()).getTextInPageRange(
        	file
         , 	startPage
         , 	endPage)
}


def static "com.kms.katalon.keyword.pdf.PDF.getAllText"(
    	String file	) {
    (new com.kms.katalon.keyword.pdf.PDF()).getAllText(
        	file)
}
