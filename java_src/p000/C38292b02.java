package p000;

import android.app.Application;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentActivity;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.DialogResponse;
import co.bird.android.model.constant.TransferOrderDemandSource;
import co.bird.android.model.constant.TransferOrderVehicleAcceptAction;
import com.amazonaws.mobileconnectors.p025s3.transferutility.TransferTable;
import com.facebook.share.internal.C17296a;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.SingleSubscribeProxy;
import com.uber.autodispose.android.lifecycle.AndroidLifecycleScopeProvider;
import io.reactivex.AbstractC23442F;
import io.reactivex.InterfaceC23496h;
import io.reactivex.Observable;
import io.reactivex.subjects.C24567g;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsJVMKt;
import p000.H31;
import p000.InterfaceC36379Uj5;
@Metadata(m28433d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 ;2\u00020\u00012\u00020\u0002:\u0001<B\u0007¢\u0006\u0004\b9\u0010:J&\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016J\u0012\u0010\f\u001a\u00020\u000b2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016J\u001a\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016J\u0010\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016J\b\u0010\u0014\u001a\u00020\u0013H\u0016J\u000e\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0015H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017R\"\u0010!\u001a\u00020\u001a8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\"\u0010)\u001a\u00020\"8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\u0016\u0010-\u001a\u00020*8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b+\u0010,R\"\u00102\u001a\u0010\u0012\f\u0012\n /*\u0004\u0018\u00010\u00180\u00180.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u001d\u00108\u001a\u0004\u0018\u0001038BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u00107¨\u0006="}, m28432d2 = {"Lb02;", "Lac5;", "Lj02;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "Landroid/app/Dialog;", "onCreateDialog", "view", "", "onViewCreated", "Lk02;", TransferTable.COLUMN_STATE, "A9", "Lio/reactivex/h;", "T0", "Lio/reactivex/Observable;", "L3", "Lio/reactivex/F;", "Lco/bird/android/model/DialogResponse;", "a5", "Lg02;", "b", "Lg02;", "N6", "()Lg02;", "setPresenter", "(Lg02;)V", "presenter", "LTq4;", "c", "LTq4;", "getReactiveConfig", "()LTq4;", "setReactiveConfig", "(LTq4;)V", "reactiveConfig", "Ld00;", DateTokenConverter.CONVERTER_KEY, "Ld00;", "binding", "Lio/reactivex/subjects/g;", "kotlin.jvm.PlatformType", "e", "Lio/reactivex/subjects/g;", "dialogResponse", "Lsx4;", "f", "Lkotlin/Lazy;", "t8", "()Lsx4;", "renderer", "<init>", "()V", "g", C17296a.f69688o, "co.bird.android.feature.transfer-order"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nInboundAcceptanceBottomSheet.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InboundAcceptanceBottomSheet.kt\nco/bird/android/feature/transferorder/scanner/inbound/dialog/InboundAcceptanceBottomSheet\n+ 2 Bundle+.kt\nco/bird/android/library/extension/Bundle_Kt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 Enum+.kt\nco/bird/android/library/extension/Enum_Kt\n+ 5 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 6 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 7 KotlinExtensions.kt\ncom/uber/autodispose/android/lifecycle/KotlinExtensionsKt\n+ 8 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n*L\n1#1,157:1\n15#2:158\n6#2:169\n1549#3:159\n1620#3,2:160\n1622#3:168\n13#4,2:162\n15#4,2:166\n13#4,2:171\n15#4,2:175\n1109#5,2:164\n1109#5,2:173\n1#6:170\n64#7:177\n64#7:179\n199#8:178\n*S KotlinDebug\n*F\n+ 1 InboundAcceptanceBottomSheet.kt\nco/bird/android/feature/transferorder/scanner/inbound/dialog/InboundAcceptanceBottomSheet\n*L\n95#1:158\n97#1:169\n95#1:159\n95#1:160,2\n95#1:168\n95#1:162,2\n95#1:166,2\n97#1:171,2\n97#1:175,2\n95#1:164,2\n97#1:173,2\n97#1:170\n142#1:177\n151#1:179\n142#1:178\n*E\n"})
/* renamed from: b02  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C38292b02 extends AbstractC38056ac5 implements InterfaceC43053j02 {

    /* renamed from: g */
    public static final C12264a f56774g = new C12264a(null);

    /* renamed from: b */
    public C41274g02 f56775b;

    /* renamed from: c */
    public C36207Tq4 f56776c;

    /* renamed from: d */
    public C39494d00 f56777d;

    /* renamed from: e */
    public final C24567g<DialogResponse> f56778e;

    /* renamed from: f */
    public final Lazy f56779f;

    @Metadata(m28433d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0014\u0010\u0015JF\u0010\r\u001a\u00020\f2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\tR\u0014\u0010\u000e\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\u000fR\u0014\u0010\u0011\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0011\u0010\u000fR\u0014\u0010\u0012\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u000fR\u0014\u0010\u0013\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\u000f¨\u0006\u0016"}, m28432d2 = {"Lb02$a;", "", "", "birdId", "skuOrderId", "Lco/bird/android/model/constant/TransferOrderDemandSource;", "demandSource", "title", "button", "", "Lco/bird/android/model/constant/TransferOrderVehicleAcceptAction;", "vehicleAcceptanceOptions", "Lb02;", C17296a.f69688o, "BUTTON", "Ljava/lang/String;", "DEMAND_SOURCE", "TAG", "TITLE", "VEHICLE_ACCEPTANCE_OPTIONS", "<init>", "()V", "co.bird.android.feature.transfer-order"}, m28431k = 1, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nInboundAcceptanceBottomSheet.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InboundAcceptanceBottomSheet.kt\nco/bird/android/feature/transferorder/scanner/inbound/dialog/InboundAcceptanceBottomSheet$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,157:1\n1#2:158\n*E\n"})
    /* renamed from: b02$a */
    /* loaded from: classes3.dex */
    public static final class C12264a {
        public /* synthetic */ C12264a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C38292b02 m65130a(String str, String skuOrderId, TransferOrderDemandSource demandSource, String str2, String str3, List<? extends TransferOrderVehicleAcceptAction> vehicleAcceptanceOptions) {
            Intrinsics.checkNotNullParameter(skuOrderId, "skuOrderId");
            Intrinsics.checkNotNullParameter(demandSource, "demandSource");
            Intrinsics.checkNotNullParameter(vehicleAcceptanceOptions, "vehicleAcceptanceOptions");
            C38292b02 c38292b02 = new C38292b02();
            Bundle bundle = new Bundle();
            if (str != null) {
                bundle.putString("bird_id", str);
            }
            bundle.putString("sku_order_id", skuOrderId);
            bundle.putString("title", str2);
            bundle.putString("button", str3);
            C40749f70.m42020a(bundle, "demand_source", demandSource);
            C40749f70.m42019b(bundle, "vehicle_acceptance_options", vehicleAcceptanceOptions);
            c38292b02.setArguments(bundle);
            return c38292b02;
        }

        private C12264a() {
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: b02$b */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C12265b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[TransferOrderDemandSource.values().length];
            try {
                iArr[TransferOrderDemandSource.FM_LONGTAIL_RETURN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TransferOrderDemandSource.FM_DROP_OFF.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, m28432d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: b02$c */
    /* loaded from: classes3.dex */
    public static final class C12266c extends Lambda implements Function1<View, Unit> {
        public C12266c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            invoke2(view);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(View view) {
            C38292b02.this.f56778e.onSuccess(DialogResponse.OK);
            Dialog dialog = C38292b02.this.getDialog();
            if (dialog != null) {
                dialog.dismiss();
            }
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, m28432d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: b02$d */
    /* loaded from: classes3.dex */
    public static final class C12267d extends Lambda implements Function1<View, Unit> {
        public C12267d() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            invoke2(view);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(View view) {
            C38292b02.this.f56778e.onSuccess(DialogResponse.CANCEL);
            Dialog dialog = C38292b02.this.getDialog();
            if (dialog != null) {
                dialog.dismiss();
            }
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, m28432d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: b02$e */
    /* loaded from: classes3.dex */
    public static final class C12268e extends Lambda implements Function1<View, Unit> {
        public C12268e() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            invoke2(view);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(View view) {
            C38292b02.this.f56778e.onSuccess(DialogResponse.CANCEL);
            Dialog dialog = C38292b02.this.getDialog();
            if (dialog != null) {
                dialog.dismiss();
            }
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"Lsx4;", "b", "()Lsx4;"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nInboundAcceptanceBottomSheet.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InboundAcceptanceBottomSheet.kt\nco/bird/android/feature/transferorder/scanner/inbound/dialog/InboundAcceptanceBottomSheet$renderer$2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,157:1\n1#2:158\n*E\n"})
    /* renamed from: b02$f */
    /* loaded from: classes3.dex */
    public static final class C12269f extends Lambda implements Function0<C48955sx4> {
        public C12269f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b */
        public final C48955sx4 invoke() {
            FragmentActivity activity = C38292b02.this.getActivity();
            if (activity != null) {
                if (!(activity instanceof AppCompatActivity)) {
                    activity = null;
                }
                if (activity != null) {
                    return new C48955sx4((AppCompatActivity) activity);
                }
                return null;
            }
            return null;
        }
    }

    public C38292b02() {
        Lazy lazy;
        C24567g<DialogResponse> m31882w0 = C24567g.m31882w0();
        Intrinsics.checkNotNullExpressionValue(m31882w0, "create<DialogResponse>()");
        this.f56778e = m31882w0;
        lazy = LazyKt__LazyJVMKt.lazy(new C12269f());
        this.f56779f = lazy;
    }

    @Override // p000.InterfaceC48362rx4
    /* renamed from: A9 */
    public void render(AbstractC43646k02 state) {
        C48955sx4 m65131t8;
        C51627xT5 c51627xT5;
        String m5237c;
        String m5238b;
        AbstractC23442F birdDialog$default;
        Intrinsics.checkNotNullParameter(state, "state");
        if (state instanceof C51627xT5) {
            C48955sx4 m65131t82 = m65131t8();
            if (m65131t82 != null && (m5237c = (c51627xT5 = (C51627xT5) state).m5237c()) != null && (m5238b = c51627xT5.m5238b()) != null && (birdDialog$default = H31.C3014a.birdDialog$default(m65131t82, new C45429n06(m5237c, m5238b), false, false, 6, null)) != null) {
                AndroidLifecycleScopeProvider m45195i = AndroidLifecycleScopeProvider.m45195i(this, C43626jy1.f93627b);
                Intrinsics.checkExpressionValueIsNotNull(m45195i, "AndroidLifecycleScopePro…m(this, boundaryResolver)");
                Object m33135e = birdDialog$default.m33135e(AutoDispose.m45239a(m45195i));
                Intrinsics.checkExpressionValueIsNotNull(m33135e, "this.`as`(AutoDispose.autoDisposable(provider))");
                SingleSubscribeProxy singleSubscribeProxy = (SingleSubscribeProxy) m33135e;
                if (singleSubscribeProxy != null) {
                    singleSubscribeProxy.subscribe();
                }
            }
        } else if ((state instanceof C38092ag1) && (m65131t8 = m65131t8()) != null) {
            C38689bg5.m64178c(m65131t8, ((C38092ag1) state).m70897b());
        }
    }

    @Override // p000.InterfaceC43053j02
    /* renamed from: L3 */
    public Observable<Unit> mo31272L3() {
        C39494d00 c39494d00 = this.f56777d;
        if (c39494d00 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            c39494d00 = null;
        }
        Button button = c39494d00.f75949f;
        Intrinsics.checkNotNullExpressionValue(button, "binding.testRide");
        return C44626lf5.clicksThrottle$default(button, 0L, 1, null);
    }

    /* renamed from: N6 */
    public final C41274g02 m65133N6() {
        C41274g02 c41274g02 = this.f56775b;
        if (c41274g02 != null) {
            return c41274g02;
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
    public final AbstractC23442F<DialogResponse> m65132a5() {
        AbstractC23442F<DialogResponse> m33160F = this.f56778e.m33160F();
        Intrinsics.checkNotNullExpressionValue(m33160F, "dialogResponse.hide()");
        return m33160F;
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
        return C39494d00.m44747c(getLayoutInflater(), viewGroup, false).getRoot();
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x00c8, code lost:
        if (r11 == null) goto L130;
     */
    @Override // androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onViewCreated(View view, Bundle bundle) {
        Application application;
        List emptyList;
        TransferOrderDemandSource transferOrderDemandSource;
        int i;
        Button button;
        String str;
        String str2;
        Enum r12;
        boolean equals;
        int collectionSizeOrDefault;
        Enum r6;
        Object[] enumConstants;
        int i2;
        boolean equals2;
        Intrinsics.checkNotNullParameter(view, "view");
        C39494d00 m44749a = C39494d00.m44749a(view);
        Intrinsics.checkNotNullExpressionValue(m44749a, "bind(view)");
        this.f56777d = m44749a;
        InterfaceC36379Uj5.InterfaceC8430a m85511a = SP0.m85511a();
        C46172oG2 c46172oG2 = C46172oG2.f101711a;
        FragmentActivity activity = getActivity();
        if (activity != null) {
            application = activity.getApplication();
        } else {
            application = null;
        }
        if (application == null) {
            return;
        }
        m85511a.mo80956a(c46172oG2.m21419a(application)).mo80958c(this);
        Bundle arguments = getArguments();
        if (arguments != null) {
            ArrayList<String> stringArrayList = arguments.getStringArrayList("vehicle_acceptance_options");
            if (stringArrayList != null) {
                collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(stringArrayList, 10);
                emptyList = new ArrayList(collectionSizeOrDefault);
                for (String name : stringArrayList) {
                    Intrinsics.checkNotNullExpressionValue(name, "name");
                    try {
                        enumConstants = TransferOrderVehicleAcceptAction.class.getEnumConstants();
                        Intrinsics.checkNotNull(enumConstants);
                    } catch (Exception unused) {
                        Object[] enumConstants2 = TransferOrderVehicleAcceptAction.class.getEnumConstants();
                        Intrinsics.checkNotNull(enumConstants2);
                        for (Object obj : enumConstants2) {
                            Enum r14 = (Enum) obj;
                            if (Intrinsics.areEqual(r14.name(), "UNKNOWN")) {
                                Intrinsics.checkNotNullExpressionValue(obj, "{\n    E::class.java.enum…m.name == \"UNKNOWN\" }\n  }");
                                r6 = r14;
                            }
                        }
                        throw new NoSuchElementException("Array contains no element matching the predicate.");
                    }
                    for (Object obj2 : enumConstants) {
                        equals2 = StringsKt__StringsJVMKt.equals(((Enum) obj2).name(), name, true);
                        if (equals2) {
                            Intrinsics.checkNotNullExpressionValue(obj2, "{\n    E::class.java.enum….equals(name, true) }\n  }");
                            r6 = (Enum) obj2;
                            emptyList.add(r6);
                        }
                    }
                    throw new NoSuchElementException("Array contains no element matching the predicate.");
                }
            } else {
                emptyList = CollectionsKt__CollectionsKt.emptyList();
            }
        }
        emptyList = CollectionsKt__CollectionsKt.emptyList();
        Bundle arguments2 = getArguments();
        if (arguments2 != null) {
            String string = arguments2.getString("demand_source");
            if (string != null) {
                try {
                    Object[] enumConstants3 = TransferOrderDemandSource.class.getEnumConstants();
                    Intrinsics.checkNotNull(enumConstants3);
                    for (Object obj3 : enumConstants3) {
                        equals = StringsKt__StringsJVMKt.equals(((Enum) obj3).name(), string, true);
                        if (equals) {
                            Intrinsics.checkNotNullExpressionValue(obj3, "{\n    E::class.java.enum….equals(name, true) }\n  }");
                            r12 = (Enum) obj3;
                        }
                    }
                    throw new NoSuchElementException("Array contains no element matching the predicate.");
                } catch (Exception unused2) {
                    Object[] enumConstants4 = TransferOrderDemandSource.class.getEnumConstants();
                    Intrinsics.checkNotNull(enumConstants4);
                    for (Object obj4 : enumConstants4) {
                        r12 = (Enum) obj4;
                        if (Intrinsics.areEqual(r12.name(), "UNKNOWN")) {
                            Intrinsics.checkNotNullExpressionValue(obj4, "{\n    E::class.java.enum…m.name == \"UNKNOWN\" }\n  }");
                        }
                    }
                    throw new NoSuchElementException("Array contains no element matching the predicate.");
                }
            }
            r12 = null;
            transferOrderDemandSource = (TransferOrderDemandSource) r12;
        } else {
            transferOrderDemandSource = null;
        }
        if (transferOrderDemandSource == null) {
            i = -1;
        } else {
            i = C12265b.$EnumSwitchMapping$0[transferOrderDemandSource.ordinal()];
        }
        if (i != 1 && i != 2) {
            C39494d00 c39494d00 = this.f56777d;
            if (c39494d00 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                c39494d00 = null;
            }
            button = c39494d00.f75947d;
            Intrinsics.checkNotNullExpressionValue(button, "{\n        binding.rejectOperator\n      }");
        } else {
            C39494d00 c39494d002 = this.f56777d;
            if (c39494d002 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                c39494d002 = null;
            }
            button = c39494d002.f75948e;
            Intrinsics.checkNotNullExpressionValue(button, "{\n        binding.rejectServiceCenter\n      }");
        }
        C39494d00 c39494d003 = this.f56777d;
        if (c39494d003 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            c39494d003 = null;
        }
        TextView textView = c39494d003.f75950g;
        Bundle arguments3 = getArguments();
        if (arguments3 == null || (str = arguments3.getString("title")) == null) {
            Context context = getContext();
            if (context != null) {
                str = context.getString(C45871nl4.generic_accept_question);
            } else {
                str = null;
            }
        }
        textView.setText(str);
        C39494d00 c39494d004 = this.f56777d;
        if (c39494d004 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            c39494d004 = null;
        }
        Button button2 = c39494d004.f75945b;
        Bundle arguments4 = getArguments();
        if (arguments4 == null || (str2 = arguments4.getString("button")) == null) {
            Context context2 = getContext();
            if (context2 != null) {
                str2 = context2.getString(C45871nl4.generic_accept_uppercase);
            } else {
                str2 = null;
            }
        }
        button2.setText(str2);
        String str3 = null;
        C49520tu6.show$default(button, emptyList.contains(TransferOrderVehicleAcceptAction.REJECT), 0, 2, null);
        C39494d00 c39494d005 = this.f56777d;
        if (c39494d005 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            c39494d005 = null;
        }
        Button button3 = c39494d005.f75949f;
        Intrinsics.checkNotNullExpressionValue(button3, "binding.testRide");
        C49520tu6.show$default(button3, emptyList.contains(TransferOrderVehicleAcceptAction.TEST_RIDE), 0, 2, null);
        C39494d00 c39494d006 = this.f56777d;
        if (c39494d006 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            c39494d006 = null;
        }
        Button button4 = c39494d006.f75945b;
        Intrinsics.checkNotNullExpressionValue(button4, "binding.accept");
        C34585Ms2.m94661j(button4, new C12266c());
        C39494d00 c39494d007 = this.f56777d;
        if (c39494d007 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            c39494d007 = null;
        }
        Button button5 = c39494d007.f75947d;
        Intrinsics.checkNotNullExpressionValue(button5, "binding.rejectOperator");
        C34585Ms2.m94661j(button5, new C12267d());
        C39494d00 c39494d008 = this.f56777d;
        if (c39494d008 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            c39494d008 = null;
        }
        Button button6 = c39494d008.f75948e;
        Intrinsics.checkNotNullExpressionValue(button6, "binding.rejectServiceCenter");
        C34585Ms2.m94661j(button6, new C12268e());
        m65133N6().consume(this);
        C41274g02 m65133N6 = m65133N6();
        Bundle arguments5 = getArguments();
        if (arguments5 != null) {
            str3 = arguments5.getString("bird_id");
        }
        Bundle arguments6 = getArguments();
        m65133N6.m42280h(new DO5(str3, (arguments6 == null || (r3 = arguments6.getString("sku_order_id")) == null) ? "" : ""));
    }

    /* renamed from: t8 */
    public final C48955sx4 m65131t8() {
        return (C48955sx4) this.f56779f.getValue();
    }
}
