package com.epam.logger.subtask2;

import org.apache.logging.log4j.*;

class Material {
    private String name;
    private int costPerSqaureFeet;
    static Logger LOGGER = LogManager.getLogger(Material.class);

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCostPerSqaureFeet() {
        return costPerSqaureFeet;
    }

    public void setCostPerSqaureFeet(int costPerSqaureFeet) {
        this.costPerSqaureFeet = costPerSqaureFeet;
    }

    public Material(String name, int costPerSqaureFeet) {
        this.name = name;
        this.costPerSqaureFeet = costPerSqaureFeet;
        LOGGER.info("Material " + name + "Created");
    }
}
