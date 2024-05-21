//package com.cyshop.customer.entity.location;
//
//import com.cyshop.customer.shared.DomainEntity;
//import org.apache.commons.lang3.Validate;
//
//import javax.persistence.*;
//
//
///**
// * @Classname Location
// * @Description  A location is our model is stops on a journey, such as cargo
// *  origin or destination, or carrier movement endpoints.
// *  It is uniquely identified by a UN Locode.
// * @Date 2024/5/16 1:18
// * @Created by 陈义
// */
//@Table(name = "location")
//@Entity(name = "location")
//public final class Location implements DomainEntity<Location> {
//    /*********************字段属性************************/
//    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
//    public long id;
//
//    @Column(name = "unlocode")
//    public String unlocode;
//
//    @Column(nullable = false)
//    public String name;
//
//    /****************************************************/
//
//    /**
//     * Special Location object that marks an unknown location.
//     */
//    public static final Location UNKNOWN = new Location(
//            new UnLocode("XXXXX"), "Unknown location"
//    );
//
//    /**
//     * Package-level constructor, visible for test and sample data purposes.
//     *
//     * @param unLocode UN Locode
//     * @param name     location name
//     * @throws IllegalArgumentException if the UN Locode or name is null
//     */
//    public Location(final UnLocode unLocode, final String name) {
//        Validate.notNull(unLocode);
//        Validate.notNull(name);
//
//        this.unlocode = unLocode.getUnlocode();
//        this.name = name;
//    }
//
//    // Used by JPA
//    public Location(String unloCode, String name) {
//        this.unlocode = unloCode;
//        this.name = name;
//    }
//
//    /**
//     * @return UN Locode for this location.
//     */
//    public UnLocode getUnLocodeEntity() {
//        return new UnLocode(unlo  Kcode);
//    }
//
//
//    @Override
//    public boolean sameIdentityAs(Location other) {
//        return false;
//    }
//}
