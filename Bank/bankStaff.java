package sample.templates.clients;

import java.io.IOException;
import java.util.ArrayList;


public class bankStaff extends Person {


    private int branchCode;
    private String position;
    private Image copyLastEducationDegree;
    private Image copyGavahiPayanKhedmat;
    private ArrayList<Image> copyGovahiSavabeghKar = new ArrayList<Image>();


    public int getBranchCode() {
        return branchCode;
    }

    public void setBranchCode(int branchCode) {
        this.branchCode = branchCode;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getCopyLastEducationDegree() {
        return copyLastEducationDegree.getoPath();
    }

    public void setCopyLastEducationDegree(String iPath, int width, int height, String oPath) throws IOException {
        Image copyNationalCart = new Image(iPath, width, height, oPath);
        copyNationalCart.rw();
    }

    public String getCopyGavahiPayanKhedmat() {
        return copyGavahiPayanKhedmat.getoPath();
    }

    public void setCopyGavahiPayanKhedmat(String iPath, int width, int height, String oPath) throws IOException {
        Image copyNationalCart = new Image(iPath, width, height, oPath);
        copyNationalCart.rw();
    }

    public ArrayList<String> getCopyGovahiSavabeghKar() {

        ArrayList<String> pathCopyGovahiSavabeghKar = new ArrayList<String>();

        for (Image copyGovahiSabegheKar : copyGovahiSavabeghKar){
            pathCopyGovahiSavabeghKar.add(copyGovahiSabegheKar.getoPath());
        }
        return pathCopyGovahiSavabeghKar;
    }

    public void setCopyGovahiSavabeghKar(String iPath, int width, int height, String oPath) throws IOException {
        Image copyGovahiSabegheKar = new Image(iPath, width, height, oPath);
        copyGovahiSabegheKar.rw();
        copyGovahiSavabeghKar.add(copyGovahiSabegheKar);
    }
}
