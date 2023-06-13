package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.amazonaws.mobileconnectors.p025s3.transferutility.TransferTable;
import com.facebook.share.internal.C17296a;
import java.util.concurrent.CancellationException;
import kotlin.ExceptionsKt__ExceptionsKt;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b \u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\u00060\u0002j\u0002`\u0003B\u000f\u0012\u0006\u0010\u0018\u001a\u00020\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0011\u0010\u0005\u001a\u0004\u0018\u00010\u0004H ¢\u0006\u0004\b\u0005\u0010\u0006J!\u0010\u000b\u001a\u00020\n2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00042\u0006\u0010\t\u001a\u00020\bH\u0010¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u000e\u001a\u00028\u0001\"\u0004\b\u0001\u0010\u00012\b\u0010\r\u001a\u0004\u0018\u00010\u0004H\u0010¢\u0006\u0004\b\u000e\u0010\u000fJ\u001b\u0010\u0010\u001a\u0004\u0018\u00010\b2\b\u0010\r\u001a\u0004\u0018\u00010\u0004H\u0010¢\u0006\u0004\b\u0010\u0010\u0011J\u0006\u0010\u0012\u001a\u00020\nJ\u001a\u0010\u0015\u001a\u00020\n2\b\u0010\u0013\u001a\u0004\u0018\u00010\b2\b\u0010\u0014\u001a\u0004\u0018\u00010\bR\u0016\u0010\u0018\u001a\u00020\u00168\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0017R\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00000\u00198 X \u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001f"}, m28432d2 = {"LO41;", "T", "LWY5;", "Lkotlinx/coroutines/SchedulerTask;", "", "g", "()Ljava/lang/Object;", "takenState", "", "cause", "", C17296a.f69688o, "(Ljava/lang/Object;Ljava/lang/Throwable;)V", TransferTable.COLUMN_STATE, "e", "(Ljava/lang/Object;)Ljava/lang/Object;", DateTokenConverter.CONVERTER_KEY, "(Ljava/lang/Object;)Ljava/lang/Throwable;", "run", "exception", "finallyException", "f", "", "I", "resumeMode", "Lkotlin/coroutines/Continuation;", "b", "()Lkotlin/coroutines/Continuation;", "delegate", "<init>", "(I)V", "kotlinx-coroutines-core"}, m28431k = 1, m28430mv = {1, 6, 0})
/* renamed from: O41 */
/* loaded from: classes8.dex */
public abstract class O41<T> extends WY5 {
    @JvmField

    /* renamed from: d */
    public int f25606d;

    public O41(int i) {
        this.f25606d = i;
    }

    /* renamed from: a */
    public void mo76785a(Object obj, Throwable th) {
    }

    /* renamed from: b */
    public abstract Continuation<T> mo76784b();

    /* renamed from: d */
    public Throwable mo76782d(Object obj) {
        C47716qs0 c47716qs0 = obj instanceof C47716qs0 ? (C47716qs0) obj : null;
        if (c47716qs0 != null) {
            return c47716qs0.f105942a;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: e */
    public <T> T mo76781e(Object obj) {
        return obj;
    }

    /* renamed from: f */
    public final void m92953f(Throwable th, Throwable th2) {
        if (th == null && th2 == null) {
            return;
        }
        if (th != null && th2 != null) {
            ExceptionsKt__ExceptionsKt.addSuppressed(th, th2);
        }
        if (th == null) {
            th = th2;
        }
        Intrinsics.checkNotNull(th);
        VC0.m80237a(mo76784b().getContext(), new C39010cD0("Fatal exception in coroutines machinery for " + this + ". Please read KDoc to 'handleFatalException' method and report this incident to maintainers", th));
    }

    /* renamed from: g */
    public abstract Object mo76780g();

    @Override // java.lang.Runnable
    public final void run() {
        Object m116783constructorimpl;
        C32582Ed6<?> c32582Ed6;
        InterfaceC52943zh2 interfaceC52943zh2;
        Object m116783constructorimpl2;
        InterfaceC43974kZ5 interfaceC43974kZ5 = this.f41291c;
        try {
            L41 l41 = (L41) mo76784b();
            Continuation<T> continuation = l41.f20671f;
            Object obj = l41.f20673h;
            CoroutineContext context = continuation.getContext();
            Object m7521c = C50794w36.m7521c(context, obj);
            if (m7521c != C50794w36.f115218a) {
                c32582Ed6 = RC0.m87208g(continuation, context, m7521c);
            } else {
                c32582Ed6 = null;
            }
            CoroutineContext context2 = continuation.getContext();
            Object mo76780g = mo76780g();
            Throwable mo76782d = mo76782d(mo76780g);
            if (mo76782d == null && P41.m91024b(this.f25606d)) {
                interfaceC52943zh2 = (InterfaceC52943zh2) context2.get(InterfaceC52943zh2.f122077a0);
            } else {
                interfaceC52943zh2 = null;
            }
            if (interfaceC52943zh2 != null && !interfaceC52943zh2.mo555b()) {
                CancellationException mo558F = interfaceC52943zh2.mo558F();
                mo76785a(mo76780g, mo558F);
                Result.Companion companion = Result.Companion;
                continuation.resumeWith(Result.m116783constructorimpl(ResultKt.createFailure(mo558F)));
            } else if (mo76782d != null) {
                Result.Companion companion2 = Result.Companion;
                continuation.resumeWith(Result.m116783constructorimpl(ResultKt.createFailure(mo76782d)));
            } else {
                Result.Companion companion3 = Result.Companion;
                continuation.resumeWith(Result.m116783constructorimpl(mo76781e(mo76780g)));
            }
            Unit unit = Unit.INSTANCE;
            if (c32582Ed6 == null || c32582Ed6.m108635g1()) {
                C50794w36.m7523a(context, m7521c);
            }
            try {
                interfaceC43974kZ5.mo27149a();
                m116783constructorimpl2 = Result.m116783constructorimpl(Unit.INSTANCE);
            } catch (Throwable th) {
                Result.Companion companion4 = Result.Companion;
                m116783constructorimpl2 = Result.m116783constructorimpl(ResultKt.createFailure(th));
            }
            m92953f(null, Result.m116786exceptionOrNullimpl(m116783constructorimpl2));
        } catch (Throwable th2) {
            try {
                Result.Companion companion5 = Result.Companion;
                interfaceC43974kZ5.mo27149a();
                m116783constructorimpl = Result.m116783constructorimpl(Unit.INSTANCE);
            } catch (Throwable th3) {
                Result.Companion companion6 = Result.Companion;
                m116783constructorimpl = Result.m116783constructorimpl(ResultKt.createFailure(th3));
            }
            m92953f(th2, Result.m116786exceptionOrNullimpl(m116783constructorimpl));
        }
    }
}
