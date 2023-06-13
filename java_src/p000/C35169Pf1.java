package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.buava.Optional;
import co.bird.android.model.Deal;
import co.bird.android.model.DealKt;
import co.bird.android.model.RideState;
import co.bird.android.model.User;
import co.bird.android.model.constant.CouponKind;
import co.bird.android.model.wire.WireCoupon;
import co.bird.android.model.wire.WireCouponKt;
import co.bird.android.model.wire.configs.ReservationConfig;
import co.bird.android.model.wire.configs.RideConfig;
import co.bird.api.request.DealAcknowledgmentState;
import com.facebook.share.internal.C17296a;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.ObservableSubscribeProxy;
import com.uber.autodispose.ScopeProvider;
import io.reactivex.AbstractC23442F;
import io.reactivex.InterfaceC23447K;
import io.reactivex.Observable;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.functions.InterfaceC23492o;
import io.reactivex.functions.InterfaceC23494q;
import io.reactivex.rxkotlin.C24523e;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.C35169Pf1;
import p000.C37791a94;
@Metadata(m28433d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010#\u001a\u00020\"\u0012\u0006\u0010%\u001a\u00020$\u0012\u0006\u0010'\u001a\u00020&\u0012\u0006\u0010)\u001a\u00020(\u0012\u0006\u0010+\u001a\u00020*¢\u0006\u0004\b,\u0010-J$\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002H\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0002J\f\u0010\t\u001a\u00020\b*\u00020\u0004H\u0002J\b\u0010\n\u001a\u00020\u0006H\u0002J\b\u0010\u000b\u001a\u00020\u0006H\u0016J\b\u0010\f\u001a\u00020\u0006H\u0016R'\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u00030\r8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R'\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\r8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0010\u001a\u0004\b\u000f\u0010\u0012R'\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\r8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\u0010\u001a\u0004\b\u0015\u0010\u0012R'\u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00170\r8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0010\u001a\u0004\b\u0018\u0010\u0012R \u0010\u001c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u00030\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u001bR \u0010\u001d\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u001bR \u0010\u001f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001bR \u0010!\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00170\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u001b¨\u0006."}, m28432d2 = {"LPf1;", "LBf1;", "Lio/reactivex/Observable;", "Lco/bird/android/buava/Optional;", "Lco/bird/android/model/wire/WireCoupon;", "E", "", "I", "", "H", "J", "e", "c", "LZ84;", "Lco/bird/android/model/Deal;", C17296a.f69688o, "Lkotlin/Lazy;", "b", "()LZ84;", "deal", "freeReserveCoupon", "f", "freeUnlockCoupon", "", DateTokenConverter.CONVERTER_KEY, "couponsExpired", "La94;", "La94;", "mutableDeal", "mutableFreeReservationCoupon", "g", "mutableFreeUnlockCoupon", "h", "mutableCouponsExpired", "LJT0;", "dealManager", "LV74;", "promoManager", "LTq4;", "reactiveConfig", "LYR4;", "rideManager", "LRh6;", "userStream", "<init>", "(LJT0;LV74;LTq4;LYR4;LRh6;)V", "ride_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nEphemeralPromoManagerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EphemeralPromoManagerImpl.kt\nco/bird/android/manager/ride/EphemeralPromoManagerImpl\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n*L\n1#1,162:1\n180#2:163\n180#2:164\n180#2:165\n180#2:166\n180#2:167\n180#2:168\n*S KotlinDebug\n*F\n+ 1 EphemeralPromoManagerImpl.kt\nco/bird/android/manager/ride/EphemeralPromoManagerImpl\n*L\n53#1:163\n74#1:164\n96#1:165\n103#1:166\n109#1:167\n115#1:168\n*E\n"})
/* renamed from: Pf1  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C35169Pf1 implements InterfaceC31893Bf1 {

    /* renamed from: a */
    public final Lazy f28832a;

    /* renamed from: b */
    public final Lazy f28833b;

    /* renamed from: c */
    public final Lazy f28834c;

    /* renamed from: d */
    public final Lazy f28835d;

    /* renamed from: e */
    public final C37791a94<Optional<Deal>> f28836e;

    /* renamed from: f */
    public final C37791a94<Optional<WireCoupon>> f28837f;

    /* renamed from: g */
    public final C37791a94<Optional<WireCoupon>> f28838g;

    /* renamed from: h */
    public final C37791a94<List<WireCoupon>> f28839h;

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u001a\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0001 \u0002*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lco/bird/android/buava/Optional;", "Lco/bird/android/model/wire/WireCoupon;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lco/bird/android/buava/Optional;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Pf1$a */
    /* loaded from: classes4.dex */
    public static final class C6428a extends Lambda implements Function1<Optional<WireCoupon>, Unit> {
        public C6428a() {
            super(1);
        }

        /* renamed from: a */
        public final void m89981a(Optional<WireCoupon> optional) {
            C35169Pf1.this.mo90003e();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Optional<WireCoupon> optional) {
            m89981a(optional);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u001a\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0001 \u0002*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lco/bird/android/buava/Optional;", "Lco/bird/android/model/wire/WireCoupon;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lco/bird/android/buava/Optional;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Pf1$b */
    /* loaded from: classes4.dex */
    public static final class C6429b extends Lambda implements Function1<Optional<WireCoupon>, Unit> {
        public C6429b() {
            super(1);
        }

        /* renamed from: a */
        public final void m89980a(Optional<WireCoupon> optional) {
            C35169Pf1.this.m90009I();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Optional<WireCoupon> optional) {
            m89980a(optional);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/User;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lco/bird/android/model/User;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Pf1$c */
    /* loaded from: classes4.dex */
    public static final class C6430c extends Lambda implements Function1<User, Unit> {
        public C6430c() {
            super(1);
        }

        /* renamed from: a */
        public final void m89979a(User user) {
            C35169Pf1.this.m90008J();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(User user) {
            m89979a(user);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u000122\u0010\u0002\u001a.\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005 \u0007*\u0016\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\b"}, m28432d2 = {"<anonymous>", "", "<name for destructuring parameter 0>", "Lkotlin/Pair;", "", "Lco/bird/android/buava/Optional;", "Lco/bird/android/model/Deal;", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Pf1$d */
    /* loaded from: classes4.dex */
    public static final class C6431d extends Lambda implements Function1<Pair<? extends Boolean, ? extends Optional<Deal>>, Unit> {
        public C6431d() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Pair<? extends Boolean, ? extends Optional<Deal>> pair) {
            invoke2((Pair<Boolean, Optional<Deal>>) pair);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Pair<Boolean, Optional<Deal>> pair) {
            boolean booleanValue = pair.component1().booleanValue();
            if (pair.component2().m59037c() && booleanValue) {
                return;
            }
            C35169Pf1.this.f28836e.accept(Optional.f63040c.m59034a());
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0018\u0010\u0002\u001a\u0014\u0012\u0004\u0012\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"<anonymous>", "", "<name for destructuring parameter 0>", "Lkotlin/Pair;", "Lco/bird/android/buava/Optional;", "Lco/bird/android/model/Deal;", "invoke", "(Lkotlin/Pair;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Pf1$e */
    /* loaded from: classes4.dex */
    public static final class C6432e extends Lambda implements Function1<Pair<? extends Boolean, ? extends Optional<Deal>>, Boolean> {

        /* renamed from: g */
        public static final C6432e f28844g = new C6432e();

        public C6432e() {
            super(1);
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final Boolean invoke2(Pair<Boolean, Optional<Deal>> pair) {
            Intrinsics.checkNotNullParameter(pair, "<name for destructuring parameter 0>");
            boolean booleanValue = pair.component1().booleanValue();
            Optional<Deal> component2 = pair.component2();
            return Boolean.valueOf(booleanValue && component2.m59037c() && DealKt.notExpired(component2.m59038b()));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Boolean invoke(Pair<? extends Boolean, ? extends Optional<Deal>> pair) {
            return invoke2((Pair<Boolean, Optional<Deal>>) pair);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u000122\u0010\u0002\u001a.\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005 \u0007*\u0016\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\b"}, m28432d2 = {"<anonymous>", "", "<name for destructuring parameter 0>", "Lkotlin/Pair;", "", "Lco/bird/android/buava/Optional;", "Lco/bird/android/model/Deal;", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Pf1$f */
    /* loaded from: classes4.dex */
    public static final class C6433f extends Lambda implements Function1<Pair<? extends Boolean, ? extends Optional<Deal>>, Unit> {

        /* renamed from: h */
        public final /* synthetic */ JT0 f28846h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C6433f(JT0 jt0) {
            super(1);
            this.f28846h = jt0;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Pair<? extends Boolean, ? extends Optional<Deal>> pair) {
            invoke2((Pair<Boolean, Optional<Deal>>) pair);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Pair<Boolean, Optional<Deal>> pair) {
            Optional<Deal> component2 = pair.component2();
            C35169Pf1.this.f28836e.accept(component2);
            this.f28846h.mo92269g(component2.m59038b());
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\n \u0005*\u0004\u0018\u00010\u00030\u00032\u0018\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"Lkotlin/Pair;", "", "Lco/bird/android/buava/Optional;", "Lco/bird/android/model/Deal;", "<name for destructuring parameter 0>", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lkotlin/Pair;)Lco/bird/android/model/Deal;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Pf1$g */
    /* loaded from: classes4.dex */
    public static final class C6434g extends Lambda implements Function1<Pair<? extends Boolean, ? extends Optional<Deal>>, Deal> {

        /* renamed from: g */
        public static final C6434g f28847g = new C6434g();

        public C6434g() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Deal invoke(Pair<Boolean, Optional<Deal>> pair) {
            Intrinsics.checkNotNullParameter(pair, "<name for destructuring parameter 0>");
            return pair.component2().m59038b();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001aB\u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003 \u0005* \u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"Lco/bird/android/model/Deal;", "deal", "Lio/reactivex/K;", "LHM4;", "", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/model/Deal;)Lio/reactivex/K;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Pf1$h */
    /* loaded from: classes4.dex */
    public static final class C6435h extends Lambda implements Function1<Deal, InterfaceC23447K<? extends HM4<Unit>>> {

        /* renamed from: g */
        public final /* synthetic */ JT0 f28848g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C6435h(JT0 jt0) {
            super(1);
            this.f28848g = jt0;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC23447K<? extends HM4<Unit>> invoke(Deal deal) {
            Intrinsics.checkNotNullParameter(deal, "deal");
            return this.f28848g.mo92272d(deal, DealAcknowledgmentState.ACKNOWLEDGED);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, m28432d2 = {"<anonymous>", "", "sortedCouponList", "", "Lco/bird/android/model/wire/WireCoupon;", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    @SourceDebugExtension({"SMAP\nEphemeralPromoManagerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EphemeralPromoManagerImpl.kt\nco/bird/android/manager/ride/EphemeralPromoManagerImpl$7\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,162:1\n766#2:163\n857#2,2:164\n1855#2,2:166\n*S KotlinDebug\n*F\n+ 1 EphemeralPromoManagerImpl.kt\nco/bird/android/manager/ride/EphemeralPromoManagerImpl$7\n*L\n86#1:163\n86#1:164,2\n86#1:166,2\n*E\n"})
    /* renamed from: Pf1$i */
    /* loaded from: classes4.dex */
    public static final class C6436i extends Lambda implements Function1<List<? extends WireCoupon>, Unit> {

        /* renamed from: g */
        public final /* synthetic */ C36207Tq4 f28849g;

        /* renamed from: h */
        public final /* synthetic */ C35169Pf1 f28850h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C6436i(C36207Tq4 c36207Tq4, C35169Pf1 c35169Pf1) {
            super(1);
            this.f28849g = c36207Tq4;
            this.f28850h = c35169Pf1;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(List<? extends WireCoupon> list) {
            invoke2((List<WireCoupon>) list);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(List<WireCoupon> sortedCouponList) {
            ReservationConfig reservationConfig = this.f28849g.m82623f8().m73665a().getReservationConfig();
            RideConfig rideConfig = this.f28849g.m82623f8().m73665a().getRideConfig();
            if (reservationConfig.getEnableReservePromoOnBadScan() || reservationConfig.getEnableReservePromoOnCancelledRide() || reservationConfig.getEnableReservePromoOnLowBatteryCancelledRide() || rideConfig.getEnableFreeUnlockAfterCancelledRide() || rideConfig.getEnableFreeUnlockAfterBadScan() || rideConfig.getEnableFreeUnlockAfterLowBatteryRide()) {
                Intrinsics.checkNotNullExpressionValue(sortedCouponList, "sortedCouponList");
                ArrayList<WireCoupon> arrayList = new ArrayList();
                for (Object obj : sortedCouponList) {
                    if (!WireCouponKt.expired((WireCoupon) obj)) {
                        arrayList.add(obj);
                    }
                }
                C35169Pf1 c35169Pf1 = this.f28850h;
                for (WireCoupon wireCoupon : arrayList) {
                    if (wireCoupon.getKind() == CouponKind.FREE_RESERVE && !c35169Pf1.m90010H(wireCoupon)) {
                        c35169Pf1.f28837f.accept(Optional.f63040c.m59032c(wireCoupon));
                    } else if (wireCoupon.getKind() == CouponKind.FREE_UNLOCK && !c35169Pf1.m90010H(wireCoupon)) {
                        c35169Pf1.f28838g.accept(Optional.f63040c.m59032c(wireCoupon));
                    }
                }
            }
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/buava/Optional;", "Lco/bird/android/model/RideState;", "it", "", C17296a.f69688o, "(Lco/bird/android/buava/Optional;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Pf1$j */
    /* loaded from: classes4.dex */
    public static final class C6437j extends Lambda implements Function1<Optional<RideState>, Boolean> {

        /* renamed from: g */
        public static final C6437j f28851g = new C6437j();

        public C6437j() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Boolean invoke(Optional<RideState> it) {
            RideState.Status status;
            boolean z;
            Intrinsics.checkNotNullParameter(it, "it");
            RideState m59035e = it.m59035e();
            if (m59035e != null) {
                status = m59035e.getStatus();
            } else {
                status = null;
            }
            if (status == RideState.Status.STARTED) {
                z = true;
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u001a\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0001 \u0002*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lco/bird/android/buava/Optional;", "Lco/bird/android/model/RideState;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lco/bird/android/buava/Optional;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Pf1$k */
    /* loaded from: classes4.dex */
    public static final class C6438k extends Lambda implements Function1<Optional<RideState>, Unit> {
        public C6438k() {
            super(1);
        }

        /* renamed from: a */
        public final void m89975a(Optional<RideState> optional) {
            C35169Pf1.this.m90009I();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Optional<RideState> optional) {
            m89975a(optional);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0002 \u0003*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"LZ84;", "", "Lco/bird/android/model/wire/WireCoupon;", "kotlin.jvm.PlatformType", "invoke", "()LZ84;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Pf1$l */
    /* loaded from: classes4.dex */
    public static final class C6439l extends Lambda implements Function0<Z84<List<? extends WireCoupon>>> {
        public C6439l() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: invoke */
        public final Z84<List<? extends WireCoupon>> invoke2() {
            return Z84.f47888d.m73663b(C35169Pf1.this.f28839h);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0002 \u0003*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"LZ84;", "Lco/bird/android/buava/Optional;", "Lco/bird/android/model/Deal;", "kotlin.jvm.PlatformType", "invoke", "()LZ84;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Pf1$m */
    /* loaded from: classes4.dex */
    public static final class C6440m extends Lambda implements Function0<Z84<Optional<Deal>>> {
        public C6440m() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final Z84<Optional<Deal>> invoke() {
            return Z84.f47888d.m73663b(C35169Pf1.this.f28836e);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001aB\u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0001 \u0004*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00000\u0000 \u0004* \u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0001 \u0004*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00000\u0000\u0018\u00010\u00030\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lco/bird/android/buava/Optional;", "Lco/bird/android/model/wire/WireCoupon;", "coupon", "Lio/reactivex/K;", "kotlin.jvm.PlatformType", "b", "(Lco/bird/android/buava/Optional;)Lio/reactivex/K;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Pf1$n */
    /* loaded from: classes4.dex */
    public static final class C6441n extends Lambda implements Function1<Optional<WireCoupon>, InterfaceC23447K<? extends Optional<WireCoupon>>> {

        /* renamed from: g */
        public static final C6441n f28855g = new C6441n();

        @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u0016\u0012\u0004\u0012\u00020\u0003 \u0004*\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"", "it", "Lco/bird/android/buava/Optional;", "Lco/bird/android/model/wire/WireCoupon;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Ljava/lang/Long;)Lco/bird/android/buava/Optional;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: Pf1$n$a */
        /* loaded from: classes4.dex */
        public static final class C6442a extends Lambda implements Function1<Long, Optional<WireCoupon>> {

            /* renamed from: g */
            public final /* synthetic */ Optional<WireCoupon> f28856g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C6442a(Optional<WireCoupon> optional) {
                super(1);
                this.f28856g = optional;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final Optional<WireCoupon> invoke(Long it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return this.f28856g;
            }
        }

        public C6441n() {
            super(1);
        }

        /* renamed from: c */
        public static final Optional m89972c(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (Optional) tmp0.invoke(obj);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b */
        public final InterfaceC23447K<? extends Optional<WireCoupon>> invoke(Optional<WireCoupon> coupon) {
            AbstractC23442F<Long> m33153M;
            Intrinsics.checkNotNullParameter(coupon, "coupon");
            if (coupon.m59037c()) {
                Integer remainingSeconds = WireCouponKt.remainingSeconds(coupon.m59038b());
                Intrinsics.checkNotNull(remainingSeconds);
                m33153M = AbstractC23442F.m33133f0(remainingSeconds.intValue(), TimeUnit.SECONDS);
            } else {
                m33153M = AbstractC23442F.m33153M();
            }
            final C6442a c6442a = new C6442a(coupon);
            return m33153M.m33157I(new InterfaceC23492o() { // from class: Qf1
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj) {
                    Optional m89972c;
                    m89972c = C35169Pf1.C6441n.m89972c(Function1.this, obj);
                    return m89972c;
                }
            });
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u001a\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0001 \u0002*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lco/bird/android/buava/Optional;", "Lco/bird/android/model/wire/WireCoupon;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lco/bird/android/buava/Optional;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Pf1$o */
    /* loaded from: classes4.dex */
    public static final class C6443o extends Lambda implements Function1<Optional<WireCoupon>, Unit> {

        @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"", "Lco/bird/android/model/wire/WireCoupon;", "expiredCoupons", C17296a.f69688o, "(Ljava/util/List;)Ljava/util/List;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: Pf1$o$a */
        /* loaded from: classes4.dex */
        public static final class C6444a extends Lambda implements Function1<List<? extends WireCoupon>, List<? extends WireCoupon>> {

            /* renamed from: g */
            public final /* synthetic */ Optional<WireCoupon> f28858g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C6444a(Optional<WireCoupon> optional) {
                super(1);
                this.f28858g = optional;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final List<WireCoupon> invoke(List<WireCoupon> expiredCoupons) {
                List<WireCoupon> plus;
                Intrinsics.checkNotNullParameter(expiredCoupons, "expiredCoupons");
                plus = CollectionsKt___CollectionsKt.plus((Collection<? extends WireCoupon>) ((Collection<? extends Object>) expiredCoupons), this.f28858g.m59038b());
                return plus;
            }
        }

        public C6443o() {
            super(1);
        }

        /* renamed from: a */
        public final void m89970a(Optional<WireCoupon> optional) {
            C35169Pf1.this.f28839h.m71837i(new C6444a(optional));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Optional<WireCoupon> optional) {
            m89970a(optional);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0002 \u0003*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"LZ84;", "Lco/bird/android/buava/Optional;", "Lco/bird/android/model/wire/WireCoupon;", "kotlin.jvm.PlatformType", "invoke", "()LZ84;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Pf1$p */
    /* loaded from: classes4.dex */
    public static final class C6445p extends Lambda implements Function0<Z84<Optional<WireCoupon>>> {
        public C6445p() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final Z84<Optional<WireCoupon>> invoke() {
            return Z84.f47888d.m73663b(C35169Pf1.this.f28837f);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0002 \u0003*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"LZ84;", "Lco/bird/android/buava/Optional;", "Lco/bird/android/model/wire/WireCoupon;", "kotlin.jvm.PlatformType", "invoke", "()LZ84;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Pf1$q */
    /* loaded from: classes4.dex */
    public static final class C6446q extends Lambda implements Function0<Z84<Optional<WireCoupon>>> {
        public C6446q() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final Z84<Optional<WireCoupon>> invoke() {
            return Z84.f47888d.m73663b(C35169Pf1.this.f28838g);
        }
    }

    public C35169Pf1(JT0 dealManager, V74 promoManager, C36207Tq4 reactiveConfig, YR4 rideManager, InterfaceC35660Rh6 userStream) {
        Lazy lazy;
        Lazy lazy2;
        Lazy lazy3;
        Lazy lazy4;
        List emptyList;
        Intrinsics.checkNotNullParameter(dealManager, "dealManager");
        Intrinsics.checkNotNullParameter(promoManager, "promoManager");
        Intrinsics.checkNotNullParameter(reactiveConfig, "reactiveConfig");
        Intrinsics.checkNotNullParameter(rideManager, "rideManager");
        Intrinsics.checkNotNullParameter(userStream, "userStream");
        lazy = LazyKt__LazyJVMKt.lazy(new C6440m());
        this.f28832a = lazy;
        lazy2 = LazyKt__LazyJVMKt.lazy(new C6445p());
        this.f28833b = lazy2;
        lazy3 = LazyKt__LazyJVMKt.lazy(new C6446q());
        this.f28834c = lazy3;
        lazy4 = LazyKt__LazyJVMKt.lazy(new C6439l());
        this.f28835d = lazy4;
        C37791a94.C10586a c10586a = C37791a94.f49908h;
        Optional.C14443a c14443a = Optional.f63040c;
        this.f28836e = C37791a94.C10586a.create$default(c10586a, c14443a.m59034a(), null, 2, null);
        this.f28837f = C37791a94.C10586a.create$default(c10586a, c14443a.m59034a(), null, 2, null);
        this.f28838g = C37791a94.C10586a.create$default(c10586a, c14443a.m59034a(), null, 2, null);
        emptyList = CollectionsKt__CollectionsKt.emptyList();
        this.f28839h = C37791a94.C10586a.create$default(c10586a, emptyList, null, 2, null);
        Observable<User> mo76576i = userStream.mo76576i();
        ScopeProvider UNBOUND = ScopeProvider.f75557g0;
        Intrinsics.checkNotNullExpressionValue(UNBOUND, "UNBOUND");
        Object m33094as = mo76576i.m33094as(AutoDispose.m45239a(UNBOUND));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C6430c c6430c = new C6430c();
        ((ObservableSubscribeProxy) m33094as).subscribe(new InterfaceC23484g() { // from class: Cf1
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C35169Pf1.m89988t(Function1.this, obj);
            }
        });
        Observable m31956a = C24523e.f91168a.m31956a(reactiveConfig.m82413z3(), dealManager.mo92271e());
        final C6431d c6431d = new C6431d();
        Observable doOnNext = m31956a.doOnNext(new InterfaceC23484g() { // from class: Hf1
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C35169Pf1.m89987u(Function1.this, obj);
            }
        });
        final C6432e c6432e = C6432e.f28844g;
        Observable filter = doOnNext.filter(new InterfaceC23494q() { // from class: If1
            @Override // io.reactivex.functions.InterfaceC23494q
            public final boolean test(Object obj) {
                boolean m89985w;
                m89985w = C35169Pf1.m89985w(Function1.this, obj);
                return m89985w;
            }
        });
        final C6433f c6433f = new C6433f(dealManager);
        Observable doOnNext2 = filter.doOnNext(new InterfaceC23484g() { // from class: Jf1
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C35169Pf1.m89984x(Function1.this, obj);
            }
        });
        final C6434g c6434g = C6434g.f28847g;
        Observable map = doOnNext2.map(new InterfaceC23492o() { // from class: Kf1
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                Deal m89983y;
                m89983y = C35169Pf1.m89983y(Function1.this, obj);
                return m89983y;
            }
        });
        final C6435h c6435h = new C6435h(dealManager);
        Observable flatMapSingle = map.flatMapSingle(new InterfaceC23492o() { // from class: Lf1
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m89982z;
                m89982z = C35169Pf1.m89982z(Function1.this, obj);
                return m89982z;
            }
        });
        Intrinsics.checkNotNullExpressionValue(flatMapSingle, "Observables.combineLates…ate.ACKNOWLEDGED)\n      }");
        Intrinsics.checkNotNullExpressionValue(UNBOUND, "UNBOUND");
        Object m33094as2 = flatMapSingle.m33094as(AutoDispose.m45239a(UNBOUND));
        Intrinsics.checkExpressionValueIsNotNull(m33094as2, "this.`as`(AutoDispose.autoDisposable(provider))");
        ((ObservableSubscribeProxy) m33094as2).subscribe();
        Z84<List<WireCoupon>> mo27815C = promoManager.mo27815C();
        final C6436i c6436i = new C6436i(reactiveConfig, this);
        Observable<List<WireCoupon>> doOnNext3 = mo27815C.doOnNext(new InterfaceC23484g() { // from class: Mf1
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C35169Pf1.m90017A(Function1.this, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(doOnNext3, "promoManager\n      .prom…      }\n        }\n      }");
        Intrinsics.checkNotNullExpressionValue(UNBOUND, "UNBOUND");
        Object m33094as3 = doOnNext3.m33094as(AutoDispose.m45239a(UNBOUND));
        Intrinsics.checkExpressionValueIsNotNull(m33094as3, "this.`as`(AutoDispose.autoDisposable(provider))");
        ((ObservableSubscribeProxy) m33094as3).subscribe();
        Observable<Optional<RideState>> distinctUntilChanged = rideManager.mo75057R().distinctUntilChanged();
        final C6437j c6437j = C6437j.f28851g;
        Observable<Optional<RideState>> filter2 = distinctUntilChanged.filter(new InterfaceC23494q() { // from class: Nf1
            @Override // io.reactivex.functions.InterfaceC23494q
            public final boolean test(Object obj) {
                boolean m90016B;
                m90016B = C35169Pf1.m90016B(Function1.this, obj);
                return m90016B;
            }
        });
        Intrinsics.checkNotNullExpressionValue(filter2, "rideManager.primaryRideS…ideState.Status.STARTED }");
        Intrinsics.checkNotNullExpressionValue(UNBOUND, "UNBOUND");
        Object m33094as4 = filter2.m33094as(AutoDispose.m45239a(UNBOUND));
        Intrinsics.checkExpressionValueIsNotNull(m33094as4, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C6438k c6438k = new C6438k();
        ((ObservableSubscribeProxy) m33094as4).subscribe(new InterfaceC23484g() { // from class: Of1
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C35169Pf1.m90015C(Function1.this, obj);
            }
        });
        Observable<Optional<WireCoupon>> m90013E = m90013E(mo90007a());
        Intrinsics.checkNotNullExpressionValue(UNBOUND, "UNBOUND");
        Object m33094as5 = m90013E.m33094as(AutoDispose.m45239a(UNBOUND));
        Intrinsics.checkExpressionValueIsNotNull(m33094as5, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C6428a c6428a = new C6428a();
        ((ObservableSubscribeProxy) m33094as5).subscribe(new InterfaceC23484g() { // from class: Df1
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C35169Pf1.m90014D(Function1.this, obj);
            }
        });
        Observable<Optional<WireCoupon>> m90013E2 = m90013E(mo90002f());
        Intrinsics.checkNotNullExpressionValue(UNBOUND, "UNBOUND");
        Object m33094as6 = m90013E2.m33094as(AutoDispose.m45239a(UNBOUND));
        Intrinsics.checkExpressionValueIsNotNull(m33094as6, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C6429b c6429b = new C6429b();
        ((ObservableSubscribeProxy) m33094as6).subscribe(new InterfaceC23484g() { // from class: Gf1
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C35169Pf1.m89986v(Function1.this, obj);
            }
        });
    }

    /* renamed from: A */
    public static final void m90017A(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: B */
    public static final boolean m90016B(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return ((Boolean) tmp0.invoke(obj)).booleanValue();
    }

    /* renamed from: C */
    public static final void m90015C(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: D */
    public static final void m90014D(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: F */
    public static final InterfaceC23447K m90012F(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: G */
    public static final void m90011G(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: t */
    public static final void m89988t(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: u */
    public static final void m89987u(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: v */
    public static final void m89986v(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: w */
    public static final boolean m89985w(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return ((Boolean) tmp0.invoke(obj)).booleanValue();
    }

    /* renamed from: x */
    public static final void m89984x(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: y */
    public static final Deal m89983y(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (Deal) tmp0.invoke(obj);
    }

    /* renamed from: z */
    public static final InterfaceC23447K m89982z(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: E */
    public final Observable<Optional<WireCoupon>> m90013E(Observable<Optional<WireCoupon>> observable) {
        Observable<Optional<WireCoupon>> distinctUntilChanged = observable.distinctUntilChanged();
        final C6441n c6441n = C6441n.f28855g;
        Observable<R> switchMapSingle = distinctUntilChanged.switchMapSingle(new InterfaceC23492o() { // from class: Ef1
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m90012F;
                m90012F = C35169Pf1.m90012F(Function1.this, obj);
                return m90012F;
            }
        });
        final C6443o c6443o = new C6443o();
        Observable<Optional<WireCoupon>> doOnNext = switchMapSingle.doOnNext(new InterfaceC23484g() { // from class: Ff1
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C35169Pf1.m90011G(Function1.this, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(doOnNext, "private fun Observable<O…t()\n        }\n      }\n  }");
        return doOnNext;
    }

    /* renamed from: H */
    public final boolean m90010H(WireCoupon wireCoupon) {
        String str;
        WireCoupon m59035e = this.f28837f.getValue().m59035e();
        String str2 = null;
        if (m59035e != null) {
            str = m59035e.getId();
        } else {
            str = null;
        }
        if (!Intrinsics.areEqual(str, wireCoupon.getId())) {
            WireCoupon m59035e2 = this.f28838g.getValue().m59035e();
            if (m59035e2 != null) {
                str2 = m59035e2.getId();
            }
            if (!Intrinsics.areEqual(str2, wireCoupon.getId())) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: I */
    public final void m90009I() {
        this.f28838g.accept(Optional.f63040c.m59034a());
    }

    /* renamed from: J */
    public final void m90008J() {
        this.f28836e.m71836j();
        this.f28837f.m71836j();
        this.f28838g.m71836j();
        this.f28839h.m71836j();
    }

    @Override // p000.InterfaceC31893Bf1
    /* renamed from: a */
    public Z84<Optional<WireCoupon>> mo90007a() {
        return (Z84) this.f28833b.getValue();
    }

    @Override // p000.InterfaceC31893Bf1
    /* renamed from: b */
    public Z84<Optional<Deal>> mo90006b() {
        return (Z84) this.f28832a.getValue();
    }

    @Override // p000.InterfaceC31893Bf1
    /* renamed from: c */
    public void mo90005c() {
        this.f28839h.m71836j();
    }

    @Override // p000.InterfaceC31893Bf1
    /* renamed from: d */
    public Z84<List<WireCoupon>> mo90004d() {
        return (Z84) this.f28835d.getValue();
    }

    @Override // p000.InterfaceC31893Bf1
    /* renamed from: e */
    public void mo90003e() {
        this.f28837f.accept(Optional.f63040c.m59034a());
    }

    @Override // p000.InterfaceC31893Bf1
    /* renamed from: f */
    public Z84<Optional<WireCoupon>> mo90002f() {
        return (Z84) this.f28834c.getValue();
    }
}
