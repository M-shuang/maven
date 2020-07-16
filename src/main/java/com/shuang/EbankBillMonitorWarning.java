package com.shuang;

import java.text.SimpleDateFormat;
import java.util.Date;

public class EbankBillMonitorWarning {

    private String date;
    private String accountNo;
    private String warning;
    private String billFileName;
    private Integer status;

    public EbankBillMonitorWarning() {
        SimpleDateFormat dateFormat= new SimpleDateFormat("yyyyMMdd");
        this.date = dateFormat.format(new Date());
    }

    public String getDate() {
        return date;
    }

    public String getAccountNo() {
        return accountNo;
    }

    public String getWarning() {
        return warning;
    }

    public String getBillFileName() {
        return billFileName;
    }

    public Integer getStatus() {
        return status;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }

    public void setWarning(String warning) {
        this.warning = warning;
    }

    public void setBillFileName(String billFileName) {
        this.billFileName = billFileName;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}
