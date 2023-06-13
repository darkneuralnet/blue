package p000;

import android.content.Intent;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.Issue;
import co.bird.android.model.RepairType;
import co.bird.android.model.RepairTypeLock;
import com.facebook.share.internal.C17296a;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.ObservableSubscribeProxy;
import com.uber.autodispose.ScopeProvider;
import io.reactivex.InterfaceC23447K;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.C23454a;
import io.reactivex.functions.InterfaceC23480c;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.functions.InterfaceC23492o;
import io.reactivex.rxkotlin.C24527f;
import io.reactivex.subjects.C24552a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.SpreadBuilder;
@Metadata(m28433d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B)\b\u0007\u0012\u0006\u0010\r\u001a\u00020\u000b\u0012\u0006\u0010\u0011\u001a\u00020\u000e\u0012\u0006\u0010\u0015\u001a\u00020\u0012\u0012\u0006\u0010\u0019\u001a\u00020\u0016¢\u0006\u0004\b\u001f\u0010 J,\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004H\u0016R\u0014\u0010\r\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\fR\u0014\u0010\u0011\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0015\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0019\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R.\u0010\u001e\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0007 \u001b*\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00040\u00040\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006!"}, m28432d2 = {"LlD4;", "LfD4;", "Lco/bird/android/model/Issue;", "issue", "", "Lco/bird/android/model/RepairType;", "issueRepairs", "Lco/bird/android/model/RepairTypeLock;", "preSelectedRepairs", "", C17296a.f69688o, "Lcom/uber/autodispose/ScopeProvider;", "Lcom/uber/autodispose/ScopeProvider;", "scopeProvider", "LnD4;", "b", "LnD4;", "ui", "Le13;", "c", "Le13;", "navigator", "LbD4;", DateTokenConverter.CONVERTER_KEY, "LbD4;", "converter", "Lio/reactivex/subjects/a;", "kotlin.jvm.PlatformType", "e", "Lio/reactivex/subjects/a;", "selectedRepairsSubject", "<init>", "(Lcom/uber/autodispose/ScopeProvider;LnD4;Le13;LbD4;)V", "repair_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nRepairSelectionPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RepairSelectionPresenter.kt\nco/bird/android/feature/repair/v1/selection/RepairSelectionPresenterImpl\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 4 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n+ 5 Observables.kt\nio/reactivex/rxkotlin/ObservablesKt\n*L\n1#1,77:1\n766#2:78\n857#2,2:79\n1549#2:83\n1620#2,3:84\n37#3,2:81\n180#4:87\n180#4:88\n180#4:90\n233#5:89\n*S KotlinDebug\n*F\n+ 1 RepairSelectionPresenter.kt\nco/bird/android/feature/repair/v1/selection/RepairSelectionPresenterImpl\n*L\n32#1:78\n32#1:79,2\n33#1:83\n33#1:84,3\n33#1:81,2\n44#1:87\n50#1:88\n63#1:90\n59#1:89\n*E\n"})
/* renamed from: lD4  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C44368lD4 implements InterfaceC40810fD4 {

    /* renamed from: a */
    public final ScopeProvider f95725a;

    /* renamed from: b */
    public final InterfaceC45554nD4 f95726b;

    /* renamed from: c */
    public final InterfaceC40099e13 f95727c;

    /* renamed from: d */
    public final InterfaceC38421bD4 f95728d;

    /* renamed from: e */
    public final C24552a<List<RepairTypeLock>> f95729e;

    @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\b\u0010\b\u001a\u00028\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0000\"\b\b\u0002\u0010\u0003*\u00020\u00002\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00028\u0001H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"", "T", "U", "R", "t", "u", "apply", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nObservables.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Observables.kt\nio/reactivex/rxkotlin/ObservablesKt$withLatestFrom$1\n+ 2 RepairSelectionPresenter.kt\nco/bird/android/feature/repair/v1/selection/RepairSelectionPresenterImpl\n*L\n1#1,304:1\n59#2,2:305\n*E\n"})
    /* renamed from: lD4$a */
    /* loaded from: classes3.dex */
    public static final class C25654a<T1, T2, R> implements InterfaceC23480c<Pair<? extends RepairType, ? extends Boolean>, List<? extends RepairTypeLock>, R> {
        @Override // io.reactivex.functions.InterfaceC23480c
        public final R apply(Pair<? extends RepairType, ? extends Boolean> pair, List<? extends RepairTypeLock> list) {
            Pair<? extends RepairType, ? extends Boolean> pair2 = pair;
            return (R) new Triple(pair2.component1(), Boolean.valueOf(pair2.component2().booleanValue()), list);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, m28432d2 = {"<anonymous>", "", "selectedRepairs", "", "Lco/bird/android/model/RepairTypeLock;", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    @SourceDebugExtension({"SMAP\nRepairSelectionPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RepairSelectionPresenter.kt\nco/bird/android/feature/repair/v1/selection/RepairSelectionPresenterImpl$onCreate$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,77:1\n1774#2,4:78\n*S KotlinDebug\n*F\n+ 1 RepairSelectionPresenter.kt\nco/bird/android/feature/repair/v1/selection/RepairSelectionPresenterImpl$onCreate$1\n*L\n38#1:78,4\n*E\n"})
    /* renamed from: lD4$b */
    /* loaded from: classes3.dex */
    public static final class C25655b extends Lambda implements Function1<List<? extends RepairTypeLock>, Unit> {

        /* renamed from: h */
        public final /* synthetic */ List<String> f95731h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C25655b(List<String> list) {
            super(1);
            this.f95731h = list;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(List<? extends RepairTypeLock> list) {
            invoke2((List<RepairTypeLock>) list);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(List<RepairTypeLock> selectedRepairs) {
            InterfaceC45554nD4 interfaceC45554nD4 = C44368lD4.this.f95726b;
            Intrinsics.checkNotNullExpressionValue(selectedRepairs, "selectedRepairs");
            List<RepairTypeLock> list = selectedRepairs;
            List<String> list2 = this.f95731h;
            int i = 0;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                for (RepairTypeLock repairTypeLock : list) {
                    if (list2.contains(repairTypeLock.getRepairType().getIssueTypeId()) && (i = i + 1) < 0) {
                        CollectionsKt__CollectionsKt.throwCountOverflow();
                    }
                }
            }
            interfaceC45554nD4.mo21617mj(i);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001aB\u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00000\u0000 \u0005* \u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00000\u0000\u0018\u00010\u00030\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"", "Lco/bird/android/model/RepairTypeLock;", "selectedRepairs", "Lio/reactivex/K;", "LH6;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Ljava/util/List;)Lio/reactivex/K;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: lD4$c */
    /* loaded from: classes3.dex */
    public static final class C25656c extends Lambda implements Function1<List<? extends RepairTypeLock>, InterfaceC23447K<? extends List<? extends C3023H6>>> {

        /* renamed from: h */
        public final /* synthetic */ List<RepairType> f95733h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C25656c(List<RepairType> list) {
            super(1);
            this.f95733h = list;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC23447K<? extends List<C3023H6>> invoke(List<RepairTypeLock> selectedRepairs) {
            Intrinsics.checkNotNullParameter(selectedRepairs, "selectedRepairs");
            return C44368lD4.this.f95728d.mo44524a(this.f95733h, selectedRepairs);
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: lD4$d */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C25657d extends FunctionReferenceImpl implements Function1<List<? extends C3023H6>, Unit> {
        public C25657d(Object obj) {
            super(1, obj, InterfaceC45554nD4.class, "addRepairTypes", "addRepairTypes(Ljava/util/List;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(List<? extends C3023H6> list) {
            invoke2((List<C3023H6>) list);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(List<C3023H6> p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((InterfaceC45554nD4) this.receiver).mo21620Uk(p0);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012N\u0010\u0002\u001aJ\u0012\u0004\u0012\u00020\u0001\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0005 \u0006*\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00040\u0004 \u0006*$\u0012\u0004\u0012\u00020\u0001\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0005 \u0006*\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00040\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0007"}, m28432d2 = {"<anonymous>", "", "<name for destructuring parameter 0>", "Lkotlin/Pair;", "", "Lco/bird/android/model/RepairTypeLock;", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: lD4$e */
    /* loaded from: classes3.dex */
    public static final class C25658e extends Lambda implements Function1<Pair<? extends Unit, ? extends List<? extends RepairTypeLock>>, Unit> {
        public C25658e() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Pair<? extends Unit, ? extends List<? extends RepairTypeLock>> pair) {
            invoke2((Pair<Unit, ? extends List<RepairTypeLock>>) pair);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Pair<Unit, ? extends List<RepairTypeLock>> pair) {
            Intent intent = new Intent();
            intent.putParcelableArrayListExtra("repairs", new ArrayList<>(pair.component2()));
            C44368lD4.this.f95727c.mo37029e4(-1, intent);
        }
    }

    @Metadata(m28433d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\b\u001a\u00020\u00072Z\u0010\u0006\u001aV\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003 \u0005**\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\b\u0010\t"}, m28432d2 = {"Lkotlin/Triple;", "Lco/bird/android/model/RepairType;", "", "", "Lco/bird/android/model/RepairTypeLock;", "kotlin.jvm.PlatformType", "<name for destructuring parameter 0>", "", C17296a.f69688o, "(Lkotlin/Triple;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nRepairSelectionPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RepairSelectionPresenter.kt\nco/bird/android/feature/repair/v1/selection/RepairSelectionPresenterImpl$onCreate$6\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,77:1\n2624#2,3:78\n1747#2,3:83\n766#2:86\n857#2,2:87\n37#3,2:81\n*S KotlinDebug\n*F\n+ 1 RepairSelectionPresenter.kt\nco/bird/android/feature/repair/v1/selection/RepairSelectionPresenterImpl$onCreate$6\n*L\n66#1:78,3\n70#1:83,3\n71#1:86\n71#1:87,2\n67#1:81,2\n*E\n"})
    /* renamed from: lD4$f */
    /* loaded from: classes3.dex */
    public static final class C25659f extends Lambda implements Function1<Triple<? extends RepairType, ? extends Boolean, ? extends List<? extends RepairTypeLock>>, Unit> {
        public C25659f() {
            super(1);
        }

        /* renamed from: a */
        public final void m27657a(Triple<RepairType, Boolean, ? extends List<RepairTypeLock>> triple) {
            boolean z;
            List listOf;
            RepairType component1 = triple.component1();
            boolean booleanValue = triple.component2().booleanValue();
            List<RepairTypeLock> selectedRepairs = triple.component3();
            boolean z2 = false;
            if (booleanValue) {
                Intrinsics.checkNotNullExpressionValue(selectedRepairs, "selectedRepairs");
                List<RepairTypeLock> list = selectedRepairs;
                if (!(list instanceof Collection) || !list.isEmpty()) {
                    for (RepairTypeLock repairTypeLock : list) {
                        if (Intrinsics.areEqual(repairTypeLock.getRepairType(), component1)) {
                            z = false;
                            break;
                        }
                    }
                }
                z = true;
                if (z) {
                    C24552a c24552a = C44368lD4.this.f95729e;
                    SpreadBuilder spreadBuilder = new SpreadBuilder(2);
                    spreadBuilder.addSpread(selectedRepairs.toArray(new RepairTypeLock[0]));
                    spreadBuilder.add(new RepairTypeLock(component1, false));
                    listOf = CollectionsKt__CollectionsKt.listOf(spreadBuilder.toArray(new RepairTypeLock[spreadBuilder.size()]));
                    c24552a.onNext(listOf);
                    return;
                }
            }
            if (!booleanValue) {
                Intrinsics.checkNotNullExpressionValue(selectedRepairs, "selectedRepairs");
                List<RepairTypeLock> list2 = selectedRepairs;
                if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                    Iterator<T> it = list2.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (Intrinsics.areEqual(((RepairTypeLock) it.next()).getRepairType(), component1)) {
                                z2 = true;
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                }
                if (z2) {
                    C24552a c24552a2 = C44368lD4.this.f95729e;
                    ArrayList arrayList = new ArrayList();
                    for (Object obj : list2) {
                        if (!Intrinsics.areEqual(((RepairTypeLock) obj).getRepairType(), component1)) {
                            arrayList.add(obj);
                        }
                    }
                    c24552a2.onNext(arrayList);
                }
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Triple<? extends RepairType, ? extends Boolean, ? extends List<? extends RepairTypeLock>> triple) {
            m27657a(triple);
            return Unit.INSTANCE;
        }
    }

    public C44368lD4(ScopeProvider scopeProvider, InterfaceC45554nD4 ui, InterfaceC40099e13 navigator, InterfaceC38421bD4 converter) {
        Intrinsics.checkNotNullParameter(scopeProvider, "scopeProvider");
        Intrinsics.checkNotNullParameter(ui, "ui");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(converter, "converter");
        this.f95725a = scopeProvider;
        this.f95726b = ui;
        this.f95727c = navigator;
        this.f95728d = converter;
        C24552a<List<RepairTypeLock>> m31922e = C24552a.m31922e();
        Intrinsics.checkNotNullExpressionValue(m31922e, "create<List<RepairTypeLock>>()");
        this.f95729e = m31922e;
    }

    /* renamed from: g */
    public static final void m27663g(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: h */
    public static final InterfaceC23447K m27662h(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: i */
    public static final void m27661i(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: j */
    public static final void m27660j(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: k */
    public static final void m27659k(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    @Override // p000.InterfaceC40810fD4
    /* renamed from: a */
    public void mo27669a(Issue issue, List<RepairType> issueRepairs, List<RepairTypeLock> preSelectedRepairs) {
        List listOf;
        int collectionSizeOrDefault;
        Intrinsics.checkNotNullParameter(issue, "issue");
        Intrinsics.checkNotNullParameter(issueRepairs, "issueRepairs");
        Intrinsics.checkNotNullParameter(preSelectedRepairs, "preSelectedRepairs");
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = issue.getSubtypes().iterator();
        while (true) {
            boolean z = false;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (((Issue) next).getStatus() == null) {
                z = true;
            }
            if (z) {
                arrayList.add(next);
            }
        }
        SpreadBuilder spreadBuilder = new SpreadBuilder(2);
        spreadBuilder.add(issue);
        spreadBuilder.addSpread(arrayList.toArray(new Issue[0]));
        listOf = CollectionsKt__CollectionsKt.listOf(spreadBuilder.toArray(new Issue[spreadBuilder.size()]));
        List<Issue> list = listOf;
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10);
        ArrayList arrayList2 = new ArrayList(collectionSizeOrDefault);
        for (Issue issue2 : list) {
            arrayList2.add(issue2.getIssueTypeId());
        }
        this.f95729e.onNext(preSelectedRepairs);
        C24552a<List<RepairTypeLock>> c24552a = this.f95729e;
        final C25655b c25655b = new C25655b(arrayList2);
        Observable<List<RepairTypeLock>> doOnNext = c24552a.doOnNext(new InterfaceC23484g() { // from class: gD4
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C44368lD4.m27663g(Function1.this, obj);
            }
        });
        final C25656c c25656c = new C25656c(issueRepairs);
        Observable observeOn = doOnNext.flatMapSingle(new InterfaceC23492o() { // from class: hD4
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m27662h;
                m27662h = C44368lD4.m27662h(Function1.this, obj);
                return m27662h;
            }
        }).observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn, "override fun onCreate(is…  }\n        }\n      }\n  }");
        Object m33094as = observeOn.m33094as(AutoDispose.m45239a(this.f95725a));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C25657d c25657d = new C25657d(this.f95726b);
        ((ObservableSubscribeProxy) m33094as).subscribe(new InterfaceC23484g() { // from class: iD4
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C44368lD4.m27661i(Function1.this, obj);
            }
        });
        Observable observeOn2 = C24527f.m31950a(this.f95726b.mo21619ae(), this.f95729e).observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn2, "ui.addButtonClicks()\n   …dSchedulers.mainThread())");
        Object m33094as2 = observeOn2.m33094as(AutoDispose.m45239a(this.f95725a));
        Intrinsics.checkExpressionValueIsNotNull(m33094as2, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C25658e c25658e = new C25658e();
        ((ObservableSubscribeProxy) m33094as2).subscribe(new InterfaceC23484g() { // from class: jD4
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C44368lD4.m27660j(Function1.this, obj);
            }
        });
        Observable<R> withLatestFrom = this.f95726b.mo21618j6().withLatestFrom(this.f95729e, new C25654a());
        Intrinsics.checkExpressionValueIsNotNull(withLatestFrom, "withLatestFrom(other, Bi… combiner.invoke(t, u) })");
        Observable observeOn3 = withLatestFrom.observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn3, "ui.selectedRepairChanges…dSchedulers.mainThread())");
        Object m33094as3 = observeOn3.m33094as(AutoDispose.m45239a(this.f95725a));
        Intrinsics.checkExpressionValueIsNotNull(m33094as3, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C25659f c25659f = new C25659f();
        ((ObservableSubscribeProxy) m33094as3).subscribe(new InterfaceC23484g() { // from class: kD4
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C44368lD4.m27659k(Function1.this, obj);
            }
        });
    }
}
