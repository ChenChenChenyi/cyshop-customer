//package com.cyshop.customer.entity.location;
//
//import com.cyshop.customer.shared.ValueObject;
//import lombok.Data;
//import org.apache.commons.lang3.Validate;
//
//import java.util.regex.Pattern;
//
///**
// * @Classname UnLocode
// * @Description United nations location code.
// * @Date 2024/5/16 9:14
// * @Created by 陈义
// */
//@Data
//public class UnLocode implements ValueObject<UnLocode> {
//    /*********************字段属性************************/
//    /**
//    * @Description: 地区编码
//    * @Author: chenyi
//    * @Date: 2024/5/16
//    */
//    private String unlocode;
//
//    /****************************************************/
//
//    // Country code is exactly two letters.
//    // Location code is usually three letters, but may contain the numbers 2-9 as well
//    private static final Pattern VALID_PATTERN = Pattern.compile("[a-zA-Z]{2}[a-zA-Z2-9]{3}");
//
//    /**
//     * 构造函数
//     *
//     * @param countryAndLocation Location string.
//     */
//    public UnLocode(final String countryAndLocation) {
//        Validate.notNull(countryAndLocation, "Country and location may not be null");
//        Validate.isTrue(VALID_PATTERN.matcher(countryAndLocation).matches(),
//                countryAndLocation + " is not a valid UN/LOCODE (does not match pattern)");
//
//        this.unlocode = countryAndLocation.toUpperCase();
//    }
//
//
//    @Override
//    public boolean sameValueAs(UnLocode other) {
//        return other != null && this.unlocode.equals(other.unlocode);
//    }
//
//}
