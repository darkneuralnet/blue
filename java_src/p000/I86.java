package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.constant.OrderItemType;
import co.bird.android.model.wire.WireServiceCenterOrderSection;
import co.bird.android.model.wire.WireTransferOrderFilter;
import co.bird.api.response.ServiceCenterOrderViewResponse;
import com.facebook.share.internal.C17296a;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.ObservableSubscribeProxy;
import com.uber.autodispose.ScopeProvider;
import io.reactivex.AbstractC23442F;
import io.reactivex.InterfaceC23447K;
import io.reactivex.InterfaceC24574u;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.C23454a;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.functions.InterfaceC23492o;
import io.reactivex.rxkotlin.C24523e;
import io.reactivex.rxkotlin.C24527f;
import io.reactivex.schedulers.C24542a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Triple;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.joda.time.DateTime;
import org.joda.time.Days;
import p000.I86;
@Metadata(m28433d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001BA\b\u0007\u0012\u0006\u0010\n\u001a\u00020\u0007\u0012\u0006\u0010\u000e\u001a\u00020\u000b\u0012\u0006\u0010\u0012\u001a\u00020\u000f\u0012\u0006\u0010\u0015\u001a\u00020\u0013\u0012\u0006\u0010\u0019\u001a\u00020\u0016\u0012\u0006\u0010\u001d\u001a\u00020\u001a\u0012\u0006\u0010!\u001a\u00020\u001e¢\u0006\u0004\b2\u00103J\u0015\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0096\u0001J\b\u0010\u0006\u001a\u00020\u0004H\u0016R\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\u000e\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u0012\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0015\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0014R\u0014\u0010\u0019\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001d\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010!\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u001c\u0010&\u001a\n #*\u0004\u0018\u00010\"0\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u001c\u0010(\u001a\n #*\u0004\u0018\u00010\"0\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010%R:\u0010-\u001a(\u0012$\u0012\"\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\" #*\u0010\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\"\u0018\u00010*0*0)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R.\u00101\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020/ #*\n\u0012\u0004\u0012\u00020/\u0018\u00010.0.0)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u0010,¨\u00064"}, m28432d2 = {"LI86;", "LSx6;", "LRx6;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "", DateTokenConverter.CONVERTER_KEY, "onResume", "LK86;", C17296a.f69688o, "LK86;", "landingUi", "LTq4;", "b", "LTq4;", "reactiveConfig", "LYl2;", "c", "LYl2;", "converter", "Le13;", "Le13;", "navigator", "Lcom/uber/autodispose/ScopeProvider;", "e", "Lcom/uber/autodispose/ScopeProvider;", "scopeProvider", "LO86;", "f", "LO86;", "transferOrderManager", "Liy6;", "g", "Liy6;", "warehouseChecker", "Lorg/joda/time/DateTime;", "kotlin.jvm.PlatformType", "h", "Lorg/joda/time/DateTime;", "defaultStartDate", "i", "defaultEndDate", "LAG;", "Lkotlin/Pair;", "j", "LAG;", "dateRangeRelay", "", "Lco/bird/android/model/wire/WireTransferOrderFilter;", "k", "filtersRelay", "<init>", "(LK86;LTq4;LYl2;Le13;Lcom/uber/autodispose/ScopeProvider;LO86;Liy6;)V", "co.bird.android.feature.transfer-order"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nTransferOrderLandingPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TransferOrderLandingPresenter.kt\nco/bird/android/feature/transferorder/landing/TransferOrderLandingPresenter\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n*L\n1#1,123:1\n180#2:124\n180#2:125\n180#2:126\n180#2:127\n180#2:128\n180#2:129\n*S KotlinDebug\n*F\n+ 1 TransferOrderLandingPresenter.kt\nco/bird/android/feature/transferorder/landing/TransferOrderLandingPresenter\n*L\n52#1:124\n84#1:125\n97#1:126\n103#1:127\n108#1:128\n113#1:129\n*E\n"})
/* renamed from: I86 */
/* loaded from: classes3.dex */
public final class I86 implements InterfaceC36038Sx6 {

    /* renamed from: a */
    public final K86 f14585a;

    /* renamed from: b */
    public final C36207Tq4 f14586b;

    /* renamed from: c */
    public final C37330Yl2 f14587c;

    /* renamed from: d */
    public final InterfaceC40099e13 f14588d;

    /* renamed from: e */
    public final ScopeProvider f14589e;

    /* renamed from: f */
    public final O86 f14590f;

    /* renamed from: g */
    public final C43038iy6 f14591g;

    /* renamed from: h */
    public final DateTime f14592h;

    /* renamed from: i */
    public final DateTime f14593i;

    /* renamed from: j */
    public final C0058AG<Pair<DateTime, DateTime>> f14594j;

    /* renamed from: k */
    public final C0058AG<List<WireTransferOrderFilter>> f14595k;

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001aZ\u0012&\b\u0001\u0012\"\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004 \u0005*\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003 \u0005*,\u0012&\b\u0001\u0012\"\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004 \u0005*\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"", "it", "Lio/reactivex/u;", "Lkotlin/Pair;", "Lorg/joda/time/DateTime;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lkotlin/Unit;)Lio/reactivex/u;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: I86$a */
    /* loaded from: classes3.dex */
    public static final class C3344a extends Lambda implements Function1<Unit, InterfaceC24574u<? extends Pair<? extends DateTime, ? extends DateTime>>> {
        public C3344a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC24574u<? extends Pair<DateTime, DateTime>> invoke(Unit it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return I86.this.f14585a.m99164Tl();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012&\u0010\u0002\u001a\"\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005 \u0006*\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0007"}, m28432d2 = {"<anonymous>", "", "<name for destructuring parameter 0>", "Lkotlin/Pair;", "", "Lco/bird/android/model/constant/OrderItemType;", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: I86$b */
    /* loaded from: classes3.dex */
    public static final class C3345b extends Lambda implements Function1<Pair<? extends String, ? extends OrderItemType>, Unit> {

        @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: I86$b$a */
        /* loaded from: classes3.dex */
        public /* synthetic */ class C3346a {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[OrderItemType.values().length];
                try {
                    iArr[OrderItemType.CONTAINER.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[OrderItemType.SKU.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public C3345b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Pair<? extends String, ? extends OrderItemType> pair) {
            invoke2((Pair<String, ? extends OrderItemType>) pair);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Pair<String, ? extends OrderItemType> pair) {
            String component1 = pair.component1();
            int i = C3346a.$EnumSwitchMapping$0[pair.component2().ordinal()];
            if (i == 1) {
                I86.this.f14588d.mo36919x0(component1);
            } else if (i != 2) {
            } else {
                I86.this.f14588d.mo37079V3(component1);
            }
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: I86$c */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C3347c extends FunctionReferenceImpl implements Function1<Boolean, Unit> {
        public C3347c(Object obj) {
            super(1, obj, K86.class, "showContainerOrderScanner", "showContainerOrderScanner(Z)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
            invoke(bool.booleanValue());
            return Unit.INSTANCE;
        }

        public final void invoke(boolean z) {
            ((K86) this.receiver).m99163Ul(z);
        }
    }

    @Metadata(m28433d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u0010\n\u001a¢\u0001\u0012J\b\u0001\u0012F\u0012\u0004\u0012\u00020\b\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\u0000\u0012\u0004\u0012\u00020\t \u0002*\"\u0012\u0004\u0012\u00020\b\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\u0000\u0012\u0004\u0012\u00020\t\u0018\u00010\u00070\u0007 \u0002*P\u0012J\b\u0001\u0012F\u0012\u0004\u0012\u00020\b\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\u0000\u0012\u0004\u0012\u00020\t \u0002*\"\u0012\u0004\u0012\u00020\b\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\u0000\u0012\u0004\u0012\u00020\t\u0018\u00010\u00070\u0007\u0018\u00010\u00060\u00062F\u0010\u0005\u001aB\u0012$\u0012\"\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0001 \u0002*\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00000\u0000\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0002*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u00030\u0000H\n¢\u0006\u0004\b\n\u0010\u000b"}, m28432d2 = {"Lkotlin/Pair;", "Lorg/joda/time/DateTime;", "kotlin.jvm.PlatformType", "", "Lco/bird/android/model/wire/WireTransferOrderFilter;", "<name for destructuring parameter 0>", "Lio/reactivex/K;", "Lkotlin/Triple;", "Lco/bird/api/response/ServiceCenterOrderViewResponse;", "", "b", "(Lkotlin/Pair;)Lio/reactivex/K;"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nTransferOrderLandingPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TransferOrderLandingPresenter.kt\nco/bird/android/feature/transferorder/landing/TransferOrderLandingPresenter$onResume$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,123:1\n1549#2:124\n1620#2,3:125\n*S KotlinDebug\n*F\n+ 1 TransferOrderLandingPresenter.kt\nco/bird/android/feature/transferorder/landing/TransferOrderLandingPresenter$onResume$2\n*L\n64#1:124\n64#1:125,3\n*E\n"})
    /* renamed from: I86$d */
    /* loaded from: classes3.dex */
    public static final class C3348d extends Lambda implements Function1<Pair<? extends Pair<? extends DateTime, ? extends DateTime>, ? extends List<? extends WireTransferOrderFilter>>, InterfaceC23447K<? extends Triple<? extends ServiceCenterOrderViewResponse, ? extends Pair<? extends DateTime, ? extends DateTime>, ? extends Integer>>> {

        @Metadata(m28433d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0007\u001aF\u0012\u0004\u0012\u00020\u0000\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0004\u0012\u00020\u0005 \u0006*\"\u0012\u0004\u0012\u00020\u0000\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0007\u0010\b"}, m28432d2 = {"Lco/bird/api/response/ServiceCenterOrderViewResponse;", "response", "Lkotlin/Triple;", "Lkotlin/Pair;", "Lorg/joda/time/DateTime;", "", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/api/response/ServiceCenterOrderViewResponse;)Lkotlin/Triple;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: I86$d$a */
        /* loaded from: classes3.dex */
        public static final class C3349a extends Lambda implements Function1<ServiceCenterOrderViewResponse, Triple<? extends ServiceCenterOrderViewResponse, ? extends Pair<? extends DateTime, ? extends DateTime>, ? extends Integer>> {

            /* renamed from: g */
            public final /* synthetic */ DateTime f14599g;

            /* renamed from: h */
            public final /* synthetic */ DateTime f14600h;

            /* renamed from: i */
            public final /* synthetic */ List<WireTransferOrderFilter> f14601i;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C3349a(DateTime dateTime, DateTime dateTime2, List<WireTransferOrderFilter> list) {
                super(1);
                this.f14599g = dateTime;
                this.f14600h = dateTime2;
                this.f14601i = list;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final Triple<ServiceCenterOrderViewResponse, Pair<DateTime, DateTime>, Integer> invoke(ServiceCenterOrderViewResponse response) {
                Intrinsics.checkNotNullParameter(response, "response");
                return new Triple<>(response, TuplesKt.m28425to(this.f14599g, this.f14600h), Integer.valueOf(this.f14601i.size()));
            }
        }

        public C3348d() {
            super(1);
        }

        /* renamed from: c */
        public static final Triple m102858c(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (Triple) tmp0.invoke(obj);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b */
        public final InterfaceC23447K<? extends Triple<ServiceCenterOrderViewResponse, Pair<DateTime, DateTime>, Integer>> invoke(Pair<Pair<DateTime, DateTime>, ? extends List<WireTransferOrderFilter>> pair) {
            int collectionSizeOrDefault;
            Intrinsics.checkNotNullParameter(pair, "<name for destructuring parameter 0>");
            Pair<DateTime, DateTime> component1 = pair.component1();
            List<WireTransferOrderFilter> filters = pair.component2();
            DateTime component12 = component1.component1();
            DateTime component2 = component1.component2();
            O86 o86 = I86.this.f14590f;
            Intrinsics.checkNotNullExpressionValue(filters, "filters");
            List<WireTransferOrderFilter> list = filters;
            collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10);
            ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
            for (WireTransferOrderFilter wireTransferOrderFilter : list) {
                arrayList.add(wireTransferOrderFilter.getCode());
            }
            AbstractC23442F<ServiceCenterOrderViewResponse> m33146T = o86.mo80299e(component12, component2, arrayList).m33146T(3L);
            final C3349a c3349a = new C3349a(component12, component2, filters);
            return m33146T.m33157I(new InterfaceC23492o() { // from class: J86
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj) {
                    Triple m102858c;
                    m102858c = I86.C3348d.m102858c(Function1.this, obj);
                    return m102858c;
                }
            });
        }
    }

    @Metadata(m28433d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\n\u001a:\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0004 \t*\u001c\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00000\u00002$\u0010\u0005\u001a \u0012\u0004\u0012\u00020\u0001\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0004\u0012\u00020\u00040\u0000H\n¢\u0006\u0004\b\n\u0010\u000b"}, m28432d2 = {"Lkotlin/Triple;", "Lco/bird/api/response/ServiceCenterOrderViewResponse;", "Lkotlin/Pair;", "Lorg/joda/time/DateTime;", "", "<name for destructuring parameter 0>", "", "LH6;", "", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lkotlin/Triple;)Lkotlin/Triple;"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nTransferOrderLandingPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TransferOrderLandingPresenter.kt\nco/bird/android/feature/transferorder/landing/TransferOrderLandingPresenter$onResume$3\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,123:1\n1747#2,3:124\n*S KotlinDebug\n*F\n+ 1 TransferOrderLandingPresenter.kt\nco/bird/android/feature/transferorder/landing/TransferOrderLandingPresenter$onResume$3\n*L\n78#1:124,3\n*E\n"})
    /* renamed from: I86$e */
    /* loaded from: classes3.dex */
    public static final class C3350e extends Lambda implements Function1<Triple<? extends ServiceCenterOrderViewResponse, ? extends Pair<? extends DateTime, ? extends DateTime>, ? extends Integer>, Triple<? extends List<? extends C3023H6>, ? extends Boolean, ? extends Integer>> {
        public C3350e() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Triple<List<C3023H6>, Boolean, Integer> invoke(Triple<ServiceCenterOrderViewResponse, Pair<DateTime, DateTime>, Integer> triple) {
            Intrinsics.checkNotNullParameter(triple, "<name for destructuring parameter 0>");
            ServiceCenterOrderViewResponse component1 = triple.component1();
            int intValue = triple.component3().intValue();
            List<C3023H6> m74319a = I86.this.f14587c.m74319a(triple.component2(), component1.getSections());
            List<WireServiceCenterOrderSection> sections = component1.getSections();
            boolean z = false;
            if (!(sections instanceof Collection) || !sections.isEmpty()) {
                Iterator<T> it = sections.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    } else if (!((WireServiceCenterOrderSection) it.next()).getItems().isEmpty()) {
                        z = true;
                        break;
                    }
                }
            }
            return new Triple<>(m74319a, Boolean.valueOf(z), Integer.valueOf(intValue));
        }
    }

    @Metadata(m28433d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\b\u001a\u00020\u00072>\u0010\u0006\u001a:\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0001\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004 \u0005*\u001c\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0001\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\b\u0010\t"}, m28432d2 = {"Lkotlin/Triple;", "", "LH6;", "", "", "kotlin.jvm.PlatformType", "<name for destructuring parameter 0>", "", C17296a.f69688o, "(Lkotlin/Triple;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: I86$f */
    /* loaded from: classes3.dex */
    public static final class C3351f extends Lambda implements Function1<Triple<? extends List<? extends C3023H6>, ? extends Boolean, ? extends Integer>, Unit> {
        public C3351f() {
            super(1);
        }

        /* renamed from: a */
        public final void m102855a(Triple<? extends List<C3023H6>, Boolean, Integer> triple) {
            boolean booleanValue = triple.component2().booleanValue();
            int intValue = triple.component3().intValue();
            I86.this.f14585a.m99160b(triple.component1());
            I86.this.f14585a.m99166Rl(booleanValue);
            I86.this.f14585a.m99161Z2(intValue);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Triple<? extends List<? extends C3023H6>, ? extends Boolean, ? extends Integer> triple) {
            m102855a(triple);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: I86$g */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C3352g extends FunctionReferenceImpl implements Function1<Throwable, Unit> {

        /* renamed from: b */
        public static final C3352g f14604b = new C3352g();

        public C3352g() {
            super(1, C41318g46.class, "e", "e(Ljava/lang/Throwable;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            C41318g46.m40159e(th);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001aB\u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0003 \u0004*\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u0002 \u0004* \u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0003 \u0004*\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u0002\u0018\u00010\u00060\u00062&\u0010\u0005\u001a\"\u0012\u0004\u0012\u00020\u0001\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0003 \u0004*\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0007\u0010\b"}, m28432d2 = {"Lkotlin/Pair;", "", "", "Lco/bird/android/model/wire/WireTransferOrderFilter;", "kotlin.jvm.PlatformType", "<name for destructuring parameter 0>", "Lio/reactivex/K;", C17296a.f69688o, "(Lkotlin/Pair;)Lio/reactivex/K;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: I86$h */
    /* loaded from: classes3.dex */
    public static final class C3353h extends Lambda implements Function1<Pair<? extends Unit, ? extends List<? extends WireTransferOrderFilter>>, InterfaceC23447K<? extends List<? extends WireTransferOrderFilter>>> {
        public C3353h() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC23447K<? extends List<WireTransferOrderFilter>> invoke(Pair<Unit, ? extends List<WireTransferOrderFilter>> pair) {
            Intrinsics.checkNotNullParameter(pair, "<name for destructuring parameter 0>");
            List<WireTransferOrderFilter> filters = pair.component2();
            K86 k86 = I86.this.f14585a;
            Intrinsics.checkNotNullExpressionValue(filters, "filters");
            return k86.m99162Vl(filters);
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: I86$i */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C3354i extends FunctionReferenceImpl implements Function1<List<? extends WireTransferOrderFilter>, Unit> {
        public C3354i(Object obj) {
            super(1, obj, C0058AG.class, "accept", "accept(Ljava/lang/Object;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(List<? extends WireTransferOrderFilter> list) {
            invoke2((List<WireTransferOrderFilter>) list);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(List<WireTransferOrderFilter> p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((C0058AG) this.receiver).accept(p0);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0005\u001a*\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"", "it", "Lio/reactivex/u;", "", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lkotlin/Unit;)Lio/reactivex/u;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: I86$j */
    /* loaded from: classes3.dex */
    public static final class C3355j extends Lambda implements Function1<Unit, InterfaceC24574u<? extends String>> {
        public C3355j() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC24574u<? extends String> invoke(Unit it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return I86.this.f14585a.m99165Sl();
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: I86$k */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C3356k extends FunctionReferenceImpl implements Function1<String, Unit> {
        public C3356k(Object obj) {
            super(1, obj, InterfaceC40099e13.class, "goToContainerOrderDetails", "goToContainerOrderDetails(Ljava/lang/String;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(String str) {
            invoke2(str);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(String p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((InterfaceC40099e13) this.receiver).mo36919x0(p0);
        }
    }

    public I86(K86 landingUi, C36207Tq4 reactiveConfig, C37330Yl2 converter, InterfaceC40099e13 navigator, ScopeProvider scopeProvider, O86 transferOrderManager, C43038iy6 warehouseChecker) {
        List emptyList;
        Intrinsics.checkNotNullParameter(landingUi, "landingUi");
        Intrinsics.checkNotNullParameter(reactiveConfig, "reactiveConfig");
        Intrinsics.checkNotNullParameter(converter, "converter");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(scopeProvider, "scopeProvider");
        Intrinsics.checkNotNullParameter(transferOrderManager, "transferOrderManager");
        Intrinsics.checkNotNullParameter(warehouseChecker, "warehouseChecker");
        this.f14585a = landingUi;
        this.f14586b = reactiveConfig;
        this.f14587c = converter;
        this.f14588d = navigator;
        this.f14589e = scopeProvider;
        this.f14590f = transferOrderManager;
        this.f14591g = warehouseChecker;
        DateTime withTimeAtStartOfDay = DateTime.now().withTimeAtStartOfDay();
        this.f14592h = withTimeAtStartOfDay;
        DateTime plusDays = withTimeAtStartOfDay.plusDays(Days.SEVEN.getDays());
        this.f14593i = plusDays;
        C0058AG<Pair<DateTime, DateTime>> m115950h = C0058AG.m115950h(TuplesKt.m28425to(withTimeAtStartOfDay, plusDays));
        Intrinsics.checkNotNullExpressionValue(m115950h, "createDefault<Pair<DateT…ate to defaultEndDate\n  )");
        this.f14594j = m115950h;
        emptyList = CollectionsKt__CollectionsKt.emptyList();
        C0058AG<List<WireTransferOrderFilter>> m115950h2 = C0058AG.m115950h(emptyList);
        Intrinsics.checkNotNullExpressionValue(m115950h2, "createDefault<List<WireT…rderFilter>>(emptyList())");
        this.f14595k = m115950h2;
        warehouseChecker.m31479B(landingUi);
    }

    /* renamed from: p */
    public static final void m102872p(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: q */
    public static final InterfaceC23447K m102871q(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: r */
    public static final void m102870r(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: s */
    public static final Triple m102869s(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (Triple) tmp0.invoke(obj);
    }

    /* renamed from: t */
    public static final void m102868t(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: u */
    public static final void m102867u(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: v */
    public static final InterfaceC23447K m102866v(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: w */
    public static final void m102865w(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: x */
    public static final InterfaceC24574u m102864x(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC24574u) tmp0.invoke(obj);
    }

    /* renamed from: y */
    public static final void m102863y(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: z */
    public static final InterfaceC24574u m102862z(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC24574u) tmp0.invoke(obj);
    }

    @Override // p000.InterfaceC36038Sx6
    /* renamed from: d */
    public void mo28195d(InterfaceC35804Rx6 interfaceC35804Rx6) {
        this.f14591g.mo28195d(interfaceC35804Rx6);
    }

    @Override // p000.InterfaceC36038Sx6
    public void onResume() {
        this.f14591g.onResume();
        Observable<Boolean> observeOn = this.f14586b.m82849J7().observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn, "reactiveConfig.enableTra…dSchedulers.mainThread())");
        Object m33094as = observeOn.m33094as(AutoDispose.m45239a(this.f14589e));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C3347c c3347c = new C3347c(this.f14585a);
        ((ObservableSubscribeProxy) m33094as).subscribe(new InterfaceC23484g() { // from class: x86
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                I86.m102872p(Function1.this, obj);
            }
        });
        Observable m31956a = C24523e.f91168a.m31956a(this.f14594j, this.f14595k);
        final C3348d c3348d = new C3348d();
        Observable observeOn2 = m31956a.flatMapSingle(new InterfaceC23492o() { // from class: A86
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m102871q;
                m102871q = I86.m102871q(Function1.this, obj);
                return m102871q;
            }
        }).observeOn(C24542a.m31934a());
        final C3350e c3350e = new C3350e();
        Observable observeOn3 = observeOn2.map(new InterfaceC23492o() { // from class: B86
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                Triple m102869s;
                m102869s = I86.m102869s(Function1.this, obj);
                return m102869s;
            }
        }).observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn3, "override fun onResume() …{ }\n        }\n      }\n  }");
        Object m33094as2 = C38689bg5.m64176e(observeOn3, this.f14585a).m33094as(AutoDispose.m45239a(this.f14589e));
        Intrinsics.checkExpressionValueIsNotNull(m33094as2, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C3351f c3351f = new C3351f();
        InterfaceC23484g interfaceC23484g = new InterfaceC23484g() { // from class: C86
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                I86.m102868t(Function1.this, obj);
            }
        };
        final C3352g c3352g = C3352g.f14604b;
        ((ObservableSubscribeProxy) m33094as2).subscribe(interfaceC23484g, new InterfaceC23484g() { // from class: D86
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                I86.m102867u(Function1.this, obj);
            }
        });
        Observable observeOn4 = C24527f.m31950a(this.f14585a.m99159e1(), this.f14595k).observeOn(C23454a.m33087a());
        final C3353h c3353h = new C3353h();
        Observable flatMapSingle = observeOn4.flatMapSingle(new InterfaceC23492o() { // from class: E86
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m102866v;
                m102866v = I86.m102866v(Function1.this, obj);
                return m102866v;
            }
        });
        Intrinsics.checkNotNullExpressionValue(flatMapSingle, "override fun onResume() …{ }\n        }\n      }\n  }");
        Object m33094as3 = flatMapSingle.m33094as(AutoDispose.m45239a(this.f14589e));
        Intrinsics.checkExpressionValueIsNotNull(m33094as3, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C3354i c3354i = new C3354i(this.f14595k);
        ((ObservableSubscribeProxy) m33094as3).subscribe(new InterfaceC23484g() { // from class: F86
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                I86.m102865w(Function1.this, obj);
            }
        });
        Observable<Unit> m99158h = this.f14585a.m99158h();
        final C3355j c3355j = new C3355j();
        Observable observeOn5 = m99158h.flatMapMaybe(new InterfaceC23492o() { // from class: G86
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC24574u m102864x;
                m102864x = I86.m102864x(Function1.this, obj);
                return m102864x;
            }
        }).observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn5, "override fun onResume() …{ }\n        }\n      }\n  }");
        Object m33094as4 = observeOn5.m33094as(AutoDispose.m45239a(this.f14589e));
        Intrinsics.checkExpressionValueIsNotNull(m33094as4, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C3356k c3356k = new C3356k(this.f14588d);
        ((ObservableSubscribeProxy) m33094as4).subscribe(new InterfaceC23484g() { // from class: H86
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                I86.m102863y(Function1.this, obj);
            }
        });
        Observable<Unit> m99168Pl = this.f14585a.m99168Pl();
        final C3344a c3344a = new C3344a();
        Observable<R> flatMapMaybe = m99168Pl.flatMapMaybe(new InterfaceC23492o() { // from class: y86
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC24574u m102862z;
                m102862z = I86.m102862z(Function1.this, obj);
                return m102862z;
            }
        });
        Intrinsics.checkNotNullExpressionValue(flatMapMaybe, "override fun onResume() …{ }\n        }\n      }\n  }");
        Object m33094as5 = flatMapMaybe.m33094as(AutoDispose.m45239a(this.f14589e));
        Intrinsics.checkExpressionValueIsNotNull(m33094as5, "this.`as`(AutoDispose.autoDisposable(provider))");
        ((ObservableSubscribeProxy) m33094as5).subscribe(this.f14594j);
        Observable<Pair<String, OrderItemType>> observeOn6 = this.f14585a.m99167Ql().observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn6, "landingUi.containerOrder…dSchedulers.mainThread())");
        Object m33094as6 = observeOn6.m33094as(AutoDispose.m45239a(this.f14589e));
        Intrinsics.checkExpressionValueIsNotNull(m33094as6, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C3345b c3345b = new C3345b();
        ((ObservableSubscribeProxy) m33094as6).subscribe(new InterfaceC23484g() { // from class: z86
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                I86.m102870r(Function1.this, obj);
            }
        });
    }
}
