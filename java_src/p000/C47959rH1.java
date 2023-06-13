package p000;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.util.Log;
import ch.qos.logback.classic.Level;
import java.io.File;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;
/* renamed from: rH1  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C47959rH1 {

    /* renamed from: g */
    public static final boolean f106801g;

    /* renamed from: h */
    public static final boolean f106802h;

    /* renamed from: i */
    public static final File f106803i;

    /* renamed from: j */
    public static volatile C47959rH1 f106804j;

    /* renamed from: k */
    public static volatile int f106805k;

    /* renamed from: b */
    public final int f106807b;

    /* renamed from: c */
    public final int f106808c;

    /* renamed from: d */
    public int f106809d;

    /* renamed from: e */
    public boolean f106810e = true;

    /* renamed from: f */
    public final AtomicBoolean f106811f = new AtomicBoolean(false);

    /* renamed from: a */
    public final boolean f106806a = m16129f();

    static {
        boolean z;
        int i = Build.VERSION.SDK_INT;
        boolean z2 = true;
        if (i < 29) {
            z = true;
        } else {
            z = false;
        }
        f106801g = z;
        if (i < 26) {
            z2 = false;
        }
        f106802h = z2;
        f106803i = new File("/proc/self/fd");
        f106805k = -1;
    }

    public C47959rH1() {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f106807b = Level.INFO_INT;
            this.f106808c = 0;
            return;
        }
        this.f106807b = 700;
        this.f106808c = 128;
    }

    /* renamed from: b */
    public static C47959rH1 m16133b() {
        if (f106804j == null) {
            synchronized (C47959rH1.class) {
                if (f106804j == null) {
                    f106804j = new C47959rH1();
                }
            }
        }
        return f106804j;
    }

    /* renamed from: f */
    public static boolean m16129f() {
        return (m16128g() || m16127h()) ? false : true;
    }

    /* renamed from: g */
    public static boolean m16128g() {
        if (Build.VERSION.SDK_INT != 26) {
            return false;
        }
        for (String str : Arrays.asList("SC-04J", "SM-N935", "SM-J720", "SM-G570F", "SM-G570M", "SM-G960", "SM-G965", "SM-G935", "SM-G930", "SM-A520", "SM-A720F", "moto e5", "moto e5 play", "moto e5 plus", "moto e5 cruise", "moto g(6) forge", "moto g(6) play")) {
            if (Build.MODEL.startsWith(str)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: h */
    public static boolean m16127h() {
        if (Build.VERSION.SDK_INT != 27) {
            return false;
        }
        return Arrays.asList("LG-M250", "LG-M320", "LG-Q710AL", "LG-Q710PL", "LGM-K121K", "LGM-K121L", "LGM-K121S", "LGM-X320K", "LGM-X320L", "LGM-X320S", "LGM-X401L", "LGM-X401S", "LM-Q610.FG", "LM-Q610.FGN", "LM-Q617.FG", "LM-Q617.FGN", "LM-Q710.FG", "LM-Q710.FGN", "LM-X220PM", "LM-X220QMA", "LM-X410PM").contains(Build.MODEL);
    }

    /* renamed from: a */
    public final boolean m16134a() {
        if (f106801g && !this.f106811f.get()) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public final int m16132c() {
        if (f106805k != -1) {
            return f106805k;
        }
        return this.f106807b;
    }

    /* renamed from: d */
    public final synchronized boolean m16131d() {
        boolean z = true;
        int i = this.f106809d + 1;
        this.f106809d = i;
        if (i >= 50) {
            this.f106809d = 0;
            int length = f106803i.list().length;
            long m16132c = m16132c();
            if (length >= m16132c) {
                z = false;
            }
            this.f106810e = z;
            if (!z && Log.isLoggable("Downsampler", 5)) {
                Log.w("Downsampler", "Excluding HARDWARE bitmap config because we're over the file descriptor limit, file descriptors " + length + ", limit " + m16132c);
            }
        }
        return this.f106810e;
    }

    /* renamed from: e */
    public boolean m16130e(int i, int i2, boolean z, boolean z2) {
        if (!z) {
            if (Log.isLoggable("HardwareConfig", 2)) {
                Log.v("HardwareConfig", "Hardware config disallowed by caller");
            }
            return false;
        } else if (!this.f106806a) {
            if (Log.isLoggable("HardwareConfig", 2)) {
                Log.v("HardwareConfig", "Hardware config disallowed by device model");
            }
            return false;
        } else if (!f106802h) {
            if (Log.isLoggable("HardwareConfig", 2)) {
                Log.v("HardwareConfig", "Hardware config disallowed by sdk");
            }
            return false;
        } else if (m16134a()) {
            if (Log.isLoggable("HardwareConfig", 2)) {
                Log.v("HardwareConfig", "Hardware config disallowed by app state");
            }
            return false;
        } else if (z2) {
            if (Log.isLoggable("HardwareConfig", 2)) {
                Log.v("HardwareConfig", "Hardware config disallowed because exif orientation is required");
            }
            return false;
        } else {
            int i3 = this.f106808c;
            if (i < i3) {
                if (Log.isLoggable("HardwareConfig", 2)) {
                    Log.v("HardwareConfig", "Hardware config disallowed because width is too small");
                }
                return false;
            } else if (i2 < i3) {
                if (Log.isLoggable("HardwareConfig", 2)) {
                    Log.v("HardwareConfig", "Hardware config disallowed because height is too small");
                }
                return false;
            } else if (!m16131d()) {
                if (Log.isLoggable("HardwareConfig", 2)) {
                    Log.v("HardwareConfig", "Hardware config disallowed because there are insufficient FDs");
                }
                return false;
            } else {
                return true;
            }
        }
    }

    @TargetApi(26)
    /* renamed from: i */
    public boolean m16126i(int i, int i2, BitmapFactory.Options options, boolean z, boolean z2) {
        Bitmap.Config config;
        boolean m16130e = m16130e(i, i2, z, z2);
        if (m16130e) {
            config = Bitmap.Config.HARDWARE;
            options.inPreferredConfig = config;
            options.inMutable = false;
        }
        return m16130e;
    }
}
