package p000;

import java.security.AccessController;
import java.security.PrivilegedAction;
import java.security.Provider;
import java.util.HashMap;
import java.util.Map;
/* renamed from: o00  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public class C46016o00 extends Provider implements InterfaceC33206Gv0 {

    /* renamed from: b */
    public static String f101196b = "BouncyCastle Post-Quantum Security Provider v1.69";

    /* renamed from: c */
    public static String f101197c = "BCPQC";

    /* renamed from: d */
    public static final Map f101198d = new HashMap();

    /* renamed from: e */
    public static final String[] f101199e = {"Rainbow", "McEliece", "SPHINCS", "LMS", "NH", "XMSS", "QTESLA"};

    /* renamed from: o00$a */
    /* loaded from: classes8.dex */
    public class C26783a implements PrivilegedAction {
        public C26783a() {
        }

        @Override // java.security.PrivilegedAction
        public Object run() {
            C46016o00.this.m22015g();
            return null;
        }
    }

    /* renamed from: o00$b */
    /* loaded from: classes8.dex */
    public static class C26784b implements PrivilegedAction {

        /* renamed from: a */
        public final /* synthetic */ String f101201a;

        public C26784b(String str) {
            this.f101201a = str;
        }

        @Override // java.security.PrivilegedAction
        public Object run() {
            try {
                return Class.forName(this.f101201a);
            } catch (Exception unused) {
                return null;
            }
        }
    }

    public C46016o00() {
        super(f101197c, 1.67d, f101196b);
        AccessController.doPrivileged(new C26783a());
    }

    /* renamed from: f */
    public static Class m22016f(Class cls, String str) {
        try {
            ClassLoader classLoader = cls.getClassLoader();
            return classLoader != null ? classLoader.loadClass(str) : (Class) AccessController.doPrivileged(new C26784b(str));
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    /* renamed from: e */
    public final void m22017e(String str, String[] strArr) {
        for (int i = 0; i != strArr.length; i++) {
            Class m22016f = m22016f(C46016o00.class, str + strArr[i] + "$Mappings");
            if (m22016f != null) {
                try {
                    ((AbstractC3357I9) m22016f.newInstance()).m102852a(this);
                } catch (Exception e) {
                    throw new InternalError("cannot create instance of " + str + strArr[i] + "$Mappings : " + e);
                }
            }
        }
    }

    /* renamed from: g */
    public final void m22015g() {
        m22017e("org.bouncycastle.pqc.jcajce.provider.", f101199e);
    }
}
