package com.kcm.garage.bitcoin.modle;

import java.util.List;

import com.kcm.garage.bitcoin.controller.BitPay;
import com.kcm.garage.bitcoin.controller.PayException;

public class Rates {

    private BitPay _bp;
    private List<Rate> _rates;

    public Rates(List<Rate> rates, BitPay bp)
    {
        _bp = bp;
        _rates = rates;
    }

    public List<Rate> getRates()
    {
	    return _rates;
    }

    public void update() throws PayException
    {
	    _rates = _bp.getRates().getRates();
    }

    public double getRate(String currencyCode)
    {
	    double val = 0;
	    for (Rate rateObj : _rates)
        {
		    if (rateObj.getCode().equals(currencyCode))
            {
                val = rateObj.getValue();
                break;
		    }
	    }
		return val;
    }
}
