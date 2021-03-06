package com.ge.predix.solsvc.fdh.router.validator;

import java.text.MessageFormat;
import java.util.List;

import com.ge.dsp.pm.ext.entity.field.fieldidentifier.FieldIdentifier;
import com.ge.dsp.pm.ext.entity.fieldidentifiervalue.FieldIdentifierValue;
import com.ge.dsp.pm.ext.entity.fieldidentifiervalue.FieldIdentifierValueList;

/**
 * 
 * @author predix
 */
public class BaseValidator {

    /**
     * Creates a MessageFormat with the given pattern and uses it
     * to format the given arguments. This is equivalent to
     * <blockquote>
     *     <code>(new {@link #MessageFormat(String) MessageFormat}(pattern)).{@link #format(java.lang.Object[], java.lang.StringBuffer, java.text.FieldPosition) format}(arguments, new StringBuffer(), null).toString()</code>
     * </blockquote>
     * @param pattern -
     * @param arguments - 
     * @return  -
     *
     * @exception IllegalArgumentException if the pattern is invalid,
     *            or if an argument in the <code>arguments</code> array
     *            is not of the type expected by the format element(s)
     *            that use it.
     */
    public static String format(String pattern, Object ... arguments) {
        MessageFormat temp = new MessageFormat(pattern);
        return temp.format(arguments);
    }
    
    /**
     * @param fieldIdentifierList -
     * @param errorHolder  -
     * @return -
     */
    public boolean isFieldIdentifierListEmpty(List<FieldIdentifier> fieldIdentifierList){
        if (fieldIdentifierList == null || fieldIdentifierList.size() == 0){
            return true;
        }
        return false;
    }
    
    
    /**
     * @param fieldIdentifierValueList -
     * @param errorHolder -
     * @return -
     */
    public boolean isFieldIdentifierValueListEmpty(List<FieldIdentifierValue> fieldIdentifierValueList){

        if (fieldIdentifierValueList == null || fieldIdentifierValueList.size() == 0){
            return true;
        }
        return false;
    }
    
    /**
     * @param fieldIdentifierValueList -
     * @param errorHolder -
     * @return -
     */
    public boolean isFieldIdentifierValueListEmpty(FieldIdentifierValueList fieldIdentifierValueList){

        if (fieldIdentifierValueList == null){
            return true;
        }
        return false;
    }
}
