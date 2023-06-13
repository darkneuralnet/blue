package p000;

import android.annotation.SuppressLint;
import android.content.Intent;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.IssueType;
import co.bird.android.model.RepairType;
import co.bird.android.model.RepairTypeLock;
import com.facebook.share.internal.C17296a;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.ObservableSubscribeProxy;
import com.uber.autodispose.ScopeProvider;
import io.reactivex.InterfaceC23434B;
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
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Triple;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.SpreadBuilder;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;
@Metadata(m28433d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B)\b\u0007\u0012\u0006\u0010\r\u001a\u00020\u000b\u0012\u0006\u0010\u0011\u001a\u00020\u000e\u0012\u0006\u0010\u0015\u001a\u00020\u0012\u0012\u0006\u0010\u0019\u001a\u00020\u0016¢\u0006\u0004\b\u001f\u0010 J2\u0010\n\u001a\u00020\t2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00022\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0002H\u0017R\u0014\u0010\r\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\fR\u0014\u0010\u0011\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0015\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0019\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R.\u0010\u001e\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0007 \u001b*\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00020\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006!"}, m28432d2 = {"LQC4;", "LEC4;", "", "Lco/bird/android/model/IssueType;", "issueTypes", "Lco/bird/android/model/RepairType;", "repairTypes", "Lco/bird/android/model/RepairTypeLock;", "selectedRepairs", "", C17296a.f69688o, "Lcom/uber/autodispose/ScopeProvider;", "Lcom/uber/autodispose/ScopeProvider;", "scopeProvider", "LSC4;", "b", "LSC4;", "ui", "Le13;", "c", "Le13;", "navigator", "LzC4;", DateTokenConverter.CONVERTER_KEY, "LzC4;", "converter", "Lio/reactivex/subjects/a;", "kotlin.jvm.PlatformType", "e", "Lio/reactivex/subjects/a;", "selectedRepairsSubject", "<init>", "(Lcom/uber/autodispose/ScopeProvider;LSC4;Le13;LzC4;)V", "repair_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nRepairSearchPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RepairSearchPresenter.kt\nco/bird/android/feature/repair/v1/search/RepairSearchPresenterImpl\n+ 2 Observables.kt\nio/reactivex/rxkotlin/ObservablesKt\n+ 3 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 5 Observables.kt\nco/bird/android/library/rx/Observables\n*L\n1#1,127:1\n233#2:128\n233#2:130\n180#3:129\n180#3:131\n180#3:132\n180#3:142\n1549#4:133\n1620#4,3:134\n766#4:137\n857#4,2:138\n52#5,2:140\n*S KotlinDebug\n*F\n+ 1 RepairSearchPresenter.kt\nco/bird/android/feature/repair/v1/search/RepairSearchPresenterImpl\n*L\n38#1:128\n56#1:130\n43#1:129\n60#1:131\n84#1:132\n123#1:142\n97#1:133\n97#1:134,3\n98#1:137\n98#1:138,2\n100#1:140,2\n*E\n"})
/* renamed from: QC4 */
/* loaded from: classes3.dex */
public final class QC4 implements EC4 {

    /* renamed from: a */
    public final ScopeProvider f30011a;

    /* renamed from: b */
    public final SC4 f30012b;

    /* renamed from: c */
    public final InterfaceC40099e13 f30013c;

    /* renamed from: d */
    public final InterfaceC52659zC4 f30014d;

    /* renamed from: e */
    public final C24552a<List<RepairTypeLock>> f30015e;

    @Metadata(m28433d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\b\u001a\u00020\u00072Z\u0010\u0006\u001aV\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003 \u0005**\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\b\u0010\t"}, m28432d2 = {"Lkotlin/Triple;", "Lco/bird/android/model/RepairType;", "", "", "Lco/bird/android/model/RepairTypeLock;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lkotlin/Triple;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: QC4$a */
    /* loaded from: classes3.dex */
    public static final class C6713a extends Lambda implements Function1<Triple<? extends RepairType, ? extends Boolean, ? extends List<? extends RepairTypeLock>>, Unit> {
        public C6713a() {
            super(1);
        }

        /* renamed from: a */
        public final void m88757a(Triple<RepairType, Boolean, ? extends List<RepairTypeLock>> triple) {
            QC4.this.f30012b.hideKeyboard();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Triple<? extends RepairType, ? extends Boolean, ? extends List<? extends RepairTypeLock>> triple) {
            m88757a(triple);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\b\u001a\u00020\u00072Z\u0010\u0006\u001aV\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003 \u0005**\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\b\u0010\t"}, m28432d2 = {"Lkotlin/Triple;", "Lco/bird/android/model/RepairType;", "", "", "Lco/bird/android/model/RepairTypeLock;", "kotlin.jvm.PlatformType", "<name for destructuring parameter 0>", "", C17296a.f69688o, "(Lkotlin/Triple;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nRepairSearchPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RepairSearchPresenter.kt\nco/bird/android/feature/repair/v1/search/RepairSearchPresenterImpl$3\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,127:1\n2624#2,3:128\n1747#2,3:133\n766#2:136\n857#2,2:137\n37#3,2:131\n*S KotlinDebug\n*F\n+ 1 RepairSearchPresenter.kt\nco/bird/android/feature/repair/v1/search/RepairSearchPresenterImpl$3\n*L\n46#1:128,3\n49#1:133,3\n50#1:136\n50#1:137,2\n47#1:131,2\n*E\n"})
    /* renamed from: QC4$b */
    /* loaded from: classes3.dex */
    public static final class C6714b extends Lambda implements Function1<Triple<? extends RepairType, ? extends Boolean, ? extends List<? extends RepairTypeLock>>, Unit> {
        public C6714b() {
            super(1);
        }

        /* renamed from: a */
        public final void m88756a(Triple<RepairType, Boolean, ? extends List<RepairTypeLock>> triple) {
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
                        if (Intrinsics.areEqual(repairTypeLock.getRepairType().getId(), component1.getId())) {
                            z = false;
                            break;
                        }
                    }
                }
                z = true;
                if (z) {
                    C24552a c24552a = QC4.this.f30015e;
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
                            if (Intrinsics.areEqual(((RepairTypeLock) it.next()).getRepairType().getId(), component1.getId())) {
                                z2 = true;
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                }
                if (z2) {
                    C24552a c24552a2 = QC4.this.f30015e;
                    ArrayList arrayList = new ArrayList();
                    for (Object obj : list2) {
                        if (!Intrinsics.areEqual(((RepairTypeLock) obj).getRepairType().getId(), component1.getId())) {
                            arrayList.add(obj);
                        }
                    }
                    c24552a2.onNext(arrayList);
                }
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Triple<? extends RepairType, ? extends Boolean, ? extends List<? extends RepairTypeLock>> triple) {
            m88756a(triple);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\b\u001a\u00020\u00072Z\u0010\u0006\u001aV\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003 \u0005**\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\b\u0010\t"}, m28432d2 = {"Lkotlin/Triple;", "Lco/bird/android/model/RepairType;", "", "", "Lco/bird/android/model/RepairTypeLock;", "kotlin.jvm.PlatformType", "<name for destructuring parameter 0>", "", C17296a.f69688o, "(Lkotlin/Triple;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nRepairSearchPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RepairSearchPresenter.kt\nco/bird/android/feature/repair/v1/search/RepairSearchPresenterImpl$5\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,127:1\n223#2,2:128\n819#2:130\n847#2,2:131\n37#3,2:133\n*S KotlinDebug\n*F\n+ 1 RepairSearchPresenter.kt\nco/bird/android/feature/repair/v1/search/RepairSearchPresenterImpl$5\n*L\n62#1:128,2\n64#1:130\n64#1:131,2\n64#1:133,2\n*E\n"})
    /* renamed from: QC4$c */
    /* loaded from: classes3.dex */
    public static final class C6715c extends Lambda implements Function1<Triple<? extends RepairType, ? extends String, ? extends List<? extends RepairTypeLock>>, Unit> {
        public C6715c() {
            super(1);
        }

        /* renamed from: a */
        public final void m88755a(Triple<RepairType, String, ? extends List<RepairTypeLock>> triple) {
            RepairType copy;
            List listOf;
            RepairType component1 = triple.component1();
            String component2 = triple.component2();
            List<RepairTypeLock> selectedRepairs = triple.component3();
            Intrinsics.checkNotNullExpressionValue(selectedRepairs, "selectedRepairs");
            List<RepairTypeLock> list = selectedRepairs;
            for (RepairTypeLock repairTypeLock : list) {
                if (Intrinsics.areEqual(repairTypeLock.component1().getId(), component1.getId())) {
                    boolean locked = repairTypeLock.getLocked();
                    copy = component1.copy((r22 & 1) != 0 ? component1.f66624id : null, (r22 & 2) != 0 ? component1.issueTypeId : null, (r22 & 4) != 0 ? component1.display : null, (r22 & 8) != 0 ? component1.description : null, (r22 & 16) != 0 ? component1.requireNotes : false, (r22 & 32) != 0 ? component1.repairScopes : null, (r22 & 64) != 0 ? component1.assetId : null, (r22 & 128) != 0 ? component1.partKind : null, (r22 & 256) != 0 ? component1.idToolDisplay : null, (r22 & 512) != 0 ? component1.notes : component2);
                    RepairTypeLock repairTypeLock2 = new RepairTypeLock(copy, locked);
                    C24552a c24552a = QC4.this.f30015e;
                    SpreadBuilder spreadBuilder = new SpreadBuilder(2);
                    ArrayList arrayList = new ArrayList();
                    for (Object obj : list) {
                        if (!Intrinsics.areEqual(((RepairTypeLock) obj).component1().getId(), component1.getId())) {
                            arrayList.add(obj);
                        }
                    }
                    spreadBuilder.addSpread(arrayList.toArray(new RepairTypeLock[0]));
                    spreadBuilder.add(repairTypeLock2);
                    listOf = CollectionsKt__CollectionsKt.listOf(spreadBuilder.toArray(new RepairTypeLock[spreadBuilder.size()]));
                    c24552a.onNext(listOf);
                    return;
                }
            }
            throw new NoSuchElementException("Collection contains no element matching the predicate.");
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Triple<? extends RepairType, ? extends String, ? extends List<? extends RepairTypeLock>> triple) {
            m88755a(triple);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u0016\u0012\u0004\u0012\u00020\u0002 \u0003*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u00012&\u0010\u0004\u001a\"\u0012\u0004\u0012\u00020\u0006\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0002 \u0003*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u00010\u0005H\n¢\u0006\u0002\b\u0007"}, m28432d2 = {"<anonymous>", "", "Lco/bird/android/model/RepairTypeLock;", "kotlin.jvm.PlatformType", "<name for destructuring parameter 0>", "Lkotlin/Pair;", "", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    @SourceDebugExtension({"SMAP\nRepairSearchPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RepairSearchPresenter.kt\nco/bird/android/feature/repair/v1/search/RepairSearchPresenterImpl$6\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,127:1\n1747#2,3:128\n*S KotlinDebug\n*F\n+ 1 RepairSearchPresenter.kt\nco/bird/android/feature/repair/v1/search/RepairSearchPresenterImpl$6\n*L\n70#1:128,3\n*E\n"})
    /* renamed from: QC4$d */
    /* loaded from: classes3.dex */
    public static final class C6716d extends Lambda implements Function1<Pair<? extends Unit, ? extends List<? extends RepairTypeLock>>, List<? extends RepairTypeLock>> {

        /* renamed from: g */
        public static final C6716d f30019g = new C6716d();

        public C6716d() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ List<? extends RepairTypeLock> invoke(Pair<? extends Unit, ? extends List<? extends RepairTypeLock>> pair) {
            return invoke2((Pair<Unit, ? extends List<RepairTypeLock>>) pair);
        }

        /* JADX WARN: Removed duplicated region for block: B:20:0x004f  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x0054 A[SYNTHETIC] */
        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final List<RepairTypeLock> invoke2(Pair<Unit, ? extends List<RepairTypeLock>> pair) {
            boolean z;
            boolean z2;
            boolean isBlank;
            Intrinsics.checkNotNullParameter(pair, "<name for destructuring parameter 0>");
            List<RepairTypeLock> selectedRepairs = pair.component2();
            Intrinsics.checkNotNullExpressionValue(selectedRepairs, "selectedRepairs");
            List<RepairTypeLock> list = selectedRepairs;
            boolean z3 = false;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                Iterator<T> it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    RepairType component1 = ((RepairTypeLock) it.next()).component1();
                    if (component1.getRequireNotes()) {
                        String notes = component1.getNotes();
                        if (notes != null) {
                            isBlank = StringsKt__StringsJVMKt.isBlank(notes);
                            if (!isBlank) {
                                z2 = false;
                                if (z2) {
                                    z = true;
                                    continue;
                                    if (z) {
                                        z3 = true;
                                        break;
                                    }
                                }
                            }
                        }
                        z2 = true;
                        if (z2) {
                        }
                    }
                    z = false;
                    continue;
                    if (z) {
                    }
                }
            }
            if (z3) {
                throw new IllegalArgumentException();
            }
            return selectedRepairs;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "e", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: QC4$e */
    /* loaded from: classes3.dex */
    public static final class C6717e extends Lambda implements Function1<Throwable, Unit> {
        public C6717e() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            if (th instanceof IllegalArgumentException) {
                QC4.this.f30012b.mo78718Zi();
                QC4.this.f30012b.error(C45871nl4.work_order_repairs_search_missing_note_error);
            }
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, m28432d2 = {"<anonymous>", "", "selectedRepairs", "", "Lco/bird/android/model/RepairTypeLock;", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: QC4$f */
    /* loaded from: classes3.dex */
    public static final class C6718f extends Lambda implements Function1<List<? extends RepairTypeLock>, Unit> {
        public C6718f() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(List<? extends RepairTypeLock> list) {
            invoke2((List<RepairTypeLock>) list);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(List<RepairTypeLock> selectedRepairs) {
            Intent intent = new Intent();
            Intrinsics.checkNotNullExpressionValue(selectedRepairs, "selectedRepairs");
            intent.putParcelableArrayListExtra("repairs", C44691lm0.m26849a(selectedRepairs));
            QC4.this.f30013c.mo37029e4(-1, intent);
        }
    }

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u00002\u0006\u0010\u0003\u001a\u00028\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"T1", "T2", "t1", "t2", "Lkotlin/Pair;", C17296a.f69688o, "(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nObservables.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Observables.kt\nco/bird/android/library/rx/Observables$combineLatest$1\n*L\n1#1,134:1\n*E\n"})
    /* renamed from: QC4$g */
    /* loaded from: classes3.dex */
    public static final class C6719g<T1, T2, R> implements InterfaceC23480c {

        /* renamed from: a */
        public static final C6719g<T1, T2, R> f30022a = new C6719g<>();

        @Override // io.reactivex.functions.InterfaceC23480c
        /* renamed from: a */
        public final Pair<T1, T2> apply(T1 t1, T2 t2) {
            return TuplesKt.m28425to(t1, t2);
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0004"}, m28432d2 = {"<anonymous>", "", "kotlin.jvm.PlatformType", "searchTerm", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: QC4$h */
    /* loaded from: classes3.dex */
    public static final class C6720h extends Lambda implements Function1<String, String> {

        /* renamed from: g */
        public static final C6720h f30023g = new C6720h();

        public C6720h() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final String invoke(String searchTerm) {
            CharSequence trim;
            Intrinsics.checkNotNullParameter(searchTerm, "searchTerm");
            trim = StringsKt__StringsKt.trim((CharSequence) searchTerm);
            return trim.toString();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012^\u0010\u0002\u001aZ\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0007 \u0005*\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00060\u0006 \u0005*,\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0007 \u0005*\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00060\u0006\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\b"}, m28432d2 = {"<anonymous>", "", "<name for destructuring parameter 0>", "Lkotlin/Pair;", "", "kotlin.jvm.PlatformType", "", "Lco/bird/android/model/RepairTypeLock;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: QC4$i */
    /* loaded from: classes3.dex */
    public static final class C6721i extends Lambda implements Function1<Pair<? extends String, ? extends List<? extends RepairTypeLock>>, Unit> {
        public C6721i() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Pair<? extends String, ? extends List<? extends RepairTypeLock>> pair) {
            invoke2((Pair<String, ? extends List<RepairTypeLock>>) pair);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Pair<String, ? extends List<RepairTypeLock>> pair) {
            List<RepairTypeLock> selectedRepairs = pair.component2();
            SC4 sc4 = QC4.this.f30012b;
            Intrinsics.checkNotNullExpressionValue(selectedRepairs, "selectedRepairs");
            sc4.mo78727A8(selectedRepairs.size());
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001aV\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00020\u0002 \u0005**\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012.\u0010\u0006\u001a*\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00070\u0007\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00020\u00020\u0001H\n¢\u0006\u0002\b\b"}, m28432d2 = {"<anonymous>", "Lkotlin/Pair;", "", "Lco/bird/android/model/RepairType;", "Lco/bird/android/model/RepairTypeLock;", "kotlin.jvm.PlatformType", "<name for destructuring parameter 0>", "", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    @SourceDebugExtension({"SMAP\nRepairSearchPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RepairSearchPresenter.kt\nco/bird/android/feature/repair/v1/search/RepairSearchPresenterImpl$onCreate$3\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,127:1\n766#2:128\n857#2:129\n223#2,2:130\n858#2:132\n*S KotlinDebug\n*F\n+ 1 RepairSearchPresenter.kt\nco/bird/android/feature/repair/v1/search/RepairSearchPresenterImpl$onCreate$3\n*L\n111#1:128\n111#1:129\n112#1:130,2\n111#1:132\n*E\n"})
    /* renamed from: QC4$j */
    /* loaded from: classes3.dex */
    public static final class C6722j extends Lambda implements Function1<Pair<? extends String, ? extends List<? extends RepairTypeLock>>, Pair<? extends List<? extends RepairType>, ? extends List<? extends RepairTypeLock>>> {

        /* renamed from: g */
        public final /* synthetic */ List<RepairType> f30025g;

        /* renamed from: h */
        public final /* synthetic */ List<IssueType> f30026h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C6722j(List<RepairType> list, List<IssueType> list2) {
            super(1);
            this.f30025g = list;
            this.f30026h = list2;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Pair<? extends List<? extends RepairType>, ? extends List<? extends RepairTypeLock>> invoke(Pair<? extends String, ? extends List<? extends RepairTypeLock>> pair) {
            return invoke2((Pair<String, ? extends List<RepairTypeLock>>) pair);
        }

        /* JADX WARN: Code restructure failed: missing block: B:26:0x007f, code lost:
            if (r5 == false) goto L28;
         */
        /* JADX WARN: Removed duplicated region for block: B:20:0x0070  */
        /* JADX WARN: Removed duplicated region for block: B:35:0x0084 A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:39:0x002f A[SYNTHETIC] */
        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Pair<List<RepairType>, List<RepairTypeLock>> invoke2(Pair<String, ? extends List<RepairTypeLock>> pair) {
            boolean isBlank;
            List<RepairType> list;
            boolean z;
            boolean contains;
            boolean contains2;
            Intrinsics.checkNotNullParameter(pair, "<name for destructuring parameter 0>");
            String searchTerm = pair.component1();
            List<RepairTypeLock> component2 = pair.component2();
            Intrinsics.checkNotNullExpressionValue(searchTerm, "searchTerm");
            isBlank = StringsKt__StringsJVMKt.isBlank(searchTerm);
            if (isBlank) {
                list = this.f30025g;
            } else {
                List<IssueType> list2 = this.f30026h;
                ArrayList arrayList = new ArrayList();
                for (Object obj : this.f30025g) {
                    RepairType repairType = (RepairType) obj;
                    for (IssueType issueType : list2) {
                        if (Intrinsics.areEqual(issueType.getId(), repairType.getIssueTypeId())) {
                            String display = repairType.getDisplay();
                            boolean z2 = false;
                            if (display != null) {
                                contains2 = StringsKt__StringsKt.contains((CharSequence) display, (CharSequence) searchTerm, true);
                                if (contains2) {
                                    z = true;
                                    if (!z) {
                                        String display2 = issueType.getDisplay();
                                        if (display2 != null) {
                                            contains = StringsKt__StringsKt.contains((CharSequence) display2, (CharSequence) searchTerm, true);
                                            boolean z3 = contains;
                                        }
                                    }
                                    z2 = true;
                                    if (!z2) {
                                        arrayList.add(obj);
                                    }
                                }
                            }
                            z = false;
                            if (!z) {
                            }
                            z2 = true;
                            if (!z2) {
                            }
                        }
                    }
                    throw new NoSuchElementException("Collection contains no element matching the predicate.");
                }
                list = arrayList;
            }
            return TuplesKt.m28425to(list, component2);
        }
    }

    @Metadata(m28433d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\b\u001aB\u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0007 \u0004*\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00010\u0001 \u0004* \u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0007 \u0004*\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00010\u0001\u0018\u00010\u00060\u00062,\u0010\u0005\u001a(\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0001\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0003 \u0004*\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00010\u00010\u0000H\n¢\u0006\u0004\b\b\u0010\t"}, m28432d2 = {"Lkotlin/Pair;", "", "Lco/bird/android/model/RepairType;", "Lco/bird/android/model/RepairTypeLock;", "kotlin.jvm.PlatformType", "<name for destructuring parameter 0>", "Lio/reactivex/K;", "LH6;", C17296a.f69688o, "(Lkotlin/Pair;)Lio/reactivex/K;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: QC4$k */
    /* loaded from: classes3.dex */
    public static final class C6723k extends Lambda implements Function1<Pair<? extends List<? extends RepairType>, ? extends List<? extends RepairTypeLock>>, InterfaceC23447K<? extends List<? extends C3023H6>>> {

        /* renamed from: h */
        public final /* synthetic */ List<IssueType> f30028h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C6723k(List<IssueType> list) {
            super(1);
            this.f30028h = list;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC23447K<? extends List<C3023H6>> invoke(Pair<? extends List<RepairType>, ? extends List<RepairTypeLock>> pair) {
            Intrinsics.checkNotNullParameter(pair, "<name for destructuring parameter 0>");
            List<RepairTypeLock> selectedRepairs = pair.component2();
            InterfaceC52659zC4 interfaceC52659zC4 = QC4.this.f30014d;
            List<IssueType> list = this.f30028h;
            Intrinsics.checkNotNullExpressionValue(selectedRepairs, "selectedRepairs");
            return interfaceC52659zC4.mo1672a(list, pair.component1(), selectedRepairs);
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: QC4$l */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C6724l extends FunctionReferenceImpl implements Function1<List<? extends C3023H6>, Unit> {
        public C6724l(Object obj) {
            super(1, obj, SC4.class, "populateAdapter", "populateAdapter(Ljava/util/List;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(List<? extends C3023H6> list) {
            invoke2((List<C3023H6>) list);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(List<C3023H6> p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((SC4) this.receiver).mo78717b(p0);
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\b\u0010\b\u001a\u00028\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0000\"\b\b\u0002\u0010\u0003*\u00020\u00002\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00028\u0001H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"", "T", "U", "R", "t", "u", "apply", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nObservables.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Observables.kt\nio/reactivex/rxkotlin/ObservablesKt$withLatestFrom$1\n+ 2 RepairSearchPresenter.kt\nco/bird/android/feature/repair/v1/search/RepairSearchPresenterImpl\n*L\n1#1,304:1\n38#2,2:305\n*E\n"})
    /* renamed from: QC4$m */
    /* loaded from: classes3.dex */
    public static final class C6725m<T1, T2, R> implements InterfaceC23480c<Pair<? extends RepairType, ? extends Boolean>, List<? extends RepairTypeLock>, R> {
        @Override // io.reactivex.functions.InterfaceC23480c
        public final R apply(Pair<? extends RepairType, ? extends Boolean> pair, List<? extends RepairTypeLock> list) {
            Pair<? extends RepairType, ? extends Boolean> pair2 = pair;
            return (R) new Triple(pair2.component1(), Boolean.valueOf(pair2.component2().booleanValue()), list);
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\b\u0010\b\u001a\u00028\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0000\"\b\b\u0002\u0010\u0003*\u00020\u00002\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00028\u0001H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"", "T", "U", "R", "t", "u", "apply", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nObservables.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Observables.kt\nio/reactivex/rxkotlin/ObservablesKt$withLatestFrom$1\n+ 2 RepairSearchPresenter.kt\nco/bird/android/feature/repair/v1/search/RepairSearchPresenterImpl\n*L\n1#1,304:1\n56#2,2:305\n*E\n"})
    /* renamed from: QC4$n */
    /* loaded from: classes3.dex */
    public static final class C6726n<T1, T2, R> implements InterfaceC23480c<Pair<? extends RepairType, ? extends String>, List<? extends RepairTypeLock>, R> {
        @Override // io.reactivex.functions.InterfaceC23480c
        public final R apply(Pair<? extends RepairType, ? extends String> pair, List<? extends RepairTypeLock> list) {
            Pair<? extends RepairType, ? extends String> pair2 = pair;
            return (R) new Triple(pair2.component1(), pair2.component2(), list);
        }
    }

    public QC4(ScopeProvider scopeProvider, SC4 ui, InterfaceC40099e13 navigator, InterfaceC52659zC4 converter) {
        Intrinsics.checkNotNullParameter(scopeProvider, "scopeProvider");
        Intrinsics.checkNotNullParameter(ui, "ui");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(converter, "converter");
        this.f30011a = scopeProvider;
        this.f30012b = ui;
        this.f30013c = navigator;
        this.f30014d = converter;
        C24552a<List<RepairTypeLock>> m31922e = C24552a.m31922e();
        Intrinsics.checkNotNullExpressionValue(m31922e, "create<List<RepairTypeLock>>()");
        this.f30015e = m31922e;
        Observable<R> withLatestFrom = ui.mo78721T9().withLatestFrom(m31922e, new C6725m());
        Intrinsics.checkExpressionValueIsNotNull(withLatestFrom, "withLatestFrom(other, Bi… combiner.invoke(t, u) })");
        Observable observeOn = withLatestFrom.observeOn(C23454a.m33087a());
        final C6713a c6713a = new C6713a();
        Observable doOnNext = observeOn.doOnNext(new InterfaceC23484g() { // from class: FC4
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                QC4.m88768m(Function1.this, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(doOnNext, "ui.repairsCheckedChanges…ext { ui.hideKeyboard() }");
        Object m33094as = doOnNext.m33094as(AutoDispose.m45239a(scopeProvider));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C6714b c6714b = new C6714b();
        ((ObservableSubscribeProxy) m33094as).subscribe(new InterfaceC23484g() { // from class: HC4
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                QC4.m88767n(Function1.this, obj);
            }
        });
        Observable<R> withLatestFrom2 = ui.mo78715pl().withLatestFrom(m31922e, new C6726n());
        Intrinsics.checkExpressionValueIsNotNull(withLatestFrom2, "withLatestFrom(other, Bi… combiner.invoke(t, u) })");
        Observable observeOn2 = withLatestFrom2.observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn2, "ui.repairsNotesChanges()…dSchedulers.mainThread())");
        Object m33094as2 = observeOn2.m33094as(AutoDispose.m45239a(scopeProvider));
        Intrinsics.checkExpressionValueIsNotNull(m33094as2, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C6715c c6715c = new C6715c();
        ((ObservableSubscribeProxy) m33094as2).subscribe(new InterfaceC23484g() { // from class: IC4
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                QC4.m88766o(Function1.this, obj);
            }
        });
        Observable m31950a = C24527f.m31950a(ui.mo78716l(), m31922e);
        final C6716d c6716d = C6716d.f30019g;
        Observable observeOn3 = m31950a.map(new InterfaceC23492o() { // from class: JC4
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                List m88765p;
                m88765p = QC4.m88765p(Function1.this, obj);
                return m88765p;
            }
        }).observeOn(C23454a.m33087a());
        final C6717e c6717e = new C6717e();
        Observable retry = observeOn3.doOnError(new InterfaceC23484g() { // from class: KC4
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                QC4.m88764q(Function1.this, obj);
            }
        }).retry();
        Intrinsics.checkNotNullExpressionValue(retry, "ui.addClicks()\n      .wi… }\n      }\n      .retry()");
        Object m33094as3 = retry.m33094as(AutoDispose.m45239a(scopeProvider));
        Intrinsics.checkExpressionValueIsNotNull(m33094as3, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C6718f c6718f = new C6718f();
        ((ObservableSubscribeProxy) m33094as3).subscribe(new InterfaceC23484g() { // from class: LC4
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                QC4.m88763r(Function1.this, obj);
            }
        });
    }

    /* renamed from: m */
    public static final void m88768m(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: n */
    public static final void m88767n(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: o */
    public static final void m88766o(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: p */
    public static final List m88765p(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (List) tmp0.invoke(obj);
    }

    /* renamed from: q */
    public static final void m88764q(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: r */
    public static final void m88763r(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: s */
    public static final String m88762s(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (String) tmp0.invoke(obj);
    }

    /* renamed from: t */
    public static final void m88761t(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: u */
    public static final Pair m88760u(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (Pair) tmp0.invoke(obj);
    }

    /* renamed from: v */
    public static final InterfaceC23447K m88759v(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: w */
    public static final void m88758w(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    @Override // p000.EC4
    @SuppressLint({"DefaultLocale"})
    /* renamed from: a */
    public void mo88780a(List<IssueType> issueTypes, List<RepairType> repairTypes, List<RepairTypeLock> selectedRepairs) {
        int collectionSizeOrDefault;
        Set set;
        List list;
        Intrinsics.checkNotNullParameter(issueTypes, "issueTypes");
        Intrinsics.checkNotNullParameter(repairTypes, "repairTypes");
        Intrinsics.checkNotNullParameter(selectedRepairs, "selectedRepairs");
        this.f30015e.onNext(selectedRepairs);
        List<IssueType> list2 = issueTypes;
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        for (IssueType issueType : list2) {
            arrayList.add(issueType.getId());
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : repairTypes) {
            if (arrayList.contains(((RepairType) obj).getIssueTypeId())) {
                arrayList2.add(obj);
            }
        }
        set = CollectionsKt___CollectionsKt.toSet(arrayList2);
        list = CollectionsKt___CollectionsKt.toList(set);
        C40463ee3 c40463ee3 = C40463ee3.f78649a;
        Observable<String> mo78726I1 = this.f30012b.mo78726I1();
        final C6720h c6720h = C6720h.f30023g;
        InterfaceC23434B map = mo78726I1.map(new InterfaceC23492o() { // from class: MC4
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj2) {
                String m88762s;
                m88762s = QC4.m88762s(Function1.this, obj2);
                return m88762s;
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "ui.searchTermChanged().m…rm -> searchTerm.trim() }");
        Observable combineLatest = Observable.combineLatest(map, this.f30015e, C6719g.f30022a);
        Intrinsics.checkNotNullExpressionValue(combineLatest, "combineLatest(source1, s…, t2: T2 -> (t1 to t2) })");
        final C6721i c6721i = new C6721i();
        Observable doOnNext = combineLatest.doOnNext(new InterfaceC23484g() { // from class: NC4
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj2) {
                QC4.m88761t(Function1.this, obj2);
            }
        });
        final C6722j c6722j = new C6722j(list, issueTypes);
        Observable map2 = doOnNext.map(new InterfaceC23492o() { // from class: OC4
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj2) {
                Pair m88760u;
                m88760u = QC4.m88760u(Function1.this, obj2);
                return m88760u;
            }
        });
        final C6723k c6723k = new C6723k(issueTypes);
        Observable observeOn = map2.flatMapSingle(new InterfaceC23492o() { // from class: PC4
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj2) {
                InterfaceC23447K m88759v;
                m88759v = QC4.m88759v(Function1.this, obj2);
                return m88759v;
            }
        }).observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn, "@SuppressLint(\"DefaultLo…(ui::populateAdapter)\n  }");
        Object m33094as = observeOn.m33094as(AutoDispose.m45239a(this.f30011a));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C6724l c6724l = new C6724l(this.f30012b);
        ((ObservableSubscribeProxy) m33094as).subscribe(new InterfaceC23484g() { // from class: GC4
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj2) {
                QC4.m88758w(Function1.this, obj2);
            }
        });
    }
}
