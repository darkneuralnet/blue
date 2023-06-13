package p000;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.text.SpannableString;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.ObservableSubscribeProxy;
import com.uber.autodispose.android.lifecycle.AndroidLifecycleScopeProvider;
import io.reactivex.Observable;
import io.reactivex.functions.InterfaceC23492o;
import io.reactivex.subjects.C24558d;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000  2\u00020\u0001:\u0001!B\u0007¢\u0006\u0004\b\u001e\u0010\u001fJ&\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016J\u0012\u0010\u000b\u001a\u00020\n2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016J\u001a\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016R\u0016\u0010\u0012\u001a\u00020\u000f8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\"\u0010\u0017\u001a\u0010\u0012\f\u0012\n \u0014*\u0004\u0018\u00010\r0\r0\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R!\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\r0\u00188FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006\""}, m28432d2 = {"Lvy3;", "Lac5;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "Landroid/app/Dialog;", "onCreateDialog", "view", "", "onViewCreated", "LZZ;", "b", "LZZ;", "binding", "Lio/reactivex/subjects/d;", "kotlin.jvm.PlatformType", "c", "Lio/reactivex/subjects/d;", "confirmSubject", "Lio/reactivex/Observable;", DateTokenConverter.CONVERTER_KEY, "Lkotlin/Lazy;", "g7", "()Lio/reactivex/Observable;", "confirmClicks", "<init>", "()V", "e", C17296a.f69688o, "co.bird.android.feature.transfer-order"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nOrderCompleteBottomSheet.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OrderCompleteBottomSheet.kt\nco/bird/android/feature/transferorder/operatorallocationdetails/dialogs/OrderCompleteBottomSheet\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/android/lifecycle/KotlinExtensionsKt\n+ 3 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n*L\n1#1,75:1\n44#2:76\n180#3:77\n*S KotlinDebug\n*F\n+ 1 OrderCompleteBottomSheet.kt\nco/bird/android/feature/transferorder/operatorallocationdetails/dialogs/OrderCompleteBottomSheet\n*L\n71#1:76\n71#1:77\n*E\n"})
/* renamed from: vy3  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C50742vy3 extends AbstractC38056ac5 {

    /* renamed from: e */
    public static final C29709a f115021e = new C29709a(null);

    /* renamed from: b */
    public C10295ZZ f115022b;

    /* renamed from: c */
    public final C24558d<Unit> f115023c;

    /* renamed from: d */
    public final Lazy f115024d;

    @Metadata(m28433d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001e\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\nR\u0014\u0010\f\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\nR\u0014\u0010\r\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\n¨\u0006\u0010"}, m28432d2 = {"Lvy3$a;", "", "", "inbound", "", "warehouseName", "fleetName", "Lvy3;", C17296a.f69688o, "FLEET_NAME", "Ljava/lang/String;", "INBOUND", "TAG", "WAREHOUSE_NAME", "<init>", "()V", "co.bird.android.feature.transfer-order"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: vy3$a */
    /* loaded from: classes3.dex */
    public static final class C29709a {
        public /* synthetic */ C29709a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C50742vy3 m7680a(boolean z, String warehouseName, String fleetName) {
            Intrinsics.checkNotNullParameter(warehouseName, "warehouseName");
            Intrinsics.checkNotNullParameter(fleetName, "fleetName");
            C50742vy3 c50742vy3 = new C50742vy3();
            Bundle bundle = new Bundle();
            bundle.putBoolean("inbound", z);
            bundle.putString("warehouse_name", warehouseName);
            bundle.putString("fleet_name", fleetName);
            c50742vy3.setArguments(bundle);
            return c50742vy3;
        }

        private C29709a() {
        }
    }

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u0010\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"Lio/reactivex/subjects/d;", "", "kotlin.jvm.PlatformType", "b", "()Lio/reactivex/subjects/d;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: vy3$b */
    /* loaded from: classes3.dex */
    public static final class C29710b extends Lambda implements Function0<C24558d<Unit>> {
        public C29710b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b */
        public final C24558d<Unit> invoke() {
            return C50742vy3.this.f115023c;
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"<anonymous>", "", "it", "invoke", "(Lkotlin/Unit;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: vy3$c */
    /* loaded from: classes3.dex */
    public static final class C29711c extends Lambda implements Function1<Unit, Unit> {
        public C29711c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Unit unit) {
            invoke2(unit);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Unit it) {
            Intrinsics.checkNotNullParameter(it, "it");
            C50742vy3.this.f115023c.onNext(Unit.INSTANCE);
        }
    }

    public C50742vy3() {
        Lazy lazy;
        C24558d<Unit> m31902e = C24558d.m31902e();
        Intrinsics.checkNotNullExpressionValue(m31902e, "create<Unit>()");
        this.f115023c = m31902e;
        lazy = LazyKt__LazyJVMKt.lazy(new C29710b());
        this.f115024d = lazy;
    }

    /* renamed from: N6 */
    public static final Unit m7683N6(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (Unit) tmp0.invoke(obj);
    }

    /* renamed from: g7 */
    public final Observable<Unit> m7681g7() {
        return (Observable) this.f115024d.getValue();
    }

    @Override // p000.AbstractC38056ac5, com.google.android.material.bottomsheet.C17714b, p000.C26572ni, androidx.fragment.app.DialogInterface$OnCancelListenerC11663c
    public Dialog onCreateDialog(Bundle bundle) {
        Dialog onCreateDialog = super.onCreateDialog(bundle);
        onCreateDialog.setCanceledOnTouchOutside(false);
        return onCreateDialog;
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        return C10295ZZ.m72923c(getLayoutInflater(), viewGroup, false).getRoot();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        boolean z;
        String str;
        String str2;
        String str3;
        SpannableString spannableString;
        String string;
        String str4;
        SpannableString spannableString2;
        String string2;
        SpannableString span$default;
        Intrinsics.checkNotNullParameter(view, "view");
        C10295ZZ m72925a = C10295ZZ.m72925a(view);
        Intrinsics.checkNotNullExpressionValue(m72925a, "bind(view)");
        this.f115022b = m72925a;
        Bundle arguments = getArguments();
        if (arguments != null) {
            z = arguments.getBoolean("inbound");
        } else {
            z = false;
        }
        Bundle arguments2 = getArguments();
        if (arguments2 != null) {
            str = arguments2.getString("warehouse_name");
        } else {
            str = null;
        }
        Bundle arguments3 = getArguments();
        if (arguments3 != null) {
            str2 = arguments3.getString("fleet_name");
        } else {
            str2 = null;
        }
        if (z) {
            C10295ZZ c10295zz = this.f115022b;
            if (c10295zz == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                c10295zz = null;
            }
            TextView textView = c10295zz.f48774e;
            Context context = getContext();
            if (context != null) {
                str4 = context.getString(C45871nl4.transfer_orders_check_in_complete_title);
            } else {
                str4 = null;
            }
            textView.setText(str4);
            C10295ZZ c10295zz2 = this.f115022b;
            if (c10295zz2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                c10295zz2 = null;
            }
            TextView textView2 = c10295zz2.f48773d;
            Context context2 = getContext();
            if (context2 != null && (string2 = context2.getString(C45871nl4.transfer_orders_check_in_complete_body, str, str2)) != null && (span$default = C45097mS5.span$default(string2, str, null, 2, null)) != null) {
                spannableString2 = C45097mS5.span$default(span$default, str2, null, 2, null);
            } else {
                spannableString2 = null;
            }
            textView2.setText(spannableString2);
        } else if (!z) {
            C10295ZZ c10295zz3 = this.f115022b;
            if (c10295zz3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                c10295zz3 = null;
            }
            TextView textView3 = c10295zz3.f48774e;
            Context context3 = getContext();
            if (context3 != null) {
                str3 = context3.getString(C45871nl4.transfer_order_check_out_complete_title);
            } else {
                str3 = null;
            }
            textView3.setText(str3);
            C10295ZZ c10295zz4 = this.f115022b;
            if (c10295zz4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                c10295zz4 = null;
            }
            TextView textView4 = c10295zz4.f48773d;
            Context context4 = getContext();
            if (context4 != null && (string = context4.getString(C45871nl4.transfer_order_check_out_complete_body, str2)) != null) {
                spannableString = C45097mS5.span$default(string, str2, null, 2, null);
            } else {
                spannableString = null;
            }
            textView4.setText(spannableString);
        }
        C10295ZZ c10295zz5 = this.f115022b;
        if (c10295zz5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            c10295zz5 = null;
        }
        Button button = c10295zz5.f48771b;
        Intrinsics.checkNotNullExpressionValue(button, "binding.confirm");
        Observable clicksThrottle$default = C44626lf5.clicksThrottle$default(button, 0L, 1, null);
        final C29711c c29711c = new C29711c();
        Observable map = clicksThrottle$default.map(new InterfaceC23492o() { // from class: uy3
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                Unit m7683N6;
                m7683N6 = C50742vy3.m7683N6(Function1.this, obj);
                return m7683N6;
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "override fun onViewCreat…))\n      .subscribe()\n  }");
        AndroidLifecycleScopeProvider m45197b = AndroidLifecycleScopeProvider.m45197b(this);
        Intrinsics.checkExpressionValueIsNotNull(m45197b, "AndroidLifecycleScopeProvider.from(this)");
        Object m33094as = map.m33094as(AutoDispose.m45239a(m45197b));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        ((ObservableSubscribeProxy) m33094as).subscribe();
    }
}
