package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import seleniumElements.Button;
import seleniumElements.Elements;
import seleniumElements.Fields;

public class Prospect {


    private static final By createFolderButton = By.xpath("//div[@data-test='aside-create-folder']");
    private static final By createNewProspectList = By.xpath("//button[@data-test='aside-create-new-lists']");
    private static final By createOrImportButton = By.xpath("//div[@data-test='add-human']");
    private static final By importFromFileButton = By.xpath("//ul[@data-test='add-human-list']//li[1]");
    private static final By createManuallyButton = By.xpath("//ul[@data-test='add-human-list']//li[2]");
    private static final By customFieldButton = By.xpath("//div[@data-test='add-custom-fields']");
    private static final By exportButton = By.xpath("//div[@data-test='export-prospects-button']");
    private static final By duplicateButton = By.xpath("//div[@data-test='filter-duplicates']");
    private static final By folderNameField = By.xpath("//input[@id='createNewList']");
    private static final By buttonCreate = By.xpath(" //input[@id='createNewList']//following::button[1]");
    private static final By folderName = By.xpath(" //span[@class='folder__name']");
    private static final By allListsTable = By.xpath("//ul[@class='aside__list-box']");

    private static final By listsItem = By.xpath(".//li");


    Button button = new Button();
    Fields fields = new Fields();
    Elements elements = new Elements();

    public Prospect pressCreateFolderButton() {
        button.click(createFolderButton);
        return this;
    }

    public Prospect setFolderName() {
//поправить ввод
        fields.cleanTypeField(folderNameField, "Folder" + System.currentTimeMillis());
        return this;
    }

    public Prospect clickCreateButton() {
        button.click(buttonCreate);
        return this;
    }

    public void checkCreatedFolder() {
//        for (int i = 0; i < 20; i++) {
//            System.out.println(elements.getListsName(allListsTable, listsItem));
//        }


//        WebElement element = null;
//        element = elements.waitElementPresenceLocated(allListsTable);
//        if (element != null)
//            System.out.println("Element  = " + element);
//
//        return true;
//    }
        elements.sel(allListsTable);
    }
}

