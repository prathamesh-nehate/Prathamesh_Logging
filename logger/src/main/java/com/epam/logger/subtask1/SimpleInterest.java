package com.epam.logger.subtask1;

import org.apache.logging.log4j.*;

class SimpleInterest implements Interest{
    
    Double simpleInterest;

    static Logger LOGGER = LogManager.getLogger(ClientApp.class);
    SimpleInterest(){
        simpleInterest = 0d;
    }

    @Override
    public Double calculateInterest(Double rateOfInterest, Integer principalAmount, Double periodOfInterest) {
        simpleInterest = (rateOfInterest * principalAmount *periodOfInterest)/100;
        return simpleInterest;
    }
}