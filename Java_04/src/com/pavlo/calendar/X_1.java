package com.pavlo.calendar;

public class X_1 {

	/**
	 * Test enum to test enum =)
	 */
	public enum TestEnum {
	    ONE(1), TWO(2), THREE(3);

	    private int number;

	    TestEnum(int number) {
	        this.number = number;
	    }      

	    public TestEnum findByKey(int i) {
	        TestEnum[] testEnums = TestEnum.values();
	        for (TestEnum testEnum : testEnums) {
	            if (testEnum.number == i) {
	                return testEnum;
	            }
	        }
	        return null;
	    }
	    
	}
}
