package p000;

import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.CompoundButton;
import androidx.appcompat.app.C10990a;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.core.mvp.BaseActivity;
import co.bird.android.feature.frequentFlyer.view.FrequentFlyerLeftNavView;
import co.bird.android.model.wire.WireFrequentFlyerView;
import co.bird.android.model.wire.configs.DeliveryRequestKind;
import com.amazonaws.mobileconnectors.p025s3.transferutility.TransferTable;
import com.facebook.share.internal.C17296a;
import com.google.android.material.navigation.NavigationView;
import com.guness.widget.NavigationView;
import io.reactivex.Observable;
import io.reactivex.functions.InterfaceC23492o;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsJVMKt;
@Metadata(m28433d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B?\u0012\u0006\u0010A\u001a\u00020@\u0012\u0006\u0010C\u001a\u00020B\u0012\u0006\u0010(\u001a\u00020%\u0012\u0006\u0010,\u001a\u00020)\u0012\u0006\u00100\u001a\u00020-\u0012\u0006\u0010E\u001a\u00020D\u0012\u0006\u0010G\u001a\u00020F¢\u0006\u0004\bH\u0010IJ\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016J\u0010\u0010\n\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016J\u0010\u0010\u000b\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016J\u0010\u0010\f\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016J\u0010\u0010\r\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016J\u0010\u0010\u000e\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016J\u0010\u0010\u000f\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016J\u0010\u0010\u0010\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016J \u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u0013H\u0016J\u0018\u0010\u0017\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u0011H\u0016J\u0019\u0010\u001a\u001a\u00020\u00052\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016J\u0012\u0010\u001e\u001a\u00020\u00052\b\b\u0001\u0010\u001d\u001a\u00020\u0018H\u0016J\u0010\u0010!\u001a\u00020\u00052\u0006\u0010 \u001a\u00020\u001fH\u0016J\b\u0010\"\u001a\u00020\u0005H\u0016J\u000e\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00050#H\u0016R\u0014\u0010(\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010,\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u00100\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u00104\u001a\u0002018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\"\u00109\u001a\u0010\u0012\f\u0012\n 6*\u0004\u0018\u00010\u00180\u0018058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R \u0010?\u001a\b\u0012\u0004\u0012\u00020:0#8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>¨\u0006J"}, m28432d2 = {"LU03;", "LQB;", "LN03;", "LaZ2;", "presenter", "", "cm", "", "show", "al", "e5", "pf", "me", "D7", "Mh", "We", "f2", "", "menuTitle", "Lco/bird/android/model/wire/configs/DeliveryRequestKind;", "kind", "y5", "title", "t2", "", "menuItemId", "Ag", "(Ljava/lang/Integer;)V", "d5", "icon", "K2", "Lco/bird/android/model/wire/WireFrequentFlyerView;", "progress", "u9", "Af", "Lio/reactivex/Observable;", "Sj", "Landroidx/drawerlayout/widget/DrawerLayout;", "q", "Landroidx/drawerlayout/widget/DrawerLayout;", "drawer", "Lcom/guness/widget/NavigationView;", "r", "Lcom/guness/widget/NavigationView;", "navigationView", "Landroid/view/View;", "s", "Landroid/view/View;", "sideMenuBanner", "Lco/bird/android/feature/frequentFlyer/view/FrequentFlyerLeftNavView;", "t", "Lco/bird/android/feature/frequentFlyer/view/FrequentFlyerLeftNavView;", "frequentFlyerStatus", "LAG;", "kotlin.jvm.PlatformType", "u", "LAG;", "drawerStateRelay", "Ln71;", "v", "Lio/reactivex/Observable;", "yb", "()Lio/reactivex/Observable;", "drawerState", "Lco/bird/android/core/mvp/BaseActivity;", "activity", "Landroidx/appcompat/widget/Toolbar;", "toolbar", "Lgl;", "preference", "LTq4;", "reactiveConfig", "<init>", "(Lco/bird/android/core/mvp/BaseActivity;Landroidx/appcompat/widget/Toolbar;Landroidx/drawerlayout/widget/DrawerLayout;Lcom/guness/widget/NavigationView;Landroid/view/View;Lgl;LTq4;)V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nNavigationDrawerUi.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavigationDrawerUi.kt\nco/bird/android/app/feature/ride/ui/NavigationDrawerUiImpl\n+ 2 Iterators.kt\nkotlin/collections/CollectionsKt__IteratorsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,233:1\n32#2,2:234\n1855#3,2:236\n*S KotlinDebug\n*F\n+ 1 NavigationDrawerUi.kt\nco/bird/android/app/feature/ride/ui/NavigationDrawerUiImpl\n*L\n107#1:234,2\n201#1:236,2\n*E\n"})
/* renamed from: U03 */
/* loaded from: classes2.dex */
public final class U03 extends AbstractC6705QB implements N03 {

    /* renamed from: q */
    public final DrawerLayout f36599q;

    /* renamed from: r */
    public final NavigationView f36600r;

    /* renamed from: s */
    public final View f36601s;

    /* renamed from: t */
    public final FrequentFlyerLeftNavView f36602t;

    /* renamed from: u */
    public final C0058AG<Integer> f36603u;

    /* renamed from: v */
    public final Observable<EnumC45494n71> f36604v;

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"", TransferTable.COLUMN_STATE, "Ln71;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Ljava/lang/Integer;)Ln71;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: U03$a */
    /* loaded from: classes2.dex */
    public static final class C8169a extends Lambda implements Function1<Integer, EnumC45494n71> {
        public C8169a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final EnumC45494n71 invoke(Integer state) {
            Intrinsics.checkNotNullParameter(state, "state");
            boolean m67611C = U03.this.f36599q.m67611C(8388611);
            int intValue = state.intValue();
            if (intValue != 1) {
                if (intValue != 2) {
                    if (m67611C) {
                        return EnumC45494n71.OPEN;
                    }
                    return EnumC45494n71.CLOSED;
                }
                return EnumC45494n71.SETTLING;
            }
            return EnumC45494n71.DRAGGING;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Landroid/widget/CompoundButton;", "<anonymous parameter 0>", "", "isChecked", "", C17296a.f69688o, "(Landroid/widget/CompoundButton;Z)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: U03$b */
    /* loaded from: classes2.dex */
    public static final class C8170b extends Lambda implements Function2<CompoundButton, Boolean, Unit> {

        /* renamed from: g */
        public final /* synthetic */ InterfaceC38024aZ2 f36606g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C8170b(InterfaceC38024aZ2 interfaceC38024aZ2) {
            super(2);
            this.f36606g = interfaceC38024aZ2;
        }

        /* renamed from: a */
        public final void m82172a(CompoundButton compoundButton, boolean z) {
            this.f36606g.mo71217d(z);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(CompoundButton compoundButton, Boolean bool) {
            m82172a(compoundButton, bool.booleanValue());
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¨\u0006\u000b"}, m28432d2 = {"U03$c", "Landroidx/appcompat/app/a;", "Landroid/view/View;", "drawerView", "", "slideOffset", "", DateTokenConverter.CONVERTER_KEY, "", "newState", "c", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: U03$c */
    /* loaded from: classes2.dex */
    public static final class C8171c extends C10990a {

        /* renamed from: l */
        public final /* synthetic */ U03 f36607l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C8171c(BaseActivity baseActivity, Toolbar toolbar, U03 u03, DrawerLayout drawerLayout, int i, int i2) {
            super(baseActivity, drawerLayout, toolbar, i, i2);
            this.f36607l = u03;
        }

        @Override // androidx.appcompat.app.C10990a, androidx.drawerlayout.widget.DrawerLayout.InterfaceC11567e
        /* renamed from: c */
        public void mo67558c(int i) {
            super.mo67558c(i);
            this.f36607l.f36603u.accept(Integer.valueOf(i));
        }

        @Override // androidx.appcompat.app.C10990a, androidx.drawerlayout.widget.DrawerLayout.InterfaceC11567e
        /* renamed from: d */
        public void mo67557d(View drawerView, float f) {
            Intrinsics.checkNotNullParameter(drawerView, "drawerView");
            super.mo67557d(drawerView, f);
            this.f36607l.f36601s.setAlpha(f);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public U03(BaseActivity activity, Toolbar toolbar, DrawerLayout drawer, NavigationView navigationView, View sideMenuBanner, C22454gl preference, C36207Tq4 reactiveConfig) {
        super(activity, drawer, navigationView, preference, reactiveConfig);
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        Intrinsics.checkNotNullParameter(drawer, "drawer");
        Intrinsics.checkNotNullParameter(navigationView, "navigationView");
        Intrinsics.checkNotNullParameter(sideMenuBanner, "sideMenuBanner");
        Intrinsics.checkNotNullParameter(preference, "preference");
        Intrinsics.checkNotNullParameter(reactiveConfig, "reactiveConfig");
        this.f36599q = drawer;
        this.f36600r = navigationView;
        this.f36601s = sideMenuBanner;
        this.f36602t = (FrequentFlyerLeftNavView) C49520tu6.m11243h(navigationView, C36585Vg4.frequentFlyerStatus);
        C0058AG<Integer> m115951g = C0058AG.m115951g();
        Intrinsics.checkNotNullExpressionValue(m115951g, "create<Int>()");
        this.f36603u = m115951g;
        final C8169a c8169a = new C8169a();
        Observable map = m115951g.map(new InterfaceC23492o() { // from class: O03
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                EnumC45494n71 m82186bm;
                m82186bm = U03.m82186bm(Function1.this, obj);
                return m82186bm;
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "drawerStateRelay\n    .ma…tate.CLOSED\n      }\n    }");
        this.f36604v = map;
        int i = C45871nl4.navigation_drawer_open;
        C8171c c8171c = new C8171c(activity, toolbar, this, drawer, i, C45871nl4.navigation_drawer_close);
        c8171c.m70317h(false);
        c8171c.m70313l(new View.OnClickListener() { // from class: Q03
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                U03.m82181em(U03.this, view);
            }
        });
        drawer.m67591a(c8171c);
        c8171c.m70312m();
        toolbar.setNavigationIcon(C48193rg4.ic_menu);
        toolbar.setNavigationContentDescription(i);
        Menu m49298h = navigationView.m49298h();
        Intrinsics.checkNotNullExpressionValue(m49298h, "navigationView.menu");
        Iterator<MenuItem> m14223a = C48633sQ2.m14223a(m49298h);
        while (m14223a.hasNext()) {
            MenuItem next = m14223a.next();
            C45669nQ2.m23825c(next, activity.getString(C45871nl4.accessibility_button_format, next.getTitle()));
        }
    }

    /* renamed from: bm */
    public static final EnumC45494n71 m82186bm(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (EnumC45494n71) tmp0.invoke(obj);
    }

    /* renamed from: dm */
    public static final boolean m82183dm(InterfaceC38024aZ2 presenter, MenuItem item) {
        Intrinsics.checkNotNullParameter(presenter, "$presenter");
        Intrinsics.checkNotNullParameter(item, "item");
        return presenter.mo71219b(item);
    }

    /* renamed from: em */
    public static final void m82181em(U03 this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.m88796Wl().accept(Unit.INSTANCE);
        this$0.f36599q.m67603K(8388611);
    }

    @Override // p000.N03
    /* renamed from: Af */
    public void mo82197Af() {
        C49520tu6.m11239l(this.f36602t);
    }

    @Override // p000.N03
    /* renamed from: Ag */
    public void mo82196Ag(Integer num) {
        List<Number> listOf;
        boolean z;
        listOf = CollectionsKt__CollectionsKt.listOf((Object[]) new Integer[]{Integer.valueOf(C50583vi4.nav_my_bird), Integer.valueOf(C50583vi4.nav_my_birds), Integer.valueOf(C50583vi4.nav_private_birds)});
        for (Number number : listOf) {
            int intValue = number.intValue();
            MenuItem findItem = this.f36600r.m49298h().findItem(intValue);
            if (num != null && num.intValue() == intValue) {
                z = true;
            } else {
                z = false;
            }
            findItem.setVisible(z);
        }
    }

    @Override // p000.N03
    /* renamed from: D7 */
    public void mo82195D7(boolean z) {
        this.f36600r.m49298h().findItem(C50583vi4.nav_debug).setVisible(z);
    }

    @Override // p000.N03
    /* renamed from: K2 */
    public void mo82194K2(int i) {
        this.f36600r.m49298h().findItem(C50583vi4.nav_promo_center).setIcon(C29611vi.m8248b(getActivity(), i));
    }

    @Override // p000.N03
    /* renamed from: Mh */
    public void mo82193Mh(boolean z) {
        this.f36600r.m49298h().findItem(C50583vi4.nav_saftey).setVisible(z);
    }

    @Override // p000.N03
    /* renamed from: Sj */
    public Observable<Unit> mo82192Sj() {
        return C44626lf5.clicksThrottle$default(this.f36602t, 0L, 1, null);
    }

    @Override // p000.N03
    /* renamed from: We */
    public void mo82191We(boolean z) {
        this.f36600r.m49298h().findItem(C50583vi4.nav_save_money).setVisible(z);
    }

    @Override // p000.N03
    /* renamed from: al */
    public void mo82188al(boolean z) {
        this.f36600r.m49298h().findItem(C50583vi4.nav_configurable_tutorial_viewer).setVisible(z);
    }

    /* renamed from: cm */
    public void m82185cm(final InterfaceC38024aZ2 presenter) {
        Intrinsics.checkNotNullParameter(presenter, "presenter");
        this.f36600r.setNavigationItemSelectedListener(new NavigationView.InterfaceC17850c() { // from class: S03
            @Override // com.google.android.material.navigation.NavigationView.InterfaceC17850c
            /* renamed from: b */
            public final boolean mo49287b(MenuItem menuItem) {
                boolean m82183dm;
                m82183dm = U03.m82183dm(InterfaceC38024aZ2.this, menuItem);
                return m82183dm;
            }
        });
        C34585Ms2.m94663h(m88799Tl(), new C8170b(presenter));
    }

    @Override // p000.N03
    /* renamed from: d5 */
    public void mo82184d5(boolean z) {
        this.f36600r.m49298h().findItem(C50583vi4.nav_promo_center).setVisible(z);
    }

    @Override // p000.N03
    /* renamed from: e5 */
    public void mo82182e5(boolean z) {
        this.f36600r.m49298h().findItem(C50583vi4.nav_ride_pass).setVisible(z);
    }

    @Override // p000.N03
    /* renamed from: f2 */
    public void mo82180f2(boolean z) {
        this.f36600r.m49298h().findItem(C50583vi4.nav_insurance).setVisible(z);
    }

    @Override // p000.N03
    /* renamed from: me */
    public void mo82179me(boolean z) {
        this.f36600r.m49298h().findItem(C50583vi4.nav_free_rides).setVisible(z);
    }

    @Override // p000.N03
    /* renamed from: pf */
    public void mo82178pf(boolean z) {
        this.f36600r.m49298h().findItem(C50583vi4.nav_bird_plus).setVisible(z);
    }

    @Override // p000.N03
    /* renamed from: t2 */
    public void mo82177t2(boolean z, String title) {
        Intrinsics.checkNotNullParameter(title, "title");
        MenuItem findItem = this.f36600r.m49298h().findItem(C50583vi4.nav_shop);
        findItem.setVisible(z);
        findItem.setTitle(title);
    }

    @Override // p000.N03
    /* renamed from: u9 */
    public void mo82176u9(WireFrequentFlyerView progress) {
        Intrinsics.checkNotNullParameter(progress, "progress");
        this.f36602t.m58104a(progress);
        C49520tu6.m11233r(this.f36602t);
    }

    @Override // p000.N03
    /* renamed from: y5 */
    public void mo82175y5(String menuTitle, boolean z, DeliveryRequestKind kind) {
        boolean isBlank;
        Intrinsics.checkNotNullParameter(menuTitle, "menuTitle");
        Intrinsics.checkNotNullParameter(kind, "kind");
        MenuItem findItem = this.f36600r.m49298h().findItem(C50583vi4.nav_rental);
        if (kind == DeliveryRequestKind.LONG_TERM_RENTAL) {
            findItem.setVisible(z);
            isBlank = StringsKt__StringsJVMKt.isBlank(menuTitle);
            if (isBlank) {
                menuTitle = getString(C45871nl4.long_term_rental_menu_item, new Object[0]);
            }
            findItem.setTitle(menuTitle);
        }
    }

    @Override // p000.N03
    /* renamed from: yb */
    public Observable<EnumC45494n71> mo82174yb() {
        return this.f36604v;
    }
}
