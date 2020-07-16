package com.shuang;

import org.apache.velocity.Template;
import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.Velocity;
import org.apache.velocity.app.VelocityEngine;
import org.apache.velocity.runtime.RuntimeConstants;
import org.apache.velocity.runtime.resource.loader.ClasspathResourceLoader;

import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Properties;

public class VelocityTest {

        public static void main(String[] args) {

            EbankBillMonitorWarning warning1 = new EbankBillMonitorWarning();
            warning1.setAccountNo("123");
            warning1.setWarning("账单未到达");
            warning1.setStatus(0);

            EbankBillMonitorWarning warning2 = new EbankBillMonitorWarning();
            warning2.setAccountNo("321");
            warning2.setWarning("账单解析失败");
            warning2.setStatus(-1);
            warning2.setBillFileName("/opt/meituan/20200716.xsl");

            System.out.println(WarningGenerator.generator(warning1));
            System.out.println(WarningGenerator.generator(warning2));

        }
}
