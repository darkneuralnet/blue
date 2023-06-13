package p000;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.view.LayoutInflater;
/* renamed from: aB0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C37806aB0 extends ContextWrapper {

    /* renamed from: f */
    public static Configuration f50043f;

    /* renamed from: a */
    public int f50044a;

    /* renamed from: b */
    public Resources.Theme f50045b;

    /* renamed from: c */
    public LayoutInflater f50046c;

    /* renamed from: d */
    public Configuration f50047d;

    /* renamed from: e */
    public Resources f50048e;

    /* renamed from: aB0$a */
    /* loaded from: classes.dex */
    public static class C10599a {
        private C10599a() {
        }

        /* renamed from: a */
        public static Context m71797a(C37806aB0 c37806aB0, Configuration configuration) {
            return c37806aB0.createConfigurationContext(configuration);
        }
    }

    public C37806aB0() {
        super(null);
    }

    /* renamed from: e */
    public static boolean m71799e(Configuration configuration) {
        if (configuration == null) {
            return true;
        }
        if (f50043f == null) {
            Configuration configuration2 = new Configuration();
            configuration2.fontScale = 0.0f;
            f50043f = configuration2;
        }
        return configuration.equals(f50043f);
    }

    /* renamed from: a */
    public void m71803a(Configuration configuration) {
        if (this.f50048e == null) {
            if (this.f50047d == null) {
                this.f50047d = new Configuration(configuration);
                return;
            }
            throw new IllegalStateException("Override configuration has already been set");
        }
        throw new IllegalStateException("getResources() or getAssets() has already been called");
    }

    @Override // android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    /* renamed from: b */
    public final Resources m71802b() {
        if (this.f50048e == null) {
            Configuration configuration = this.f50047d;
            if (configuration != null && (Build.VERSION.SDK_INT < 26 || !m71799e(configuration))) {
                this.f50048e = C10599a.m71797a(this, this.f50047d).getResources();
            } else {
                this.f50048e = super.getResources();
            }
        }
        return this.f50048e;
    }

    /* renamed from: c */
    public int m71801c() {
        return this.f50044a;
    }

    /* renamed from: d */
    public final void m71800d() {
        boolean z;
        if (this.f50045b == null) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            this.f50045b = getResources().newTheme();
            Resources.Theme theme = getBaseContext().getTheme();
            if (theme != null) {
                this.f50045b.setTo(theme);
            }
        }
        m71798f(this.f50045b, this.f50044a, z);
    }

    /* renamed from: f */
    public void m71798f(Resources.Theme theme, int i, boolean z) {
        theme.applyStyle(i, true);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public AssetManager getAssets() {
        return getResources().getAssets();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        return m71802b();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Object getSystemService(String str) {
        if ("layout_inflater".equals(str)) {
            if (this.f50046c == null) {
                this.f50046c = LayoutInflater.from(getBaseContext()).cloneInContext(this);
            }
            return this.f50046c;
        }
        return getBaseContext().getSystemService(str);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources.Theme getTheme() {
        Resources.Theme theme = this.f50045b;
        if (theme != null) {
            return theme;
        }
        if (this.f50044a == 0) {
            this.f50044a = C33588Il4.Theme_AppCompat_Light;
        }
        m71800d();
        return this.f50045b;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public void setTheme(int i) {
        if (this.f50044a != i) {
            this.f50044a = i;
            m71800d();
        }
    }

    public C37806aB0(Context context, int i) {
        super(context);
        this.f50044a = i;
    }

    public C37806aB0(Context context, Resources.Theme theme) {
        super(context);
        this.f50045b = theme;
    }
}
