// Do not edit this file!  It was generated by Melati POEM's DSD preprocessor.

package org.melati.courteouspoem.poem.generated;


import org.melati.poem.PoemDatabase;
import org.melati.poem.DefinitionSource;
import org.melati.poem.User;
import org.melati.poem.UserTable;
import org.melati.poem.Group;
import org.melati.poem.GroupTable;
import org.melati.poem.Capability;
import org.melati.poem.CapabilityTable;
import org.melati.poem.GroupMembership;
import org.melati.poem.GroupMembershipTable;
import org.melati.poem.GroupCapability;
import org.melati.poem.GroupCapabilityTable;
import org.melati.poem.TableCategory;
import org.melati.poem.TableCategoryTable;
import org.melati.poem.TableInfo;
import org.melati.poem.TableInfoTable;
import org.melati.poem.ColumnInfo;
import org.melati.poem.ColumnInfoTable;
import org.melati.poem.Setting;
import org.melati.poem.SettingTable;

/**
 * Melati POEM generated Database base class.
 */
public class CourteouspoemDatabaseBase extends PoemDatabase {

  private UserTable<User> tab_user = null;
  private GroupTable<Group> tab_group = null;
  private CapabilityTable<Capability> tab_capability = null;
  private GroupMembershipTable<GroupMembership> tab_groupmembership = null;
  private GroupCapabilityTable<GroupCapability> tab_groupcapability = null;
  private TableCategoryTable<TableCategory> tab_tablecategory = null;
  private TableInfoTable<TableInfo> tab_tableinfo = null;
  private ColumnInfoTable<ColumnInfo> tab_columninfo = null;
  private SettingTable<Setting> tab_setting = null;

  protected CourteouspoemDatabaseBase() {
    redefineTable(tab_user = new UserTable<User>(this, "user", DefinitionSource.dsd));
    redefineTable(tab_group = new GroupTable<Group>(this, "group", DefinitionSource.dsd));
    redefineTable(tab_capability = new CapabilityTable<Capability>(this, "capability", DefinitionSource.dsd));
    redefineTable(tab_groupmembership = new GroupMembershipTable<GroupMembership>(this, "groupMembership", DefinitionSource.dsd));
    redefineTable(tab_groupcapability = new GroupCapabilityTable<GroupCapability>(this, "groupCapability", DefinitionSource.dsd));
    redefineTable(tab_tablecategory = new TableCategoryTable<TableCategory>(this, "tableCategory", DefinitionSource.dsd));
    redefineTable(tab_tableinfo = new TableInfoTable<TableInfo>(this, "tableInfo", DefinitionSource.dsd));
    redefineTable(tab_columninfo = new ColumnInfoTable<ColumnInfo>(this, "columnInfo", DefinitionSource.dsd));
    redefineTable(tab_setting = new SettingTable<Setting>(this, "setting", DefinitionSource.dsd));
  }


 /**
  * Retrieves the UserTable table.
  *
  * see org.melati.poem.prepro.TableDef#generateTableAccessorJava 
  * @return the UserTable from this database
  */
  public UserTable<User> getUserTable() {
    return tab_user;
  }


 /**
  * Retrieves the GroupTable table.
  *
  * see org.melati.poem.prepro.TableDef#generateTableAccessorJava 
  * @return the GroupTable from this database
  */
  public GroupTable<Group> getGroupTable() {
    return tab_group;
  }


 /**
  * Retrieves the CapabilityTable table.
  *
  * see org.melati.poem.prepro.TableDef#generateTableAccessorJava 
  * @return the CapabilityTable from this database
  */
  public CapabilityTable<Capability> getCapabilityTable() {
    return tab_capability;
  }


 /**
  * Retrieves the GroupMembershipTable table.
  *
  * see org.melati.poem.prepro.TableDef#generateTableAccessorJava 
  * @return the GroupMembershipTable from this database
  */
  public GroupMembershipTable<GroupMembership> getGroupMembershipTable() {
    return tab_groupmembership;
  }


 /**
  * Retrieves the GroupCapabilityTable table.
  *
  * see org.melati.poem.prepro.TableDef#generateTableAccessorJava 
  * @return the GroupCapabilityTable from this database
  */
  public GroupCapabilityTable<GroupCapability> getGroupCapabilityTable() {
    return tab_groupcapability;
  }


 /**
  * Retrieves the TableCategoryTable table.
  *
  * see org.melati.poem.prepro.TableDef#generateTableAccessorJava 
  * @return the TableCategoryTable from this database
  */
  public TableCategoryTable<TableCategory> getTableCategoryTable() {
    return tab_tablecategory;
  }


 /**
  * Retrieves the TableInfoTable table.
  *
  * see org.melati.poem.prepro.TableDef#generateTableAccessorJava 
  * @return the TableInfoTable from this database
  */
  public TableInfoTable<TableInfo> getTableInfoTable() {
    return tab_tableinfo;
  }



 /**
  * Retrieves the ColumnInfoTable table.
  *
  * see org.melati.poem.prepro.TableDef#generateTableAccessorJava 
  * @return the ColumnInfoTable from this database
  */
  public ColumnInfoTable<ColumnInfo> getColumnInfoTable() {
    return tab_columninfo;
  }


 /**
  * Retrieves the SettingTable table.
  *
  * see org.melati.poem.prepro.TableDef#generateTableAccessorJava 
  * @return the SettingTable from this database
  */
  public SettingTable<Setting> getSettingTable() {
    return tab_setting;
  }
}


