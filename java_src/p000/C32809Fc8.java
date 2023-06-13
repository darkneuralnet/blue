package p000;

import android.text.TextUtils;
import android.util.Log;
import co.bird.android.model.Detail;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;
/* renamed from: Fc8  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32809Fc8 extends AbstractC32017Bs8 {

    /* renamed from: c */
    public char f9773c;

    /* renamed from: d */
    public long f9774d;

    /* renamed from: e */
    public String f9775e;

    /* renamed from: f */
    public final C40448ec8 f9776f;

    /* renamed from: g */
    public final C40448ec8 f9777g;

    /* renamed from: h */
    public final C40448ec8 f9778h;

    /* renamed from: i */
    public final C40448ec8 f9779i;

    /* renamed from: j */
    public final C40448ec8 f9780j;

    /* renamed from: k */
    public final C40448ec8 f9781k;

    /* renamed from: l */
    public final C40448ec8 f9782l;

    /* renamed from: m */
    public final C40448ec8 f9783m;

    /* renamed from: n */
    public final C40448ec8 f9784n;

    public C32809Fc8(C35248Pn8 c35248Pn8) {
        super(c35248Pn8);
        this.f9773c = (char) 0;
        this.f9774d = -1L;
        this.f9776f = new C40448ec8(this, 6, false, false);
        this.f9777g = new C40448ec8(this, 6, true, false);
        this.f9778h = new C40448ec8(this, 6, false, true);
        this.f9779i = new C40448ec8(this, 5, false, false);
        this.f9780j = new C40448ec8(this, 5, true, false);
        this.f9781k = new C40448ec8(this, 5, false, true);
        this.f9782l = new C40448ec8(this, 4, false, false);
        this.f9783m = new C40448ec8(this, 3, false, false);
        this.f9784n = new C40448ec8(this, 2, false, false);
    }

    @VisibleForTesting
    /* renamed from: B */
    public static String m106901B(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        int lastIndexOf = str.lastIndexOf(46);
        if (lastIndexOf == -1) {
            Vd9.m79634b();
            if (((Boolean) C37795a98.f49924A0.m97658a(null)).booleanValue()) {
                return "";
            }
            return str;
        }
        return str.substring(0, lastIndexOf);
    }

    /* renamed from: w */
    public static Object m106885w(String str) {
        if (str == null) {
            return null;
        }
        return new C48749sc8(str);
    }

    /* renamed from: x */
    public static String m106884x(boolean z, String str, Object obj, Object obj2, Object obj3) {
        String m106883y = m106883y(z, obj);
        String m106883y2 = m106883y(z, obj2);
        String m106883y3 = m106883y(z, obj3);
        StringBuilder sb = new StringBuilder();
        String str2 = "";
        if (str == null) {
            str = "";
        }
        if (!TextUtils.isEmpty(str)) {
            sb.append(str);
            str2 = ": ";
        }
        String str3 = ", ";
        if (!TextUtils.isEmpty(m106883y)) {
            sb.append(str2);
            sb.append(m106883y);
            str2 = ", ";
        }
        if (!TextUtils.isEmpty(m106883y2)) {
            sb.append(str2);
            sb.append(m106883y2);
        } else {
            str3 = str2;
        }
        if (!TextUtils.isEmpty(m106883y3)) {
            sb.append(str3);
            sb.append(m106883y3);
        }
        return sb.toString();
    }

    @VisibleForTesting
    /* renamed from: y */
    public static String m106883y(boolean z, Object obj) {
        String str;
        String th;
        String className;
        String str2 = "";
        if (obj == null) {
            return "";
        }
        if (obj instanceof Integer) {
            obj = Long.valueOf(((Integer) obj).intValue());
        }
        int i = 0;
        if (obj instanceof Long) {
            if (!z) {
                return obj.toString();
            }
            Long l = (Long) obj;
            if (Math.abs(l.longValue()) < 100) {
                return obj.toString();
            }
            char charAt = obj.toString().charAt(0);
            String valueOf = String.valueOf(Math.abs(l.longValue()));
            long round = Math.round(Math.pow(10.0d, valueOf.length() - 1));
            long round2 = Math.round(Math.pow(10.0d, valueOf.length()) - 1.0d);
            StringBuilder sb = new StringBuilder();
            if (charAt == '-') {
                str2 = Detail.EMPTY_CHAR;
            }
            sb.append(str2);
            sb.append(round);
            sb.append("...");
            sb.append(str2);
            sb.append(round2);
            return sb.toString();
        } else if (obj instanceof Boolean) {
            return obj.toString();
        } else {
            if (obj instanceof Throwable) {
                Throwable th2 = (Throwable) obj;
                if (z) {
                    th = th2.getClass().getName();
                } else {
                    th = th2.toString();
                }
                StringBuilder sb2 = new StringBuilder(th);
                String m106901B = m106901B(C35248Pn8.class.getCanonicalName());
                StackTraceElement[] stackTrace = th2.getStackTrace();
                int length = stackTrace.length;
                while (true) {
                    if (i >= length) {
                        break;
                    }
                    StackTraceElement stackTraceElement = stackTrace[i];
                    if (!stackTraceElement.isNativeMethod() && (className = stackTraceElement.getClassName()) != null && m106901B(className).equals(m106901B)) {
                        sb2.append(": ");
                        sb2.append(stackTraceElement);
                        break;
                    }
                    i++;
                }
                return sb2.toString();
            } else if (obj instanceof C48749sc8) {
                str = ((C48749sc8) obj).f109047a;
                return str;
            } else if (z) {
                return Detail.EMPTY_CHAR;
            } else {
                return obj.toString();
            }
        }
    }

    @VisibleForTesting
    /* renamed from: D */
    public final String m106900D() {
        String str;
        synchronized (this) {
            if (this.f9775e == null) {
                if (this.f100966a.m89773Q() != null) {
                    this.f9775e = this.f100966a.m89773Q();
                } else {
                    this.f9775e = this.f100966a.m89751w().m37507t();
                }
            }
            Preconditions.checkNotNull(this.f9775e);
            str = this.f9775e;
        }
        return str;
    }

    /* renamed from: G */
    public final void m106897G(int i, boolean z, boolean z2, String str, Object obj, Object obj2, Object obj3) {
        if (!z && Log.isLoggable(m106900D(), i)) {
            Log.println(i, m106900D(), m106884x(false, str, obj, obj2, obj3));
        }
        if (!z2 && i >= 5) {
            Preconditions.checkNotNull(str);
            C39965dn8 m89783G = this.f100966a.m89783G();
            if (m89783G == null) {
                Log.println(6, m106900D(), "Scheduler not set. Not logging error/warn");
            } else if (!m89783G.m113416k()) {
                Log.println(6, m106900D(), "Scheduler not initialized. Not logging error/warn");
            } else {
                if (i >= 9) {
                    i = 8;
                }
                m89783G.m43695w(new RunnableC35842Sb8(this, i, str, obj, obj2, obj3));
            }
        }
    }

    @Override // p000.AbstractC32017Bs8
    /* renamed from: g */
    public final boolean mo43707g() {
        return false;
    }

    /* renamed from: n */
    public final C40448ec8 m106894n() {
        return this.f9783m;
    }

    /* renamed from: o */
    public final C40448ec8 m106893o() {
        return this.f9776f;
    }

    /* renamed from: p */
    public final C40448ec8 m106892p() {
        return this.f9778h;
    }

    /* renamed from: q */
    public final C40448ec8 m106891q() {
        return this.f9777g;
    }

    /* renamed from: r */
    public final C40448ec8 m106890r() {
        return this.f9782l;
    }

    /* renamed from: s */
    public final C40448ec8 m106889s() {
        return this.f9784n;
    }

    /* renamed from: t */
    public final C40448ec8 m106888t() {
        return this.f9779i;
    }

    /* renamed from: u */
    public final C40448ec8 m106887u() {
        return this.f9781k;
    }

    /* renamed from: v */
    public final C40448ec8 m106886v() {
        return this.f9780j;
    }
}
