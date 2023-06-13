package p000;

import android.text.TextUtils;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
/* renamed from: Pi6  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C35201Pi6 {

    /* renamed from: b */
    public static final long f28938b = TimeUnit.HOURS.toSeconds(1);

    /* renamed from: c */
    public static final Pattern f28939c = Pattern.compile("\\AA[\\w-]{38}\\z");

    /* renamed from: d */
    public static C35201Pi6 f28940d;

    /* renamed from: a */
    public final InterfaceC37553Zk0 f28941a;

    public C35201Pi6(InterfaceC37553Zk0 interfaceC37553Zk0) {
        this.f28941a = interfaceC37553Zk0;
    }

    /* renamed from: c */
    public static C35201Pi6 m89901c() {
        return m89900d(TX5.m83426a());
    }

    /* renamed from: d */
    public static C35201Pi6 m89900d(InterfaceC37553Zk0 interfaceC37553Zk0) {
        if (f28940d == null) {
            f28940d = new C35201Pi6(interfaceC37553Zk0);
        }
        return f28940d;
    }

    /* renamed from: g */
    public static boolean m89897g(String str) {
        return f28939c.matcher(str).matches();
    }

    /* renamed from: h */
    public static boolean m89896h(String str) {
        return str.contains(":");
    }

    /* renamed from: a */
    public long m89903a() {
        return this.f28941a.currentTimeMillis();
    }

    /* renamed from: b */
    public long m89902b() {
        return TimeUnit.MILLISECONDS.toSeconds(m89903a());
    }

    /* renamed from: e */
    public long m89899e() {
        return (long) (Math.random() * 1000.0d);
    }

    /* renamed from: f */
    public boolean m89898f(AbstractC45679nR3 abstractC45679nR3) {
        if (TextUtils.isEmpty(abstractC45679nR3.mo23779b()) || abstractC45679nR3.mo23773h() + abstractC45679nR3.mo23778c() < m89902b() + f28938b) {
            return true;
        }
        return false;
    }
}
