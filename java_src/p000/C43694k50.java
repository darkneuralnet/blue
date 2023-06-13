package p000;

import co.bird.android.buava.Optional;
import co.bird.android.core.mvp.BaseActivity;
import co.bird.android.model.constant.BulkScanPurpose;
import co.bird.android.model.constant.ScanIntention;
import co.bird.android.model.persistence.Bird;
import co.bird.android.model.wire.WireBird;
import co.bird.android.model.wire.WireServiceCenterStatus;
import co.bird.api.error.RetrofitException;
import co.bird.api.exception.HttpException;
import com.facebook.share.internal.C17296a;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.ObservableSubscribeProxy;
import com.uber.autodispose.ScopeProvider;
import io.reactivex.AbstractC23442F;
import io.reactivex.InterfaceC23447K;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.C23454a;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.functions.InterfaceC23492o;
import io.reactivex.rxkotlin.C24523e;
import io.reactivex.subjects.C24552a;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.C43694k50;
@Metadata(m28433d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001Bs\b\u0007\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\u0006\u0010\u001f\u001a\u00020\u001e\u0012\u0006\u0010!\u001a\u00020 \u0012\b\b\u0002\u0010#\u001a\u00020\"\u0012\u0006\u0010%\u001a\u00020$\u0012\u0006\u0010'\u001a\u00020&\u0012\u0006\u0010)\u001a\u00020(\u0012\u0006\u0010+\u001a\u00020*\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b,\u0010-R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\n8\u0016X\u0096D¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\"\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006."}, m28432d2 = {"Lk50;", "LfA;", "LGt5;", "x", "LGt5;", "serviceCenterManager", "LAt5;", "y", "LAt5;", "converter", "Lco/bird/android/model/constant/ScanIntention;", "z", "Lco/bird/android/model/constant/ScanIntention;", "j0", "()Lco/bird/android/model/constant/ScanIntention;", "scanIntention", "", "Lco/bird/android/model/persistence/Bird;", "Lco/bird/android/model/wire/WireServiceCenterStatus;", "A", "Ljava/util/Map;", "birdServiceCenterStatusMap", "LXl3;", "operatorInventoryManager", "Lom3;", "operatorManager", "LpJ;", "bluetoothManager", "Lcom/uber/autodispose/ScopeProvider;", "scopeProvider", "Lv40;", "ui", "Le13;", "navigator", "Lco/bird/android/model/constant/BulkScanPurpose;", "purpose", "Let3;", "delegate", "LEa;", "analyticsManager", "Lco/bird/android/core/mvp/BaseActivity;", "activity", "LTq4;", "reactiveConfig", "<init>", "(LXl3;Lom3;LpJ;Lcom/uber/autodispose/ScopeProvider;Lv40;Le13;Lco/bird/android/model/constant/BulkScanPurpose;Let3;LEa;Lco/bird/android/core/mvp/BaseActivity;LTq4;LGt5;LAt5;)V", "bulk-scanner_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nBulkServiceProgressScannerPresenterImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BulkServiceProgressScannerPresenterImpl.kt\nco/bird/android/feature/bulkscanner/scan/serviceprogress/BulkServiceProgressScannerPresenterImpl\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n*L\n1#1,103:1\n180#2:104\n*S KotlinDebug\n*F\n+ 1 BulkServiceProgressScannerPresenterImpl.kt\nco/bird/android/feature/bulkscanner/scan/serviceprogress/BulkServiceProgressScannerPresenterImpl\n*L\n92#1:104\n*E\n"})
/* renamed from: k50  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C43694k50 extends AbstractC20252fA {

    /* renamed from: A */
    public final Map<Bird, WireServiceCenterStatus> f93868A;

    /* renamed from: x */
    public final InterfaceC33193Gt5 f93869x;

    /* renamed from: y */
    public final C31789At5 f93870y;

    /* renamed from: z */
    public final ScanIntention f93871z;

    @Metadata(m28433d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001aÂ\u0001\u0012Z\b\u0001\u0012V\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0001\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0003 \u0004*\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00010\u0001 \u0004**\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0001\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0003 \u0004*\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00010\u0001\u0018\u00010\u00000\u0000 \u0004*`\u0012Z\b\u0001\u0012V\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0001\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0003 \u0004*\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00010\u0001 \u0004**\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0001\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0003 \u0004*\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00010\u0001\u0018\u00010\u00000\u0000\u0018\u00010\u00060\u00062,\u0010\u0005\u001a(\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0001\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0003 \u0004*\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0007\u0010\b"}, m28432d2 = {"Lkotlin/Pair;", "", "Lco/bird/android/model/persistence/Bird;", "Lco/bird/android/model/wire/WireBird;", "kotlin.jvm.PlatformType", "<name for destructuring parameter 0>", "Lio/reactivex/K;", "c", "(Lkotlin/Pair;)Lio/reactivex/K;"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nBulkServiceProgressScannerPresenterImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BulkServiceProgressScannerPresenterImpl.kt\nco/bird/android/feature/bulkscanner/scan/serviceprogress/BulkServiceProgressScannerPresenterImpl$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,103:1\n766#2:104\n857#2,2:105\n1549#2:107\n1620#2,3:108\n*S KotlinDebug\n*F\n+ 1 BulkServiceProgressScannerPresenterImpl.kt\nco/bird/android/feature/bulkscanner/scan/serviceprogress/BulkServiceProgressScannerPresenterImpl$1\n*L\n61#1:104\n61#1:105,2\n66#1:107\n66#1:108,3\n*E\n"})
    /* renamed from: k50$a */
    /* loaded from: classes3.dex */
    public static final class C25097a extends Lambda implements Function1<Pair<? extends List<? extends Bird>, ? extends List<? extends WireBird>>, InterfaceC23447K<? extends Pair<? extends List<? extends Bird>, ? extends List<? extends WireBird>>>> {

        /* renamed from: g */
        public final /* synthetic */ InterfaceC50205v40 f93872g;

        /* renamed from: h */
        public final /* synthetic */ C43694k50 f93873h;

        @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u001a\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0001 \u0002*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lco/bird/android/buava/Optional;", "Lco/bird/android/model/wire/WireServiceCenterStatus;", "kotlin.jvm.PlatformType", "status", "", C17296a.f69688o, "(Lco/bird/android/buava/Optional;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: k50$a$a */
        /* loaded from: classes3.dex */
        public static final class C25098a extends Lambda implements Function1<Optional<WireServiceCenterStatus>, Unit> {

            /* renamed from: g */
            public final /* synthetic */ C43694k50 f93874g;

            /* renamed from: h */
            public final /* synthetic */ Bird f93875h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C25098a(C43694k50 c43694k50, Bird bird) {
                super(1);
                this.f93874g = c43694k50;
                this.f93875h = bird;
            }

            /* renamed from: a */
            public final void m29333a(Optional<WireServiceCenterStatus> optional) {
                this.f93874g.f93868A.put(this.f93875h, optional.m59035e());
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Optional<WireServiceCenterStatus> optional) {
                m29333a(optional);
                return Unit.INSTANCE;
            }
        }

        @Metadata(m28433d1 = {"\u0000 \n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\b\u001aV\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0007 \u0002*\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00050\u0005 \u0002**\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0007 \u0002*\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00050\u0005\u0018\u00010\u00040\u00042*\u0010\u0003\u001a&\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001 \u0002*\u0012\u0012\u000e\b\u0001\u0012\n \u0002*\u0004\u0018\u00010\u00010\u00010\u00000\u0000H\n¢\u0006\u0004\b\b\u0010\t"}, m28432d2 = {"", "", "kotlin.jvm.PlatformType", "it", "Lkotlin/Pair;", "", "Lco/bird/android/model/persistence/Bird;", "Lco/bird/android/model/wire/WireBird;", C17296a.f69688o, "([Ljava/lang/Object;)Lkotlin/Pair;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: k50$a$b */
        /* loaded from: classes3.dex */
        public static final class C25099b extends Lambda implements Function1<Object[], Pair<? extends List<? extends Bird>, ? extends List<? extends WireBird>>> {

            /* renamed from: g */
            public final /* synthetic */ List<Bird> f93876g;

            /* renamed from: h */
            public final /* synthetic */ List<WireBird> f93877h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C25099b(List<Bird> list, List<WireBird> list2) {
                super(1);
                this.f93876g = list;
                this.f93877h = list2;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final Pair<List<Bird>, List<WireBird>> invoke(Object[] it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return TuplesKt.m28425to(this.f93876g, this.f93877h);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C25097a(InterfaceC50205v40 interfaceC50205v40, C43694k50 c43694k50) {
            super(1);
            this.f93872g = interfaceC50205v40;
            this.f93873h = c43694k50;
        }

        /* renamed from: d */
        public static final void m29335d(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            tmp0.invoke(obj);
        }

        /* renamed from: e */
        public static final Pair m29334e(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (Pair) tmp0.invoke(obj);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: c */
        public final InterfaceC23447K<? extends Pair<List<Bird>, List<WireBird>>> invoke(Pair<? extends List<Bird>, ? extends List<WireBird>> pair) {
            int collectionSizeOrDefault;
            Intrinsics.checkNotNullParameter(pair, "<name for destructuring parameter 0>");
            List<Bird> component1 = pair.component1();
            List<WireBird> component2 = pair.component2();
            C43694k50 c43694k50 = this.f93873h;
            ArrayList<Bird> arrayList = new ArrayList();
            for (Object obj : component1) {
                if (!c43694k50.f93868A.containsKey((Bird) obj)) {
                    arrayList.add(obj);
                }
            }
            if (!arrayList.isEmpty()) {
                C43694k50 c43694k502 = this.f93873h;
                collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10);
                ArrayList arrayList2 = new ArrayList(collectionSizeOrDefault);
                for (Bird bird : arrayList) {
                    AbstractC23442F m70887h = C38096ag5.m70887h(c43694k502.f93869x.mo94632b(bird.getId()));
                    final C25098a c25098a = new C25098a(c43694k502, bird);
                    arrayList2.add(m70887h.m33101w(new InterfaceC23484g() { // from class: i50
                        @Override // io.reactivex.functions.InterfaceC23484g
                        public final void accept(Object obj2) {
                            C43694k50.C25097a.m29335d(Function1.this, obj2);
                        }
                    }));
                }
                final C25099b c25099b = new C25099b(component1, component2);
                AbstractC23442F m33107s0 = AbstractC23442F.m33107s0(arrayList2, new InterfaceC23492o() { // from class: j50
                    @Override // io.reactivex.functions.InterfaceC23492o
                    public final Object apply(Object obj2) {
                        Pair m29334e;
                        m29334e = C43694k50.C25097a.m29334e(Function1.this, obj2);
                        return m29334e;
                    }
                });
                Intrinsics.checkNotNullExpressionValue(m33107s0, "birds, tasks) ->\n       …     ) { birds to tasks }");
                return C28237sD.progress$default(m33107s0, this.f93872g, 0, 2, (Object) null);
            }
            AbstractC23442F m33158H = AbstractC23442F.m33158H(TuplesKt.m28425to(component1, component2));
            Intrinsics.checkNotNullExpressionValue(m33158H, "{\n          Single.just(birds to tasks)\n        }");
            return m33158H;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\t\u001a\u0016\u0012\u0004\u0012\u00020\u0006 \u0004*\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00010\u00012,\u0010\u0005\u001a(\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0001\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0003 \u0004*\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0007\u0010\b"}, m28432d2 = {"Lkotlin/Pair;", "", "Lco/bird/android/model/persistence/Bird;", "Lco/bird/android/model/wire/WireBird;", "kotlin.jvm.PlatformType", "<name for destructuring parameter 0>", "LH6;", "invoke", "(Lkotlin/Pair;)Ljava/util/List;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nBulkServiceProgressScannerPresenterImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BulkServiceProgressScannerPresenterImpl.kt\nco/bird/android/feature/bulkscanner/scan/serviceprogress/BulkServiceProgressScannerPresenterImpl$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,103:1\n1549#2:104\n1620#2,3:105\n*S KotlinDebug\n*F\n+ 1 BulkServiceProgressScannerPresenterImpl.kt\nco/bird/android/feature/bulkscanner/scan/serviceprogress/BulkServiceProgressScannerPresenterImpl$2\n*L\n80#1:104\n80#1:105,3\n*E\n"})
    /* renamed from: k50$b */
    /* loaded from: classes3.dex */
    public static final class C25100b extends Lambda implements Function1<Pair<? extends List<? extends Bird>, ? extends List<? extends WireBird>>, List<? extends C3023H6>> {
        public C25100b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ List<? extends C3023H6> invoke(Pair<? extends List<? extends Bird>, ? extends List<? extends WireBird>> pair) {
            return invoke2((Pair<? extends List<Bird>, ? extends List<WireBird>>) pair);
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final List<C3023H6> invoke2(Pair<? extends List<Bird>, ? extends List<WireBird>> pair) {
            List reversed;
            int collectionSizeOrDefault;
            Intrinsics.checkNotNullParameter(pair, "<name for destructuring parameter 0>");
            List<WireBird> tasks = pair.component2();
            C31789At5 c31789At5 = C43694k50.this.f93870y;
            reversed = CollectionsKt___CollectionsKt.reversed(pair.component1());
            List<Bird> list = reversed;
            C43694k50 c43694k50 = C43694k50.this;
            collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10);
            ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
            for (Bird bird : list) {
                arrayList.add(TuplesKt.m28425to(bird, c43694k50.f93868A.get(bird)));
            }
            Intrinsics.checkNotNullExpressionValue(tasks, "tasks");
            return c31789At5.m114985a(arrayList, tasks);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u001a\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0001 \u0002*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"", "LH6;", "kotlin.jvm.PlatformType", "items", "", "invoke", "(Ljava/util/List;)V", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: k50$c */
    /* loaded from: classes3.dex */
    public static final class C25101c extends Lambda implements Function1<List<? extends C3023H6>, Unit> {

        /* renamed from: g */
        public final /* synthetic */ InterfaceC50205v40 f93879g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C25101c(InterfaceC50205v40 interfaceC50205v40) {
            super(1);
            this.f93879g = interfaceC50205v40;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(List<? extends C3023H6> list) {
            invoke2((List<C3023H6>) list);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(List<C3023H6> items) {
            InterfaceC50205v40 interfaceC50205v40 = this.f93879g;
            Intrinsics.checkNotNullExpressionValue(items, "items");
            interfaceC50205v40.mo7500Ve(!items.isEmpty());
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "e", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    @SourceDebugExtension({"SMAP\nBulkServiceProgressScannerPresenterImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BulkServiceProgressScannerPresenterImpl.kt\nco/bird/android/feature/bulkscanner/scan/serviceprogress/BulkServiceProgressScannerPresenterImpl$4\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,103:1\n1#2:104\n*E\n"})
    /* renamed from: k50$d */
    /* loaded from: classes3.dex */
    public static final class C25102d extends Lambda implements Function1<Throwable, Unit> {

        /* renamed from: g */
        public final /* synthetic */ InterfaceC50205v40 f93880g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C25102d(InterfaceC50205v40 interfaceC50205v40) {
            super(1);
            this.f93880g = interfaceC50205v40;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable e) {
            C49375tg1 c49375tg1;
            String m11932c;
            C41318g46.m40159e(e);
            Intrinsics.checkNotNullExpressionValue(e, "e");
            Throwable m87362c = R36.m87362c(e);
            Unit unit = null;
            RetrofitException retrofitException = m87362c instanceof RetrofitException ? (RetrofitException) m87362c : null;
            if (retrofitException != null && (c49375tg1 = (C49375tg1) retrofitException.m53929a(C49375tg1.class)) != null && (m11932c = c49375tg1.m11932c()) != null) {
                this.f93880g.error(m11932c);
                unit = Unit.INSTANCE;
            } else {
                HttpException httpException = m87362c instanceof HttpException ? (HttpException) m87362c : null;
                if (httpException != null) {
                    throw new IllegalStateException(httpException.toString());
                }
            }
            if (unit == null) {
                this.f93880g.errorGeneric();
            }
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: k50$e */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C25103e extends FunctionReferenceImpl implements Function1<List<? extends C3023H6>, Unit> {
        public C25103e(Object obj) {
            super(1, obj, InterfaceC50205v40.class, "populateBirds", "populateBirds(Ljava/util/List;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(List<? extends C3023H6> list) {
            invoke2((List<C3023H6>) list);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(List<C3023H6> p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((InterfaceC50205v40) this.receiver).mo7473xb(p0);
        }
    }

    public /* synthetic */ C43694k50(InterfaceC37097Xl3 interfaceC37097Xl3, InterfaceC46473om3 interfaceC46473om3, InterfaceC27246pJ interfaceC27246pJ, ScopeProvider scopeProvider, InterfaceC50205v40 interfaceC50205v40, InterfaceC40099e13 interfaceC40099e13, BulkScanPurpose bulkScanPurpose, InterfaceC40613et3 interfaceC40613et3, InterfaceC1880Ea interfaceC1880Ea, BaseActivity baseActivity, C36207Tq4 c36207Tq4, InterfaceC33193Gt5 interfaceC33193Gt5, C31789At5 c31789At5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(interfaceC37097Xl3, interfaceC46473om3, interfaceC27246pJ, scopeProvider, interfaceC50205v40, interfaceC40099e13, (i & 64) != 0 ? BulkScanPurpose.MAP : bulkScanPurpose, interfaceC40613et3, interfaceC1880Ea, baseActivity, c36207Tq4, interfaceC33193Gt5, c31789At5);
    }

    /* renamed from: p1 */
    public static final InterfaceC23447K m29343p1(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: q1 */
    public static final List m29342q1(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (List) tmp0.invoke(obj);
    }

    /* renamed from: r1 */
    public static final void m29341r1(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: s1 */
    public static final void m29340s1(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: t1 */
    public static final void m29339t1(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    @Override // p000.AbstractC20252fA
    /* renamed from: j0 */
    public ScanIntention mo10918j0() {
        return this.f93871z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C43694k50(InterfaceC37097Xl3 operatorInventoryManager, InterfaceC46473om3 operatorManager, InterfaceC27246pJ bluetoothManager, ScopeProvider scopeProvider, InterfaceC50205v40 ui, InterfaceC40099e13 navigator, BulkScanPurpose purpose, InterfaceC40613et3 delegate, InterfaceC1880Ea analyticsManager, BaseActivity activity, C36207Tq4 reactiveConfig, InterfaceC33193Gt5 serviceCenterManager, C31789At5 converter) {
        super(activity, operatorInventoryManager, operatorManager, bluetoothManager, scopeProvider, ui, navigator, purpose, delegate, analyticsManager, null, reactiveConfig);
        List<WireBird> emptyList;
        Intrinsics.checkNotNullParameter(operatorInventoryManager, "operatorInventoryManager");
        Intrinsics.checkNotNullParameter(operatorManager, "operatorManager");
        Intrinsics.checkNotNullParameter(bluetoothManager, "bluetoothManager");
        Intrinsics.checkNotNullParameter(scopeProvider, "scopeProvider");
        Intrinsics.checkNotNullParameter(ui, "ui");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(purpose, "purpose");
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        Intrinsics.checkNotNullParameter(analyticsManager, "analyticsManager");
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(reactiveConfig, "reactiveConfig");
        Intrinsics.checkNotNullParameter(serviceCenterManager, "serviceCenterManager");
        Intrinsics.checkNotNullParameter(converter, "converter");
        this.f93869x = serviceCenterManager;
        this.f93870y = converter;
        this.f93871z = ScanIntention.BULK_PROGRESS;
        this.f93868A = new LinkedHashMap();
        C24523e c24523e = C24523e.f91168a;
        Observable<List<Bird>> mo8093l1 = operatorManager.mo8093l1(purpose);
        C24552a<List<WireBird>> m41856l0 = m41856l0();
        emptyList = CollectionsKt__CollectionsKt.emptyList();
        Observable<List<WireBird>> startWith = m41856l0.startWith((C24552a<List<WireBird>>) emptyList);
        Intrinsics.checkNotNullExpressionValue(startWith, "tasksSubject.startWith(emptyList<WireBird>())");
        Observable m31956a = c24523e.m31956a(mo8093l1, startWith);
        final C25097a c25097a = new C25097a(ui, this);
        Observable flatMapSingle = m31956a.flatMapSingle(new InterfaceC23492o() { // from class: d50
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m29343p1;
                m29343p1 = C43694k50.m29343p1(Function1.this, obj);
                return m29343p1;
            }
        });
        final C25100b c25100b = new C25100b();
        Observable observeOn = flatMapSingle.map(new InterfaceC23492o() { // from class: e50
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                List m29342q1;
                m29342q1 = C43694k50.m29342q1(Function1.this, obj);
                return m29342q1;
            }
        }).observeOn(C23454a.m33087a());
        final C25101c c25101c = new C25101c(ui);
        Observable doOnNext = observeOn.doOnNext(new InterfaceC23484g() { // from class: f50
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C43694k50.m29341r1(Function1.this, obj);
            }
        });
        final C25102d c25102d = new C25102d(ui);
        Observable doOnError = doOnNext.doOnError(new InterfaceC23484g() { // from class: g50
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C43694k50.m29340s1(Function1.this, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(doOnError, "Observables.combineLates…ui.errorGeneric()\n      }");
        Object m33094as = doOnError.m33094as(AutoDispose.m45239a(scopeProvider));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C25103e c25103e = new C25103e(ui);
        ((ObservableSubscribeProxy) m33094as).subscribe(new InterfaceC23484g() { // from class: h50
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C43694k50.m29339t1(Function1.this, obj);
            }
        });
        String m41858k0 = m41858k0();
        ScanIntention mo10918j0 = mo10918j0();
        String name = mo10918j0 != null ? mo10918j0.name() : null;
        Intrinsics.checkNotNull(name);
        analyticsManager.mo55905y(new C52577z40(null, m41858k0, null, null, name, null, 45, null));
    }
}
