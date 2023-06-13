package com.google.firebase.remoteconfig.internal;

import android.content.SharedPreferences;
import java.util.Date;
import p000.C35241Pn1;
/* renamed from: com.google.firebase.remoteconfig.internal.d */
/* loaded from: classes6.dex */
public class C18384d {

    /* renamed from: e */
    public static final Date f74466e = new Date(-1);

    /* renamed from: f */
    public static final Date f74467f = new Date(-1);

    /* renamed from: a */
    public final SharedPreferences f74468a;

    /* renamed from: b */
    public final Object f74469b = new Object();

    /* renamed from: c */
    public final Object f74470c = new Object();

    /* renamed from: d */
    public final Object f74471d = new Object();

    /* renamed from: com.google.firebase.remoteconfig.internal.d$a */
    /* loaded from: classes6.dex */
    public static class C18385a {

        /* renamed from: a */
        public int f74472a;

        /* renamed from: b */
        public Date f74473b;

        public C18385a(int i, Date date) {
            this.f74472a = i;
            this.f74473b = date;
        }

        /* renamed from: a */
        public Date m46930a() {
            return this.f74473b;
        }

        /* renamed from: b */
        public int m46929b() {
            return this.f74472a;
        }
    }

    /* renamed from: com.google.firebase.remoteconfig.internal.d$b */
    /* loaded from: classes6.dex */
    public static class C18386b {

        /* renamed from: a */
        public int f74474a;

        /* renamed from: b */
        public Date f74475b;

        public C18386b(int i, Date date) {
            this.f74474a = i;
            this.f74475b = date;
        }

        /* renamed from: a */
        public Date m46928a() {
            return this.f74475b;
        }

        /* renamed from: b */
        public int m46927b() {
            return this.f74474a;
        }
    }

    public C18384d(SharedPreferences sharedPreferences) {
        this.f74468a = sharedPreferences;
    }

    /* renamed from: a */
    public C18385a m46947a() {
        C18385a c18385a;
        synchronized (this.f74470c) {
            c18385a = new C18385a(this.f74468a.getInt("num_failed_fetches", 0), new Date(this.f74468a.getLong("backoff_end_time_in_millis", -1L)));
        }
        return c18385a;
    }

    /* renamed from: b */
    public long m46946b() {
        return this.f74468a.getLong("fetch_timeout_in_seconds", 60L);
    }

    /* renamed from: c */
    public InterfaceC35007On1 m46945c() {
        C18390f m46893a;
        synchronized (this.f74469b) {
            long j = this.f74468a.getLong("last_fetch_time_in_millis", -1L);
            int i = this.f74468a.getInt("last_fetch_status", 0);
            m46893a = C18390f.m46894b().m46891c(i).m46890d(j).m46892b(new C35241Pn1.C6490b().m89792d(this.f74468a.getLong("fetch_timeout_in_seconds", 60L)).m89791e(this.f74468a.getLong("minimum_fetch_interval_in_seconds", C18381c.f74447j)).m89793c()).m46893a();
        }
        return m46893a;
    }

    /* renamed from: d */
    public String m46944d() {
        return this.f74468a.getString("last_fetch_etag", null);
    }

    /* renamed from: e */
    public Date m46943e() {
        return new Date(this.f74468a.getLong("last_fetch_time_in_millis", -1L));
    }

    /* renamed from: f */
    public long m46942f() {
        return this.f74468a.getLong("last_template_version", 0L);
    }

    /* renamed from: g */
    public long m46941g() {
        return this.f74468a.getLong("minimum_fetch_interval_in_seconds", C18381c.f74447j);
    }

    /* renamed from: h */
    public C18386b m46940h() {
        C18386b c18386b;
        synchronized (this.f74471d) {
            c18386b = new C18386b(this.f74468a.getInt("num_failed_realtime_streams", 0), new Date(this.f74468a.getLong("realtime_backoff_end_time_in_millis", -1L)));
        }
        return c18386b;
    }

    /* renamed from: i */
    public void m46939i() {
        m46937k(0, f74467f);
    }

    /* renamed from: j */
    public void m46938j() {
        m46934n(0, f74467f);
    }

    /* renamed from: k */
    public void m46937k(int i, Date date) {
        synchronized (this.f74470c) {
            this.f74468a.edit().putInt("num_failed_fetches", i).putLong("backoff_end_time_in_millis", date.getTime()).apply();
        }
    }

    /* renamed from: l */
    public void m46936l(String str) {
        synchronized (this.f74469b) {
            this.f74468a.edit().putString("last_fetch_etag", str).apply();
        }
    }

    /* renamed from: m */
    public void m46935m(long j) {
        synchronized (this.f74469b) {
            this.f74468a.edit().putLong("last_template_version", j).apply();
        }
    }

    /* renamed from: n */
    public void m46934n(int i, Date date) {
        synchronized (this.f74471d) {
            this.f74468a.edit().putInt("num_failed_realtime_streams", i).putLong("realtime_backoff_end_time_in_millis", date.getTime()).apply();
        }
    }

    /* renamed from: o */
    public void m46933o() {
        synchronized (this.f74469b) {
            this.f74468a.edit().putInt("last_fetch_status", 1).apply();
        }
    }

    /* renamed from: p */
    public void m46932p(Date date) {
        synchronized (this.f74469b) {
            this.f74468a.edit().putInt("last_fetch_status", -1).putLong("last_fetch_time_in_millis", date.getTime()).apply();
        }
    }

    /* renamed from: q */
    public void m46931q() {
        synchronized (this.f74469b) {
            this.f74468a.edit().putInt("last_fetch_status", 2).apply();
        }
    }
}
