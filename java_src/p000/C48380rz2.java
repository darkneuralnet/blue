package p000;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.app.feature.longterm.ParcelableLongTermRentalSetupModel;
import co.bird.android.app.feature.map.p008ui.LocationSelectionUiImplFactory;
import co.bird.android.buava.Optional;
import co.bird.android.library.flow.FlowActivity;
import co.bird.android.model.Agreement;
import co.bird.android.model.AgreementKey;
import co.bird.android.model.AgreementRole;
import co.bird.android.model.CurrentRental;
import co.bird.android.model.DeliveryWindow;
import co.bird.android.model.RentalPeriod;
import co.bird.android.model.RentalPlan;
import co.bird.android.model.constant.RentalKind;
import co.bird.android.model.constant.RentalStatus;
import co.bird.android.model.wire.WireLocation;
import co.bird.android.model.wire.configs.RentalConfig;
import co.bird.android.model.wire.configs.RentalConfigKt;
import co.bird.android.widget.CallToActionLayout;
import com.facebook.share.internal.C17296a;
import com.stripe.android.core.networking.RequestHeadersFactory;
import com.stripe.android.model.PaymentMethod;
import com.stripe.android.model.Stripe3ds2AuthResult;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.MaybeSubscribeProxy;
import com.uber.autodispose.ScopeProvider;
import io.reactivex.AbstractC24507p;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsJVMKt;
import p000.InterfaceC44637lg6;
@Metadata(m28433d1 = {"\u0000þ\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b!\n\u0002\u0010 \n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \u009d\u00012\u00020\u0001:\u0001\nBÍ\u0001\b\u0007\u0012\u0006\u0010\f\u001a\u00020\t\u0012\u0006\u0010\u000f\u001a\u00020\r\u0012\u0006\u0010\u0012\u001a\u00020\u0010\u0012\u0006\u0010\u0016\u001a\u00020\u0013\u0012\u0006\u0010\u001a\u001a\u00020\u0017\u0012\u0006\u0010\u001d\u001a\u00020\u001b\u0012\n\u0010\"\u001a\u00060\u001ej\u0002`\u001f\u0012\u0006\u0010&\u001a\u00020#\u0012\u0006\u0010*\u001a\u00020'\u0012\u0006\u0010.\u001a\u00020+\u0012\u0006\u00102\u001a\u00020/\u0012\u0006\u00106\u001a\u000203\u0012\u0006\u0010:\u001a\u000207\u0012\u0006\u0010>\u001a\u00020;\u0012\u0006\u0010B\u001a\u00020?\u0012\u0006\u0010F\u001a\u00020C\u0012\u0006\u0010J\u001a\u00020G\u0012\u0006\u0010N\u001a\u00020K\u0012\n\u0010S\u001a\u00060Oj\u0002`P\u0012\u0006\u0010W\u001a\u00020T\u0012\u0006\u0010[\u001a\u00020X\u0012\u0006\u0010_\u001a\u00020\\\u0012\b\b\u0001\u0010c\u001a\u00020`¢\u0006\u0006\b\u009b\u0001\u0010\u009c\u0001J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002H\u0016J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002R\u0014\u0010\f\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\u000f\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u000eR\u0014\u0010\u0012\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0011R\u0014\u0010\u0016\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u001a\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001d\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u001cR\u0018\u0010\"\u001a\u00060\u001ej\u0002`\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010&\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010*\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010.\u001a\u00020+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u00102\u001a\u00020/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0014\u00106\u001a\u0002038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u0014\u0010:\u001a\u0002078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u0014\u0010>\u001a\u00020;8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=R\u0014\u0010B\u001a\u00020?8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010AR\u0014\u0010F\u001a\u00020C8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010ER\u0014\u0010J\u001a\u00020G8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010IR\u0014\u0010N\u001a\u00020K8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bL\u0010MR\u0018\u0010S\u001a\u00060Oj\u0002`P8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bQ\u0010RR\u0014\u0010W\u001a\u00020T8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bU\u0010VR\u0014\u0010[\u001a\u00020X8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bY\u0010ZR\u0014\u0010_\u001a\u00020\\8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b]\u0010^R\u0014\u0010c\u001a\u00020`8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\ba\u0010bR\u0014\u0010g\u001a\u00020d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\be\u0010fR\u0014\u0010k\u001a\u00020h8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bi\u0010jR\u0014\u0010m\u001a\u00020h8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bl\u0010jR\u0014\u0010o\u001a\u00020h8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bn\u0010jR\u0014\u0010q\u001a\u00020h8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bp\u0010jR\u0014\u0010s\u001a\u00020h8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\br\u0010jR\u0014\u0010u\u001a\u00020h8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bt\u0010jR\u0014\u0010w\u001a\u00020h8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bv\u0010jR\u0014\u0010y\u001a\u00020h8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bx\u0010jR\u0014\u0010{\u001a\u00020h8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bz\u0010jR\u0014\u0010}\u001a\u00020h8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b|\u0010jR\u0014\u0010\u007f\u001a\u00020h8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b~\u0010jR\u0016\u0010\u0081\u0001\u001a\u00020h8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0080\u0001\u0010jR\u0016\u0010\u0083\u0001\u001a\u00020h8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0082\u0001\u0010jR\u0016\u0010\u0085\u0001\u001a\u00020h8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0084\u0001\u0010jR\u0016\u0010\u0087\u0001\u001a\u00020h8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0086\u0001\u0010jR\u0016\u0010\u0089\u0001\u001a\u00020h8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0088\u0001\u0010jR\u001e\u0010\u008d\u0001\u001a\t\u0012\u0004\u0012\u00020h0\u008a\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008b\u0001\u0010\u008c\u0001R\u001e\u0010\u008f\u0001\u001a\t\u0012\u0004\u0012\u00020h0\u008a\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008e\u0001\u0010\u008c\u0001R\u001e\u0010\u0091\u0001\u001a\t\u0012\u0004\u0012\u00020h0\u008a\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0090\u0001\u0010\u008c\u0001R%\u0010\u0094\u0001\u001a\t\u0012\u0004\u0012\u00020h0\u008a\u00018\u0016X\u0096\u0004¢\u0006\u000f\n\u0006\b\u0092\u0001\u0010\u008c\u0001\u001a\u0005\b\n\u0010\u0093\u0001R\u0017\u0010\u0097\u0001\u001a\u00030\u0095\u00018BX\u0082\u0004¢\u0006\u0007\u001a\u0005\b\u0018\u0010\u0096\u0001R\u0017\u0010\u009a\u0001\u001a\u00030\u0098\u00018BX\u0082\u0004¢\u0006\u0007\u001a\u0005\b\u0014\u0010\u0099\u0001¨\u0006\u009e\u0001"}, m28432d2 = {"Lrz2;", "LMu1;", "Landroid/os/Bundle;", "savedInstanceState", "", "b", "outState", "c", "f", "Lgl;", C17296a.f69688o, "Lgl;", "preference", "LTq4;", "LTq4;", "config", "Llg6;", "Llg6;", "agreementManager", "LCx4;", DateTokenConverter.CONVERTER_KEY, "LCx4;", "rentalManager", "LmA2;", "e", "LmA2;", "loadingPresenterFactory", "LcA2;", "LcA2;", "introPresenterFactory", "Lco/bird/android/app/feature/map/ui/LocationSelectionUiImplFactory;", "Lco/bird/android/app/feature/longterm/LocationSelectionUiFactory;", "g", "Lco/bird/android/app/feature/map/ui/LocationSelectionUiImplFactory;", "locationUiFactory", "LHA2;", "h", "LHA2;", "locationPresenterFactory", "LUA2;", "i", "LUA2;", "notesPresenterFactory", "LhB2;", "j", "LhB2;", "periodPresenterFactory", "LRz2;", "k", "LRz2;", "datePresenterFactory", "LBC2;", "l", "LBC2;", "agreementPresenterFactory", "LtC2;", "m", "LtC2;", "summaryPresenterFactory", "LAz2;", "n", "LAz2;", "confirmedPresenterFactory", "LiV3;", "o", "LiV3;", "vehiclePlanSelectionPresenterFactory", "Lxy4;", "p", "Lxy4;", "pickupPresenterFactory", "Lfy4;", "q", "Lfy4;", "pickupConfirmedPresenterFactory", "LVf3;", "r", "LVf3;", "onDemandSetupIntroPresenterFactory", "LBf3;", "Lco/bird/android/app/feature/longterm/OnDemandLocationSelectionUiFactory;", "s", "LBf3;", "onDemandLocationUiFactory", "Ltg3;", "t", "Ltg3;", "onDemandLocationPresenterFactory", "LqB2;", "u", "LqB2;", "phoneNumberPresenterFactory", "LHg3;", "v", "LHg3;", "onDemandViabilityTestPresenterFactory", "Lcom/uber/autodispose/ScopeProvider;", "w", "Lcom/uber/autodispose/ScopeProvider;", "scopeProvider", "LQA2;", "x", "LQA2;", RequestHeadersFactory.MODEL, "LDi0;", "y", "LDi0;", "loadingNode", "z", "introNode", "A", "onDemandIntroNode", "B", "locationNode", Stripe3ds2AuthResult.Ares.VALUE_CHALLENGE, "onDemandLocationNode", "D", "vehicleSelectionNode", "E", "pickupNode", "F", "notesNode", "G", "confirmPhoneNumberNode", "H", "rentalPeriodNode", "I", "dateNode", "J", "agreementNode", "K", "summaryNode", "L", "confirmedNode", "M", "pickupConfirmedNode", "N", "onDemandViabilityTestNode", "", "O", "Ljava/util/List;", "deliveryNodes", "P", "pickupNodes", "Q", "onDemandNodes", "R", "()Ljava/util/List;", "nodes", "Lco/bird/android/model/constant/RentalKind;", "()Lco/bird/android/model/constant/RentalKind;", "rentalKind", "Lco/bird/android/model/wire/configs/RentalConfig;", "()Lco/bird/android/model/wire/configs/RentalConfig;", "rentalConfig", "<init>", "(Lgl;LTq4;Llg6;LCx4;LmA2;LcA2;Lco/bird/android/app/feature/map/ui/LocationSelectionUiImplFactory;LHA2;LUA2;LhB2;LRz2;LBC2;LtC2;LAz2;LiV3;Lxy4;Lfy4;LVf3;LBf3;Ltg3;LqB2;LHg3;Lcom/uber/autodispose/ScopeProvider;)V", "S", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nLongTermRentalSetupCheckoutCoordinator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LongTermRentalSetupCheckoutCoordinator.kt\nco/bird/android/app/feature/longterm/LongTermRentalSetupCheckoutCoordinator\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n*L\n1#1,471:1\n218#2:472\n*S KotlinDebug\n*F\n+ 1 LongTermRentalSetupCheckoutCoordinator.kt\nco/bird/android/app/feature/longterm/LongTermRentalSetupCheckoutCoordinator\n*L\n414#1:472\n*E\n"})
/* renamed from: rz2  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C48380rz2 extends AbstractC34602Mu1 {

    /* renamed from: S */
    public static final C28106a f107980S = new C28106a(null);

    /* renamed from: T */
    public static final int f107981T = 8;

    /* renamed from: A */
    public final C32387Di0 f107982A;

    /* renamed from: B */
    public final C32387Di0 f107983B;

    /* renamed from: C */
    public final C32387Di0 f107984C;

    /* renamed from: D */
    public final C32387Di0 f107985D;

    /* renamed from: E */
    public final C32387Di0 f107986E;

    /* renamed from: F */
    public final C32387Di0 f107987F;

    /* renamed from: G */
    public final C32387Di0 f107988G;

    /* renamed from: H */
    public final C32387Di0 f107989H;

    /* renamed from: I */
    public final C32387Di0 f107990I;

    /* renamed from: J */
    public final C32387Di0 f107991J;

    /* renamed from: K */
    public final C32387Di0 f107992K;

    /* renamed from: L */
    public final C32387Di0 f107993L;

    /* renamed from: M */
    public final C32387Di0 f107994M;

    /* renamed from: N */
    public final C32387Di0 f107995N;

    /* renamed from: O */
    public final List<C32387Di0> f107996O;

    /* renamed from: P */
    public final List<C32387Di0> f107997P;

    /* renamed from: Q */
    public final List<C32387Di0> f107998Q;

    /* renamed from: R */
    public final List<C32387Di0> f107999R;

    /* renamed from: a */
    public final C22454gl f108000a;

    /* renamed from: b */
    public final C36207Tq4 f108001b;

    /* renamed from: c */
    public final InterfaceC44637lg6 f108002c;

    /* renamed from: d */
    public final InterfaceC32292Cx4 f108003d;

    /* renamed from: e */
    public final InterfaceC44932mA2 f108004e;

    /* renamed from: f */
    public final InterfaceC38985cA2 f108005f;

    /* renamed from: g */
    public final LocationSelectionUiImplFactory f108006g;

    /* renamed from: h */
    public final HA2 f108007h;

    /* renamed from: i */
    public final UA2 f108008i;

    /* renamed from: j */
    public final InterfaceC41976hB2 f108009j;

    /* renamed from: k */
    public final InterfaceC35818Rz2 f108010k;

    /* renamed from: l */
    public final BC2 f108011l;

    /* renamed from: m */
    public final InterfaceC49100tC2 f108012m;

    /* renamed from: n */
    public final InterfaceC31840Az2 f108013n;

    /* renamed from: o */
    public final InterfaceC42750iV3 f108014o;

    /* renamed from: p */
    public final InterfaceC51929xy4 f108015p;

    /* renamed from: q */
    public final InterfaceC41257fy4 f108016q;

    /* renamed from: r */
    public final InterfaceC36575Vf3 f108017r;

    /* renamed from: s */
    public final InterfaceC31895Bf3 f108018s;

    /* renamed from: t */
    public final InterfaceC49377tg3 f108019t;

    /* renamed from: u */
    public final InterfaceC47313qB2 f108020u;

    /* renamed from: v */
    public final InterfaceC33308Hg3 f108021v;

    /* renamed from: w */
    public final ScopeProvider f108022w;

    /* renamed from: x */
    public final QA2 f108023x;

    /* renamed from: y */
    public final C32387Di0 f108024y;

    /* renamed from: z */
    public final C32387Di0 f108025z;

    @Metadata(m28433d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, m28432d2 = {"Landroid/view/View;", "<anonymous parameter 0>", "Lcom/uber/autodispose/ScopeProvider;", "scopeProvider", "Lco/bird/android/library/flow/FlowActivity;", "activity", "Llv1;", C17296a.f69688o, "(Landroid/view/View;Lcom/uber/autodispose/ScopeProvider;Lco/bird/android/library/flow/FlowActivity;)Llv1;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: rz2$A */
    /* loaded from: classes2.dex */
    public static final class C28079A extends Lambda implements Function3<View, ScopeProvider, FlowActivity, InterfaceC44782lv1> {

        @Metadata(m28433d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m28432d2 = {"rz2$A$a", "LxE;", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
        /* renamed from: rz2$A$a */
        /* loaded from: classes2.dex */
        public static final class C28080a extends AbstractC30071xE {
            public C28080a(FlowActivity flowActivity) {
                super(flowActivity);
            }
        }

        public C28079A() {
            super(3);
        }

        @Override // kotlin.jvm.functions.Function3
        /* renamed from: a */
        public final InterfaceC44782lv1 invoke(View view, ScopeProvider scopeProvider, FlowActivity activity) {
            Intrinsics.checkNotNullParameter(view, "<anonymous parameter 0>");
            Intrinsics.checkNotNullParameter(scopeProvider, "scopeProvider");
            Intrinsics.checkNotNullParameter(activity, "activity");
            return C48380rz2.this.f108004e.mo24269a(C48380rz2.this.f108023x, scopeProvider, new C28080a(activity));
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", C17296a.f69688o, "(Landroid/content/Context;)Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: rz2$B */
    /* loaded from: classes2.dex */
    public static final class C28081B extends Lambda implements Function1<Context, String> {

        /* renamed from: g */
        public static final C28081B f108027g = new C28081B();

        public C28081B() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final String invoke(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            String string = context.getString(C45871nl4.bird_delivery_setup_location_activity_title);
            Intrinsics.checkNotNullExpressionValue(string, "context.getString(L.stri…_location_activity_title)");
            return string;
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: rz2$C */
    /* loaded from: classes2.dex */
    public static final class C28082C extends Lambda implements Function0<Boolean> {
        public C28082C() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            Optional<String> value = C48380rz2.this.f108023x.m88824o().getValue();
            return Boolean.valueOf((value != null ? value.m59035e() : null) == null);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/view/View;", C17296a.f69688o, "(Landroid/content/Context;)Landroid/view/View;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: rz2$D */
    /* loaded from: classes2.dex */
    public static final class C28083D extends Lambda implements Function1<Context, View> {

        /* renamed from: g */
        public static final C28083D f108029g = new C28083D();

        public C28083D() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final View invoke(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            CoordinatorLayout root = C33463Hx5.m103193c(C40788fB0.m41772j(context)).getRoot();
            Intrinsics.checkNotNullExpressionValue(root, "inflate(context.layoutInflater).root");
            return root;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, m28432d2 = {"Landroid/view/View;", "view", "Lcom/uber/autodispose/ScopeProvider;", "scopeProvider", "Lco/bird/android/library/flow/FlowActivity;", "activity", "Llv1;", C17296a.f69688o, "(Landroid/view/View;Lcom/uber/autodispose/ScopeProvider;Lco/bird/android/library/flow/FlowActivity;)Llv1;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: rz2$E */
    /* loaded from: classes2.dex */
    public static final class C28084E extends Lambda implements Function3<View, ScopeProvider, FlowActivity, InterfaceC44782lv1> {
        public C28084E() {
            super(3);
        }

        @Override // kotlin.jvm.functions.Function3
        /* renamed from: a */
        public final InterfaceC44782lv1 invoke(View view, ScopeProvider scopeProvider, FlowActivity activity) {
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(scopeProvider, "scopeProvider");
            Intrinsics.checkNotNullParameter(activity, "activity");
            C33463Hx5 m103195a = C33463Hx5.m103195a(view);
            Intrinsics.checkNotNullExpressionValue(m103195a, "bind(view)");
            return C48380rz2.this.f108007h.mo102827a(C48380rz2.this.f108023x, scopeProvider, C48380rz2.this.f108006g.create(activity, m103195a));
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", C17296a.f69688o, "(Landroid/content/Context;)Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: rz2$F */
    /* loaded from: classes2.dex */
    public static final class C28085F extends Lambda implements Function1<Context, String> {

        /* renamed from: g */
        public static final C28085F f108031g = new C28085F();

        public C28085F() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final String invoke(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            String string = context.getString(C45871nl4.bird_delivery_setup_notes_activity_title);
            Intrinsics.checkNotNullExpressionValue(string, "context.getString(L.stri…tup_notes_activity_title)");
            return string;
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: rz2$G */
    /* loaded from: classes2.dex */
    public static final class C28086G extends Lambda implements Function0<Boolean> {
        public C28086G() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            Optional<String> value = C48380rz2.this.f108023x.m88824o().getValue();
            return Boolean.valueOf((value != null ? value.m59035e() : null) == null);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/view/View;", C17296a.f69688o, "(Landroid/content/Context;)Landroid/view/View;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: rz2$H */
    /* loaded from: classes2.dex */
    public static final class C28087H extends Lambda implements Function1<Context, View> {

        /* renamed from: g */
        public static final C28087H f108033g = new C28087H();

        public C28087H() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final View invoke(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            ConstraintLayout root = NC2.m94198c(C40788fB0.m41772j(context)).getRoot();
            Intrinsics.checkNotNullExpressionValue(root, "inflate(context.layoutInflater).root");
            return root;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, m28432d2 = {"Landroid/view/View;", "view", "Lcom/uber/autodispose/ScopeProvider;", "scopeProvider", "Lco/bird/android/library/flow/FlowActivity;", "activity", "Llv1;", C17296a.f69688o, "(Landroid/view/View;Lcom/uber/autodispose/ScopeProvider;Lco/bird/android/library/flow/FlowActivity;)Llv1;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: rz2$I */
    /* loaded from: classes2.dex */
    public static final class C28088I extends Lambda implements Function3<View, ScopeProvider, FlowActivity, InterfaceC44782lv1> {
        public C28088I() {
            super(3);
        }

        @Override // kotlin.jvm.functions.Function3
        /* renamed from: a */
        public final InterfaceC44782lv1 invoke(View view, ScopeProvider scopeProvider, FlowActivity activity) {
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(scopeProvider, "scopeProvider");
            Intrinsics.checkNotNullParameter(activity, "activity");
            NC2 m94200a = NC2.m94200a(view);
            Intrinsics.checkNotNullExpressionValue(m94200a, "bind(view)");
            UA2 ua2 = C48380rz2.this.f108008i;
            QA2 qa2 = C48380rz2.this.f108023x;
            EditText editText = m94200a.f24274b;
            Intrinsics.checkNotNullExpressionValue(editText, "binding.notesEt");
            return ua2.mo80264a(qa2, scopeProvider, editText);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", C17296a.f69688o, "(Landroid/content/Context;)Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: rz2$J */
    /* loaded from: classes2.dex */
    public static final class C28089J extends Lambda implements Function1<Context, String> {

        /* renamed from: g */
        public static final C28089J f108035g = new C28089J();

        public C28089J() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final String invoke(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            String string = context.getString(C45871nl4.on_demand_setup_intro_title);
            Intrinsics.checkNotNullExpressionValue(string, "context.getString(L.stri…demand_setup_intro_title)");
            return string;
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: rz2$K */
    /* loaded from: classes2.dex */
    public static final class C28090K extends Lambda implements Function0<Boolean> {
        public C28090K() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            Optional<String> value = C48380rz2.this.f108023x.m88824o().getValue();
            return Boolean.valueOf((value != null ? value.m59035e() : null) == null);
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: rz2$L */
    /* loaded from: classes2.dex */
    public static final class C28091L extends Lambda implements Function0<Boolean> {

        /* renamed from: g */
        public static final C28091L f108037g = new C28091L();

        public C28091L() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            return Boolean.FALSE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/view/View;", C17296a.f69688o, "(Landroid/content/Context;)Landroid/view/View;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: rz2$M */
    /* loaded from: classes2.dex */
    public static final class C28092M extends Lambda implements Function1<Context, View> {

        /* renamed from: g */
        public static final C28092M f108038g = new C28092M();

        public C28092M() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final View invoke(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            View inflate = LayoutInflater.from(context).inflate(C39311cj4.on_demand_setup_intro, (ViewGroup) null);
            Intrinsics.checkNotNullExpressionValue(inflate, "from(context).inflate(R.…demand_setup_intro, null)");
            return inflate;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, m28432d2 = {"Landroid/view/View;", "view", "Lcom/uber/autodispose/ScopeProvider;", "<anonymous parameter 1>", "Lco/bird/android/library/flow/FlowActivity;", "activity", "Llv1;", C17296a.f69688o, "(Landroid/view/View;Lcom/uber/autodispose/ScopeProvider;Lco/bird/android/library/flow/FlowActivity;)Llv1;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: rz2$N */
    /* loaded from: classes2.dex */
    public static final class C28093N extends Lambda implements Function3<View, ScopeProvider, FlowActivity, InterfaceC44782lv1> {
        public C28093N() {
            super(3);
        }

        @Override // kotlin.jvm.functions.Function3
        /* renamed from: a */
        public final InterfaceC44782lv1 invoke(View view, ScopeProvider scopeProvider, FlowActivity activity) {
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(scopeProvider, "<anonymous parameter 1>");
            Intrinsics.checkNotNullParameter(activity, "activity");
            return C48380rz2.this.f108017r.mo78025a(C48380rz2.this.f108023x, new C37277Yf3(activity, view));
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", C17296a.f69688o, "(Landroid/content/Context;)Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: rz2$O */
    /* loaded from: classes2.dex */
    public static final class C28094O extends Lambda implements Function1<Context, String> {

        /* renamed from: g */
        public static final C28094O f108040g = new C28094O();

        public C28094O() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final String invoke(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            String string = context.getString(C45871nl4.bird_delivery_setup_location_activity_title);
            Intrinsics.checkNotNullExpressionValue(string, "context.getString(L.stri…_location_activity_title)");
            return string;
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: rz2$P */
    /* loaded from: classes2.dex */
    public static final class C28095P extends Lambda implements Function0<Boolean> {
        public C28095P() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            Optional<String> value = C48380rz2.this.f108023x.m88824o().getValue();
            return Boolean.valueOf((value != null ? value.m59035e() : null) == null);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/view/View;", C17296a.f69688o, "(Landroid/content/Context;)Landroid/view/View;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: rz2$Q */
    /* loaded from: classes2.dex */
    public static final class C28096Q extends Lambda implements Function1<Context, View> {

        /* renamed from: g */
        public static final C28096Q f108042g = new C28096Q();

        public C28096Q() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final View invoke(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            CoordinatorLayout root = C37511Zf3.m72791c(C40788fB0.m41772j(context)).getRoot();
            Intrinsics.checkNotNullExpressionValue(root, "inflate(context.layoutInflater).root");
            return root;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, m28432d2 = {"Landroid/view/View;", "view", "Lcom/uber/autodispose/ScopeProvider;", "scopeProvider", "Lco/bird/android/library/flow/FlowActivity;", "activity", "Llv1;", C17296a.f69688o, "(Landroid/view/View;Lcom/uber/autodispose/ScopeProvider;Lco/bird/android/library/flow/FlowActivity;)Llv1;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: rz2$R */
    /* loaded from: classes2.dex */
    public static final class C28097R extends Lambda implements Function3<View, ScopeProvider, FlowActivity, InterfaceC44782lv1> {
        public C28097R() {
            super(3);
        }

        @Override // kotlin.jvm.functions.Function3
        /* renamed from: a */
        public final InterfaceC44782lv1 invoke(View view, ScopeProvider scopeProvider, FlowActivity activity) {
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(scopeProvider, "scopeProvider");
            Intrinsics.checkNotNullParameter(activity, "activity");
            C37511Zf3 m72793a = C37511Zf3.m72793a(view);
            Intrinsics.checkNotNullExpressionValue(m72793a, "bind(view)");
            return C48380rz2.this.f108019t.mo9885a(C48380rz2.this.f108023x, scopeProvider, C48380rz2.this.f108018s.mo111922a(activity, m72793a));
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", C17296a.f69688o, "(Landroid/content/Context;)Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: rz2$S */
    /* loaded from: classes2.dex */
    public static final class C28098S extends Lambda implements Function1<Context, String> {
        public C28098S() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final String invoke(Context context) {
            boolean isBlank;
            Intrinsics.checkNotNullParameter(context, "context");
            String menuItemLabel = C48380rz2.this.m14959d().getContent().getMenuItemLabel();
            isBlank = StringsKt__StringsJVMKt.isBlank(menuItemLabel);
            if (isBlank) {
                menuItemLabel = context.getString(C45871nl4.on_demand_setup_intro_title);
            }
            Intrinsics.checkNotNullExpressionValue(menuItemLabel, "rentalConfig.content.men…emLabel\n        }\n      }");
            return menuItemLabel;
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: rz2$T */
    /* loaded from: classes2.dex */
    public static final class C28099T extends Lambda implements Function0<Boolean> {

        /* renamed from: g */
        public static final C28099T f108045g = new C28099T();

        public C28099T() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            return Boolean.TRUE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/view/View;", C17296a.f69688o, "(Landroid/content/Context;)Landroid/view/View;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: rz2$U */
    /* loaded from: classes2.dex */
    public static final class C28100U extends Lambda implements Function1<Context, View> {

        /* renamed from: g */
        public static final C28100U f108046g = new C28100U();

        public C28100U() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final View invoke(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            ConstraintLayout root = C52934zg3.m568c(C40788fB0.m41772j(context)).getRoot();
            Intrinsics.checkNotNullExpressionValue(root, "inflate(context.layoutInflater).root");
            return root;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, m28432d2 = {"Landroid/view/View;", "view", "Lcom/uber/autodispose/ScopeProvider;", "scopeProvider", "Lco/bird/android/library/flow/FlowActivity;", "activity", "Llv1;", C17296a.f69688o, "(Landroid/view/View;Lcom/uber/autodispose/ScopeProvider;Lco/bird/android/library/flow/FlowActivity;)Llv1;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: rz2$V */
    /* loaded from: classes2.dex */
    public static final class C28101V extends Lambda implements Function3<View, ScopeProvider, FlowActivity, InterfaceC44782lv1> {
        public C28101V() {
            super(3);
        }

        @Override // kotlin.jvm.functions.Function3
        /* renamed from: a */
        public final InterfaceC44782lv1 invoke(View view, ScopeProvider scopeProvider, FlowActivity activity) {
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(scopeProvider, "scopeProvider");
            Intrinsics.checkNotNullParameter(activity, "activity");
            C52934zg3 m570a = C52934zg3.m570a(view);
            Intrinsics.checkNotNullExpressionValue(m570a, "bind(view)");
            return C48380rz2.this.f108021v.mo101817a(scopeProvider, new C34244Lg3(m570a));
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", C17296a.f69688o, "(Landroid/content/Context;)Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: rz2$W */
    /* loaded from: classes2.dex */
    public static final class C28102W extends Lambda implements Function1<Context, String> {

        /* renamed from: g */
        public static final C28102W f108048g = new C28102W();

        public C28102W() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final String invoke(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            String string = context.getString(C45871nl4.long_term_rental_confirmed_title);
            Intrinsics.checkNotNullExpressionValue(string, "context.getString(L.stri…m_rental_confirmed_title)");
            return string;
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: rz2$X */
    /* loaded from: classes2.dex */
    public static final class C28103X extends Lambda implements Function0<Boolean> {
        public C28103X() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            Optional<String> value = C48380rz2.this.f108023x.m88824o().getValue();
            return Boolean.valueOf((value != null ? value.m59035e() : null) == null);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/view/View;", C17296a.f69688o, "(Landroid/content/Context;)Landroid/view/View;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: rz2$Y */
    /* loaded from: classes2.dex */
    public static final class C28104Y extends Lambda implements Function1<Context, View> {

        /* renamed from: g */
        public static final C28104Y f108050g = new C28104Y();

        public C28104Y() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final View invoke(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            CallToActionLayout root = IC2.m102784c(C40788fB0.m41772j(context)).getRoot();
            Intrinsics.checkNotNullExpressionValue(root, "inflate(context.layoutInflater).root");
            return root;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, m28432d2 = {"Landroid/view/View;", "view", "Lcom/uber/autodispose/ScopeProvider;", "scopeProvider", "Lco/bird/android/library/flow/FlowActivity;", "activity", "Llv1;", C17296a.f69688o, "(Landroid/view/View;Lcom/uber/autodispose/ScopeProvider;Lco/bird/android/library/flow/FlowActivity;)Llv1;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: rz2$Z */
    /* loaded from: classes2.dex */
    public static final class C28105Z extends Lambda implements Function3<View, ScopeProvider, FlowActivity, InterfaceC44782lv1> {
        public C28105Z() {
            super(3);
        }

        @Override // kotlin.jvm.functions.Function3
        /* renamed from: a */
        public final InterfaceC44782lv1 invoke(View view, ScopeProvider scopeProvider, FlowActivity activity) {
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(scopeProvider, "scopeProvider");
            Intrinsics.checkNotNullParameter(activity, "activity");
            IC2 m102786a = IC2.m102786a(view);
            Intrinsics.checkNotNullExpressionValue(m102786a, "bind(view)");
            return C48380rz2.this.f108016q.mo37266a(C48380rz2.this.f108023x, scopeProvider, new C43036iy4(activity, m102786a));
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, m28432d2 = {"Lrz2$a;", "", "", "MODEL_KEY", "Ljava/lang/String;", "<init>", "()V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: rz2$a */
    /* loaded from: classes2.dex */
    public static final class C28106a {
        public /* synthetic */ C28106a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C28106a() {
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", C17296a.f69688o, "(Landroid/content/Context;)Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: rz2$a0 */
    /* loaded from: classes2.dex */
    public static final class C28107a0 extends Lambda implements Function1<Context, String> {

        /* renamed from: g */
        public static final C28107a0 f108052g = new C28107a0();

        public C28107a0() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final String invoke(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            String string = context.getString(C45871nl4.long_term_rental_pickup_title);
            Intrinsics.checkNotNullExpressionValue(string, "context.getString(L.stri…term_rental_pickup_title)");
            return string;
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: rz2$b */
    /* loaded from: classes2.dex */
    public /* synthetic */ class C28108b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[RentalKind.values().length];
            try {
                iArr[RentalKind.PICK_UP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[RentalKind.ON_DEMAND.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    @SourceDebugExtension({"SMAP\nLongTermRentalSetupCheckoutCoordinator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LongTermRentalSetupCheckoutCoordinator.kt\nco/bird/android/app/feature/longterm/LongTermRentalSetupCheckoutCoordinator$pickupNode$2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,471:1\n1#2:472\n*E\n"})
    /* renamed from: rz2$b0 */
    /* loaded from: classes2.dex */
    public static final class C28109b0 extends Lambda implements Function0<Boolean> {
        public C28109b0() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            List<DeliveryWindow> deliveryWindows;
            Optional<String> value = C48380rz2.this.f108023x.m88824o().getValue();
            boolean z = false;
            if ((value != null ? value.m59035e() : null) == null) {
                RentalPlan m88821r = C48380rz2.this.f108023x.m88821r();
                if ((m88821r == null || (deliveryWindows = m88821r.getDeliveryWindows()) == null || deliveryWindows.size() <= 1) ? false : true) {
                    z = true;
                }
            }
            return Boolean.valueOf(z);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", C17296a.f69688o, "(Landroid/content/Context;)Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: rz2$c */
    /* loaded from: classes2.dex */
    public static final class C28110c extends Lambda implements Function1<Context, String> {

        /* renamed from: g */
        public static final C28110c f108054g = new C28110c();

        public C28110c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final String invoke(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            String string = context.getString(C45871nl4.rental_agreement_activity_title);
            Intrinsics.checkNotNullExpressionValue(string, "context.getString(L.stri…agreement_activity_title)");
            return string;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/view/View;", C17296a.f69688o, "(Landroid/content/Context;)Landroid/view/View;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: rz2$c0 */
    /* loaded from: classes2.dex */
    public static final class C28111c0 extends Lambda implements Function1<Context, View> {

        /* renamed from: g */
        public static final C28111c0 f108055g = new C28111c0();

        public C28111c0() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final View invoke(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            RelativeLayout root = LC2.m97594c(C40788fB0.m41772j(context)).getRoot();
            Intrinsics.checkNotNullExpressionValue(root, "inflate(context.layoutInflater).root");
            return root;
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: rz2$d */
    /* loaded from: classes2.dex */
    public static final class C28112d extends Lambda implements Function0<Boolean> {
        public C28112d() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        /* JADX WARN: Code restructure failed: missing block: B:11:0x004a, code lost:
            if ((r0 != null ? !r0.isEmpty() : true) != false) goto L9;
         */
        @Override // kotlin.jvm.functions.Function0
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Boolean invoke() {
            boolean z;
            Optional<String> value = C48380rz2.this.f108023x.m88824o().getValue();
            if ((value != null ? value.m59035e() : null) == null) {
                List<Agreement> list = C48380rz2.this.f108002c.mo2957d().getValue().get(new AgreementKey(AgreementRole.RIDER, null, null, 4, null));
                z = true;
            }
            z = false;
            return Boolean.valueOf(z);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, m28432d2 = {"Landroid/view/View;", "view", "Lcom/uber/autodispose/ScopeProvider;", "scopeProvider", "Lco/bird/android/library/flow/FlowActivity;", "activity", "Llv1;", C17296a.f69688o, "(Landroid/view/View;Lcom/uber/autodispose/ScopeProvider;Lco/bird/android/library/flow/FlowActivity;)Llv1;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: rz2$d0 */
    /* loaded from: classes2.dex */
    public static final class C28113d0 extends Lambda implements Function3<View, ScopeProvider, FlowActivity, InterfaceC44782lv1> {
        public C28113d0() {
            super(3);
        }

        @Override // kotlin.jvm.functions.Function3
        /* renamed from: a */
        public final InterfaceC44782lv1 invoke(View view, ScopeProvider scopeProvider, FlowActivity activity) {
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(scopeProvider, "scopeProvider");
            Intrinsics.checkNotNullParameter(activity, "activity");
            LC2 m97596a = LC2.m97596a(view);
            Intrinsics.checkNotNullExpressionValue(m97596a, "bind(view)");
            return C48380rz2.this.f108015p.mo2198a(C48380rz2.this.f108023x, scopeProvider, new C47195pz2<>(activity, m97596a, new C37206Xx4(activity)), activity.mo58957w());
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/view/View;", C17296a.f69688o, "(Landroid/content/Context;)Landroid/view/View;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: rz2$e */
    /* loaded from: classes2.dex */
    public static final class C28114e extends Lambda implements Function1<Context, View> {

        /* renamed from: g */
        public static final C28114e f108058g = new C28114e();

        public C28114e() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final View invoke(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            View inflate = LayoutInflater.from(context).inflate(C39311cj4.activity_webview, (ViewGroup) null);
            Intrinsics.checkNotNullExpressionValue(inflate, "from(context).inflate(R.…t.activity_webview, null)");
            return inflate;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", C17296a.f69688o, "(Landroid/content/Context;)Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: rz2$e0 */
    /* loaded from: classes2.dex */
    public static final class C28115e0 extends Lambda implements Function1<Context, String> {

        /* renamed from: g */
        public static final C28115e0 f108059g = new C28115e0();

        public C28115e0() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final String invoke(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            String string = context.getString(C45871nl4.long_term_rental_rental_period);
            Intrinsics.checkNotNullExpressionValue(string, "context.getString(L.stri…erm_rental_rental_period)");
            return string;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, m28432d2 = {"Landroid/view/View;", "view", "Lcom/uber/autodispose/ScopeProvider;", "scopeProvider", "Lco/bird/android/library/flow/FlowActivity;", "activity", "Llv1;", C17296a.f69688o, "(Landroid/view/View;Lcom/uber/autodispose/ScopeProvider;Lco/bird/android/library/flow/FlowActivity;)Llv1;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: rz2$f */
    /* loaded from: classes2.dex */
    public static final class C28116f extends Lambda implements Function3<View, ScopeProvider, FlowActivity, InterfaceC44782lv1> {
        public C28116f() {
            super(3);
        }

        @Override // kotlin.jvm.functions.Function3
        /* renamed from: a */
        public final InterfaceC44782lv1 invoke(View view, ScopeProvider scopeProvider, FlowActivity activity) {
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(scopeProvider, "scopeProvider");
            Intrinsics.checkNotNullParameter(activity, "activity");
            return C48380rz2.this.f108011l.mo112655a(C48380rz2.this.f108023x, scopeProvider, new C35885Sg6(view, activity), activity.mo58957w());
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: rz2$f0 */
    /* loaded from: classes2.dex */
    public static final class C28117f0 extends Lambda implements Function0<Boolean> {
        public C28117f0() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        /* JADX WARN: Code restructure failed: missing block: B:8:0x0031, code lost:
            if (r2.f108061g.f108023x.m88831h().getValue().size() > 1) goto L7;
         */
        @Override // kotlin.jvm.functions.Function0
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Boolean invoke() {
            Optional<String> value = C48380rz2.this.f108023x.m88824o().getValue();
            boolean z = (value != null ? value.m59035e() : null) == null;
            return Boolean.valueOf(z);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", C17296a.f69688o, "(Landroid/content/Context;)Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: rz2$g */
    /* loaded from: classes2.dex */
    public static final class C28118g extends Lambda implements Function1<Context, String> {

        /* renamed from: g */
        public static final C28118g f108062g = new C28118g();

        public C28118g() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final String invoke(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            String string = context.getString(C45871nl4.bird_delivery_setup_confirm_phone_number_activity_title);
            Intrinsics.checkNotNullExpressionValue(string, "context.getString(L.stri…ne_number_activity_title)");
            return string;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/view/View;", C17296a.f69688o, "(Landroid/content/Context;)Landroid/view/View;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: rz2$g0 */
    /* loaded from: classes2.dex */
    public static final class C28119g0 extends Lambda implements Function1<Context, View> {

        /* renamed from: g */
        public static final C28119g0 f108063g = new C28119g0();

        public C28119g0() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final View invoke(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            RelativeLayout root = LC2.m97594c(C40788fB0.m41772j(context)).getRoot();
            Intrinsics.checkNotNullExpressionValue(root, "inflate(context.layoutInflater).root");
            return root;
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: rz2$h */
    /* loaded from: classes2.dex */
    public static final class C28120h extends Lambda implements Function0<Boolean> {
        public C28120h() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            Optional<String> value = C48380rz2.this.f108023x.m88824o().getValue();
            return Boolean.valueOf((value != null ? value.m59035e() : null) == null && C48380rz2.this.m14959d().getRequiredFields().contains(PaymentMethod.BillingDetails.PARAM_PHONE));
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, m28432d2 = {"Landroid/view/View;", "view", "Lcom/uber/autodispose/ScopeProvider;", "scopeProvider", "Lco/bird/android/library/flow/FlowActivity;", "activity", "Llv1;", C17296a.f69688o, "(Landroid/view/View;Lcom/uber/autodispose/ScopeProvider;Lco/bird/android/library/flow/FlowActivity;)Llv1;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: rz2$h0 */
    /* loaded from: classes2.dex */
    public static final class C28121h0 extends Lambda implements Function3<View, ScopeProvider, FlowActivity, InterfaceC44782lv1> {
        public C28121h0() {
            super(3);
        }

        @Override // kotlin.jvm.functions.Function3
        /* renamed from: a */
        public final InterfaceC44782lv1 invoke(View view, ScopeProvider scopeProvider, FlowActivity activity) {
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(scopeProvider, "scopeProvider");
            Intrinsics.checkNotNullParameter(activity, "activity");
            LC2 m97596a = LC2.m97596a(view);
            Intrinsics.checkNotNullExpressionValue(m97596a, "bind(view)");
            return C48380rz2.this.f108009j.mo34375a(C48380rz2.this.f108023x, scopeProvider, new C47195pz2<>(activity, m97596a, new C36738Vx4(activity)), activity.mo58957w());
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/view/View;", C17296a.f69688o, "(Landroid/content/Context;)Landroid/view/View;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: rz2$i */
    /* loaded from: classes2.dex */
    public static final class C28122i extends Lambda implements Function1<Context, View> {

        /* renamed from: g */
        public static final C28122i f108066g = new C28122i();

        public C28122i() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final View invoke(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            View inflate = LayoutInflater.from(context).inflate(C39311cj4.on_demand_setup_phone, (ViewGroup) null);
            Intrinsics.checkNotNullExpressionValue(inflate, "from(context).inflate(R.…demand_setup_phone, null)");
            return inflate;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", C17296a.f69688o, "(Landroid/content/Context;)Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: rz2$i0 */
    /* loaded from: classes2.dex */
    public static final class C28123i0 extends Lambda implements Function1<Context, String> {
        public C28123i0() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final String invoke(Context context) {
            String str;
            int i;
            Intrinsics.checkNotNullParameter(context, "context");
            Optional<String> value = C48380rz2.this.f108023x.m88824o().getValue();
            if (value != null) {
                str = value.m59035e();
            } else {
                str = null;
            }
            if (str == null) {
                i = C45871nl4.long_term_rental_summary_title;
            } else {
                i = C45871nl4.long_term_rental_main_title;
            }
            String string = context.getString(i);
            Intrinsics.checkNotNullExpressionValue(string, "context.getString(\n     …n_title\n        }\n      )");
            return string;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, m28432d2 = {"Landroid/view/View;", "view", "Lcom/uber/autodispose/ScopeProvider;", "scopeProvider", "Lco/bird/android/library/flow/FlowActivity;", "activity", "Llv1;", C17296a.f69688o, "(Landroid/view/View;Lcom/uber/autodispose/ScopeProvider;Lco/bird/android/library/flow/FlowActivity;)Llv1;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: rz2$j */
    /* loaded from: classes2.dex */
    public static final class C28124j extends Lambda implements Function3<View, ScopeProvider, FlowActivity, InterfaceC44782lv1> {
        public C28124j() {
            super(3);
        }

        @Override // kotlin.jvm.functions.Function3
        /* renamed from: a */
        public final InterfaceC44782lv1 invoke(View view, ScopeProvider scopeProvider, FlowActivity activity) {
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(scopeProvider, "scopeProvider");
            Intrinsics.checkNotNullParameter(activity, "activity");
            return C48380rz2.this.f108020u.mo16270a(scopeProvider, new C38291b01(activity, view));
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: rz2$j0 */
    /* loaded from: classes2.dex */
    public static final class C28125j0 extends Lambda implements Function0<Boolean> {

        /* renamed from: g */
        public static final C28125j0 f108069g = new C28125j0();

        public C28125j0() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            return Boolean.TRUE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", C17296a.f69688o, "(Landroid/content/Context;)Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: rz2$k */
    /* loaded from: classes2.dex */
    public static final class C28126k extends Lambda implements Function1<Context, String> {

        /* renamed from: g */
        public static final C28126k f108070g = new C28126k();

        public C28126k() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final String invoke(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            String string = context.getString(C45871nl4.long_term_rental_confirmed_title);
            Intrinsics.checkNotNullExpressionValue(string, "context.getString(L.stri…m_rental_confirmed_title)");
            return string;
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: rz2$k0 */
    /* loaded from: classes2.dex */
    public static final class C28127k0 extends Lambda implements Function0<Boolean> {
        public C28127k0() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            Optional<String> value = C48380rz2.this.f108023x.m88824o().getValue();
            return Boolean.valueOf((value != null ? value.m59035e() : null) == null);
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: rz2$l */
    /* loaded from: classes2.dex */
    public static final class C28128l extends Lambda implements Function0<Boolean> {
        public C28128l() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            Optional<String> value = C48380rz2.this.f108023x.m88824o().getValue();
            return Boolean.valueOf((value != null ? value.m59035e() : null) == null);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/view/View;", C17296a.f69688o, "(Landroid/content/Context;)Landroid/view/View;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: rz2$l0 */
    /* loaded from: classes2.dex */
    public static final class C28129l0 extends Lambda implements Function1<Context, View> {

        /* renamed from: g */
        public static final C28129l0 f108073g = new C28129l0();

        public C28129l0() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final View invoke(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            RelativeLayout root = OC2.m92625c(C40788fB0.m41772j(context)).getRoot();
            Intrinsics.checkNotNullExpressionValue(root, "inflate(context.layoutInflater).root");
            return root;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/view/View;", C17296a.f69688o, "(Landroid/content/Context;)Landroid/view/View;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: rz2$m */
    /* loaded from: classes2.dex */
    public static final class C28130m extends Lambda implements Function1<Context, View> {

        /* renamed from: g */
        public static final C28130m f108074g = new C28130m();

        public C28130m() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final View invoke(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            CallToActionLayout root = JC2.m101019c(C40788fB0.m41772j(context)).getRoot();
            Intrinsics.checkNotNullExpressionValue(root, "inflate(context.layoutInflater).root");
            return root;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, m28432d2 = {"Landroid/view/View;", "view", "Lcom/uber/autodispose/ScopeProvider;", "scopeProvider", "Lco/bird/android/library/flow/FlowActivity;", "activity", "Llv1;", C17296a.f69688o, "(Landroid/view/View;Lcom/uber/autodispose/ScopeProvider;Lco/bird/android/library/flow/FlowActivity;)Llv1;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: rz2$m0 */
    /* loaded from: classes2.dex */
    public static final class C28131m0 extends Lambda implements Function3<View, ScopeProvider, FlowActivity, InterfaceC44782lv1> {
        public C28131m0() {
            super(3);
        }

        @Override // kotlin.jvm.functions.Function3
        /* renamed from: a */
        public final InterfaceC44782lv1 invoke(View view, ScopeProvider scopeProvider, FlowActivity activity) {
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(scopeProvider, "scopeProvider");
            Intrinsics.checkNotNullParameter(activity, "activity");
            OC2 m92627a = OC2.m92627a(view);
            Intrinsics.checkNotNullExpressionValue(m92627a, "bind(view)");
            return C48380rz2.this.f108012m.mo10646a(C48380rz2.this.f108023x, scopeProvider, new C51471xC2(activity, m92627a), activity, activity.mo58957w());
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, m28432d2 = {"Landroid/view/View;", "view", "Lcom/uber/autodispose/ScopeProvider;", "scopeProvider", "Lco/bird/android/library/flow/FlowActivity;", "activity", "Llv1;", C17296a.f69688o, "(Landroid/view/View;Lcom/uber/autodispose/ScopeProvider;Lco/bird/android/library/flow/FlowActivity;)Llv1;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: rz2$n */
    /* loaded from: classes2.dex */
    public static final class C28132n extends Lambda implements Function3<View, ScopeProvider, FlowActivity, InterfaceC44782lv1> {
        public C28132n() {
            super(3);
        }

        @Override // kotlin.jvm.functions.Function3
        /* renamed from: a */
        public final InterfaceC44782lv1 invoke(View view, ScopeProvider scopeProvider, FlowActivity activity) {
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(scopeProvider, "scopeProvider");
            Intrinsics.checkNotNullParameter(activity, "activity");
            JC2 m101021a = JC2.m101021a(view);
            Intrinsics.checkNotNullExpressionValue(m101021a, "bind(view)");
            return C48380rz2.this.f108013n.mo113152a(C48380rz2.this.f108023x, scopeProvider, new C32542Dz2(activity, m101021a));
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", C17296a.f69688o, "(Landroid/content/Context;)Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: rz2$n0 */
    /* loaded from: classes2.dex */
    public static final class C28133n0 extends Lambda implements Function1<Context, String> {

        /* renamed from: g */
        public static final C28133n0 f108077g = new C28133n0();

        public C28133n0() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final String invoke(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            String string = context.getString(C45871nl4.rental_vehicle_selection_title);
            Intrinsics.checkNotNullExpressionValue(string, "context.getString(L.stri…_vehicle_selection_title)");
            return string;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", C17296a.f69688o, "(Landroid/content/Context;)Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: rz2$o */
    /* loaded from: classes2.dex */
    public static final class C28134o extends Lambda implements Function1<Context, String> {

        /* renamed from: g */
        public static final C28134o f108078g = new C28134o();

        public C28134o() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final String invoke(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            String string = context.getString(C45871nl4.long_term_rental_date_title);
            Intrinsics.checkNotNullExpressionValue(string, "context.getString(L.stri…g_term_rental_date_title)");
            return string;
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: rz2$o0 */
    /* loaded from: classes2.dex */
    public static final class C28135o0 extends Lambda implements Function0<Boolean> {
        public C28135o0() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            Optional<String> value = C48380rz2.this.f108023x.m88824o().getValue();
            return Boolean.valueOf((value != null ? value.m59035e() : null) == null);
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    @SourceDebugExtension({"SMAP\nLongTermRentalSetupCheckoutCoordinator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LongTermRentalSetupCheckoutCoordinator.kt\nco/bird/android/app/feature/longterm/LongTermRentalSetupCheckoutCoordinator$dateNode$2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,471:1\n1#2:472\n*E\n"})
    /* renamed from: rz2$p */
    /* loaded from: classes2.dex */
    public static final class C28136p extends Lambda implements Function0<Boolean> {
        public C28136p() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            List<DeliveryWindow> deliveryWindows;
            Optional<String> value = C48380rz2.this.f108023x.m88824o().getValue();
            boolean z = false;
            if ((value != null ? value.m59035e() : null) == null) {
                RentalPlan m88821r = C48380rz2.this.f108023x.m88821r();
                if ((m88821r == null || (deliveryWindows = m88821r.getDeliveryWindows()) == null || deliveryWindows.size() <= 1) ? false : true) {
                    z = true;
                }
            }
            return Boolean.valueOf(z);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/view/View;", C17296a.f69688o, "(Landroid/content/Context;)Landroid/view/View;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: rz2$p0 */
    /* loaded from: classes2.dex */
    public static final class C28137p0 extends Lambda implements Function1<Context, View> {

        /* renamed from: g */
        public static final C28137p0 f108081g = new C28137p0();

        public C28137p0() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final View invoke(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            RelativeLayout root = LC2.m97594c(C40788fB0.m41772j(context)).getRoot();
            Intrinsics.checkNotNullExpressionValue(root, "inflate(context.layoutInflater).root");
            return root;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/view/View;", C17296a.f69688o, "(Landroid/content/Context;)Landroid/view/View;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: rz2$q */
    /* loaded from: classes2.dex */
    public static final class C28138q extends Lambda implements Function1<Context, View> {

        /* renamed from: g */
        public static final C28138q f108082g = new C28138q();

        public C28138q() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final View invoke(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            RelativeLayout root = LC2.m97594c(C40788fB0.m41772j(context)).getRoot();
            Intrinsics.checkNotNullExpressionValue(root, "inflate(context.layoutInflater).root");
            return root;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, m28432d2 = {"Landroid/view/View;", "view", "Lcom/uber/autodispose/ScopeProvider;", "scopeProvider", "Lco/bird/android/library/flow/FlowActivity;", "activity", "Llv1;", C17296a.f69688o, "(Landroid/view/View;Lcom/uber/autodispose/ScopeProvider;Lco/bird/android/library/flow/FlowActivity;)Llv1;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: rz2$q0 */
    /* loaded from: classes2.dex */
    public static final class C28139q0 extends Lambda implements Function3<View, ScopeProvider, FlowActivity, InterfaceC44782lv1> {
        public C28139q0() {
            super(3);
        }

        @Override // kotlin.jvm.functions.Function3
        /* renamed from: a */
        public final InterfaceC44782lv1 invoke(View view, ScopeProvider scopeProvider, FlowActivity activity) {
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(scopeProvider, "scopeProvider");
            Intrinsics.checkNotNullParameter(activity, "activity");
            LC2 m97596a = LC2.m97596a(view);
            Intrinsics.checkNotNullExpressionValue(m97596a, "bind(view)");
            return C48380rz2.this.f108014o.mo30424a(C48380rz2.this.f108023x, scopeProvider, new C47195pz2<>(activity, m97596a, new C43629jy4(activity, activity.mo58957w())), activity.mo58957w());
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, m28432d2 = {"Landroid/view/View;", "view", "Lcom/uber/autodispose/ScopeProvider;", "scopeProvider", "Lco/bird/android/library/flow/FlowActivity;", "activity", "Llv1;", C17296a.f69688o, "(Landroid/view/View;Lcom/uber/autodispose/ScopeProvider;Lco/bird/android/library/flow/FlowActivity;)Llv1;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: rz2$r */
    /* loaded from: classes2.dex */
    public static final class C28140r extends Lambda implements Function3<View, ScopeProvider, FlowActivity, InterfaceC44782lv1> {
        public C28140r() {
            super(3);
        }

        @Override // kotlin.jvm.functions.Function3
        /* renamed from: a */
        public final InterfaceC44782lv1 invoke(View view, ScopeProvider scopeProvider, FlowActivity activity) {
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(scopeProvider, "scopeProvider");
            Intrinsics.checkNotNullParameter(activity, "activity");
            LC2 m97596a = LC2.m97596a(view);
            Intrinsics.checkNotNullExpressionValue(m97596a, "bind(view)");
            return C48380rz2.this.f108010k.mo84511a(C48380rz2.this.f108023x, scopeProvider, new C47195pz2<>(activity, m97596a, new C52512yx4(activity)), activity.mo58957w());
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", C17296a.f69688o, "(Landroid/content/Context;)Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: rz2$s */
    /* loaded from: classes2.dex */
    public static final class C28141s extends Lambda implements Function1<Context, String> {
        public C28141s() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final String invoke(Context context) {
            boolean isBlank;
            Intrinsics.checkNotNullParameter(context, "context");
            String menuItemLabel = C48380rz2.this.m14959d().getContent().getMenuItemLabel();
            isBlank = StringsKt__StringsJVMKt.isBlank(menuItemLabel);
            if (isBlank) {
                menuItemLabel = context.getString(C45871nl4.long_term_rental_main_title);
            }
            Intrinsics.checkNotNullExpressionValue(menuItemLabel, "rentalConfig.content.men…emLabel\n        }\n      }");
            return menuItemLabel;
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: rz2$t */
    /* loaded from: classes2.dex */
    public static final class C28142t extends Lambda implements Function0<Boolean> {
        public C28142t() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            Optional<String> value = C48380rz2.this.f108023x.m88824o().getValue();
            return Boolean.valueOf((value != null ? value.m59035e() : null) == null);
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: rz2$u */
    /* loaded from: classes2.dex */
    public static final class C28143u extends Lambda implements Function0<Boolean> {

        /* renamed from: g */
        public static final C28143u f108087g = new C28143u();

        public C28143u() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            return Boolean.FALSE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/view/View;", C17296a.f69688o, "(Landroid/content/Context;)Landroid/view/View;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: rz2$v */
    /* loaded from: classes2.dex */
    public static final class C28144v extends Lambda implements Function1<Context, View> {

        /* renamed from: g */
        public static final C28144v f108088g = new C28144v();

        public C28144v() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final View invoke(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            CallToActionLayout root = KC2.m99086c(C40788fB0.m41772j(context)).getRoot();
            Intrinsics.checkNotNullExpressionValue(root, "inflate(context.layoutInflater).root");
            return root;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, m28432d2 = {"Landroid/view/View;", "view", "Lcom/uber/autodispose/ScopeProvider;", "scopeProvider", "Lco/bird/android/library/flow/FlowActivity;", "activity", "Llv1;", C17296a.f69688o, "(Landroid/view/View;Lcom/uber/autodispose/ScopeProvider;Lco/bird/android/library/flow/FlowActivity;)Llv1;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: rz2$w */
    /* loaded from: classes2.dex */
    public static final class C28145w extends Lambda implements Function3<View, ScopeProvider, FlowActivity, InterfaceC44782lv1> {
        public C28145w() {
            super(3);
        }

        @Override // kotlin.jvm.functions.Function3
        /* renamed from: a */
        public final InterfaceC44782lv1 invoke(View view, ScopeProvider scopeProvider, FlowActivity activity) {
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(scopeProvider, "scopeProvider");
            Intrinsics.checkNotNullParameter(activity, "activity");
            KC2 m99088a = KC2.m99088a(view);
            Intrinsics.checkNotNullExpressionValue(m99088a, "bind(view)");
            return C48380rz2.this.f108005f.mo44561a(C48380rz2.this.f108023x, scopeProvider, new C40781fA2(activity, m99088a), activity.mo58957w());
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", C17296a.f69688o, "(Landroid/content/Context;)Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: rz2$x */
    /* loaded from: classes2.dex */
    public static final class C28146x extends Lambda implements Function1<Context, String> {

        /* renamed from: g */
        public static final C28146x f108090g = new C28146x();

        public C28146x() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final String invoke(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            String string = context.getString(C45871nl4.long_term_rental_main_title);
            Intrinsics.checkNotNullExpressionValue(string, "context.getString(L.stri…g_term_rental_main_title)");
            return string;
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: rz2$y */
    /* loaded from: classes2.dex */
    public static final class C28147y extends Lambda implements Function0<Boolean> {
        public C28147y() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            return Boolean.valueOf(!C48380rz2.this.f108003d.mo87531h().getValue().m59037c());
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/view/View;", C17296a.f69688o, "(Landroid/content/Context;)Landroid/view/View;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: rz2$z */
    /* loaded from: classes2.dex */
    public static final class C28148z extends Lambda implements Function1<Context, View> {

        /* renamed from: g */
        public static final C28148z f108092g = new C28148z();

        public C28148z() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final View invoke(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            FrameLayout root = MC2.m95594c(C40788fB0.m41772j(context)).getRoot();
            Intrinsics.checkNotNullExpressionValue(root, "inflate(context.layoutInflater).root");
            return root;
        }
    }

    public C48380rz2(C22454gl preference, C36207Tq4 config, InterfaceC44637lg6 agreementManager, InterfaceC32292Cx4 rentalManager, InterfaceC44932mA2 loadingPresenterFactory, InterfaceC38985cA2 introPresenterFactory, LocationSelectionUiImplFactory locationUiFactory, HA2 locationPresenterFactory, UA2 notesPresenterFactory, InterfaceC41976hB2 periodPresenterFactory, InterfaceC35818Rz2 datePresenterFactory, BC2 agreementPresenterFactory, InterfaceC49100tC2 summaryPresenterFactory, InterfaceC31840Az2 confirmedPresenterFactory, InterfaceC42750iV3 vehiclePlanSelectionPresenterFactory, InterfaceC51929xy4 pickupPresenterFactory, InterfaceC41257fy4 pickupConfirmedPresenterFactory, InterfaceC36575Vf3 onDemandSetupIntroPresenterFactory, InterfaceC31895Bf3 onDemandLocationUiFactory, InterfaceC49377tg3 onDemandLocationPresenterFactory, InterfaceC47313qB2 phoneNumberPresenterFactory, InterfaceC33308Hg3 onDemandViabilityTestPresenterFactory, ScopeProvider scopeProvider) {
        List<C32387Di0> listOf;
        List<C32387Di0> listOf2;
        List<C32387Di0> listOf3;
        Intrinsics.checkNotNullParameter(preference, "preference");
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(agreementManager, "agreementManager");
        Intrinsics.checkNotNullParameter(rentalManager, "rentalManager");
        Intrinsics.checkNotNullParameter(loadingPresenterFactory, "loadingPresenterFactory");
        Intrinsics.checkNotNullParameter(introPresenterFactory, "introPresenterFactory");
        Intrinsics.checkNotNullParameter(locationUiFactory, "locationUiFactory");
        Intrinsics.checkNotNullParameter(locationPresenterFactory, "locationPresenterFactory");
        Intrinsics.checkNotNullParameter(notesPresenterFactory, "notesPresenterFactory");
        Intrinsics.checkNotNullParameter(periodPresenterFactory, "periodPresenterFactory");
        Intrinsics.checkNotNullParameter(datePresenterFactory, "datePresenterFactory");
        Intrinsics.checkNotNullParameter(agreementPresenterFactory, "agreementPresenterFactory");
        Intrinsics.checkNotNullParameter(summaryPresenterFactory, "summaryPresenterFactory");
        Intrinsics.checkNotNullParameter(confirmedPresenterFactory, "confirmedPresenterFactory");
        Intrinsics.checkNotNullParameter(vehiclePlanSelectionPresenterFactory, "vehiclePlanSelectionPresenterFactory");
        Intrinsics.checkNotNullParameter(pickupPresenterFactory, "pickupPresenterFactory");
        Intrinsics.checkNotNullParameter(pickupConfirmedPresenterFactory, "pickupConfirmedPresenterFactory");
        Intrinsics.checkNotNullParameter(onDemandSetupIntroPresenterFactory, "onDemandSetupIntroPresenterFactory");
        Intrinsics.checkNotNullParameter(onDemandLocationUiFactory, "onDemandLocationUiFactory");
        Intrinsics.checkNotNullParameter(onDemandLocationPresenterFactory, "onDemandLocationPresenterFactory");
        Intrinsics.checkNotNullParameter(phoneNumberPresenterFactory, "phoneNumberPresenterFactory");
        Intrinsics.checkNotNullParameter(onDemandViabilityTestPresenterFactory, "onDemandViabilityTestPresenterFactory");
        Intrinsics.checkNotNullParameter(scopeProvider, "scopeProvider");
        this.f108000a = preference;
        this.f108001b = config;
        this.f108002c = agreementManager;
        this.f108003d = rentalManager;
        this.f108004e = loadingPresenterFactory;
        this.f108005f = introPresenterFactory;
        this.f108006g = locationUiFactory;
        this.f108007h = locationPresenterFactory;
        this.f108008i = notesPresenterFactory;
        this.f108009j = periodPresenterFactory;
        this.f108010k = datePresenterFactory;
        this.f108011l = agreementPresenterFactory;
        this.f108012m = summaryPresenterFactory;
        this.f108013n = confirmedPresenterFactory;
        this.f108014o = vehiclePlanSelectionPresenterFactory;
        this.f108015p = pickupPresenterFactory;
        this.f108016q = pickupConfirmedPresenterFactory;
        this.f108017r = onDemandSetupIntroPresenterFactory;
        this.f108018s = onDemandLocationUiFactory;
        this.f108019t = onDemandLocationPresenterFactory;
        this.f108020u = phoneNumberPresenterFactory;
        this.f108021v = onDemandViabilityTestPresenterFactory;
        this.f108022w = scopeProvider;
        this.f108023x = new QA2(m14958e(), m14959d(), null, null, null, null, null, null, null, null, null, null, null, null, null, 32764, null);
        C32387Di0 c32387Di0 = new C32387Di0("loading", C28146x.f108090g, new C28147y(), null, C28148z.f108092g, new C28079A(), 8, null);
        this.f108024y = c32387Di0;
        C32387Di0 c32387Di02 = new C32387Di0("intro", new C28141s(), new C28142t(), C28143u.f108087g, C28144v.f108088g, new C28145w());
        this.f108025z = c32387Di02;
        this.f107982A = new C32387Di0("intro", C28089J.f108035g, new C28090K(), C28091L.f108037g, C28092M.f108038g, new C28093N());
        C32387Di0 c32387Di03 = new C32387Di0("location", C28081B.f108027g, new C28082C(), null, C28083D.f108029g, new C28084E(), 8, null);
        this.f107983B = c32387Di03;
        this.f107984C = new C32387Di0("location", C28094O.f108040g, new C28095P(), null, C28096Q.f108042g, new C28097R(), 8, null);
        C32387Di0 c32387Di04 = new C32387Di0("vehicle_selection", C28133n0.f108077g, new C28135o0(), null, C28137p0.f108081g, new C28139q0(), 8, null);
        this.f107985D = c32387Di04;
        C32387Di0 c32387Di05 = new C32387Di0("pickup", C28107a0.f108052g, new C28109b0(), null, C28111c0.f108055g, new C28113d0(), 8, null);
        this.f107986E = c32387Di05;
        C32387Di0 c32387Di06 = new C32387Di0("notes", C28085F.f108031g, new C28086G(), null, C28087H.f108033g, new C28088I(), 8, null);
        this.f107987F = c32387Di06;
        C32387Di0 c32387Di07 = new C32387Di0("confirm_phone_number", C28118g.f108062g, new C28120h(), null, C28122i.f108066g, new C28124j(), 8, null);
        this.f107988G = c32387Di07;
        C32387Di0 c32387Di08 = new C32387Di0("plan", C28115e0.f108059g, new C28117f0(), null, C28119g0.f108063g, new C28121h0(), 8, null);
        this.f107989H = c32387Di08;
        C32387Di0 c32387Di09 = new C32387Di0("date", C28134o.f108078g, new C28136p(), null, C28138q.f108082g, new C28140r(), 8, null);
        this.f107990I = c32387Di09;
        C32387Di0 c32387Di010 = new C32387Di0("agreement", C28110c.f108054g, new C28112d(), null, C28114e.f108058g, new C28116f(), 8, null);
        this.f107991J = c32387Di010;
        C32387Di0 c32387Di011 = new C32387Di0("summary", new C28123i0(), C28125j0.f108069g, new C28127k0(), C28129l0.f108073g, new C28131m0());
        this.f107992K = c32387Di011;
        C32387Di0 c32387Di012 = new C32387Di0("confirmed", C28126k.f108070g, new C28128l(), null, C28130m.f108074g, new C28132n(), 8, null);
        this.f107993L = c32387Di012;
        C32387Di0 c32387Di013 = new C32387Di0("pickup_confirmed", C28102W.f108048g, new C28103X(), null, C28104Y.f108050g, new C28105Z(), 8, null);
        this.f107994M = c32387Di013;
        C32387Di0 c32387Di014 = new C32387Di0("on_demand_viability_test_node", new C28098S(), C28099T.f108045g, null, C28100U.f108046g, new C28101V(), 8, null);
        this.f107995N = c32387Di014;
        listOf = CollectionsKt__CollectionsKt.listOf((Object[]) new C32387Di0[]{c32387Di0, c32387Di02, c32387Di03, c32387Di06, c32387Di08, c32387Di09, c32387Di010, c32387Di07, c32387Di011, c32387Di012});
        this.f107996O = listOf;
        listOf2 = CollectionsKt__CollectionsKt.listOf((Object[]) new C32387Di0[]{c32387Di0, c32387Di02, c32387Di04, c32387Di05, c32387Di010, c32387Di07, c32387Di011, c32387Di013});
        this.f107997P = listOf2;
        listOf3 = CollectionsKt__CollectionsKt.listOf((Object[]) new C32387Di0[]{c32387Di0, c32387Di014});
        this.f107998Q = listOf3;
        int i = C28108b.$EnumSwitchMapping$0[m14958e().ordinal()];
        if (i == 1) {
            listOf = listOf2;
        } else if (i == 2) {
            listOf = listOf3;
        }
        this.f107999R = listOf;
    }

    @Override // p000.AbstractC34602Mu1
    /* renamed from: a */
    public List<C32387Di0> mo14962a() {
        return this.f107999R;
    }

    @Override // p000.AbstractC34602Mu1
    /* renamed from: b */
    public void mo14961b(Bundle bundle) {
        Unit unit;
        Object firstOrNull;
        this.f108000a.m37684R2();
        CurrentRental currentRental = null;
        if (bundle != null) {
            m14957f(bundle);
            unit = Unit.INSTANCE;
        } else {
            unit = null;
        }
        if (unit == null) {
            QA2 qa2 = this.f108023x;
            List<CurrentRental> m59035e = this.f108003d.mo87531h().getValue().m59035e();
            if (m59035e != null) {
                firstOrNull = CollectionsKt___CollectionsKt.firstOrNull((List<? extends Object>) m59035e);
                currentRental = (CurrentRental) firstOrNull;
            }
            qa2.m88846A(currentRental);
        }
        super.mo14961b(bundle);
        this.f108023x.m88819t(this.f108022w);
        AgreementRole agreementRole = AgreementRole.RIDER;
        if (!this.f108002c.mo2957d().getValue().containsKey(new AgreementKey(agreementRole, null, null, 4, null))) {
            AbstractC24507p m32065J = InterfaceC44637lg6.C25760a.refreshAgreements$default(this.f108002c, new AgreementRole[]{agreementRole}, null, null, 6, null).m32065J();
            Intrinsics.checkNotNullExpressionValue(m32065J, "agreementManager.refresh…       .onErrorComplete()");
            Object m32048b = m32065J.m32048b(AutoDispose.m45239a(this.f108022w));
            Intrinsics.checkExpressionValueIsNotNull(m32048b, "this.`as`(AutoDispose.autoDisposable(provider))");
            ((MaybeSubscribeProxy) m32048b).subscribe();
        }
    }

    @Override // p000.AbstractC34602Mu1
    /* renamed from: c */
    public void mo14960c(Bundle outState) {
        String str;
        WireLocation wireLocation;
        String str2;
        Boolean bool;
        String str3;
        String str4;
        RentalStatus rentalStatus;
        RentalPeriod rentalPeriod;
        Intrinsics.checkNotNullParameter(outState, "outState");
        super.mo14960c(outState);
        Optional<String> value = this.f108023x.m88824o().getValue();
        if (value != null) {
            str = value.m59035e();
        } else {
            str = null;
        }
        Boolean value2 = this.f108023x.m88815x().getValue();
        if (value2 == null) {
            value2 = Boolean.FALSE;
        }
        boolean booleanValue = value2.booleanValue();
        Boolean value3 = this.f108023x.m88814y().getValue();
        if (value3 == null) {
            value3 = Boolean.FALSE;
        }
        boolean booleanValue2 = value3.booleanValue();
        Optional<WireLocation> value4 = this.f108023x.m88826m().getValue();
        if (value4 != null) {
            wireLocation = value4.m59035e();
        } else {
            wireLocation = null;
        }
        Optional<String> value5 = this.f108023x.m88832g().getValue();
        if (value5 != null) {
            str2 = value5.m59035e();
        } else {
            str2 = null;
        }
        List<RentalPlan> value6 = this.f108023x.m88831h().getValue();
        String value7 = this.f108023x.m88825n().getValue();
        if (value7 == null) {
            value7 = "";
        }
        String str5 = value7;
        Optional<Boolean> value8 = this.f108023x.m88830i().getValue();
        if (value8 != null) {
            bool = value8.m59035e();
        } else {
            bool = null;
        }
        Optional<String> value9 = this.f108023x.m88827l().getValue();
        if (value9 != null) {
            str3 = value9.m59035e();
        } else {
            str3 = null;
        }
        Optional<String> value10 = this.f108023x.m88822q().getValue();
        if (value10 != null) {
            str4 = value10.m59035e();
        } else {
            str4 = null;
        }
        Optional<RentalStatus> value11 = this.f108023x.m88820s().getValue();
        if (value11 != null) {
            rentalStatus = value11.m59035e();
        } else {
            rentalStatus = null;
        }
        Optional<RentalPeriod> value12 = this.f108023x.m88828k().getValue();
        if (value12 != null) {
            rentalPeriod = value12.m59035e();
        } else {
            rentalPeriod = null;
        }
        outState.putParcelable("longTermRentalSetupActivity.model", new ParcelableLongTermRentalSetupModel(str, booleanValue, booleanValue2, wireLocation, str2, value6, str5, bool, str3, str4, rentalStatus, rentalPeriod));
    }

    /* renamed from: d */
    public final RentalConfig m14959d() {
        return RentalConfigKt.getConfig(this.f108001b.m82623f8().m73665a().getRentalConfigs());
    }

    /* renamed from: e */
    public final RentalKind m14958e() {
        return RentalConfigKt.rentalKind(this.f108001b.m82623f8().m73665a().getRentalConfigs());
    }

    /* renamed from: f */
    public final void m14957f(Bundle bundle) {
        ParcelableLongTermRentalSetupModel parcelableLongTermRentalSetupModel = (ParcelableLongTermRentalSetupModel) bundle.getParcelable("longTermRentalSetupActivity.model");
        if (parcelableLongTermRentalSetupModel == null) {
            return;
        }
        C0058AG<Optional<String>> m88824o = this.f108023x.m88824o();
        Optional.C14443a c14443a = Optional.f63040c;
        m88824o.accept(c14443a.m59033b(parcelableLongTermRentalSetupModel.m60582e()));
        this.f108023x.m88815x().accept(Boolean.valueOf(parcelableLongTermRentalSetupModel.m60579i()));
        this.f108023x.m88814y().accept(Boolean.valueOf(parcelableLongTermRentalSetupModel.m60578j()));
        this.f108023x.m88826m().accept(c14443a.m59033b(parcelableLongTermRentalSetupModel.getLocation()));
        this.f108023x.m88832g().accept(c14443a.m59033b(parcelableLongTermRentalSetupModel.getAddress()));
        this.f108023x.m88831h().accept(parcelableLongTermRentalSetupModel.m60586a());
        this.f108023x.m88825n().accept(parcelableLongTermRentalSetupModel.getNotes());
        this.f108023x.m88830i().accept(c14443a.m59033b(parcelableLongTermRentalSetupModel.m60585b()));
        this.f108023x.m88827l().accept(c14443a.m59033b(parcelableLongTermRentalSetupModel.m60583d()));
        this.f108023x.m88822q().accept(c14443a.m59033b(parcelableLongTermRentalSetupModel.m60581g()));
        this.f108023x.m88820s().accept(c14443a.m59033b(parcelableLongTermRentalSetupModel.m60580h()));
        this.f108023x.m88828k().accept(c14443a.m59033b(parcelableLongTermRentalSetupModel.m60584c()));
    }
}
