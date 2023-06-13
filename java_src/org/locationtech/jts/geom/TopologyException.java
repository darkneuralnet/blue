package org.locationtech.jts.geom;
/* loaded from: classes8.dex */
public class TopologyException extends RuntimeException {

    /* renamed from: b */
    public C52053yB0 f102661b;

    public TopologyException(String str) {
        super(str);
        this.f102661b = null;
    }

    /* renamed from: a */
    public static String m20419a(String str, C52053yB0 c52053yB0) {
        if (c52053yB0 != null) {
            return str + " [ " + c52053yB0 + " ]";
        }
        return str;
    }

    public TopologyException(String str, C52053yB0 c52053yB0) {
        super(m20419a(str, c52053yB0));
        this.f102661b = null;
        this.f102661b = new C52053yB0(c52053yB0);
    }
}
