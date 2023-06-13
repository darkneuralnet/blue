package p000;

import ch.qos.logback.core.CoreConstants;
import com.amazonaws.services.p026s3.internal.Constants;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00020\u00030\u00022\b\u0012\u0004\u0012\u00028\u00000\u00042\b\u0012\u0004\u0012\u00028\u00000\u00052\b\u0012\u0004\u0012\u00028\u00000\u0006B\u000f\u0012\u0006\u00103\u001a\u00020\u0005¢\u0006\u0004\b4\u00101J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00028\u00002\u0006\u0010\b\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\t2\u0006\u0010\f\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001b\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J!\u0010\u0017\u001a\u00020\u00162\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u0014H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0003H\u0014¢\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010\u001e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u001d2\u0006\u0010\u001c\u001a\u00020\u001bH\u0014¢\u0006\u0004\b\u001e\u0010\u001fJ-\u0010&\u001a\b\u0012\u0004\u0012\u00028\u00000%2\u0006\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020\u001b2\u0006\u0010$\u001a\u00020#H\u0016¢\u0006\u0004\b&\u0010'J!\u0010*\u001a\u00020\t2\b\u0010(\u001a\u0004\u0018\u00010\u00052\u0006\u0010)\u001a\u00020\u0005H\u0002¢\u0006\u0004\b*\u0010\u000bR\u0016\u0010-\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010,R*\u0010\f\u001a\u00028\u00002\u0006\u0010\f\u001a\u00028\u00008V@VX\u0096\u000e¢\u0006\u0012\u0012\u0004\b2\u0010\u0013\u001a\u0004\b.\u0010/\"\u0004\b0\u00101\u0082\u0002\u0004\n\u0002\b\u0019¨\u00065"}, m28432d2 = {"LuP5;", "T", "Lo1;", "LwP5;", "LGX2;", "", "LBA1;", "expect", "update", "", "compareAndSet", "(Ljava/lang/Object;Ljava/lang/Object;)Z", "value", "b", "(Ljava/lang/Object;)Z", "", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", C17296a.f69688o, "()V", "LGu1;", "collector", "", "collect", "(LGu1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "m", "()LwP5;", "", "size", "", "n", "(I)[LwP5;", "Lkotlin/coroutines/CoroutineContext;", CoreConstants.CONTEXT_SCOPE_VALUE, "capacity", "Lk30;", "onBufferOverflow", "LEu1;", "c", "(Lkotlin/coroutines/CoroutineContext;ILk30;)LEu1;", "expectedState", "newState", "o", "f", "I", "sequence", "getValue", "()Ljava/lang/Object;", "setValue", "(Ljava/lang/Object;)V", "getValue$annotations", "initialState", "<init>", "kotlinx-coroutines-core"}, m28431k = 1, m28430mv = {1, 6, 0})
/* renamed from: uP5  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C49813uP5<T> extends AbstractC26786o1<C50998wP5> implements GX2<T>, InterfaceC32730Eu1, BA1<T> {
    private volatile /* synthetic */ Object _state;

    /* renamed from: f */
    public int f112315f;

    @Metadata(m28431k = 3, m28430mv = {1, 6, 0}, m28428xi = 48)
    @DebugMetadata(m28419c = "kotlinx.coroutines.flow.StateFlowImpl", m28418f = "StateFlow.kt", m28417i = {0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2}, m28416l = {386, 398, Constants.BUCKET_ACCESS_FORBIDDEN_STATUS_CODE}, m28415m = "collect", m28414n = {"this", "collector", "slot", "this", "collector", "slot", "collectorJob", "newState", "this", "collector", "slot", "collectorJob", "oldState"}, m28413s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$3", "L$4", "L$0", "L$1", "L$2", "L$3", "L$4"})
    /* renamed from: uP5$a */
    /* loaded from: classes8.dex */
    public static final class C29190a extends ContinuationImpl {

        /* renamed from: h */
        public Object f112316h;

        /* renamed from: i */
        public Object f112317i;

        /* renamed from: j */
        public Object f112318j;

        /* renamed from: k */
        public Object f112319k;

        /* renamed from: l */
        public Object f112320l;

        /* renamed from: m */
        public /* synthetic */ Object f112321m;

        /* renamed from: n */
        public final /* synthetic */ C49813uP5<T> f112322n;

        /* renamed from: o */
        public int f112323o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C29190a(C49813uP5<T> c49813uP5, Continuation<? super C29190a> continuation) {
            super(continuation);
            this.f112322n = c49813uP5;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f112321m = obj;
            this.f112323o |= Integer.MIN_VALUE;
            return this.f112322n.collect(null, this);
        }
    }

    public C49813uP5(Object obj) {
        this._state = obj;
    }

    @Override // p000.BX2
    /* renamed from: a */
    public void mo10358a() {
        throw new UnsupportedOperationException("MutableStateFlow.resetReplayCache is not supported");
    }

    @Override // p000.BX2
    /* renamed from: b */
    public boolean mo10357b(T t) {
        setValue(t);
        return true;
    }

    @Override // p000.BA1
    /* renamed from: c */
    public InterfaceC32730Eu1<T> mo10356c(CoroutineContext coroutineContext, int i, EnumC43674k30 enumC43674k30) {
        return C50405vP5.m8739d(this, coroutineContext, i, enumC43674k30);
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x00b3, code lost:
        if (kotlin.jvm.internal.Intrinsics.areEqual(r11, r12) == false) goto L26;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00aa A[Catch: all -> 0x0073, TryCatch #0 {all -> 0x0073, blocks: (B:14:0x003e, B:34:0x00a6, B:36:0x00aa, B:38:0x00af, B:48:0x00d0, B:50:0x00d6, B:40:0x00b5, B:44:0x00bc, B:19:0x005c, B:22:0x006f, B:33:0x0097), top: B:57:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00af A[Catch: all -> 0x0073, TryCatch #0 {all -> 0x0073, blocks: (B:14:0x003e, B:34:0x00a6, B:36:0x00aa, B:38:0x00af, B:48:0x00d0, B:50:0x00d6, B:40:0x00b5, B:44:0x00bc, B:19:0x005c, B:22:0x006f, B:33:0x0097), top: B:57:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00ce A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00d6 A[Catch: all -> 0x0073, TRY_LEAVE, TryCatch #0 {all -> 0x0073, blocks: (B:14:0x003e, B:34:0x00a6, B:36:0x00aa, B:38:0x00af, B:48:0x00d0, B:50:0x00d6, B:40:0x00b5, B:44:0x00bc, B:19:0x005c, B:22:0x006f, B:33:0x0097), top: B:57:0x0024 }] */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v2, types: [q1] */
    /* JADX WARN: Type inference failed for: r6v7, types: [java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:49:0x00d4 -> B:34:0x00a6). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:51:0x00e6 -> B:34:0x00a6). Please submit an issue!!! */
    @Override // p000.InterfaceC36280Ty5, p000.InterfaceC32730Eu1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object collect(InterfaceC33198Gu1<? super T> interfaceC33198Gu1, Continuation<?> continuation) {
        C29190a c29190a;
        Object coroutine_suspended;
        int i;
        C49813uP5<T> c49813uP5;
        C50998wP5 c50998wP5;
        InterfaceC33198Gu1 interfaceC33198Gu12;
        InterfaceC52943zh2 interfaceC52943zh2;
        Object obj;
        InterfaceC33198Gu1<? super T> interfaceC33198Gu13;
        C50998wP5 c50998wP52;
        boolean m6866g;
        Object obj2;
        Object obj3;
        try {
            if (continuation instanceof C29190a) {
                c29190a = (C29190a) continuation;
                int i2 = c29190a.f112323o;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    c29190a.f112323o = i2 - Integer.MIN_VALUE;
                    Object obj4 = c29190a.f112321m;
                    coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = c29190a.f112323o;
                    C50998wP5 c50998wP53 = 1;
                    if (i == 0) {
                        if (i != 1) {
                            if (i != 2) {
                                if (i == 3) {
                                    obj = c29190a.f112320l;
                                    interfaceC52943zh2 = (InterfaceC52943zh2) c29190a.f112319k;
                                    C50998wP5 c50998wP54 = (C50998wP5) c29190a.f112318j;
                                    InterfaceC33198Gu1 interfaceC33198Gu14 = (InterfaceC33198Gu1) c29190a.f112317i;
                                    c49813uP5 = (C49813uP5) c29190a.f112316h;
                                    ResultKt.throwOnFailure(obj4);
                                    c50998wP53 = c50998wP54;
                                    interfaceC33198Gu12 = interfaceC33198Gu14;
                                    obj2 = c49813uP5._state;
                                    if (interfaceC52943zh2 != null) {
                                        C34018Kh2.m98500l(interfaceC52943zh2);
                                    }
                                    if (obj != null) {
                                        c50998wP52 = c50998wP53;
                                        interfaceC33198Gu13 = interfaceC33198Gu12;
                                    }
                                    if (obj2 == C46976pd3.f103863a) {
                                        obj3 = null;
                                    } else {
                                        obj3 = obj2;
                                    }
                                    c29190a.f112316h = c49813uP5;
                                    c29190a.f112317i = interfaceC33198Gu12;
                                    c29190a.f112318j = c50998wP53;
                                    c29190a.f112319k = interfaceC52943zh2;
                                    c29190a.f112320l = obj2;
                                    c29190a.f112323o = 2;
                                    if (interfaceC33198Gu12.emit(obj3, c29190a) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                    obj = obj2;
                                    c50998wP52 = c50998wP53;
                                    interfaceC33198Gu13 = interfaceC33198Gu12;
                                    m6866g = c50998wP52.m6866g();
                                    c50998wP53 = c50998wP52;
                                    interfaceC33198Gu12 = interfaceC33198Gu13;
                                    if (!m6866g) {
                                        c29190a.f112316h = c49813uP5;
                                        c29190a.f112317i = interfaceC33198Gu13;
                                        c29190a.f112318j = c50998wP52;
                                        c29190a.f112319k = interfaceC52943zh2;
                                        c29190a.f112320l = obj;
                                        c29190a.f112323o = 3;
                                        Object m6869d = c50998wP52.m6869d(c29190a);
                                        c50998wP53 = c50998wP52;
                                        interfaceC33198Gu12 = interfaceC33198Gu13;
                                        if (m6869d == coroutine_suspended) {
                                            return coroutine_suspended;
                                        }
                                    }
                                    obj2 = c49813uP5._state;
                                    if (interfaceC52943zh2 != null) {
                                    }
                                    if (obj != null) {
                                    }
                                    if (obj2 == C46976pd3.f103863a) {
                                    }
                                    c29190a.f112316h = c49813uP5;
                                    c29190a.f112317i = interfaceC33198Gu12;
                                    c29190a.f112318j = c50998wP53;
                                    c29190a.f112319k = interfaceC52943zh2;
                                    c29190a.f112320l = obj2;
                                    c29190a.f112323o = 2;
                                    if (interfaceC33198Gu12.emit(obj3, c29190a) == coroutine_suspended) {
                                    }
                                } else {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                            } else {
                                obj = c29190a.f112320l;
                                interfaceC52943zh2 = (InterfaceC52943zh2) c29190a.f112319k;
                                C50998wP5 c50998wP55 = (C50998wP5) c29190a.f112318j;
                                InterfaceC33198Gu1<? super T> interfaceC33198Gu15 = (InterfaceC33198Gu1) c29190a.f112317i;
                                c49813uP5 = (C49813uP5) c29190a.f112316h;
                                ResultKt.throwOnFailure(obj4);
                                c50998wP52 = c50998wP55;
                                interfaceC33198Gu13 = interfaceC33198Gu15;
                                m6866g = c50998wP52.m6866g();
                                c50998wP53 = c50998wP52;
                                interfaceC33198Gu12 = interfaceC33198Gu13;
                                if (!m6866g) {
                                }
                                obj2 = c49813uP5._state;
                                if (interfaceC52943zh2 != null) {
                                }
                                if (obj != null) {
                                }
                                if (obj2 == C46976pd3.f103863a) {
                                }
                                c29190a.f112316h = c49813uP5;
                                c29190a.f112317i = interfaceC33198Gu12;
                                c29190a.f112318j = c50998wP53;
                                c29190a.f112319k = interfaceC52943zh2;
                                c29190a.f112320l = obj2;
                                c29190a.f112323o = 2;
                                if (interfaceC33198Gu12.emit(obj3, c29190a) == coroutine_suspended) {
                                }
                            }
                        } else {
                            c50998wP5 = (C50998wP5) c29190a.f112318j;
                            interfaceC33198Gu1 = (InterfaceC33198Gu1) c29190a.f112317i;
                            c49813uP5 = (C49813uP5) c29190a.f112316h;
                            ResultKt.throwOnFailure(obj4);
                        }
                    } else {
                        ResultKt.throwOnFailure(obj4);
                        C50998wP5 m21989g = m21989g();
                        try {
                            if (interfaceC33198Gu1 instanceof C41548gT5) {
                                c29190a.f112316h = this;
                                c29190a.f112317i = interfaceC33198Gu1;
                                c29190a.f112318j = m21989g;
                                c29190a.f112323o = 1;
                                if (((C41548gT5) interfaceC33198Gu1).m39364c(c29190a) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            }
                            c49813uP5 = this;
                            c50998wP5 = m21989g;
                        } catch (Throwable th) {
                            th = th;
                            c49813uP5 = this;
                            c50998wP53 = m21989g;
                            c49813uP5.m21988j(c50998wP53);
                            throw th;
                        }
                    }
                    interfaceC33198Gu12 = interfaceC33198Gu1;
                    interfaceC52943zh2 = (InterfaceC52943zh2) c29190a.getContext().get(InterfaceC52943zh2.f122077a0);
                    obj = null;
                    c50998wP53 = c50998wP5;
                    obj2 = c49813uP5._state;
                    if (interfaceC52943zh2 != null) {
                    }
                    if (obj != null) {
                    }
                    if (obj2 == C46976pd3.f103863a) {
                    }
                    c29190a.f112316h = c49813uP5;
                    c29190a.f112317i = interfaceC33198Gu12;
                    c29190a.f112318j = c50998wP53;
                    c29190a.f112319k = interfaceC52943zh2;
                    c29190a.f112320l = obj2;
                    c29190a.f112323o = 2;
                    if (interfaceC33198Gu12.emit(obj3, c29190a) == coroutine_suspended) {
                    }
                }
            }
            if (i == 0) {
            }
            interfaceC33198Gu12 = interfaceC33198Gu1;
            interfaceC52943zh2 = (InterfaceC52943zh2) c29190a.getContext().get(InterfaceC52943zh2.f122077a0);
            obj = null;
            c50998wP53 = c50998wP5;
            obj2 = c49813uP5._state;
            if (interfaceC52943zh2 != null) {
            }
            if (obj != null) {
            }
            if (obj2 == C46976pd3.f103863a) {
            }
            c29190a.f112316h = c49813uP5;
            c29190a.f112317i = interfaceC33198Gu12;
            c29190a.f112318j = c50998wP53;
            c29190a.f112319k = interfaceC52943zh2;
            c29190a.f112320l = obj2;
            c29190a.f112323o = 2;
            if (interfaceC33198Gu12.emit(obj3, c29190a) == coroutine_suspended) {
            }
        } catch (Throwable th2) {
            th = th2;
        }
        c29190a = new C29190a(this, continuation);
        Object obj42 = c29190a.f112321m;
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = c29190a.f112323o;
        C50998wP5 c50998wP532 = 1;
    }

    @Override // p000.GX2
    public boolean compareAndSet(T t, T t2) {
        if (t == null) {
            t = (T) C46976pd3.f103863a;
        }
        if (t2 == null) {
            t2 = (T) C46976pd3.f103863a;
        }
        return m10351o(t, t2);
    }

    @Override // p000.BX2, p000.InterfaceC33198Gu1
    public Object emit(T t, Continuation<? super Unit> continuation) {
        setValue(t);
        return Unit.INSTANCE;
    }

    @Override // p000.GX2, p000.InterfaceC49220tP5
    public T getValue() {
        C49885uX5 c49885uX5 = C46976pd3.f103863a;
        T t = (T) this._state;
        if (t == c49885uX5) {
            return null;
        }
        return t;
    }

    @Override // p000.AbstractC26786o1
    /* renamed from: m */
    public C50998wP5 mo10355h() {
        return new C50998wP5();
    }

    @Override // p000.AbstractC26786o1
    /* renamed from: n */
    public C50998wP5[] mo10354i(int i) {
        return new C50998wP5[i];
    }

    /* renamed from: o */
    public final boolean m10351o(Object obj, Object obj2) {
        int i;
        C50998wP5[] m21986l;
        m21986l();
        synchronized (this) {
            Object obj3 = this._state;
            if (obj != null && !Intrinsics.areEqual(obj3, obj)) {
                return false;
            }
            if (Intrinsics.areEqual(obj3, obj2)) {
                return true;
            }
            this._state = obj2;
            int i2 = this.f112315f;
            if ((i2 & 1) == 0) {
                int i3 = i2 + 1;
                this.f112315f = i3;
                C50998wP5[] m21986l2 = m21986l();
                Unit unit = Unit.INSTANCE;
                while (true) {
                    C50998wP5[] c50998wP5Arr = m21986l2;
                    if (c50998wP5Arr != null) {
                        for (C50998wP5 c50998wP5 : c50998wP5Arr) {
                            if (c50998wP5 != null) {
                                c50998wP5.m6867f();
                            }
                        }
                    }
                    synchronized (this) {
                        i = this.f112315f;
                        if (i == i3) {
                            this.f112315f = i3 + 1;
                            return true;
                        }
                        m21986l = m21986l();
                        Unit unit2 = Unit.INSTANCE;
                    }
                    m21986l2 = m21986l;
                    i3 = i;
                }
            } else {
                this.f112315f = i2 + 2;
                return true;
            }
        }
    }

    @Override // p000.GX2
    public void setValue(T t) {
        if (t == null) {
            t = (T) C46976pd3.f103863a;
        }
        m10351o(null, t);
    }
}
