package com.ra.maptree.baitap;

public class Computer {
    private String computerId;
    private String model;
    private double price;
    private Provider provider;
    private boolean status;

    public Computer() {
    }

    public Computer(String computerId, String model, double price, Provider provider, boolean status) {
        this.computerId = computerId;
        this.model = model;
        this.price = price;
        this.provider = provider;
        this.status = status;
    }

    public String getComputerId() {
        return computerId;
    }

    public void setComputerId(String computerId) {
        this.computerId = computerId;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Provider getProvider() {
        return provider;
    }

    public void setProvider(Provider provider) {
        this.provider = provider;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public void searchId() {
//        if (providerId equas)
//        setProvider();
    }
//    public void inputComputer(){
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Mã Computer:\t");
//        computerId = sc.nextLine();
//        System.out.print("Mẫu Computer:\t");
//        model = sc.nextLine();
//        System.out.print("Giá :\t");
//        price = Double.parseDouble(sc.nextLine());
//        System.out.print("Hãng Computer:\t");
//        String providerId = sc.nextLine();
//        Provider _provider = providers.stream().filter(x -> x.getProviderId().equals(providerId)).findFirst().orElse(null);
//        c.
//        System.out.print("Trạng thái:\t");
//        status = Boolean.parseBoolean(sc.nextLine());
//    }

    @Override
    public String toString() {
        return "Computer{" +
                "computerId='" + computerId + '\'' +
                ", Model='" + model + '\'' +
                ", Price=" + price +
                ", Provider=" + provider +
                ", Status=" + status +
                '}' + "\n";
    }
}
