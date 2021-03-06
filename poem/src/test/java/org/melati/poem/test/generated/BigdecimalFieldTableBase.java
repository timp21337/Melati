// Do not edit this file!  It was generated by Melati POEM's DSD preprocessor.

package org.melati.poem.test.generated;


import java.math.BigDecimal;
import org.melati.poem.AccessPoemException;
import org.melati.poem.BigDecimalPoemType;
import org.melati.poem.Column;
import org.melati.poem.Database;
import org.melati.poem.DefinitionSource;
import org.melati.poem.DisplayLevel;
import org.melati.poem.Field;
import org.melati.poem.JdbcPersistent;
import org.melati.poem.Persistent;
import org.melati.poem.PoemException;
import org.melati.poem.Searchability;
import org.melati.poem.TroidPoemType;
import org.melati.poem.ValidationPoemException;
import org.melati.poem.test.BigdecimalField;
import org.melati.poem.test.EverythingDatabaseTables;
import org.melati.poem.test.EverythingTable;


/**
 * Melati POEM generated base class for <code>Table</code> <code>BigdecimalField</code>.
 *
 * see org.melati.poem.prepro.TableDef#generateTableBaseJava 
 */

public class BigdecimalFieldTableBase<T extends BigdecimalField> extends EverythingTable<T> {

  private Column<Integer> col_id = null;
  private Column<BigDecimal> col_bigdecimalfield = null;

 /**
  * Constructor. 
  * 
  * see org.melati.poem.prepro.TableDef#generateTableBaseJava 
  * @param database          the POEM database we are using
  * @param name              the name of this <code>Table</code>
  * @param definitionSource  which definition is being used
  * @throws PoemException    if anything goes wrong
  */

  public BigdecimalFieldTableBase(
      Database database, String name,
      DefinitionSource definitionSource) throws PoemException {
    super(database, name, definitionSource);
  }


 /**
  * Get the database tables.
  *
  * see org.melati.poem.prepro.TableDef#generateTableBaseJava 
  * @return the database tables
  */
  public EverythingDatabaseTables getEverythingDatabaseTables() {
    return (EverythingDatabaseTables)getDatabase();
  }


 /**
  * Initialise this table by defining its columns.
  *
  * see org.melati.poem.prepro.TableDef#generateTableBaseJava 
  */
  public void init() throws PoemException {
    super.init();
    defineColumn(col_id =
        new Column<Integer>(this, "id",
                   new TroidPoemType(),
                   DefinitionSource.dsd) { 
          public Object getCooked(Persistent g)
              throws AccessPoemException, PoemException {
            return ((BigdecimalField)g).getId();
          }

          public void setCooked(Persistent g, Object cooked)
              throws AccessPoemException, ValidationPoemException {
            ((BigdecimalField)g).setId((Integer)cooked);
          }

          public Field<Integer> asField(Persistent g) {
            return ((BigdecimalField)g).getIdField();
          }

          public boolean defaultUserEditable() {
            return false;
          }

          public boolean defaultUserCreateable() {
            return false;
          }

          public DisplayLevel defaultDisplayLevel() {
            return DisplayLevel.summary;
          }

          public Searchability defaultSearchability() {
            return Searchability.yes;
          }

          public String defaultDisplayName() {
            return "Id";
          }

          public int defaultDisplayOrder() {
            return 0;
          }

          public boolean defaultIndexed() {
            return true;
          }

          public boolean defaultUnique() {
            return true;
          }

          public int defaultWidth() {
            return 20;
          }

          public int defaultHeight() {
            return 1;
          }

          public Object getRaw_unsafe(Persistent g)
              throws AccessPoemException {
            return ((BigdecimalField)g).getId_unsafe();
          }

          public void setRaw_unsafe(Persistent g, Object raw)
              throws AccessPoemException {
            ((BigdecimalField)g).setId_unsafe((Integer)raw);
          }

          public Object getRaw(Persistent g)
              throws AccessPoemException {
            return ((BigdecimalField)g).getId();
          }

          public void setRaw(Persistent g, Object raw)
              throws AccessPoemException {
            ((BigdecimalField)g).setId((Integer)raw);
          }
        });

    defineColumn(col_bigdecimalfield =
        new Column<BigDecimal>(this, "bigdecimalfield",
                   new BigDecimalPoemType(true, 22, 2),
                   DefinitionSource.dsd) { 
          public Object getCooked(Persistent g)
              throws AccessPoemException, PoemException {
            return ((BigdecimalField)g).getBigdecimalfield();
          }

          public void setCooked(Persistent g, Object cooked)
              throws AccessPoemException, ValidationPoemException {
            ((BigdecimalField)g).setBigdecimalfield((BigDecimal)cooked);
          }

          public Field<BigDecimal> asField(Persistent g) {
            return ((BigdecimalField)g).getBigdecimalfieldField();
          }

          public DisplayLevel defaultDisplayLevel() {
            return DisplayLevel.summary;
          }

          public Searchability defaultSearchability() {
            return Searchability.yes;
          }

          public String defaultDisplayName() {
            return "BigDecimal Field";
          }

          public int defaultDisplayOrder() {
            return 9;
          }

          public int defaultWidth() {
            return 20;
          }

          public int defaultHeight() {
            return 1;
          }

          public Object getRaw_unsafe(Persistent g)
              throws AccessPoemException {
            return ((BigdecimalField)g).getBigdecimalfield_unsafe();
          }

          public void setRaw_unsafe(Persistent g, Object raw)
              throws AccessPoemException {
            ((BigdecimalField)g).setBigdecimalfield_unsafe((BigDecimal)raw);
          }

          public Object getRaw(Persistent g)
              throws AccessPoemException {
            return ((BigdecimalField)g).getBigdecimalfield();
          }

          public void setRaw(Persistent g, Object raw)
              throws AccessPoemException {
            ((BigdecimalField)g).setBigdecimalfield((BigDecimal)raw);
          }
        });
  }


 /**
  * Retrieves the <code>Id</code> <code>Column</code> for this 
  * <code>BigdecimalField</code> <code>Table</code>.
  * 
  * see org.melati.poem.prepro.FieldDef#generateColAccessor 
  * @return the id <code>Column</code>
  */
  public final Column<Integer> getIdColumn() {
    return col_id;
  }


 /**
  * Retrieves the <code>Bigdecimalfield</code> <code>Column</code> for this 
  * <code>BigdecimalField</code> <code>Table</code>.
  * 
  * see org.melati.poem.prepro.FieldDef#generateColAccessor 
  * @return the bigdecimalfield <code>Column</code>
  */
  public final Column<BigDecimal> getBigdecimalfieldColumn() {
    return col_bigdecimalfield;
  }


 /**
  * Retrieve the <code>BigdecimalField</code> as a <code>BigdecimalField</code>.
  *
  * see org.melati.poem.prepro.TableDef#generateTableBaseJava 
  * @param troid a Table Row Object ID
  * @return the <code>Persistent</code> identified by the <code>troid</code>
  */
  public BigdecimalField getBigdecimalFieldObject(Integer troid) {
    return (BigdecimalField)getObject(troid);
  }


 /**
  * Retrieve the <code>BigdecimalField</code> 
  * as a <code>BigdecimalField</code>.
  *
  * see org.melati.poem.prepro.TableDef#generateTableBaseJava 
  * @param troid a Table Row Object ID
  * @return the <code>Persistent</code> identified   */
  public BigdecimalField getBigdecimalFieldObject(int troid) {
    return (BigdecimalField)getObject(troid);
  }

  protected JdbcPersistent _newPersistent() {
    return new BigdecimalField();
  }
  public String defaultDisplayName() {
    return "Big Decimal  Field";
  }

  public String defaultDescription() {
    return "A table with only a big decimal field in it";
  }

  public Integer defaultCacheLimit() {
    return new Integer(100);
  }

  public String defaultCategory() {
    return "Normal";
  }

  public int defaultDisplayOrder() {
    return 30;
  }
}

