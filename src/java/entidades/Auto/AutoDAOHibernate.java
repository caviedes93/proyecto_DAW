/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package entidades.Auto;

import java.util.List;
import org.hibernate.Session;

/**
 *
 * @author andres
 */
public class AutoDAOHibernate implements AutoDAO{
    private Session sesion;

    public void setSesion(Session sesion) {
        this.sesion = sesion;
    }

    @Override
    public void guardar(Auto auto) {
        this.sesion.save(auto);
    }

    @Override
    public void actualizar(Auto auto) {
        this.sesion.update(auto);
    }

    @Override
    public void borrar(Auto auto) {
        this.sesion.delete(auto);
    }

    @Override
    public Auto cargar(Integer idAuto) {
        return (Auto)this.sesion.get(Auto.class, idAuto);
    }

    @Override
    public List<Auto> listar() {
        return this.sesion.createCriteria(Auto.class).list();
    }
}
