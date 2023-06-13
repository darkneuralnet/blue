package p000;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;
/* renamed from: yx9  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC52517yx9 {

    /* renamed from: a */
    public final String f120451a;

    /* renamed from: b */
    public final int f120452b;

    /* renamed from: c */
    public Boolean f120453c;

    /* renamed from: d */
    public Boolean f120454d;

    /* renamed from: e */
    public Long f120455e;

    /* renamed from: f */
    public Long f120456f;

    public AbstractC52517yx9(String str, int i) {
        this.f120451a = str;
        this.f120452b = i;
    }

    /* renamed from: d */
    public static Boolean m2214d(String str, int i, boolean z, String str2, List list, String str3, C32809Fc8 c32809Fc8) {
        int i2;
        if (i == 7) {
            if (list == null || list.isEmpty()) {
                return null;
            }
        } else if (str2 == null) {
            return null;
        }
        if (!z && i != 2) {
            str = str.toUpperCase(Locale.ENGLISH);
        }
        switch (i - 1) {
            case 1:
                if (str3 == null) {
                    return null;
                }
                if (true != z) {
                    i2 = 66;
                } else {
                    i2 = 0;
                }
                try {
                    return Boolean.valueOf(Pattern.compile(str3, i2).matcher(str).matches());
                } catch (PatternSyntaxException unused) {
                    if (c32809Fc8 != null) {
                        c32809Fc8.m106888t().m42707b("Invalid regular expression in REGEXP audience filter. expression", str3);
                    }
                    return null;
                }
            case 2:
                return Boolean.valueOf(str.startsWith(str2));
            case 3:
                return Boolean.valueOf(str.endsWith(str2));
            case 4:
                return Boolean.valueOf(str.contains(str2));
            case 5:
                return Boolean.valueOf(str.equals(str2));
            case 6:
                if (list == null) {
                    return null;
                }
                return Boolean.valueOf(list.contains(str));
            default:
                return null;
        }
    }

    @VisibleForTesting
    /* renamed from: e */
    public static Boolean m2213e(BigDecimal bigDecimal, C36544Vb8 c36544Vb8, double d) {
        BigDecimal bigDecimal2;
        BigDecimal bigDecimal3;
        BigDecimal bigDecimal4;
        Preconditions.checkNotNull(c36544Vb8);
        if (c36544Vb8.m79672H()) {
            boolean z = true;
            if (c36544Vb8.m79667N() != 1) {
                if (c36544Vb8.m79667N() == 5) {
                    if (!c36544Vb8.m79668M() || !c36544Vb8.m79669K()) {
                        return null;
                    }
                } else if (!c36544Vb8.m79671I()) {
                    return null;
                }
                int m79667N = c36544Vb8.m79667N();
                if (c36544Vb8.m79667N() == 5) {
                    if (DV8.m110331N(c36544Vb8.m79674F()) && DV8.m110331N(c36544Vb8.m79675E())) {
                        try {
                            BigDecimal bigDecimal5 = new BigDecimal(c36544Vb8.m79674F());
                            bigDecimal4 = new BigDecimal(c36544Vb8.m79675E());
                            bigDecimal3 = bigDecimal5;
                            bigDecimal2 = null;
                        } catch (NumberFormatException unused) {
                        }
                    }
                    return null;
                } else if (!DV8.m110331N(c36544Vb8.m79676D())) {
                    return null;
                } else {
                    try {
                        bigDecimal2 = new BigDecimal(c36544Vb8.m79676D());
                        bigDecimal3 = null;
                        bigDecimal4 = null;
                    } catch (NumberFormatException unused2) {
                    }
                }
                if (m79667N == 5) {
                    if (bigDecimal3 == null) {
                        return null;
                    }
                } else if (bigDecimal2 == null) {
                    return null;
                }
                int i = m79667N - 1;
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            if (i != 4 || bigDecimal3 == null) {
                                return null;
                            }
                            if (bigDecimal.compareTo(bigDecimal3) < 0 || bigDecimal.compareTo(bigDecimal4) > 0) {
                                z = false;
                            }
                            return Boolean.valueOf(z);
                        } else if (bigDecimal2 == null) {
                            return null;
                        } else {
                            if (d != 0.0d) {
                                if (bigDecimal.compareTo(bigDecimal2.subtract(new BigDecimal(d).multiply(new BigDecimal(2)))) <= 0 || bigDecimal.compareTo(bigDecimal2.add(new BigDecimal(d).multiply(new BigDecimal(2)))) >= 0) {
                                    z = false;
                                }
                                return Boolean.valueOf(z);
                            }
                            if (bigDecimal.compareTo(bigDecimal2) != 0) {
                                z = false;
                            }
                            return Boolean.valueOf(z);
                        }
                    } else if (bigDecimal2 == null) {
                        return null;
                    } else {
                        if (bigDecimal.compareTo(bigDecimal2) <= 0) {
                            z = false;
                        }
                        return Boolean.valueOf(z);
                    }
                } else if (bigDecimal2 == null) {
                    return null;
                } else {
                    if (bigDecimal.compareTo(bigDecimal2) >= 0) {
                        z = false;
                    }
                    return Boolean.valueOf(z);
                }
            }
        }
        return null;
    }

    @VisibleForTesting
    /* renamed from: f */
    public static Boolean m2212f(String str, C33520Id8 c33520Id8, C32809Fc8 c32809Fc8) {
        String m101860E;
        List list;
        String str2;
        Preconditions.checkNotNull(c33520Id8);
        if (str == null || !c33520Id8.m101855J() || c33520Id8.m101854K() == 1) {
            return null;
        }
        if (c33520Id8.m101854K() == 7) {
            if (c33520Id8.m101863B() == 0) {
                return null;
            }
        } else if (!c33520Id8.m101856I()) {
            return null;
        }
        int m101854K = c33520Id8.m101854K();
        boolean m101858G = c33520Id8.m101858G();
        if (!m101858G && m101854K != 2 && m101854K != 7) {
            m101860E = c33520Id8.m101860E().toUpperCase(Locale.ENGLISH);
        } else {
            m101860E = c33520Id8.m101860E();
        }
        String str3 = m101860E;
        if (c33520Id8.m101863B() == 0) {
            list = null;
        } else {
            List<String> m101859F = c33520Id8.m101859F();
            if (!m101858G) {
                ArrayList arrayList = new ArrayList(m101859F.size());
                for (String str4 : m101859F) {
                    arrayList.add(str4.toUpperCase(Locale.ENGLISH));
                }
                m101859F = Collections.unmodifiableList(arrayList);
            }
            list = m101859F;
        }
        if (m101854K == 2) {
            str2 = str3;
        } else {
            str2 = null;
        }
        return m2214d(str, m101854K, m101858G, str3, list, str2, c32809Fc8);
    }

    /* renamed from: g */
    public static Boolean m2211g(double d, C36544Vb8 c36544Vb8) {
        try {
            return m2213e(new BigDecimal(d), c36544Vb8, Math.ulp(d));
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    /* renamed from: h */
    public static Boolean m2210h(long j, C36544Vb8 c36544Vb8) {
        try {
            return m2213e(new BigDecimal(j), c36544Vb8, 0.0d);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    /* renamed from: i */
    public static Boolean m2209i(String str, C36544Vb8 c36544Vb8) {
        if (!DV8.m110331N(str)) {
            return null;
        }
        try {
            return m2213e(new BigDecimal(str), c36544Vb8, 0.0d);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    @VisibleForTesting
    /* renamed from: j */
    public static Boolean m2208j(Boolean bool, boolean z) {
        if (bool == null) {
            return null;
        }
        return Boolean.valueOf(bool.booleanValue() != z);
    }

    /* renamed from: a */
    public abstract int mo2182a();

    /* renamed from: b */
    public abstract boolean mo2181b();

    /* renamed from: c */
    public abstract boolean mo2180c();
}
