package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import com.stripe.android.core.networking.FileUploadRequest;
import com.stripe.android.stripe3ds2.transactions.MessageExtension;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.channels.SeekableByteChannel;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;
@Metadata(m28433d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\u0010\u0012\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 12\u00020\u0001:\u0002\u0003\u0007B!\u0012\b\u0010*\u001a\u0004\u0018\u00010)\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\u0006\u0010\r\u001a\u00020\n¢\u0006\u0004\b+\u0010,B\u0019\b\u0016\u0012\u0006\u0010*\u001a\u00020-\u0012\u0006\u0010.\u001a\u00020\n¢\u0006\u0004\b+\u0010/B\u001b\b\u0016\u0012\b\u0010*\u001a\u0004\u0018\u00010)\u0012\u0006\u0010.\u001a\u00020\n¢\u0006\u0004\b+\u00100J\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002J\b\u0010\u0005\u001a\u00020\u0004H\u0016R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0014\u0010\r\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\u0011\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0015\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0017\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0014R\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00190\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001e\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\bR\u0016\u0010 \u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010\bR\u001c\u0010$\u001a\b\u0018\u00010!R\u00020\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#R\u0016\u0010(\u001a\u00020%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010'¨\u00062"}, m28432d2 = {"LDO4;", "Ljava/io/Closeable;", "", C17296a.f69688o, "", "close", "", "b", "I", "blockSize", "Ljava/nio/charset/Charset;", "c", "Ljava/nio/charset/Charset;", "encoding", "Ljava/nio/channels/SeekableByteChannel;", DateTokenConverter.CONVERTER_KEY, "Ljava/nio/channels/SeekableByteChannel;", "channel", "", "e", "J", "totalByteLength", "f", "totalBlockCount", "", "", "g", "[[B", "newLineSequences", "h", "avoidNewlineSplitBufferSize", "i", "byteDecrement", "LDO4$b;", "j", "LDO4$b;", "currentFilePart", "", "k", "Z", "trailingNewlineOfFileSkipped", "Ljava/nio/file/Path;", "file", "<init>", "(Ljava/nio/file/Path;ILjava/nio/charset/Charset;)V", "Ljava/io/File;", "charset", "(Ljava/io/File;Ljava/nio/charset/Charset;)V", "(Ljava/nio/file/Path;Ljava/nio/charset/Charset;)V", "l", "shaketoreport_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nReversedLineReader.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReversedLineReader.kt\nco/bird/android/lib/shaketoreport/utils/ReversedLinesFileReader\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,379:1\n1#2:380\n*E\n"})
/* renamed from: DO4 */
/* loaded from: classes3.dex */
public final class DO4 implements Closeable {

    /* renamed from: l */
    public static final C1452a f5573l = new C1452a(null);

    /* renamed from: b */
    public final int f5574b;

    /* renamed from: c */
    public final Charset f5575c;

    /* renamed from: d */
    public final SeekableByteChannel f5576d;

    /* renamed from: e */
    public final long f5577e;

    /* renamed from: f */
    public long f5578f;

    /* renamed from: g */
    public final byte[][] f5579g;

    /* renamed from: h */
    public final int f5580h;

    /* renamed from: i */
    public int f5581i;

    /* renamed from: j */
    public C1453b f5582j;

    /* renamed from: k */
    public boolean f5583k;

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\n"}, m28432d2 = {"LDO4$a;", "", "", "DEFAULT_BLOCK_SIZE", "I", "", "EMPTY_STRING", "Ljava/lang/String;", "<init>", "()V", "shaketoreport_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: DO4$a */
    /* loaded from: classes3.dex */
    public static final class C1452a {
        public /* synthetic */ C1452a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C1452a() {
        }
    }

    @Metadata(m28433d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u000b\b\u0082\u0004\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u000f\u001a\u00020\r\u0012\u0006\u0010\u0014\u001a\u00020\n\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0016\u0010\u0017J\f\u0010\u0003\u001a\b\u0018\u00010\u0000R\u00020\u0002J\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004J\b\u0010\u0007\u001a\u00020\u0006H\u0002J\u0018\u0010\f\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0002R\u0014\u0010\u000f\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u000eR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0010R\u0018\u0010\u0011\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u0010R\u0016\u0010\u0013\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0003\u0010\u0012¨\u0006\u0018"}, m28432d2 = {"LDO4$b;", "", "LDO4;", DateTokenConverter.CONVERTER_KEY, "", "c", "", C17296a.f69688o, "", MessageExtension.FIELD_DATA, "", "i", "b", "", "J", "no", "[B", "leftOver", "I", "currentLastBytePos", "length", "leftOverOfLastFilePart", "<init>", "(LDO4;JI[B)V", "shaketoreport_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nReversedLineReader.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReversedLineReader.kt\nco/bird/android/lib/shaketoreport/utils/ReversedLinesFileReader$FilePart\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,379:1\n1#2:380\n*E\n"})
    /* renamed from: DO4$b */
    /* loaded from: classes3.dex */
    public final class C1453b {

        /* renamed from: a */
        public final long f5584a;

        /* renamed from: b */
        public final byte[] f5585b;

        /* renamed from: c */
        public byte[] f5586c;

        /* renamed from: d */
        public int f5587d;

        public C1453b(long j, int i, byte[] bArr) {
            int i2;
            boolean z;
            this.f5584a = j;
            if (bArr != null) {
                i2 = bArr.length;
            } else {
                i2 = 0;
            }
            byte[] bArr2 = new byte[i2 + i];
            this.f5585b = bArr2;
            long j2 = (j - 1) * DO4.this.f5574b;
            if (j > 0) {
                DO4.this.f5576d.position(j2);
                if (DO4.this.f5576d.read(ByteBuffer.wrap(bArr2, 0, i)) == i) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    throw new IllegalStateException("Count of requested bytes and actually read bytes don't match".toString());
                }
            }
            if (bArr != null) {
                System.arraycopy(bArr, 0, bArr2, i, bArr.length);
            }
            this.f5587d = bArr2.length - 1;
            this.f5586c = null;
        }

        /* renamed from: a */
        public final void m110550a() {
            int i = this.f5587d + 1;
            if (i > 0) {
                byte[] bArr = new byte[i];
                this.f5586c = bArr;
                System.arraycopy(this.f5585b, 0, bArr, 0, i);
            } else {
                this.f5586c = null;
            }
            this.f5587d = -1;
        }

        /* renamed from: b */
        public final int m110549b(byte[] bArr, int i) {
            byte[][] bArr2;
            boolean z;
            for (byte[] bArr3 : DO4.this.f5579g) {
                int length = bArr3.length - 1;
                boolean z2 = true;
                if (length >= 0) {
                    boolean z3 = true;
                    while (true) {
                        int i2 = length - 1;
                        int length2 = (i + length) - (bArr3.length - 1);
                        if (length2 >= 0 && bArr[length2] == bArr3[length]) {
                            z = true;
                        } else {
                            z = false;
                        }
                        z3 &= z;
                        if (i2 < 0) {
                            break;
                        }
                        length = i2;
                    }
                    z2 = z3;
                }
                if (z2) {
                    return bArr3.length;
                }
            }
            return 0;
        }

        /* renamed from: c */
        public final String m110548c() throws IOException {
            boolean z;
            String str;
            byte[] bArr;
            boolean z2 = true;
            if (this.f5584a == 1) {
                z = true;
            } else {
                z = false;
            }
            int i = this.f5587d;
            while (true) {
                if (i > -1) {
                    if (!z && i < DO4.this.f5580h) {
                        m110550a();
                        break;
                    }
                    int m110549b = m110549b(this.f5585b, i);
                    if (m110549b > 0) {
                        int i2 = i + 1;
                        int i3 = (this.f5587d - i2) + 1;
                        if (i3 < 0) {
                            z2 = false;
                        }
                        if (z2) {
                            byte[] bArr2 = new byte[i3];
                            System.arraycopy(this.f5585b, i2, bArr2, 0, i3);
                            str = new String(bArr2, DO4.this.f5575c);
                            this.f5587d = i - m110549b;
                        } else {
                            throw new IllegalStateException(("Unexpected negative line length=" + i3).toString());
                        }
                    } else {
                        i -= DO4.this.f5581i;
                        if (i < 0) {
                            m110550a();
                            break;
                        }
                    }
                } else {
                    break;
                }
            }
            str = null;
            if (z && (bArr = this.f5586c) != null) {
                Intrinsics.checkNotNull(bArr);
                String str2 = new String(bArr, DO4.this.f5575c);
                this.f5586c = null;
                return str2;
            }
            return str;
        }

        /* renamed from: d */
        public final C1453b m110547d() throws IOException {
            boolean z;
            int i = this.f5587d;
            boolean z2 = true;
            if (i <= -1) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                long j = this.f5584a;
                if (j > 1) {
                    DO4 do4 = DO4.this;
                    return new C1453b(j - 1, do4.f5574b, this.f5586c);
                }
                byte[] bArr = this.f5586c;
                if (bArr != null) {
                    z2 = false;
                }
                DO4 do42 = DO4.this;
                if (z2) {
                    return null;
                }
                Intrinsics.checkNotNull(bArr);
                throw new IllegalStateException(("Unexpected leftover of the last block: leftOverOfThisFilePart=" + new String(bArr, do42.f5575c)).toString());
            }
            throw new IllegalStateException(("Current currentLastCharPos unexpectedly positive... last readLine() should have returned something! currentLastCharPos=" + i).toString());
        }
    }

    public DO4(Path path, int i, Charset encoding) {
        int i2;
        StandardOpenOption standardOpenOption;
        SeekableByteChannel newByteChannel;
        int i3;
        Intrinsics.checkNotNullParameter(encoding, "encoding");
        this.f5574b = i;
        this.f5575c = encoding;
        if ((encoding.newEncoder().maxBytesPerChar() == 1.0f) || encoding == StandardCharsets.UTF_8 || encoding == Charset.forName("Shift_JIS") || encoding == Charset.forName("windows-31j") || encoding == Charset.forName("x-windows-949") || encoding == Charset.forName("gbk") || encoding == Charset.forName("x-windows-950")) {
            i2 = 1;
        } else if (encoding != StandardCharsets.UTF_16BE && encoding != StandardCharsets.UTF_16LE) {
            if (encoding == StandardCharsets.UTF_16) {
                throw new UnsupportedEncodingException("For UTF-16, you need to specify the byte order (use UTF-16BE or UTF-16LE)");
            }
            throw new UnsupportedEncodingException("Encoding " + encoding + " is not supported yet (feel free to submit a patch)");
        } else {
            i2 = 2;
        }
        this.f5581i = i2;
        byte[] bytes = FileUploadRequest.LINE_BREAK.getBytes(encoding);
        Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
        byte[] bytes2 = "\n".getBytes(encoding);
        Intrinsics.checkNotNullExpressionValue(bytes2, "this as java.lang.String).getBytes(charset)");
        byte[] bytes3 = "\r".getBytes(encoding);
        Intrinsics.checkNotNullExpressionValue(bytes3, "this as java.lang.String).getBytes(charset)");
        byte[][] bArr = {bytes, bytes2, bytes3};
        this.f5579g = bArr;
        this.f5580h = bArr[0].length;
        standardOpenOption = StandardOpenOption.READ;
        newByteChannel = Files.newByteChannel(path, standardOpenOption);
        Intrinsics.checkNotNullExpressionValue(newByteChannel, "newByteChannel(file, StandardOpenOption.READ)");
        this.f5576d = newByteChannel;
        long size = newByteChannel.size();
        this.f5577e = size;
        int i4 = (int) (size % i);
        if (i4 > 0) {
            this.f5578f = (size / i) + 1;
        } else {
            this.f5578f = size / i;
            if (size > 0) {
                i3 = i;
                this.f5582j = new C1453b(this.f5578f, i3, null);
            }
        }
        i3 = i4;
        this.f5582j = new C1453b(this.f5578f, i3, null);
    }

    /* renamed from: a */
    public final String m110551a() throws IOException {
        String trimEnd;
        boolean isBlank;
        C1453b c1453b = this.f5582j;
        Intrinsics.checkNotNull(c1453b);
        String m110548c = c1453b.m110548c();
        while (m110548c == null) {
            C1453b c1453b2 = this.f5582j;
            Intrinsics.checkNotNull(c1453b2);
            C1453b m110547d = c1453b2.m110547d();
            this.f5582j = m110547d;
            if (m110547d == null) {
                break;
            }
            Intrinsics.checkNotNull(m110547d);
            m110548c = m110547d.m110548c();
        }
        if (Intrinsics.areEqual("", m110548c) && !this.f5583k) {
            this.f5583k = true;
            m110548c = m110551a();
        }
        if (m110548c == null) {
            return null;
        }
        char[] charArray = "\u0000".toCharArray();
        Intrinsics.checkNotNullExpressionValue(charArray, "this as java.lang.String).toCharArray()");
        trimEnd = StringsKt__StringsKt.trimEnd(m110548c, Arrays.copyOf(charArray, charArray.length));
        if (trimEnd == null) {
            return null;
        }
        isBlank = StringsKt__StringsJVMKt.isBlank(trimEnd);
        if (!(true ^ isBlank)) {
            return null;
        }
        return trimEnd;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f5576d.close();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public DO4(File file, Charset charset) {
        this(r2, charset);
        Path path;
        Intrinsics.checkNotNullParameter(file, "file");
        Intrinsics.checkNotNullParameter(charset, "charset");
        path = file.toPath();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DO4(Path path, Charset charset) {
        this(path, 8192, charset);
        Intrinsics.checkNotNullParameter(charset, "charset");
    }
}
