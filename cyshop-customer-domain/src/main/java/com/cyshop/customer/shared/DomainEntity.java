package com.cyshop.customer.shared;

public interface DomainEntity<T> {

  boolean sameIdentityAs(T other);

}
