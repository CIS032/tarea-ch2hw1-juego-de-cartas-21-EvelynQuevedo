/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

/**
 *
 * @author Toshiba
 */
@Entity
@Table(name = "CUETASBANCARIAS", catalog = "", schema = "ADMINISTRADOR")
@NamedQueries({
    @NamedQuery(name = "Cuetasbancarias.findAll", query = "SELECT c FROM Cuetasbancarias c")
    , @NamedQuery(name = "Cuetasbancarias.findByNumeroCuenta", query = "SELECT c FROM Cuetasbancarias c WHERE c.numeroCuenta = :numeroCuenta")
    , @NamedQuery(name = "Cuetasbancarias.findByCliente", query = "SELECT c FROM Cuetasbancarias c WHERE c.cliente = :cliente")
    , @NamedQuery(name = "Cuetasbancarias.findByTipoCuenta", query = "SELECT c FROM Cuetasbancarias c WHERE c.tipoCuenta = :tipoCuenta")
    , @NamedQuery(name = "Cuetasbancarias.findByMovimiento", query = "SELECT c FROM Cuetasbancarias c WHERE c.movimiento = :movimiento")
    , @NamedQuery(name = "Cuetasbancarias.findByFecha", query = "SELECT c FROM Cuetasbancarias c WHERE c.fecha = :fecha")
    , @NamedQuery(name = "Cuetasbancarias.findBySaldo", query = "SELECT c FROM Cuetasbancarias c WHERE c.saldo = :saldo")})
public class Cuetasbancarias implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "NUMERO_CUENTA")
    private String numeroCuenta;
    @Basic(optional = false)
    @Column(name = "CLIENTE")
    private String cliente;
    @Basic(optional = false)
    @Column(name = "TIPO_CUENTA")
    private String tipoCuenta;
    @Basic(optional = false)
    @Column(name = "MOVIMIENTO")
    private String movimiento;
    @Basic(optional = false)
    @Column(name = "FECHA")
    @Temporal(TemporalType.DATE)
    private Date fecha;
    @Basic(optional = false)
    @Column(name = "SALDO")
    private double saldo;

    public Cuetasbancarias() {
    }

    public Cuetasbancarias(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public Cuetasbancarias(String numeroCuenta, String cliente, String tipoCuenta, String movimiento, Date fecha, double saldo) {
        this.numeroCuenta = numeroCuenta;
        this.cliente = cliente;
        this.tipoCuenta = tipoCuenta;
        this.movimiento = movimiento;
        this.fecha = fecha;
        this.saldo = saldo;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        String oldNumeroCuenta = this.numeroCuenta;
        this.numeroCuenta = numeroCuenta;
        changeSupport.firePropertyChange("numeroCuenta", oldNumeroCuenta, numeroCuenta);
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        String oldCliente = this.cliente;
        this.cliente = cliente;
        changeSupport.firePropertyChange("cliente", oldCliente, cliente);
    }

    public String getTipoCuenta() {
        return tipoCuenta;
    }

    public void setTipoCuenta(String tipoCuenta) {
        String oldTipoCuenta = this.tipoCuenta;
        this.tipoCuenta = tipoCuenta;
        changeSupport.firePropertyChange("tipoCuenta", oldTipoCuenta, tipoCuenta);
    }

    public String getMovimiento() {
        return movimiento;
    }

    public void setMovimiento(String movimiento) {
        String oldMovimiento = this.movimiento;
        this.movimiento = movimiento;
        changeSupport.firePropertyChange("movimiento", oldMovimiento, movimiento);
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        Date oldFecha = this.fecha;
        this.fecha = fecha;
        changeSupport.firePropertyChange("fecha", oldFecha, fecha);
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        double oldSaldo = this.saldo;
        this.saldo = saldo;
        changeSupport.firePropertyChange("saldo", oldSaldo, saldo);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (numeroCuenta != null ? numeroCuenta.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Cuetasbancarias)) {
            return false;
        }
        Cuetasbancarias other = (Cuetasbancarias) object;
        if ((this.numeroCuenta == null && other.numeroCuenta != null) || (this.numeroCuenta != null && !this.numeroCuenta.equals(other.numeroCuenta))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Vista.Cuetasbancarias[ numeroCuenta=" + numeroCuenta + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
