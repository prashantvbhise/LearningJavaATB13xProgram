package ex_19_OOPS_Inheritance;

public class MainMethodSuperUser {
    public static void main(String[] args) {
        SuperAdmin sa= new SuperAdmin();
        sa.login();
        sa.accessAdminPanel();
        sa.shutdowmSystem();
    }

}
