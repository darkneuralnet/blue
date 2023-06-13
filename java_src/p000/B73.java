package p000;

import android.util.SparseArray;
import p000.C6922Qt;
/* renamed from: B73 */
/* loaded from: classes5.dex */
public abstract class B73 {

    /* renamed from: B73$a */
    /* loaded from: classes5.dex */
    public static abstract class AbstractC0529a {
        /* renamed from: a */
        public abstract B73 mo87844a();

        /* renamed from: b */
        public abstract AbstractC0529a mo87843b(EnumC0530b enumC0530b);

        /* renamed from: c */
        public abstract AbstractC0529a mo87842c(EnumC0531c enumC0531c);
    }

    /* renamed from: B73$b */
    /* loaded from: classes5.dex */
    public enum EnumC0530b {
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
        public static final SparseArray<EnumC0530b> f1872x;

        /* renamed from: b */
        public final int f1874b;

        static {
            EnumC0530b enumC0530b = UNKNOWN_MOBILE_SUBTYPE;
            EnumC0530b enumC0530b2 = GPRS;
            EnumC0530b enumC0530b3 = EDGE;
            EnumC0530b enumC0530b4 = UMTS;
            EnumC0530b enumC0530b5 = CDMA;
            EnumC0530b enumC0530b6 = EVDO_0;
            EnumC0530b enumC0530b7 = EVDO_A;
            EnumC0530b enumC0530b8 = RTT;
            EnumC0530b enumC0530b9 = HSDPA;
            EnumC0530b enumC0530b10 = HSUPA;
            EnumC0530b enumC0530b11 = HSPA;
            EnumC0530b enumC0530b12 = IDEN;
            EnumC0530b enumC0530b13 = EVDO_B;
            EnumC0530b enumC0530b14 = LTE;
            EnumC0530b enumC0530b15 = EHRPD;
            EnumC0530b enumC0530b16 = HSPAP;
            EnumC0530b enumC0530b17 = GSM;
            EnumC0530b enumC0530b18 = TD_SCDMA;
            EnumC0530b enumC0530b19 = IWLAN;
            EnumC0530b enumC0530b20 = LTE_CA;
            SparseArray<EnumC0530b> sparseArray = new SparseArray<>();
            f1872x = sparseArray;
            sparseArray.put(0, enumC0530b);
            sparseArray.put(1, enumC0530b2);
            sparseArray.put(2, enumC0530b3);
            sparseArray.put(3, enumC0530b4);
            sparseArray.put(4, enumC0530b5);
            sparseArray.put(5, enumC0530b6);
            sparseArray.put(6, enumC0530b7);
            sparseArray.put(7, enumC0530b8);
            sparseArray.put(8, enumC0530b9);
            sparseArray.put(9, enumC0530b10);
            sparseArray.put(10, enumC0530b11);
            sparseArray.put(11, enumC0530b12);
            sparseArray.put(12, enumC0530b13);
            sparseArray.put(13, enumC0530b14);
            sparseArray.put(14, enumC0530b15);
            sparseArray.put(15, enumC0530b16);
            sparseArray.put(16, enumC0530b17);
            sparseArray.put(17, enumC0530b18);
            sparseArray.put(18, enumC0530b19);
            sparseArray.put(19, enumC0530b20);
        }

        EnumC0530b(int i) {
            this.f1874b = i;
        }

        /* renamed from: a */
        public static EnumC0530b m114344a(int i) {
            return f1872x.get(i);
        }

        /* renamed from: b */
        public int m114343b() {
            return this.f1874b;
        }
    }

    /* renamed from: B73$c */
    /* loaded from: classes5.dex */
    public enum EnumC0531c {
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
        VPN(17),
        NONE(-1);
        

        /* renamed from: v */
        public static final SparseArray<EnumC0531c> f1894v;

        /* renamed from: b */
        public final int f1896b;

        static {
            EnumC0531c enumC0531c = MOBILE;
            EnumC0531c enumC0531c2 = WIFI;
            EnumC0531c enumC0531c3 = MOBILE_MMS;
            EnumC0531c enumC0531c4 = MOBILE_SUPL;
            EnumC0531c enumC0531c5 = MOBILE_DUN;
            EnumC0531c enumC0531c6 = MOBILE_HIPRI;
            EnumC0531c enumC0531c7 = WIMAX;
            EnumC0531c enumC0531c8 = BLUETOOTH;
            EnumC0531c enumC0531c9 = DUMMY;
            EnumC0531c enumC0531c10 = ETHERNET;
            EnumC0531c enumC0531c11 = MOBILE_FOTA;
            EnumC0531c enumC0531c12 = MOBILE_IMS;
            EnumC0531c enumC0531c13 = MOBILE_CBS;
            EnumC0531c enumC0531c14 = WIFI_P2P;
            EnumC0531c enumC0531c15 = MOBILE_IA;
            EnumC0531c enumC0531c16 = MOBILE_EMERGENCY;
            EnumC0531c enumC0531c17 = PROXY;
            EnumC0531c enumC0531c18 = VPN;
            EnumC0531c enumC0531c19 = NONE;
            SparseArray<EnumC0531c> sparseArray = new SparseArray<>();
            f1894v = sparseArray;
            sparseArray.put(0, enumC0531c);
            sparseArray.put(1, enumC0531c2);
            sparseArray.put(2, enumC0531c3);
            sparseArray.put(3, enumC0531c4);
            sparseArray.put(4, enumC0531c5);
            sparseArray.put(5, enumC0531c6);
            sparseArray.put(6, enumC0531c7);
            sparseArray.put(7, enumC0531c8);
            sparseArray.put(8, enumC0531c9);
            sparseArray.put(9, enumC0531c10);
            sparseArray.put(10, enumC0531c11);
            sparseArray.put(11, enumC0531c12);
            sparseArray.put(12, enumC0531c13);
            sparseArray.put(13, enumC0531c14);
            sparseArray.put(14, enumC0531c15);
            sparseArray.put(15, enumC0531c16);
            sparseArray.put(16, enumC0531c17);
            sparseArray.put(17, enumC0531c18);
            sparseArray.put(-1, enumC0531c19);
        }

        EnumC0531c(int i) {
            this.f1896b = i;
        }

        /* renamed from: a */
        public static EnumC0531c m114342a(int i) {
            return f1894v.get(i);
        }

        /* renamed from: b */
        public int m114341b() {
            return this.f1896b;
        }
    }

    /* renamed from: a */
    public static AbstractC0529a m114345a() {
        return new C6922Qt.C6924b();
    }

    /* renamed from: b */
    public abstract EnumC0530b mo87846b();

    /* renamed from: c */
    public abstract EnumC0531c mo87845c();
}
