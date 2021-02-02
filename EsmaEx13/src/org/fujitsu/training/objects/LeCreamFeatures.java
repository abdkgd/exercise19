package org.fujitsu.training.objects;

import org.fujitsu.training.objects.exception.PayFirstForAdditionalException;

public interface LeCreamFeatures {
	
	boolean selectFlavor();
	int determineNumberOfScoopes() throws PayFirstForAdditionalException, Exception;
	boolean addWafer();
}
