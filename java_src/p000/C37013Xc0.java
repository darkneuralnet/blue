package p000;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.amazonaws.mobileconnectors.p025s3.transferutility.TransferTable;
import com.facebook.share.internal.C17296a;
import com.stripe.android.financialconnections.p041ui.FinancialConnectionsSheetNativeActivity;
import com.stripe.android.model.Stripe3ds2AuthResult;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.CoroutineStackFrame;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.CompletionHandlerException;
import p000.InterfaceC52943zh2;
@Metadata(m28433d1 = {"\u0000°\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0011\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u00032\u00060\u0004j\u0002`\u0005B\u001f\u0012\f\u0010o\u001a\b\u0012\u0004\u0012\u00028\u00000k\u0012\u0006\u0010)\u001a\u00020#¢\u0006\u0006\b\u0080\u0001\u0010\u0081\u0001J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJB\u0010\u0013\u001a\u00020\u00102'\u0010\u0012\u001a#\u0012\u0015\u0012\u0013\u0018\u00010\t¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u00100\rj\u0002`\u00112\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0015\u0010\bJ\u000f\u0010\u0016\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0016\u0010\bJ\u0011\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJB\u0010\u001e\u001a\u00020\u00102'\u0010\u0012\u001a#\u0012\u0015\u0012\u0013\u0018\u00010\t¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u00100\rj\u0002`\u00112\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ8\u0010!\u001a\u00020 2'\u0010\u0012\u001a#\u0012\u0015\u0012\u0013\u0018\u00010\t¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u00100\rj\u0002`\u0011H\u0002¢\u0006\u0004\b!\u0010\"J\u0017\u0010%\u001a\u00020\u00102\u0006\u0010$\u001a\u00020#H\u0002¢\u0006\u0004\b%\u0010&JZ\u0010,\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\u001d\u001a\u00020'2\b\u0010(\u001a\u0004\u0018\u00010\u001c2\u0006\u0010)\u001a\u00020#2#\u0010*\u001a\u001f\u0012\u0013\u0012\u00110\t¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\r2\b\u0010+\u001a\u0004\u0018\u00010\u001cH\u0002¢\u0006\u0004\b,\u0010-JH\u0010.\u001a\u00020\u00102\b\u0010(\u001a\u0004\u0018\u00010\u001c2\u0006\u0010)\u001a\u00020#2%\b\u0002\u0010*\u001a\u001f\u0012\u0013\u0012\u00110\t¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\rH\u0002¢\u0006\u0004\b.\u0010/JJ\u00101\u001a\u0004\u0018\u0001002\b\u0010(\u001a\u0004\u0018\u00010\u001c2\b\u0010+\u001a\u0004\u0018\u00010\u001c2#\u0010*\u001a\u001f\u0012\u0013\u0012\u00110\t¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\rH\u0002¢\u0006\u0004\b1\u00102J\u0019\u00104\u001a\u0002032\b\u0010(\u001a\u0004\u0018\u00010\u001cH\u0002¢\u0006\u0004\b4\u00105J\u000f\u00106\u001a\u00020\u0010H\u0002¢\u0006\u0004\b6\u0010\u001bJ\u000f\u00107\u001a\u00020\u0010H\u0016¢\u0006\u0004\b7\u0010\u001bJ\u000f\u00108\u001a\u00020\u0006H\u0001¢\u0006\u0004\b8\u0010\bJ\u0017\u0010;\u001a\n\u0018\u000109j\u0004\u0018\u0001`:H\u0016¢\u0006\u0004\b;\u0010<J\u0011\u0010=\u001a\u0004\u0018\u00010\u001cH\u0010¢\u0006\u0004\b=\u0010>J!\u0010@\u001a\u00020\u00102\b\u0010?\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\n\u001a\u00020\tH\u0010¢\u0006\u0004\b@\u0010AJ\u0019\u0010B\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\bB\u0010\fJ\u0017\u0010C\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\tH\u0000¢\u0006\u0004\bC\u0010DJ\u001f\u0010E\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020 2\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\bE\u0010FJ8\u0010G\u001a\u00020\u00102!\u0010*\u001a\u001d\u0012\u0013\u0012\u00110\t¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u00100\r2\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\bG\u0010\u0014J\u0017\u0010J\u001a\u00020\t2\u0006\u0010I\u001a\u00020HH\u0016¢\u0006\u0004\bJ\u0010KJ\u0011\u0010L\u001a\u0004\u0018\u00010\u001cH\u0001¢\u0006\u0004\bL\u0010>J \u0010O\u001a\u00020\u00102\f\u0010N\u001a\b\u0012\u0004\u0012\u00028\u00000MH\u0016ø\u0001\u0000¢\u0006\u0004\bO\u0010PJ<\u0010R\u001a\u00020\u00102\u0006\u0010Q\u001a\u00028\u00002#\u0010*\u001a\u001f\u0012\u0013\u0012\u00110\t¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\rH\u0016¢\u0006\u0004\bR\u0010SJ8\u0010T\u001a\u00020\u00102'\u0010\u0012\u001a#\u0012\u0015\u0012\u0013\u0018\u00010\t¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u00100\rj\u0002`\u0011H\u0016¢\u0006\u0004\bT\u0010UJ\u000f\u0010V\u001a\u00020\u0010H\u0000¢\u0006\u0004\bV\u0010\u001bJ#\u0010W\u001a\u0004\u0018\u00010\u001c2\u0006\u0010Q\u001a\u00028\u00002\b\u0010+\u001a\u0004\u0018\u00010\u001cH\u0016¢\u0006\u0004\bW\u0010XJH\u0010Y\u001a\u0004\u0018\u00010\u001c2\u0006\u0010Q\u001a\u00028\u00002\b\u0010+\u001a\u0004\u0018\u00010\u001c2#\u0010*\u001a\u001f\u0012\u0013\u0012\u00110\t¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\rH\u0016¢\u0006\u0004\bY\u0010ZJ\u0019\u0010\\\u001a\u0004\u0018\u00010\u001c2\u0006\u0010[\u001a\u00020\tH\u0016¢\u0006\u0004\b\\\u0010]J\u0017\u0010_\u001a\u00020\u00102\u0006\u0010^\u001a\u00020\u001cH\u0016¢\u0006\u0004\b_\u0010PJ\u001b\u0010a\u001a\u00020\u0010*\u00020`2\u0006\u0010Q\u001a\u00028\u0000H\u0016¢\u0006\u0004\ba\u0010bJ\u001f\u0010c\u001a\u00028\u0001\"\u0004\b\u0001\u0010\u00012\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0010¢\u0006\u0004\bc\u0010dJ\u001b\u0010e\u001a\u0004\u0018\u00010\t2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0010¢\u0006\u0004\be\u0010fJ\u000f\u0010h\u001a\u00020gH\u0016¢\u0006\u0004\bh\u0010iJ\u000f\u0010j\u001a\u00020gH\u0014¢\u0006\u0004\bj\u0010iR \u0010o\u001a\b\u0012\u0004\u0012\u00028\u00000k8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bc\u0010l\u001a\u0004\bm\u0010nR\u001a\u0010u\u001a\u00020p8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bq\u0010r\u001a\u0004\bs\u0010tR\u0018\u0010w\u001a\u0004\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b=\u0010vR\u0014\u0010y\u001a\u00020g8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bx\u0010iR\u0016\u0010\u001d\u001a\u0004\u0018\u00010\u001c8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bz\u0010>R\u0014\u0010|\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b{\u0010\bR\u001c\u0010\u007f\u001a\n\u0018\u00010\u0004j\u0004\u0018\u0001`\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b}\u0010~\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0082\u0001"}, m28432d2 = {"LXc0;", "T", "LO41;", "LWc0;", "Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;", "Lkotlinx/coroutines/internal/CoroutineStackFrame;", "", "x", "()Z", "", "cause", "l", "(Ljava/lang/Throwable;)Z", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "", "Lkotlinx/coroutines/CompletionHandler;", "handler", "j", "(Lkotlin/jvm/functions/Function1;Ljava/lang/Throwable;)V", "N", "K", "Lo51;", "w", "()Lo51;", "E", "()V", "", TransferTable.COLUMN_STATE, "z", "(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V", "LMc0;", "y", "(Lkotlin/jvm/functions/Function1;)LMc0;", "", "mode", "o", "(I)V", "LL93;", "proposedUpdate", "resumeMode", "onCancellation", "idempotent", "J", "(LL93;Ljava/lang/Object;ILkotlin/jvm/functions/Function1;Ljava/lang/Object;)Ljava/lang/Object;", "G", "(Ljava/lang/Object;ILkotlin/jvm/functions/Function1;)V", "LuX5;", "M", "(Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)LuX5;", "", "h", "(Ljava/lang/Object;)Ljava/lang/Void;", "n", "u", "F", "Ljava/lang/StackTraceElement;", "Lkotlinx/coroutines/internal/StackTraceElement;", "getStackTraceElement", "()Ljava/lang/StackTraceElement;", "g", "()Ljava/lang/Object;", "takenState", C17296a.f69688o, "(Ljava/lang/Object;Ljava/lang/Throwable;)V", "v", "D", "(Ljava/lang/Throwable;)V", "i", "(LMc0;Ljava/lang/Throwable;)V", "k", "Lzh2;", "parent", "p", "(Lzh2;)Ljava/lang/Throwable;", "q", "Lkotlin/Result;", FinancialConnectionsSheetNativeActivity.EXTRA_RESULT, "resumeWith", "(Ljava/lang/Object;)V", "value", "t", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)V", "H", "(Lkotlin/jvm/functions/Function1;)V", "m", Stripe3ds2AuthResult.Ares.VALUE_CHALLENGE, "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "X", "(Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "exception", "L", "(Ljava/lang/Throwable;)Ljava/lang/Object;", "token", "B", "LSC0;", "S", "(LSC0;Ljava/lang/Object;)V", "e", "(Ljava/lang/Object;)Ljava/lang/Object;", DateTokenConverter.CONVERTER_KEY, "(Ljava/lang/Object;)Ljava/lang/Throwable;", "", "toString", "()Ljava/lang/String;", "A", "Lkotlin/coroutines/Continuation;", "Lkotlin/coroutines/Continuation;", "b", "()Lkotlin/coroutines/Continuation;", "delegate", "Lkotlin/coroutines/CoroutineContext;", "f", "Lkotlin/coroutines/CoroutineContext;", "getContext", "()Lkotlin/coroutines/CoroutineContext;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lo51;", "parentHandle", "s", "stateDebugRepresentation", "r", "c", "isCompleted", "getCallerFrame", "()Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;", "callerFrame", "<init>", "(Lkotlin/coroutines/Continuation;I)V", "kotlinx-coroutines-core"}, m28431k = 1, m28430mv = {1, 6, 0})
@PublishedApi
/* renamed from: Xc0  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public class C37013Xc0<T> extends O41<T> implements InterfaceC36779Wc0<T>, CoroutineStackFrame {

    /* renamed from: h */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f43473h = AtomicIntegerFieldUpdater.newUpdater(C37013Xc0.class, "_decision");

    /* renamed from: i */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f43474i = AtomicReferenceFieldUpdater.newUpdater(C37013Xc0.class, Object.class, "_state");
    private volatile /* synthetic */ int _decision;
    private volatile /* synthetic */ Object _state;

    /* renamed from: e */
    public final Continuation<T> f43475e;

    /* renamed from: f */
    public final CoroutineContext f43476f;

    /* renamed from: g */
    public InterfaceC46067o51 f43477g;

    /* JADX WARN: Multi-variable type inference failed */
    public C37013Xc0(Continuation<? super T> continuation, int i) {
        super(i);
        this.f43475e = continuation;
        this.f43476f = continuation.getContext();
        this._decision = 0;
        this._state = C4309K2.f18945b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: I */
    public static /* synthetic */ void m76793I(C37013Xc0 c37013Xc0, Object obj, int i, Function1 function1, int i2, Object obj2) {
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: resumeImpl");
        }
        if ((i2 & 4) != 0) {
            function1 = null;
        }
        c37013Xc0.m76795G(obj, i, function1);
    }

    /* renamed from: A */
    public String mo76801A() {
        return "CancellableContinuation";
    }

    @Override // p000.InterfaceC36779Wc0
    /* renamed from: B */
    public void mo76800B(Object obj) {
        m76772o(this.f25606d);
    }

    @Override // p000.InterfaceC36779Wc0
    /* renamed from: C */
    public Object mo76799C(T t, Object obj) {
        return m76789M(t, obj, null);
    }

    /* renamed from: D */
    public final void m76798D(Throwable th) {
        if (m76775l(th)) {
            return;
        }
        mo76765v(th);
        m76773n();
    }

    /* renamed from: E */
    public final void m76797E() {
        L41 l41;
        Throwable m97872o;
        Continuation<T> continuation = this.f43475e;
        if (continuation instanceof L41) {
            l41 = (L41) continuation;
        } else {
            l41 = null;
        }
        if (l41 != null && (m97872o = l41.m97872o(this)) != null) {
            m76774m();
            mo76765v(m97872o);
        }
    }

    @JvmName(name = "resetStateReusable")
    /* renamed from: F */
    public final boolean m76796F() {
        Object obj = this._state;
        if ((obj instanceof C47123ps0) && ((C47123ps0) obj).f104200d != null) {
            m76774m();
            return false;
        }
        this._decision = 0;
        this._state = C4309K2.f18945b;
        return true;
    }

    /* renamed from: G */
    public final void m76795G(Object obj, int i, Function1<? super Throwable, Unit> function1) {
        Object obj2;
        do {
            obj2 = this._state;
            if (obj2 instanceof L93) {
            } else {
                if (obj2 instanceof C40450ed0) {
                    C40450ed0 c40450ed0 = (C40450ed0) obj2;
                    if (c40450ed0.m42701c()) {
                        if (function1 != null) {
                            m76776k(function1, c40450ed0.f105942a);
                            return;
                        }
                        return;
                    }
                }
                m76779h(obj);
                throw new KotlinNothingValueException();
            }
        } while (!C22859i1.m35391a(f43474i, this, obj2, m76792J((L93) obj2, obj, i, function1, null)));
        m76773n();
        m76772o(i);
    }

    @Override // p000.InterfaceC36779Wc0
    /* renamed from: H */
    public void mo76794H(Function1<? super Throwable, Unit> function1) {
        AbstractC34439Mc0 m76762y = m76762y(function1);
        while (true) {
            Object obj = this._state;
            if (obj instanceof C4309K2) {
                if (C22859i1.m35391a(f43474i, this, obj, m76762y)) {
                    return;
                }
            } else if (obj instanceof AbstractC34439Mc0) {
                m76761z(function1, obj);
            } else {
                boolean z = obj instanceof C47716qs0;
                if (z) {
                    C47716qs0 c47716qs0 = (C47716qs0) obj;
                    if (!c47716qs0.m16900b()) {
                        m76761z(function1, obj);
                    }
                    if (obj instanceof C40450ed0) {
                        Throwable th = null;
                        if (!z) {
                            c47716qs0 = null;
                        }
                        if (c47716qs0 != null) {
                            th = c47716qs0.f105942a;
                        }
                        m76777j(function1, th);
                        return;
                    }
                    return;
                } else if (obj instanceof C47123ps0) {
                    C47123ps0 c47123ps0 = (C47123ps0) obj;
                    if (c47123ps0.f104198b != null) {
                        m76761z(function1, obj);
                    }
                    if (m76762y instanceof AbstractC25669lG) {
                        return;
                    }
                    if (c47123ps0.m18628c()) {
                        m76777j(function1, c47123ps0.f104201e);
                        return;
                    }
                    if (C22859i1.m35391a(f43474i, this, obj, C47123ps0.m18629b(c47123ps0, null, m76762y, null, null, null, 29, null))) {
                        return;
                    }
                } else if (m76762y instanceof AbstractC25669lG) {
                    return;
                } else {
                    if (C22859i1.m35391a(f43474i, this, obj, new C47123ps0(obj, m76762y, null, null, null, 28, null))) {
                        return;
                    }
                }
            }
        }
    }

    /* renamed from: J */
    public final Object m76792J(L93 l93, Object obj, int i, Function1<? super Throwable, Unit> function1, Object obj2) {
        AbstractC34439Mc0 abstractC34439Mc0;
        if (!(obj instanceof C47716qs0)) {
            if (P41.m91024b(i) || obj2 != null) {
                if (function1 != null || (((l93 instanceof AbstractC34439Mc0) && !(l93 instanceof AbstractC25669lG)) || obj2 != null)) {
                    if (l93 instanceof AbstractC34439Mc0) {
                        abstractC34439Mc0 = (AbstractC34439Mc0) l93;
                    } else {
                        abstractC34439Mc0 = null;
                    }
                    return new C47123ps0(obj, abstractC34439Mc0, function1, obj2, null, 16, null);
                }
                return obj;
            }
            return obj;
        }
        return obj;
    }

    /* renamed from: K */
    public final boolean m76791K() {
        do {
            int i = this._decision;
            if (i != 0) {
                if (i == 1) {
                    return false;
                }
                throw new IllegalStateException("Already resumed".toString());
            }
        } while (!f43473h.compareAndSet(this, 0, 2));
        return true;
    }

    @Override // p000.InterfaceC36779Wc0
    /* renamed from: L */
    public Object mo76790L(Throwable th) {
        return m76789M(new C47716qs0(th, false, 2, null), null, null);
    }

    /* renamed from: M */
    public final C49885uX5 m76789M(Object obj, Object obj2, Function1<? super Throwable, Unit> function1) {
        Object obj3;
        do {
            obj3 = this._state;
            if (obj3 instanceof L93) {
            } else if (!(obj3 instanceof C47123ps0) || obj2 == null || ((C47123ps0) obj3).f104200d != obj2) {
                return null;
            } else {
                return C37247Yc0.f46071a;
            }
        } while (!C22859i1.m35391a(f43474i, this, obj3, m76792J((L93) obj3, obj, this.f25606d, function1, obj2)));
        m76773n();
        return C37247Yc0.f46071a;
    }

    /* renamed from: N */
    public final boolean m76788N() {
        do {
            int i = this._decision;
            if (i != 0) {
                if (i == 2) {
                    return false;
                }
                throw new IllegalStateException("Already suspended".toString());
            }
        } while (!f43473h.compareAndSet(this, 0, 1));
        return true;
    }

    @Override // p000.InterfaceC36779Wc0
    /* renamed from: S */
    public void mo76787S(SC0 sc0, T t) {
        L41 l41;
        int i;
        Continuation<T> continuation = this.f43475e;
        SC0 sc02 = null;
        if (continuation instanceof L41) {
            l41 = (L41) continuation;
        } else {
            l41 = null;
        }
        if (l41 != null) {
            sc02 = l41.f20670e;
        }
        if (sc02 == sc0) {
            i = 4;
        } else {
            i = this.f25606d;
        }
        m76793I(this, t, i, null, 4, null);
    }

    @Override // p000.InterfaceC36779Wc0
    /* renamed from: X */
    public Object mo76786X(T t, Object obj, Function1<? super Throwable, Unit> function1) {
        return m76789M(t, obj, function1);
    }

    @Override // p000.O41
    /* renamed from: a */
    public void mo76785a(Object obj, Throwable th) {
        while (true) {
            Object obj2 = this._state;
            if (!(obj2 instanceof L93)) {
                if (obj2 instanceof C47716qs0) {
                    return;
                }
                if (obj2 instanceof C47123ps0) {
                    C47123ps0 c47123ps0 = (C47123ps0) obj2;
                    if (!c47123ps0.m18628c()) {
                        if (C22859i1.m35391a(f43474i, this, obj2, C47123ps0.m18629b(c47123ps0, null, null, null, null, th, 15, null))) {
                            c47123ps0.m18627d(this, th);
                            return;
                        }
                    } else {
                        throw new IllegalStateException("Must be called at most once".toString());
                    }
                } else if (C22859i1.m35391a(f43474i, this, obj2, new C47123ps0(obj2, null, null, null, th, 14, null))) {
                    return;
                }
            } else {
                throw new IllegalStateException("Not completed".toString());
            }
        }
    }

    @Override // p000.O41
    /* renamed from: b */
    public final Continuation<T> mo76784b() {
        return this.f43475e;
    }

    @Override // p000.InterfaceC36779Wc0
    /* renamed from: c */
    public boolean mo76783c() {
        return !(m76769r() instanceof L93);
    }

    @Override // p000.O41
    /* renamed from: d */
    public Throwable mo76782d(Object obj) {
        Throwable mo76782d = super.mo76782d(obj);
        if (mo76782d != null) {
            return mo76782d;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.O41
    /* renamed from: e */
    public <T> T mo76781e(Object obj) {
        return obj instanceof C47123ps0 ? (T) ((C47123ps0) obj).f104197a : obj;
    }

    @Override // p000.O41
    /* renamed from: g */
    public Object mo76780g() {
        return m76769r();
    }

    @Override // kotlin.coroutines.jvm.internal.CoroutineStackFrame
    public CoroutineStackFrame getCallerFrame() {
        Continuation<T> continuation = this.f43475e;
        if (continuation instanceof CoroutineStackFrame) {
            return (CoroutineStackFrame) continuation;
        }
        return null;
    }

    @Override // kotlin.coroutines.Continuation
    public CoroutineContext getContext() {
        return this.f43476f;
    }

    @Override // kotlin.coroutines.jvm.internal.CoroutineStackFrame
    public StackTraceElement getStackTraceElement() {
        return null;
    }

    /* renamed from: h */
    public final Void m76779h(Object obj) {
        throw new IllegalStateException(("Already resumed, but proposed with update " + obj).toString());
    }

    /* renamed from: i */
    public final void m76778i(AbstractC34439Mc0 abstractC34439Mc0, Throwable th) {
        try {
            abstractC34439Mc0.mo14797a(th);
        } catch (Throwable th2) {
            CoroutineContext context = getContext();
            VC0.m80237a(context, new CompletionHandlerException("Exception in invokeOnCancellation handler for " + this, th2));
        }
    }

    /* renamed from: j */
    public final void m76777j(Function1<? super Throwable, Unit> function1, Throwable th) {
        try {
            function1.invoke(th);
        } catch (Throwable th2) {
            CoroutineContext context = getContext();
            VC0.m80237a(context, new CompletionHandlerException("Exception in invokeOnCancellation handler for " + this, th2));
        }
    }

    /* renamed from: k */
    public final void m76776k(Function1<? super Throwable, Unit> function1, Throwable th) {
        try {
            function1.invoke(th);
        } catch (Throwable th2) {
            CoroutineContext context = getContext();
            VC0.m80237a(context, new CompletionHandlerException("Exception in resume onCancellation handler for " + this, th2));
        }
    }

    /* renamed from: l */
    public final boolean m76775l(Throwable th) {
        if (!m76763x()) {
            return false;
        }
        return ((L41) this.f43475e).m97874m(th);
    }

    /* renamed from: m */
    public final void m76774m() {
        InterfaceC46067o51 interfaceC46067o51 = this.f43477g;
        if (interfaceC46067o51 == null) {
            return;
        }
        interfaceC46067o51.dispose();
        this.f43477g = W83.f40466b;
    }

    /* renamed from: n */
    public final void m76773n() {
        if (m76763x()) {
            return;
        }
        m76774m();
    }

    /* renamed from: o */
    public final void m76772o(int i) {
        if (m76791K()) {
            return;
        }
        P41.m91025a(this, i);
    }

    /* renamed from: p */
    public Throwable mo76771p(InterfaceC52943zh2 interfaceC52943zh2) {
        return interfaceC52943zh2.mo558F();
    }

    @PublishedApi
    /* renamed from: q */
    public final Object m76770q() {
        InterfaceC52943zh2 interfaceC52943zh2;
        Object coroutine_suspended;
        boolean m76763x = m76763x();
        if (m76788N()) {
            if (this.f43477g == null) {
                m76764w();
            }
            if (m76763x) {
                m76797E();
            }
            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            return coroutine_suspended;
        }
        if (m76763x) {
            m76797E();
        }
        Object m76769r = m76769r();
        if (!(m76769r instanceof C47716qs0)) {
            if (P41.m91024b(this.f25606d) && (interfaceC52943zh2 = (InterfaceC52943zh2) getContext().get(InterfaceC52943zh2.f122077a0)) != null && !interfaceC52943zh2.mo555b()) {
                CancellationException mo558F = interfaceC52943zh2.mo558F();
                mo76785a(m76769r, mo558F);
                throw mo558F;
            }
            return mo76781e(m76769r);
        }
        throw ((C47716qs0) m76769r).f105942a;
    }

    /* renamed from: r */
    public final Object m76769r() {
        return this._state;
    }

    @Override // kotlin.coroutines.Continuation
    public void resumeWith(Object obj) {
        m76793I(this, C49494ts0.m11549b(obj, this), this.f25606d, null, 4, null);
    }

    /* renamed from: s */
    public final String m76768s() {
        Object m76769r = m76769r();
        if (m76769r instanceof L93) {
            return "Active";
        }
        if (m76769r instanceof C40450ed0) {
            return "Cancelled";
        }
        return "Completed";
    }

    @Override // p000.InterfaceC36779Wc0
    /* renamed from: t */
    public void mo76767t(T t, Function1<? super Throwable, Unit> function1) {
        m76795G(t, this.f25606d, function1);
    }

    public String toString() {
        return mo76801A() + CoreConstants.LEFT_PARENTHESIS_CHAR + C39783dV0.m44214c(this.f43475e) + "){" + m76768s() + "}@" + C39783dV0.m44215b(this);
    }

    /* renamed from: u */
    public void m76766u() {
        InterfaceC46067o51 m76764w = m76764w();
        if (m76764w != null && mo76783c()) {
            m76764w.dispose();
            this.f43477g = W83.f40466b;
        }
    }

    @Override // p000.InterfaceC36779Wc0
    /* renamed from: v */
    public boolean mo76765v(Throwable th) {
        Object obj;
        boolean z;
        AbstractC34439Mc0 abstractC34439Mc0;
        do {
            obj = this._state;
            if (!(obj instanceof L93)) {
                return false;
            }
            z = obj instanceof AbstractC34439Mc0;
        } while (!C22859i1.m35391a(f43474i, this, obj, new C40450ed0(this, th, z)));
        if (z) {
            abstractC34439Mc0 = (AbstractC34439Mc0) obj;
        } else {
            abstractC34439Mc0 = null;
        }
        if (abstractC34439Mc0 != null) {
            m76778i(abstractC34439Mc0, th);
        }
        m76773n();
        m76772o(this.f25606d);
        return true;
    }

    /* renamed from: w */
    public final InterfaceC46067o51 m76764w() {
        InterfaceC52943zh2 interfaceC52943zh2 = (InterfaceC52943zh2) getContext().get(InterfaceC52943zh2.f122077a0);
        if (interfaceC52943zh2 == null) {
            return null;
        }
        InterfaceC46067o51 m547d = InterfaceC52943zh2.C31478a.m547d(interfaceC52943zh2, true, false, new C33557Ii0(this), 2, null);
        this.f43477g = m547d;
        return m547d;
    }

    /* renamed from: x */
    public final boolean m76763x() {
        return P41.m91023c(this.f25606d) && ((L41) this.f43475e).m97875l();
    }

    /* renamed from: y */
    public final AbstractC34439Mc0 m76762y(Function1<? super Throwable, Unit> function1) {
        return function1 instanceof AbstractC34439Mc0 ? (AbstractC34439Mc0) function1 : new T92(function1);
    }

    /* renamed from: z */
    public final void m76761z(Function1<? super Throwable, Unit> function1, Object obj) {
        throw new IllegalStateException(("It's prohibited to register multiple handlers, tried to register " + function1 + ", already has " + obj).toString());
    }
}
