package main.java.com.github.example.models.requests;


import com.fasterxml.jackson.annotation.JsonProperty;


public class CreateRepositoryReq {
    private String name;
    private String description;

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String value) {
        this.name = value;
    }

    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    @JsonProperty("description")
    public void setDescription(String value) {
        this.description = value;
    }

}
