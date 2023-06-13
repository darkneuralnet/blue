package p000;

import android.app.Application;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.AbstractC11719f;
import androidx.viewpager2.widget.ViewPager2;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.core.mvp.BaseActivity;
import co.bird.android.model.constant.FleetReportPage;
import com.amazonaws.mobileconnectors.p025s3.transferutility.TransferTable;
import com.facebook.share.internal.C17296a;
import com.google.android.material.tabs.C17914b;
import com.google.android.material.tabs.TabLayout;
import com.uber.autodispose.android.lifecycle.AndroidLifecycleScopeProvider;
import io.reactivex.InterfaceC23496h;
import io.reactivex.Observable;
import io.reactivex.functions.InterfaceC23480c;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsJVMKt;
import p000.InterfaceC32001Br1;
@Metadata(m28433d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\t\u0018\u0000 <2\u00020\u00012\u00020\u0002:\u0001=B\u0007¢\u0006\u0004\b:\u0010;J&\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016J\u001a\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016J\u0010\u0010\u0010\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016J\b\u0010\u0012\u001a\u00020\u0011H\u0016J\u000e\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013H\u0016J\u0014\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u00160\u0013H\u0016J\u000e\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00170\u0013H\u0016R\"\u0010!\u001a\u00020\u001a8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\"\u0010)\u001a\u00020\"8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\u0016\u0010-\u001a\u00020*8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b+\u0010,R\"\u00102\u001a\u0010\u0012\f\u0012\n /*\u0004\u0018\u00010\u00140\u00140.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R.\u00104\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0017 /*\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u00160\u00160.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00101R\"\u00107\u001a\u0010\u0012\f\u0012\n /*\u0004\u0018\u000105050.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00101R\"\u00109\u001a\u0010\u0012\f\u0012\n /*\u0004\u0018\u00010\u00170\u00170.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00101¨\u0006>"}, m28432d2 = {"Lzr1;", "Landroidx/fragment/app/Fragment;", "LHr1;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "view", "", "onViewCreated", "LIr1;", TransferTable.COLUMN_STATE, "D9", "Lio/reactivex/h;", "T0", "Lio/reactivex/Observable;", "", "l5", "", "Lco/bird/android/model/constant/FleetReportPage;", "r5", "n5", "LGr1;", "b", "LGr1;", "A9", "()LGr1;", "setPresenter", "(LGr1;)V", "presenter", "LAr1;", "c", "LAr1;", "t8", "()LAr1;", "setAdapter", "(LAr1;)V", "adapter", "Lgy1;", DateTokenConverter.CONVERTER_KEY, "Lgy1;", "binding", "Lma4;", "kotlin.jvm.PlatformType", "e", "Lma4;", "fleetId", "f", "fleetPages", "", "g", "fleetPageSelected", "h", "selectFleetReportPage", "<init>", "()V", "i", C17296a.f69688o, "co.bird.android.feature.fleet-status"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nFleetTabFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FleetTabFragment.kt\nco/bird/android/feature/fleetstatus/common/FleetTabFragment\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Bundle+.kt\nco/bird/android/library/extension/Bundle_Kt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 5 Enum+.kt\nco/bird/android/library/extension/Enum_Kt\n+ 6 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 7 KotlinExtensions.kt\ncom/uber/autodispose/android/lifecycle/KotlinExtensionsKt\n*L\n1#1,146:1\n1#2:147\n1#2:160\n15#3:148\n6#3:159\n1549#4:149\n1620#4,2:150\n1622#4:158\n13#5,2:152\n15#5,2:156\n13#5,2:161\n15#5,2:165\n1109#6,2:154\n1109#6,2:163\n44#7:167\n*S KotlinDebug\n*F\n+ 1 FleetTabFragment.kt\nco/bird/android/feature/fleetstatus/common/FleetTabFragment\n*L\n94#1:160\n93#1:148\n94#1:159\n93#1:149\n93#1:150,2\n93#1:158\n93#1:152,2\n93#1:156,2\n94#1:161,2\n94#1:165,2\n93#1:154,2\n94#1:163,2\n118#1:167\n*E\n"})
/* renamed from: zr1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C53042zr1 extends Fragment implements InterfaceC33405Hr1 {

    /* renamed from: i */
    public static final C31572a f122378i = new C31572a(null);

    /* renamed from: b */
    public C33171Gr1 f122379b;

    /* renamed from: c */
    public C31767Ar1 f122380c;

    /* renamed from: d */
    public C41847gy1 f122381d;

    /* renamed from: e */
    public final C45168ma4<String> f122382e;

    /* renamed from: f */
    public final C45168ma4<List<FleetReportPage>> f122383f;

    /* renamed from: g */
    public final C45168ma4<Integer> f122384g;

    /* renamed from: h */
    public final C45168ma4<FleetReportPage> f122385h;

    @Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000f\u0010\u0010J2\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u00022\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006R\u0014\u0010\u000b\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\fR\u0014\u0010\u000e\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\f¨\u0006\u0011"}, m28432d2 = {"Lzr1$a;", "", "", "fleetId", "fleetName", "", "Lco/bird/android/model/constant/FleetReportPage;", "fleetTabs", "goToFleetReportPage", "Lzr1;", C17296a.f69688o, "FLEET_NAME", "Ljava/lang/String;", "FLEET_TABS", "SELECT_FLEET_TAB", "<init>", "()V", "co.bird.android.feature.fleet-status"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: zr1$a */
    /* loaded from: classes3.dex */
    public static final class C31572a {
        public /* synthetic */ C31572a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ C53042zr1 newInstance$default(C31572a c31572a, String str, String str2, List list, FleetReportPage fleetReportPage, int i, Object obj) {
            if ((i & 8) != 0) {
                fleetReportPage = null;
            }
            return c31572a.m225a(str, str2, list, fleetReportPage);
        }

        /* renamed from: a */
        public final C53042zr1 m225a(String fleetId, String str, List<? extends FleetReportPage> fleetTabs, FleetReportPage fleetReportPage) {
            Intrinsics.checkNotNullParameter(fleetId, "fleetId");
            Intrinsics.checkNotNullParameter(fleetTabs, "fleetTabs");
            C53042zr1 c53042zr1 = new C53042zr1();
            Bundle bundle = new Bundle();
            bundle.putString("fleet_id", fleetId);
            bundle.putString("fleet_name", str);
            C40749f70.m42019b(bundle, "fleet_tabs", fleetTabs);
            C40749f70.m42020a(bundle, "select_fleet_tab", fleetReportPage);
            c53042zr1.setArguments(bundle);
            return c53042zr1;
        }

        private C31572a() {
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: zr1$b */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C31573b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[FleetReportPage.values().length];
            try {
                iArr[FleetReportPage.CORE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[FleetReportPage.INSIGHTS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, m28432d2 = {"zr1$c", "Landroidx/viewpager2/widget/ViewPager2$i;", "", "position", "", "c", "co.bird.android.feature.fleet-status"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: zr1$c */
    /* loaded from: classes3.dex */
    public static final class C31574c extends ViewPager2.AbstractC12103i {
        public C31574c() {
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AbstractC12103i
        /* renamed from: c */
        public void mo224c(int i) {
            C53042zr1.this.f122384g.accept(Integer.valueOf(i));
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"", "idx", "LIr1;", TransferTable.COLUMN_STATE, "Lco/bird/android/model/constant/FleetReportPage;", C17296a.f69688o, "(Ljava/lang/Integer;LIr1;)Lco/bird/android/model/constant/FleetReportPage;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: zr1$d */
    /* loaded from: classes3.dex */
    public static final class C31575d extends Lambda implements Function2<Integer, C33639Ir1, FleetReportPage> {

        /* renamed from: g */
        public static final C31575d f122387g = new C31575d();

        public C31575d() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a */
        public final FleetReportPage invoke(Integer idx, C33639Ir1 state) {
            Intrinsics.checkNotNullParameter(idx, "idx");
            Intrinsics.checkNotNullParameter(state, "state");
            return state.m101596c().get(idx.intValue());
        }
    }

    public C53042zr1() {
        C45168ma4<String> m25409g = C45168ma4.m25409g();
        Intrinsics.checkNotNullExpressionValue(m25409g, "create<String>()");
        this.f122382e = m25409g;
        C45168ma4<List<FleetReportPage>> m25409g2 = C45168ma4.m25409g();
        Intrinsics.checkNotNullExpressionValue(m25409g2, "create<List<FleetReportPage>>()");
        this.f122383f = m25409g2;
        C45168ma4<Integer> m25409g3 = C45168ma4.m25409g();
        Intrinsics.checkNotNullExpressionValue(m25409g3, "create<Int>()");
        this.f122384g = m25409g3;
        C45168ma4<FleetReportPage> m25409g4 = C45168ma4.m25409g();
        Intrinsics.checkNotNullExpressionValue(m25409g4, "create<FleetReportPage>()");
        this.f122385h = m25409g4;
    }

    /* renamed from: B9 */
    public static final FleetReportPage m235B9(Function2 tmp0, Object obj, Object obj2) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (FleetReportPage) tmp0.invoke(obj, obj2);
    }

    /* renamed from: E9 */
    public static final void m233E9(C33639Ir1 state, C53042zr1 this$0, TabLayout.C17910g tab, int i) {
        String string;
        Intrinsics.checkNotNullParameter(state, "$state");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(tab, "tab");
        int i2 = C31573b.$EnumSwitchMapping$0[state.m101596c().get(i).ordinal()];
        if (i2 != 1) {
            if (i2 == 2) {
                string = this$0.getString(C45871nl4.insights);
            } else {
                throw new NoWhenBranchMatchedException();
            }
        } else {
            string = this$0.getString(C45871nl4.core);
        }
        tab.m48705r(string);
    }

    /* renamed from: A9 */
    public final C33171Gr1 m236A9() {
        C33171Gr1 c33171Gr1 = this.f122379b;
        if (c33171Gr1 != null) {
            return c33171Gr1;
        }
        Intrinsics.throwUninitializedPropertyAccessException("presenter");
        return null;
    }

    @Override // p000.InterfaceC48362rx4
    /* renamed from: D9 */
    public void render(final C33639Ir1 state) {
        Intrinsics.checkNotNullParameter(state, "state");
        String m101597b = state.m101597b();
        if (m101597b != null) {
            m226t8().m115111P(m101597b, state.m101596c());
        }
        C41847gy1 c41847gy1 = null;
        if (!state.m101596c().isEmpty()) {
            C41847gy1 c41847gy12 = this.f122381d;
            if (c41847gy12 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                c41847gy12 = null;
            }
            TabLayout tabLayout = c41847gy12.f84549b;
            C41847gy1 c41847gy13 = this.f122381d;
            if (c41847gy13 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                c41847gy13 = null;
            }
            new C17914b(tabLayout, c41847gy13.f84550c, new C17914b.InterfaceC17916b() { // from class: xr1
                @Override // com.google.android.material.tabs.C17914b.InterfaceC17916b
                /* renamed from: a */
                public final void mo4558a(TabLayout.C17910g c17910g, int i) {
                    C53042zr1.m233E9(C33639Ir1.this, this, c17910g, i);
                }
            }).m48699a();
        }
        FleetReportPage m101595d = state.m101595d();
        if (m101595d != null) {
            C41847gy1 c41847gy14 = this.f122381d;
            if (c41847gy14 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                c41847gy1 = c41847gy14;
            }
            c41847gy1.f84550c.setCurrentItem(state.m101596c().indexOf(m101595d));
        }
    }

    @Override // com.uber.autodispose.ScopeProvider
    /* renamed from: T0 */
    public InterfaceC23496h mo231T0() {
        AndroidLifecycleScopeProvider m45197b = AndroidLifecycleScopeProvider.m45197b(this);
        Intrinsics.checkExpressionValueIsNotNull(m45197b, "AndroidLifecycleScopeProvider.from(this)");
        InterfaceC23496h mo231T0 = m45197b.mo231T0();
        Intrinsics.checkNotNullExpressionValue(mo231T0, "scope().requestScope()");
        return mo231T0;
    }

    @Override // p000.InterfaceC33405Hr1
    /* renamed from: l5 */
    public Observable<String> mo229l5() {
        Observable<String> hide = this.f122382e.hide();
        Intrinsics.checkNotNullExpressionValue(hide, "fleetId.hide()");
        return hide;
    }

    @Override // p000.InterfaceC33405Hr1
    /* renamed from: n5 */
    public Observable<FleetReportPage> mo228n5() {
        C45168ma4<Integer> c45168ma4 = this.f122384g;
        Observable<C33639Ir1> m42276l = m236A9().m42276l();
        final C31575d c31575d = C31575d.f122387g;
        Observable<FleetReportPage> distinctUntilChanged = Observable.merge(c45168ma4.withLatestFrom(m42276l, new InterfaceC23480c() { // from class: yr1
            @Override // io.reactivex.functions.InterfaceC23480c
            public final Object apply(Object obj, Object obj2) {
                FleetReportPage m235B9;
                m235B9 = C53042zr1.m235B9(Function2.this, obj, obj2);
                return m235B9;
            }
        }), this.f122385h).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(distinctUntilChanged, "merge(\n    fleetPageSele…  .distinctUntilChanged()");
        return distinctUntilChanged;
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        return C41847gy1.m37274c(inflater).getRoot();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        BaseActivity baseActivity;
        Enum r3;
        boolean equals;
        Collection emptyList;
        int collectionSizeOrDefault;
        Enum r15;
        Object[] enumConstants;
        int i;
        boolean equals2;
        String string;
        Intrinsics.checkNotNullParameter(view, "view");
        C41847gy1 m37276a = C41847gy1.m37276a(view);
        Intrinsics.checkNotNullExpressionValue(m37276a, "bind(view)");
        this.f122381d = m37276a;
        FragmentActivity activity = getActivity();
        if (activity instanceof BaseActivity) {
            baseActivity = (BaseActivity) activity;
        } else {
            baseActivity = null;
        }
        if (baseActivity == null) {
            return;
        }
        InterfaceC32001Br1.InterfaceC0753a m8916a = C50346vJ0.m8916a();
        C46172oG2 c46172oG2 = C46172oG2.f101711a;
        Application application = baseActivity.getApplication();
        Intrinsics.checkNotNullExpressionValue(application, "activity.application");
        InterfaceC44393lG2 m21419a = c46172oG2.m21419a(application);
        FragmentManager supportFragmentManager = baseActivity.getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "activity.supportFragmentManager");
        AbstractC11719f lifecycle = baseActivity.getLifecycle();
        Intrinsics.checkNotNullExpressionValue(lifecycle, "activity.lifecycle");
        m8916a.mo8915a(m21419a, supportFragmentManager, lifecycle).mo8914a(this);
        C41847gy1 c41847gy1 = this.f122381d;
        if (c41847gy1 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            c41847gy1 = null;
        }
        c41847gy1.f84550c.setAdapter(m226t8());
        C41847gy1 c41847gy12 = this.f122381d;
        if (c41847gy12 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            c41847gy12 = null;
        }
        c41847gy12.f84550c.m65690n(new C31574c());
        m236A9().consume(this);
        Bundle arguments = getArguments();
        if (arguments != null && (string = arguments.getString("fleet_id")) != null) {
            this.f122382e.accept(string);
        }
        Bundle arguments2 = getArguments();
        if (arguments2 != null) {
            ArrayList<String> stringArrayList = arguments2.getStringArrayList("fleet_tabs");
            if (stringArrayList != null) {
                collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(stringArrayList, 10);
                emptyList = new ArrayList(collectionSizeOrDefault);
                for (String name : stringArrayList) {
                    Intrinsics.checkNotNullExpressionValue(name, "name");
                    try {
                        enumConstants = FleetReportPage.class.getEnumConstants();
                        Intrinsics.checkNotNull(enumConstants);
                    } catch (Exception unused) {
                        Object[] enumConstants2 = FleetReportPage.class.getEnumConstants();
                        Intrinsics.checkNotNull(enumConstants2);
                        for (Object obj : enumConstants2) {
                            r15 = (Enum) obj;
                            if (Intrinsics.areEqual(r15.name(), "UNKNOWN")) {
                                Intrinsics.checkNotNullExpressionValue(obj, "{\n    E::class.java.enum…m.name == \"UNKNOWN\" }\n  }");
                            }
                        }
                        throw new NoSuchElementException("Array contains no element matching the predicate.");
                    }
                    for (Object obj2 : enumConstants) {
                        equals2 = StringsKt__StringsJVMKt.equals(((Enum) obj2).name(), name, true);
                        if (equals2) {
                            Intrinsics.checkNotNullExpressionValue(obj2, "{\n    E::class.java.enum….equals(name, true) }\n  }");
                            r15 = (Enum) obj2;
                            emptyList.add(r15);
                        }
                    }
                    throw new NoSuchElementException("Array contains no element matching the predicate.");
                }
            } else {
                emptyList = CollectionsKt__CollectionsKt.emptyList();
            }
            if (emptyList != null) {
                this.f122383f.accept(emptyList);
            }
        }
        Bundle arguments3 = getArguments();
        if (arguments3 != null) {
            String string2 = arguments3.getString("select_fleet_tab");
            if (string2 != null) {
                try {
                    Object[] enumConstants3 = FleetReportPage.class.getEnumConstants();
                    Intrinsics.checkNotNull(enumConstants3);
                    for (Object obj3 : enumConstants3) {
                        equals = StringsKt__StringsJVMKt.equals(((Enum) obj3).name(), string2, true);
                        if (equals) {
                            Intrinsics.checkNotNullExpressionValue(obj3, "{\n    E::class.java.enum….equals(name, true) }\n  }");
                            r3 = (Enum) obj3;
                        }
                    }
                    throw new NoSuchElementException("Array contains no element matching the predicate.");
                } catch (Exception unused2) {
                    Object[] enumConstants4 = FleetReportPage.class.getEnumConstants();
                    Intrinsics.checkNotNull(enumConstants4);
                    for (Object obj4 : enumConstants4) {
                        Enum r8 = (Enum) obj4;
                        if (Intrinsics.areEqual(r8.name(), "UNKNOWN")) {
                            Intrinsics.checkNotNullExpressionValue(obj4, "{\n    E::class.java.enum…m.name == \"UNKNOWN\" }\n  }");
                            r3 = r8;
                        }
                    }
                    throw new NoSuchElementException("Array contains no element matching the predicate.");
                }
            }
            r3 = null;
            FleetReportPage fleetReportPage = (FleetReportPage) r3;
            if (fleetReportPage != null) {
                this.f122385h.accept(fleetReportPage);
            }
        }
    }

    @Override // p000.InterfaceC33405Hr1
    /* renamed from: r5 */
    public Observable<List<FleetReportPage>> mo227r5() {
        Observable<List<FleetReportPage>> hide = this.f122383f.hide();
        Intrinsics.checkNotNullExpressionValue(hide, "fleetPages.hide()");
        return hide;
    }

    /* renamed from: t8 */
    public final C31767Ar1 m226t8() {
        C31767Ar1 c31767Ar1 = this.f122380c;
        if (c31767Ar1 != null) {
            return c31767Ar1;
        }
        Intrinsics.throwUninitializedPropertyAccessException("adapter");
        return null;
    }
}
