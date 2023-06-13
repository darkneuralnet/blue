package p000;

import co.bird.android.model.wire.WireTransferOrderClosedIncompleteReason;
import com.facebook.share.internal.C17296a;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.ObservableSubscribeProxy;
import io.reactivex.Observable;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.functions.InterfaceC23492o;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0002H\u0016¨\u0006\t"}, m28432d2 = {"Lvl0;", "Lf1;", "Lwl0;", "Lxl0;", "renderer", "", "o", "<init>", "()V", "co.bird.android.feature.transfer-order"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nCloseIncompletePresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CloseIncompletePresenter.kt\nco/bird/android/feature/transferorder/operatorallocationdetails/dialogs/CloseIncompletePresenter\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n*L\n1#1,17:1\n180#2:18\n*S KotlinDebug\n*F\n+ 1 CloseIncompletePresenter.kt\nco/bird/android/feature/transferorder/operatorallocationdetails/dialogs/CloseIncompletePresenter\n*L\n13#1:18\n*E\n"})
/* renamed from: vl0  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C50609vl0 extends AbstractC20169f1<InterfaceC51202wl0, AbstractC51795xl0> {

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/wire/WireTransferOrderClosedIncompleteReason;", "reason", "Ltr5;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/model/wire/WireTransferOrderClosedIncompleteReason;)Ltr5;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: vl0$a */
    /* loaded from: classes3.dex */
    public static final class C29619a extends Lambda implements Function1<WireTransferOrderClosedIncompleteReason, C49489tr5> {

        /* renamed from: g */
        public static final C29619a f114569g = new C29619a();

        public C29619a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final C49489tr5 invoke(WireTransferOrderClosedIncompleteReason reason) {
            Intrinsics.checkNotNullParameter(reason, "reason");
            return new C49489tr5(reason);
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: vl0$b */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C29620b extends FunctionReferenceImpl implements Function1<AbstractC51795xl0, Unit> {
        public C29620b(Object obj) {
            super(1, obj, C50609vl0.class, "emit", "emit(Ljava/lang/Object;)V", 0);
        }

        /* renamed from: a */
        public final void m8199a(AbstractC51795xl0 p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((C50609vl0) this.receiver).m42280h(p0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(AbstractC51795xl0 abstractC51795xl0) {
            m8199a(abstractC51795xl0);
            return Unit.INSTANCE;
        }
    }

    public C50609vl0() {
        super(C39516d22.f76025a);
    }

    /* renamed from: g */
    public static final void m8205g(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: p */
    public static final C49489tr5 m8201p(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (C49489tr5) tmp0.invoke(obj);
    }

    @Override // p000.AbstractC20169f1
    /* renamed from: o */
    public void consume(InterfaceC51202wl0 renderer) {
        Intrinsics.checkNotNullParameter(renderer, "renderer");
        super.consume(renderer);
        Observable<WireTransferOrderClosedIncompleteReason> mo6408s = renderer.mo6408s();
        final C29619a c29619a = C29619a.f114569g;
        Observable<R> map = mo6408s.map(new InterfaceC23492o() { // from class: tl0
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                C49489tr5 m8201p;
                m8201p = C50609vl0.m8201p(Function1.this, obj);
                return m8201p;
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "renderer.reasonSelects()…-> SelectReason(reason) }");
        Object m33094as = map.m33094as(AutoDispose.m45239a(m42278j()));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C29620b c29620b = new C29620b(this);
        ((ObservableSubscribeProxy) m33094as).subscribe(new InterfaceC23484g() { // from class: ul0
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C50609vl0.m8205g(Function1.this, obj);
            }
        });
    }
}
