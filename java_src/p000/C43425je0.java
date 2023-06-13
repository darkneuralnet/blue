package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.Issue;
import co.bird.android.model.IssueStatus;
import co.bird.android.model.constant.IssueStatusReason;
import com.facebook.share.internal.C17296a;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.ObservableSubscribeProxy;
import com.uber.autodispose.ScopeProvider;
import com.uber.autodispose.SingleSubscribeProxy;
import io.reactivex.AbstractC23442F;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.C23454a;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.subjects.AbstractC24569h;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B=\b\u0007\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\f\u001a\u00020\t\u0012\u001a\u0010\u0013\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u000e0\r\u0012\u0006\u0010\u0017\u001a\u00020\u0014¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\b\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0007R\u0014\u0010\f\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR(\u0010\u0013\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u000e0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0017\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u001a"}, m28432d2 = {"Lje0;", "Lfe0;", "Lco/bird/android/model/Issue;", "issue", "", C17296a.f69688o, "Lke0;", "Lke0;", "ui", "Lcom/uber/autodispose/ScopeProvider;", "b", "Lcom/uber/autodispose/ScopeProvider;", "scopeProvider", "Lio/reactivex/subjects/h;", "Lkotlin/Pair;", "Lco/bird/android/model/IssueStatus;", "Lco/bird/android/model/constant/IssueStatusReason;", "c", "Lio/reactivex/subjects/h;", "statusSubject", "Lee0;", DateTokenConverter.CONVERTER_KEY, "Lee0;", "converter", "<init>", "(Lke0;Lcom/uber/autodispose/ScopeProvider;Lio/reactivex/subjects/h;Lee0;)V", "repair_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nCantRepairPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CantRepairPresenter.kt\nco/bird/android/feature/repair/v2/subtypes/dialogs/cantrepair/CantRepairPresenterImpl\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n*L\n1#1,41:1\n180#2:42\n199#2:43\n*S KotlinDebug\n*F\n+ 1 CantRepairPresenter.kt\nco/bird/android/feature/repair/v2/subtypes/dialogs/cantrepair/CantRepairPresenterImpl\n*L\n28#1:42\n33#1:43\n*E\n"})
/* renamed from: je0  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C43425je0 implements InterfaceC41053fe0 {

    /* renamed from: a */
    public final InterfaceC44018ke0 f93067a;

    /* renamed from: b */
    public final ScopeProvider f93068b;

    /* renamed from: c */
    public final AbstractC24569h<Pair<IssueStatus, IssueStatusReason>> f93069c;

    /* renamed from: d */
    public final C40460ee0 f93070d;

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012*\u0010\u0002\u001a&\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0005 \u0006*\u0012\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0007"}, m28432d2 = {"<anonymous>", "", "it", "Lkotlin/Pair;", "Lco/bird/android/model/IssueStatus;", "Lco/bird/android/model/constant/IssueStatusReason;", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: je0$a */
    /* loaded from: classes3.dex */
    public static final class C24976a extends Lambda implements Function1<Pair<? extends IssueStatus, ? extends IssueStatusReason>, Unit> {
        public C24976a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Pair<? extends IssueStatus, ? extends IssueStatusReason> pair) {
            invoke2(pair);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Pair<? extends IssueStatus, ? extends IssueStatusReason> pair) {
            C43425je0.this.f93067a.dismiss();
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: je0$b */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C24977b extends FunctionReferenceImpl implements Function1<Pair<? extends IssueStatus, ? extends IssueStatusReason>, Unit> {
        public C24977b(Object obj) {
            super(1, obj, AbstractC24569h.class, "onNext", "onNext(Ljava/lang/Object;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Pair<? extends IssueStatus, ? extends IssueStatusReason> pair) {
            invoke2(pair);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Pair<? extends IssueStatus, ? extends IssueStatusReason> p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((AbstractC24569h) this.receiver).onNext(p0);
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: je0$c */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C24978c extends FunctionReferenceImpl implements Function1<List<? extends C3023H6>, Unit> {
        public C24978c(Object obj) {
            super(1, obj, InterfaceC44018ke0.class, "populateAdapter", "populateAdapter(Ljava/util/List;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(List<? extends C3023H6> list) {
            invoke2((List<C3023H6>) list);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(List<C3023H6> p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((InterfaceC44018ke0) this.receiver).mo27063b(p0);
        }
    }

    public C43425je0(InterfaceC44018ke0 ui, ScopeProvider scopeProvider, AbstractC24569h<Pair<IssueStatus, IssueStatusReason>> statusSubject, C40460ee0 converter) {
        Intrinsics.checkNotNullParameter(ui, "ui");
        Intrinsics.checkNotNullParameter(scopeProvider, "scopeProvider");
        Intrinsics.checkNotNullParameter(statusSubject, "statusSubject");
        Intrinsics.checkNotNullParameter(converter, "converter");
        this.f93067a = ui;
        this.f93068b = scopeProvider;
        this.f93069c = statusSubject;
        this.f93070d = converter;
        Observable<Pair<IssueStatus, IssueStatusReason>> observeOn = ui.mo27064P().observeOn(C23454a.m33087a());
        final C24976a c24976a = new C24976a();
        Observable<Pair<IssueStatus, IssueStatusReason>> doOnNext = observeOn.doOnNext(new InterfaceC23484g() { // from class: ge0
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C43425je0.m30158e(Function1.this, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(doOnNext, "ui.statusSelects()\n     …doOnNext { ui.dismiss() }");
        Object m33094as = doOnNext.m33094as(AutoDispose.m45239a(scopeProvider));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C24977b c24977b = new C24977b(statusSubject);
        ((ObservableSubscribeProxy) m33094as).subscribe(new InterfaceC23484g() { // from class: he0
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C43425je0.m30157f(Function1.this, obj);
            }
        });
        AbstractC23442F<List<C3023H6>> m33152N = converter.m42671b().m33152N(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(m33152N, "converter.convert()\n    …dSchedulers.mainThread())");
        Object m33135e = m33152N.m33135e(AutoDispose.m45239a(scopeProvider));
        Intrinsics.checkExpressionValueIsNotNull(m33135e, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C24978c c24978c = new C24978c(ui);
        ((SingleSubscribeProxy) m33135e).subscribe(new InterfaceC23484g() { // from class: ie0
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C43425je0.m30156g(Function1.this, obj);
            }
        });
    }

    /* renamed from: e */
    public static final void m30158e(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: f */
    public static final void m30157f(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: g */
    public static final void m30156g(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    @Override // p000.InterfaceC41053fe0
    /* renamed from: a */
    public void mo30162a(Issue issue) {
        Intrinsics.checkNotNullParameter(issue, "issue");
        this.f93067a.mo27062d7(issue);
    }
}
