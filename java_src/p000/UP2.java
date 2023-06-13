package p000;

import android.annotation.TargetApi;
import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.text.format.Formatter;
import android.util.DisplayMetrics;
import android.util.Log;
/* renamed from: UP2 */
/* loaded from: classes5.dex */
public final class UP2 {

    /* renamed from: a */
    public final int f37338a;

    /* renamed from: b */
    public final int f37339b;

    /* renamed from: c */
    public final Context f37340c;

    /* renamed from: d */
    public final int f37341d;

    /* renamed from: UP2$a */
    /* loaded from: classes5.dex */
    public static final class C8276a {

        /* renamed from: i */
        public static final int f37342i;

        /* renamed from: a */
        public final Context f37343a;

        /* renamed from: b */
        public ActivityManager f37344b;

        /* renamed from: c */
        public InterfaceC8278c f37345c;

        /* renamed from: e */
        public float f37347e;

        /* renamed from: d */
        public float f37346d = 2.0f;

        /* renamed from: f */
        public float f37348f = 0.4f;

        /* renamed from: g */
        public float f37349g = 0.33f;

        /* renamed from: h */
        public int f37350h = 4194304;

        static {
            f37342i = Build.VERSION.SDK_INT < 26 ? 4 : 1;
        }

        public C8276a(Context context) {
            this.f37347e = f37342i;
            this.f37343a = context;
            this.f37344b = (ActivityManager) context.getSystemService("activity");
            this.f37345c = new C8277b(context.getResources().getDisplayMetrics());
            if (Build.VERSION.SDK_INT >= 26 && UP2.m81558e(this.f37344b)) {
                this.f37347e = 0.0f;
            }
        }

        /* renamed from: a */
        public UP2 m81556a() {
            return new UP2(this);
        }
    }

    /* renamed from: UP2$b */
    /* loaded from: classes5.dex */
    public static final class C8277b implements InterfaceC8278c {

        /* renamed from: a */
        public final DisplayMetrics f37351a;

        public C8277b(DisplayMetrics displayMetrics) {
            this.f37351a = displayMetrics;
        }

        @Override // p000.UP2.InterfaceC8278c
        /* renamed from: a */
        public int mo81555a() {
            return this.f37351a.heightPixels;
        }

        @Override // p000.UP2.InterfaceC8278c
        /* renamed from: b */
        public int mo81554b() {
            return this.f37351a.widthPixels;
        }
    }

    /* renamed from: UP2$c */
    /* loaded from: classes5.dex */
    public interface InterfaceC8278c {
        /* renamed from: a */
        int mo81555a();

        /* renamed from: b */
        int mo81554b();
    }

    public UP2(C8276a c8276a) {
        int i;
        boolean z;
        this.f37340c = c8276a.f37343a;
        if (m81558e(c8276a.f37344b)) {
            i = c8276a.f37350h / 2;
        } else {
            i = c8276a.f37350h;
        }
        this.f37341d = i;
        int m81560c = m81560c(c8276a.f37344b, c8276a.f37348f, c8276a.f37349g);
        float mo81554b = c8276a.f37345c.mo81554b() * c8276a.f37345c.mo81555a() * 4;
        int round = Math.round(c8276a.f37347e * mo81554b);
        int round2 = Math.round(mo81554b * c8276a.f37346d);
        int i2 = m81560c - i;
        int i3 = round2 + round;
        if (i3 <= i2) {
            this.f37339b = round2;
            this.f37338a = round;
        } else {
            float f = i2;
            float f2 = c8276a.f37347e;
            float f3 = c8276a.f37346d;
            float f4 = f / (f2 + f3);
            this.f37339b = Math.round(f3 * f4);
            this.f37338a = Math.round(f4 * c8276a.f37347e);
        }
        if (Log.isLoggable("MemorySizeCalculator", 3)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Calculation complete, Calculated memory cache size: ");
            sb.append(m81557f(this.f37339b));
            sb.append(", pool size: ");
            sb.append(m81557f(this.f37338a));
            sb.append(", byte array size: ");
            sb.append(m81557f(i));
            sb.append(", memory class limited? ");
            if (i3 > m81560c) {
                z = true;
            } else {
                z = false;
            }
            sb.append(z);
            sb.append(", max size: ");
            sb.append(m81557f(m81560c));
            sb.append(", memoryClass: ");
            sb.append(c8276a.f37344b.getMemoryClass());
            sb.append(", isLowMemoryDevice: ");
            sb.append(m81558e(c8276a.f37344b));
            Log.d("MemorySizeCalculator", sb.toString());
        }
    }

    /* renamed from: c */
    public static int m81560c(ActivityManager activityManager, float f, float f2) {
        boolean m81558e = m81558e(activityManager);
        float memoryClass = activityManager.getMemoryClass() * 1024 * 1024;
        if (m81558e) {
            f = f2;
        }
        return Math.round(memoryClass * f);
    }

    @TargetApi(19)
    /* renamed from: e */
    public static boolean m81558e(ActivityManager activityManager) {
        return activityManager.isLowRamDevice();
    }

    /* renamed from: a */
    public int m81562a() {
        return this.f37341d;
    }

    /* renamed from: b */
    public int m81561b() {
        return this.f37338a;
    }

    /* renamed from: d */
    public int m81559d() {
        return this.f37339b;
    }

    /* renamed from: f */
    public final String m81557f(int i) {
        return Formatter.formatFileSize(this.f37340c, i);
    }
}
