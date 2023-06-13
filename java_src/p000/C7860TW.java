package p000;

import androidx.lifecycle.C11714c;
import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import p000.InterfaceC52943zh2;
@Metadata(m28433d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002Be\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\u0012-\u0010\u0010\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\f\u0012\u0006\u0012\u0004\u0018\u00010\u00020\n¢\u0006\u0002\b\r\u0012\u0006\u0010\u0014\u001a\u00020\u0011\u0012\u0006\u0010\u0018\u001a\u00020\u0015\u0012\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00030\u0019ø\u0001\u0000¢\u0006\u0004\b\"\u0010#J\b\u0010\u0004\u001a\u00020\u0003H\u0007J\b\u0010\u0005\u001a\u00020\u0003H\u0007R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR>\u0010\u0010\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\f\u0012\u0006\u0012\u0004\u0018\u00010\u00020\n¢\u0006\u0002\b\r8\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0014\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0018\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00030\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0018\u0010 \u001a\u0004\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0018\u0010!\u001a\u0004\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u001f\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006$"}, m28432d2 = {"LTW;", "T", "", "", "h", "g", "Landroidx/lifecycle/c;", C17296a.f69688o, "Landroidx/lifecycle/c;", "liveData", "Lkotlin/Function2;", "LVs2;", "Lkotlin/coroutines/Continuation;", "Lkotlin/ExtensionFunctionType;", "b", "Lkotlin/jvm/functions/Function2;", "block", "", "c", "J", "timeoutInMs", "LZC0;", DateTokenConverter.CONVERTER_KEY, "LZC0;", Action.SCOPE_ATTRIBUTE, "Lkotlin/Function0;", "e", "Lkotlin/jvm/functions/Function0;", "onDone", "Lzh2;", "f", "Lzh2;", "runningJob", "cancellationJob", "<init>", "(Landroidx/lifecycle/c;Lkotlin/jvm/functions/Function2;JLZC0;Lkotlin/jvm/functions/Function0;)V", "lifecycle-livedata-ktx_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: TW */
/* loaded from: classes.dex */
public final class C7860TW<T> {

    /* renamed from: a */
    public final C11714c<T> f35575a;

    /* renamed from: b */
    public final Function2<InterfaceC36691Vs2<T>, Continuation<? super Unit>, Object> f35576b;

    /* renamed from: c */
    public final long f35577c;

    /* renamed from: d */
    public final ZC0 f35578d;

    /* renamed from: e */
    public final Function0<Unit> f35579e;

    /* renamed from: f */
    public InterfaceC52943zh2 f35580f;

    /* renamed from: g */
    public InterfaceC52943zh2 f35581g;

    @Metadata(m28433d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@"}, m28432d2 = {"T", "LZC0;", "", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    @DebugMetadata(m28419c = "androidx.lifecycle.BlockRunner$cancel$1", m28418f = "CoroutineLiveData.kt", m28417i = {}, m28416l = {188}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
    /* renamed from: TW$a */
    /* loaded from: classes.dex */
    public static final class C7861a extends SuspendLambda implements Function2<ZC0, Continuation<? super Unit>, Object> {

        /* renamed from: h */
        public int f35582h;

        /* renamed from: i */
        public final /* synthetic */ C7860TW<T> f35583i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C7861a(C7860TW<T> c7860tw, Continuation<? super C7861a> continuation) {
            super(2, continuation);
            this.f35583i = c7860tw;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C7861a(this.f35583i, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ZC0 zc0, Continuation<? super Unit> continuation) {
            return ((C7861a) create(zc0, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended;
            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f35582h;
            if (i != 0) {
                if (i == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                long j = this.f35583i.f35577c;
                this.f35582h = 1;
                if (C48120rZ0.m15768a(j, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            if (!this.f35583i.f35575a.hasActiveObservers()) {
                InterfaceC52943zh2 interfaceC52943zh2 = this.f35583i.f35580f;
                if (interfaceC52943zh2 != null) {
                    InterfaceC52943zh2.C31478a.m550a(interfaceC52943zh2, null, 1, null);
                }
                this.f35583i.f35580f = null;
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@"}, m28432d2 = {"T", "LZC0;", "", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    @DebugMetadata(m28419c = "androidx.lifecycle.BlockRunner$maybeRun$1", m28418f = "CoroutineLiveData.kt", m28417i = {}, m28416l = {177}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
    /* renamed from: TW$b */
    /* loaded from: classes.dex */
    public static final class C7862b extends SuspendLambda implements Function2<ZC0, Continuation<? super Unit>, Object> {

        /* renamed from: h */
        public int f35584h;

        /* renamed from: i */
        public /* synthetic */ Object f35585i;

        /* renamed from: j */
        public final /* synthetic */ C7860TW<T> f35586j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C7862b(C7860TW<T> c7860tw, Continuation<? super C7862b> continuation) {
            super(2, continuation);
            this.f35586j = c7860tw;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C7862b c7862b = new C7862b(this.f35586j, continuation);
            c7862b.f35585i = obj;
            return c7862b;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ZC0 zc0, Continuation<? super Unit> continuation) {
            return ((C7862b) create(zc0, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended;
            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f35584h;
            if (i != 0) {
                if (i == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                C36925Ws2 c36925Ws2 = new C36925Ws2(this.f35586j.f35575a, ((ZC0) this.f35585i).mo18342K());
                Function2 function2 = this.f35586j.f35576b;
                this.f35584h = 1;
                if (function2.invoke(c36925Ws2, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            this.f35586j.f35579e.invoke();
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C7860TW(C11714c<T> liveData, Function2<? super InterfaceC36691Vs2<T>, ? super Continuation<? super Unit>, ? extends Object> block, long j, ZC0 scope, Function0<Unit> onDone) {
        Intrinsics.checkNotNullParameter(liveData, "liveData");
        Intrinsics.checkNotNullParameter(block, "block");
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(onDone, "onDone");
        this.f35575a = liveData;
        this.f35576b = block;
        this.f35577c = j;
        this.f35578d = scope;
        this.f35579e = onDone;
    }

    /* renamed from: g */
    public final void m83498g() {
        InterfaceC52943zh2 m73800d;
        if (this.f35581g == null) {
            m73800d = Z30.m73800d(this.f35578d, T41.m84376c().mo14156G(), null, new C7861a(this, null), 2, null);
            this.f35581g = m73800d;
            return;
        }
        throw new IllegalStateException("Cancel call cannot happen without a maybeRun".toString());
    }

    /* renamed from: h */
    public final void m83497h() {
        InterfaceC52943zh2 m73800d;
        InterfaceC52943zh2 interfaceC52943zh2 = this.f35581g;
        if (interfaceC52943zh2 != null) {
            InterfaceC52943zh2.C31478a.m550a(interfaceC52943zh2, null, 1, null);
        }
        this.f35581g = null;
        if (this.f35580f != null) {
            return;
        }
        m73800d = Z30.m73800d(this.f35578d, null, null, new C7862b(this, null), 3, null);
        this.f35580f = m73800d;
    }
}
