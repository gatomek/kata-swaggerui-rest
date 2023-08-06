package pl.gatomek.swaggerrest.data;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.UUID;

public class CustomUuid {
    public CustomUuid() {
        uuid = UUID.randomUUID().toString();
    }
    @ApiModelProperty( notes="Identyfikator uuid",name = "uuid", required = true)
    public String uuid;
}
