package one.digitalInnovation.EstoqueCerveja.mapper;

import one.digitalInnovation.EstoqueCerveja.dto.BeerDTO;
import one.digitalInnovation.EstoqueCerveja.entity.Beer;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface BeerMapper {
    BeerMapper INSTANCE = Mappers.getMapper(BeerMapper.class);

    Beer toModel(BeerDTO beerDTO);

    BeerDTO toDTO(Beer beer);
}
