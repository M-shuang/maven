package com.shuang;

import org.apache.velocity.Template;
import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.Velocity;
import org.apache.velocity.app.VelocityEngine;

import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Properties;

/**
 * @author
 * @date
 *
 */

public class WarningGenerator {
    public static String generator(EbankBillMonitorWarning ebankBillMonitorWarning){

        VelocityEngine ve = new VelocityEngine();

        Properties properties = new Properties();

        String path = "./";

        properties.setProperty(Velocity.FILE_RESOURCE_LOADER_PATH, path);
        properties.setProperty(Velocity.INPUT_ENCODING, "utf-8");
        properties.setProperty(Velocity.OUTPUT_ENCODING, "utf-8");

        ve.init(properties);

        Template t = ve.getTemplate("hellovelocity.vm");
        VelocityContext ctx = new VelocityContext();

        ctx.put("accountNo", ebankBillMonitorWarning.getAccountNo());
        ctx.put("date", ebankBillMonitorWarning.getDate());
        ctx.put("status", ebankBillMonitorWarning.getStatus());
        ctx.put("warning",ebankBillMonitorWarning.getWarning());
        ctx.put("billFileName",ebankBillMonitorWarning.getBillFileName());

        StringWriter sw = new StringWriter();

        t.merge(ctx, sw);

        return (sw.toString());

    }

}
