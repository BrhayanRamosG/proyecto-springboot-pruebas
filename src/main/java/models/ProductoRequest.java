package models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
public @Getter @Setter class ProductoRequest {
    private String nombreProducto;
    @JsonProperty("estado")
    private boolean status;
}
