package sales;

import java.util.ArrayList;
import java.util.List;


public class SalesStorage {

    private List<Sales> salesList = new ArrayList<>();


    public Sales add(Sales value) {
        value.setSaleID(generateId());
        salesList.add(value);
        return value;
    }

    private int generateId(){
        int max = 0;
        for (Sales sales: salesList){
            if(max < sales.getSaleID()){
                max = sales.getSaleID();
            }
        }
        return max+1;
    }

    public List<Sales> getAll() {
        return salesList;
    }
}
