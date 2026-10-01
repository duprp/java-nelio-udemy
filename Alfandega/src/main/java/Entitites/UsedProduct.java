package Entitites;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class UsedProduct  extends  Product{

    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");


    private Date manufacture;


    public UsedProduct() {

    }

    public UsedProduct(String name, Double price, Date manufacture) {
        super(name, price);
        this.manufacture = manufacture;
    }

    public Date getManufacture() {

        return manufacture;
    }

    public void setManufacture(Date manufacture) {

        this.manufacture = manufacture;
    }

    @Override
    public String priceTag() throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");


        return  getName()+
                " (used) "+
                " $ " +
                getPrice() +
                " (Manufacture date: " +
                sdf.format(getManufacture())+
                " )";
    }
}
