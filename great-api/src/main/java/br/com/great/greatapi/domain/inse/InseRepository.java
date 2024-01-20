package br.com.great.greatapi.domain.inse;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface InseRepository extends MongoRepository<Inse, Long> {
    List<Inse> findByuf(String uf);

    List<Inse> findByCityName(String name);

    Inse findById   (String id);
}
