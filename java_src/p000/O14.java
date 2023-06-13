package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;
import p000.SX2;
@Metadata(m28433d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010(\u001a\u00020\u0002¢\u0006\u0004\b+\u0010,J\u001a\u0010\u0005\u001a\u00020\u0004*\u00020\u0003H\u0097\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\b\u001a\u00020\u0004*\u00020\u0007H\u0097\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\u000b\u001a\u00020\u0003*\u00020\nH\u0097\u0001ø\u0001\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\r\u001a\u00020\u0003*\u00020\u0004H\u0097\u0001ø\u0001\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u0010*\u00020\u000fH\u0097\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0013\u001a\u00020\n*\u00020\u0003H\u0097\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0013\u0010\fJ\u001a\u0010\u0014\u001a\u00020\n*\u00020\u0007H\u0097\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0016\u001a\u00020\u000f*\u00020\u0010H\u0097\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0016\u0010\u0012J\u001a\u0010\u0017\u001a\u00020\u0007*\u00020\u0003H\u0097\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0006\u0010\u001a\u001a\u00020\u0019J\u0006\u0010\u001b\u001a\u00020\u0019J\u0013\u0010\u001c\u001a\u00020\u0019H\u0086@ø\u0001\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0013\u0010\u001f\u001a\u00020\u001eH\u0096@ø\u0001\u0001¢\u0006\u0004\b\u001f\u0010\u001dR\u0016\u0010!\u001a\u00020\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010 R\u0016\u0010\"\u001a\u00020\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010 R\u0014\u0010%\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010$R\u0014\u0010(\u001a\u00020\n8\u0016X\u0097\u0005¢\u0006\u0006\u001a\u0004\b&\u0010'R\u0014\u0010*\u001a\u00020\n8\u0016X\u0097\u0005¢\u0006\u0006\u001a\u0004\b)\u0010'\u0082\u0002\u000f\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0002\b!¨\u0006-"}, m28432d2 = {"LO14;", "LN14;", "Lg01;", "Lk61;", "", "F0", "(F)I", "LM26;", "V0", "(J)I", "", "x", "(F)F", "w", "(I)F", "LxB5;", "Lo61;", "j", "(J)J", "T0", "I0", "(J)F", "z", "s0", "(F)J", "", "c", DateTokenConverter.CONVERTER_KEY, "e", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "H0", "Z", "isReleased", "isCanceled", "LSX2;", "LSX2;", "mutex", "b", "()F", "density", "R0", "fontScale", "<init>", "(Lg01;)V", "foundation_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: O14 */
/* loaded from: classes.dex */
public final class O14 implements N14, InterfaceC41273g01 {

    /* renamed from: b */
    public final /* synthetic */ InterfaceC41273g01 f25527b;

    /* renamed from: c */
    public boolean f25528c;

    /* renamed from: d */
    public boolean f25529d;

    /* renamed from: e */
    public final SX2 f25530e;

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    @DebugMetadata(m28419c = "androidx.compose.foundation.gestures.PressGestureScopeImpl", m28418f = "TapGestureDetector.kt", m28417i = {0}, m28416l = {357}, m28415m = "reset", m28414n = {"this"}, m28413s = {"L$0"})
    /* renamed from: O14$a */
    /* loaded from: classes.dex */
    public static final class C5814a extends ContinuationImpl {

        /* renamed from: h */
        public Object f25531h;

        /* renamed from: i */
        public /* synthetic */ Object f25532i;

        /* renamed from: k */
        public int f25534k;

        public C5814a(Continuation<? super C5814a> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f25532i = obj;
            this.f25534k |= Integer.MIN_VALUE;
            return O14.this.m92992e(this);
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    @DebugMetadata(m28419c = "androidx.compose.foundation.gestures.PressGestureScopeImpl", m28418f = "TapGestureDetector.kt", m28417i = {0}, m28416l = {370}, m28415m = "tryAwaitRelease", m28414n = {"this"}, m28413s = {"L$0"})
    /* renamed from: O14$b */
    /* loaded from: classes.dex */
    public static final class C5815b extends ContinuationImpl {

        /* renamed from: h */
        public Object f25535h;

        /* renamed from: i */
        public /* synthetic */ Object f25536i;

        /* renamed from: k */
        public int f25538k;

        public C5815b(Continuation<? super C5815b> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f25536i = obj;
            this.f25538k |= Integer.MIN_VALUE;
            return O14.this.mo92995H0(this);
        }
    }

    public O14(InterfaceC41273g01 density) {
        Intrinsics.checkNotNullParameter(density, "density");
        this.f25527b = density;
        this.f25530e = UX2.m81381a(false);
    }

    @Override // p000.InterfaceC41273g01
    /* renamed from: F0 */
    public int mo3416F0(float f) {
        return this.f25527b.mo3416F0(f);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0036  */
    @Override // p000.N14
    /* renamed from: H0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo92995H0(Continuation<? super Boolean> continuation) {
        C5815b c5815b;
        Object coroutine_suspended;
        int i;
        O14 o14;
        if (continuation instanceof C5815b) {
            c5815b = (C5815b) continuation;
            int i2 = c5815b.f25538k;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c5815b.f25538k = i2 - Integer.MIN_VALUE;
                Object obj = c5815b.f25536i;
                coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = c5815b.f25538k;
                if (i == 0) {
                    if (i == 1) {
                        o14 = (O14) c5815b.f25535h;
                        ResultKt.throwOnFailure(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.throwOnFailure(obj);
                    if (!this.f25528c && !this.f25529d) {
                        SX2 sx2 = this.f25530e;
                        c5815b.f25535h = this;
                        c5815b.f25538k = 1;
                        if (SX2.C7471a.m85311a(sx2, null, c5815b, 1, null) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        o14 = this;
                    } else {
                        o14 = this;
                        return Boxing.boxBoolean(o14.f25528c);
                    }
                }
                SX2.C7471a.m85310b(o14.f25530e, null, 1, null);
                return Boxing.boxBoolean(o14.f25528c);
            }
        }
        c5815b = new C5815b(continuation);
        Object obj2 = c5815b.f25536i;
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = c5815b.f25538k;
        if (i == 0) {
        }
        SX2.C7471a.m85310b(o14.f25530e, null, 1, null);
        return Boxing.boxBoolean(o14.f25528c);
    }

    @Override // p000.InterfaceC41273g01
    /* renamed from: I0 */
    public float mo3415I0(long j) {
        return this.f25527b.mo3415I0(j);
    }

    @Override // p000.InterfaceC41273g01
    /* renamed from: R0 */
    public float mo3412R0() {
        return this.f25527b.mo3412R0();
    }

    @Override // p000.InterfaceC41273g01
    /* renamed from: T0 */
    public float mo3411T0(float f) {
        return this.f25527b.mo3411T0(f);
    }

    @Override // p000.InterfaceC41273g01
    /* renamed from: V0 */
    public int mo3410V0(long j) {
        return this.f25527b.mo3410V0(j);
    }

    @Override // p000.InterfaceC41273g01
    /* renamed from: b */
    public float mo3408b() {
        return this.f25527b.mo3408b();
    }

    /* renamed from: c */
    public final void m92994c() {
        this.f25529d = true;
        SX2.C7471a.m85310b(this.f25530e, null, 1, null);
    }

    /* renamed from: d */
    public final void m92993d() {
        this.f25528c = true;
        SX2.C7471a.m85310b(this.f25530e, null, 1, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m92992e(Continuation<? super Unit> continuation) {
        C5814a c5814a;
        Object coroutine_suspended;
        int i;
        O14 o14;
        if (continuation instanceof C5814a) {
            c5814a = (C5814a) continuation;
            int i2 = c5814a.f25534k;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c5814a.f25534k = i2 - Integer.MIN_VALUE;
                Object obj = c5814a.f25532i;
                coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = c5814a.f25534k;
                if (i == 0) {
                    if (i == 1) {
                        o14 = (O14) c5814a.f25531h;
                        ResultKt.throwOnFailure(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.throwOnFailure(obj);
                    SX2 sx2 = this.f25530e;
                    c5814a.f25531h = this;
                    c5814a.f25534k = 1;
                    if (SX2.C7471a.m85311a(sx2, null, c5814a, 1, null) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    o14 = this;
                }
                o14.f25528c = false;
                o14.f25529d = false;
                return Unit.INSTANCE;
            }
        }
        c5814a = new C5814a(continuation);
        Object obj2 = c5814a.f25532i;
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = c5814a.f25534k;
        if (i == 0) {
        }
        o14.f25528c = false;
        o14.f25529d = false;
        return Unit.INSTANCE;
    }

    @Override // p000.InterfaceC41273g01
    /* renamed from: j */
    public long mo3403j(long j) {
        return this.f25527b.mo3403j(j);
    }

    @Override // p000.InterfaceC41273g01
    /* renamed from: s0 */
    public long mo3399s0(float f) {
        return this.f25527b.mo3399s0(f);
    }

    @Override // p000.InterfaceC41273g01
    /* renamed from: w */
    public float mo3398w(int i) {
        return this.f25527b.mo3398w(i);
    }

    @Override // p000.InterfaceC41273g01
    /* renamed from: x */
    public float mo3397x(float f) {
        return this.f25527b.mo3397x(f);
    }

    @Override // p000.InterfaceC41273g01
    /* renamed from: z */
    public long mo3395z(long j) {
        return this.f25527b.mo3395z(j);
    }
}
