package p000;

import android.content.Intent;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.IssueStatus;
import co.bird.android.model.IssueType;
import co.bird.android.model.IssueTypeLock;
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
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Triple;
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
import p000.CF6;
@Metadata(m28433d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\r\u001a\u00020\u000b\u0012\u0006\u0010\u0011\u001a\u00020\u000e\u0012\u0006\u0010\u0015\u001a\u00020\u0012\u0012\u0006\u0010\u0019\u001a\u00020\u0016\u0012\u0006\u0010\u001d\u001a\u00020\u001a¢\u0006\u0004\b&\u0010'J,\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004H\u0016R\u0014\u0010\r\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\fR\u0014\u0010\u0011\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0015\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0019\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001d\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR.\u0010\"\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0007 \u001f*\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00040\u00040\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u001c\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00070\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$¨\u0006("}, m28432d2 = {"LCF6;", "LsF6;", "", "category", "", "Lco/bird/android/model/IssueType;", "categoryIssues", "Lco/bird/android/model/IssueTypeLock;", "preselectedIssues", "", C17296a.f69688o, "Le13;", "Le13;", "navigator", "Lcom/uber/autodispose/ScopeProvider;", "b", "Lcom/uber/autodispose/ScopeProvider;", "scopeProvider", "LEF6;", "c", "LEF6;", "ui", "LoF6;", DateTokenConverter.CONVERTER_KEY, "LoF6;", "converter", "LTq4;", "e", "LTq4;", "reactiveConfig", "Lio/reactivex/subjects/a;", "kotlin.jvm.PlatformType", "f", "Lio/reactivex/subjects/a;", "selectedIssuesSubject", "g", "Ljava/util/List;", "preSelectedIssues", "<init>", "(Le13;Lcom/uber/autodispose/ScopeProvider;LEF6;LoF6;LTq4;)V", "workorders_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nWorkOrderIssuesPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WorkOrderIssuesPresenter.kt\nco/bird/android/feature/workorders/issues/WorkOrderIssuesPresenterImpl\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 Observables.kt\nio/reactivex/rxkotlin/ObservablesKt\n*L\n1#1,111:1\n180#2:112\n180#2:117\n180#2:119\n1774#3,4:113\n233#4:118\n*S KotlinDebug\n*F\n+ 1 WorkOrderIssuesPresenter.kt\nco/bird/android/feature/workorders/issues/WorkOrderIssuesPresenterImpl\n*L\n61#1:112\n85#1:117\n93#1:119\n74#1:113,4\n89#1:118\n*E\n"})
/* renamed from: CF6 */
/* loaded from: classes3.dex */
public final class CF6 implements InterfaceC48538sF6 {

    /* renamed from: a */
    public final InterfaceC40099e13 f3705a;

    /* renamed from: b */
    public final ScopeProvider f3706b;

    /* renamed from: c */
    public final EF6 f3707c;

    /* renamed from: d */
    public final InterfaceC46167oF6 f3708d;

    /* renamed from: e */
    public final C36207Tq4 f3709e;

    /* renamed from: f */
    public final C24552a<List<IssueTypeLock>> f3710f;

    /* renamed from: g */
    public List<IssueTypeLock> f3711g;

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0006\u001ab\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0002 \u0003*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0001\u0012\u0004\u0012\u00020\u0004 \u0003*0\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0002 \u0003*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0001\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00000\u000022\u0010\u0005\u001a.\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0002 \u0003*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0001\u0012\u0004\u0012\u00020\u00040\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"Lkotlin/Triple;", "", "Lco/bird/android/model/IssueTypeLock;", "kotlin.jvm.PlatformType", "", "<name for destructuring parameter 0>", C17296a.f69688o, "(Lkotlin/Triple;)Lkotlin/Triple;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: CF6$b */
    /* loaded from: classes3.dex */
    public static final class C0963b extends Lambda implements Function1<Triple<? extends List<? extends IssueTypeLock>, ? extends List<? extends IssueTypeLock>, ? extends Boolean>, Triple<? extends List<? extends IssueTypeLock>, ? extends List<? extends IssueTypeLock>, ? extends Boolean>> {

        /* renamed from: g */
        public static final C0963b f3717g = new C0963b();

        public C0963b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Triple<List<IssueTypeLock>, List<IssueTypeLock>, Boolean> invoke(Triple<? extends List<IssueTypeLock>, ? extends List<IssueTypeLock>, Boolean> triple) {
            Intrinsics.checkNotNullParameter(triple, "<name for destructuring parameter 0>");
            List<IssueTypeLock> component1 = triple.component1();
            List<IssueTypeLock> component2 = triple.component2();
            Boolean component3 = triple.component3();
            if (component3.booleanValue()) {
                return new Triple<>(component1, component2, component3);
            }
            throw new Exception("dialog canceled");
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u00062f\u0010\u0005\u001ab\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0002 \u0003*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0001\u0012\u0004\u0012\u00020\u0004 \u0003*0\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0002 \u0003*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0001\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0007\u0010\b"}, m28432d2 = {"Lkotlin/Triple;", "", "Lco/bird/android/model/IssueTypeLock;", "kotlin.jvm.PlatformType", "", "<name for destructuring parameter 0>", "", C17296a.f69688o, "(Lkotlin/Triple;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: CF6$c */
    /* loaded from: classes3.dex */
    public static final class C0964c extends Lambda implements Function1<Triple<? extends List<? extends IssueTypeLock>, ? extends List<? extends IssueTypeLock>, ? extends Boolean>, Unit> {
        public C0964c() {
            super(1);
        }

        /* renamed from: a */
        public final void m112500a(Triple<? extends List<IssueTypeLock>, ? extends List<IssueTypeLock>, Boolean> triple) {
            List<IssueTypeLock> selectedIssues = triple.component1();
            Intent intent = new Intent();
            Intrinsics.checkNotNullExpressionValue(selectedIssues, "selectedIssues");
            intent.putParcelableArrayListExtra("selected_issues", C44691lm0.m26849a(selectedIssues));
            intent.putParcelableArrayListExtra("unselected_issues", C44691lm0.m26849a(triple.component2()));
            CF6.this.f3705a.mo37190C1(-1, intent);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Triple<? extends List<? extends IssueTypeLock>, ? extends List<? extends IssueTypeLock>, ? extends Boolean> triple) {
            m112500a(triple);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\b\u0010\b\u001a\u00028\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0000\"\b\b\u0002\u0010\u0003*\u00020\u00002\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00028\u0001H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"", "T", "U", "R", "t", "u", "apply", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nObservables.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Observables.kt\nio/reactivex/rxkotlin/ObservablesKt$withLatestFrom$1\n+ 2 WorkOrderIssuesPresenter.kt\nco/bird/android/feature/workorders/issues/WorkOrderIssuesPresenterImpl\n*L\n1#1,304:1\n89#2,2:305\n*E\n"})
    /* renamed from: CF6$d */
    /* loaded from: classes3.dex */
    public static final class C0965d<T1, T2, R> implements InterfaceC23480c<Pair<? extends IssueType, ? extends Boolean>, List<? extends IssueTypeLock>, R> {
        @Override // io.reactivex.functions.InterfaceC23480c
        public final R apply(Pair<? extends IssueType, ? extends Boolean> pair, List<? extends IssueTypeLock> list) {
            Pair<? extends IssueType, ? extends Boolean> pair2 = pair;
            return (R) new Triple(pair2.component1(), Boolean.valueOf(pair2.component2().booleanValue()), list);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, m28432d2 = {"<anonymous>", "", "selectedIssues", "", "Lco/bird/android/model/IssueTypeLock;", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    @SourceDebugExtension({"SMAP\nWorkOrderIssuesPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WorkOrderIssuesPresenter.kt\nco/bird/android/feature/workorders/issues/WorkOrderIssuesPresenterImpl$onCreate$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,111:1\n1774#2,4:112\n*S KotlinDebug\n*F\n+ 1 WorkOrderIssuesPresenter.kt\nco/bird/android/feature/workorders/issues/WorkOrderIssuesPresenterImpl$onCreate$2\n*L\n78#1:112,4\n*E\n"})
    /* renamed from: CF6$e */
    /* loaded from: classes3.dex */
    public static final class C0966e extends Lambda implements Function1<List<? extends IssueTypeLock>, Unit> {

        /* renamed from: h */
        public final /* synthetic */ String f3720h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0966e(String str) {
            super(1);
            this.f3720h = str;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(List<? extends IssueTypeLock> list) {
            invoke2((List<IssueTypeLock>) list);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(List<IssueTypeLock> selectedIssues) {
            EF6 ef6 = CF6.this.f3707c;
            Intrinsics.checkNotNullExpressionValue(selectedIssues, "selectedIssues");
            List<IssueTypeLock> list = selectedIssues;
            String str = this.f3720h;
            int i = 0;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                for (IssueTypeLock issueTypeLock : list) {
                    if (Intrinsics.areEqual(issueTypeLock.getIssueType().getCategory(), str) && (i = i + 1) < 0) {
                        CollectionsKt__CollectionsKt.throwCountOverflow();
                    }
                }
            }
            ef6.mo107380Cc(i);
        }
    }

    @Metadata(m28433d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\b\u001aB\u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0007 \u0003*\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00010\u0001 \u0003* \u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0007 \u0003*\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00010\u0001\u0018\u00010\u00060\u00062.\u0010\u0005\u001a*\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0002 \u0003*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u0001\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00040\u00040\u0000H\n¢\u0006\u0004\b\b\u0010\t"}, m28432d2 = {"Lkotlin/Pair;", "", "Lco/bird/android/model/IssueTypeLock;", "kotlin.jvm.PlatformType", "", "<name for destructuring parameter 0>", "Lio/reactivex/K;", "LH6;", C17296a.f69688o, "(Lkotlin/Pair;)Lio/reactivex/K;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: CF6$f */
    /* loaded from: classes3.dex */
    public static final class C0967f extends Lambda implements Function1<Pair<? extends List<? extends IssueTypeLock>, ? extends Boolean>, InterfaceC23447K<? extends List<? extends C3023H6>>> {

        /* renamed from: h */
        public final /* synthetic */ String f3722h;

        /* renamed from: i */
        public final /* synthetic */ List<IssueType> f3723i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0967f(String str, List<IssueType> list) {
            super(1);
            this.f3722h = str;
            this.f3723i = list;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC23447K<? extends List<C3023H6>> invoke(Pair<? extends List<IssueTypeLock>, Boolean> pair) {
            Intrinsics.checkNotNullParameter(pair, "<name for destructuring parameter 0>");
            List<IssueTypeLock> selectedIssues = pair.component1();
            Boolean hideIssueDetails = pair.component2();
            InterfaceC46167oF6 interfaceC46167oF6 = CF6.this.f3708d;
            String str = this.f3722h;
            List<IssueType> list = this.f3723i;
            Intrinsics.checkNotNullExpressionValue(selectedIssues, "selectedIssues");
            Intrinsics.checkNotNullExpressionValue(hideIssueDetails, "hideIssueDetails");
            return interfaceC46167oF6.mo17734a(str, list, selectedIssues, hideIssueDetails.booleanValue());
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: CF6$g */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C0968g extends FunctionReferenceImpl implements Function1<List<? extends C3023H6>, Unit> {
        public C0968g(Object obj) {
            super(1, obj, EF6.class, "populateAdapter", "populateAdapter(Ljava/util/List;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(List<? extends C3023H6> list) {
            invoke2((List<C3023H6>) list);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(List<C3023H6> p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((EF6) this.receiver).mo107377b(p0);
        }
    }

    @Metadata(m28433d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\b\u001a\u00020\u00072Z\u0010\u0006\u001aV\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003 \u0005**\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\b\u0010\t"}, m28432d2 = {"Lkotlin/Triple;", "Lco/bird/android/model/IssueType;", "", "", "Lco/bird/android/model/IssueTypeLock;", "kotlin.jvm.PlatformType", "<name for destructuring parameter 0>", "", C17296a.f69688o, "(Lkotlin/Triple;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nWorkOrderIssuesPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WorkOrderIssuesPresenter.kt\nco/bird/android/feature/workorders/issues/WorkOrderIssuesPresenterImpl$onCreate$6\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,111:1\n819#2:112\n847#2,2:113\n2624#2,3:117\n1747#2,3:122\n766#2:125\n857#2,2:126\n37#3,2:115\n37#3,2:120\n*S KotlinDebug\n*F\n+ 1 WorkOrderIssuesPresenter.kt\nco/bird/android/feature/workorders/issues/WorkOrderIssuesPresenterImpl$onCreate$6\n*L\n98#1:112\n98#1:113,2\n101#1:117,3\n104#1:122,3\n105#1:125\n105#1:126,2\n99#1:115,2\n102#1:120,2\n*E\n"})
    /* renamed from: CF6$h */
    /* loaded from: classes3.dex */
    public static final class C0969h extends Lambda implements Function1<Triple<? extends IssueType, ? extends Boolean, ? extends List<? extends IssueTypeLock>>, Unit> {

        /* renamed from: h */
        public final /* synthetic */ String f3725h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0969h(String str) {
            super(1);
            this.f3725h = str;
        }

        /* renamed from: a */
        public final void m112498a(Triple<IssueType, Boolean, ? extends List<IssueTypeLock>> triple) {
            boolean z;
            List listOf;
            List listOf2;
            IssueType component1 = triple.component1();
            boolean booleanValue = triple.component2().booleanValue();
            List<IssueTypeLock> selectedIssues = triple.component3();
            boolean z2 = false;
            if (booleanValue && component1.isNoIssue()) {
                Intrinsics.checkNotNullExpressionValue(selectedIssues, "selectedIssues");
                String str = this.f3725h;
                ArrayList arrayList = new ArrayList();
                for (Object obj : selectedIssues) {
                    if (!Intrinsics.areEqual(((IssueTypeLock) obj).getIssueType().getCategory(), str)) {
                        arrayList.add(obj);
                    }
                }
                C24552a c24552a = CF6.this.f3710f;
                SpreadBuilder spreadBuilder = new SpreadBuilder(2);
                spreadBuilder.addSpread(arrayList.toArray(new IssueTypeLock[0]));
                spreadBuilder.add(new IssueTypeLock(component1, false, IssueStatus.OPEN));
                listOf2 = CollectionsKt__CollectionsKt.listOf(spreadBuilder.toArray(new IssueTypeLock[spreadBuilder.size()]));
                c24552a.onNext(listOf2);
                return;
            }
            if (booleanValue) {
                Intrinsics.checkNotNullExpressionValue(selectedIssues, "selectedIssues");
                List<IssueTypeLock> list = selectedIssues;
                if (!(list instanceof Collection) || !list.isEmpty()) {
                    for (IssueTypeLock issueTypeLock : list) {
                        if (Intrinsics.areEqual(issueTypeLock.getIssueType(), component1)) {
                            z = false;
                            break;
                        }
                    }
                }
                z = true;
                if (z) {
                    C24552a c24552a2 = CF6.this.f3710f;
                    SpreadBuilder spreadBuilder2 = new SpreadBuilder(2);
                    spreadBuilder2.addSpread(selectedIssues.toArray(new IssueTypeLock[0]));
                    spreadBuilder2.add(new IssueTypeLock(component1, false, IssueStatus.OPEN));
                    listOf = CollectionsKt__CollectionsKt.listOf(spreadBuilder2.toArray(new IssueTypeLock[spreadBuilder2.size()]));
                    c24552a2.onNext(listOf);
                    return;
                }
            }
            if (!booleanValue) {
                Intrinsics.checkNotNullExpressionValue(selectedIssues, "selectedIssues");
                List<IssueTypeLock> list2 = selectedIssues;
                if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                    Iterator<T> it = list2.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (Intrinsics.areEqual(((IssueTypeLock) it.next()).getIssueType(), component1)) {
                                z2 = true;
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                }
                if (z2) {
                    C24552a c24552a3 = CF6.this.f3710f;
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj2 : list2) {
                        if (!Intrinsics.areEqual(((IssueTypeLock) obj2).getIssueType(), component1)) {
                            arrayList2.add(obj2);
                        }
                    }
                    c24552a3.onNext(arrayList2);
                }
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Triple<? extends IssueType, ? extends Boolean, ? extends List<? extends IssueTypeLock>> triple) {
            m112498a(triple);
            return Unit.INSTANCE;
        }
    }

    public CF6(InterfaceC40099e13 navigator, ScopeProvider scopeProvider, EF6 ui, InterfaceC46167oF6 converter, C36207Tq4 reactiveConfig) {
        List<IssueTypeLock> emptyList;
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(scopeProvider, "scopeProvider");
        Intrinsics.checkNotNullParameter(ui, "ui");
        Intrinsics.checkNotNullParameter(converter, "converter");
        Intrinsics.checkNotNullParameter(reactiveConfig, "reactiveConfig");
        this.f3705a = navigator;
        this.f3706b = scopeProvider;
        this.f3707c = ui;
        this.f3708d = converter;
        this.f3709e = reactiveConfig;
        C24552a<List<IssueTypeLock>> m31922e = C24552a.m31922e();
        Intrinsics.checkNotNullExpressionValue(m31922e, "create<List<IssueTypeLock>>()");
        this.f3710f = m31922e;
        emptyList = CollectionsKt__CollectionsKt.emptyList();
        this.f3711g = emptyList;
        Observable m31950a = C24527f.m31950a(ui.mo107376l(), m31922e);
        final C0960a c0960a = new C0960a();
        Observable flatMap = m31950a.flatMap(new InterfaceC23492o() { // from class: tF6
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23434B m112514i;
                m112514i = CF6.m112514i(Function1.this, obj);
                return m112514i;
            }
        });
        final C0963b c0963b = C0963b.f3717g;
        Observable observeOn = flatMap.map(new InterfaceC23492o() { // from class: uF6
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                Triple m112513j;
                m112513j = CF6.m112513j(Function1.this, obj);
                return m112513j;
            }
        }).retry().observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn, "ui.addClicks()\n      .wi…dSchedulers.mainThread())");
        Object m33094as = observeOn.m33094as(AutoDispose.m45239a(scopeProvider));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C0964c c0964c = new C0964c();
        ((ObservableSubscribeProxy) m33094as).subscribe(new InterfaceC23484g() { // from class: vF6
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                CF6.m112512k(Function1.this, obj);
            }
        });
    }

    /* renamed from: i */
    public static final InterfaceC23434B m112514i(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23434B) tmp0.invoke(obj);
    }

    /* renamed from: j */
    public static final Triple m112513j(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (Triple) tmp0.invoke(obj);
    }

    /* renamed from: k */
    public static final void m112512k(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: l */
    public static final void m112511l(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: m */
    public static final InterfaceC23447K m112510m(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: n */
    public static final void m112509n(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: o */
    public static final void m112508o(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    @Override // p000.InterfaceC48538sF6
    /* renamed from: a */
    public void mo14492a(String category, List<IssueType> categoryIssues, List<IssueTypeLock> preselectedIssues) {
        Intrinsics.checkNotNullParameter(category, "category");
        Intrinsics.checkNotNullParameter(categoryIssues, "categoryIssues");
        Intrinsics.checkNotNullParameter(preselectedIssues, "preselectedIssues");
        this.f3711g = preselectedIssues;
        this.f3710f.onNext(preselectedIssues);
        EF6 ef6 = this.f3707c;
        List<IssueTypeLock> list = preselectedIssues;
        int i = 0;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            for (IssueTypeLock issueTypeLock : list) {
                if (Intrinsics.areEqual(issueTypeLock.getIssueType().getCategory(), category) && (i = i + 1) < 0) {
                    CollectionsKt__CollectionsKt.throwCountOverflow();
                }
            }
        }
        ef6.mo107380Cc(i);
        C24552a<List<IssueTypeLock>> c24552a = this.f3710f;
        final C0966e c0966e = new C0966e(category);
        Observable<List<IssueTypeLock>> doOnNext = c24552a.doOnNext(new InterfaceC23484g() { // from class: wF6
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                CF6.m112511l(Function1.this, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(doOnNext, "override fun onCreate(ca…  }\n        }\n      }\n  }");
        Observable m31950a = C24527f.m31950a(doOnNext, this.f3709e.m82514p7());
        final C0967f c0967f = new C0967f(category, categoryIssues);
        Observable observeOn = m31950a.flatMapSingle(new InterfaceC23492o() { // from class: xF6
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m112510m;
                m112510m = CF6.m112510m(Function1.this, obj);
                return m112510m;
            }
        }).observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn, "override fun onCreate(ca…  }\n        }\n      }\n  }");
        Object m33094as = observeOn.m33094as(AutoDispose.m45239a(this.f3706b));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C0968g c0968g = new C0968g(this.f3707c);
        ((ObservableSubscribeProxy) m33094as).subscribe(new InterfaceC23484g() { // from class: yF6
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                CF6.m112509n(Function1.this, obj);
            }
        });
        Observable<R> withLatestFrom = this.f3707c.mo107378Jl().withLatestFrom(this.f3710f, new C0965d());
        Intrinsics.checkExpressionValueIsNotNull(withLatestFrom, "withLatestFrom(other, Bi… combiner.invoke(t, u) })");
        Observable observeOn2 = withLatestFrom.observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn2, "ui.issueCheckedChanges()…dSchedulers.mainThread())");
        Object m33094as2 = observeOn2.m33094as(AutoDispose.m45239a(this.f3706b));
        Intrinsics.checkExpressionValueIsNotNull(m33094as2, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C0969h c0969h = new C0969h(category);
        ((ObservableSubscribeProxy) m33094as2).subscribe(new InterfaceC23484g() { // from class: zF6
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                CF6.m112508o(Function1.this, obj);
            }
        });
    }

    @Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u000b\u001aÚ\u0001\u0012f\b\u0001\u0012b\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0003 \u0004*\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0004\u0012\u00020\b \u0004*0\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0003 \u0004*\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0004\u0012\u00020\b\u0018\u00010\u00070\u0007 \u0004*l\u0012f\b\u0001\u0012b\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0003 \u0004*\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0004\u0012\u00020\b \u0004*0\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0003 \u0004*\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0004\u0012\u00020\b\u0018\u00010\u00070\u0007\u0018\u00010\u00060\u00062&\u0010\u0005\u001a\"\u0012\u0004\u0012\u00020\u0001\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0003 \u0004*\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u00020\u0000H\n¢\u0006\u0004\b\t\u0010\n"}, m28432d2 = {"Lkotlin/Pair;", "", "", "Lco/bird/android/model/IssueTypeLock;", "kotlin.jvm.PlatformType", "<name for destructuring parameter 0>", "Lio/reactivex/B;", "Lkotlin/Triple;", "", "invoke", "(Lkotlin/Pair;)Lio/reactivex/B;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nWorkOrderIssuesPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WorkOrderIssuesPresenter.kt\nco/bird/android/feature/workorders/issues/WorkOrderIssuesPresenterImpl$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,111:1\n1549#2:112\n1620#2,3:113\n*S KotlinDebug\n*F\n+ 1 WorkOrderIssuesPresenter.kt\nco/bird/android/feature/workorders/issues/WorkOrderIssuesPresenterImpl$1\n*L\n45#1:112\n45#1:113,3\n*E\n"})
    /* renamed from: CF6$a */
    /* loaded from: classes3.dex */
    public static final class C0960a extends Lambda implements Function1<Pair<? extends Unit, ? extends List<? extends IssueTypeLock>>, InterfaceC23434B<? extends Triple<? extends List<? extends IssueTypeLock>, ? extends List<? extends IssueTypeLock>, ? extends Boolean>>> {

        @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001ab\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0004\u0012\u00020\u0000 \u0005*0\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"", "it", "Lkotlin/Triple;", "", "Lco/bird/android/model/IssueTypeLock;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Ljava/lang/Boolean;)Lkotlin/Triple;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: CF6$a$a */
        /* loaded from: classes3.dex */
        public static final class C0961a extends Lambda implements Function1<Boolean, Triple<? extends List<? extends IssueTypeLock>, ? extends List<? extends IssueTypeLock>, ? extends Boolean>> {

            /* renamed from: g */
            public final /* synthetic */ List<IssueTypeLock> f3713g;

            /* renamed from: h */
            public final /* synthetic */ List<IssueTypeLock> f3714h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0961a(List<IssueTypeLock> list, List<IssueTypeLock> list2) {
                super(1);
                this.f3713g = list;
                this.f3714h = list2;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final Triple<List<IssueTypeLock>, List<IssueTypeLock>, Boolean> invoke(Boolean it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return new Triple<>(this.f3713g, this.f3714h, it);
            }
        }

        @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001ab\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0004\u0012\u00020\u0000 \u0005*0\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"", "it", "Lkotlin/Triple;", "", "Lco/bird/android/model/IssueTypeLock;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Ljava/lang/Boolean;)Lkotlin/Triple;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: CF6$a$b */
        /* loaded from: classes3.dex */
        public static final class C0962b extends Lambda implements Function1<Boolean, Triple<? extends List<? extends IssueTypeLock>, ? extends List<? extends IssueTypeLock>, ? extends Boolean>> {

            /* renamed from: g */
            public final /* synthetic */ List<IssueTypeLock> f3715g;

            /* renamed from: h */
            public final /* synthetic */ List<IssueTypeLock> f3716h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0962b(List<IssueTypeLock> list, List<IssueTypeLock> list2) {
                super(1);
                this.f3715g = list;
                this.f3716h = list2;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final Triple<List<IssueTypeLock>, List<IssueTypeLock>, Boolean> invoke(Boolean it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return new Triple<>(this.f3715g, this.f3716h, Boolean.TRUE);
            }
        }

        public C0960a() {
            super(1);
        }

        /* renamed from: c */
        public static final Triple m112505c(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (Triple) tmp0.invoke(obj);
        }

        /* renamed from: d */
        public static final Triple m112504d(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (Triple) tmp0.invoke(obj);
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final InterfaceC23434B<? extends Triple<List<IssueTypeLock>, List<IssueTypeLock>, Boolean>> invoke2(Pair<Unit, ? extends List<IssueTypeLock>> pair) {
            Set subtract;
            List list;
            int collectionSizeOrDefault;
            Intrinsics.checkNotNullParameter(pair, "<name for destructuring parameter 0>");
            List<IssueTypeLock> selectedIssues = pair.component2();
            Intrinsics.checkNotNullExpressionValue(selectedIssues, "selectedIssues");
            subtract = CollectionsKt___CollectionsKt.subtract(CF6.this.f3711g, selectedIssues);
            list = CollectionsKt___CollectionsKt.toList(subtract);
            if (!list.isEmpty()) {
                EF6 ef6 = CF6.this.f3707c;
                List<IssueTypeLock> list2 = list;
                collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10);
                ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
                for (IssueTypeLock issueTypeLock : list2) {
                    arrayList.add(issueTypeLock.getIssueType());
                }
                Observable<Boolean> mo107379I2 = ef6.mo107379I2(arrayList);
                final C0961a c0961a = new C0961a(selectedIssues, list);
                return mo107379I2.map(new InterfaceC23492o() { // from class: AF6
                    @Override // io.reactivex.functions.InterfaceC23492o
                    public final Object apply(Object obj) {
                        Triple m112505c;
                        m112505c = CF6.C0960a.m112505c(Function1.this, obj);
                        return m112505c;
                    }
                });
            }
            Observable just = Observable.just(Boolean.TRUE);
            final C0962b c0962b = new C0962b(selectedIssues, list);
            return just.map(new InterfaceC23492o() { // from class: BF6
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj) {
                    Triple m112504d;
                    m112504d = CF6.C0960a.m112504d(Function1.this, obj);
                    return m112504d;
                }
            });
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ InterfaceC23434B<? extends Triple<? extends List<? extends IssueTypeLock>, ? extends List<? extends IssueTypeLock>, ? extends Boolean>> invoke(Pair<? extends Unit, ? extends List<? extends IssueTypeLock>> pair) {
            return invoke2((Pair<Unit, ? extends List<IssueTypeLock>>) pair);
        }
    }
}
