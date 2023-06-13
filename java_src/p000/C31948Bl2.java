package p000;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import java.lang.reflect.Method;
import kotlin.KotlinNullPointerException;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import retrofit2.HttpException;
@Metadata(m28433d1 = {"\u0000$\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0003\u001a'\u0010\u0003\u001a\u00028\u0000\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a+\u0010\u0005\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u0001*\u00020\u0000*\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0002H\u0087@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0004\u001a)\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\u0004\u001a\u001b\u0010\u000b\u001a\u00020\n*\u00060\bj\u0002`\tH\u0080@ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\f\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\r"}, m28432d2 = {"", "T", "Lx80;", C17296a.f69688o, "(Lx80;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "b", "LHM4;", "c", "Ljava/lang/Exception;", "Lkotlin/Exception;", "", DateTokenConverter.CONVERTER_KEY, "(Ljava/lang/Exception;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "retrofit"}, m28431k = 2, m28430mv = {1, 4, 0})
@JvmName(name = "KotlinExtensions")
/* renamed from: Bl2  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C31948Bl2 {

    @Metadata(m28434bv = {1, 0, 3}, m28433d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\n¢\u0006\u0002\b\u0006¨\u0006\u0007"}, m28432d2 = {"<anonymous>", "", "T", "", "it", "", "invoke", "retrofit2/KotlinExtensions$await$2$1"}, m28431k = 3, m28430mv = {1, 1, 15})
    /* renamed from: Bl2$a */
    /* loaded from: classes8.dex */
    public static final class C0719a extends Lambda implements Function1<Throwable, Unit> {

        /* renamed from: g */
        public final /* synthetic */ InterfaceC51431x80 f2824g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0719a(InterfaceC51431x80 interfaceC51431x80) {
            super(1);
            this.f2824g = interfaceC51431x80;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            this.f2824g.cancel();
        }
    }

    @Metadata(m28434bv = {1, 0, 3}, m28433d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\n¢\u0006\u0002\b\u0006¨\u0006\u0007"}, m28432d2 = {"<anonymous>", "", "T", "", "it", "", "invoke", "retrofit2/KotlinExtensions$await$4$1"}, m28431k = 3, m28430mv = {1, 1, 15})
    /* renamed from: Bl2$b */
    /* loaded from: classes8.dex */
    public static final class C0720b extends Lambda implements Function1<Throwable, Unit> {

        /* renamed from: g */
        public final /* synthetic */ InterfaceC51431x80 f2825g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0720b(InterfaceC51431x80 interfaceC51431x80) {
            super(1);
            this.f2825g = interfaceC51431x80;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            this.f2825g.cancel();
        }
    }

    @Metadata(m28433d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J$\u0010\u0007\u001a\u00020\u00062\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0016J\u001e\u0010\n\u001a\u00020\u00062\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\t\u001a\u00020\bH\u0016¨\u0006\u000b"}, m28432d2 = {"Bl2$c", "LH80;", "Lx80;", "call", "LHM4;", "response", "", "b", "", "t", C17296a.f69688o, "retrofit"}, m28431k = 1, m28430mv = {1, 4, 0})
    /* renamed from: Bl2$c */
    /* loaded from: classes8.dex */
    public static final class C0721c implements H80<T> {

        /* renamed from: b */
        public final /* synthetic */ InterfaceC36779Wc0 f2826b;

        public C0721c(InterfaceC36779Wc0 interfaceC36779Wc0) {
            this.f2826b = interfaceC36779Wc0;
        }

        @Override // p000.H80
        /* renamed from: a */
        public void mo1283a(InterfaceC51431x80<T> interfaceC51431x80, Throwable th) {
            InterfaceC36779Wc0 interfaceC36779Wc0 = this.f2826b;
            Result.Companion companion = Result.Companion;
            interfaceC36779Wc0.resumeWith(Result.m116783constructorimpl(ResultKt.createFailure(th)));
        }

        @Override // p000.H80
        /* renamed from: b */
        public void mo1282b(InterfaceC51431x80<T> interfaceC51431x80, HM4<T> hm4) {
            if (hm4.m103939f()) {
                Object m103944a = hm4.m103944a();
                if (m103944a == null) {
                    Object tag = interfaceC51431x80.request().tag(S92.class);
                    if (tag == null) {
                        Intrinsics.throwNpe();
                    }
                    Intrinsics.checkExpressionValueIsNotNull(tag, "call.request().tag(Invocation::class.java)!!");
                    Method method = ((S92) tag).m85878a();
                    StringBuilder sb = new StringBuilder();
                    sb.append("Response from ");
                    Intrinsics.checkExpressionValueIsNotNull(method, "method");
                    Class<?> declaringClass = method.getDeclaringClass();
                    Intrinsics.checkExpressionValueIsNotNull(declaringClass, "method.declaringClass");
                    sb.append(declaringClass.getName());
                    sb.append(CoreConstants.DOT);
                    sb.append(method.getName());
                    sb.append(" was null but response body type was declared as non-null");
                    KotlinNullPointerException kotlinNullPointerException = new KotlinNullPointerException(sb.toString());
                    InterfaceC36779Wc0 interfaceC36779Wc0 = this.f2826b;
                    Result.Companion companion = Result.Companion;
                    interfaceC36779Wc0.resumeWith(Result.m116783constructorimpl(ResultKt.createFailure(kotlinNullPointerException)));
                    return;
                }
                this.f2826b.resumeWith(Result.m116783constructorimpl(m103944a));
                return;
            }
            InterfaceC36779Wc0 interfaceC36779Wc02 = this.f2826b;
            HttpException httpException = new HttpException(hm4);
            Result.Companion companion2 = Result.Companion;
            interfaceC36779Wc02.resumeWith(Result.m116783constructorimpl(ResultKt.createFailure(httpException)));
        }
    }

    @Metadata(m28433d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0001J(\u0010\u0007\u001a\u00020\u00062\u000e\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u00022\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0004H\u0016J \u0010\n\u001a\u00020\u00062\u000e\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u00022\u0006\u0010\t\u001a\u00020\bH\u0016¨\u0006\u000b"}, m28432d2 = {"Bl2$d", "LH80;", "Lx80;", "call", "LHM4;", "response", "", "b", "", "t", C17296a.f69688o, "retrofit"}, m28431k = 1, m28430mv = {1, 4, 0})
    /* renamed from: Bl2$d */
    /* loaded from: classes8.dex */
    public static final class C0722d implements H80<T> {

        /* renamed from: b */
        public final /* synthetic */ InterfaceC36779Wc0 f2827b;

        public C0722d(InterfaceC36779Wc0 interfaceC36779Wc0) {
            this.f2827b = interfaceC36779Wc0;
        }

        @Override // p000.H80
        /* renamed from: a */
        public void mo1283a(InterfaceC51431x80<T> interfaceC51431x80, Throwable th) {
            InterfaceC36779Wc0 interfaceC36779Wc0 = this.f2827b;
            Result.Companion companion = Result.Companion;
            interfaceC36779Wc0.resumeWith(Result.m116783constructorimpl(ResultKt.createFailure(th)));
        }

        @Override // p000.H80
        /* renamed from: b */
        public void mo1282b(InterfaceC51431x80<T> interfaceC51431x80, HM4<T> hm4) {
            if (hm4.m103939f()) {
                this.f2827b.resumeWith(Result.m116783constructorimpl(hm4.m103944a()));
                return;
            }
            InterfaceC36779Wc0 interfaceC36779Wc0 = this.f2827b;
            HttpException httpException = new HttpException(hm4);
            Result.Companion companion = Result.Companion;
            interfaceC36779Wc0.resumeWith(Result.m116783constructorimpl(ResultKt.createFailure(httpException)));
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m28432d2 = {"T", "L;", "it", "", "invoke", "(L;)V", "kotlin/Throwable", "<anonymous>"}, m28431k = 3, m28430mv = {1, 4, 0})
    /* renamed from: Bl2$e */
    /* loaded from: classes8.dex */
    public static final class C0723e extends Lambda implements Function1<Throwable, Unit> {

        /* renamed from: g */
        public final /* synthetic */ InterfaceC51431x80 f2828g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0723e(InterfaceC51431x80 interfaceC51431x80) {
            super(1);
            this.f2828g = interfaceC51431x80;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            this.f2828g.cancel();
        }
    }

    @Metadata(m28433d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J$\u0010\u0007\u001a\u00020\u00062\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0016J\u001e\u0010\n\u001a\u00020\u00062\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\t\u001a\u00020\bH\u0016¨\u0006\u000b"}, m28432d2 = {"Bl2$f", "LH80;", "Lx80;", "call", "LHM4;", "response", "", "b", "", "t", C17296a.f69688o, "retrofit"}, m28431k = 1, m28430mv = {1, 4, 0})
    /* renamed from: Bl2$f */
    /* loaded from: classes8.dex */
    public static final class C0724f implements H80<T> {

        /* renamed from: b */
        public final /* synthetic */ InterfaceC36779Wc0 f2829b;

        public C0724f(InterfaceC36779Wc0 interfaceC36779Wc0) {
            this.f2829b = interfaceC36779Wc0;
        }

        @Override // p000.H80
        /* renamed from: a */
        public void mo1283a(InterfaceC51431x80<T> interfaceC51431x80, Throwable th) {
            InterfaceC36779Wc0 interfaceC36779Wc0 = this.f2829b;
            Result.Companion companion = Result.Companion;
            interfaceC36779Wc0.resumeWith(Result.m116783constructorimpl(ResultKt.createFailure(th)));
        }

        @Override // p000.H80
        /* renamed from: b */
        public void mo1282b(InterfaceC51431x80<T> interfaceC51431x80, HM4<T> hm4) {
            this.f2829b.resumeWith(Result.m116783constructorimpl(hm4));
        }
    }

    @Metadata(m28434bv = {1, 0, 3}, m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002¨\u0006\u0003"}, m28432d2 = {"<anonymous>", "", "run", "retrofit2/KotlinExtensions$suspendAndThrow$2$1"}, m28431k = 3, m28430mv = {1, 1, 15})
    /* renamed from: Bl2$g */
    /* loaded from: classes8.dex */
    public static final class RunnableC0725g implements Runnable {

        /* renamed from: b */
        public final /* synthetic */ Continuation f2830b;

        /* renamed from: c */
        public final /* synthetic */ Exception f2831c;

        public RunnableC0725g(Continuation continuation, Exception exc) {
            this.f2830b = continuation;
            this.f2831c = exc;
        }

        @Override // java.lang.Runnable
        public final void run() {
            Continuation intercepted;
            intercepted = IntrinsicsKt__IntrinsicsJvmKt.intercepted(this.f2830b);
            Exception exc = this.f2831c;
            Result.Companion companion = Result.Companion;
            intercepted.resumeWith(Result.m116783constructorimpl(ResultKt.createFailure(exc)));
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u0000\n\u0000\u0010\u0006\u001a\u0004\u0018\u00010\u0005*\u00060\u0000j\u0002`\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0080@"}, m28432d2 = {"Ljava/lang/Exception;", "Lkotlin/Exception;", "Lkotlin/coroutines/Continuation;", "", "continuation", "", "suspendAndThrow"}, m28431k = 3, m28430mv = {1, 4, 0})
    @DebugMetadata(m28419c = "retrofit2.KotlinExtensions", m28418f = "KotlinExtensions.kt", m28417i = {0}, m28416l = {113}, m28415m = "suspendAndThrow", m28414n = {"$this$suspendAndThrow"}, m28413s = {"L$0"})
    /* renamed from: Bl2$h */
    /* loaded from: classes8.dex */
    public static final class C0726h extends ContinuationImpl {

        /* renamed from: h */
        public /* synthetic */ Object f2832h;

        /* renamed from: i */
        public int f2833i;

        /* renamed from: j */
        public Object f2834j;

        public C0726h(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f2832h = obj;
            this.f2833i |= Integer.MIN_VALUE;
            return C31948Bl2.m113524d(null, this);
        }
    }

    /* renamed from: a */
    public static final <T> Object m113527a(InterfaceC51431x80<T> interfaceC51431x80, Continuation<? super T> continuation) {
        Continuation intercepted;
        Object coroutine_suspended;
        intercepted = IntrinsicsKt__IntrinsicsJvmKt.intercepted(continuation);
        C37013Xc0 c37013Xc0 = new C37013Xc0(intercepted, 1);
        c37013Xc0.mo76794H(new C0719a(interfaceC51431x80));
        interfaceC51431x80.mo1284E0(new C0721c(c37013Xc0));
        Object m76770q = c37013Xc0.m76770q();
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (m76770q == coroutine_suspended) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return m76770q;
    }

    @JvmName(name = "awaitNullable")
    /* renamed from: b */
    public static final <T> Object m113526b(InterfaceC51431x80<T> interfaceC51431x80, Continuation<? super T> continuation) {
        Continuation intercepted;
        Object coroutine_suspended;
        intercepted = IntrinsicsKt__IntrinsicsJvmKt.intercepted(continuation);
        C37013Xc0 c37013Xc0 = new C37013Xc0(intercepted, 1);
        c37013Xc0.mo76794H(new C0720b(interfaceC51431x80));
        interfaceC51431x80.mo1284E0(new C0722d(c37013Xc0));
        Object m76770q = c37013Xc0.m76770q();
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (m76770q == coroutine_suspended) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return m76770q;
    }

    /* renamed from: c */
    public static final <T> Object m113525c(InterfaceC51431x80<T> interfaceC51431x80, Continuation<? super HM4<T>> continuation) {
        Continuation intercepted;
        Object coroutine_suspended;
        intercepted = IntrinsicsKt__IntrinsicsJvmKt.intercepted(continuation);
        C37013Xc0 c37013Xc0 = new C37013Xc0(intercepted, 1);
        c37013Xc0.mo76794H(new C0723e(interfaceC51431x80));
        interfaceC51431x80.mo1284E0(new C0724f(c37013Xc0));
        Object m76770q = c37013Xc0.m76770q();
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (m76770q == coroutine_suspended) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return m76770q;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m113524d(Exception exc, Continuation<?> continuation) {
        C0726h c0726h;
        Object coroutine_suspended;
        int i;
        Object coroutine_suspended2;
        Object coroutine_suspended3;
        if (continuation instanceof C0726h) {
            c0726h = (C0726h) continuation;
            int i2 = c0726h.f2833i;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c0726h.f2833i = i2 - Integer.MIN_VALUE;
                Object obj = c0726h.f2832h;
                coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = c0726h.f2833i;
                if (i == 0) {
                    if (i == 1) {
                        Exception exc2 = (Exception) c0726h.f2834j;
                        ResultKt.throwOnFailure(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.throwOnFailure(obj);
                    c0726h.f2834j = exc;
                    c0726h.f2833i = 1;
                    T41.m84378a().mo14150y(c0726h.getContext(), new RunnableC0725g(c0726h, exc));
                    coroutine_suspended2 = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    coroutine_suspended3 = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (coroutine_suspended2 == coroutine_suspended3) {
                        DebugProbesKt.probeCoroutineSuspended(c0726h);
                    }
                    if (coroutine_suspended2 == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                return Unit.INSTANCE;
            }
        }
        c0726h = new C0726h(continuation);
        Object obj2 = c0726h.f2832h;
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = c0726h.f2833i;
        if (i == 0) {
        }
        return Unit.INSTANCE;
    }
}
