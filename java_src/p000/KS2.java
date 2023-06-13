package p000;

import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;
import co.bird.android.core.mvp.BaseActivity;
import com.guness.widget.NavigationView;
/* renamed from: KS2 */
/* loaded from: classes3.dex */
public final class KS2 implements InterfaceC48812sj1<JS2> {

    /* renamed from: a */
    public final Y94<BaseActivity> f19627a;

    /* renamed from: b */
    public final Y94<DrawerLayout> f19628b;

    /* renamed from: c */
    public final Y94<Toolbar> f19629c;

    /* renamed from: d */
    public final Y94<NavigationView> f19630d;

    /* renamed from: e */
    public final Y94<C22454gl> f19631e;

    /* renamed from: f */
    public final Y94<C36207Tq4> f19632f;

    public KS2(Y94<BaseActivity> y94, Y94<DrawerLayout> y942, Y94<Toolbar> y943, Y94<NavigationView> y944, Y94<C22454gl> y945, Y94<C36207Tq4> y946) {
        this.f19627a = y94;
        this.f19628b = y942;
        this.f19629c = y943;
        this.f19630d = y944;
        this.f19631e = y945;
        this.f19632f = y946;
    }

    /* renamed from: a */
    public static KS2 m98867a(Y94<BaseActivity> y94, Y94<DrawerLayout> y942, Y94<Toolbar> y943, Y94<NavigationView> y944, Y94<C22454gl> y945, Y94<C36207Tq4> y946) {
        return new KS2(y94, y942, y943, y944, y945, y946);
    }

    /* renamed from: c */
    public static JS2 m98865c(BaseActivity baseActivity, DrawerLayout drawerLayout, Toolbar toolbar, NavigationView navigationView, C22454gl c22454gl, C36207Tq4 c36207Tq4) {
        return new JS2(baseActivity, drawerLayout, toolbar, navigationView, c22454gl, c36207Tq4);
    }

    @Override // p000.Y94
    /* renamed from: b */
    public JS2 get() {
        return m98865c(this.f19627a.get(), this.f19628b.get(), this.f19629c.get(), this.f19630d.get(), this.f19631e.get(), this.f19632f.get());
    }
}
