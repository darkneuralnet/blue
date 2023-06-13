package okhttp3.internal.p056ws;

import java.io.Closeable;
import java.io.IOException;
import java.util.zip.Inflater;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.LongCompanionObject;
import okhttp3.internal.http2.Settings;
@Metadata(m28433d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\b\u0010\u0006\u001a\u00020\u0004H\u0016R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0014"}, m28432d2 = {"Lokhttp3/internal/ws/MessageInflater;", "Ljava/io/Closeable;", "Li30;", "buffer", "", "inflate", "close", "", "noContextTakeover", "Z", "deflatedBytes", "Li30;", "Ljava/util/zip/Inflater;", "inflater", "Ljava/util/zip/Inflater;", "LN12;", "inflaterSource", "LN12;", "<init>", "(Z)V", "okhttp"}, m28431k = 1, m28430mv = {1, 6, 0})
/* renamed from: okhttp3.internal.ws.MessageInflater */
/* loaded from: classes8.dex */
public final class MessageInflater implements Closeable {
    private final C42488i30 deflatedBytes;
    private final Inflater inflater;
    private final N12 inflaterSource;
    private final boolean noContextTakeover;

    public MessageInflater(boolean z) {
        this.noContextTakeover = z;
        C42488i30 c42488i30 = new C42488i30();
        this.deflatedBytes = c42488i30;
        Inflater inflater = new Inflater(true);
        this.inflater = inflater;
        this.inflaterSource = new N12((AN5) c42488i30, inflater);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.inflaterSource.close();
    }

    public final void inflate(C42488i30 buffer) throws IOException {
        boolean z;
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        if (this.deflatedBytes.size() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (this.noContextTakeover) {
                this.inflater.reset();
            }
            this.deflatedBytes.mo24532R2(buffer);
            this.deflatedBytes.mo24533N(Settings.DEFAULT_INITIAL_WINDOW_SIZE);
            long bytesRead = this.inflater.getBytesRead() + this.deflatedBytes.size();
            do {
                this.inflaterSource.m94454a(buffer, LongCompanionObject.MAX_VALUE);
            } while (this.inflater.getBytesRead() < bytesRead);
            return;
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }
}
