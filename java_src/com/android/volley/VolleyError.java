package com.android.volley;
/* loaded from: classes.dex */
public class VolleyError extends Exception {

    /* renamed from: b */
    public final O73 f68612b;

    /* renamed from: c */
    public long f68613c;

    public VolleyError() {
        this.f68612b = null;
    }

    /* renamed from: a */
    public void m53506a(long j) {
        this.f68613c = j;
    }

    public VolleyError(O73 o73) {
        this.f68612b = o73;
    }

    public VolleyError(Throwable th) {
        super(th);
        this.f68612b = null;
    }
}
