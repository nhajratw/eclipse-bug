package com.chikli.eclipsebug;

import org.springframework.data.repository.CrudRepository;

public interface SpringDataRepository extends CrudRepository<Foo, byte[]> {

}
