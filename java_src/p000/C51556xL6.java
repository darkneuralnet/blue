package p000;

import java.util.HashMap;
import java.util.Map;
/* renamed from: xL6  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C51556xL6 {

    /* renamed from: a */
    public final Map<String, Double> f117442a = new HashMap();

    /* renamed from: a */
    public final synchronized void m5432a(String str) {
        this.f117442a.put(str, Double.valueOf(0.0d));
    }

    /* renamed from: b */
    public final synchronized double m5431b(String str) {
        Double d = this.f117442a.get(str);
        if (d == null) {
            return 0.0d;
        }
        return d.doubleValue();
    }

    /* renamed from: c */
    public final synchronized double m5430c(String str, C49194tM6 c49194tM6) {
        double d;
        d = (((C48000rL6) c49194tM6).f106886g + 1.0d) / ((C48000rL6) c49194tM6).f106887h;
        this.f117442a.put(str, Double.valueOf(d));
        return d;
    }
}
