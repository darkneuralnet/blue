package p000;

import com.google.gson.internal.sql.SqlDateTypeAdapter;
import com.google.gson.internal.sql.SqlTimeTypeAdapter;
import com.google.gson.internal.sql.SqlTimestampTypeAdapter;
import java.sql.Timestamp;
import java.util.Date;
import p000.TW0;
/* renamed from: lO5  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C44468lO5 {

    /* renamed from: a */
    public static final boolean f95983a;

    /* renamed from: b */
    public static final TW0.AbstractC7864b<? extends Date> f95984b;

    /* renamed from: c */
    public static final TW0.AbstractC7864b<? extends Date> f95985c;

    /* renamed from: d */
    public static final InterfaceC32096Cb6 f95986d;

    /* renamed from: e */
    public static final InterfaceC32096Cb6 f95987e;

    /* renamed from: f */
    public static final InterfaceC32096Cb6 f95988f;

    /* renamed from: lO5$a */
    /* loaded from: classes6.dex */
    public class C25690a extends TW0.AbstractC7864b<java.sql.Date> {
        public C25690a(Class cls) {
            super(cls);
        }

        @Override // p000.TW0.AbstractC7864b
        /* renamed from: e */
        public java.sql.Date mo27340d(Date date) {
            return new java.sql.Date(date.getTime());
        }
    }

    /* renamed from: lO5$b */
    /* loaded from: classes6.dex */
    public class C25691b extends TW0.AbstractC7864b<Timestamp> {
        public C25691b(Class cls) {
            super(cls);
        }

        @Override // p000.TW0.AbstractC7864b
        /* renamed from: e */
        public Timestamp mo27340d(Date date) {
            return new Timestamp(date.getTime());
        }
    }

    static {
        boolean z;
        try {
            Class.forName("java.sql.Date");
            z = true;
        } catch (ClassNotFoundException unused) {
            z = false;
        }
        f95983a = z;
        if (z) {
            f95984b = new C25690a(java.sql.Date.class);
            f95985c = new C25691b(Timestamp.class);
            f95986d = SqlDateTypeAdapter.f74651b;
            f95987e = SqlTimeTypeAdapter.f74653b;
            f95988f = SqlTimestampTypeAdapter.f74655b;
            return;
        }
        f95984b = null;
        f95985c = null;
        f95986d = null;
        f95987e = null;
        f95988f = null;
    }

    private C44468lO5() {
    }
}
