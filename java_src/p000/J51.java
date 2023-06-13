package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
@Metadata(m28433d1 = {"\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002Bg\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0014\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00010\f0\u000b\u0012:\u0010\u0018\u001a6\u0012\u0015\u0012\u0013\u0018\u00010\f¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u0013\u0012\u0015\u0012\u0013\u0018\u00010\f¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u0014\u0012\u0004\u0012\u00020\u00150\u0010¢\u0006\u0004\b\u0019\u0010\u001aJ!\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\"\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00010\f0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eRH\u0010\u0018\u001a6\u0012\u0015\u0012\u0013\u0018\u00010\f¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u0013\u0012\u0015\u0012\u0013\u0018\u00010\f¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u0014\u0012\u0004\u0012\u00020\u00150\u00108\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001b"}, m28432d2 = {"LJ51;", "T", "LEu1;", "LGu1;", "collector", "", "collect", "(LGu1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "b", "LEu1;", "upstream", "Lkotlin/Function1;", "", "c", "Lkotlin/jvm/functions/Function1;", "keySelector", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "old", "new", "", DateTokenConverter.CONVERTER_KEY, "Lkotlin/jvm/functions/Function2;", "areEquivalent", "<init>", "(LEu1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;)V", "kotlinx-coroutines-core"}, m28431k = 1, m28430mv = {1, 6, 0})
/* renamed from: J51 */
/* loaded from: classes8.dex */
public final class J51<T> implements InterfaceC32730Eu1<T> {

    /* renamed from: b */
    public final InterfaceC32730Eu1<T> f16801b;
    @JvmField

    /* renamed from: c */
    public final Function1<T, Object> f16802c;
    @JvmField

    /* renamed from: d */
    public final Function2<Object, Object, Boolean> f16803d;

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"<anonymous>", "", "T", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, m28431k = 3, m28430mv = {1, 6, 0}, m28428xi = 48)
    /* renamed from: J51$a */
    /* loaded from: classes8.dex */
    public static final class C3884a<T> implements InterfaceC33198Gu1 {

        /* renamed from: b */
        public final /* synthetic */ J51<T> f16804b;

        /* renamed from: c */
        public final /* synthetic */ Ref.ObjectRef<Object> f16805c;

        /* renamed from: d */
        public final /* synthetic */ InterfaceC33198Gu1<T> f16806d;

        @Metadata(m28431k = 3, m28430mv = {1, 6, 0}, m28428xi = 48)
        @DebugMetadata(m28419c = "kotlinx.coroutines.flow.DistinctFlowImpl$collect$2", m28418f = "Distinct.kt", m28417i = {}, m28416l = {81}, m28415m = "emit", m28414n = {}, m28413s = {})
        /* renamed from: J51$a$a */
        /* loaded from: classes8.dex */
        public static final class C3885a extends ContinuationImpl {

            /* renamed from: h */
            public /* synthetic */ Object f16807h;

            /* renamed from: i */
            public final /* synthetic */ C3884a<T> f16808i;

            /* renamed from: j */
            public int f16809j;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C3885a(C3884a<? super T> c3884a, Continuation<? super C3885a> continuation) {
                super(continuation);
                this.f16808i = c3884a;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                this.f16807h = obj;
                this.f16809j |= Integer.MIN_VALUE;
                return this.f16808i.emit(null, this);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public C3884a(J51<T> j51, Ref.ObjectRef<Object> objectRef, InterfaceC33198Gu1<? super T> interfaceC33198Gu1) {
            this.f16804b = j51;
            this.f16805c = objectRef;
            this.f16806d = interfaceC33198Gu1;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
        /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
        @Override // p000.InterfaceC33198Gu1
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object emit(T t, Continuation<? super Unit> continuation) {
            C3885a c3885a;
            Object coroutine_suspended;
            int i;
            if (continuation instanceof C3885a) {
                c3885a = (C3885a) continuation;
                int i2 = c3885a.f16809j;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    c3885a.f16809j = i2 - Integer.MIN_VALUE;
                    Object obj = c3885a.f16807h;
                    coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = c3885a.f16809j;
                    if (i == 0) {
                        if (i == 1) {
                            ResultKt.throwOnFailure(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        ResultKt.throwOnFailure(obj);
                        T t2 = (T) this.f16804b.f16802c.invoke(t);
                        Object obj2 = this.f16805c.element;
                        if (obj2 != C46976pd3.f103863a && this.f16804b.f16803d.invoke(obj2, t2).booleanValue()) {
                            return Unit.INSTANCE;
                        }
                        this.f16805c.element = t2;
                        InterfaceC33198Gu1<T> interfaceC33198Gu1 = this.f16806d;
                        c3885a.f16809j = 1;
                        if (interfaceC33198Gu1.emit(t, c3885a) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                    return Unit.INSTANCE;
                }
            }
            c3885a = new C3885a(this, continuation);
            Object obj3 = c3885a.f16807h;
            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            i = c3885a.f16809j;
            if (i == 0) {
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public J51(InterfaceC32730Eu1<? extends T> interfaceC32730Eu1, Function1<? super T, ? extends Object> function1, Function2<Object, Object, Boolean> function2) {
        this.f16801b = interfaceC32730Eu1;
        this.f16802c = function1;
        this.f16803d = function2;
    }

    @Override // p000.InterfaceC32730Eu1
    public Object collect(InterfaceC33198Gu1<? super T> interfaceC33198Gu1, Continuation<? super Unit> continuation) {
        Object coroutine_suspended;
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = (T) C46976pd3.f103863a;
        Object collect = this.f16801b.collect(new C3884a(this, objectRef, interfaceC33198Gu1), continuation);
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (collect == coroutine_suspended) {
            return collect;
        }
        return Unit.INSTANCE;
    }
}
