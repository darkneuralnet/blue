package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import com.stripe.android.financialconnections.p041ui.FinancialConnectionsSheetNativeActivity;
import java.util.ArrayList;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import p000.C35420Qh0;
import p000.C38856bx2;
import p000.InterfaceC36779Wc0;
@Metadata(m28433d1 = {"\u0000\u009e\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b \u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003:\u0007RSTUV*WB)\u0012 \u0010O\u001a\u001c\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0013\u0018\u00010Mj\n\u0012\u0004\u0012\u00028\u0000\u0018\u0001`N¢\u0006\u0004\bP\u0010QJ!\u0010\u0007\u001a\u00028\u0001\"\u0004\b\u0001\u0010\u00042\u0006\u0010\u0006\u001a\u00020\u0005H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJ\u0016\u0010\f\u001a\u00020\u000b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\tH\u0002JT\u0010\u0014\u001a\u00020\u0013\"\u0004\b\u0001\u0010\u00042\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00010\r2\u0006\u0010\u0006\u001a\u00020\u00052$\u0010\u0012\u001a \b\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0011\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u000fH\u0002ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015JZ\u0010\u0017\u001a\u00020\u0013\"\u0004\b\u0001\u0010\u0004* \b\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0011\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u000f2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00010\r2\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\u0016\u001a\u0004\u0018\u00010\u0010H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018JT\u0010\u0019\u001a\u00020\u000b\"\u0004\b\u0001\u0010\u00042\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00010\r2$\u0010\u0012\u001a \b\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0011\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u000f2\u0006\u0010\u0006\u001a\u00020\u0005H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001aJ \u0010\u001d\u001a\u00020\u00132\n\u0010\u001c\u001a\u0006\u0012\u0002\b\u00030\u001b2\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\tH\u0002J\n\u0010\u001e\u001a\u0004\u0018\u00010\u0010H\u0014J\u0016\u0010\u001f\u001a\u0004\u0018\u00010\u00102\n\u0010\u000e\u001a\u0006\u0012\u0002\b\u00030\rH\u0014J\u0013\u0010 \u001a\u00028\u0000H\u0086@ø\u0001\u0000¢\u0006\u0004\b \u0010!J\u0016\u0010\"\u001a\u00020\u000b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\tH\u0014J\"\u0010$\u001a\b\u0012\u0004\u0012\u00028\u00000#H\u0086@ø\u0001\u0000ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b$\u0010!J\u001c\u0010%\u001a\b\u0012\u0004\u0012\u00028\u00000#ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b%\u0010&J\u0016\u0010*\u001a\u00020\u00132\u000e\u0010)\u001a\n\u0018\u00010'j\u0004\u0018\u0001`(J\u0019\u0010,\u001a\u00020\u000b2\b\u0010)\u001a\u0004\u0018\u00010+H\u0000¢\u0006\u0004\b,\u0010-J\u0010\u0010/\u001a\u00020\u00132\u0006\u0010.\u001a\u00020\u000bH\u0014J/\u00105\u001a\u00020\u00132\f\u00102\u001a\b\u0012\u0004\u0012\u000201002\n\u00104\u001a\u0006\u0012\u0002\b\u000303H\u0014ø\u0001\u0000ø\u0001\u0002¢\u0006\u0004\b5\u00106J\u000f\u00108\u001a\b\u0012\u0004\u0012\u00028\u000007H\u0086\u0002J\u000e\u0010:\u001a\b\u0012\u0004\u0012\u00028\u000009H\u0004J\u0010\u0010<\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010;H\u0014J\b\u0010=\u001a\u00020\u0013H\u0014J\b\u0010>\u001a\u00020\u0013H\u0014R\u0014\u0010A\u001a\u00020\u000b8$X¤\u0004¢\u0006\u0006\u001a\u0004\b?\u0010@R\u0014\u0010C\u001a\u00020\u000b8$X¤\u0004¢\u0006\u0006\u001a\u0004\bB\u0010@R\u0014\u0010D\u001a\u00020\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010@R\u0014\u0010E\u001a\u00020\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bE\u0010@R\u0014\u0010G\u001a\u00020\u000b8DX\u0084\u0004¢\u0006\u0006\u001a\u0004\bF\u0010@R\u0017\u0010J\u001a\b\u0012\u0004\u0012\u00028\u00000H8F¢\u0006\u0006\u001a\u0004\b\u0001\u0010IR \u0010L\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000#0H8Fø\u0001\u0000¢\u0006\u0006\u001a\u0004\bK\u0010I\u0082\u0002\u000f\n\u0002\b\u0019\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006X"}, m28432d2 = {"Lj0;", "E", "Lk1;", "LFh0;", "R", "", "receiveMode", "Z", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Ljs4;", "receive", "", "L", "Lrr5;", "select", "Lkotlin/Function2;", "", "Lkotlin/coroutines/Continuation;", "block", "", "a0", "(Lrr5;ILkotlin/jvm/functions/Function2;)V", "value", "c0", "(Lkotlin/jvm/functions/Function2;Lrr5;ILjava/lang/Object;)V", "O", "(Lrr5;Lkotlin/jvm/functions/Function2;I)Z", "LWc0;", "cont", "b0", "X", "Y", "G", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "N", "LQh0;", "s", "l", "()Ljava/lang/Object;", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "cause", "f", "", "I", "(Ljava/lang/Throwable;)Z", "wasClosed", "T", "LK22;", "Lxs5;", "list", "LCl0;", "closed", "U", "(Ljava/lang/Object;LCl0;)V", "LOh0;", "iterator", "Lj0$g;", "K", "Lls4;", "B", "W", "V", "P", "()Z", "isBufferAlwaysEmpty", "Q", "isBufferEmpty", "isClosedForReceive", "isEmpty", "S", "isEmptyImpl", "Lhr5;", "()Lhr5;", "onReceive", "j", "onReceiveCatching", "Lkotlin/Function1;", "Lkotlinx/coroutines/internal/OnUndeliveredElement;", "onUndeliveredElement", "<init>", "(Lkotlin/jvm/functions/Function1;)V", C17296a.f69688o, "b", "c", DateTokenConverter.CONVERTER_KEY, "e", "g", "kotlinx-coroutines-core"}, m28431k = 1, m28430mv = {1, 6, 0})
/* renamed from: j0 */
/* loaded from: classes8.dex */
public abstract class AbstractC24679j0<E> extends AbstractC25077k1<E> implements InterfaceC32846Fh0<E> {

    @Metadata(m28433d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0002\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010\u0002B\u0015\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00010\f¢\u0006\u0004\b\u0013\u0010\u0014J\u0013\u0010\u0004\u001a\u00020\u0003H\u0096Bø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00028\u0001H\u0096\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\n\u001a\u00020\u00032\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0002J\u0013\u0010\u000b\u001a\u00020\u0003H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\u0005R\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00010\f8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\rR$\u0010\t\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000f\u001a\u0004\b\u0010\u0010\u0007\"\u0004\b\u0011\u0010\u0012\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0015"}, m28432d2 = {"Lj0$a;", "E", "LOh0;", "", C17296a.f69688o, "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "next", "()Ljava/lang/Object;", "", FinancialConnectionsSheetNativeActivity.EXTRA_RESULT, "b", "c", "Lj0;", "Lj0;", "channel", "Ljava/lang/Object;", "getResult", DateTokenConverter.CONVERTER_KEY, "(Ljava/lang/Object;)V", "<init>", "(Lj0;)V", "kotlinx-coroutines-core"}, m28431k = 1, m28430mv = {1, 6, 0})
    /* renamed from: j0$a */
    /* loaded from: classes8.dex */
    public static final class C24680a<E> implements InterfaceC34952Oh0<E> {
        @JvmField

        /* renamed from: a */
        public final AbstractC24679j0<E> f91975a;

        /* renamed from: b */
        public Object f91976b = C25076k0.f93733d;

        public C24680a(AbstractC24679j0<E> abstractC24679j0) {
            this.f91975a = abstractC24679j0;
        }

        @Override // p000.InterfaceC34952Oh0
        /* renamed from: a */
        public Object mo31286a(Continuation<? super Boolean> continuation) {
            Object obj = this.f91976b;
            C49885uX5 c49885uX5 = C25076k0.f93733d;
            if (obj != c49885uX5) {
                return Boxing.boxBoolean(m31285b(obj));
            }
            Object mo23134X = this.f91975a.mo23134X();
            this.f91976b = mo23134X;
            if (mo23134X != c49885uX5) {
                return Boxing.boxBoolean(m31285b(mo23134X));
            }
            return m31284c(continuation);
        }

        /* renamed from: b */
        public final boolean m31285b(Object obj) {
            if (obj instanceof C32180Cl0) {
                C32180Cl0 c32180Cl0 = (C32180Cl0) obj;
                if (c32180Cl0.f4627e == null) {
                    return false;
                }
                throw C46840pO5.m19353a(c32180Cl0.m111747Y());
            }
            return true;
        }

        /* renamed from: c */
        public final Object m31284c(Continuation<? super Boolean> continuation) {
            Continuation intercepted;
            Object coroutine_suspended;
            Function1<Throwable, Unit> function1;
            intercepted = IntrinsicsKt__IntrinsicsJvmKt.intercepted(continuation);
            C37013Xc0 m72854b = C37481Zc0.m72854b(intercepted);
            C24683d c24683d = new C24683d(this, m72854b);
            while (true) {
                if (this.f91975a.m31296L(c24683d)) {
                    this.f91975a.m31288b0(m72854b, c24683d);
                    break;
                }
                Object mo23134X = this.f91975a.mo23134X();
                m31283d(mo23134X);
                if (mo23134X instanceof C32180Cl0) {
                    C32180Cl0 c32180Cl0 = (C32180Cl0) mo23134X;
                    if (c32180Cl0.f4627e == null) {
                        Result.Companion companion = Result.Companion;
                        m72854b.resumeWith(Result.m116783constructorimpl(Boxing.boxBoolean(false)));
                    } else {
                        Result.Companion companion2 = Result.Companion;
                        m72854b.resumeWith(Result.m116783constructorimpl(ResultKt.createFailure(c32180Cl0.m111747Y())));
                    }
                } else if (mo23134X != C25076k0.f93733d) {
                    Boolean boxBoolean = Boxing.boxBoolean(true);
                    Function1<E, Unit> function12 = this.f91975a.f93766b;
                    if (function12 != null) {
                        function1 = C47016ph3.m18975a(function12, mo23134X, m72854b.getContext());
                    } else {
                        function1 = null;
                    }
                    m72854b.mo76767t(boxBoolean, function1);
                }
            }
            Object m76770q = m72854b.m76770q();
            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (m76770q == coroutine_suspended) {
                DebugProbesKt.probeCoroutineSuspended(continuation);
            }
            return m76770q;
        }

        /* renamed from: d */
        public final void m31283d(Object obj) {
            this.f91976b = obj;
        }

        @Override // p000.InterfaceC34952Oh0
        public E next() {
            E e = (E) this.f91976b;
            if (!(e instanceof C32180Cl0)) {
                C49885uX5 c49885uX5 = C25076k0.f93733d;
                if (e != c49885uX5) {
                    this.f91976b = c49885uX5;
                    return e;
                }
                throw new IllegalStateException("'hasNext' should be called prior to 'next' invocation");
            }
            throw C46840pO5.m19353a(((C32180Cl0) e).m111747Y());
        }
    }

    @Metadata(m28433d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\b\u0012\u0018\u0000*\u0006\b\u0001\u0010\u0001 \u00002\b\u0012\u0004\u0012\u00028\u00010\u0002B\u001f\u0012\u000e\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0014\u0012\u0006\u0010\u001a\u001a\u00020\u0018¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00028\u0001¢\u0006\u0004\b\u0005\u0010\u0006J#\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0003\u001a\u00028\u00012\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0014\u0010\u0011\u001a\u00020\f2\n\u0010\u0010\u001a\u0006\u0012\u0002\b\u00030\u000fH\u0016J\b\u0010\u0013\u001a\u00020\u0012H\u0016R\u001c\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00148\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u001a\u001a\u00020\u00188\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0019¨\u0006\u001d"}, m28432d2 = {"Lj0$b;", "E", "Ljs4;", "value", "", "T", "(Ljava/lang/Object;)Ljava/lang/Object;", "Lbx2$c;", "otherOp", "LuX5;", "g", "(Ljava/lang/Object;Lbx2$c;)LuX5;", "", "f", "(Ljava/lang/Object;)V", "LCl0;", "closed", "R", "", "toString", "LWc0;", "e", "LWc0;", "cont", "", "I", "receiveMode", "<init>", "(LWc0;I)V", "kotlinx-coroutines-core"}, m28431k = 1, m28430mv = {1, 6, 0})
    /* renamed from: j0$b */
    /* loaded from: classes8.dex */
    public static class C24681b<E> extends AbstractC43569js4<E> {
        @JvmField

        /* renamed from: e */
        public final InterfaceC36779Wc0<Object> f91977e;
        @JvmField

        /* renamed from: f */
        public final int f91978f;

        public C24681b(InterfaceC36779Wc0<Object> interfaceC36779Wc0, int i) {
            this.f91977e = interfaceC36779Wc0;
            this.f91978f = i;
        }

        @Override // p000.AbstractC43569js4
        /* renamed from: R */
        public void mo29812R(C32180Cl0<?> c32180Cl0) {
            if (this.f91978f == 1) {
                this.f91977e.resumeWith(Result.m116783constructorimpl(C35420Qh0.m88188b(C35420Qh0.f30755b.m88177a(c32180Cl0.f4627e))));
                return;
            }
            InterfaceC36779Wc0<Object> interfaceC36779Wc0 = this.f91977e;
            Result.Companion companion = Result.Companion;
            interfaceC36779Wc0.resumeWith(Result.m116783constructorimpl(ResultKt.createFailure(c32180Cl0.m111747Y())));
        }

        /* renamed from: T */
        public final Object m31282T(E e) {
            if (this.f91978f == 1) {
                return C35420Qh0.m88188b(C35420Qh0.f30755b.m88175c(e));
            }
            return e;
        }

        @Override // p000.InterfaceC44755ls4
        /* renamed from: f */
        public void mo26720f(E e) {
            this.f91977e.mo76800B(C37247Yc0.f46071a);
        }

        @Override // p000.InterfaceC44755ls4
        /* renamed from: g */
        public C49885uX5 mo26719g(E e, C38856bx2.C13354c c13354c) {
            C38856bx2.AbstractC13352a abstractC13352a;
            InterfaceC36779Wc0<Object> interfaceC36779Wc0 = this.f91977e;
            Object m31282T = m31282T(e);
            if (c13354c != null) {
                abstractC13352a = c13354c.f59828c;
            } else {
                abstractC13352a = null;
            }
            if (interfaceC36779Wc0.mo76786X(m31282T, abstractC13352a, mo29813Q(e)) == null) {
                return null;
            }
            if (c13354c != null) {
                c13354c.m62078d();
            }
            return C37247Yc0.f46071a;
        }

        @Override // p000.C38856bx2
        public String toString() {
            return "ReceiveElement@" + C39783dV0.m44215b(this) + "[receiveMode=" + this.f91978f + ']';
        }
    }

    @Metadata(m28433d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0002\u0018\u0000*\u0006\b\u0001\u0010\u0001 \u00002\b\u0012\u0004\u0012\u00028\u00010\u0002B=\u0012\u000e\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\r\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u001c\u0010\f\u001a\u0018\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\u00060\u0004j\b\u0012\u0004\u0012\u00028\u0001`\t¢\u0006\u0004\b\u0012\u0010\u0013J%\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u0007\u0010\bR*\u0010\f\u001a\u0018\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\u00060\u0004j\b\u0012\u0004\u0012\u00028\u0001`\t8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\u0014"}, m28432d2 = {"Lj0$c;", "E", "Lj0$b;", "value", "Lkotlin/Function1;", "", "", "Q", "(Ljava/lang/Object;)Lkotlin/jvm/functions/Function1;", "Lkotlinx/coroutines/internal/OnUndeliveredElement;", "g", "Lkotlin/jvm/functions/Function1;", "onUndeliveredElement", "LWc0;", "", "cont", "", "receiveMode", "<init>", "(LWc0;ILkotlin/jvm/functions/Function1;)V", "kotlinx-coroutines-core"}, m28431k = 1, m28430mv = {1, 6, 0})
    /* renamed from: j0$c */
    /* loaded from: classes8.dex */
    public static final class C24682c<E> extends C24681b<E> {
        @JvmField

        /* renamed from: g */
        public final Function1<E, Unit> f91979g;

        /* JADX WARN: Multi-variable type inference failed */
        public C24682c(InterfaceC36779Wc0<Object> interfaceC36779Wc0, int i, Function1<? super E, Unit> function1) {
            super(interfaceC36779Wc0, i);
            this.f91979g = function1;
        }

        @Override // p000.AbstractC43569js4
        /* renamed from: Q */
        public Function1<Throwable, Unit> mo29813Q(E e) {
            return C47016ph3.m18975a(this.f91979g, e, this.f91977e.getContext());
        }
    }

    @Metadata(m28433d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0012\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010\u0002B#\u0012\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00010\u0015\u0012\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019¢\u0006\u0004\b\u001d\u0010\u001eJ#\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0003\u001a\u00028\u00012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0014\u0010\u000e\u001a\u00020\t2\n\u0010\r\u001a\u0006\u0012\u0002\b\u00030\fH\u0016J%\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\t\u0018\u00010\u000f2\u0006\u0010\u0003\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\b\u0010\u0014\u001a\u00020\u0013H\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00010\u00158\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00198\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u001b¨\u0006\u001f"}, m28432d2 = {"Lj0$d;", "E", "Ljs4;", "value", "Lbx2$c;", "otherOp", "LuX5;", "g", "(Ljava/lang/Object;Lbx2$c;)LuX5;", "", "f", "(Ljava/lang/Object;)V", "LCl0;", "closed", "R", "Lkotlin/Function1;", "", "Q", "(Ljava/lang/Object;)Lkotlin/jvm/functions/Function1;", "", "toString", "Lj0$a;", "e", "Lj0$a;", "iterator", "LWc0;", "", "LWc0;", "cont", "<init>", "(Lj0$a;LWc0;)V", "kotlinx-coroutines-core"}, m28431k = 1, m28430mv = {1, 6, 0})
    /* renamed from: j0$d */
    /* loaded from: classes8.dex */
    public static class C24683d<E> extends AbstractC43569js4<E> {
        @JvmField

        /* renamed from: e */
        public final C24680a<E> f91980e;
        @JvmField

        /* renamed from: f */
        public final InterfaceC36779Wc0<Boolean> f91981f;

        /* JADX WARN: Multi-variable type inference failed */
        public C24683d(C24680a<E> c24680a, InterfaceC36779Wc0<? super Boolean> interfaceC36779Wc0) {
            this.f91980e = c24680a;
            this.f91981f = interfaceC36779Wc0;
        }

        @Override // p000.AbstractC43569js4
        /* renamed from: Q */
        public Function1<Throwable, Unit> mo29813Q(E e) {
            Function1<E, Unit> function1 = this.f91980e.f91975a.f93766b;
            if (function1 != null) {
                return C47016ph3.m18975a(function1, e, this.f91981f.getContext());
            }
            return null;
        }

        @Override // p000.AbstractC43569js4
        /* renamed from: R */
        public void mo29812R(C32180Cl0<?> c32180Cl0) {
            Object mo76790L;
            if (c32180Cl0.f4627e == null) {
                mo76790L = InterfaceC36779Wc0.C9110a.m78139b(this.f91981f, Boolean.FALSE, null, 2, null);
            } else {
                mo76790L = this.f91981f.mo76790L(c32180Cl0.m111747Y());
            }
            if (mo76790L != null) {
                this.f91980e.m31283d(c32180Cl0);
                this.f91981f.mo76800B(mo76790L);
            }
        }

        @Override // p000.InterfaceC44755ls4
        /* renamed from: f */
        public void mo26720f(E e) {
            this.f91980e.m31283d(e);
            this.f91981f.mo76800B(C37247Yc0.f46071a);
        }

        @Override // p000.InterfaceC44755ls4
        /* renamed from: g */
        public C49885uX5 mo26719g(E e, C38856bx2.C13354c c13354c) {
            C38856bx2.AbstractC13352a abstractC13352a;
            InterfaceC36779Wc0<Boolean> interfaceC36779Wc0 = this.f91981f;
            Boolean bool = Boolean.TRUE;
            if (c13354c != null) {
                abstractC13352a = c13354c.f59828c;
            } else {
                abstractC13352a = null;
            }
            if (interfaceC36779Wc0.mo76786X(bool, abstractC13352a, mo29813Q(e)) == null) {
                return null;
            }
            if (c13354c != null) {
                c13354c.m62078d();
            }
            return C37247Yc0.f46071a;
        }

        @Override // p000.C38856bx2
        public String toString() {
            return "ReceiveHasNext@" + C39783dV0.m44215b(this);
        }
    }

    @Metadata(m28433d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0002\u0018\u0000*\u0004\b\u0001\u0010\u0001*\u0004\b\u0002\u0010\u00022\b\u0012\u0004\u0012\u00028\u00020\u00032\u00020\u0004BT\u0012\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00020\u0017\u0012\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00028\u00010\u001b\u0012$\u0010\"\u001a \b\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u001f\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010 \u0012\u0006\u0012\u0004\u0018\u00010\u001f0\u001e\u0012\u0006\u0010&\u001a\u00020#ø\u0001\u0000¢\u0006\u0004\b'\u0010(J#\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0005\u001a\u00028\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00028\u0002H\u0016¢\u0006\u0004\b\f\u0010\rJ\u0014\u0010\u0001\u001a\u00020\u000b2\n\u0010\u000f\u001a\u0006\u0012\u0002\b\u00030\u000eH\u0016J\b\u0010\u0010\u001a\u00020\u000bH\u0016J%\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u00112\u0006\u0010\u0005\u001a\u00028\u0002H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\b\u0010\u0016\u001a\u00020\u0015H\u0016R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00020\u00178\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00028\u00010\u001b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u001cR5\u0010\"\u001a \b\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u001f\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010 \u0012\u0006\u0012\u0004\u0018\u00010\u001f0\u001e8\u0006X\u0087\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b\t\u0010!R\u0014\u0010&\u001a\u00020#8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b$\u0010%\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006)"}, m28432d2 = {"Lj0$e;", "R", "E", "Ljs4;", "Lo51;", "value", "Lbx2$c;", "otherOp", "LuX5;", "g", "(Ljava/lang/Object;Lbx2$c;)LuX5;", "", "f", "(Ljava/lang/Object;)V", "LCl0;", "closed", "dispose", "Lkotlin/Function1;", "", "Q", "(Ljava/lang/Object;)Lkotlin/jvm/functions/Function1;", "", "toString", "Lj0;", "e", "Lj0;", "channel", "Lrr5;", "Lrr5;", "select", "Lkotlin/Function2;", "", "Lkotlin/coroutines/Continuation;", "Lkotlin/jvm/functions/Function2;", "block", "", "h", "I", "receiveMode", "<init>", "(Lj0;Lrr5;Lkotlin/jvm/functions/Function2;I)V", "kotlinx-coroutines-core"}, m28431k = 1, m28430mv = {1, 6, 0})
    /* renamed from: j0$e */
    /* loaded from: classes8.dex */
    public static final class C24684e<R, E> extends AbstractC43569js4<E> implements InterfaceC46067o51 {
        @JvmField

        /* renamed from: e */
        public final AbstractC24679j0<E> f91982e;
        @JvmField

        /* renamed from: f */
        public final InterfaceC48304rr5<R> f91983f;
        @JvmField

        /* renamed from: g */
        public final Function2<Object, Continuation<? super R>, Object> f91984g;
        @JvmField

        /* renamed from: h */
        public final int f91985h;

        /* JADX WARN: Multi-variable type inference failed */
        public C24684e(AbstractC24679j0<E> abstractC24679j0, InterfaceC48304rr5<? super R> interfaceC48304rr5, Function2<Object, ? super Continuation<? super R>, ? extends Object> function2, int i) {
            this.f91982e = abstractC24679j0;
            this.f91983f = interfaceC48304rr5;
            this.f91984g = function2;
            this.f91985h = i;
        }

        @Override // p000.AbstractC43569js4
        /* renamed from: Q */
        public Function1<Throwable, Unit> mo29813Q(E e) {
            Function1<E, Unit> function1 = this.f91982e.f93766b;
            if (function1 != null) {
                return C47016ph3.m18975a(function1, e, this.f91983f.mo15171m().getContext());
            }
            return null;
        }

        @Override // p000.AbstractC43569js4
        /* renamed from: R */
        public void mo29812R(C32180Cl0<?> c32180Cl0) {
            if (!this.f91983f.mo15172l()) {
                return;
            }
            int i = this.f91985h;
            if (i != 0) {
                if (i == 1) {
                    C38061ad0.m70996e(this.f91984g, C35420Qh0.m88188b(C35420Qh0.f30755b.m88177a(c32180Cl0.f4627e)), this.f91983f.mo15171m(), null, 4, null);
                    return;
                }
                return;
            }
            this.f91983f.mo15169o(c32180Cl0.m111747Y());
        }

        @Override // p000.InterfaceC46067o51
        public void dispose() {
            if (mo62093J()) {
                this.f91982e.m31292V();
            }
        }

        @Override // p000.InterfaceC44755ls4
        /* renamed from: f */
        public void mo26720f(E e) {
            Object obj;
            Function2<Object, Continuation<? super R>, Object> function2 = this.f91984g;
            if (this.f91985h == 1) {
                obj = C35420Qh0.m88188b(C35420Qh0.f30755b.m88175c(e));
            } else {
                obj = e;
            }
            C38061ad0.m70997d(function2, obj, this.f91983f.mo15171m(), mo29813Q(e));
        }

        @Override // p000.InterfaceC44755ls4
        /* renamed from: g */
        public C49885uX5 mo26719g(E e, C38856bx2.C13354c c13354c) {
            return (C49885uX5) this.f91983f.mo15170n(c13354c);
        }

        @Override // p000.C38856bx2
        public String toString() {
            return "ReceiveSelect@" + C39783dV0.m44215b(this) + '[' + this.f91983f + ",receiveMode=" + this.f91985h + ']';
        }
    }

    @Metadata(m28433d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\b¢\u0006\u0004\b\f\u0010\rJ\u0013\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0096\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0016R\u0018\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000e"}, m28432d2 = {"Lj0$f;", "LlG;", "", "cause", "", C17296a.f69688o, "", "toString", "Ljs4;", "b", "Ljs4;", "receive", "<init>", "(Lj0;Ljs4;)V", "kotlinx-coroutines-core"}, m28431k = 1, m28430mv = {1, 6, 0})
    /* renamed from: j0$f */
    /* loaded from: classes8.dex */
    public final class C24685f extends AbstractC25669lG {

        /* renamed from: b */
        public final AbstractC43569js4<?> f91986b;

        public C24685f(AbstractC43569js4<?> abstractC43569js4) {
            this.f91986b = abstractC43569js4;
        }

        @Override // p000.AbstractC34673Nc0
        /* renamed from: a */
        public void mo14797a(Throwable th) {
            if (this.f91986b.mo62093J()) {
                AbstractC24679j0.this.m31292V();
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            mo14797a(th);
            return Unit.INSTANCE;
        }

        public String toString() {
            return "RemoveReceiveOnCancel[" + this.f91986b + ']';
        }
    }

    @Metadata(m28433d1 = {"\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0004\u0018\u0000*\u0004\b\u0001\u0010\u00012\u0012\u0012\u0004\u0012\u00020\u00030\u0002j\b\u0012\u0004\u0012\u00020\u0003`\u0004B\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0012\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0014J\u0016\u0010\f\u001a\u0004\u0018\u00010\u00072\n\u0010\u000b\u001a\u00060\tj\u0002`\nH\u0016J\u0010\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¨\u0006\u0013"}, m28432d2 = {"Lj0$g;", "E", "Lbx2$d;", "Lxs5;", "Lkotlinx/coroutines/internal/RemoveFirstDesc;", "Lbx2;", "affected", "", "e", "Lbx2$c;", "Lkotlinx/coroutines/internal/PrepareOp;", "prepareOp", "j", "", "k", "LZw2;", "queue", "<init>", "(LZw2;)V", "kotlinx-coroutines-core"}, m28431k = 1, m28430mv = {1, 6, 0})
    /* renamed from: j0$g */
    /* loaded from: classes8.dex */
    public static final class C24686g<E> extends C38856bx2.C13355d<AbstractC51870xs5> {
        public C24686g(C37663Zw2 c37663Zw2) {
            super(c37663Zw2);
        }

        @Override // p000.C38856bx2.C13355d, p000.C38856bx2.AbstractC13352a
        /* renamed from: e */
        public Object mo31281e(C38856bx2 c38856bx2) {
            if (!(c38856bx2 instanceof C32180Cl0)) {
                if (!(c38856bx2 instanceof AbstractC51870xs5)) {
                    return C25076k0.f93733d;
                }
                return null;
            }
            return c38856bx2;
        }

        @Override // p000.C38856bx2.AbstractC13352a
        /* renamed from: j */
        public Object mo31280j(C38856bx2.C13354c c13354c) {
            C49885uX5 mo195T = ((AbstractC51870xs5) c13354c.f59826a).mo195T(c13354c);
            if (mo195T == null) {
                return C39467cx2.f75897a;
            }
            Object obj = C27694qp.f105860b;
            if (mo195T == obj) {
                return obj;
            }
            return null;
        }

        @Override // p000.C38856bx2.AbstractC13352a
        /* renamed from: k */
        public void mo31279k(C38856bx2 c38856bx2) {
            ((AbstractC51870xs5) c38856bx2).mo4531U();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003H\u0016¨\u0006\u0007"}, m28432d2 = {"j0$h", "Lbx2$b;", "Lbx2;", "Lkotlinx/coroutines/internal/Node;", "affected", "", "k", "kotlinx-coroutines-core"}, m28431k = 1, m28430mv = {1, 6, 0})
    /* renamed from: j0$h */
    /* loaded from: classes8.dex */
    public static final class C24687h extends C38856bx2.AbstractC13353b {

        /* renamed from: d */
        public final /* synthetic */ AbstractC24679j0 f91988d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C24687h(C38856bx2 c38856bx2, AbstractC24679j0 abstractC24679j0) {
            super(c38856bx2);
            this.f91988d = abstractC24679j0;
        }

        @Override // p000.AbstractC28006rp
        /* renamed from: k */
        public Object mo15326i(C38856bx2 c38856bx2) {
            if (this.f91988d.mo11166Q()) {
                return null;
            }
            return C38263ax2.m65211a();
        }
    }

    @Metadata(m28433d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001JJ\u0010\n\u001a\u00020\t\"\u0004\b\u0001\u0010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u00032\"\u0010\b\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0005H\u0016ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\f"}, m28432d2 = {"j0$i", "Lhr5;", "R", "Lrr5;", "select", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "", "block", "", "y", "(Lrr5;Lkotlin/jvm/functions/Function2;)V", "kotlinx-coroutines-core"}, m28431k = 1, m28430mv = {1, 6, 0})
    /* renamed from: j0$i */
    /* loaded from: classes8.dex */
    public static final class C24688i implements InterfaceC42374hr5<E> {

        /* renamed from: b */
        public final /* synthetic */ AbstractC24679j0<E> f91989b;

        public C24688i(AbstractC24679j0<E> abstractC24679j0) {
            this.f91989b = abstractC24679j0;
        }

        @Override // p000.InterfaceC42374hr5
        /* renamed from: y */
        public <R> void mo29818y(InterfaceC48304rr5<? super R> interfaceC48304rr5, Function2<? super E, ? super Continuation<? super R>, ? extends Object> function2) {
            this.f91989b.m31289a0(interfaceC48304rr5, 0, function2);
        }
    }

    @Metadata(m28433d1 = {"\u0000+\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00020\u0001JS\u0010\u000b\u001a\u00020\n\"\u0004\b\u0001\u0010\u00032\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u00042(\u0010\t\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0006H\u0016ø\u0001\u0000ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fø\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\r"}, m28432d2 = {"j0$j", "Lhr5;", "LQh0;", "R", "Lrr5;", "select", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "", "block", "", "y", "(Lrr5;Lkotlin/jvm/functions/Function2;)V", "kotlinx-coroutines-core"}, m28431k = 1, m28430mv = {1, 6, 0})
    /* renamed from: j0$j */
    /* loaded from: classes8.dex */
    public static final class C24689j implements InterfaceC42374hr5<C35420Qh0<? extends E>> {

        /* renamed from: b */
        public final /* synthetic */ AbstractC24679j0<E> f91990b;

        public C24689j(AbstractC24679j0<E> abstractC24679j0) {
            this.f91990b = abstractC24679j0;
        }

        @Override // p000.InterfaceC42374hr5
        /* renamed from: y */
        public <R> void mo29818y(InterfaceC48304rr5<? super R> interfaceC48304rr5, Function2<? super C35420Qh0<? extends E>, ? super Continuation<? super R>, ? extends Object> function2) {
            this.f91990b.m31289a0(interfaceC48304rr5, 1, function2);
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 6, 0}, m28428xi = 48)
    @DebugMetadata(m28419c = "kotlinx.coroutines.channels.AbstractChannel", m28418f = "AbstractChannel.kt", m28417i = {}, m28416l = {633}, m28415m = "receiveCatching-JP2dKIU", m28414n = {}, m28413s = {})
    /* renamed from: j0$k */
    /* loaded from: classes8.dex */
    public static final class C24690k extends ContinuationImpl {

        /* renamed from: h */
        public /* synthetic */ Object f91991h;

        /* renamed from: i */
        public final /* synthetic */ AbstractC24679j0<E> f91992i;

        /* renamed from: j */
        public int f91993j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C24690k(AbstractC24679j0<E> abstractC24679j0, Continuation<? super C24690k> continuation) {
            super(continuation);
            this.f91992i = abstractC24679j0;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended;
            this.f91991h = obj;
            this.f91993j |= Integer.MIN_VALUE;
            Object mo28253s = this.f91992i.mo28253s(this);
            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            return mo28253s == coroutine_suspended ? mo28253s : C35420Qh0.m88188b(mo28253s);
        }
    }

    public AbstractC24679j0(Function1<? super E, Unit> function1) {
        super(function1);
    }

    @Override // p000.AbstractC25077k1
    /* renamed from: B */
    public InterfaceC44755ls4<E> mo29475B() {
        InterfaceC44755ls4<E> mo29475B = super.mo29475B();
        if (mo29475B != null && !(mo29475B instanceof C32180Cl0)) {
            m31292V();
        }
        return mo29475B;
    }

    @Override // p000.InterfaceC44162ks4
    /* renamed from: E */
    public final InterfaceC42374hr5<E> mo28257E() {
        return new C24688i(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.InterfaceC44162ks4
    /* renamed from: G */
    public final Object mo28256G(Continuation<? super E> continuation) {
        Object mo23134X = mo23134X();
        if (mo23134X != C25076k0.f93733d && !(mo23134X instanceof C32180Cl0)) {
            return mo23134X;
        }
        return m31290Z(0, continuation);
    }

    /* renamed from: I */
    public final boolean m31298I(Throwable th) {
        boolean mo2352J = mo2352J(th);
        mo23135T(mo2352J);
        return mo2352J;
    }

    /* renamed from: K */
    public final C24686g<E> m31297K() {
        return new C24686g<>(m29468m());
    }

    /* renamed from: L */
    public final boolean m31296L(AbstractC43569js4<? super E> abstractC43569js4) {
        boolean mo23137N = mo23137N(abstractC43569js4);
        if (mo23137N) {
            m31291W();
        }
        return mo23137N;
    }

    /* renamed from: N */
    public boolean mo23137N(AbstractC43569js4<? super E> abstractC43569js4) {
        int m62089O;
        C38856bx2 m62097E;
        if (mo11167P()) {
            C38856bx2 m29468m = m29468m();
            do {
                m62097E = m29468m.m62097E();
                if (!(!(m62097E instanceof AbstractC51870xs5))) {
                    return false;
                }
            } while (!m62097E.m62084u(abstractC43569js4, m29468m));
        } else {
            C38856bx2 m29468m2 = m29468m();
            C24687h c24687h = new C24687h(abstractC43569js4, this);
            do {
                C38856bx2 m62097E2 = m29468m2.m62097E();
                if (!(!(m62097E2 instanceof AbstractC51870xs5))) {
                    return false;
                }
                m62089O = m62097E2.m62089O(abstractC43569js4, m29468m2, c24687h);
                if (m62089O != 1) {
                }
            } while (m62089O != 2);
            return false;
        }
        return true;
    }

    /* renamed from: O */
    public final <R> boolean m31295O(InterfaceC48304rr5<? super R> interfaceC48304rr5, Function2<Object, ? super Continuation<? super R>, ? extends Object> function2, int i) {
        C24684e c24684e = new C24684e(this, interfaceC48304rr5, function2, i);
        boolean m31296L = m31296L(c24684e);
        if (m31296L) {
            interfaceC48304rr5.mo15173j(c24684e);
        }
        return m31296L;
    }

    /* renamed from: P */
    public abstract boolean mo11167P();

    /* renamed from: Q */
    public abstract boolean mo11166Q();

    /* renamed from: R */
    public boolean mo23136R() {
        return m29470i() != null && mo11166Q();
    }

    /* renamed from: S */
    public final boolean m31294S() {
        return !(m29468m().m62098D() instanceof AbstractC51870xs5) && mo11166Q();
    }

    /* renamed from: T */
    public void mo23135T(boolean z) {
        C32180Cl0<?> m29469k = m29469k();
        if (m29469k != null) {
            Object m99314b = K22.m99314b(null, 1, null);
            while (true) {
                C38856bx2 m62097E = m29469k.m62097E();
                if (m62097E instanceof C37663Zw2) {
                    mo31293U(m99314b, m29469k);
                    return;
                } else if (!m62097E.mo62093J()) {
                    m62097E.m62096F();
                } else {
                    m99314b = K22.m99313c(m99314b, (AbstractC51870xs5) m62097E);
                }
            }
        } else {
            throw new IllegalStateException("Cannot happen".toString());
        }
    }

    /* renamed from: U */
    public void mo31293U(Object obj, C32180Cl0<?> c32180Cl0) {
        if (obj != null) {
            if (!(obj instanceof ArrayList)) {
                ((AbstractC51870xs5) obj).mo196R(c32180Cl0);
                return;
            }
            ArrayList arrayList = (ArrayList) obj;
            int size = arrayList.size();
            while (true) {
                size--;
                if (-1 < size) {
                    ((AbstractC51870xs5) arrayList.get(size)).mo196R(c32180Cl0);
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: V */
    public void m31292V() {
    }

    /* renamed from: W */
    public void m31291W() {
    }

    /* renamed from: X */
    public Object mo23134X() {
        while (true) {
            AbstractC51870xs5 m29474C = m29474C();
            if (m29474C == null) {
                return C25076k0.f93733d;
            }
            if (m29474C.mo195T(null) != null) {
                m29474C.mo198P();
                return m29474C.mo197Q();
            }
            m29474C.mo4531U();
        }
    }

    /* renamed from: Y */
    public Object mo23133Y(InterfaceC48304rr5<?> interfaceC48304rr5) {
        C24686g<E> m31297K = m31297K();
        Object mo15175h = interfaceC48304rr5.mo15175h(m31297K);
        if (mo15175h != null) {
            return mo15175h;
        }
        m31297K.m62070o().mo198P();
        return m31297K.m62070o().mo197Q();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [j0$b] */
    /* renamed from: Z */
    public final <R> Object m31290Z(int i, Continuation<? super R> continuation) {
        Continuation intercepted;
        C24682c c24682c;
        Object coroutine_suspended;
        intercepted = IntrinsicsKt__IntrinsicsJvmKt.intercepted(continuation);
        C37013Xc0 m72854b = C37481Zc0.m72854b(intercepted);
        if (this.f93766b == null) {
            c24682c = new C24681b(m72854b, i);
        } else {
            c24682c = new C24682c(m72854b, i, this.f93766b);
        }
        while (true) {
            if (m31296L(c24682c)) {
                m31288b0(m72854b, c24682c);
                break;
            }
            Object mo23134X = mo23134X();
            if (mo23134X instanceof C32180Cl0) {
                c24682c.mo29812R((C32180Cl0) mo23134X);
                break;
            } else if (mo23134X != C25076k0.f93733d) {
                m72854b.mo76767t(c24682c.m31282T(mo23134X), c24682c.mo29813Q(mo23134X));
                break;
            }
        }
        Object m76770q = m72854b.m76770q();
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (m76770q == coroutine_suspended) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return m76770q;
    }

    /* renamed from: a0 */
    public final <R> void m31289a0(InterfaceC48304rr5<? super R> interfaceC48304rr5, int i, Function2<Object, ? super Continuation<? super R>, ? extends Object> function2) {
        while (!interfaceC48304rr5.mo15174i()) {
            if (m31294S()) {
                if (m31295O(interfaceC48304rr5, function2, i)) {
                    return;
                }
            } else {
                Object mo23133Y = mo23133Y(interfaceC48304rr5);
                if (mo23133Y == C48896sr5.m13571d()) {
                    return;
                }
                if (mo23133Y != C25076k0.f93733d && mo23133Y != C27694qp.f105860b) {
                    m31287c0(function2, interfaceC48304rr5, i, mo23133Y);
                }
            }
        }
    }

    /* renamed from: b0 */
    public final void m31288b0(InterfaceC36779Wc0<?> interfaceC36779Wc0, AbstractC43569js4<?> abstractC43569js4) {
        interfaceC36779Wc0.mo76794H(new C24685f(abstractC43569js4));
    }

    /* renamed from: c0 */
    public final <R> void m31287c0(Function2<Object, ? super Continuation<? super R>, ? extends Object> function2, InterfaceC48304rr5<? super R> interfaceC48304rr5, int i, Object obj) {
        Object m88175c;
        boolean z = obj instanceof C32180Cl0;
        if (z) {
            if (i != 0) {
                if (i != 1 || !interfaceC48304rr5.mo15172l()) {
                    return;
                }
                C32816Fd6.m106837b(function2, C35420Qh0.m88188b(C35420Qh0.f30755b.m88177a(((C32180Cl0) obj).f4627e)), interfaceC48304rr5.mo15171m());
                return;
            }
            throw C46840pO5.m19353a(((C32180Cl0) obj).m111747Y());
        } else if (i == 1) {
            C35420Qh0.C6844b c6844b = C35420Qh0.f30755b;
            if (z) {
                m88175c = c6844b.m88177a(((C32180Cl0) obj).f4627e);
            } else {
                m88175c = c6844b.m88175c(obj);
            }
            C32816Fd6.m106837b(function2, C35420Qh0.m88188b(m88175c), interfaceC48304rr5.mo15171m());
        } else {
            C32816Fd6.m106837b(function2, obj, interfaceC48304rr5.mo15171m());
        }
    }

    @Override // p000.InterfaceC44162ks4
    /* renamed from: f */
    public final void mo552f(CancellationException cancellationException) {
        if (mo23136R()) {
            return;
        }
        if (cancellationException == null) {
            cancellationException = new CancellationException(C39783dV0.m44216a(this) + " was cancelled");
        }
        m31298I(cancellationException);
    }

    public boolean isEmpty() {
        return m31294S();
    }

    @Override // p000.InterfaceC44162ks4
    public final InterfaceC34952Oh0<E> iterator() {
        return new C24680a(this);
    }

    @Override // p000.InterfaceC44162ks4
    /* renamed from: j */
    public final InterfaceC42374hr5<C35420Qh0<E>> mo28255j() {
        return new C24689j(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.InterfaceC44162ks4
    /* renamed from: l */
    public final Object mo28254l() {
        Object mo23134X = mo23134X();
        if (mo23134X == C25076k0.f93733d) {
            return C35420Qh0.f30755b.m88176b();
        }
        if (mo23134X instanceof C32180Cl0) {
            return C35420Qh0.f30755b.m88177a(((C32180Cl0) mo23134X).f4627e);
        }
        return C35420Qh0.f30755b.m88175c(mo23134X);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    @Override // p000.InterfaceC44162ks4
    /* renamed from: s */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo28253s(Continuation<? super C35420Qh0<? extends E>> continuation) {
        C24690k c24690k;
        Object coroutine_suspended;
        int i;
        if (continuation instanceof C24690k) {
            c24690k = (C24690k) continuation;
            int i2 = c24690k.f91993j;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c24690k.f91993j = i2 - Integer.MIN_VALUE;
                Object obj = c24690k.f91991h;
                coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = c24690k.f91993j;
                if (i == 0) {
                    if (i == 1) {
                        ResultKt.throwOnFailure(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.throwOnFailure(obj);
                    Object mo23134X = mo23134X();
                    if (mo23134X != C25076k0.f93733d) {
                        if (mo23134X instanceof C32180Cl0) {
                            return C35420Qh0.f30755b.m88177a(((C32180Cl0) mo23134X).f4627e);
                        }
                        return C35420Qh0.f30755b.m88175c(mo23134X);
                    }
                    c24690k.f91993j = 1;
                    obj = m31290Z(1, c24690k);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                return ((C35420Qh0) obj).m88178l();
            }
        }
        c24690k = new C24690k(this, continuation);
        Object obj2 = c24690k.f91991h;
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = c24690k.f91993j;
        if (i == 0) {
        }
        return ((C35420Qh0) obj2).m88178l();
    }
}
