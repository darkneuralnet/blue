package p000;

import com.adyen.checkout.components.model.payments.response.AwaitAction;
import com.facebook.share.internal.C17296a;
import com.github.kittinunf.fuel.core.FuelError;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Triple;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;
import p000.AbstractC37918aN4;
@Metadata(m28433d1 = {"\u0000*\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a[\u0010\u000b\u001a*\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0007\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\t0\b0\u0006j\b\u0012\u0004\u0012\u00028\u0000`\n\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\u000e\b\u0001\u0010\u0003*\b\u0012\u0004\u0012\u00028\u00000\u0002*\u00020\u00042\u0006\u0010\u0005\u001a\u00028\u0001¢\u0006\u0004\b\u000b\u0010\f\u001a9\u0010\r\u001a\u00028\u0000\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\u000e\b\u0001\u0010\u0003*\b\u0012\u0004\u0012\u00028\u00000\u0002*\u00020\u00042\u0006\u0010\u0005\u001a\u00028\u0001H\u0086@ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000e\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000f"}, m28432d2 = {"", "T", "LC01;", "U", "LpI4;", "deserializable", "Lkotlin/Triple;", "LFM4;", "LaN4;", "Lcom/github/kittinunf/fuel/core/FuelError;", "Lcom/github/kittinunf/fuel/core/ResponseResultOf;", "b", "(LpI4;LC01;)Lkotlin/Triple;", C17296a.f69688o, "(LpI4;LC01;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fuel"}, m28431k = 2, m28430mv = {1, 4, 0})
/* renamed from: D01 */
/* loaded from: classes5.dex */
public final class D01 {

    @Metadata(m28433d1 = {"\u0000\u001a\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0000\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\u000e\b\u0001\u0010\u0003*\b\u0012\u0004\u0012\u00028\u00000\u0002*\u00020\u00042\u0006\u0010\u0005\u001a\u00028\u00012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006H\u0086@"}, m28432d2 = {"", "T", "LC01;", "U", "LpI4;", "deserializable", "Lkotlin/coroutines/Continuation;", "continuation", AwaitAction.ACTION_TYPE}, m28431k = 3, m28430mv = {1, 4, 0})
    @DebugMetadata(m28419c = "com.github.kittinunf.fuel.core.DeserializableKt", m28418f = "Deserializable.kt", m28417i = {0, 0}, m28416l = {233}, m28415m = AwaitAction.ACTION_TYPE, m28414n = {"$this$await", "deserializable"}, m28413s = {"L$0", "L$1"})
    /* renamed from: D01$a */
    /* loaded from: classes5.dex */
    public static final class C1270a extends ContinuationImpl {

        /* renamed from: h */
        public /* synthetic */ Object f5022h;

        /* renamed from: i */
        public int f5023i;

        /* renamed from: j */
        public Object f5024j;

        /* renamed from: k */
        public Object f5025k;

        public C1270a(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f5022h = obj;
            this.f5023i |= Integer.MIN_VALUE;
            return D01.m111165a(null, null, this);
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:1|(2:3|(8:5|6|(1:(1:9)(2:23|24))(2:25|(1:27))|10|11|12|13|(2:15|16)(2:18|19)))|28|6|(0)(0)|10|11|12|13|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x005b, code lost:
        r4 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x005c, code lost:
        r5 = kotlin.Result.Companion;
        r4 = kotlin.Result.m116783constructorimpl(kotlin.ResultKt.createFailure(r4));
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0070  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <T, U extends C01<? extends T>> Object m111165a(InterfaceC46785pI4 interfaceC46785pI4, U u, Continuation<? super T> continuation) throws FuelError {
        C1270a c1270a;
        Object coroutine_suspended;
        int i;
        Throwable m116786exceptionOrNullimpl;
        if (continuation instanceof C1270a) {
            c1270a = (C1270a) continuation;
            int i2 = c1270a.f5023i;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c1270a.f5023i = i2 - Integer.MIN_VALUE;
                Object obj = c1270a.f5022h;
                coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = c1270a.f5023i;
                if (i == 0) {
                    if (i == 1) {
                        u = (U) c1270a.f5025k;
                        InterfaceC46785pI4 interfaceC46785pI42 = (InterfaceC46785pI4) c1270a.f5024j;
                        ResultKt.throwOnFailure(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.throwOnFailure(obj);
                    C50468vW5 m6715a = C51061wW5.m6715a(interfaceC46785pI4);
                    c1270a.f5024j = interfaceC46785pI4;
                    c1270a.f5025k = u;
                    c1270a.f5023i = 1;
                    obj = m6715a.m8550r(c1270a);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                FM4 fm4 = (FM4) obj;
                Result.Companion companion = Result.Companion;
                Object m116783constructorimpl = Result.m116783constructorimpl(u.mo21763a(fm4));
                m116786exceptionOrNullimpl = Result.m116786exceptionOrNullimpl(m116783constructorimpl);
                if (m116786exceptionOrNullimpl != null) {
                    ResultKt.throwOnFailure(m116783constructorimpl);
                    return m116783constructorimpl;
                }
                throw FuelError.f69982c.m52051a(m116786exceptionOrNullimpl, fm4);
            }
        }
        c1270a = new C1270a(continuation);
        Object obj2 = c1270a.f5022h;
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = c1270a.f5023i;
        if (i == 0) {
        }
        FM4 fm42 = (FM4) obj2;
        Result.Companion companion2 = Result.Companion;
        Object m116783constructorimpl2 = Result.m116783constructorimpl(u.mo21763a(fm42));
        m116786exceptionOrNullimpl = Result.m116786exceptionOrNullimpl(m116783constructorimpl2);
        if (m116786exceptionOrNullimpl != null) {
        }
    }

    /* renamed from: b */
    public static final <T, U extends C01<? extends T>> Triple<InterfaceC46785pI4, FM4, AbstractC37918aN4<T, FuelError>> m111164b(InterfaceC46785pI4 response, U deserializable) {
        Object m116783constructorimpl;
        Object m116783constructorimpl2;
        Intrinsics.checkNotNullParameter(response, "$this$response");
        Intrinsics.checkNotNullParameter(deserializable, "deserializable");
        try {
            Result.Companion companion = Result.Companion;
            m116783constructorimpl = Result.m116783constructorimpl(C44422lJ4.m27426a(response).call());
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            m116783constructorimpl = Result.m116783constructorimpl(ResultKt.createFailure(th));
        }
        Throwable m116786exceptionOrNullimpl = Result.m116786exceptionOrNullimpl(m116783constructorimpl);
        if (m116786exceptionOrNullimpl != null) {
            FuelError m52051a = FuelError.f69982c.m52051a(m116786exceptionOrNullimpl, FM4.f9239g.m107278a(response.mo8567a()));
            return new Triple<>(response, m52051a.m52052d(), AbstractC37918aN4.f50375a.m71515a(m52051a));
        }
        ResultKt.throwOnFailure(m116783constructorimpl);
        FM4 rawResponse = (FM4) m116783constructorimpl;
        try {
            Intrinsics.checkNotNullExpressionValue(rawResponse, "rawResponse");
            m116783constructorimpl2 = Result.m116783constructorimpl(new Triple(response, rawResponse, new AbstractC37918aN4.C10665c(deserializable.mo21763a(rawResponse))));
        } catch (Throwable th2) {
            Result.Companion companion3 = Result.Companion;
            m116783constructorimpl2 = Result.m116783constructorimpl(ResultKt.createFailure(th2));
        }
        Throwable m116786exceptionOrNullimpl2 = Result.m116786exceptionOrNullimpl(m116783constructorimpl2);
        if (m116786exceptionOrNullimpl2 != null) {
            FuelError.C17429a c17429a = FuelError.f69982c;
            Intrinsics.checkNotNullExpressionValue(rawResponse, "rawResponse");
            m116783constructorimpl2 = Result.m116783constructorimpl(new Triple(response, rawResponse, new AbstractC37918aN4.C10664b(c17429a.m52051a(m116786exceptionOrNullimpl2, rawResponse))));
        }
        ResultKt.throwOnFailure(m116783constructorimpl2);
        return (Triple) m116783constructorimpl2;
    }
}
