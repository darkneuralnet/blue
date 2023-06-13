package p000;

import ch.qos.logback.core.joran.action.Action;
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
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u00012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00000\u00022\u00020\u0003B\u0017\u0012\u0006\u0010\u001b\u001a\u00020\u0016\u0012\u0006\u0010 \u001a\u00020\u0003¢\u0006\u0004\b3\u00104J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J%\u0010\f\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\f\u0010\rJ-\u0010\u000f\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000f\u0010\u0010J!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\u0011H\u0096@ø\u0001\u0000ø\u0001\u0001ø\u0001\u0001¢\u0006\u0004\b\u0012\u0010\u0013J)\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\u0011H\u0096@ø\u0001\u0000ø\u0001\u0001ø\u0001\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u001b\u001a\u00020\u00168\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010 \u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR/\u0010(\u001a\u0004\u0018\u00010\u00002\b\u0010!\u001a\u0004\u0018\u00010\u00008B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\u001c\u0010,\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00000)8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b*\u0010+R\u0014\u0010.\u001a\u00020\u00008VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b-\u0010%R\u0014\u00102\u001a\u00020/8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b0\u00101\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u00065"}, m28432d2 = {"LF43;", "LiV2;", "LoV2;", "LB43;", "LpV2;", Action.SCOPE_ATTRIBUTE, "", "o0", "LCe3;", "available", "LH43;", Stripe3ds2AuthParams.FIELD_SOURCE, "k", "(JI)J", "consumed", "h", "(JJI)J", "Lro6;", "j", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", C17296a.f69688o, "(JJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "LC43;", "b", "LC43;", "getDispatcher", "()LC43;", "dispatcher", "c", "LB43;", "getConnection", "()LB43;", "connection", "<set-?>", DateTokenConverter.CONVERTER_KEY, "LEX2;", "p", "()LF43;", "r", "(LF43;)V", "parent", "LV94;", "getKey", "()LV94;", "key", "q", "value", "LZC0;", "m", "()LZC0;", "nestedCoroutineScope", "<init>", "(LC43;LB43;)V", "ui_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nNestedScrollModifierLocal.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NestedScrollModifierLocal.kt\nandroidx/compose/ui/input/nestedscroll/NestedScrollModifierLocal\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,100:1\n76#2:101\n102#2,2:102\n*S KotlinDebug\n*F\n+ 1 NestedScrollModifierLocal.kt\nandroidx/compose/ui/input/nestedscroll/NestedScrollModifierLocal\n*L\n45#1:101\n45#1:102,2\n*E\n"})
/* renamed from: F43 */
/* loaded from: classes.dex */
public final class F43 implements InterfaceC42749iV2, InterfaceC46307oV2<F43>, B43 {

    /* renamed from: b */
    public final C43 f8637b;

    /* renamed from: c */
    public final B43 f8638c;

    /* renamed from: d */
    public final EX2 f8639d;

    @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"LZC0;", "b", "()LZC0;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: F43$a */
    /* loaded from: classes.dex */
    public static final class C2133a extends Lambda implements Function0<ZC0> {
        public C2133a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b */
        public final ZC0 invoke() {
            return F43.this.m107817m();
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    @DebugMetadata(m28419c = "androidx.compose.ui.input.nestedscroll.NestedScrollModifierLocal", m28418f = "NestedScrollModifierLocal.kt", m28417i = {0, 0, 0, 1}, m28416l = {94, 96}, m28415m = "onPostFling-RZ2iAVY", m28414n = {"this", "consumed", "available", "selfConsumed"}, m28413s = {"L$0", "J$0", "J$1", "J$0"})
    /* renamed from: F43$b */
    /* loaded from: classes.dex */
    public static final class C2134b extends ContinuationImpl {

        /* renamed from: h */
        public Object f8641h;

        /* renamed from: i */
        public long f8642i;

        /* renamed from: j */
        public long f8643j;

        /* renamed from: k */
        public /* synthetic */ Object f8644k;

        /* renamed from: m */
        public int f8646m;

        public C2134b(Continuation<? super C2134b> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f8644k = obj;
            this.f8646m |= Integer.MIN_VALUE;
            return F43.this.mo72411a(0L, 0L, this);
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    @DebugMetadata(m28419c = "androidx.compose.ui.input.nestedscroll.NestedScrollModifierLocal", m28418f = "NestedScrollModifierLocal.kt", m28417i = {0, 0, 1}, m28416l = {88, 89}, m28415m = "onPreFling-QWom1Mo", m28414n = {"this", "available", "parentPreConsumed"}, m28413s = {"L$0", "J$0", "J$0"})
    /* renamed from: F43$c */
    /* loaded from: classes.dex */
    public static final class C2135c extends ContinuationImpl {

        /* renamed from: h */
        public Object f8647h;

        /* renamed from: i */
        public long f8648i;

        /* renamed from: j */
        public /* synthetic */ Object f8649j;

        /* renamed from: l */
        public int f8651l;

        public C2135c(Continuation<? super C2135c> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f8649j = obj;
            this.f8651l |= Integer.MIN_VALUE;
            return F43.this.mo107094j(0L, this);
        }
    }

    public F43(C43 dispatcher, B43 connection) {
        EX2 m97025e;
        Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
        Intrinsics.checkNotNullParameter(connection, "connection");
        this.f8637b = dispatcher;
        this.f8638c = connection;
        dispatcher.m112914g(new C2133a());
        m97025e = LM5.m97025e(null, null, 2, null);
        this.f8639d = m97025e;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0094  */
    @Override // p000.B43
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo72411a(long j, long j2, Continuation<? super C48275ro6> continuation) {
        C2134b c2134b;
        Object coroutine_suspended;
        int i;
        long j3;
        long j4;
        F43 f43;
        F43 m107816p;
        long j5;
        long m15349a;
        long j6;
        if (continuation instanceof C2134b) {
            c2134b = (C2134b) continuation;
            int i2 = c2134b.f8646m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c2134b.f8646m = i2 - Integer.MIN_VALUE;
                Object obj = c2134b.f8644k;
                coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = c2134b.f8646m;
                if (i == 0) {
                    if (i != 1) {
                        if (i == 2) {
                            j6 = c2134b.f8642i;
                            ResultKt.throwOnFailure(obj);
                            m15349a = ((C48275ro6) obj).m15350o();
                            j5 = j6;
                            return C48275ro6.m15363b(C48275ro6.m15353l(j5, m15349a));
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    long j7 = c2134b.f8643j;
                    long j8 = c2134b.f8642i;
                    f43 = (F43) c2134b.f8641h;
                    ResultKt.throwOnFailure(obj);
                    j4 = j7;
                    j3 = j8;
                } else {
                    ResultKt.throwOnFailure(obj);
                    B43 b43 = this.f8638c;
                    c2134b.f8641h = this;
                    j3 = j;
                    c2134b.f8642i = j3;
                    j4 = j2;
                    c2134b.f8643j = j4;
                    c2134b.f8646m = 1;
                    obj = b43.mo72411a(j, j2, c2134b);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    f43 = this;
                }
                long m15350o = ((C48275ro6) obj).m15350o();
                m107816p = f43.m107816p();
                if (m107816p == null) {
                    long m15353l = C48275ro6.m15353l(j3, m15350o);
                    long m15354k = C48275ro6.m15354k(j4, m15350o);
                    c2134b.f8641h = null;
                    c2134b.f8642i = m15350o;
                    c2134b.f8646m = 2;
                    obj = m107816p.mo72411a(m15353l, m15354k, c2134b);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    j6 = m15350o;
                    m15349a = ((C48275ro6) obj).m15350o();
                    j5 = j6;
                    return C48275ro6.m15363b(C48275ro6.m15353l(j5, m15349a));
                }
                j5 = m15350o;
                m15349a = C48275ro6.f107663b.m15349a();
                return C48275ro6.m15363b(C48275ro6.m15353l(j5, m15349a));
            }
        }
        c2134b = new C2134b(continuation);
        Object obj2 = c2134b.f8644k;
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = c2134b.f8646m;
        if (i == 0) {
        }
        long m15350o2 = ((C48275ro6) obj2).m15350o();
        m107816p = f43.m107816p();
        if (m107816p == null) {
        }
    }

    @Override // p000.InterfaceC46307oV2
    public V94<F43> getKey() {
        return G43.m105858a();
    }

    @Override // p000.B43
    /* renamed from: h */
    public long mo72410h(long j, long j2, int i) {
        long m111932c;
        long mo72410h = this.f8638c.mo72410h(j, j2, i);
        F43 m107816p = m107816p();
        if (m107816p != null) {
            m111932c = m107816p.mo72410h(C32120Ce3.m111939t(j, mo72410h), C32120Ce3.m111940s(j2, mo72410h), i);
        } else {
            m111932c = C32120Ce3.f4427b.m111932c();
        }
        return C32120Ce3.m111939t(mo72410h, m111932c);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007b A[RETURN] */
    @Override // p000.B43
    /* renamed from: j */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo107094j(long j, Continuation<? super C48275ro6> continuation) {
        C2135c c2135c;
        Object obj;
        Object coroutine_suspended;
        int i;
        long m15349a;
        F43 f43;
        long j2;
        if (continuation instanceof C2135c) {
            c2135c = (C2135c) continuation;
            int i2 = c2135c.f8651l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c2135c.f8651l = i2 - Integer.MIN_VALUE;
                obj = c2135c.f8649j;
                coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = c2135c.f8651l;
                if (i == 0) {
                    if (i != 1) {
                        if (i == 2) {
                            j2 = c2135c.f8648i;
                            ResultKt.throwOnFailure(obj);
                            return C48275ro6.m15363b(C48275ro6.m15353l(j2, ((C48275ro6) obj).m15350o()));
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    j = c2135c.f8648i;
                    f43 = (F43) c2135c.f8647h;
                    ResultKt.throwOnFailure(obj);
                } else {
                    ResultKt.throwOnFailure(obj);
                    F43 m107816p = m107816p();
                    if (m107816p != null) {
                        c2135c.f8647h = this;
                        c2135c.f8648i = j;
                        c2135c.f8651l = 1;
                        obj = m107816p.mo107094j(j, c2135c);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        f43 = this;
                    } else {
                        m15349a = C48275ro6.f107663b.m15349a();
                        f43 = this;
                        long j3 = j;
                        j2 = m15349a;
                        B43 b43 = f43.f8638c;
                        long m15354k = C48275ro6.m15354k(j3, j2);
                        c2135c.f8647h = null;
                        c2135c.f8648i = j2;
                        c2135c.f8651l = 2;
                        obj = b43.mo107094j(m15354k, c2135c);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        return C48275ro6.m15363b(C48275ro6.m15353l(j2, ((C48275ro6) obj).m15350o()));
                    }
                }
                m15349a = ((C48275ro6) obj).m15350o();
                long j32 = j;
                j2 = m15349a;
                B43 b432 = f43.f8638c;
                long m15354k2 = C48275ro6.m15354k(j32, j2);
                c2135c.f8647h = null;
                c2135c.f8648i = j2;
                c2135c.f8651l = 2;
                obj = b432.mo107094j(m15354k2, c2135c);
                if (obj == coroutine_suspended) {
                }
                return C48275ro6.m15363b(C48275ro6.m15353l(j2, ((C48275ro6) obj).m15350o()));
            }
        }
        c2135c = new C2135c(continuation);
        obj = c2135c.f8649j;
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = c2135c.f8651l;
        if (i == 0) {
        }
        m15349a = ((C48275ro6) obj).m15350o();
        long j322 = j;
        j2 = m15349a;
        B43 b4322 = f43.f8638c;
        long m15354k22 = C48275ro6.m15354k(j322, j2);
        c2135c.f8647h = null;
        c2135c.f8648i = j2;
        c2135c.f8651l = 2;
        obj = b4322.mo107094j(m15354k22, c2135c);
        if (obj == coroutine_suspended) {
        }
        return C48275ro6.m15363b(C48275ro6.m15353l(j2, ((C48275ro6) obj).m15350o()));
    }

    @Override // p000.B43
    /* renamed from: k */
    public long mo72409k(long j, int i) {
        long m111932c;
        F43 m107816p = m107816p();
        if (m107816p != null) {
            m111932c = m107816p.mo72409k(j, i);
        } else {
            m111932c = C32120Ce3.f4427b.m111932c();
        }
        return C32120Ce3.m111939t(m111932c, this.f8638c.mo72409k(C32120Ce3.m111940s(j, m111932c), i));
    }

    /* renamed from: m */
    public final ZC0 m107817m() {
        ZC0 m112915f;
        F43 m107816p = m107816p();
        if ((m107816p != null && (m112915f = m107816p.m107817m()) != null) || (m112915f = this.f8637b.m112915f()) != null) {
            return m112915f;
        }
        throw new IllegalStateException("in order to access nested coroutine scope you need to attach dispatcher to the `Modifier.nestedScroll` first.");
    }

    @Override // p000.InterfaceC42749iV2
    /* renamed from: o0 */
    public void mo33854o0(InterfaceC46900pV2 scope) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        m107814r((F43) scope.mo19176a(G43.m105858a()));
        this.f8637b.m112912i(m107816p());
    }

    /* renamed from: p */
    public final F43 m107816p() {
        return (F43) this.f8639d.getValue();
    }

    @Override // p000.InterfaceC46307oV2
    /* renamed from: q */
    public F43 getValue() {
        return this;
    }

    /* renamed from: r */
    public final void m107814r(F43 f43) {
        this.f8639d.setValue(f43);
    }
}
