package UiStore;

import org.openqa.selenium.By;

public class watchUI {
    

    public By searchIcon() {
        return By.xpath("//*[@id=\"ownmenu\"]/li[12]");
          
    }

    public By searchBar() {
        return By.xpath("//input[@id='searchFieldVal']");
    }

    public By watchList() {
        return By.xpath("//*[@id=\"searchResultShowItems\"]/div/div/ul/li[1]/div/div[2]");
    }

    public By viewDetails() {
        return By.xpath("//*[@id=\"searchResultShowItems\"]/div/div/ul/li[1]/div/div[2]/ul/li[3]/a");
    }
   
}
