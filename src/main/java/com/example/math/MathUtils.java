package com.example.math;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MathUtils {
    private static final Logger logger = LoggerFactory.getLogger(MathUtils.class);

    public static long calculateFactorial(int n) {
        logger.info("Starting calculation: factorial of {}", n);

        if (n < 0) {
            logger.error("Invalid input detected: n = {}. Factorial is undefined for negative numbers.", n);
            throw new IllegalArgumentException("Input must be a non-negative integer.");
        }

        if (n > 20) {
            logger.warn("Input n = {} is too large. Potential long overflow.", n);
            throw new IllegalArgumentException("Input exceeds maximum supported value.");
        }

        long result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }

        logger.debug("Calculation successful: {}! = {}", n, result);
        return result;
    }
}
