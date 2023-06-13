package p000;

import ch.qos.logback.core.CoreConstants;
import com.amazonaws.mobileconnectors.p025s3.transferutility.TransferTable;
import com.stripe.android.financialconnections.p041ui.FinancialConnectionsSheetNativeActivity;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
@Metadata(m28433d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0012\b'\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\u00020\u00022\u00020\u00032\b\u0012\u0004\u0012\u00028\u00000\u00042\u00020\u0005B\u001f\u0012\u0006\u00103\u001a\u00020&\u0012\u0006\u00104\u001a\u00020\f\u0012\u0006\u00105\u001a\u00020\f¢\u0006\u0004\b6\u00107J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00028\u0000H\u0014¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0014J\b\u0010\u0010\u001a\u00020\u000fH\u0014J\u0012\u0010\u0013\u001a\u00020\u00072\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0004J\u001e\u0010\u0016\u001a\u00020\u00072\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u0014ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\tJ\u0012\u0010\u0017\u001a\u00020\u00072\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0014J\u0017\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\nH\u0000¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u000fH\u0010¢\u0006\u0004\b\u001b\u0010\u001cJO\u0010$\u001a\u00020\u0007\"\u0004\b\u0001\u0010\u001d2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00028\u00012'\u0010#\u001a#\b\u0001\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00110!¢\u0006\u0002\b\"ø\u0001\u0000¢\u0006\u0004\b$\u0010%R\u001d\u0010-\u001a\u00020&8\u0006¢\u0006\u0012\n\u0004\b'\u0010(\u0012\u0004\b+\u0010,\u001a\u0004\b)\u0010*R\u0014\u0010/\u001a\u00020&8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b.\u0010*R\u0014\u00102\u001a\u00020\f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b0\u00101\u0082\u0002\u0004\n\u0002\b\u0019¨\u00068"}, m28432d2 = {"Lq0;", "T", "LSh2;", "Lzh2;", "Lkotlin/coroutines/Continuation;", "LZC0;", "value", "", "d1", "(Ljava/lang/Object;)V", "", "cause", "", "handled", "c1", "", "f0", "", TransferTable.COLUMN_STATE, "J0", "Lkotlin/Result;", FinancialConnectionsSheetNativeActivity.EXTRA_RESULT, "resumeWith", "b1", "exception", "v0", "(Ljava/lang/Throwable;)V", "E0", "()Ljava/lang/String;", "R", "LbD0;", "start", "receiver", "Lkotlin/Function2;", "Lkotlin/ExtensionFunctionType;", "block", "e1", "(LbD0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V", "Lkotlin/coroutines/CoroutineContext;", "c", "Lkotlin/coroutines/CoroutineContext;", "getContext", "()Lkotlin/coroutines/CoroutineContext;", "getContext$annotations", "()V", CoreConstants.CONTEXT_SCOPE_VALUE, "K", "coroutineContext", "b", "()Z", "isActive", "parentContext", "initParentJob", "active", "<init>", "(Lkotlin/coroutines/CoroutineContext;ZZ)V", "kotlinx-coroutines-core"}, m28431k = 1, m28430mv = {1, 6, 0})
/* renamed from: q0 */
/* loaded from: classes8.dex */
public abstract class AbstractC27449q0<T> extends C35890Sh2 implements Continuation<T>, ZC0 {

    /* renamed from: c */
    public final CoroutineContext f104459c;

    public AbstractC27449q0(CoroutineContext coroutineContext, boolean z, boolean z2) {
        super(z2);
        if (z) {
            m85076w0((InterfaceC52943zh2) coroutineContext.get(InterfaceC52943zh2.f122077a0));
        }
        this.f104459c = coroutineContext.plus(this);
    }

    @Override // p000.C35890Sh2
    /* renamed from: E0 */
    public String mo18344E0() {
        String m87213b = RC0.m87213b(this.f104459c);
        if (m87213b == null) {
            return super.mo18344E0();
        }
        return '\"' + m87213b + "\":" + super.mo18344E0();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.C35890Sh2
    /* renamed from: J0 */
    public final void mo18343J0(Object obj) {
        if (obj instanceof C47716qs0) {
            C47716qs0 c47716qs0 = (C47716qs0) obj;
            mo18340c1(c47716qs0.f105942a, c47716qs0.m16901a());
            return;
        }
        mo18339d1(obj);
    }

    @Override // p000.ZC0
    /* renamed from: K */
    public CoroutineContext mo18342K() {
        return this.f104459c;
    }

    @Override // p000.C35890Sh2, p000.InterfaceC52943zh2
    /* renamed from: b */
    public boolean mo555b() {
        return super.mo555b();
    }

    /* renamed from: b1 */
    public void mo18341b1(Object obj) {
        mo79833W(obj);
    }

    /* renamed from: c1 */
    public void mo18340c1(Throwable th, boolean z) {
    }

    /* renamed from: d1 */
    public void mo18339d1(T t) {
    }

    /* renamed from: e1 */
    public final <R> void m18338e1(EnumC38417bD0 enumC38417bD0, R r, Function2<? super R, ? super Continuation<? super T>, ? extends Object> function2) {
        enumC38417bD0.m64823b(function2, r, this);
    }

    @Override // p000.C35890Sh2
    /* renamed from: f0 */
    public String mo18337f0() {
        return C39783dV0.m44216a(this) + " was cancelled";
    }

    @Override // kotlin.coroutines.Continuation
    public final CoroutineContext getContext() {
        return this.f104459c;
    }

    @Override // kotlin.coroutines.Continuation
    public final void resumeWith(Object obj) {
        Object m85121C0 = m85121C0(C49494ts0.m11547d(obj, null, 1, null));
        if (m85121C0 == C36124Th2.f35877b) {
            return;
        }
        mo18341b1(m85121C0);
    }

    @Override // p000.C35890Sh2
    /* renamed from: v0 */
    public final void mo18336v0(Throwable th) {
        VC0.m80237a(this.f104459c, th);
    }
}
