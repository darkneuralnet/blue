package p000;

import android.os.Bundle;
import ch.qos.logback.core.CoreConstants;
import java.util.EnumMap;
/* renamed from: Xm7  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C37110Xm7 {

    /* renamed from: b */
    public static final C37110Xm7 f43902b = new C37110Xm7(null, null);

    /* renamed from: a */
    public final EnumMap f43903a;

    public C37110Xm7(Boolean bool, Boolean bool2) {
        EnumMap enumMap = new EnumMap(EnumC39344cm7.class);
        this.f43903a = enumMap;
        enumMap.put((EnumMap) EnumC39344cm7.AD_STORAGE, (EnumC39344cm7) bool);
        enumMap.put((EnumMap) EnumC39344cm7.ANALYTICS_STORAGE, (EnumC39344cm7) bool2);
    }

    /* renamed from: a */
    public static C37110Xm7 m76365a(Bundle bundle) {
        EnumC39344cm7[] values;
        if (bundle == null) {
            return f43902b;
        }
        EnumMap enumMap = new EnumMap(EnumC39344cm7.class);
        for (EnumC39344cm7 enumC39344cm7 : EnumC39344cm7.values()) {
            enumMap.put((EnumMap) enumC39344cm7, (EnumC39344cm7) m76352n(bundle.getString(enumC39344cm7.f61231b)));
        }
        return new C37110Xm7(enumMap);
    }

    /* renamed from: b */
    public static C37110Xm7 m76364b(String str) {
        EnumMap enumMap = new EnumMap(EnumC39344cm7.class);
        if (str != null) {
            int i = 0;
            while (true) {
                EnumC39344cm7[] enumC39344cm7Arr = EnumC39344cm7.f61229e;
                int length = enumC39344cm7Arr.length;
                if (i >= 2) {
                    break;
                }
                EnumC39344cm7 enumC39344cm7 = enumC39344cm7Arr[i];
                int i2 = i + 2;
                if (i2 < str.length()) {
                    char charAt = str.charAt(i2);
                    Boolean bool = null;
                    if (charAt != '-') {
                        if (charAt != '0') {
                            if (charAt == '1') {
                                bool = Boolean.TRUE;
                            }
                        } else {
                            bool = Boolean.FALSE;
                        }
                    }
                    enumMap.put((EnumMap) enumC39344cm7, (EnumC39344cm7) bool);
                }
                i++;
            }
        }
        return new C37110Xm7(enumMap);
    }

    /* renamed from: g */
    public static String m76359g(Bundle bundle) {
        EnumC39344cm7[] values;
        String string;
        for (EnumC39344cm7 enumC39344cm7 : EnumC39344cm7.values()) {
            if (bundle.containsKey(enumC39344cm7.f61231b) && (string = bundle.getString(enumC39344cm7.f61231b)) != null && m76352n(string) == null) {
                return string;
            }
        }
        return null;
    }

    /* renamed from: j */
    public static boolean m76356j(int i, int i2) {
        return i <= i2;
    }

    /* renamed from: m */
    public static final int m76353m(Boolean bool) {
        if (bool == null) {
            return 0;
        }
        return bool.booleanValue() ? 1 : 2;
    }

    /* renamed from: n */
    public static Boolean m76352n(String str) {
        if (str == null) {
            return null;
        }
        if (str.equals("granted")) {
            return Boolean.TRUE;
        }
        if (!str.equals("denied")) {
            return null;
        }
        return Boolean.FALSE;
    }

    /* renamed from: c */
    public final C37110Xm7 m76363c(C37110Xm7 c37110Xm7) {
        EnumC39344cm7[] values;
        boolean z;
        EnumMap enumMap = new EnumMap(EnumC39344cm7.class);
        for (EnumC39344cm7 enumC39344cm7 : EnumC39344cm7.values()) {
            Boolean bool = (Boolean) this.f43903a.get(enumC39344cm7);
            Boolean bool2 = (Boolean) c37110Xm7.f43903a.get(enumC39344cm7);
            if (bool == null) {
                bool = bool2;
            } else if (bool2 != null) {
                if (bool.booleanValue() && bool2.booleanValue()) {
                    z = true;
                } else {
                    z = false;
                }
                bool = Boolean.valueOf(z);
            }
            enumMap.put((EnumMap) enumC39344cm7, (EnumC39344cm7) bool);
        }
        return new C37110Xm7(enumMap);
    }

    /* renamed from: d */
    public final C37110Xm7 m76362d(C37110Xm7 c37110Xm7) {
        EnumC39344cm7[] values;
        EnumMap enumMap = new EnumMap(EnumC39344cm7.class);
        for (EnumC39344cm7 enumC39344cm7 : EnumC39344cm7.values()) {
            Boolean bool = (Boolean) this.f43903a.get(enumC39344cm7);
            if (bool == null) {
                bool = (Boolean) c37110Xm7.f43903a.get(enumC39344cm7);
            }
            enumMap.put((EnumMap) enumC39344cm7, (EnumC39344cm7) bool);
        }
        return new C37110Xm7(enumMap);
    }

    /* renamed from: e */
    public final Boolean m76361e() {
        return (Boolean) this.f43903a.get(EnumC39344cm7.AD_STORAGE);
    }

    public final boolean equals(Object obj) {
        EnumC39344cm7[] values;
        if (!(obj instanceof C37110Xm7)) {
            return false;
        }
        C37110Xm7 c37110Xm7 = (C37110Xm7) obj;
        for (EnumC39344cm7 enumC39344cm7 : EnumC39344cm7.values()) {
            if (m76353m((Boolean) this.f43903a.get(enumC39344cm7)) != m76353m((Boolean) c37110Xm7.f43903a.get(enumC39344cm7))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: f */
    public final Boolean m76360f() {
        return (Boolean) this.f43903a.get(EnumC39344cm7.ANALYTICS_STORAGE);
    }

    /* renamed from: h */
    public final String m76358h() {
        char c;
        StringBuilder sb = new StringBuilder("G1");
        EnumC39344cm7[] enumC39344cm7Arr = EnumC39344cm7.f61229e;
        int length = enumC39344cm7Arr.length;
        for (int i = 0; i < 2; i++) {
            Boolean bool = (Boolean) this.f43903a.get(enumC39344cm7Arr[i]);
            if (bool == null) {
                c = CoreConstants.DASH_CHAR;
            } else if (bool.booleanValue()) {
                c = '1';
            } else {
                c = '0';
            }
            sb.append(c);
        }
        return sb.toString();
    }

    public final int hashCode() {
        int i = 17;
        for (Boolean bool : this.f43903a.values()) {
            i = (i * 31) + m76353m(bool);
        }
        return i;
    }

    /* renamed from: i */
    public final boolean m76357i(EnumC39344cm7 enumC39344cm7) {
        Boolean bool = (Boolean) this.f43903a.get(enumC39344cm7);
        if (bool != null && !bool.booleanValue()) {
            return false;
        }
        return true;
    }

    /* renamed from: k */
    public final boolean m76355k(C37110Xm7 c37110Xm7) {
        return m76354l(c37110Xm7, (EnumC39344cm7[]) this.f43903a.keySet().toArray(new EnumC39344cm7[0]));
    }

    /* renamed from: l */
    public final boolean m76354l(C37110Xm7 c37110Xm7, EnumC39344cm7... enumC39344cm7Arr) {
        for (EnumC39344cm7 enumC39344cm7 : enumC39344cm7Arr) {
            Boolean bool = (Boolean) this.f43903a.get(enumC39344cm7);
            Boolean bool2 = (Boolean) c37110Xm7.f43903a.get(enumC39344cm7);
            Boolean bool3 = Boolean.FALSE;
            if (bool == bool3 && bool2 != bool3) {
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("settings: ");
        EnumC39344cm7[] values = EnumC39344cm7.values();
        int length = values.length;
        for (int i = 0; i < length; i++) {
            EnumC39344cm7 enumC39344cm7 = values[i];
            if (i != 0) {
                sb.append(", ");
            }
            sb.append(enumC39344cm7.name());
            sb.append("=");
            Boolean bool = (Boolean) this.f43903a.get(enumC39344cm7);
            if (bool == null) {
                sb.append("uninitialized");
            } else {
                if (true != bool.booleanValue()) {
                    str = "denied";
                } else {
                    str = "granted";
                }
                sb.append(str);
            }
        }
        return sb.toString();
    }

    public C37110Xm7(EnumMap enumMap) {
        EnumMap enumMap2 = new EnumMap(EnumC39344cm7.class);
        this.f43903a = enumMap2;
        enumMap2.putAll(enumMap);
    }
}
