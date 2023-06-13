package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.buava.Optional;
import co.bird.android.model.Deal;
import co.bird.android.model.DealKt;
import co.bird.android.model.User;
import co.bird.api.request.DealAcceptRequest;
import co.bird.api.request.DealAcknowledgmentState;
import co.bird.api.request.DealStateUpdateRequest;
import com.amazonaws.mobileconnectors.p025s3.transferutility.TransferTable;
import com.facebook.share.internal.C17296a;
import com.stripe.android.model.PaymentMethodOptionsParams;
import com.stripe.android.model.Stripe3ds2AuthResult;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.ObservableSubscribeProxy;
import com.uber.autodispose.ScopeProvider;
import io.reactivex.AbstractC23442F;
import io.reactivex.InterfaceC23435C;
import io.reactivex.InterfaceC23448L;
import io.reactivex.InterfaceC23497i;
import io.reactivex.InterfaceC24575v;
import io.reactivex.Observable;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.schedulers.C24542a;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
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
import org.joda.time.DateTime;
import org.joda.time.ReadableInstant;
import p000.C37791a94;
import p000.InterfaceC38798br4;
@Metadata(m28433d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 .2\u00020\u00012\u00020\u0002:\u0001\u0014B!\b\u0007\u0012\u0006\u0010\u0018\u001a\u00020\u0015\u0012\u0006\u0010\u001b\u001a\u00020\u0019\u0012\u0006\u0010+\u001a\u00020*¢\u0006\u0004\b,\u0010-J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\b\u0010\u0007\u001a\u00020\u0005H\u0002J\b\u0010\b\u001a\u00020\u0005H\u0002J\u0010\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u0003H\u0016J\u0010\u0010\f\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u0003H\u0016J$\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00100\u000f2\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\rH\u0016J&\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00100\u000f2\u0006\u0010\t\u001a\u00020\u00032\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0016R\u0014\u0010\u0018\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001b\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u001aR,\u0010 \u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0012\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u001e0\u001d0\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u001fR \u0010\"\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u001e0\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\u001fRM\u0010(\u001a4\u00120\u0012.\u0012\u0004\u0012\u00020\u0012\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u001e $*\u0016\u0012\u0004\u0012\u00020\u0012\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u001e\u0018\u00010\u001d0\u001d0#8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010%\u001a\u0004\b&\u0010'R5\u0010)\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0003 $*\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u001e0\u001e0#8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010%\u001a\u0004\b!\u0010'¨\u0006/"}, m28432d2 = {"LOT0;", "LJT0;", "Lbr4;", "Lco/bird/android/model/Deal;", "doneDeal", "", Stripe3ds2AuthResult.Ares.VALUE_CHALLENGE, "z", "D", "deal", "f", "dealSeen", "g", "Lco/bird/api/request/DealAcknowledgmentState;", TransferTable.COLUMN_STATE, "Lio/reactivex/F;", "LHM4;", DateTokenConverter.CONVERTER_KEY, "", "stripePaymentSource", "c", "LIT0;", "b", "LIT0;", PaymentMethodOptionsParams.WeChatPay.PARAM_CLIENT, "Lgl;", "Lgl;", "preference", "La94;", "", "Lco/bird/android/buava/Optional;", "La94;", "mutableDealMap", "e", "mutableDeal", "LZ84;", "kotlin.jvm.PlatformType", "Lkotlin/Lazy;", "getDeals", "()LZ84;", "deals", "latestDeal", "LRh6;", "userStream", "<init>", "(LIT0;Lgl;LRh6;)V", "h", "ride_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nDealManagerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DealManagerImpl.kt\nco/bird/android/manager/ride/DealManagerImpl\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n+ 3 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,165:1\n180#2:166\n180#2:167\n215#3,2:168\n*S KotlinDebug\n*F\n+ 1 DealManagerImpl.kt\nco/bird/android/manager/ride/DealManagerImpl\n*L\n45#1:166\n57#1:167\n142#1:168,2\n*E\n"})
/* renamed from: OT0 */
/* loaded from: classes4.dex */
public final class OT0 implements JT0, InterfaceC38798br4 {

    /* renamed from: h */
    public static final C6005c f26600h = new C6005c(null);

    /* renamed from: b */
    public final IT0 f26601b;

    /* renamed from: c */
    public final C22454gl f26602c;

    /* renamed from: d */
    public final C37791a94<Map<String, Optional<Deal>>> f26603d;

    /* renamed from: e */
    public final C37791a94<Optional<Deal>> f26604e;

    /* renamed from: f */
    public final Lazy f26605f;

    /* renamed from: g */
    public final Lazy f26606g;

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/User;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lco/bird/android/model/User;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: OT0$a */
    /* loaded from: classes4.dex */
    public static final class C6003a extends Lambda implements Function1<User, Unit> {
        public C6003a() {
            super(1);
        }

        /* renamed from: a */
        public final void m92259a(User user) {
            OT0.this.m92275D();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(User user) {
            m92259a(user);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Ljava/lang/Long;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: OT0$b */
    /* loaded from: classes4.dex */
    public static final class C6004b extends Lambda implements Function1<Long, Unit> {
        public C6004b() {
            super(1);
        }

        /* renamed from: a */
        public final void m92258a(Long l) {
            OT0.this.m92260z();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Long l) {
            m92258a(l);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, m28432d2 = {"LOT0$c;", "", "", "CLEANUP_INTERVAL", "J", "<init>", "()V", "ride_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: OT0$c */
    /* loaded from: classes4.dex */
    public static final class C6005c {
        public /* synthetic */ C6005c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C6005c() {
        }
    }

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u00012\u001a\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0001 \u0002*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"LHM4;", "", "kotlin.jvm.PlatformType", "response", C17296a.f69688o, "(LHM4;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: OT0$d */
    /* loaded from: classes4.dex */
    public static final class C6006d extends Lambda implements Function1<HM4<Unit>, Unit> {

        /* renamed from: h */
        public final /* synthetic */ Deal f26610h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C6006d(Deal deal) {
            super(1);
            this.f26610h = deal;
        }

        /* renamed from: a */
        public final void m92257a(HM4<Unit> hm4) {
            if (hm4.m103939f()) {
                OT0.this.m92276C(this.f26610h);
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(HM4<Unit> hm4) {
            m92257a(hm4);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u00012\u001a\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0001 \u0002*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"LHM4;", "", "kotlin.jvm.PlatformType", "it", C17296a.f69688o, "(LHM4;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: OT0$e */
    /* loaded from: classes4.dex */
    public static final class C6007e extends Lambda implements Function1<HM4<Unit>, Unit> {

        /* renamed from: g */
        public final /* synthetic */ DealAcknowledgmentState f26611g;

        /* renamed from: h */
        public final /* synthetic */ OT0 f26612h;

        /* renamed from: i */
        public final /* synthetic */ Deal f26613i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C6007e(DealAcknowledgmentState dealAcknowledgmentState, OT0 ot0, Deal deal) {
            super(1);
            this.f26611g = dealAcknowledgmentState;
            this.f26612h = ot0;
            this.f26613i = deal;
        }

        /* renamed from: a */
        public final void m92256a(HM4<Unit> hm4) {
            if (this.f26611g == DealAcknowledgmentState.REFUSED) {
                this.f26612h.m92276C(this.f26613i);
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(HM4<Unit> hm4) {
            m92256a(hm4);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u0014\u0012\u0004\u0012\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u00002\u0018\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"", "", "Lco/bird/android/buava/Optional;", "Lco/bird/android/model/Deal;", "dealMap", C17296a.f69688o, "(Ljava/util/Map;)Ljava/util/Map;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: OT0$f */
    /* loaded from: classes4.dex */
    public static final class C6008f extends Lambda implements Function1<Map<String, Optional<Deal>>, Map<String, Optional<Deal>>> {

        /* renamed from: g */
        public final /* synthetic */ Deal f26614g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C6008f(Deal deal) {
            super(1);
            this.f26614g = deal;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Map<String, Optional<Deal>> invoke(Map<String, Optional<Deal>> dealMap) {
            Intrinsics.checkNotNullParameter(dealMap, "dealMap");
            dealMap.put(this.f26614g.getId(), Optional.f63040c.m59032c(this.f26614g));
            return dealMap;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\b\u001a4\u00120\u0012.\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003 \u0005*\u0016\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"LZ84;", "", "", "Lco/bird/android/buava/Optional;", "Lco/bird/android/model/Deal;", "kotlin.jvm.PlatformType", "invoke", "()LZ84;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: OT0$g */
    /* loaded from: classes4.dex */
    public static final class C6009g extends Lambda implements Function0<Z84<Map<String, Optional<Deal>>>> {
        public C6009g() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final Z84<Map<String, Optional<Deal>>> invoke() {
            return Z84.f47888d.m73663b(OT0.this.f26603d);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0002 \u0003*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"LZ84;", "Lco/bird/android/buava/Optional;", "Lco/bird/android/model/Deal;", "kotlin.jvm.PlatformType", "invoke", "()LZ84;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: OT0$h */
    /* loaded from: classes4.dex */
    public static final class C6010h extends Lambda implements Function0<Z84<Optional<Deal>>> {
        public C6010h() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final Z84<Optional<Deal>> invoke() {
            return Z84.f47888d.m73663b(OT0.this.f26604e);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u0014\u0012\u0004\u0012\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u00002\u0018\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"", "", "Lco/bird/android/buava/Optional;", "Lco/bird/android/model/Deal;", "dealMap", C17296a.f69688o, "(Ljava/util/Map;)Ljava/util/Map;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: OT0$i */
    /* loaded from: classes4.dex */
    public static final class C6011i extends Lambda implements Function1<Map<String, Optional<Deal>>, Map<String, Optional<Deal>>> {

        /* renamed from: g */
        public final /* synthetic */ Deal f26617g;

        /* renamed from: h */
        public final /* synthetic */ OT0 f26618h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C6011i(Deal deal, OT0 ot0) {
            super(1);
            this.f26617g = deal;
            this.f26618h = ot0;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Map<String, Optional<Deal>> invoke(Map<String, Optional<Deal>> dealMap) {
            Deal copy;
            Intrinsics.checkNotNullParameter(dealMap, "dealMap");
            if (this.f26617g.getShownAt() == null && dealMap.containsKey(this.f26617g.getId())) {
                copy = r3.copy((r28 & 1) != 0 ? r3.type : null, (r28 & 2) != 0 ? r3.f66584id : null, (r28 & 4) != 0 ? r3.addAmount : 0, (r28 & 8) != 0 ? r3.duration : 0, (r28 & 16) != 0 ? r3.currency : null, (r28 & 32) != 0 ? r3.expiresAt : null, (r28 & 64) != 0 ? r3.bannerTitle : null, (r28 & 128) != 0 ? r3.bannerSubtitle : null, (r28 & 256) != 0 ? r3.title : null, (r28 & 512) != 0 ? r3.subtitle : null, (r28 & 1024) != 0 ? r3.accept : null, (r28 & 2048) != 0 ? r3.reject : null, (r28 & 4096) != 0 ? this.f26617g.shownAt : DateTime.now());
                String id = this.f26617g.getId();
                Optional.C14443a c14443a = Optional.f63040c;
                dealMap.put(id, c14443a.m59032c(copy));
                this.f26618h.f26602c.m37749B1(copy);
                if (((Optional) this.f26618h.f26604e.getValue()).m59037c() && Intrinsics.areEqual(((Deal) ((Optional) this.f26618h.f26604e.getValue()).m59038b()).getId(), this.f26617g.getId())) {
                    this.f26618h.f26604e.accept(c14443a.m59032c(copy));
                }
            }
            return dealMap;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u0014\u0012\u0004\u0012\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u00002\u0018\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"", "", "Lco/bird/android/buava/Optional;", "Lco/bird/android/model/Deal;", "dealMap", C17296a.f69688o, "(Ljava/util/Map;)Ljava/util/Map;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: OT0$j */
    /* loaded from: classes4.dex */
    public static final class C6012j extends Lambda implements Function1<Map<String, Optional<Deal>>, Map<String, Optional<Deal>>> {

        /* renamed from: g */
        public final /* synthetic */ Deal f26619g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C6012j(Deal deal) {
            super(1);
            this.f26619g = deal;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Map<String, Optional<Deal>> invoke(Map<String, Optional<Deal>> dealMap) {
            Intrinsics.checkNotNullParameter(dealMap, "dealMap");
            dealMap.put(this.f26619g.getId(), Optional.f63040c.m59034a());
            return dealMap;
        }
    }

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"Lco/bird/android/buava/Optional;", "Lco/bird/android/model/Deal;", "deal", C17296a.f69688o, "(Lco/bird/android/buava/Optional;)Lco/bird/android/buava/Optional;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: OT0$k */
    /* loaded from: classes4.dex */
    public static final class C6013k extends Lambda implements Function1<Optional<Deal>, Optional<Deal>> {

        /* renamed from: g */
        public final /* synthetic */ Deal f26620g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C6013k(Deal deal) {
            super(1);
            this.f26620g = deal;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Optional<Deal> invoke(Optional<Deal> deal) {
            Intrinsics.checkNotNullParameter(deal, "deal");
            if (deal.m59037c() && Intrinsics.areEqual(deal.m59038b().getId(), this.f26620g.getId())) {
                return Optional.f63040c.m59034a();
            }
            return deal;
        }
    }

    public OT0(IT0 client, C22454gl preference, InterfaceC35660Rh6 userStream) {
        Lazy lazy;
        Lazy lazy2;
        Intrinsics.checkNotNullParameter(client, "client");
        Intrinsics.checkNotNullParameter(preference, "preference");
        Intrinsics.checkNotNullParameter(userStream, "userStream");
        this.f26601b = client;
        this.f26602c = preference;
        C37791a94.C10586a c10586a = C37791a94.f49908h;
        this.f26603d = C37791a94.C10586a.create$default(c10586a, new LinkedHashMap(), null, 2, null);
        Optional.C14443a c14443a = Optional.f63040c;
        C37791a94<Optional<Deal>> create$default = C37791a94.C10586a.create$default(c10586a, c14443a.m59034a(), null, 2, null);
        this.f26604e = create$default;
        Observable<User> mo76576i = userStream.mo76576i();
        ScopeProvider UNBOUND = ScopeProvider.f75557g0;
        Intrinsics.checkNotNullExpressionValue(UNBOUND, "UNBOUND");
        Object m33094as = mo76576i.m33094as(AutoDispose.m45239a(UNBOUND));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C6003a c6003a = new C6003a();
        ((ObservableSubscribeProxy) m33094as).subscribe(new InterfaceC23484g() { // from class: KT0
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                OT0.m92264v(Function1.this, obj);
            }
        });
        Deal m37755A = preference.m37755A();
        if (m37755A != null && DealKt.shouldShowAgain(m37755A)) {
            create$default.accept(c14443a.m59032c(m37755A));
        }
        Observable<Long> subscribeOn = Observable.interval(0L, 10L, TimeUnit.SECONDS).subscribeOn(C24542a.m31932c());
        Intrinsics.checkNotNullExpressionValue(subscribeOn, "interval(0, CLEANUP_INTE…scribeOn(Schedulers.io())");
        Intrinsics.checkNotNullExpressionValue(UNBOUND, "UNBOUND");
        Object m33094as2 = subscribeOn.m33094as(AutoDispose.m45239a(UNBOUND));
        Intrinsics.checkExpressionValueIsNotNull(m33094as2, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C6004b c6004b = new C6004b();
        ((ObservableSubscribeProxy) m33094as2).subscribe(new InterfaceC23484g() { // from class: LT0
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                OT0.m92263w(Function1.this, obj);
            }
        });
        lazy = LazyKt__LazyJVMKt.lazy(new C6009g());
        this.f26605f = lazy;
        lazy2 = LazyKt__LazyJVMKt.lazy(new C6010h());
        this.f26606g = lazy2;
    }

    /* renamed from: v */
    public static final void m92264v(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: w */
    public static final void m92263w(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: x */
    public static final void m92262x(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: y */
    public static final void m92261y(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: C */
    public final void m92276C(Deal deal) {
        this.f26603d.m71837i(new C6012j(deal));
        this.f26604e.m71837i(new C6013k(deal));
        Deal m37755A = this.f26602c.m37755A();
        if (m37755A != null && Intrinsics.areEqual(m37755A.getId(), deal.getId())) {
            this.f26602c.m37632e();
        }
    }

    /* renamed from: D */
    public final void m92275D() {
        this.f26603d.m71836j();
        this.f26604e.m71836j();
    }

    /* renamed from: F */
    public <T> AbstractC23442F<T> m92274F(AbstractC23442F<T> abstractC23442F) {
        return InterfaceC38798br4.C13315a.m62279p(this, abstractC23442F);
    }

    @Override // p000.InterfaceC38798br4
    /* renamed from: c */
    public InterfaceC23497i mo212c() {
        return InterfaceC38798br4.C13315a.m62290e(this);
    }

    @Override // p000.JT0
    /* renamed from: d */
    public AbstractC23442F<HM4<Unit>> mo92272d(Deal deal, DealAcknowledgmentState state) {
        Intrinsics.checkNotNullParameter(deal, "deal");
        Intrinsics.checkNotNullParameter(state, "state");
        AbstractC23442F<HM4<Unit>> m102389a = this.f26601b.m102389a(new DealStateUpdateRequest(deal.getId(), state));
        final C6007e c6007e = new C6007e(state, this, deal);
        AbstractC23442F<HM4<Unit>> m33101w = m102389a.m33101w(new InterfaceC23484g() { // from class: MT0
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                OT0.m92261y(Function1.this, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(m33101w, "override fun ackDeal(dea…}\n      .schedulers()\n  }");
        AbstractC23442F<HM4<Unit>> m92274F = m92274F(m33101w);
        Intrinsics.checkNotNullExpressionValue(m92274F, "override fun ackDeal(dea…}\n      .schedulers()\n  }");
        return m92274F;
    }

    @Override // p000.JT0
    /* renamed from: e */
    public Z84<Optional<Deal>> mo92271e() {
        return (Z84) this.f26606g.getValue();
    }

    @Override // p000.JT0
    /* renamed from: f */
    public void mo92270f(Deal deal) {
        Intrinsics.checkNotNullParameter(deal, "deal");
        this.f26603d.m71837i(new C6008f(deal));
        this.f26604e.accept(Optional.f63040c.m59032c(deal));
    }

    @Override // p000.JT0
    /* renamed from: g */
    public void mo92269g(Deal dealSeen) {
        Intrinsics.checkNotNullParameter(dealSeen, "dealSeen");
        this.f26603d.m71837i(new C6011i(dealSeen, this));
    }

    @Override // p000.InterfaceC38798br4
    /* renamed from: o */
    public <T> InterfaceC23435C<T, T> mo208o() {
        return InterfaceC38798br4.C13315a.m62286i(this);
    }

    @Override // p000.InterfaceC38798br4
    /* renamed from: s */
    public <T> InterfaceC23448L<T, T> mo207s() {
        return InterfaceC38798br4.C13315a.m62284k(this);
    }

    /* renamed from: z */
    public final void m92260z() {
        for (Map.Entry<String, Optional<Deal>> entry : this.f26603d.getValue().entrySet()) {
            Optional<Deal> value = entry.getValue();
            if (value.m59037c()) {
                DateTime expiresAt = value.m59038b().getExpiresAt();
                if (expiresAt != null && expiresAt.compareTo((ReadableInstant) DateTime.now()) < 0) {
                    m92276C(value.m59038b());
                }
                DateTime shownAt = value.m59038b().getShownAt();
                if (shownAt != null && shownAt.plus(TimeUnit.SECONDS.toMillis(value.m59038b().getDuration())).isBeforeNow()) {
                    m92276C(value.m59038b());
                }
            }
        }
    }

    @Override // p000.JT0
    /* renamed from: c */
    public AbstractC23442F<HM4<Unit>> mo92273c(Deal deal, String str) {
        Intrinsics.checkNotNullParameter(deal, "deal");
        AbstractC23442F<HM4<Unit>> m102388b = this.f26601b.m102388b(new DealAcceptRequest(deal.getId(), str));
        final C6006d c6006d = new C6006d(deal);
        AbstractC23442F<HM4<Unit>> m33101w = m102388b.m33101w(new InterfaceC23484g() { // from class: NT0
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                OT0.m92262x(Function1.this, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(m33101w, "override fun acceptDeal(…}\n      .schedulers()\n  }");
        AbstractC23442F<HM4<Unit>> m92274F = m92274F(m33101w);
        Intrinsics.checkNotNullExpressionValue(m92274F, "override fun acceptDeal(…}\n      .schedulers()\n  }");
        return m92274F;
    }

    @Override // p000.InterfaceC38798br4
    /* renamed from: m */
    public <T> InterfaceC24575v<T, T> mo209m() {
        return InterfaceC38798br4.C13315a.m62288g(this);
    }
}
