package com.google.android.gms.internal.clearcut;

import com.google.android.gms.internal.clearcut.AbstractC17497c;
/* renamed from: com.google.android.gms.internal.clearcut.i */
/* loaded from: classes5.dex */
public final class C17508i extends AbstractC17497c<C17508i, C17509a> implements InterfaceC43682k38 {
    private static volatile N58<C17508i> zzbg;
    private static final C17508i zztx;
    private int zzbb;
    private int zztu;
    private String zztv = "";
    private String zztw = "";

    /* renamed from: com.google.android.gms.internal.clearcut.i$a */
    /* loaded from: classes5.dex */
    public static final class C17509a extends AbstractC17497c.AbstractC17498a<C17508i, C17509a> implements InterfaceC43682k38 {
        private C17509a() {
            super(C17508i.zztx);
        }

        public /* synthetic */ C17509a(C17514k c17514k) {
            this();
        }
    }

    static {
        C17508i c17508i = new C17508i();
        zztx = c17508i;
        AbstractC17497c.m51560g(C17508i.class, c17508i);
    }

    private C17508i() {
    }

    /* JADX WARN: Type inference failed for: r2v14, types: [N58<com.google.android.gms.internal.clearcut.i>, com.google.android.gms.internal.clearcut.c$b] */
    @Override // com.google.android.gms.internal.clearcut.AbstractC17497c
    /* renamed from: d */
    public final Object mo51468d(int i, Object obj, Object obj2) {
        N58<C17508i> n58;
        switch (C17514k.f70486a[i - 1]) {
            case 1:
                return new C17508i();
            case 2:
                return new C17509a(null);
            case 3:
                return AbstractC17497c.m51561f(zztx, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0004\u0000\u0000\u0000\u0001\u0004\u0000\u0002\b\u0001\u0003\b\u0002", new Object[]{"zzbb", "zztu", "zztv", "zztw"});
            case 4:
                return zztx;
            case 5:
                N58<C17508i> n582 = zzbg;
                N58<C17508i> n583 = n582;
                if (n582 == null) {
                    synchronized (C17508i.class) {
                        N58<C17508i> n584 = zzbg;
                        n58 = n584;
                        if (n584 == null) {
                            ?? c17499b = new AbstractC17497c.C17499b(zztx);
                            zzbg = c17499b;
                            n58 = c17499b;
                        }
                    }
                    n583 = n58;
                }
                return n583;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
