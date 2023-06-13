package p000;

import com.facebook.share.internal.C17296a;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\f\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000\u001a\u0017\u0010\u0004\u001a\u00020\u0003*\u00020\u0000H\u0080@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a@\u0010\f\u001a\u00020\u0003*\u00020\u00062'\u0010\u000b\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\b\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0007¢\u0006\u0002\b\nH\u0086@ø\u0001\u0000¢\u0006\u0004\b\f\u0010\r\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000e"}, m28432d2 = {"LWu;", "", C17296a.f69688o, "", "b", "(LWu;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "LtX3;", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", "block", "c", "(LtX3;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "foundation_release"}, m28431k = 2, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nForEachGesture.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ForEachGesture.kt\nandroidx/compose/foundation/gestures/ForEachGestureKt\n+ 2 CoroutineScope.kt\nkotlinx/coroutines/CoroutineScopeKt\n+ 3 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,121:1\n329#2:122\n329#2:141\n101#3,2:123\n33#3,6:125\n103#3:131\n101#3,2:132\n33#3,6:134\n103#3:140\n*S KotlinDebug\n*F\n+ 1 ForEachGesture.kt\nandroidx/compose/foundation/gestures/ForEachGestureKt\n*L\n45#1:122\n100#1:141\n71#1:123,2\n71#1:125,6\n71#1:131\n87#1:132,2\n87#1:134,6\n87#1:140\n*E\n"})
/* renamed from: Mw1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C34620Mw1 {

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    @DebugMetadata(m28419c = "androidx.compose.foundation.gestures.ForEachGestureKt", m28418f = "ForEachGesture.kt", m28417i = {0}, m28416l = {86}, m28415m = "awaitAllPointersUp", m28414n = {"$this$awaitAllPointersUp"}, m28413s = {"L$0"})
    /* renamed from: Mw1$a */
    /* loaded from: classes.dex */
    public static final class C5437a extends ContinuationImpl {

        /* renamed from: h */
        public Object f23851h;

        /* renamed from: i */
        public /* synthetic */ Object f23852i;

        /* renamed from: j */
        public int f23853j;

        public C5437a(Continuation<? super C5437a> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f23852i = obj;
            this.f23853j |= Integer.MIN_VALUE;
            return C34620Mw1.m94551b(null, this);
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m28432d2 = {"LWu;", "", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    @DebugMetadata(m28419c = "androidx.compose.foundation.gestures.ForEachGestureKt$awaitEachGesture$2", m28418f = "ForEachGesture.kt", m28417i = {0, 1, 2}, m28416l = {104, 107, 112}, m28415m = "invokeSuspend", m28414n = {"$this$awaitPointerEventScope", "$this$awaitPointerEventScope", "$this$awaitPointerEventScope"}, m28413s = {"L$0", "L$0", "L$0"})
    /* renamed from: Mw1$b */
    /* loaded from: classes.dex */
    public static final class C5438b extends RestrictedSuspendLambda implements Function2<InterfaceC9204Wu, Continuation<? super Unit>, Object> {

        /* renamed from: h */
        public int f23854h;

        /* renamed from: i */
        public /* synthetic */ Object f23855i;

        /* renamed from: j */
        public final /* synthetic */ CoroutineContext f23856j;

        /* renamed from: k */
        public final /* synthetic */ Function2<InterfaceC9204Wu, Continuation<? super Unit>, Object> f23857k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C5438b(CoroutineContext coroutineContext, Function2<? super InterfaceC9204Wu, ? super Continuation<? super Unit>, ? extends Object> function2, Continuation<? super C5438b> continuation) {
            super(2, continuation);
            this.f23856j = coroutineContext;
            this.f23857k = function2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C5438b c5438b = new C5438b(this.f23856j, this.f23857k, continuation);
            c5438b.f23855i = obj;
            return c5438b;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: e */
        public final Object invoke(InterfaceC9204Wu interfaceC9204Wu, Continuation<? super Unit> continuation) {
            return ((C5438b) create(interfaceC9204Wu, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:28:0x0061 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:29:0x0062  */
        /* JADX WARN: Removed duplicated region for block: B:36:0x0078  */
        /* JADX WARN: Removed duplicated region for block: B:40:0x0085  */
        /* JADX WARN: Removed duplicated region for block: B:41:0x0086  */
        /* JADX WARN: Removed duplicated region for block: B:43:0x0047 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Type inference failed for: r1v0, types: [int] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x0062 -> B:20:0x003f). Please submit an issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:39:0x0083 -> B:20:0x003f). Please submit an issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended;
            InterfaceC9204Wu interfaceC9204Wu;
            C5438b c5438b;
            InterfaceC9204Wu interfaceC9204Wu2;
            InterfaceC9204Wu interfaceC9204Wu3;
            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ?? r1 = this.f23854h;
            if (r1 != 0) {
                try {
                } catch (CancellationException e) {
                    e = e;
                    interfaceC9204Wu = r1;
                    c5438b = this;
                    if (C34018Kh2.m98497o(c5438b.f23856j)) {
                    }
                }
                if (r1 != 1) {
                    if (r1 != 2) {
                        if (r1 == 3) {
                            interfaceC9204Wu2 = (InterfaceC9204Wu) this.f23855i;
                            ResultKt.throwOnFailure(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        interfaceC9204Wu2 = (InterfaceC9204Wu) this.f23855i;
                        ResultKt.throwOnFailure(obj);
                    }
                    interfaceC9204Wu3 = interfaceC9204Wu2;
                } else {
                    InterfaceC9204Wu interfaceC9204Wu4 = (InterfaceC9204Wu) this.f23855i;
                    ResultKt.throwOnFailure(obj);
                    C5438b c5438b2 = this;
                    try {
                    } catch (CancellationException e2) {
                        InterfaceC9204Wu interfaceC9204Wu5 = interfaceC9204Wu4;
                        c5438b = c5438b2;
                        e = e2;
                        interfaceC9204Wu = interfaceC9204Wu5;
                        if (C34018Kh2.m98497o(c5438b.f23856j)) {
                        }
                    }
                    c5438b2.f23855i = interfaceC9204Wu4;
                    c5438b2.f23854h = 2;
                    if (C34620Mw1.m94551b(interfaceC9204Wu4, c5438b2) != coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    InterfaceC9204Wu interfaceC9204Wu6 = interfaceC9204Wu4;
                    c5438b = c5438b2;
                    interfaceC9204Wu3 = interfaceC9204Wu6;
                    if (C34018Kh2.m98497o(c5438b.f23856j)) {
                        try {
                        } catch (CancellationException e3) {
                            interfaceC9204Wu = interfaceC9204Wu3;
                            e = e3;
                            if (C34018Kh2.m98497o(c5438b.f23856j)) {
                                c5438b.f23855i = interfaceC9204Wu;
                                c5438b.f23854h = 3;
                                if (C34620Mw1.m94551b(interfaceC9204Wu, c5438b) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                interfaceC9204Wu3 = interfaceC9204Wu;
                                if (C34018Kh2.m98497o(c5438b.f23856j)) {
                                }
                            } else {
                                throw e;
                            }
                        }
                        Function2<InterfaceC9204Wu, Continuation<? super Unit>, Object> function2 = c5438b.f23857k;
                        c5438b.f23855i = interfaceC9204Wu3;
                        c5438b.f23854h = 1;
                        if (function2.invoke(interfaceC9204Wu3, c5438b) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        C5438b c5438b3 = c5438b;
                        interfaceC9204Wu4 = interfaceC9204Wu3;
                        c5438b2 = c5438b3;
                        c5438b2.f23855i = interfaceC9204Wu4;
                        c5438b2.f23854h = 2;
                        if (C34620Mw1.m94551b(interfaceC9204Wu4, c5438b2) != coroutine_suspended) {
                        }
                    } else {
                        return Unit.INSTANCE;
                    }
                }
            } else {
                ResultKt.throwOnFailure(obj);
                interfaceC9204Wu3 = (InterfaceC9204Wu) this.f23855i;
            }
            c5438b = this;
            if (C34018Kh2.m98497o(c5438b.f23856j)) {
            }
        }
    }

    /* renamed from: a */
    public static final boolean m94552a(InterfaceC9204Wu interfaceC9204Wu) {
        Intrinsics.checkNotNullParameter(interfaceC9204Wu, "<this>");
        List<C43361jX3> m74945c = interfaceC9204Wu.mo3414M0().m74945c();
        int size = m74945c.size();
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= size) {
                break;
            } else if (m74945c.get(i).m30358g()) {
                z = true;
                break;
            } else {
                i++;
            }
        }
        return !z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x003c, code lost:
        if (m94552a(r7) == false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x003e, code lost:
        r8 = p000.EnumC38007aX3.Final;
        r0.f23851h = r7;
        r0.f23853j = 1;
        r8 = r7.mo3401r0(r8, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0048, code lost:
        if (r8 != r1) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x004a, code lost:
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x006a, code lost:
        if (r4 == false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x006e, code lost:
        return kotlin.Unit.INSTANCE;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0048 -> B:19:0x004b). Please submit an issue!!! */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m94551b(InterfaceC9204Wu interfaceC9204Wu, Continuation<? super Unit> continuation) {
        C5437a c5437a;
        Object coroutine_suspended;
        int i;
        if (continuation instanceof C5437a) {
            c5437a = (C5437a) continuation;
            int i2 = c5437a.f23853j;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c5437a.f23853j = i2 - Integer.MIN_VALUE;
                Object obj = c5437a.f23852i;
                coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = c5437a.f23853j;
                if (i == 0) {
                    if (i == 1) {
                        interfaceC9204Wu = (InterfaceC9204Wu) c5437a.f23851h;
                        ResultKt.throwOnFailure(obj);
                        List<C43361jX3> m74945c = ((YW3) obj).m74945c();
                        int size = m74945c.size();
                        boolean z = false;
                        int i3 = 0;
                        while (true) {
                            if (i3 >= size) {
                                break;
                            } else if (m74945c.get(i3).m30358g()) {
                                z = true;
                                break;
                            } else {
                                i3++;
                            }
                        }
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.throwOnFailure(obj);
                }
            }
        }
        c5437a = new C5437a(continuation);
        Object obj2 = c5437a.f23852i;
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = c5437a.f23853j;
        if (i == 0) {
        }
    }

    /* renamed from: c */
    public static final Object m94550c(InterfaceC49290tX3 interfaceC49290tX3, Function2<? super InterfaceC9204Wu, ? super Continuation<? super Unit>, ? extends Object> function2, Continuation<? super Unit> continuation) {
        Object coroutine_suspended;
        Object mo3418v0 = interfaceC49290tX3.mo3418v0(new C5438b(continuation.getContext(), function2, null), continuation);
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (mo3418v0 == coroutine_suspended) {
            return mo3418v0;
        }
        return Unit.INSTANCE;
    }
}
