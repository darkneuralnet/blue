package p000;

import com.stripe.android.model.Stripe3ds2AuthParams;
import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import kotlin.Metadata;
@Metadata(m28433d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u00012\u00020\u0002J\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H&J\b\u0010\t\u001a\u00020\u0007H&J\b\u0010\u000b\u001a\u00020\nH&J\b\u0010\f\u001a\u00020\u0007H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\rÀ\u0006\u0001"}, m28432d2 = {"LwB5;", "Ljava/io/Closeable;", "Ljava/io/Flushable;", "Li30;", Stripe3ds2AuthParams.FIELD_SOURCE, "", "byteCount", "", "write", "flush", "LJ46;", "timeout", "close", "okio"}, m28431k = 1, m28430mv = {1, 6, 0})
/* renamed from: wB5  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public interface InterfaceC50872wB5 extends Closeable, Flushable {
    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close() throws IOException;

    void flush() throws IOException;

    J46 timeout();

    void write(C42488i30 c42488i30, long j) throws IOException;
}
