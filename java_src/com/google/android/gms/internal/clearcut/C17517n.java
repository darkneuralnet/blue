package com.google.android.gms.internal.clearcut;

import com.google.android.gms.internal.clearcut.AbstractC17497c;
import java.util.List;
/* renamed from: com.google.android.gms.internal.clearcut.n */
/* loaded from: classes5.dex */
public final class C17517n extends AbstractC17497c<C17517n, C17518a> implements InterfaceC43682k38 {
    private static volatile N58<C17517n> zzbg;
    private static final C17517n zzbir;
    private InterfaceC47489qU7<C17519b> zzbiq = AbstractC17497c.m51558i();

    /* renamed from: com.google.android.gms.internal.clearcut.n$a */
    /* loaded from: classes5.dex */
    public static final class C17518a extends AbstractC17497c.AbstractC17498a<C17517n, C17518a> implements InterfaceC43682k38 {
        private C17518a() {
            super(C17517n.zzbir);
        }

        public /* synthetic */ C17518a(C17521o c17521o) {
            this();
        }
    }

    /* renamed from: com.google.android.gms.internal.clearcut.n$b */
    /* loaded from: classes5.dex */
    public static final class C17519b extends AbstractC17497c<C17519b, C17520a> implements InterfaceC43682k38 {
        private static volatile N58<C17519b> zzbg;
        private static final C17519b zzbiv;
        private int zzbb;
        private String zzbis = "";
        private long zzbit;
        private long zzbiu;
        private int zzya;

        /* renamed from: com.google.android.gms.internal.clearcut.n$b$a */
        /* loaded from: classes5.dex */
        public static final class C17520a extends AbstractC17497c.AbstractC17498a<C17519b, C17520a> implements InterfaceC43682k38 {
            private C17520a() {
                super(C17519b.zzbiv);
            }

            /* renamed from: q */
            public final C17520a m51457q(String str) {
                m51548h();
                ((C17519b) this.f70398c).m51471A(str);
                return this;
            }

            /* renamed from: r */
            public final C17520a m51456r(long j) {
                m51548h();
                ((C17519b) this.f70398c).m51470B(j);
                return this;
            }

            /* renamed from: t */
            public final C17520a m51455t(long j) {
                m51548h();
                ((C17519b) this.f70398c).m51469C(j);
                return this;
            }

            public /* synthetic */ C17520a(C17521o c17521o) {
                this();
            }
        }

        static {
            C17519b c17519b = new C17519b();
            zzbiv = c17519b;
            AbstractC17497c.m51560g(C17519b.class, c17519b);
        }

        private C17519b() {
        }

        /* renamed from: y */
        public static C17520a m51459y() {
            return (C17520a) ((AbstractC17497c.AbstractC17498a) zzbiv.mo51468d(AbstractC17497c.C17502e.f70407e, null, null));
        }

        /* renamed from: A */
        public final void m51471A(String str) {
            str.getClass();
            this.zzbb |= 2;
            this.zzbis = str;
        }

        /* renamed from: B */
        public final void m51470B(long j) {
            this.zzbb |= 4;
            this.zzbit = j;
        }

        /* renamed from: C */
        public final void m51469C(long j) {
            this.zzbb |= 8;
            this.zzbiu = j;
        }

        /* JADX WARN: Type inference failed for: r2v14, types: [com.google.android.gms.internal.clearcut.c$b, N58<com.google.android.gms.internal.clearcut.n$b>] */
        @Override // com.google.android.gms.internal.clearcut.AbstractC17497c
        /* renamed from: d */
        public final Object mo51468d(int i, Object obj, Object obj2) {
            N58<C17519b> n58;
            switch (C17521o.f70487a[i - 1]) {
                case 1:
                    return new C17519b();
                case 2:
                    return new C17520a(null);
                case 3:
                    return AbstractC17497c.m51561f(zzbiv, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0005\u0000\u0000\u0000\u0001\u0004\u0000\u0002\b\u0001\u0003\u0002\u0002\u0004\u0002\u0003", new Object[]{"zzbb", "zzya", "zzbis", "zzbit", "zzbiu"});
                case 4:
                    return zzbiv;
                case 5:
                    N58<C17519b> n582 = zzbg;
                    N58<C17519b> n583 = n582;
                    if (n582 == null) {
                        synchronized (C17519b.class) {
                            N58<C17519b> n584 = zzbg;
                            n58 = n584;
                            if (n584 == null) {
                                ?? c17499b = new AbstractC17497c.C17499b(zzbiv);
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

        /* renamed from: p */
        public final int m51467p() {
            return this.zzya;
        }

        /* renamed from: t */
        public final boolean m51463t() {
            return (this.zzbb & 1) == 1;
        }

        /* renamed from: u */
        public final String m51462u() {
            return this.zzbis;
        }

        /* renamed from: w */
        public final long m51461w() {
            return this.zzbit;
        }

        /* renamed from: x */
        public final long m51460x() {
            return this.zzbiu;
        }
    }

    static {
        C17517n c17517n = new C17517n();
        zzbir = c17517n;
        AbstractC17497c.m51560g(C17517n.class, c17517n);
    }

    private C17517n() {
    }

    /* renamed from: q */
    public static C17517n m51474q() {
        return zzbir;
    }

    /* renamed from: s */
    public static C17517n m51472s(byte[] bArr) throws zzco {
        return (C17517n) AbstractC17497c.m51559h(zzbir, bArr);
    }

    /* JADX WARN: Type inference failed for: r2v14, types: [com.google.android.gms.internal.clearcut.c$b, N58<com.google.android.gms.internal.clearcut.n>] */
    @Override // com.google.android.gms.internal.clearcut.AbstractC17497c
    /* renamed from: d */
    public final Object mo51468d(int i, Object obj, Object obj2) {
        N58<C17517n> n58;
        switch (C17521o.f70487a[i - 1]) {
            case 1:
                return new C17517n();
            case 2:
                return new C17518a(null);
            case 3:
                return AbstractC17497c.m51561f(zzbir, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0002\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzbiq", C17519b.class});
            case 4:
                return zzbir;
            case 5:
                N58<C17517n> n582 = zzbg;
                N58<C17517n> n583 = n582;
                if (n582 == null) {
                    synchronized (C17517n.class) {
                        N58<C17517n> n584 = zzbg;
                        n58 = n584;
                        if (n584 == null) {
                            ?? c17499b = new AbstractC17497c.C17499b(zzbir);
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

    /* renamed from: p */
    public final List<C17519b> m51475p() {
        return this.zzbiq;
    }
}
