package p000;

import android.content.Intent;
import android.os.Build;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.DialogResponse;
import co.bird.android.model.RideState;
import co.bird.android.model.constant.Permission;
import co.bird.android.model.constant.PhysicalLockPurpose;
import co.bird.android.model.itemlease.ItemLease;
import co.bird.android.model.itemlease.LeaseReturnResponse;
import co.bird.android.model.itemlease.LeaseStartResponse;
import co.bird.android.model.itemlease.LeaseSubmitAssetResponse;
import co.bird.android.model.itemlease.p022enum.ItemLeaseAssetPurpose;
import co.bird.android.model.itemlease.p022enum.ItemLeaseType;
import co.bird.android.model.wire.WireBird;
import co.bird.android.model.wire.WirePhysicalLock;
import co.bird.android.model.wire.WirePhysicalLockTutorialStep;
import co.bird.android.model.wire.WireRide;
import co.bird.android.model.wire.WireSmartlock;
import co.bird.android.model.wire.configs.Config;
import co.bird.android.model.wire.configs.LeaseTypeConfig;
import com.facebook.share.internal.C17296a;
import com.stripe.android.stripe3ds2.transactions.MessageExtension;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.CompletableSubscribeProxy;
import com.uber.autodispose.ObservableSubscribeProxy;
import com.uber.autodispose.ScopeProvider;
import io.reactivex.AbstractC23442F;
import io.reactivex.AbstractC23461c;
import io.reactivex.AbstractC24490k;
import io.reactivex.InterfaceC23434B;
import io.reactivex.InterfaceC23447K;
import io.reactivex.InterfaceC23496h;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.C23454a;
import io.reactivex.disposables.InterfaceC23465c;
import io.reactivex.functions.InterfaceC23478a;
import io.reactivex.functions.InterfaceC23480c;
import io.reactivex.functions.InterfaceC23481d;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.functions.InterfaceC23492o;
import io.reactivex.functions.InterfaceC23494q;
import io.reactivex.schedulers.C24542a;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Callable;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt___RangesKt;
import p000.InterfaceC34441Mc2;
import p000.InterfaceC40099e13;
import p000.InterfaceC46193oI5;
import p000.InterfaceC5225MD;
import p000.RK1;
@Metadata(m28433d1 = {"\u0000¾\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0007\u0018\u0000 [2\u00020\u0001:\u0001 B{\b\u0007\u0012\u0006\u0010\"\u001a\u00020\u001f\u0012\u0006\u0010&\u001a\u00020#\u0012\u0006\u0010*\u001a\u00020'\u0012\u0006\u0010.\u001a\u00020+\u0012\u0006\u00102\u001a\u00020/\u0012\u0006\u00106\u001a\u000203\u0012\u0006\u0010:\u001a\u000207\u0012\u0006\u0010>\u001a\u00020;\u0012\u0006\u0010B\u001a\u00020?\u0012\u0006\u0010F\u001a\u00020C\u0012\u0006\u0010J\u001a\u00020G\u0012\u0006\u0010N\u001a\u00020K\u0012\u0006\u0010R\u001a\u00020O\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\bY\u0010ZJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u001a\u0010\n\u001a\u00020\t*\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u000b\u001a\u00020\u0004H\u0002J\u0010\u0010\u000e\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\fH\u0002J\u0010\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000fH\u0002J\u0018\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0012H\u0002J\b\u0010\u0015\u001a\u00020\u0004H\u0002J\u0006\u0010\u0016\u001a\u00020\u0004J\u0006\u0010\u0017\u001a\u00020\u0004J\u0006\u0010\u0018\u001a\u00020\u0004J \u0010\u001e\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u00192\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cR\u0014\u0010\"\u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010&\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010*\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010.\u001a\u00020+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u00102\u001a\u00020/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0014\u00106\u001a\u0002038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u0014\u0010:\u001a\u0002078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u0014\u0010>\u001a\u00020;8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=R\u0014\u0010B\u001a\u00020?8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010AR\u0014\u0010F\u001a\u00020C8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010ER\u0014\u0010J\u001a\u00020G8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010IR\u0014\u0010N\u001a\u00020K8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bL\u0010MR\u0014\u0010R\u001a\u00020O8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bP\u0010QR\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bS\u0010TR\u0014\u0010X\u001a\u00020U8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bV\u0010W¨\u0006\\"}, m28432d2 = {"LRK1;", "", "Lco/bird/android/model/wire/WireBird;", "bird", "", "t0", "T", "Lio/reactivex/Observable;", "LTk5;", "Lio/reactivex/c;", "G", "K", "Lco/bird/android/model/wire/WirePhysicalLock;", "physicalLock", "y0", "", "throwable", "r0", "", "resolution", "s0", "m0", "f0", "g0", "b0", "", "requestCode", "resultCode", "Landroid/content/Intent;", MessageExtension.FIELD_DATA, "a0", "LMc2;", C17296a.f69688o, "LMc2;", "itemLeaseManager", "LhF5;", "b", "LhF5;", "smartLockManager", "LoI5;", "c", "LoI5;", "smartlockManager", "LaM;", DateTokenConverter.CONVERTER_KEY, "LaM;", "birdManager", "LXK1;", "e", "LXK1;", "ui", "Lcom/uber/autodispose/ScopeProvider;", "f", "Lcom/uber/autodispose/ScopeProvider;", "scopeProvider", "Le13;", "g", "Le13;", "navigator", "Lgl;", "h", "Lgl;", "appPreference", "LTq4;", "i", "LTq4;", "reactiveConfig", "LEa;", "j", "LEa;", "analyticsManager", "LMD;", "k", "LMD;", "rxBluetoothManager", "LDQ3;", "l", "LDQ3;", "permissionManager", "LYR4;", "m", "LYR4;", "rideManager", "n", "Lco/bird/android/model/wire/WireBird;", "", "S", "()Z", "isMandatory", "<init>", "(LMc2;LhF5;LoI5;LaM;LXK1;Lcom/uber/autodispose/ScopeProvider;Le13;Lgl;LTq4;LEa;LMD;LDQ3;LYR4;Lco/bird/android/model/wire/WireBird;)V", "o", "co.bird.android.feature.item-lease"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nHelmetLeaseUnlockTutorialPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HelmetLeaseUnlockTutorialPresenter.kt\nco/bird/android/feature/itemlease/onboarding/HelmetLeaseUnlockTutorialPresenter\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 5 Observables.kt\nco/bird/android/library/rx/Observables\n*L\n1#1,486:1\n180#2:487\n237#2:488\n237#2:490\n237#2:491\n237#2:492\n180#2:497\n180#2:498\n180#2:501\n180#2:502\n1#3:489\n288#4,2:493\n288#4,2:499\n52#5,2:495\n*S KotlinDebug\n*F\n+ 1 HelmetLeaseUnlockTutorialPresenter.kt\nco/bird/android/feature/itemlease/onboarding/HelmetLeaseUnlockTutorialPresenter\n*L\n108#1:487\n128#1:488\n161#1:490\n212#1:491\n267#1:492\n360#1:497\n376#1:498\n460#1:501\n476#1:502\n323#1:493,2\n445#1:499,2\n353#1:495,2\n*E\n"})
/* renamed from: RK1 */
/* loaded from: classes3.dex */
public final class RK1 {

    /* renamed from: o */
    public static final C7119a f31837o = new C7119a(null);

    /* renamed from: a */
    public final InterfaceC34441Mc2 f31838a;

    /* renamed from: b */
    public final InterfaceC42015hF5 f31839b;

    /* renamed from: c */
    public final InterfaceC46193oI5 f31840c;

    /* renamed from: d */
    public final InterfaceC10636aM f31841d;

    /* renamed from: e */
    public final XK1 f31842e;

    /* renamed from: f */
    public final ScopeProvider f31843f;

    /* renamed from: g */
    public final InterfaceC40099e13 f31844g;

    /* renamed from: h */
    public final C22454gl f31845h;

    /* renamed from: i */
    public final C36207Tq4 f31846i;

    /* renamed from: j */
    public final InterfaceC1880Ea f31847j;

    /* renamed from: k */
    public final InterfaceC5225MD f31848k;

    /* renamed from: l */
    public final DQ3 f31849l;

    /* renamed from: m */
    public final YR4 f31850m;

    /* renamed from: n */
    public final WireBird f31851n;

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: RK1$A */
    /* loaded from: classes3.dex */
    public static final class C7113A extends Lambda implements Function1<Throwable, Unit> {

        /* renamed from: g */
        public static final C7113A f31852g = new C7113A();

        public C7113A() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            C41318g46.m40158f(th, "Error while handling continue button click", new Object[0]);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/itemlease/LeaseStartResponse;", "it", "Lio/reactivex/h;", "kotlin.jvm.PlatformType", "b", "(Lco/bird/android/model/itemlease/LeaseStartResponse;)Lio/reactivex/h;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: RK1$B */
    /* loaded from: classes3.dex */
    public static final class C7114B extends Lambda implements Function1<LeaseStartResponse, InterfaceC23496h> {

        /* renamed from: h */
        public final /* synthetic */ WireBird f31854h;

        @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: RK1$B$a */
        /* loaded from: classes3.dex */
        public static final class C7115a extends Lambda implements Function1<Throwable, Unit> {

            /* renamed from: g */
            public static final C7115a f31855g = new C7115a();

            public C7115a() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                invoke2(th);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(Throwable th) {
                C41318g46.m40158f(th, "Error while attempting to unlock helmet lock via API, ignoring and continuing", new Object[0]);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C7114B(WireBird wireBird) {
            super(1);
            this.f31854h = wireBird;
        }

        public static final void invoke$lambda$0(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            tmp0.invoke(obj);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b */
        public final InterfaceC23496h invoke(LeaseStartResponse it) {
            Intrinsics.checkNotNullParameter(it, "it");
            AbstractC23461c m33065U = RK1.this.f31841d.mo71602G0(this.f31854h.getId()).m33065U(3L);
            final C7115a c7115a = C7115a.f31855g;
            return m33065U.m33084B(new InterfaceC23484g() { // from class: VK1
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj) {
                    RK1.C7114B.invoke$lambda$0(Function1.this, obj);
                }
            }).m33069Q();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"", "it", "Lio/reactivex/h;", "kotlin.jvm.PlatformType", "b", "(Ljava/lang/Throwable;)Lio/reactivex/h;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: RK1$C */
    /* loaded from: classes3.dex */
    public static final class C7116C extends Lambda implements Function1<Throwable, InterfaceC23496h> {

        /* renamed from: h */
        public final /* synthetic */ WireBird f31857h;

        @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/DialogResponse;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lco/bird/android/model/DialogResponse;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: RK1$C$a */
        /* loaded from: classes3.dex */
        public static final class C7117a extends Lambda implements Function1<DialogResponse, Unit> {

            /* renamed from: g */
            public final /* synthetic */ RK1 f31858g;

            /* renamed from: h */
            public final /* synthetic */ WireBird f31859h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C7117a(RK1 rk1, WireBird wireBird) {
                super(1);
                this.f31858g = rk1;
                this.f31859h = wireBird;
            }

            /* renamed from: a */
            public final void m86873a(DialogResponse dialogResponse) {
                this.f31858g.f31838a.mo55657q(this.f31859h, ItemLeaseType.HELMET);
                this.f31858g.f31844g.mo37077W0(InterfaceC40099e13.EnumC19925b.RESULT_CANCELED, new Pair[0]);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(DialogResponse dialogResponse) {
                m86873a(dialogResponse);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C7116C(WireBird wireBird) {
            super(1);
            this.f31857h = wireBird;
        }

        public static final void invoke$lambda$0(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            tmp0.invoke(obj);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b */
        public final InterfaceC23496h invoke(Throwable it) {
            Intrinsics.checkNotNullParameter(it, "it");
            C41318g46.m40158f(it, "Error while attempting to call start lease API, showing dialog and canceling flow", new Object[0]);
            AbstractC23442F<DialogResponse> birdDialog = RK1.this.f31842e.birdDialog(C47905rB1.f106655d, false, true);
            final C7117a c7117a = new C7117a(RK1.this, this.f31857h);
            return birdDialog.m33101w(new InterfaceC23484g() { // from class: WK1
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj) {
                    RK1.C7116C.invoke$lambda$0(Function1.this, obj);
                }
            }).m33159G().m33049i(AbstractC23461c.m33080F(it));
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: RK1$D */
    /* loaded from: classes3.dex */
    public static final class C7118D extends Lambda implements Function1<Throwable, Unit> {

        /* renamed from: g */
        public static final C7118D f31860g = new C7118D();

        public C7118D() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            C41318g46.m40158f(th, "Error while attempting to unlock okai clip and start lease", new Object[0]);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000b"}, m28432d2 = {"LRK1$a;", "", "", "RESOLUTION_DECLINED", "Ljava/lang/String;", "RESOLUTION_STARTED", "", "SMARTLOCK_ZENDESK_ARTICLE_ID", "J", "<init>", "()V", "co.bird.android.feature.item-lease"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: RK1$a */
    /* loaded from: classes3.dex */
    public static final class C7119a {
        public /* synthetic */ C7119a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C7119a() {
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a*\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00000\u0000 \u0003*\u0014\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00000\u0000\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"LTk5;", "scanResult", "Lio/reactivex/K;", "kotlin.jvm.PlatformType", "b", "(LTk5;)Lio/reactivex/K;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: RK1$b */
    /* loaded from: classes3.dex */
    public static final class C7120b extends Lambda implements Function1<C36154Tk5, InterfaceC23447K<? extends C36154Tk5>> {

        /* renamed from: h */
        public final /* synthetic */ WireBird f31862h;

        @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/itemlease/LeaseStartResponse;", "it", "LTk5;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/model/itemlease/LeaseStartResponse;)LTk5;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: RK1$b$a */
        /* loaded from: classes3.dex */
        public static final class C7121a extends Lambda implements Function1<LeaseStartResponse, C36154Tk5> {

            /* renamed from: g */
            public final /* synthetic */ C36154Tk5 f31863g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C7121a(C36154Tk5 c36154Tk5) {
                super(1);
                this.f31863g = c36154Tk5;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final C36154Tk5 invoke(LeaseStartResponse it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return this.f31863g;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C7120b(WireBird wireBird) {
            super(1);
            this.f31862h = wireBird;
        }

        /* renamed from: c */
        public static final C36154Tk5 m86870c(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (C36154Tk5) tmp0.invoke(obj);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b */
        public final InterfaceC23447K<? extends C36154Tk5> invoke(C36154Tk5 scanResult) {
            Intrinsics.checkNotNullParameter(scanResult, "scanResult");
            C41318g46.m40163a("scanned bird smart lock, starting lease if necessary before unlocking", new Object[0]);
            if (RK1.this.f31838a.mo55666l(this.f31862h, ItemLeaseType.HELMET)) {
                return AbstractC23442F.m33158H(scanResult);
            }
            RK1.this.f31850m.mo75022y();
            AbstractC23442F<LeaseStartResponse> mo55704E = RK1.this.f31838a.mo55704E(this.f31862h);
            final C7121a c7121a = new C7121a(scanResult);
            return mo55704E.m33157I(new InterfaceC23492o() { // from class: SK1
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj) {
                    C36154Tk5 m86870c;
                    m86870c = RK1.C7120b.m86870c(Function1.this, obj);
                    return m86870c;
                }
            });
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"LTk5;", "scanResult", "Lio/reactivex/h;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(LTk5;)Lio/reactivex/h;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: RK1$c */
    /* loaded from: classes3.dex */
    public static final class C7122c extends Lambda implements Function1<C36154Tk5, InterfaceC23496h> {

        /* renamed from: h */
        public final /* synthetic */ WireBird f31865h;

        /* renamed from: i */
        public final /* synthetic */ String f31866i;

        /* renamed from: j */
        public final /* synthetic */ WirePhysicalLock f31867j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C7122c(WireBird wireBird, String str, WirePhysicalLock wirePhysicalLock) {
            super(1);
            this.f31865h = wireBird;
            this.f31866i = str;
            this.f31867j = wirePhysicalLock;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC23496h invoke(C36154Tk5 scanResult) {
            int i;
            int coerceAtLeast;
            Integer num;
            Intrinsics.checkNotNullParameter(scanResult, "scanResult");
            Map<String, Integer> openAttemptCount = C36441Uq4.m80769c(RK1.this.f31846i, this.f31865h).getRideConfig().getSmartlockConfig().getOpenAttemptCount();
            if (openAttemptCount != null && (num = openAttemptCount.get(this.f31866i)) != null) {
                i = num.intValue();
            } else {
                i = 1;
            }
            C41318g46.m40163a("continuing unlocking now that lease has started", new Object[0]);
            InterfaceC46193oI5 interfaceC46193oI5 = RK1.this.f31840c;
            WirePhysicalLock wirePhysicalLock = this.f31867j;
            coerceAtLeast = RangesKt___RangesKt.coerceAtLeast(i, 1);
            return interfaceC46193oI5.mo21405b(scanResult, wirePhysicalLock, coerceAtLeast);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"", "throwable", "Lio/reactivex/h;", "kotlin.jvm.PlatformType", "b", "(Ljava/lang/Throwable;)Lio/reactivex/h;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: RK1$d */
    /* loaded from: classes3.dex */
    public static final class C7123d extends Lambda implements Function1<Throwable, InterfaceC23496h> {

        /* renamed from: h */
        public final /* synthetic */ WireBird f31869h;

        @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/DialogResponse;", "response", "Lio/reactivex/h;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/model/DialogResponse;)Lio/reactivex/h;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: RK1$d$a */
        /* loaded from: classes3.dex */
        public static final class C7124a extends Lambda implements Function1<DialogResponse, InterfaceC23496h> {

            /* renamed from: g */
            public final /* synthetic */ Throwable f31870g;

            /* renamed from: h */
            public final /* synthetic */ RK1 f31871h;

            /* renamed from: i */
            public final /* synthetic */ WireBird f31872i;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C7124a(Throwable th, RK1 rk1, WireBird wireBird) {
                super(1);
                this.f31870g = th;
                this.f31871h = rk1;
                this.f31872i = wireBird;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final InterfaceC23496h invoke(DialogResponse response) {
                Intrinsics.checkNotNullParameter(response, "response");
                if (response == DialogResponse.CANCEL) {
                    AbstractC23461c m33039p = AbstractC23461c.m33039p();
                    RK1 rk1 = this.f31871h;
                    WireBird wireBird = this.f31872i;
                    rk1.m86891s0(wireBird, "declined");
                    rk1.f31838a.mo55657q(wireBird, ItemLeaseType.HELMET);
                    rk1.f31844g.mo37077W0(InterfaceC40099e13.EnumC19925b.RESULT_CANCELED, new Pair[0]);
                    return m33039p;
                }
                return AbstractC23461c.m33080F(this.f31870g);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C7123d(WireBird wireBird) {
            super(1);
            this.f31869h = wireBird;
        }

        /* renamed from: c */
        public static final InterfaceC23496h m86865c(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (InterfaceC23496h) tmp0.invoke(obj);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b */
        public final InterfaceC23496h invoke(Throwable throwable) {
            Intrinsics.checkNotNullParameter(throwable, "throwable");
            RK1.this.m86893r0(throwable);
            C41318g46.m40158f(throwable, "Error while attempting to scan and start lease on lock", new Object[0]);
            AbstractC23442F<DialogResponse> birdDialog = RK1.this.f31842e.birdDialog(C48497sB1.f108424d, false, false);
            final C7124a c7124a = new C7124a(throwable, RK1.this, this.f31869h);
            return birdDialog.m33164B(new InterfaceC23492o() { // from class: TK1
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj) {
                    InterfaceC23496h m86865c;
                    m86865c = RK1.C7123d.m86865c(Function1.this, obj);
                    return m86865c;
                }
            });
        }
    }

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u00002\u0006\u0010\u0003\u001a\u00028\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"T1", "T2", "t1", "t2", "Lkotlin/Pair;", C17296a.f69688o, "(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nObservables.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Observables.kt\nco/bird/android/library/rx/Observables$combineLatest$1\n*L\n1#1,134:1\n*E\n"})
    /* renamed from: RK1$e */
    /* loaded from: classes3.dex */
    public static final class C7125e<T1, T2, R> implements InterfaceC23480c {

        /* renamed from: a */
        public static final C7125e<T1, T2, R> f31873a = new C7125e<>();

        @Override // io.reactivex.functions.InterfaceC23480c
        /* renamed from: a */
        public final Pair<T1, T2> apply(T1 t1, T2 t2) {
            return TuplesKt.m28425to(t1, t2);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012F\u0010\u0002\u001aB\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00010\u0001 \u0005* \u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00010\u0001\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, m28432d2 = {"<anonymous>", "", "<name for destructuring parameter 0>", "Lkotlin/Pair;", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: RK1$g */
    /* loaded from: classes3.dex */
    public static final class C7127g extends Lambda implements Function1<Pair<? extends Boolean, ? extends Unit>, Unit> {
        public C7127g() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Pair<? extends Boolean, ? extends Unit> pair) {
            invoke2((Pair<Boolean, Unit>) pair);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Pair<Boolean, Unit> pair) {
            Boolean hasActiveLease = pair.component1();
            Intrinsics.checkNotNullExpressionValue(hasActiveLease, "hasActiveLease");
            if (hasActiveLease.booleanValue()) {
                RK1 rk1 = RK1.this;
                rk1.m86891s0(rk1.f31851n, "started");
                C41318g46.m40163a("Active lease for bird detected, closing app", new Object[0]);
                RK1.this.f31838a.mo55657q(RK1.this.f31851n, ItemLeaseType.HELMET);
                RK1.this.f31844g.mo37077W0(InterfaceC40099e13.EnumC19925b.RESULT_OK, new Pair[0]);
            }
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: RK1$h */
    /* loaded from: classes3.dex */
    public static final class C7128h extends Lambda implements Function1<Throwable, Unit> {
        public C7128h() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable it) {
            RK1 rk1 = RK1.this;
            Intrinsics.checkNotNullExpressionValue(it, "it");
            rk1.m86893r0(it);
            C41318g46.m40158f(it, "Error while listening for lease state", new Object[0]);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"LMD$b;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(LMD$b;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: RK1$i */
    /* loaded from: classes3.dex */
    public static final class C7129i extends Lambda implements Function1<InterfaceC5225MD.EnumC5227b, Unit> {

        @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: RK1$i$a */
        /* loaded from: classes3.dex */
        public /* synthetic */ class C7130a {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[InterfaceC5225MD.EnumC5227b.values().length];
                try {
                    iArr[InterfaceC5225MD.EnumC5227b.BLUETOOTH_NOT_AVAILABLE.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[InterfaceC5225MD.EnumC5227b.LOCATION_PERMISSION_NOT_GRANTED.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[InterfaceC5225MD.EnumC5227b.LOCATION_SERVICES_NOT_ENABLED.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[InterfaceC5225MD.EnumC5227b.BLUETOOTH_NOT_ENABLED.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[InterfaceC5225MD.EnumC5227b.READY.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[InterfaceC5225MD.EnumC5227b.UNKNOWN.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public C7129i() {
            super(1);
        }

        /* renamed from: a */
        public final void m86862a(InterfaceC5225MD.EnumC5227b enumC5227b) {
            int i;
            Integer valueOf;
            int i2;
            if (enumC5227b == null) {
                i = -1;
            } else {
                i = C7130a.$EnumSwitchMapping$0[enumC5227b.ordinal()];
            }
            switch (i) {
                case -1:
                case 6:
                    valueOf = Integer.valueOf(C45871nl4.an_unknown_bluetooth_error_occurred);
                    break;
                case 0:
                default:
                    throw new NoWhenBranchMatchedException();
                case 1:
                    valueOf = Integer.valueOf(C45871nl4.your_device_does_not_support_bluetooth);
                    break;
                case 2:
                    if (Build.VERSION.SDK_INT < 31) {
                        i2 = C45871nl4.auth_bluetooth;
                    } else {
                        i2 = C45871nl4.auth_bluetooth_android_12_plus;
                    }
                    valueOf = Integer.valueOf(i2);
                    break;
                case 3:
                    valueOf = Integer.valueOf(C45871nl4.bluetooth_requires_location);
                    break;
                case 4:
                    valueOf = Integer.valueOf(C45871nl4.turn_on_bluetooth_to_continue);
                    break;
                case 5:
                    valueOf = null;
                    break;
            }
            RK1.this.f31842e.m77115Xl(valueOf);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC5225MD.EnumC5227b enumC5227b) {
            m86862a(enumC5227b);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: RK1$j */
    /* loaded from: classes3.dex */
    public static final class C7131j extends Lambda implements Function1<Throwable, Unit> {

        /* renamed from: g */
        public static final C7131j f31878g = new C7131j();

        public C7131j() {
            super(1);
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"<anonymous>", "", "kotlin.jvm.PlatformType", "it", "Lco/bird/android/model/wire/configs/Config;", "invoke", "(Lco/bird/android/model/wire/configs/Config;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: RK1$k */
    /* loaded from: classes3.dex */
    public static final class C7132k extends Lambda implements Function1<Config, Boolean> {

        /* renamed from: g */
        public static final C7132k f31879g = new C7132k();

        public C7132k() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(Config it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Boolean.valueOf(Intrinsics.areEqual(it.getRideConfig().getSmartlockConfig().getEnableV2(), Boolean.TRUE));
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0007\u001a*\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"", "smartLockV2Enabled", "Lio/reactivex/B;", "", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/Boolean;)Lio/reactivex/B;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: RK1$l */
    /* loaded from: classes3.dex */
    public static final class C7133l extends Lambda implements Function1<Boolean, InterfaceC23434B<? extends Unit>> {

        /* renamed from: h */
        public final /* synthetic */ WirePhysicalLock f31881h;

        @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"LvE5;", "it", "", C17296a.f69688o, "(LvE5;)Lkotlin/Unit;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: RK1$l$a */
        /* loaded from: classes3.dex */
        public static final class C7134a extends Lambda implements Function1<C50306vE5, Unit> {

            /* renamed from: g */
            public static final C7134a f31882g = new C7134a();

            public C7134a() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final Unit invoke(C50306vE5 it) {
                Intrinsics.checkNotNullParameter(it, "it");
                if (it.m8985b() == EnumC50899wE5.UNLOCKED) {
                    return Unit.INSTANCE;
                }
                return null;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C7133l(WirePhysicalLock wirePhysicalLock) {
            super(1);
            this.f31881h = wirePhysicalLock;
        }

        @Override // kotlin.jvm.functions.Function1
        public final InterfaceC23434B<? extends Unit> invoke(Boolean smartLockV2Enabled) {
            WireSmartlock smartlock;
            Intrinsics.checkNotNullParameter(smartLockV2Enabled, "smartLockV2Enabled");
            if (smartLockV2Enabled.booleanValue()) {
                InterfaceC42015hF5 interfaceC42015hF5 = RK1.this.f31839b;
                WirePhysicalLock wirePhysicalLock = this.f31881h;
                String macAddress = (wirePhysicalLock == null || (smartlock = wirePhysicalLock.getSmartlock()) == null) ? null : smartlock.getMacAddress();
                Intrinsics.checkNotNull(macAddress);
                return C37279Yf5.m74578Q(interfaceC42015hF5.mo19728d(macAddress), C7134a.f31882g).m32113r1();
            }
            return RK1.this.f31840c.mo21401f();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"LFQ3;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(LFQ3;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: RK1$m */
    /* loaded from: classes3.dex */
    public static final class C7135m extends Lambda implements Function1<FQ3, Unit> {

        /* renamed from: g */
        public static final C7135m f31883g = new C7135m();

        public C7135m() {
            super(1);
        }

        /* renamed from: a */
        public final void m86860a(FQ3 fq3) {
            if (!fq3.m107154a()) {
                C41318g46.m40151m("User denied post bluetooth connect permission!", new Object[0]);
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(FQ3 fq3) {
            m86860a(fq3);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"LFQ3;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(LFQ3;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: RK1$n */
    /* loaded from: classes3.dex */
    public static final class C7136n extends Lambda implements Function1<FQ3, Unit> {

        /* renamed from: g */
        public static final C7136n f31884g = new C7136n();

        public C7136n() {
            super(1);
        }

        /* renamed from: a */
        public final void m86859a(FQ3 fq3) {
            if (!fq3.m107154a()) {
                C41318g46.m40151m("User denied post bluetooth connect permission!", new Object[0]);
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(FQ3 fq3) {
            m86859a(fq3);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a*\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"LMD$b;", "it", "Lio/reactivex/K;", "LTk5;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(LMD$b;)Lio/reactivex/K;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: RK1$o */
    /* loaded from: classes3.dex */
    public static final class C7137o extends Lambda implements Function1<InterfaceC5225MD.EnumC5227b, InterfaceC23447K<? extends C36154Tk5>> {

        /* renamed from: g */
        public final /* synthetic */ WireBird f31885g;

        /* renamed from: h */
        public final /* synthetic */ WirePhysicalLock f31886h;

        /* renamed from: i */
        public final /* synthetic */ RK1 f31887i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C7137o(WireBird wireBird, WirePhysicalLock wirePhysicalLock, RK1 rk1) {
            super(1);
            this.f31885g = wireBird;
            this.f31886h = wirePhysicalLock;
            this.f31887i = rk1;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC23447K<? extends C36154Tk5> invoke(InterfaceC5225MD.EnumC5227b it) {
            String str;
            WireSmartlock smartlock;
            Intrinsics.checkNotNullParameter(it, "it");
            if (it == InterfaceC5225MD.EnumC5227b.READY) {
                String code = this.f31885g.getCode();
                WirePhysicalLock wirePhysicalLock = this.f31886h;
                if (wirePhysicalLock != null && (smartlock = wirePhysicalLock.getSmartlock()) != null) {
                    str = smartlock.getMacAddress();
                } else {
                    str = null;
                }
                C41318g46.m40163a("Starting scan for bird " + code + " with smart lock " + str, new Object[0]);
                return InterfaceC46193oI5.C26897b.startScanning$default(this.f31887i.f31840c, this.f31886h, null, null, 6, null);
            }
            C41318g46.m40163a("BLE state not ready, not scanning for physical locks", new Object[0]);
            return AbstractC23442F.m33153M();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: RK1$p */
    /* loaded from: classes3.dex */
    public static final class C7138p extends Lambda implements Function1<Throwable, Unit> {

        /* renamed from: g */
        public static final C7138p f31888g = new C7138p();

        public C7138p() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            C41318g46.m40161c(th, "smart lock error encountered, ignoring. ", new Object[0]);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a*\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lco/bird/android/model/itemlease/LeaseSubmitAssetResponse;", "it", "Lio/reactivex/K;", "Lco/bird/android/model/itemlease/LeaseReturnResponse;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/model/itemlease/LeaseSubmitAssetResponse;)Lio/reactivex/K;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: RK1$q */
    /* loaded from: classes3.dex */
    public static final class C7139q extends Lambda implements Function1<LeaseSubmitAssetResponse, InterfaceC23447K<? extends LeaseReturnResponse>> {

        /* renamed from: h */
        public final /* synthetic */ ItemLease f31890h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C7139q(ItemLease itemLease) {
            super(1);
            this.f31890h = itemLease;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC23447K<? extends LeaseReturnResponse> invoke(LeaseSubmitAssetResponse it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return RK1.this.f31838a.mo55654u(this.f31890h.getId());
        }
    }

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"", "Lco/bird/android/model/itemlease/ItemLease;", "list", C17296a.f69688o, "(Ljava/util/List;)Lco/bird/android/model/itemlease/ItemLease;"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nHelmetLeaseUnlockTutorialPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HelmetLeaseUnlockTutorialPresenter.kt\nco/bird/android/feature/itemlease/onboarding/HelmetLeaseUnlockTutorialPresenter$onResume$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,486:1\n288#2,2:487\n*S KotlinDebug\n*F\n+ 1 HelmetLeaseUnlockTutorialPresenter.kt\nco/bird/android/feature/itemlease/onboarding/HelmetLeaseUnlockTutorialPresenter$onResume$2\n*L\n99#1:487,2\n*E\n"})
    /* renamed from: RK1$r */
    /* loaded from: classes3.dex */
    public static final class C7140r extends Lambda implements Function1<List<? extends ItemLease>, ItemLease> {
        public C7140r() {
            super(1);
        }

        /* JADX WARN: Removed duplicated region for block: B:23:0x004b A[SYNTHETIC] */
        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final ItemLease invoke(List<ItemLease> list) {
            Object obj;
            String str;
            boolean z;
            Intrinsics.checkNotNullParameter(list, "list");
            RK1 rk1 = RK1.this;
            Iterator<T> it = list.iterator();
            while (true) {
                obj = null;
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                ItemLease itemLease = (ItemLease) next;
                WireBird wireBird = rk1.f31851n;
                if (wireBird != null) {
                    str = wireBird.getId();
                } else {
                    str = null;
                }
                if (!Intrinsics.areEqual(str, itemLease.getAssociatedItemId())) {
                    WireBird wireBird2 = rk1.f31851n;
                    if (wireBird2 != null) {
                        obj = wireBird2.getEphemeralId();
                    }
                    if (!Intrinsics.areEqual(obj, itemLease.getAssociatedItemId())) {
                        z = false;
                        continue;
                        if (z) {
                            obj = next;
                            break;
                        }
                    }
                }
                z = true;
                continue;
                if (z) {
                }
            }
            return (ItemLease) obj;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/itemlease/ItemLease;", "t1", "t2", "", C17296a.f69688o, "(Lco/bird/android/model/itemlease/ItemLease;Lco/bird/android/model/itemlease/ItemLease;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: RK1$s */
    /* loaded from: classes3.dex */
    public static final class C7141s extends Lambda implements Function2<ItemLease, ItemLease, Boolean> {

        /* renamed from: g */
        public static final C7141s f31892g = new C7141s();

        public C7141s() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a */
        public final Boolean invoke(ItemLease t1, ItemLease t2) {
            Intrinsics.checkNotNullParameter(t1, "t1");
            Intrinsics.checkNotNullParameter(t2, "t2");
            return Boolean.valueOf(Intrinsics.areEqual(t1.getId(), t2.getId()));
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a*\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lco/bird/android/model/itemlease/ItemLease;", "it", "Lio/reactivex/K;", "LvE5;", "kotlin.jvm.PlatformType", "b", "(Lco/bird/android/model/itemlease/ItemLease;)Lio/reactivex/K;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: RK1$t */
    /* loaded from: classes3.dex */
    public static final class C7142t extends Lambda implements Function1<ItemLease, InterfaceC23447K<? extends C50306vE5>> {

        @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"LvE5;", "it", "", C17296a.f69688o, "(LvE5;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: RK1$t$a */
        /* loaded from: classes3.dex */
        public static final class C7143a extends Lambda implements Function1<C50306vE5, Boolean> {

            /* renamed from: g */
            public static final C7143a f31894g = new C7143a();

            public C7143a() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final Boolean invoke(C50306vE5 it) {
                boolean z;
                Intrinsics.checkNotNullParameter(it, "it");
                if (it.m8985b() == EnumC50899wE5.UNLOCKED) {
                    z = true;
                } else {
                    z = false;
                }
                return Boolean.valueOf(z);
            }
        }

        public C7142t() {
            super(1);
        }

        public static final boolean invoke$lambda$0(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return ((Boolean) tmp0.invoke(obj)).booleanValue();
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b */
        public final InterfaceC23447K<? extends C50306vE5> invoke(ItemLease it) {
            String str;
            List<WirePhysicalLock> physicalLocks;
            Object firstOrNull;
            WireSmartlock smartlock;
            Intrinsics.checkNotNullParameter(it, "it");
            C41318g46.m40163a("detected active lease created for lock, waiting for smartlock unlock event before closing", new Object[0]);
            InterfaceC42015hF5 interfaceC42015hF5 = RK1.this.f31839b;
            WireBird wireBird = RK1.this.f31851n;
            if (wireBird != null && (physicalLocks = wireBird.getPhysicalLocks()) != null) {
                firstOrNull = CollectionsKt___CollectionsKt.firstOrNull((List<? extends Object>) physicalLocks);
                WirePhysicalLock wirePhysicalLock = (WirePhysicalLock) firstOrNull;
                if (wirePhysicalLock != null && (smartlock = wirePhysicalLock.getSmartlock()) != null) {
                    str = smartlock.getMacAddress();
                    Intrinsics.checkNotNull(str);
                    AbstractC24490k<C50306vE5> mo19728d = interfaceC42015hF5.mo19728d(str);
                    final C7143a c7143a = C7143a.f31894g;
                    return mo19728d.m32175S(new InterfaceC23494q() { // from class: UK1
                        @Override // io.reactivex.functions.InterfaceC23494q
                        public final boolean test(Object obj) {
                            boolean invoke$lambda$0;
                            invoke$lambda$0 = RK1.C7142t.invoke$lambda$0(Function1.this, obj);
                            return invoke$lambda$0;
                        }
                    }).m32169V();
                }
            }
            str = null;
            Intrinsics.checkNotNull(str);
            AbstractC24490k<C50306vE5> mo19728d2 = interfaceC42015hF5.mo19728d(str);
            final Function1 c7143a2 = C7143a.f31894g;
            return mo19728d2.m32175S(new InterfaceC23494q() { // from class: UK1
                @Override // io.reactivex.functions.InterfaceC23494q
                public final boolean test(Object obj) {
                    boolean invoke$lambda$0;
                    invoke$lambda$0 = RK1.C7142t.invoke$lambda$0(Function1.this, obj);
                    return invoke$lambda$0;
                }
            }).m32169V();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"LvE5;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(LvE5;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: RK1$u */
    /* loaded from: classes3.dex */
    public static final class C7144u extends Lambda implements Function1<C50306vE5, Unit> {
        public C7144u() {
            super(1);
        }

        /* renamed from: a */
        public final void m86851a(C50306vE5 c50306vE5) {
            C41318g46.m40163a("received smartlock unlock event, marking as lease start complete", new Object[0]);
            if (RK1.this.f31851n != null) {
                RK1 rk1 = RK1.this;
                rk1.m86891s0(rk1.f31851n, "started");
                rk1.f31838a.mo55657q(rk1.f31851n, ItemLeaseType.HELMET);
            }
            C41318g46.m40163a("Active lease for bird detected in new flow, closing app", new Object[0]);
            RK1.this.f31844g.mo37077W0(InterfaceC40099e13.EnumC19925b.RESULT_OK, new Pair[0]);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C50306vE5 c50306vE5) {
            m86851a(c50306vE5);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: RK1$v */
    /* loaded from: classes3.dex */
    public static final class C7145v extends Lambda implements Function1<Throwable, Unit> {

        /* renamed from: g */
        public static final C7145v f31896g = new C7145v();

        public C7145v() {
            super(1);
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: RK1$w */
    /* loaded from: classes3.dex */
    public static final class C7146w extends Lambda implements Function1<Throwable, Unit> {

        /* renamed from: g */
        public static final C7146w f31897g = new C7146w();

        public C7146w() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            C41318g46.m40161c(th, "Error while attempting to continue connecting to physical lock", new Object[0]);
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0003*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"<anonymous>", "", "it", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: RK1$x */
    /* loaded from: classes3.dex */
    public static final class C7147x extends Lambda implements Function1<Unit, Unit> {
        public C7147x() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Unit unit) {
            invoke2(unit);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Unit unit) {
            InterfaceC1880Ea interfaceC1880Ea = RK1.this.f31847j;
            String name = RK1.this.f31845h.m37575s0().getUserRole().name();
            Locale locale = Locale.getDefault();
            Intrinsics.checkNotNullExpressionValue(locale, "getDefault()");
            String lowerCase = name.toLowerCase(locale);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            interfaceC1880Ea.mo55905y(new GL1(null, null, null, "helmet_lease", lowerCase, "zendesk", false, false, "360030668292", false, 7, null));
            RK1.this.f31844g.mo36922w3(360030668292L);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: RK1$y */
    /* loaded from: classes3.dex */
    public static final class C7148y extends Lambda implements Function1<Throwable, Unit> {

        /* renamed from: g */
        public static final C7148y f31899g = new C7148y();

        public C7148y() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            C41318g46.m40158f(th, "Error while handling help button click", new Object[0]);
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0003*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"<anonymous>", "", "it", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    @SourceDebugExtension({"SMAP\nHelmetLeaseUnlockTutorialPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HelmetLeaseUnlockTutorialPresenter.kt\nco/bird/android/feature/itemlease/onboarding/HelmetLeaseUnlockTutorialPresenter$setupClickListeners$3\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,486:1\n1#2:487\n*E\n"})
    /* renamed from: RK1$z */
    /* loaded from: classes3.dex */
    public static final class C7149z extends Lambda implements Function1<Unit, Unit> {
        public C7149z() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Unit unit) {
            invoke2(unit);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Unit unit) {
            if (RK1.this.f31851n != null) {
                RK1 rk1 = RK1.this;
                rk1.f31838a.mo55657q(rk1.f31851n, ItemLeaseType.HELMET);
            }
            RK1.this.f31844g.mo37077W0(InterfaceC40099e13.EnumC19925b.RESULT_OK, new Pair[0]);
        }
    }

    public RK1(InterfaceC34441Mc2 itemLeaseManager, InterfaceC42015hF5 smartLockManager, InterfaceC46193oI5 smartlockManager, InterfaceC10636aM birdManager, XK1 ui, ScopeProvider scopeProvider, InterfaceC40099e13 navigator, C22454gl appPreference, C36207Tq4 reactiveConfig, InterfaceC1880Ea analyticsManager, InterfaceC5225MD rxBluetoothManager, DQ3 permissionManager, YR4 rideManager, WireBird wireBird) {
        Intrinsics.checkNotNullParameter(itemLeaseManager, "itemLeaseManager");
        Intrinsics.checkNotNullParameter(smartLockManager, "smartLockManager");
        Intrinsics.checkNotNullParameter(smartlockManager, "smartlockManager");
        Intrinsics.checkNotNullParameter(birdManager, "birdManager");
        Intrinsics.checkNotNullParameter(ui, "ui");
        Intrinsics.checkNotNullParameter(scopeProvider, "scopeProvider");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(appPreference, "appPreference");
        Intrinsics.checkNotNullParameter(reactiveConfig, "reactiveConfig");
        Intrinsics.checkNotNullParameter(analyticsManager, "analyticsManager");
        Intrinsics.checkNotNullParameter(rxBluetoothManager, "rxBluetoothManager");
        Intrinsics.checkNotNullParameter(permissionManager, "permissionManager");
        Intrinsics.checkNotNullParameter(rideManager, "rideManager");
        this.f31838a = itemLeaseManager;
        this.f31839b = smartLockManager;
        this.f31840c = smartlockManager;
        this.f31841d = birdManager;
        this.f31842e = ui;
        this.f31843f = scopeProvider;
        this.f31844g = navigator;
        this.f31845h = appPreference;
        this.f31846i = reactiveConfig;
        this.f31847j = analyticsManager;
        this.f31848k = rxBluetoothManager;
        this.f31849l = permissionManager;
        this.f31850m = rideManager;
        this.f31851n = wireBird;
    }

    /* renamed from: H */
    public static final InterfaceC23447K m86947H(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: I */
    public static final InterfaceC23496h m86946I(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23496h) tmp0.invoke(obj);
    }

    /* renamed from: J */
    public static final InterfaceC23496h m86945J(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23496h) tmp0.invoke(obj);
    }

    /* renamed from: L */
    public static final Boolean m86943L(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (Boolean) tmp0.invoke(obj);
    }

    /* renamed from: M */
    public static final InterfaceC23434B m86942M(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23434B) tmp0.invoke(obj);
    }

    /* renamed from: N */
    public static final Boolean m86941N(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (Boolean) tmp0.invoke(obj);
    }

    /* renamed from: O */
    public static final void m86940O(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: P */
    public static final void m86939P(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: Q */
    public static final void m86938Q(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: R */
    public static final void m86937R(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: U */
    public static final void m86934U(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: V */
    public static final InterfaceC23496h m86933V(RK1 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        C41318g46.m40163a("checking for required bluetooth connect permission", new Object[0]);
        AbstractC23442F<FQ3> m110485l = this$0.f31849l.m110485l(Permission.BLUETOOTH_CONNECT);
        final C7136n c7136n = C7136n.f31884g;
        return m110485l.m33101w(new InterfaceC23484g() { // from class: JK1
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                RK1.m86932W(Function1.this, obj);
            }
        }).m33159G();
    }

    /* renamed from: W */
    public static final void m86932W(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: X */
    public static final InterfaceC23434B m86931X(RK1 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        return this$0.f31848k.mo73604c().startWith((Observable<InterfaceC5225MD.EnumC5227b>) this$0.f31848k.mo73605b());
    }

    /* renamed from: Y */
    public static final InterfaceC23447K m86930Y(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: Z */
    public static final void m86929Z(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: c0 */
    public static final InterfaceC23447K m86923c0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: d0 */
    public static final Unit m86921d0(RK1 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.f31838a.mo55657q(this$0.f31851n, ItemLeaseType.HELMET);
        return Unit.INSTANCE;
    }

    /* renamed from: e0 */
    public static final void m86919e0(RK1 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.f31844g.mo37077W0(InterfaceC40099e13.EnumC19925b.RESULT_CANCELED, new Pair[0]);
    }

    /* renamed from: h0 */
    public static final boolean m86913h0(Function2 tmp0, Object obj, Object obj2) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return ((Boolean) tmp0.invoke(obj, obj2)).booleanValue();
    }

    /* renamed from: i0 */
    public static final InterfaceC23447K m86911i0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: j0 */
    public static final void m86909j0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: k0 */
    public static final void m86907k0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: l0 */
    public static final void m86905l0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: n0 */
    public static final void m86901n0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: o0 */
    public static final void m86899o0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: p0 */
    public static final void m86897p0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: q0 */
    public static final void m86895q0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: u0 */
    public static final InterfaceC23496h m86887u0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23496h) tmp0.invoke(obj);
    }

    /* renamed from: v0 */
    public static final InterfaceC23496h m86885v0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23496h) tmp0.invoke(obj);
    }

    /* renamed from: w0 */
    public static final void m86883w0(RK1 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        XK1 xk1 = this$0.f31842e;
        xk1.m77114Yl();
        xk1.m77119Tl().setText(C45871nl4.helmet_lease_tutorial_started_title);
        C49520tu6.m11233r(xk1.m77123Pl());
        C49520tu6.m11233r(xk1.m77122Ql());
    }

    /* renamed from: x0 */
    public static final void m86881x0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: G */
    public final AbstractC23461c m86948G(Observable<C36154Tk5> observable, WireBird wireBird) {
        Object firstOrNull;
        List<WirePhysicalLock> physicalLocks = wireBird.getPhysicalLocks();
        if (physicalLocks != null) {
            firstOrNull = CollectionsKt___CollectionsKt.firstOrNull((List<? extends Object>) physicalLocks);
            WirePhysicalLock wirePhysicalLock = (WirePhysicalLock) firstOrNull;
            if (wirePhysicalLock != null) {
                PhysicalLockPurpose purpose = wirePhysicalLock.getPurpose();
                String str = (purpose == null || (str = purpose.name()) == null) ? "" : "";
                final C7120b c7120b = new C7120b(wireBird);
                Observable<R> flatMapSingle = observable.flatMapSingle(new InterfaceC23492o() { // from class: PK1
                    @Override // io.reactivex.functions.InterfaceC23492o
                    public final Object apply(Object obj) {
                        InterfaceC23447K m86947H;
                        m86947H = RK1.m86947H(Function1.this, obj);
                        return m86947H;
                    }
                });
                final C7122c c7122c = new C7122c(wireBird, str, wirePhysicalLock);
                AbstractC23461c m33070P = flatMapSingle.flatMapCompletable(new InterfaceC23492o() { // from class: QK1
                    @Override // io.reactivex.functions.InterfaceC23492o
                    public final Object apply(Object obj) {
                        InterfaceC23496h m86946I;
                        m86946I = RK1.m86946I(Function1.this, obj);
                        return m86946I;
                    }
                }).m33070P(C23454a.m33087a());
                final C7123d c7123d = new C7123d(wireBird);
                AbstractC23461c m33067S = m33070P.m33067S(new InterfaceC23492o() { // from class: mK1
                    @Override // io.reactivex.functions.InterfaceC23492o
                    public final Object apply(Object obj) {
                        InterfaceC23496h m86945J;
                        m86945J = RK1.m86945J(Function1.this, obj);
                        return m86945J;
                    }
                });
                Intrinsics.checkNotNullExpressionValue(m33067S, "private fun Observable<S…}\n          }\n      }\n  }");
                return m33067S;
            }
        }
        String id = wireBird.getId();
        AbstractC23461c m33080F = AbstractC23461c.m33080F(new NullPointerException("Couldn't listen for smart lock unlocking for bird " + id + " as no physical lock was returned"));
        Intrinsics.checkNotNullExpressionValue(m33080F, "error(NullPointerExcepti…ical lock was returned\"))");
        return m33080F;
    }

    /* renamed from: K */
    public final void m86944K() {
        WirePhysicalLock wirePhysicalLock;
        boolean z;
        List<WirePhysicalLock> physicalLocks;
        Object firstOrNull;
        List<WirePhysicalLockTutorialStep> tutorialSteps;
        Object firstOrNull2;
        List<WirePhysicalLock> physicalLocks2;
        Object obj;
        boolean z2;
        WireBird wireBird = this.f31851n;
        String str = null;
        boolean z3 = true;
        if (wireBird != null && (physicalLocks2 = wireBird.getPhysicalLocks()) != null) {
            Iterator<T> it = physicalLocks2.iterator();
            while (true) {
                if (it.hasNext()) {
                    obj = it.next();
                    if (((WirePhysicalLock) obj).getPurpose() == PhysicalLockPurpose.HELMET) {
                        z2 = true;
                        continue;
                    } else {
                        z2 = false;
                        continue;
                    }
                    if (z2) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            wirePhysicalLock = (WirePhysicalLock) obj;
        } else {
            wirePhysicalLock = null;
        }
        if (wirePhysicalLock != null && (tutorialSteps = wirePhysicalLock.getTutorialSteps()) != null) {
            firstOrNull2 = CollectionsKt___CollectionsKt.firstOrNull((List<? extends Object>) tutorialSteps);
            WirePhysicalLockTutorialStep wirePhysicalLockTutorialStep = (WirePhysicalLockTutorialStep) firstOrNull2;
            if (wirePhysicalLockTutorialStep != null) {
                str = wirePhysicalLockTutorialStep.getImageUrl();
            }
        }
        if (str != null) {
            this.f31842e.m77117Vl(str);
        } else {
            if (wirePhysicalLock != null && wirePhysicalLock.isBrainLock()) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                this.f31842e.m77116Wl(C48193rg4.ic_hero_helmet_in_basket2);
            }
        }
        Z84<Config> m82623f8 = this.f31846i.m82623f8();
        final C7132k c7132k = C7132k.f31879g;
        Observable distinctUntilChanged = m82623f8.map(new InterfaceC23492o() { // from class: nK1
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj2) {
                Boolean m86943L;
                m86943L = RK1.m86943L(Function1.this, obj2);
                return m86943L;
            }
        }).distinctUntilChanged();
        final C7133l c7133l = new C7133l(wirePhysicalLock);
        Observable unlocksObservable = distinctUntilChanged.flatMap(new InterfaceC23492o() { // from class: oK1
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj2) {
                InterfaceC23434B m86942M;
                m86942M = RK1.m86942M(Function1.this, obj2);
                return m86942M;
            }
        });
        if (this.f31851n != null) {
            if (wirePhysicalLock == null || !wirePhysicalLock.isBrainLock()) {
                z3 = false;
            }
            if (!z3) {
                C40463ee3 c40463ee3 = C40463ee3.f78649a;
                Z84<List<ItemLease>> mo55656s = this.f31838a.mo55656s();
                final C7126f c7126f = new C7126f();
                Observable distinctUntilChanged2 = mo55656s.map(new InterfaceC23492o() { // from class: pK1
                    @Override // io.reactivex.functions.InterfaceC23492o
                    public final Object apply(Object obj2) {
                        Boolean m86941N;
                        m86941N = RK1.m86941N(Function1.this, obj2);
                        return m86941N;
                    }
                }).distinctUntilChanged();
                Intrinsics.checkNotNullExpressionValue(distinctUntilChanged2, "private fun initializeUi…dateUiByPhysicalLock)\n  }");
                Intrinsics.checkNotNullExpressionValue(unlocksObservable, "unlocksObservable");
                Observable combineLatest = Observable.combineLatest(distinctUntilChanged2, unlocksObservable, C7125e.f31873a);
                Intrinsics.checkNotNullExpressionValue(combineLatest, "combineLatest(source1, s…, t2: T2 -> (t1 to t2) })");
                Observable observeOn = combineLatest.observeOn(C23454a.m33087a());
                Intrinsics.checkNotNullExpressionValue(observeOn, "private fun initializeUi…dateUiByPhysicalLock)\n  }");
                Object m33094as = observeOn.m33094as(AutoDispose.m45239a(this.f31843f));
                Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
                final C7127g c7127g = new C7127g();
                InterfaceC23484g interfaceC23484g = new InterfaceC23484g() { // from class: qK1
                    @Override // io.reactivex.functions.InterfaceC23484g
                    public final void accept(Object obj2) {
                        RK1.m86940O(Function1.this, obj2);
                    }
                };
                final C7128h c7128h = new C7128h();
                ((ObservableSubscribeProxy) m33094as).subscribe(interfaceC23484g, new InterfaceC23484g() { // from class: rK1
                    @Override // io.reactivex.functions.InterfaceC23484g
                    public final void accept(Object obj2) {
                        RK1.m86939P(Function1.this, obj2);
                    }
                });
            }
        }
        Observable<InterfaceC5225MD.EnumC5227b> observeOn2 = this.f31848k.mo73604c().startWith((Observable<InterfaceC5225MD.EnumC5227b>) this.f31848k.mo73605b()).observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn2, "rxBluetoothManager.bluet…dSchedulers.mainThread())");
        Object m33094as2 = observeOn2.m33094as(AutoDispose.m45239a(this.f31843f));
        Intrinsics.checkExpressionValueIsNotNull(m33094as2, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C7129i c7129i = new C7129i();
        InterfaceC23484g interfaceC23484g2 = new InterfaceC23484g() { // from class: sK1
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj2) {
                RK1.m86938Q(Function1.this, obj2);
            }
        };
        final C7131j c7131j = C7131j.f31878g;
        ((ObservableSubscribeProxy) m33094as2).subscribe(interfaceC23484g2, new InterfaceC23484g() { // from class: tK1
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj2) {
                RK1.m86937R(Function1.this, obj2);
            }
        });
        WireBird wireBird2 = this.f31851n;
        if (wireBird2 != null && (physicalLocks = wireBird2.getPhysicalLocks()) != null) {
            firstOrNull = CollectionsKt___CollectionsKt.firstOrNull((List<? extends Object>) physicalLocks);
            WirePhysicalLock wirePhysicalLock2 = (WirePhysicalLock) firstOrNull;
            if (wirePhysicalLock2 != null) {
                m86879y0(wirePhysicalLock2);
            }
        }
    }

    /* renamed from: S */
    public final boolean m86936S() {
        return C36441Uq4.m80769c(this.f31846i, this.f31851n).getComplianceConfig().getHelmetRequiredForRide();
    }

    /* renamed from: T */
    public final void m86935T(WireBird wireBird) {
        Object firstOrNull;
        Integer num;
        String id = wireBird.getId();
        C41318g46.m40163a("listenForLocks called for " + id, new Object[0]);
        List<WirePhysicalLock> physicalLocks = wireBird.getPhysicalLocks();
        if (physicalLocks != null) {
            firstOrNull = CollectionsKt___CollectionsKt.firstOrNull((List<? extends Object>) physicalLocks);
            WirePhysicalLock wirePhysicalLock = (WirePhysicalLock) firstOrNull;
            if (wirePhysicalLock != null) {
                PhysicalLockPurpose purpose = wirePhysicalLock.getPurpose();
                String str = (purpose == null || (str = purpose.name()) == null) ? "" : "";
                Map<String, Integer> openAttemptCount = C36441Uq4.m80769c(this.f31846i, wireBird).getRideConfig().getSmartlockConfig().getOpenAttemptCount();
                if (openAttemptCount != null && (num = openAttemptCount.get(str)) != null) {
                    num.intValue();
                }
                AbstractC23442F<FQ3> m110485l = this.f31849l.m110485l(Permission.BLUETOOTH_SCAN);
                final C7135m c7135m = C7135m.f31883g;
                Observable distinctUntilChanged = m110485l.m33101w(new InterfaceC23484g() { // from class: uK1
                    @Override // io.reactivex.functions.InterfaceC23484g
                    public final void accept(Object obj) {
                        RK1.m86934U(Function1.this, obj);
                    }
                }).m33159G().m33049i(AbstractC23461c.m33035t(new Callable() { // from class: vK1
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        InterfaceC23496h m86933V;
                        m86933V = RK1.m86933V(RK1.this);
                        return m86933V;
                    }
                })).m33043l(Observable.defer(new Callable() { // from class: xK1
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        InterfaceC23434B m86931X;
                        m86931X = RK1.m86931X(RK1.this);
                        return m86931X;
                    }
                })).distinctUntilChanged();
                final C7137o c7137o = new C7137o(wireBird, wirePhysicalLock, this);
                Observable<C36154Tk5> observeOn = distinctUntilChanged.switchMapSingle(new InterfaceC23492o() { // from class: yK1
                    @Override // io.reactivex.functions.InterfaceC23492o
                    public final Object apply(Object obj) {
                        InterfaceC23447K m86930Y;
                        m86930Y = RK1.m86930Y(Function1.this, obj);
                        return m86930Y;
                    }
                }).observeOn(C24542a.m31932c());
                Intrinsics.checkNotNullExpressionValue(observeOn, "private fun listenForLoc…r)\n      .subscribe()\n  }");
                AbstractC23461c m33065U = m86948G(observeOn, wireBird).m33065U(3L);
                final C7138p c7138p = C7138p.f31888g;
                AbstractC23461c m33069Q = m33065U.m33084B(new InterfaceC23484g() { // from class: zK1
                    @Override // io.reactivex.functions.InterfaceC23484g
                    public final void accept(Object obj) {
                        RK1.m86929Z(Function1.this, obj);
                    }
                }).m33069Q();
                Intrinsics.checkNotNullExpressionValue(m33069Q, "private fun listenForLoc…r)\n      .subscribe()\n  }");
                Object m33041n = m33069Q.m33041n(AutoDispose.m45239a(this.f31843f));
                Intrinsics.checkExpressionValueIsNotNull(m33041n, "this.`as`(AutoDispose.au…isposable<Any>(provider))");
                ((CompletableSubscribeProxy) m33041n).subscribe();
                return;
            }
        }
        String id2 = wireBird.getId();
        C41318g46.m40160d("Couldn't listen for smart lock unlocking for bird " + id2 + " as no physical lock was returned", new Object[0]);
    }

    /* renamed from: a0 */
    public final void m86927a0(int i, int i2, Intent intent) {
    }

    /* renamed from: b0 */
    public final void m86925b0() {
        InterfaceC23465c interfaceC23465c;
        AbstractC23442F m33161E;
        WireBird wireBird = this.f31851n;
        if (wireBird != null) {
            m86891s0(wireBird, "declined");
            ItemLease mo55649z = this.f31838a.mo55649z(this.f31851n, ItemLeaseType.HELMET);
            if (mo55649z != null) {
                AbstractC23442F submitLeaseAsset$default = InterfaceC34441Mc2.C5320a.submitLeaseAsset$default(this.f31838a, mo55649z.getId(), ItemLeaseAssetPurpose.RETURN_VERIFICATION, 100L, "image/png", true, null, 32, null);
                final C7139q c7139q = new C7139q(mo55649z);
                m33161E = submitLeaseAsset$default.m33165A(new InterfaceC23492o() { // from class: MK1
                    @Override // io.reactivex.functions.InterfaceC23492o
                    public final Object apply(Object obj) {
                        InterfaceC23447K m86923c0;
                        m86923c0 = RK1.m86923c0(Function1.this, obj);
                        return m86923c0;
                    }
                });
            } else {
                m33161E = AbstractC23442F.m33161E(new Callable() { // from class: NK1
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        Unit m86921d0;
                        m86921d0 = RK1.m86921d0(RK1.this);
                        return m86921d0;
                    }
                });
            }
            AbstractC23461c m33063X = m33161E.m33159G().m33063X(C24542a.m31932c());
            Intrinsics.checkNotNullExpressionValue(m33063X, "fun onBackPressed() {\n  …sult.RESULT_CANCELED)\n  }");
            Object m33041n = m33063X.m33041n(AutoDispose.m45239a(this.f31843f));
            Intrinsics.checkExpressionValueIsNotNull(m33041n, "this.`as`(AutoDispose.au…isposable<Any>(provider))");
            interfaceC23465c = ((CompletableSubscribeProxy) m33041n).mo45218b(new InterfaceC23478a() { // from class: OK1
                @Override // io.reactivex.functions.InterfaceC23478a
                public final void run() {
                    RK1.m86919e0(RK1.this);
                }
            });
        } else {
            interfaceC23465c = null;
        }
        if (interfaceC23465c == null) {
            this.f31844g.mo37077W0(InterfaceC40099e13.EnumC19925b.RESULT_CANCELED, new Pair[0]);
        }
    }

    /* renamed from: f0 */
    public final void m86917f0() {
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x01a8, code lost:
        if (r1.isBrainLock() == true) goto L54;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01b6  */
    /* renamed from: g0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m86915g0() {
        String str;
        boolean z;
        WireBird wireBird;
        List<WirePhysicalLock> physicalLocks;
        Object firstOrNull;
        WirePhysicalLock wirePhysicalLock;
        WireBird wireBird2;
        WireRide ride;
        List<WirePhysicalLock> physicalLocks2;
        Object firstOrNull2;
        WirePhysicalLock wirePhysicalLock2;
        C37099Xl5 first;
        boolean z2;
        List<WirePhysicalLock> physicalLocks3;
        Object firstOrNull3;
        LeaseTypeConfig helmet = C36441Uq4.m80769c(this.f31846i, this.f31851n).getLeaseConfig().getLeaseTypes().getHelmet();
        InterfaceC1880Ea interfaceC1880Ea = this.f31847j;
        WireBird wireBird3 = this.f31851n;
        C36154Tk5 c36154Tk5 = null;
        if (wireBird3 != null) {
            str = wireBird3.getId();
        } else {
            str = null;
        }
        interfaceC1880Ea.mo55905y(new HI1(null, null, null, str, m86936S(), C36441Uq4.m80769c(this.f31846i, this.f31851n).getRideConfig().getCurrency(), (int) helmet.getInitialChargeAmount(), (int) helmet.getReturnRefundAmount(), (int) helmet.getDelinquentFeeAmount(), 7, null));
        Pair<C37099Xl5, C36154Tk5> m59035e = this.f31840c.mo21396k().m73665a().m59035e();
        boolean z3 = true;
        if (Intrinsics.areEqual(C36441Uq4.m80769c(this.f31846i, this.f31851n).getRideConfig().getSmartlockConfig().getEnableV2(), Boolean.TRUE)) {
            WireBird wireBird4 = this.f31851n;
            if (wireBird4 != null && (physicalLocks3 = wireBird4.getPhysicalLocks()) != null) {
                firstOrNull3 = CollectionsKt___CollectionsKt.firstOrNull((List<? extends Object>) physicalLocks3);
                WirePhysicalLock wirePhysicalLock3 = (WirePhysicalLock) firstOrNull3;
                if (wirePhysicalLock3 != null && wirePhysicalLock3.isBrainLock()) {
                    z2 = true;
                    if (!z2) {
                        C41318g46.m40163a("smart lock v2 FF enabled, deferring to SmartLockGlobalBluetoothScanner to handle scanning item lease logic", new Object[0]);
                        Observable m74575T = C37279Yf5.m74575T(this.f31838a.mo55656s(), new C7140r());
                        final C7141s c7141s = C7141s.f31892g;
                        Observable distinctUntilChanged = m74575T.distinctUntilChanged(new InterfaceC23481d() { // from class: lK1
                            @Override // io.reactivex.functions.InterfaceC23481d
                            public final boolean test(Object obj, Object obj2) {
                                boolean m86913h0;
                                m86913h0 = RK1.m86913h0(Function2.this, obj, obj2);
                                return m86913h0;
                            }
                        });
                        final C7142t c7142t = new C7142t();
                        Observable flatMapSingle = distinctUntilChanged.flatMapSingle(new InterfaceC23492o() { // from class: wK1
                            @Override // io.reactivex.functions.InterfaceC23492o
                            public final Object apply(Object obj) {
                                InterfaceC23447K m86911i0;
                                m86911i0 = RK1.m86911i0(Function1.this, obj);
                                return m86911i0;
                            }
                        });
                        Intrinsics.checkNotNullExpressionValue(flatMapSingle, "fun onResume() {\n    wit…setupClickListeners()\n  }");
                        Object m33094as = flatMapSingle.m33094as(AutoDispose.m45239a(this.f31843f));
                        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
                        final C7144u c7144u = new C7144u();
                        InterfaceC23484g interfaceC23484g = new InterfaceC23484g() { // from class: HK1
                            @Override // io.reactivex.functions.InterfaceC23484g
                            public final void accept(Object obj) {
                                RK1.m86909j0(Function1.this, obj);
                            }
                        };
                        final C7145v c7145v = C7145v.f31896g;
                        ((ObservableSubscribeProxy) m33094as).subscribe(interfaceC23484g, new InterfaceC23484g() { // from class: KK1
                            @Override // io.reactivex.functions.InterfaceC23484g
                            public final void accept(Object obj) {
                                RK1.m86907k0(Function1.this, obj);
                            }
                        });
                        m86944K();
                        m86903m0();
                    }
                }
            }
            z2 = false;
            if (!z2) {
            }
        }
        WireBird wireBird5 = this.f31851n;
        if (wireBird5 != null && (physicalLocks2 = wireBird5.getPhysicalLocks()) != null) {
            firstOrNull2 = CollectionsKt___CollectionsKt.firstOrNull((List<? extends Object>) physicalLocks2);
            WirePhysicalLock wirePhysicalLock4 = (WirePhysicalLock) firstOrNull2;
            if (wirePhysicalLock4 != null) {
                if (m59035e != null && (first = m59035e.getFirst()) != null) {
                    wirePhysicalLock2 = first.m76371b();
                } else {
                    wirePhysicalLock2 = null;
                }
                if (wirePhysicalLock4.isSame(wirePhysicalLock2)) {
                    z = true;
                    if (z) {
                        if (m59035e != null) {
                            c36154Tk5 = m59035e.getSecond();
                        }
                        if (c36154Tk5 != null) {
                            this.f31840c.mo21399h();
                            Observable<C36154Tk5> just = Observable.just(m59035e.getSecond());
                            Intrinsics.checkNotNullExpressionValue(just, "just(lockPair.second)");
                            RideState m76369d = m59035e.getFirst().m76369d();
                            if (m76369d == null || (ride = m76369d.getRide()) == null || (wireBird2 = ride.getBird()) == null) {
                                wireBird2 = this.f31851n;
                            }
                            AbstractC23461c m86948G = m86948G(just, wireBird2);
                            final C7146w c7146w = C7146w.f31897g;
                            AbstractC23461c m33069Q = m86948G.m33084B(new InterfaceC23484g() { // from class: LK1
                                @Override // io.reactivex.functions.InterfaceC23484g
                                public final void accept(Object obj) {
                                    RK1.m86905l0(Function1.this, obj);
                                }
                            }).m33069Q();
                            Intrinsics.checkNotNullExpressionValue(m33069Q, "just(lockPair.second)\n  …       .onErrorComplete()");
                            Object m33041n = m33069Q.m33041n(AutoDispose.m45239a(this.f31843f));
                            Intrinsics.checkExpressionValueIsNotNull(m33041n, "this.`as`(AutoDispose.au…isposable<Any>(provider))");
                            ((CompletableSubscribeProxy) m33041n).subscribe();
                            m86944K();
                            m86903m0();
                        }
                    }
                    wireBird = this.f31851n;
                    if (wireBird != null && (physicalLocks = wireBird.getPhysicalLocks()) != null) {
                        firstOrNull = CollectionsKt___CollectionsKt.firstOrNull((List<? extends Object>) physicalLocks);
                        wirePhysicalLock = (WirePhysicalLock) firstOrNull;
                        if (wirePhysicalLock != null) {
                        }
                    }
                    z3 = false;
                    if (z3) {
                        WireBird wireBird6 = this.f31851n;
                        if (wireBird6 != null) {
                            m86935T(wireBird6);
                        }
                    } else {
                        m86889t0(this.f31851n);
                    }
                    m86944K();
                    m86903m0();
                }
            }
        }
        z = false;
        if (z) {
        }
        wireBird = this.f31851n;
        if (wireBird != null) {
            firstOrNull = CollectionsKt___CollectionsKt.firstOrNull((List<? extends Object>) physicalLocks);
            wirePhysicalLock = (WirePhysicalLock) firstOrNull;
            if (wirePhysicalLock != null) {
            }
        }
        z3 = false;
        if (z3) {
        }
        m86944K();
        m86903m0();
    }

    /* renamed from: m0 */
    public final void m86903m0() {
        Object m33094as = this.f31842e.m77113r0().m33094as(AutoDispose.m45239a(this.f31843f));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C7147x c7147x = new C7147x();
        InterfaceC23484g interfaceC23484g = new InterfaceC23484g() { // from class: AK1
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                RK1.m86901n0(Function1.this, obj);
            }
        };
        final C7148y c7148y = C7148y.f31899g;
        ((ObservableSubscribeProxy) m33094as).subscribe(interfaceC23484g, new InterfaceC23484g() { // from class: BK1
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                RK1.m86899o0(Function1.this, obj);
            }
        });
        Object m33094as2 = this.f31842e.m77112z5().m33094as(AutoDispose.m45239a(this.f31843f));
        Intrinsics.checkExpressionValueIsNotNull(m33094as2, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C7149z c7149z = new C7149z();
        InterfaceC23484g interfaceC23484g2 = new InterfaceC23484g() { // from class: CK1
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                RK1.m86897p0(Function1.this, obj);
            }
        };
        final C7113A c7113a = C7113A.f31852g;
        ((ObservableSubscribeProxy) m33094as2).subscribe(interfaceC23484g2, new InterfaceC23484g() { // from class: DK1
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                RK1.m86895q0(Function1.this, obj);
            }
        });
    }

    /* renamed from: r0 */
    public final void m86893r0(Throwable th) {
        String str;
        LeaseTypeConfig helmet = C36441Uq4.m80769c(this.f31846i, this.f31851n).getLeaseConfig().getLeaseTypes().getHelmet();
        InterfaceC1880Ea interfaceC1880Ea = this.f31847j;
        WireBird wireBird = this.f31851n;
        if (wireBird != null) {
            str = wireBird.getId();
        } else {
            str = null;
        }
        String str2 = str;
        boolean m86936S = m86936S();
        String currency = C36441Uq4.m80769c(this.f31846i, this.f31851n).getRideConfig().getCurrency();
        String simpleName = th.getClass().getSimpleName();
        String message = th.getMessage();
        if (message == null) {
            message = th.toString();
        }
        Intrinsics.checkNotNullExpressionValue(simpleName, "simpleName");
        interfaceC1880Ea.mo55905y(new FI1(null, null, null, simpleName, message, str2, m86936S, currency, (int) helmet.getInitialChargeAmount(), (int) helmet.getReturnRefundAmount(), (int) helmet.getDelinquentFeeAmount(), 7, null));
    }

    /* renamed from: s0 */
    public final void m86891s0(WireBird wireBird, String str) {
        String str2;
        Object obj;
        LeaseTypeConfig helmet = C36441Uq4.m80769c(this.f31846i, wireBird).getLeaseConfig().getLeaseTypes().getHelmet();
        InterfaceC1880Ea interfaceC1880Ea = this.f31847j;
        Iterator<T> it = this.f31838a.mo55656s().m73665a().iterator();
        while (true) {
            str2 = null;
            if (it.hasNext()) {
                obj = it.next();
                if (((ItemLease) obj).isLeaseForBird(wireBird, ItemLeaseType.HELMET)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        ItemLease itemLease = (ItemLease) obj;
        if (itemLease != null) {
            str2 = itemLease.getId();
        }
        interfaceC1880Ea.mo55905y(new GI1(null, null, null, str, wireBird.getId(), str2, m86936S(), C36441Uq4.m80769c(this.f31846i, wireBird).getRideConfig().getCurrency(), (int) helmet.getInitialChargeAmount(), (int) helmet.getReturnRefundAmount(), (int) helmet.getDelinquentFeeAmount(), 7, null));
    }

    /* renamed from: t0 */
    public final void m86889t0(WireBird wireBird) {
        String id = wireBird.getId();
        C41318g46.m40163a("unlockOkaiCliplock called for " + id, new Object[0]);
        if (this.f31838a.mo55666l(wireBird, ItemLeaseType.HELMET)) {
            return;
        }
        AbstractC23442F<LeaseStartResponse> m33146T = this.f31838a.mo55704E(wireBird).m33146T(3L);
        final C7114B c7114b = new C7114B(wireBird);
        AbstractC23461c m33070P = m33146T.m33164B(new InterfaceC23492o() { // from class: EK1
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23496h m86887u0;
                m86887u0 = RK1.m86887u0(Function1.this, obj);
                return m86887u0;
            }
        }).m33070P(C23454a.m33087a());
        final C7116C c7116c = new C7116C(wireBird);
        AbstractC23461c m33067S = m33070P.m33067S(new InterfaceC23492o() { // from class: FK1
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23496h m86885v0;
                m86885v0 = RK1.m86885v0(Function1.this, obj);
                return m86885v0;
            }
        });
        Intrinsics.checkNotNullExpressionValue(m33067S, "private fun unlockOkaiCl…tart lease\")\n      })\n  }");
        Object m33041n = m33067S.m33041n(AutoDispose.m45239a(this.f31843f));
        Intrinsics.checkExpressionValueIsNotNull(m33041n, "this.`as`(AutoDispose.au…isposable<Any>(provider))");
        InterfaceC23478a interfaceC23478a = new InterfaceC23478a() { // from class: GK1
            @Override // io.reactivex.functions.InterfaceC23478a
            public final void run() {
                RK1.m86883w0(RK1.this);
            }
        };
        final C7118D c7118d = C7118D.f31860g;
        ((CompletableSubscribeProxy) m33041n).mo45217e(interfaceC23478a, new InterfaceC23484g() { // from class: IK1
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                RK1.m86881x0(Function1.this, obj);
            }
        });
    }

    /* renamed from: y0 */
    public final void m86879y0(WirePhysicalLock wirePhysicalLock) {
        XK1 xk1 = this.f31842e;
        if (wirePhysicalLock.isBrainLock()) {
            xk1.m77119Tl().setText(C45871nl4.helmet_lease_tutorial_unlocking_title);
            xk1.m77123Pl().setText(C45871nl4.helmet_lease_tutorial_stemlock_checkbox_1);
            xk1.m77122Ql().setText(C45871nl4.helmet_lease_tutorial_stemlock_checkbox_2);
            C49520tu6.m11239l(xk1.m77123Pl());
            C49520tu6.m11239l(xk1.m77122Ql());
            C49520tu6.m11239l(xk1.m77121Rl());
            C49520tu6.m11239l(xk1.m77120Sl());
            xk1.m77118Ul(false);
            return;
        }
        xk1.m77119Tl().setText(C45871nl4.helmet_lease_unlock_tutorial_title);
        xk1.m77123Pl().setText(C45871nl4.helmet_lease_tutorial_legacy_checkbox_1);
        xk1.m77122Ql().setText(C45871nl4.helmet_lease_tutorial_legacy_checkbox_2);
        xk1.m77121Rl().setText(C45871nl4.helmet_lease_tutorial_legacy_checkbox_3);
        xk1.m77120Sl().setText(C45871nl4.helmet_lease_tutorial_legacy_checkbox_4);
        C49520tu6.m11233r(xk1.m77123Pl());
        C49520tu6.m11233r(xk1.m77122Ql());
        C49520tu6.m11233r(xk1.m77121Rl());
        C49520tu6.m11233r(xk1.m77120Sl());
        xk1.m77118Ul(true);
    }

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"<anonymous>", "", "kotlin.jvm.PlatformType", "it", "", "Lco/bird/android/model/itemlease/ItemLease;", "invoke", "(Ljava/util/List;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    @SourceDebugExtension({"SMAP\nHelmetLeaseUnlockTutorialPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HelmetLeaseUnlockTutorialPresenter.kt\nco/bird/android/feature/itemlease/onboarding/HelmetLeaseUnlockTutorialPresenter$initializeUi$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,486:1\n1747#2,3:487\n*S KotlinDebug\n*F\n+ 1 HelmetLeaseUnlockTutorialPresenter.kt\nco/bird/android/feature/itemlease/onboarding/HelmetLeaseUnlockTutorialPresenter$initializeUi$1\n*L\n355#1:487,3\n*E\n"})
    /* renamed from: RK1$f */
    /* loaded from: classes3.dex */
    public static final class C7126f extends Lambda implements Function1<List<? extends ItemLease>, Boolean> {
        public C7126f() {
            super(1);
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final Boolean invoke2(List<ItemLease> it) {
            Intrinsics.checkNotNullParameter(it, "it");
            List<ItemLease> list = it;
            RK1 rk1 = RK1.this;
            boolean z = false;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                Iterator<T> it2 = list.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    } else if (((ItemLease) it2.next()).isLeaseForBird(rk1.f31851n, ItemLeaseType.HELMET)) {
                        z = true;
                        break;
                    }
                }
            }
            return Boolean.valueOf(z);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Boolean invoke(List<? extends ItemLease> list) {
            return invoke2((List<ItemLease>) list);
        }
    }
}
