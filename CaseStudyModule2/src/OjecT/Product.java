package OjecT;

import Service.Service;

import java.util.ArrayList;
import java.util.List;

public class Product implements Service {
    private int id;
    private String name;
    private int price;                  //giá bán
    private int realPrice;              //giá bán
    private int pointBean;
    private int popular;

    public Product(){}
    public Product(int id, String name, int price, int realPrice, int pointBean, int popular){
        this.id = id;
        this.name = name;
        this.price = price;
        this.realPrice = realPrice;
        this.pointBean = pointBean;
        this.popular = popular;
    }

    List<Product> products = new ArrayList<>();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getRealPrice() {
        return realPrice;
    }

    public void setRealPrice(int realPrice) {
        this.realPrice = realPrice;
    }

    public int getPointBean() {
        return pointBean;
    }

    public void setPointBean(int pointBean) {
        this.pointBean = pointBean;
    }

    public int getPopular() {
        return popular;
    }

    public void setPopular(int popular) {
        this.popular = popular;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    @Override
    public void add(Object o) {

    }

    @Override
    public void update(Object o) {

    }

    @Override
    public void getAll() {

    }

    @Override
    public void remove(int id) {

    }

    @Override
    public void search(int id) {

    }

    public void remove(String name) {

    }

   
    public void search(String name) {

    }
}
