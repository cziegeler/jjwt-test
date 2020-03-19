package de.osoco.cziegeler.test.jjwt;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

import io.jsonwebtoken.Jwts;

public class Test implements BundleActivator {

    public void start(BundleContext context) throws Exception {
        System.out.println(Jwts.claims());
        System.out.println(Jwts.builder().claim("true", "foo").compact());
    }

    public void stop(BundleContext context) throws Exception {
    }

}
