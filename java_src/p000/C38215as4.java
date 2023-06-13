package p000;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.FileAppender;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.stripe.android.model.Stripe3ds2AuthParams;
import com.stripe.android.stripe3ds2.transactions.MessageExtension;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010/\u001a\u00020-¢\u0006\u0004\b;\u0010<J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\n\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\bH\u0016J\u0010\u0010\r\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\u000bH\u0016J \u0010\u0011\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000eH\u0016J\u0010\u0010\u0013\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0012H\u0016J \u0010\u0015\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u000eH\u0016J\u0010\u0010\u0007\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u0016H\u0016J\u0010\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0017H\u0016J\u0010\u0010\u001a\u001a\u00020\u00012\u0006\u0010\u0019\u001a\u00020\u000eH\u0016J\u0010\u0010\u001c\u001a\u00020\u00012\u0006\u0010\u001b\u001a\u00020\u000eH\u0016J\u0010\u0010\u001e\u001a\u00020\u00012\u0006\u0010\u001d\u001a\u00020\u000eH\u0016J\u0010\u0010 \u001a\u00020\u00012\u0006\u0010\u001f\u001a\u00020\u0004H\u0016J\u0010\u0010!\u001a\u00020\u00012\u0006\u0010\u001f\u001a\u00020\u0004H\u0016J\b\u0010\"\u001a\u00020\u0001H\u0016J\b\u0010#\u001a\u00020\u0001H\u0016J\b\u0010%\u001a\u00020$H\u0016J\b\u0010&\u001a\u00020\u0006H\u0016J\b\u0010(\u001a\u00020'H\u0016J\b\u0010)\u001a\u00020\u0006H\u0016J\b\u0010+\u001a\u00020*H\u0016J\b\u0010,\u001a\u00020\u000bH\u0016R\u0014\u0010/\u001a\u00020-8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010.R\u0014\u00102\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0016\u00105\u001a\u00020'8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b3\u00104R\u001b\u0010:\u001a\u00020\u00028Ö\u0002X\u0096\u0004¢\u0006\f\u0012\u0004\b8\u00109\u001a\u0004\b6\u00107¨\u0006="}, m28432d2 = {"Las4;", "Ln30;", "Li30;", Stripe3ds2AuthParams.FIELD_SOURCE, "", "byteCount", "", "write", "LM70;", "byteString", "e0", "", "string", "a2", "", "beginIndex", "endIndex", "g0", "", "s0", "offset", "f1", "Ljava/nio/ByteBuffer;", "LAN5;", "R2", "b", "M0", "s", "G2", "i", "N", "v", "x0", "g1", "T1", "H1", "Ljava/io/OutputStream;", "u3", "flush", "", "isOpen", "close", "LJ46;", "timeout", "toString", "LwB5;", "LwB5;", "sink", "c", "Li30;", "bufferField", DateTokenConverter.CONVERTER_KEY, "Z", "closed", "e", "()Li30;", "getBuffer$annotations", "()V", "buffer", "<init>", "(LwB5;)V", "okio"}, m28431k = 1, m28430mv = {1, 6, 0})
/* renamed from: as4  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C38215as4 implements InterfaceC45453n30 {
    @JvmField

    /* renamed from: b */
    public final InterfaceC50872wB5 f56448b;
    @JvmField

    /* renamed from: c */
    public final C42488i30 f56449c;
    @JvmField

    /* renamed from: d */
    public boolean f56450d;

    public C38215as4(InterfaceC50872wB5 sink) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        this.f56448b = sink;
        this.f56449c = new C42488i30();
    }

    @Override // p000.InterfaceC45453n30
    /* renamed from: G2 */
    public InterfaceC45453n30 mo24536G2(int i) {
        if (!this.f56450d) {
            this.f56449c.mo24536G2(i);
            return mo24531T1();
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // p000.InterfaceC45453n30
    /* renamed from: H1 */
    public InterfaceC45453n30 mo24535H1() {
        if (!this.f56450d) {
            long size = this.f56449c.size();
            if (size > 0) {
                this.f56448b.write(this.f56449c, size);
            }
            return this;
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // p000.InterfaceC45453n30
    /* renamed from: M0 */
    public InterfaceC45453n30 mo24534M0(int i) {
        if (!this.f56450d) {
            this.f56449c.mo24534M0(i);
            return mo24531T1();
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // p000.InterfaceC45453n30
    /* renamed from: N */
    public InterfaceC45453n30 mo24533N(int i) {
        if (!this.f56450d) {
            this.f56449c.mo24533N(i);
            return mo24531T1();
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // p000.InterfaceC45453n30
    /* renamed from: R2 */
    public long mo24532R2(AN5 source) {
        Intrinsics.checkNotNullParameter(source, "source");
        long j = 0;
        while (true) {
            long read = source.read(this.f56449c, FileAppender.DEFAULT_BUFFER_SIZE);
            if (read != -1) {
                j += read;
                mo24531T1();
            } else {
                return j;
            }
        }
    }

    @Override // p000.InterfaceC45453n30
    /* renamed from: T1 */
    public InterfaceC45453n30 mo24531T1() {
        if (!this.f56450d) {
            long m34558g = this.f56449c.m34558g();
            if (m34558g > 0) {
                this.f56448b.write(this.f56449c, m34558g);
            }
            return this;
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // p000.InterfaceC45453n30
    /* renamed from: a2 */
    public InterfaceC45453n30 mo24530a2(String string) {
        Intrinsics.checkNotNullParameter(string, "string");
        if (!this.f56450d) {
            this.f56449c.mo24530a2(string);
            return mo24531T1();
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // p000.InterfaceC50872wB5, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (!this.f56450d) {
            try {
                if (this.f56449c.size() > 0) {
                    InterfaceC50872wB5 interfaceC50872wB5 = this.f56448b;
                    C42488i30 c42488i30 = this.f56449c;
                    interfaceC50872wB5.write(c42488i30, c42488i30.size());
                }
                th = null;
            } catch (Throwable th) {
                th = th;
            }
            try {
                this.f56448b.close();
            } catch (Throwable th2) {
                if (th == null) {
                    th = th2;
                }
            }
            this.f56450d = true;
            if (th != null) {
                throw th;
            }
        }
    }

    @Override // p000.InterfaceC45453n30
    /* renamed from: e */
    public C42488i30 mo24529e() {
        return this.f56449c;
    }

    @Override // p000.InterfaceC45453n30
    /* renamed from: e0 */
    public InterfaceC45453n30 mo24528e0(M70 byteString) {
        Intrinsics.checkNotNullParameter(byteString, "byteString");
        if (!this.f56450d) {
            this.f56449c.mo24528e0(byteString);
            return mo24531T1();
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // p000.InterfaceC45453n30
    /* renamed from: f1 */
    public InterfaceC45453n30 mo24527f1(byte[] source, int i, int i2) {
        Intrinsics.checkNotNullParameter(source, "source");
        if (!this.f56450d) {
            this.f56449c.mo24527f1(source, i, i2);
            return mo24531T1();
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // p000.InterfaceC45453n30, p000.InterfaceC50872wB5, java.io.Flushable
    public void flush() {
        if (!this.f56450d) {
            if (this.f56449c.size() > 0) {
                InterfaceC50872wB5 interfaceC50872wB5 = this.f56448b;
                C42488i30 c42488i30 = this.f56449c;
                interfaceC50872wB5.write(c42488i30, c42488i30.size());
            }
            this.f56448b.flush();
            return;
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // p000.InterfaceC45453n30
    /* renamed from: g0 */
    public InterfaceC45453n30 mo24526g0(String string, int i, int i2) {
        Intrinsics.checkNotNullParameter(string, "string");
        if (!this.f56450d) {
            this.f56449c.mo24526g0(string, i, i2);
            return mo24531T1();
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // p000.InterfaceC45453n30
    /* renamed from: g1 */
    public InterfaceC45453n30 mo24525g1(long j) {
        if (!this.f56450d) {
            this.f56449c.mo24525g1(j);
            return mo24531T1();
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return !this.f56450d;
    }

    @Override // p000.InterfaceC45453n30
    /* renamed from: s0 */
    public InterfaceC45453n30 mo24524s0(byte[] source) {
        Intrinsics.checkNotNullParameter(source, "source");
        if (!this.f56450d) {
            this.f56449c.mo24524s0(source);
            return mo24531T1();
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // p000.InterfaceC50872wB5
    public J46 timeout() {
        return this.f56448b.timeout();
    }

    public String toString() {
        return "buffer(" + this.f56448b + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    @Override // p000.InterfaceC45453n30
    /* renamed from: u3 */
    public OutputStream mo24523u3() {
        return new C12185a();
    }

    @Override // java.nio.channels.WritableByteChannel
    public int write(ByteBuffer source) {
        Intrinsics.checkNotNullParameter(source, "source");
        if (!this.f56450d) {
            int write = this.f56449c.write(source);
            mo24531T1();
            return write;
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // p000.InterfaceC45453n30
    /* renamed from: x0 */
    public InterfaceC45453n30 mo24522x0(long j) {
        if (!this.f56450d) {
            this.f56449c.mo24522x0(j);
            return mo24531T1();
        }
        throw new IllegalStateException("closed".toString());
    }

    @Metadata(m28433d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J \u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0002H\u0016J\b\u0010\n\u001a\u00020\u0004H\u0016J\b\u0010\u000b\u001a\u00020\u0004H\u0016J\b\u0010\r\u001a\u00020\fH\u0016¨\u0006\u000e"}, m28432d2 = {"as4$a", "Ljava/io/OutputStream;", "", "b", "", "write", "", MessageExtension.FIELD_DATA, "offset", "byteCount", "flush", "close", "", "toString", "okio"}, m28431k = 1, m28430mv = {1, 6, 0})
    /* renamed from: as4$a */
    /* loaded from: classes8.dex */
    public static final class C12185a extends OutputStream {
        public C12185a() {
        }

        @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            C38215as4.this.close();
        }

        @Override // java.io.OutputStream, java.io.Flushable
        public void flush() {
            C38215as4 c38215as4 = C38215as4.this;
            if (!c38215as4.f56450d) {
                c38215as4.flush();
            }
        }

        public String toString() {
            return C38215as4.this + ".outputStream()";
        }

        @Override // java.io.OutputStream
        public void write(int i) {
            C38215as4 c38215as4 = C38215as4.this;
            if (!c38215as4.f56450d) {
                c38215as4.f56449c.mo24534M0((byte) i);
                C38215as4.this.mo24531T1();
                return;
            }
            throw new IOException("closed");
        }

        @Override // java.io.OutputStream
        public void write(byte[] data, int i, int i2) {
            Intrinsics.checkNotNullParameter(data, "data");
            C38215as4 c38215as4 = C38215as4.this;
            if (!c38215as4.f56450d) {
                c38215as4.f56449c.mo24527f1(data, i, i2);
                C38215as4.this.mo24531T1();
                return;
            }
            throw new IOException("closed");
        }
    }

    @Override // p000.InterfaceC50872wB5
    public void write(C42488i30 source, long j) {
        Intrinsics.checkNotNullParameter(source, "source");
        if (!this.f56450d) {
            this.f56449c.write(source, j);
            mo24531T1();
            return;
        }
        throw new IllegalStateException("closed".toString());
    }
}
