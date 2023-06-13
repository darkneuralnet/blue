package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import java.util.concurrent.TimeUnit;
/* renamed from: YQ5 */
/* loaded from: classes6.dex */
public final class YQ5 {

    /* renamed from: a */
    public final AbstractC38336b46 f45873a = AbstractC38336b46.m65004b();

    /* renamed from: b */
    public boolean f45874b;

    /* renamed from: c */
    public long f45875c;

    /* renamed from: d */
    public long f45876d;

    /* renamed from: YQ5$a */
    /* loaded from: classes6.dex */
    public static /* synthetic */ class C9773a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f45877a;

        static {
            int[] iArr = new int[TimeUnit.values().length];
            f45877a = iArr;
            try {
                iArr[TimeUnit.NANOSECONDS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f45877a[TimeUnit.MICROSECONDS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f45877a[TimeUnit.MILLISECONDS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f45877a[TimeUnit.SECONDS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f45877a[TimeUnit.MINUTES.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f45877a[TimeUnit.HOURS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f45877a[TimeUnit.DAYS.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* renamed from: a */
    public static String m75083a(TimeUnit timeUnit) {
        switch (C9773a.f45877a[timeUnit.ordinal()]) {
            case 1:
                return "ns";
            case 2:
                return "μs";
            case 3:
                return "ms";
            case 4:
                return "s";
            case 5:
                return "min";
            case 6:
                return "h";
            case 7:
                return DateTokenConverter.CONVERTER_KEY;
            default:
                throw new AssertionError();
        }
    }

    /* renamed from: b */
    public static TimeUnit m75082b(long j) {
        TimeUnit timeUnit = TimeUnit.DAYS;
        TimeUnit timeUnit2 = TimeUnit.NANOSECONDS;
        if (timeUnit.convert(j, timeUnit2) > 0) {
            return timeUnit;
        }
        TimeUnit timeUnit3 = TimeUnit.HOURS;
        if (timeUnit3.convert(j, timeUnit2) > 0) {
            return timeUnit3;
        }
        TimeUnit timeUnit4 = TimeUnit.MINUTES;
        if (timeUnit4.convert(j, timeUnit2) > 0) {
            return timeUnit4;
        }
        TimeUnit timeUnit5 = TimeUnit.SECONDS;
        if (timeUnit5.convert(j, timeUnit2) > 0) {
            return timeUnit5;
        }
        TimeUnit timeUnit6 = TimeUnit.MILLISECONDS;
        if (timeUnit6.convert(j, timeUnit2) > 0) {
            return timeUnit6;
        }
        TimeUnit timeUnit7 = TimeUnit.MICROSECONDS;
        if (timeUnit7.convert(j, timeUnit2) > 0) {
            return timeUnit7;
        }
        return timeUnit2;
    }

    /* renamed from: c */
    public static YQ5 m75081c() {
        return new YQ5().m75077g();
    }

    /* renamed from: d */
    public long m75080d(TimeUnit timeUnit) {
        return timeUnit.convert(m75079e(), TimeUnit.NANOSECONDS);
    }

    /* renamed from: e */
    public final long m75079e() {
        return this.f45874b ? (this.f45873a.mo65003a() - this.f45876d) + this.f45875c : this.f45875c;
    }

    /* renamed from: f */
    public boolean m75078f() {
        return this.f45874b;
    }

    /* renamed from: g */
    public YQ5 m75077g() {
        EZ3.m108794u(!this.f45874b, "This stopwatch is already running.");
        this.f45874b = true;
        this.f45876d = this.f45873a.mo65003a();
        return this;
    }

    /* renamed from: h */
    public YQ5 m75076h() {
        long mo65003a = this.f45873a.mo65003a();
        EZ3.m108794u(this.f45874b, "This stopwatch is already stopped.");
        this.f45874b = false;
        this.f45875c += mo65003a - this.f45876d;
        return this;
    }

    public String toString() {
        long m75079e = m75079e();
        TimeUnit m75082b = m75082b(m75079e);
        String m12280b = C49272tV3.m12280b(m75079e / TimeUnit.NANOSECONDS.convert(1L, m75082b));
        String m75083a = m75083a(m75082b);
        StringBuilder sb = new StringBuilder(String.valueOf(m12280b).length() + 1 + String.valueOf(m75083a).length());
        sb.append(m12280b);
        sb.append(" ");
        sb.append(m75083a);
        return sb.toString();
    }
}
