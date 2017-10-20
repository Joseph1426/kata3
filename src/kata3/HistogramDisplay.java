package kata3;

import java.awt.Dimension;
import javax.swing.JPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.ui.ApplicationFrame;

public class HistogramDisplay extends ApplicationFrame{
    
    public HistogramDisplay(){
        super("Histograma de emails");
        setContentPane(createPanel());
        pack(); //para que coja la ventana adecuada
    }
    
    public void execute(){
        setVisible(true);
    }

    private JPanel createPanel() {
        ChartPanel chartPanel = new ChartPanel(createChart(createDataset()));
        chartPanel.setPreferredSize(new Dimension(500, 400));
        return chartPanel;
    }
    
    private JFreeChart createChart(DefaultCategoryDataset dataSet){
        JFreeChart chart = ChartFactory.createBarChart(
                "Histograma JFreeChar", 
                "Dominios email", 
                "Nº de emails", 
                dataSet, 
                PlotOrientation.VERTICAL, 
                false, 
                rootPaneCheckingEnabled,    //si lo ponemos a true, pasamos el raton por encima de la graf. y sale dominio y valor
                rootPaneCheckingEnabled);
        return chart;
    }
    
    private DefaultCategoryDataset createDataset(){
        DefaultCategoryDataset dataSet = new DefaultCategoryDataset();
        dataSet.addValue(15, "", "ulpgc.es");   //si metemos un valor en le 2º cambia la gráfica
        dataSet.addValue(1, "", "hotmail.com");
        dataSet.addValue(10, "", "ull.es");
        dataSet.addValue(7, "", "gmail.com");//para copiar hacia abajo es control+May+flechaAbajo
        return dataSet;
    }
    
}
