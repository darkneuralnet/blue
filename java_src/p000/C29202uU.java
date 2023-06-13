package p000;

import ch.qos.logback.core.CoreConstants;
/* renamed from: uU */
/* loaded from: classes6.dex */
public class C29202uU {

    /* renamed from: b */
    public static final C29202uU f112437b = new C29202uU("CONNECTION_STATE");

    /* renamed from: c */
    public static final C29202uU f112438c = new C29202uU("SERVICE_DISCOVERY");

    /* renamed from: d */
    public static final C29202uU f112439d = new C29202uU("CHARACTERISTIC_READ");

    /* renamed from: e */
    public static final C29202uU f112440e = new C29202uU("CHARACTERISTIC_WRITE");

    /* renamed from: f */
    public static final C29202uU f112441f = new C29202uU("CHARACTERISTIC_LONG_WRITE");

    /* renamed from: g */
    public static final C29202uU f112442g = new C29202uU("CHARACTERISTIC_CHANGED");

    /* renamed from: h */
    public static final C29202uU f112443h = new C29202uU("DESCRIPTOR_READ");

    /* renamed from: i */
    public static final C29202uU f112444i = new C29202uU("DESCRIPTOR_WRITE");

    /* renamed from: j */
    public static final C29202uU f112445j = new C29202uU("RELIABLE_WRITE_COMPLETED");

    /* renamed from: k */
    public static final C29202uU f112446k = new C29202uU("READ_RSSI");

    /* renamed from: l */
    public static final C29202uU f112447l = new C29202uU("ON_MTU_CHANGED");

    /* renamed from: m */
    public static final C29202uU f112448m = new C29202uU("CONNECTION_PRIORITY_CHANGE");

    /* renamed from: a */
    public final String f112449a;

    public C29202uU(String str) {
        this.f112449a = str;
    }

    public String toString() {
        return "BleGattOperation{description='" + this.f112449a + CoreConstants.SINGLE_QUOTE_CHAR + CoreConstants.CURLY_RIGHT;
    }
}
