package p000;

import com.nimbusds.jose.shaded.json.parser.ParseException;
/* renamed from: Ng2  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C34711Ng2 {

    /* renamed from: c */
    public static int f24968c;

    /* renamed from: a */
    public int f24969a;

    /* renamed from: b */
    public C35413Qg2 f24970b;

    static {
        int i;
        if (System.getProperty("JSON_SMART_SIMPLE") != null) {
            i = 4032;
        } else {
            i = -1;
        }
        f24968c = i;
    }

    public C34711Ng2() {
        this.f24969a = f24968c;
    }

    /* renamed from: a */
    public final C35413Qg2 m93585a() {
        if (this.f24970b == null) {
            this.f24970b = new C35413Qg2(this.f24969a);
        }
        return this.f24970b;
    }

    /* renamed from: b */
    public Object m93584b(String str) throws ParseException {
        return m93585a().m88197x(str);
    }

    public C34711Ng2(int i) {
        this.f24969a = i;
    }
}
