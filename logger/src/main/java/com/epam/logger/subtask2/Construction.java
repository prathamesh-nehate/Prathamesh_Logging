package com.epam.logger.subtask2;

import org.apache.logging.log4j.*;
import java.util.Hashtable;
import java.util.Map;

class InputValueException extends Exception{
    private static final long serialVersionUID = 1L;

    InputValueException(String s) {
        super(s);
    }
}
class Construction {
    static Map<Integer, Material> materialList;

    static Logger LOGGER;
    Construction() {
        LOGGER = LogManager.getLogger(Construction.class);
        initializeMaterialList();

    }

    static void initializeMaterialList() {
        Material standard = new Material("Standard", 1200);
        Material aboveStandard = new Material("Above Standard", 1500);
        Material highStandard = new Material("High Standard", 1800);
        Material highStandardAndAutomated = new Material("High Standard + Automated", 2500);


        materialList = new Hashtable<Integer, Material>(4);
        materialList.put(1, standard);
        materialList.put(2, aboveStandard);
        materialList.put(3, highStandard);
        materialList.put(4, highStandardAndAutomated);
        LOGGER.info("Material List Created");
    }

    static int getMaterialCost(int enumerationIndex) {
        return materialList.get(enumerationIndex).getCostPerSqaureFeet();
    }

    int calculateCostPerSquareFeet(int enumerationIndex, int squareFeet) throws InputValueException {
        if (enumerationIndex > 4 || enumerationIndex < 1)
            throw new InputValueException("Error : 'Invalid Material Menu Index.'");
        if (squareFeet == 0)
            throw new InputValueException("Error : 'Carpet Area cannot be zero.'");
        return getMaterialCost(enumerationIndex) * squareFeet;
    }
}