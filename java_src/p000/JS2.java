package p000;

import android.view.MenuItem;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.app.C10990a;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;
import co.bird.android.core.mvp.BaseActivity;
import co.bird.android.model.wire.WireMerchantSite;
import com.facebook.share.internal.C17296a;
import com.google.android.material.navigation.NavigationView;
import com.guness.widget.NavigationView;
import io.reactivex.Observable;
import io.reactivex.subjects.C24558d;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B9\b\u0007\u0012\u0006\u0010A\u001a\u00020@\u0012\u0006\u0010\u0018\u001a\u00020\u0013\u0012\u0006\u0010\u001e\u001a\u00020\u0019\u0012\u0006\u0010$\u001a\u00020\u001f\u0012\u0006\u0010)\u001a\u00020%\u0012\u0006\u0010/\u001a\u00020*¢\u0006\u0004\bB\u0010CJ\u000e\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0016J\u000e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003H\u0016J\u0012\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016J\u0016\u0010\u000f\u001a\u00020\n2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0016J\u0010\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u0004H\u0016J\u0010\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u0004H\u0016R\u0017\u0010\u0018\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u001e\u001a\u00020\u00198\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010$\u001a\u00020\u001f8\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010)\u001a\u00020%8\u0006¢\u0006\f\n\u0004\b\u000b\u0010&\u001a\u0004\b'\u0010(R\u0017\u0010/\u001a\u00020*8\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\"\u00104\u001a\u0010\u0012\f\u0012\n 1*\u0004\u0018\u00010\r0\r008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R \u00109\u001a\b\u0012\u0004\u0012\u00020\r0\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u00108R\"\u0010=\u001a\u0010\u0012\f\u0012\n 1*\u0004\u0018\u00010\u00040\u00040:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<R\"\u0010?\u001a\u0010\u0012\f\u0012\n 1*\u0004\u0018\u00010\u00060\u00060:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010<¨\u0006D"}, m28432d2 = {"LJS2;", "LQB;", "LGS2;", "Lio/reactivex/Observable;", "", "U6", "Landroid/view/MenuItem;", "ag", "", "title", "", "t", "", "Lco/bird/android/model/wire/WireMerchantSite;", "stores", "n8", "show", "el", "Ua", "Landroidx/drawerlayout/widget/DrawerLayout;", "q", "Landroidx/drawerlayout/widget/DrawerLayout;", "getDrawer", "()Landroidx/drawerlayout/widget/DrawerLayout;", "drawer", "Landroidx/appcompat/widget/Toolbar;", "r", "Landroidx/appcompat/widget/Toolbar;", "getToolbar", "()Landroidx/appcompat/widget/Toolbar;", "toolbar", "Lcom/guness/widget/NavigationView;", "s", "Lcom/guness/widget/NavigationView;", "getNavigationView", "()Lcom/guness/widget/NavigationView;", "navigationView", "Lgl;", "Lgl;", "getPreference", "()Lgl;", "preference", "LTq4;", "u", "LTq4;", "getReactiveConfig", "()LTq4;", "reactiveConfig", "Lma4;", "kotlin.jvm.PlatformType", "v", "Lma4;", "_storeChanges", "w", "Lio/reactivex/Observable;", "y6", "()Lio/reactivex/Observable;", "storeChanges", "Lio/reactivex/subjects/d;", "x", "Lio/reactivex/subjects/d;", "roleSwitchSubject", "y", "navigationItemClicks", "Lco/bird/android/core/mvp/BaseActivity;", "activity", "<init>", "(Lco/bird/android/core/mvp/BaseActivity;Landroidx/drawerlayout/widget/DrawerLayout;Landroidx/appcompat/widget/Toolbar;Lcom/guness/widget/NavigationView;Lgl;LTq4;)V", "co.bird.android.feature.merchant"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nMerchantNavigationDrawerUi.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MerchantNavigationDrawerUi.kt\nco/bird/android/feature/merchant/ui/MerchantNavigationDrawerUiImpl\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,119:1\n1855#2,2:120\n*S KotlinDebug\n*F\n+ 1 MerchantNavigationDrawerUi.kt\nco/bird/android/feature/merchant/ui/MerchantNavigationDrawerUiImpl\n*L\n100#1:120,2\n*E\n"})
/* renamed from: JS2 */
/* loaded from: classes3.dex */
public final class JS2 extends AbstractC6705QB implements GS2 {

    /* renamed from: q */
    public final DrawerLayout f17589q;

    /* renamed from: r */
    public final Toolbar f17590r;

    /* renamed from: s */
    public final NavigationView f17591s;

    /* renamed from: t */
    public final C22454gl f17592t;

    /* renamed from: u */
    public final C36207Tq4 f17593u;

    /* renamed from: v */
    public final C45168ma4<WireMerchantSite> f17594v;

    /* renamed from: w */
    public final Observable<WireMerchantSite> f17595w;

    /* renamed from: x */
    public final C24558d<Boolean> f17596x;

    /* renamed from: y */
    public final C24558d<MenuItem> f17597y;

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Landroid/widget/CompoundButton;", "<anonymous parameter 0>", "", "isChecked", "", C17296a.f69688o, "(Landroid/widget/CompoundButton;Z)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: JS2$a */
    /* loaded from: classes3.dex */
    public static final class C4086a extends Lambda implements Function2<CompoundButton, Boolean, Unit> {
        public C4086a() {
            super(2);
        }

        /* renamed from: a */
        public final void m100429a(CompoundButton compoundButton, boolean z) {
            JS2.this.f17596x.onNext(Boolean.valueOf(z));
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(CompoundButton compoundButton, Boolean bool) {
            m100429a(compoundButton, bool.booleanValue());
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, m28432d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: JS2$b */
    /* loaded from: classes3.dex */
    public static final class C4087b extends Lambda implements Function1<View, Unit> {

        /* renamed from: h */
        public final /* synthetic */ WireMerchantSite f17600h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C4087b(WireMerchantSite wireMerchantSite) {
            super(1);
            this.f17600h = wireMerchantSite;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            invoke2(view);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(View view) {
            JS2.this.f17594v.accept(this.f17600h);
            JS2.this.mo73876b7(true);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JS2(BaseActivity activity, DrawerLayout drawer, Toolbar toolbar, NavigationView navigationView, C22454gl preference, C36207Tq4 reactiveConfig) {
        super(activity, drawer, navigationView, preference, reactiveConfig);
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(drawer, "drawer");
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        Intrinsics.checkNotNullParameter(navigationView, "navigationView");
        Intrinsics.checkNotNullParameter(preference, "preference");
        Intrinsics.checkNotNullParameter(reactiveConfig, "reactiveConfig");
        this.f17589q = drawer;
        this.f17590r = toolbar;
        this.f17591s = navigationView;
        this.f17592t = preference;
        this.f17593u = reactiveConfig;
        C45168ma4<WireMerchantSite> m25409g = C45168ma4.m25409g();
        Intrinsics.checkNotNullExpressionValue(m25409g, "create<WireMerchantSite>()");
        this.f17594v = m25409g;
        this.f17595w = m25409g;
        C24558d<Boolean> m31902e = C24558d.m31902e();
        Intrinsics.checkNotNullExpressionValue(m31902e, "create<Boolean>()");
        this.f17596x = m31902e;
        C24558d<MenuItem> m31902e2 = C24558d.m31902e();
        Intrinsics.checkNotNullExpressionValue(m31902e2, "create< MenuItem>()");
        this.f17597y = m31902e2;
        C10990a c10990a = new C10990a(activity, drawer, toolbar, C45871nl4.navigation_drawer_open, C45871nl4.navigation_drawer_close);
        c10990a.m70317h(false);
        c10990a.m70316i(C48193rg4.ic_menu_white);
        c10990a.m70313l(new View.OnClickListener() { // from class: HS2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                JS2.m100434bm(JS2.this, view);
            }
        });
        c10990a.m70312m();
        drawer.m67591a(c10990a);
        m88798Ul().setVisibility(0);
        m88799Tl().setChecked(true);
        setIcon(C33309Hg4.ic_bird_logo_white);
        mo73880Le(C45871nl4.drawer_ride_switch_merchant);
        C34585Ms2.m94663h(m88799Tl(), new C4086a());
        navigationView.setNavigationItemSelectedListener(new NavigationView.InterfaceC17850c() { // from class: IS2
            @Override // com.google.android.material.navigation.NavigationView.InterfaceC17850c
            /* renamed from: b */
            public final boolean mo49287b(MenuItem menuItem) {
                boolean m100435am;
                m100435am = JS2.m100435am(JS2.this, menuItem);
                return m100435am;
            }
        });
    }

    /* renamed from: am */
    public static final boolean m100435am(JS2 this$0, MenuItem menuItem) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(menuItem, "menuItem");
        this$0.f17597y.onNext(menuItem);
        return true;
    }

    /* renamed from: bm */
    public static final void m100434bm(JS2 this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.m88796Wl().accept(Unit.INSTANCE);
        this$0.f17589q.m67603K(8388611);
    }

    @Override // p000.GS2
    /* renamed from: U6 */
    public Observable<Boolean> mo100440U6() {
        Observable<Boolean> hide = this.f17596x.hide();
        Intrinsics.checkNotNullExpressionValue(hide, "roleSwitchSubject.hide()");
        return hide;
    }

    @Override // p000.GS2
    /* renamed from: Ua */
    public void mo100439Ua(boolean z) {
        MenuItem findItem = this.f17591s.m49298h().findItem(C31914Bh4.nav_reports);
        if (findItem == null) {
            return;
        }
        findItem.setVisible(z);
    }

    @Override // p000.GS2
    /* renamed from: ag */
    public Observable<MenuItem> mo100436ag() {
        return this.f17597y;
    }

    @Override // p000.GS2
    /* renamed from: el */
    public void mo100433el(boolean z) {
        MenuItem findItem = this.f17591s.m49298h().findItem(C31914Bh4.nav_location);
        if (findItem == null) {
            return;
        }
        findItem.setVisible(z);
    }

    @Override // p000.GS2
    /* renamed from: n8 */
    public void mo100432n8(List<WireMerchantSite> stores) {
        Intrinsics.checkNotNullParameter(stores, "stores");
        if (m88800Sl().getChildCount() > m88797Vl().size()) {
            m88800Sl().removeViews(m88797Vl().size(), m88800Sl().getChildCount() - m88797Vl().size());
        }
        for (WireMerchantSite wireMerchantSite : stores) {
            C39890dg2 m43903c = C39890dg2.m43903c(getActivity().getLayoutInflater(), m88800Sl(), false);
            Intrinsics.checkNotNullExpressionValue(m43903c, "inflate(activity.layoutI…DropdownContainer, false)");
            TextView textView = m43903c.f77026b;
            String name = wireMerchantSite.getName();
            if (name == null) {
                name = wireMerchantSite.getMerchant().getName();
            }
            textView.setText(name);
            m88800Sl().addView(m43903c.getRoot());
            RelativeLayout root = m43903c.getRoot();
            Intrinsics.checkNotNullExpressionValue(root, "binding.root");
            C34585Ms2.m94661j(root, new C4087b(wireMerchantSite));
        }
    }

    @Override // p000.GS2
    /* renamed from: t */
    public void mo100431t(String str) {
        if (str == null) {
            str = getActivity().getString(C45871nl4.drawer_ride_switch_merchant);
            Intrinsics.checkNotNullExpressionValue(str, "activity.getString(L.str…wer_ride_switch_merchant)");
        }
        mo73878Te(str);
    }

    @Override // p000.GS2
    /* renamed from: y6 */
    public Observable<WireMerchantSite> mo100430y6() {
        return this.f17595w;
    }
}
