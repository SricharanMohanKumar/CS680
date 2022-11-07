package edu.umb.cs680.hw06;
import org.junit.jupiter.api.Test;
class PrintingFrameworkTest
{

  @Test
  public void ABCclass()
  {
      edu.umb.cs680.hw06.ModelABC.PrintJobExecutor a = new edu.umb.cs680.hw06.ModelABC.PrintJobExecutor();
      edu.umb.cs680.hw06.SecurityContext ctx = new edu.umb.cs680.hw06.SecurityContext(new User("user","password"));
      edu.umb.cs680.hw06.ModelABC.PrintJobExecutor.execute(a,"user","password",ctx);

  }

  @Test
  public void XYZclass()
  {
      edu.umb.cs680.hw06.ModelXYZ.PrintJobExecutor b = new edu.umb.cs680.hw06.ModelXYZ.PrintJobExecutor();
      edu.umb.cs680.hw06.SecurityContext ctx = new edu.umb.cs680.hw06.SecurityContext(new User("user","password"));
      edu.umb.cs680.hw06.ModelXYZ.PrintJobExecutor.execute(b,"user","password",ctx);
  }

}