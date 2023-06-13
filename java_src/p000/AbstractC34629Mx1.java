package p000;

import ch.qos.logback.core.CoreConstants;
import com.stripe.android.model.Stripe3ds2AuthParams;
import java.io.IOException;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b&\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\b\u001a\u00020\u0006H\u0016J\b\u0010\n\u001a\u00020\tH\u0016J\b\u0010\u000b\u001a\u00020\u0006H\u0016J\b\u0010\r\u001a\u00020\fH\u0016J\u000f\u0010\u0010\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0010\u001a\u00020\u00018\u0007¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u000f¨\u0006\u0014"}, m28432d2 = {"LMx1;", "LwB5;", "Li30;", Stripe3ds2AuthParams.FIELD_SOURCE, "", "byteCount", "", "write", "flush", "LJ46;", "timeout", "close", "", "toString", "-deprecated_delegate", "()LwB5;", "delegate", "LwB5;", "<init>", "(LwB5;)V", "okio"}, m28431k = 1, m28430mv = {1, 6, 0})
/* renamed from: Mx1  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC34629Mx1 implements InterfaceC50872wB5 {
    private final InterfaceC50872wB5 delegate;

    public AbstractC34629Mx1(InterfaceC50872wB5 delegate) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.delegate = delegate;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "delegate", imports = {}))
    @JvmName(name = "-deprecated_delegate")
    /* renamed from: -deprecated_delegate  reason: not valid java name */
    public final InterfaceC50872wB5 m116228deprecated_delegate() {
        return this.delegate;
    }

    @Override // p000.InterfaceC50872wB5, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.delegate.close();
    }

    @JvmName(name = "delegate")
    public final InterfaceC50872wB5 delegate() {
        return this.delegate;
    }

    @Override // p000.InterfaceC50872wB5, java.io.Flushable
    public void flush() throws IOException {
        this.delegate.flush();
    }

    @Override // p000.InterfaceC50872wB5
    public J46 timeout() {
        return this.delegate.timeout();
    }

    public String toString() {
        return getClass().getSimpleName() + CoreConstants.LEFT_PARENTHESIS_CHAR + this.delegate + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    @Override // p000.InterfaceC50872wB5
    public void write(C42488i30 source, long j) throws IOException {
        Intrinsics.checkNotNullParameter(source, "source");
        this.delegate.write(source, j);
    }
}
