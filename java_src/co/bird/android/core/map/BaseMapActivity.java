package co.bird.android.core.map;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.AbstractC11719f;
import co.bird.android.core.map.BaseMapActivity;
import co.bird.android.core.mvp.BaseActivity;
import co.bird.android.library.p021rx.scopeproviders.MapActivityScopeProvider;
import com.google.android.gms.maps.MapView;
import com.stripe.android.model.Stripe3ds2AuthResult;
import com.stripe.android.stripe3ds2.transactions.MessageExtension;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.ObservableSubscribeProxy;
import com.uber.autodispose.android.lifecycle.AndroidLifecycleScopeProvider;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.C23454a;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.rxkotlin.C24523e;
import io.reactivex.subjects.C24552a;
import io.reactivex.subjects.C24567g;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\b&\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010H\u001a\u00020G¢\u0006\u0004\bI\u0010JJ\u0012\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0014J\u0010\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0017J\u0010\u0010\n\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0017J*\u0010\u0010\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\b\u001a\u00020\u0007H\u0016J\b\u0010\u0011\u001a\u00020\u0005H\u0004J\b\u0010\u0012\u001a\u00020\u0005H\u0014J\b\u0010\u0013\u001a\u00020\u0005H\u0014J\b\u0010\u0014\u001a\u00020\u0005H\u0014J\b\u0010\u0015\u001a\u00020\u0005H\u0014J\b\u0010\u0016\u001a\u00020\u0005H\u0016J\u0010\u0010\u0018\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00020\u0003H\u0014J\"\u0010\u0019\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0004J\u001a\u0010\u001e\u001a\u00020\u00052\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cJ\u0010\u0010\u001e\u001a\u00020\u00052\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aJ\u000e\u0010\u001e\u001a\u00020\u00052\u0006\u0010\u001f\u001a\u00020\u000bJ\b\u0010 \u001a\u00020\u0005H\u0002R\u0017\u0010&\u001a\u00020!8\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u001a\u0010,\u001a\u00020'8\u0004X\u0084\u0004¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u001a\u00100\u001a\b\u0012\u0004\u0012\u00020\u00050-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\"\u0010\b\u001a\u0010\u0012\f\u0012\n 2*\u0004\u0018\u00010\u00070\u0007018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u001c\u00109\u001a\b\u0012\u0004\u0012\u000206058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u00108R\u001c\u0010?\u001a\u0004\u0018\u00010:8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>R\u0014\u0010B\u001a\u00020\u000b8eX¤\u0004¢\u0006\u0006\u001a\u0004\b@\u0010AR\u0014\u0010F\u001a\u00020C8$X¤\u0004¢\u0006\u0006\u001a\u0004\bD\u0010E¨\u0006K"}, m28432d2 = {"Lco/bird/android/core/map/BaseMapActivity;", "Lco/bird/android/core/mvp/BaseActivity;", "LUg3;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "LcD1;", "map", "onMapReady", "A0", "", "requestCode", "resultCode", "Landroid/content/Intent;", MessageExtension.FIELD_DATA, "q0", "onResume", "onStart", "onStop", "onPause", "onDestroy", "onLowMemory", "outState", "onSaveInstanceState", "onActivityResult", "Landroid/view/View;", "view", "Landroid/view/ViewGroup$LayoutParams;", "params", "setContentView", "layoutResID", "t0", "Lco/bird/android/library/rx/scopeproviders/MapActivityScopeProvider;", "B", "Lco/bird/android/library/rx/scopeproviders/MapActivityScopeProvider;", "getMapActivityScopeProvider", "()Lco/bird/android/library/rx/scopeproviders/MapActivityScopeProvider;", "mapActivityScopeProvider", "Lcom/uber/autodispose/android/lifecycle/AndroidLifecycleScopeProvider;", Stripe3ds2AuthResult.Ares.VALUE_CHALLENGE, "Lcom/uber/autodispose/android/lifecycle/AndroidLifecycleScopeProvider;", "p0", "()Lcom/uber/autodispose/android/lifecycle/AndroidLifecycleScopeProvider;", "mapScopeProvider", "Lio/reactivex/subjects/a;", "D", "Lio/reactivex/subjects/a;", "onResumeSubject", "Lio/reactivex/subjects/g;", "kotlin.jvm.PlatformType", "E", "Lio/reactivex/subjects/g;", "", "Ls5;", "F", "Ljava/util/List;", "activityResults", "LKp6;", "G", "LKp6;", "getLayoutBinding", "()LKp6;", "layoutBinding", "o0", "()I", "layoutResource", "Lcom/google/android/gms/maps/MapView;", "n0", "()Lcom/google/android/gms/maps/MapView;", "googleMapView", "", "noActionBar", "<init>", "(Z)V", "core-basemap_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nBaseMapActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BaseMapActivity.kt\nco/bird/android/core/map/BaseMapActivity\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/android/lifecycle/KotlinExtensionsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,175:1\n160#2,5:176\n1855#3,2:181\n*S KotlinDebug\n*F\n+ 1 BaseMapActivity.kt\nco/bird/android/core/map/BaseMapActivity\n*L\n65#1:176,5\n151#1:181,2\n*E\n"})
/* loaded from: classes2.dex */
public abstract class BaseMapActivity extends BaseActivity implements InterfaceC36350Ug3 {

    /* renamed from: B */
    public final MapActivityScopeProvider f63080B;

    /* renamed from: C */
    public final AndroidLifecycleScopeProvider f63081C;

    /* renamed from: D */
    public final C24552a<Unit> f63082D;

    /* renamed from: E */
    public final C24567g<C39011cD1> f63083E;

    /* renamed from: F */
    public List<C28175s5> f63084F;

    /* renamed from: G */
    public final InterfaceC34094Kp6 f63085G;

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u00032F\u0010\u0004\u001aB\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00030\u0003 \u0002* \u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lkotlin/Pair;", "LcD1;", "kotlin.jvm.PlatformType", "", "<name for destructuring parameter 0>", "invoke", "(Lkotlin/Pair;)V", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.core.map.BaseMapActivity$a */
    /* loaded from: classes2.dex */
    public static final class C14453a extends Lambda implements Function1<Pair<? extends C39011cD1, ? extends Unit>, Unit> {
        public C14453a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Pair<? extends C39011cD1, ? extends Unit> pair) {
            invoke2((Pair<? extends C39011cD1, Unit>) pair);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Pair<? extends C39011cD1, Unit> pair) {
            C39011cD1 map = pair.component1();
            BaseMapActivity.this.m58994t0();
            BaseMapActivity baseMapActivity = BaseMapActivity.this;
            Intrinsics.checkNotNullExpressionValue(map, "map");
            baseMapActivity.mo58947A0(map);
        }
    }

    public BaseMapActivity(boolean z) {
        super(z, null, null, 6, null);
        AbstractC11719f lifecycle = getLifecycle();
        Intrinsics.checkNotNullExpressionValue(lifecycle, "lifecycle");
        this.f63080B = new MapActivityScopeProvider(lifecycle);
        AndroidLifecycleScopeProvider m45193k = AndroidLifecycleScopeProvider.m45193k(getLifecycle(), AbstractC11719f.EnumC11720a.ON_PAUSE);
        Intrinsics.checkNotNullExpressionValue(m45193k, "from(lifecycle, /* until…Lifecycle.Event.ON_PAUSE)");
        this.f63081C = m45193k;
        C24552a<Unit> m31922e = C24552a.m31922e();
        Intrinsics.checkNotNullExpressionValue(m31922e, "create<Unit>()");
        this.f63082D = m31922e;
        C24567g<C39011cD1> m31882w0 = C24567g.m31882w0();
        Intrinsics.checkNotNullExpressionValue(m31882w0, "create<GoogleMap>()");
        this.f63083E = m31882w0;
        this.f63084F = new ArrayList();
    }

    public static final void onCreate$lambda$2(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: w0 */
    public static final void m58993w0(final BaseMapActivity this$0, final C39011cD1 it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        this$0.m58967S().post(new Runnable() { // from class: wB
            @Override // java.lang.Runnable
            public final void run() {
                BaseMapActivity.m58992x0(BaseMapActivity.this, it);
            }
        });
    }

    /* renamed from: x0 */
    public static final void m58992x0(BaseMapActivity this$0, C39011cD1 it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "$it");
        this$0.onMapReady(it);
        this$0.f63083E.onSuccess(it);
    }

    /* renamed from: A0 */
    public void mo58947A0(C39011cD1 map) {
        Intrinsics.checkNotNullParameter(map, "map");
        super.onResume();
        this.f63080B.m55974j(EnumC49172tK2.ON_RESUME);
    }

    public InterfaceC34094Kp6 getLayoutBinding() {
        return this.f63085G;
    }

    /* renamed from: n0 */
    public abstract MapView mo58944n0();

    /* renamed from: o0 */
    public abstract int mo58943o0();

    @Override // co.bird.android.core.base.BaseCoreActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        this.f63084F.add(new C28175s5(i, i2, intent));
        m58994t0();
    }

    @Override // co.bird.android.core.mvp.BaseActivity, co.bird.android.core.base.BaseCoreActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        View view;
        super.onCreate(bundle);
        this.f63080B.m55974j(EnumC49172tK2.ON_CREATE);
        C38500bM2.m64632a(this);
        Bundle bundle2 = null;
        if (getLayoutBinding() != null) {
            InterfaceC34094Kp6 layoutBinding = getLayoutBinding();
            if (layoutBinding != null) {
                view = layoutBinding.getRoot();
            } else {
                view = null;
            }
            super.setContentView(view);
        } else {
            super.setContentView(mo58943o0());
        }
        if (bundle != null) {
            bundle2 = bundle.getBundle("map");
        }
        mo58944n0().m50726a(new InterfaceC36350Ug3() { // from class: uB
            @Override // p000.InterfaceC36350Ug3
            public final void onMapReady(C39011cD1 c39011cD1) {
                BaseMapActivity.m58993w0(BaseMapActivity.this, c39011cD1);
            }
        });
        C24523e c24523e = C24523e.f91168a;
        Observable<C39011cD1> m33123k0 = this.f63083E.m33123k0();
        Intrinsics.checkNotNullExpressionValue(m33123k0, "map.toObservable()");
        Observable observeOn = c24523e.m31956a(m33123k0, this.f63082D).observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn, "Observables.combineLates…dSchedulers.mainThread())");
        Object m33094as = observeOn.m33094as(AutoDispose.m45239a(AndroidLifecycleScopeProvider.m45197b(this)));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.au…er.from(lifecycleOwner)))");
        final C14453a c14453a = new C14453a();
        ((ObservableSubscribeProxy) m33094as).subscribe(new InterfaceC23484g() { // from class: vB
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                BaseMapActivity.onCreate$lambda$2(Function1.this, obj);
            }
        });
        mo58944n0().m50725b(bundle2);
    }

    @Override // co.bird.android.core.mvp.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        mo58944n0().m50724c();
        super.onDestroy();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onLowMemory() {
        mo58944n0().m50723d();
        super.onLowMemory();
    }

    public void onMapReady(C39011cD1 map) {
        Intrinsics.checkNotNullParameter(map, "map");
        this.f63080B.m55974j(EnumC49172tK2.ON_MAP_READY);
    }

    @Override // co.bird.android.core.mvp.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        mo58944n0().m50722e();
        super.onPause();
    }

    @Override // co.bird.android.core.base.BaseCoreActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onResume() {
        mo58944n0().m50721f();
        this.f63082D.onNext(Unit.INSTANCE);
        super.onResume();
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onSaveInstanceState(Bundle outState) {
        Intrinsics.checkNotNullParameter(outState, "outState");
        if (outState.getBundle("map") == null) {
            outState.putBundle("map", new Bundle());
        }
        mo58944n0().m50720g(outState);
        super.onSaveInstanceState(outState);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStart() {
        mo58944n0().m50719h();
        super.onStart();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStop() {
        mo58944n0().m50718i();
        super.onStop();
    }

    /* renamed from: p0 */
    public final AndroidLifecycleScopeProvider m58995p0() {
        return this.f63081C;
    }

    /* renamed from: q0 */
    public void mo58942q0(int i, int i2, Intent intent, C39011cD1 map) {
        Intrinsics.checkNotNullParameter(map, "map");
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.activity.ComponentActivity, android.app.Activity
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        throw new IllegalStateException("BaseMapActivity: Do not call setContentView manually. Override val layoutResource instead.");
    }

    /* renamed from: t0 */
    public final void m58994t0() {
        C39011cD1 m31881x0 = this.f63083E.m31881x0();
        if (m31881x0 != null) {
            for (C28175s5 c28175s5 : this.f63084F) {
                mo58942q0(c28175s5.m14802a(), c28175s5.m14801b(), c28175s5.m14800c(), m31881x0);
            }
            this.f63084F.clear();
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.activity.ComponentActivity, android.app.Activity
    public final void setContentView(View view) {
        throw new IllegalStateException("BaseMapActivity: Do not call setContentView manually. Override val layoutResource instead.");
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.activity.ComponentActivity, android.app.Activity
    public final void setContentView(int i) {
        throw new IllegalStateException("BaseMapActivity: Do not call setContentView manually. Override val layoutResource instead.");
    }
}
