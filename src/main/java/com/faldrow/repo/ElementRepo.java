package com.faldrow.repo;

import com.faldrow.model.Element;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

import static javafx.scene.input.KeyCode.T;

/**
 * Created by Artur on 15.06.2020.
 */
public interface ElementRepo extends JpaRepository<Element, Long> {

    Optional<Element> findById(Long id);

    void save();

    void saveAll();

}
