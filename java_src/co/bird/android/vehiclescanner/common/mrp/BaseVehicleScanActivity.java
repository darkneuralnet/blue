package co.bird.android.vehiclescanner.common.mrp;

import android.os.Bundle;
import android.widget.ImageButton;
import co.bird.android.core.mrp.BaseActivityLite;
import co.bird.android.vehiclescanner.common.mrp.BaseVehicleScanActivity;
import co.bird.android.vehiclescanner.common.mrp.InterfaceC16428a;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.ObservableSubscribeProxy;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.C23454a;
import io.reactivex.functions.InterfaceC23484g;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.InterfaceC40099e13;
@Metadata(m28433d1 = {"\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\b\u0016\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003B\u0007¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014J\b\u0010\b\u001a\u00020\u0006H\u0014J\b\u0010\t\u001a\u00020\u0006H\u0014J\u000e\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0016J\u000e\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\nH\u0016R\"\u0010\u0015\u001a\u00020\u000e8\u0004@\u0004X\u0084.¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001b\u0010\u001b\u001a\u00020\u00168VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001e"}, m28432d2 = {"Lco/bird/android/vehiclescanner/common/mrp/BaseVehicleScanActivity;", "S", "Lco/bird/android/core/mrp/BaseActivityLite;", "Lco/bird/android/vehiclescanner/common/mrp/a;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "onResume", "onPause", "Lio/reactivex/Observable;", "", "T", "G", "Lf00;", "j", "Lf00;", "U", "()Lf00;", "Y", "(Lf00;)V", "binding", "LRk5;", "k", "Lkotlin/Lazy;", "w1", "()LRk5;", "rendererDelegate", "<init>", "()V", "vehiclescanner_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nBaseVehicleScanActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BaseVehicleScanActivity.kt\nco/bird/android/vehiclescanner/common/mrp/BaseVehicleScanActivity\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n*L\n1#1,64:1\n180#2:65\n180#2:66\n180#2:67\n*S KotlinDebug\n*F\n+ 1 BaseVehicleScanActivity.kt\nco/bird/android/vehiclescanner/common/mrp/BaseVehicleScanActivity\n*L\n33#1:65\n37#1:66\n41#1:67\n*E\n"})
/* loaded from: classes4.dex */
public class BaseVehicleScanActivity<S> extends BaseActivityLite implements InterfaceC16428a<S> {

    /* renamed from: j */
    public C40679f00 f67076j;

    /* renamed from: k */
    public final Lazy f67077k;

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u000e\u0010\u0003\u001a\n \u0004*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"<anonymous>", "", "S", "it", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: co.bird.android.vehiclescanner.common.mrp.BaseVehicleScanActivity$a */
    /* loaded from: classes4.dex */
    public static final class C16423a extends Lambda implements Function1<Unit, Unit> {

        /* renamed from: g */
        public final /* synthetic */ BaseVehicleScanActivity<S> f67078g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C16423a(BaseVehicleScanActivity<S> baseVehicleScanActivity) {
            super(1);
            this.f67078g = baseVehicleScanActivity;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Unit unit) {
            invoke2(unit);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Unit unit) {
            this.f67078g.mo54814w1().m86359ym();
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u000e\u0010\u0003\u001a\n \u0004*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"<anonymous>", "", "S", "it", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: co.bird.android.vehiclescanner.common.mrp.BaseVehicleScanActivity$b */
    /* loaded from: classes4.dex */
    public static final class C16424b extends Lambda implements Function1<Unit, Unit> {

        /* renamed from: g */
        public final /* synthetic */ BaseVehicleScanActivity<S> f67079g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C16424b(BaseVehicleScanActivity<S> baseVehicleScanActivity) {
            super(1);
            this.f67079g = baseVehicleScanActivity;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Unit unit) {
            invoke2(unit);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Unit unit) {
            this.f67079g.mo54814w1().m86358zm();
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u000e\u0010\u0003\u001a\n \u0004*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"<anonymous>", "", "S", "it", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: co.bird.android.vehiclescanner.common.mrp.BaseVehicleScanActivity$c */
    /* loaded from: classes4.dex */
    public static final class C16425c extends Lambda implements Function1<Unit, Unit> {

        /* renamed from: g */
        public final /* synthetic */ BaseVehicleScanActivity<S> f67080g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C16425c(BaseVehicleScanActivity<S> baseVehicleScanActivity) {
            super(1);
            this.f67080g = baseVehicleScanActivity;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Unit unit) {
            invoke2(unit);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Unit unit) {
            InterfaceC40099e13.C19924a.goToNearbyBirds$default(this.f67080g.mo58957w(), true, null, null, null, null, null, null, null, 254, null);
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"S", "LRk5;", "b", "()LRk5;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.vehiclescanner.common.mrp.BaseVehicleScanActivity$d */
    /* loaded from: classes4.dex */
    public static final class C16426d extends Lambda implements Function0<C35686Rk5> {

        /* renamed from: g */
        public final /* synthetic */ BaseVehicleScanActivity<S> f67081g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C16426d(BaseVehicleScanActivity<S> baseVehicleScanActivity) {
            super(0);
            this.f67081g = baseVehicleScanActivity;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b */
        public final C35686Rk5 invoke() {
            BaseVehicleScanActivity<S> baseVehicleScanActivity = this.f67081g;
            return new C35686Rk5(baseVehicleScanActivity, baseVehicleScanActivity.m54820U(), null);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u000e\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004H\n¢\u0006\u0002\b\u0006"}, m28432d2 = {"<anonymous>", "", "S", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: co.bird.android.vehiclescanner.common.mrp.BaseVehicleScanActivity$e */
    /* loaded from: classes4.dex */
    public static final class C16427e extends Lambda implements Function1<String, Unit> {

        /* renamed from: g */
        public final /* synthetic */ BaseVehicleScanActivity<S> f67082g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C16427e(BaseVehicleScanActivity<S> baseVehicleScanActivity) {
            super(1);
            this.f67082g = baseVehicleScanActivity;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(String str) {
            invoke2(str);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(String str) {
            this.f67082g.mo54814w1().m86370p3();
        }
    }

    public BaseVehicleScanActivity() {
        Lazy lazy;
        lazy = LazyKt__LazyJVMKt.lazy(new C16426d(this));
        this.f67077k = lazy;
    }

    /* renamed from: X */
    public static final void m54819X(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    public static final void onCreate$lambda$0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    public static final void onCreate$lambda$1(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    public static final void onCreate$lambda$2(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    @Override // co.bird.android.vehiclescanner.common.mrp.InterfaceC16428a
    /* renamed from: G */
    public Observable<Unit> mo54816G() {
        return mo54814w1().m86398G();
    }

    @Override // co.bird.android.vehiclescanner.common.mrp.InterfaceC16428a
    /* renamed from: T */
    public Observable<String> mo54815T() {
        Observable<String> observeOn = mo54814w1().m86400Am().observeOn(C23454a.m33087a());
        final C16427e c16427e = new C16427e(this);
        Observable<String> doAfterNext = observeOn.doAfterNext(new InterfaceC23484g() { // from class: CE
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                BaseVehicleScanActivity.m54819X(Function1.this, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(doAfterNext, "override fun scans(): Ob…e.resumeCameraPreview() }");
        return doAfterNext;
    }

    /* renamed from: U */
    public final C40679f00 m54820U() {
        C40679f00 c40679f00 = this.f67076j;
        if (c40679f00 != null) {
            return c40679f00;
        }
        Intrinsics.throwUninitializedPropertyAccessException("binding");
        return null;
    }

    /* renamed from: Y */
    public final void m54818Y(C40679f00 c40679f00) {
        Intrinsics.checkNotNullParameter(c40679f00, "<set-?>");
        this.f67076j = c40679f00;
    }

    @Override // co.bird.android.core.mrp.BaseActivityLite, co.bird.android.core.base.BaseCoreActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C40679f00 m42291c = C40679f00.m42291c(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(m42291c, "inflate(layoutInflater)");
        m54818Y(m42291c);
        setContentView(m54820U().getRoot());
        ImageButton imageButton = m54820U().f79262e.f47684d;
        Intrinsics.checkNotNullExpressionValue(imageButton, "binding.constraintLayout.code");
        Object m33094as = C44626lf5.clicksThrottle$default(imageButton, 0L, 1, null).m33094as(AutoDispose.m45239a(this));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C16423a c16423a = new C16423a(this);
        ((ObservableSubscribeProxy) m33094as).subscribe(new InterfaceC23484g() { // from class: zE
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                BaseVehicleScanActivity.onCreate$lambda$0(Function1.this, obj);
            }
        });
        ImageButton imageButton2 = m54820U().f79262e.f47686f;
        Intrinsics.checkNotNullExpressionValue(imageButton2, "binding.constraintLayout.flashlight");
        Object m33094as2 = C44626lf5.clicksThrottle$default(imageButton2, 0L, 1, null).m33094as(AutoDispose.m45239a(this));
        Intrinsics.checkExpressionValueIsNotNull(m33094as2, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C16424b c16424b = new C16424b(this);
        ((ObservableSubscribeProxy) m33094as2).subscribe(new InterfaceC23484g() { // from class: AE
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                BaseVehicleScanActivity.onCreate$lambda$1(Function1.this, obj);
            }
        });
        ImageButton imageButton3 = m54820U().f79262e.f47682b;
        Intrinsics.checkNotNullExpressionValue(imageButton3, "binding.constraintLayout.bluetooth");
        Object m33094as3 = C44626lf5.clicksThrottle$default(imageButton3, 0L, 1, null).m33094as(AutoDispose.m45239a(this));
        Intrinsics.checkExpressionValueIsNotNull(m33094as3, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C16425c c16425c = new C16425c(this);
        ((ObservableSubscribeProxy) m33094as3).subscribe(new InterfaceC23484g() { // from class: BE
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                BaseVehicleScanActivity.onCreate$lambda$2(Function1.this, obj);
            }
        });
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

    public void render(S s) {
        InterfaceC16428a.C16429a.m54813a(this, s);
    }

    @Override // co.bird.android.vehiclescanner.common.mrp.InterfaceC16428a
    /* renamed from: w1 */
    public C35686Rk5 mo54814w1() {
        return (C35686Rk5) this.f67077k.getValue();
    }
}
