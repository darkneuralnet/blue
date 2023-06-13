package p000;

import android.view.MenuItem;
import android.view.View;
import android.widget.CompoundButton;
import androidx.appcompat.app.C10990a;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;
import co.bird.android.core.mvp.BaseActivity;
import co.bird.android.model.constant.ScanIntention;
import co.bird.android.model.constant.ScanMode;
import co.bird.android.model.wire.WireBird;
import com.facebook.share.internal.C17296a;
import com.google.android.material.navigation.NavigationView;
import io.reactivex.AbstractC23442F;
import io.reactivex.Observable;
import io.reactivex.subjects.C24558d;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
@Metadata(m28433d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b)\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B1\b\u0007\u0012\u0006\u0010[\u001a\u00020Z\u0012\u0006\u0010]\u001a\u00020\\\u0012\u0006\u0010F\u001a\u00020C\u0012\u0006\u0010L\u001a\u00020G\u0012\u0006\u0010R\u001a\u00020M¢\u0006\u0004\b^\u0010_J\u001c\u0010\b\u001a\u00020\u00072\b\b\u0001\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0005H\u0002J\u000e\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0016J\u000e\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\tH\u0016J\u0010\u0010\u000e\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0005H\u0016J\u0010\u0010\u000f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0005H\u0016J\u0010\u0010\u0010\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0005H\u0016J\u0010\u0010\u0011\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0005H\u0016J\u0010\u0010\u0012\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0005H\u0016J\u0010\u0010\u0013\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0005H\u0016J\u0010\u0010\u0014\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0005H\u0016J\u0010\u0010\u0015\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0005H\u0016J\u0010\u0010\u0016\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0005H\u0016J\u0010\u0010\u0017\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0005H\u0016J\u0010\u0010\u0018\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0005H\u0016J\u0010\u0010\u0019\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0005H\u0016J\u0010\u0010\u001a\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0005H\u0016J\u0010\u0010\u001b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0005H\u0016J\u0010\u0010\u001c\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0005H\u0016J!\u0010\u001f\u001a\u00020\u00072\u0006\u0010\u001d\u001a\u00020\u00032\b\u0010\u001e\u001a\u0004\u0018\u00010\u0003H\u0016¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0005H\u0016J\u0010\u0010\"\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0005H\u0016J\u0010\u0010#\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0005H\u0016J\u0010\u0010$\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0005H\u0016J\u0010\u0010%\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0005H\u0016J\u0010\u0010&\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0005H\u0016J\u0010\u0010'\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0005H\u0016J\u0010\u0010(\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0005H\u0016J\u0010\u0010)\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0005H\u0016J\u0010\u0010*\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0005H\u0016J\u0010\u0010+\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0005H\u0016J\u0010\u0010,\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0005H\u0016J\u0010\u0010-\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0005H\u0016J\u0010\u0010.\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0005H\u0016J\u0010\u0010/\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0005H\u0016J\u0010\u00100\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0005H\u0016J\u0010\u00101\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0005H\u0016J\u0010\u00102\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0005H\u0016J\u0010\u00103\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0005H\u0016J9\u0010<\u001a\b\u0012\u0004\u0012\u00020;0:2\u0006\u00105\u001a\u0002042\b\u00107\u001a\u0004\u0018\u0001062\b\u00108\u001a\u0004\u0018\u00010\u00032\u0006\u00109\u001a\u00020\u0005H\u0016¢\u0006\u0004\b<\u0010=J\u0010\u0010>\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0005H\u0016J\u0010\u0010?\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0005H\u0016J\u0010\u0010@\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0005H\u0016J\u0010\u0010A\u001a\u00020\u00072\u0006\u0010\u001d\u001a\u00020\u0003H\u0016J\u0010\u0010B\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0005H\u0016R\u0014\u0010F\u001a\u00020C8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010ER\u0017\u0010L\u001a\u00020G8\u0006¢\u0006\f\n\u0004\bH\u0010I\u001a\u0004\bJ\u0010KR\u0017\u0010R\u001a\u00020M8\u0006¢\u0006\f\n\u0004\bN\u0010O\u001a\u0004\bP\u0010QR\"\u0010W\u001a\u0010\u0012\f\u0012\n T*\u0004\u0018\u00010\n0\n0S8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bU\u0010VR\"\u0010Y\u001a\u0010\u0012\f\u0012\n T*\u0004\u0018\u00010\u00050\u00050S8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bX\u0010V¨\u0006`"}, m28432d2 = {"LIq3;", "LQB;", "LM03;", "", "id", "", "show", "", "cm", "Lio/reactivex/Observable;", "Landroid/view/MenuItem;", "Oe", "B8", "visible", "f0", "t9", "gj", "D1", "qf", "Qf", "ka", "lg", "Nf", "X7", "Va", "g5", "M7", "R4", "Ud", "count", "taskLimit", "Ti", "(ILjava/lang/Integer;)V", "L4", "k4", "Zh", "mf", C9107Wc.f41393c, "V6", "Sg", "Ya", "Hi", "y9", "G3", "Bj", "s5", "Md", "X8", "ob", "fj", "fk", "wl", "Lco/bird/android/model/constant/ScanMode;", "mode", "Lco/bird/android/model/constant/ScanIntention;", "intention", "instructionsStringRes", "showCodeInput", "Lio/reactivex/F;", "Lco/bird/android/model/wire/WireBird;", "Q7", "(Lco/bird/android/model/constant/ScanMode;Lco/bird/android/model/constant/ScanIntention;Ljava/lang/Integer;Z)Lio/reactivex/F;", "ch", "Wh", "O5", "jh", "Yb", "Ly4;", "q", "Ly4;", "binding", "Lgl;", "r", "Lgl;", "getPreference", "()Lgl;", "preference", "LTq4;", "s", "LTq4;", "getReactiveConfig", "()LTq4;", "reactiveConfig", "Lio/reactivex/subjects/d;", "kotlin.jvm.PlatformType", "t", "Lio/reactivex/subjects/d;", "itemSelectedSubject", "u", "roleSwitchSubject", "Lco/bird/android/core/mvp/BaseActivity;", "activity", "Landroidx/appcompat/widget/Toolbar;", "toolbar", "<init>", "(Lco/bird/android/core/mvp/BaseActivity;Landroidx/appcompat/widget/Toolbar;Ly4;Lgl;LTq4;)V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: Iq3  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C33632Iq3 extends AbstractC6705QB implements M03 {

    /* renamed from: q */
    public final C30411y4 f16300q;

    /* renamed from: r */
    public final C22454gl f16301r;

    /* renamed from: s */
    public final C36207Tq4 f16302s;

    /* renamed from: t */
    public final C24558d<MenuItem> f16303t;

    /* renamed from: u */
    public final C24558d<Boolean> f16304u;

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Landroid/widget/CompoundButton;", "<anonymous parameter 0>", "", "isChecked", "", C17296a.f69688o, "(Landroid/widget/CompoundButton;Z)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Iq3$a */
    /* loaded from: classes2.dex */
    public static final class C3781a extends Lambda implements Function2<CompoundButton, Boolean, Unit> {
        public C3781a() {
            super(2);
        }

        /* renamed from: a */
        public final void m101605a(CompoundButton compoundButton, boolean z) {
            C33632Iq3.this.f16304u.onNext(Boolean.valueOf(z));
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(CompoundButton compoundButton, Boolean bool) {
            m101605a(compoundButton, bool.booleanValue());
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C33632Iq3(BaseActivity activity, Toolbar toolbar, C30411y4 binding, C22454gl preference, C36207Tq4 reactiveConfig) {
        super(activity, r3, r4, preference, reactiveConfig);
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(preference, "preference");
        Intrinsics.checkNotNullParameter(reactiveConfig, "reactiveConfig");
        DrawerLayout drawerLayout = binding.f118679e;
        Intrinsics.checkNotNullExpressionValue(drawerLayout, "binding.drawer");
        NavigationView navigationView = binding.f118682h;
        Intrinsics.checkNotNullExpressionValue(navigationView, "binding.navigationView");
        this.f16300q = binding;
        this.f16301r = preference;
        this.f16302s = reactiveConfig;
        C24558d<MenuItem> m31902e = C24558d.m31902e();
        Intrinsics.checkNotNullExpressionValue(m31902e, "create<MenuItem>()");
        this.f16303t = m31902e;
        C24558d<Boolean> m31902e2 = C24558d.m31902e();
        Intrinsics.checkNotNullExpressionValue(m31902e2, "create<Boolean>()");
        this.f16304u = m31902e2;
        C10990a c10990a = new C10990a(activity, binding.f118679e, toolbar, C45871nl4.navigation_drawer_open, C45871nl4.navigation_drawer_close);
        c10990a.m70317h(false);
        c10990a.m70316i(C48193rg4.ic_menu);
        c10990a.m70313l(new View.OnClickListener() { // from class: Gq3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C33632Iq3.m101608am(C33632Iq3.this, view);
            }
        });
        binding.f118679e.m67591a(c10990a);
        c10990a.m70312m();
        m88799Tl().setChecked(true);
        m88799Tl().setVisibility(0);
        binding.f118682h.setNavigationItemSelectedListener(new NavigationView.InterfaceC17850c() { // from class: Hq3
            @Override // com.google.android.material.navigation.NavigationView.InterfaceC17850c
            /* renamed from: b */
            public final boolean mo49287b(MenuItem menuItem) {
                boolean m101607bm;
                m101607bm = C33632Iq3.m101607bm(C33632Iq3.this, menuItem);
                return m101607bm;
            }
        });
        C34585Ms2.m94663h(m88799Tl(), new C3781a());
    }

    /* renamed from: am */
    public static final void m101608am(C33632Iq3 this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.f16300q.f118679e.m67603K(8388611);
    }

    /* renamed from: bm */
    public static final boolean m101607bm(C33632Iq3 this$0, MenuItem item) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(item, "item");
        this$0.f16303t.onNext(item);
        return true;
    }

    @Override // p000.M03
    /* renamed from: B8 */
    public Observable<Boolean> mo84494B8() {
        Observable<Boolean> hide = this.f16304u.hide();
        Intrinsics.checkNotNullExpressionValue(hide, "roleSwitchSubject.hide()");
        return hide;
    }

    @Override // p000.M03
    /* renamed from: Bj */
    public void mo84493Bj(boolean z) {
    }

    @Override // p000.M03
    /* renamed from: D1 */
    public void mo84492D1(boolean z) {
    }

    @Override // p000.M03
    /* renamed from: G3 */
    public void mo84491G3(boolean z) {
    }

    @Override // p000.M03
    /* renamed from: Hi */
    public void mo84490Hi(boolean z) {
    }

    @Override // p000.M03
    /* renamed from: L4 */
    public void mo84489L4(boolean z) {
    }

    @Override // p000.M03
    /* renamed from: M7 */
    public void mo84488M7(boolean z) {
    }

    @Override // p000.M03
    /* renamed from: Md */
    public void mo84487Md(boolean z) {
    }

    @Override // p000.M03
    /* renamed from: Nf */
    public void mo84486Nf(boolean z) {
    }

    @Override // p000.M03
    /* renamed from: O5 */
    public void mo84485O5(boolean z) {
    }

    @Override // p000.M03
    /* renamed from: Oe */
    public Observable<MenuItem> mo84484Oe() {
        Observable<MenuItem> hide = this.f16303t.hide();
        Intrinsics.checkNotNullExpressionValue(hide, "itemSelectedSubject.hide()");
        return hide;
    }

    @Override // p000.M03
    /* renamed from: Q7 */
    public AbstractC23442F<WireBird> mo84483Q7(ScanMode mode, ScanIntention scanIntention, Integer num, boolean z) {
        Intrinsics.checkNotNullParameter(mode, "mode");
        AbstractC23442F<WireBird> m33100x = AbstractC23442F.m33100x(new UnsupportedOperationException("This method has not been implemented"));
        Intrinsics.checkNotNullExpressionValue(m33100x, "error(UnsupportedOperati…s not been implemented\"))");
        return m33100x;
    }

    @Override // p000.M03
    /* renamed from: Qf */
    public void mo84482Qf(boolean z) {
    }

    @Override // p000.M03
    /* renamed from: R4 */
    public void mo84481R4(boolean z) {
    }

    @Override // p000.M03
    /* renamed from: Sg */
    public void mo84480Sg(boolean z) {
    }

    @Override // p000.M03
    /* renamed from: Ti */
    public void mo84479Ti(int i, Integer num) {
    }

    @Override // p000.M03
    /* renamed from: Ud */
    public void mo84478Ud(boolean z) {
    }

    @Override // p000.M03
    /* renamed from: V6 */
    public void mo84477V6(boolean z) {
    }

    @Override // p000.M03
    /* renamed from: Va */
    public void mo84476Va(boolean z) {
    }

    @Override // p000.M03
    /* renamed from: Wc */
    public void mo84475Wc(boolean z) {
    }

    @Override // p000.M03
    /* renamed from: Wh */
    public void mo84474Wh(boolean z) {
    }

    @Override // p000.M03
    /* renamed from: X7 */
    public void mo84473X7(boolean z) {
    }

    @Override // p000.M03
    /* renamed from: X8 */
    public void mo84472X8(boolean z) {
    }

    @Override // p000.M03
    /* renamed from: Ya */
    public void mo84471Ya(boolean z) {
    }

    @Override // p000.M03
    /* renamed from: Yb */
    public void mo84470Yb(boolean z) {
    }

    @Override // p000.M03
    /* renamed from: Zh */
    public void mo84468Zh(boolean z) {
    }

    @Override // p000.M03
    /* renamed from: ch */
    public void mo84464ch(boolean z) {
    }

    /* renamed from: cm */
    public final void m101606cm(int i, boolean z) {
        MenuItem findItem = this.f16300q.f118682h.m49298h().findItem(i);
        if (findItem != null) {
            findItem.setVisible(z);
        }
    }

    @Override // p000.M03
    /* renamed from: f0 */
    public void mo84462f0(boolean z) {
        m101606cm(C50583vi4.nav_help, z);
    }

    @Override // p000.M03
    /* renamed from: fj */
    public void mo84461fj(boolean z) {
    }

    @Override // p000.M03
    /* renamed from: fk */
    public void mo84460fk(boolean z) {
    }

    @Override // p000.M03
    /* renamed from: g5 */
    public void mo84459g5(boolean z) {
    }

    @Override // p000.M03
    /* renamed from: gj */
    public void mo84458gj(boolean z) {
    }

    @Override // p000.M03
    /* renamed from: jh */
    public void mo84457jh(int i) {
    }

    @Override // p000.M03
    /* renamed from: k4 */
    public void mo84456k4(boolean z) {
    }

    @Override // p000.M03
    /* renamed from: ka */
    public void mo84455ka(boolean z) {
    }

    @Override // p000.M03
    /* renamed from: lg */
    public void mo84454lg(boolean z) {
    }

    @Override // p000.M03
    /* renamed from: mf */
    public void mo84453mf(boolean z) {
    }

    @Override // p000.M03
    /* renamed from: ob */
    public void mo84452ob(boolean z) {
    }

    @Override // p000.M03
    /* renamed from: qf */
    public void mo84451qf(boolean z) {
    }

    @Override // p000.M03
    /* renamed from: s5 */
    public void mo84450s5(boolean z) {
    }

    @Override // p000.M03
    /* renamed from: t9 */
    public void mo84449t9(boolean z) {
        m101606cm(C50583vi4.nav_faq, z);
    }

    @Override // p000.M03
    /* renamed from: wl */
    public void mo84448wl(boolean z) {
    }

    @Override // p000.M03
    /* renamed from: y9 */
    public void mo84447y9(boolean z) {
    }
}
