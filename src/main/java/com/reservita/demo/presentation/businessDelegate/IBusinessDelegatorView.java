package com.reservita.demo.presentation.businessDelegate;

import com.reservita.demo.modelo.Establecimiento;
import com.reservita.demo.modelo.Factura;
import com.reservita.demo.modelo.Menu;
import com.reservita.demo.modelo.Mesa;
import com.reservita.demo.modelo.Reserva;
import com.reservita.demo.modelo.Rol;
import com.reservita.demo.modelo.Usuario;
import com.reservita.demo.modelo.control.EstablecimientoLogic;
import com.reservita.demo.modelo.control.FacturaLogic;
import com.reservita.demo.modelo.control.IEstablecimientoLogic;
import com.reservita.demo.modelo.control.IFacturaLogic;
import com.reservita.demo.modelo.control.IMenuLogic;
import com.reservita.demo.modelo.control.IMesaLogic;
import com.reservita.demo.modelo.control.IReservaLogic;
import com.reservita.demo.modelo.control.IRolLogic;
import com.reservita.demo.modelo.control.IUsuarioLogic;
import com.reservita.demo.modelo.control.MenuLogic;
import com.reservita.demo.modelo.control.MesaLogic;
import com.reservita.demo.modelo.control.ReservaLogic;
import com.reservita.demo.modelo.control.RolLogic;
import com.reservita.demo.modelo.control.UsuarioLogic;
import com.reservita.demo.modelo.dto.EstablecimientoDTO;
import com.reservita.demo.modelo.dto.FacturaDTO;
import com.reservita.demo.modelo.dto.MenuDTO;
import com.reservita.demo.modelo.dto.MesaDTO;
import com.reservita.demo.modelo.dto.ReservaDTO;
import com.reservita.demo.modelo.dto.RolDTO;
import com.reservita.demo.modelo.dto.UsuarioDTO;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.context.annotation.Scope;

import org.springframework.stereotype.Service;

import java.math.BigDecimal;

import java.util.Date;
import java.util.List;
import java.util.Set;


/**
* @author Zathura Code Generator http://zathuracode.org
* www.zathuracode.org
*
*/
public interface IBusinessDelegatorView {
    public List<Establecimiento> getEstablecimiento() throws Exception;

    public void saveEstablecimiento(Establecimiento entity)
        throws Exception;

    public void deleteEstablecimiento(Establecimiento entity)
        throws Exception;

    public void updateEstablecimiento(Establecimiento entity)
        throws Exception;

    public Establecimiento getEstablecimiento(Integer idEstablecimiento)
        throws Exception;

    public List<Establecimiento> findByCriteriaInEstablecimiento(
        Object[] variables, Object[] variablesBetween,
        Object[] variablesBetweenDates) throws Exception;

    public List<Establecimiento> findPageEstablecimiento(
        String sortColumnName, boolean sortAscending, int startRow,
        int maxResults) throws Exception;

    public Long findTotalNumberEstablecimiento() throws Exception;

    public List<EstablecimientoDTO> getDataEstablecimiento()
        throws Exception;

    public List<Factura> getFactura() throws Exception;

    public void saveFactura(Factura entity) throws Exception;

    public void deleteFactura(Factura entity) throws Exception;

    public void updateFactura(Factura entity) throws Exception;

    public Factura getFactura(Integer idFactura) throws Exception;

    public List<Factura> findByCriteriaInFactura(Object[] variables,
        Object[] variablesBetween, Object[] variablesBetweenDates)
        throws Exception;

    public List<Factura> findPageFactura(String sortColumnName,
        boolean sortAscending, int startRow, int maxResults)
        throws Exception;

    public Long findTotalNumberFactura() throws Exception;

    public List<FacturaDTO> getDataFactura() throws Exception;

    public List<Menu> getMenu() throws Exception;

    public void saveMenu(Menu entity) throws Exception;

    public void deleteMenu(Menu entity) throws Exception;

    public void updateMenu(Menu entity) throws Exception;

    public Menu getMenu(Integer idMenu) throws Exception;

    public List<Menu> findByCriteriaInMenu(Object[] variables,
        Object[] variablesBetween, Object[] variablesBetweenDates)
        throws Exception;

    public List<Menu> findPageMenu(String sortColumnName,
        boolean sortAscending, int startRow, int maxResults)
        throws Exception;

    public Long findTotalNumberMenu() throws Exception;

    public List<MenuDTO> getDataMenu() throws Exception;

    public List<Mesa> getMesa() throws Exception;

    public void saveMesa(Mesa entity) throws Exception;

    public void deleteMesa(Mesa entity) throws Exception;

    public void updateMesa(Mesa entity) throws Exception;

    public Mesa getMesa(Integer idMesa) throws Exception;

    public List<Mesa> findByCriteriaInMesa(Object[] variables,
        Object[] variablesBetween, Object[] variablesBetweenDates)
        throws Exception;

    public List<Mesa> findPageMesa(String sortColumnName,
        boolean sortAscending, int startRow, int maxResults)
        throws Exception;

    public Long findTotalNumberMesa() throws Exception;

    public List<MesaDTO> getDataMesa() throws Exception;

    public List<Reserva> getReserva() throws Exception;

    public void saveReserva(Reserva entity) throws Exception;

    public void deleteReserva(Reserva entity) throws Exception;

    public void updateReserva(Reserva entity) throws Exception;

    public Reserva getReserva(Integer idReserva) throws Exception;

    public List<Reserva> findByCriteriaInReserva(Object[] variables,
        Object[] variablesBetween, Object[] variablesBetweenDates)
        throws Exception;

    public List<Reserva> findPageReserva(String sortColumnName,
        boolean sortAscending, int startRow, int maxResults)
        throws Exception;

    public Long findTotalNumberReserva() throws Exception;

    public List<ReservaDTO> getDataReserva() throws Exception;

    public List<Rol> getRol() throws Exception;

    public void saveRol(Rol entity) throws Exception;

    public void deleteRol(Rol entity) throws Exception;

    public void updateRol(Rol entity) throws Exception;

    public Rol getRol(Integer idRol) throws Exception;

    public List<Rol> findByCriteriaInRol(Object[] variables,
        Object[] variablesBetween, Object[] variablesBetweenDates)
        throws Exception;

    public List<Rol> findPageRol(String sortColumnName, boolean sortAscending,
        int startRow, int maxResults) throws Exception;

    public Long findTotalNumberRol() throws Exception;

    public List<RolDTO> getDataRol() throws Exception;

    public List<Usuario> getUsuario() throws Exception;

    public void saveUsuario(Usuario entity) throws Exception;

    public void deleteUsuario(Usuario entity) throws Exception;

    public void updateUsuario(Usuario entity) throws Exception;

    public Usuario getUsuario(Integer idUsuario) throws Exception;

    public List<Usuario> findByCriteriaInUsuario(Object[] variables,
        Object[] variablesBetween, Object[] variablesBetweenDates)
        throws Exception;

    public List<Usuario> findPageUsuario(String sortColumnName,
        boolean sortAscending, int startRow, int maxResults)
        throws Exception;

    public Long findTotalNumberUsuario() throws Exception;

    public List<UsuarioDTO> getDataUsuario() throws Exception;
}
