package models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
public @Getter @Setter class Producto {
    private int idProducto;
    private String nombreProducto;
    @JsonProperty("estado")
    private boolean status;
}
