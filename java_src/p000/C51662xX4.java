package p000;

import co.bird.android.model.persistence.RidePassView;
import com.facebook.share.internal.C17296a;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.ObservableSubscribeProxy;
import io.reactivex.Observable;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.functions.InterfaceC23492o;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0019\b\u0007\u0012\u0006\u0010\n\u001a\u00020\u0007\u0012\u0006\u0010\u000e\u001a\u00020\u000b¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0002H\u0016R\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\u000e\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u0011"}, m28432d2 = {"LxX4;", "Lf1;", "LyX4;", "LzX4;", "renderer", "", "p", "LWU4;", "e", "LWU4;", "ridePassManager", "Le13;", "f", "Le13;", "navigator", "<init>", "(LWU4;Le13;)V", "ride-pass_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nRidePassV4Presenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RidePassV4Presenter.kt\nco/bird/android/feature/ridepass/v4/list/RidePassV4Presenter\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n*L\n1#1,29:1\n180#2:30\n180#2:31\n*S KotlinDebug\n*F\n+ 1 RidePassV4Presenter.kt\nco/bird/android/feature/ridepass/v4/list/RidePassV4Presenter\n*L\n19#1:30\n23#1:31\n*E\n"})
/* renamed from: xX4  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C51662xX4 extends AbstractC20169f1<InterfaceC52255yX4, InterfaceC52848zX4> {

    /* renamed from: e */
    public final WU4 f117772e;

    /* renamed from: f */
    public final InterfaceC40099e13 f117773f;

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"", "Lco/bird/android/model/persistence/RidePassView;", "passes", "LUe6;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Ljava/util/List;)LUe6;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: xX4$a */
    /* loaded from: classes3.dex */
    public static final class C30226a extends Lambda implements Function1<List<? extends RidePassView>, C36335Ue6> {

        /* renamed from: g */
        public static final C30226a f117774g = new C30226a();

        public C30226a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final C36335Ue6 invoke(List<RidePassView> passes) {
            Intrinsics.checkNotNullParameter(passes, "passes");
            return new C36335Ue6(passes);
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: xX4$b */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C30227b extends FunctionReferenceImpl implements Function1<InterfaceC52848zX4, Unit> {
        public C30227b(Object obj) {
            super(1, obj, C51662xX4.class, "emit", "emit(Ljava/lang/Object;)V", 0);
        }

        /* renamed from: a */
        public final void m5050a(InterfaceC52848zX4 p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((C51662xX4) this.receiver).m42280h(p0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC52848zX4 interfaceC52848zX4) {
            m5050a(interfaceC52848zX4);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/persistence/RidePassView;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lco/bird/android/model/persistence/RidePassView;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: xX4$c */
    /* loaded from: classes3.dex */
    public static final class C30228c extends Lambda implements Function1<RidePassView, Unit> {
        public C30228c() {
            super(1);
        }

        /* renamed from: a */
        public final void m5049a(RidePassView ridePassView) {
            C51662xX4.this.f117773f.mo37002j1(ridePassView.getLinkCode());
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(RidePassView ridePassView) {
            m5049a(ridePassView);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C51662xX4(WU4 ridePassManager, InterfaceC40099e13 navigator) {
        super(C44852m22.f97210a);
        Intrinsics.checkNotNullParameter(ridePassManager, "ridePassManager");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        this.f117772e = ridePassManager;
        this.f117773f = navigator;
    }

    /* renamed from: g */
    public static final void m5058g(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: q */
    public static final C36335Ue6 m5053q(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (C36335Ue6) tmp0.invoke(obj);
    }

    /* renamed from: r */
    public static final void m5052r(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    @Override // p000.AbstractC20169f1
    /* renamed from: p */
    public void consume(InterfaceC52255yX4 renderer) {
        Intrinsics.checkNotNullParameter(renderer, "renderer");
        super.consume(renderer);
        Z84<List<RidePassView>> mo55503E0 = this.f117772e.mo55503E0();
        final C30226a c30226a = C30226a.f117774g;
        Observable<R> map = mo55503E0.map(new InterfaceC23492o() { // from class: uX4
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                C36335Ue6 m5053q;
                m5053q = C51662xX4.m5053q(Function1.this, obj);
                return m5053q;
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "ridePassManager.ridePass…dateUi(passes = passes) }");
        Object m33094as = map.m33094as(AutoDispose.m45239a(m42278j()));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C30227b c30227b = new C30227b(this);
        ((ObservableSubscribeProxy) m33094as).subscribe(new InterfaceC23484g() { // from class: vX4
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C51662xX4.m5058g(Function1.this, obj);
            }
        });
        Object m33094as2 = renderer.mo3347z8().m33094as(AutoDispose.m45239a(m42278j()));
        Intrinsics.checkExpressionValueIsNotNull(m33094as2, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C30228c c30228c = new C30228c();
        ((ObservableSubscribeProxy) m33094as2).subscribe(new InterfaceC23484g() { // from class: wX4
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C51662xX4.m5052r(Function1.this, obj);
            }
        });
    }
}
