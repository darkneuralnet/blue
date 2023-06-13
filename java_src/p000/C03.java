package p000;

import android.text.TextUtils;
import android.view.MenuItem;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.buava.Optional;
import co.bird.android.model.OperatorRole;
import co.bird.android.model.User;
import co.bird.android.model.UserKt;
import co.bird.android.model.UserRoleItem;
import co.bird.android.model.UserRoleItemKt;
import co.bird.android.model.constant.ConfigurableTutorialContext;
import co.bird.android.model.constant.MapMode;
import co.bird.android.model.constant.Permission;
import co.bird.android.model.constant.UserRole;
import co.bird.android.model.persistence.BirdPlusView;
import co.bird.android.model.persistence.RidePassView;
import co.bird.android.model.persistence.Tutorial;
import co.bird.android.model.wire.WireBird;
import co.bird.android.model.wire.WireFrequentFlyerView;
import co.bird.android.model.wire.configs.Config;
import co.bird.android.model.wire.configs.DeliveryRequestKind;
import co.bird.android.model.wire.configs.RentalConfigKt;
import com.facebook.share.internal.C17296a;
import com.stripe.android.model.Stripe3ds2AuthResult;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.CompletableSubscribeProxy;
import com.uber.autodispose.ObservableSubscribeProxy;
import com.uber.autodispose.SingleSubscribeProxy;
import com.uber.autodispose.lifecycle.LifecycleScopeProvider;
import io.reactivex.AbstractC23442F;
import io.reactivex.AbstractC23461c;
import io.reactivex.AbstractC24507p;
import io.reactivex.InterfaceC23447K;
import io.reactivex.InterfaceC23496h;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.C23454a;
import io.reactivex.functions.InterfaceC23478a;
import io.reactivex.functions.InterfaceC23480c;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.functions.InterfaceC23487j;
import io.reactivex.functions.InterfaceC23492o;
import io.reactivex.rxkotlin.C24523e;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.InterfaceC40099e13;
import p000.InterfaceC44791lw0;
@Metadata(m28433d1 = {"\u0000Ò\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B³\u0001\b\u0007\u0012\u000e\b\u0001\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017\u0012\u0006\u0010\u001f\u001a\u00020\u001c\u0012\u0006\u0010#\u001a\u00020 \u0012\u0006\u0010'\u001a\u00020$\u0012\u0006\u0010+\u001a\u00020(\u0012\u0006\u0010/\u001a\u00020,\u0012\u0006\u0010X\u001a\u00020W\u0012\u0006\u00103\u001a\u000200\u0012\u0006\u0010Z\u001a\u00020Y\u0012\u0006\u0010\\\u001a\u00020[\u0012\u0006\u00107\u001a\u000204\u0012\u0006\u0010;\u001a\u000208\u0012\u0006\u0010?\u001a\u00020<\u0012\u0006\u0010C\u001a\u00020@\u0012\u0006\u0010G\u001a\u00020D\u0012\u0006\u0010K\u001a\u00020H\u0012\u0006\u0010^\u001a\u00020]\u0012\u0006\u0010O\u001a\u00020L\u0012\u0006\u0010S\u001a\u00020P\u0012\b\b\u0001\u0010V\u001a\u00020T¢\u0006\u0004\b_\u0010`J \u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0002J\u0016\u0010\u000b\u001a\u00020\u00072\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\tH\u0002J\b\u0010\f\u001a\u00020\u0007H\u0002J\b\u0010\r\u001a\u00020\u0007H\u0016J\u0010\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000eH\u0016J\u0010\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0011H\u0016J\u0010\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u0004H\u0016J\b\u0010\u0016\u001a\u00020\u0007H\u0016R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00180\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001f\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010#\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010'\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010+\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010/\u001a\u00020,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0014\u00103\u001a\u0002008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0014\u00107\u001a\u0002048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u0014\u0010;\u001a\u0002088\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u0014\u0010?\u001a\u00020<8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>R\u0014\u0010C\u001a\u00020@8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010BR\u0014\u0010G\u001a\u00020D8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010FR\u0014\u0010K\u001a\u00020H8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010JR\u0014\u0010O\u001a\u00020L8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bM\u0010NR\u0014\u0010S\u001a\u00020P8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bQ\u0010RR\u0014\u0010V\u001a\u00020T8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010U¨\u0006a"}, m28432d2 = {"LC03;", "LOB;", "Lco/bird/android/model/User;", "user", "", "locationOn", "isMerchant", "", "A0", "Lkotlin/Function0;", "onCompleteAction", "c0", "k0", C17296a.f69688o, "Landroid/view/MenuItem;", "item", "b", "", "itemId", "c", "checked", DateTokenConverter.CONVERTER_KEY, Stripe3ds2AuthResult.Ares.VALUE_CHALLENGE, "Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;", "LRE;", "n", "Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;", "scopeProvider", "LCx4;", "o", "LCx4;", "rentalManager", "Lgl;", "p", "Lgl;", "preference", "LTq4;", "q", "LTq4;", "reactiveConfig", "LEa;", "r", "LEa;", "analyticsManager", "Ldr4;", "s", "Ldr4;", "locationManager", "Lq54;", "t", "Lq54;", "privateBirdsManager", "LWX2;", "u", "LWX2;", "myBirdsManager", "LaS2;", "v", "LaS2;", "merchantManager", "LQz1;", "w", "LQz1;", "frequentFlyerManager", "LWU4;", "x", "LWU4;", "ridePassManager", "LJQ;", "y", "LJQ;", "birdPlusManager", "Le13;", "z", "Le13;", "navigator", "Llw0;", "A", "Llw0;", "configurableTutorialManager", "LDQ3;", "B", "LDQ3;", "permissionManager", "LN03;", "LN03;", "ui", "LGI3;", "partnerManager", "LOh;", "appBuildConfig", "LZ85;", "demandManager", "LRh6;", "userStream", "<init>", "(Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;LCx4;Lgl;LTq4;LEa;Ldr4;LGI3;Lq54;LOh;LZ85;LWX2;LaS2;LQz1;LWU4;LJQ;Le13;LRh6;Llw0;LDQ3;LN03;)V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nNavigationDrawerPresenterImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavigationDrawerPresenterImpl.kt\nco/bird/android/app/feature/ride/presenter/NavigationDrawerPresenterImpl\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n+ 3 Observables.kt\nio/reactivex/rxkotlin/Observables\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 CharSequence.kt\nandroidx/core/text/CharSequenceKt\n*L\n1#1,465:1\n180#2:466\n180#2:467\n237#2:468\n180#2:471\n180#2:474\n180#2:475\n180#2:476\n180#2:477\n180#2:478\n180#2:479\n180#2:480\n180#2:483\n237#2:484\n199#2:485\n22#3,2:469\n71#3,2:472\n1#4:481\n28#5:482\n*S KotlinDebug\n*F\n+ 1 NavigationDrawerPresenterImpl.kt\nco/bird/android/app/feature/ride/presenter/NavigationDrawerPresenterImpl\n*L\n115#1:466\n126#1:467\n137#1:468\n146#1:471\n166#1:474\n175#1:475\n192#1:476\n203#1:477\n215#1:478\n228#1:479\n238#1:480\n366#1:483\n408#1:484\n431#1:485\n139#1:469,2\n155#1:472,2\n312#1:482\n*E\n"})
/* renamed from: C03 */
/* loaded from: classes2.dex */
public final class C03 extends AbstractC5914OB {

    /* renamed from: A */
    public final InterfaceC44791lw0 f3206A;

    /* renamed from: B */
    public final DQ3 f3207B;

    /* renamed from: C */
    public final N03 f3208C;

    /* renamed from: n */
    public final LifecycleScopeProvider<EnumC7097RE> f3209n;

    /* renamed from: o */
    public final InterfaceC32292Cx4 f3210o;

    /* renamed from: p */
    public final C22454gl f3211p;

    /* renamed from: q */
    public final C36207Tq4 f3212q;

    /* renamed from: r */
    public final InterfaceC1880Ea f3213r;

    /* renamed from: s */
    public final InterfaceC40001dr4 f3214s;

    /* renamed from: t */
    public final InterfaceC47256q54 f3215t;

    /* renamed from: u */
    public final WX2 f3216u;

    /* renamed from: v */
    public final InterfaceC37961aS2 f3217v;

    /* renamed from: w */
    public final InterfaceC35583Qz1 f3218w;

    /* renamed from: x */
    public final WU4 f3219x;

    /* renamed from: y */
    public final InterfaceC4077JQ f3220y;

    /* renamed from: z */
    public final InterfaceC40099e13 f3221z;

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"<anonymous>", "", "isMerchant", "", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/Boolean;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: C03$A */
    /* loaded from: classes2.dex */
    public static final class C0810A extends Lambda implements Function1<Boolean, Unit> {
        public C0810A() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
            invoke2(bool);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Boolean isMerchant) {
            Intrinsics.checkNotNullExpressionValue(isMerchant, "isMerchant");
            if (isMerchant.booleanValue()) {
                C03.this.f3221z.mo37072X0(true);
            }
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"LFQ3;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(LFQ3;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: C03$a */
    /* loaded from: classes2.dex */
    public static final class C0811a extends Lambda implements Function1<FQ3, Unit> {

        /* renamed from: g */
        public static final C0811a f3223g = new C0811a();

        public C0811a() {
            super(1);
        }

        /* renamed from: a */
        public final void m113059a(FQ3 fq3) {
            if (!fq3.m107154a()) {
                C41318g46.m40151m("User denied post bluetooth connect permission!", new Object[0]);
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(FQ3 fq3) {
            m113059a(fq3);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"LFQ3;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(LFQ3;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: C03$b */
    /* loaded from: classes2.dex */
    public static final class C0812b extends Lambda implements Function1<FQ3, Unit> {

        /* renamed from: g */
        public static final C0812b f3224g = new C0812b();

        public C0812b() {
            super(1);
        }

        /* renamed from: a */
        public final void m113058a(FQ3 fq3) {
            if (!fq3.m107154a()) {
                C41318g46.m40151m("User denied post bluetooth connect permission!", new Object[0]);
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(FQ3 fq3) {
            m113058a(fq3);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"LFQ3;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(LFQ3;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: C03$c */
    /* loaded from: classes2.dex */
    public static final class C0813c extends Lambda implements Function1<FQ3, Unit> {

        /* renamed from: g */
        public static final C0813c f3225g = new C0813c();

        public C0813c() {
            super(1);
        }

        /* renamed from: a */
        public final void m113057a(FQ3 fq3) {
            if (!fq3.m107154a()) {
                C41318g46.m40151m("User denied post notification permission!", new Object[0]);
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(FQ3 fq3) {
            m113057a(fq3);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: C03$d */
    /* loaded from: classes2.dex */
    public static final class C0814d extends Lambda implements Function1<Throwable, Unit> {

        /* renamed from: g */
        public final /* synthetic */ Function0<Unit> f3226g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0814d(Function0<Unit> function0) {
            super(1);
            this.f3226g = function0;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            C41318g46.m40161c(th, "Error while checking for required permissions, invoking onCompleteAction", new Object[0]);
            this.f3226g.invoke();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, m28432d2 = {"<anonymous>", "", "it", "", "Lco/bird/android/model/persistence/Tutorial;", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: C03$e */
    /* loaded from: classes2.dex */
    public static final class C0815e extends Lambda implements Function1<List<? extends Tutorial>, Unit> {

        /* renamed from: g */
        public static final C0815e f3227g = new C0815e();

        public C0815e() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(List<? extends Tutorial> list) {
            invoke2((List<Tutorial>) list);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(List<Tutorial> list) {
            C41318g46.m40163a("configurable tutorials returned: " + list, new Object[0]);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0005\u001a\u0016\u0012\u0004\u0012\u00020\u0003 \u0004*\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00000\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"", "Lco/bird/android/model/persistence/Tutorial;", "it", "", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Ljava/util/List;)Ljava/util/List;"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nNavigationDrawerPresenterImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavigationDrawerPresenterImpl.kt\nco/bird/android/app/feature/ride/presenter/NavigationDrawerPresenterImpl$determineHowToRideActivity$3\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,465:1\n1549#2:466\n1620#2,3:467\n*S KotlinDebug\n*F\n+ 1 NavigationDrawerPresenterImpl.kt\nco/bird/android/app/feature/ride/presenter/NavigationDrawerPresenterImpl$determineHowToRideActivity$3\n*L\n426#1:466\n426#1:467,3\n*E\n"})
    /* renamed from: C03$f */
    /* loaded from: classes2.dex */
    public static final class C0816f extends Lambda implements Function1<List<? extends Tutorial>, List<? extends String>> {

        /* renamed from: g */
        public static final C0816f f3228g = new C0816f();

        public C0816f() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final List<String> invoke(List<Tutorial> it) {
            int collectionSizeOrDefault;
            Intrinsics.checkNotNullParameter(it, "it");
            List<Tutorial> list = it;
            collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10);
            ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
            for (Tutorial tutorial : list) {
                arrayList.add(tutorial.getId());
            }
            return arrayList;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, m28432d2 = {"<anonymous>", "", "tutorialIds", "", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: C03$g */
    /* loaded from: classes2.dex */
    public static final class C0817g extends Lambda implements Function1<List<? extends String>, Unit> {

        /* renamed from: h */
        public final /* synthetic */ Config f3230h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0817g(Config config) {
            super(1);
            this.f3230h = config;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(List<? extends String> list) {
            invoke2((List<String>) list);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(List<String> tutorialIds) {
            Intrinsics.checkNotNullExpressionValue(tutorialIds, "tutorialIds");
            if (!tutorialIds.isEmpty()) {
                InterfaceC40099e13.C19924a.goToConfigurableTutorials$default(C03.this.f3221z, tutorialIds, null, true, 2, null);
            } else if (this.f3230h.getRideConfig().getEnableMultiModalTutorialSelection()) {
                C03.this.f3221z.mo37165G2();
            } else {
                InterfaceC40099e13.C19924a.goToRiderTutorial$default(C03.this.f3221z, null, 1, null);
            }
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\b\u0010\b\u001a\u00028\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0000\"\b\b\u0002\u0010\u0003*\u00020\u00002\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00028\u0001H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"", "T1", "T2", "R", "t1", "t2", "apply", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nObservables.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Observables.kt\nio/reactivex/rxkotlin/Observables$combineLatest$1\n+ 2 NavigationDrawerPresenterImpl.kt\nco/bird/android/app/feature/ride/presenter/NavigationDrawerPresenterImpl\n*L\n1#1,304:1\n142#2:305\n*E\n"})
    /* renamed from: C03$h */
    /* loaded from: classes2.dex */
    public static final class C0818h<T1, T2, R> implements InterfaceC23480c<T1, T2, R> {
        @Override // io.reactivex.functions.InterfaceC23480c
        public final R apply(T1 t1, T2 t2) {
            Pair m101399a;
            m101399a = J03.m101399a((Config) t1, (Optional) t2);
            return (R) m101399a;
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u000e\u0010\u000e\u001a\u00028\u0005\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0000\"\b\b\u0002\u0010\u0003*\u00020\u0000\"\b\b\u0003\u0010\u0004*\u00020\u0000\"\b\b\u0004\u0010\u0005*\u00020\u0000\"\b\b\u0005\u0010\u0006*\u00020\u00002\u0006\u0010\u0007\u001a\u00028\u00002\u0006\u0010\b\u001a\u00028\u00012\u0006\u0010\t\u001a\u00028\u00022\u0006\u0010\n\u001a\u00028\u00032\u0006\u0010\u000b\u001a\u00028\u0004H\n¢\u0006\u0004\b\f\u0010\r"}, m28432d2 = {"", "T1", "T2", "T3", "T4", "T5", "R", "t1", "t2", "t3", "t4", "t5", "apply", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nObservables.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Observables.kt\nio/reactivex/rxkotlin/Observables$combineLatest$6\n+ 2 NavigationDrawerPresenterImpl.kt\nco/bird/android/app/feature/ride/presenter/NavigationDrawerPresenterImpl\n*L\n1#1,304:1\n162#2,2:305\n*E\n"})
    /* renamed from: C03$i */
    /* loaded from: classes2.dex */
    public static final class C0819i<T1, T2, T3, T4, T5, R> implements InterfaceC23487j<T1, T2, T3, T4, T5, R> {
        @Override // io.reactivex.functions.InterfaceC23487j
        public final R apply(T1 t1, T2 t2, T3 t3, T4 t4, T5 t5) {
            boolean z;
            boolean booleanValue = ((Boolean) t5).booleanValue();
            List list = (List) t4;
            String str = (String) t3;
            Optional optional = (Optional) t2;
            if (((Boolean) t1).booleanValue() && optional.m59037c() && list.isEmpty() && !booleanValue) {
                z = true;
            } else {
                z = false;
            }
            return (R) TuplesKt.m28425to(Boolean.valueOf(z), str);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012&\u0010\u0002\u001a\"\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004 \u0005*\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, m28432d2 = {"<anonymous>", "", "<name for destructuring parameter 0>", "Lkotlin/Pair;", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: C03$j */
    /* loaded from: classes2.dex */
    public static final class C0820j extends Lambda implements Function1<Pair<? extends Boolean, ? extends Boolean>, Unit> {

        /* renamed from: h */
        public final /* synthetic */ User f3232h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0820j(User user) {
            super(1);
            this.f3232h = user;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Pair<? extends Boolean, ? extends Boolean> pair) {
            invoke2((Pair<Boolean, Boolean>) pair);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Pair<Boolean, Boolean> pair) {
            boolean booleanValue = pair.component1().booleanValue();
            C03.this.m113112A0(this.f3232h, !booleanValue, pair.component2().booleanValue());
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012B\u0010\u0002\u001a>\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006 \u0005*\u001e\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\b"}, m28432d2 = {"<anonymous>", "", "<name for destructuring parameter 0>", "Lkotlin/Pair;", "", "kotlin.jvm.PlatformType", "Lco/bird/android/buava/Optional;", "Lco/bird/android/model/wire/WireFrequentFlyerView;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: C03$k */
    /* loaded from: classes2.dex */
    public static final class C0821k extends Lambda implements Function1<Pair<? extends Boolean, ? extends Optional<WireFrequentFlyerView>>, Unit> {
        public C0821k() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Pair<? extends Boolean, ? extends Optional<WireFrequentFlyerView>> pair) {
            invoke2((Pair<Boolean, Optional<WireFrequentFlyerView>>) pair);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Pair<Boolean, Optional<WireFrequentFlyerView>> pair) {
            Unit unit;
            Boolean drawerOpen = pair.component1();
            WireFrequentFlyerView m59035e = pair.component2().m59035e();
            if (m59035e != null) {
                C03 c03 = C03.this;
                c03.f3208C.mo82176u9(m59035e);
                Intrinsics.checkNotNullExpressionValue(drawerOpen, "drawerOpen");
                if (drawerOpen.booleanValue()) {
                    c03.f3213r.mo55905y(new C44375lE2(null, null, null, m59035e.getHeadline(), 7, null));
                }
                unit = Unit.INSTANCE;
            } else {
                unit = null;
            }
            if (unit == null) {
                C03.this.f3208C.mo82197Af();
            }
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0003*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"<anonymous>", "", "it", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    @SourceDebugExtension({"SMAP\nNavigationDrawerPresenterImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavigationDrawerPresenterImpl.kt\nco/bird/android/app/feature/ride/presenter/NavigationDrawerPresenterImpl$onCreate$11\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,465:1\n1#2:466\n*E\n"})
    /* renamed from: C03$l */
    /* loaded from: classes2.dex */
    public static final class C0822l extends Lambda implements Function1<Unit, Unit> {
        public C0822l() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Unit unit) {
            invoke2(unit);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Unit unit) {
            WireFrequentFlyerView m59035e = C03.this.f3218w.getData().m73665a().m59035e();
            if (m59035e != null) {
                C03.this.f3221z.mo37053a4(m59035e);
            }
            C03.this.f3213r.mo55905y(new C44968mE2(null, null, null, m59035e != null ? m59035e.getHeadline() : null, 7, null));
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012&\u0010\u0002\u001a\"\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004 \u0005*\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, m28432d2 = {"<anonymous>", "", "<name for destructuring parameter 0>", "Lkotlin/Pair;", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: C03$m */
    /* loaded from: classes2.dex */
    public static final class C0823m extends Lambda implements Function1<Pair<? extends Boolean, ? extends Boolean>, Unit> {
        public C0823m() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Pair<? extends Boolean, ? extends Boolean> pair) {
            invoke2((Pair<Boolean, Boolean>) pair);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Pair<Boolean, Boolean> pair) {
            boolean booleanValue = pair.component1().booleanValue();
            boolean booleanValue2 = pair.component2().booleanValue();
            C03.this.f3208C.mo82179me(booleanValue && !booleanValue2);
            C03.this.f3208C.mo82191We(booleanValue2);
            if (booleanValue2) {
                C03.this.f3213r.mo55905y(new C32158Ci5(null, null, null, 7, null));
            }
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, m28432d2 = {"<anonymous>", "", "it", "", "Lco/bird/android/model/persistence/RidePassView;", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: C03$n */
    /* loaded from: classes2.dex */
    public static final class C0824n extends Lambda implements Function1<List<? extends RidePassView>, Unit> {
        public C0824n() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(List<? extends RidePassView> list) {
            invoke2((List<RidePassView>) list);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(List<RidePassView> it) {
            N03 n03 = C03.this.f3208C;
            Intrinsics.checkNotNullExpressionValue(it, "it");
            n03.mo82182e5(!it.isEmpty());
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"<anonymous>", "", "kotlin.jvm.PlatformType", "it", "", "Lco/bird/android/model/persistence/BirdPlusView;", "invoke", "(Ljava/util/List;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: C03$o */
    /* loaded from: classes2.dex */
    public static final class C0825o extends Lambda implements Function1<List<? extends BirdPlusView>, Boolean> {

        /* renamed from: g */
        public static final C0825o f3237g = new C0825o();

        public C0825o() {
            super(1);
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final Boolean invoke2(List<BirdPlusView> it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Boolean.valueOf(!it.isEmpty());
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Boolean invoke(List<? extends BirdPlusView> list) {
            return invoke2((List<BirdPlusView>) list);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/Boolean;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: C03$p */
    /* loaded from: classes2.dex */
    public static final class C0826p extends Lambda implements Function1<Boolean, Unit> {
        public C0826p() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
            invoke2(bool);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Boolean it) {
            N03 n03 = C03.this.f3208C;
            Intrinsics.checkNotNullExpressionValue(it, "it");
            n03.mo82178pf(it.booleanValue());
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/wire/configs/Config;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lco/bird/android/model/wire/configs/Config;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: C03$q */
    /* loaded from: classes2.dex */
    public static final class C0827q extends Lambda implements Function1<Config, Unit> {
        public C0827q() {
            super(1);
        }

        /* renamed from: a */
        public final void m113055a(Config config) {
            boolean z;
            C03.this.f3208C.mo82193Mh(config.getEnableSafetyMenu());
            N03 n03 = C03.this.f3208C;
            if (config.getComplianceConfig().getInsuranceArticle() != null) {
                z = true;
            } else {
                z = false;
            }
            n03.mo82180f2(z);
            C03.this.f3208C.mo82184d5(config.getPromoConfig().getEnablePromos());
            C03.this.f3208C.mo82194K2(WE0.m78690a(config.getRideConfig().getCurrency()));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Config config) {
            m113055a(config);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Ltg1;", "it", "Lio/reactivex/h;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Ltg1;)Lio/reactivex/h;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: C03$r */
    /* loaded from: classes2.dex */
    public static final class C0828r extends Lambda implements Function1<C49375tg1, InterfaceC23496h> {

        /* renamed from: g */
        public static final C0828r f3240g = new C0828r();

        public C0828r() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC23496h invoke(C49375tg1 it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return AbstractC23461c.m33080F(new Throwable());
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012&\u0010\u0002\u001a\"\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005 \u0006*\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0007"}, m28432d2 = {"<anonymous>", "", "<name for destructuring parameter 0>", "Lkotlin/Pair;", "", "Lco/bird/android/model/wire/configs/DeliveryRequestKind;", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: C03$s */
    /* loaded from: classes2.dex */
    public static final class C0829s extends Lambda implements Function1<Pair<? extends Boolean, ? extends DeliveryRequestKind>, Unit> {
        public C0829s() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Pair<? extends Boolean, ? extends DeliveryRequestKind> pair) {
            invoke2((Pair<Boolean, ? extends DeliveryRequestKind>) pair);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Pair<Boolean, ? extends DeliveryRequestKind> pair) {
            C03.this.f3208C.mo82175y5(C03.this.f3212q.m82623f8().m73665a().getRentalConfigs().getConfig().getContent().getMenuItemLabel(), pair.component1().booleanValue(), pair.component2());
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012&\u0010\u0002\u001a\"\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005 \u0006*\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0007"}, m28432d2 = {"<anonymous>", "", "<name for destructuring parameter 0>", "Lkotlin/Pair;", "", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: C03$t */
    /* loaded from: classes2.dex */
    public static final class C0830t extends Lambda implements Function1<Pair<? extends Boolean, ? extends String>, Unit> {
        public C0830t() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Pair<? extends Boolean, ? extends String> pair) {
            invoke2((Pair<Boolean, String>) pair);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Pair<Boolean, String> pair) {
            C03.this.f3208C.mo82177t2(pair.component1().booleanValue(), pair.component2());
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u000122\u0010\u0002\u001a.\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0004\u0012\u00020\u0006 \u0007*\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\b"}, m28432d2 = {"<anonymous>", "", "<name for destructuring parameter 0>", "Lkotlin/Pair;", "", "Lco/bird/android/model/wire/WireBird;", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: C03$u */
    /* loaded from: classes2.dex */
    public static final class C0831u extends Lambda implements Function1<Pair<? extends List<? extends WireBird>, ? extends Boolean>, Unit> {
        public C0831u() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Pair<? extends List<? extends WireBird>, ? extends Boolean> pair) {
            invoke2((Pair<? extends List<WireBird>, Boolean>) pair);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Pair<? extends List<WireBird>, Boolean> pair) {
            Integer valueOf;
            List<WireBird> component1 = pair.component1();
            if (pair.component2().booleanValue()) {
                valueOf = Integer.valueOf(C50583vi4.nav_private_birds);
            } else if (component1.size() == 1) {
                valueOf = Integer.valueOf(C50583vi4.nav_my_bird);
            } else {
                valueOf = component1.size() > 1 ? Integer.valueOf(C50583vi4.nav_my_birds) : null;
            }
            C03.this.f3208C.mo82196Ag(valueOf);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Ln71;", "it", "", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Ln71;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: C03$v */
    /* loaded from: classes2.dex */
    public static final class C0832v extends Lambda implements Function1<EnumC45494n71, Boolean> {

        /* renamed from: g */
        public static final C0832v f3244g = new C0832v();

        public C0832v() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Boolean invoke(EnumC45494n71 it) {
            boolean z;
            Intrinsics.checkNotNullParameter(it, "it");
            if (it == EnumC45494n71.OPEN) {
                z = true;
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: C03$w */
    /* loaded from: classes2.dex */
    public static final class C0833w extends Lambda implements Function0<Unit> {
        public C0833w() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            Object firstOrNull;
            List<WireBird> blockingFirst = C03.this.f3216u.mo72986a().blockingFirst();
            Intrinsics.checkNotNullExpressionValue(blockingFirst, "myBirdsManager.privateBirds.blockingFirst()");
            firstOrNull = CollectionsKt___CollectionsKt.firstOrNull((List<? extends Object>) blockingFirst);
            WireBird wireBird = (WireBird) firstOrNull;
            if (wireBird != null) {
                C03.this.f3221z.mo37004j(wireBird.getId(), I35.MY_BIRDS.ordinal(), false, wireBird.getModel());
            }
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: C03$x */
    /* loaded from: classes2.dex */
    public static final class C0834x extends Lambda implements Function0<Unit> {
        public C0834x() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            C03.this.f3221z.mo37045c0(I35.MY_BIRDS.ordinal());
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: C03$y */
    /* loaded from: classes2.dex */
    public static final class C0835y extends Lambda implements Function0<Unit> {
        public C0835y() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            C03.this.f3221z.mo37094S3();
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: C03$z */
    /* loaded from: classes2.dex */
    public static final class C0836z extends Lambda implements Function0<Unit> {

        /* renamed from: g */
        public final /* synthetic */ User f3248g;

        /* renamed from: h */
        public final /* synthetic */ C03 f3249h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0836z(User user, C03 c03) {
            super(0);
            this.f3248g = user;
            this.f3249h = c03;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            List<OperatorRole> operatorRoles;
            Object first;
            Object first2;
            if (UserKt.hasOperatorRole(this.f3248g) && (operatorRoles = this.f3248g.getOperatorRoles()) != null) {
                C03 c03 = this.f3249h;
                UserRole userRole = UserRole.OPERATOR;
                c03.f3213r.mo55905y(new OU2(null, null, null, userRole.name(), 7, null));
                C22454gl c22454gl = c03.f3211p;
                first = CollectionsKt___CollectionsKt.first((List<? extends Object>) operatorRoles);
                String role = ((OperatorRole) first).getRole();
                first2 = CollectionsKt___CollectionsKt.first((List<? extends Object>) operatorRoles);
                c22454gl.m37732F2(new UserRoleItem(userRole, role, ((OperatorRole) first2).getTitle(), null, 8, null));
            }
            InterfaceC40099e13.C19924a.goToOperator$default(this.f3249h.f3221z, true, null, null, 6, null);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C03(LifecycleScopeProvider<EnumC7097RE> scopeProvider, InterfaceC32292Cx4 rentalManager, C22454gl preference, C36207Tq4 reactiveConfig, InterfaceC1880Ea analyticsManager, InterfaceC40001dr4 locationManager, GI3 partnerManager, InterfaceC47256q54 privateBirdsManager, InterfaceC6097Oh appBuildConfig, Z85 demandManager, WX2 myBirdsManager, InterfaceC37961aS2 merchantManager, InterfaceC35583Qz1 frequentFlyerManager, WU4 ridePassManager, InterfaceC4077JQ birdPlusManager, InterfaceC40099e13 navigator, InterfaceC35660Rh6 userStream, InterfaceC44791lw0 configurableTutorialManager, DQ3 permissionManager, N03 ui) {
        super(appBuildConfig, scopeProvider, preference, reactiveConfig, ui, navigator, analyticsManager, demandManager, merchantManager, userStream, null, partnerManager, 1024, null);
        Intrinsics.checkNotNullParameter(scopeProvider, "scopeProvider");
        Intrinsics.checkNotNullParameter(rentalManager, "rentalManager");
        Intrinsics.checkNotNullParameter(preference, "preference");
        Intrinsics.checkNotNullParameter(reactiveConfig, "reactiveConfig");
        Intrinsics.checkNotNullParameter(analyticsManager, "analyticsManager");
        Intrinsics.checkNotNullParameter(locationManager, "locationManager");
        Intrinsics.checkNotNullParameter(partnerManager, "partnerManager");
        Intrinsics.checkNotNullParameter(privateBirdsManager, "privateBirdsManager");
        Intrinsics.checkNotNullParameter(appBuildConfig, "appBuildConfig");
        Intrinsics.checkNotNullParameter(demandManager, "demandManager");
        Intrinsics.checkNotNullParameter(myBirdsManager, "myBirdsManager");
        Intrinsics.checkNotNullParameter(merchantManager, "merchantManager");
        Intrinsics.checkNotNullParameter(frequentFlyerManager, "frequentFlyerManager");
        Intrinsics.checkNotNullParameter(ridePassManager, "ridePassManager");
        Intrinsics.checkNotNullParameter(birdPlusManager, "birdPlusManager");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(userStream, "userStream");
        Intrinsics.checkNotNullParameter(configurableTutorialManager, "configurableTutorialManager");
        Intrinsics.checkNotNullParameter(permissionManager, "permissionManager");
        Intrinsics.checkNotNullParameter(ui, "ui");
        this.f3209n = scopeProvider;
        this.f3210o = rentalManager;
        this.f3211p = preference;
        this.f3212q = reactiveConfig;
        this.f3213r = analyticsManager;
        this.f3214s = locationManager;
        this.f3215t = privateBirdsManager;
        this.f3216u = myBirdsManager;
        this.f3217v = merchantManager;
        this.f3218w = frequentFlyerManager;
        this.f3219x = ridePassManager;
        this.f3220y = birdPlusManager;
        this.f3221z = navigator;
        this.f3206A = configurableTutorialManager;
        this.f3207B = permissionManager;
        this.f3208C = ui;
    }

    /* renamed from: B */
    public static final void m113111B(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: d0 */
    public static final void m113084d0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: e0 */
    public static final InterfaceC23496h m113083e0(C03 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        C41318g46.m40163a("checking for required bluetooth connect permission", new Object[0]);
        AbstractC23442F<FQ3> m110485l = this$0.f3207B.m110485l(Permission.BLUETOOTH_CONNECT);
        final C0812b c0812b = C0812b.f3224g;
        return m110485l.m33101w(new InterfaceC23484g() { // from class: GZ2
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C03.m113082f0(Function1.this, obj);
            }
        }).m33159G();
    }

    /* renamed from: f0 */
    public static final void m113082f0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: g0 */
    public static final InterfaceC23496h m113081g0(C03 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        C41318g46.m40163a("checking for required notification permission", new Object[0]);
        AbstractC23442F<FQ3> m110485l = this$0.f3207B.m110485l(Permission.POST_NOTIFICATION);
        final C0813c c0813c = C0813c.f3225g;
        return m110485l.m33101w(new InterfaceC23484g() { // from class: IZ2
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C03.m113080h0(Function1.this, obj);
            }
        }).m33159G();
    }

    /* renamed from: h0 */
    public static final void m113080h0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: i0 */
    public static final void m113079i0(Function0 onCompleteAction) {
        Intrinsics.checkNotNullParameter(onCompleteAction, "$onCompleteAction");
        C41318g46.m40163a("permissions requested if necessary in private birds overview, invoking onCompleteAction", new Object[0]);
        onCompleteAction.invoke();
    }

    /* renamed from: j0 */
    public static final void m113078j0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: l0 */
    public static final InterfaceC23447K m113076l0(C03 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        return InterfaceC44791lw0.C25816a.getTutorialsByContext$default(this$0.f3206A, ConfigurableTutorialContext.RIDE_START, null, false, 2, null);
    }

    /* renamed from: m0 */
    public static final void m113075m0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: n0 */
    public static final List m113074n0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (List) tmp0.invoke(obj);
    }

    /* renamed from: o0 */
    public static final void m113073o0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: p0 */
    public static final void m113072p0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: q0 */
    public static final void m113071q0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: r0 */
    public static final void m113070r0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: s0 */
    public static final void m113069s0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: t0 */
    public static final Boolean m113068t0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (Boolean) tmp0.invoke(obj);
    }

    /* renamed from: u0 */
    public static final void m113067u0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: v0 */
    public static final InterfaceC23496h m113066v0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23496h) tmp0.invoke(obj);
    }

    /* renamed from: w0 */
    public static final void m113065w0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: x */
    public static final void m113064x(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: x0 */
    public static final Boolean m113063x0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (Boolean) tmp0.invoke(obj);
    }

    /* renamed from: y0 */
    public static final void m113062y0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: z */
    public static final void m113061z(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: z0 */
    public static final void m113060z0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: A0 */
    public final void m113112A0(User user, boolean z, boolean z2) {
        Unit unit;
        Object first;
        int i;
        N03 n03 = this.f3208C;
        n03.mo73872ml(z);
        boolean z3 = true;
        if (z2) {
            if (this.f3217v.mo12335l() > 1) {
                i = C45871nl4.drawer_ride_switch_merchant_many;
            } else {
                i = C45871nl4.drawer_ride_switch_merchant;
            }
            n03.mo73880Le(i);
            n03.setIcon(C52342yg4.ic_filled_logo);
        } else if (UserKt.hasOperatorRole(user)) {
            List<OperatorRole> operatorRoles = user.getOperatorRoles();
            if (operatorRoles != null) {
                first = CollectionsKt___CollectionsKt.first((List<? extends Object>) operatorRoles);
                n03.mo73878Te(((OperatorRole) first).getTitle());
                unit = Unit.INSTANCE;
            } else {
                unit = null;
            }
            if (unit == null) {
                n03.mo73880Le(C45871nl4.drawer_ride_switch_operator);
            }
            n03.setIcon(C52342yg4.ic_filled_logo);
        } else if (UserKt.isOperator(user)) {
            n03.mo73880Le(C45871nl4.drawer_ride_switch_operator);
        } else {
            z3 = false;
            n03.mo73872ml(false);
            n03.setIcon(C52342yg4.ic_filled_logo);
        }
        n03.mo73879Mj(z3);
    }

    @Override // p000.AbstractC5914OB
    /* renamed from: C */
    public void mo92668C() {
        this.f3211p.m37732F2(UserRoleItemKt.toUserRoleItem(UserRole.RIDER));
    }

    @Override // p000.AbstractC5914OB, p000.InterfaceC38024aZ2
    /* renamed from: a */
    public void mo71220a() {
        boolean z;
        super.mo71220a();
        Config value = this.f3212q.m82623f8().getValue();
        User m37750B0 = this.f3211p.m37750B0();
        if (m37750B0 != null) {
            Observable observeOn = C24523e.f91168a.m31956a(this.f3214s.mo43622j(), this.f3217v.mo12337j()).observeOn(C23454a.m33087a());
            Intrinsics.checkNotNullExpressionValue(observeOn, "Observables\n        .com…dSchedulers.mainThread())");
            Object m33094as = observeOn.m33094as(AutoDispose.m45239a(this.f3209n));
            Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
            final C0820j c0820j = new C0820j(m37750B0);
            ((ObservableSubscribeProxy) m33094as).subscribe(new InterfaceC23484g() { // from class: bZ2
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj) {
                    C03.m113072p0(Function1.this, obj);
                }
            });
            this.f3208C.mo82195D7(m37750B0.getAdmin());
            N03 n03 = this.f3208C;
            if (value.getTutorialV2().getEnabled() && m37750B0.getAdmin()) {
                z = true;
            } else {
                z = false;
            }
            n03.mo82188al(z);
        }
        Observable<Config> observeOn2 = this.f3212q.m82623f8().observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn2, "reactiveConfig.config\n  …dSchedulers.mainThread())");
        Object m33094as2 = observeOn2.m33094as(AutoDispose.m45239a(this.f3209n));
        Intrinsics.checkExpressionValueIsNotNull(m33094as2, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C0827q c0827q = new C0827q();
        ((ObservableSubscribeProxy) m33094as2).subscribe(new InterfaceC23484g() { // from class: d03
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C03.m113064x(Function1.this, obj);
            }
        });
        AbstractC24507p<C49375tg1> mo87530i = this.f3210o.mo87530i();
        final C0828r c0828r = C0828r.f3240g;
        AbstractC23461c m33069Q = mo87530i.m32074A(new InterfaceC23492o() { // from class: s03
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23496h m113066v0;
                m113066v0 = C03.m113066v0(Function1.this, obj);
                return m113066v0;
            }
        }).m33069Q();
        Intrinsics.checkNotNullExpressionValue(m33069Q, "rentalManager.refreshRen…\n      .onErrorComplete()");
        Object m33041n = m33069Q.m33041n(AutoDispose.m45239a(this.f3209n));
        Intrinsics.checkExpressionValueIsNotNull(m33041n, "this.`as`(AutoDispose.au…isposable<Any>(provider))");
        ((CompletableSubscribeProxy) m33041n).subscribe();
        C24523e c24523e = C24523e.f91168a;
        Observable combineLatest = Observable.combineLatest(this.f3212q.m82623f8(), this.f3210o.mo87531h(), new C0818h());
        Intrinsics.checkExpressionValueIsNotNull(combineLatest, "Observable.combineLatest…ombineFunction(t1, t2) })");
        Observable observeOn3 = combineLatest.onErrorResumeNext(Observable.never()).observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn3, "Observables.combineLates…dSchedulers.mainThread())");
        Object m33094as3 = observeOn3.m33094as(AutoDispose.m45239a(this.f3209n));
        Intrinsics.checkExpressionValueIsNotNull(m33094as3, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C0829s c0829s = new C0829s();
        ((ObservableSubscribeProxy) m33094as3).subscribe(new InterfaceC23484g() { // from class: u03
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C03.m113061z(Function1.this, obj);
            }
        });
        Observable combineLatest2 = Observable.combineLatest(this.f3212q.m82794P2(), this.f3212q.m82814N2(), this.f3212q.m82834L2(), this.f3215t.mo18205i(), this.f3212q.m82770R6(), new C0819i());
        Intrinsics.checkExpressionValueIsNotNull(combineLatest2, "Observable.combineLatest…on(t1, t2, t3, t4, t5) })");
        Observable observeOn4 = combineLatest2.observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn4, "Observables.combineLates…dSchedulers.mainThread())");
        Object m33094as4 = observeOn4.m33094as(AutoDispose.m45239a(this.f3209n));
        Intrinsics.checkExpressionValueIsNotNull(m33094as4, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C0830t c0830t = new C0830t();
        ((ObservableSubscribeProxy) m33094as4).subscribe(new InterfaceC23484g() { // from class: w03
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C03.m113111B(Function1.this, obj);
            }
        });
        C24523e c24523e2 = C24523e.f91168a;
        Observable observeOn5 = c24523e2.m31956a(this.f3216u.mo72986a(), this.f3212q.m82770R6()).observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn5, "Observables.combineLates…dSchedulers.mainThread())");
        Object m33094as5 = observeOn5.m33094as(AutoDispose.m45239a(this.f3209n));
        Intrinsics.checkExpressionValueIsNotNull(m33094as5, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C0831u c0831u = new C0831u();
        ((ObservableSubscribeProxy) m33094as5).subscribe(new InterfaceC23484g() { // from class: y03
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C03.m113065w0(Function1.this, obj);
            }
        });
        Observable<EnumC45494n71> mo82174yb = this.f3208C.mo82174yb();
        final C0832v c0832v = C0832v.f3244g;
        Object map = mo82174yb.map(new InterfaceC23492o() { // from class: A03
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                Boolean m113063x0;
                m113063x0 = C03.m113063x0(Function1.this, obj);
                return m113063x0;
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "ui.drawerState.map { it == DrawerState.OPEN }");
        Observable observeOn6 = c24523e2.m31956a(map, this.f3218w.getData()).distinctUntilChanged().observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn6, "Observables.combineLates…dSchedulers.mainThread())");
        Object m33094as6 = observeOn6.m33094as(AutoDispose.m45239a(this.f3209n));
        Intrinsics.checkExpressionValueIsNotNull(m33094as6, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C0821k c0821k = new C0821k();
        ((ObservableSubscribeProxy) m33094as6).subscribe(new InterfaceC23484g() { // from class: dZ2
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C03.m113062y0(Function1.this, obj);
            }
        });
        Object m33094as7 = this.f3208C.mo82192Sj().m33094as(AutoDispose.m45239a(this.f3209n));
        Intrinsics.checkExpressionValueIsNotNull(m33094as7, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C0822l c0822l = new C0822l();
        ((ObservableSubscribeProxy) m33094as7).subscribe(new InterfaceC23484g() { // from class: gZ2
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C03.m113071q0(Function1.this, obj);
            }
        });
        Observable observeOn7 = c24523e2.m31956a(this.f3212q.m82713X3(), this.f3212q.m82655c9()).observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn7, "Observables.combineLates…dSchedulers.mainThread())");
        Object m33094as8 = observeOn7.m33094as(AutoDispose.m45239a(this.f3209n));
        Intrinsics.checkExpressionValueIsNotNull(m33094as8, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C0823m c0823m = new C0823m();
        ((ObservableSubscribeProxy) m33094as8).subscribe(new InterfaceC23484g() { // from class: iZ2
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C03.m113070r0(Function1.this, obj);
            }
        });
        Observable<List<RidePassView>> observeOn8 = this.f3219x.mo55503E0().observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn8, "ridePassManager\n      .r…dSchedulers.mainThread())");
        Object m33094as9 = observeOn8.m33094as(AutoDispose.m45239a(this.f3209n));
        Intrinsics.checkExpressionValueIsNotNull(m33094as9, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C0824n c0824n = new C0824n();
        ((ObservableSubscribeProxy) m33094as9).subscribe(new InterfaceC23484g() { // from class: fZ2
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C03.m113069s0(Function1.this, obj);
            }
        });
        Z84<List<BirdPlusView>> mo90339b0 = this.f3220y.mo90339b0();
        final C0825o c0825o = C0825o.f3237g;
        Observable observeOn9 = mo90339b0.map(new InterfaceC23492o() { // from class: BZ2
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                Boolean m113068t0;
                m113068t0 = C03.m113068t0(Function1.this, obj);
                return m113068t0;
            }
        }).distinctUntilChanged().observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn9, "birdPlusManager\n      .b…dSchedulers.mainThread())");
        Object m33094as10 = observeOn9.m33094as(AutoDispose.m45239a(this.f3209n));
        Intrinsics.checkExpressionValueIsNotNull(m33094as10, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C0826p c0826p = new C0826p();
        ((ObservableSubscribeProxy) m33094as10).subscribe(new InterfaceC23484g() { // from class: RZ2
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C03.m113067u0(Function1.this, obj);
            }
        });
    }

    @Override // p000.InterfaceC38024aZ2
    /* renamed from: b */
    public boolean mo71219b(MenuItem item) {
        Intrinsics.checkNotNullParameter(item, "item");
        return mo71218c(item.getItemId());
    }

    @Override // p000.InterfaceC38024aZ2
    /* renamed from: c */
    public boolean mo71218c(int i) {
        BirdPlusView birdPlusView;
        Object first;
        if (i == C50583vi4.nav_configurable_tutorial_viewer) {
            this.f3221z.mo37043c2();
        } else if (i == C50583vi4.nav_ride_pass) {
            InterfaceC40099e13.C19924a.goToRidePassV4$default(this.f3221z, null, 1, null);
        } else {
            boolean z = false;
            if (i == C50583vi4.nav_bird_plus) {
                List<BirdPlusView> m73665a = this.f3220y.mo90339b0().m73665a();
                if (m73665a.size() == 1) {
                    z = true;
                }
                if (!z) {
                    m73665a = null;
                }
                List<BirdPlusView> list = m73665a;
                if (list != null) {
                    first = CollectionsKt___CollectionsKt.first((List<? extends Object>) list);
                    birdPlusView = (BirdPlusView) first;
                } else {
                    birdPlusView = null;
                }
                if (birdPlusView != null) {
                    this.f3221z.mo37073X(birdPlusView.getUserSubscriptionId(), birdPlusView.getSubscriptionPlanId(), birdPlusView.getCodename());
                } else {
                    InterfaceC40099e13.C19924a.goToBirdPlus$default(this.f3221z, null, 1, null);
                }
            } else if (i == C50583vi4.nav_credit) {
                InterfaceC40099e13.C19924a.goToPayment$default(this.f3221z, null, false, 3, null);
            } else if (i == C50583vi4.nav_promo_center) {
                this.f3221z.mo37138L();
            } else if (i == C50583vi4.nav_free_rides) {
                this.f3221z.mo37099R3();
            } else if (i == C50583vi4.nav_transaction_history) {
                this.f3221z.mo37107Q0();
            } else if (i == C50583vi4.nav_help) {
                InterfaceC40099e13.C19924a.navigateToHelp$default(this.f3221z, MapMode.RIDER, null, false, Boolean.valueOf(m92655q().mo55891a()), 6, null);
            } else if (i == C50583vi4.nav_settings) {
                this.f3221z.mo37005i4();
            } else if (i == C50583vi4.nav_how_to_ride) {
                m113077k0();
            } else if (i == C50583vi4.nav_saftey) {
                this.f3221z.mo37063Z();
            } else if (i == C50583vi4.nav_insurance) {
                String insuranceArticle = this.f3212q.m82623f8().m73665a().getComplianceConfig().getInsuranceArticle();
                if (insuranceArticle != null && TextUtils.isDigitsOnly(insuranceArticle)) {
                    z = true;
                }
                if (z) {
                    this.f3221z.mo36922w3(Long.parseLong(insuranceArticle));
                } else {
                    InterfaceC40099e13 interfaceC40099e13 = this.f3221z;
                    Intrinsics.checkNotNull(insuranceArticle);
                    interfaceC40099e13.mo36983m2(insuranceArticle);
                }
            } else if (i == C50583vi4.nav_debug) {
                this.f3221z.mo36967p0();
            } else if (i == C50583vi4.nav_rental) {
                this.f3213r.mo55905y(new C36036Sx4(null, null, null, RentalConfigKt.rentalKind(this.f3212q.m82623f8().m73665a().getRentalConfigs()).toString(), this.f3215t.mo18197q(), 7, null));
                this.f3221z.mo37173F0(I35.LONG_TERM_RENTAL_SETUP.ordinal());
            } else if (i == C50583vi4.nav_shop) {
                this.f3221z.mo37110P3();
            } else if (i == C50583vi4.nav_my_bird) {
                m113085c0(new C0833w());
            } else if (i == C50583vi4.nav_my_birds) {
                m113085c0(new C0834x());
            } else if (i == C50583vi4.nav_private_birds) {
                m113085c0(new C0835y());
            } else if (i == C50583vi4.nav_save_money) {
                this.f3213r.mo55905y(new C45249mi5(null, null, null, "side_menu", 7, null));
                this.f3221z.mo36936u1("side_menu");
            }
        }
        this.f3208C.mo73881Kh();
        return true;
    }

    /* renamed from: c0 */
    public final void m113085c0(final Function0<Unit> function0) {
        C41318g46.m40163a("checking for required bluetooth scan permission", new Object[0]);
        AbstractC23442F<FQ3> m110485l = this.f3207B.m110485l(Permission.BLUETOOTH_SCAN);
        final C0811a c0811a = C0811a.f3223g;
        AbstractC23461c m33070P = m110485l.m33101w(new InterfaceC23484g() { // from class: kZ2
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C03.m113084d0(Function1.this, obj);
            }
        }).m33159G().m33049i(AbstractC23461c.m33035t(new Callable() { // from class: mZ2
            @Override // java.util.concurrent.Callable
            public final Object call() {
                InterfaceC23496h m113083e0;
                m113083e0 = C03.m113083e0(C03.this);
                return m113083e0;
            }
        })).m33049i(AbstractC23461c.m33035t(new Callable() { // from class: oZ2
            @Override // java.util.concurrent.Callable
            public final Object call() {
                InterfaceC23496h m113081g0;
                m113081g0 = C03.m113081g0(C03.this);
                return m113081g0;
            }
        })).m33070P(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(m33070P, "permissionManager.reques…dSchedulers.mainThread())");
        Object m33041n = m33070P.m33041n(AutoDispose.m45239a(this.f3209n));
        Intrinsics.checkExpressionValueIsNotNull(m33041n, "this.`as`(AutoDispose.au…isposable<Any>(provider))");
        InterfaceC23478a interfaceC23478a = new InterfaceC23478a() { // from class: qZ2
            @Override // io.reactivex.functions.InterfaceC23478a
            public final void run() {
                C03.m113079i0(Function0.this);
            }
        };
        final C0814d c0814d = new C0814d(function0);
        ((CompletableSubscribeProxy) m33041n).mo45217e(interfaceC23478a, new InterfaceC23484g() { // from class: sZ2
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C03.m113078j0(Function1.this, obj);
            }
        });
    }

    @Override // p000.InterfaceC38024aZ2
    /* renamed from: d */
    public void mo71217d(boolean z) {
        User m37750B0;
        if (z && (m37750B0 = this.f3211p.m37750B0()) != null) {
            if (UserKt.isOperator(m37750B0)) {
                m113085c0(new C0836z(m37750B0, this));
                return;
            }
            Object m33094as = this.f3217v.mo12337j().m33094as(AutoDispose.m45239a(this.f3209n));
            Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
            final C0810A c0810a = new C0810A();
            ((ObservableSubscribeProxy) m33094as).subscribe(new InterfaceC23484g() { // from class: EZ2
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj) {
                    C03.m113060z0(Function1.this, obj);
                }
            });
        }
    }

    /* renamed from: k0 */
    public final void m113077k0() {
        List emptyList;
        AbstractC23442F m33158H;
        List emptyList2;
        Config value = this.f3212q.m82623f8().getValue();
        if (value.getTutorialV2().getEnabled()) {
            AbstractC23442F m33042m = this.f3206A.mo20264k0(5L).m33042m(AbstractC23442F.m33124k(new Callable() { // from class: uZ2
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    InterfaceC23447K m113076l0;
                    m113076l0 = C03.m113076l0(C03.this);
                    return m113076l0;
                }
            }));
            final C0815e c0815e = C0815e.f3227g;
            AbstractC23442F m33101w = m33042m.m33101w(new InterfaceC23484g() { // from class: wZ2
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj) {
                    C03.m113075m0(Function1.this, obj);
                }
            });
            final C0816f c0816f = C0816f.f3228g;
            AbstractC23442F m33157I = m33101w.m33157I(new InterfaceC23492o() { // from class: zZ2
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj) {
                    List m113074n0;
                    m113074n0 = C03.m113074n0(Function1.this, obj);
                    return m113074n0;
                }
            });
            emptyList2 = CollectionsKt__CollectionsKt.emptyList();
            m33158H = m33157I.m33148R(emptyList2);
            Intrinsics.checkNotNullExpressionValue(m33158H, "{\n      configurableTuto…rnItem(emptyList())\n    }");
        } else {
            emptyList = CollectionsKt__CollectionsKt.emptyList();
            m33158H = AbstractC23442F.m33158H(emptyList);
            Intrinsics.checkNotNullExpressionValue(m33158H, "{\n      Single.just(emptyList())\n    }");
        }
        Object m33135e = m33158H.m33135e(AutoDispose.m45239a(this.f3209n));
        Intrinsics.checkExpressionValueIsNotNull(m33135e, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C0817g c0817g = new C0817g(value);
        ((SingleSubscribeProxy) m33135e).subscribe(new InterfaceC23484g() { // from class: CZ2
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C03.m113073o0(Function1.this, obj);
            }
        });
    }
}
