// Do not edit this file!  It was generated by Melati POEM's DSD preprocessor.

package org.melati.poem.test.generated;


// 29 tables in database
// hidden import org.melati.poem.UserTable;
// hidden import org.melati.poem.User;
import org.melati.poem.GroupTable;
import org.melati.poem.Group;
import org.melati.poem.CapabilityTable;
import org.melati.poem.Capability;
import org.melati.poem.GroupMembershipTable;
import org.melati.poem.GroupMembership;
import org.melati.poem.GroupCapabilityTable;
import org.melati.poem.GroupCapability;
import org.melati.poem.TableCategoryTable;
import org.melati.poem.TableCategory;
import org.melati.poem.TableInfoTable;
import org.melati.poem.TableInfo;
// abstract import org.melati.poem.ValueInfoTable;
// abstract import org.melati.poem.ValueInfo;
import org.melati.poem.ColumnInfoTable;
import org.melati.poem.ColumnInfo;
import org.melati.poem.SettingTable;
import org.melati.poem.Setting;
// abstract import org.melati.poem.test.EmptyAbstractTableTable;
// abstract import org.melati.poem.test.EmptyAbstractTable;
import org.melati.poem.test.EverythingNormalTable;
import org.melati.poem.test.EverythingNormal;
import org.melati.poem.test.ENExtendedTable;
import org.melati.poem.test.ENExtended;
// abstract import org.melati.poem.test.EverythingAbstractTable;
// abstract import org.melati.poem.test.EverythingAbstract;
import org.melati.poem.test.EAExtendedTable;
import org.melati.poem.test.EAExtended;
import org.melati.poem.test.BinaryFieldTable;
import org.melati.poem.test.BinaryField;
import org.melati.poem.test.StringFieldTable;
import org.melati.poem.test.StringField;
import org.melati.poem.test.PasswordFieldTable;
import org.melati.poem.test.PasswordField;
import org.melati.poem.test.BooleanFieldTable;
import org.melati.poem.test.BooleanField;
import org.melati.poem.test.DateFieldTable;
import org.melati.poem.test.DateField;
import org.melati.poem.test.DoubleFieldTable;
import org.melati.poem.test.DoubleField;
import org.melati.poem.test.IntegerFieldTable;
import org.melati.poem.test.IntegerField;
import org.melati.poem.test.LongFieldTable;
import org.melati.poem.test.LongField;
import org.melati.poem.test.BigdecimalFieldTable;
import org.melati.poem.test.BigdecimalField;
import org.melati.poem.test.TimestampFieldTable;
import org.melati.poem.test.TimestampField;
import org.melati.poem.test.ProtectedTable;
import org.melati.poem.test.Protected;
import org.melati.poem.test.DynamicTable;
import org.melati.poem.test.Dynamic;
import org.melati.poem.test.UserTable;
import org.melati.poem.test.User;
import org.melati.poem.test.AccountTable;
import org.melati.poem.test.Account;

/**
 * Melati POEM generated base interface to the tables in 
 * org.melati.poem.test.
 */
public interface EverythingDatabaseTablesBase {


 /**
  * Retrieves the GroupTable table.
  *
  * see org.melati.poem.prepro.TableDef#generateTableAccessorJava 
  * @return the GroupTable from this database
  */
  public GroupTable<Group> getGroupTable();

 /**
  * Retrieves the CapabilityTable table.
  *
  * see org.melati.poem.prepro.TableDef#generateTableAccessorJava 
  * @return the CapabilityTable from this database
  */
  public CapabilityTable<Capability> getCapabilityTable();

 /**
  * Retrieves the GroupMembershipTable table.
  *
  * see org.melati.poem.prepro.TableDef#generateTableAccessorJava 
  * @return the GroupMembershipTable from this database
  */
  public GroupMembershipTable<GroupMembership> getGroupMembershipTable();

 /**
  * Retrieves the GroupCapabilityTable table.
  *
  * see org.melati.poem.prepro.TableDef#generateTableAccessorJava 
  * @return the GroupCapabilityTable from this database
  */
  public GroupCapabilityTable<GroupCapability> getGroupCapabilityTable();

 /**
  * Retrieves the TableCategoryTable table.
  *
  * see org.melati.poem.prepro.TableDef#generateTableAccessorJava 
  * @return the TableCategoryTable from this database
  */
  public TableCategoryTable<TableCategory> getTableCategoryTable();

 /**
  * Retrieves the TableInfoTable table.
  *
  * see org.melati.poem.prepro.TableDef#generateTableAccessorJava 
  * @return the TableInfoTable from this database
  */
  public TableInfoTable<TableInfo> getTableInfoTable();

 /**
  * Retrieves the ColumnInfoTable table.
  *
  * see org.melati.poem.prepro.TableDef#generateTableAccessorJava 
  * @return the ColumnInfoTable from this database
  */
  public ColumnInfoTable<ColumnInfo> getColumnInfoTable();

 /**
  * Retrieves the SettingTable table.
  *
  * see org.melati.poem.prepro.TableDef#generateTableAccessorJava 
  * @return the SettingTable from this database
  */
  public SettingTable<Setting> getSettingTable();

 /**
  * Retrieves the EverythingNormalTable table.
  *
  * see org.melati.poem.prepro.TableDef#generateTableAccessorJava 
  * @return the EverythingNormalTable from this database
  */
  public EverythingNormalTable<EverythingNormal> getEverythingNormalTable();

 /**
  * Retrieves the ENExtendedTable table.
  *
  * see org.melati.poem.prepro.TableDef#generateTableAccessorJava 
  * @return the ENExtendedTable from this database
  */
  public ENExtendedTable<ENExtended> getENExtendedTable();

 /**
  * Retrieves the EAExtendedTable table.
  *
  * see org.melati.poem.prepro.TableDef#generateTableAccessorJava 
  * @return the EAExtendedTable from this database
  */
  public EAExtendedTable<EAExtended> getEAExtendedTable();

 /**
  * Retrieves the BinaryFieldTable table.
  *
  * see org.melati.poem.prepro.TableDef#generateTableAccessorJava 
  * @return the BinaryFieldTable from this database
  */
  public BinaryFieldTable<BinaryField> getBinaryFieldTable();

 /**
  * Retrieves the StringFieldTable table.
  *
  * see org.melati.poem.prepro.TableDef#generateTableAccessorJava 
  * @return the StringFieldTable from this database
  */
  public StringFieldTable<StringField> getStringFieldTable();

 /**
  * Retrieves the PasswordFieldTable table.
  *
  * see org.melati.poem.prepro.TableDef#generateTableAccessorJava 
  * @return the PasswordFieldTable from this database
  */
  public PasswordFieldTable<PasswordField> getPasswordFieldTable();

 /**
  * Retrieves the BooleanFieldTable table.
  *
  * see org.melati.poem.prepro.TableDef#generateTableAccessorJava 
  * @return the BooleanFieldTable from this database
  */
  public BooleanFieldTable<BooleanField> getBooleanFieldTable();

 /**
  * Retrieves the DateFieldTable table.
  *
  * see org.melati.poem.prepro.TableDef#generateTableAccessorJava 
  * @return the DateFieldTable from this database
  */
  public DateFieldTable<DateField> getDateFieldTable();

 /**
  * Retrieves the DoubleFieldTable table.
  *
  * see org.melati.poem.prepro.TableDef#generateTableAccessorJava 
  * @return the DoubleFieldTable from this database
  */
  public DoubleFieldTable<DoubleField> getDoubleFieldTable();

 /**
  * Retrieves the IntegerFieldTable table.
  *
  * see org.melati.poem.prepro.TableDef#generateTableAccessorJava 
  * @return the IntegerFieldTable from this database
  */
  public IntegerFieldTable<IntegerField> getIntegerFieldTable();

 /**
  * Retrieves the LongFieldTable table.
  *
  * see org.melati.poem.prepro.TableDef#generateTableAccessorJava 
  * @return the LongFieldTable from this database
  */
  public LongFieldTable<LongField> getLongFieldTable();

 /**
  * Retrieves the BigdecimalFieldTable table.
  *
  * see org.melati.poem.prepro.TableDef#generateTableAccessorJava 
  * @return the BigdecimalFieldTable from this database
  */
  public BigdecimalFieldTable<BigdecimalField> getBigdecimalFieldTable();

 /**
  * Retrieves the TimestampFieldTable table.
  *
  * see org.melati.poem.prepro.TableDef#generateTableAccessorJava 
  * @return the TimestampFieldTable from this database
  */
  public TimestampFieldTable<TimestampField> getTimestampFieldTable();

 /**
  * Retrieves the ProtectedTable table.
  *
  * see org.melati.poem.prepro.TableDef#generateTableAccessorJava 
  * @return the ProtectedTable from this database
  */
  public ProtectedTable<Protected> getProtectedTable();

 /**
  * Retrieves the DynamicTable table.
  *
  * see org.melati.poem.prepro.TableDef#generateTableAccessorJava 
  * @return the DynamicTable from this database
  */
  public DynamicTable<Dynamic> getDynamicTable();

 /**
  * Retrieves the UserTable table.
  *
  * Deprecated: use getEverythingUserTable
  * see org.melati.poem.prepro.TableDef#generateTableAccessorJava 
  * @return the org.melati.poem.UserTable from this database
  */
  public org.melati.poem.UserTable<org.melati.poem.User> getUserTable();

 /**
  * Retrieves our (Everything) UserTable table.
  *
  * see org.melati.poem.prepro.TableDef#generateSubclassedTableAccessorDeclaration 
  * @return the org.melati.poem.UserTable from this database
  */
  public UserTable<User> getEverythingUserTable();

 /**
  * Retrieves the AccountTable table.
  *
  * see org.melati.poem.prepro.TableDef#generateTableAccessorJava 
  * @return the AccountTable from this database
  */
  public AccountTable<Account> getAccountTable();
}


