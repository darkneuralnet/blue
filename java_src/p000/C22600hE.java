package p000;

import co.bird.android.vehiclescanner.common.mrp.InterfaceC16428a;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.ObservableSubscribeProxy;
import io.reactivex.functions.InterfaceC23484g;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0016\u0018\u0000*\u000e\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u00028\u00010\u0001*\u0004\b\u0001\u0010\u00032\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004B\u001b\u0012\u0006\u0010\u000f\u001a\u00028\u0001\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00028\u0000H\u0017¢\u0006\u0004\b\u0007\u0010\bR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\t8\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u0012"}, m28432d2 = {"LhE;", "Lco/bird/android/vehiclescanner/common/mrp/a;", "R", "S", "Lf1;", "renderer", "", "consume", "(Lco/bird/android/vehiclescanner/common/mrp/a;)V", "Ldm5;", "e", "Ldm5;", "n", "()Ldm5;", "scannerNavigator", "initialState", "<init>", "(Ljava/lang/Object;Ldm5;)V", "vehiclescanner_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nBaseScanPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BaseScanPresenter.kt\nco/bird/android/vehiclescanner/common/mrp/BaseScanPresenter\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n*L\n1#1,24:1\n180#2:25\n*S KotlinDebug\n*F\n+ 1 BaseScanPresenter.kt\nco/bird/android/vehiclescanner/common/mrp/BaseScanPresenter\n*L\n19#1:25\n*E\n"})
/* renamed from: hE */
/* loaded from: classes4.dex */
public class C22600hE<R extends InterfaceC16428a<S>, S> extends AbstractC20169f1<R, S> {

    /* renamed from: e */
    public final InterfaceC39953dm5 f84889e;

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\u0010\b\u001a\u00020\u0003\"\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u0000\"\u0004\b\u0001\u0010\u00022\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"Lco/bird/android/vehiclescanner/common/mrp/a;", "R", "S", "", "kotlin.jvm.PlatformType", "it", "invoke", "(Lkotlin/Unit;)V", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: hE$a */
    /* loaded from: classes4.dex */
    public static final class C22601a extends Lambda implements Function1<Unit, Unit> {

        /* renamed from: g */
        public final /* synthetic */ C22600hE<R, S> f84890g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C22601a(C22600hE<R, S> c22600hE) {
            super(1);
            this.f84890g = c22600hE;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Unit unit) {
            invoke2(unit);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Unit unit) {
            this.f84890g.m36594n().mo43724q();
        }
    }

    public /* synthetic */ C22600hE(Object obj, InterfaceC39953dm5 interfaceC39953dm5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(obj, (i & 2) != 0 ? null : interfaceC39953dm5);
    }

    /* renamed from: f */
    public static final void m36596f(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.AbstractC20169f1
    public /* bridge */ /* synthetic */ void consume(InterfaceC48362rx4 interfaceC48362rx4) {
        consume((C22600hE<R, S>) ((InterfaceC16428a) interfaceC48362rx4));
    }

    /* renamed from: n */
    public final InterfaceC39953dm5 m36594n() {
        return this.f84889e;
    }

    public C22600hE(S s, InterfaceC39953dm5 interfaceC39953dm5) {
        super(s);
        this.f84889e = interfaceC39953dm5;
    }

    public void consume(R renderer) {
        Intrinsics.checkNotNullParameter(renderer, "renderer");
        super.consume((C22600hE<R, S>) renderer);
        if (this.f84889e != null) {
            Object m33094as = renderer.mo54816G().m33094as(AutoDispose.m45239a(m42278j()));
            Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
            final C22601a c22601a = new C22601a(this);
            ((ObservableSubscribeProxy) m33094as).subscribe(new InterfaceC23484g() { // from class: eE
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj) {
                    C22600hE.m36596f(Function1.this, obj);
                }
            });
        }
    }
}
