/**
 * 
 */
package org.melati.poem.test;

import org.melati.poem.BooleanPoemType;

/**
 * @author timp
 * @since 21 Dec 2006
 *
 */
public class NullableBooleanPoemTypeTest extends NotNullableBooleanPoemTypeTest {

  /**
   * 
   */
  public NullableBooleanPoemTypeTest() {
  }

  /**
   * @param name
   */
  public NullableBooleanPoemTypeTest(String name) {
    super(name);
  }

  /**
   * {@inheritDoc}
   * @see org.melati.poem.test.SQLPoemTypeSpec#setObjectUnderTest()
   */
  void setObjectUnderTest() {
    it = new BooleanPoemType(true);
  }

}
