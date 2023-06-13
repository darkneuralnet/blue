package p000;

import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.ObservableSubscribeProxy;
import io.reactivex.functions.InterfaceC23484g;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.InterfaceC40099e13;
@Metadata(m28433d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0011\b\u0007\u0012\u0006\u0010\n\u001a\u00020\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0002H\u0016R\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\r"}, m28432d2 = {"LAu1;", "Lf1;", "LBu1;", "LCu1;", "renderer", "", "n", "Le13;", "e", "Le13;", "navigator", "<init>", "(Le13;)V", "co.bird.android.feature.flock-together"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nFlockTogetherPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FlockTogetherPresenter.kt\nco/bird/android/feature/flocktogether/FlockTogetherPresenter\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n*L\n1#1,23:1\n180#2:24\n*S KotlinDebug\n*F\n+ 1 FlockTogetherPresenter.kt\nco/bird/android/feature/flocktogether/FlockTogetherPresenter\n*L\n17#1:24\n*E\n"})
/* renamed from: Au1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C31794Au1 extends AbstractC20169f1<InterfaceC32028Bu1, InterfaceC32262Cu1> {

    /* renamed from: e */
    public final InterfaceC40099e13 f1324e;

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0003*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"<anonymous>", "", "it", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Au1$a */
    /* loaded from: classes3.dex */
    public static final class C0300a extends Lambda implements Function1<Unit, Unit> {
        public C0300a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Unit unit) {
            invoke2(unit);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Unit unit) {
            C31794Au1.this.f1324e.mo37150J(InterfaceC40099e13.EnumC19925b.RESULT_OK, new Pair[0]);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31794Au1(InterfaceC40099e13 navigator) {
        super(C51582xO5.f117547a);
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        this.f1324e = navigator;
    }

    /* renamed from: f */
    public static final void m114966f(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    @Override // p000.AbstractC20169f1
    /* renamed from: n */
    public void consume(InterfaceC32028Bu1 renderer) {
        Intrinsics.checkNotNullParameter(renderer, "renderer");
        super.consume(renderer);
        Object m33094as = renderer.mo58159l0().m33094as(AutoDispose.m45239a(m42278j()));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C0300a c0300a = new C0300a();
        ((ObservableSubscribeProxy) m33094as).subscribe(new InterfaceC23484g() { // from class: zu1
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C31794Au1.m114966f(Function1.this, obj);
            }
        });
    }
}
