
package com.ejemplo.foro.service;

import com.ejemplo.foro.model.Topico;
import com.ejemplo.foro.repository.TopicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TopicoService {

    @Autowired
    private TopicoRepository topicoRepository;

    public List<Topico> listarTopicos() {
        return topicoRepository.findAll();
    }

    public Topico crearTopico(Topico topico) {
        return topicoRepository.save(topico);
    }

    public void eliminarTopico(Long id) {
        topicoRepository.deleteById(id);
    }

    public Optional<Topico> obtenerTopico(Long id) {
        return topicoRepository.findById(id);
    }
}
