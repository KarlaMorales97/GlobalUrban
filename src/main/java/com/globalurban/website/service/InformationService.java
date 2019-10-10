package com.globalurban.website.service;

import com.globalurban.website.domain.Information;
import org.springframework.dao.DataAccessException;

import javax.sound.midi.MidiDevice;
import java.util.List;

public interface InformationService {

    public List<Information> findAll();

    public Information findOne(Long id) throws DataAccessException;

    public Information save(Information information) throws DataAccessException;
}
