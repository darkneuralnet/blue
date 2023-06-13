package p000;

import co.bird.android.model.constant.ScanIntention;
import co.bird.android.model.constant.ScanMode;
import co.bird.android.model.persistence.Bird;
import com.amazonaws.mobileconnectors.p025s3.transferutility.TransferTable;
import com.facebook.share.internal.C17296a;
import com.google.android.gms.location.places.Place;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.ObservableSubscribeProxy;
import io.reactivex.AbstractC24507p;
import io.reactivex.InterfaceC24574u;
import io.reactivex.Observable;
import io.reactivex.disposables.InterfaceC23465c;
import io.reactivex.functions.InterfaceC23479b;
import io.reactivex.functions.InterfaceC23480c;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.functions.InterfaceC23492o;
import io.reactivex.rxkotlin.C24527f;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.comparisons.ComparisonsKt__ComparisonsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.SpreadBuilder;
import p000.C36866Wl6;
import p000.InterfaceC40099e13;
@Metadata(m28433d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B!\b\u0007\u0012\u0006\u0010\u000e\u001a\u00020\u000b\u0012\u0006\u0010\u0012\u001a\u00020\u000f\u0012\u0006\u0010\u0016\u001a\u00020\u0013¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0002H\u0016J\u0018\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u0007*\b\u0012\u0004\u0012\u00020\b0\u0007H\u0002R\u0014\u0010\u000e\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u0012\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0016\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R.\u0010\u001c\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\t \u0019*\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u00180\u00180\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001f"}, m28432d2 = {"LWl6;", "LhE;", "LZl6;", "Lam6;", "renderer", "", "v", "Lio/reactivex/Observable;", "", "Lco/bird/android/model/persistence/Bird;", "z", "Lom3;", "f", "Lom3;", "operatorManager", "LTq4;", "g", "LTq4;", "reactiveConfig", "Le13;", "h", "Le13;", "navigator", "Lma4;", "", "kotlin.jvm.PlatformType", "i", "Lma4;", "scannedVehicles", "<init>", "(Lom3;LTq4;Le13;)V", "co.bird.android.feature.complaintresolution"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nVehicleInvolvedScanPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VehicleInvolvedScanPresenter.kt\nco/bird/android/feature/complaintresolution/scanner/VehicleInvolvedScanPresenter\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n+ 3 Observables.kt\nio/reactivex/rxkotlin/ObservablesKt\n*L\n1#1,94:1\n180#2:95\n180#2:96\n180#2:97\n180#2:99\n233#3:98\n*S KotlinDebug\n*F\n+ 1 VehicleInvolvedScanPresenter.kt\nco/bird/android/feature/complaintresolution/scanner/VehicleInvolvedScanPresenter\n*L\n32#1:95\n39#1:96\n54#1:97\n68#1:99\n67#1:98\n*E\n"})
/* renamed from: Wl6  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C36866Wl6 extends C22600hE<InterfaceC37568Zl6, C38157am6> {

    /* renamed from: f */
    public final InterfaceC46473om3 f42061f;

    /* renamed from: g */
    public final C36207Tq4 f42062g;

    /* renamed from: h */
    public final InterfaceC40099e13 f42063h;

    /* renamed from: i */
    public final C45168ma4<List<Bird>> f42064i;

    @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\b\u0010\b\u001a\u00028\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0000\"\b\b\u0002\u0010\u0003*\u00020\u00002\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00028\u0001H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"", "T", "U", "R", "t", "u", "apply", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nObservables.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Observables.kt\nio/reactivex/rxkotlin/ObservablesKt$withLatestFrom$1\n+ 2 VehicleInvolvedScanPresenter.kt\nco/bird/android/feature/complaintresolution/scanner/VehicleInvolvedScanPresenter\n*L\n1#1,304:1\n67#2:305\n*E\n"})
    /* renamed from: Wl6$a */
    /* loaded from: classes3.dex */
    public static final class C9165a<T1, T2, R> implements InterfaceC23480c<Unit, List<? extends Bird>, R> {
        @Override // io.reactivex.functions.InterfaceC23480c
        public final R apply(Unit unit, List<? extends Bird> list) {
            return (R) list;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"<anonymous>", "", "enableMLKit", "", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/Boolean;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Wl6$b */
    /* loaded from: classes3.dex */
    public static final class C9166b extends Lambda implements Function1<Boolean, Unit> {

        @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"Lam6;", TransferTable.COLUMN_STATE, C17296a.f69688o, "(Lam6;)Lam6;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: Wl6$b$a */
        /* loaded from: classes3.dex */
        public static final class C9167a extends Lambda implements Function1<C38157am6, C38157am6> {

            /* renamed from: g */
            public final /* synthetic */ Boolean f42066g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C9167a(Boolean bool) {
                super(1);
                this.f42066g = bool;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final C38157am6 invoke(C38157am6 state) {
                C38157am6 m70762n;
                Intrinsics.checkNotNullParameter(state, "state");
                m70762n = state.m70762n((r22 & 1) != 0 ? state.f51212a : null, (r22 & 2) != 0 ? state.f51213b : 0, (r22 & 4) != 0 ? state.f51214c : null, (r22 & 8) != 0 ? state.f51215d : this.f42066g, (r22 & 16) != 0 ? state.f51216e : null, (r22 & 32) != 0 ? state.f51217f : null, (r22 & 64) != 0 ? state.f51218g : null, (r22 & 128) != 0 ? state.f51219h : null, (r22 & 256) != 0 ? state.f51220i : null, (r22 & 512) != 0 ? state.f51221j : null);
                return m70762n;
            }
        }

        public C9166b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
            invoke2(bool);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Boolean bool) {
            C36866Wl6.this.m42279i(new C9167a(bool));
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, m28432d2 = {"<anonymous>", "", "scannedVehicles", "", "Lco/bird/android/model/persistence/Bird;", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Wl6$c */
    /* loaded from: classes3.dex */
    public static final class C9168c extends Lambda implements Function1<List<? extends Bird>, Unit> {

        @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"Lam6;", TransferTable.COLUMN_STATE, C17296a.f69688o, "(Lam6;)Lam6;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: Wl6$c$a */
        /* loaded from: classes3.dex */
        public static final class C9169a extends Lambda implements Function1<C38157am6, C38157am6> {

            /* renamed from: g */
            public final /* synthetic */ List<Bird> f42068g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C9169a(List<Bird> list) {
                super(1);
                this.f42068g = list;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final C38157am6 invoke(C38157am6 state) {
                C38157am6 m70762n;
                Intrinsics.checkNotNullParameter(state, "state");
                List<Bird> scannedVehicles = this.f42068g;
                Intrinsics.checkNotNullExpressionValue(scannedVehicles, "scannedVehicles");
                m70762n = state.m70762n((r22 & 1) != 0 ? state.f51212a : scannedVehicles, (r22 & 2) != 0 ? state.f51213b : 0, (r22 & 4) != 0 ? state.f51214c : null, (r22 & 8) != 0 ? state.f51215d : null, (r22 & 16) != 0 ? state.f51216e : null, (r22 & 32) != 0 ? state.f51217f : null, (r22 & 64) != 0 ? state.f51218g : null, (r22 & 128) != 0 ? state.f51219h : null, (r22 & 256) != 0 ? state.f51220i : null, (r22 & 512) != 0 ? state.f51221j : null);
                return m70762n;
            }
        }

        public C9168c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(List<? extends Bird> list) {
            invoke2((List<Bird>) list);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(List<Bird> list) {
            C36866Wl6.this.m42279i(new C9169a(list));
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "e", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Wl6$d */
    /* loaded from: classes3.dex */
    public static final class C9170d extends Lambda implements Function1<Throwable, Unit> {

        @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"Lam6;", TransferTable.COLUMN_STATE, C17296a.f69688o, "(Lam6;)Lam6;"}, m28431k = 3, m28430mv = {1, 8, 0})
        @SourceDebugExtension({"SMAP\nVehicleInvolvedScanPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VehicleInvolvedScanPresenter.kt\nco/bird/android/feature/complaintresolution/scanner/VehicleInvolvedScanPresenter$consume$3$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,94:1\n1#2:95\n*E\n"})
        /* renamed from: Wl6$d$a */
        /* loaded from: classes3.dex */
        public static final class C9171a extends Lambda implements Function1<C38157am6, C38157am6> {

            /* renamed from: g */
            public final /* synthetic */ Throwable f42070g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C9171a(Throwable th) {
                super(1);
                this.f42070g = th;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final C38157am6 invoke(C38157am6 state) {
                C38157am6 m70762n;
                Intrinsics.checkNotNullParameter(state, "state");
                m70762n = state.m70762n((r22 & 1) != 0 ? state.f51212a : null, (r22 & 2) != 0 ? state.f51213b : 0, (r22 & 4) != 0 ? state.f51214c : null, (r22 & 8) != 0 ? state.f51215d : null, (r22 & 16) != 0 ? state.f51216e : null, (r22 & 32) != 0 ? state.f51217f : null, (r22 & 64) != 0 ? state.f51218g : null, (r22 & 128) != 0 ? state.f51219h : null, (r22 & 256) != 0 ? state.f51220i : null, (r22 & 512) != 0 ? state.f51221j : null);
                m70762n.m70759q(this.f42070g);
                return m70762n;
            }
        }

        public C9170d() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            C36866Wl6.this.m42279i(new C9171a(th));
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012N\u0010\u0002\u001aJ\u0012\u0004\u0012\u00020\u0004\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0006*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00050\u0005 \u0006*$\u0012\u0004\u0012\u00020\u0004\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0006*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00050\u0005\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0007"}, m28432d2 = {"<anonymous>", "", "<name for destructuring parameter 0>", "Lkotlin/Pair;", "Lco/bird/android/model/persistence/Bird;", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    @SourceDebugExtension({"SMAP\nVehicleInvolvedScanPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VehicleInvolvedScanPresenter.kt\nco/bird/android/feature/complaintresolution/scanner/VehicleInvolvedScanPresenter$consume$4\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,94:1\n1747#2,3:95\n1054#2:98\n37#3,2:99\n*S KotlinDebug\n*F\n+ 1 VehicleInvolvedScanPresenter.kt\nco/bird/android/feature/complaintresolution/scanner/VehicleInvolvedScanPresenter$consume$4\n*L\n56#1:95,3\n58#1:98\n61#1:99,2\n*E\n"})
    /* renamed from: Wl6$e */
    /* loaded from: classes3.dex */
    public static final class C9172e extends Lambda implements Function1<Pair<? extends Bird, ? extends List<? extends Bird>>, Unit> {

        @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u000e\u0010\u0003\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u00022\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m28432d2 = {"<anonymous>", "", "T", C17296a.f69688o, "kotlin.jvm.PlatformType", "b", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "kotlin/comparisons/ComparisonsKt__ComparisonsKt$compareByDescending$1"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        @SourceDebugExtension({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareByDescending$1\n+ 2 VehicleInvolvedScanPresenter.kt\nco/bird/android/feature/complaintresolution/scanner/VehicleInvolvedScanPresenter$consume$4\n*L\n1#1,328:1\n58#2:329\n*E\n"})
        /* renamed from: Wl6$e$a */
        /* loaded from: classes3.dex */
        public static final class C9173a<T> implements Comparator {

            /* renamed from: b */
            public final /* synthetic */ Bird f42072b;

            public C9173a(Bird bird) {
                this.f42072b = bird;
            }

            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                int compareValues;
                compareValues = ComparisonsKt__ComparisonsKt.compareValues(Boolean.valueOf(Intrinsics.areEqual(((Bird) t2).getId(), this.f42072b.getId())), Boolean.valueOf(Intrinsics.areEqual(((Bird) t).getId(), this.f42072b.getId())));
                return compareValues;
            }
        }

        public C9172e() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Pair<? extends Bird, ? extends List<? extends Bird>> pair) {
            invoke2((Pair<Bird, ? extends List<Bird>>) pair);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Pair<Bird, ? extends List<Bird>> pair) {
            boolean z;
            List listOf;
            List sortedWith;
            Bird component1 = pair.component1();
            List<Bird> scannedVehicles = pair.component2();
            Intrinsics.checkNotNullExpressionValue(scannedVehicles, "scannedVehicles");
            List<Bird> list = scannedVehicles;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                for (Bird bird : list) {
                    if (Intrinsics.areEqual(bird.getId(), component1.getId())) {
                        z = true;
                        break;
                    }
                }
            }
            z = false;
            if (z) {
                C45168ma4 c45168ma4 = C36866Wl6.this.f42064i;
                sortedWith = CollectionsKt___CollectionsKt.sortedWith(list, new C9173a(component1));
                c45168ma4.accept(sortedWith);
                return;
            }
            C45168ma4 c45168ma42 = C36866Wl6.this.f42064i;
            SpreadBuilder spreadBuilder = new SpreadBuilder(2);
            spreadBuilder.add(component1);
            spreadBuilder.addSpread(scannedVehicles.toArray(new Bird[0]));
            listOf = CollectionsKt__CollectionsKt.listOf(spreadBuilder.toArray(new Bird[spreadBuilder.size()]));
            c45168ma42.accept(listOf);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, m28432d2 = {"<anonymous>", "", "scannedVehicles", "", "Lco/bird/android/model/persistence/Bird;", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    @SourceDebugExtension({"SMAP\nVehicleInvolvedScanPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VehicleInvolvedScanPresenter.kt\nco/bird/android/feature/complaintresolution/scanner/VehicleInvolvedScanPresenter$consume$6\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,94:1\n1549#2:95\n1620#2,3:96\n*S KotlinDebug\n*F\n+ 1 VehicleInvolvedScanPresenter.kt\nco/bird/android/feature/complaintresolution/scanner/VehicleInvolvedScanPresenter$consume$6\n*L\n72#1:95\n72#1:96,3\n*E\n"})
    /* renamed from: Wl6$f */
    /* loaded from: classes3.dex */
    public static final class C9174f extends Lambda implements Function1<List<? extends Bird>, Unit> {
        public C9174f() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(List<? extends Bird> list) {
            invoke2((List<Bird>) list);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(List<Bird> scannedVehicles) {
            int collectionSizeOrDefault;
            InterfaceC40099e13 interfaceC40099e13 = C36866Wl6.this.f42063h;
            InterfaceC40099e13.EnumC19925b enumC19925b = InterfaceC40099e13.EnumC19925b.RESULT_OK;
            Pair<String, ?>[] pairArr = new Pair[1];
            Intrinsics.checkNotNullExpressionValue(scannedVehicles, "scannedVehicles");
            List<Bird> list = scannedVehicles;
            collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10);
            ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
            for (Bird bird : list) {
                arrayList.add(bird.getId());
            }
            pairArr[0] = TuplesKt.m28425to("bird_ids", arrayList);
            interfaceC40099e13.mo37077W0(enumC19925b, pairArr);
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0004"}, m28432d2 = {"<anonymous>", "", "kotlin.jvm.PlatformType", "raw", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Wl6$g */
    /* loaded from: classes3.dex */
    public static final class C9175g extends Lambda implements Function1<String, String> {

        /* renamed from: g */
        public static final C9175g f42074g = new C9175g();

        public C9175g() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final String invoke(String raw) {
            Intrinsics.checkNotNullParameter(raw, "raw");
            String m99597e = C33894Jt4.f18402a.m99597e(raw);
            return m99597e == null ? raw : m99597e;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a*\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"", "scan", "Lio/reactivex/u;", "Lco/bird/android/model/persistence/Bird;", "kotlin.jvm.PlatformType", "c", "(Ljava/lang/String;)Lio/reactivex/u;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Wl6$h */
    /* loaded from: classes3.dex */
    public static final class C9176h extends Lambda implements Function1<String, InterfaceC24574u<? extends Bird>> {

        @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lio/reactivex/disposables/c;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lio/reactivex/disposables/c;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: Wl6$h$a */
        /* loaded from: classes3.dex */
        public static final class C9177a extends Lambda implements Function1<InterfaceC23465c, Unit> {

            /* renamed from: g */
            public final /* synthetic */ C36866Wl6 f42076g;

            @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"Lam6;", TransferTable.COLUMN_STATE, C17296a.f69688o, "(Lam6;)Lam6;"}, m28431k = 3, m28430mv = {1, 8, 0})
            /* renamed from: Wl6$h$a$a */
            /* loaded from: classes3.dex */
            public static final class C9178a extends Lambda implements Function1<C38157am6, C38157am6> {

                /* renamed from: g */
                public static final C9178a f42077g = new C9178a();

                public C9178a() {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                /* renamed from: a */
                public final C38157am6 invoke(C38157am6 state) {
                    C38157am6 m70762n;
                    Intrinsics.checkNotNullParameter(state, "state");
                    m70762n = state.m70762n((r22 & 1) != 0 ? state.f51212a : null, (r22 & 2) != 0 ? state.f51213b : state.m70761o() + 1, (r22 & 4) != 0 ? state.f51214c : null, (r22 & 8) != 0 ? state.f51215d : null, (r22 & 16) != 0 ? state.f51216e : null, (r22 & 32) != 0 ? state.f51217f : null, (r22 & 64) != 0 ? state.f51218g : null, (r22 & 128) != 0 ? state.f51219h : null, (r22 & 256) != 0 ? state.f51220i : null, (r22 & 512) != 0 ? state.f51221j : null);
                    return m70762n;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C9177a(C36866Wl6 c36866Wl6) {
                super(1);
                this.f42076g = c36866Wl6;
            }

            /* renamed from: a */
            public final void m77853a(InterfaceC23465c interfaceC23465c) {
                this.f42076g.m42279i(C9178a.f42077g);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(InterfaceC23465c interfaceC23465c) {
                m77853a(interfaceC23465c);
                return Unit.INSTANCE;
            }
        }

        @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u00052\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u00002\u000e\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"Lco/bird/android/model/persistence/Bird;", "kotlin.jvm.PlatformType", "<anonymous parameter 0>", "", "<anonymous parameter 1>", "", C17296a.f69688o, "(Lco/bird/android/model/persistence/Bird;Ljava/lang/Throwable;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: Wl6$h$b */
        /* loaded from: classes3.dex */
        public static final class C9179b extends Lambda implements Function2<Bird, Throwable, Unit> {

            /* renamed from: g */
            public final /* synthetic */ C36866Wl6 f42078g;

            @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"Lam6;", TransferTable.COLUMN_STATE, C17296a.f69688o, "(Lam6;)Lam6;"}, m28431k = 3, m28430mv = {1, 8, 0})
            /* renamed from: Wl6$h$b$a */
            /* loaded from: classes3.dex */
            public static final class C9180a extends Lambda implements Function1<C38157am6, C38157am6> {

                /* renamed from: g */
                public static final C9180a f42079g = new C9180a();

                public C9180a() {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                /* renamed from: a */
                public final C38157am6 invoke(C38157am6 state) {
                    C38157am6 m70762n;
                    Intrinsics.checkNotNullParameter(state, "state");
                    m70762n = state.m70762n((r22 & 1) != 0 ? state.f51212a : null, (r22 & 2) != 0 ? state.f51213b : state.m70761o() - 1, (r22 & 4) != 0 ? state.f51214c : null, (r22 & 8) != 0 ? state.f51215d : null, (r22 & 16) != 0 ? state.f51216e : null, (r22 & 32) != 0 ? state.f51217f : null, (r22 & 64) != 0 ? state.f51218g : null, (r22 & 128) != 0 ? state.f51219h : null, (r22 & 256) != 0 ? state.f51220i : null, (r22 & 512) != 0 ? state.f51221j : null);
                    return m70762n;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C9179b(C36866Wl6 c36866Wl6) {
                super(2);
                this.f42078g = c36866Wl6;
            }

            /* renamed from: a */
            public final void m77851a(Bird bird, Throwable th) {
                this.f42078g.m42279i(C9180a.f42079g);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Bird bird, Throwable th) {
                m77851a(bird, th);
                return Unit.INSTANCE;
            }
        }

        public C9176h() {
            super(1);
        }

        /* renamed from: d */
        public static final void m77854d(Function2 tmp0, Object obj, Object obj2) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            tmp0.invoke(obj, obj2);
        }

        public static final void invoke$lambda$0(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            tmp0.invoke(obj);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: c */
        public final InterfaceC24574u<? extends Bird> invoke(String scan) {
            Intrinsics.checkNotNullParameter(scan, "scan");
            AbstractC24507p<Bird> mo8113c0 = C36866Wl6.this.f42061f.mo8113c0(scan, ScanMode.ADMIN, ScanIntention.OPERATOR_IDENTIFICATION);
            final C9177a c9177a = new C9177a(C36866Wl6.this);
            AbstractC24507p<Bird> m32027r = mo8113c0.m32027r(new InterfaceC23484g() { // from class: Xl6
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj) {
                    C36866Wl6.C9176h.invoke$lambda$0(Function1.this, obj);
                }
            });
            final C9179b c9179b = new C9179b(C36866Wl6.this);
            return m32027r.m32028q(new InterfaceC23479b() { // from class: Yl6
                @Override // io.reactivex.functions.InterfaceC23479b
                public final void accept(Object obj, Object obj2) {
                    C36866Wl6.C9176h.m77854d(Function2.this, obj, obj2);
                }
            });
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C36866Wl6(InterfaceC46473om3 operatorManager, C36207Tq4 reactiveConfig, InterfaceC40099e13 navigator) {
        super(new C38157am6(null, 0, null, null, null, null, null, null, null, null, Place.TYPE_SUBLOCALITY_LEVEL_1, null), null, 2, null);
        Intrinsics.checkNotNullParameter(operatorManager, "operatorManager");
        Intrinsics.checkNotNullParameter(reactiveConfig, "reactiveConfig");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        this.f42061f = operatorManager;
        this.f42062g = reactiveConfig;
        this.f42063h = navigator;
        C45168ma4<List<Bird>> m25409g = C45168ma4.m25409g();
        Intrinsics.checkNotNullExpressionValue(m25409g, "create<List<Bird>>()");
        this.f42064i = m25409g;
    }

    /* renamed from: A */
    public static final String m77876A(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (String) tmp0.invoke(obj);
    }

    /* renamed from: B */
    public static final InterfaceC24574u m77875B(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC24574u) tmp0.invoke(obj);
    }

    /* renamed from: f */
    public static final void m77874f(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: g */
    public static final void m77873g(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: w */
    public static final void m77864w(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: x */
    public static final void m77863x(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: y */
    public static final void m77862y(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    @Override // p000.C22600hE, p000.AbstractC20169f1
    /* renamed from: v */
    public void consume(InterfaceC37568Zl6 renderer) {
        List<Bird> emptyList;
        Intrinsics.checkNotNullParameter(renderer, "renderer");
        super.consume((C36866Wl6) renderer);
        Object m33094as = this.f42062g.m82627f4().m33094as(AutoDispose.m45239a(m42278j()));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C9166b c9166b = new C9166b();
        ((ObservableSubscribeProxy) m33094as).subscribe(new InterfaceC23484g() { // from class: Pl6
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C36866Wl6.m77874f(Function1.this, obj);
            }
        });
        Object m33094as2 = this.f42064i.m33094as(AutoDispose.m45239a(m42278j()));
        Intrinsics.checkExpressionValueIsNotNull(m33094as2, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C9168c c9168c = new C9168c();
        ((ObservableSubscribeProxy) m33094as2).subscribe(new InterfaceC23484g() { // from class: Ql6
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C36866Wl6.m77873g(Function1.this, obj);
            }
        });
        Observable<Bird> m77861z = m77861z(renderer.mo54815T());
        C45168ma4<List<Bird>> c45168ma4 = this.f42064i;
        emptyList = CollectionsKt__CollectionsKt.emptyList();
        Observable<List<Bird>> startWith = c45168ma4.startWith((C45168ma4<List<Bird>>) emptyList);
        Intrinsics.checkNotNullExpressionValue(startWith, "scannedVehicles.startWith(emptyList<Bird>())");
        Observable m31950a = C24527f.m31950a(m77861z, startWith);
        final C9170d c9170d = new C9170d();
        Observable retry = m31950a.doOnError(new InterfaceC23484g() { // from class: Rl6
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C36866Wl6.m77864w(Function1.this, obj);
            }
        }).retry();
        Intrinsics.checkNotNullExpressionValue(retry, "override fun consume(ren…d }\n        )\n      }\n  }");
        Object m33094as3 = retry.m33094as(AutoDispose.m45239a(m42278j()));
        Intrinsics.checkExpressionValueIsNotNull(m33094as3, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C9172e c9172e = new C9172e();
        ((ObservableSubscribeProxy) m33094as3).subscribe(new InterfaceC23484g() { // from class: Sl6
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C36866Wl6.m77863x(Function1.this, obj);
            }
        });
        Observable<R> withLatestFrom = renderer.doneClicks().withLatestFrom(this.f42064i, new C9165a());
        Intrinsics.checkExpressionValueIsNotNull(withLatestFrom, "withLatestFrom(other, Bi… combiner.invoke(t, u) })");
        Object m33094as4 = withLatestFrom.m33094as(AutoDispose.m45239a(m42278j()));
        Intrinsics.checkExpressionValueIsNotNull(m33094as4, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C9174f c9174f = new C9174f();
        ((ObservableSubscribeProxy) m33094as4).subscribe(new InterfaceC23484g() { // from class: Tl6
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C36866Wl6.m77862y(Function1.this, obj);
            }
        });
    }

    /* renamed from: z */
    public final Observable<Bird> m77861z(Observable<String> observable) {
        final C9175g c9175g = C9175g.f42074g;
        Observable<R> map = observable.map(new InterfaceC23492o() { // from class: Ul6
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                String m77876A;
                m77876A = C36866Wl6.m77876A(Function1.this, obj);
                return m77876A;
            }
        });
        final C9176h c9176h = new C9176h();
        Observable<Bird> flatMapMaybe = map.flatMapMaybe(new InterfaceC23492o() { // from class: Vl6
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC24574u m77875B;
                m77875B = C36866Wl6.m77875B(Function1.this, obj);
                return m77875B;
            }
        });
        Intrinsics.checkNotNullExpressionValue(flatMapMaybe, "private fun Observable<S…}\n          }\n      }\n  }");
        return flatMapMaybe;
    }
}
