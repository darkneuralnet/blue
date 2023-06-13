package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.Issue;
import co.bird.android.model.LegacyRepair;
import com.facebook.share.internal.C17296a;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.ObservableSubscribeProxy;
import com.uber.autodispose.ScopeProvider;
import com.uber.autodispose.SingleSubscribeProxy;
import io.reactivex.AbstractC23442F;
import io.reactivex.android.schedulers.C23454a;
import io.reactivex.functions.InterfaceC23484g;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\u0006\u0010\u000f\u001a\u00020\f\u0012\u0006\u0010\u0013\u001a\u00020\u0010¢\u0006\u0004\b\u001a\u0010\u001bJ$\u0010\b\u001a\u00020\u00072\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002H\u0016R\u0014\u0010\u000b\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\nR\u0014\u0010\u000f\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0013\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0017\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0019\u001a\u00020\u00148VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u0018¨\u0006\u001c"}, m28432d2 = {"LMD4;", "LID4;", "", "Lco/bird/android/model/Issue;", "issues", "Lco/bird/android/model/LegacyRepair;", "repairs", "", C17296a.f69688o, "Lcom/uber/autodispose/ScopeProvider;", "Lcom/uber/autodispose/ScopeProvider;", "scopeProvider", "LPD4;", "b", "LPD4;", "ui", "LED4;", "c", "LED4;", "converter", "", DateTokenConverter.CONVERTER_KEY, "Z", "_confirmClicked", "()Z", "confirmClicked", "<init>", "(Lcom/uber/autodispose/ScopeProvider;LPD4;LED4;)V", "repair_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nRepairSummaryPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RepairSummaryPresenter.kt\nco/bird/android/feature/repair/v2/supertypes/repairsummary/RepairSummaryPresenterImpl\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n*L\n1#1,47:1\n180#2:48\n199#2:49\n*S KotlinDebug\n*F\n+ 1 RepairSummaryPresenter.kt\nco/bird/android/feature/repair/v2/supertypes/repairsummary/RepairSummaryPresenterImpl\n*L\n30#1:48\n40#1:49\n*E\n"})
/* renamed from: MD4 */
/* loaded from: classes3.dex */
public final class MD4 implements ID4 {

    /* renamed from: a */
    public final ScopeProvider f22840a;

    /* renamed from: b */
    public final PD4 f22841b;

    /* renamed from: c */
    public final ED4 f22842c;

    /* renamed from: d */
    public boolean f22843d;

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0003*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"<anonymous>", "", "it", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: MD4$a */
    /* loaded from: classes3.dex */
    public static final class C5228a extends Lambda implements Function1<Unit, Unit> {
        public C5228a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Unit unit) {
            invoke2(unit);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Unit unit) {
            MD4.this.f22843d = true;
            MD4.this.f22841b.dismiss();
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: MD4$b */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C5229b extends FunctionReferenceImpl implements Function1<List<? extends C3023H6>, Unit> {
        public C5229b(Object obj) {
            super(1, obj, PD4.class, "populateAdapter", "populateAdapter(Ljava/util/List;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(List<? extends C3023H6> list) {
            invoke2((List<C3023H6>) list);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(List<C3023H6> p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((PD4) this.receiver).mo88731b(p0);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "e", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: MD4$c */
    /* loaded from: classes3.dex */
    public static final class C5230c extends Lambda implements Function1<Throwable, Unit> {
        public C5230c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            C41318g46.m40159e(th);
            MD4.this.f22841b.error(C45871nl4.error_generic_body);
        }
    }

    public MD4(ScopeProvider scopeProvider, PD4 ui, ED4 converter) {
        Intrinsics.checkNotNullParameter(scopeProvider, "scopeProvider");
        Intrinsics.checkNotNullParameter(ui, "ui");
        Intrinsics.checkNotNullParameter(converter, "converter");
        this.f22840a = scopeProvider;
        this.f22841b = ui;
        this.f22842c = converter;
        Object m33094as = ui.doneClicks().m33094as(AutoDispose.m45239a(scopeProvider));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C5228a c5228a = new C5228a();
        ((ObservableSubscribeProxy) m33094as).subscribe(new InterfaceC23484g() { // from class: JD4
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                MD4.m95556f(Function1.this, obj);
            }
        });
    }

    /* renamed from: f */
    public static final void m95556f(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: g */
    public static final void m95555g(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: h */
    public static final void m95554h(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    @Override // p000.ID4
    /* renamed from: a */
    public void mo95561a(List<Issue> issues, List<LegacyRepair> repairs) {
        Intrinsics.checkNotNullParameter(issues, "issues");
        Intrinsics.checkNotNullParameter(repairs, "repairs");
        AbstractC23442F<List<C3023H6>> m33152N = this.f22842c.mo105640a(issues, repairs).m33152N(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(m33152N, "converter.convert(issues…dSchedulers.mainThread())");
        Object m33135e = m33152N.m33135e(AutoDispose.m45239a(this.f22840a));
        Intrinsics.checkExpressionValueIsNotNull(m33135e, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C5229b c5229b = new C5229b(this.f22841b);
        InterfaceC23484g interfaceC23484g = new InterfaceC23484g() { // from class: KD4
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                MD4.m95555g(Function1.this, obj);
            }
        };
        final C5230c c5230c = new C5230c();
        ((SingleSubscribeProxy) m33135e).subscribe(interfaceC23484g, new InterfaceC23484g() { // from class: LD4
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                MD4.m95554h(Function1.this, obj);
            }
        });
    }

    @Override // p000.ID4
    /* renamed from: b */
    public boolean mo95560b() {
        return this.f22843d;
    }
}
