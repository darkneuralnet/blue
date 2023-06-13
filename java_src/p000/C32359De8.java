package p000;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import androidx.lifecycle.AbstractC11719f;
import androidx.lifecycle.C11729j;
/* renamed from: De8  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32359De8 implements LifecycleOwner {

    /* renamed from: j */
    public static final C32359De8 f6132j = new C32359De8();

    /* renamed from: f */
    public Handler f6137f;

    /* renamed from: b */
    public int f6133b = 0;

    /* renamed from: c */
    public int f6134c = 0;

    /* renamed from: d */
    public boolean f6135d = true;

    /* renamed from: e */
    public boolean f6136e = true;

    /* renamed from: g */
    public final C11729j f6138g = new C11729j(this);

    /* renamed from: h */
    public final Runnable f6139h = new RunnableC47920rC7(this);

    /* renamed from: i */
    public final C40337eQ7 f6140i = new C40337eQ7(this);

    private C32359De8() {
    }

    /* renamed from: a */
    public static LifecycleOwner m110069a() {
        return f6132j;
    }

    /* renamed from: h */
    public static void m110062h(Context context) {
        C32359De8 c32359De8 = f6132j;
        c32359De8.f6137f = new Handler();
        c32359De8.f6138g.m67001i(AbstractC11719f.EnumC11720a.ON_CREATE);
        ((Application) context.getApplicationContext()).registerActivityLifecycleCallbacks(new C51419x68(c32359De8));
    }

    /* renamed from: b */
    public final void m110068b() {
        int i = this.f6134c - 1;
        this.f6134c = i;
        if (i == 0) {
            this.f6137f.postDelayed(this.f6139h, 0L);
        }
    }

    /* renamed from: c */
    public final void m110067c() {
        int i = this.f6134c + 1;
        this.f6134c = i;
        if (i == 1) {
            if (this.f6135d) {
                this.f6138g.m67001i(AbstractC11719f.EnumC11720a.ON_RESUME);
                this.f6135d = false;
                return;
            }
            this.f6137f.removeCallbacks(this.f6139h);
        }
    }

    /* renamed from: d */
    public final void m110066d() {
        int i = this.f6133b + 1;
        this.f6133b = i;
        if (i == 1 && this.f6136e) {
            this.f6138g.m67001i(AbstractC11719f.EnumC11720a.ON_START);
            this.f6136e = false;
        }
    }

    /* renamed from: e */
    public final void m110065e() {
        this.f6133b--;
        m110063g();
    }

    /* renamed from: f */
    public final void m110064f() {
        if (this.f6134c == 0) {
            this.f6135d = true;
            this.f6138g.m67001i(AbstractC11719f.EnumC11720a.ON_PAUSE);
        }
    }

    /* renamed from: g */
    public final void m110063g() {
        if (this.f6133b == 0 && this.f6135d) {
            this.f6138g.m67001i(AbstractC11719f.EnumC11720a.ON_STOP);
            this.f6136e = true;
        }
    }

    @Override // p000.LifecycleOwner
    public final AbstractC11719f getLifecycle() {
        return this.f6138g;
    }
}
