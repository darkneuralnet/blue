package p000;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.CancellationSignal;
import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.util.concurrent.ConcurrentHashMap;
import p000.C32514Dw1;
import p000.C34386Lw1;
/* renamed from: uc6  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C49933uc6 {
    @SuppressLint({"BanConcurrentHashMap"})

    /* renamed from: a */
    public ConcurrentHashMap<Long, C32514Dw1.C1671c> f112668a = new ConcurrentHashMap<>();

    /* renamed from: uc6$a */
    /* loaded from: classes.dex */
    public class C29269a implements InterfaceC29271c<C34386Lw1.C5132b> {
        public C29269a() {
        }

        @Override // p000.C49933uc6.InterfaceC29271c
        /* renamed from: c */
        public int mo9948a(C34386Lw1.C5132b c5132b) {
            return c5132b.m96107e();
        }

        @Override // p000.C49933uc6.InterfaceC29271c
        /* renamed from: d */
        public boolean mo9947b(C34386Lw1.C5132b c5132b) {
            return c5132b.m96106f();
        }
    }

    /* renamed from: uc6$b */
    /* loaded from: classes.dex */
    public class C29270b implements InterfaceC29271c<C32514Dw1.C1672d> {
        public C29270b() {
        }

        @Override // p000.C49933uc6.InterfaceC29271c
        /* renamed from: c */
        public int mo9948a(C32514Dw1.C1672d c1672d) {
            return c1672d.m109605e();
        }

        @Override // p000.C49933uc6.InterfaceC29271c
        /* renamed from: d */
        public boolean mo9947b(C32514Dw1.C1672d c1672d) {
            return c1672d.m109604f();
        }
    }

    /* renamed from: uc6$c */
    /* loaded from: classes.dex */
    public interface InterfaceC29271c<T> {
        /* renamed from: a */
        int mo9948a(T t);

        /* renamed from: b */
        boolean mo9947b(T t);
    }

    /* renamed from: g */
    public static <T> T m9956g(T[] tArr, int i, InterfaceC29271c<T> interfaceC29271c) {
        return (T) m9955h(tArr, (i & 1) == 0 ? 400 : 700, (i & 2) != 0, interfaceC29271c);
    }

    /* renamed from: h */
    public static <T> T m9955h(T[] tArr, int i, boolean z, InterfaceC29271c<T> interfaceC29271c) {
        int i2;
        T t = null;
        int i3 = Integer.MAX_VALUE;
        for (T t2 : tArr) {
            int abs = Math.abs(interfaceC29271c.mo9948a(t2) - i) * 2;
            if (interfaceC29271c.mo9947b(t2) == z) {
                i2 = 0;
            } else {
                i2 = 1;
            }
            int i4 = abs + i2;
            if (t == null || i3 > i4) {
                t = t2;
                i3 = i4;
            }
        }
        return t;
    }

    /* renamed from: j */
    public static long m9953j(Typeface typeface) {
        if (typeface == null) {
            return 0L;
        }
        try {
            Field declaredField = Typeface.class.getDeclaredField("native_instance");
            declaredField.setAccessible(true);
            return ((Number) declaredField.get(typeface)).longValue();
        } catch (IllegalAccessException e) {
            Log.e("TypefaceCompatBaseImpl", "Could not retrieve font from family.", e);
            return 0L;
        } catch (NoSuchFieldException e2) {
            Log.e("TypefaceCompatBaseImpl", "Could not retrieve font from family.", e2);
            return 0L;
        }
    }

    /* renamed from: a */
    public final void m9962a(Typeface typeface, C32514Dw1.C1671c c1671c) {
        long m9953j = m9953j(typeface);
        if (m9953j != 0) {
            this.f112668a.put(Long.valueOf(m9953j), c1671c);
        }
    }

    /* renamed from: b */
    public Typeface mo9961b(Context context, C32514Dw1.C1671c c1671c, Resources resources, int i) {
        C32514Dw1.C1672d m9957f = m9957f(c1671c, i);
        if (m9957f == null) {
            return null;
        }
        Typeface m100126d = C33734Jb6.m100126d(context, resources, m9957f.m109608b(), m9957f.m109609a(), 0, i);
        m9962a(m100126d, c1671c);
        return m100126d;
    }

    /* renamed from: c */
    public Typeface mo9960c(Context context, CancellationSignal cancellationSignal, C34386Lw1.C5132b[] c5132bArr, int i) {
        InputStream inputStream;
        InputStream inputStream2 = null;
        if (c5132bArr.length < 1) {
            return null;
        }
        try {
            inputStream = context.getContentResolver().openInputStream(mo9954i(c5132bArr, i).m96108d());
        } catch (IOException unused) {
            inputStream = null;
        } catch (Throwable th) {
            th = th;
        }
        try {
            Typeface mo9959d = mo9959d(context, inputStream);
            C50525vc6.m8373a(inputStream);
            return mo9959d;
        } catch (IOException unused2) {
            C50525vc6.m8373a(inputStream);
            return null;
        } catch (Throwable th2) {
            th = th2;
            inputStream2 = inputStream;
            C50525vc6.m8373a(inputStream2);
            throw th;
        }
    }

    /* renamed from: d */
    public Typeface mo9959d(Context context, InputStream inputStream) {
        File m8369e = C50525vc6.m8369e(context);
        if (m8369e == null) {
            return null;
        }
        try {
            if (!C50525vc6.m8370d(m8369e, inputStream)) {
                return null;
            }
            return Typeface.createFromFile(m8369e.getPath());
        } catch (RuntimeException unused) {
            return null;
        } finally {
            m8369e.delete();
        }
    }

    /* renamed from: e */
    public Typeface mo9958e(Context context, Resources resources, int i, String str, int i2) {
        File m8369e = C50525vc6.m8369e(context);
        if (m8369e == null) {
            return null;
        }
        try {
            if (!C50525vc6.m8371c(m8369e, resources, i)) {
                return null;
            }
            return Typeface.createFromFile(m8369e.getPath());
        } catch (RuntimeException unused) {
            return null;
        } finally {
            m8369e.delete();
        }
    }

    /* renamed from: f */
    public final C32514Dw1.C1672d m9957f(C32514Dw1.C1671c c1671c, int i) {
        return (C32514Dw1.C1672d) m9956g(c1671c.m109610a(), i, new C29270b());
    }

    /* renamed from: i */
    public C34386Lw1.C5132b mo9954i(C34386Lw1.C5132b[] c5132bArr, int i) {
        return (C34386Lw1.C5132b) m9956g(c5132bArr, i, new C29269a());
    }
}
