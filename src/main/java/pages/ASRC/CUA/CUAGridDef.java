package pages.ASRC.CUA;

public class CUAGridDef {
 // line 117
  /*
  @Step("Filter compatible use authorization table <table name> on column <column name> by selecting filter checkbox <checkbox label>")
  public void filterCsTableOnColByCheckbox(String tableName, String columnName,
      String checkboxLabel) {
    logger.info("Filter compatible use authorization table" + checkboxLabel);
    WaitForLoad.waitForLoadIfExists();
    By tableBy = cuaPage.getCUAsTables(tableName);
    //if (tableName.equalsIgnoreCase("compatible use authorization") ||  tableName.equalsIgnoreCase("cua activity")) {
    //  sm.filterCDTableUsingCheckbox(tableBy, columnName, checkboxLabel);
    //} else {
    //  cuaPage.filterCDTableUsingCheckbox3(tableBy, columnName, checkboxLabel);
      try{
        if (tableName.equalsIgnoreCase("compatible use authorization") ||  tableName.equalsIgnoreCase("cua activity")) {
          sm.filterCDTableUsingCheckbox(tableBy, columnName, checkboxLabel);
        } else {
          cuaPage.filterCDTableUsingCheckbox3(tableBy, columnName, checkboxLabel);
        }
      }catch(StaleElementReferenceException e){
        if (tableName.equalsIgnoreCase("compatible use authorization") ||  tableName.equalsIgnoreCase("cua activity")) {
          sm.filterCDTableUsingCheckbox(tableBy, columnName, checkboxLabel);
        } else {
          cuaPage.filterCDTableUsingCheckbox3(tableBy, columnName, checkboxLabel);
        }
      }

    }
*/
}
