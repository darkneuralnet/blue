package p000;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
/* renamed from: bt8  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C38822bt8 {
    /* renamed from: a */
    public static double m62183a(double d) {
        int i;
        int i2;
        if (Double.isNaN(d)) {
            return 0.0d;
        }
        if (!Double.isInfinite(d) && d != 0.0d && i != 0) {
            if (i > 0) {
                i2 = 1;
            } else {
                i2 = -1;
            }
            return i2 * Math.floor(Math.abs(d));
        }
        return d;
    }

    /* renamed from: b */
    public static int m62182b(double d) {
        int i;
        int i2;
        if (!Double.isNaN(d) && !Double.isInfinite(d) && d != 0.0d) {
            if (i > 0) {
                i2 = 1;
            } else {
                i2 = -1;
            }
            return (int) ((i2 * Math.floor(Math.abs(d))) % 4.294967296E9d);
        }
        return 0;
    }

    /* renamed from: c */
    public static int m62181c(C38159am8 c38159am8) {
        int m62182b = m62182b(c38159am8.m70755d("runtime.counter").zzh().doubleValue() + 1.0d);
        if (m62182b <= 1000000) {
            c38159am8.m70752g("runtime.counter", new C44105km7(Double.valueOf(m62182b)));
            return m62182b;
        }
        throw new IllegalStateException("Instructions allowed exceeded");
    }

    /* renamed from: d */
    public static long m62180d(double d) {
        return m62182b(d) & 4294967295L;
    }

    /* renamed from: e */
    public static ZK7 m62179e(String str) {
        ZK7 zk7 = null;
        if (str != null && !str.isEmpty()) {
            zk7 = ZK7.m73295a(Integer.parseInt(str));
        }
        if (zk7 != null) {
            return zk7;
        }
        throw new IllegalArgumentException(String.format("Unsupported commandId %s", str));
    }

    /* renamed from: f */
    public static Object m62178f(InterfaceC37164Xs7 interfaceC37164Xs7) {
        if (InterfaceC37164Xs7.f44126i0.equals(interfaceC37164Xs7)) {
            return null;
        }
        if (InterfaceC37164Xs7.f44125h0.equals(interfaceC37164Xs7)) {
            return "";
        }
        if (interfaceC37164Xs7 instanceof C53038zq7) {
            return m62177g((C53038zq7) interfaceC37164Xs7);
        }
        if (interfaceC37164Xs7 instanceof C50596vj7) {
            ArrayList arrayList = new ArrayList();
            Iterator it = ((C50596vj7) interfaceC37164Xs7).iterator();
            while (it.hasNext()) {
                Object m62178f = m62178f((InterfaceC37164Xs7) it.next());
                if (m62178f != null) {
                    arrayList.add(m62178f);
                }
            }
            return arrayList;
        } else if (!interfaceC37164Xs7.zzh().isNaN()) {
            return interfaceC37164Xs7.zzh();
        } else {
            return interfaceC37164Xs7.zzi();
        }
    }

    /* renamed from: g */
    public static Map m62177g(C53038zq7 c53038zq7) {
        HashMap hashMap = new HashMap();
        for (String str : c53038zq7.m382d()) {
            Object m62178f = m62178f(c53038zq7.mo385a(str));
            if (m62178f != null) {
                hashMap.put(str, m62178f);
            }
        }
        return hashMap;
    }

    /* renamed from: h */
    public static void m62176h(String str, int i, List list) {
        if (list.size() == i) {
            return;
        }
        throw new IllegalArgumentException(String.format("%s operation requires %s parameters found %s", str, Integer.valueOf(i), Integer.valueOf(list.size())));
    }

    /* renamed from: i */
    public static void m62175i(String str, int i, List list) {
        if (list.size() >= i) {
            return;
        }
        throw new IllegalArgumentException(String.format("%s operation requires at least %s parameters found %s", str, Integer.valueOf(i), Integer.valueOf(list.size())));
    }

    /* renamed from: j */
    public static void m62174j(String str, int i, List list) {
        if (list.size() <= i) {
            return;
        }
        throw new IllegalArgumentException(String.format("%s operation requires at most %s parameters found %s", str, Integer.valueOf(i), Integer.valueOf(list.size())));
    }

    /* renamed from: k */
    public static boolean m62173k(InterfaceC37164Xs7 interfaceC37164Xs7) {
        if (interfaceC37164Xs7 == null) {
            return false;
        }
        Double zzh = interfaceC37164Xs7.zzh();
        if (zzh.isNaN() || zzh.doubleValue() < 0.0d || !zzh.equals(Double.valueOf(Math.floor(zzh.doubleValue())))) {
            return false;
        }
        return true;
    }

    /* renamed from: l */
    public static boolean m62172l(InterfaceC37164Xs7 interfaceC37164Xs7, InterfaceC37164Xs7 interfaceC37164Xs72) {
        if (!interfaceC37164Xs7.getClass().equals(interfaceC37164Xs72.getClass())) {
            return false;
        }
        if ((interfaceC37164Xs7 instanceof C37200Xw7) || (interfaceC37164Xs7 instanceof C47713qr7)) {
            return true;
        }
        if (interfaceC37164Xs7 instanceof C44105km7) {
            if (Double.isNaN(interfaceC37164Xs7.zzh().doubleValue()) || Double.isNaN(interfaceC37164Xs72.zzh().doubleValue())) {
                return false;
            }
            return interfaceC37164Xs7.zzh().equals(interfaceC37164Xs72.zzh());
        } else if (interfaceC37164Xs7 instanceof C43019iw7) {
            return interfaceC37164Xs7.zzi().equals(interfaceC37164Xs72.zzi());
        } else {
            if (interfaceC37164Xs7 instanceof C48828sk7) {
                return interfaceC37164Xs7.zzg().equals(interfaceC37164Xs72.zzg());
            }
            if (interfaceC37164Xs7 != interfaceC37164Xs72) {
                return false;
            }
            return true;
        }
    }
}
