package main.java.com.github.example.models.responses;


import org.json.JSONPropertyName;


public class CreateRepositoryValidationErrorResp {

    private String message;


    private String documentation_url;


    @JSONPropertyName("message")
    public String getMessage() {
        return message;
    }

    @JSONPropertyName("message")
    public void setMessage(String value) {
        this.message = value;
    }

    @JSONPropertyName("documentation_url")
    public String getDocumentation_url() {
        return documentation_url;
    }

    @JSONPropertyName("documentation_url")
    public void setDocumentation_url(String value) {
        this.documentation_url = value;
    }

//    @JsonProperty("message")
//    public String getMessage() { return message; }
//    @JsonProperty("message")
//    public void setMessage(String value) { this.message = value; }
//
//    @JsonProperty("documentation_url")
//    public String getDocumentationURL() { return documentationURL; }
//    @JsonProperty("documentation_url")
//    public void setDocumentationURL(String value) { this.documentationURL = value; }
}
