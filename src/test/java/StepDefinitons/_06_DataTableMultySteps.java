package StepDefinitons;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;

import java.util.List;

public class _06_DataTableMultySteps {
    @And("Send this items with Data Table")
    public void sendThisItemsWithDataTable(DataTable dt) {
        List<List<String>> itemList = dt.asLists(String.class);

        for (int i = 0; i < itemList.size() ; i++) {
            for (int j = 0; j < itemList.size()-1; j++) {
                System.out.print(itemList.get(i).get(j));
            }
        }

    }
}
