package p000;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.NetworkInfo;
import java.io.IOException;
import p000.C42732iT3;
/* renamed from: PI4 */
/* loaded from: classes6.dex */
public abstract class PI4 {

    /* renamed from: PI4$a */
    /* loaded from: classes6.dex */
    public static final class C6313a {

        /* renamed from: a */
        public final C42732iT3.EnumC23266e f28232a;

        /* renamed from: b */
        public final Bitmap f28233b;

        /* renamed from: c */
        public final AN5 f28234c;

        /* renamed from: d */
        public final int f28235d;

        public C6313a(Bitmap bitmap, C42732iT3.EnumC23266e enumC23266e) {
            this((Bitmap) C32861Fi6.m106708d(bitmap, "bitmap == null"), null, enumC23266e, 0);
        }

        /* renamed from: a */
        public Bitmap m90491a() {
            return this.f28233b;
        }

        /* renamed from: b */
        public int m90490b() {
            return this.f28235d;
        }

        /* renamed from: c */
        public C42732iT3.EnumC23266e m90489c() {
            return this.f28232a;
        }

        /* renamed from: d */
        public AN5 m90488d() {
            return this.f28234c;
        }

        public C6313a(AN5 an5, C42732iT3.EnumC23266e enumC23266e) {
            this(null, (AN5) C32861Fi6.m106708d(an5, "source == null"), enumC23266e, 0);
        }

        public C6313a(Bitmap bitmap, AN5 an5, C42732iT3.EnumC23266e enumC23266e, int i) {
            if ((bitmap != null) != (an5 != null)) {
                this.f28233b = bitmap;
                this.f28234c = an5;
                this.f28232a = (C42732iT3.EnumC23266e) C32861Fi6.m106708d(enumC23266e, "loadedFrom == null");
                this.f28235d = i;
                return;
            }
            throw new AssertionError();
        }
    }

    /* renamed from: a */
    public static void m90498a(int i, int i2, int i3, int i4, BitmapFactory.Options options, C47378qI4 c47378qI4) {
        int min;
        double floor;
        if (i4 <= i2 && i3 <= i) {
            min = 1;
        } else {
            if (i2 == 0) {
                floor = Math.floor(i3 / i);
            } else if (i == 0) {
                floor = Math.floor(i4 / i2);
            } else {
                int floor2 = (int) Math.floor(i4 / i2);
                int floor3 = (int) Math.floor(i3 / i);
                if (c47378qI4.f105067l) {
                    min = Math.max(floor2, floor3);
                } else {
                    min = Math.min(floor2, floor3);
                }
            }
            min = (int) floor;
        }
        options.inSampleSize = min;
        options.inJustDecodeBounds = false;
    }

    /* renamed from: b */
    public static void m90497b(int i, int i2, BitmapFactory.Options options, C47378qI4 c47378qI4) {
        m90498a(i, i2, options.outWidth, options.outHeight, options, c47378qI4);
    }

    /* renamed from: d */
    public static BitmapFactory.Options m90496d(C47378qI4 c47378qI4) {
        boolean z;
        boolean m17648c = c47378qI4.m17648c();
        if (c47378qI4.f105074s != null) {
            z = true;
        } else {
            z = false;
        }
        if (!m17648c && !z && !c47378qI4.f105073r) {
            return null;
        }
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = m17648c;
        boolean z2 = c47378qI4.f105073r;
        options.inInputShareable = z2;
        options.inPurgeable = z2;
        if (z) {
            options.inPreferredConfig = c47378qI4.f105074s;
        }
        return options;
    }

    /* renamed from: g */
    public static boolean m90494g(BitmapFactory.Options options) {
        return options != null && options.inJustDecodeBounds;
    }

    /* renamed from: c */
    public abstract boolean mo11130c(C47378qI4 c47378qI4);

    /* renamed from: e */
    public int mo90495e() {
        return 0;
    }

    /* renamed from: f */
    public abstract C6313a mo11129f(C47378qI4 c47378qI4, int i) throws IOException;

    /* renamed from: h */
    public boolean mo90493h(boolean z, NetworkInfo networkInfo) {
        return false;
    }

    /* renamed from: i */
    public boolean mo90492i() {
        return false;
    }
}
