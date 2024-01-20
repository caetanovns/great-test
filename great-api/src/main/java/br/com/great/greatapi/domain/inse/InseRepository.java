package br.com.great.greatapi.domain.inse;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface InseRepository extends MongoRepository<Inse, Long> {
}
