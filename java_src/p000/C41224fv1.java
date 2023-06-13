package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import com.stripe.android.financialconnections.p041ui.FinancialConnectionsSheetNativeActivity;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.InlineMarker;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.flow.internal.AbortFlowException;
@Metadata(m28433d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0000\n\u0002\b\u0006\u001a#\u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001aG\u0010\t\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\"\u0010\b\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0004H\u0086@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\n\u001a%\u0010\u000b\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\u0003\u001aI\u0010\f\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\"\u0010\b\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0004H\u0086@ø\u0001\u0000¢\u0006\u0004\b\f\u0010\n\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\r"}, m28432d2 = {"T", "LEu1;", C17296a.f69688o, "(LEu1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "", "", "predicate", "b", "(LEu1;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "c", DateTokenConverter.CONVERTER_KEY, "kotlinx-coroutines-core"}, m28431k = 5, m28430mv = {1, 6, 0}, m28427xs = "kotlinx/coroutines/flow/FlowKt")
/* renamed from: fv1  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final /* synthetic */ class C41224fv1 {

    @Metadata(m28433d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001b\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0006"}, m28432d2 = {"fv1$a", "LGu1;", "value", "", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m28431k = 1, m28430mv = {1, 6, 0})
    /* renamed from: fv1$a */
    /* loaded from: classes8.dex */
    public static final class C20622a implements InterfaceC33198Gu1<T> {

        /* renamed from: b */
        public final /* synthetic */ Ref.ObjectRef f81060b;

        public C20622a(Ref.ObjectRef objectRef) {
            this.f81060b = objectRef;
        }

        @Override // p000.InterfaceC33198Gu1
        public Object emit(T t, Continuation<? super Unit> continuation) {
            this.f81060b.element = t;
            throw new AbortFlowException(this);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001b\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0006"}, m28432d2 = {"fv1$b", "LGu1;", "value", "", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m28431k = 1, m28430mv = {1, 6, 0})
    /* renamed from: fv1$b */
    /* loaded from: classes8.dex */
    public static final class C20623b implements InterfaceC33198Gu1<T> {

        /* renamed from: b */
        public final /* synthetic */ Function2 f81061b;

        /* renamed from: c */
        public final /* synthetic */ Ref.ObjectRef f81062c;

        @Metadata(m28431k = 3, m28430mv = {1, 6, 0}, m28428xi = 48)
        @DebugMetadata(m28419c = "kotlinx.coroutines.flow.FlowKt__ReduceKt$first$$inlined$collectWhile$2", m28418f = "Reduce.kt", m28417i = {0, 0}, m28416l = {142}, m28415m = "emit", m28414n = {"this", "it"}, m28413s = {"L$0", "L$1"})
        /* renamed from: fv1$b$a */
        /* loaded from: classes8.dex */
        public static final class C20624a extends ContinuationImpl {

            /* renamed from: h */
            public Object f81063h;

            /* renamed from: i */
            public /* synthetic */ Object f81064i;

            /* renamed from: j */
            public int f81065j;

            /* renamed from: l */
            public Object f81067l;

            public C20624a(Continuation continuation) {
                super(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                this.f81064i = obj;
                this.f81065j |= Integer.MIN_VALUE;
                return C20623b.this.emit(null, this);
            }
        }

        public C20623b(Function2 function2, Ref.ObjectRef objectRef) {
            this.f81061b = function2;
            this.f81062c = objectRef;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
        /* JADX WARN: Removed duplicated region for block: B:14:0x0037  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x005a  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0061  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x0064  */
        @Override // p000.InterfaceC33198Gu1
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Object emit(T t, Continuation<? super Unit> continuation) {
            C20624a c20624a;
            Object obj;
            Object coroutine_suspended;
            int i;
            boolean z;
            C20623b c20623b;
            T t2;
            if (continuation instanceof C20624a) {
                c20624a = (C20624a) continuation;
                int i2 = c20624a.f81065j;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    c20624a.f81065j = i2 - Integer.MIN_VALUE;
                    obj = c20624a.f81064i;
                    coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = c20624a.f81065j;
                    z = true;
                    if (i == 0) {
                        if (i == 1) {
                            Object obj2 = c20624a.f81067l;
                            c20623b = (C20623b) c20624a.f81063h;
                            ResultKt.throwOnFailure(obj);
                            t2 = obj2;
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        ResultKt.throwOnFailure(obj);
                        Function2 function2 = this.f81061b;
                        c20624a.f81063h = this;
                        c20624a.f81067l = t;
                        c20624a.f81065j = 1;
                        InlineMarker.mark(6);
                        obj = function2.invoke(t, c20624a);
                        InlineMarker.mark(7);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        c20623b = this;
                        t2 = t;
                    }
                    if (((Boolean) obj).booleanValue()) {
                        c20623b.f81062c.element = t2;
                        z = false;
                    }
                    if (!z) {
                        return Unit.INSTANCE;
                    }
                    throw new AbortFlowException(c20623b);
                }
            }
            c20624a = new C20624a(continuation);
            obj = c20624a.f81064i;
            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            i = c20624a.f81065j;
            z = true;
            if (i == 0) {
            }
            if (((Boolean) obj).booleanValue()) {
            }
            if (!z) {
            }
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 6, 0}, m28428xi = 48)
    @DebugMetadata(m28419c = "kotlinx.coroutines.flow.FlowKt__ReduceKt", m28418f = "Reduce.kt", m28417i = {0, 0}, m28416l = {183}, m28415m = "first", m28414n = {FinancialConnectionsSheetNativeActivity.EXTRA_RESULT, "collector$iv"}, m28413s = {"L$0", "L$1"})
    /* renamed from: fv1$c */
    /* loaded from: classes8.dex */
    public static final class C20625c<T> extends ContinuationImpl {

        /* renamed from: h */
        public Object f81068h;

        /* renamed from: i */
        public Object f81069i;

        /* renamed from: j */
        public /* synthetic */ Object f81070j;

        /* renamed from: k */
        public int f81071k;

        public C20625c(Continuation<? super C20625c> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f81070j = obj;
            this.f81071k |= Integer.MIN_VALUE;
            return C36708Vu1.m79248w(null, this);
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 6, 0}, m28428xi = 48)
    @DebugMetadata(m28419c = "kotlinx.coroutines.flow.FlowKt__ReduceKt", m28418f = "Reduce.kt", m28417i = {0, 0, 0}, m28416l = {183}, m28415m = "first", m28414n = {"predicate", FinancialConnectionsSheetNativeActivity.EXTRA_RESULT, "collector$iv"}, m28413s = {"L$0", "L$1", "L$2"})
    /* renamed from: fv1$d */
    /* loaded from: classes8.dex */
    public static final class C20626d<T> extends ContinuationImpl {

        /* renamed from: h */
        public Object f81072h;

        /* renamed from: i */
        public Object f81073i;

        /* renamed from: j */
        public Object f81074j;

        /* renamed from: k */
        public /* synthetic */ Object f81075k;

        /* renamed from: l */
        public int f81076l;

        public C20626d(Continuation<? super C20626d> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f81075k = obj;
            this.f81076l |= Integer.MIN_VALUE;
            return C36708Vu1.m79247x(null, null, this);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001b\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0006"}, m28432d2 = {"fv1$e", "LGu1;", "value", "", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m28431k = 1, m28430mv = {1, 6, 0})
    /* renamed from: fv1$e */
    /* loaded from: classes8.dex */
    public static final class C20627e implements InterfaceC33198Gu1<T> {

        /* renamed from: b */
        public final /* synthetic */ Ref.ObjectRef f81077b;

        public C20627e(Ref.ObjectRef objectRef) {
            this.f81077b = objectRef;
        }

        @Override // p000.InterfaceC33198Gu1
        public Object emit(T t, Continuation<? super Unit> continuation) {
            this.f81077b.element = t;
            throw new AbortFlowException(this);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001b\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0006"}, m28432d2 = {"fv1$f", "LGu1;", "value", "", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m28431k = 1, m28430mv = {1, 6, 0})
    /* renamed from: fv1$f */
    /* loaded from: classes8.dex */
    public static final class C20628f implements InterfaceC33198Gu1<T> {

        /* renamed from: b */
        public final /* synthetic */ Function2 f81078b;

        /* renamed from: c */
        public final /* synthetic */ Ref.ObjectRef f81079c;

        @Metadata(m28431k = 3, m28430mv = {1, 6, 0}, m28428xi = 48)
        @DebugMetadata(m28419c = "kotlinx.coroutines.flow.FlowKt__ReduceKt$firstOrNull$$inlined$collectWhile$2", m28418f = "Reduce.kt", m28417i = {0, 0}, m28416l = {142}, m28415m = "emit", m28414n = {"this", "it"}, m28413s = {"L$0", "L$1"})
        /* renamed from: fv1$f$a */
        /* loaded from: classes8.dex */
        public static final class C20629a extends ContinuationImpl {

            /* renamed from: h */
            public Object f81080h;

            /* renamed from: i */
            public /* synthetic */ Object f81081i;

            /* renamed from: j */
            public int f81082j;

            /* renamed from: l */
            public Object f81084l;

            public C20629a(Continuation continuation) {
                super(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                this.f81081i = obj;
                this.f81082j |= Integer.MIN_VALUE;
                return C20628f.this.emit(null, this);
            }
        }

        public C20628f(Function2 function2, Ref.ObjectRef objectRef) {
            this.f81078b = function2;
            this.f81079c = objectRef;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
        /* JADX WARN: Removed duplicated region for block: B:14:0x0037  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x005a  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0061  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x0064  */
        @Override // p000.InterfaceC33198Gu1
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Object emit(T t, Continuation<? super Unit> continuation) {
            C20629a c20629a;
            Object obj;
            Object coroutine_suspended;
            int i;
            boolean z;
            C20628f c20628f;
            T t2;
            if (continuation instanceof C20629a) {
                c20629a = (C20629a) continuation;
                int i2 = c20629a.f81082j;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    c20629a.f81082j = i2 - Integer.MIN_VALUE;
                    obj = c20629a.f81081i;
                    coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = c20629a.f81082j;
                    z = true;
                    if (i == 0) {
                        if (i == 1) {
                            Object obj2 = c20629a.f81084l;
                            c20628f = (C20628f) c20629a.f81080h;
                            ResultKt.throwOnFailure(obj);
                            t2 = obj2;
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        ResultKt.throwOnFailure(obj);
                        Function2 function2 = this.f81078b;
                        c20629a.f81080h = this;
                        c20629a.f81084l = t;
                        c20629a.f81082j = 1;
                        InlineMarker.mark(6);
                        obj = function2.invoke(t, c20629a);
                        InlineMarker.mark(7);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        c20628f = this;
                        t2 = t;
                    }
                    if (((Boolean) obj).booleanValue()) {
                        c20628f.f81079c.element = t2;
                        z = false;
                    }
                    if (!z) {
                        return Unit.INSTANCE;
                    }
                    throw new AbortFlowException(c20628f);
                }
            }
            c20629a = new C20629a(continuation);
            obj = c20629a.f81081i;
            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            i = c20629a.f81082j;
            z = true;
            if (i == 0) {
            }
            if (((Boolean) obj).booleanValue()) {
            }
            if (!z) {
            }
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 6, 0}, m28428xi = 48)
    @DebugMetadata(m28419c = "kotlinx.coroutines.flow.FlowKt__ReduceKt", m28418f = "Reduce.kt", m28417i = {0, 0}, m28416l = {183}, m28415m = "firstOrNull", m28414n = {FinancialConnectionsSheetNativeActivity.EXTRA_RESULT, "collector$iv"}, m28413s = {"L$0", "L$1"})
    /* renamed from: fv1$g */
    /* loaded from: classes8.dex */
    public static final class C20630g<T> extends ContinuationImpl {

        /* renamed from: h */
        public Object f81085h;

        /* renamed from: i */
        public Object f81086i;

        /* renamed from: j */
        public /* synthetic */ Object f81087j;

        /* renamed from: k */
        public int f81088k;

        public C20630g(Continuation<? super C20630g> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f81087j = obj;
            this.f81088k |= Integer.MIN_VALUE;
            return C36708Vu1.m79246y(null, this);
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 6, 0}, m28428xi = 48)
    @DebugMetadata(m28419c = "kotlinx.coroutines.flow.FlowKt__ReduceKt", m28418f = "Reduce.kt", m28417i = {0, 0}, m28416l = {183}, m28415m = "firstOrNull", m28414n = {FinancialConnectionsSheetNativeActivity.EXTRA_RESULT, "collector$iv"}, m28413s = {"L$0", "L$1"})
    /* renamed from: fv1$h */
    /* loaded from: classes8.dex */
    public static final class C20631h<T> extends ContinuationImpl {

        /* renamed from: h */
        public Object f81089h;

        /* renamed from: i */
        public Object f81090i;

        /* renamed from: j */
        public /* synthetic */ Object f81091j;

        /* renamed from: k */
        public int f81092k;

        public C20631h(Continuation<? super C20631h> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f81091j = obj;
            this.f81092k |= Integer.MIN_VALUE;
            return C36708Vu1.m79245z(null, null, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0068 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0069  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <T> Object m40543a(InterfaceC32730Eu1<? extends T> interfaceC32730Eu1, Continuation<? super T> continuation) {
        C20625c c20625c;
        Object coroutine_suspended;
        int i;
        Ref.ObjectRef objectRef;
        AbortFlowException e;
        InterfaceC33198Gu1<? super Object> interfaceC33198Gu1;
        T t;
        if (continuation instanceof C20625c) {
            c20625c = (C20625c) continuation;
            int i2 = c20625c.f81071k;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c20625c.f81071k = i2 - Integer.MIN_VALUE;
                Object obj = c20625c.f81070j;
                coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = c20625c.f81071k;
                if (i == 0) {
                    if (i == 1) {
                        interfaceC33198Gu1 = (C20622a) c20625c.f81069i;
                        objectRef = (Ref.ObjectRef) c20625c.f81068h;
                        try {
                            ResultKt.throwOnFailure(obj);
                        } catch (AbortFlowException e2) {
                            e = e2;
                            C35304Pu1.m89450a(e, interfaceC33198Gu1);
                            t = objectRef.element;
                            if (t == C46976pd3.f103863a) {
                            }
                        }
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.throwOnFailure(obj);
                    Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
                    objectRef2.element = (T) C46976pd3.f103863a;
                    InterfaceC33198Gu1<? super Object> c20622a = new C20622a(objectRef2);
                    try {
                        c20625c.f81068h = objectRef2;
                        c20625c.f81069i = c20622a;
                        c20625c.f81071k = 1;
                        if (interfaceC32730Eu1.collect(c20622a, c20625c) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        objectRef = objectRef2;
                    } catch (AbortFlowException e3) {
                        objectRef = objectRef2;
                        e = e3;
                        interfaceC33198Gu1 = c20622a;
                        C35304Pu1.m89450a(e, interfaceC33198Gu1);
                        t = objectRef.element;
                        if (t == C46976pd3.f103863a) {
                        }
                    }
                }
                t = objectRef.element;
                if (t == C46976pd3.f103863a) {
                    return t;
                }
                throw new NoSuchElementException("Expected at least one element");
            }
        }
        c20625c = new C20625c(continuation);
        Object obj2 = c20625c.f81070j;
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = c20625c.f81071k;
        if (i == 0) {
        }
        t = objectRef.element;
        if (t == C46976pd3.f103863a) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0070 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0071  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <T> Object m40542b(InterfaceC32730Eu1<? extends T> interfaceC32730Eu1, Function2<? super T, ? super Continuation<? super Boolean>, ? extends Object> function2, Continuation<? super T> continuation) {
        C20626d c20626d;
        Object coroutine_suspended;
        int i;
        Function2<? super T, ? super Continuation<? super Boolean>, ? extends Object> function22;
        Ref.ObjectRef objectRef;
        AbortFlowException e;
        InterfaceC33198Gu1<? super Object> interfaceC33198Gu1;
        T t;
        if (continuation instanceof C20626d) {
            c20626d = (C20626d) continuation;
            int i2 = c20626d.f81076l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c20626d.f81076l = i2 - Integer.MIN_VALUE;
                Object obj = c20626d.f81075k;
                coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = c20626d.f81076l;
                if (i == 0) {
                    if (i == 1) {
                        interfaceC33198Gu1 = (C20623b) c20626d.f81074j;
                        objectRef = (Ref.ObjectRef) c20626d.f81073i;
                        function22 = (Function2) c20626d.f81072h;
                        try {
                            ResultKt.throwOnFailure(obj);
                        } catch (AbortFlowException e2) {
                            e = e2;
                            C35304Pu1.m89450a(e, interfaceC33198Gu1);
                            t = objectRef.element;
                            if (t == C46976pd3.f103863a) {
                            }
                        }
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.throwOnFailure(obj);
                    Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
                    objectRef2.element = (T) C46976pd3.f103863a;
                    InterfaceC33198Gu1<? super Object> c20623b = new C20623b(function2, objectRef2);
                    try {
                        c20626d.f81072h = function2;
                        c20626d.f81073i = objectRef2;
                        c20626d.f81074j = c20623b;
                        c20626d.f81076l = 1;
                        if (interfaceC32730Eu1.collect(c20623b, c20626d) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        function22 = function2;
                        objectRef = objectRef2;
                    } catch (AbortFlowException e3) {
                        function22 = function2;
                        objectRef = objectRef2;
                        e = e3;
                        interfaceC33198Gu1 = c20623b;
                        C35304Pu1.m89450a(e, interfaceC33198Gu1);
                        t = objectRef.element;
                        if (t == C46976pd3.f103863a) {
                        }
                    }
                }
                t = objectRef.element;
                if (t == C46976pd3.f103863a) {
                    return t;
                }
                throw new NoSuchElementException("Expected at least one element matching the predicate " + function22);
            }
        }
        c20626d = new C20626d(continuation);
        Object obj2 = c20626d.f81075k;
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = c20626d.f81076l;
        if (i == 0) {
        }
        t = objectRef.element;
        if (t == C46976pd3.f103863a) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003b  */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <T> Object m40541c(InterfaceC32730Eu1<? extends T> interfaceC32730Eu1, Continuation<? super T> continuation) {
        C20630g c20630g;
        Object coroutine_suspended;
        int i;
        Ref.ObjectRef objectRef;
        AbortFlowException e;
        InterfaceC33198Gu1<? super Object> interfaceC33198Gu1;
        if (continuation instanceof C20630g) {
            c20630g = (C20630g) continuation;
            int i2 = c20630g.f81088k;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c20630g.f81088k = i2 - Integer.MIN_VALUE;
                Object obj = c20630g.f81087j;
                coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = c20630g.f81088k;
                if (i == 0) {
                    if (i == 1) {
                        interfaceC33198Gu1 = (C20627e) c20630g.f81086i;
                        objectRef = (Ref.ObjectRef) c20630g.f81085h;
                        try {
                            ResultKt.throwOnFailure(obj);
                        } catch (AbortFlowException e2) {
                            e = e2;
                            C35304Pu1.m89450a(e, interfaceC33198Gu1);
                            return objectRef.element;
                        }
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.throwOnFailure(obj);
                    Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
                    InterfaceC33198Gu1<? super Object> c20627e = new C20627e(objectRef2);
                    try {
                        c20630g.f81085h = objectRef2;
                        c20630g.f81086i = c20627e;
                        c20630g.f81088k = 1;
                        if (interfaceC32730Eu1.collect(c20627e, c20630g) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        objectRef = objectRef2;
                    } catch (AbortFlowException e3) {
                        objectRef = objectRef2;
                        e = e3;
                        interfaceC33198Gu1 = c20627e;
                        C35304Pu1.m89450a(e, interfaceC33198Gu1);
                        return objectRef.element;
                    }
                }
                return objectRef.element;
            }
        }
        c20630g = new C20630g(continuation);
        Object obj2 = c20630g.f81087j;
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = c20630g.f81088k;
        if (i == 0) {
        }
        return objectRef.element;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003b  */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <T> Object m40540d(InterfaceC32730Eu1<? extends T> interfaceC32730Eu1, Function2<? super T, ? super Continuation<? super Boolean>, ? extends Object> function2, Continuation<? super T> continuation) {
        C20631h c20631h;
        Object coroutine_suspended;
        int i;
        Ref.ObjectRef objectRef;
        AbortFlowException e;
        InterfaceC33198Gu1<? super Object> interfaceC33198Gu1;
        if (continuation instanceof C20631h) {
            c20631h = (C20631h) continuation;
            int i2 = c20631h.f81092k;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c20631h.f81092k = i2 - Integer.MIN_VALUE;
                Object obj = c20631h.f81091j;
                coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = c20631h.f81092k;
                if (i == 0) {
                    if (i == 1) {
                        interfaceC33198Gu1 = (C20628f) c20631h.f81090i;
                        objectRef = (Ref.ObjectRef) c20631h.f81089h;
                        try {
                            ResultKt.throwOnFailure(obj);
                        } catch (AbortFlowException e2) {
                            e = e2;
                            C35304Pu1.m89450a(e, interfaceC33198Gu1);
                            return objectRef.element;
                        }
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.throwOnFailure(obj);
                    Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
                    InterfaceC33198Gu1<? super Object> c20628f = new C20628f(function2, objectRef2);
                    try {
                        c20631h.f81089h = objectRef2;
                        c20631h.f81090i = c20628f;
                        c20631h.f81092k = 1;
                        if (interfaceC32730Eu1.collect(c20628f, c20631h) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        objectRef = objectRef2;
                    } catch (AbortFlowException e3) {
                        objectRef = objectRef2;
                        e = e3;
                        interfaceC33198Gu1 = c20628f;
                        C35304Pu1.m89450a(e, interfaceC33198Gu1);
                        return objectRef.element;
                    }
                }
                return objectRef.element;
            }
        }
        c20631h = new C20631h(continuation);
        Object obj2 = c20631h.f81091j;
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = c20631h.f81092k;
        if (i == 0) {
        }
        return objectRef.element;
    }
}
