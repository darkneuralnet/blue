package p000;

import java.io.IOException;
import java.io.InputStream;
import java.nio.channels.ReadableByteChannel;
import java.nio.charset.Charset;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
@Metadata(m28433d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0005\n\u0000\n\u0002\u0010\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u00012\u00020\u0002J\b\u0010\u0004\u001a\u00020\u0003H'J\b\u0010\u0006\u001a\u00020\u0005H&J\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H&J\u0010\u0010\u000b\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H&J\b\u0010\r\u001a\u00020\fH&J\b\u0010\u000f\u001a\u00020\u000eH&J\b\u0010\u0011\u001a\u00020\u0010H&J\b\u0010\u0012\u001a\u00020\u0007H&J\b\u0010\u0013\u001a\u00020\u0007H&J\b\u0010\u0014\u001a\u00020\u0007H&J\u0010\u0010\u0015\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H&J\b\u0010\u0017\u001a\u00020\u0016H&J\u0010\u0010\u0018\u001a\u00020\u00162\u0006\u0010\b\u001a\u00020\u0007H&J\u0010\u0010\u001b\u001a\u00020\u00102\u0006\u0010\u001a\u001a\u00020\u0019H&J\b\u0010\u001d\u001a\u00020\u001cH&J\u0010\u0010\u001e\u001a\u00020\u001c2\u0006\u0010\b\u001a\u00020\u0007H&J\u0010\u0010 \u001a\u00020\t2\u0006\u0010\u001f\u001a\u00020\u001cH&J\u0018\u0010!\u001a\u00020\t2\u0006\u0010\u001f\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0007H&J\u0010\u0010#\u001a\u00020\u00072\u0006\u0010\u001f\u001a\u00020\"H&J\b\u0010%\u001a\u00020$H&J\b\u0010&\u001a\u00020$H&J\u0010\u0010(\u001a\u00020$2\u0006\u0010'\u001a\u00020\u0007H&J\u0010\u0010+\u001a\u00020$2\u0006\u0010*\u001a\u00020)H&J\u0010\u0010-\u001a\u00020\u00072\u0006\u0010,\u001a\u00020\u0016H&J\u0010\u0010/\u001a\u00020\u00072\u0006\u0010.\u001a\u00020\u0016H&J\u0018\u00101\u001a\u00020\u00052\u0006\u00100\u001a\u00020\u00072\u0006\u0010,\u001a\u00020\u0016H&J\b\u00102\u001a\u00020\u0000H&J\b\u00104\u001a\u000203H&R\u0014\u00107\u001a\u00020\u00038&X¦\u0004¢\u0006\u0006\u001a\u0004\b5\u00106ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u00068À\u0006\u0001"}, m28432d2 = {"Lo30;", "LAN5;", "Ljava/nio/channels/ReadableByteChannel;", "Li30;", "F1", "", "O2", "", "byteCount", "", "x2", "o", "", "readByte", "", "readShort", "", "readInt", "readLong", "S2", "B1", "skip", "LM70;", "h1", "F0", "Lry3;", "options", "Q2", "", "L0", "r2", "sink", "readFully", "d0", "LwB5;", "Z2", "", "r1", "o2", "limit", "V1", "Ljava/nio/charset/Charset;", "charset", "e1", "bytes", "e2", "targetBytes", "x1", "offset", "p3", "peek", "Ljava/io/InputStream;", "w3", "e", "()Li30;", "buffer", "okio"}, m28431k = 1, m28430mv = {1, 6, 0})
/* renamed from: o30  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public interface InterfaceC46046o30 extends AN5, ReadableByteChannel {
    /* renamed from: B1 */
    long mo21949B1() throws IOException;

    /* renamed from: F0 */
    M70 mo21948F0(long j) throws IOException;

    @Deprecated(level = DeprecationLevel.WARNING, message = "moved to val: use getBuffer() instead", replaceWith = @ReplaceWith(expression = "buffer", imports = {}))
    /* renamed from: F1 */
    C42488i30 mo21947F1();

    /* renamed from: L0 */
    byte[] mo21946L0() throws IOException;

    /* renamed from: O2 */
    boolean mo21945O2() throws IOException;

    /* renamed from: Q2 */
    int mo21944Q2(C48371ry3 c48371ry3) throws IOException;

    /* renamed from: S2 */
    long mo21943S2() throws IOException;

    /* renamed from: V1 */
    String mo21942V1(long j) throws IOException;

    /* renamed from: Z2 */
    long mo21941Z2(InterfaceC50872wB5 interfaceC50872wB5) throws IOException;

    /* renamed from: d0 */
    void mo21940d0(C42488i30 c42488i30, long j) throws IOException;

    /* renamed from: e */
    C42488i30 mo21939e();

    /* renamed from: e1 */
    String mo21938e1(Charset charset) throws IOException;

    /* renamed from: e2 */
    long mo21937e2(M70 m70) throws IOException;

    /* renamed from: h1 */
    M70 mo21936h1() throws IOException;

    /* renamed from: o */
    boolean mo21935o(long j) throws IOException;

    /* renamed from: o2 */
    String mo21934o2() throws IOException;

    /* renamed from: p3 */
    boolean mo21933p3(long j, M70 m70) throws IOException;

    InterfaceC46046o30 peek();

    /* renamed from: r1 */
    String mo21932r1() throws IOException;

    /* renamed from: r2 */
    byte[] mo21931r2(long j) throws IOException;

    byte readByte() throws IOException;

    void readFully(byte[] bArr) throws IOException;

    int readInt() throws IOException;

    long readLong() throws IOException;

    short readShort() throws IOException;

    void skip(long j) throws IOException;

    /* renamed from: w3 */
    InputStream mo21930w3();

    /* renamed from: x1 */
    long mo21929x1(M70 m70) throws IOException;

    /* renamed from: x2 */
    void mo21928x2(long j) throws IOException;
}
