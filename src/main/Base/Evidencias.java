package Base;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.apache.commons.io.FileUtils; // Asegurate de tener commons-io

public class Evidencias {

    public static void tomarEvidencia(WebDriver driver, String nombreArchivo) throws IOException {

        if (driver instanceof TakesScreenshot) {

            TakesScreenshot screenshotDriver = (TakesScreenshot) driver;
            File screenshotFile = screenshotDriver.getScreenshotAs(OutputType.FILE);

            // Formato de fecha para que no se sobreescriban los archivos
            String timeStamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());
            String nombreFinal = nombreArchivo + "_" + timeStamp + ".png";

            // Carpeta donde se van a guardar las capturas
            File destino = new File("evidencias/" + nombreFinal);
            destino.getParentFile().mkdirs(); // <- Esto crea la carpeta si no existe

            FileUtils.copyFile(screenshotFile, destino);

            System.out.println("Captura guardada en: " + destino.getAbsolutePath());
        }
    }
}