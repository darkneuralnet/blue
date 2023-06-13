package p000;

import ch.qos.logback.core.CoreConstants;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import java.util.ResourceBundle;
import java.util.TreeMap;
import java.util.logging.Level;
import java.util.logging.Logger;
/* renamed from: xX5  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C51663xX5 {

    /* renamed from: f */
    public static final Logger f117776f = Logger.getLogger(C51663xX5.class.getName());

    /* renamed from: a */
    public final Map<String, InterfaceC35858Sd6<?>> f117777a;

    /* renamed from: b */
    public final Map<InterfaceC35858Sd6<?>, String> f117778b;

    /* renamed from: c */
    public final Map<String, Object> f117779c;

    /* renamed from: d */
    public final Map<Object, String> f117780d;

    /* renamed from: e */
    public final Map<InterfaceC38077ae6, WZ3> f117781e;

    private C51663xX5() {
        this.f117777a = new TreeMap();
        this.f117778b = new HashMap();
        this.f117779c = new TreeMap();
        this.f117780d = new HashMap();
        this.f117781e = new HashMap();
    }

    /* renamed from: g */
    public static C51663xX5 m5042g(ResourceBundle resourceBundle) {
        return new C51663xX5(resourceBundle);
    }

    /* renamed from: a */
    public void m5048a(InterfaceC35858Sd6<?> interfaceC35858Sd6, String str) {
        this.f117777a.put(str, interfaceC35858Sd6);
    }

    /* renamed from: b */
    public WZ3 m5047b(InterfaceC38077ae6 interfaceC38077ae6) {
        return this.f117781e.get(interfaceC38077ae6);
    }

    /* renamed from: c */
    public String m5046c(WZ3 wz3) {
        return this.f117780d.get(wz3);
    }

    /* renamed from: d */
    public String m5045d(InterfaceC35858Sd6<?> interfaceC35858Sd6) {
        return this.f117778b.get(interfaceC35858Sd6);
    }

    /* renamed from: e */
    public void m5044e(WZ3 wz3, String str) {
        this.f117779c.put(str, wz3);
        this.f117780d.put(wz3, str);
        this.f117781e.put(InterfaceC44546lX2.m27176w0(wz3), wz3);
    }

    /* renamed from: f */
    public void m5043f(InterfaceC35858Sd6<?> interfaceC35858Sd6, String str) {
        this.f117777a.put(str, interfaceC35858Sd6);
        this.f117778b.put(interfaceC35858Sd6, str);
    }

    public String toString() {
        return "tech.units.indriya.format.SymbolMap: [symbolToUnit: " + this.f117777a + CoreConstants.COMMA_CHAR + "unitToSymbol: " + this.f117778b + CoreConstants.COMMA_CHAR + "symbolToPrefix: " + this.f117779c + CoreConstants.COMMA_CHAR + "prefixToSymbol: " + this.f117780d + CoreConstants.COMMA_CHAR + "converterToPrefix: " + this.f117781e + CoreConstants.COMMA_CHAR + "converterToPrefix: " + this.f117781e + " ]";
    }

    public C51663xX5(ResourceBundle resourceBundle) {
        this();
        Enumeration<String> keys = resourceBundle.getKeys();
        while (keys.hasMoreElements()) {
            String nextElement = keys.nextElement();
            String string = resourceBundle.getString(nextElement);
            int lastIndexOf = nextElement.lastIndexOf(46);
            boolean z = false;
            String substring = nextElement.substring(0, lastIndexOf);
            String substring2 = nextElement.substring(lastIndexOf + 1, nextElement.length());
            if (Character.isDigit(substring2.charAt(0))) {
                int lastIndexOf2 = substring.lastIndexOf(46);
                String substring3 = substring.substring(0, lastIndexOf2);
                substring2 = substring.substring(lastIndexOf2 + 1, substring.length());
                substring = substring3;
                z = true;
            }
            try {
                Object obj = Class.forName(substring).getField(substring2).get(null);
                if (!(obj instanceof InterfaceC35858Sd6)) {
                    if (obj instanceof WZ3) {
                        m5044e((WZ3) obj, string);
                    } else {
                        throw new ClassCastException("unable to cast " + obj + " to Unit or Prefix");
                        break;
                    }
                } else if (z) {
                    m5048a((InterfaceC35858Sd6) obj, string);
                } else {
                    m5043f((AbstractC28986u1) obj, string);
                }
            } catch (Exception e) {
                f117776f.log(Level.SEVERE, "Error", (Throwable) e);
            }
        }
    }
}
