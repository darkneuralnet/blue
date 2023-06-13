package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B\u001b\u0012\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00070\u0010¢\u0006\u0004\b\u001c\u0010\u001dJD\u0010\u000b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022'\u0010\n\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0004¢\u0006\u0002\b\tH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\rH\u0016R#\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00070\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0017\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0016R\u0014\u0010\u001b\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001e"}, m28432d2 = {"LWW0;", "Lx61;", "LOX2;", "dragPriority", "Lkotlin/Function2;", "Lv61;", "Lkotlin/coroutines/Continuation;", "", "", "Lkotlin/ExtensionFunctionType;", "block", DateTokenConverter.CONVERTER_KEY, "(LOX2;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "delta", "b", "Lkotlin/Function1;", C17296a.f69688o, "Lkotlin/jvm/functions/Function1;", "f", "()Lkotlin/jvm/functions/Function1;", "onDelta", "Lv61;", "dragScope", "LRX2;", "c", "LRX2;", "scrollMutex", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "foundation_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: WW0 */
/* loaded from: classes.dex */
public final class WW0 implements InterfaceC51412x61 {

    /* renamed from: a */
    public final Function1<Float, Unit> f41215a;

    /* renamed from: b */
    public final InterfaceC50226v61 f41216b;

    /* renamed from: c */
    public final RX2 f41217c;

    @Metadata(m28433d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m28432d2 = {"LZC0;", "", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    @DebugMetadata(m28419c = "androidx.compose.foundation.gestures.DefaultDraggableState$drag$2", m28418f = "Draggable.kt", m28417i = {}, m28416l = {441}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
    /* renamed from: WW0$a */
    /* loaded from: classes.dex */
    public static final class C9075a extends SuspendLambda implements Function2<ZC0, Continuation<? super Unit>, Object> {

        /* renamed from: h */
        public int f41218h;

        /* renamed from: j */
        public final /* synthetic */ OX2 f41220j;

        /* renamed from: k */
        public final /* synthetic */ Function2<InterfaceC50226v61, Continuation<? super Unit>, Object> f41221k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C9075a(OX2 ox2, Function2<? super InterfaceC50226v61, ? super Continuation<? super Unit>, ? extends Object> function2, Continuation<? super C9075a> continuation) {
            super(2, continuation);
            this.f41220j = ox2;
            this.f41221k = function2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C9075a(this.f41220j, this.f41221k, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ZC0 zc0, Continuation<? super Unit> continuation) {
            return ((C9075a) create(zc0, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended;
            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f41218h;
            if (i != 0) {
                if (i == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                RX2 rx2 = WW0.this.f41217c;
                InterfaceC50226v61 interfaceC50226v61 = WW0.this.f41216b;
                OX2 ox2 = this.f41220j;
                Function2<InterfaceC50226v61, Continuation<? super Unit>, Object> function2 = this.f41221k;
                this.f41218h = 1;
                if (rx2.m86635d(interfaceC50226v61, ox2, function2, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, m28432d2 = {"WW0$b", "Lv61;", "", "pixels", "", C17296a.f69688o, "foundation_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: WW0$b */
    /* loaded from: classes.dex */
    public static final class C9076b implements InterfaceC50226v61 {
        public C9076b() {
        }

        @Override // p000.InterfaceC50226v61
        /* renamed from: a */
        public void mo9194a(float f) {
            WW0.this.m78258f().invoke(Float.valueOf(f));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public WW0(Function1<? super Float, Unit> onDelta) {
        Intrinsics.checkNotNullParameter(onDelta, "onDelta");
        this.f41215a = onDelta;
        this.f41216b = new C9076b();
        this.f41217c = new RX2();
    }

    @Override // p000.InterfaceC51412x61
    /* renamed from: b */
    public void mo5848b(float f) {
        this.f41215a.invoke(Float.valueOf(f));
    }

    @Override // p000.InterfaceC51412x61
    /* renamed from: d */
    public Object mo5846d(OX2 ox2, Function2<? super InterfaceC50226v61, ? super Continuation<? super Unit>, ? extends Object> function2, Continuation<? super Unit> continuation) {
        Object coroutine_suspended;
        Object m71786e = C37824aD0.m71786e(new C9075a(ox2, function2, null), continuation);
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        return m71786e == coroutine_suspended ? m71786e : Unit.INSTANCE;
    }

    /* renamed from: f */
    public final Function1<Float, Unit> m78258f() {
        return this.f41215a;
    }
}
