package p000;

import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.SingleSubscribeProxy;
import io.reactivex.functions.InterfaceC23484g;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.InterfaceC40099e13;
@Metadata(m28433d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b&\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0017\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0002H\u0016R\u001a\u0010\f\u001a\u00020\u00078\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\u0010"}, m28432d2 = {"LNa6;", "Lf1;", "LOa6;", "LPa6;", "renderer", "", "o", "Le13;", "e", "Le13;", "p", "()Le13;", "navigator", "initialState", "<init>", "(LPa6;Le13;)V", "co.bird.android.feature.tutorial"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nTutorialPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TutorialPresenter.kt\nco/bird/android/feature/tutorial/TutorialPresenter\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n*L\n1#1,52:1\n199#2:53\n*S KotlinDebug\n*F\n+ 1 TutorialPresenter.kt\nco/bird/android/feature/tutorial/TutorialPresenter\n*L\n25#1:53\n*E\n"})
/* renamed from: Na6  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC34661Na6 extends AbstractC20169f1<InterfaceC34895Oa6, AbstractC35129Pa6> {

    /* renamed from: e */
    public final InterfaceC40099e13 f24821e;

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0003*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"<anonymous>", "", "it", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Na6$a */
    /* loaded from: classes3.dex */
    public static final class C5608a extends Lambda implements Function1<Unit, Unit> {
        public C5608a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Unit unit) {
            invoke2(unit);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Unit unit) {
            AbstractC34661Na6.this.m93734p().mo37077W0(InterfaceC40099e13.EnumC19925b.RESULT_OK, new Pair[0]);
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Na6$b */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C5609b extends FunctionReferenceImpl implements Function1<Throwable, Unit> {

        /* renamed from: b */
        public static final C5609b f24823b = new C5609b();

        public C5609b() {
            super(1, C41318g46.class, "e", "e(Ljava/lang/Throwable;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            C41318g46.m40159e(th);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC34661Na6(AbstractC35129Pa6 initialState, InterfaceC40099e13 navigator) {
        super(initialState);
        Intrinsics.checkNotNullParameter(initialState, "initialState");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        this.f24821e = navigator;
    }

    /* renamed from: f */
    public static final void m93739f(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: g */
    public static final void m93738g(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    @Override // p000.AbstractC20169f1
    /* renamed from: o */
    public void consume(InterfaceC34895Oa6 renderer) {
        Intrinsics.checkNotNullParameter(renderer, "renderer");
        super.consume(renderer);
        Object m33135e = renderer.mo56352C5().m33135e(AutoDispose.m45239a(m42278j()));
        Intrinsics.checkExpressionValueIsNotNull(m33135e, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C5608a c5608a = new C5608a();
        InterfaceC23484g interfaceC23484g = new InterfaceC23484g() { // from class: La6
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                AbstractC34661Na6.m93739f(Function1.this, obj);
            }
        };
        final C5609b c5609b = C5609b.f24823b;
        ((SingleSubscribeProxy) m33135e).subscribe(interfaceC23484g, new InterfaceC23484g() { // from class: Ma6
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                AbstractC34661Na6.m93738g(Function1.this, obj);
            }
        });
    }

    /* renamed from: p */
    public final InterfaceC40099e13 m93734p() {
        return this.f24821e;
    }
}
