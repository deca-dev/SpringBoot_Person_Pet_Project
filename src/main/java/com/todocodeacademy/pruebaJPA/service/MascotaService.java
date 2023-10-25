
package com.todocodeacademy.pruebaJPA.service;

import com.todocodeacademy.pruebaJPA.model.Mascota;
import com.todocodeacademy.pruebaJPA.repository.IMascotaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MascotaService implements IMascotaService {
    
    @Autowired
    private IMascotaRepository imr;

    @Override
    public List<Mascota> getMascota() {
        List<Mascota> listaMascotas = imr.findAll();
        return listaMascotas;
    }

    @Override
    public Mascota findMascota(Long id_mascota) {
        Mascota mascota = imr.findById(id_mascota).orElse(null);
        return mascota;
    }

    @Override
    public void saveMascota(Mascota mascota) {
        imr.save(mascota);
    }

    @Override
    public void deleteMascota(Long id_mascota) {
        imr.deleteById(id_mascota);
    }

    @Override
    public void editMascota(Long idOriginal, String nuevoNombre, String nuevaEspecie, String nuevaRaza, String nuevoColor) {
        Mascota mascota = this.findMascota(idOriginal);
        mascota.setNombre(nuevoNombre);
        mascota.setEspecie(nuevaEspecie);
        mascota.setRaza(nuevaRaza);
        mascota.setColor(nuevoColor);
        
        this.saveMascota(mascota);
        
    }
    
}
