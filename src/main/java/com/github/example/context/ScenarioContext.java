package main.java.com.github.example.context;

import main.java.com.github.example.ApiContext;

import java.util.HashMap;

public class ScenarioContext {

    private final HashMap<ApiContext, Object> context = new HashMap<>();

    public void setContext(ApiContext key, Object value) {
        context.put(key, value);
    }

    public Object getContext(ApiContext key) {
        return context.get(key);
    }

    public boolean containsContext(ApiContext key) {
        return context.containsKey(key);
    }

    public void clearContext() {
        context.clear();
    }
}
