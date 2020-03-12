class Item{
    String name;
    int price;
    String info;

    Item(String name,int price,String info){
        this.name=name;
        this.price=price;
        this.info=info;
    }
    String getName(){
        return name;
    }
    int getPrice(){
        return price;
    }
    String getInfo(){
        return info;
    }

}