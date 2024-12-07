package com.klef.jfsd.exam;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class ClientDemo {
    public static void main(String[] args) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();

        // Create Device
        Device device = new Device();
        device.setBrand("Generic");
        device.setModel("Model X");
        device.setPrice(5000);

        // Create Smartphone
        Smartphone smartphone = new Smartphone();
        smartphone.setBrand("Apple");
        smartphone.setModel("iPhone 14");
        smartphone.setPrice(100000);
        smartphone.setOperatingSystem("iOS");
        smartphone.setCameraResolution(12);

        // Create Tablet
        Tablet tablet = new Tablet();
        tablet.setBrand("Samsung");
        tablet.setModel("Galaxy Tab S8");
        tablet.setPrice(75000);
        tablet.setScreenSize(12.4);
        tablet.setBatteryLife(10);

        // Save records
        session.save(device);
        session.save(smartphone);
        session.save(tablet);

        transaction.commit();
        session.close();

        System.out.println("Records inserted successfully!");
    }
}
