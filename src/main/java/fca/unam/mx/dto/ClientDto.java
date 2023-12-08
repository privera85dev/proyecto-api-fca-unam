package fca.unam.mx.dto;

import org.jdbi.v3.core.mapper.reflect.ColumnName;

public class ClientDto {
    private Long id;
    private String name;
    private String lastname;
    private String motherslastname;
    private String rfc;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @ColumnName("nombre")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @ColumnName("apellido_paterno")
    public String getLastname() {
        return lastname;
    }

    public void setLastname(String latsname) {
        this.lastname = lastname;
    }

    @ColumnName("apellido_materno")
    public String getMotherslastname() {
        return motherslastname;
    }

    public void setMotherslastname(String motherslastname) {
        this.motherslastname = motherslastname;
    }

    @ColumnName("rfc")
    public String getRfc() {
        return rfc;
    }

    public void setRfc(String rfc) {
        this.rfc = rfc;
    }

}
