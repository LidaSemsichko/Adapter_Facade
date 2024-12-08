package ua.edu.ucu.apps.task2;

import org.json.JSONObject;
import java.io.IOException;

public class CompanyInfoFacade {
    private PDLReader pdlReader;
    private WebScraper webScraper;
    private BrandfetchAPI brandfetchAPI;

    public CompanyInfoFacade() {
        pdlReader = new PDLReader();
        webScraper = new WebScraper();
        brandfetchAPI = new BrandfetchAPI();
    }

    public CompanyInfo getCompanyInfo(String website) throws IOException {
        CompanyInfo companyInfo = new CompanyInfo();

        JSONObject pdlData = pdlReader.getCompanyData(website);
        companyInfo.setPdlData(pdlData);
        JSONObject webData = webScraper.scrapeCompanyData(website);
        companyInfo.setWebData(webData);

        JSONObject brandfetchData = brandfetchAPI.getCompanyData(website);
        companyInfo.setBrandfetchData(brandfetchData);

        return companyInfo;
    }
}