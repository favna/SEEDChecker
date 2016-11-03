/*
 * Copyright (C) 2016 Favna
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package pkg_seedchecker;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.security.GeneralSecurityException;
import java.security.cert.X509Certificate;
import java.util.TimerTask;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;

/**
 *
 * @author Favna
 */
public class FileDownloader extends TimerTask {

    private final String titleID;
    private final String country;
    private final ResultLogger resultWindow;

    public FileDownloader() {
        this.resultWindow = new ResultLogger();
        this.titleID = "";
        this.country = "";
    }

    public FileDownloader(String titleID, String country) {
        this.resultWindow = new ResultLogger();
        this.titleID = titleID;
        this.country = country;
    }

    @Override
    public void run() {
        HttpsSeedChecker();
        resultWindow.txaLog.validate();
    }

    public void HttpsSeedChecker() {

        resultWindow.setVisible(true);

        // Setting File URL
        String serverURL = "https://kagiya-ctr.cdn.nintendo.net/title/0x";
        String fileURL = "/ext_key?country=";
        String fullURL = serverURL + titleID + fileURL + country;

        // Setting download path
        String home = System.getProperty("user.home");
        Path target = Paths.get(home + "/Downloads/" + titleID + ".dat");

        // Create a trust manager that does not validate certificate chains
        //<editor-fold defaultstate="collapsed" desc="certificate validator">
        TrustManager[] trustAllCerts = new TrustManager[]{
            new X509TrustManager() {
                public java.security.cert.X509Certificate[] getAcceptedIssuers() {
                    return new X509Certificate[0];
                }

                public void checkClientTrusted(
                        java.security.cert.X509Certificate[] certs, String authType) {
                }

                public void checkServerTrusted(
                        java.security.cert.X509Certificate[] certs, String authType) {
                }
            }
        };

// Install the all-trusting trust manager
        try {
            SSLContext sc = SSLContext.getInstance("SSL");
            sc.init(null, trustAllCerts, new java.security.SecureRandom());
            HttpsURLConnection.setDefaultSSLSocketFactory(sc.getSocketFactory());
        } catch (GeneralSecurityException e) {
        }
//</editor-fold>

        try {
            URL website = new URL(fullURL);

            try (InputStream in = website.openStream()) {
                Files.copy(in, target, StandardCopyOption.REPLACE_EXISTING);
                resultWindow.txaLog.append(String.join("", "Successfully downloaded SEED to " + target.toString()));
                resultWindow.txaLog.append("\n");
            }

        } catch (MalformedURLException ex) {
            System.out.println(ex);
        } catch (java.io.FileNotFoundException noseed) {
            resultWindow.txaLog.append(String.join("", "No seed available for " + titleID + " in " + country));
            resultWindow.txaLog.append("\n");
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
