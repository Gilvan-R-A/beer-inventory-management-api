package one.digitalInnovation.EstoqueCerveja.builder;

import lombok.Builder;
import one.digitalInnovation.EstoqueCerveja.dto.BeerDTO;
import one.digitalInnovation.EstoqueCerveja.enums.BeerType;

@Builder
public class BeerDTOBuilder {
    @Builder.Default
    private Long id = 1L;

    @Builder.Default
    private String name = "Brahma";


    @Builder.Default
    private String brand = "Ambev";

    @Builder.Default
    private int max = 50;

    @Builder.Default
    private int quantity = 10;

    @Builder.Default
    private BeerType type = BeerType.LAGER;

    public BeerDTO toBeerDTO(){
        return new BeerDTO(id,
                name,
                brand,
                max,
                quantity,
                type);
   }
}
