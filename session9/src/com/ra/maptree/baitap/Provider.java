package com.ra.maptree.baitap;

import java.util.Scanner;

public class Provider {
    private String providerId;
    private String providerName;
    private boolean status;

    public Provider() {
    }

    public Provider(String providerId, String providerName, boolean status) {
        this.providerId = providerId;
        this.providerName = providerName;
        this.status = status;
    }

    //    {GETTER And
    public String getProviderId() {
        return providerId;
    }

    public void setProviderId(String providerId) {
        this.providerId = providerId;
    }

    public String getProviderName() {
        return providerName;
    }

    public void setProviderName(String providerName) {
        this.providerName = providerName;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public void inputProvider() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Mã nhà cung cấp");
        providerId = sc.nextLine();
        System.out.println("Tên nhà cung cấp");
        providerName = sc.nextLine();
        System.out.println("Trạng thái nhà Hãng");
        status = Boolean.parseBoolean(sc.nextLine());
    }

    @Override
    public String toString() {
        return "\n{" +
                "Mã nhà cung cấp='" + providerId + '\'' +
                ", Tên nhà cung cấp='" + providerName + '\'' +
                ", Trạng thái=" + status + '}';
    }

//    SETTER}
}
