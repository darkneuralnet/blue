package p000;

import android.graphics.Bitmap;
import android.net.Uri;
import ch.qos.logback.core.CoreConstants;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;
import p000.C42732iT3;
/* renamed from: qI4  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C47378qI4 {

    /* renamed from: u */
    public static final long f105055u = TimeUnit.SECONDS.toNanos(5);

    /* renamed from: a */
    public int f105056a;

    /* renamed from: b */
    public long f105057b;

    /* renamed from: c */
    public int f105058c;

    /* renamed from: d */
    public final Uri f105059d;

    /* renamed from: e */
    public final int f105060e;

    /* renamed from: f */
    public final String f105061f;

    /* renamed from: g */
    public final List<InterfaceC47298q96> f105062g;

    /* renamed from: h */
    public final int f105063h;

    /* renamed from: i */
    public final int f105064i;

    /* renamed from: j */
    public final boolean f105065j;

    /* renamed from: k */
    public final int f105066k;

    /* renamed from: l */
    public final boolean f105067l;

    /* renamed from: m */
    public final boolean f105068m;

    /* renamed from: n */
    public final float f105069n;

    /* renamed from: o */
    public final float f105070o;

    /* renamed from: p */
    public final float f105071p;

    /* renamed from: q */
    public final boolean f105072q;

    /* renamed from: r */
    public final boolean f105073r;

    /* renamed from: s */
    public final Bitmap.Config f105074s;

    /* renamed from: t */
    public final C42732iT3.EnumC23267f f105075t;

    /* renamed from: qI4$b */
    /* loaded from: classes6.dex */
    public static final class C27574b {

        /* renamed from: a */
        public Uri f105076a;

        /* renamed from: b */
        public int f105077b;

        /* renamed from: c */
        public String f105078c;

        /* renamed from: d */
        public int f105079d;

        /* renamed from: e */
        public int f105080e;

        /* renamed from: f */
        public boolean f105081f;

        /* renamed from: g */
        public int f105082g;

        /* renamed from: h */
        public boolean f105083h;

        /* renamed from: i */
        public boolean f105084i;

        /* renamed from: j */
        public float f105085j;

        /* renamed from: k */
        public float f105086k;

        /* renamed from: l */
        public float f105087l;

        /* renamed from: m */
        public boolean f105088m;

        /* renamed from: n */
        public boolean f105089n;

        /* renamed from: o */
        public List<InterfaceC47298q96> f105090o;

        /* renamed from: p */
        public Bitmap.Config f105091p;

        /* renamed from: q */
        public C42732iT3.EnumC23267f f105092q;

        public C27574b(Uri uri, int i, Bitmap.Config config) {
            this.f105076a = uri;
            this.f105077b = i;
            this.f105091p = config;
        }

        /* renamed from: a */
        public C47378qI4 m17643a() {
            boolean z = this.f105083h;
            if (z && this.f105081f) {
                throw new IllegalStateException("Center crop and center inside can not be used together.");
            }
            if (this.f105081f && this.f105079d == 0 && this.f105080e == 0) {
                throw new IllegalStateException("Center crop requires calling resize with positive width and height.");
            }
            if (z && this.f105079d == 0 && this.f105080e == 0) {
                throw new IllegalStateException("Center inside requires calling resize with positive width and height.");
            }
            if (this.f105092q == null) {
                this.f105092q = C42732iT3.EnumC23267f.NORMAL;
            }
            return new C47378qI4(this.f105076a, this.f105077b, this.f105078c, this.f105090o, this.f105079d, this.f105080e, this.f105081f, this.f105083h, this.f105082g, this.f105084i, this.f105085j, this.f105086k, this.f105087l, this.f105088m, this.f105089n, this.f105091p, this.f105092q);
        }

        /* renamed from: b */
        public C27574b m17642b(int i) {
            if (!this.f105083h) {
                this.f105081f = true;
                this.f105082g = i;
                return this;
            }
            throw new IllegalStateException("Center crop can not be used after calling centerInside");
        }

        /* renamed from: c */
        public boolean m17641c() {
            return (this.f105076a == null && this.f105077b == 0) ? false : true;
        }

        /* renamed from: d */
        public boolean m17640d() {
            return (this.f105079d == 0 && this.f105080e == 0) ? false : true;
        }

        /* renamed from: e */
        public C27574b m17639e(int i, int i2) {
            if (i >= 0) {
                if (i2 >= 0) {
                    if (i2 == 0 && i == 0) {
                        throw new IllegalArgumentException("At least one dimension has to be positive number.");
                    }
                    this.f105079d = i;
                    this.f105080e = i2;
                    return this;
                }
                throw new IllegalArgumentException("Height must be positive number or 0.");
            }
            throw new IllegalArgumentException("Width must be positive number or 0.");
        }

        /* renamed from: f */
        public C27574b m17638f(InterfaceC47298q96 interfaceC47298q96) {
            if (interfaceC47298q96 != null) {
                if (interfaceC47298q96.key() != null) {
                    if (this.f105090o == null) {
                        this.f105090o = new ArrayList(2);
                    }
                    this.f105090o.add(interfaceC47298q96);
                    return this;
                }
                throw new IllegalArgumentException("Transformation key must not be null.");
            }
            throw new IllegalArgumentException("Transformation must not be null.");
        }
    }

    /* renamed from: a */
    public String m17650a() {
        Uri uri = this.f105059d;
        if (uri != null) {
            return String.valueOf(uri.getPath());
        }
        return Integer.toHexString(this.f105060e);
    }

    /* renamed from: b */
    public boolean m17649b() {
        return this.f105062g != null;
    }

    /* renamed from: c */
    public boolean m17648c() {
        return (this.f105063h == 0 && this.f105064i == 0) ? false : true;
    }

    /* renamed from: d */
    public String m17647d() {
        long nanoTime = System.nanoTime() - this.f105057b;
        if (nanoTime > f105055u) {
            return m17644g() + '+' + TimeUnit.NANOSECONDS.toSeconds(nanoTime) + 's';
        }
        return m17644g() + '+' + TimeUnit.NANOSECONDS.toMillis(nanoTime) + "ms";
    }

    /* renamed from: e */
    public boolean m17646e() {
        return m17648c() || this.f105069n != 0.0f;
    }

    /* renamed from: f */
    public boolean m17645f() {
        return m17646e() || m17649b();
    }

    /* renamed from: g */
    public String m17644g() {
        return "[R" + this.f105056a + ']';
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Request{");
        int i = this.f105060e;
        if (i > 0) {
            sb.append(i);
        } else {
            sb.append(this.f105059d);
        }
        List<InterfaceC47298q96> list = this.f105062g;
        if (list != null && !list.isEmpty()) {
            for (InterfaceC47298q96 interfaceC47298q96 : this.f105062g) {
                sb.append(' ');
                sb.append(interfaceC47298q96.key());
            }
        }
        if (this.f105061f != null) {
            sb.append(" stableKey(");
            sb.append(this.f105061f);
            sb.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
        }
        if (this.f105063h > 0) {
            sb.append(" resize(");
            sb.append(this.f105063h);
            sb.append(CoreConstants.COMMA_CHAR);
            sb.append(this.f105064i);
            sb.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
        }
        if (this.f105065j) {
            sb.append(" centerCrop");
        }
        if (this.f105067l) {
            sb.append(" centerInside");
        }
        if (this.f105069n != 0.0f) {
            sb.append(" rotation(");
            sb.append(this.f105069n);
            if (this.f105072q) {
                sb.append(" @ ");
                sb.append(this.f105070o);
                sb.append(CoreConstants.COMMA_CHAR);
                sb.append(this.f105071p);
            }
            sb.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
        }
        if (this.f105073r) {
            sb.append(" purgeable");
        }
        if (this.f105074s != null) {
            sb.append(' ');
            sb.append(this.f105074s);
        }
        sb.append(CoreConstants.CURLY_RIGHT);
        return sb.toString();
    }

    public C47378qI4(Uri uri, int i, String str, List<InterfaceC47298q96> list, int i2, int i3, boolean z, boolean z2, int i4, boolean z3, float f, float f2, float f3, boolean z4, boolean z5, Bitmap.Config config, C42732iT3.EnumC23267f enumC23267f) {
        this.f105059d = uri;
        this.f105060e = i;
        this.f105061f = str;
        if (list == null) {
            this.f105062g = null;
        } else {
            this.f105062g = Collections.unmodifiableList(list);
        }
        this.f105063h = i2;
        this.f105064i = i3;
        this.f105065j = z;
        this.f105067l = z2;
        this.f105066k = i4;
        this.f105068m = z3;
        this.f105069n = f;
        this.f105070o = f2;
        this.f105071p = f3;
        this.f105072q = z4;
        this.f105073r = z5;
        this.f105074s = config;
        this.f105075t = enumC23267f;
    }
}
