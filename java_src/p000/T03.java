package p000;

import android.view.MenuItem;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.app.C10990a;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.core.mvp.BaseActivity;
import co.bird.android.model.constant.ScanIntention;
import co.bird.android.model.constant.ScanMode;
import co.bird.android.model.wire.WireBird;
import com.facebook.share.internal.C17296a;
import com.google.android.material.navigation.NavigationView;
import com.guness.widget.NavigationView;
import io.reactivex.AbstractC23442F;
import io.reactivex.Observable;
import io.reactivex.subjects.C24558d;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b&\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B7\u0012\u0006\u0010S\u001a\u00020R\u0012\u0006\u0010U\u001a\u00020T\u0012\u0006\u0010F\u001a\u00020C\u0012\u0006\u0010J\u001a\u00020G\u0012\u0006\u0010W\u001a\u00020V\u0012\u0006\u0010Y\u001a\u00020X¢\u0006\u0004\bZ\u0010[J\u000e\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0016J\u000e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003H\u0016J\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0006H\u0016J\u0010\u0010\u000b\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0006H\u0016J\u0010\u0010\f\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0006H\u0016J\u0010\u0010\r\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0006H\u0016J\u0010\u0010\u000e\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0006H\u0016J\u0010\u0010\u000f\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0006H\u0016J\u0010\u0010\u0010\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0006H\u0016J\u0010\u0010\u0011\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0006H\u0016J\u0010\u0010\u0012\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0006H\u0016J\u0010\u0010\u0013\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0006H\u0016J\u0010\u0010\u0014\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0006H\u0016J\u0010\u0010\u0015\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0006H\u0016J\u0010\u0010\u0016\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0006H\u0016J\u0010\u0010\u0017\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0006H\u0016J\u0010\u0010\u0018\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0006H\u0016J\u0010\u0010\u0019\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0006H\u0016J\u0010\u0010\u001a\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0006H\u0016J\u0010\u0010\u001b\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0006H\u0016J\u0010\u0010\u001c\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0006H\u0016J\u0010\u0010\u001d\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0006H\u0016J\u0010\u0010\u001e\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0006H\u0016J\u0010\u0010\u001f\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0006H\u0016J\u0010\u0010 \u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0006H\u0016J\u0010\u0010!\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0006H\u0016J\u0010\u0010\"\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0006H\u0016J\u0010\u0010#\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0006H\u0016J\u0010\u0010$\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0006H\u0016J\u0010\u0010%\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0006H\u0016J\u0010\u0010&\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0006H\u0016J\u0010\u0010'\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0006H\u0016J\u0010\u0010(\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0006H\u0016J\u0010\u0010)\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0006H\u0016J\u0010\u0010*\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0006H\u0016J\u0010\u0010+\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0006H\u0016J\u0010\u0010,\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0006H\u0016J\u0010\u0010-\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0006H\u0016J\u0010\u0010.\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0006H\u0016J\u0010\u0010/\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0006H\u0016J!\u00103\u001a\u00020\t2\u0006\u00101\u001a\u0002002\b\u00102\u001a\u0004\u0018\u000100H\u0016¢\u0006\u0004\b3\u00104J\u0010\u00105\u001a\u00020\t2\u0006\u00101\u001a\u000200H\u0016J9\u0010>\u001a\b\u0012\u0004\u0012\u00020=0<2\u0006\u00107\u001a\u0002062\b\u00109\u001a\u0004\u0018\u0001082\b\u0010:\u001a\u0004\u0018\u0001002\u0006\u0010;\u001a\u00020\u0006H\u0016¢\u0006\u0004\b>\u0010?J\u001c\u0010B\u001a\u00020\t2\b\b\u0001\u0010@\u001a\u0002002\b\b\u0002\u0010A\u001a\u00020\u0006H\u0002R\u0014\u0010F\u001a\u00020C8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010ER\u0014\u0010J\u001a\u00020G8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010IR\"\u0010O\u001a\u0010\u0012\f\u0012\n L*\u0004\u0018\u00010\u00040\u00040K8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bM\u0010NR\"\u0010Q\u001a\u0010\u0012\f\u0012\n L*\u0004\u0018\u00010\u00060\u00060K8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bP\u0010N¨\u0006\\"}, m28432d2 = {"LT03;", "LQB;", "LM03;", "Lio/reactivex/Observable;", "Landroid/view/MenuItem;", "Oe", "", "B8", "visible", "", "gj", "D1", "qf", "Qf", "ka", "lg", "Nf", "X7", "Va", "f0", "t9", "g5", "M7", "R4", "Ud", "L4", "k4", "Zh", "mf", C9107Wc.f41393c, "V6", "Hi", "Sg", "Ya", "y9", "G3", "Bj", "s5", "Md", "ch", "Wh", "O5", "Yb", "X8", "ob", "fj", "fk", "wl", "", "count", "taskLimit", "Ti", "(ILjava/lang/Integer;)V", "jh", "Lco/bird/android/model/constant/ScanMode;", "mode", "Lco/bird/android/model/constant/ScanIntention;", "intention", "instructionsStringRes", "showCodeInput", "Lio/reactivex/F;", "Lco/bird/android/model/wire/WireBird;", "Q7", "(Lco/bird/android/model/constant/ScanMode;Lco/bird/android/model/constant/ScanIntention;Ljava/lang/Integer;Z)Lio/reactivex/F;", "id", "show", "cm", "Landroidx/drawerlayout/widget/DrawerLayout;", "q", "Landroidx/drawerlayout/widget/DrawerLayout;", "drawer", "Lcom/guness/widget/NavigationView;", "r", "Lcom/guness/widget/NavigationView;", "navigationView", "Lio/reactivex/subjects/d;", "kotlin.jvm.PlatformType", "s", "Lio/reactivex/subjects/d;", "itemSelectedSubject", "t", "roleSwitchSubject", "Lco/bird/android/core/mvp/BaseActivity;", "activity", "Landroidx/appcompat/widget/Toolbar;", "toolbar", "Lgl;", "preference", "LTq4;", "reactiveConfig", "<init>", "(Lco/bird/android/core/mvp/BaseActivity;Landroidx/appcompat/widget/Toolbar;Landroidx/drawerlayout/widget/DrawerLayout;Lcom/guness/widget/NavigationView;Lgl;LTq4;)V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nNavigationDrawerUi.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavigationDrawerUi.kt\nco/bird/android/app/feature/operator/ui/NavigationDrawerUiImpl\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,326:1\n1#2:327\n*E\n"})
/* renamed from: T03 */
/* loaded from: classes2.dex */
public final class T03 extends AbstractC6705QB implements M03 {

    /* renamed from: q */
    public final DrawerLayout f34602q;

    /* renamed from: r */
    public final NavigationView f34603r;

    /* renamed from: s */
    public final C24558d<MenuItem> f34604s;

    /* renamed from: t */
    public final C24558d<Boolean> f34605t;

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Landroid/widget/CompoundButton;", "<anonymous parameter 0>", "", "isChecked", "", C17296a.f69688o, "(Landroid/widget/CompoundButton;Z)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: T03$a */
    /* loaded from: classes2.dex */
    public static final class C7629a extends Lambda implements Function2<CompoundButton, Boolean, Unit> {
        public C7629a() {
            super(2);
        }

        /* renamed from: a */
        public final void m84446a(CompoundButton compoundButton, boolean z) {
            T03.this.f34605t.onNext(Boolean.valueOf(z));
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(CompoundButton compoundButton, Boolean bool) {
            m84446a(compoundButton, bool.booleanValue());
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¨\u0006\b"}, m28432d2 = {"T03$b", "Landroidx/appcompat/app/a;", "Landroid/view/View;", "drawerView", "", "slideOffset", "", DateTokenConverter.CONVERTER_KEY, "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nNavigationDrawerUi.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavigationDrawerUi.kt\nco/bird/android/app/feature/operator/ui/NavigationDrawerUiImpl$toggle$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,326:1\n1#2:327\n*E\n"})
    /* renamed from: T03$b */
    /* loaded from: classes2.dex */
    public static final class C7630b extends C10990a {

        /* renamed from: l */
        public final /* synthetic */ T03 f34607l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C7630b(BaseActivity baseActivity, Toolbar toolbar, T03 t03, DrawerLayout drawerLayout, int i, int i2) {
            super(baseActivity, drawerLayout, toolbar, i, i2);
            this.f34607l = t03;
        }

        @Override // androidx.appcompat.app.C10990a, androidx.drawerlayout.widget.DrawerLayout.InterfaceC11567e
        /* renamed from: d */
        public void mo67557d(View drawerView, float f) {
            RelativeLayout relativeLayout;
            C36677Vq6 m79345a;
            C32258Ct6 c32258Ct6;
            Intrinsics.checkNotNullParameter(drawerView, "drawerView");
            super.mo67557d(drawerView, f);
            View m45931u = this.f34607l.f34603r.m45931u();
            if (m45931u != null && (m79345a = C36677Vq6.m79345a(m45931u)) != null && (c32258Ct6 = m79345a.f39844c) != null) {
                relativeLayout = c32258Ct6.f4862b;
            } else {
                relativeLayout = null;
            }
            if (relativeLayout != null) {
                relativeLayout.setAlpha(f);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public T03(BaseActivity activity, Toolbar toolbar, DrawerLayout drawer, NavigationView navigationView, C22454gl preference, C36207Tq4 reactiveConfig) {
        super(activity, drawer, navigationView, preference, reactiveConfig);
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        Intrinsics.checkNotNullParameter(drawer, "drawer");
        Intrinsics.checkNotNullParameter(navigationView, "navigationView");
        Intrinsics.checkNotNullParameter(preference, "preference");
        Intrinsics.checkNotNullParameter(reactiveConfig, "reactiveConfig");
        this.f34602q = drawer;
        this.f34603r = navigationView;
        C24558d<MenuItem> m31902e = C24558d.m31902e();
        Intrinsics.checkNotNullExpressionValue(m31902e, "create<MenuItem>()");
        this.f34604s = m31902e;
        C24558d<Boolean> m31902e2 = C24558d.m31902e();
        Intrinsics.checkNotNullExpressionValue(m31902e2, "create<Boolean>()");
        this.f34605t = m31902e2;
        C7630b c7630b = new C7630b(activity, toolbar, this, drawer, C45871nl4.navigation_drawer_open, C45871nl4.navigation_drawer_close);
        c7630b.m70317h(false);
        c7630b.m70316i(C48193rg4.ic_menu_white);
        c7630b.m70313l(new View.OnClickListener() { // from class: P03
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                T03.m84466am(T03.this, view);
            }
        });
        drawer.m67591a(c7630b);
        c7630b.m70312m();
        m88799Tl().setChecked(true);
        m88799Tl().setVisibility(0);
        navigationView.setNavigationItemSelectedListener(new NavigationView.InterfaceC17850c() { // from class: R03
            @Override // com.google.android.material.navigation.NavigationView.InterfaceC17850c
            /* renamed from: b */
            public final boolean mo49287b(MenuItem menuItem) {
                boolean m84465bm;
                m84465bm = T03.m84465bm(T03.this, menuItem);
                return m84465bm;
            }
        });
        C34585Ms2.m94663h(m88799Tl(), new C7629a());
    }

    /* renamed from: am */
    public static final void m84466am(T03 this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.m88796Wl().accept(Unit.INSTANCE);
        this$0.f34602q.m67603K(8388611);
    }

    /* renamed from: bm */
    public static final boolean m84465bm(T03 this$0, MenuItem item) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(item, "item");
        this$0.f34604s.onNext(item);
        return true;
    }

    @Override // p000.M03
    /* renamed from: B8 */
    public Observable<Boolean> mo84494B8() {
        Observable<Boolean> hide = this.f34605t.hide();
        Intrinsics.checkNotNullExpressionValue(hide, "roleSwitchSubject.hide()");
        return hide;
    }

    @Override // p000.M03
    /* renamed from: Bj */
    public void mo84493Bj(boolean z) {
        m84463cm(C50583vi4.nav_fleet_insights, z);
    }

    @Override // p000.M03
    /* renamed from: D1 */
    public void mo84492D1(boolean z) {
        m84463cm(C50583vi4.nav_service_center_status, z);
    }

    @Override // p000.M03
    /* renamed from: G3 */
    public void mo84491G3(boolean z) {
        m84463cm(C50583vi4.nav_fleet_status, z);
    }

    @Override // p000.M03
    /* renamed from: Hi */
    public void mo84490Hi(boolean z) {
        m84463cm(C50583vi4.nav_inspection, z);
    }

    @Override // p000.M03
    /* renamed from: L4 */
    public void mo84489L4(boolean z) {
        m84463cm(C50583vi4.nav_inventory, z);
    }

    @Override // p000.M03
    /* renamed from: M7 */
    public void mo84488M7(boolean z) {
        m84463cm(C50583vi4.nav_id_tool, z);
    }

    @Override // p000.M03
    /* renamed from: Md */
    public void mo84487Md(boolean z) {
        m84463cm(C50583vi4.nav_report, z);
    }

    @Override // p000.M03
    /* renamed from: Nf */
    public void mo84486Nf(boolean z) {
        m84463cm(C50583vi4.nav_replace_qr, z);
    }

    @Override // p000.M03
    /* renamed from: O5 */
    public void mo84485O5(boolean z) {
        m84463cm(C50583vi4.nav_scrap_order, z);
    }

    @Override // p000.M03
    /* renamed from: Oe */
    public Observable<MenuItem> mo84484Oe() {
        Observable<MenuItem> hide = this.f34604s.hide();
        Intrinsics.checkNotNullExpressionValue(hide, "itemSelectedSubject.hide()");
        return hide;
    }

    @Override // p000.M03
    /* renamed from: Q7 */
    public AbstractC23442F<WireBird> mo84483Q7(ScanMode mode, ScanIntention scanIntention, Integer num, boolean z) {
        String str;
        C52471yt3 m2328a;
        Intrinsics.checkNotNullParameter(mode, "mode");
        if (num != null) {
            str = getActivity().getString(num.intValue());
        } else {
            str = null;
        }
        m2328a = C52471yt3.f120367g.m2328a(mode, scanIntention, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : null, (i & 16) != 0 ? true : z, (i & 32) != 0 ? null : null);
        m2328a.show(getActivity().getSupportFragmentManager(), "TAG");
        return m2328a.m2331N6();
    }

    @Override // p000.M03
    /* renamed from: Qf */
    public void mo84482Qf(boolean z) {
        m84463cm(C50583vi4.nav_task_list, z);
    }

    @Override // p000.M03
    /* renamed from: R4 */
    public void mo84481R4(boolean z) {
        m84463cm(C50583vi4.nav_release_birds, z);
    }

    @Override // p000.M03
    /* renamed from: Sg */
    public void mo84480Sg(boolean z) {
        m84463cm(C50583vi4.nav_hard_count, z);
    }

    @Override // p000.M03
    /* renamed from: Ti */
    public void mo84479Ti(int i, Integer num) {
        String valueOf;
        TextView textView;
        if (num != null) {
            valueOf = i + "/" + num;
        } else {
            valueOf = String.valueOf(i);
        }
        View actionView = this.f34603r.m49298h().findItem(C50583vi4.nav_task_list).getActionView();
        if (actionView != null) {
            textView = (TextView) actionView.findViewById(C50583vi4.counter);
        } else {
            textView = null;
        }
        if (textView != null) {
            textView.setText(valueOf);
        }
    }

    @Override // p000.M03
    /* renamed from: Ud */
    public void mo84478Ud(boolean z) {
        m84463cm(C50583vi4.nav_command_center, z);
    }

    @Override // p000.M03
    /* renamed from: V6 */
    public void mo84477V6(boolean z) {
        m84463cm(C50583vi4.nav_pair_handheld, z);
    }

    @Override // p000.M03
    /* renamed from: Va */
    public void mo84476Va(boolean z) {
        m84463cm(C50583vi4.nav_wake_vehicles, z);
    }

    @Override // p000.M03
    /* renamed from: Wc */
    public void mo84475Wc(boolean z) {
        m84463cm(C50583vi4.nav_lookup_bird, z);
    }

    @Override // p000.M03
    /* renamed from: Wh */
    public void mo84474Wh(boolean z) {
        m84463cm(C50583vi4.nav_operator_transfer_order, z);
    }

    @Override // p000.M03
    /* renamed from: X7 */
    public void mo84473X7(boolean z) {
        m84463cm(C50583vi4.nav_bulk_scan, z);
    }

    @Override // p000.M03
    /* renamed from: X8 */
    public void mo84472X8(boolean z) {
        m84463cm(C50583vi4.nav_create_a_nest, z);
    }

    @Override // p000.M03
    /* renamed from: Ya */
    public void mo84471Ya(boolean z) {
        m84463cm(C50583vi4.nav_scrap, z);
    }

    @Override // p000.M03
    /* renamed from: Yb */
    public void mo84470Yb(boolean z) {
        m84463cm(C50583vi4.nav_release_assignment, z);
    }

    @Override // p000.M03
    /* renamed from: Zh */
    public void mo84468Zh(boolean z) {
        m84463cm(C50583vi4.nav_whitelist, z);
    }

    @Override // p000.M03
    /* renamed from: ch */
    public void mo84464ch(boolean z) {
        m84463cm(C50583vi4.nav_transfer_order, z);
    }

    /* renamed from: cm */
    public final void m84463cm(int i, boolean z) {
        MenuItem findItem = this.f34603r.m49298h().findItem(i);
        if (findItem != null) {
            findItem.setVisible(z);
        }
    }

    @Override // p000.M03
    /* renamed from: f0 */
    public void mo84462f0(boolean z) {
        m84463cm(C50583vi4.nav_help, z);
    }

    @Override // p000.M03
    /* renamed from: fj */
    public void mo84461fj(boolean z) {
        m84463cm(C50583vi4.nav_vehicle_inventory_check_out, z);
    }

    @Override // p000.M03
    /* renamed from: fk */
    public void mo84460fk(boolean z) {
        m84463cm(C50583vi4.nav_vehicle_inventory_pick_up, z);
    }

    @Override // p000.M03
    /* renamed from: g5 */
    public void mo84459g5(boolean z) {
        m84463cm(C50583vi4.nav_bluetooth_locks, z);
    }

    @Override // p000.M03
    /* renamed from: gj */
    public void mo84458gj(boolean z) {
        m84463cm(C50583vi4.nav_repair, z);
    }

    @Override // p000.M03
    /* renamed from: jh */
    public void mo84457jh(int i) {
        TextView textView;
        View actionView = this.f34603r.m49298h().findItem(C50583vi4.nav_operator_transfer_order).getActionView();
        if (actionView != null) {
            textView = (TextView) actionView.findViewById(C50583vi4.counter);
        } else {
            textView = null;
        }
        if (textView != null) {
            textView.setText(String.valueOf(i));
        }
    }

    @Override // p000.M03
    /* renamed from: k4 */
    public void mo84456k4(boolean z) {
        m84463cm(C50583vi4.nav_batchActions, z);
    }

    @Override // p000.M03
    /* renamed from: ka */
    public void mo84455ka(boolean z) {
        m84463cm(C50583vi4.nav_wake_sleep_birds, z);
    }

    @Override // p000.M03
    /* renamed from: lg */
    public void mo84454lg(boolean z) {
        m84463cm(C50583vi4.nav_nearby_vehicles, z);
    }

    @Override // p000.M03
    /* renamed from: mf */
    public void mo84453mf(boolean z) {
        m84463cm(C50583vi4.nav_quality_control, z);
    }

    @Override // p000.M03
    /* renamed from: ob */
    public void mo84452ob(boolean z) {
        m84463cm(C50583vi4.nav_vehicle_inventory_check_in, z);
    }

    @Override // p000.M03
    /* renamed from: qf */
    public void mo84451qf(boolean z) {
        m84463cm(C50583vi4.nav_bulk_service_center_status, z);
    }

    @Override // p000.M03
    /* renamed from: s5 */
    public void mo84450s5(boolean z) {
        m84463cm(C50583vi4.nav_maintenance, z);
    }

    @Override // p000.M03
    /* renamed from: t9 */
    public void mo84449t9(boolean z) {
        m84463cm(C50583vi4.nav_faq, z);
    }

    @Override // p000.M03
    /* renamed from: wl */
    public void mo84448wl(boolean z) {
        m84463cm(C50583vi4.nav_vehicle_inventory_drop_off, z);
    }

    @Override // p000.M03
    /* renamed from: y9 */
    public void mo84447y9(boolean z) {
        m84463cm(C50583vi4.nav_health_check, z);
    }
}
