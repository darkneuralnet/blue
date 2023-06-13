package p000;

import android.app.Dialog;
import android.content.Intent;
import android.content.res.Resources;
import android.widget.FrameLayout;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.buava.Optional;
import co.bird.android.core.mvp.BaseActivity;
import co.bird.android.coreinterface.manager.RideRequirementTimeoutException;
import co.bird.android.model.Agreement;
import co.bird.android.model.AgreementKey;
import co.bird.android.model.AgreementRole;
import co.bird.android.model.Balance;
import co.bird.android.model.BirdPayment;
import co.bird.android.model.RideMapState;
import co.bird.android.model.RideRequirement;
import co.bird.android.model.RideState;
import co.bird.android.model.RideStateEvent;
import co.bird.android.model.TaxInformationSource;
import co.bird.android.model.User;
import co.bird.android.model.analytics.GooglePayAuthSheetPresented;
import co.bird.android.model.analytics.PaymentMethodAdded;
import co.bird.android.model.constant.ConfigurableTutorialContext;
import co.bird.android.model.constant.Permission;
import co.bird.android.model.constant.RideRequirementReason;
import co.bird.android.model.exception.BluetoothException;
import co.bird.android.model.exception.LocationDisabledException;
import co.bird.android.model.identification.IdentificationIntentPermissionStatus;
import co.bird.android.model.identification.IdentificationManualEntryFormData;
import co.bird.android.model.identification.IdentificationRequestIdentifier;
import co.bird.android.model.wire.WireBird;
import co.bird.android.model.wire.WireBirdKt;
import co.bird.android.model.wire.WireRide;
import co.bird.android.model.wire.configs.RideConfig;
import co.bird.android.navigator.CardEntered;
import co.bird.api.error.RetrofitException;
import com.facebook.share.internal.C17296a;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.bottomsheet.DialogC17707a;
import com.stripe.android.financialconnections.p041ui.FinancialConnectionsSheetNativeActivity;
import com.stripe.android.model.Card;
import com.stripe.android.model.Token;
import com.stripe.android.stripe3ds2.transactions.MessageExtension;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.CompletableSubscribeProxy;
import com.uber.autodispose.MaybeSubscribeProxy;
import com.uber.autodispose.ObservableSubscribeProxy;
import com.uber.autodispose.ScopeProvider;
import com.uber.autodispose.SingleSubscribeProxy;
import io.reactivex.AbstractC23442F;
import io.reactivex.AbstractC23461c;
import io.reactivex.AbstractC24507p;
import io.reactivex.InterfaceC24574u;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.C23454a;
import io.reactivex.disposables.InterfaceC23465c;
import io.reactivex.functions.InterfaceC23478a;
import io.reactivex.functions.InterfaceC23481d;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.functions.InterfaceC23492o;
import io.reactivex.functions.InterfaceC23494q;
import java.util.Currency;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.H31;
import p000.InterfaceC40099e13;
import p000.InterfaceC42586iD1;
import p000.InterfaceC44637lg6;
import p000.InterfaceC44791lw0;
import p000.J35;
import p000.TJ4;
@Metadata(m28433d1 = {"\u0000¢\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001Bµ\u0001\b\u0007\u0012\u0006\u00106\u001a\u000204\u0012\u0006\u00109\u001a\u000207\u0012\u0006\u0010<\u001a\u00020:\u0012\u0006\u0010?\u001a\u00020=\u0012\u0006\u0010B\u001a\u00020@\u0012\u0006\u0010E\u001a\u00020C\u0012\u0006\u0010H\u001a\u00020F\u0012\u0006\u0010K\u001a\u00020I\u0012\u0006\u0010O\u001a\u00020L\u0012\u0006\u0010S\u001a\u00020P\u0012\u0006\u0010W\u001a\u00020T\u0012\u0006\u0010[\u001a\u00020X\u0012\u0006\u0010_\u001a\u00020\\\u0012\u0006\u0010c\u001a\u00020`\u0012\u0006\u0010g\u001a\u00020d\u0012\b\b\u0001\u0010k\u001a\u00020h\u0012\b\b\u0001\u0010o\u001a\u00020l\u0012\b\b\u0001\u0010s\u001a\u00020p\u0012\b\b\u0001\u0010w\u001a\u00020t\u0012\b\b\u0001\u0010z\u001a\u00020\u000e¢\u0006\u0006\b\u0083\u0001\u0010\u0084\u0001J\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0002J\u0018\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0002J\u0016\u0010\r\u001a\u00020\t2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\u000bH\u0002J\f\u0010\u000f\u001a\u00020\t*\u00020\u000eH\u0002J\u0010\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002J\b\u0010\u0013\u001a\u00020\tH\u0016J\b\u0010\u0014\u001a\u00020\tH\u0016J\u0010\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\u0015H\u0017J\u0010\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\u0018H\u0017J*\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\u0010\u001a\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0016J$\u0010 \u001a\u00020\t2\b\u0010\u001a\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0016J\u000e\u0010#\u001a\b\u0012\u0004\u0012\u00020\"0!H\u0016J\"\u0010)\u001a\u00020\t2\u0006\u0010%\u001a\u00020$2\u0006\u0010&\u001a\u00020$2\b\u0010(\u001a\u0004\u0018\u00010'H\u0016J\u000e\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016J\b\u0010,\u001a\u00020+H\u0016J\u0013\u0010-\u001a\u00020\t*\u00020\u0003H\u0000¢\u0006\u0004\b-\u0010.J\u0010\u00100\u001a\u00020\t2\u0006\u0010/\u001a\u00020\u0003H\u0016J\u0016\u00101\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010/\u001a\u00020\u0003H\u0016J\u0016\u00103\u001a\b\u0012\u0004\u0012\u00020+022\u0006\u0010/\u001a\u00020\u0003H\u0016R\u0014\u00106\u001a\u0002048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u00105R\u0014\u00109\u001a\u0002078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00108R\u0014\u0010<\u001a\u00020:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010;R\u0014\u0010?\u001a\u00020=8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u0010>R\u0014\u0010B\u001a\u00020@8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010AR\u0014\u0010E\u001a\u00020C8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010DR\u0014\u0010H\u001a\u00020F8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u0010GR\u0014\u0010K\u001a\u00020I8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010JR\u0014\u0010O\u001a\u00020L8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bM\u0010NR\u0014\u0010S\u001a\u00020P8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bQ\u0010RR\u0014\u0010W\u001a\u00020T8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bU\u0010VR\u0014\u0010[\u001a\u00020X8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bY\u0010ZR\u0014\u0010_\u001a\u00020\\8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b]\u0010^R\u0014\u0010c\u001a\u00020`8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\ba\u0010bR\u0014\u0010g\u001a\u00020d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\be\u0010fR\u0014\u0010k\u001a\u00020h8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bi\u0010jR\u0014\u0010o\u001a\u00020l8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bm\u0010nR\u0014\u0010s\u001a\u00020p8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bq\u0010rR\u0014\u0010w\u001a\u00020t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bu\u0010vR\u0014\u0010z\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bx\u0010yR)\u0010\u0082\u0001\u001a\b\u0012\u0004\u0012\u00020\"0{8\u0000X\u0081\u0004¢\u0006\u0014\n\u0004\b|\u0010}\u0012\u0006\b\u0080\u0001\u0010\u0081\u0001\u001a\u0004\b~\u0010\u007f¨\u0006\u0085\u0001"}, m28432d2 = {"LTJ4;", "LsJ4;", "Lio/reactivex/p;", "Lco/bird/android/model/RideRequirement;", "I", "Lco/bird/android/model/User;", "user", "Lco/bird/android/model/wire/configs/RideConfig;", "config", "", "V", "Lkotlin/Function0;", "onGranted", "o0", "Le13;", "U", "", "error", "n0", "g0", "onDestroy", "LP71;", "event", "onEvent", "LVq;", "Lco/bird/android/model/wire/WireBird;", "bird", "Lco/bird/android/model/constant/RideRequirementReason;", "requirementReason", "", "userGuestId", "f", C17296a.f69688o, "Lio/reactivex/Observable;", "LJ35$a;", "e", "", "requestCode", "resultCode", "Landroid/content/Intent;", MessageExtension.FIELD_DATA, "onActivityResult", "h", "", "c", "O", "(Lco/bird/android/model/RideRequirement;)V", "rideRequirement", "b", DateTokenConverter.CONVERTER_KEY, "Lio/reactivex/F;", "g", "LJ35;", "LJ35;", "requirementManager", "Lgl;", "Lgl;", "preference", "LiD1;", "LiD1;", "googlePayManager", "LEg1;", "LEg1;", "eventBus", "LEa;", "LEa;", "analyticsManager", "LTq4;", "LTq4;", "reactiveConfig", "LYR4;", "LYR4;", "rideManager", "LOh;", "LOh;", "appBuildConfig", "Llh6;", "i", "Llh6;", "userManager", "LpU4;", "j", "LpU4;", "rideMapStateManager", "Llg6;", "k", "Llg6;", "agreementManager", "LzN3;", "l", "LzN3;", "paymentMethodManager", "LVM3;", "m", "LVM3;", "paymentManagerV3", "LmT1;", "n", "LmT1;", "identificationManager", "Llw0;", "o", "Llw0;", "configurableTutorialManager", "LDQ3;", "p", "LDQ3;", "permissionManager", "Lco/bird/android/core/mvp/BaseActivity;", "q", "Lco/bird/android/core/mvp/BaseActivity;", "activity", "Lcom/uber/autodispose/ScopeProvider;", "r", "Lcom/uber/autodispose/ScopeProvider;", "scopeProvider", "LAB1;", "s", "LAB1;", "ui", "t", "Le13;", "navigator", "Lma4;", "u", "Lma4;", "getRequirementsMet$app_birdRelease", "()Lma4;", "getRequirementsMet$app_birdRelease$annotations", "()V", "requirementsMet", "<init>", "(LJ35;Lgl;LiD1;LEg1;LEa;LTq4;LYR4;LOh;Llh6;LpU4;Llg6;LzN3;LVM3;LmT1;Llw0;LDQ3;Lco/bird/android/core/mvp/BaseActivity;Lcom/uber/autodispose/ScopeProvider;LAB1;Le13;)V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nRequirementPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RequirementPresenter.kt\nco/bird/android/app/feature/ride/presenter/RequirementPresenterImpl\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n*L\n1#1,664:1\n180#2:665\n180#2:666\n237#2:667\n218#2:668\n218#2:669\n218#2:670\n218#2:671\n218#2:672\n218#2:673\n218#2:674\n218#2:675\n218#2:676\n218#2:677\n218#2:678\n237#2:679\n180#2:680\n218#2:681\n199#2:682\n*S KotlinDebug\n*F\n+ 1 RequirementPresenter.kt\nco/bird/android/app/feature/ride/presenter/RequirementPresenterImpl\n*L\n150#1:665\n156#1:666\n170#1:667\n187#1:668\n194#1:669\n218#1:670\n234#1:671\n245#1:672\n253#1:673\n272#1:674\n280#1:675\n289#1:676\n297#1:677\n311#1:678\n375#1:679\n413#1:680\n457#1:681\n595#1:682\n*E\n"})
/* renamed from: TJ4 */
/* loaded from: classes2.dex */
public final class TJ4 implements InterfaceC48572sJ4 {

    /* renamed from: a */
    public final J35 f35249a;

    /* renamed from: b */
    public final C22454gl f35250b;

    /* renamed from: c */
    public final InterfaceC42586iD1 f35251c;

    /* renamed from: d */
    public final InterfaceC32604Eg1 f35252d;

    /* renamed from: e */
    public final InterfaceC1880Ea f35253e;

    /* renamed from: f */
    public final C36207Tq4 f35254f;

    /* renamed from: g */
    public final YR4 f35255g;

    /* renamed from: h */
    public final InterfaceC6097Oh f35256h;

    /* renamed from: i */
    public final InterfaceC44647lh6 f35257i;

    /* renamed from: j */
    public final InterfaceC46893pU4 f35258j;

    /* renamed from: k */
    public final InterfaceC44637lg6 f35259k;

    /* renamed from: l */
    public final InterfaceC52757zN3 f35260l;

    /* renamed from: m */
    public final VM3 f35261m;

    /* renamed from: n */
    public final InterfaceC45102mT1 f35262n;

    /* renamed from: o */
    public final InterfaceC44791lw0 f35263o;

    /* renamed from: p */
    public final DQ3 f35264p;

    /* renamed from: q */
    public final BaseActivity f35265q;

    /* renamed from: r */
    public final ScopeProvider f35266r;

    /* renamed from: s */
    public final AB1 f35267s;

    /* renamed from: t */
    public final InterfaceC40099e13 f35268t;

    /* renamed from: u */
    public final C45168ma4<J35.C3879a> f35269u;

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: TJ4$a */
    /* loaded from: classes2.dex */
    public /* synthetic */ class C7769a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[R04.values().length];
            try {
                iArr[R04.CHOOSE_PRE_OR_POST_PAY_VERSION_B.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/RideRequirement;", "kotlin.jvm.PlatformType", "requirement", "", C17296a.f69688o, "(Lco/bird/android/model/RideRequirement;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: TJ4$b */
    /* loaded from: classes2.dex */
    public static final class C7770b extends Lambda implements Function1<RideRequirement, Unit> {
        public C7770b() {
            super(1);
        }

        /* renamed from: a */
        public final void m83832a(RideRequirement requirement) {
            C41318g46.m40163a("checkRequirementsInternal() going to " + requirement, new Object[0]);
            TJ4 tj4 = TJ4.this;
            Intrinsics.checkNotNullExpressionValue(requirement, "requirement");
            tj4.m83877O(requirement);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(RideRequirement rideRequirement) {
            m83832a(rideRequirement);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "error", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: TJ4$c */
    /* loaded from: classes2.dex */
    public static final class C7771c extends Lambda implements Function1<Throwable, Unit> {
        public C7771c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable error) {
            String model;
            String id;
            C41318g46.m40161c(error, "checkRequirementsInternal() threw error: ", new Object[0]);
            TJ4.this.f35258j.mo15894o(RideMapState.SCANNED);
            TJ4 tj4 = TJ4.this;
            Intrinsics.checkNotNullExpressionValue(error, "error");
            tj4.m83846n0(error);
            J35.C3879a mo101233g = TJ4.this.f35249a.mo101233g();
            if ((mo101233g != null ? mo101233g.m101226c() : null) == RideRequirementReason.RIDE) {
                RideConfig rideConfig = TJ4.this.f35254f.m82623f8().m73665a().getRideConfig();
                TJ4 tj42 = TJ4.this;
                J35.C3879a mo101233g2 = tj42.f35249a.mo101233g();
                WireBird m101227b = mo101233g2 != null ? mo101233g2.m101227b() : null;
                InterfaceC1880Ea interfaceC1880Ea = tj42.f35253e;
                boolean canTreatAsBluetooth = m101227b != null ? WireBirdKt.canTreatAsBluetooth(m101227b, C36441Uq4.m80769c(tj42.f35254f, m101227b)) : false;
                boolean cellular = m101227b != null ? m101227b.getCellular() : false;
                boolean z = (m101227b != null ? m101227b.getPrivateBird() : null) != null;
                String str = "";
                String str2 = (m101227b == null || (id = m101227b.getId()) == null) ? "" : id;
                if (m101227b != null && (model = m101227b.getModel()) != null) {
                    str = model;
                }
                String partnerId = m101227b != null ? m101227b.getPartnerId() : null;
                String m88990a = Q36.m88990a(error);
                long basePrice = rideConfig.getBasePrice();
                long minutePrice = rideConfig.getMinutePrice();
                long minimumRidePrice = rideConfig.getMinimumRidePrice();
                boolean z2 = canTreatAsBluetooth;
                long includedMinutes = rideConfig.getIncludedMinutes();
                boolean applyTax = rideConfig.getAdditionalFees().getApplyTax();
                Balance m59035e = tj42.f35257i.mo26977K().getValue().m59035e();
                Long valueOf = m59035e != null ? Long.valueOf(m59035e.getBalance()) : null;
                BirdPayment m59035e2 = tj42.f35260l.mo1484a().getValue().m59035e();
                String vendor = m59035e2 != null ? m59035e2.vendor() : null;
                BirdPayment m59035e3 = tj42.f35260l.mo1484a().getValue().m59035e();
                String birdPayment = m59035e3 != null ? m59035e3.toString() : null;
                Balance m59035e4 = tj42.f35257i.mo26977K().getValue().m59035e();
                interfaceC1880Ea.mo55905y(new V55(null, null, null, z2, cellular, z, str2, str, partnerId, m88990a, basePrice, minutePrice, minimumRidePrice, includedMinutes, applyTax, valueOf, vendor, birdPayment, m59035e4 != null ? m59035e4.getAutoPayActive() : null, Boolean.valueOf(Q36.m88989b(error)), "ride_requirements", null, null, 6291463, null));
            }
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: TJ4$d */
    /* loaded from: classes2.dex */
    public static final class C7772d extends Lambda implements Function0<Unit> {
        public C7772d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            TJ4.this.f35268t.mo37009i0(I35.ID_SELECTION.ordinal());
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a.\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u0000\u0012\u0004\u0012\u00020\u0004 \u0005*\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u0000\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"Lco/bird/android/buava/Optional;", "Lco/bird/android/model/identification/IdentificationManualEntryFormData;", "it", "Lkotlin/Pair;", "LgU1;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/buava/Optional;)Lkotlin/Pair;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: TJ4$e */
    /* loaded from: classes2.dex */
    public static final class C7773e extends Lambda implements Function1<Optional<IdentificationManualEntryFormData>, Pair<? extends Optional<IdentificationManualEntryFormData>, ? extends C41553gU1>> {

        /* renamed from: g */
        public final /* synthetic */ C41553gU1 f35273g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C7773e(C41553gU1 c41553gU1) {
            super(1);
            this.f35273g = c41553gU1;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Pair<Optional<IdentificationManualEntryFormData>, C41553gU1> invoke(Optional<IdentificationManualEntryFormData> it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return TuplesKt.m28425to(it, this.f35273g);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a*\u0012\u000e\b\u0001\u0012\n \u0007*\u0004\u0018\u00010\u00060\u0006 \u0007*\u0014\u0012\u000e\b\u0001\u0012\n \u0007*\u0004\u0018\u00010\u00060\u0006\u0018\u00010\u00050\u00052\u0018\u0010\u0004\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0001\u0012\u0004\u0012\u00020\u00030\u0000H\n¢\u0006\u0004\b\b\u0010\t"}, m28432d2 = {"Lkotlin/Pair;", "Lco/bird/android/buava/Optional;", "Lco/bird/android/model/identification/IdentificationManualEntryFormData;", "LgU1;", "<name for destructuring parameter 0>", "Lio/reactivex/u;", "Lco/bird/android/model/identification/IdentificationIntentPermissionStatus;", "kotlin.jvm.PlatformType", "c", "(Lkotlin/Pair;)Lio/reactivex/u;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: TJ4$f */
    /* loaded from: classes2.dex */
    public static final class C7774f extends Lambda implements Function1<Pair<? extends Optional<IdentificationManualEntryFormData>, ? extends C41553gU1>, InterfaceC24574u<? extends IdentificationIntentPermissionStatus>> {

        @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/identification/IdentificationIntentPermissionStatus;", "kotlin.jvm.PlatformType", "status", "", C17296a.f69688o, "(Lco/bird/android/model/identification/IdentificationIntentPermissionStatus;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
        @SourceDebugExtension({"SMAP\nRequirementPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RequirementPresenter.kt\nco/bird/android/app/feature/ride/presenter/RequirementPresenterImpl$go$5$1\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n*L\n1#1,664:1\n218#2:665\n*S KotlinDebug\n*F\n+ 1 RequirementPresenter.kt\nco/bird/android/app/feature/ride/presenter/RequirementPresenterImpl$go$5$1\n*L\n403#1:665\n*E\n"})
        /* renamed from: TJ4$f$a */
        /* loaded from: classes2.dex */
        public static final class C7775a extends Lambda implements Function1<IdentificationIntentPermissionStatus, Unit> {

            /* renamed from: g */
            public final /* synthetic */ C41553gU1 f35275g;

            /* renamed from: h */
            public final /* synthetic */ TJ4 f35276h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C7775a(C41553gU1 c41553gU1, TJ4 tj4) {
                super(1);
                this.f35275g = c41553gU1;
                this.f35276h = tj4;
            }

            /* renamed from: a */
            public final void m83826a(IdentificationIntentPermissionStatus identificationIntentPermissionStatus) {
                this.f35275g.dismiss();
                Object m32048b = this.f35276h.m83883I().m32048b(AutoDispose.m45239a(this.f35276h.f35266r));
                Intrinsics.checkExpressionValueIsNotNull(m32048b, "this.`as`(AutoDispose.autoDisposable(provider))");
                ((MaybeSubscribeProxy) m32048b).subscribe();
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(IdentificationIntentPermissionStatus identificationIntentPermissionStatus) {
                m83826a(identificationIntentPermissionStatus);
                return Unit.INSTANCE;
            }
        }

        @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: TJ4$f$b */
        /* loaded from: classes2.dex */
        public static final class C7776b extends Lambda implements Function1<Throwable, Unit> {

            /* renamed from: g */
            public final /* synthetic */ TJ4 f35277g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C7776b(TJ4 tj4) {
                super(1);
                this.f35277g = tj4;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                invoke2(th);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(Throwable th) {
                C41318g46.m40161c(th, "Error while clicking manual entry button ", new Object[0]);
                H31.C3014a.showBirdDialog$default(this.f35277g.f35267s, C47905rB1.f106655d, false, false, null, null, null, null, 126, null);
            }
        }

        public C7774f() {
            super(1);
        }

        /* renamed from: d */
        public static final void m83827d(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            tmp0.invoke(obj);
        }

        public static final void invoke$lambda$0(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            tmp0.invoke(obj);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: c */
        public final InterfaceC24574u<? extends IdentificationIntentPermissionStatus> invoke(Pair<Optional<IdentificationManualEntryFormData>, C41553gU1> pair) {
            Intrinsics.checkNotNullParameter(pair, "<name for destructuring parameter 0>");
            C41553gU1 component2 = pair.component2();
            IdentificationManualEntryFormData m59035e = pair.component1().m59035e();
            if (m59035e == null) {
                TJ4.this.f35258j.reset();
                return AbstractC24507p.m32024u();
            }
            InterfaceC45102mT1 interfaceC45102mT1 = TJ4.this.f35262n;
            IdentificationRequestIdentifier mo25559j = TJ4.this.f35262n.mo25559j();
            Intrinsics.checkNotNull(mo25559j);
            AbstractC23442F<IdentificationIntentPermissionStatus> m33152N = interfaceC45102mT1.mo25564e(mo25559j, m59035e).m33152N(C23454a.m33087a());
            final C7775a c7775a = new C7775a(component2, TJ4.this);
            AbstractC23442F<IdentificationIntentPermissionStatus> m33101w = m33152N.m33101w(new InterfaceC23484g() { // from class: UJ4
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj) {
                    TJ4.C7774f.invoke$lambda$0(Function1.this, obj);
                }
            });
            final C7776b c7776b = new C7776b(TJ4.this);
            return m33101w.m33106t(new InterfaceC23484g() { // from class: VJ4
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj) {
                    TJ4.C7774f.m83827d(Function1.this, obj);
                }
            }).m33125j0().m32065J();
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: TJ4$g */
    /* loaded from: classes2.dex */
    public static final class C7777g extends Lambda implements Function0<Unit> {
        public C7777g() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            TJ4 tj4 = TJ4.this;
            tj4.m83871U(tj4.f35268t);
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: TJ4$h */
    /* loaded from: classes2.dex */
    public static final class C7778h extends Lambda implements Function0<Unit> {
        public C7778h() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            TJ4.this.f35268t.mo37009i0(I35.ID_SELECTION.ordinal());
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: TJ4$i */
    /* loaded from: classes2.dex */
    public static final class C7779i extends Lambda implements Function0<Unit> {
        public C7779i() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            TJ4.this.f35268t.mo37183D2(I35.PLAY_STORE_FOR_IDENTIFICATION.ordinal());
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: TJ4$j */
    /* loaded from: classes2.dex */
    public static final class C7780j extends Lambda implements Function0<Unit> {

        /* renamed from: g */
        public static final C7780j f35281g = new C7780j();

        public C7780j() {
            super(0);
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"<anonymous>", "", FinancialConnectionsSheetNativeActivity.EXTRA_RESULT, "", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/Boolean;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: TJ4$k */
    /* loaded from: classes2.dex */
    public static final class C7781k extends Lambda implements Function1<Boolean, Unit> {

        /* renamed from: g */
        public final /* synthetic */ RideConfig f35282g;

        /* renamed from: h */
        public final /* synthetic */ TJ4 f35283h;

        /* renamed from: i */
        public final /* synthetic */ User f35284i;

        @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: TJ4$k$a */
        /* loaded from: classes2.dex */
        public static final class C7782a extends Lambda implements Function0<Unit> {

            /* renamed from: g */
            public final /* synthetic */ TJ4 f35285g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C7782a(TJ4 tj4) {
                super(0);
                this.f35285g = tj4;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2() {
                InterfaceC40099e13.C19924a.goToPayment$default(this.f35285g.f35268t, Integer.valueOf(I35.ADD_CARD.ordinal()), false, 2, null);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C7781k(RideConfig rideConfig, TJ4 tj4, User user) {
            super(1);
            this.f35282g = rideConfig;
            this.f35283h = tj4;
            this.f35284i = user;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
            invoke2(bool);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Boolean result) {
            Intrinsics.checkNotNullExpressionValue(result, "result");
            if (result.booleanValue()) {
                Currency m25591o = C45097mS5.m25591o(this.f35282g.getCurrency());
                InterfaceC42586iD1.C23161a.performGooglePaymentRequest$default(this.f35283h.f35251c, this.f35284i, this.f35283h.f35265q, I35.GOOGLE_PAY.ordinal(), m25591o, null, 16, null);
                this.f35283h.f35253e.mo55956N(new GooglePayAuthSheetPresented(m25591o, null, 2, null));
                return;
            }
            H31.C3014a.showDialog$default(this.f35283h.f35267s, C50385vN3.f113971d, true, false, new C7782a(this.f35283h), null, null, null, 116, null);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: TJ4$l */
    /* loaded from: classes2.dex */
    public static final class C7783l extends Lambda implements Function1<Throwable, Unit> {

        @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: TJ4$l$a */
        /* loaded from: classes2.dex */
        public static final class C7784a extends Lambda implements Function0<Unit> {

            /* renamed from: g */
            public final /* synthetic */ TJ4 f35287g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C7784a(TJ4 tj4) {
                super(0);
                this.f35287g = tj4;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2() {
                InterfaceC40099e13.C19924a.goToPayment$default(this.f35287g.f35268t, Integer.valueOf(I35.ADD_CARD.ordinal()), false, 2, null);
            }
        }

        public C7783l() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            C41318g46.m40159e(th);
            H31.C3014a.showDialog$default(TJ4.this.f35267s, C50385vN3.f113971d, true, false, new C7784a(TJ4.this), null, null, null, 116, null);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/RideRequirement;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lco/bird/android/model/RideRequirement;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: TJ4$m */
    /* loaded from: classes2.dex */
    public static final class C7785m extends Lambda implements Function1<RideRequirement, Unit> {
        public C7785m() {
            super(1);
        }

        /* renamed from: a */
        public final void m83825a(RideRequirement it) {
            TJ4 tj4 = TJ4.this;
            Intrinsics.checkNotNullExpressionValue(it, "it");
            tj4.m83877O(it);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(RideRequirement rideRequirement) {
            m83825a(rideRequirement);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/RideRequirement;", "it", "", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/model/RideRequirement;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: TJ4$n */
    /* loaded from: classes2.dex */
    public static final class C7786n extends Lambda implements Function1<RideRequirement, Boolean> {

        /* renamed from: g */
        public static final C7786n f35289g = new C7786n();

        public C7786n() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Boolean invoke(RideRequirement it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Boolean.TRUE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lio/reactivex/disposables/c;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lio/reactivex/disposables/c;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: TJ4$o */
    /* loaded from: classes2.dex */
    public static final class C7787o extends Lambda implements Function1<InterfaceC23465c, Unit> {

        /* renamed from: g */
        public static final C7787o f35290g = new C7787o();

        public C7787o() {
            super(1);
        }

        /* renamed from: a */
        public final void m83823a(InterfaceC23465c interfaceC23465c) {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC23465c interfaceC23465c) {
            m83823a(interfaceC23465c);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lcom/stripe/android/model/Token;", "kotlin.jvm.PlatformType", "token", "", C17296a.f69688o, "(Lcom/stripe/android/model/Token;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nRequirementPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RequirementPresenter.kt\nco/bird/android/app/feature/ride/presenter/RequirementPresenterImpl$onActivityResult$2\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n*L\n1#1,664:1\n218#2:665\n*S KotlinDebug\n*F\n+ 1 RequirementPresenter.kt\nco/bird/android/app/feature/ride/presenter/RequirementPresenterImpl$onActivityResult$2\n*L\n259#1:665\n*E\n"})
    /* renamed from: TJ4$p */
    /* loaded from: classes2.dex */
    public static final class C7788p extends Lambda implements Function1<Token, Unit> {
        public C7788p() {
            super(1);
        }

        /* renamed from: a */
        public final void m83822a(Token token) {
            String str;
            InterfaceC1880Ea interfaceC1880Ea = TJ4.this.f35253e;
            Card card = token.getCard();
            if (card != null) {
                str = ES5.m108971d(card);
            } else {
                str = null;
            }
            interfaceC1880Ea.mo55956N(new PaymentMethodAdded(str));
            TJ4.this.f35249a.mo101238b();
            Object m32048b = TJ4.this.m83883I().m32048b(AutoDispose.m45239a(TJ4.this.f35266r));
            Intrinsics.checkExpressionValueIsNotNull(m32048b, "this.`as`(AutoDispose.autoDisposable(provider))");
            ((MaybeSubscribeProxy) m32048b).subscribe();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Token token) {
            m83822a(token);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: TJ4$q */
    /* loaded from: classes2.dex */
    public static final class C7789q extends Lambda implements Function1<Throwable, Unit> {
        public C7789q() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            C41318g46.m40159e(th);
            TJ4.this.f35267s.error(C45871nl4.error_generic_body);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"Lco/bird/android/model/RideStateEvent;", "event", "", C17296a.f69688o, "(Lco/bird/android/model/RideStateEvent;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: TJ4$r */
    /* loaded from: classes2.dex */
    public static final class C7790r extends Lambda implements Function1<RideStateEvent, Boolean> {

        /* renamed from: g */
        public static final C7790r f35293g = new C7790r();

        public C7790r() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Boolean invoke(RideStateEvent event) {
            boolean z;
            Intrinsics.checkNotNullParameter(event, "event");
            if (event.getEvent() == RideState.Status.STARTED) {
                z = true;
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/RideStateEvent;", "t1", "t2", "", C17296a.f69688o, "(Lco/bird/android/model/RideStateEvent;Lco/bird/android/model/RideStateEvent;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: TJ4$s */
    /* loaded from: classes2.dex */
    public static final class C7791s extends Lambda implements Function2<RideStateEvent, RideStateEvent, Boolean> {

        /* renamed from: g */
        public static final C7791s f35294g = new C7791s();

        public C7791s() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a */
        public final Boolean invoke(RideStateEvent t1, RideStateEvent t2) {
            Intrinsics.checkNotNullParameter(t1, "t1");
            Intrinsics.checkNotNullParameter(t2, "t2");
            return Boolean.valueOf(Intrinsics.areEqual(t1.getRideState().getRide().getId(), t2.getRideState().getRide().getId()));
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/RideStateEvent;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lco/bird/android/model/RideStateEvent;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: TJ4$t */
    /* loaded from: classes2.dex */
    public static final class C7792t extends Lambda implements Function1<RideStateEvent, Unit> {
        public C7792t() {
            super(1);
        }

        /* renamed from: a */
        public final void m83819a(RideStateEvent rideStateEvent) {
            TJ4.this.f35249a.mo101232h(rideStateEvent.getRideState().getRide());
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(RideStateEvent rideStateEvent) {
            m83819a(rideStateEvent);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/Integer;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: TJ4$u */
    /* loaded from: classes2.dex */
    public static final class C7793u extends Lambda implements Function1<Integer, Unit> {
        public C7793u() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
            invoke2(num);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Integer num) {
            C41318g46.m40163a("clearing current ride requirement request context based off " + num, new Object[0]);
            TJ4.this.f35249a.mo101229k();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: TJ4$v */
    /* loaded from: classes2.dex */
    public static final class C7794v extends Lambda implements Function1<Throwable, Unit> {

        /* renamed from: g */
        public static final C7794v f35297g = new C7794v();

        public C7794v() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            C41318g46.m40158f(th, "Error attempting to aggressively check for rider agreements to redirect to now", new Object[0]);
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: TJ4$w */
    /* loaded from: classes2.dex */
    public static final class C7795w extends Lambda implements Function0<Unit> {
        public C7795w() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            TJ4.this.f35268t.mo37051b0();
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: TJ4$x */
    /* loaded from: classes2.dex */
    public static final class C7796x extends Lambda implements Function0<Unit> {
        public C7796x() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            InterfaceC40099e13.C19924a.goToPayment$default(TJ4.this.f35268t, null, false, 3, null);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0007"}, m28432d2 = {"TJ4$y", "LCQ3;", "Lco/bird/android/model/constant/Permission;", "permission", "", C17296a.f69688o, "b", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: TJ4$y */
    /* loaded from: classes2.dex */
    public static final class C7797y implements CQ3 {

        /* renamed from: a */
        public final /* synthetic */ Function0<Unit> f35300a;

        public C7797y(Function0<Unit> function0) {
            this.f35300a = function0;
        }

        @Override // p000.CQ3
        /* renamed from: a */
        public void mo19266a(Permission permission) {
            Intrinsics.checkNotNullParameter(permission, "permission");
            this.f35300a.invoke();
        }

        @Override // p000.CQ3
        /* renamed from: b */
        public void mo19265b(Permission permission) {
            Intrinsics.checkNotNullParameter(permission, "permission");
            C41318g46.m40151m("User denied camera permission!", new Object[0]);
        }
    }

    public TJ4(J35 requirementManager, C22454gl preference, InterfaceC42586iD1 googlePayManager, InterfaceC32604Eg1 eventBus, InterfaceC1880Ea analyticsManager, C36207Tq4 reactiveConfig, YR4 rideManager, InterfaceC6097Oh appBuildConfig, InterfaceC44647lh6 userManager, InterfaceC46893pU4 rideMapStateManager, InterfaceC44637lg6 agreementManager, InterfaceC52757zN3 paymentMethodManager, VM3 paymentManagerV3, InterfaceC45102mT1 identificationManager, InterfaceC44791lw0 configurableTutorialManager, DQ3 permissionManager, BaseActivity activity, ScopeProvider scopeProvider, AB1 ui, InterfaceC40099e13 navigator) {
        Intrinsics.checkNotNullParameter(requirementManager, "requirementManager");
        Intrinsics.checkNotNullParameter(preference, "preference");
        Intrinsics.checkNotNullParameter(googlePayManager, "googlePayManager");
        Intrinsics.checkNotNullParameter(eventBus, "eventBus");
        Intrinsics.checkNotNullParameter(analyticsManager, "analyticsManager");
        Intrinsics.checkNotNullParameter(reactiveConfig, "reactiveConfig");
        Intrinsics.checkNotNullParameter(rideManager, "rideManager");
        Intrinsics.checkNotNullParameter(appBuildConfig, "appBuildConfig");
        Intrinsics.checkNotNullParameter(userManager, "userManager");
        Intrinsics.checkNotNullParameter(rideMapStateManager, "rideMapStateManager");
        Intrinsics.checkNotNullParameter(agreementManager, "agreementManager");
        Intrinsics.checkNotNullParameter(paymentMethodManager, "paymentMethodManager");
        Intrinsics.checkNotNullParameter(paymentManagerV3, "paymentManagerV3");
        Intrinsics.checkNotNullParameter(identificationManager, "identificationManager");
        Intrinsics.checkNotNullParameter(configurableTutorialManager, "configurableTutorialManager");
        Intrinsics.checkNotNullParameter(permissionManager, "permissionManager");
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(scopeProvider, "scopeProvider");
        Intrinsics.checkNotNullParameter(ui, "ui");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        this.f35249a = requirementManager;
        this.f35250b = preference;
        this.f35251c = googlePayManager;
        this.f35252d = eventBus;
        this.f35253e = analyticsManager;
        this.f35254f = reactiveConfig;
        this.f35255g = rideManager;
        this.f35256h = appBuildConfig;
        this.f35257i = userManager;
        this.f35258j = rideMapStateManager;
        this.f35259k = agreementManager;
        this.f35260l = paymentMethodManager;
        this.f35261m = paymentManagerV3;
        this.f35262n = identificationManager;
        this.f35263o = configurableTutorialManager;
        this.f35264p = permissionManager;
        this.f35265q = activity;
        this.f35266r = scopeProvider;
        this.f35267s = ui;
        this.f35268t = navigator;
        C45168ma4<J35.C3879a> m25409g = C45168ma4.m25409g();
        Intrinsics.checkNotNullExpressionValue(m25409g, "create()");
        this.f35269u = m25409g;
    }

    /* renamed from: J */
    public static final void m83882J() {
        C41318g46.m40163a("disposing checkRequirementsInternal() stream", new Object[0]);
    }

    /* renamed from: K */
    public static final void m83881K() {
        C41318g46.m40163a("terminated checkRequirementsInternal() stream", new Object[0]);
    }

    /* renamed from: L */
    public static final void m83880L(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: M */
    public static final void m83879M(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: N */
    public static final void m83878N(TJ4 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        J35.C3879a mo101233g = this$0.f35249a.mo101233g();
        C41318g46.m40163a("checkRequirementsInternal() met requirements for " + mo101233g, new Object[0]);
        J35.C3879a mo101233g2 = this$0.f35249a.mo101233g();
        if (mo101233g2 == null) {
            mo101233g2 = new J35.C3879a(RideRequirementReason.UNKNOWN, null, null, false, false, null, 62, null);
            C41318g46.m40160d("Encountered a null ride requirement request context object while observing ride start requirements. This should never happen!!", new Object[0]);
        }
        this$0.f35269u.accept(mo101233g2);
        this$0.f35249a.mo101229k();
        this$0.f35250b.m37569t2();
    }

    /* renamed from: P */
    public static final void m83876P(C41553gU1 bottomSheet) {
        DialogC17707a dialogC17707a;
        BottomSheetBehavior<FrameLayout> bottomSheetBehavior;
        DialogC17707a dialogC17707a2;
        Intrinsics.checkNotNullParameter(bottomSheet, "$bottomSheet");
        Dialog dialog = bottomSheet.getDialog();
        BottomSheetBehavior<FrameLayout> bottomSheetBehavior2 = null;
        if (dialog instanceof DialogC17707a) {
            dialogC17707a = (DialogC17707a) dialog;
        } else {
            dialogC17707a = null;
        }
        if (dialogC17707a != null) {
            bottomSheetBehavior = dialogC17707a.getBehavior();
        } else {
            bottomSheetBehavior = null;
        }
        if (bottomSheetBehavior != null) {
            bottomSheetBehavior.m50082p0(3);
        }
        Dialog dialog2 = bottomSheet.getDialog();
        if (dialog2 instanceof DialogC17707a) {
            dialogC17707a2 = (DialogC17707a) dialog2;
        } else {
            dialogC17707a2 = null;
        }
        if (dialogC17707a2 != null) {
            bottomSheetBehavior2 = dialogC17707a2.getBehavior();
        }
        if (bottomSheetBehavior2 != null) {
            bottomSheetBehavior2.m50092k0(Resources.getSystem().getDisplayMetrics().heightPixels);
        }
    }

    /* renamed from: Q */
    public static final Pair m83875Q(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (Pair) tmp0.invoke(obj);
    }

    /* renamed from: R */
    public static final void m83874R(C41553gU1 bottomSheet) {
        Intrinsics.checkNotNullParameter(bottomSheet, "$bottomSheet");
        bottomSheet.dismiss();
    }

    /* renamed from: S */
    public static final void m83873S(C41553gU1 bottomSheet) {
        Intrinsics.checkNotNullParameter(bottomSheet, "$bottomSheet");
        bottomSheet.dismiss();
    }

    /* renamed from: T */
    public static final InterfaceC24574u m83872T(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC24574u) tmp0.invoke(obj);
    }

    /* renamed from: W */
    public static final void m83869W(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: X */
    public static final void m83868X(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: Y */
    public static final void m83867Y(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: Z */
    public static final Boolean m83866Z(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (Boolean) tmp0.invoke(obj);
    }

    /* renamed from: a0 */
    public static final Unit m83865a0(TJ4 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.f35249a.mo101234f(new J35.C3879a(RideRequirementReason.ONE_OFF, null, null, false, false, null, 56, null));
        return Unit.INSTANCE;
    }

    /* renamed from: b0 */
    public static final InterfaceC24574u m83864b0(TJ4 this$0, RideRequirement rideRequirement) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(rideRequirement, "$rideRequirement");
        return this$0.f35249a.mo101230j(rideRequirement);
    }

    /* renamed from: c0 */
    public static final void m83863c0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: d0 */
    public static final void m83862d0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: e0 */
    public static final void m83861e0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: f0 */
    public static final void m83860f0() {
    }

    public static /* synthetic */ void getRequirementsMet$app_birdRelease$annotations() {
    }

    /* renamed from: h0 */
    public static final boolean m83858h0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return ((Boolean) tmp0.invoke(obj)).booleanValue();
    }

    /* renamed from: i0 */
    public static final boolean m83856i0(Function2 tmp0, Object obj, Object obj2) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return ((Boolean) tmp0.invoke(obj, obj2)).booleanValue();
    }

    /* renamed from: j0 */
    public static final void m83854j0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: k0 */
    public static final void m83852k0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: l0 */
    public static final void m83850l0(TJ4 this$0, WireBird wireBird) {
        String str;
        List<Agreement> list;
        List listOf;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Map<AgreementKey, List<Agreement>> value = this$0.f35259k.mo2957d().getValue();
        AgreementRole agreementRole = AgreementRole.RIDER;
        String str2 = null;
        if (wireBird != null) {
            str = wireBird.getPartnerId();
        } else {
            str = null;
        }
        boolean z = false;
        if (value.get(new AgreementKey(agreementRole, str, null)) != null && (!list.isEmpty())) {
            z = true;
        }
        if (z) {
            InterfaceC40099e13 interfaceC40099e13 = this$0.f35268t;
            listOf = CollectionsKt__CollectionsJVMKt.listOf(agreementRole);
            if (wireBird != null) {
                str2 = wireBird.getPartnerId();
            }
            InterfaceC40099e13.C19924a.goToRentalAgreement$default(interfaceC40099e13, listOf, str2, null, true, null, 16, null);
        }
    }

    /* renamed from: m0 */
    public static final void m83848m0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: I */
    public final AbstractC24507p<RideRequirement> m83883I() {
        RideRequirementReason rideRequirementReason;
        J35.C3879a mo101233g = this.f35249a.mo101233g();
        if (mo101233g != null) {
            rideRequirementReason = mo101233g.m101226c();
        } else {
            rideRequirementReason = null;
        }
        if (rideRequirementReason == RideRequirementReason.ONE_OFF) {
            C41318g46.m40163a("checkRequirementsInternal called but we were in a one_off request state, not performing any further checks", new Object[0]);
            AbstractC24507p<RideRequirement> m32024u = AbstractC24507p.m32024u();
            Intrinsics.checkNotNullExpressionValue(m32024u, "empty()");
            return m32024u;
        }
        C41318g46.m40163a("checkRequirementsInternal starting rideStart check now", new Object[0]);
        AbstractC24507p<RideRequirement> m32025t = this.f35249a.mo101231i().m32066I(C23454a.m33087a()).m32030o(new InterfaceC23478a() { // from class: tJ4
            @Override // io.reactivex.functions.InterfaceC23478a
            public final void run() {
                TJ4.m83882J();
            }
        }).m32025t(new InterfaceC23478a() { // from class: EJ4
            @Override // io.reactivex.functions.InterfaceC23478a
            public final void run() {
                TJ4.m83881K();
            }
        });
        final C7770b c7770b = new C7770b();
        AbstractC24507p<RideRequirement> m32026s = m32025t.m32026s(new InterfaceC23484g() { // from class: LJ4
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                TJ4.m83880L(Function1.this, obj);
            }
        });
        final C7771c c7771c = new C7771c();
        AbstractC24507p<RideRequirement> m32031n = m32026s.m32029p(new InterfaceC23484g() { // from class: MJ4
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                TJ4.m83879M(Function1.this, obj);
            }
        }).m32031n(new InterfaceC23478a() { // from class: NJ4
            @Override // io.reactivex.functions.InterfaceC23478a
            public final void run() {
                TJ4.m83878N(TJ4.this);
            }
        });
        Intrinsics.checkNotNullExpressionValue(m32031n, "private fun checkRequire…ngCompleted()\n      }\n  }");
        return m32031n;
    }

    /* renamed from: O */
    public final void m83877O(RideRequirement rideRequirement) {
        TaxInformationSource taxInformationSource;
        String str;
        WireBird m101227b;
        Intrinsics.checkNotNullParameter(rideRequirement, "<this>");
        String str2 = null;
        if (rideRequirement instanceof RideRequirement.Payment) {
            if (this.f35254f.m82623f8().m73665a().getPaymentConfig().getOnboardingQuickPayment()) {
                this.f35268t.mo36924w1(Integer.valueOf(I35.ADD_CARD.ordinal()));
            } else {
                InterfaceC40099e13.C19924a.goToPayment$default(this.f35268t, Integer.valueOf(I35.ADD_CARD.ordinal()), false, 2, null);
            }
        } else if (rideRequirement instanceof RideRequirement.RentalAgreement) {
            InterfaceC40099e13 interfaceC40099e13 = this.f35268t;
            List<AgreementRole> requiredAgreements = ((RideRequirement.RentalAgreement) rideRequirement).getRequiredAgreements();
            J35.C3879a mo101233g = this.f35249a.mo101233g();
            if (mo101233g != null && (m101227b = mo101233g.m101227b()) != null) {
                str = m101227b.getPartnerId();
            } else {
                str = null;
            }
            J35.C3879a mo101233g2 = this.f35249a.mo101233g();
            if (mo101233g2 != null) {
                str2 = mo101233g2.m101222g();
            }
            InterfaceC40099e13.C19924a.goToRentalAgreement$default(interfaceC40099e13, requiredAgreements, str, str2, false, Integer.valueOf(I35.AGREEMENTS.ordinal()), 8, null);
        } else if (rideRequirement instanceof RideRequirement.AutoPay) {
            this.f35268t.mo36959q2();
        } else if (rideRequirement instanceof RideRequirement.AutoPayV2) {
            RideRequirement.AutoPayV2 autoPayV2 = (RideRequirement.AutoPayV2) rideRequirement;
            this.f35268t.mo37102R0(autoPayV2.getConfig(), autoPayV2.getBalance(), autoPayV2.getDefaultBirdPayment(), I35.AUTO_PAY_V2.ordinal());
        } else if (rideRequirement instanceof RideRequirement.GooglePay) {
            RideRequirement.GooglePay googlePay = (RideRequirement.GooglePay) rideRequirement;
            m83870V(googlePay.getUser(), googlePay.getConfig());
        } else if (rideRequirement instanceof RideRequirement.TaxInformationRequirement) {
            boolean enableSettingsButton = this.f35254f.m82623f8().m73665a().getTaxInformationConfig().getEnableSettingsButton();
            boolean areEqual = Intrinsics.areEqual(this.f35254f.m82623f8().m73665a().getTaxInformationConfig().getEnableCompliantReceipts(), Boolean.TRUE);
            if (areEqual && enableSettingsButton) {
                taxInformationSource = TaxInformationSource.COMPLAINT_RECEIPTS_AND_TAX_ENABLED_MARKET;
            } else if (areEqual) {
                taxInformationSource = TaxInformationSource.COMPLAINT_RECEIPTS_ONLY;
            } else {
                taxInformationSource = TaxInformationSource.SETTINGS;
            }
            this.f35268t.mo37066Y1(taxInformationSource);
        } else if (rideRequirement instanceof RideRequirement.DirectManualEntryIdentification) {
            RideRequirement.DirectManualEntryIdentification directManualEntryIdentification = (RideRequirement.DirectManualEntryIdentification) rideRequirement;
            final C41553gU1 m39289a = C41553gU1.f82284h.m39289a(directManualEntryIdentification.getAcceptableManualEntry(), directManualEntryIdentification.getHasMoreAcceptableMethods());
            m39289a.show(this.f35265q.getSupportFragmentManager(), "ManualEntryFormBottomSheet");
            AbstractC23461c m33070P = AbstractC23461c.m33057c0(100L, TimeUnit.MILLISECONDS).m33070P(C23454a.m33087a());
            Intrinsics.checkNotNullExpressionValue(m33070P, "timer(100, TimeUnit.MILL…dSchedulers.mainThread())");
            Object m33041n = m33070P.m33041n(AutoDispose.m45239a(this.f35266r));
            Intrinsics.checkExpressionValueIsNotNull(m33041n, "this.`as`(AutoDispose.au…isposable<Any>(provider))");
            ((CompletableSubscribeProxy) m33041n).mo45218b(new InterfaceC23478a() { // from class: DJ4
                @Override // io.reactivex.functions.InterfaceC23478a
                public final void run() {
                    TJ4.m83876P(C41553gU1.this);
                }
            });
            Observable<Optional<IdentificationManualEntryFormData>> m39353Da = m39289a.m39353Da();
            final C7773e c7773e = new C7773e(m39289a);
            Observable doOnComplete = m39353Da.map(new InterfaceC23492o() { // from class: FJ4
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj) {
                    Pair m83875Q;
                    m83875Q = TJ4.m83875Q(Function1.this, obj);
                    return m83875Q;
                }
            }).doOnDispose(new InterfaceC23478a() { // from class: GJ4
                @Override // io.reactivex.functions.InterfaceC23478a
                public final void run() {
                    TJ4.m83874R(C41553gU1.this);
                }
            }).doOnComplete(new InterfaceC23478a() { // from class: HJ4
                @Override // io.reactivex.functions.InterfaceC23478a
                public final void run() {
                    TJ4.m83873S(C41553gU1.this);
                }
            });
            final C7774f c7774f = new C7774f();
            Observable flatMapMaybe = doOnComplete.flatMapMaybe(new InterfaceC23492o() { // from class: IJ4
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj) {
                    InterfaceC24574u m83872T;
                    m83872T = TJ4.m83872T(Function1.this, obj);
                    return m83872T;
                }
            });
            Intrinsics.checkNotNullExpressionValue(flatMapMaybe, "internal fun RideRequire…    else -> { }\n    }\n  }");
            Object m33094as = flatMapMaybe.m33094as(AutoDispose.m45239a(this.f35266r));
            Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
            ((ObservableSubscribeProxy) m33094as).subscribe();
        } else if (rideRequirement instanceof RideRequirement.ScanDriverLicenseWithIdentification) {
            m83844o0(new C7777g());
        } else if (rideRequirement instanceof RideRequirement.SelectIdentificationMethod) {
            m83844o0(new C7778h());
        } else if (rideRequirement instanceof RideRequirement.PendingIdentificationCheck) {
            this.f35268t.mo37009i0(I35.ID_SELECTION.ordinal());
        } else if (rideRequirement instanceof RideRequirement.IdentificationScanRequiresAppUpgrade) {
            H31.C3014a.showDialog$default(this.f35267s, C27986rl.f107565d, false, true, new C7779i(), C7780j.f35281g, null, null, 96, null);
            m83844o0(new C7772d());
        } else if (rideRequirement instanceof RideRequirement.LeaseBasedHelmetPrompt) {
            this.f35268t.mo36986m(((RideRequirement.LeaseBasedHelmetPrompt) rideRequirement).getBird(), I35.HELMET_LEASE_PROMPT.ordinal());
        } else if (rideRequirement instanceof RideRequirement.HelmetSelfieConfirmation) {
            InterfaceC40099e13.C19924a.goToHelmetSelfieConfirmation$default(this.f35268t, ((RideRequirement.HelmetSelfieConfirmation) rideRequirement).getBird(), I35.HELMET_SELFIE_CONFIRMATION.ordinal(), null, null, false, 28, null);
        } else if (rideRequirement instanceof RideRequirement.Quiz) {
            if (!InterfaceC44791lw0.C25816a.maybeGoToConfigurableTutorials$default(this.f35263o, this.f35268t, ConfigurableTutorialContext.QUIZ, null, false, Integer.valueOf(I35.QUIZ.ordinal()), false, 12, null)) {
                Object m32048b = m83883I().m32048b(AutoDispose.m45239a(this.f35266r));
                Intrinsics.checkExpressionValueIsNotNull(m32048b, "this.`as`(AutoDispose.autoDisposable(provider))");
                ((MaybeSubscribeProxy) m32048b).subscribe();
            }
        } else if (rideRequirement instanceof RideRequirement.SoberStart) {
            this.f35268t.mo36997k0(((RideRequirement.SoberStart) rideRequirement).getBird().getId(), I35.SOBER_START.ordinal());
        } else if (rideRequirement instanceof RideRequirement.RiderHomeAreaPrompt) {
            this.f35268t.mo36984m1(Integer.valueOf(I35.LOCALS_SURVEY.ordinal()));
        } else if (rideRequirement instanceof RideRequirement.FlockTogether) {
            this.f35268t.mo37085U2(Integer.valueOf(I35.FLOCK_TOGETHER.ordinal()));
        } else if (rideRequirement instanceof RideRequirement.PreloadV2) {
            boolean z = true;
            if (C7769a.$EnumSwitchMapping$0[this.f35261m.mo25729m().ordinal()] == 1) {
                this.f35268t.mo37006i3(Integer.valueOf(I35.PRELOAD_V2.ordinal()));
                return;
            }
            if (this.f35250b.m37562v1() <= 0) {
                z = false;
            }
            if (z) {
                this.f35268t.mo36953r2(false, ((RideRequirement.PreloadV2) rideRequirement).getDisplayAutoReload(), Integer.valueOf(I35.PRELOAD_V2.ordinal()), "onboarding");
            } else {
                this.f35268t.mo36952r3(Integer.valueOf(I35.PRELOAD_V2.ordinal()));
            }
        } else {
            boolean z2 = rideRequirement instanceof RideRequirement.Cancel;
        }
    }

    /* renamed from: U */
    public final void m83871U(InterfaceC40099e13 interfaceC40099e13) {
        InterfaceC40099e13.C19924a.goToDriverLicenseScanV2$default(interfaceC40099e13, null, Integer.valueOf(I35.DRIVER_LICENSE_SCAN_V2.ordinal()), 1, null);
    }

    /* renamed from: V */
    public final void m83870V(User user, RideConfig rideConfig) {
        Object m33135e = this.f35251c.mo16237g().m33135e(AutoDispose.m45239a(this.f35266r));
        Intrinsics.checkExpressionValueIsNotNull(m33135e, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C7781k c7781k = new C7781k(rideConfig, this, user);
        InterfaceC23484g interfaceC23484g = new InterfaceC23484g() { // from class: JJ4
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                TJ4.m83869W(Function1.this, obj);
            }
        };
        final C7783l c7783l = new C7783l();
        ((SingleSubscribeProxy) m33135e).subscribe(interfaceC23484g, new InterfaceC23484g() { // from class: KJ4
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                TJ4.m83868X(Function1.this, obj);
            }
        });
    }

    @Override // p000.InterfaceC48572sJ4
    /* renamed from: a */
    public void mo14404a(WireBird wireBird, RideRequirementReason requirementReason, String str) {
        Intrinsics.checkNotNullParameter(requirementReason, "requirementReason");
        this.f35249a.mo101234f(new J35.C3879a(requirementReason, wireBird, str, false, false, null, 56, null));
        Object m32048b = m83883I().m32048b(AutoDispose.m45239a(this.f35266r));
        Intrinsics.checkExpressionValueIsNotNull(m32048b, "this.`as`(AutoDispose.autoDisposable(provider))");
        ((MaybeSubscribeProxy) m32048b).subscribe();
    }

    @Override // p000.InterfaceC48572sJ4
    /* renamed from: b */
    public void mo14403b(RideRequirement rideRequirement) {
        Intrinsics.checkNotNullParameter(rideRequirement, "rideRequirement");
        this.f35249a.mo101234f(new J35.C3879a(RideRequirementReason.ONE_OFF, null, null, false, false, null, 56, null));
        m83877O(rideRequirement);
    }

    @Override // p000.InterfaceC48572sJ4
    /* renamed from: c */
    public boolean mo14402c() {
        RideRequirementReason m101226c;
        List listOf;
        J35.C3879a mo101233g = this.f35249a.mo101233g();
        if (mo101233g != null && (m101226c = mo101233g.m101226c()) != null) {
            listOf = CollectionsKt__CollectionsKt.listOf((Object[]) new RideRequirementReason[]{RideRequirementReason.ONBOARDING_BANNER, RideRequirementReason.RIDE, RideRequirementReason.RESERVATION, RideRequirementReason.SCAN});
            if (!C10733aZ.m71221a(m101226c, listOf)) {
                return false;
            }
            return true;
        }
        return false;
    }

    @Override // p000.InterfaceC48572sJ4
    /* renamed from: d */
    public AbstractC24507p<RideRequirement> mo14401d(final RideRequirement rideRequirement) {
        Intrinsics.checkNotNullParameter(rideRequirement, "rideRequirement");
        AbstractC24507p<RideRequirement> m33045k = AbstractC23461c.m33078H(new Callable() { // from class: vJ4
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Unit m83865a0;
                m83865a0 = TJ4.m83865a0(TJ4.this);
                return m83865a0;
            }
        }).m33045k(AbstractC24507p.m32034k(new Callable() { // from class: wJ4
            @Override // java.util.concurrent.Callable
            public final Object call() {
                InterfaceC24574u m83864b0;
                m83864b0 = TJ4.m83864b0(TJ4.this, rideRequirement);
                return m83864b0;
            }
        }));
        Intrinsics.checkNotNullExpressionValue(m33045k, "fromCallable {\n      req…rideRequirement)\n      })");
        return m33045k;
    }

    @Override // p000.InterfaceC48572sJ4
    /* renamed from: e */
    public Observable<J35.C3879a> mo14400e() {
        Observable<J35.C3879a> hide = this.f35269u.hide();
        Intrinsics.checkNotNullExpressionValue(hide, "requirementsMet.hide()");
        return hide;
    }

    @Override // p000.InterfaceC48572sJ4
    /* renamed from: f */
    public AbstractC24507p<RideRequirement> mo14399f(WireBird wireBird, RideRequirementReason requirementReason, String str) {
        Intrinsics.checkNotNullParameter(requirementReason, "requirementReason");
        this.f35249a.mo101234f(new J35.C3879a(requirementReason, wireBird, str, false, false, null, 56, null));
        return m83883I();
    }

    @Override // p000.InterfaceC48572sJ4
    /* renamed from: g */
    public AbstractC23442F<Boolean> mo14398g(RideRequirement rideRequirement) {
        Intrinsics.checkNotNullParameter(rideRequirement, "rideRequirement");
        AbstractC24507p<RideRequirement> m32066I = mo14401d(rideRequirement).m32066I(C23454a.m33087a());
        final C7785m c7785m = new C7785m();
        AbstractC24507p<RideRequirement> m32026s = m32066I.m32026s(new InterfaceC23484g() { // from class: BJ4
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                TJ4.m83867Y(Function1.this, obj);
            }
        });
        final C7786n c7786n = C7786n.f35289g;
        AbstractC23442F<Boolean> m32043e0 = m32026s.m32067H(new InterfaceC23492o() { // from class: CJ4
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                Boolean m83866Z;
                m83866Z = TJ4.m83866Z(Function1.this, obj);
                return m83866Z;
            }
        }).m32035j(Boolean.FALSE).m32043e0();
        Intrinsics.checkNotNullExpressionValue(m32043e0, "override fun goToRideReq…se)\n      .toSingle()\n  }");
        return m32043e0;
    }

    /* renamed from: g0 */
    public void m83859g0() {
        final WireBird wireBird;
        WireRide ride;
        this.f35252d.mo104917a(this);
        Observable<RideStateEvent> mo75058Q = this.f35255g.mo75058Q();
        final C7790r c7790r = C7790r.f35293g;
        Observable<RideStateEvent> filter = mo75058Q.filter(new InterfaceC23494q() { // from class: OJ4
            @Override // io.reactivex.functions.InterfaceC23494q
            public final boolean test(Object obj) {
                boolean m83858h0;
                m83858h0 = TJ4.m83858h0(Function1.this, obj);
                return m83858h0;
            }
        });
        final C7791s c7791s = C7791s.f35294g;
        Observable<RideStateEvent> distinctUntilChanged = filter.distinctUntilChanged(new InterfaceC23481d() { // from class: PJ4
            @Override // io.reactivex.functions.InterfaceC23481d
            public final boolean test(Object obj, Object obj2) {
                boolean m83856i0;
                m83856i0 = TJ4.m83856i0(Function2.this, obj, obj2);
                return m83856i0;
            }
        });
        Intrinsics.checkNotNullExpressionValue(distinctUntilChanged, "rideManager.rideStateEve…== t2.rideState.ride.id }");
        Object m33094as = distinctUntilChanged.m33094as(AutoDispose.m45239a(this.f35266r));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C7792t c7792t = new C7792t();
        ((ObservableSubscribeProxy) m33094as).subscribe(new InterfaceC23484g() { // from class: QJ4
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                TJ4.m83854j0(Function1.this, obj);
            }
        });
        Object m33094as2 = this.f35255g.mo75028t0().m33094as(AutoDispose.m45239a(this.f35266r));
        Intrinsics.checkExpressionValueIsNotNull(m33094as2, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C7793u c7793u = new C7793u();
        ((ObservableSubscribeProxy) m33094as2).subscribe(new InterfaceC23484g() { // from class: RJ4
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                TJ4.m83852k0(Function1.this, obj);
            }
        });
        RideState m59035e = this.f35255g.mo75034m0().m73665a().m59035e();
        String str = null;
        if (m59035e != null && (ride = m59035e.getRide()) != null) {
            wireBird = ride.getBird();
        } else {
            wireBird = null;
        }
        if (C36441Uq4.m80769c(this.f35254f, wireBird).getAggressiveRiderAgreements()) {
            InterfaceC44637lg6 interfaceC44637lg6 = this.f35259k;
            AgreementRole[] agreementRoleArr = {AgreementRole.RIDER};
            if (wireBird != null) {
                str = wireBird.getPartnerId();
            }
            AbstractC23461c m33069Q = InterfaceC44637lg6.C25760a.refreshAgreements$default(interfaceC44637lg6, agreementRoleArr, str, null, 4, null).m32069F().m33065U(3L).m33069Q();
            Intrinsics.checkNotNullExpressionValue(m33069Q, "agreementManager.refresh…       .onErrorComplete()");
            Object m33041n = m33069Q.m33041n(AutoDispose.m45239a(this.f35266r));
            Intrinsics.checkExpressionValueIsNotNull(m33041n, "this.`as`(AutoDispose.au…isposable<Any>(provider))");
            InterfaceC23478a interfaceC23478a = new InterfaceC23478a() { // from class: SJ4
                @Override // io.reactivex.functions.InterfaceC23478a
                public final void run() {
                    TJ4.m83850l0(TJ4.this, wireBird);
                }
            };
            final C7794v c7794v = C7794v.f35297g;
            ((CompletableSubscribeProxy) m33041n).mo45217e(interfaceC23478a, new InterfaceC23484g() { // from class: uJ4
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj) {
                    TJ4.m83848m0(Function1.this, obj);
                }
            });
        }
    }

    @Override // p000.InterfaceC48572sJ4
    /* renamed from: h */
    public AbstractC24507p<RideRequirement> mo14397h() {
        this.f35249a.mo101234f(new J35.C3879a(RideRequirementReason.BIRD_AGNOSTIC, null, null, false, false, null, 56, null));
        return this.f35249a.mo101231i();
    }

    /* renamed from: n0 */
    public final void m83846n0(Throwable th) {
        C49375tg1 c49375tg1;
        if (th instanceof RideRequirementTimeoutException) {
            H31.C3014a.showBirdDialog$default(this.f35267s, C50022ul5.f112880d, false, false, null, null, null, null, 126, null);
            return;
        }
        boolean z = true;
        if (th instanceof BluetoothException) {
            H31.C3014a.showDialog$default(this.f35267s, C24920jX.alertDialog$default((BluetoothException) th, null, 1, null), false, false, null, null, null, null, 126, null);
        } else if (th instanceof LocationDisabledException) {
            H31.C3014a.showDialog$default(this.f35267s, C36718Vv2.f39987d, false, false, new C7795w(), null, null, null, 118, null);
        } else if (th instanceof RetrofitException) {
            if (((RetrofitException) th).m53928b() == RetrofitException.EnumC16708a.HTTP) {
                try {
                    c49375tg1 = (C49375tg1) ((RetrofitException) th).m53929a(C49375tg1.class);
                } catch (Exception unused) {
                    String string = this.f35265q.getString(C45871nl4.error_500);
                    Intrinsics.checkNotNullExpressionValue(string, "activity.getString(L.string.error_500)");
                    c49375tg1 = new C49375tg1(500, string, null, null, 12, null);
                }
                if (c49375tg1.m11933b() == 402) {
                    H31.C3014a.showDialog$default(this.f35267s, C50385vN3.f113971d, true, false, new C7796x(), null, null, null, 116, null);
                    return;
                } else if (c49375tg1.m11933b() == 409) {
                    H31.C3014a.showDialog$default(this.f35267s, C30178xT.f117636d, false, false, null, null, null, null, 126, null);
                    return;
                } else {
                    int m11933b = c49375tg1.m11933b();
                    if (400 > m11933b || m11933b >= 499) {
                        z = false;
                    }
                    if (z) {
                        H31.C3014a.showDialog$default(this.f35267s, this.f35265q.getString(C45871nl4.ride_continue_dialog_no), c49375tg1.m11932c(), null, null, false, false, null, null, null, 508, null);
                        return;
                    } else {
                        this.f35267s.error(th);
                        return;
                    }
                }
            }
            this.f35267s.error(th);
        } else {
            this.f35267s.error(th.getMessage());
        }
    }

    /* renamed from: o0 */
    public final void m83844o0(Function0<Unit> function0) {
        DQ3.request$default(this.f35264p, Permission.CAMERA, new C7797y(function0), null, 4, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v10 */
    /* JADX WARN: Type inference failed for: r15v13 */
    /* JADX WARN: Type inference failed for: r15v14 */
    /* JADX WARN: Type inference failed for: r15v16 */
    /* JADX WARN: Type inference failed for: r15v17 */
    /* JADX WARN: Type inference failed for: r15v20 */
    /* JADX WARN: Type inference failed for: r15v21 */
    /* JADX WARN: Type inference failed for: r15v24 */
    /* JADX WARN: Type inference failed for: r15v25 */
    /* JADX WARN: Type inference failed for: r15v28 */
    /* JADX WARN: Type inference failed for: r15v29 */
    /* JADX WARN: Type inference failed for: r15v33 */
    /* JADX WARN: Type inference failed for: r15v34 */
    /* JADX WARN: Type inference failed for: r15v35 */
    /* JADX WARN: Type inference failed for: r15v36 */
    /* JADX WARN: Type inference failed for: r15v37 */
    /* JADX WARN: Type inference failed for: r15v38 */
    /* JADX WARN: Type inference failed for: r15v9 */
    @Override // p000.InterfaceC48572sJ4
    public void onActivityResult(int i, int i2, Intent intent) {
        ?? r15;
        ?? r152;
        ?? r153;
        ?? r154;
        ?? r155;
        ?? r156;
        boolean z = false;
        C41318g46.m40163a("onActivityResult requestCode=" + i + ", resultCode=" + i2 + ", data=" + intent, new Object[0]);
        if (i == I35.DRIVER_LICENSE_SCAN_V2.ordinal()) {
            if (intent != null) {
                z = intent.getBooleanExtra("skipped_barcode_scan", false);
            }
            if (z && i2 == -1) {
                this.f35249a.mo101239a();
                Object m32048b = m83883I().m32048b(AutoDispose.m45239a(this.f35266r));
                Intrinsics.checkExpressionValueIsNotNull(m32048b, "this.`as`(AutoDispose.autoDisposable(provider))");
                ((MaybeSubscribeProxy) m32048b).subscribe();
                return;
            }
            return;
        }
        boolean z2 = true;
        if (i == I35.ADD_CARD.ordinal()) {
            if (i2 == -1) {
                CardEntered cardEntered = (CardEntered) X52.m77423b(intent);
                if (cardEntered != null && cardEntered.m55403c()) {
                    z = true;
                }
                if (z) {
                    this.f35249a.mo101238b();
                }
                Object m32048b2 = m83883I().m32048b(AutoDispose.m45239a(this.f35266r));
                Intrinsics.checkExpressionValueIsNotNull(m32048b2, "this.`as`(AutoDispose.autoDisposable(provider))");
                ((MaybeSubscribeProxy) m32048b2).subscribe();
            }
        } else if (i == I35.GOOGLE_PAY.ordinal()) {
            AbstractC24507p handleGooglePayActivityResult$default = InterfaceC42586iD1.C23161a.handleGooglePayActivityResult$default(this.f35251c, i2, intent, true, null, 8, null);
            final C7787o c7787o = C7787o.f35290g;
            AbstractC24507p m32027r = handleGooglePayActivityResult$default.m32027r(new InterfaceC23484g() { // from class: xJ4
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj) {
                    TJ4.m83863c0(Function1.this, obj);
                }
            });
            Intrinsics.checkNotNullExpressionValue(m32027r, "googlePayManager.handleG…OnSubscribe {\n          }");
            Object m32048b3 = m32027r.m32048b(AutoDispose.m45239a(this.f35266r));
            Intrinsics.checkExpressionValueIsNotNull(m32048b3, "this.`as`(AutoDispose.autoDisposable(provider))");
            final C7788p c7788p = new C7788p();
            InterfaceC23484g interfaceC23484g = new InterfaceC23484g() { // from class: yJ4
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj) {
                    TJ4.m83862d0(Function1.this, obj);
                }
            };
            final C7789q c7789q = new C7789q();
            ((MaybeSubscribeProxy) m32048b3).subscribe(interfaceC23484g, new InterfaceC23484g() { // from class: zJ4
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj) {
                    TJ4.m83861e0(Function1.this, obj);
                }
            }, new InterfaceC23478a() { // from class: AJ4
                @Override // io.reactivex.functions.InterfaceC23478a
                public final void run() {
                    TJ4.m83860f0();
                }
            });
        } else if (i != I35.PLAY_STORE_FOR_IDENTIFICATION.ordinal()) {
            if (i == I35.QUIZ.ordinal()) {
                if (i2 == InterfaceC40099e13.EnumC19925b.RESULT_OK.m43403b()) {
                    Object m32048b4 = m83883I().m32048b(AutoDispose.m45239a(this.f35266r));
                    Intrinsics.checkExpressionValueIsNotNull(m32048b4, "this.`as`(AutoDispose.autoDisposable(provider))");
                    ((MaybeSubscribeProxy) m32048b4).subscribe();
                    return;
                }
                return;
            }
            WireBird wireBird = null;
            String str = null;
            Integer num = null;
            if (i == I35.SOBER_START.ordinal()) {
                if (i2 == InterfaceC40099e13.EnumC19925b.RESULT_OK.m43403b()) {
                    J35 j35 = this.f35249a;
                    if (intent != null) {
                        str = intent.getStringExtra("bird_id");
                    }
                    j35.mo101236d(str);
                    Object m32048b5 = m83883I().m32048b(AutoDispose.m45239a(this.f35266r));
                    Intrinsics.checkExpressionValueIsNotNull(m32048b5, "this.`as`(AutoDispose.autoDisposable(provider))");
                    ((MaybeSubscribeProxy) m32048b5).subscribe();
                }
            } else if (i == I35.LOCALS_SURVEY.ordinal()) {
                if (i2 == InterfaceC40099e13.EnumC19925b.RESULT_OK.m43403b()) {
                    J35 j352 = this.f35249a;
                    User m37750B0 = this.f35250b.m37750B0();
                    if (m37750B0 != null) {
                        num = Integer.valueOf(m37750B0.getRideCount());
                    }
                    j352.mo101235e(num);
                    Object m32048b6 = m83883I().m32048b(AutoDispose.m45239a(this.f35266r));
                    Intrinsics.checkExpressionValueIsNotNull(m32048b6, "this.`as`(AutoDispose.autoDisposable(provider))");
                    ((MaybeSubscribeProxy) m32048b6).subscribe();
                }
            } else if (i == I35.FLOCK_TOGETHER.ordinal()) {
                if (i2 == InterfaceC40099e13.EnumC19925b.RESULT_OK.m43403b()) {
                    J35 j353 = this.f35249a;
                    J35.C3879a mo101233g = j353.mo101233g();
                    if (mo101233g != null) {
                        wireBird = mo101233g.m101227b();
                    }
                    j353.mo101237c(wireBird);
                    Object m32048b7 = m83883I().m32048b(AutoDispose.m45239a(this.f35266r));
                    Intrinsics.checkExpressionValueIsNotNull(m32048b7, "this.`as`(AutoDispose.autoDisposable(provider))");
                    ((MaybeSubscribeProxy) m32048b7).subscribe();
                }
            } else {
                if (i == I35.AUTO_PAY_V2.ordinal() || i == I35.TAX_INFORMATION_SIGNUP.ordinal()) {
                    r15 = true;
                } else {
                    r15 = false;
                }
                if (r15 != false || i == I35.ID_SELECTION.ordinal()) {
                    r152 = true;
                } else {
                    r152 = false;
                }
                if (r152 != false || i == 10041) {
                    r153 = true;
                } else {
                    r153 = false;
                }
                if (r153 != false || i == I35.HELMET_LEASE_PROMPT.ordinal()) {
                    r154 = true;
                } else {
                    r154 = false;
                }
                if (r154 != false || i == I35.HELMET_SELFIE_CONFIRMATION.ordinal()) {
                    r155 = true;
                } else {
                    r155 = false;
                }
                if (r155 != false || i == I35.PRELOAD_V2.ordinal()) {
                    r156 = true;
                } else {
                    r156 = false;
                }
                if (r156 == false && i != I35.AGREEMENTS.ordinal()) {
                    z2 = false;
                }
                if (z2) {
                    if (i2 == -1) {
                        Object m32048b8 = m83883I().m32048b(AutoDispose.m45239a(this.f35266r));
                        Intrinsics.checkExpressionValueIsNotNull(m32048b8, "this.`as`(AutoDispose.autoDisposable(provider))");
                        ((MaybeSubscribeProxy) m32048b8).subscribe();
                        return;
                    }
                    return;
                }
                C41318g46.m40160d("Unknown request code " + i + " in onActivityResult, ignored and requirement flow stopped", new Object[0]);
            }
        }
    }

    @Override // p000.InterfaceC48572sJ4
    public void onDestroy() {
        this.f35252d.mo104914d(this);
    }

    @InterfaceC40955fT5
    public void onEvent(P71 event) {
        Intrinsics.checkNotNullParameter(event, "event");
        Object m32048b = m83883I().m32048b(AutoDispose.m45239a(this.f35266r));
        Intrinsics.checkExpressionValueIsNotNull(m32048b, "this.`as`(AutoDispose.autoDisposable(provider))");
        ((MaybeSubscribeProxy) m32048b).subscribe();
    }

    @InterfaceC40955fT5
    public void onEvent(C8800Vq event) {
        Intrinsics.checkNotNullParameter(event, "event");
        Object m32048b = m83883I().m32048b(AutoDispose.m45239a(this.f35266r));
        Intrinsics.checkExpressionValueIsNotNull(m32048b, "this.`as`(AutoDispose.autoDisposable(provider))");
        ((MaybeSubscribeProxy) m32048b).subscribe();
    }
}
