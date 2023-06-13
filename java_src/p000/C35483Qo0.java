package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.wire.WireBird;
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
import io.reactivex.subjects.C24552a;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B)\b\u0007\u0012\u0006\u0010\u0010\u001a\u00020\u0002\u0012\u0006\u0010\u0014\u001a\u00020\u0011\u0012\u0006\u0010\u0018\u001a\u00020\u0015\u0012\u0006\u0010\u001c\u001a\u00020\u0019¢\u0006\u0004\b\"\u0010#J\t\u0010\u0004\u001a\u00020\u0003H\u0096\u0001J\t\u0010\u0005\u001a\u00020\u0003H\u0096\u0001J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J \u0010\r\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\tH\u0016R\u0014\u0010\u0010\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0014\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0018\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001c\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u001a\u0010!\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u001f\u0010 ¨\u0006$"}, m28432d2 = {"LQo0;", "LNo0;", "Luo0;", "", "t1", "onResume", "", "birdId", "u1", "", "showLockCommand", "showAlarmCommand", "showSleepCommand", "e", C17296a.f69688o, "Luo0;", "delegate", "Lcom/uber/autodispose/ScopeProvider;", "b", "Lcom/uber/autodispose/ScopeProvider;", "scopeProvider", "Llp0;", "c", "Llp0;", "ui", "LJo0;", DateTokenConverter.CONVERTER_KEY, "LJo0;", "converter", "Lio/reactivex/subjects/a;", "Lco/bird/android/model/wire/WireBird;", "v1", "()Lio/reactivex/subjects/a;", "birdSubject", "<init>", "(Luo0;Lcom/uber/autodispose/ScopeProvider;Llp0;LJo0;)V", "co.bird.android.feature.lib.command"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nCommandDialogPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CommandDialogPresenter.kt\nco/bird/android/command/bottomsheet/CommandDialogPresenterImpl\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n*L\n1#1,42:1\n180#2:43\n*S KotlinDebug\n*F\n+ 1 CommandDialogPresenter.kt\nco/bird/android/command/bottomsheet/CommandDialogPresenterImpl\n*L\n30#1:43\n*E\n"})
/* renamed from: Qo0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C35483Qo0 implements InterfaceC34781No0, InterfaceC50047uo0 {

    /* renamed from: a */
    public final InterfaceC50047uo0 f30971a;

    /* renamed from: b */
    public final ScopeProvider f30972b;

    /* renamed from: c */
    public final InterfaceC44721lp0 f30973c;

    /* renamed from: d */
    public final InterfaceC33845Jo0 f30974d;

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Qo0$a */
    /* loaded from: classes2.dex */
    public /* synthetic */ class C6910a extends FunctionReferenceImpl implements Function1<WireBird, AbstractC23442F<List<? extends C3023H6>>> {
        public C6910a(Object obj) {
            super(1, obj, InterfaceC33845Jo0.class, "convert", "convert(Lco/bird/android/model/wire/WireBird;)Lio/reactivex/Single;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final AbstractC23442F<List<C3023H6>> invoke(WireBird p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            return ((InterfaceC33845Jo0) this.receiver).mo96334d(p0);
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Qo0$b */
    /* loaded from: classes2.dex */
    public /* synthetic */ class C6911b extends FunctionReferenceImpl implements Function1<Collection<? extends C3023H6>, Unit> {
        public C6911b(Object obj) {
            super(1, obj, InterfaceC44721lp0.class, "populateAdapter", "populateAdapter(Ljava/util/Collection;)V", 0);
        }

        /* renamed from: a */
        public final void m87906a(Collection<C3023H6> p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((InterfaceC44721lp0) this.receiver).mo17123o(p0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Collection<? extends C3023H6> collection) {
            m87906a(collection);
            return Unit.INSTANCE;
        }
    }

    public C35483Qo0(InterfaceC50047uo0 delegate, ScopeProvider scopeProvider, InterfaceC44721lp0 ui, InterfaceC33845Jo0 converter) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        Intrinsics.checkNotNullParameter(scopeProvider, "scopeProvider");
        Intrinsics.checkNotNullParameter(ui, "ui");
        Intrinsics.checkNotNullParameter(converter, "converter");
        this.f30971a = delegate;
        this.f30972b = scopeProvider;
        this.f30973c = ui;
        this.f30974d = converter;
        C24552a<WireBird> mo9730v1 = mo9730v1();
        final C6910a c6910a = new C6910a(converter);
        Observable observeOn = mo9730v1.flatMapSingle(new InterfaceC23492o() { // from class: Oo0
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m87909f;
                m87909f = C35483Qo0.m87909f(Function1.this, obj);
                return m87909f;
            }
        }).observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn, "birdSubject\n      .flatM…dSchedulers.mainThread())");
        Object m33094as = observeOn.m33094as(AutoDispose.m45239a(scopeProvider));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C6911b c6911b = new C6911b(ui);
        ((ObservableSubscribeProxy) m33094as).subscribe(new InterfaceC23484g() { // from class: Po0
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C35483Qo0.m87908g(Function1.this, obj);
            }
        });
    }

    /* renamed from: f */
    public static final InterfaceC23447K m87909f(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: g */
    public static final void m87908g(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    @Override // p000.InterfaceC34781No0
    /* renamed from: e */
    public void mo87910e(boolean z, boolean z2, boolean z3) {
        this.f30974d.mo96335c(z, z2, z3);
    }

    @Override // p000.InterfaceC50047uo0
    public void onResume() {
        this.f30971a.onResume();
    }

    @Override // p000.InterfaceC50047uo0
    /* renamed from: t1 */
    public void mo9732t1() {
        this.f30971a.mo9732t1();
    }

    @Override // p000.InterfaceC50047uo0
    /* renamed from: u1 */
    public void mo9731u1(String birdId) {
        Intrinsics.checkNotNullParameter(birdId, "birdId");
        this.f30971a.mo9731u1(birdId);
    }

    @Override // p000.InterfaceC50047uo0
    /* renamed from: v1 */
    public C24552a<WireBird> mo9730v1() {
        return this.f30971a.mo9730v1();
    }
}
