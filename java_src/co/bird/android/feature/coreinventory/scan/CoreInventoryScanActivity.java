package co.bird.android.feature.coreinventory.scan;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ImageButton;
import androidx.recyclerview.widget.C11894g;
import androidx.recyclerview.widget.C11925l;
import androidx.recyclerview.widget.LinearLayoutManager;
import co.bird.android.core.mrp.BaseActivityLite;
import co.bird.android.feature.coreinventory.scan.CoreInventoryScanActivity;
import co.bird.android.feature.coreinventory.scan.CoreInventoryScanRenderer;
import co.bird.android.feature.coreinventory.scan.adapters.CoreInventoryScanAdapter;
import co.bird.android.feature.coreinventory.scan.adapters.CoreInventoryScanConverter;
import co.bird.android.model.constant.VehicleInventoryAction;
import co.bird.android.model.wire.WireVehicleInventoryScan;
import com.amazonaws.mobileconnectors.p025s3.transferutility.TransferTable;
import com.google.android.material.progressindicator.LinearProgressIndicator;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.MaybeSubscribeProxy;
import com.uber.autodispose.ObservableSubscribeProxy;
import com.uber.autodispose.SingleSubscribeProxy;
import io.reactivex.AbstractC23442F;
import io.reactivex.AbstractC24507p;
import io.reactivex.Observable;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.functions.InterfaceC23492o;
import io.reactivex.functions.InterfaceC23494q;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsJVMKt;
import p000.H31;
@Metadata(m28433d1 = {"\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 W2\u00020\u00012\u00020\u0002:\u0001XB\u0007¢\u0006\u0004\bU\u0010VJ\u0012\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0014J\b\u0010\u0007\u001a\u00020\u0005H\u0014J\b\u0010\b\u001a\u00020\u0005H\u0014J\u0010\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016J\b\u0010\r\u001a\u00020\u0005H\u0016J\u0010\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u000eH\u0016J\u000e\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011H\u0016J\u000e\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00050\u0011H\u0016J\u000e\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00050\u0011H\u0016J\u000e\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00050\u0011H\u0016J\u000e\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00050\u0011H\u0016J\u000e\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00050\u0011H\u0016J\u000e\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u0011H\u0016J\u001c\u0010\u001c\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0019\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u001b0\u0011H\u0016J\u000e\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u0011H\u0016J\u000e\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00050\u0011H\u0016R\"\u0010'\u001a\u00020 8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\"\u0010/\u001a\u00020(8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\u0014\u00103\u001a\u0002008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u001b\u00109\u001a\u0002048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u00108R\u001b\u0010>\u001a\u00020:8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b;\u00106\u001a\u0004\b<\u0010=R\u0016\u0010B\u001a\u00020?8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b@\u0010AR\"\u0010G\u001a\u0010\u0012\f\u0012\n D*\u0004\u0018\u00010\u00120\u00120C8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010FR\"\u0010I\u001a\u0010\u0012\f\u0012\n D*\u0004\u0018\u00010\u00050\u00050C8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010FR>\u0010K\u001a,\u0012(\u0012&\u0012\u0004\u0012\u00020\u0019\u0012\u0006\u0012\u0004\u0018\u00010\u000b D*\u0012\u0012\u0004\u0012\u00020\u0019\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0018\u00010\u001b0\u001b0C8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bJ\u0010FR\"\u0010M\u001a\u0010\u0012\f\u0012\n D*\u0004\u0018\u00010\u00050\u00050C8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bL\u0010FR\"\u0010O\u001a\u0010\u0012\f\u0012\n D*\u0004\u0018\u00010\u00050\u00050C8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bN\u0010FR\u001b\u0010T\u001a\u00020P8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\bQ\u00106\u001a\u0004\bR\u0010S¨\u0006Y"}, m28432d2 = {"Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanActivity;", "Lco/bird/android/core/mrp/BaseActivityLite;", "Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanRenderer;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "onResume", "onPause", "Landroid/view/MenuItem;", "item", "", "onOptionsItemSelected", "onBackPressed", "Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanState;", TransferTable.COLUMN_STATE, "p0", "Lio/reactivex/Observable;", "Lco/bird/android/model/constant/VehicleInventoryAction;", "K1", "c1", "I2", "b8", "z1", "W", "Lco/bird/android/model/wire/WireVehicleInventoryScan;", "A1", "Lkotlin/Pair;", "V", "", "T", "G", "Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanPresenter;", "j", "Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanPresenter;", "i0", "()Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanPresenter;", "setPresenter", "(Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanPresenter;)V", "presenter", "Lco/bird/android/feature/coreinventory/scan/adapters/CoreInventoryScanConverter;", "k", "Lco/bird/android/feature/coreinventory/scan/adapters/CoreInventoryScanConverter;", "f0", "()Lco/bird/android/feature/coreinventory/scan/adapters/CoreInventoryScanConverter;", "setConverter", "(Lco/bird/android/feature/coreinventory/scan/adapters/CoreInventoryScanConverter;)V", "converter", "Lco/bird/android/feature/coreinventory/scan/adapters/CoreInventoryScanAdapter;", "l", "Lco/bird/android/feature/coreinventory/scan/adapters/CoreInventoryScanAdapter;", "adapter", "LmX5;", "m", "Lkotlin/Lazy;", "j0", "()LmX5;", "swipeHelper", "Landroidx/recyclerview/widget/l;", "n", "h0", "()Landroidx/recyclerview/widget/l;", "itemTouchHelper", "Lf00;", "o", "Lf00;", "binding", "Lma4;", "kotlin.jvm.PlatformType", "p", "Lma4;", "actionRelay", "q", "confirmProcessRelay", "r", "undoDeleteRelay", "s", "backPressRelay", "t", "exitConfirmRelay", "LRk5;", "u", "w1", "()LRk5;", "rendererDelegate", "<init>", "()V", "v", "Companion", "core-inventory_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nCoreInventoryScanActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoreInventoryScanActivity.kt\nco/bird/android/feature/coreinventory/scan/CoreInventoryScanActivity\n+ 2 Intent+.kt\nco/bird/android/library/extension/Intent_Kt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Enum+.kt\nco/bird/android/library/extension/Enum_Kt\n+ 5 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 6 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n+ 7 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,222:1\n6#2:223\n1#3:224\n1#3:233\n13#4,2:225\n15#4,2:229\n1109#5,2:227\n180#6:231\n180#6:232\n218#6:237\n218#6:238\n199#6:239\n199#6:240\n1726#7,3:234\n*S KotlinDebug\n*F\n+ 1 CoreInventoryScanActivity.kt\nco/bird/android/feature/coreinventory/scan/CoreInventoryScanActivity\n*L\n77#1:223\n77#1:224\n77#1:225,2\n77#1:229,2\n77#1:227,2\n95#1:231\n99#1:232\n167#1:237\n175#1:238\n180#1:239\n185#1:240\n141#1:234,3\n*E\n"})
/* loaded from: classes3.dex */
public final class CoreInventoryScanActivity extends BaseActivityLite implements CoreInventoryScanRenderer {

    /* renamed from: v */
    public static final Companion f63805v = new Companion(null);

    /* renamed from: j */
    public CoreInventoryScanPresenter f63806j;

    /* renamed from: k */
    public CoreInventoryScanConverter f63807k;

    /* renamed from: l */
    public final CoreInventoryScanAdapter f63808l = new CoreInventoryScanAdapter();

    /* renamed from: m */
    public final Lazy f63809m;

    /* renamed from: n */
    public final Lazy f63810n;

    /* renamed from: o */
    public C40679f00 f63811o;

    /* renamed from: p */
    public final C45168ma4<VehicleInventoryAction> f63812p;

    /* renamed from: q */
    public final C45168ma4<Unit> f63813q;

    /* renamed from: r */
    public final C45168ma4<Pair<WireVehicleInventoryScan, Boolean>> f63814r;

    /* renamed from: s */
    public final C45168ma4<Unit> f63815s;

    /* renamed from: t */
    public final C45168ma4<Unit> f63816t;

    /* renamed from: u */
    public final Lazy f63817u;

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, m28432d2 = {"Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanActivity$Companion;", "", "()V", "PEEK_HEIGHT_DP", "", "core-inventory_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes3.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public CoreInventoryScanActivity() {
        Lazy lazy;
        Lazy lazy2;
        Lazy lazy3;
        lazy = LazyKt__LazyJVMKt.lazy(new CoreInventoryScanActivity$swipeHelper$2(this));
        this.f63809m = lazy;
        lazy2 = LazyKt__LazyJVMKt.lazy(new CoreInventoryScanActivity$itemTouchHelper$2(this));
        this.f63810n = lazy2;
        C45168ma4<VehicleInventoryAction> m25409g = C45168ma4.m25409g();
        Intrinsics.checkNotNullExpressionValue(m25409g, "create<VehicleInventoryAction>()");
        this.f63812p = m25409g;
        C45168ma4<Unit> m25409g2 = C45168ma4.m25409g();
        Intrinsics.checkNotNullExpressionValue(m25409g2, "create<Unit>()");
        this.f63813q = m25409g2;
        C45168ma4<Pair<WireVehicleInventoryScan, Boolean>> m25409g3 = C45168ma4.m25409g();
        Intrinsics.checkNotNullExpressionValue(m25409g3, "create<Pair<WireVehicleInventoryScan, Boolean?>>()");
        this.f63814r = m25409g3;
        C45168ma4<Unit> m25409g4 = C45168ma4.m25409g();
        Intrinsics.checkNotNullExpressionValue(m25409g4, "create<Unit>()");
        this.f63815s = m25409g4;
        C45168ma4<Unit> m25409g5 = C45168ma4.m25409g();
        Intrinsics.checkNotNullExpressionValue(m25409g5, "create<Unit>()");
        this.f63816t = m25409g5;
        lazy3 = LazyKt__LazyJVMKt.lazy(new CoreInventoryScanActivity$rendererDelegate$2(this));
        this.f63817u = lazy3;
    }

    /* renamed from: k0 */
    public static final void m58368k0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: m0 */
    public static final WireVehicleInventoryScan m58367m0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (WireVehicleInventoryScan) tmp0.invoke(obj);
    }

    /* renamed from: n0 */
    public static final C2637G6 m58366n0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (C2637G6) tmp0.invoke(obj);
    }

    /* renamed from: o0 */
    public static final Pair m58365o0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (Pair) tmp0.invoke(obj);
    }

    public static final void onCreate$lambda$0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    public static final void onCreate$lambda$1(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: q0 */
    public static final boolean m58363q0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return ((Boolean) tmp0.invoke(obj)).booleanValue();
    }

    /* renamed from: t0 */
    public static final void m58362t0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: w0 */
    public static final boolean m58361w0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return ((Boolean) tmp0.invoke(obj)).booleanValue();
    }

    /* renamed from: x0 */
    public static final void m58360x0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    @Override // co.bird.android.feature.coreinventory.scan.CoreInventoryScanRenderer
    /* renamed from: A1 */
    public Observable<WireVehicleInventoryScan> mo58271A1() {
        Observable<Integer> m25451b = m58369j0().m25451b();
        final CoreInventoryScanActivity$itemSwiped$1 coreInventoryScanActivity$itemSwiped$1 = new CoreInventoryScanActivity$itemSwiped$1(this.f63808l);
        Observable<R> map = m25451b.map(new InterfaceC23492o() { // from class: fC0
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                C2637G6 m58366n0;
                m58366n0 = CoreInventoryScanActivity.m58366n0(Function1.this, obj);
                return m58366n0;
            }
        });
        final CoreInventoryScanActivity$itemSwiped$2 coreInventoryScanActivity$itemSwiped$2 = CoreInventoryScanActivity$itemSwiped$2.f63818g;
        Observable map2 = map.map(new InterfaceC23492o() { // from class: gC0
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                Pair m58365o0;
                m58365o0 = CoreInventoryScanActivity.m58365o0(Function1.this, obj);
                return m58365o0;
            }
        });
        final CoreInventoryScanActivity$itemSwiped$3 coreInventoryScanActivity$itemSwiped$3 = new CoreInventoryScanActivity$itemSwiped$3(this);
        Observable doAfterNext = map2.doAfterNext(new InterfaceC23484g() { // from class: hC0
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                CoreInventoryScanActivity.m58368k0(Function1.this, obj);
            }
        });
        final CoreInventoryScanActivity$itemSwiped$4 coreInventoryScanActivity$itemSwiped$4 = CoreInventoryScanActivity$itemSwiped$4.f63820g;
        Observable<WireVehicleInventoryScan> map3 = doAfterNext.map(new InterfaceC23492o() { // from class: iC0
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                WireVehicleInventoryScan m58367m0;
                m58367m0 = CoreInventoryScanActivity.m58367m0(Function1.this, obj);
                return m58367m0;
            }
        });
        Intrinsics.checkNotNullExpressionValue(map3, "override fun itemSwiped(…  .map { (scan) -> scan }");
        return map3;
    }

    @Override // co.bird.android.vehiclescanner.common.mrp.InterfaceC16428a
    /* renamed from: G */
    public Observable<Unit> mo54816G() {
        return mo54814w1().m86398G();
    }

    @Override // co.bird.android.feature.coreinventory.scan.CoreInventoryScanRenderer
    /* renamed from: I2 */
    public Observable<Unit> mo58270I2() {
        return this.f63808l.m58256I2();
    }

    @Override // co.bird.android.feature.coreinventory.scan.CoreInventoryScanRenderer
    /* renamed from: K1 */
    public Observable<VehicleInventoryAction> mo58269K1() {
        Observable<VehicleInventoryAction> hide = this.f63812p.hide();
        Intrinsics.checkNotNullExpressionValue(hide, "actionRelay.hide()");
        return hide;
    }

    @Override // co.bird.android.vehiclescanner.common.mrp.InterfaceC16428a
    /* renamed from: T */
    public Observable<String> mo54815T() {
        return mo54814w1().m86400Am();
    }

    @Override // co.bird.android.feature.coreinventory.scan.CoreInventoryScanRenderer
    /* renamed from: V */
    public Observable<Pair<WireVehicleInventoryScan, Boolean>> mo58268V() {
        Observable<Pair<WireVehicleInventoryScan, Boolean>> hide = this.f63814r.hide();
        Intrinsics.checkNotNullExpressionValue(hide, "undoDeleteRelay.hide()");
        return hide;
    }

    @Override // co.bird.android.feature.coreinventory.scan.CoreInventoryScanRenderer
    /* renamed from: W */
    public Observable<Unit> mo58267W() {
        Observable<Unit> hide = this.f63816t.hide();
        Intrinsics.checkNotNullExpressionValue(hide, "exitConfirmRelay.hide()");
        return hide;
    }

    @Override // co.bird.android.feature.coreinventory.scan.CoreInventoryScanRenderer
    /* renamed from: b8 */
    public Observable<Unit> mo58266b8() {
        Observable<Unit> hide = this.f63813q.hide();
        Intrinsics.checkNotNullExpressionValue(hide, "confirmProcessRelay.hide()");
        return hide;
    }

    @Override // co.bird.android.feature.coreinventory.scan.CoreInventoryScanRenderer
    /* renamed from: c1 */
    public Observable<Unit> mo58265c1() {
        return this.f63808l.m58255c1();
    }

    /* renamed from: f0 */
    public final CoreInventoryScanConverter m58372f0() {
        CoreInventoryScanConverter coreInventoryScanConverter = this.f63807k;
        if (coreInventoryScanConverter != null) {
            return coreInventoryScanConverter;
        }
        Intrinsics.throwUninitializedPropertyAccessException("converter");
        return null;
    }

    /* renamed from: h0 */
    public final C11925l m58371h0() {
        return (C11925l) this.f63810n.getValue();
    }

    /* renamed from: i0 */
    public final CoreInventoryScanPresenter m58370i0() {
        CoreInventoryScanPresenter coreInventoryScanPresenter = this.f63806j;
        if (coreInventoryScanPresenter != null) {
            return coreInventoryScanPresenter;
        }
        Intrinsics.throwUninitializedPropertyAccessException("presenter");
        return null;
    }

    /* renamed from: j0 */
    public final C45142mX5 m58369j0() {
        return (C45142mX5) this.f63809m.getValue();
    }

    @Override // co.bird.android.core.base.BaseCoreActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        this.f63815s.accept(Unit.INSTANCE);
    }

    @Override // co.bird.android.core.mrp.BaseActivityLite, co.bird.android.core.base.BaseCoreActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        Enum r9;
        boolean equals;
        super.onCreate(bundle);
        C40679f00 m42291c = C40679f00.m42291c(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(m42291c, "inflate(layoutInflater)");
        this.f63811o = m42291c;
        if (m42291c == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            m42291c = null;
        }
        setContentView(m42291c.getRoot());
        Intent intent = getIntent();
        Intrinsics.checkNotNullExpressionValue(intent, "intent");
        String stringExtra = intent.getStringExtra("vehicle_inventory_action");
        if (stringExtra != null) {
            try {
                Object[] enumConstants = VehicleInventoryAction.class.getEnumConstants();
                Intrinsics.checkNotNull(enumConstants);
                for (Object obj : enumConstants) {
                    equals = StringsKt__StringsJVMKt.equals(((Enum) obj).name(), stringExtra, true);
                    if (equals) {
                        Intrinsics.checkNotNullExpressionValue(obj, "{\n    E::class.java.enum….equals(name, true) }\n  }");
                        r9 = (Enum) obj;
                    }
                }
                throw new NoSuchElementException("Array contains no element matching the predicate.");
            } catch (Exception unused) {
                Object[] enumConstants2 = VehicleInventoryAction.class.getEnumConstants();
                Intrinsics.checkNotNull(enumConstants2);
                for (Object obj2 : enumConstants2) {
                    r9 = (Enum) obj2;
                    if (Intrinsics.areEqual(r9.name(), "UNKNOWN")) {
                        Intrinsics.checkNotNullExpressionValue(obj2, "{\n    E::class.java.enum…m.name == \"UNKNOWN\" }\n  }");
                    }
                }
                throw new NoSuchElementException("Array contains no element matching the predicate.");
            }
        }
        r9 = null;
        VehicleInventoryAction vehicleInventoryAction = (VehicleInventoryAction) r9;
        if (vehicleInventoryAction == null) {
            return;
        }
        C46781pI0.m19569a().mo19564a(m58989H()).mo19568a(this);
        mo54814w1().mo86379gm(true);
        mo54814w1().m86368qm((int) C49347td3.m12001b(150));
        mo54814w1().m86366sm(false);
        C40679f00 c40679f00 = this.f63811o;
        if (c40679f00 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            c40679f00 = null;
        }
        c40679f00.f79266i.setAdapter(this.f63808l);
        C40679f00 c40679f002 = this.f63811o;
        if (c40679f002 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            c40679f002 = null;
        }
        c40679f002.f79266i.setLayoutManager(new LinearLayoutManager(this));
        C40679f00 c40679f003 = this.f63811o;
        if (c40679f003 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            c40679f003 = null;
        }
        c40679f003.f79266i.setItemAnimator(new C11894g());
        C11925l m58371h0 = m58371h0();
        C40679f00 c40679f004 = this.f63811o;
        if (c40679f004 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            c40679f004 = null;
        }
        m58371h0.m66204g(c40679f004.f79266i);
        C40679f00 c40679f005 = this.f63811o;
        if (c40679f005 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            c40679f005 = null;
        }
        ImageButton imageButton = c40679f005.f79262e.f47684d;
        Intrinsics.checkNotNullExpressionValue(imageButton, "binding.constraintLayout.code");
        Object m33094as = C44626lf5.clicksThrottle$default(imageButton, 0L, 1, null).m33094as(AutoDispose.m45239a(this));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final CoreInventoryScanActivity$onCreate$1 coreInventoryScanActivity$onCreate$1 = new CoreInventoryScanActivity$onCreate$1(this);
        ((ObservableSubscribeProxy) m33094as).subscribe(new InterfaceC23484g() { // from class: ZB0
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj3) {
                CoreInventoryScanActivity.onCreate$lambda$0(Function1.this, obj3);
            }
        });
        C40679f00 c40679f006 = this.f63811o;
        if (c40679f006 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            c40679f006 = null;
        }
        ImageButton imageButton2 = c40679f006.f79262e.f47686f;
        Intrinsics.checkNotNullExpressionValue(imageButton2, "binding.constraintLayout.flashlight");
        Object m33094as2 = C44626lf5.clicksThrottle$default(imageButton2, 0L, 1, null).m33094as(AutoDispose.m45239a(this));
        Intrinsics.checkExpressionValueIsNotNull(m33094as2, "this.`as`(AutoDispose.autoDisposable(provider))");
        final CoreInventoryScanActivity$onCreate$2 coreInventoryScanActivity$onCreate$2 = new CoreInventoryScanActivity$onCreate$2(this);
        ((ObservableSubscribeProxy) m33094as2).subscribe(new InterfaceC23484g() { // from class: aC0
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj3) {
                CoreInventoryScanActivity.onCreate$lambda$1(Function1.this, obj3);
            }
        });
        m58370i0().consume(this);
        this.f63812p.accept(vehicleInventoryAction);
    }

    @Override // co.bird.android.core.base.BaseCoreActivity, android.app.Activity
    public boolean onOptionsItemSelected(MenuItem item) {
        Intrinsics.checkNotNullParameter(item, "item");
        if (item.getItemId() == 16908332) {
            onBackPressed();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        mo54814w1().onPause();
    }

    @Override // co.bird.android.core.base.BaseCoreActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        mo54814w1().onResume();
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00a4  */
    @Override // p000.InterfaceC48362rx4
    /* renamed from: p0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void render(CoreInventoryScanState state) {
        C40679f00 c40679f00;
        boolean z;
        Intrinsics.checkNotNullParameter(state, "state");
        CoreInventoryScanRenderer.DefaultImpls.m58263a(this, state);
        this.f63808l.mo24871u(m58372f0().m58252a(state.getAction(), state.mo58259l(), state.mo58260f()));
        if (state instanceof UpdateUi) {
            boolean z2 = true;
            if (!state.mo58259l().isEmpty()) {
                List<Pair<WireVehicleInventoryScan, Boolean>> mo58259l = state.mo58259l();
                if (!(mo58259l instanceof Collection) || !mo58259l.isEmpty()) {
                    Iterator<T> it = mo58259l.iterator();
                    while (it.hasNext()) {
                        if (!Intrinsics.areEqual((Boolean) ((Pair) it.next()).component2(), Boolean.TRUE)) {
                            z = false;
                            break;
                        }
                    }
                }
                z = true;
                if (z) {
                    Intent intent = new Intent();
                    C38945c62.m61933a(intent, "vehicle_inventory_action", state.getAction());
                    intent.putExtra("warehouse", state.mo58262a());
                    setResult(-1, intent);
                    c40679f00 = this.f63811o;
                    if (c40679f00 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                        c40679f00 = null;
                    }
                    LinearProgressIndicator linearProgressIndicator = c40679f00.f79263f;
                    Intrinsics.checkNotNullExpressionValue(linearProgressIndicator, "binding.progressBar");
                    if (state.mo58258m() <= 0) {
                        z2 = false;
                    }
                    C49520tu6.show$default(linearProgressIndicator, z2, 0, 2, null);
                }
            }
            setResult(0);
            c40679f00 = this.f63811o;
            if (c40679f00 == null) {
            }
            LinearProgressIndicator linearProgressIndicator2 = c40679f00.f79263f;
            Intrinsics.checkNotNullExpressionValue(linearProgressIndicator2, "binding.progressBar");
            if (state.mo58258m() <= 0) {
            }
            C49520tu6.show$default(linearProgressIndicator2, z2, 0, 2, null);
        } else if (state instanceof ConfirmProcessing) {
            AbstractC23442F birdDialog$default = H31.C3014a.birdDialog$default(mo54814w1(), new QB0(state.getAction(), state.mo58262a()), false, false, 6, null);
            final CoreInventoryScanActivity$render$3 coreInventoryScanActivity$render$3 = CoreInventoryScanActivity$render$3.f63824g;
            AbstractC24507p m33098z = birdDialog$default.m33098z(new InterfaceC23494q() { // from class: bC0
                @Override // io.reactivex.functions.InterfaceC23494q
                public final boolean test(Object obj) {
                    boolean m58363q0;
                    m58363q0 = CoreInventoryScanActivity.m58363q0(Function1.this, obj);
                    return m58363q0;
                }
            });
            Intrinsics.checkNotNullExpressionValue(m33098z, "rendererDelegate.birdDia…se == DialogResponse.OK }");
            Object m32048b = m33098z.m32048b(AutoDispose.m45239a(this));
            Intrinsics.checkExpressionValueIsNotNull(m32048b, "this.`as`(AutoDispose.autoDisposable(provider))");
            final CoreInventoryScanActivity$render$4 coreInventoryScanActivity$render$4 = new CoreInventoryScanActivity$render$4(this);
            ((MaybeSubscribeProxy) m32048b).subscribe(new InterfaceC23484g() { // from class: cC0
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj) {
                    CoreInventoryScanActivity.m58362t0(Function1.this, obj);
                }
            });
        } else if (state instanceof ConfirmExit) {
            AbstractC23442F birdDialog$default2 = H31.C3014a.birdDialog$default(mo54814w1(), new Z86(state.mo58261b()), false, false, 6, null);
            final CoreInventoryScanActivity$render$5 coreInventoryScanActivity$render$5 = CoreInventoryScanActivity$render$5.f63826g;
            AbstractC24507p m33098z2 = birdDialog$default2.m33098z(new InterfaceC23494q() { // from class: dC0
                @Override // io.reactivex.functions.InterfaceC23494q
                public final boolean test(Object obj) {
                    boolean m58361w0;
                    m58361w0 = CoreInventoryScanActivity.m58361w0(Function1.this, obj);
                    return m58361w0;
                }
            });
            Intrinsics.checkNotNullExpressionValue(m33098z2, "rendererDelegate.birdDia…se == DialogResponse.OK }");
            Object m32048b2 = m33098z2.m32048b(AutoDispose.m45239a(this));
            Intrinsics.checkExpressionValueIsNotNull(m32048b2, "this.`as`(AutoDispose.autoDisposable(provider))");
            final CoreInventoryScanActivity$render$6 coreInventoryScanActivity$render$6 = new CoreInventoryScanActivity$render$6(this);
            ((MaybeSubscribeProxy) m32048b2).subscribe(new InterfaceC23484g() { // from class: eC0
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj) {
                    CoreInventoryScanActivity.m58360x0(Function1.this, obj);
                }
            });
        } else if (state instanceof AlertDisabledEmpty) {
            Object m33135e = H31.C3014a.birdDialog$default(mo54814w1(), RB0.f31626d, false, false, 6, null).m33135e(AutoDispose.m45239a(this));
            Intrinsics.checkExpressionValueIsNotNull(m33135e, "this.`as`(AutoDispose.autoDisposable(provider))");
            ((SingleSubscribeProxy) m33135e).subscribe();
        } else if (state instanceof AlertDisabledError) {
            Object m33135e2 = H31.C3014a.birdDialog$default(mo54814w1(), SB0.f33291d, false, false, 6, null).m33135e(AutoDispose.m45239a(this));
            Intrinsics.checkExpressionValueIsNotNull(m33135e2, "this.`as`(AutoDispose.autoDisposable(provider))");
            ((SingleSubscribeProxy) m33135e2).subscribe();
        }
    }

    @Override // co.bird.android.vehiclescanner.common.mrp.InterfaceC16428a
    /* renamed from: w1 */
    public C35686Rk5 mo54814w1() {
        return (C35686Rk5) this.f63817u.getValue();
    }

    @Override // co.bird.android.feature.coreinventory.scan.CoreInventoryScanRenderer
    /* renamed from: z1 */
    public Observable<Unit> mo58264z1() {
        Observable<Unit> hide = this.f63815s.hide();
        Intrinsics.checkNotNullExpressionValue(hide, "backPressRelay.hide()");
        return hide;
    }
}
