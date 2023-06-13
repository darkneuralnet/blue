package kotlinx.coroutines.flow.internal;

import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
@Metadata(m28433d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0013\u0012\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u0005¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u0004\u001a\u00020\u0003H\u0016R\u0018\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u00058\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\u000b"}, m28432d2 = {"Lkotlinx/coroutines/flow/internal/AbortFlowException;", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "", "fillInStackTrace", "LGu1;", "b", "LGu1;", "owner", "<init>", "(LGu1;)V", "kotlinx-coroutines-core"}, m28431k = 1, m28430mv = {1, 6, 0})
/* loaded from: classes8.dex */
public final class AbortFlowException extends CancellationException {
    @JvmField

    /* renamed from: b */
    public final transient InterfaceC33198Gu1<?> f95029b;

    public AbortFlowException(InterfaceC33198Gu1<?> interfaceC33198Gu1) {
        super("Flow was aborted, no more elements needed");
        this.f95029b = interfaceC33198Gu1;
    }

    @Override // java.lang.Throwable
    public Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }
}
