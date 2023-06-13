package p000;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.JvmField;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\t\b'\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u001f\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b*\u0010+J\u0010\u0010\u0004\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0003H\u0016J&\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016J&\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH$J!\u0010\u0010\u001a\u00020\u000f2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\rH¤@ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\u0016\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u00132\u0006\u0010\u000e\u001a\u00020\u0012H\u0016J!\u0010\u0017\u001a\u00020\u000f2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u0015H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018J\n\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0014J\b\u0010\u001b\u001a\u00020\u0019H\u0016R\u0014\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u001eR\u0014\u0010\n\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R9\u0010&\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\r\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\"\u0012\u0006\u0012\u0004\u0018\u00010#0!8@X\u0080\u0004ø\u0001\u0000¢\u0006\u0006\u001a\u0004\b$\u0010%R\u0014\u0010)\u001a\u00020\u00078@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b'\u0010(\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006,"}, m28432d2 = {"LHh0;", "T", "LBA1;", "LEu1;", "i", "Lkotlin/coroutines/CoroutineContext;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "capacity", "Lk30;", "onBufferOverflow", "c", "h", "Ln74;", Action.SCOPE_ATTRIBUTE, "", "g", "(Ln74;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "LZC0;", "Lks4;", "l", "LGu1;", "collector", "collect", "(LGu1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "e", "toString", "b", "Lkotlin/coroutines/CoroutineContext;", "I", DateTokenConverter.CONVERTER_KEY, "Lk30;", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "", "j", "()Lkotlin/jvm/functions/Function2;", "collectToFun", "k", "()I", "produceCapacity", "<init>", "(Lkotlin/coroutines/CoroutineContext;ILk30;)V", "kotlinx-coroutines-core"}, m28431k = 1, m28430mv = {1, 6, 0})
/* renamed from: Hh0  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC33314Hh0<T> implements BA1<T> {
    @JvmField

    /* renamed from: b */
    public final CoroutineContext f13760b;
    @JvmField

    /* renamed from: c */
    public final int f13761c;
    @JvmField

    /* renamed from: d */
    public final EnumC43674k30 f13762d;

    @Metadata(m28433d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@"}, m28432d2 = {"T", "LZC0;", "", "<anonymous>"}, m28431k = 3, m28430mv = {1, 6, 0})
    @DebugMetadata(m28419c = "kotlinx.coroutines.flow.internal.ChannelFlow$collect$2", m28418f = "ChannelFlow.kt", m28417i = {}, m28416l = {123}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
    /* renamed from: Hh0$a */
    /* loaded from: classes8.dex */
    public static final class C3208a extends SuspendLambda implements Function2<ZC0, Continuation<? super Unit>, Object> {

        /* renamed from: h */
        public int f13763h;

        /* renamed from: i */
        public /* synthetic */ Object f13764i;

        /* renamed from: j */
        public final /* synthetic */ InterfaceC33198Gu1<T> f13765j;

        /* renamed from: k */
        public final /* synthetic */ AbstractC33314Hh0<T> f13766k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C3208a(InterfaceC33198Gu1<? super T> interfaceC33198Gu1, AbstractC33314Hh0<T> abstractC33314Hh0, Continuation<? super C3208a> continuation) {
            super(2, continuation);
            this.f13765j = interfaceC33198Gu1;
            this.f13766k = abstractC33314Hh0;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C3208a c3208a = new C3208a(this.f13765j, this.f13766k, continuation);
            c3208a.f13764i = obj;
            return c3208a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ZC0 zc0, Continuation<? super Unit> continuation) {
            return ((C3208a) create(zc0, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended;
            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f13763h;
            if (i != 0) {
                if (i == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                InterfaceC33198Gu1<T> interfaceC33198Gu1 = this.f13765j;
                InterfaceC44162ks4<T> mo98515l = this.f13766k.mo98515l((ZC0) this.f13764i);
                this.f13763h = 1;
                if (C36708Vu1.m79251t(interfaceC33198Gu1, mo98515l, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001H\u008a@"}, m28432d2 = {"T", "Ln74;", "it", "", "<anonymous>"}, m28431k = 3, m28430mv = {1, 6, 0})
    @DebugMetadata(m28419c = "kotlinx.coroutines.flow.internal.ChannelFlow$collectToFun$1", m28418f = "ChannelFlow.kt", m28417i = {}, m28416l = {60}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
    /* renamed from: Hh0$b */
    /* loaded from: classes8.dex */
    public static final class C3209b extends SuspendLambda implements Function2<InterfaceC45497n74<? super T>, Continuation<? super Unit>, Object> {

        /* renamed from: h */
        public int f13767h;

        /* renamed from: i */
        public /* synthetic */ Object f13768i;

        /* renamed from: j */
        public final /* synthetic */ AbstractC33314Hh0<T> f13769j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C3209b(AbstractC33314Hh0<T> abstractC33314Hh0, Continuation<? super C3209b> continuation) {
            super(2, continuation);
            this.f13769j = abstractC33314Hh0;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C3209b c3209b = new C3209b(this.f13769j, continuation);
            c3209b.f13768i = obj;
            return c3209b;
        }

        public final Object invoke(InterfaceC45497n74<? super T> interfaceC45497n74, Continuation<? super Unit> continuation) {
            return ((C3209b) create(interfaceC45497n74, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended;
            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f13767h;
            if (i != 0) {
                if (i == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                AbstractC33314Hh0<T> abstractC33314Hh0 = this.f13769j;
                this.f13767h = 1;
                if (abstractC33314Hh0.mo96437g((InterfaceC45497n74) this.f13768i, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Continuation<? super Unit> continuation) {
            return invoke((InterfaceC45497n74) ((InterfaceC45497n74) obj), continuation);
        }
    }

    public AbstractC33314Hh0(CoroutineContext coroutineContext, int i, EnumC43674k30 enumC43674k30) {
        this.f13760b = coroutineContext;
        this.f13761c = i;
        this.f13762d = enumC43674k30;
    }

    /* renamed from: f */
    public static /* synthetic */ Object m103530f(AbstractC33314Hh0 abstractC33314Hh0, InterfaceC33198Gu1 interfaceC33198Gu1, Continuation continuation) {
        Object coroutine_suspended;
        Object m71786e = C37824aD0.m71786e(new C3208a(interfaceC33198Gu1, abstractC33314Hh0, null), continuation);
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        return m71786e == coroutine_suspended ? m71786e : Unit.INSTANCE;
    }

    @Override // p000.BA1
    /* renamed from: c */
    public InterfaceC32730Eu1<T> mo10356c(CoroutineContext coroutineContext, int i, EnumC43674k30 enumC43674k30) {
        CoroutineContext plus = coroutineContext.plus(this.f13760b);
        if (enumC43674k30 == EnumC43674k30.SUSPEND) {
            int i2 = this.f13761c;
            if (i2 != -3) {
                if (i != -3) {
                    if (i2 != -2) {
                        if (i != -2 && (i2 = i2 + i) < 0) {
                            i = Integer.MAX_VALUE;
                        }
                    }
                }
                i = i2;
            }
            enumC43674k30 = this.f13762d;
        }
        if (Intrinsics.areEqual(plus, this.f13760b) && i == this.f13761c && enumC43674k30 == this.f13762d) {
            return this;
        }
        return mo93575h(plus, i, enumC43674k30);
    }

    @Override // p000.InterfaceC32730Eu1
    public Object collect(InterfaceC33198Gu1<? super T> interfaceC33198Gu1, Continuation<? super Unit> continuation) {
        return m103530f(this, interfaceC33198Gu1, continuation);
    }

    /* renamed from: e */
    public String mo98516e() {
        return null;
    }

    /* renamed from: g */
    public abstract Object mo96437g(InterfaceC45497n74<? super T> interfaceC45497n74, Continuation<? super Unit> continuation);

    /* renamed from: h */
    public abstract AbstractC33314Hh0<T> mo93575h(CoroutineContext coroutineContext, int i, EnumC43674k30 enumC43674k30);

    /* renamed from: i */
    public InterfaceC32730Eu1<T> mo95047i() {
        return null;
    }

    /* renamed from: j */
    public final Function2<InterfaceC45497n74<? super T>, Continuation<? super Unit>, Object> m103529j() {
        return new C3209b(this, null);
    }

    /* renamed from: k */
    public final int m103528k() {
        int i = this.f13761c;
        if (i == -3) {
            return -2;
        }
        return i;
    }

    /* renamed from: l */
    public InterfaceC44162ks4<T> mo98515l(ZC0 zc0) {
        return C43125j74.m31069d(zc0, this.f13760b, m103528k(), this.f13762d, EnumC38417bD0.ATOMIC, null, m103529j(), 16, null);
    }

    public String toString() {
        String joinToString$default;
        ArrayList arrayList = new ArrayList(4);
        String mo98516e = mo98516e();
        if (mo98516e != null) {
            arrayList.add(mo98516e);
        }
        if (this.f13760b != EmptyCoroutineContext.INSTANCE) {
            arrayList.add("context=" + this.f13760b);
        }
        if (this.f13761c != -3) {
            arrayList.add("capacity=" + this.f13761c);
        }
        if (this.f13762d != EnumC43674k30.SUSPEND) {
            arrayList.add("onBufferOverflow=" + this.f13762d);
        }
        StringBuilder sb = new StringBuilder();
        sb.append(C39783dV0.m44216a(this));
        sb.append('[');
        joinToString$default = CollectionsKt___CollectionsKt.joinToString$default(arrayList, ", ", null, null, 0, null, null, 62, null);
        sb.append(joinToString$default);
        sb.append(']');
        return sb.toString();
    }
}
