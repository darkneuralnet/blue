package androidx.lifecycle;

import ch.qos.logback.core.CoreConstants;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
@Metadata(m28433d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002BM\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u0012-\u0010\u0015\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0011\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u0010¢\u0006\u0002\b\u0014ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017J\u0013\u0010\u0004\u001a\u00020\u0003H\u0080@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0003H\u0014J\b\u0010\u0007\u001a\u00020\u0003H\u0014R\u001e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\n\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0018"}, m28432d2 = {"Landroidx/lifecycle/c;", "T", "LMP2;", "", "e", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onActive", "onInactive", "LTW;", "b", "LTW;", "blockRunner", "Lkotlin/coroutines/CoroutineContext;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "timeoutInMs", "Lkotlin/Function2;", "LVs2;", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", "block", "<init>", "(Lkotlin/coroutines/CoroutineContext;JLkotlin/jvm/functions/Function2;)V", "lifecycle-livedata-ktx_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: androidx.lifecycle.c */
/* loaded from: classes.dex */
public final class C11714c<T> extends MP2<T> {

    /* renamed from: b */
    public C7860TW<T> f54905b;

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002H\n¢\u0006\u0002\b\u0003"}, m28432d2 = {"<anonymous>", "", "T", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: androidx.lifecycle.c$a */
    /* loaded from: classes.dex */
    public static final class C11715a extends Lambda implements Function0<Unit> {

        /* renamed from: g */
        public final /* synthetic */ C11714c<T> f54906g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C11715a(C11714c<T> c11714c) {
            super(0);
            this.f54906g = c11714c;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            this.f54906g.f54905b = null;
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    @DebugMetadata(m28419c = "androidx.lifecycle.CoroutineLiveData", m28418f = "CoroutineLiveData.kt", m28417i = {0}, m28416l = {235}, m28415m = "clearSource$lifecycle_livedata_ktx_release", m28414n = {"this"}, m28413s = {"L$0"})
    /* renamed from: androidx.lifecycle.c$b */
    /* loaded from: classes.dex */
    public static final class C11716b extends ContinuationImpl {

        /* renamed from: h */
        public Object f54907h;

        /* renamed from: i */
        public /* synthetic */ Object f54908i;

        /* renamed from: j */
        public final /* synthetic */ C11714c<T> f54909j;

        /* renamed from: k */
        public int f54910k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C11716b(C11714c<T> c11714c, Continuation<? super C11716b> continuation) {
            super(continuation);
            this.f54909j = c11714c;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f54908i = obj;
            this.f54910k |= Integer.MIN_VALUE;
            return this.f54909j.m67023e(this);
        }
    }

    public C11714c(CoroutineContext context, long j, Function2<? super InterfaceC36691Vs2<T>, ? super Continuation<? super Unit>, ? extends Object> block) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(block, "block");
        this.f54905b = new C7860TW<>(this, block, j, C37824aD0.m71790a(T41.m84376c().mo14156G().plus(context).plus(XU5.m76947a((InterfaceC52943zh2) context.get(InterfaceC52943zh2.f122077a0)))), new C11715a(this));
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0034  */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m67023e(Continuation<? super Unit> continuation) {
        C11716b c11716b;
        int i;
        C11714c<T> c11714c;
        if (continuation instanceof C11716b) {
            c11716b = (C11716b) continuation;
            int i2 = c11716b.f54910k;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c11716b.f54910k = i2 - Integer.MIN_VALUE;
                Object obj = c11716b.f54908i;
                IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = c11716b.f54910k;
                if (i == 0) {
                    if (i == 1) {
                        c11714c = (C11714c) c11716b.f54907h;
                        ResultKt.throwOnFailure(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.throwOnFailure(obj);
                    c11714c = this;
                }
                c11714c.getClass();
                return Unit.INSTANCE;
            }
        }
        c11716b = new C11716b(this, continuation);
        Object obj2 = c11716b.f54908i;
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = c11716b.f54910k;
        if (i == 0) {
        }
        c11714c.getClass();
        return Unit.INSTANCE;
    }

    @Override // p000.MP2, androidx.lifecycle.LiveData
    public void onActive() {
        super.onActive();
        C7860TW<T> c7860tw = this.f54905b;
        if (c7860tw != null) {
            c7860tw.m83497h();
        }
    }

    @Override // p000.MP2, androidx.lifecycle.LiveData
    public void onInactive() {
        super.onInactive();
        C7860TW<T> c7860tw = this.f54905b;
        if (c7860tw != null) {
            c7860tw.m83498g();
        }
    }
}
