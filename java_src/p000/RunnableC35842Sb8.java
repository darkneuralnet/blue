package p000;

import android.util.Log;
/* renamed from: Sb8  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class RunnableC35842Sb8 implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ int f33949b;

    /* renamed from: c */
    public final /* synthetic */ String f33950c;

    /* renamed from: d */
    public final /* synthetic */ Object f33951d;

    /* renamed from: e */
    public final /* synthetic */ Object f33952e;

    /* renamed from: f */
    public final /* synthetic */ Object f33953f;

    /* renamed from: g */
    public final /* synthetic */ C32809Fc8 f33954g;

    public RunnableC35842Sb8(C32809Fc8 c32809Fc8, int i, String str, Object obj, Object obj2, Object obj3) {
        this.f33954g = c32809Fc8;
        this.f33949b = i;
        this.f33950c = str;
        this.f33951d = obj;
        this.f33952e = obj2;
        this.f33953f = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        char c;
        long j;
        char c2;
        long j2;
        C33556Ih8 m89784F = this.f33954g.f100966a.m89784F();
        if (m89784F.m113416k()) {
            C32809Fc8 c32809Fc8 = this.f33954g;
            c = c32809Fc8.f9773c;
            if (c == 0) {
                if (c32809Fc8.f100966a.m89751w().m37523H()) {
                    C32809Fc8 c32809Fc82 = this.f33954g;
                    c32809Fc82.f100966a.mo22259C();
                    c32809Fc82.f9773c = 'C';
                } else {
                    C32809Fc8 c32809Fc83 = this.f33954g;
                    c32809Fc83.f100966a.mo22259C();
                    c32809Fc83.f9773c = 'c';
                }
            }
            C32809Fc8 c32809Fc84 = this.f33954g;
            j = c32809Fc84.f9774d;
            if (j < 0) {
                c32809Fc84.f100966a.m89751w().m37513n();
                c32809Fc84.f9774d = 77000L;
            }
            char charAt = "01VDIWEA?".charAt(this.f33949b);
            C32809Fc8 c32809Fc85 = this.f33954g;
            c2 = c32809Fc85.f9773c;
            j2 = c32809Fc85.f9774d;
            String str = "2" + charAt + c2 + j2 + ":" + C32809Fc8.m106884x(true, this.f33950c, this.f33951d, this.f33952e, this.f33953f);
            if (str.length() > 1024) {
                str = this.f33950c.substring(0, 1024);
            }
            C40498eh8 c40498eh8 = m89784F.f16065d;
            if (c40498eh8 != null) {
                c40498eh8.m42619b(str, 1L);
                return;
            }
            return;
        }
        Log.println(6, this.f33954g.m106900D(), "Persisted config not initialized. Not logging error/warn");
    }
}
