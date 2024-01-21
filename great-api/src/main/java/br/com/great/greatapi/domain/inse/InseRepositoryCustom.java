package br.com.great.greatapi.domain.inse;

import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface InseRepositoryCustom {
    List<Inse> customQuery(String city, String school, String uf);
}
