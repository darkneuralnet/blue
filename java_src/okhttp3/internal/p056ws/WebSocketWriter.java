package okhttp3.internal.p056ws;

import com.stripe.android.model.PaymentMethodOptionsParams;
import com.stripe.android.stripe3ds2.transactions.MessageExtension;
import java.io.Closeable;
import java.io.IOException;
import java.util.Random;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p000.C42488i30;
@Metadata(m28433d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\u0006\u0010\u001e\u001a\u00020\u0011\u0012\u0006\u0010\u001f\u001a\u00020\u0011\u0012\u0006\u0010!\u001a\u00020 ¢\u0006\u0004\b1\u00102J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u000e\u0010\b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004J\u000e\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004J\u0018\u0010\f\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\u0004J\u0016\u0010\u000f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u0004J\b\u0010\u0010\u001a\u00020\u0006H\u0016R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0015\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u001a\u001a\u00020\u00198\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001e\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0013R\u0014\u0010\u001f\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u0013R\u0014\u0010!\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010$\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010&\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010%R\u0016\u0010'\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010\u0013R\u0018\u0010)\u001a\u0004\u0018\u00010(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*R\u0016\u0010,\u001a\u0004\u0018\u00010+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0016\u0010/\u001a\u0004\u0018\u00010.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100¨\u00063"}, m28432d2 = {"Lokhttp3/internal/ws/WebSocketWriter;", "Ljava/io/Closeable;", "", "opcode", "LM70;", "payload", "", "writeControlFrame", "writePing", "writePong", PaymentMethodOptionsParams.Blik.PARAM_CODE, "reason", "writeClose", "formatOpcode", MessageExtension.FIELD_DATA, "writeMessageFrame", "close", "", "isClient", "Z", "Ln30;", "sink", "Ln30;", "getSink", "()Ln30;", "Ljava/util/Random;", "random", "Ljava/util/Random;", "getRandom", "()Ljava/util/Random;", "perMessageDeflate", "noContextTakeover", "", "minimumDeflateSize", "J", "Li30;", "messageBuffer", "Li30;", "sinkBuffer", "writerClosed", "Lokhttp3/internal/ws/MessageDeflater;", "messageDeflater", "Lokhttp3/internal/ws/MessageDeflater;", "", "maskKey", "[B", "Li30$a;", "maskCursor", "Li30$a;", "<init>", "(ZLn30;Ljava/util/Random;ZZJ)V", "okhttp"}, m28431k = 1, m28430mv = {1, 6, 0})
/* renamed from: okhttp3.internal.ws.WebSocketWriter */
/* loaded from: classes8.dex */
public final class WebSocketWriter implements Closeable {
    private final boolean isClient;
    private final C42488i30.C23107a maskCursor;
    private final byte[] maskKey;
    private final C42488i30 messageBuffer;
    private MessageDeflater messageDeflater;
    private final long minimumDeflateSize;
    private final boolean noContextTakeover;
    private final boolean perMessageDeflate;
    private final Random random;
    private final InterfaceC45453n30 sink;
    private final C42488i30 sinkBuffer;
    private boolean writerClosed;

    public WebSocketWriter(boolean z, InterfaceC45453n30 sink, Random random, boolean z2, boolean z3, long j) {
        byte[] bArr;
        Intrinsics.checkNotNullParameter(sink, "sink");
        Intrinsics.checkNotNullParameter(random, "random");
        this.isClient = z;
        this.sink = sink;
        this.random = random;
        this.perMessageDeflate = z2;
        this.noContextTakeover = z3;
        this.minimumDeflateSize = j;
        this.messageBuffer = new C42488i30();
        this.sinkBuffer = sink.mo24529e();
        if (z) {
            bArr = new byte[4];
        } else {
            bArr = null;
        }
        this.maskKey = bArr;
        this.maskCursor = z ? new C42488i30.C23107a() : null;
    }

    private final void writeControlFrame(int i, M70 m70) throws IOException {
        boolean z;
        if (!this.writerClosed) {
            int size = m70.size();
            if (size <= 125) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                this.sinkBuffer.mo24534M0(i | 128);
                if (this.isClient) {
                    this.sinkBuffer.mo24534M0(size | 128);
                    Random random = this.random;
                    byte[] bArr = this.maskKey;
                    Intrinsics.checkNotNull(bArr);
                    random.nextBytes(bArr);
                    this.sinkBuffer.mo24524s0(this.maskKey);
                    if (size > 0) {
                        long size2 = this.sinkBuffer.size();
                        this.sinkBuffer.mo24528e0(m70);
                        C42488i30 c42488i30 = this.sinkBuffer;
                        C42488i30.C23107a c23107a = this.maskCursor;
                        Intrinsics.checkNotNull(c23107a);
                        c42488i30.m34539z(c23107a);
                        this.maskCursor.m34535d(size2);
                        WebSocketProtocol.INSTANCE.toggleMask(this.maskCursor, this.maskKey);
                        this.maskCursor.close();
                    }
                } else {
                    this.sinkBuffer.mo24534M0(size);
                    this.sinkBuffer.mo24528e0(m70);
                }
                this.sink.flush();
                return;
            }
            throw new IllegalArgumentException("Payload size must be less than or equal to 125".toString());
        }
        throw new IOException("closed");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        MessageDeflater messageDeflater = this.messageDeflater;
        if (messageDeflater == null) {
            return;
        }
        messageDeflater.close();
    }

    public final Random getRandom() {
        return this.random;
    }

    public final InterfaceC45453n30 getSink() {
        return this.sink;
    }

    public final void writeClose(int i, M70 m70) throws IOException {
        M70 m702 = M70.f22645f;
        if (i != 0 || m70 != null) {
            if (i != 0) {
                WebSocketProtocol.INSTANCE.validateCloseCode(i);
            }
            C42488i30 c42488i30 = new C42488i30();
            c42488i30.mo24536G2(i);
            if (m70 != null) {
                c42488i30.mo24528e0(m70);
            }
            m702 = c42488i30.mo21936h1();
        }
        try {
            writeControlFrame(8, m702);
        } finally {
            this.writerClosed = true;
        }
    }

    public final void writeMessageFrame(int i, M70 data) throws IOException {
        Intrinsics.checkNotNullParameter(data, "data");
        if (!this.writerClosed) {
            this.messageBuffer.mo24528e0(data);
            int i2 = 128;
            int i3 = i | 128;
            if (this.perMessageDeflate && data.size() >= this.minimumDeflateSize) {
                MessageDeflater messageDeflater = this.messageDeflater;
                if (messageDeflater == null) {
                    messageDeflater = new MessageDeflater(this.noContextTakeover);
                    this.messageDeflater = messageDeflater;
                }
                messageDeflater.deflate(this.messageBuffer);
                i3 |= 64;
            }
            long size = this.messageBuffer.size();
            this.sinkBuffer.mo24534M0(i3);
            if (!this.isClient) {
                i2 = 0;
            }
            if (size <= 125) {
                this.sinkBuffer.mo24534M0(((int) size) | i2);
            } else if (size <= WebSocketProtocol.PAYLOAD_SHORT_MAX) {
                this.sinkBuffer.mo24534M0(i2 | 126);
                this.sinkBuffer.mo24536G2((int) size);
            } else {
                this.sinkBuffer.mo24534M0(i2 | 127);
                this.sinkBuffer.m34554k0(size);
            }
            if (this.isClient) {
                Random random = this.random;
                byte[] bArr = this.maskKey;
                Intrinsics.checkNotNull(bArr);
                random.nextBytes(bArr);
                this.sinkBuffer.mo24524s0(this.maskKey);
                if (size > 0) {
                    C42488i30 c42488i30 = this.messageBuffer;
                    C42488i30.C23107a c23107a = this.maskCursor;
                    Intrinsics.checkNotNull(c23107a);
                    c42488i30.m34539z(c23107a);
                    this.maskCursor.m34535d(0L);
                    WebSocketProtocol.INSTANCE.toggleMask(this.maskCursor, this.maskKey);
                    this.maskCursor.close();
                }
            }
            this.sinkBuffer.write(this.messageBuffer, size);
            this.sink.mo24535H1();
            return;
        }
        throw new IOException("closed");
    }

    public final void writePing(M70 payload) throws IOException {
        Intrinsics.checkNotNullParameter(payload, "payload");
        writeControlFrame(9, payload);
    }

    public final void writePong(M70 payload) throws IOException {
        Intrinsics.checkNotNullParameter(payload, "payload");
        writeControlFrame(10, payload);
    }
}
