package p000;

import ch.qos.logback.core.CoreConstants;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.JvmField;
@Metadata(m28433d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u0001*\n\b\u0001\u0010\u0002 \u0000*\u00028\u00002\b\u0012\u0004\u0012\u00028\u00010\u00032\u00060\u0004j\u0002`\u0005B\u001d\u0012\u0006\u0010\u000e\u001a\u00020\u000b\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\b\u0010\u0007\u001a\u00020\u0006H\u0016J\u000f\u0010\t\u001a\u00020\bH\u0010¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u000e\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u0013"}, m28432d2 = {"LM46;", "U", "T", "LUm5;", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "", "run", "", "E0", "()Ljava/lang/String;", "", "e", "J", "time", "Lkotlin/coroutines/Continuation;", "uCont", "<init>", "(JLkotlin/coroutines/Continuation;)V", "kotlinx-coroutines-core"}, m28431k = 1, m28430mv = {1, 6, 0})
/* renamed from: M46 */
/* loaded from: classes8.dex */
public final class M46<U, T extends U> extends C36406Um5<T> implements Runnable {
    @JvmField

    /* renamed from: e */
    public final long f22605e;

    public M46(long j, Continuation<? super U> continuation) {
        super(continuation.getContext(), continuation);
        this.f22605e = j;
    }

    @Override // p000.AbstractC27449q0, p000.C35890Sh2
    /* renamed from: E0 */
    public String mo18344E0() {
        return super.mo18344E0() + "(timeMillis=" + this.f22605e + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    @Override // java.lang.Runnable
    public void run() {
        m85094a0(N46.m94395a(this.f22605e, this));
    }
}
