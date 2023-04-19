FUNCTION_BLOCK product_quality
    VAR_INPUT
        price : REAL;
        durability : REAL;
        features : REAL;
    END_VAR
    VAR_OUTPUT
        quality : REAL;
    END_VAR
    FUZZIFY price
        TERM
