package com.todocodeacademy.pruebaJPA.service;

import com.todocodeacademy.pruebaJPA.model.Mascota;
import java.util.List;


public interface IMascotaService {
    public List<Mascota> getMascota();
    public Mascota findMascota(Long id_mascota);
    public void saveMascota(Mascota mascota);
    public void deleteMascota(Long id_mascota);
    public void editMascota(Long idOriginal, String nuevoNombre, String nuevaEspecie, String nuevaRaza, String nuevoColor);
}
