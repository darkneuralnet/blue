package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.buava.Optional;
import co.bird.android.model.NonRepair;
import co.bird.android.model.NonRepairReason;
import com.facebook.share.internal.C17296a;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.ObservableSubscribeProxy;
import com.uber.autodispose.ScopeProvider;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.C23454a;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.functions.InterfaceC23486i;
import io.reactivex.functions.InterfaceC23492o;
import io.reactivex.functions.InterfaceC23494q;
import io.reactivex.rxkotlin.C24523e;
import io.reactivex.schedulers.C24542a;
import io.reactivex.subjects.C24552a;
import io.reactivex.subjects.C24556c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B/\b\u0007\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007\u0012\u0006\u0010\u000e\u001a\u00020\u000b\u0012\u0006\u0010\u0012\u001a\u00020\u000f\u0012\u0006\u0010\u0016\u001a\u00020\u0013¢\u0006\u0004\b#\u0010$J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0006\u001a\u00020\u0004R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\u000e\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u0012\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0016\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\"\u0010\u001b\u001a\u0010\u0012\f\u0012\n \u0018*\u0004\u0018\u00010\u00020\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR.\u0010\u001f\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u001d \u0018*\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u001c0\u001c0\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001aR.\u0010\"\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020  \u0018*\n\u0012\u0004\u0012\u00020 \u0018\u00010\u001c0\u001c0\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\u001a¨\u0006%"}, m28432d2 = {"Ls93;", "", "Lco/bird/android/model/NonRepair;", "nonRepair", "", "k", "l", "Lio/reactivex/subjects/c;", C17296a.f69688o, "Lio/reactivex/subjects/c;", "resultSubject", "Lg93;", "b", "Lg93;", "converter", "LG93;", "c", "LG93;", "ui", "Lcom/uber/autodispose/ScopeProvider;", DateTokenConverter.CONVERTER_KEY, "Lcom/uber/autodispose/ScopeProvider;", "scopeProvider", "Lio/reactivex/subjects/a;", "kotlin.jvm.PlatformType", "e", "Lio/reactivex/subjects/a;", "nonRepairSubject", "Lco/bird/android/buava/Optional;", "Lco/bird/android/model/NonRepairReason;", "f", "nonRepairReasonSubject", "", "g", "notesSubject", "<init>", "(Lio/reactivex/subjects/c;Lg93;LG93;Lcom/uber/autodispose/ScopeProvider;)V", "repair_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nNonRepairPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NonRepairPresenter.kt\nco/bird/android/feature/repair/v3/issues/dialogs/nonrepair/NonRepairPresenter\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n+ 4 Observables.kt\nco/bird/android/library/rx/ObservablesKt\n*L\n1#1,93:1\n288#2,2:94\n180#3:96\n180#3:97\n180#3:98\n180#3:100\n180#3:101\n128#4:99\n*S KotlinDebug\n*F\n+ 1 NonRepairPresenter.kt\nco/bird/android/feature/repair/v3/issues/dialogs/nonrepair/NonRepairPresenter\n*L\n31#1:94,2\n52#1:96\n56#1:97\n66#1:98\n84#1:100\n89#1:101\n70#1:99\n*E\n"})
/* renamed from: s93  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C48480s93 {

    /* renamed from: a */
    public final C24556c<NonRepair> f108383a;

    /* renamed from: b */
    public final C41365g93 f108384b;

    /* renamed from: c */
    public final G93 f108385c;

    /* renamed from: d */
    public final ScopeProvider f108386d;

    /* renamed from: e */
    public final C24552a<NonRepair> f108387e;

    /* renamed from: f */
    public final C24552a<Optional<NonRepairReason>> f108388f;

    /* renamed from: g */
    public final C24552a<Optional<String>> f108389g;

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\t\u001a\u001a\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\b\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0002\"\u0004\b\u0003\u0010\u00032\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00028\u00012\u0006\u0010\u0006\u001a\u00028\u00022\u0006\u0010\u0007\u001a\u00028\u0003H\n¢\u0006\u0004\b\t\u0010\n"}, m28432d2 = {"T", "T1", "T2", "T3", "t", "t1", "t2", "t3", "Lwb4;", C17296a.f69688o, "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Lwb4;"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nObservables.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Observables.kt\nco/bird/android/library/rx/ObservablesKt$withLatestFrom$1\n*L\n1#1,134:1\n*E\n"})
    /* renamed from: s93$a */
    /* loaded from: classes3.dex */
    public static final class C28215a<T1, T2, T3, T4, R> implements InterfaceC23486i {

        /* renamed from: a */
        public static final C28215a<T1, T2, T3, T4, R> f108390a = new C28215a<>();

        @Override // io.reactivex.functions.InterfaceC23486i
        /* renamed from: a */
        public final C51106wb4<Unit, T1, T2, T3> apply(Unit unit, T1 t1, T2 t2, T3 t3) {
            return new C51106wb4<>(unit, t1, t2, t3);
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0003*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"<anonymous>", "", "it", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: s93$b */
    /* loaded from: classes3.dex */
    public static final class C28216b extends Lambda implements Function1<Unit, Unit> {
        public C28216b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Unit unit) {
            invoke2(unit);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Unit unit) {
            C48480s93.this.f108383a.onComplete();
        }
    }

    @Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\t\u001a\u0016\u0012\u0004\u0012\u00020\b \u0002*\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00070\u00072H\u0010\u0006\u001aD\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0002*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0005 \u0002*\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00030\u00030\u0000H\n¢\u0006\u0004\b\t\u0010\n"}, m28432d2 = {"Lkotlin/Triple;", "Lco/bird/android/model/NonRepair;", "kotlin.jvm.PlatformType", "Lco/bird/android/buava/Optional;", "Lco/bird/android/model/NonRepairReason;", "", "<name for destructuring parameter 0>", "", "LH6;", C17296a.f69688o, "(Lkotlin/Triple;)Ljava/util/List;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: s93$c */
    /* loaded from: classes3.dex */
    public static final class C28217c extends Lambda implements Function1<Triple<? extends NonRepair, ? extends Optional<NonRepairReason>, ? extends Optional<String>>, List<? extends C3023H6>> {
        public C28217c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final List<C3023H6> invoke(Triple<NonRepair, Optional<NonRepairReason>, Optional<String>> triple) {
            Intrinsics.checkNotNullParameter(triple, "<name for destructuring parameter 0>");
            NonRepair nonRepair = triple.component1();
            C41365g93 c41365g93 = C48480s93.this.f108384b;
            Intrinsics.checkNotNullExpressionValue(nonRepair, "nonRepair");
            return c41365g93.m39965a(nonRepair, triple.component2().m59035e(), triple.component3().m59035e());
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: s93$d */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C28218d extends FunctionReferenceImpl implements Function1<List<? extends C3023H6>, Unit> {
        public C28218d(Object obj) {
            super(1, obj, G93.class, "populateAdapter", "populateAdapter(Ljava/util/List;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(List<? extends C3023H6> list) {
            invoke2((List<C3023H6>) list);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(List<C3023H6> p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((G93) this.receiver).m105681b(p0);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/NonRepairReason;", "kotlin.jvm.PlatformType", "reason", "", C17296a.f69688o, "(Lco/bird/android/model/NonRepairReason;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: s93$e */
    /* loaded from: classes3.dex */
    public static final class C28219e extends Lambda implements Function1<NonRepairReason, Unit> {
        public C28219e() {
            super(1);
        }

        /* renamed from: a */
        public final void m14641a(NonRepairReason reason) {
            C24552a c24552a = C48480s93.this.f108388f;
            Optional.C14443a c14443a = Optional.f63040c;
            Intrinsics.checkNotNullExpressionValue(reason, "reason");
            c24552a.onNext(c14443a.m59032c(reason));
            if (!reason.getAllowNote()) {
                C48480s93.this.f108389g.onNext(c14443a.m59034a());
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(NonRepairReason nonRepairReason) {
            m14641a(nonRepairReason);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "notes", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: s93$f */
    /* loaded from: classes3.dex */
    public static final class C28220f extends Lambda implements Function1<String, Unit> {
        public C28220f() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(String str) {
            invoke2(str);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(String notes) {
            C24552a c24552a = C48480s93.this.f108389g;
            Optional.C14443a c14443a = Optional.f63040c;
            Intrinsics.checkNotNullExpressionValue(notes, "notes");
            c24552a.onNext(c14443a.m59032c(notes));
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\b\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022N\u0010\u0007\u001aJ\u0012\u0004\u0012\u00020\u0001\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0005 \u0003*\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00040\u0004\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0006 \u0003*\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00040\u00040\u0000H\n¢\u0006\u0004\b\b\u0010\t"}, m28432d2 = {"Lwb4;", "", "Lco/bird/android/model/NonRepair;", "kotlin.jvm.PlatformType", "Lco/bird/android/buava/Optional;", "Lco/bird/android/model/NonRepairReason;", "", "<name for destructuring parameter 0>", C17296a.f69688o, "(Lwb4;)Lco/bird/android/model/NonRepair;"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nNonRepairPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NonRepairPresenter.kt\nco/bird/android/feature/repair/v3/issues/dialogs/nonrepair/NonRepairPresenter$onResume$5\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,93:1\n1549#2:94\n1620#2,3:95\n*S KotlinDebug\n*F\n+ 1 NonRepairPresenter.kt\nco/bird/android/feature/repair/v3/issues/dialogs/nonrepair/NonRepairPresenter$onResume$5\n*L\n78#1:94\n78#1:95,3\n*E\n"})
    /* renamed from: s93$g */
    /* loaded from: classes3.dex */
    public static final class C28221g extends Lambda implements Function1<C51106wb4<? extends Unit, ? extends NonRepair, ? extends Optional<NonRepairReason>, ? extends Optional<String>>, NonRepair> {

        /* renamed from: g */
        public static final C28221g f108395g = new C28221g();

        public C28221g() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final NonRepair invoke(C51106wb4<Unit, NonRepair, Optional<NonRepairReason>, Optional<String>> c51106wb4) {
            int collectionSizeOrDefault;
            NonRepair copy;
            String str;
            Intrinsics.checkNotNullParameter(c51106wb4, "<name for destructuring parameter 0>");
            NonRepair nonRepair = c51106wb4.m6613b();
            Optional<String> m6611d = c51106wb4.m6611d();
            NonRepairReason m59035e = c51106wb4.m6612c().m59035e();
            List<NonRepairReason> reasons = nonRepair.getReasons();
            collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(reasons, 10);
            ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
            for (NonRepairReason nonRepairReason : reasons) {
                String reason = nonRepairReason.getReason();
                if (m59035e != null) {
                    str = m59035e.getReason();
                } else {
                    str = null;
                }
                arrayList.add(NonRepairReason.copy$default(nonRepairReason, null, null, Intrinsics.areEqual(reason, str), false, null, 27, null));
            }
            Intrinsics.checkNotNullExpressionValue(nonRepair, "nonRepair");
            copy = nonRepair.copy((r18 & 1) != 0 ? nonRepair.display : null, (r18 & 2) != 0 ? nonRepair.description : null, (r18 & 4) != 0 ? nonRepair.status : null, (r18 & 8) != 0 ? nonRepair.allowRepairs : false, (r18 & 16) != 0 ? nonRepair.selected : false, (r18 & 32) != 0 ? nonRepair.notes : m6611d.m59035e(), (r18 & 64) != 0 ? nonRepair.reasons : arrayList, (r18 & 128) != 0 ? nonRepair.notificationOnly : false);
            return copy;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/NonRepair;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lco/bird/android/model/NonRepair;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: s93$h */
    /* loaded from: classes3.dex */
    public static final class C28222h extends Lambda implements Function1<NonRepair, Unit> {
        public C28222h() {
            super(1);
        }

        /* renamed from: a */
        public final void m14639a(NonRepair nonRepair) {
            C48480s93.this.f108385c.dismiss();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(NonRepair nonRepair) {
            m14639a(nonRepair);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"Lco/bird/android/model/NonRepair;", "it", "", C17296a.f69688o, "(Lco/bird/android/model/NonRepair;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: s93$i */
    /* loaded from: classes3.dex */
    public static final class C28223i extends Lambda implements Function1<NonRepair, Boolean> {
        public C28223i() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Boolean invoke(NonRepair it) {
            Intrinsics.checkNotNullParameter(it, "it");
            NonRepair nonRepair = (NonRepair) C48480s93.this.f108387e.getValue();
            boolean z = false;
            if (nonRepair != null && !nonRepair.getNotificationOnly()) {
                z = true;
            }
            return Boolean.valueOf(z);
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: s93$j */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C28224j extends FunctionReferenceImpl implements Function1<NonRepair, Unit> {
        public C28224j(Object obj) {
            super(1, obj, C24556c.class, "onSuccess", "onSuccess(Ljava/lang/Object;)V", 0);
        }

        /* renamed from: a */
        public final void m14637a(NonRepair p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((C24556c) this.receiver).onSuccess(p0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(NonRepair nonRepair) {
            m14637a(nonRepair);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0003*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"<anonymous>", "", "it", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: s93$k */
    /* loaded from: classes3.dex */
    public static final class C28225k extends Lambda implements Function1<Unit, Unit> {
        public C28225k() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Unit unit) {
            invoke2(unit);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Unit unit) {
            C48480s93.this.f108385c.dismiss();
        }
    }

    public C48480s93(C24556c<NonRepair> resultSubject, C41365g93 converter, G93 ui, ScopeProvider scopeProvider) {
        Intrinsics.checkNotNullParameter(resultSubject, "resultSubject");
        Intrinsics.checkNotNullParameter(converter, "converter");
        Intrinsics.checkNotNullParameter(ui, "ui");
        Intrinsics.checkNotNullParameter(scopeProvider, "scopeProvider");
        this.f108383a = resultSubject;
        this.f108384b = converter;
        this.f108385c = ui;
        this.f108386d = scopeProvider;
        C24552a<NonRepair> m31922e = C24552a.m31922e();
        Intrinsics.checkNotNullExpressionValue(m31922e, "create<NonRepair>()");
        this.f108387e = m31922e;
        C24552a<Optional<NonRepairReason>> m31922e2 = C24552a.m31922e();
        Intrinsics.checkNotNullExpressionValue(m31922e2, "create<Optional<NonRepairReason>>()");
        this.f108388f = m31922e2;
        C24552a<Optional<String>> m31922e3 = C24552a.m31922e();
        Intrinsics.checkNotNullExpressionValue(m31922e3, "create<Optional<String>>()");
        this.f108389g = m31922e3;
    }

    /* renamed from: m */
    public static final List m14653m(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (List) tmp0.invoke(obj);
    }

    /* renamed from: n */
    public static final void m14652n(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: o */
    public static final void m14651o(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: p */
    public static final void m14650p(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: q */
    public static final void m14649q(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: r */
    public static final NonRepair m14648r(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (NonRepair) tmp0.invoke(obj);
    }

    /* renamed from: s */
    public static final void m14647s(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: t */
    public static final boolean m14646t(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return ((Boolean) tmp0.invoke(obj)).booleanValue();
    }

    /* renamed from: u */
    public static final void m14645u(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: v */
    public static final void m14644v(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: k */
    public final void m14655k(NonRepair nonRepair) {
        Object obj;
        Object firstOrNull;
        Intrinsics.checkNotNullParameter(nonRepair, "nonRepair");
        this.f108387e.onNext(nonRepair);
        Iterator<T> it = nonRepair.getReasons().iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (((NonRepairReason) obj).getSelected()) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        NonRepairReason nonRepairReason = (NonRepairReason) obj;
        if (nonRepairReason == null) {
            firstOrNull = CollectionsKt___CollectionsKt.firstOrNull((List<? extends Object>) nonRepair.getReasons());
            nonRepairReason = (NonRepairReason) firstOrNull;
        }
        C24552a<Optional<NonRepairReason>> c24552a = this.f108388f;
        Optional.C14443a c14443a = Optional.f63040c;
        c24552a.onNext(c14443a.m59033b(nonRepairReason));
        this.f108389g.onNext(c14443a.m59033b(nonRepair.getNotes()));
        this.f108385c.m105682Rl(!nonRepair.getNotificationOnly());
    }

    /* renamed from: l */
    public final void m14654l() {
        Observable observeOn = C24523e.f91168a.m31955b(this.f108387e, this.f108388f, this.f108389g).observeOn(C24542a.m31934a());
        final C28217c c28217c = new C28217c();
        Observable observeOn2 = observeOn.map(new InterfaceC23492o() { // from class: i93
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                List m14653m;
                m14653m = C48480s93.m14653m(Function1.this, obj);
                return m14653m;
            }
        }).observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn2, "fun onResume() {\n    Obs…ubject.onComplete() }\n  }");
        Object m33094as = observeOn2.m33094as(AutoDispose.m45239a(this.f108386d));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C28218d c28218d = new C28218d(this.f108385c);
        ((ObservableSubscribeProxy) m33094as).subscribe(new InterfaceC23484g() { // from class: j93
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C48480s93.m14651o(Function1.this, obj);
            }
        });
        Object m33094as2 = this.f108385c.m105684Pl().m33094as(AutoDispose.m45239a(this.f108386d));
        Intrinsics.checkExpressionValueIsNotNull(m33094as2, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C28219e c28219e = new C28219e();
        ((ObservableSubscribeProxy) m33094as2).subscribe(new InterfaceC23484g() { // from class: k93
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C48480s93.m14650p(Function1.this, obj);
            }
        });
        Object m33094as3 = this.f108385c.m105683Ql().m33094as(AutoDispose.m45239a(this.f108386d));
        Intrinsics.checkExpressionValueIsNotNull(m33094as3, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C28220f c28220f = new C28220f();
        ((ObservableSubscribeProxy) m33094as3).subscribe(new InterfaceC23484g() { // from class: l93
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C48480s93.m14649q(Function1.this, obj);
            }
        });
        Observable<R> withLatestFrom = this.f108385c.m105679f().withLatestFrom(this.f108387e, this.f108388f, this.f108389g, C28215a.f108390a);
        Intrinsics.checkNotNullExpressionValue(withLatestFrom, "withLatestFrom(o1, o2, o…-> Quad(t, t1, t2, t3) })");
        final C28221g c28221g = C28221g.f108395g;
        Observable map = withLatestFrom.map(new InterfaceC23492o() { // from class: m93
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                NonRepair m14648r;
                m14648r = C48480s93.m14648r(Function1.this, obj);
                return m14648r;
            }
        });
        final C28222h c28222h = new C28222h();
        Observable doAfterNext = map.doAfterNext(new InterfaceC23484g() { // from class: n93
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C48480s93.m14647s(Function1.this, obj);
            }
        });
        final C28223i c28223i = new C28223i();
        Observable filter = doAfterNext.filter(new InterfaceC23494q() { // from class: o93
            @Override // io.reactivex.functions.InterfaceC23494q
            public final boolean test(Object obj) {
                boolean m14646t;
                m14646t = C48480s93.m14646t(Function1.this, obj);
                return m14646t;
            }
        });
        Intrinsics.checkNotNullExpressionValue(filter, "fun onResume() {\n    Obs…ubject.onComplete() }\n  }");
        Object m33094as4 = filter.m33094as(AutoDispose.m45239a(this.f108386d));
        Intrinsics.checkExpressionValueIsNotNull(m33094as4, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C28224j c28224j = new C28224j(this.f108383a);
        ((ObservableSubscribeProxy) m33094as4).subscribe(new InterfaceC23484g() { // from class: p93
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C48480s93.m14645u(Function1.this, obj);
            }
        });
        Observable<Unit> m105680d = this.f108385c.m105680d();
        final C28225k c28225k = new C28225k();
        Observable<Unit> doAfterNext2 = m105680d.doAfterNext(new InterfaceC23484g() { // from class: q93
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C48480s93.m14644v(Function1.this, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(doAfterNext2, "fun onResume() {\n    Obs…ubject.onComplete() }\n  }");
        Object m33094as5 = doAfterNext2.m33094as(AutoDispose.m45239a(this.f108386d));
        Intrinsics.checkExpressionValueIsNotNull(m33094as5, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C28216b c28216b = new C28216b();
        ((ObservableSubscribeProxy) m33094as5).subscribe(new InterfaceC23484g() { // from class: r93
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C48480s93.m14652n(Function1.this, obj);
            }
        });
    }
}
