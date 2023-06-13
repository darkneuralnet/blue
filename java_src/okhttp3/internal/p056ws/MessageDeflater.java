package okhttp3.internal.p056ws;

import java.io.Closeable;
import java.io.IOException;
import java.util.zip.Deflater;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.p053io.CloseableKt;
import p000.C42488i30;
@Metadata(m28433d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\u0005¢\u0006\u0004\b\u0015\u0010\u0016J\u0014\u0010\u0006\u001a\u00020\u0005*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\u000e\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0002J\b\u0010\n\u001a\u00020\bH\u0016R\u0014\u0010\u000b\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0017"}, m28432d2 = {"Lokhttp3/internal/ws/MessageDeflater;", "Ljava/io/Closeable;", "Li30;", "LM70;", "suffix", "", "endsWith", "buffer", "", "deflate", "close", "noContextTakeover", "Z", "deflatedBytes", "Li30;", "Ljava/util/zip/Deflater;", "deflater", "Ljava/util/zip/Deflater;", "LpZ0;", "deflaterSink", "LpZ0;", "<init>", "(Z)V", "okhttp"}, m28431k = 1, m28430mv = {1, 6, 0})
/* renamed from: okhttp3.internal.ws.MessageDeflater */
/* loaded from: classes8.dex */
public final class MessageDeflater implements Closeable {
    private final C42488i30 deflatedBytes;
    private final Deflater deflater;
    private final C46934pZ0 deflaterSink;
    private final boolean noContextTakeover;

    public MessageDeflater(boolean z) {
        this.noContextTakeover = z;
        C42488i30 c42488i30 = new C42488i30();
        this.deflatedBytes = c42488i30;
        Deflater deflater = new Deflater(-1, true);
        this.deflater = deflater;
        this.deflaterSink = new C46934pZ0((InterfaceC50872wB5) c42488i30, deflater);
    }

    private final boolean endsWith(C42488i30 c42488i30, M70 m70) {
        return c42488i30.mo21933p3(c42488i30.size() - m70.size(), m70);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.deflaterSink.close();
    }

    public final void deflate(C42488i30 buffer) throws IOException {
        boolean z;
        M70 m70;
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        if (this.deflatedBytes.size() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (this.noContextTakeover) {
                this.deflater.reset();
            }
            this.deflaterSink.write(buffer, buffer.size());
            this.deflaterSink.flush();
            C42488i30 c42488i30 = this.deflatedBytes;
            m70 = MessageDeflaterKt.EMPTY_DEFLATE_BLOCK;
            if (endsWith(c42488i30, m70)) {
                long size = this.deflatedBytes.size() - 4;
                C42488i30.C23107a m34577A = C42488i30.m34577A(this.deflatedBytes, null, 1, null);
                try {
                    m34577A.m34536c(size);
                    CloseableKt.closeFinally(m34577A, null);
                } finally {
                }
            } else {
                this.deflatedBytes.mo24534M0(0);
            }
            C42488i30 c42488i302 = this.deflatedBytes;
            buffer.write(c42488i302, c42488i302.size());
            return;
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }
}
