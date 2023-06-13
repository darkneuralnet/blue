package p000;

import ch.qos.logback.core.CoreConstants;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/* renamed from: Bk2  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C31939Bk2 {

    /* renamed from: c */
    public static final C31939Bk2 f2802c = new C31939Bk2("COMPOSITION");

    /* renamed from: a */
    public final List<String> f2803a;

    /* renamed from: b */
    public InterfaceC32173Ck2 f2804b;

    public C31939Bk2(String... strArr) {
        this.f2803a = Arrays.asList(strArr);
    }

    /* renamed from: a */
    public C31939Bk2 m113549a(String str) {
        C31939Bk2 c31939Bk2 = new C31939Bk2(this);
        c31939Bk2.f2803a.add(str);
        return c31939Bk2;
    }

    /* renamed from: b */
    public final boolean m113548b() {
        List<String> list = this.f2803a;
        return list.get(list.size() - 1).equals("**");
    }

    /* renamed from: c */
    public boolean m113547c(String str, int i) {
        boolean z;
        boolean z2;
        boolean z3;
        if (i >= this.f2803a.size()) {
            return false;
        }
        if (i == this.f2803a.size() - 1) {
            z = true;
        } else {
            z = false;
        }
        String str2 = this.f2803a.get(i);
        if (!str2.equals("**")) {
            if (!str2.equals(str) && !str2.equals("*")) {
                z3 = false;
            } else {
                z3 = true;
            }
            if ((!z && (i != this.f2803a.size() - 2 || !m113548b())) || !z3) {
                return false;
            }
            return true;
        }
        if (!z && this.f2803a.get(i + 1).equals(str)) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            if (i != this.f2803a.size() - 2 && (i != this.f2803a.size() - 3 || !m113548b())) {
                return false;
            }
            return true;
        } else if (z) {
            return true;
        } else {
            int i2 = i + 1;
            if (i2 < this.f2803a.size() - 1) {
                return false;
            }
            return this.f2803a.get(i2).equals(str);
        }
    }

    /* renamed from: d */
    public InterfaceC32173Ck2 m113546d() {
        return this.f2804b;
    }

    /* renamed from: e */
    public int m113545e(String str, int i) {
        if (m113544f(str)) {
            return 0;
        }
        if (!this.f2803a.get(i).equals("**")) {
            return 1;
        }
        if (i == this.f2803a.size() - 1 || !this.f2803a.get(i + 1).equals(str)) {
            return 0;
        }
        return 2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C31939Bk2 c31939Bk2 = (C31939Bk2) obj;
        if (!this.f2803a.equals(c31939Bk2.f2803a)) {
            return false;
        }
        InterfaceC32173Ck2 interfaceC32173Ck2 = this.f2804b;
        InterfaceC32173Ck2 interfaceC32173Ck22 = c31939Bk2.f2804b;
        if (interfaceC32173Ck2 != null) {
            return interfaceC32173Ck2.equals(interfaceC32173Ck22);
        }
        if (interfaceC32173Ck22 == null) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public final boolean m113544f(String str) {
        return "__container".equals(str);
    }

    /* renamed from: g */
    public boolean m113543g(String str, int i) {
        if (m113544f(str)) {
            return true;
        }
        if (i >= this.f2803a.size()) {
            return false;
        }
        if (this.f2803a.get(i).equals(str) || this.f2803a.get(i).equals("**") || this.f2803a.get(i).equals("*")) {
            return true;
        }
        return false;
    }

    /* renamed from: h */
    public boolean m113542h(String str, int i) {
        if ("__container".equals(str) || i < this.f2803a.size() - 1 || this.f2803a.get(i).equals("**")) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i;
        int hashCode = this.f2803a.hashCode() * 31;
        InterfaceC32173Ck2 interfaceC32173Ck2 = this.f2804b;
        if (interfaceC32173Ck2 != null) {
            i = interfaceC32173Ck2.hashCode();
        } else {
            i = 0;
        }
        return hashCode + i;
    }

    /* renamed from: i */
    public C31939Bk2 m113541i(InterfaceC32173Ck2 interfaceC32173Ck2) {
        C31939Bk2 c31939Bk2 = new C31939Bk2(this);
        c31939Bk2.f2804b = interfaceC32173Ck2;
        return c31939Bk2;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("KeyPath{keys=");
        sb.append(this.f2803a);
        sb.append(",resolved=");
        sb.append(this.f2804b != null);
        sb.append(CoreConstants.CURLY_RIGHT);
        return sb.toString();
    }

    public C31939Bk2(C31939Bk2 c31939Bk2) {
        this.f2803a = new ArrayList(c31939Bk2.f2803a);
        this.f2804b = c31939Bk2.f2804b;
    }
}
