// Andrew Pak
package TJasn.virtualMachine;

import TJasn.TJ;

public class WRITESTRINGinstr extends TwoOperandInstruction {

  void execute ()
  {
    /* ???????? */
    for(int i = firstOperand;i <= secondOperand;i++){
      System.out.print((char)TJ.data[i]);
    }
  }

  public WRITESTRINGinstr (int startOffset, int endOffset)
  {
    super(startOffset, endOffset, "WRITESTRING");
  }
}

