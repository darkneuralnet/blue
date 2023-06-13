package p000;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.C11894g;
import androidx.recyclerview.widget.LinearLayoutManager;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.feature.transferorder.operator.OperatorOrderActivity;
import co.bird.android.model.constant.OperatorOrderViewType;
import com.amazonaws.mobileconnectors.p025s3.transferutility.TransferTable;
import com.uber.autodispose.android.lifecycle.AndroidLifecycleScopeProvider;
import io.reactivex.InterfaceC23496h;
import io.reactivex.Observable;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.S74;
@Metadata(m28433d1 = {"\u0000\u009a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\bB\u0010CJ&\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016J\u001a\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016J\u0010\u0010\u0010\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016J\u0018\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0004\u001a\u00020\u0013H\u0016J\u0010\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u0015H\u0016J\u0010\u0010\u001a\u001a\u00020\f2\u0006\u0010\u0019\u001a\u00020\u0018H\u0016J\u001a\u0010\u001f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u001e0\u001c0\u001bH\u0016J\u000e\u0010 \u001a\b\u0012\u0004\u0012\u00020\f0\u001bH\u0016J\b\u0010\"\u001a\u00020!H\u0016R\"\u0010*\u001a\u00020#8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\u0016\u0010.\u001a\u00020+8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u00102\u001a\u00020/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0014\u00106\u001a\u0002038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u001b\u0010<\u001a\u0002078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b:\u0010;R\"\u0010A\u001a\u0010\u0012\f\u0012\n >*\u0004\u0018\u00010\f0\f0=8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@¨\u0006D"}, m28432d2 = {"Lrp3;", "Landroidx/fragment/app/Fragment;", "LEp3;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "view", "", "onViewCreated", "", "hidden", "onHiddenChanged", "Landroid/view/Menu;", "menu", "Landroid/view/MenuInflater;", "onCreateOptionsMenu", "Landroid/view/MenuItem;", "item", "onOptionsItemSelected", "LFp3;", TransferTable.COLUMN_STATE, "t8", "Lio/reactivex/Observable;", "Lkotlin/Pair;", "", "Lco/bird/android/model/constant/OperatorOrderViewType;", "N4", "m3", "Lio/reactivex/h;", "T0", "LCp3;", "b", "LCp3;", "N6", "()LCp3;", "setPresenter", "(LCp3;)V", "presenter", "Lsy1;", "c", "Lsy1;", "binding", "Lqp3;", DateTokenConverter.CONVERTER_KEY, "Lqp3;", "converter", "Lop3;", "e", "Lop3;", "adapter", "Lsx4;", "f", "Lkotlin/Lazy;", "a5", "()Lsx4;", "defaultRenderer", "Lma4;", "kotlin.jvm.PlatformType", "g", "Lma4;", "refreshRelay", "<init>", "()V", "co.bird.android.feature.transfer-order"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nOperatorOrderLandingFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OperatorOrderLandingFragment.kt\nco/bird/android/feature/transferorder/operator/landing/OperatorOrderLandingFragment\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 KotlinExtensions.kt\ncom/uber/autodispose/android/lifecycle/KotlinExtensionsKt\n*L\n1#1,112:1\n1#2:113\n64#3:114\n*S KotlinDebug\n*F\n+ 1 OperatorOrderLandingFragment.kt\nco/bird/android/feature/transferorder/operator/landing/OperatorOrderLandingFragment\n*L\n109#1:114\n*E\n"})
/* renamed from: rp3  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C48282rp3 extends Fragment implements InterfaceC32687Ep3 {

    /* renamed from: b */
    public C32219Cp3 f107706b;

    /* renamed from: c */
    public C48962sy1 f107707c;

    /* renamed from: d */
    public final C47689qp3 f107708d = new C47689qp3();

    /* renamed from: e */
    public final C46503op3 f107709e = new C46503op3();

    /* renamed from: f */
    public final Lazy f107710f;

    /* renamed from: g */
    public final C45168ma4<Unit> f107711g;

    @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"Lsx4;", "b", "()Lsx4;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: rp3$a */
    /* loaded from: classes3.dex */
    public static final class C28017a extends Lambda implements Function0<C48955sx4> {
        public C28017a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b */
        public final C48955sx4 invoke() {
            FragmentActivity activity = C48282rp3.this.getActivity();
            Intrinsics.checkNotNull(activity, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
            return new C48955sx4((AppCompatActivity) activity);
        }
    }

    public C48282rp3() {
        Lazy lazy;
        lazy = LazyKt__LazyJVMKt.lazy(new C28017a());
        this.f107710f = lazy;
        C45168ma4<Unit> m25409g = C45168ma4.m25409g();
        Intrinsics.checkNotNullExpressionValue(m25409g, "create<Unit>()");
        this.f107711g = m25409g;
    }

    @Override // p000.InterfaceC32687Ep3
    /* renamed from: N4 */
    public Observable<Pair<String, OperatorOrderViewType>> mo15314N4() {
        return this.f107709e.m20470N4();
    }

    /* renamed from: N6 */
    public final C32219Cp3 m15313N6() {
        C32219Cp3 c32219Cp3 = this.f107706b;
        if (c32219Cp3 != null) {
            return c32219Cp3;
        }
        Intrinsics.throwUninitializedPropertyAccessException("presenter");
        return null;
    }

    @Override // com.uber.autodispose.ScopeProvider
    /* renamed from: T0 */
    public InterfaceC23496h mo231T0() {
        AndroidLifecycleScopeProvider m45195i = AndroidLifecycleScopeProvider.m45195i(this, C43626jy1.f93627b);
        Intrinsics.checkExpressionValueIsNotNull(m45195i, "AndroidLifecycleScopePro…m(this, boundaryResolver)");
        InterfaceC23496h mo231T0 = m45195i.mo231T0();
        Intrinsics.checkNotNullExpressionValue(mo231T0, "scope(FragmentLifecycleResolver).requestScope()");
        return mo231T0;
    }

    /* renamed from: a5 */
    public final C48955sx4 m15312a5() {
        return (C48955sx4) this.f107710f.getValue();
    }

    @Override // p000.InterfaceC32687Ep3
    /* renamed from: m3 */
    public Observable<Unit> mo15311m3() {
        Observable<Unit> hide = this.f107711g.hide();
        Intrinsics.checkNotNullExpressionValue(hide, "refreshRelay.hide()");
        return hide;
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
        Drawable mutate;
        Intrinsics.checkNotNullParameter(menu, "menu");
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        super.onCreateOptionsMenu(menu, inflater);
        inflater.inflate(C36153Tk4.menu_operator_landing, menu);
        Drawable icon = menu.findItem(C39912di4.refresh).getIcon();
        if (icon != null && (mutate = icon.mutate()) != null) {
            mutate.setTint(-1);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        return C48962sy1.m13301c(inflater, viewGroup, false).getRoot();
    }

    @Override // androidx.fragment.app.Fragment
    public void onHiddenChanged(boolean z) {
        OperatorOrderActivity operatorOrderActivity;
        ActionBar supportActionBar;
        super.onHiddenChanged(z);
        FragmentActivity activity = getActivity();
        if (activity != null) {
            activity.invalidateOptionsMenu();
        }
        if (!z) {
            FragmentActivity activity2 = getActivity();
            if (activity2 instanceof OperatorOrderActivity) {
                operatorOrderActivity = (OperatorOrderActivity) activity2;
            } else {
                operatorOrderActivity = null;
            }
            if (operatorOrderActivity != null && (supportActionBar = operatorOrderActivity.getSupportActionBar()) != null) {
                supportActionBar.mo70243D(C45871nl4.drawer_operator_transfer_order);
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public boolean onOptionsItemSelected(MenuItem item) {
        Intrinsics.checkNotNullParameter(item, "item");
        if (item.getItemId() == C39912di4.refresh) {
            this.f107711g.accept(Unit.INSTANCE);
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        OperatorOrderActivity operatorOrderActivity;
        Intrinsics.checkNotNullParameter(view, "view");
        C48962sy1 m13303a = C48962sy1.m13303a(view);
        Intrinsics.checkNotNullExpressionValue(m13303a, "bind(view)");
        this.f107707c = m13303a;
        FragmentActivity activity = getActivity();
        C48962sy1 c48962sy1 = null;
        if (activity instanceof OperatorOrderActivity) {
            operatorOrderActivity = (OperatorOrderActivity) activity;
        } else {
            operatorOrderActivity = null;
        }
        if (operatorOrderActivity == null) {
            return;
        }
        operatorOrderActivity.m56543P().mo56526b(this);
        ActionBar supportActionBar = operatorOrderActivity.getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.mo70243D(C45871nl4.drawer_operator_transfer_order);
        }
        C48962sy1 c48962sy12 = this.f107707c;
        if (c48962sy12 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            c48962sy12 = null;
        }
        c48962sy12.getRoot().setLayoutManager(new LinearLayoutManager(operatorOrderActivity));
        C48962sy1 c48962sy13 = this.f107707c;
        if (c48962sy13 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            c48962sy13 = null;
        }
        c48962sy13.getRoot().setAdapter(this.f107709e);
        C48962sy1 c48962sy14 = this.f107707c;
        if (c48962sy14 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            c48962sy1 = c48962sy14;
        }
        c48962sy1.getRoot().setItemAnimator(new C11894g());
        setHasOptionsMenu(true);
        m15313N6().consume(this);
    }

    @Override // p000.InterfaceC48362rx4
    /* renamed from: t8 */
    public void render(AbstractC32921Fp3 state) {
        Intrinsics.checkNotNullParameter(state, "state");
        if (state instanceof C51877xt2) {
            S74.C7343a.showProgress$default(m15312a5(), ((C51877xt2) state).m4508b(), 0, 2, null);
        } else if (state instanceof C46928pY3) {
            S74.C7343a.showProgress$default(m15312a5(), false, 0, 2, null);
            this.f107709e.mo24871u(this.f107708d.m16951a(((C46928pY3) state).m19126b()));
        } else if (state instanceof C37509Zf1) {
            S74.C7343a.showProgress$default(m15312a5(), false, 0, 2, null);
            C38689bg5.m64178c(m15312a5(), ((C37509Zf1) state).m72796b());
        }
    }
}
