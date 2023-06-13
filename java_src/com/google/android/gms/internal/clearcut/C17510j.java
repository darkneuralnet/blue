package com.google.android.gms.internal.clearcut;

import com.google.android.gms.internal.clearcut.AbstractC17497c;
/* renamed from: com.google.android.gms.internal.clearcut.j */
/* loaded from: classes5.dex */
public final class C17510j extends AbstractC17497c<C17510j, C17511a> implements InterfaceC43682k38 {
    private static final C17510j zzbfc;
    private static volatile N58<C17510j> zzbg;
    private int zzbb;
    private int zzbfa = -1;
    private int zzbfb;

    /* renamed from: com.google.android.gms.internal.clearcut.j$a */
    /* loaded from: classes5.dex */
    public static final class C17511a extends AbstractC17497c.AbstractC17498a<C17510j, C17511a> implements InterfaceC43682k38 {
        private C17511a() {
            super(C17510j.zzbfc);
        }

        public /* synthetic */ C17511a(C17514k c17514k) {
            this();
        }
    }

    /* renamed from: com.google.android.gms.internal.clearcut.j$b */
    /* loaded from: classes5.dex */
    public enum EnumC17512b implements InterfaceC46887pT7 {
        UNKNOWN_MOBILE_SUBTYPE(0),
        GPRS(1),
        EDGE(2),
        UMTS(3),
        CDMA(4),
        EVDO_0(5),
        EVDO_A(6),
        RTT(7),
        HSDPA(8),
        HSUPA(9),
        HSPA(10),
        IDEN(11),
        EVDO_B(12),
        LTE(13),
        EHRPD(14),
        HSPAP(15),
        GSM(16),
        TD_SCDMA(17),
        IWLAN(18),
        LTE_CA(19),
        COMBINED(100);
        

        /* renamed from: x */
        public static final DT7<EnumC17512b> f70461x = new C17515l();

        /* renamed from: b */
        public final int f70463b;

        EnumC17512b(int i) {
            this.f70463b = i;
        }

        /* renamed from: a */
        public static EnumC17512b m51480a(int i) {
            if (i != 100) {
                switch (i) {
                    case 0:
                        return UNKNOWN_MOBILE_SUBTYPE;
                    case 1:
                        return GPRS;
                    case 2:
                        return EDGE;
                    case 3:
                        return UMTS;
                    case 4:
                        return CDMA;
                    case 5:
                        return EVDO_0;
                    case 6:
                        return EVDO_A;
                    case 7:
                        return RTT;
                    case 8:
                        return HSDPA;
                    case 9:
                        return HSUPA;
                    case 10:
                        return HSPA;
                    case 11:
                        return IDEN;
                    case 12:
                        return EVDO_B;
                    case 13:
                        return LTE;
                    case 14:
                        return EHRPD;
                    case 15:
                        return HSPAP;
                    case 16:
                        return GSM;
                    case 17:
                        return TD_SCDMA;
                    case 18:
                        return IWLAN;
                    case 19:
                        return LTE_CA;
                    default:
                        return null;
                }
            }
            return COMBINED;
        }

        /* renamed from: b */
        public static DT7<EnumC17512b> m51479b() {
            return f70461x;
        }

        @Override // p000.InterfaceC46887pT7
        public final int zzc() {
            return this.f70463b;
        }
    }

    /* renamed from: com.google.android.gms.internal.clearcut.j$c */
    /* loaded from: classes5.dex */
    public enum EnumC17513c implements InterfaceC46887pT7 {
        NONE(-1),
        MOBILE(0),
        WIFI(1),
        MOBILE_MMS(2),
        MOBILE_SUPL(3),
        MOBILE_DUN(4),
        MOBILE_HIPRI(5),
        WIMAX(6),
        BLUETOOTH(7),
        DUMMY(8),
        ETHERNET(9),
        MOBILE_FOTA(10),
        MOBILE_IMS(11),
        MOBILE_CBS(12),
        WIFI_P2P(13),
        MOBILE_IA(14),
        MOBILE_EMERGENCY(15),
        PROXY(16),
        VPN(17);
        

        /* renamed from: v */
        public static final DT7<EnumC17513c> f70483v = new C17516m();

        /* renamed from: b */
        public final int f70485b;

        EnumC17513c(int i) {
            this.f70485b = i;
        }

        /* renamed from: a */
        public static EnumC17513c m51478a(int i) {
            switch (i) {
                case -1:
                    return NONE;
                case 0:
                    return MOBILE;
                case 1:
                    return WIFI;
                case 2:
                    return MOBILE_MMS;
                case 3:
                    return MOBILE_SUPL;
                case 4:
                    return MOBILE_DUN;
                case 5:
                    return MOBILE_HIPRI;
                case 6:
                    return WIMAX;
                case 7:
                    return BLUETOOTH;
                case 8:
                    return DUMMY;
                case 9:
                    return ETHERNET;
                case 10:
                    return MOBILE_FOTA;
                case 11:
                    return MOBILE_IMS;
                case 12:
                    return MOBILE_CBS;
                case 13:
                    return WIFI_P2P;
                case 14:
                    return MOBILE_IA;
                case 15:
                    return MOBILE_EMERGENCY;
                case 16:
                    return PROXY;
                case 17:
                    return VPN;
                default:
                    return null;
            }
        }

        /* renamed from: b */
        public static DT7<EnumC17513c> m51477b() {
            return f70483v;
        }

        @Override // p000.InterfaceC46887pT7
        public final int zzc() {
            return this.f70485b;
        }
    }

    static {
        C17510j c17510j = new C17510j();
        zzbfc = c17510j;
        AbstractC17497c.m51560g(C17510j.class, c17510j);
    }

    private C17510j() {
    }

    /* JADX WARN: Type inference failed for: r2v14, types: [N58<com.google.android.gms.internal.clearcut.j>, com.google.android.gms.internal.clearcut.c$b] */
    @Override // com.google.android.gms.internal.clearcut.AbstractC17497c
    /* renamed from: d */
    public final Object mo51468d(int i, Object obj, Object obj2) {
        N58<C17510j> n58;
        switch (C17514k.f70486a[i - 1]) {
            case 1:
                return new C17510j();
            case 2:
                return new C17511a(null);
            case 3:
                return AbstractC17497c.m51561f(zzbfc, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0003\u0000\u0000\u0000\u0001\f\u0000\u0002\f\u0001", new Object[]{"zzbb", "zzbfa", EnumC17513c.m51477b(), "zzbfb", EnumC17512b.m51479b()});
            case 4:
                return zzbfc;
            case 5:
                N58<C17510j> n582 = zzbg;
                N58<C17510j> n583 = n582;
                if (n582 == null) {
                    synchronized (C17510j.class) {
                        N58<C17510j> n584 = zzbg;
                        n58 = n584;
                        if (n584 == null) {
                            ?? c17499b = new AbstractC17497c.C17499b(zzbfc);
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
