package com.arkvis.jlox;

import java.util.HashMap;
import java.util.Map;

class Environment {

    private final Map<String, Object> values = new HashMap<>();

    void define(String name, Object value) {
        values.put(name, value);
    }

    // TODO: Usage of Token here instead of string seems inconsistent.
    //  Its needed for throwing the runtime error but it should also be
    //  passed when defining the variable for consistency.
    Object get(Token name) {
        if (values.containsKey(name.lexeme)) {
            return values.get(name.lexeme);
        }
        throw new RuntimeError(name, "Undefined variable '" + name.lexeme + "'.");
    }
}
