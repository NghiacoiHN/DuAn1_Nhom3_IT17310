package ViewModels;

/**
 *
 * @author chutu
 */
public class LoaiSpResponse {

    private String id;
    private String ma;
    private String ten;
    private Integer trangThai;

    public LoaiSpResponse() {
    }

    public LoaiSpResponse(String id, String ma, String ten, Integer trangThai) {
        this.id = id;
        this.ma = ma;
        this.ten = ten;
        this.trangThai = trangThai;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public Integer getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(Integer trangThai) {
        this.trangThai = trangThai;
    }

    @Override
    public String toString() {
        return ten;
    }
    
    public String trangThai(){
        if(trangThai == 1){
            return "Còn";
        }
        else if(trangThai == 10){
            return "Hết";
        }else{
            return "Chưa xác định";
        }
    }
}
