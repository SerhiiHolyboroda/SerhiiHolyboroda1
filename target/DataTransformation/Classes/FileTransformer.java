package com.DataTransformation.Classes;

import java.io.*;
import java.net.URL;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.IntStream;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvException;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVPrinter;
import org.apache.commons.csv.CSVRecord;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class FileTransformer   {


    public static void transformData() throws IOException, CsvException {


//        InputStream is = FileReader.class.getClassLoader().getResourceAsStream("TransformationTest.csv");
//        System.out.println(is);
//        URL path = FileTransformer.class.getResource("TransformationTest.csv");
//        File f = new File(path.getFile());



        CSVFormat format = CSVFormat.RFC4180.withHeader().withDelimiter(',');
        Path resourceDirectory = Paths.get("src","test","resources");
        CSVParser parser = new CSVParser(new FileReader(resourceDirectory+"\\TransformationTest.csv"), format);

        List<Employee> emps = new ArrayList<Employee>();
        for (CSVRecord record : parser) {
            Employee emp = new Employee();
            emp.setId(record.get("ID"));
            emp.setName(record.get("Name"));
            emp.setRole(record.get("Role"));
            emp.setSalary(record.get("Salary"));
            emps.add(emp);

            Workbook workbook = new HSSFWorkbook();





            Sheet sheet = workbook.createSheet("new");


            int rowIndex = 0;

                Random r = new Random();
                char c = (char)(r.nextInt(26) + 'a');
                Row row = sheet.createRow(rowIndex++);
                Cell cell0 = row.createCell(Integer.parseInt(record.get(rowIndex)));
                cell0.setCellValue(c);
                Cell cell1 = row.createCell(1);
                cell1.setCellValue(c);

        }

        String absolutePath = resourceDirectory.toFile().getAbsolutePath();

        Workbook workbook = new XSSFWorkbook();


//        File targetFile =new File(absolutePath , fileName + ".csv");
//        FileOutputStream fos1 = new FileOutputStream(targetFile);
//        workbook.write(fos1);











        parser.close();

        System.out.println(emps);


        CSVPrinter printer = new CSVPrinter(System.out, format.withDelimiter('#'));
        System.out.println("********");
        printer.printRecord("ID", "Name", "Role", "Salary");
        for (Employee emp : emps) {
            List<String> empData = new ArrayList<String>();
            empData.add(emp.getId());
            empData.add(emp.getName());
            empData.add(emp.getRole());
            empData.add(emp.getSalary());
            printer.printRecord(empData);
        }

        printer.close();

    }
}