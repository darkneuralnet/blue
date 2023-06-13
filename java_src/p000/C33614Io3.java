package p000;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.C11894g;
import androidx.recyclerview.widget.LinearLayoutManager;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.feature.transferorder.operator.OperatorOrderActivity;
import co.bird.android.feature.transferorder.widgets.ClickableDisabledButton;
import co.bird.android.model.DialogResponse;
import co.bird.android.model.constant.OperatorOrderViewType;
import com.amazonaws.mobileconnectors.p025s3.transferutility.TransferTable;
import com.facebook.share.internal.C17296a;
import com.stripe.android.stripe3ds2.transactions.MessageExtension;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.ScopeProvider;
import com.uber.autodispose.SingleSubscribeProxy;
import com.uber.autodispose.android.lifecycle.AndroidLifecycleScopeProvider;
import io.reactivex.AbstractC23442F;
import io.reactivex.AbstractC24507p;
import io.reactivex.InterfaceC23496h;
import io.reactivex.InterfaceC24574u;
import io.reactivex.Observable;
import io.reactivex.functions.InterfaceC23492o;
import io.reactivex.subjects.C24567g;
import java.util.List;
import java.util.NoSuchElementException;
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
import kotlin.text.StringsKt__StringsJVMKt;
import p000.C33614Io3;
import p000.H31;
import p000.S74;
@Metadata(m28433d1 = {"\u0000\u009a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 J2\u00020\u00012\u00020\u0002:\u0001KB\u0007¢\u0006\u0004\bH\u0010IJ&\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016J\u001a\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016J\"\u0010\u0013\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000e2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0016J\b\u0010\u0015\u001a\u00020\u0014H\u0016J\u0010\u0010\u0018\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\u0016H\u0016J\u000e\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019H\u0016J\u000e\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\f0\u0019H\u0016J\u000e\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\f0\u0019H\u0016J\u000e\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u0019H\u0016J\u000e\u0010!\u001a\b\u0012\u0004\u0012\u00020\f0 H\u0016R\"\u0010)\u001a\u00020\"8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\"\u00101\u001a\u00020*8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\u0016\u00105\u001a\u0002028\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b3\u00104R\u001b\u0010;\u001a\u0002068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b9\u0010:R\u0014\u0010?\u001a\u00020<8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>R\"\u0010D\u001a\u0010\u0012\f\u0012\n A*\u0004\u0018\u00010\u001e0\u001e0@8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010CR\"\u0010G\u001a\u0010\u0012\f\u0012\n A*\u0004\u0018\u00010\f0\f0E8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010F¨\u0006L"}, m28432d2 = {"LIo3;", "Landroidx/fragment/app/Fragment;", "Llp3;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "view", "", "onViewCreated", "", "requestCode", "resultCode", "Landroid/content/Intent;", MessageExtension.FIELD_DATA, "onActivityResult", "Lio/reactivex/h;", "T0", "Lmp3;", TransferTable.COLUMN_STATE, "D9", "Lio/reactivex/Observable;", "", "f7", "h", "Z6", "Lco/bird/android/model/constant/OperatorOrderViewType;", "G7", "Lio/reactivex/F;", "W3", "Lhp3;", "b", "Lhp3;", "B9", "()Lhp3;", "setPresenter", "(Lhp3;)V", "presenter", "LGo3;", "c", "LGo3;", "t8", "()LGo3;", "setConverter", "(LGo3;)V", "converter", "Lty1;", DateTokenConverter.CONVERTER_KEY, "Lty1;", "binding", "Lsx4;", "e", "Lkotlin/Lazy;", "A9", "()Lsx4;", "delegateRenderer", "LDo3;", "f", "LDo3;", "adapter", "Lma4;", "kotlin.jvm.PlatformType", "g", "Lma4;", "scanCompletesRelay", "Lio/reactivex/subjects/g;", "Lio/reactivex/subjects/g;", "bolAddedSubject", "<init>", "()V", "i", C17296a.f69688o, "co.bird.android.feature.transfer-order"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nOperatorOrderDetailsFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OperatorOrderDetailsFragment.kt\nco/bird/android/feature/transferorder/operator/details/OperatorOrderDetailsFragment\n+ 2 Bundle+.kt\nco/bird/android/library/extension/Bundle_Kt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Enum+.kt\nco/bird/android/library/extension/Enum_Kt\n+ 5 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 6 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 7 KotlinExtensions.kt\ncom/uber/autodispose/android/lifecycle/KotlinExtensionsKt\n+ 8 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n*L\n1#1,190:1\n6#2:191\n1#3:192\n1#3:199\n13#4,2:193\n15#4,2:197\n1109#5,2:195\n1855#6,2:200\n64#7:202\n199#8:203\n*S KotlinDebug\n*F\n+ 1 OperatorOrderDetailsFragment.kt\nco/bird/android/feature/transferorder/operator/details/OperatorOrderDetailsFragment\n*L\n85#1:191\n85#1:192\n85#1:193,2\n85#1:197,2\n85#1:195,2\n113#1:200,2\n117#1:202\n162#1:203\n*E\n"})
/* renamed from: Io3  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C33614Io3 extends Fragment implements InterfaceC44724lp3 {

    /* renamed from: i */
    public static final C3760a f16223i = new C3760a(null);

    /* renamed from: b */
    public C42352hp3 f16224b;

    /* renamed from: c */
    public C33146Go3 f16225c;

    /* renamed from: d */
    public C49555ty1 f16226d;

    /* renamed from: e */
    public final Lazy f16227e;

    /* renamed from: f */
    public final C32444Do3 f16228f;

    /* renamed from: g */
    public final C45168ma4<OperatorOrderViewType> f16229g;

    /* renamed from: h */
    public final C24567g<Unit> f16230h;

    @Metadata(m28433d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0016\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004R\u0014\u0010\b\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\t¨\u0006\r"}, m28432d2 = {"LIo3$a;", "", "", "orderId", "Lco/bird/android/model/constant/OperatorOrderViewType;", "type", "LIo3;", C17296a.f69688o, "ORDER_ID", "Ljava/lang/String;", "TYPE", "<init>", "()V", "co.bird.android.feature.transfer-order"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: Io3$a */
    /* loaded from: classes3.dex */
    public static final class C3760a {
        public /* synthetic */ C3760a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C33614Io3 m101692a(String orderId, OperatorOrderViewType type) {
            Intrinsics.checkNotNullParameter(orderId, "orderId");
            Intrinsics.checkNotNullParameter(type, "type");
            C33614Io3 c33614Io3 = new C33614Io3();
            Bundle bundle = new Bundle();
            bundle.putString("order_id", orderId);
            C40749f70.m42020a(bundle, "type", type);
            c33614Io3.setArguments(bundle);
            return c33614Io3;
        }

        private C3760a() {
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Io3$b */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C3761b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[OperatorOrderViewType.values().length];
            try {
                iArr[OperatorOrderViewType.DROP_OFF.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[OperatorOrderViewType.LONGTAIL_RETURN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[OperatorOrderViewType.PICK_UP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[OperatorOrderViewType.LONGTAIL_DELIVERY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a*\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00000\u0000 \u0003*\u0014\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00000\u0000\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"", "it", "Lio/reactivex/u;", "kotlin.jvm.PlatformType", "b", "(Lkotlin/Unit;)Lio/reactivex/u;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Io3$c */
    /* loaded from: classes3.dex */
    public static final class C3762c extends Lambda implements Function1<Unit, InterfaceC24574u<? extends Unit>> {

        @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a*\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lco/bird/android/model/DialogResponse;", "it", "Lio/reactivex/u;", "", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/model/DialogResponse;)Lio/reactivex/u;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: Io3$c$a */
        /* loaded from: classes3.dex */
        public static final class C3763a extends Lambda implements Function1<DialogResponse, InterfaceC24574u<? extends Unit>> {

            /* renamed from: g */
            public static final C3763a f16232g = new C3763a();

            public C3763a() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final InterfaceC24574u<? extends Unit> invoke(DialogResponse it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return AbstractC24507p.m32024u();
            }
        }

        public C3762c() {
            super(1);
        }

        /* renamed from: c */
        public static final InterfaceC24574u m101689c(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (InterfaceC24574u) tmp0.invoke(obj);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b */
        public final InterfaceC24574u<? extends Unit> invoke(Unit it) {
            Intrinsics.checkNotNullParameter(it, "it");
            C49555ty1 c49555ty1 = C33614Io3.this.f16226d;
            if (c49555ty1 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                c49555ty1 = null;
            }
            if (!c49555ty1.f111424b.isEnabled()) {
                AbstractC23442F birdDialog$default = H31.C3014a.birdDialog$default(C33614Io3.this.m101698A9(), C35582Qz0.f31341d, false, false, 6, null);
                final C3763a c3763a = C3763a.f16232g;
                return birdDialog$default.m33163C(new InterfaceC23492o() { // from class: Jo3
                    @Override // io.reactivex.functions.InterfaceC23492o
                    public final Object apply(Object obj) {
                        InterfaceC24574u m101689c;
                        m101689c = C33614Io3.C3762c.m101689c(Function1.this, obj);
                        return m101689c;
                    }
                });
            }
            return AbstractC24507p.m32068G(Unit.INSTANCE);
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"Lsx4;", "b", "()Lsx4;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Io3$d */
    /* loaded from: classes3.dex */
    public static final class C3764d extends Lambda implements Function0<C48955sx4> {
        public C3764d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b */
        public final C48955sx4 invoke() {
            FragmentActivity activity = C33614Io3.this.getActivity();
            Intrinsics.checkNotNull(activity, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
            return new C48955sx4((AppCompatActivity) activity);
        }
    }

    public C33614Io3() {
        Lazy lazy;
        lazy = LazyKt__LazyJVMKt.lazy(new C3764d());
        this.f16227e = lazy;
        this.f16228f = new C32444Do3();
        C45168ma4<OperatorOrderViewType> m25409g = C45168ma4.m25409g();
        Intrinsics.checkNotNullExpressionValue(m25409g, "create<OperatorOrderViewType>()");
        this.f16229g = m25409g;
        C24567g<Unit> m31882w0 = C24567g.m31882w0();
        Intrinsics.checkNotNullExpressionValue(m31882w0, "create<Unit>()");
        this.f16230h = m31882w0;
    }

    /* renamed from: N6 */
    public static final InterfaceC24574u m101695N6(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC24574u) tmp0.invoke(obj);
    }

    /* renamed from: A9 */
    public final C48955sx4 m101698A9() {
        return (C48955sx4) this.f16227e.getValue();
    }

    /* renamed from: B9 */
    public final C42352hp3 m101697B9() {
        C42352hp3 c42352hp3 = this.f16224b;
        if (c42352hp3 != null) {
            return c42352hp3;
        }
        Intrinsics.throwUninitializedPropertyAccessException("presenter");
        return null;
    }

    @Override // p000.InterfaceC48362rx4
    /* renamed from: D9 */
    public void render(AbstractC45317mp3 state) {
        String str;
        Intrinsics.checkNotNullParameter(state, "state");
        C49555ty1 c49555ty1 = null;
        if (state instanceof C51284wt2) {
            S74.C7343a.showProgress$default(m101698A9(), ((C51284wt2) state).m6187b(), 0, 2, null);
        } else if (state instanceof C44806lx5) {
            C49555ty1 c49555ty12 = this.f16226d;
            if (c49555ty12 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                c49555ty12 = null;
            }
            Button button = c49555ty12.f111427e;
            C44806lx5 c44806lx5 = (C44806lx5) state;
            OperatorOrderViewType m26595e = c44806lx5.m26595e();
            OperatorOrderViewType operatorOrderViewType = OperatorOrderViewType.PICK_UP;
            if (m26595e == operatorOrderViewType && c44806lx5.m26596d()) {
                str = getString(C45871nl4.transfer_orders_begin_pickup_uppercased);
            } else if (c44806lx5.m26595e() == operatorOrderViewType) {
                str = getString(C45871nl4.transfer_orders_continue_pickup_uppercased);
            } else {
                OperatorOrderViewType m26595e2 = c44806lx5.m26595e();
                OperatorOrderViewType operatorOrderViewType2 = OperatorOrderViewType.DROP_OFF;
                if (m26595e2 == operatorOrderViewType2 && c44806lx5.m26596d()) {
                    str = getString(C45871nl4.transfer_orders_begin_return_uppercased);
                } else if (c44806lx5.m26595e() == operatorOrderViewType2) {
                    str = getString(C45871nl4.transfer_orders_continue_return_uppercased);
                } else {
                    OperatorOrderViewType m26595e3 = c44806lx5.m26595e();
                    OperatorOrderViewType operatorOrderViewType3 = OperatorOrderViewType.LONGTAIL_DELIVERY;
                    if (m26595e3 == operatorOrderViewType3 && c44806lx5.m26596d()) {
                        str = getString(C45871nl4.operator_begin_delivery_order_scan_label_uppercased);
                    } else if (c44806lx5.m26595e() == operatorOrderViewType3) {
                        str = getString(C45871nl4.operator_continue_delivery_order_scan_label_uppercased);
                    } else {
                        OperatorOrderViewType m26595e4 = c44806lx5.m26595e();
                        OperatorOrderViewType operatorOrderViewType4 = OperatorOrderViewType.LONGTAIL_RETURN;
                        if (m26595e4 == operatorOrderViewType4 && c44806lx5.m26596d()) {
                            str = getString(C45871nl4.operator_begin_return_order_scan_label_uppercased);
                        } else if (c44806lx5.m26595e() == operatorOrderViewType4) {
                            str = getString(C45871nl4.operator_continue_return_order_scan_label_uppercased);
                        } else {
                            str = null;
                        }
                    }
                }
            }
            button.setText(str);
            C49555ty1 c49555ty13 = this.f16226d;
            if (c49555ty13 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                c49555ty13 = null;
            }
            c49555ty13.f111424b.setEnabled(c44806lx5.m26594f());
            C49555ty1 c49555ty14 = this.f16226d;
            if (c49555ty14 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                c49555ty14 = null;
            }
            boolean z = true;
            c49555ty14.f111424b.setClickable(true);
            if (c44806lx5.m26595e() == OperatorOrderViewType.LONGTAIL_DELIVERY) {
                C49555ty1 c49555ty15 = this.f16226d;
                if (c49555ty15 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    c49555ty15 = null;
                }
                Button button2 = c49555ty15.f111427e;
                Intrinsics.checkNotNullExpressionValue(button2, "binding.scan");
                C49520tu6.show$default(button2, c44806lx5.m26598b(), 0, 2, null);
                C49555ty1 c49555ty16 = this.f16226d;
                if (c49555ty16 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    c49555ty16 = null;
                }
                ClickableDisabledButton clickableDisabledButton = c49555ty16.f111424b;
                Intrinsics.checkNotNullExpressionValue(clickableDisabledButton, "binding.addBol");
                C49520tu6.show$default(clickableDisabledButton, true ^ c44806lx5.m26598b(), 0, 2, null);
            } else if (c44806lx5.m26595e() == OperatorOrderViewType.LONGTAIL_RETURN) {
                C49555ty1 c49555ty17 = this.f16226d;
                if (c49555ty17 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    c49555ty17 = null;
                }
                Button button3 = c49555ty17.f111427e;
                Intrinsics.checkNotNullExpressionValue(button3, "binding.scan");
                C49520tu6.show$default(button3, c44806lx5.m26597c(), 0, 2, null);
                C49555ty1 c49555ty18 = this.f16226d;
                if (c49555ty18 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    c49555ty18 = null;
                }
                ClickableDisabledButton clickableDisabledButton2 = c49555ty18.f111424b;
                Intrinsics.checkNotNullExpressionValue(clickableDisabledButton2, "binding.addBol");
                if (c44806lx5.m26597c() || c44806lx5.m26598b()) {
                    z = false;
                }
                C49520tu6.show$default(clickableDisabledButton2, z, 0, 2, null);
            }
            C49555ty1 c49555ty19 = this.f16226d;
            if (c49555ty19 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                c49555ty1 = c49555ty19;
            }
            c49555ty1.f111427e.setEnabled(c44806lx5.m26597c());
        } else if (state instanceof C46335oY3) {
            S74.C7343a.showProgress$default(m101698A9(), false, 0, 2, null);
            this.f16228f.mo24871u(m101693t8().m104708a(((C46335oY3) state).m20906b()));
        } else if (state instanceof C25915m7) {
            C25915m7 c25915m7 = (C25915m7) state;
            C10571a7 m71884a = C10571a7.f49837i.m71884a(c25915m7.m26330b(), c25915m7.m26329c());
            m71884a.show(getChildFragmentManager(), "AddBillOfLadingBottomSheet");
            AbstractC23442F<Unit> m71887W3 = m71884a.m71887W3();
            ScopeProvider UNBOUND = ScopeProvider.f75557g0;
            Intrinsics.checkNotNullExpressionValue(UNBOUND, "UNBOUND");
            Object m33135e = m71887W3.m33135e(AutoDispose.m45239a(UNBOUND));
            Intrinsics.checkExpressionValueIsNotNull(m33135e, "this.`as`(AutoDispose.autoDisposable(provider))");
            ((SingleSubscribeProxy) m33135e).mo45205a(this.f16230h);
        } else if (state instanceof C45937ns0) {
            C49555ty1 c49555ty110 = this.f16226d;
            if (c49555ty110 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                c49555ty110 = null;
            }
            FrameLayout frameLayout = c49555ty110.f111425c;
            Intrinsics.checkNotNullExpressionValue(frameLayout, "binding.container");
            C49520tu6.show$default(frameLayout, false, 0, 2, null);
            C31742Ao3.f1119e.m115200a(((C45937ns0) state).m22268b()).show(getParentFragmentManager(), "OperatorOrderCompletedDialog");
        }
    }

    @Override // p000.InterfaceC44724lp3
    /* renamed from: G7 */
    public Observable<OperatorOrderViewType> mo26765G7() {
        Observable<OperatorOrderViewType> hide = this.f16229g.hide();
        Intrinsics.checkNotNullExpressionValue(hide, "scanCompletesRelay.hide()");
        return hide;
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

    @Override // p000.InterfaceC44724lp3
    /* renamed from: W3 */
    public AbstractC23442F<Unit> mo26764W3() {
        AbstractC23442F<Unit> m33160F = this.f16230h.m33160F();
        Intrinsics.checkNotNullExpressionValue(m33160F, "bolAddedSubject.hide()");
        return m33160F;
    }

    @Override // p000.InterfaceC44724lp3
    /* renamed from: Z6 */
    public Observable<Unit> mo26763Z6() {
        C49555ty1 c49555ty1 = this.f16226d;
        if (c49555ty1 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            c49555ty1 = null;
        }
        ClickableDisabledButton clickableDisabledButton = c49555ty1.f111424b;
        Intrinsics.checkNotNullExpressionValue(clickableDisabledButton, "binding.addBol");
        Observable clicksThrottle$default = C44626lf5.clicksThrottle$default(clickableDisabledButton, 0L, 1, null);
        final C3762c c3762c = new C3762c();
        Observable<Unit> flatMapMaybe = clicksThrottle$default.flatMapMaybe(new InterfaceC23492o() { // from class: Ho3
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC24574u m101695N6;
                m101695N6 = C33614Io3.m101695N6(Function1.this, obj);
                return m101695N6;
            }
        });
        Intrinsics.checkNotNullExpressionValue(flatMapMaybe, "override fun addBolClick….just(Unit)\n      }\n    }");
        return flatMapMaybe;
    }

    @Override // p000.InterfaceC44724lp3
    /* renamed from: f7 */
    public Observable<String> mo26762f7() {
        return this.f16228f.m109918v();
    }

    @Override // p000.InterfaceC44724lp3
    /* renamed from: h */
    public Observable<Unit> mo26761h() {
        C49555ty1 c49555ty1 = this.f16226d;
        if (c49555ty1 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            c49555ty1 = null;
        }
        Button button = c49555ty1.f111427e;
        Intrinsics.checkNotNullExpressionValue(button, "binding.scan");
        return C44626lf5.clicksThrottle$default(button, 0L, 1, null);
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i2 == -1) {
            switch (i) {
                case 10050:
                    this.f16229g.accept(OperatorOrderViewType.PICK_UP);
                    break;
                case 10051:
                    this.f16229g.accept(OperatorOrderViewType.DROP_OFF);
                    break;
                case 10052:
                    this.f16229g.accept(OperatorOrderViewType.LONGTAIL_DELIVERY);
                    break;
                case 10053:
                    this.f16229g.accept(OperatorOrderViewType.LONGTAIL_RETURN);
                    break;
            }
        }
        List<Fragment> m67283z0 = getChildFragmentManager().m67283z0();
        Intrinsics.checkNotNullExpressionValue(m67283z0, "childFragmentManager.fragments");
        for (Fragment fragment : m67283z0) {
            fragment.onActivityResult(i, i2, intent);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        return C49555ty1.m11138c(inflater, viewGroup, false).getRoot();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.lang.Enum] */
    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        OperatorOrderActivity operatorOrderActivity;
        String str;
        int i;
        boolean equals;
        Intrinsics.checkNotNullParameter(view, "view");
        C49555ty1 m11140a = C49555ty1.m11140a(view);
        Intrinsics.checkNotNullExpressionValue(m11140a, "bind(view)");
        this.f16226d = m11140a;
        FragmentActivity activity = getActivity();
        OperatorOrderViewType operatorOrderViewType = null;
        if (activity instanceof OperatorOrderActivity) {
            operatorOrderActivity = (OperatorOrderActivity) activity;
        } else {
            operatorOrderActivity = null;
        }
        if (operatorOrderActivity == null) {
            return;
        }
        operatorOrderActivity.m56543P().mo56524d(this);
        C49555ty1 c49555ty1 = this.f16226d;
        if (c49555ty1 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            c49555ty1 = null;
        }
        c49555ty1.f111426d.setLayoutManager(new LinearLayoutManager(getContext()));
        C49555ty1 c49555ty12 = this.f16226d;
        if (c49555ty12 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            c49555ty12 = null;
        }
        c49555ty12.f111426d.setAdapter(this.f16228f);
        C49555ty1 c49555ty13 = this.f16226d;
        if (c49555ty13 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            c49555ty13 = null;
        }
        c49555ty13.f111426d.setItemAnimator(new C11894g());
        m101697B9().consume(this);
        Bundle arguments = getArguments();
        if (arguments != null) {
            str = arguments.getString("order_id");
        } else {
            str = null;
        }
        Bundle arguments2 = getArguments();
        if (arguments2 != null) {
            String string = arguments2.getString("type");
            if (string != null) {
                try {
                    Object[] enumConstants = OperatorOrderViewType.class.getEnumConstants();
                    Intrinsics.checkNotNull(enumConstants);
                    for (Object obj : enumConstants) {
                        equals = StringsKt__StringsJVMKt.equals(((Enum) obj).name(), string, true);
                        if (equals) {
                            Intrinsics.checkNotNullExpressionValue(obj, "{\n    E::class.java.enum….equals(name, true) }\n  }");
                            operatorOrderViewType = (Enum) obj;
                        }
                    }
                    throw new NoSuchElementException("Array contains no element matching the predicate.");
                } catch (Exception unused) {
                    Object[] enumConstants2 = OperatorOrderViewType.class.getEnumConstants();
                    Intrinsics.checkNotNull(enumConstants2);
                    for (Object obj2 : enumConstants2) {
                        ?? r6 = (Enum) obj2;
                        if (Intrinsics.areEqual(r6.name(), "UNKNOWN")) {
                            Intrinsics.checkNotNullExpressionValue(obj2, "{\n    E::class.java.enum…m.name == \"UNKNOWN\" }\n  }");
                            operatorOrderViewType = r6;
                        }
                    }
                    throw new NoSuchElementException("Array contains no element matching the predicate.");
                }
            }
            operatorOrderViewType = operatorOrderViewType;
        }
        if (str != null) {
            if (operatorOrderViewType != null) {
                m101697B9().m42280h(new IO5(str, operatorOrderViewType));
                ActionBar supportActionBar = operatorOrderActivity.getSupportActionBar();
                if (supportActionBar != null) {
                    int i2 = C3761b.$EnumSwitchMapping$0[operatorOrderViewType.ordinal()];
                    if (i2 != 1 && i2 != 2) {
                        if (i2 != 3) {
                            if (i2 != 4) {
                                return;
                            }
                            i = C45871nl4.transfer_order_delivery_order;
                        } else {
                            i = C45871nl4.transfer_orders_pickup_order;
                        }
                    } else {
                        i = C45871nl4.transfer_orders_return_order;
                    }
                    supportActionBar.mo70243D(i);
                    return;
                }
                return;
            }
            throw new IllegalArgumentException("Must supply type value to view order ".toString());
        }
        throw new IllegalArgumentException("Cannot view null order with null id".toString());
    }

    /* renamed from: t8 */
    public final C33146Go3 m101693t8() {
        C33146Go3 c33146Go3 = this.f16225c;
        if (c33146Go3 != null) {
            return c33146Go3;
        }
        Intrinsics.throwUninitializedPropertyAccessException("converter");
        return null;
    }
}
