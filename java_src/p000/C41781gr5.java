package p000;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import com.stripe.android.financialconnections.p041ui.FinancialConnectionsSheetNativeActivity;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.CoroutineStackFrame;
import kotlin.jvm.JvmField;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import p000.C38856bx2;
import p000.InterfaceC52943zh2;
@Metadata(m28433d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0014\b\u0001\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\u00020\u00022\b\u0012\u0004\u0012\u00028\u00000\u00032\b\u0012\u0004\u0012\u00028\u00000\u00042\b\u0012\u0004\u0012\u00028\u00000\u00052\u00060\u0006j\u0002`\u0007:\u0004JKLMB\u0015\u0012\f\u00106\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0004\bH\u0010IJ\u0017\u0010\n\u001a\n\u0018\u00010\bj\u0004\u0018\u0001`\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ \u0010\u000f\u001a\u00020\u000e2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\fH\u0016ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0011\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u0018\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0019\u0010\u0014J\u0017\u0010\u001c\u001a\u00020\u000e2\u0006\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b\u001f\u0010 J\u001b\u0010#\u001a\u0004\u0018\u00010\u00152\b\u0010\"\u001a\u0004\u0018\u00010!H\u0016¢\u0006\u0004\b#\u0010$J\u0019\u0010'\u001a\u0004\u0018\u00010\u00152\u0006\u0010&\u001a\u00020%H\u0016¢\u0006\u0004\b'\u0010(J\u000f\u0010*\u001a\u00020)H\u0016¢\u0006\u0004\b*\u0010+JG\u00100\u001a\u00020\u000e\"\u0004\b\u0001\u0010,*\b\u0012\u0004\u0012\u00028\u00010-2\"\u0010/\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00150.H\u0096\u0002ø\u0001\u0000¢\u0006\u0004\b0\u00101J\u000f\u00102\u001a\u00020\u000eH\u0002¢\u0006\u0004\b2\u00103J\u000f\u00104\u001a\u00020\u000eH\u0002¢\u0006\u0004\b4\u00103R\u001a\u00106\u001a\b\u0012\u0004\u0012\u00028\u00000\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u00105R\u001c\u00109\u001a\n\u0018\u00010\u0006j\u0004\u0018\u0001`\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b7\u00108R\u0014\u0010=\u001a\u00020:8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b;\u0010<R\u001a\u0010@\u001a\b\u0012\u0004\u0012\u00028\u00000\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b>\u0010?R\u0014\u0010B\u001a\u00020\u001e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bA\u0010 R(\u0010G\u001a\u0004\u0018\u00010\u001a2\b\u0010C\u001a\u0004\u0018\u00010\u001a8B@BX\u0082\u000e¢\u0006\f\u001a\u0004\bD\u0010E\"\u0004\bF\u0010\u001d\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006N"}, m28432d2 = {"Lgr5;", "R", "LZw2;", "Lfr5;", "Lrr5;", "Lkotlin/coroutines/Continuation;", "Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;", "Lkotlinx/coroutines/internal/CoroutineStackFrame;", "Ljava/lang/StackTraceElement;", "Lkotlinx/coroutines/internal/StackTraceElement;", "getStackTraceElement", "()Ljava/lang/StackTraceElement;", "Lkotlin/Result;", FinancialConnectionsSheetNativeActivity.EXTRA_RESULT, "", "resumeWith", "(Ljava/lang/Object;)V", "", "exception", "o", "(Ljava/lang/Throwable;)V", "", "V", "()Ljava/lang/Object;", "e", "W", "Lo51;", "handle", "j", "(Lo51;)V", "", "l", "()Z", "Lbx2$c;", "otherOp", "n", "(Lbx2$c;)Ljava/lang/Object;", "Lop;", "desc", "h", "(Lop;)Ljava/lang/Object;", "", "toString", "()Ljava/lang/String;", "Q", "Lhr5;", "Lkotlin/Function2;", "block", "k", "(Lhr5;Lkotlin/jvm/functions/Function2;)V", "Y", "()V", "T", "Lkotlin/coroutines/Continuation;", "uCont", "getCallerFrame", "()Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;", "callerFrame", "Lkotlin/coroutines/CoroutineContext;", "getContext", "()Lkotlin/coroutines/CoroutineContext;", CoreConstants.CONTEXT_SCOPE_VALUE, "m", "()Lkotlin/coroutines/Continuation;", "completion", "i", "isSelected", "value", "U", "()Lo51;", "Z", "parentHandle", "<init>", "(Lkotlin/coroutines/Continuation;)V", C17296a.f69688o, "b", "c", DateTokenConverter.CONVERTER_KEY, "kotlinx-coroutines-core"}, m28431k = 1, m28430mv = {1, 6, 0})
@PublishedApi
/* renamed from: gr5  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41781gr5<R> extends C37663Zw2 implements InterfaceC41188fr5<R>, InterfaceC48304rr5<R>, Continuation<R>, CoroutineStackFrame {

    /* renamed from: f */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f84370f = AtomicReferenceFieldUpdater.newUpdater(C41781gr5.class, Object.class, "_state");

    /* renamed from: g */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f84371g = AtomicReferenceFieldUpdater.newUpdater(C41781gr5.class, Object.class, "_result");
    private volatile /* synthetic */ Object _parentHandle;
    private volatile /* synthetic */ Object _result;
    volatile /* synthetic */ Object _state = C48896sr5.m13570e();

    /* renamed from: e */
    public final Continuation<R> f84372e;

    @Metadata(m28433d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0007\b\u0002\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B\u001b\u0012\n\u0010\u0010\u001a\u0006\u0012\u0002\b\u00030\r\u0012\u0006\u0010\u0014\u001a\u00020\u0011¢\u0006\u0004\b\u001a\u0010\u001bJ\u0014\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\u001c\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002H\u0016J\b\u0010\t\u001a\u00020\bH\u0016J\n\u0010\n\u001a\u0004\u0018\u00010\u0002H\u0002J\b\u0010\u000b\u001a\u00020\u0006H\u0002J\u0012\u0010\f\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002H\u0002R\u0018\u0010\u0010\u001a\u0006\u0012\u0002\b\u00030\r8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0014\u001a\u00020\u00118\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0019\u001a\u00020\u00158\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001c"}, m28432d2 = {"Lgr5$a;", "Lrp;", "", "affected", "i", "failure", "", DateTokenConverter.CONVERTER_KEY, "", "toString", "k", "l", "j", "Lgr5;", "b", "Lgr5;", "impl", "Lop;", "c", "Lop;", "desc", "", "J", "g", "()J", "opSequence", "<init>", "(Lgr5;Lop;)V", "kotlinx-coroutines-core"}, m28431k = 1, m28430mv = {1, 6, 0})
    /* renamed from: gr5$a */
    /* loaded from: classes8.dex */
    public static final class C22494a extends AbstractC28006rp<Object> {
        @JvmField

        /* renamed from: b */
        public final C41781gr5<?> f84373b;
        @JvmField

        /* renamed from: c */
        public final AbstractC27064op f84374c;

        /* renamed from: d */
        public final long f84375d;

        public C22494a(C41781gr5<?> c41781gr5, AbstractC27064op abstractC27064op) {
            C33886Js5 c33886Js5;
            this.f84373b = c41781gr5;
            this.f84374c = abstractC27064op;
            c33886Js5 = C48896sr5.f109426e;
            this.f84375d = c33886Js5.m99612a();
            abstractC27064op.m20473d(this);
        }

        @Override // p000.AbstractC28006rp
        /* renamed from: d */
        public void mo15331d(Object obj, Object obj2) {
            m37383j(obj2);
            this.f84374c.mo20476a(this, obj2);
        }

        @Override // p000.AbstractC28006rp
        /* renamed from: g */
        public long mo15328g() {
            return this.f84375d;
        }

        @Override // p000.AbstractC28006rp
        /* renamed from: i */
        public Object mo15326i(Object obj) {
            Object m37382k;
            if (obj == null && (m37382k = m37382k()) != null) {
                return m37382k;
            }
            try {
                return this.f84374c.mo20474c(this);
            } catch (Throwable th) {
                if (obj == null) {
                    m37381l();
                }
                throw th;
            }
        }

        /* renamed from: j */
        public final void m37383j(Object obj) {
            boolean z;
            Object m13570e;
            if (obj == null) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                m13570e = null;
            } else {
                m13570e = C48896sr5.m13570e();
            }
            if (C22859i1.m35391a(C41781gr5.f84370f, this.f84373b, this, m13570e) && z) {
                this.f84373b.m37390T();
            }
        }

        /* renamed from: k */
        public final Object m37382k() {
            C41781gr5<?> c41781gr5 = this.f84373b;
            while (true) {
                Object obj = c41781gr5._state;
                if (obj == this) {
                    return null;
                }
                if (obj instanceof AbstractC33083Gh3) {
                    ((AbstractC33083Gh3) obj).mo15332c(this.f84373b);
                } else if (obj == C48896sr5.m13570e()) {
                    if (C22859i1.m35391a(C41781gr5.f84370f, this.f84373b, C48896sr5.m13570e(), this)) {
                        return null;
                    }
                } else {
                    return C48896sr5.m13571d();
                }
            }
        }

        /* renamed from: l */
        public final void m37381l() {
            C22859i1.m35391a(C41781gr5.f84370f, this.f84373b, this, C48896sr5.m13570e());
        }

        @Override // p000.AbstractC33083Gh3
        public String toString() {
            return "AtomicSelectOp(sequence=" + mo15328g() + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\b"}, m28432d2 = {"Lgr5$b;", "Lbx2;", "Lo51;", "e", "Lo51;", "handle", "<init>", "(Lo51;)V", "kotlinx-coroutines-core"}, m28431k = 1, m28430mv = {1, 6, 0})
    /* renamed from: gr5$b */
    /* loaded from: classes8.dex */
    public static final class C22495b extends C38856bx2 {
        @JvmField

        /* renamed from: e */
        public final InterfaceC46067o51 f84376e;

        public C22495b(InterfaceC46067o51 interfaceC46067o51) {
            this.f84376e = interfaceC46067o51;
        }
    }

    @Metadata(m28433d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0005¢\u0006\u0004\b\f\u0010\rJ\u0014\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016R\u0014\u0010\b\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0018\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\n¨\u0006\u000e"}, m28432d2 = {"Lgr5$c;", "LGh3;", "", "affected", "c", "Lbx2$c;", C17296a.f69688o, "Lbx2$c;", "otherOp", "Lrp;", "()Lrp;", "atomicOp", "<init>", "(Lbx2$c;)V", "kotlinx-coroutines-core"}, m28431k = 1, m28430mv = {1, 6, 0})
    /* renamed from: gr5$c */
    /* loaded from: classes8.dex */
    public static final class C22496c extends AbstractC33083Gh3 {
        @JvmField

        /* renamed from: a */
        public final C38856bx2.C13354c f84377a;

        public C22496c(C38856bx2.C13354c c13354c) {
            this.f84377a = c13354c;
        }

        @Override // p000.AbstractC33083Gh3
        /* renamed from: a */
        public AbstractC28006rp<?> mo15333a() {
            return this.f84377a.mo15333a();
        }

        @Override // p000.AbstractC33083Gh3
        /* renamed from: c */
        public Object mo15332c(Object obj) {
            Object m13570e;
            if (obj != null) {
                C41781gr5 c41781gr5 = (C41781gr5) obj;
                this.f84377a.m62078d();
                Object m15330e = this.f84377a.mo15333a().m15330e(null);
                if (m15330e == null) {
                    m13570e = this.f84377a.f59828c;
                } else {
                    m13570e = C48896sr5.m13570e();
                }
                C22859i1.m35391a(C41781gr5.f84370f, c41781gr5, this, m13570e);
                return m15330e;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlinx.coroutines.selects.SelectBuilderImpl<*>");
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0013\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0096\u0002¨\u0006\b"}, m28432d2 = {"Lgr5$d;", "LAh2;", "", "cause", "", "P", "<init>", "(Lgr5;)V", "kotlinx-coroutines-core"}, m28431k = 1, m28430mv = {1, 6, 0})
    /* renamed from: gr5$d */
    /* loaded from: classes8.dex */
    public final class C22497d extends AbstractC31678Ah2 {
        public C22497d() {
        }

        @Override // p000.AbstractC48901ss0
        /* renamed from: P */
        public void mo13153P(Throwable th) {
            if (C41781gr5.this.mo15172l()) {
                C41781gr5.this.mo15169o(m89917Q().mo558F());
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            mo13153P(th);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C41781gr5(Continuation<? super R> continuation) {
        Object obj;
        this.f84372e = continuation;
        obj = C48896sr5.f109424c;
        this._result = obj;
        this._parentHandle = null;
    }

    /* renamed from: T */
    public final void m37390T() {
        InterfaceC46067o51 m37389U = m37389U();
        if (m37389U != null) {
            m37389U.dispose();
        }
        for (C38856bx2 c38856bx2 = (C38856bx2) m62099A(); !Intrinsics.areEqual(c38856bx2, this); c38856bx2 = c38856bx2.m62098D()) {
            if (c38856bx2 instanceof C22495b) {
                ((C22495b) c38856bx2).f84376e.dispose();
            }
        }
    }

    /* renamed from: U */
    public final InterfaceC46067o51 m37389U() {
        return (InterfaceC46067o51) this._parentHandle;
    }

    @PublishedApi
    /* renamed from: V */
    public final Object m37388V() {
        Object obj;
        Object obj2;
        Object obj3;
        Object coroutine_suspended;
        Object coroutine_suspended2;
        if (!mo15174i()) {
            m37386Y();
        }
        Object obj4 = this._result;
        obj = C48896sr5.f109424c;
        if (obj4 == obj) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f84371g;
            obj3 = C48896sr5.f109424c;
            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (C22859i1.m35391a(atomicReferenceFieldUpdater, this, obj3, coroutine_suspended)) {
                coroutine_suspended2 = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                return coroutine_suspended2;
            }
            obj4 = this._result;
        }
        obj2 = C48896sr5.f109425d;
        if (obj4 != obj2) {
            if (!(obj4 instanceof C47716qs0)) {
                return obj4;
            }
            throw ((C47716qs0) obj4).f105942a;
        }
        throw new IllegalStateException("Already resumed");
    }

    @PublishedApi
    /* renamed from: W */
    public final void m37387W(Throwable th) {
        if (mo15172l()) {
            Result.Companion companion = Result.Companion;
            resumeWith(Result.m116783constructorimpl(ResultKt.createFailure(th)));
        } else if (!(th instanceof CancellationException)) {
            Object m37388V = m37388V();
            if (!(m37388V instanceof C47716qs0) || ((C47716qs0) m37388V).f105942a != th) {
                VC0.m80237a(getContext(), th);
            }
        }
    }

    /* renamed from: Y */
    public final void m37386Y() {
        InterfaceC52943zh2 interfaceC52943zh2 = (InterfaceC52943zh2) getContext().get(InterfaceC52943zh2.f122077a0);
        if (interfaceC52943zh2 == null) {
            return;
        }
        InterfaceC46067o51 m547d = InterfaceC52943zh2.C31478a.m547d(interfaceC52943zh2, true, false, new C22497d(), 2, null);
        m37385Z(m547d);
        if (mo15174i()) {
            m547d.dispose();
        }
    }

    /* renamed from: Z */
    public final void m37385Z(InterfaceC46067o51 interfaceC46067o51) {
        this._parentHandle = interfaceC46067o51;
    }

    @Override // kotlin.coroutines.jvm.internal.CoroutineStackFrame
    public CoroutineStackFrame getCallerFrame() {
        Continuation<R> continuation = this.f84372e;
        if (continuation instanceof CoroutineStackFrame) {
            return (CoroutineStackFrame) continuation;
        }
        return null;
    }

    @Override // kotlin.coroutines.Continuation
    public CoroutineContext getContext() {
        return this.f84372e.getContext();
    }

    @Override // kotlin.coroutines.jvm.internal.CoroutineStackFrame
    public StackTraceElement getStackTraceElement() {
        return null;
    }

    @Override // p000.InterfaceC48304rr5
    /* renamed from: h */
    public Object mo15175h(AbstractC27064op abstractC27064op) {
        return new C22494a(this, abstractC27064op).mo15332c(null);
    }

    @Override // p000.InterfaceC48304rr5
    /* renamed from: i */
    public boolean mo15174i() {
        while (true) {
            Object obj = this._state;
            if (obj == C48896sr5.m13570e()) {
                return false;
            }
            if (obj instanceof AbstractC33083Gh3) {
                ((AbstractC33083Gh3) obj).mo15332c(this);
            } else {
                return true;
            }
        }
    }

    @Override // p000.InterfaceC48304rr5
    /* renamed from: j */
    public void mo15173j(InterfaceC46067o51 interfaceC46067o51) {
        C22495b c22495b = new C22495b(interfaceC46067o51);
        if (!mo15174i()) {
            m62085s(c22495b);
            if (!mo15174i()) {
                return;
            }
        }
        interfaceC46067o51.dispose();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.InterfaceC41188fr5
    /* renamed from: k */
    public <Q> void mo37384k(InterfaceC42374hr5<? extends Q> interfaceC42374hr5, Function2<? super Q, ? super Continuation<? super R>, ? extends Object> function2) {
        interfaceC42374hr5.mo29818y(this, function2);
    }

    @Override // p000.InterfaceC48304rr5
    /* renamed from: l */
    public boolean mo15172l() {
        Object mo15170n = mo15170n(null);
        if (mo15170n == C37247Yc0.f46071a) {
            return true;
        }
        if (mo15170n == null) {
            return false;
        }
        throw new IllegalStateException(("Unexpected trySelectIdempotent result " + mo15170n).toString());
    }

    @Override // p000.InterfaceC48304rr5
    /* renamed from: m */
    public Continuation<R> mo15171m() {
        return this;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0030, code lost:
        m37390T();
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0035, code lost:
        return p000.C37247Yc0.f46071a;
     */
    @Override // p000.InterfaceC48304rr5
    /* renamed from: n */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo15170n(C38856bx2.C13354c c13354c) {
        while (true) {
            Object obj = this._state;
            if (obj == C48896sr5.m13570e()) {
                if (c13354c == null) {
                    if (C22859i1.m35391a(f84370f, this, C48896sr5.m13570e(), null)) {
                        break;
                    }
                } else {
                    C22496c c22496c = new C22496c(c13354c);
                    if (C22859i1.m35391a(f84370f, this, C48896sr5.m13570e(), c22496c)) {
                        Object mo15332c = c22496c.mo15332c(this);
                        if (mo15332c != null) {
                            return mo15332c;
                        }
                    }
                }
            } else if (obj instanceof AbstractC33083Gh3) {
                if (c13354c != null) {
                    AbstractC28006rp<?> mo15333a = c13354c.mo15333a();
                    if ((mo15333a instanceof C22494a) && ((C22494a) mo15333a).f84373b == this) {
                        throw new IllegalStateException("Cannot use matching select clauses on the same object".toString());
                    }
                    if (mo15333a.m104879b((AbstractC33083Gh3) obj)) {
                        return C27694qp.f105860b;
                    }
                }
                ((AbstractC33083Gh3) obj).mo15332c(this);
            } else if (c13354c == null || obj != c13354c.f59828c) {
                return null;
            } else {
                return C37247Yc0.f46071a;
            }
        }
    }

    @Override // p000.InterfaceC48304rr5
    /* renamed from: o */
    public void mo15169o(Throwable th) {
        Object obj;
        Object obj2;
        Object coroutine_suspended;
        Object coroutine_suspended2;
        Object obj3;
        Continuation intercepted;
        while (true) {
            Object obj4 = this._result;
            obj = C48896sr5.f109424c;
            if (obj4 == obj) {
                C47716qs0 c47716qs0 = new C47716qs0(th, false, 2, null);
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f84371g;
                obj2 = C48896sr5.f109424c;
                if (C22859i1.m35391a(atomicReferenceFieldUpdater, this, obj2, c47716qs0)) {
                    return;
                }
            } else {
                coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (obj4 == coroutine_suspended) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f84371g;
                    coroutine_suspended2 = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    obj3 = C48896sr5.f109425d;
                    if (C22859i1.m35391a(atomicReferenceFieldUpdater2, this, coroutine_suspended2, obj3)) {
                        intercepted = IntrinsicsKt__IntrinsicsJvmKt.intercepted(this.f84372e);
                        Result.Companion companion = Result.Companion;
                        intercepted.resumeWith(Result.m116783constructorimpl(ResultKt.createFailure(th)));
                        return;
                    }
                } else {
                    throw new IllegalStateException("Already resumed");
                }
            }
        }
    }

    @Override // kotlin.coroutines.Continuation
    public void resumeWith(Object obj) {
        Object obj2;
        Object obj3;
        Object coroutine_suspended;
        Object coroutine_suspended2;
        Object obj4;
        while (true) {
            Object obj5 = this._result;
            obj2 = C48896sr5.f109424c;
            if (obj5 == obj2) {
                Object m11547d = C49494ts0.m11547d(obj, null, 1, null);
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f84371g;
                obj3 = C48896sr5.f109424c;
                if (C22859i1.m35391a(atomicReferenceFieldUpdater, this, obj3, m11547d)) {
                    return;
                }
            } else {
                coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (obj5 == coroutine_suspended) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f84371g;
                    coroutine_suspended2 = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    obj4 = C48896sr5.f109425d;
                    if (C22859i1.m35391a(atomicReferenceFieldUpdater2, this, coroutine_suspended2, obj4)) {
                        if (Result.m116789isFailureimpl(obj)) {
                            Continuation<R> continuation = this.f84372e;
                            Throwable m116786exceptionOrNullimpl = Result.m116786exceptionOrNullimpl(obj);
                            Intrinsics.checkNotNull(m116786exceptionOrNullimpl);
                            continuation.resumeWith(Result.m116783constructorimpl(ResultKt.createFailure(m116786exceptionOrNullimpl)));
                            return;
                        }
                        this.f84372e.resumeWith(obj);
                        return;
                    }
                } else {
                    throw new IllegalStateException("Already resumed");
                }
            }
        }
    }

    @Override // p000.C38856bx2
    public String toString() {
        return "SelectInstance(state=" + this._state + ", result=" + this._result + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
