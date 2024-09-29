package ositranoffice365.ositran_office365_shared;

import lombok.Getter;
import lombok.Setter;

import java.util.List;
import java.util.UUID;

@Getter
@Setter
public class StatusSimpleResponse {
    private String id;
    private Boolean success;
    private Integer code;
    private String message;
    private List<String> details;

    public StatusSimpleResponse() {
        super();
        this.id = UUID.randomUUID().toString();
    }

    public StatusSimpleResponse(Boolean success, String message) {
        this.success = success;
        this.message = message;
    }
//    @Setter
//    @Getter
//    public UUID Id;
//    @Setter
//    @Getter
//    public String Titulo;
//    @Setter
//    @Getter
//    public String Detalle ;
//    @Setter
//    @Getter
//    public Dictionary<String, List<String>> Errores;
//    public int Codigo;
//    public boolean Satisfactorio;
//    private int _codigo;
//    private boolean _satisfactorio;
//
//    public int getCodigo() {
//        if(!this._satisfactorio && this._codigo == 200){
//            return 500;
//        }
//        return this._codigo;
//    }
//
//    public void setCodigo(int codigo) {
//        this._codigo = codigo;
//    }
//
//    public boolean getSatisfactorio() {
//        return this._satisfactorio;
//    }
//
//    public void setSatisfactorio(boolean satisfactorio) {
//        this._satisfactorio = satisfactorio;
//    }
//
//    public StatusSimpleResponse()
//    {
//        this.Id = UUID.randomUUID();
//        this.Codigo = 200;//Ok;
//        this.Titulo = null;
//        this.Detalle = null;
//    }
//
//    public StatusSimpleResponse(boolean satisfactorio, String titulo)
//    {
//        this.Id = UUID.randomUUID();
//        this.Codigo = 200;//Ok;
//        this.Satisfactorio = satisfactorio;
//        this.Titulo = titulo;
//    }
//
//    public StatusSimpleResponse(boolean satisfactorio, String titulo, String detalle)
//    {
//        this.Id = UUID.randomUUID();
//        this.Codigo = 200;//Ok;
//        this.Satisfactorio = satisfactorio;
//        this.Titulo = titulo;
//        this.Detalle = detalle;
//    }
//
//    public StatusSimpleResponse(boolean satisfactorio, String titulo, String detalle, int codigo)
//    {
//        this.Id = UUID.randomUUID();
//        this.Codigo = codigo;
//        this.Satisfactorio = satisfactorio;
//        this.Titulo = titulo;
//        this.Detalle = detalle;
//    }
//
//    public StatusSimpleResponse(String titulo, Dictionary<String, List<String>> errores)
//    {
//        this.Id = UUID.randomUUID();
//        this.Codigo = 200;//Ok;
//        this.Satisfactorio = false;
//        this.Titulo = titulo;
//        this.Detalle = null;
//        this.Errores = errores;
//    }
//
//    public StatusSimpleResponse(String titulo, String detalle, Dictionary<String, List<String>> errores)
//    {
//        this.Id = UUID.randomUUID();
//        this.Codigo = 200;//Ok;
//        this.Satisfactorio = false;
//        this.Titulo = titulo;
//        this.Detalle = detalle;
//        this.Errores = errores;
//    }
}
