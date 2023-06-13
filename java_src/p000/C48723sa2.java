package p000;

import android.content.Intent;
import co.bird.android.model.Issue;
import co.bird.android.model.IssueStatus;
import co.bird.android.model.RepairTypeLock;
import com.facebook.share.internal.C17296a;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.ObservableSubscribeProxy;
import com.uber.autodispose.ScopeProvider;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.C23454a;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.functions.InterfaceC23492o;
import io.reactivex.rxkotlin.C24527f;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import net.danlew.android.joda.DateUtils;
@Metadata(m28433d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\u0006\u0010\u000f\u001a\u00020\f\u0012\u0006\u0010\u0013\u001a\u00020\u0010¢\u0006\u0004\b\u0014\u0010\u0015J\u001e\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0016R\u0014\u0010\u000b\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\nR\u0014\u0010\u000f\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0013\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0016"}, m28432d2 = {"Lsa2;", "Loa2;", "Lco/bird/android/model/Issue;", "issue", "", "Lco/bird/android/model/RepairTypeLock;", "repairs", "", C17296a.f69688o, "Lva2;", "Lva2;", "ui", "Le13;", "b", "Le13;", "navigator", "Lcom/uber/autodispose/ScopeProvider;", "c", "Lcom/uber/autodispose/ScopeProvider;", "scopeProvider", "<init>", "(Lva2;Le13;Lcom/uber/autodispose/ScopeProvider;)V", "repair_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nIssueStatusPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IssueStatusPresenter.kt\nco/bird/android/feature/repair/v1/issuestatus/IssueStatusPresenterImpl\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n*L\n1#1,52:1\n2624#2,3:53\n1#3:56\n180#4:57\n180#4:58\n*S KotlinDebug\n*F\n+ 1 IssueStatusPresenter.kt\nco/bird/android/feature/repair/v1/issuestatus/IssueStatusPresenterImpl\n*L\n29#1:53,3\n35#1:57\n43#1:58\n*E\n"})
/* renamed from: sa2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C48723sa2 implements InterfaceC46352oa2 {

    /* renamed from: a */
    public final InterfaceC50501va2 f108999a;

    /* renamed from: b */
    public final InterfaceC40099e13 f109000b;

    /* renamed from: c */
    public final ScopeProvider f109001c;

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/IssueStatus;", "kotlin.jvm.PlatformType", "status", "", C17296a.f69688o, "(Lco/bird/android/model/IssueStatus;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: sa2$a */
    /* loaded from: classes3.dex */
    public static final class C28352a extends Lambda implements Function1<IssueStatus, Unit> {

        /* renamed from: h */
        public final /* synthetic */ Issue f109003h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C28352a(Issue issue) {
            super(1);
            this.f109003h = issue;
        }

        /* renamed from: a */
        public final void m13981a(IssueStatus issueStatus) {
            C48723sa2.this.f108999a.mo6628ri(issueStatus != this.f109003h.getStatus());
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(IssueStatus issueStatus) {
            m13981a(issueStatus);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\n \u0003*\u0004\u0018\u00010\u00050\u00052\u001a\u0010\u0004\u001a\u0016\u0012\u0004\u0012\u00020\u0001\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"Lkotlin/Pair;", "", "Lco/bird/android/model/IssueStatus;", "kotlin.jvm.PlatformType", "<name for destructuring parameter 0>", "Lco/bird/android/model/Issue;", C17296a.f69688o, "(Lkotlin/Pair;)Lco/bird/android/model/Issue;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: sa2$b */
    /* loaded from: classes3.dex */
    public static final class C28353b extends Lambda implements Function1<Pair<? extends Unit, ? extends IssueStatus>, Issue> {

        /* renamed from: g */
        public final /* synthetic */ Issue f109004g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C28353b(Issue issue) {
            super(1);
            this.f109004g = issue;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Issue invoke(Pair<Unit, ? extends IssueStatus> pair) {
            Issue copy;
            Intrinsics.checkNotNullParameter(pair, "<name for destructuring parameter 0>");
            copy = r1.copy((r37 & 1) != 0 ? r1.f66598id : null, (r37 & 2) != 0 ? r1.workOrderId : null, (r37 & 4) != 0 ? r1.issueTypeId : null, (r37 & 8) != 0 ? r1.display : null, (r37 & 16) != 0 ? r1.description : null, (r37 & 32) != 0 ? r1.status : pair.component2(), (r37 & 64) != 0 ? r1.statusDisplay : null, (r37 & 128) != 0 ? r1.statusColor : null, (r37 & 256) != 0 ? r1.statusReasonDisplay : null, (r37 & 512) != 0 ? r1.source : null, (r37 & 1024) != 0 ? r1.sourceDisplay : null, (r37 & 2048) != 0 ? r1.createdBy : null, (r37 & 4096) != 0 ? r1.createdAt : null, (r37 & 8192) != 0 ? r1.updatedAt : null, (r37 & 16384) != 0 ? r1.parentId : null, (r37 & DateUtils.FORMAT_ABBREV_WEEKDAY) != 0 ? r1.assetId : null, (r37 & 65536) != 0 ? r1.subtypes : null, (r37 & DateUtils.FORMAT_NUMERIC_DATE) != 0 ? r1.wireCampaign : null, (r37 & DateUtils.FORMAT_ABBREV_RELATIVE) != 0 ? this.f109004g.statusReason : null);
            return copy;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/Issue;", "kotlin.jvm.PlatformType", "updatedIssue", "", C17296a.f69688o, "(Lco/bird/android/model/Issue;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: sa2$c */
    /* loaded from: classes3.dex */
    public static final class C28354c extends Lambda implements Function1<Issue, Unit> {
        public C28354c() {
            super(1);
        }

        /* renamed from: a */
        public final void m13979a(Issue issue) {
            Intent intent = new Intent();
            intent.putExtra("issue", issue);
            C48723sa2.this.f109000b.mo37190C1(-1, intent);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Issue issue) {
            m13979a(issue);
            return Unit.INSTANCE;
        }
    }

    public C48723sa2(InterfaceC50501va2 ui, InterfaceC40099e13 navigator, ScopeProvider scopeProvider) {
        Intrinsics.checkNotNullParameter(ui, "ui");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(scopeProvider, "scopeProvider");
        this.f108999a = ui;
        this.f109000b = navigator;
        this.f109001c = scopeProvider;
    }

    /* renamed from: e */
    public static final void m13984e(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: f */
    public static final Issue m13983f(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (Issue) tmp0.invoke(obj);
    }

    /* renamed from: g */
    public static final void m13982g(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    @Override // p000.InterfaceC46352oa2
    /* renamed from: a */
    public void mo13988a(Issue issue, List<RepairTypeLock> repairs) {
        Intrinsics.checkNotNullParameter(issue, "issue");
        Intrinsics.checkNotNullParameter(repairs, "repairs");
        boolean z = true;
        this.f108999a.mo6631Vf(!repairs.isEmpty());
        InterfaceC50501va2 interfaceC50501va2 = this.f108999a;
        List<RepairTypeLock> list = repairs;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator<T> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                } else if (((RepairTypeLock) it.next()).component2()) {
                    z = false;
                    break;
                }
            }
        }
        interfaceC50501va2.mo6633A7(z);
        IssueStatus status = issue.getStatus();
        if (status != null) {
            this.f108999a.mo6629mh(status);
        }
        Observable<IssueStatus> observeOn = this.f108999a.mo6632P().observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn, "ui.statusSelects()\n     …dSchedulers.mainThread())");
        Object m33094as = observeOn.m33094as(AutoDispose.m45239a(this.f109001c));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C28352a c28352a = new C28352a(issue);
        ((ObservableSubscribeProxy) m33094as).subscribe(new InterfaceC23484g() { // from class: pa2
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C48723sa2.m13984e(Function1.this, obj);
            }
        });
        Observable m31950a = C24527f.m31950a(this.f108999a.mo6630m0(), this.f108999a.mo6632P());
        final C28353b c28353b = new C28353b(issue);
        Observable map = m31950a.map(new InterfaceC23492o() { // from class: qa2
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                Issue m13983f;
                m13983f = C48723sa2.m13983f(Function1.this, obj);
                return m13983f;
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "issue: Issue, repairs: L…e.copy(status = status) }");
        Object m33094as2 = map.m33094as(AutoDispose.m45239a(this.f109001c));
        Intrinsics.checkExpressionValueIsNotNull(m33094as2, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C28354c c28354c = new C28354c();
        ((ObservableSubscribeProxy) m33094as2).subscribe(new InterfaceC23484g() { // from class: ra2
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C48723sa2.m13982g(Function1.this, obj);
            }
        });
    }
}
