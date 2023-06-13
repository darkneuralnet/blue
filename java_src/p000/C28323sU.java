package p000;

import com.stripe.android.model.Stripe3ds2AuthParams;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\f\u0010\rJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\b\u001a\u00020\u0006H\u0016J\b\u0010\n\u001a\u00020\tH\u0016J\b\u0010\u000b\u001a\u00020\u0006H\u0016¨\u0006\u000e"}, m28432d2 = {"LsU;", "LwB5;", "Li30;", Stripe3ds2AuthParams.FIELD_SOURCE, "", "byteCount", "", "write", "flush", "LJ46;", "timeout", "close", "<init>", "()V", "okio"}, m28431k = 1, m28430mv = {1, 6, 0})
/* renamed from: sU */
/* loaded from: classes8.dex */
public final class C28323sU implements InterfaceC50872wB5 {
    @Override // p000.InterfaceC50872wB5, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    @Override // p000.InterfaceC50872wB5, java.io.Flushable
    public void flush() {
    }

    @Override // p000.InterfaceC50872wB5
    public J46 timeout() {
        return J46.NONE;
    }

    @Override // p000.InterfaceC50872wB5
    public void write(C42488i30 source, long j) {
        Intrinsics.checkNotNullParameter(source, "source");
        source.skip(j);
    }
}
