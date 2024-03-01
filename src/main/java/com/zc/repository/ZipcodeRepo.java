package com.zc.repository;

import com.zc.entity.ZipCode;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ZipcodeRepo extends JpaRepository<ZipCode, Long> {
    Optional<List<ZipCode>> findBycodigoPostal(int code);
    Optional<List<ZipCode>> findByasentamiento(String colonia);

    Optional<Page<ZipCode>> findByestado(Pageable pageable, String estado);

    Optional<Page<ZipCode>> findByzona(Pageable pageable, String  zona);

    /*Optional<List<ZipCode>> finBycodigoPostal(int code);

    Optional<List<ZipCode>> findByasentamiento(String colonia);
    Optional<Page<ZipCode>> findByestado(Pageable pageable, String estado);
    Optional<Page<ZipCode>> findByZona(Pageable pageable, String zona);*/
}
