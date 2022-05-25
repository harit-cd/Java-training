package campaign;

class Module {
    private String name = new String();
    private String address = new String();
    private String mobile = new String();
    private int amount;
    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
    public void setAddress(String address){
        this.address=address;
    }
    public String getAddress(){
        return address;
    }
    public String getMobile(){
        return mobile;
    }
    public void setMobile(String mobile){
        this.mobile= mobile;
    }
    public void setAmount(int amount){
        this.amount=amount;
    }
    public int getAmount(){
        return amount;
    }
}
