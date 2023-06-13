package p000;

import java.security.Permission;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
/* renamed from: q00  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public class C47202q00 implements InterfaceC38035aa4 {

    /* renamed from: e */
    public static Permission f104460e = new C38628ba4("BC", "threadLocalEcImplicitlyCa");

    /* renamed from: f */
    public static Permission f104461f = new C38628ba4("BC", "ecImplicitlyCa");

    /* renamed from: g */
    public static Permission f104462g = new C38628ba4("BC", "threadLocalDhDefaultParams");

    /* renamed from: h */
    public static Permission f104463h = new C38628ba4("BC", "DhDefaultParams");

    /* renamed from: i */
    public static Permission f104464i = new C38628ba4("BC", "acceptableEcCurves");

    /* renamed from: j */
    public static Permission f104465j = new C38628ba4("BC", "additionalEcParameters");

    /* renamed from: a */
    public ThreadLocal f104466a = new ThreadLocal();

    /* renamed from: b */
    public ThreadLocal f104467b = new ThreadLocal();

    /* renamed from: c */
    public volatile Set f104468c = new HashSet();

    /* renamed from: d */
    public volatile Map f104469d = new HashMap();
}
