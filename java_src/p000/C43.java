package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import com.stripe.android.model.Stripe3ds2AuthParams;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
@Metadata(m28433d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b'\u0010(J#\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0006\u0010\u0007J+\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\t\u0010\nJ!\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u000bH\u0086@ø\u0001\u0000ø\u0001\u0001ø\u0001\u0001¢\u0006\u0004\b\f\u0010\rJ)\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u000bH\u0086@ø\u0001\u0000ø\u0001\u0001ø\u0001\u0001¢\u0006\u0004\b\u000e\u0010\u000fR*\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u00108\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R$\u0010\u001d\u001a\u0004\u0018\u00010\u00118\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\t\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR$\u0010$\u001a\u0004\u0018\u00010\u001e8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\f\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u0011\u0010&\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\b%\u0010\u001a\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006)"}, m28432d2 = {"LC43;", "", "LCe3;", "available", "LH43;", Stripe3ds2AuthParams.FIELD_SOURCE, DateTokenConverter.CONVERTER_KEY, "(JI)J", "consumed", "b", "(JJI)J", "Lro6;", "c", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", C17296a.f69688o, "(JJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlin/Function0;", "LZC0;", "Lkotlin/jvm/functions/Function0;", "getCalculateNestedScrollScope$ui_release", "()Lkotlin/jvm/functions/Function0;", "g", "(Lkotlin/jvm/functions/Function0;)V", "calculateNestedScrollScope", "LZC0;", "f", "()LZC0;", "h", "(LZC0;)V", "originNestedScrollScope", "LB43;", "LB43;", "getParent$ui_release", "()LB43;", "i", "(LB43;)V", "parent", "e", "coroutineScope", "<init>", "()V", "ui_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: C43 */
/* loaded from: classes.dex */
public final class C43 {

    /* renamed from: a */
    public Function0<? extends ZC0> f3355a = new C0851a();

    /* renamed from: b */
    public ZC0 f3356b;

    /* renamed from: c */
    public B43 f3357c;

    @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"LZC0;", "b", "()LZC0;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: C43$a */
    /* loaded from: classes.dex */
    public static final class C0851a extends Lambda implements Function0<ZC0> {
        public C0851a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b */
        public final ZC0 invoke() {
            return C43.this.m112915f();
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    @DebugMetadata(m28419c = "androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher", m28418f = "NestedScrollModifier.kt", m28417i = {}, m28416l = {217}, m28415m = "dispatchPostFling-RZ2iAVY", m28414n = {}, m28413s = {})
    /* renamed from: C43$b */
    /* loaded from: classes.dex */
    public static final class C0852b extends ContinuationImpl {

        /* renamed from: h */
        public /* synthetic */ Object f3359h;

        /* renamed from: j */
        public int f3361j;

        public C0852b(Continuation<? super C0852b> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f3359h = obj;
            this.f3361j |= Integer.MIN_VALUE;
            return C43.this.m112920a(0L, 0L, this);
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    @DebugMetadata(m28419c = "androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher", m28418f = "NestedScrollModifier.kt", m28417i = {}, m28416l = {202}, m28415m = "dispatchPreFling-QWom1Mo", m28414n = {}, m28413s = {})
    /* renamed from: C43$c */
    /* loaded from: classes.dex */
    public static final class C0853c extends ContinuationImpl {

        /* renamed from: h */
        public /* synthetic */ Object f3362h;

        /* renamed from: j */
        public int f3364j;

        public C0853c(Continuation<? super C0853c> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f3362h = obj;
            this.f3364j |= Integer.MIN_VALUE;
            return C43.this.m112918c(0L, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0032  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m112920a(long j, long j2, Continuation<? super C48275ro6> continuation) {
        C0852b c0852b;
        Object coroutine_suspended;
        int i;
        long m15349a;
        if (continuation instanceof C0852b) {
            c0852b = (C0852b) continuation;
            int i2 = c0852b.f3361j;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c0852b.f3361j = i2 - Integer.MIN_VALUE;
                C0852b c0852b2 = c0852b;
                Object obj = c0852b2.f3359h;
                coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = c0852b2.f3361j;
                if (i == 0) {
                    if (i == 1) {
                        ResultKt.throwOnFailure(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.throwOnFailure(obj);
                    B43 b43 = this.f3357c;
                    if (b43 != null) {
                        c0852b2.f3361j = 1;
                        obj = b43.mo72411a(j, j2, c0852b2);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        m15349a = C48275ro6.f107663b.m15349a();
                        return C48275ro6.m15363b(m15349a);
                    }
                }
                m15349a = ((C48275ro6) obj).m15350o();
                return C48275ro6.m15363b(m15349a);
            }
        }
        c0852b = new C0852b(continuation);
        C0852b c0852b22 = c0852b;
        Object obj2 = c0852b22.f3359h;
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = c0852b22.f3361j;
        if (i == 0) {
        }
        m15349a = ((C48275ro6) obj2).m15350o();
        return C48275ro6.m15363b(m15349a);
    }

    /* renamed from: b */
    public final long m112919b(long j, long j2, int i) {
        B43 b43 = this.f3357c;
        return b43 != null ? b43.mo72410h(j, j2, i) : C32120Ce3.f4427b.m111932c();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m112918c(long j, Continuation<? super C48275ro6> continuation) {
        C0853c c0853c;
        Object coroutine_suspended;
        int i;
        long m15349a;
        if (continuation instanceof C0853c) {
            c0853c = (C0853c) continuation;
            int i2 = c0853c.f3364j;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c0853c.f3364j = i2 - Integer.MIN_VALUE;
                Object obj = c0853c.f3362h;
                coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = c0853c.f3364j;
                if (i == 0) {
                    if (i == 1) {
                        ResultKt.throwOnFailure(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.throwOnFailure(obj);
                    B43 b43 = this.f3357c;
                    if (b43 != null) {
                        c0853c.f3364j = 1;
                        obj = b43.mo107094j(j, c0853c);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        m15349a = C48275ro6.f107663b.m15349a();
                        return C48275ro6.m15363b(m15349a);
                    }
                }
                m15349a = ((C48275ro6) obj).m15350o();
                return C48275ro6.m15363b(m15349a);
            }
        }
        c0853c = new C0853c(continuation);
        Object obj2 = c0853c.f3362h;
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = c0853c.f3364j;
        if (i == 0) {
        }
        m15349a = ((C48275ro6) obj2).m15350o();
        return C48275ro6.m15363b(m15349a);
    }

    /* renamed from: d */
    public final long m112917d(long j, int i) {
        B43 b43 = this.f3357c;
        return b43 != null ? b43.mo72409k(j, i) : C32120Ce3.f4427b.m111932c();
    }

    /* renamed from: e */
    public final ZC0 m112916e() {
        ZC0 invoke = this.f3355a.invoke();
        if (invoke != null) {
            return invoke;
        }
        throw new IllegalStateException("in order to access nested coroutine scope you need to attach dispatcher to the `Modifier.nestedScroll` first.");
    }

    /* renamed from: f */
    public final ZC0 m112915f() {
        return this.f3356b;
    }

    /* renamed from: g */
    public final void m112914g(Function0<? extends ZC0> function0) {
        Intrinsics.checkNotNullParameter(function0, "<set-?>");
        this.f3355a = function0;
    }

    /* renamed from: h */
    public final void m112913h(ZC0 zc0) {
        this.f3356b = zc0;
    }

    /* renamed from: i */
    public final void m112912i(B43 b43) {
        this.f3357c = b43;
    }
}
