package p000;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.os.Build;
import android.util.Log;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
/* renamed from: rE2  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C47933rE2 implements InterfaceC20044eU {

    /* renamed from: k */
    public static final Bitmap.Config f106735k = Bitmap.Config.ARGB_8888;

    /* renamed from: a */
    public final InterfaceC51489xE2 f106736a;

    /* renamed from: b */
    public final Set<Bitmap.Config> f106737b;

    /* renamed from: c */
    public final long f106738c;

    /* renamed from: d */
    public final InterfaceC27884a f106739d;

    /* renamed from: e */
    public long f106740e;

    /* renamed from: f */
    public long f106741f;

    /* renamed from: g */
    public int f106742g;

    /* renamed from: h */
    public int f106743h;

    /* renamed from: i */
    public int f106744i;

    /* renamed from: j */
    public int f106745j;

    /* renamed from: rE2$a */
    /* loaded from: classes5.dex */
    public interface InterfaceC27884a {
        /* renamed from: a */
        void mo16178a(Bitmap bitmap);

        /* renamed from: b */
        void mo16177b(Bitmap bitmap);
    }

    /* renamed from: rE2$b */
    /* loaded from: classes5.dex */
    public static final class C27885b implements InterfaceC27884a {
        @Override // p000.C47933rE2.InterfaceC27884a
        /* renamed from: a */
        public void mo16178a(Bitmap bitmap) {
        }

        @Override // p000.C47933rE2.InterfaceC27884a
        /* renamed from: b */
        public void mo16177b(Bitmap bitmap) {
        }
    }

    public C47933rE2(long j, InterfaceC51489xE2 interfaceC51489xE2, Set<Bitmap.Config> set) {
        this.f106738c = j;
        this.f106740e = j;
        this.f106736a = interfaceC51489xE2;
        this.f106737b = set;
        this.f106739d = new C27885b();
    }

    @TargetApi(26)
    /* renamed from: f */
    public static void m16190f(Bitmap.Config config) {
        Bitmap.Config config2;
        if (Build.VERSION.SDK_INT < 26) {
            return;
        }
        config2 = Bitmap.Config.HARDWARE;
        if (config != config2) {
            return;
        }
        throw new IllegalArgumentException("Cannot create a mutable Bitmap with config: " + config + ". Consider setting Downsampler#ALLOW_HARDWARE_CONFIG to false in your RequestOptions and/or in GlideBuilder.setDefaultRequestOptions");
    }

    /* renamed from: g */
    public static Bitmap m16189g(int i, int i2, Bitmap.Config config) {
        if (config == null) {
            config = f106735k;
        }
        return Bitmap.createBitmap(i, i2, config);
    }

    @TargetApi(26)
    /* renamed from: k */
    public static Set<Bitmap.Config> m16185k() {
        Bitmap.Config config;
        HashSet hashSet = new HashSet(Arrays.asList(Bitmap.Config.values()));
        int i = Build.VERSION.SDK_INT;
        hashSet.add(null);
        if (i >= 26) {
            config = Bitmap.Config.HARDWARE;
            hashSet.remove(config);
        }
        return Collections.unmodifiableSet(hashSet);
    }

    /* renamed from: l */
    public static InterfaceC51489xE2 m16184l() {
        return new C52651zB5();
    }

    @TargetApi(19)
    /* renamed from: o */
    public static void m16181o(Bitmap bitmap) {
        bitmap.setPremultiplied(true);
    }

    /* renamed from: p */
    public static void m16180p(Bitmap bitmap) {
        bitmap.setHasAlpha(true);
        m16181o(bitmap);
    }

    @Override // p000.InterfaceC20044eU
    @SuppressLint({"InlinedApi"})
    /* renamed from: a */
    public void mo16195a(int i) {
        if (Log.isLoggable("LruBitmapPool", 3)) {
            Log.d("LruBitmapPool", "trimMemory, level=" + i);
        }
        if (i < 40 && i < 20) {
            if (i >= 20 || i == 15) {
                m16179q(m16182n() / 2);
                return;
            }
            return;
        }
        mo16194b();
    }

    @Override // p000.InterfaceC20044eU
    /* renamed from: b */
    public void mo16194b() {
        if (Log.isLoggable("LruBitmapPool", 3)) {
            Log.d("LruBitmapPool", "clearMemory");
        }
        m16179q(0L);
    }

    @Override // p000.InterfaceC20044eU
    /* renamed from: c */
    public synchronized void mo16193c(Bitmap bitmap) {
        try {
            if (bitmap != null) {
                if (!bitmap.isRecycled()) {
                    if (bitmap.isMutable() && this.f106736a.mo1690b(bitmap) <= this.f106740e && this.f106737b.contains(bitmap.getConfig())) {
                        int mo1690b = this.f106736a.mo1690b(bitmap);
                        this.f106736a.mo1689c(bitmap);
                        this.f106739d.mo16178a(bitmap);
                        this.f106744i++;
                        this.f106741f += mo1690b;
                        if (Log.isLoggable("LruBitmapPool", 2)) {
                            Log.v("LruBitmapPool", "Put bitmap in pool=" + this.f106736a.mo1687e(bitmap));
                        }
                        m16188h();
                        m16186j();
                        return;
                    }
                    if (Log.isLoggable("LruBitmapPool", 2)) {
                        Log.v("LruBitmapPool", "Reject bitmap from pool, bitmap: " + this.f106736a.mo1687e(bitmap) + ", is mutable: " + bitmap.isMutable() + ", is allowed config: " + this.f106737b.contains(bitmap.getConfig()));
                    }
                    bitmap.recycle();
                    return;
                }
                throw new IllegalStateException("Cannot pool recycled bitmap");
            }
            throw new NullPointerException("Bitmap must not be null");
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // p000.InterfaceC20044eU
    /* renamed from: d */
    public Bitmap mo16192d(int i, int i2, Bitmap.Config config) {
        Bitmap m16183m = m16183m(i, i2, config);
        if (m16183m != null) {
            m16183m.eraseColor(0);
            return m16183m;
        }
        return m16189g(i, i2, config);
    }

    @Override // p000.InterfaceC20044eU
    /* renamed from: e */
    public Bitmap mo16191e(int i, int i2, Bitmap.Config config) {
        Bitmap m16183m = m16183m(i, i2, config);
        if (m16183m == null) {
            return m16189g(i, i2, config);
        }
        return m16183m;
    }

    /* renamed from: h */
    public final void m16188h() {
        if (Log.isLoggable("LruBitmapPool", 2)) {
            m16187i();
        }
    }

    /* renamed from: i */
    public final void m16187i() {
        Log.v("LruBitmapPool", "Hits=" + this.f106742g + ", misses=" + this.f106743h + ", puts=" + this.f106744i + ", evictions=" + this.f106745j + ", currentSize=" + this.f106741f + ", maxSize=" + this.f106740e + "\nStrategy=" + this.f106736a);
    }

    /* renamed from: j */
    public final void m16186j() {
        m16179q(this.f106740e);
    }

    /* renamed from: m */
    public final synchronized Bitmap m16183m(int i, int i2, Bitmap.Config config) {
        Bitmap.Config config2;
        Bitmap mo1688d;
        m16190f(config);
        InterfaceC51489xE2 interfaceC51489xE2 = this.f106736a;
        if (config != null) {
            config2 = config;
        } else {
            config2 = f106735k;
        }
        mo1688d = interfaceC51489xE2.mo1688d(i, i2, config2);
        if (mo1688d == null) {
            if (Log.isLoggable("LruBitmapPool", 3)) {
                Log.d("LruBitmapPool", "Missing bitmap=" + this.f106736a.mo1691a(i, i2, config));
            }
            this.f106743h++;
        } else {
            this.f106742g++;
            this.f106741f -= this.f106736a.mo1690b(mo1688d);
            this.f106739d.mo16177b(mo1688d);
            m16180p(mo1688d);
        }
        if (Log.isLoggable("LruBitmapPool", 2)) {
            Log.v("LruBitmapPool", "Get bitmap=" + this.f106736a.mo1691a(i, i2, config));
        }
        m16188h();
        return mo1688d;
    }

    /* renamed from: n */
    public long m16182n() {
        return this.f106740e;
    }

    /* renamed from: q */
    public final synchronized void m16179q(long j) {
        while (this.f106741f > j) {
            Bitmap removeLast = this.f106736a.removeLast();
            if (removeLast == null) {
                if (Log.isLoggable("LruBitmapPool", 5)) {
                    Log.w("LruBitmapPool", "Size mismatch, resetting");
                    m16187i();
                }
                this.f106741f = 0L;
                return;
            }
            this.f106739d.mo16177b(removeLast);
            this.f106741f -= this.f106736a.mo1690b(removeLast);
            this.f106745j++;
            if (Log.isLoggable("LruBitmapPool", 3)) {
                Log.d("LruBitmapPool", "Evicting bitmap=" + this.f106736a.mo1687e(removeLast));
            }
            m16188h();
            removeLast.recycle();
        }
    }

    public C47933rE2(long j) {
        this(j, m16184l(), m16185k());
    }
}
