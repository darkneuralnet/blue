package p000;

import com.facebook.share.internal.C17296a;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.collections.IndexedValue;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import p000.InterfaceC52463ys5;
@Metadata(m28433d1 = {"\u00008\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0092\u0001\u0010\u000e\u001a\u00020\n\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0014\u0010\u0005\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u00028\u00010\u00040\u00032\u0016\u0010\u0007\u001a\u0012\u0012\u000e\u0012\f\u0012\u0006\u0012\u0004\u0018\u00018\u0001\u0018\u00010\u00030\u000629\u0010\r\u001a5\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\b¢\u0006\u0002\b\fH\u0081@ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000f*\u001c\b\u0002\u0010\u0011\"\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u00102\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u0010\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0012"}, m28432d2 = {"R", "T", "LGu1;", "", "LEu1;", "flows", "Lkotlin/Function0;", "arrayFactory", "Lkotlin/Function3;", "Lkotlin/coroutines/Continuation;", "", "", "Lkotlin/ExtensionFunctionType;", "transform", C17296a.f69688o, "(LGu1;[LEu1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function3;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlin/collections/IndexedValue;", "Update", "kotlinx-coroutines-core"}, m28431k = 2, m28430mv = {1, 6, 0})
/* renamed from: Rm0  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C35699Rm0 {

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u00020\u0002H\u008a@"}, m28432d2 = {"R", "T", "LZC0;", "", "<anonymous>"}, m28431k = 3, m28430mv = {1, 6, 0})
    @DebugMetadata(m28419c = "kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2", m28418f = "Combine.kt", m28417i = {0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2}, m28416l = {57, 79, 82}, m28415m = "invokeSuspend", m28414n = {"latestValues", "resultChannel", "lastReceivedEpoch", "remainingAbsentValues", "currentEpoch", "latestValues", "resultChannel", "lastReceivedEpoch", "remainingAbsentValues", "currentEpoch", "latestValues", "resultChannel", "lastReceivedEpoch", "remainingAbsentValues", "currentEpoch"}, m28413s = {"L$0", "L$1", "L$2", "I$0", "I$1", "L$0", "L$1", "L$2", "I$0", "I$1", "L$0", "L$1", "L$2", "I$0", "I$1"})
    /* renamed from: Rm0$a */
    /* loaded from: classes8.dex */
    public static final class C7270a extends SuspendLambda implements Function2<ZC0, Continuation<? super Unit>, Object> {

        /* renamed from: h */
        public Object f32560h;

        /* renamed from: i */
        public Object f32561i;

        /* renamed from: j */
        public int f32562j;

        /* renamed from: k */
        public int f32563k;

        /* renamed from: l */
        public int f32564l;

        /* renamed from: m */
        public /* synthetic */ Object f32565m;

        /* renamed from: n */
        public final /* synthetic */ InterfaceC32730Eu1<T>[] f32566n;

        /* renamed from: o */
        public final /* synthetic */ Function0<T[]> f32567o;

        /* renamed from: p */
        public final /* synthetic */ Function3<InterfaceC33198Gu1<? super R>, T[], Continuation<? super Unit>, Object> f32568p;

        /* renamed from: q */
        public final /* synthetic */ InterfaceC33198Gu1<R> f32569q;

        @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u00020\u0002H\u008a@"}, m28432d2 = {"R", "T", "LZC0;", "", "<anonymous>"}, m28431k = 3, m28430mv = {1, 6, 0})
        @DebugMetadata(m28419c = "kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2$1", m28418f = "Combine.kt", m28417i = {}, m28416l = {34}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
        /* renamed from: Rm0$a$a */
        /* loaded from: classes8.dex */
        public static final class C7271a extends SuspendLambda implements Function2<ZC0, Continuation<? super Unit>, Object> {

            /* renamed from: h */
            public int f32570h;

            /* renamed from: i */
            public final /* synthetic */ InterfaceC32730Eu1<T>[] f32571i;

            /* renamed from: j */
            public final /* synthetic */ int f32572j;

            /* renamed from: k */
            public final /* synthetic */ AtomicInteger f32573k;

            /* renamed from: l */
            public final /* synthetic */ InterfaceC32846Fh0<IndexedValue<Object>> f32574l;

            @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0006\u0010\u0004\u001a\u0002H\u0003H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"<anonymous>", "", "R", "T", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, m28431k = 3, m28430mv = {1, 6, 0}, m28428xi = 48)
            /* renamed from: Rm0$a$a$a */
            /* loaded from: classes8.dex */
            public static final class C7272a<T> implements InterfaceC33198Gu1 {

                /* renamed from: b */
                public final /* synthetic */ InterfaceC32846Fh0<IndexedValue<Object>> f32575b;

                /* renamed from: c */
                public final /* synthetic */ int f32576c;

                @Metadata(m28431k = 3, m28430mv = {1, 6, 0}, m28428xi = 48)
                @DebugMetadata(m28419c = "kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2$1$1", m28418f = "Combine.kt", m28417i = {}, m28416l = {35, 36}, m28415m = "emit", m28414n = {}, m28413s = {})
                /* renamed from: Rm0$a$a$a$a */
                /* loaded from: classes8.dex */
                public static final class C7273a extends ContinuationImpl {

                    /* renamed from: h */
                    public /* synthetic */ Object f32577h;

                    /* renamed from: i */
                    public final /* synthetic */ C7272a<T> f32578i;

                    /* renamed from: j */
                    public int f32579j;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    public C7273a(C7272a<? super T> c7272a, Continuation<? super C7273a> continuation) {
                        super(continuation);
                        this.f32578i = c7272a;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.f32577h = obj;
                        this.f32579j |= Integer.MIN_VALUE;
                        return this.f32578i.emit(null, this);
                    }
                }

                public C7272a(InterfaceC32846Fh0<IndexedValue<Object>> interfaceC32846Fh0, int i) {
                    this.f32575b = interfaceC32846Fh0;
                    this.f32576c = i;
                }

                /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
                /* JADX WARN: Removed duplicated region for block: B:16:0x0038  */
                /* JADX WARN: Removed duplicated region for block: B:21:0x0055 A[RETURN] */
                @Override // p000.InterfaceC33198Gu1
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(T t, Continuation<? super Unit> continuation) {
                    C7273a c7273a;
                    Object coroutine_suspended;
                    int i;
                    if (continuation instanceof C7273a) {
                        c7273a = (C7273a) continuation;
                        int i2 = c7273a.f32579j;
                        if ((i2 & Integer.MIN_VALUE) != 0) {
                            c7273a.f32579j = i2 - Integer.MIN_VALUE;
                            Object obj = c7273a.f32577h;
                            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            i = c7273a.f32579j;
                            if (i == 0) {
                                if (i != 1) {
                                    if (i == 2) {
                                        ResultKt.throwOnFailure(obj);
                                        return Unit.INSTANCE;
                                    }
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                ResultKt.throwOnFailure(obj);
                            } else {
                                ResultKt.throwOnFailure(obj);
                                InterfaceC32846Fh0<IndexedValue<Object>> interfaceC32846Fh0 = this.f32575b;
                                IndexedValue<Object> indexedValue = new IndexedValue<>(this.f32576c, t);
                                c7273a.f32579j = 1;
                                if (interfaceC32846Fh0.mo2351M(indexedValue, c7273a) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            }
                            c7273a.f32579j = 2;
                            if (C40857fI6.m41600a(c7273a) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            return Unit.INSTANCE;
                        }
                    }
                    c7273a = new C7273a(this, continuation);
                    Object obj2 = c7273a.f32577h;
                    coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = c7273a.f32579j;
                    if (i == 0) {
                    }
                    c7273a.f32579j = 2;
                    if (C40857fI6.m41600a(c7273a) == coroutine_suspended) {
                    }
                    return Unit.INSTANCE;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C7271a(InterfaceC32730Eu1<? extends T>[] interfaceC32730Eu1Arr, int i, AtomicInteger atomicInteger, InterfaceC32846Fh0<IndexedValue<Object>> interfaceC32846Fh0, Continuation<? super C7271a> continuation) {
                super(2, continuation);
                this.f32571i = interfaceC32730Eu1Arr;
                this.f32572j = i;
                this.f32573k = atomicInteger;
                this.f32574l = interfaceC32846Fh0;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C7271a(this.f32571i, this.f32572j, this.f32573k, this.f32574l, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(ZC0 zc0, Continuation<? super Unit> continuation) {
                return ((C7271a) create(zc0, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended;
                AtomicInteger atomicInteger;
                coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.f32570h;
                try {
                    if (i != 0) {
                        if (i == 1) {
                            ResultKt.throwOnFailure(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        ResultKt.throwOnFailure(obj);
                        InterfaceC32730Eu1[] interfaceC32730Eu1Arr = this.f32571i;
                        int i2 = this.f32572j;
                        InterfaceC32730Eu1 interfaceC32730Eu1 = interfaceC32730Eu1Arr[i2];
                        C7272a c7272a = new C7272a(this.f32574l, i2);
                        this.f32570h = 1;
                        if (interfaceC32730Eu1.collect(c7272a, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                    if (atomicInteger.decrementAndGet() == 0) {
                        InterfaceC52463ys5.C30763a.m2348a(this.f32574l, null, 1, null);
                    }
                    return Unit.INSTANCE;
                } finally {
                    if (this.f32573k.decrementAndGet() == 0) {
                        InterfaceC52463ys5.C30763a.m2348a(this.f32574l, null, 1, null);
                    }
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C7270a(InterfaceC32730Eu1<? extends T>[] interfaceC32730Eu1Arr, Function0<T[]> function0, Function3<? super InterfaceC33198Gu1<? super R>, ? super T[], ? super Continuation<? super Unit>, ? extends Object> function3, InterfaceC33198Gu1<? super R> interfaceC33198Gu1, Continuation<? super C7270a> continuation) {
            super(2, continuation);
            this.f32566n = interfaceC32730Eu1Arr;
            this.f32567o = function0;
            this.f32568p = function3;
            this.f32569q = interfaceC33198Gu1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C7270a c7270a = new C7270a(this.f32566n, this.f32567o, this.f32568p, this.f32569q, continuation);
            c7270a.f32565m = obj;
            return c7270a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ZC0 zc0, Continuation<? super Unit> continuation) {
            return ((C7270a) create(zc0, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:26:0x00e3  */
        /* JADX WARN: Removed duplicated region for block: B:28:0x00e6 A[LOOP:0: B:28:0x00e6->B:34:0x0109, LOOP_START, PHI: r6 r10 
          PHI: (r6v6 int) = (r6v5 int), (r6v7 int) binds: [B:25:0x00e1, B:34:0x0109] A[DONT_GENERATE, DONT_INLINE]
          PHI: (r10v8 kotlin.collections.IndexedValue) = (r10v7 kotlin.collections.IndexedValue), (r10v21 kotlin.collections.IndexedValue) binds: [B:25:0x00e1, B:34:0x0109] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Type inference failed for: r15v0, types: [Eu1[], Eu1<T>[]] */
        /* JADX WARN: Type inference failed for: r2v12, types: [int] */
        /* JADX WARN: Type inference failed for: r2v7, types: [int] */
        /* JADX WARN: Type inference failed for: r2v9, types: [int] */
        /* JADX WARN: Type inference failed for: r6v0, types: [Eu1<T>[]] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:41:0x012e -> B:20:0x00c3). Please submit an issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:47:0x0161 -> B:45:0x015d). Please submit an issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended;
            Object[] objArr;
            byte b;
            byte[] bArr;
            C7270a c7270a;
            int i;
            InterfaceC32846Fh0 interfaceC32846Fh0;
            byte b2;
            Object obj2;
            Object[] objArr2;
            IndexedValue indexedValue;
            byte b3;
            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f32564l;
            int i3 = 2;
            if (i2 != 0) {
                if (i2 != 1) {
                    if (i2 != 2) {
                        if (i2 == 3) {
                            ?? r2 = this.f32563k;
                            i = this.f32562j;
                            ResultKt.throwOnFailure(obj);
                            b = r2;
                            bArr = (byte[]) this.f32561i;
                            interfaceC32846Fh0 = (InterfaceC32846Fh0) this.f32560h;
                            objArr = (Object[]) this.f32565m;
                            c7270a = this;
                            i3 = 2;
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        ?? r22 = this.f32563k;
                        i = this.f32562j;
                        ResultKt.throwOnFailure(obj);
                        b = r22;
                        bArr = (byte[]) this.f32561i;
                        interfaceC32846Fh0 = (InterfaceC32846Fh0) this.f32560h;
                        objArr = (Object[]) this.f32565m;
                        c7270a = this;
                    }
                } else {
                    ?? r23 = this.f32563k;
                    i = this.f32562j;
                    objArr2 = (Object[]) this.f32565m;
                    ResultKt.throwOnFailure(obj);
                    obj2 = ((C35420Qh0) obj).m88178l();
                    b2 = r23;
                    bArr = (byte[]) this.f32561i;
                    interfaceC32846Fh0 = (InterfaceC32846Fh0) this.f32560h;
                    c7270a = this;
                    indexedValue = (IndexedValue) C35420Qh0.m88184f(obj2);
                    if (indexedValue != null) {
                        return Unit.INSTANCE;
                    }
                    do {
                        int index = indexedValue.getIndex();
                        Object obj3 = objArr2[index];
                        objArr2[index] = indexedValue.getValue();
                        if (obj3 == C46976pd3.f103864b) {
                            i--;
                        }
                        if (bArr[index] == b2) {
                            break;
                        }
                        bArr[index] = b2;
                        indexedValue = (IndexedValue) C35420Qh0.m88184f(interfaceC32846Fh0.mo28254l());
                    } while (indexedValue != null);
                    if (i == 0) {
                        Object[] objArr3 = (Object[]) c7270a.f32567o.invoke();
                        if (objArr3 == null) {
                            Function3 function3 = c7270a.f32568p;
                            Object obj4 = c7270a.f32569q;
                            c7270a.f32565m = objArr2;
                            c7270a.f32560h = interfaceC32846Fh0;
                            c7270a.f32561i = bArr;
                            c7270a.f32562j = i;
                            c7270a.f32563k = b2;
                            c7270a.f32564l = i3;
                            if (function3.invoke(obj4, objArr2, c7270a) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            objArr = objArr2;
                            b = b2;
                        } else {
                            b3 = b2;
                            ArraysKt___ArraysJvmKt.copyInto$default(objArr2, objArr3, 0, 0, 0, 14, (Object) null);
                            Function3 function32 = c7270a.f32568p;
                            Object obj5 = c7270a.f32569q;
                            c7270a.f32565m = objArr2;
                            c7270a.f32560h = interfaceC32846Fh0;
                            c7270a.f32561i = bArr;
                            c7270a.f32562j = i;
                            c7270a.f32563k = b3;
                            c7270a.f32564l = 3;
                            if (function32.invoke(obj5, objArr3, c7270a) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        }
                    } else {
                        b3 = b2;
                    }
                    b = b3;
                    objArr = objArr2;
                    i3 = 2;
                }
            } else {
                ResultKt.throwOnFailure(obj);
                ZC0 zc0 = (ZC0) this.f32565m;
                int length = this.f32566n.length;
                if (length == 0) {
                    return Unit.INSTANCE;
                }
                objArr = new Object[length];
                ArraysKt___ArraysJvmKt.fill$default(objArr, C46976pd3.f103864b, 0, 0, 6, (Object) null);
                InterfaceC32846Fh0 m89918b = C35186Ph0.m89918b(length, null, null, 6, null);
                AtomicInteger atomicInteger = new AtomicInteger(length);
                b = 0;
                int i4 = 0;
                while (i4 < length) {
                    int i5 = i4;
                    Z30.m73800d(zc0, null, null, new C7271a(this.f32566n, i5, atomicInteger, m89918b, null), 3, null);
                    i4 = i5 + 1;
                    atomicInteger = atomicInteger;
                }
                bArr = new byte[length];
                c7270a = this;
                i = length;
                interfaceC32846Fh0 = m89918b;
            }
            byte b4 = (byte) (b + 1);
            c7270a.f32565m = objArr;
            c7270a.f32560h = interfaceC32846Fh0;
            c7270a.f32561i = bArr;
            c7270a.f32562j = i;
            c7270a.f32563k = b4;
            c7270a.f32564l = 1;
            obj2 = interfaceC32846Fh0.mo28253s(c7270a);
            if (obj2 == coroutine_suspended) {
                return coroutine_suspended;
            }
            b2 = b4;
            objArr2 = objArr;
            indexedValue = (IndexedValue) C35420Qh0.m88184f(obj2);
            if (indexedValue != null) {
            }
        }
    }

    @PublishedApi
    /* renamed from: a */
    public static final <R, T> Object m86325a(InterfaceC33198Gu1<? super R> interfaceC33198Gu1, InterfaceC32730Eu1<? extends T>[] interfaceC32730Eu1Arr, Function0<T[]> function0, Function3<? super InterfaceC33198Gu1<? super R>, ? super T[], ? super Continuation<? super Unit>, ? extends Object> function3, Continuation<? super Unit> continuation) {
        Object coroutine_suspended;
        Object m91197a = C35070Ou1.m91197a(new C7270a(interfaceC32730Eu1Arr, function0, function3, interfaceC33198Gu1, null), continuation);
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        return m91197a == coroutine_suspended ? m91197a : Unit.INSTANCE;
    }
}
