package p000;

import com.google.firebase.crashlytics.internal.common.IdManager;
/* renamed from: S94 */
/* loaded from: classes6.dex */
public enum S94 {
    v0(IdManager.DEFAULT_VERSION_NAME),
    v1("1.0"),
    v2("2.0"),
    v3("3.0");
    

    /* renamed from: b */
    public final String f33279b;

    S94(String str) {
        this.f33279b = str;
    }

    /* renamed from: a */
    public static S94 m85877a(String str) {
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case 48:
                if (str.equals("0")) {
                    c = 0;
                    break;
                }
                break;
            case 49:
                if (str.equals("1")) {
                    c = 1;
                    break;
                }
                break;
            case 50:
                if (str.equals("2")) {
                    c = 2;
                    break;
                }
                break;
            case 51:
                if (str.equals("3")) {
                    c = 3;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return v0;
            case 1:
                return v1;
            case 2:
                return v2;
            case 3:
                return v3;
            default:
                throw new IllegalArgumentException("invalid protocol");
        }
    }

    /* renamed from: b */
    public String m85876b() {
        return this.f33279b;
    }
}
