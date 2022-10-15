package za.ac.cput.demo_car_service_portal.util;

import org.apache.commons.validator.routines.EmailValidator;
import org.springframework.util.StringUtils;

public class Helper {
    public static boolean isEmptyOrNull(String str){
        return StringUtils.isEmpty(str);
    }

    public static void checkStringParam(String paramName, String paramValue){
        if (isEmptyOrNull(paramValue))
            throw new IllegalArgumentException(String.format("Invalid value for: %s", paramName));
    }

    public static void checkEmail(String s){
        EmailValidator emailValidator = EmailValidator.getInstance();
        if (!emailValidator.isValid(s))
            throw new IllegalArgumentException("Email not valid");
    }

    public static void checkIfObjectNull(String objectName, Object object){
        if (object == null){
            throw new IllegalArgumentException(String.format("%s is null", objectName));
        }
    }

}
