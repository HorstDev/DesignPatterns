package com.example.structuralPatterns.proxy;

public class Proxy implements IResource {

    private final RealResource realResource = new RealResource();
    private final String secretKey;

    public Proxy(String secretKey) {
        this.secretKey = secretKey;
    }

    @Override
    public void accessResource() {
        if (checkAccess())
            realResource.accessResource();
        else
            System.out.println("Доступ к ресурсу запрещен!");
    }

    private boolean checkAccess() {
        return this.secretKey.equals("secretKey123");
    }
}
