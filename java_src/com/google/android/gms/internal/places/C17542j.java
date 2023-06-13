package com.google.android.gms.internal.places;

import com.google.android.gms.internal.places.AbstractC17530c;
import java.util.List;
/* renamed from: com.google.android.gms.internal.places.j */
/* loaded from: classes5.dex */
public final class C17542j extends AbstractC17530c<C17542j, C17543a> implements ZT7 {
    private static final C17542j zzdr;
    private static volatile QV7<C17542j> zzds;
    private BI7<String> zzdo = AbstractC17530c.m51221q();
    private InterfaceC48575sJ7 zzdp = AbstractC17530c.m51222p();
    private BI7<AbstractC43604jv9> zzdq = AbstractC17530c.m51221q();

    /* renamed from: com.google.android.gms.internal.places.j$a */
    /* loaded from: classes5.dex */
    public static final class C17543a extends AbstractC17530c.AbstractC17531a<C17542j, C17543a> implements ZT7 {
        private C17543a() {
            super(C17542j.zzdr);
        }

        public /* synthetic */ C17543a(C17541i c17541i) {
            this();
        }
    }

    static {
        C17542j c17542j = new C17542j();
        zzdr = c17542j;
        AbstractC17530c.m51224n(C17542j.class, c17542j);
    }

    private C17542j() {
    }

    /* renamed from: s */
    public static C17542j m51147s(byte[] bArr) throws zzbk {
        return (C17542j) AbstractC17530c.m51228i(zzdr, bArr);
    }

    @Override // com.google.android.gms.internal.places.AbstractC17530c
    /* renamed from: k */
    public final Object mo51148k(int i, Object obj, Object obj2) {
        switch (C17541i.f71190a[i - 1]) {
            case 1:
                return new C17542j();
            case 2:
                return new C17543a(null);
            case 3:
                return AbstractC17530c.m51225m(zzdr, "\u0001\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0003\u0000\u0001\u001a\u0002\u0016\u0003\u001c", new Object[]{"zzdo", "zzdp", "zzdq"});
            case 4:
                return zzdr;
            case 5:
                QV7<C17542j> qv7 = zzds;
                if (qv7 == null) {
                    synchronized (C17542j.class) {
                        qv7 = zzds;
                        if (qv7 == null) {
                            qv7 = new AbstractC17530c.C17533c<>(zzdr);
                            zzds = qv7;
                        }
                    }
                }
                return qv7;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }

    /* renamed from: t */
    public final List<String> m51146t() {
        return this.zzdo;
    }

    /* renamed from: u */
    public final int m51145u() {
        return this.zzdo.size();
    }

    /* renamed from: w */
    public final List<Integer> m51144w() {
        return this.zzdp;
    }

    /* renamed from: x */
    public final int m51143x() {
        return this.zzdp.size();
    }

    /* renamed from: y */
    public final List<AbstractC43604jv9> m51142y() {
        return this.zzdq;
    }

    /* renamed from: z */
    public final int m51141z() {
        return this.zzdq.size();
    }
}
