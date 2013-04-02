

/* First created by JCasGen Wed Mar 20 19:12:18 GMT 2013 */
package uk.ac.susx.tag;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.tcas.Annotation;


/** 
 * Updated by JCasGen Wed Mar 20 19:12:18 GMT 2013
 * XML source: /Users/jackpay/Documents/workspace/NERAnnotator/desc/NERAnnotatorDescriptor.xml
 * @generated */
public class NERAnnotation extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(NERAnnotation.class);
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int type = typeIndexID;
  /** @generated  */
  @Override
  public              int getTypeIndexID() {return typeIndexID;}
 
  /** Never called.  Disable default constructor
   * @generated */
  protected NERAnnotation() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public NERAnnotation(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public NERAnnotation(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated */  
  public NERAnnotation(JCas jcas, int begin, int end) {
    super(jcas);
    setBegin(begin);
    setEnd(end);
    readObject();
  }   

  /** <!-- begin-user-doc -->
    * Write your own initialization here
    * <!-- end-user-doc -->
  @generated modifiable */
  private void readObject() {/*default - does nothing empty block */}
     
 
    
  //*--------------*
  //* Feature: nertag

  /** getter for nertag - gets The Named Entity Recognition tag
   * @generated */
  public String getNertag() {
    if (NERAnnotation_Type.featOkTst && ((NERAnnotation_Type)jcasType).casFeat_nertag == null)
      jcasType.jcas.throwFeatMissing("nertag", "uk.ac.susx.tag.NERAnnotation");
    return jcasType.ll_cas.ll_getStringValue(addr, ((NERAnnotation_Type)jcasType).casFeatCode_nertag);}
    
  /** setter for nertag - sets The Named Entity Recognition tag 
   * @generated */
  public void setNertag(String v) {
    if (NERAnnotation_Type.featOkTst && ((NERAnnotation_Type)jcasType).casFeat_nertag == null)
      jcasType.jcas.throwFeatMissing("nertag", "uk.ac.susx.tag.NERAnnotation");
    jcasType.ll_cas.ll_setStringValue(addr, ((NERAnnotation_Type)jcasType).casFeatCode_nertag, v);}    
  }

    