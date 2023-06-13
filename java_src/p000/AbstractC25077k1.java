package p000;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import com.stripe.android.model.Stripe3ds2AuthResult;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.ExceptionsKt__ExceptionsKt;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlinx.coroutines.internal.UndeliveredElementException;
import p000.C38856bx2;
@Metadata(m28433d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0019\b \u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002:\u0001RB)\u0012 \u00109\u001a\u001c\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\t\u0018\u00010)j\n\u0012\u0004\u0012\u00028\u0000\u0018\u0001`6¢\u0006\u0004\bQ\u0010-J\u001b\u0010\u0006\u001a\u00020\u00052\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0003H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u001b\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00028\u0000H\u0082@ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bJ+\u0010\r\u001a\u00020\t*\u0006\u0012\u0002\b\u00030\f2\u0006\u0010\b\u001a\u00028\u00002\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0003H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u0010\u001a\u00020\t2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0005H\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u001b\u0010\u0012\u001a\u00020\t2\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0003H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0018\u001a\u00020\u00172\u0006\u0010\b\u001a\u00028\u0000H\u0014¢\u0006\u0004\b\u0018\u0010\u0019J\u0011\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0004¢\u0006\u0004\b\u001b\u0010\u001cJ\u001d\u0010\u001e\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u001d2\u0006\u0010\b\u001a\u00028\u0000H\u0004¢\u0006\u0004\b\u001e\u0010\u001fJ\u001b\u0010 \u001a\u00020\t2\u0006\u0010\b\u001a\u00028\u0000H\u0086@ø\u0001\u0000¢\u0006\u0004\b \u0010\u000bJ$\u0010\"\u001a\b\u0012\u0004\u0012\u00020\t0!2\u0006\u0010\b\u001a\u00028\u0000ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\"\u0010\u0019J\u0019\u0010$\u001a\u0004\u0018\u00010\u00172\u0006\u0010#\u001a\u00020\u001aH\u0014¢\u0006\u0004\b$\u0010%J\u0019\u0010'\u001a\u00020&2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0004\b'\u0010(J)\u0010,\u001a\u00020\t2\u0018\u0010+\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0004\u0012\u00020\t0)j\u0002`*H\u0016¢\u0006\u0004\b,\u0010-J\u0017\u0010/\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020.H\u0014¢\u0006\u0004\b/\u00100J\u0017\u00101\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u001dH\u0014¢\u0006\u0004\b1\u00102J\u000f\u00104\u001a\u000203H\u0016¢\u0006\u0004\b4\u00105R.\u00109\u001a\u001c\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\t\u0018\u00010)j\n\u0012\u0004\u0012\u00028\u0000\u0018\u0001`68\u0004X\u0085\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u001a\u0010>\u001a\u00020:8\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u0015\u0010;\u001a\u0004\b<\u0010=R\u0014\u0010A\u001a\u00020&8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b?\u0010@R\u0014\u0010C\u001a\u0002038BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bB\u00105R\u0014\u0010E\u001a\u00020&8$X¤\u0004¢\u0006\u0006\u001a\u0004\bD\u0010@R\u0014\u0010G\u001a\u00020&8$X¤\u0004¢\u0006\u0006\u001a\u0004\bF\u0010@R\u001a\u0010J\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00038DX\u0084\u0004¢\u0006\u0006\u001a\u0004\bH\u0010IR\u001a\u0010L\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00038DX\u0084\u0004¢\u0006\u0006\u001a\u0004\bK\u0010IR\u0011\u0010N\u001a\u00020&8F¢\u0006\u0006\u001a\u0004\bM\u0010@R\u0014\u0010P\u001a\u0002038TX\u0094\u0004¢\u0006\u0006\u001a\u0004\bO\u00105\u0082\u0002\u000f\n\u0002\b\u0019\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006S"}, m28432d2 = {"Lk1;", "E", "Lys5;", "LCl0;", "closed", "", "p", "(LCl0;)Ljava/lang/Throwable;", "element", "", "z", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlin/coroutines/Continuation;", "q", "(Lkotlin/coroutines/Continuation;Ljava/lang/Object;LCl0;)V", "cause", "r", "(Ljava/lang/Throwable;)V", "o", "(LCl0;)V", "", "c", "()I", "", "w", "(Ljava/lang/Object;)Ljava/lang/Object;", "Lxs5;", Stripe3ds2AuthResult.Ares.VALUE_CHALLENGE, "()Lxs5;", "Lls4;", "y", "(Ljava/lang/Object;)Lls4;", "M", "LQh0;", "h", "send", DateTokenConverter.CONVERTER_KEY, "(Lxs5;)Ljava/lang/Object;", "", "J", "(Ljava/lang/Throwable;)Z", "Lkotlin/Function1;", "Lkotlinx/coroutines/channels/Handler;", "handler", "e", "(Lkotlin/jvm/functions/Function1;)V", "Lbx2;", "x", "(Lbx2;)V", "B", "()Lls4;", "", "toString", "()Ljava/lang/String;", "Lkotlinx/coroutines/internal/OnUndeliveredElement;", "b", "Lkotlin/jvm/functions/Function1;", "onUndeliveredElement", "LZw2;", "LZw2;", "m", "()LZw2;", "queue", "v", "()Z", "isFullImpl", "n", "queueDebugStateString", "t", "isBufferAlwaysFull", "u", "isBufferFull", "k", "()LCl0;", "closedForSend", "i", "closedForReceive", "A", "isClosedForSend", "g", "bufferDebugString", "<init>", C17296a.f69688o, "kotlinx-coroutines-core"}, m28431k = 1, m28430mv = {1, 6, 0})
/* renamed from: k1 */
/* loaded from: classes8.dex */
public abstract class AbstractC25077k1<E> implements InterfaceC52463ys5<E> {

    /* renamed from: d */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f93765d = AtomicReferenceFieldUpdater.newUpdater(AbstractC25077k1.class, Object.class, "onCloseHandler");
    @JvmField

    /* renamed from: b */
    public final Function1<E, Unit> f93766b;

    /* renamed from: c */
    public final C37663Zw2 f93767c = new C37663Zw2();
    private volatile /* synthetic */ Object onCloseHandler = null;

    @Metadata(m28433d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0000\u0018\u0000*\u0006\b\u0001\u0010\u0001 \u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0010\u001a\u00028\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0014\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016J\u0014\u0010\u000b\u001a\u00020\u00072\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\tH\u0016J\b\u0010\r\u001a\u00020\fH\u0016R\u0014\u0010\u0010\u001a\u00028\u00018\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0014\u001a\u0004\u0018\u00010\u00118VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0017"}, m28432d2 = {"Lk1$a;", "E", "Lxs5;", "Lbx2$c;", "otherOp", "LuX5;", "T", "", "P", "LCl0;", "closed", "R", "", "toString", "e", "Ljava/lang/Object;", "element", "", "Q", "()Ljava/lang/Object;", "pollResult", "<init>", "(Ljava/lang/Object;)V", "kotlinx-coroutines-core"}, m28431k = 1, m28430mv = {1, 6, 0})
    /* renamed from: k1$a */
    /* loaded from: classes8.dex */
    public static final class C25078a<E> extends AbstractC51870xs5 {
        @JvmField

        /* renamed from: e */
        public final E f93768e;

        public C25078a(E e) {
            this.f93768e = e;
        }

        @Override // p000.AbstractC51870xs5
        /* renamed from: P */
        public void mo198P() {
        }

        @Override // p000.AbstractC51870xs5
        /* renamed from: Q */
        public Object mo197Q() {
            return this.f93768e;
        }

        @Override // p000.AbstractC51870xs5
        /* renamed from: R */
        public void mo196R(C32180Cl0<?> c32180Cl0) {
        }

        @Override // p000.AbstractC51870xs5
        /* renamed from: T */
        public C49885uX5 mo195T(C38856bx2.C13354c c13354c) {
            C49885uX5 c49885uX5 = C37247Yc0.f46071a;
            if (c13354c != null) {
                c13354c.m62078d();
            }
            return c49885uX5;
        }

        @Override // p000.C38856bx2
        public String toString() {
            return "SendBuffered@" + C39783dV0.m44215b(this) + CoreConstants.LEFT_PARENTHESIS_CHAR + this.f93768e + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003H\u0016¨\u0006\u0007"}, m28432d2 = {"k1$b", "Lbx2$b;", "Lbx2;", "Lkotlinx/coroutines/internal/Node;", "affected", "", "k", "kotlinx-coroutines-core"}, m28431k = 1, m28430mv = {1, 6, 0})
    /* renamed from: k1$b */
    /* loaded from: classes8.dex */
    public static final class C25079b extends C38856bx2.AbstractC13353b {

        /* renamed from: d */
        public final /* synthetic */ AbstractC25077k1 f93769d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C25079b(C38856bx2 c38856bx2, AbstractC25077k1 abstractC25077k1) {
            super(c38856bx2);
            this.f93769d = abstractC25077k1;
        }

        @Override // p000.AbstractC28006rp
        /* renamed from: k */
        public Object mo15326i(C38856bx2 c38856bx2) {
            if (this.f93769d.mo11164u()) {
                return null;
            }
            return C38263ax2.m65211a();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AbstractC25077k1(Function1<? super E, Unit> function1) {
        this.f93766b = function1;
    }

    @Override // p000.InterfaceC52463ys5
    /* renamed from: A */
    public final boolean mo2353A() {
        return m29469k() != null;
    }

    /* renamed from: B */
    public InterfaceC44755ls4<E> mo29475B() {
        C38856bx2 c38856bx2;
        C38856bx2 m62091M;
        C37663Zw2 c37663Zw2 = this.f93767c;
        while (true) {
            c38856bx2 = (C38856bx2) c37663Zw2.m62099A();
            if (c38856bx2 != c37663Zw2 && (c38856bx2 instanceof InterfaceC44755ls4)) {
                if (((((InterfaceC44755ls4) c38856bx2) instanceof C32180Cl0) && !c38856bx2.mo62094I()) || (m62091M = c38856bx2.m62091M()) == null) {
                    break;
                }
                m62091M.m62095G();
            }
        }
        c38856bx2 = null;
        return (InterfaceC44755ls4) c38856bx2;
    }

    /* renamed from: C */
    public final AbstractC51870xs5 m29474C() {
        C38856bx2 c38856bx2;
        C38856bx2 m62091M;
        C37663Zw2 c37663Zw2 = this.f93767c;
        while (true) {
            c38856bx2 = (C38856bx2) c37663Zw2.m62099A();
            if (c38856bx2 != c37663Zw2 && (c38856bx2 instanceof AbstractC51870xs5)) {
                if (((((AbstractC51870xs5) c38856bx2) instanceof C32180Cl0) && !c38856bx2.mo62094I()) || (m62091M = c38856bx2.m62091M()) == null) {
                    break;
                }
                m62091M.m62095G();
            }
        }
        c38856bx2 = null;
        return (AbstractC51870xs5) c38856bx2;
    }

    @Override // p000.InterfaceC52463ys5
    /* renamed from: J */
    public boolean mo2352J(Throwable th) {
        boolean z;
        C32180Cl0<?> c32180Cl0 = new C32180Cl0<>(th);
        C38856bx2 c38856bx2 = this.f93767c;
        while (true) {
            C38856bx2 m62097E = c38856bx2.m62097E();
            z = true;
            if (!(!(m62097E instanceof C32180Cl0))) {
                z = false;
                break;
            } else if (m62097E.m62084u(c32180Cl0, c38856bx2)) {
                break;
            }
        }
        if (!z) {
            c32180Cl0 = (C32180Cl0) this.f93767c.m62097E();
        }
        m29466o(c32180Cl0);
        if (z) {
            m29463r(th);
        }
        return z;
    }

    @Override // p000.InterfaceC52463ys5
    /* renamed from: M */
    public final Object mo2351M(E e, Continuation<? super Unit> continuation) {
        Object coroutine_suspended;
        if (mo23127w(e) == C25076k0.f93731b) {
            return Unit.INSTANCE;
        }
        Object m29459z = m29459z(e, continuation);
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (m29459z == coroutine_suspended) {
            return m29459z;
        }
        return Unit.INSTANCE;
    }

    /* renamed from: c */
    public final int m29471c() {
        C37663Zw2 c37663Zw2 = this.f93767c;
        int i = 0;
        for (C38856bx2 c38856bx2 = (C38856bx2) c37663Zw2.m62099A(); !Intrinsics.areEqual(c38856bx2, c37663Zw2); c38856bx2 = c38856bx2.m62098D()) {
            if (c38856bx2 instanceof C38856bx2) {
                i++;
            }
        }
        return i;
    }

    /* renamed from: d */
    public Object mo23132d(AbstractC51870xs5 abstractC51870xs5) {
        boolean z;
        C38856bx2 m62097E;
        if (mo11165t()) {
            C38856bx2 c38856bx2 = this.f93767c;
            do {
                m62097E = c38856bx2.m62097E();
                if (m62097E instanceof InterfaceC44755ls4) {
                    return m62097E;
                }
            } while (!m62097E.m62084u(abstractC51870xs5, c38856bx2));
            return null;
        }
        C38856bx2 c38856bx22 = this.f93767c;
        C25079b c25079b = new C25079b(abstractC51870xs5, this);
        while (true) {
            C38856bx2 m62097E2 = c38856bx22.m62097E();
            if (m62097E2 instanceof InterfaceC44755ls4) {
                return m62097E2;
            }
            int m62089O = m62097E2.m62089O(abstractC51870xs5, c38856bx22, c25079b);
            z = true;
            if (m62089O != 1) {
                if (m62089O == 2) {
                    z = false;
                    break;
                }
            } else {
                break;
            }
        }
        if (!z) {
            return C25076k0.f93734e;
        }
        return null;
    }

    @Override // p000.InterfaceC52463ys5
    /* renamed from: e */
    public void mo2350e(Function1<? super Throwable, Unit> function1) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f93765d;
        if (!C22859i1.m35391a(atomicReferenceFieldUpdater, this, null, function1)) {
            Object obj = this.onCloseHandler;
            if (obj == C25076k0.f93735f) {
                throw new IllegalStateException("Another handler was already registered and successfully invoked");
            }
            throw new IllegalStateException("Another handler was already registered: " + obj);
        }
        C32180Cl0<?> m29469k = m29469k();
        if (m29469k != null && C22859i1.m35391a(atomicReferenceFieldUpdater, this, function1, C25076k0.f93735f)) {
            function1.invoke(m29469k.f4627e);
        }
    }

    /* renamed from: g */
    public String mo23128g() {
        return "";
    }

    @Override // p000.InterfaceC52463ys5
    /* renamed from: h */
    public final Object mo2349h(E e) {
        Object mo23127w = mo23127w(e);
        if (mo23127w == C25076k0.f93731b) {
            return C35420Qh0.f30755b.m88175c(Unit.INSTANCE);
        }
        if (mo23127w == C25076k0.f93732c) {
            C32180Cl0<?> m29469k = m29469k();
            if (m29469k == null) {
                return C35420Qh0.f30755b.m88176b();
            }
            return C35420Qh0.f30755b.m88177a(m29465p(m29469k));
        } else if (mo23127w instanceof C32180Cl0) {
            return C35420Qh0.f30755b.m88177a(m29465p((C32180Cl0) mo23127w));
        } else {
            throw new IllegalStateException(("trySend returned " + mo23127w).toString());
        }
    }

    /* renamed from: i */
    public final C32180Cl0<?> m29470i() {
        C38856bx2 m62098D = this.f93767c.m62098D();
        C32180Cl0<?> c32180Cl0 = m62098D instanceof C32180Cl0 ? (C32180Cl0) m62098D : null;
        if (c32180Cl0 != null) {
            m29466o(c32180Cl0);
            return c32180Cl0;
        }
        return null;
    }

    /* renamed from: k */
    public final C32180Cl0<?> m29469k() {
        C38856bx2 m62097E = this.f93767c.m62097E();
        C32180Cl0<?> c32180Cl0 = m62097E instanceof C32180Cl0 ? (C32180Cl0) m62097E : null;
        if (c32180Cl0 != null) {
            m29466o(c32180Cl0);
            return c32180Cl0;
        }
        return null;
    }

    /* renamed from: m */
    public final C37663Zw2 m29468m() {
        return this.f93767c;
    }

    /* renamed from: n */
    public final String m29467n() {
        String str;
        C38856bx2 m62098D = this.f93767c.m62098D();
        if (m62098D == this.f93767c) {
            return "EmptyQueue";
        }
        if (m62098D instanceof C32180Cl0) {
            str = m62098D.toString();
        } else if (m62098D instanceof AbstractC43569js4) {
            str = "ReceiveQueued";
        } else if (m62098D instanceof AbstractC51870xs5) {
            str = "SendQueued";
        } else {
            str = "UNEXPECTED:" + m62098D;
        }
        C38856bx2 m62097E = this.f93767c.m62097E();
        if (m62097E != m62098D) {
            String str2 = str + ",queueSize=" + m29471c();
            if (m62097E instanceof C32180Cl0) {
                return str2 + ",closedForSend=" + m62097E;
            }
            return str2;
        }
        return str;
    }

    /* renamed from: o */
    public final void m29466o(C32180Cl0<?> c32180Cl0) {
        AbstractC43569js4 abstractC43569js4;
        Object m99314b = K22.m99314b(null, 1, null);
        while (true) {
            C38856bx2 m62097E = c32180Cl0.m62097E();
            if (m62097E instanceof AbstractC43569js4) {
                abstractC43569js4 = (AbstractC43569js4) m62097E;
            } else {
                abstractC43569js4 = null;
            }
            if (abstractC43569js4 == null) {
                break;
            } else if (!abstractC43569js4.mo62093J()) {
                abstractC43569js4.m62096F();
            } else {
                m99314b = K22.m99313c(m99314b, abstractC43569js4);
            }
        }
        if (m99314b != null) {
            if (!(m99314b instanceof ArrayList)) {
                ((AbstractC43569js4) m99314b).mo29812R(c32180Cl0);
            } else {
                ArrayList arrayList = (ArrayList) m99314b;
                for (int size = arrayList.size() - 1; -1 < size; size--) {
                    ((AbstractC43569js4) arrayList.get(size)).mo29812R(c32180Cl0);
                }
            }
        }
        m29461x(c32180Cl0);
    }

    /* renamed from: p */
    public final Throwable m29465p(C32180Cl0<?> c32180Cl0) {
        m29466o(c32180Cl0);
        return c32180Cl0.m111746Z();
    }

    /* renamed from: q */
    public final void m29464q(Continuation<?> continuation, E e, C32180Cl0<?> c32180Cl0) {
        UndeliveredElementException m18972d;
        m29466o(c32180Cl0);
        Throwable m111746Z = c32180Cl0.m111746Z();
        Function1<E, Unit> function1 = this.f93766b;
        if (function1 != null && (m18972d = C47016ph3.m18972d(function1, e, null, 2, null)) != null) {
            ExceptionsKt__ExceptionsKt.addSuppressed(m18972d, m111746Z);
            Result.Companion companion = Result.Companion;
            continuation.resumeWith(Result.m116783constructorimpl(ResultKt.createFailure(m18972d)));
            return;
        }
        Result.Companion companion2 = Result.Companion;
        continuation.resumeWith(Result.m116783constructorimpl(ResultKt.createFailure(m111746Z)));
    }

    /* renamed from: r */
    public final void m29463r(Throwable th) {
        C49885uX5 c49885uX5;
        Object obj = this.onCloseHandler;
        if (obj != null && obj != (c49885uX5 = C25076k0.f93735f) && C22859i1.m35391a(f93765d, this, obj, c49885uX5)) {
            ((Function1) TypeIntrinsics.beforeCheckcastToFunctionOfArity(obj, 1)).invoke(th);
        }
    }

    /* renamed from: t */
    public abstract boolean mo11165t();

    public String toString() {
        return C39783dV0.m44216a(this) + '@' + C39783dV0.m44215b(this) + CoreConstants.CURLY_LEFT + m29467n() + CoreConstants.CURLY_RIGHT + mo23128g();
    }

    /* renamed from: u */
    public abstract boolean mo11164u();

    /* renamed from: v */
    public final boolean m29462v() {
        return !(this.f93767c.m62098D() instanceof InterfaceC44755ls4) && mo11164u();
    }

    /* renamed from: w */
    public Object mo23127w(E e) {
        InterfaceC44755ls4<E> mo29475B;
        do {
            mo29475B = mo29475B();
            if (mo29475B == null) {
                return C25076k0.f93732c;
            }
        } while (mo29475B.mo26719g(e, null) == null);
        mo29475B.mo26720f(e);
        return mo29475B.mo26721a();
    }

    /* renamed from: x */
    public void m29461x(C38856bx2 c38856bx2) {
    }

    /* renamed from: y */
    public final InterfaceC44755ls4<?> m29460y(E e) {
        C38856bx2 m62097E;
        C38856bx2 c38856bx2 = this.f93767c;
        C25078a c25078a = new C25078a(e);
        do {
            m62097E = c38856bx2.m62097E();
            if (m62097E instanceof InterfaceC44755ls4) {
                return (InterfaceC44755ls4) m62097E;
            }
        } while (!m62097E.m62084u(c25078a, c38856bx2));
        return null;
    }

    /* renamed from: z */
    public final Object m29459z(E e, Continuation<? super Unit> continuation) {
        Continuation intercepted;
        Object coroutine_suspended;
        Object coroutine_suspended2;
        AbstractC51870xs5 c31780As5;
        intercepted = IntrinsicsKt__IntrinsicsJvmKt.intercepted(continuation);
        C37013Xc0 m72854b = C37481Zc0.m72854b(intercepted);
        while (true) {
            if (m29462v()) {
                if (this.f93766b == null) {
                    c31780As5 = new C53056zs5(e, m72854b);
                } else {
                    c31780As5 = new C31780As5(e, m72854b, this.f93766b);
                }
                Object mo23132d = mo23132d(c31780As5);
                if (mo23132d == null) {
                    C37481Zc0.m72853c(m72854b, c31780As5);
                    break;
                } else if (mo23132d instanceof C32180Cl0) {
                    m29464q(m72854b, e, (C32180Cl0) mo23132d);
                    break;
                } else if (mo23132d != C25076k0.f93734e && !(mo23132d instanceof AbstractC43569js4)) {
                    throw new IllegalStateException(("enqueueSend returned " + mo23132d).toString());
                }
            }
            Object mo23127w = mo23127w(e);
            if (mo23127w == C25076k0.f93731b) {
                Result.Companion companion = Result.Companion;
                m72854b.resumeWith(Result.m116783constructorimpl(Unit.INSTANCE));
                break;
            } else if (mo23127w != C25076k0.f93732c) {
                if (mo23127w instanceof C32180Cl0) {
                    m29464q(m72854b, e, (C32180Cl0) mo23127w);
                } else {
                    throw new IllegalStateException(("offerInternal returned " + mo23127w).toString());
                }
            }
        }
        Object m76770q = m72854b.m76770q();
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (m76770q == coroutine_suspended) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        coroutine_suspended2 = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (m76770q == coroutine_suspended2) {
            return m76770q;
        }
        return Unit.INSTANCE;
    }
}
