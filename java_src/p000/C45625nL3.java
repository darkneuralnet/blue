package p000;

import java.util.HashMap;
/* renamed from: nL3  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C45625nL3 {

    /* renamed from: a */
    public String f99773a;

    /* renamed from: b */
    public String f99774b;

    /* renamed from: c */
    public boolean f99775c;

    /* renamed from: d */
    public HashMap<String, String> f99776d;

    /* renamed from: a */
    public HashMap<String, String> m23962a() {
        return this.f99776d;
    }

    /* renamed from: b */
    public String m23961b() {
        return this.f99773a;
    }

    /* renamed from: c */
    public String m23960c() {
        return this.f99774b;
    }

    /* renamed from: d */
    public boolean m23959d() {
        return this.f99775c;
    }

    /* renamed from: e */
    public C45625nL3 m23958e(String str) {
        this.f99773a = str;
        return this;
    }

    /* renamed from: f */
    public C45625nL3 m23957f(String str) {
        this.f99774b = str.substring(0, Math.min(str.length(), 32));
        return this;
    }
}
