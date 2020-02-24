package com.epam.logger.subtask1;

import org.apache.logging.log4j.*;

class CompoundInterest implements Interest {

    Double compoundInterest;
    static Logger LOGGER = LogManager.getLogger(ClientApp.class);

    CompoundInterest() {
        compoundInterest = 0d;
    }

    @Override
    public Double calculateInterest(Double rateOfInterest, Integer principalAmount, Double periodOfInterest) {
        compoundInterest = principalAmount * Math.pow((1 + rateOfInterest / 100), periodOfInterest);
        return compoundInterest-principalAmount;
    }
}