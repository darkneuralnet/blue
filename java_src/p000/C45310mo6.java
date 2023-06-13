package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.constant.BulkScanPurpose;
import co.bird.android.model.wire.WireBatch;
import co.bird.android.model.wire.WireBird;
import co.bird.android.widget.C16634c;
import co.bird.api.response.BatchBird;
import com.facebook.share.internal.C17296a;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.FlowableSubscribeProxy;
import com.uber.autodispose.ObservableSubscribeProxy;
import com.uber.autodispose.ScopeProvider;
import com.uber.autodispose.SingleSubscribeProxy;
import io.reactivex.AbstractC23442F;
import io.reactivex.AbstractC24490k;
import io.reactivex.AbstractC24507p;
import io.reactivex.InterfaceC23447K;
import io.reactivex.InterfaceC24574u;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.C23454a;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.functions.InterfaceC23492o;
import io.reactivex.subjects.C24552a;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.C45310mo6;
@Metadata(m28433d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001BA\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\u000b\u001a\u00020\b\u0012\u0006\u0010\u000f\u001a\u00020\f\u0012\u0006\u0010\u0013\u001a\u00020\u0010\u0012\u0006\u0010\u0017\u001a\u00020\u0014\u0012\u0006\u0010\u001b\u001a\u00020\u0018\u0012\u0006\u0010\u001f\u001a\u00020\u001c¢\u0006\u0004\b'\u0010(J\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000f\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0013\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0017\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u001b\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001f\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR.\u0010&\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\" #*\n\u0012\u0004\u0012\u00020\"\u0018\u00010!0!0 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%¨\u0006)"}, m28432d2 = {"Lmo6;", "LXn6;", "", "refresh", "Lpo6;", C17296a.f69688o, "Lpo6;", "ui", "Lcom/uber/autodispose/ScopeProvider;", "b", "Lcom/uber/autodispose/ScopeProvider;", "scopeProvider", "Le13;", "c", "Le13;", "navigator", "LTn6;", DateTokenConverter.CONVERTER_KEY, "LTn6;", "converter", "Lco/bird/android/model/wire/WireBatch;", "e", "Lco/bird/android/model/wire/WireBatch;", "batch", "LfF;", "f", "LfF;", "batchManager", "Lom3;", "g", "Lom3;", "operatorManager", "Lio/reactivex/subjects/a;", "", "Lco/bird/android/model/wire/WireBird;", "kotlin.jvm.PlatformType", "h", "Lio/reactivex/subjects/a;", "birdsSubject", "<init>", "(Lpo6;Lcom/uber/autodispose/ScopeProvider;Le13;LTn6;Lco/bird/android/model/wire/WireBatch;LfF;Lom3;)V", "servicecenter_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nVehiclesInBatchPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VehiclesInBatchPresenter.kt\nco/bird/android/feature/servicecenter/batches/vehiclesinbatch/VehiclesInBatchPresenterImpl\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n*L\n1#1,90:1\n180#2:91\n161#2:92\n180#2:93\n199#2:94\n*S KotlinDebug\n*F\n+ 1 VehiclesInBatchPresenter.kt\nco/bird/android/feature/servicecenter/batches/vehiclesinbatch/VehiclesInBatchPresenterImpl\n*L\n40#1:91\n44#1:92\n66#1:93\n86#1:94\n*E\n"})
/* renamed from: mo6  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C45310mo6 implements InterfaceC37118Xn6 {

    /* renamed from: a */
    public final InterfaceC47089po6 f98816a;

    /* renamed from: b */
    public final ScopeProvider f98817b;

    /* renamed from: c */
    public final InterfaceC40099e13 f98818c;

    /* renamed from: d */
    public final InterfaceC36182Tn6 f98819d;

    /* renamed from: e */
    public final WireBatch f98820e;

    /* renamed from: f */
    public final InterfaceC20340fF f98821f;

    /* renamed from: g */
    public final InterfaceC46473om3 f98822g;

    /* renamed from: h */
    public final C24552a<List<WireBird>> f98823h;

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001aB\u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00000\u0000 \u0005* \u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00000\u0000\u0018\u00010\u00030\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"", "Lco/bird/android/model/wire/WireBird;", "birds", "Lio/reactivex/K;", "LH6;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Ljava/util/List;)Lio/reactivex/K;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: mo6$a */
    /* loaded from: classes3.dex */
    public static final class C26243a extends Lambda implements Function1<List<? extends WireBird>, InterfaceC23447K<? extends List<? extends C3023H6>>> {
        public C26243a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC23447K<? extends List<C3023H6>> invoke(List<WireBird> birds) {
            Intrinsics.checkNotNullParameter(birds, "birds");
            return C45310mo6.this.f98819d.mo79418a(birds);
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: mo6$b */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C26244b extends FunctionReferenceImpl implements Function1<Collection<? extends C3023H6>, Unit> {
        public C26244b(Object obj) {
            super(1, obj, InterfaceC47089po6.class, "populateAdapter", "populateAdapter(Ljava/util/Collection;)V", 0);
        }

        /* renamed from: a */
        public final void m24912a(Collection<C3023H6> p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((InterfaceC47089po6) this.receiver).mo16962o(p0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Collection<? extends C3023H6> collection) {
            m24912a(collection);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0003*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"<anonymous>", "", "it", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: mo6$c */
    /* loaded from: classes3.dex */
    public static final class C26245c extends Lambda implements Function1<Unit, Unit> {
        public C26245c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Unit unit) {
            invoke2(unit);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Unit unit) {
            C45310mo6.this.f98818c.mo37170F3(BulkScanPurpose.ADD_TO_BATCH, C45310mo6.this.f98820e);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001aZ\u0012&\b\u0001\u0012\"\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0004 \u0005*\u0010\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003 \u0005*,\u0012&\b\u0001\u0012\"\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0004 \u0005*\u0010\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"Lco/bird/android/model/wire/WireBird;", "bird", "Lio/reactivex/u;", "Lkotlin/Pair;", "Lco/bird/android/widget/c$b;", "kotlin.jvm.PlatformType", "b", "(Lco/bird/android/model/wire/WireBird;)Lio/reactivex/u;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: mo6$d */
    /* loaded from: classes3.dex */
    public static final class C26246d extends Lambda implements Function1<WireBird, InterfaceC24574u<? extends Pair<? extends WireBird, ? extends C16634c.EnumC16636b>>> {

        @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\"\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0000 \u0004*\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lco/bird/android/widget/c$b;", "it", "Lkotlin/Pair;", "Lco/bird/android/model/wire/WireBird;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/widget/c$b;)Lkotlin/Pair;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: mo6$d$a */
        /* loaded from: classes3.dex */
        public static final class C26247a extends Lambda implements Function1<C16634c.EnumC16636b, Pair<? extends WireBird, ? extends C16634c.EnumC16636b>> {

            /* renamed from: g */
            public final /* synthetic */ WireBird f98827g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C26247a(WireBird wireBird) {
                super(1);
                this.f98827g = wireBird;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final Pair<WireBird, C16634c.EnumC16636b> invoke(C16634c.EnumC16636b it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return TuplesKt.m28425to(this.f98827g, it);
            }
        }

        public C26246d() {
            super(1);
        }

        public static final Pair invoke$lambda$0(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (Pair) tmp0.invoke(obj);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b */
        public final InterfaceC24574u<? extends Pair<WireBird, C16634c.EnumC16636b>> invoke(WireBird bird) {
            Intrinsics.checkNotNullParameter(bird, "bird");
            AbstractC24507p<C16634c.EnumC16636b> mo16963Xj = C45310mo6.this.f98816a.mo16963Xj(bird.getCode());
            final C26247a c26247a = new C26247a(bird);
            return mo16963Xj.m32067H(new InterfaceC23492o() { // from class: no6
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj) {
                    Pair invoke$lambda$0;
                    invoke$lambda$0 = C45310mo6.C26246d.invoke$lambda$0(Function1.this, obj);
                    return invoke$lambda$0;
                }
            });
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a*\u0012\u000e\b\u0001\u0012\n \u0006*\u0004\u0018\u00010\u00050\u0005 \u0006*\u0014\u0012\u000e\b\u0001\u0012\n \u0006*\u0004\u0018\u00010\u00050\u0005\u0018\u00010\u00040\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0007\u0010\b"}, m28432d2 = {"Lkotlin/Pair;", "Lco/bird/android/model/wire/WireBird;", "Lco/bird/android/widget/c$b;", "<name for destructuring parameter 0>", "Lio/reactivex/u;", "Lco/bird/api/response/BatchBird;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lkotlin/Pair;)Lio/reactivex/u;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: mo6$e */
    /* loaded from: classes3.dex */
    public static final class C26248e extends Lambda implements Function1<Pair<? extends WireBird, ? extends C16634c.EnumC16636b>, InterfaceC24574u<? extends BatchBird>> {
        public C26248e() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC24574u<? extends BatchBird> invoke(Pair<WireBird, ? extends C16634c.EnumC16636b> pair) {
            Intrinsics.checkNotNullParameter(pair, "<name for destructuring parameter 0>");
            WireBird component1 = pair.component1();
            if (pair.component2() == C16634c.EnumC16636b.PRIMARY) {
                return C45310mo6.this.f98821f.mo34293d(C45310mo6.this.f98820e.getId(), component1.getId()).m33125j0();
            }
            return AbstractC24507p.m32024u();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/api/response/BatchBird;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lco/bird/api/response/BatchBird;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: mo6$f */
    /* loaded from: classes3.dex */
    public static final class C26249f extends Lambda implements Function1<BatchBird, Unit> {
        public C26249f() {
            super(1);
        }

        /* renamed from: a */
        public final void m24907a(BatchBird batchBird) {
            C45310mo6.this.refresh();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(BatchBird batchBird) {
            m24907a(batchBird);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "error", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: mo6$g */
    /* loaded from: classes3.dex */
    public static final class C26250g extends Lambda implements Function1<Throwable, Unit> {
        public C26250g() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            C45310mo6.this.f98816a.error(th.getMessage());
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/api/response/BatchBird;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lco/bird/api/response/BatchBird;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: mo6$h */
    /* loaded from: classes3.dex */
    public static final class C26251h extends Lambda implements Function1<BatchBird, Unit> {

        /* renamed from: g */
        public static final C26251h f98831g = new C26251h();

        public C26251h() {
            super(1);
        }

        /* renamed from: a */
        public final void m24906a(BatchBird batchBird) {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(BatchBird batchBird) {
            m24906a(batchBird);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: mo6$i */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C26252i extends FunctionReferenceImpl implements Function1<Throwable, Unit> {

        /* renamed from: b */
        public static final C26252i f98832b = new C26252i();

        public C26252i() {
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

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: mo6$j */
    /* loaded from: classes3.dex */
    public static final class C26253j extends Lambda implements Function1<Throwable, Unit> {
        public C26253j() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            C45310mo6.this.f98816a.error(th.getMessage());
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001d\n\u0000\n\u0002\u0010\u001c\n\u0002\b\u0002\u0010\u0006\u001a&\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00010\u0001 \u0004*\u0012\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00010\u0001\u0018\u00010\u00050\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"", "Lco/bird/api/response/BatchBird;", "it", "", "kotlin.jvm.PlatformType", "", C17296a.f69688o, "(Ljava/util/List;)Ljava/lang/Iterable;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: mo6$k */
    /* loaded from: classes3.dex */
    public static final class C26254k extends Lambda implements Function1<List<? extends BatchBird>, Iterable<? extends BatchBird>> {

        /* renamed from: g */
        public static final C26254k f98834g = new C26254k();

        public C26254k() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Iterable<BatchBird> invoke(List<BatchBird> it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return it;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a*\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lco/bird/api/response/BatchBird;", "batchBird", "Lio/reactivex/u;", "Lco/bird/android/model/wire/WireBird;", "kotlin.jvm.PlatformType", "b", "(Lco/bird/api/response/BatchBird;)Lio/reactivex/u;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: mo6$l */
    /* loaded from: classes3.dex */
    public static final class C26255l extends Lambda implements Function1<BatchBird, InterfaceC24574u<? extends WireBird>> {

        @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: mo6$l$a */
        /* loaded from: classes3.dex */
        public /* synthetic */ class C26256a extends FunctionReferenceImpl implements Function1<Throwable, Unit> {
            public C26256a(Object obj) {
                super(1, obj, InterfaceC47089po6.class, "error", "error(Ljava/lang/Throwable;)V", 0);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                invoke2(th);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(Throwable p0) {
                Intrinsics.checkNotNullParameter(p0, "p0");
                ((InterfaceC47089po6) this.receiver).error(p0);
            }
        }

        public C26255l() {
            super(1);
        }

        public static final void invoke$lambda$0(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            tmp0.invoke(obj);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b */
        public final InterfaceC24574u<? extends WireBird> invoke(BatchBird batchBird) {
            Intrinsics.checkNotNullParameter(batchBird, "batchBird");
            AbstractC23442F m33152N = C38096ag5.m70883l(C45310mo6.this.f98822g.mo8116b(batchBird.getBirdId())).m33152N(C23454a.m33087a());
            final C26256a c26256a = new C26256a(C45310mo6.this.f98816a);
            return m33152N.m33106t(new InterfaceC23484g() { // from class: oo6
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj) {
                    C45310mo6.C26255l.invoke$lambda$0(Function1.this, obj);
                }
            }).m33125j0().m32063L(AbstractC24507p.m32024u());
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: mo6$m */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C26257m extends FunctionReferenceImpl implements Function1<List<? extends WireBird>, Unit> {
        public C26257m(Object obj) {
            super(1, obj, C24552a.class, "onNext", "onNext(Ljava/lang/Object;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(List<? extends WireBird> list) {
            invoke2((List<WireBird>) list);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(List<WireBird> p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((C24552a) this.receiver).onNext(p0);
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: mo6$n */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C26258n extends FunctionReferenceImpl implements Function1<Throwable, Unit> {

        /* renamed from: b */
        public static final C26258n f98836b = new C26258n();

        public C26258n() {
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

    public C45310mo6(InterfaceC47089po6 ui, ScopeProvider scopeProvider, InterfaceC40099e13 navigator, InterfaceC36182Tn6 converter, WireBatch batch, InterfaceC20340fF batchManager, InterfaceC46473om3 operatorManager) {
        Intrinsics.checkNotNullParameter(ui, "ui");
        Intrinsics.checkNotNullParameter(scopeProvider, "scopeProvider");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(converter, "converter");
        Intrinsics.checkNotNullParameter(batch, "batch");
        Intrinsics.checkNotNullParameter(batchManager, "batchManager");
        Intrinsics.checkNotNullParameter(operatorManager, "operatorManager");
        this.f98816a = ui;
        this.f98817b = scopeProvider;
        this.f98818c = navigator;
        this.f98819d = converter;
        this.f98820e = batch;
        this.f98821f = batchManager;
        this.f98822g = operatorManager;
        C24552a<List<WireBird>> m31922e = C24552a.m31922e();
        Intrinsics.checkNotNullExpressionValue(m31922e, "create<List<WireBird>>()");
        this.f98823h = m31922e;
        final C26243a c26243a = new C26243a();
        Observable observeOn = m31922e.flatMapSingle(new InterfaceC23492o() { // from class: Yn6
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m24925o;
                m24925o = C45310mo6.m24925o(Function1.this, obj);
                return m24925o;
            }
        }).observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn, "birdsSubject\n      .flat…dSchedulers.mainThread())");
        Object m33094as = observeOn.m33094as(AutoDispose.m45239a(scopeProvider));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C26244b c26244b = new C26244b(ui);
        ((ObservableSubscribeProxy) m33094as).subscribe(new InterfaceC23484g() { // from class: do6
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C45310mo6.m24924p(Function1.this, obj);
            }
        });
        Object m32150f = ui.mo16961wc().m32150f(AutoDispose.m45239a(scopeProvider));
        Intrinsics.checkExpressionValueIsNotNull(m32150f, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C26245c c26245c = new C26245c();
        ((FlowableSubscribeProxy) m32150f).subscribe(new InterfaceC23484g() { // from class: eo6
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C45310mo6.m24923q(Function1.this, obj);
            }
        });
        Observable<WireBird> mo16964Ig = ui.mo16964Ig();
        final C26246d c26246d = new C26246d();
        Observable<R> flatMapMaybe = mo16964Ig.flatMapMaybe(new InterfaceC23492o() { // from class: fo6
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC24574u m24922r;
                m24922r = C45310mo6.m24922r(Function1.this, obj);
                return m24922r;
            }
        });
        final C26248e c26248e = new C26248e();
        Observable observeOn2 = flatMapMaybe.flatMapMaybe(new InterfaceC23492o() { // from class: go6
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC24574u m24921s;
                m24921s = C45310mo6.m24921s(Function1.this, obj);
                return m24921s;
            }
        }).observeOn(C23454a.m33087a());
        final C26249f c26249f = new C26249f();
        Observable doOnNext = observeOn2.doOnNext(new InterfaceC23484g() { // from class: ho6
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C45310mo6.m24920t(Function1.this, obj);
            }
        });
        final C26250g c26250g = new C26250g();
        Observable retry = doOnNext.doOnError(new InterfaceC23484g() { // from class: io6
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C45310mo6.m24919u(Function1.this, obj);
            }
        }).retry();
        Intrinsics.checkNotNullExpressionValue(retry, "ui.vehicleClicks()\n     …message) }\n      .retry()");
        Object m33094as2 = retry.m33094as(AutoDispose.m45239a(scopeProvider));
        Intrinsics.checkExpressionValueIsNotNull(m33094as2, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C26251h c26251h = C26251h.f98831g;
        InterfaceC23484g interfaceC23484g = new InterfaceC23484g() { // from class: jo6
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C45310mo6.m24918v(Function1.this, obj);
            }
        };
        final C26252i c26252i = C26252i.f98832b;
        ((ObservableSubscribeProxy) m33094as2).subscribe(interfaceC23484g, new InterfaceC23484g() { // from class: ko6
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C45310mo6.m24917w(Function1.this, obj);
            }
        });
    }

    /* renamed from: A */
    public static final void m24941A(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: B */
    public static final void m24940B(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: o */
    public static final InterfaceC23447K m24925o(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: p */
    public static final void m24924p(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: q */
    public static final void m24923q(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: r */
    public static final InterfaceC24574u m24922r(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC24574u) tmp0.invoke(obj);
    }

    /* renamed from: s */
    public static final InterfaceC24574u m24921s(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC24574u) tmp0.invoke(obj);
    }

    /* renamed from: t */
    public static final void m24920t(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: u */
    public static final void m24919u(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: v */
    public static final void m24918v(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: w */
    public static final void m24917w(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: x */
    public static final Iterable m24916x(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (Iterable) tmp0.invoke(obj);
    }

    /* renamed from: y */
    public static final InterfaceC24574u m24915y(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC24574u) tmp0.invoke(obj);
    }

    /* renamed from: z */
    public static final void m24914z(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    @Override // p000.InterfaceC37118Xn6
    public void refresh() {
        AbstractC23442F<List<BatchBird>> m33152N = this.f98821f.mo34296a(this.f98820e.getId()).m33152N(C23454a.m33087a());
        final C26253j c26253j = new C26253j();
        AbstractC24490k<List<BatchBird>> m33127i0 = m33152N.m33106t(new InterfaceC23484g() { // from class: lo6
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C45310mo6.m24940B(Function1.this, obj);
            }
        }).m33127i0();
        final C26254k c26254k = C26254k.f98834g;
        AbstractC24490k<U> m32158b0 = m33127i0.m32158b0(new InterfaceC23492o() { // from class: Zn6
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                Iterable m24916x;
                m24916x = C45310mo6.m24916x(Function1.this, obj);
                return m24916x;
            }
        });
        final C26255l c26255l = new C26255l();
        AbstractC23442F m32116q1 = m32158b0.m32118q(new InterfaceC23492o() { // from class: ao6
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC24574u m24915y;
                m24915y = C45310mo6.m24915y(Function1.this, obj);
                return m24915y;
            }
        }).m32116q1();
        Intrinsics.checkNotNullExpressionValue(m32116q1, "override fun refresh() {…t::onNext, Timber::e)\n  }");
        Object m33135e = C28237sD.progress$default(m32116q1, this.f98816a, 0, 2, (Object) null).m33135e(AutoDispose.m45239a(this.f98817b));
        Intrinsics.checkExpressionValueIsNotNull(m33135e, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C26257m c26257m = new C26257m(this.f98823h);
        InterfaceC23484g interfaceC23484g = new InterfaceC23484g() { // from class: bo6
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C45310mo6.m24914z(Function1.this, obj);
            }
        };
        final C26258n c26258n = C26258n.f98836b;
        ((SingleSubscribeProxy) m33135e).subscribe(interfaceC23484g, new InterfaceC23484g() { // from class: co6
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C45310mo6.m24941A(Function1.this, obj);
            }
        });
    }
}
