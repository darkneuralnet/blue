package co.bird.android.library.purchasepayment;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import co.bird.android.core.mrp.BaseActivityLite;
import co.bird.android.library.purchasepayment.InterfaceC16062b;
import co.bird.android.library.purchasepayment.PurchasePaymentActivity;
import co.bird.android.model.PaymentAddSource;
import co.bird.android.model.constant.PurchasePaymentReason;
import co.bird.android.navigator.PurchasePaymentActivityResult;
import com.amazonaws.mobileconnectors.p025s3.transferutility.TransferTable;
import com.facebook.share.internal.C17296a;
import com.stripe.android.stripe3ds2.transactions.MessageExtension;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.ObservableSubscribeProxy;
import com.uber.autodispose.ScopeProvider;
import com.uber.autodispose.android.ViewScopeProvider;
import io.reactivex.Observable;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.functions.InterfaceC23492o;
import io.reactivex.subjects.C24558d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsJVMKt;
import p000.H31;
import p000.S74;
@Metadata(m28433d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u001a\u0018\u0000 L2\u00020\u00012\u00020\u0002:\u0001MB\u0007¢\u0006\u0004\bJ\u0010KJ\u0012\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0014J\b\u0010\u0007\u001a\u00020\u0005H\u0016J\"\u0010\r\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0014J\u0010\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u000eH\u0016J\u001c\u0010\u0014\u001a\u00020\u00052\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00120\u0011H\u0002J\u0010\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u0012H\u0003R\"\u0010\u001e\u001a\u00020\u00178\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\"\u0010$\u001a\u0010\u0012\f\u0012\n !*\u0004\u0018\u00010 0 0\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\"\u0010'\u001a\u0010\u0012\f\u0012\n !*\u0004\u0018\u00010%0%0\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010#R:\u0010*\u001a(\u0012$\u0012\"\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u0012 !*\u0010\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u0012\u0018\u00010(0(0\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010#R\u001a\u0010.\u001a\b\u0012\u0004\u0012\u00020\b0+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0016\u00102\u001a\u00020/8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b0\u00101R!\u00109\u001a\b\u0012\u0004\u0012\u000204038VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u00108R!\u0010<\u001a\b\u0012\u0004\u0012\u00020\u0005038VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b:\u00106\u001a\u0004\b;\u00108R!\u0010?\u001a\b\u0012\u0004\u0012\u00020\u0005038VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b=\u00106\u001a\u0004\b>\u00108R \u0010C\u001a\b\u0012\u0004\u0012\u00020 038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b@\u0010A\u001a\u0004\bB\u00108R \u0010F\u001a\b\u0012\u0004\u0012\u00020%038\u0016X\u0096\u0004¢\u0006\f\n\u0004\bD\u0010A\u001a\u0004\bE\u00108R,\u0010I\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00120(038\u0016X\u0096\u0004¢\u0006\f\n\u0004\bG\u0010A\u001a\u0004\bH\u00108¨\u0006N"}, m28432d2 = {"Lco/bird/android/library/purchasepayment/PurchasePaymentActivity;", "Lco/bird/android/core/mrp/BaseActivityLite;", "LIa4;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "onBackPressed", "", "requestCode", "resultCode", "Landroid/content/Intent;", MessageExtension.FIELD_DATA, "onActivityResult", "LKa4;", TransferTable.COLUMN_STATE, "S", "", "", "methods", "P", "key", "Q", "LEa4;", "j", "LEa4;", "R", "()LEa4;", "setPresenter", "(LEa4;)V", "presenter", "Lio/reactivex/subjects/d;", "", "kotlin.jvm.PlatformType", "k", "Lio/reactivex/subjects/d;", "purchaseSubject", "LxD1;", "l", "googlePayResultSubject", "Lkotlin/Pair;", "m", "testMethodClickSubject", "", "n", "Ljava/util/List;", "customViewIds", "LV4;", "o", "LV4;", "binding", "Lio/reactivex/Observable;", "LcL3;", "p", "Lkotlin/Lazy;", "T8", "()Lio/reactivex/Observable;", "googlePayClicks", "q", "R8", "cardClicks", "r", "a9", "paypalClicks", "s", "Lio/reactivex/Observable;", "u3", "readyToPurchase", "t", "P0", "googlePayResult", "u", "G4", "testMethodClicks", "<init>", "()V", "v", C17296a.f69688o, "purchase-payment_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nPurchasePaymentActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PurchasePaymentActivity.kt\nco/bird/android/library/purchasepayment/PurchasePaymentActivity\n+ 2 Intent+.kt\nco/bird/android/library/extension/Intent_Kt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Enum+.kt\nco/bird/android/library/extension/Enum_Kt\n+ 5 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 6 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 7 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,179:1\n6#2:180\n6#2:188\n1#3:181\n1#3:189\n13#4,2:182\n15#4,2:186\n13#4,2:190\n15#4,2:194\n1109#5,2:184\n1109#5,2:192\n1855#6,2:196\n215#7,2:198\n*S KotlinDebug\n*F\n+ 1 PurchasePaymentActivity.kt\nco/bird/android/library/purchasepayment/PurchasePaymentActivity\n*L\n72#1:180\n84#1:188\n72#1:181\n84#1:189\n72#1:182,2\n72#1:186,2\n84#1:190,2\n84#1:194,2\n72#1:184,2\n84#1:192,2\n127#1:196,2\n134#1:198,2\n*E\n"})
/* loaded from: classes3.dex */
public final class PurchasePaymentActivity extends BaseActivityLite implements InterfaceC33489Ia4 {

    /* renamed from: v */
    public static final C16050a f66122v = new C16050a(null);

    /* renamed from: j */
    public C32553Ea4 f66123j;

    /* renamed from: k */
    public final C24558d<Boolean> f66124k;

    /* renamed from: l */
    public final C24558d<C51479xD1> f66125l;

    /* renamed from: m */
    public final C24558d<Pair<String, String>> f66126m;

    /* renamed from: n */
    public final List<Integer> f66127n;

    /* renamed from: o */
    public C8539V4 f66128o;

    /* renamed from: p */
    public final Lazy f66129p;

    /* renamed from: q */
    public final Lazy f66130q;

    /* renamed from: r */
    public final Lazy f66131r;

    /* renamed from: s */
    public final Observable<Boolean> f66132s;

    /* renamed from: t */
    public final Observable<C51479xD1> f66133t;

    /* renamed from: u */
    public final Observable<Pair<String, String>> f66134u;

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004¨\u0006\n"}, m28432d2 = {"Lco/bird/android/library/purchasepayment/PurchasePaymentActivity$a;", "", "", "TEST_METHOD_BANCONTACT_KEY", "Ljava/lang/String;", "TEST_METHOD_GIRO_KEY", "TEST_METHOD_KLARNA_SOFORT_KEY", "TEST_METHOD_SOFORT_KEY", "<init>", "()V", "purchase-payment_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.library.purchasepayment.PurchasePaymentActivity$a */
    /* loaded from: classes3.dex */
    public static final class C16050a {
        public /* synthetic */ C16050a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C16050a() {
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: co.bird.android.library.purchasepayment.PurchasePaymentActivity$b */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C16051b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PurchasePaymentReason.values().length];
            try {
                iArr[PurchasePaymentReason.PAYMENT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PurchasePaymentReason.RIDE_PASS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PurchasePaymentReason.BIRD_PLUS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"Lio/reactivex/Observable;", "", "b", "()Lio/reactivex/Observable;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.library.purchasepayment.PurchasePaymentActivity$c */
    /* loaded from: classes3.dex */
    public static final class C16052c extends Lambda implements Function0<Observable<Unit>> {
        public C16052c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b */
        public final Observable<Unit> invoke() {
            C8539V4 c8539v4 = PurchasePaymentActivity.this.f66128o;
            if (c8539v4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                c8539v4 = null;
            }
            Button button = c8539v4.f38558b;
            Intrinsics.checkNotNullExpressionValue(button, "binding.cardPay");
            return C44626lf5.clicksThrottle$default(button, 0L, 1, null);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0007"}, m28432d2 = {"co/bird/android/library/purchasepayment/PurchasePaymentActivity$d", "Landroid/view/View$OnAttachStateChangeListener;", "Landroid/view/View;", "v", "", "onViewAttachedToWindow", "onViewDetachedFromWindow", "purchase-payment_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nPurchasePaymentActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PurchasePaymentActivity.kt\nco/bird/android/library/purchasepayment/PurchasePaymentActivity$generateTestMethodButtons$2$1$1\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/android/KotlinExtensionsKt\n+ 3 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n*L\n1#1,179:1\n41#2:180\n180#3:181\n*S KotlinDebug\n*F\n+ 1 PurchasePaymentActivity.kt\nco/bird/android/library/purchasepayment/PurchasePaymentActivity$generateTestMethodButtons$2$1$1\n*L\n157#1:180\n157#1:181\n*E\n"})
    /* renamed from: co.bird.android.library.purchasepayment.PurchasePaymentActivity$d */
    /* loaded from: classes3.dex */
    public static final class View$OnAttachStateChangeListenerC16053d implements View.OnAttachStateChangeListener {

        /* renamed from: c */
        public final /* synthetic */ String f66137c;

        /* renamed from: d */
        public final /* synthetic */ String f66138d;

        @Metadata(m28433d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\"\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002 \u0003*\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"<anonymous>", "Lkotlin/Pair;", "", "kotlin.jvm.PlatformType", "it", "", "invoke", "(Lkotlin/Unit;)Lkotlin/Pair;"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: co.bird.android.library.purchasepayment.PurchasePaymentActivity$d$a */
        /* loaded from: classes3.dex */
        public static final class C16054a extends Lambda implements Function1<Unit, Pair<? extends String, ? extends String>> {

            /* renamed from: g */
            public final /* synthetic */ String f66139g;

            /* renamed from: h */
            public final /* synthetic */ String f66140h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C16054a(String str, String str2) {
                super(1);
                this.f66139g = str;
                this.f66140h = str2;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Pair<String, String> invoke(Unit it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return TuplesKt.m28425to(this.f66139g, this.f66140h);
            }
        }

        @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: co.bird.android.library.purchasepayment.PurchasePaymentActivity$d$b */
        /* loaded from: classes3.dex */
        public /* synthetic */ class C16055b extends FunctionReferenceImpl implements Function1<Pair<? extends String, ? extends String>, Unit> {
            public C16055b(Object obj) {
                super(1, obj, C24558d.class, "onNext", "onNext(Ljava/lang/Object;)V", 0);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Pair<? extends String, ? extends String> pair) {
                invoke2((Pair<String, String>) pair);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(Pair<String, String> p0) {
                Intrinsics.checkNotNullParameter(p0, "p0");
                ((C24558d) this.receiver).onNext(p0);
            }
        }

        public View$OnAttachStateChangeListenerC16053d(String str, String str2) {
            this.f66137c = str;
            this.f66138d = str2;
        }

        /* renamed from: c */
        public static final Pair m55990c(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (Pair) tmp0.invoke(obj);
        }

        /* renamed from: d */
        public static final void m55989d(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            tmp0.invoke(obj);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View v) {
            Intrinsics.checkNotNullParameter(v, "v");
            C41318g46.m40163a("onViewAttachedToWindow called, setting up clicks listener", new Object[0]);
            Observable clicksThrottle$default = C44626lf5.clicksThrottle$default(v, 0L, 1, null);
            final C16054a c16054a = new C16054a(this.f66137c, this.f66138d);
            Observable retry = clicksThrottle$default.map(new InterfaceC23492o() { // from class: pa4
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj) {
                    Pair m55990c;
                    m55990c = PurchasePaymentActivity.View$OnAttachStateChangeListenerC16053d.m55990c(Function1.this, obj);
                    return m55990c;
                }
            }).retry();
            Intrinsics.checkNotNullExpressionValue(retry, "methodId, methodTitle) -…\n                .retry()");
            ScopeProvider m45202a = ViewScopeProvider.m45202a(v);
            Intrinsics.checkExpressionValueIsNotNull(m45202a, "ViewScopeProvider.from(this)");
            Object m33094as = retry.m33094as(AutoDispose.m45239a(m45202a));
            Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
            final C16055b c16055b = new C16055b(PurchasePaymentActivity.this.f66126m);
            ((ObservableSubscribeProxy) m33094as).subscribe(new InterfaceC23484g() { // from class: qa4
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj) {
                    PurchasePaymentActivity.View$OnAttachStateChangeListenerC16053d.m55989d(Function1.this, obj);
                }
            });
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View v) {
            Intrinsics.checkNotNullParameter(v, "v");
        }
    }

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a&\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001 \u0002*\u0012\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"Lio/reactivex/Observable;", "LcL3;", "kotlin.jvm.PlatformType", "b", "()Lio/reactivex/Observable;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.library.purchasepayment.PurchasePaymentActivity$e */
    /* loaded from: classes3.dex */
    public static final class C16056e extends Lambda implements Function0<Observable<C39085cL3>> {

        @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"", "it", "LcL3;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lkotlin/Unit;)LcL3;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: co.bird.android.library.purchasepayment.PurchasePaymentActivity$e$a */
        /* loaded from: classes3.dex */
        public static final class C16057a extends Lambda implements Function1<Unit, C39085cL3> {

            /* renamed from: g */
            public final /* synthetic */ PurchasePaymentActivity f66142g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C16057a(PurchasePaymentActivity purchasePaymentActivity) {
                super(1);
                this.f66142g = purchasePaymentActivity;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final C39085cL3 invoke(Unit it) {
                Intrinsics.checkNotNullParameter(it, "it");
                String stringExtra = this.f66142g.getIntent().getStringExtra("transaction_currency");
                Intrinsics.checkNotNull(stringExtra);
                return new C39085cL3(stringExtra, this.f66142g.getIntent().getLongExtra("transaction_amount", 0L));
            }
        }

        public C16056e() {
            super(0);
        }

        /* renamed from: c */
        public static final C39085cL3 m55986c(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (C39085cL3) tmp0.invoke(obj);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b */
        public final Observable<C39085cL3> invoke() {
            C8539V4 c8539v4 = PurchasePaymentActivity.this.f66128o;
            if (c8539v4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                c8539v4 = null;
            }
            Button button = c8539v4.f38559c;
            Intrinsics.checkNotNullExpressionValue(button, "binding.gPay");
            Observable clicksThrottle$default = C44626lf5.clicksThrottle$default(button, 0L, 1, null);
            final C16057a c16057a = new C16057a(PurchasePaymentActivity.this);
            return clicksThrottle$default.map(new InterfaceC23492o() { // from class: ra4
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj) {
                    C39085cL3 m55986c;
                    m55986c = PurchasePaymentActivity.C16056e.m55986c(Function1.this, obj);
                    return m55986c;
                }
            });
        }
    }

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"Lio/reactivex/Observable;", "", "b", "()Lio/reactivex/Observable;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.library.purchasepayment.PurchasePaymentActivity$f */
    /* loaded from: classes3.dex */
    public static final class C16058f extends Lambda implements Function0<Observable<Unit>> {
        public C16058f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b */
        public final Observable<Unit> invoke() {
            C8539V4 c8539v4 = PurchasePaymentActivity.this.f66128o;
            if (c8539v4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                c8539v4 = null;
            }
            Button button = c8539v4.f38560d;
            Intrinsics.checkNotNullExpressionValue(button, "binding.paypal");
            return C44626lf5.clicksThrottle$default(button, 0L, 1, null);
        }
    }

    public PurchasePaymentActivity() {
        Lazy lazy;
        Lazy lazy2;
        Lazy lazy3;
        C24558d<Boolean> m31902e = C24558d.m31902e();
        Intrinsics.checkNotNullExpressionValue(m31902e, "create<Boolean>()");
        this.f66124k = m31902e;
        C24558d<C51479xD1> m31902e2 = C24558d.m31902e();
        Intrinsics.checkNotNullExpressionValue(m31902e2, "create<GooglePayResult>()");
        this.f66125l = m31902e2;
        C24558d<Pair<String, String>> m31902e3 = C24558d.m31902e();
        Intrinsics.checkNotNullExpressionValue(m31902e3, "create<Pair<String, String>>()");
        this.f66126m = m31902e3;
        this.f66127n = new ArrayList();
        lazy = LazyKt__LazyJVMKt.lazy(new C16056e());
        this.f66129p = lazy;
        lazy2 = LazyKt__LazyJVMKt.lazy(new C16052c());
        this.f66130q = lazy2;
        lazy3 = LazyKt__LazyJVMKt.lazy(new C16058f());
        this.f66131r = lazy3;
        Observable<Boolean> hide = m31902e.hide();
        Intrinsics.checkNotNullExpressionValue(hide, "purchaseSubject.hide()");
        this.f66132s = hide;
        Observable<C51479xD1> hide2 = m31902e2.hide();
        Intrinsics.checkNotNullExpressionValue(hide2, "googlePayResultSubject.hide()");
        this.f66133t = hide2;
        Observable<Pair<String, String>> hide3 = m31902e3.hide();
        Intrinsics.checkNotNullExpressionValue(hide3, "testMethodClickSubject.hide()");
        this.f66134u = hide3;
    }

    @Override // p000.InterfaceC33489Ia4
    /* renamed from: G4 */
    public Observable<Pair<String, String>> mo56003G4() {
        return this.f66134u;
    }

    /* renamed from: P */
    public final void m56002P(Map<String, String> map) {
        C8539V4 c8539v4;
        Button button;
        Iterator<T> it = this.f66127n.iterator();
        while (true) {
            c8539v4 = null;
            if (!it.hasNext()) {
                break;
            }
            int intValue = ((Number) it.next()).intValue();
            C8539V4 c8539v42 = this.f66128o;
            if (c8539v42 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                c8539v42 = null;
            }
            LinearLayout root = c8539v42.getRoot();
            Intrinsics.checkNotNullExpressionValue(root, "binding.root");
            View m11238m = C49520tu6.m11238m(root, intValue);
            if (m11238m != null) {
                C8539V4 c8539v43 = this.f66128o;
                if (c8539v43 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                } else {
                    c8539v4 = c8539v43;
                }
                c8539v4.getRoot().removeView(m11238m);
            }
        }
        this.f66127n.clear();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            C41318g46.m40163a("creating test button for " + key + " and " + value + "...", new Object[0]);
            LayoutInflater layoutInflater = getLayoutInflater();
            int i = C39932dk4.generic_payment_method_button;
            C8539V4 c8539v44 = this.f66128o;
            if (c8539v44 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                c8539v44 = null;
            }
            View inflate = layoutInflater.inflate(i, (ViewGroup) c8539v44.getRoot(), false);
            if (inflate instanceof Button) {
                button = (Button) inflate;
            } else {
                button = null;
            }
            if (button != null) {
                button.setId(View.generateViewId());
                this.f66127n.add(Integer.valueOf(button.getId()));
                button.setTag(key);
                button.setText(value);
                C8539V4 c8539v45 = this.f66128o;
                if (c8539v45 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    c8539v45 = null;
                }
                Context context = c8539v45.getRoot().getContext();
                button.setCompoundDrawablesWithIntrinsicBounds(NA0.m94299e(context, m56000Q(key)), (Drawable) null, NA0.m94299e(context, C48193rg4.ic_chevron_right), (Drawable) null);
                button.addOnAttachStateChangeListener(new View$OnAttachStateChangeListenerC16053d(key, value));
                C8539V4 c8539v46 = this.f66128o;
                if (c8539v46 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    c8539v46 = null;
                }
                c8539v46.getRoot().addView(button);
            }
        }
        C8539V4 c8539v47 = this.f66128o;
        if (c8539v47 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            c8539v4 = c8539v47;
        }
        c8539v4.getRoot().requestLayout();
    }

    @Override // p000.InterfaceC33489Ia4
    /* renamed from: P0 */
    public Observable<C51479xD1> mo56001P0() {
        return this.f66133t;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001a, code lost:
        if (r2.equals("sofort") == false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0023, code lost:
        if (r2.equals("klarna") == false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:?, code lost:
        return p000.C47007pg4.ic_klarna_bw;
     */
    /* renamed from: Q */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int m56000Q(String str) {
        switch (str.hashCode()) {
            case -1920743119:
                if (str.equals("bancontact")) {
                    return C47007pg4.ic_bancontact_bw;
                }
                return C47007pg4.ic_money_transfer_bw;
            case -1128905083:
                break;
            case -896955097:
                break;
            case 3173023:
                if (str.equals("giro")) {
                    return C47007pg4.ic_giro_pay_bw;
                }
                return C47007pg4.ic_money_transfer_bw;
            default:
                return C47007pg4.ic_money_transfer_bw;
        }
    }

    /* renamed from: R */
    public final C32553Ea4 m55999R() {
        C32553Ea4 c32553Ea4 = this.f66123j;
        if (c32553Ea4 != null) {
            return c32553Ea4;
        }
        Intrinsics.throwUninitializedPropertyAccessException("presenter");
        return null;
    }

    @Override // p000.InterfaceC33489Ia4
    /* renamed from: R8 */
    public Observable<Unit> mo55998R8() {
        return (Observable) this.f66130q.getValue();
    }

    @Override // p000.InterfaceC48362rx4
    /* renamed from: S */
    public void render(AbstractC33957Ka4 state) {
        Intrinsics.checkNotNullParameter(state, "state");
        if (state instanceof C45146mY0) {
            String string = getString(C45871nl4.payment_incomplete);
            Intrinsics.checkNotNullExpressionValue(string, "getString(L.string.payment_incomplete)");
            setResult(0, X52.m77424a(new PurchasePaymentActivityResult(string)));
            mo58957w().mo37030e3();
        } else if (state instanceof C48250rm1) {
            setResult(-1);
            mo58957w().mo37030e3();
        } else if (state instanceof C37230Ya1) {
            C8539V4 c8539v4 = this.f66128o;
            if (c8539v4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                c8539v4 = null;
            }
            Button button = c8539v4.f38559c;
            Intrinsics.checkNotNullExpressionValue(button, "binding.gPay");
            C49520tu6.show$default(button, ((C37230Ya1) state).m74892b(), 0, 2, null);
        } else if (state instanceof C37464Za1) {
            C8539V4 c8539v42 = this.f66128o;
            if (c8539v42 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                c8539v42 = null;
            }
            Button button2 = c8539v42.f38560d;
            Intrinsics.checkNotNullExpressionValue(button2, "binding.paypal");
            C49520tu6.show$default(button2, ((C37464Za1) state).m72914b(), 0, 2, null);
        } else if (state instanceof C38635bb1) {
            m56002P(((C38635bb1) state).m64296b());
        } else if (state instanceof C53063zt2) {
            if (((C53063zt2) state).m167a()) {
                m58990F().startProgress();
            } else {
                S74.C7343a.stopProgress$default(m58990F(), 0, 1, null);
            }
        } else if (state instanceof C52049yA5) {
            H31.C3014a.showDialog$default(m58990F(), new C44836m06(((C52049yA5) state).m3901b()), false, false, null, null, null, null, 126, null);
        }
    }

    @Override // p000.InterfaceC33489Ia4
    /* renamed from: T8 */
    public Observable<C39085cL3> mo55996T8() {
        Object value = this.f66129p.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "<get-googlePayClicks>(...)");
        return (Observable) value;
    }

    @Override // p000.InterfaceC33489Ia4
    /* renamed from: a9 */
    public Observable<Unit> mo55995a9() {
        return (Observable) this.f66131r.getValue();
    }

    @Override // co.bird.android.core.base.BaseCoreActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        boolean z;
        super.onActivityResult(i, i2, intent);
        if (i2 != 0) {
            if (i != 10030) {
                if (i == 10031 || i == 10038) {
                    C24558d<Boolean> c24558d = this.f66124k;
                    if (i2 == -1) {
                        z = true;
                    } else {
                        z = false;
                    }
                    c24558d.onNext(Boolean.valueOf(z));
                    return;
                }
                return;
            }
            this.f66125l.onNext(new C51479xD1(i2, intent));
        }
    }

    @Override // co.bird.android.core.base.BaseCoreActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        super.onBackPressed();
        setResult(0);
    }

    @Override // co.bird.android.core.mrp.BaseActivityLite, co.bird.android.core.base.BaseCoreActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        Enum r15;
        boolean equals;
        int i;
        int i2;
        Enum r4;
        boolean equals2;
        super.onCreate(bundle);
        C8539V4 m80454c = C8539V4.m80454c(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(m80454c, "inflate(layoutInflater)");
        this.f66128o = m80454c;
        if (m80454c == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            m80454c = null;
        }
        setContentView(m80454c.getRoot());
        Intent intent = getIntent();
        Intrinsics.checkNotNullExpressionValue(intent, "intent");
        String stringExtra = intent.getStringExtra("purchase_payment_reason");
        if (stringExtra != null) {
            try {
                Object[] enumConstants = PurchasePaymentReason.class.getEnumConstants();
                Intrinsics.checkNotNull(enumConstants);
                for (Object obj : enumConstants) {
                    equals = StringsKt__StringsJVMKt.equals(((Enum) obj).name(), stringExtra, true);
                    if (equals) {
                        Intrinsics.checkNotNullExpressionValue(obj, "{\n    E::class.java.enum….equals(name, true) }\n  }");
                        r15 = (Enum) obj;
                    }
                }
                throw new NoSuchElementException("Array contains no element matching the predicate.");
            } catch (Exception unused) {
                Object[] enumConstants2 = PurchasePaymentReason.class.getEnumConstants();
                Intrinsics.checkNotNull(enumConstants2);
                for (Object obj2 : enumConstants2) {
                    r15 = (Enum) obj2;
                    if (Intrinsics.areEqual(r15.name(), "UNKNOWN")) {
                        Intrinsics.checkNotNullExpressionValue(obj2, "{\n    E::class.java.enum…m.name == \"UNKNOWN\" }\n  }");
                    }
                }
                throw new NoSuchElementException("Array contains no element matching the predicate.");
            }
        }
        r15 = null;
        PurchasePaymentReason purchasePaymentReason = (PurchasePaymentReason) r15;
        if (purchasePaymentReason == null) {
            i = -1;
        } else {
            i = C16051b.$EnumSwitchMapping$0[purchasePaymentReason.ordinal()];
        }
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    i2 = getIntent().getIntExtra("activity_title_res_id", C45871nl4.purchase_payment_screen_header);
                } else {
                    i2 = C45871nl4.bird_plus_symbol_uppercased;
                }
            } else {
                i2 = C45871nl4.ride_pass_left_navigation_title;
            }
        } else {
            i2 = C45871nl4.purchase_payment_screen_header;
        }
        setTitle(i2);
        InterfaceC16062b.InterfaceC16063a m55983a = C16059a.m55983a();
        InterfaceC44393lG2 m58989H = m58989H();
        Intent intent2 = getIntent();
        Intrinsics.checkNotNullExpressionValue(intent2, "intent");
        String stringExtra2 = intent2.getStringExtra("payment_add_source");
        if (stringExtra2 != null) {
            try {
                Object[] enumConstants3 = PaymentAddSource.class.getEnumConstants();
                Intrinsics.checkNotNull(enumConstants3);
                for (Object obj3 : enumConstants3) {
                    equals2 = StringsKt__StringsJVMKt.equals(((Enum) obj3).name(), stringExtra2, true);
                    if (equals2) {
                        Intrinsics.checkNotNullExpressionValue(obj3, "{\n    E::class.java.enum….equals(name, true) }\n  }");
                        r4 = (Enum) obj3;
                    }
                }
                throw new NoSuchElementException("Array contains no element matching the predicate.");
            } catch (Exception unused2) {
                Object[] enumConstants4 = PaymentAddSource.class.getEnumConstants();
                Intrinsics.checkNotNull(enumConstants4);
                for (Object obj4 : enumConstants4) {
                    Enum r6 = (Enum) obj4;
                    if (Intrinsics.areEqual(r6.name(), "UNKNOWN")) {
                        Intrinsics.checkNotNullExpressionValue(obj4, "{\n    E::class.java.enum…m.name == \"UNKNOWN\" }\n  }");
                        r4 = r6;
                    }
                }
                throw new NoSuchElementException("Array contains no element matching the predicate.");
            }
        }
        r4 = null;
        Intrinsics.checkNotNull(r4);
        m55983a.mo55979a(m58989H, this, (PaymentAddSource) r4).mo55980a(this);
        m55999R().consume(this);
    }

    @Override // p000.InterfaceC33489Ia4
    /* renamed from: u3 */
    public Observable<Boolean> mo55994u3() {
        return this.f66132s;
    }
}
