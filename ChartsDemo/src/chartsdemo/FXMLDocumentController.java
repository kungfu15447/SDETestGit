/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chartsdemo;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.PieChart;
import javafx.scene.chart.XYChart;
import javafx.scene.control.Label;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.BorderPane;

/**
 *
 * @author Frederik Jensen
 */
public class FXMLDocumentController implements Initializable
{

    @FXML
    private MenuItem menuClose;
    @FXML
    private BorderPane borderPane;

    private PieChart buildPieChart()
    {

        //Data set
        ObservableList<PieChart.Data> pieChartData = FXCollections.observableArrayList(
                new PieChart.Data("JavaScript", 2300),
                new PieChart.Data("Python", 1000),
                new PieChart.Data("Java", 986),
                new PieChart.Data("Ruby", 870)
        );

        PieChart pieChart = new PieChart(pieChartData);
        pieChart.setTitle("Most popular programming languages");

        return pieChart;
    }

    private BarChart buildBarChart()
    {
        //Define category Axises
        CategoryAxis xAxis = new CategoryAxis();
        NumberAxis yAxis = new NumberAxis();
        xAxis.setLabel("Programming Language");
        yAxis.setLabel("# of devs x 1000");
        
        BarChart bChart = new BarChart(xAxis, yAxis);
       
        //Create dataset for barchart
        XYChart.Series dataset = new XYChart.Series();
        dataset.setName("Most popular programming language");
        
        dataset.getData().add(new XYChart.Data("JavaScript", 2300));
        dataset.getData().add(new XYChart.Data("Python", 1000));
        dataset.getData().add(new XYChart.Data("Java", 986));
        dataset.getData().add(new XYChart.Data("Ruby", 870));
        
        //Add dataset to chart
        bChart.getData().add(dataset);
        
        return bChart;
    }

    @FXML
    private void handleExit(ActionEvent event)
    {
        System.exit(0);
    }

    @FXML
    private void handleShowPieChart(ActionEvent event)
    {
        borderPane.setCenter(buildPieChart());
    }
    
    @FXML
    private void handleShowBarChart(ActionEvent event) {
        borderPane.setCenter(buildBarChart());
    }

    @Override
    public void initialize(URL url, ResourceBundle rb)
    {
        // TODO
    }

}
