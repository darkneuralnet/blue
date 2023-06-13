package p000;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.FileAppender;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.spi.AbstractComponentTracker;
import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import com.stripe.android.model.Stripe3ds2AuthParams;
import com.stripe.android.model.Stripe3ds2AuthResult;
import com.stripe.android.stripe3ds2.transactions.MessageExtension;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;
import kotlin.KotlinVersion;
import kotlin.Metadata;
import kotlin.UByte;
import kotlin.collections.ArraysKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmName;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.ByteCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.LongCompanionObject;
import kotlin.text.Charsets;
import kotlin.text.Typography;
import no.nordicsemi.android.ble.AbstractC26684u0;
import okhttp3.internal.connection.RealConnection;
@Metadata(m28433d1 = {"\u0000¬\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0005\n\u0002\b\u0004\n\u0002\u0010\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0012\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0012\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0002\u008f\u0001B\t¢\u0006\u0006\b\u008d\u0001\u0010\u008e\u0001J\b\u0010\u0005\u001a\u00020\u0000H\u0016J\b\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\b\u001a\u00020\u0000H\u0016J\b\u0010\t\u001a\u00020\u0000H\u0016J\b\u0010\u000b\u001a\u00020\nH\u0016J\u0010\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0016J\u0010\u0010\u0010\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0016J\b\u0010\u0011\u001a\u00020\u0001H\u0016J\b\u0010\u0013\u001a\u00020\u0012H\u0016J \u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0015\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\fJ\u0006\u0010\u0017\u001a\u00020\fJ\b\u0010\u0019\u001a\u00020\u0018H\u0016J\u0018\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\fH\u0087\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\b\u0010\u001e\u001a\u00020\u001dH\u0016J\b\u0010 \u001a\u00020\u001fH\u0016J\b\u0010!\u001a\u00020\fH\u0016J\b\u0010\"\u001a\u00020\u001dH\u0016J\b\u0010#\u001a\u00020\u001fH\u0016J\b\u0010$\u001a\u00020\fH\u0016J\b\u0010%\u001a\u00020\fH\u0016J\b\u0010'\u001a\u00020&H\u0016J\u0010\u0010(\u001a\u00020&2\u0006\u0010\r\u001a\u00020\fH\u0016J\u0010\u0010+\u001a\u00020\u001f2\u0006\u0010*\u001a\u00020)H\u0016J\u0018\u0010-\u001a\u00020\u000e2\u0006\u0010,\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\fH\u0016J\u0010\u0010/\u001a\u00020\f2\u0006\u0010,\u001a\u00020.H\u0016J\b\u00101\u001a\u000200H\u0016J\u0010\u00102\u001a\u0002002\u0006\u0010\r\u001a\u00020\fH\u0016J\u0010\u00105\u001a\u0002002\u0006\u00104\u001a\u000203H\u0016J\u0018\u00106\u001a\u0002002\u0006\u0010\r\u001a\u00020\f2\u0006\u00104\u001a\u000203H\u0016J\b\u00107\u001a\u000200H\u0016J\u0010\u00109\u001a\u0002002\u0006\u00108\u001a\u00020\fH\u0016J\b\u0010:\u001a\u00020\u001fH\u0016J\b\u0010<\u001a\u00020;H\u0016J\u0010\u0010=\u001a\u00020;2\u0006\u0010\r\u001a\u00020\fH\u0016J\u0010\u0010>\u001a\u00020\u000e2\u0006\u0010,\u001a\u00020;H\u0016J \u0010?\u001a\u00020\u001f2\u0006\u0010,\u001a\u00020;2\u0006\u0010\u0015\u001a\u00020\u001f2\u0006\u0010\r\u001a\u00020\u001fH\u0016J\u0010\u0010?\u001a\u00020\u001f2\u0006\u0010,\u001a\u00020@H\u0016J\u0006\u0010A\u001a\u00020\u000eJ\u0010\u0010B\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0016J\u0010\u0010D\u001a\u00020\u00002\u0006\u0010C\u001a\u00020&H\u0016J \u0010E\u001a\u00020\u00002\u0006\u0010C\u001a\u00020&2\u0006\u0010\u0015\u001a\u00020\u001f2\u0006\u0010\r\u001a\u00020\u001fH\u0016J\u0010\u0010G\u001a\u00020\u00002\u0006\u0010F\u001a\u000200H\u0016J \u0010J\u001a\u00020\u00002\u0006\u0010F\u001a\u0002002\u0006\u0010H\u001a\u00020\u001f2\u0006\u0010I\u001a\u00020\u001fH\u0016J\u0010\u0010L\u001a\u00020\u00002\u0006\u0010K\u001a\u00020\u001fH\u0016J\u0018\u0010M\u001a\u00020\u00002\u0006\u0010F\u001a\u0002002\u0006\u00104\u001a\u000203H\u0016J(\u0010N\u001a\u00020\u00002\u0006\u0010F\u001a\u0002002\u0006\u0010H\u001a\u00020\u001f2\u0006\u0010I\u001a\u00020\u001f2\u0006\u00104\u001a\u000203H\u0016J\u0010\u0010P\u001a\u00020\u00002\u0006\u0010O\u001a\u00020;H\u0016J \u0010Q\u001a\u00020\u00002\u0006\u0010O\u001a\u00020;2\u0006\u0010\u0015\u001a\u00020\u001f2\u0006\u0010\r\u001a\u00020\u001fH\u0016J\u0010\u0010R\u001a\u00020\u001f2\u0006\u0010O\u001a\u00020@H\u0016J\u0010\u0010T\u001a\u00020\f2\u0006\u0010O\u001a\u00020SH\u0016J\u0018\u0010U\u001a\u00020\u00002\u0006\u0010O\u001a\u00020S2\u0006\u0010\r\u001a\u00020\fH\u0016J\u0010\u0010W\u001a\u00020\u00002\u0006\u0010V\u001a\u00020\u001fH\u0016J\u0010\u0010Y\u001a\u00020\u00002\u0006\u0010X\u001a\u00020\u001fH\u0016J\u0010\u0010[\u001a\u00020\u00002\u0006\u0010Z\u001a\u00020\u001fH\u0016J\u0010\u0010]\u001a\u00020\u00002\u0006\u0010\\\u001a\u00020\fH\u0016J\u0010\u0010^\u001a\u00020\u00002\u0006\u0010\\\u001a\u00020\fH\u0016J\u0010\u0010_\u001a\u00020\u00002\u0006\u0010\\\u001a\u00020\fH\u0016J\u0017\u0010b\u001a\u00020a2\u0006\u0010`\u001a\u00020\u001fH\u0000¢\u0006\u0004\bb\u0010cJ\u0018\u0010R\u001a\u00020\u000e2\u0006\u0010O\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\fH\u0016J\u0018\u0010?\u001a\u00020\f2\u0006\u0010,\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\fH\u0016J \u0010f\u001a\u00020\f2\u0006\u0010V\u001a\u00020\u00182\u0006\u0010d\u001a\u00020\f2\u0006\u0010e\u001a\u00020\fH\u0016J\u0010\u0010h\u001a\u00020\f2\u0006\u0010g\u001a\u00020&H\u0016J\u0018\u0010i\u001a\u00020\f2\u0006\u0010g\u001a\u00020&2\u0006\u0010d\u001a\u00020\fH\u0016J\u0010\u0010k\u001a\u00020\f2\u0006\u0010j\u001a\u00020&H\u0016J\u0018\u0010l\u001a\u00020\f2\u0006\u0010j\u001a\u00020&2\u0006\u0010d\u001a\u00020\fH\u0016J\u0018\u0010m\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\f2\u0006\u0010g\u001a\u00020&H\u0016J(\u0010o\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\f2\u0006\u0010g\u001a\u00020&2\u0006\u0010n\u001a\u00020\u001f2\u0006\u0010\r\u001a\u00020\u001fH\u0016J\b\u0010p\u001a\u00020\u000eH\u0016J\b\u0010q\u001a\u00020\nH\u0016J\b\u0010r\u001a\u00020\u000eH\u0016J\b\u0010t\u001a\u00020sH\u0016J\u0013\u0010w\u001a\u00020\n2\b\u0010v\u001a\u0004\u0018\u00010uH\u0096\u0002J\b\u0010x\u001a\u00020\u001fH\u0016J\b\u0010y\u001a\u000200H\u0016J\u0006\u0010z\u001a\u00020\u0000J\b\u0010{\u001a\u00020\u0000H\u0016J\u0006\u0010|\u001a\u00020&J\u000e\u0010}\u001a\u00020&2\u0006\u0010\r\u001a\u00020\u001fJ\u0013\u0010\u0080\u0001\u001a\u00020~2\b\b\u0002\u0010\u007f\u001a\u00020~H\u0007R\u001a\u0010\u0082\u0001\u001a\u0004\u0018\u00010a8\u0000@\u0000X\u0081\u000e¢\u0006\u0007\n\u0005\bV\u0010\u0081\u0001R2\u0010\u0086\u0001\u001a\u00020\f2\u0007\u0010\u0083\u0001\u001a\u00020\f8G@@X\u0086\u000e¢\u0006\u0018\n\u0006\b\u0084\u0001\u0010\u0085\u0001\u001a\u0006\b\u0086\u0001\u0010\u0087\u0001\"\u0006\b\u0088\u0001\u0010\u0089\u0001R\u0017\u0010\u008c\u0001\u001a\u00020\u00008VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u008a\u0001\u0010\u008b\u0001¨\u0006\u0090\u0001"}, m28432d2 = {"Li30;", "Lo30;", "Ln30;", "", "Ljava/nio/channels/ByteChannel;", "F1", "Ljava/io/OutputStream;", "u3", "n", "m", "", "O2", "", "byteCount", "", "x2", "o", "peek", "Ljava/io/InputStream;", "w3", "out", "offset", "l", "g", "", "readByte", "pos", "p", "(J)B", "", "readShort", "", "readInt", "readLong", Stripe3ds2AuthResult.Ares.VALUE_CHALLENGE, "B", "S2", "B1", "LM70;", "h1", "F0", "Lry3;", "options", "Q2", "sink", "d0", "LwB5;", "Z2", "", "r1", "G", "Ljava/nio/charset/Charset;", "charset", "e1", "D", "o2", "limit", "V1", "I", "", "L0", "r2", "readFully", "read", "Ljava/nio/ByteBuffer;", DateTokenConverter.CONVERTER_KEY, "skip", "byteString", "V", "W", "string", "r0", "beginIndex", "endIndex", "t0", "codePoint", AbstractC26684u0.f100690q, "o0", "n0", Stripe3ds2AuthParams.FIELD_SOURCE, "a0", "b0", "write", "LAN5;", "R2", "X", "b", "c0", "s", "l0", "i", "i0", "v", "k0", "f0", "h0", "minimumCapacity", "LTq5;", "S", "(I)LTq5;", "fromIndex", "toIndex", "q", "bytes", "e2", "r", "targetBytes", "x1", "t", "p3", "bytesOffset", "y", "flush", "isOpen", "close", "LJ46;", "timeout", "", LegacyRepairType.OTHER_KEY, "equals", "hashCode", "toString", "k", "f", "P", "Q", "Li30$a;", "unsafeCursor", "z", "LTq5;", "head", "<set-?>", "c", "J", "size", "()J", "O", "(J)V", "e", "()Li30;", "buffer", "<init>", "()V", C17296a.f69688o, "okio"}, m28431k = 1, m28430mv = {1, 6, 0})
/* renamed from: i30  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42488i30 implements InterfaceC46046o30, InterfaceC45453n30, Cloneable, ByteChannel {
    @JvmField

    /* renamed from: b */
    public C36208Tq5 f86657b;

    /* renamed from: c */
    public long f86658c;

    @Metadata(m28433d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0012\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\"\u0010#J\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004J\b\u0010\n\u001a\u00020\tH\u0016R\u0018\u0010\r\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0003\u0010\fR\u0016\u0010\u0010\u001a\u00020\u000e8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\b\u0010\u000fR$\u0010\u0017\u001a\u0004\u0018\u00010\u00118\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u001a8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u001bR\u0016\u0010\u001f\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0016\u0010!\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b \u0010\u001e¨\u0006$"}, m28432d2 = {"Li30$a;", "Ljava/io/Closeable;", "", "b", "", "offset", DateTokenConverter.CONVERTER_KEY, "newSize", "c", "", "close", "Li30;", "Li30;", "buffer", "", "Z", "readWrite", "LTq5;", "LTq5;", C17296a.f69688o, "()LTq5;", "f", "(LTq5;)V", "segment", "e", "J", "", "[B", MessageExtension.FIELD_DATA, "g", "I", "start", "h", "end", "<init>", "()V", "okio"}, m28431k = 1, m28430mv = {1, 6, 0})
    /* renamed from: i30$a */
    /* loaded from: classes8.dex */
    public static final class C23107a implements Closeable {
        @JvmField

        /* renamed from: b */
        public C42488i30 f86659b;
        @JvmField

        /* renamed from: c */
        public boolean f86660c;

        /* renamed from: d */
        public C36208Tq5 f86661d;
        @JvmField

        /* renamed from: f */
        public byte[] f86663f;
        @JvmField

        /* renamed from: e */
        public long f86662e = -1;
        @JvmField

        /* renamed from: g */
        public int f86664g = -1;
        @JvmField

        /* renamed from: h */
        public int f86665h = -1;

        /* renamed from: a */
        public final C36208Tq5 m34538a() {
            return this.f86661d;
        }

        /* renamed from: b */
        public final int m34537b() {
            boolean z;
            long j;
            long j2 = this.f86662e;
            C42488i30 c42488i30 = this.f86659b;
            Intrinsics.checkNotNull(c42488i30);
            if (j2 != c42488i30.size()) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                long j3 = this.f86662e;
                if (j3 == -1) {
                    j = 0;
                } else {
                    j = j3 + (this.f86665h - this.f86664g);
                }
                return m34535d(j);
            }
            throw new IllegalStateException("no more bytes".toString());
        }

        /* renamed from: c */
        public final long m34536c(long j) {
            boolean z;
            C42488i30 c42488i30 = this.f86659b;
            if (c42488i30 != null) {
                if (this.f86660c) {
                    long size = c42488i30.size();
                    int i = (j > size ? 1 : (j == size ? 0 : -1));
                    int i2 = 1;
                    if (i <= 0) {
                        if (j >= 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (z) {
                            long j2 = size - j;
                            while (true) {
                                if (j2 <= 0) {
                                    break;
                                }
                                C36208Tq5 c36208Tq5 = c42488i30.f86657b;
                                Intrinsics.checkNotNull(c36208Tq5);
                                C36208Tq5 c36208Tq52 = c36208Tq5.f36332g;
                                Intrinsics.checkNotNull(c36208Tq52);
                                int i3 = c36208Tq52.f36328c;
                                long j3 = i3 - c36208Tq52.f36327b;
                                if (j3 <= j2) {
                                    c42488i30.f86657b = c36208Tq52.m82375b();
                                    C38799br5.m62277b(c36208Tq52);
                                    j2 -= j3;
                                } else {
                                    c36208Tq52.f36328c = i3 - ((int) j2);
                                    break;
                                }
                            }
                            m34534f(null);
                            this.f86662e = j;
                            this.f86663f = null;
                            this.f86664g = -1;
                            this.f86665h = -1;
                        } else {
                            throw new IllegalArgumentException(("newSize < 0: " + j).toString());
                        }
                    } else if (i > 0) {
                        long j4 = j - size;
                        boolean z2 = true;
                        while (j4 > 0) {
                            C36208Tq5 m34568S = c42488i30.m34568S(i2);
                            int min = (int) Math.min(j4, 8192 - m34568S.f36328c);
                            m34568S.f36328c += min;
                            j4 -= min;
                            if (z2) {
                                m34534f(m34568S);
                                this.f86662e = size;
                                this.f86663f = m34568S.f36326a;
                                int i4 = m34568S.f36328c;
                                this.f86664g = i4 - min;
                                this.f86665h = i4;
                                z2 = false;
                            }
                            i2 = 1;
                        }
                    }
                    c42488i30.m34571O(j);
                    return size;
                }
                throw new IllegalStateException("resizeBuffer() only permitted for read/write buffers".toString());
            }
            throw new IllegalStateException("not attached to a buffer".toString());
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            boolean z;
            if (this.f86659b != null) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                this.f86659b = null;
                m34534f(null);
                this.f86662e = -1L;
                this.f86663f = null;
                this.f86664g = -1;
                this.f86665h = -1;
                return;
            }
            throw new IllegalStateException("not attached to a buffer".toString());
        }

        /* renamed from: d */
        public final int m34535d(long j) {
            C36208Tq5 c36208Tq5;
            C42488i30 c42488i30 = this.f86659b;
            if (c42488i30 != null) {
                int i = (j > (-1L) ? 1 : (j == (-1L) ? 0 : -1));
                if (i >= 0 && j <= c42488i30.size()) {
                    if (i != 0 && j != c42488i30.size()) {
                        long size = c42488i30.size();
                        C36208Tq5 c36208Tq52 = c42488i30.f86657b;
                        long j2 = 0;
                        if (m34538a() != null) {
                            long j3 = this.f86662e;
                            int i2 = this.f86664g;
                            C36208Tq5 m34538a = m34538a();
                            Intrinsics.checkNotNull(m34538a);
                            long j4 = j3 - (i2 - m34538a.f36327b);
                            if (j4 > j) {
                                c36208Tq5 = c36208Tq52;
                                c36208Tq52 = m34538a();
                                size = j4;
                            } else {
                                c36208Tq5 = m34538a();
                                j2 = j4;
                            }
                        } else {
                            c36208Tq5 = c36208Tq52;
                        }
                        if (size - j > j - j2) {
                            while (true) {
                                Intrinsics.checkNotNull(c36208Tq5);
                                int i3 = c36208Tq5.f36328c;
                                int i4 = c36208Tq5.f36327b;
                                if (j < (i3 - i4) + j2) {
                                    break;
                                }
                                j2 += i3 - i4;
                                c36208Tq5 = c36208Tq5.f36331f;
                            }
                        } else {
                            while (size > j) {
                                Intrinsics.checkNotNull(c36208Tq52);
                                c36208Tq52 = c36208Tq52.f36332g;
                                Intrinsics.checkNotNull(c36208Tq52);
                                size -= c36208Tq52.f36328c - c36208Tq52.f36327b;
                            }
                            j2 = size;
                            c36208Tq5 = c36208Tq52;
                        }
                        if (this.f86660c) {
                            Intrinsics.checkNotNull(c36208Tq5);
                            if (c36208Tq5.f36329d) {
                                C36208Tq5 m82371f = c36208Tq5.m82371f();
                                if (c42488i30.f86657b == c36208Tq5) {
                                    c42488i30.f86657b = m82371f;
                                }
                                c36208Tq5 = c36208Tq5.m82374c(m82371f);
                                C36208Tq5 c36208Tq53 = c36208Tq5.f36332g;
                                Intrinsics.checkNotNull(c36208Tq53);
                                c36208Tq53.m82375b();
                            }
                        }
                        m34534f(c36208Tq5);
                        this.f86662e = j;
                        Intrinsics.checkNotNull(c36208Tq5);
                        this.f86663f = c36208Tq5.f36326a;
                        int i5 = c36208Tq5.f36327b + ((int) (j - j2));
                        this.f86664g = i5;
                        int i6 = c36208Tq5.f36328c;
                        this.f86665h = i6;
                        return i6 - i5;
                    }
                    m34534f(null);
                    this.f86662e = j;
                    this.f86663f = null;
                    this.f86664g = -1;
                    this.f86665h = -1;
                    return -1;
                }
                throw new ArrayIndexOutOfBoundsException("offset=" + j + " > size=" + c42488i30.size());
            }
            throw new IllegalStateException("not attached to a buffer".toString());
        }

        /* renamed from: f */
        public final void m34534f(C36208Tq5 c36208Tq5) {
            this.f86661d = c36208Tq5;
        }
    }

    @Metadata(m28433d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J \u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0002H\u0016J\b\u0010\n\u001a\u00020\u0004H\u0016J\b\u0010\u000b\u001a\u00020\u0004H\u0016J\b\u0010\r\u001a\u00020\fH\u0016¨\u0006\u000e"}, m28432d2 = {"i30$c", "Ljava/io/OutputStream;", "", "b", "", "write", "", MessageExtension.FIELD_DATA, "offset", "byteCount", "flush", "close", "", "toString", "okio"}, m28431k = 1, m28430mv = {1, 6, 0})
    /* renamed from: i30$c */
    /* loaded from: classes8.dex */
    public static final class C23109c extends OutputStream {
        public C23109c() {
        }

        @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        @Override // java.io.OutputStream, java.io.Flushable
        public void flush() {
        }

        public String toString() {
            return C42488i30.this + ".outputStream()";
        }

        @Override // java.io.OutputStream
        public void write(int i) {
            C42488i30.this.mo24534M0(i);
        }

        @Override // java.io.OutputStream
        public void write(byte[] data, int i, int i2) {
            Intrinsics.checkNotNullParameter(data, "data");
            C42488i30.this.mo24527f1(data, i, i2);
        }
    }

    /* renamed from: A */
    public static /* synthetic */ C23107a m34577A(C42488i30 c42488i30, C23107a c23107a, int i, Object obj) {
        if ((i & 1) != 0) {
            c23107a = FJ6.m107318d();
        }
        return c42488i30.m34539z(c23107a);
    }

    /* renamed from: B */
    public int m34576B() throws EOFException {
        return FJ6.m107314h(readInt());
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00ae A[EDGE_INSN: B:42:0x00ae->B:37:0x00ae ?: BREAK  , SYNTHETIC] */
    @Override // p000.InterfaceC46046o30
    /* renamed from: B1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public long mo21949B1() throws EOFException {
        int i;
        if (size() != 0) {
            int i2 = 0;
            boolean z = false;
            long j = 0;
            do {
                C36208Tq5 c36208Tq5 = this.f86657b;
                Intrinsics.checkNotNull(c36208Tq5);
                byte[] bArr = c36208Tq5.f36326a;
                int i3 = c36208Tq5.f36327b;
                int i4 = c36208Tq5.f36328c;
                while (i3 < i4) {
                    byte b = bArr[i3];
                    byte b2 = (byte) 48;
                    if (b >= b2 && b <= ((byte) 57)) {
                        i = b - b2;
                    } else {
                        byte b3 = (byte) 97;
                        if ((b >= b3 && b <= ((byte) 102)) || (b >= (b3 = (byte) 65) && b <= ((byte) 70))) {
                            i = (b - b3) + 10;
                        } else if (i2 != 0) {
                            z = true;
                            if (i3 != i4) {
                                this.f86657b = c36208Tq5.m82375b();
                                C38799br5.m62277b(c36208Tq5);
                            } else {
                                c36208Tq5.f36327b = i3;
                            }
                            if (!z) {
                                break;
                            }
                        } else {
                            throw new NumberFormatException("Expected leading [0-9a-fA-F] character but was 0x" + FJ6.m107312j(b));
                        }
                    }
                    if (((-1152921504606846976L) & j) == 0) {
                        j = (j << 4) | i;
                        i3++;
                        i2++;
                    } else {
                        C42488i30 mo24534M0 = new C42488i30().mo24525g1(j).mo24534M0(b);
                        throw new NumberFormatException("Number too large: " + mo24534M0.mo21932r1());
                    }
                }
                if (i3 != i4) {
                }
                if (!z) {
                }
            } while (this.f86657b != null);
            m34571O(size() - i2);
            return j;
        }
        throw new EOFException();
    }

    /* renamed from: C */
    public short m34575C() throws EOFException {
        return FJ6.m107313i(readShort());
    }

    /* renamed from: D */
    public String m34574D(long j, Charset charset) throws EOFException {
        boolean z;
        Intrinsics.checkNotNullParameter(charset, "charset");
        int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
        if (i >= 0 && j <= 2147483647L) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (this.f86658c >= j) {
                if (i == 0) {
                    return "";
                }
                C36208Tq5 c36208Tq5 = this.f86657b;
                Intrinsics.checkNotNull(c36208Tq5);
                int i2 = c36208Tq5.f36327b;
                if (i2 + j > c36208Tq5.f36328c) {
                    return new String(mo21931r2(j), charset);
                }
                int i3 = (int) j;
                String str = new String(c36208Tq5.f36326a, i2, i3, charset);
                int i4 = c36208Tq5.f36327b + i3;
                c36208Tq5.f36327b = i4;
                this.f86658c -= j;
                if (i4 == c36208Tq5.f36328c) {
                    this.f86657b = c36208Tq5.m82375b();
                    C38799br5.m62277b(c36208Tq5);
                }
                return str;
            }
            throw new EOFException();
        }
        throw new IllegalArgumentException(("byteCount: " + j).toString());
    }

    @Override // p000.InterfaceC46046o30
    /* renamed from: F0 */
    public M70 mo21948F0(long j) throws EOFException {
        boolean z;
        if (j >= 0 && j <= 2147483647L) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (size() >= j) {
                if (j >= 4096) {
                    M70 m34569Q = m34569Q((int) j);
                    skip(j);
                    return m34569Q;
                }
                return new M70(mo21931r2(j));
            }
            throw new EOFException();
        }
        throw new IllegalArgumentException(("byteCount: " + j).toString());
    }

    @Override // p000.InterfaceC46046o30
    /* renamed from: F1 */
    public C42488i30 mo21947F1() {
        return this;
    }

    /* renamed from: G */
    public String m34573G(long j) throws EOFException {
        return m34574D(j, Charsets.UTF_8);
    }

    /* renamed from: I */
    public int m34572I() throws EOFException {
        int i;
        int i2;
        int i3;
        if (size() != 0) {
            byte m34547p = m34547p(0L);
            boolean z = false;
            if ((m34547p & ByteCompanionObject.MIN_VALUE) == 0) {
                i = m34547p & ByteCompanionObject.MAX_VALUE;
                i3 = 0;
                i2 = 1;
            } else if ((m34547p & 224) == 192) {
                i = m34547p & 31;
                i2 = 2;
                i3 = 128;
            } else if ((m34547p & 240) == 224) {
                i = m34547p & 15;
                i2 = 3;
                i3 = 2048;
            } else if ((m34547p & 248) == 240) {
                i = m34547p & 7;
                i2 = 4;
                i3 = 65536;
            } else {
                skip(1L);
                return 65533;
            }
            long j = i2;
            if (size() >= j) {
                for (int i4 = 1; i4 < i2; i4++) {
                    long j2 = i4;
                    byte m34547p2 = m34547p(j2);
                    if ((m34547p2 & 192) == 128) {
                        i = (i << 6) | (m34547p2 & 63);
                    } else {
                        skip(j2);
                        return 65533;
                    }
                }
                skip(j);
                if (i > 1114111) {
                    return 65533;
                }
                if (55296 <= i && i < 57344) {
                    z = true;
                }
                if (z || i < i3) {
                    return 65533;
                }
                return i;
            }
            throw new EOFException("size < " + i2 + ": " + size() + " (to read code point prefixed 0x" + FJ6.m107312j(m34547p) + CoreConstants.RIGHT_PARENTHESIS_CHAR);
        }
        throw new EOFException();
    }

    @Override // p000.InterfaceC46046o30
    /* renamed from: L0 */
    public byte[] mo21946L0() {
        return mo21931r2(size());
    }

    /* renamed from: O */
    public final void m34571O(long j) {
        this.f86658c = j;
    }

    @Override // p000.InterfaceC46046o30
    /* renamed from: O2 */
    public boolean mo21945O2() {
        return this.f86658c == 0;
    }

    /* renamed from: P */
    public final M70 m34570P() {
        boolean z;
        if (size() <= 2147483647L) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return m34569Q((int) size());
        }
        throw new IllegalStateException(("size > Int.MAX_VALUE: " + size()).toString());
    }

    /* renamed from: Q */
    public final M70 m34569Q(int i) {
        if (i == 0) {
            return M70.f22645f;
        }
        FJ6.m107320b(size(), 0L, i);
        C36208Tq5 c36208Tq5 = this.f86657b;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i3 < i) {
            Intrinsics.checkNotNull(c36208Tq5);
            int i5 = c36208Tq5.f36328c;
            int i6 = c36208Tq5.f36327b;
            if (i5 != i6) {
                i3 += i5 - i6;
                i4++;
                c36208Tq5 = c36208Tq5.f36331f;
            } else {
                throw new AssertionError("s.limit == s.pos");
            }
        }
        byte[][] bArr = new byte[i4];
        int[] iArr = new int[i4 * 2];
        C36208Tq5 c36208Tq52 = this.f86657b;
        int i7 = 0;
        while (i2 < i) {
            Intrinsics.checkNotNull(c36208Tq52);
            bArr[i7] = c36208Tq52.f36326a;
            i2 += c36208Tq52.f36328c - c36208Tq52.f36327b;
            iArr[i7] = Math.min(i2, i);
            iArr[i7 + i4] = c36208Tq52.f36327b;
            c36208Tq52.f36329d = true;
            i7++;
            c36208Tq52 = c36208Tq52.f36331f;
        }
        return new C40002dr5(bArr, iArr);
    }

    @Override // p000.InterfaceC46046o30
    /* renamed from: Q2 */
    public int mo21944Q2(C48371ry3 options) {
        Intrinsics.checkNotNullParameter(options, "options");
        int m114101f = BJ6.m114101f(this, options, false, 2, null);
        if (m114101f == -1) {
            return -1;
        }
        skip(options.m14972c()[m114101f].size());
        return m114101f;
    }

    @Override // p000.InterfaceC45453n30
    /* renamed from: R2 */
    public long mo24532R2(AN5 source) throws IOException {
        Intrinsics.checkNotNullParameter(source, "source");
        long j = 0;
        while (true) {
            long read = source.read(this, FileAppender.DEFAULT_BUFFER_SIZE);
            if (read != -1) {
                j += read;
            } else {
                return j;
            }
        }
    }

    /* renamed from: S */
    public final C36208Tq5 m34568S(int i) {
        boolean z = true;
        if ((i < 1 || i > 8192) ? false : false) {
            C36208Tq5 c36208Tq5 = this.f86657b;
            if (c36208Tq5 == null) {
                C36208Tq5 m62276c = C38799br5.m62276c();
                this.f86657b = m62276c;
                m62276c.f36332g = m62276c;
                m62276c.f36331f = m62276c;
                return m62276c;
            }
            Intrinsics.checkNotNull(c36208Tq5);
            C36208Tq5 c36208Tq52 = c36208Tq5.f36332g;
            Intrinsics.checkNotNull(c36208Tq52);
            if (c36208Tq52.f36328c + i <= 8192 && c36208Tq52.f36330e) {
                return c36208Tq52;
            }
            return c36208Tq52.m82374c(C38799br5.m62276c());
        }
        throw new IllegalArgumentException("unexpected capacity".toString());
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x009d, code lost:
        m34571O(size() - r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00a6, code lost:
        if (r2 == false) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00a8, code lost:
        r14 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00aa, code lost:
        r14 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00ab, code lost:
        if (r1 >= r14) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00b5, code lost:
        if (size() == 0) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00b7, code lost:
        if (r2 == false) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00b9, code lost:
        r1 = "Expected a digit";
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00bc, code lost:
        r1 = "Expected a digit or '-'";
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00e1, code lost:
        throw new java.lang.NumberFormatException(r1 + " but was 0x" + p000.FJ6.m107312j(m34547p(0)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00e7, code lost:
        throw new java.io.EOFException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00e8, code lost:
        if (r2 == false) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00ec, code lost:
        return -r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:?, code lost:
        return r8;
     */
    @Override // p000.InterfaceC46046o30
    /* renamed from: S2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public long mo21943S2() throws EOFException {
        byte b;
        if (size() != 0) {
            int i = 0;
            boolean z = false;
            long j = 0;
            long j2 = -7;
            boolean z2 = false;
            loop0: while (true) {
                C36208Tq5 c36208Tq5 = this.f86657b;
                Intrinsics.checkNotNull(c36208Tq5);
                byte[] bArr = c36208Tq5.f36326a;
                int i2 = c36208Tq5.f36327b;
                int i3 = c36208Tq5.f36328c;
                while (i2 < i3) {
                    b = bArr[i2];
                    byte b2 = (byte) 48;
                    if (b >= b2 && b <= ((byte) 57)) {
                        int i4 = b2 - b;
                        int i5 = (j > (-922337203685477580L) ? 1 : (j == (-922337203685477580L) ? 0 : -1));
                        if (i5 < 0 || (i5 == 0 && i4 < j2)) {
                            break loop0;
                        }
                        j = (j * 10) + i4;
                    } else if (b == ((byte) 45) && i == 0) {
                        j2--;
                        z = true;
                    } else {
                        z2 = true;
                        break;
                    }
                    i2++;
                    i++;
                }
                if (i2 == i3) {
                    this.f86657b = c36208Tq5.m82375b();
                    C38799br5.m62277b(c36208Tq5);
                } else {
                    c36208Tq5.f36327b = i2;
                }
                if (z2 || this.f86657b == null) {
                    break;
                }
            }
            C42488i30 mo24534M0 = new C42488i30().mo24522x0(j).mo24534M0(b);
            if (!z) {
                mo24534M0.readByte();
            }
            throw new NumberFormatException("Number too large: " + mo24534M0.mo21932r1());
        }
        throw new EOFException();
    }

    @Override // p000.InterfaceC45453n30
    /* renamed from: V */
    public C42488i30 mo24528e0(M70 byteString) {
        Intrinsics.checkNotNullParameter(byteString, "byteString");
        byteString.mo43605E(this, 0, byteString.size());
        return this;
    }

    @Override // p000.InterfaceC46046o30
    /* renamed from: V1 */
    public String mo21942V1(long j) throws EOFException {
        boolean z;
        if (j >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            long j2 = LongCompanionObject.MAX_VALUE;
            if (j != LongCompanionObject.MAX_VALUE) {
                j2 = j + 1;
            }
            byte b = (byte) 10;
            long m34546q = m34546q(b, 0L, j2);
            if (m34546q != -1) {
                return BJ6.m114103d(this, m34546q);
            }
            if (j2 < size() && m34547p(j2 - 1) == ((byte) 13) && m34547p(j2) == b) {
                return BJ6.m114103d(this, j2);
            }
            C42488i30 c42488i30 = new C42488i30();
            m34553l(c42488i30, 0L, Math.min(32, size()));
            throw new EOFException("\\n not found: limit=" + Math.min(size(), j) + " content=" + c42488i30.mo21936h1().mo43597j() + Typography.ellipsis);
        }
        throw new IllegalArgumentException(("limit < 0: " + j).toString());
    }

    /* renamed from: W */
    public C42488i30 m34566W(M70 byteString, int i, int i2) {
        Intrinsics.checkNotNullParameter(byteString, "byteString");
        byteString.mo43605E(this, i, i2);
        return this;
    }

    /* renamed from: X */
    public C42488i30 m34565X(AN5 source, long j) throws IOException {
        Intrinsics.checkNotNullParameter(source, "source");
        while (j > 0) {
            long read = source.read(this, j);
            if (read != -1) {
                j -= read;
            } else {
                throw new EOFException();
            }
        }
        return this;
    }

    @Override // p000.InterfaceC46046o30
    /* renamed from: Z2 */
    public long mo21941Z2(InterfaceC50872wB5 sink) throws IOException {
        Intrinsics.checkNotNullParameter(sink, "sink");
        long size = size();
        if (size > 0) {
            sink.write(this, size);
        }
        return size;
    }

    @Override // p000.InterfaceC45453n30
    /* renamed from: a0 */
    public C42488i30 mo24524s0(byte[] source) {
        Intrinsics.checkNotNullParameter(source, "source");
        return mo24527f1(source, 0, source.length);
    }

    @Override // p000.InterfaceC45453n30
    /* renamed from: b0 */
    public C42488i30 mo24527f1(byte[] source, int i, int i2) {
        Intrinsics.checkNotNullParameter(source, "source");
        long j = i2;
        FJ6.m107320b(source.length, i, j);
        int i3 = i2 + i;
        while (i < i3) {
            C36208Tq5 m34568S = m34568S(1);
            int min = Math.min(i3 - i, 8192 - m34568S.f36328c);
            int i4 = i + min;
            ArraysKt.copyInto(source, m34568S.f36326a, m34568S.f36328c, i, i4);
            m34568S.f36328c += min;
            i = i4;
        }
        m34571O(size() + j);
        return this;
    }

    @Override // p000.InterfaceC45453n30
    /* renamed from: c0 */
    public C42488i30 mo24534M0(int i) {
        C36208Tq5 m34568S = m34568S(1);
        byte[] bArr = m34568S.f36326a;
        int i2 = m34568S.f36328c;
        m34568S.f36328c = i2 + 1;
        bArr[i2] = (byte) i;
        m34571O(size() + 1);
        return this;
    }

    @Override // p000.AN5, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    /* renamed from: d */
    public final void m34561d() {
        skip(size());
    }

    @Override // p000.InterfaceC46046o30
    /* renamed from: d0 */
    public void mo21940d0(C42488i30 sink, long j) throws EOFException {
        Intrinsics.checkNotNullParameter(sink, "sink");
        if (size() >= j) {
            sink.write(this, j);
        } else {
            sink.write(this, size());
            throw new EOFException();
        }
    }

    @Override // p000.InterfaceC46046o30
    /* renamed from: e */
    public C42488i30 mo21939e() {
        return this;
    }

    @Override // p000.InterfaceC46046o30
    /* renamed from: e1 */
    public String mo21938e1(Charset charset) {
        Intrinsics.checkNotNullParameter(charset, "charset");
        return m34574D(this.f86658c, charset);
    }

    @Override // p000.InterfaceC46046o30
    /* renamed from: e2 */
    public long mo21937e2(M70 bytes) throws IOException {
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        return m34545r(bytes, 0L);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C42488i30) {
            C42488i30 c42488i30 = (C42488i30) obj;
            if (size() == c42488i30.size()) {
                if (size() == 0) {
                    return true;
                }
                C36208Tq5 c36208Tq5 = this.f86657b;
                Intrinsics.checkNotNull(c36208Tq5);
                C36208Tq5 c36208Tq52 = c42488i30.f86657b;
                Intrinsics.checkNotNull(c36208Tq52);
                int i = c36208Tq5.f36327b;
                int i2 = c36208Tq52.f36327b;
                long j = 0;
                while (j < size()) {
                    long min = Math.min(c36208Tq5.f36328c - i, c36208Tq52.f36328c - i2);
                    long j2 = 0;
                    while (j2 < min) {
                        int i3 = i + 1;
                        int i4 = i2 + 1;
                        if (c36208Tq5.f36326a[i] == c36208Tq52.f36326a[i2]) {
                            j2++;
                            i = i3;
                            i2 = i4;
                        }
                    }
                    if (i == c36208Tq5.f36328c) {
                        c36208Tq5 = c36208Tq5.f36331f;
                        Intrinsics.checkNotNull(c36208Tq5);
                        i = c36208Tq5.f36327b;
                    }
                    if (i2 == c36208Tq52.f36328c) {
                        c36208Tq52 = c36208Tq52.f36331f;
                        Intrinsics.checkNotNull(c36208Tq52);
                        i2 = c36208Tq52.f36327b;
                    }
                    j += min;
                }
                return true;
            }
        }
        return false;
    }

    /* renamed from: f */
    public C42488i30 clone() {
        return m34555k();
    }

    @Override // p000.InterfaceC45453n30
    /* renamed from: f0 */
    public C42488i30 mo24522x0(long j) {
        boolean z;
        int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
        if (i == 0) {
            return mo24534M0(48);
        }
        int i2 = 1;
        if (i < 0) {
            j = -j;
            if (j < 0) {
                return mo24530a2("-9223372036854775808");
            }
            z = true;
        } else {
            z = false;
        }
        if (j < 100000000) {
            if (j < AbstractComponentTracker.LINGERING_TIMEOUT) {
                if (j < 100) {
                    if (j >= 10) {
                        i2 = 2;
                    }
                } else if (j < 1000) {
                    i2 = 3;
                } else {
                    i2 = 4;
                }
            } else if (j < 1000000) {
                if (j < 100000) {
                    i2 = 5;
                } else {
                    i2 = 6;
                }
            } else if (j < 10000000) {
                i2 = 7;
            } else {
                i2 = 8;
            }
        } else if (j < 1000000000000L) {
            if (j < RealConnection.IDLE_CONNECTION_HEALTHY_NS) {
                if (j < 1000000000) {
                    i2 = 9;
                } else {
                    i2 = 10;
                }
            } else if (j < 100000000000L) {
                i2 = 11;
            } else {
                i2 = 12;
            }
        } else if (j < 1000000000000000L) {
            if (j < 10000000000000L) {
                i2 = 13;
            } else if (j < 100000000000000L) {
                i2 = 14;
            } else {
                i2 = 15;
            }
        } else if (j < 100000000000000000L) {
            if (j < 10000000000000000L) {
                i2 = 16;
            } else {
                i2 = 17;
            }
        } else if (j < 1000000000000000000L) {
            i2 = 18;
        } else {
            i2 = 19;
        }
        if (z) {
            i2++;
        }
        C36208Tq5 m34568S = m34568S(i2);
        byte[] bArr = m34568S.f36326a;
        int i3 = m34568S.f36328c + i2;
        while (j != 0) {
            long j2 = 10;
            i3--;
            bArr[i3] = BJ6.m114105b()[(int) (j % j2)];
            j /= j2;
        }
        if (z) {
            bArr[i3 - 1] = (byte) 45;
        }
        m34568S.f36328c += i2;
        m34571O(size() + i2);
        return this;
    }

    @Override // p000.InterfaceC45453n30, p000.InterfaceC50872wB5, java.io.Flushable
    public void flush() {
    }

    /* renamed from: g */
    public final long m34558g() {
        long size = size();
        if (size == 0) {
            return 0L;
        }
        C36208Tq5 c36208Tq5 = this.f86657b;
        Intrinsics.checkNotNull(c36208Tq5);
        C36208Tq5 c36208Tq52 = c36208Tq5.f36332g;
        Intrinsics.checkNotNull(c36208Tq52);
        int i = c36208Tq52.f36328c;
        if (i < 8192 && c36208Tq52.f36330e) {
            size -= i - c36208Tq52.f36327b;
        }
        return size;
    }

    @Override // p000.InterfaceC45453n30
    /* renamed from: h0 */
    public C42488i30 mo24525g1(long j) {
        if (j == 0) {
            return mo24534M0(48);
        }
        long j2 = (j >>> 1) | j;
        long j3 = j2 | (j2 >>> 2);
        long j4 = j3 | (j3 >>> 4);
        long j5 = j4 | (j4 >>> 8);
        long j6 = j5 | (j5 >>> 16);
        long j7 = j6 | (j6 >>> 32);
        long j8 = j7 - ((j7 >>> 1) & 6148914691236517205L);
        long j9 = ((j8 >>> 2) & 3689348814741910323L) + (j8 & 3689348814741910323L);
        long j10 = ((j9 >>> 4) + j9) & 1085102592571150095L;
        long j11 = j10 + (j10 >>> 8);
        long j12 = j11 + (j11 >>> 16);
        int i = (int) ((((j12 & 63) + ((j12 >>> 32) & 63)) + 3) / 4);
        C36208Tq5 m34568S = m34568S(i);
        byte[] bArr = m34568S.f36326a;
        int i2 = m34568S.f36328c;
        for (int i3 = (i2 + i) - 1; i3 >= i2; i3--) {
            bArr[i3] = BJ6.m114105b()[(int) (15 & j)];
            j >>>= 4;
        }
        m34568S.f36328c += i;
        m34571O(size() + i);
        return this;
    }

    @Override // p000.InterfaceC46046o30
    /* renamed from: h1 */
    public M70 mo21936h1() {
        return mo21948F0(size());
    }

    public int hashCode() {
        C36208Tq5 c36208Tq5 = this.f86657b;
        if (c36208Tq5 == null) {
            return 0;
        }
        int i = 1;
        do {
            int i2 = c36208Tq5.f36328c;
            for (int i3 = c36208Tq5.f36327b; i3 < i2; i3++) {
                i = (i * 31) + c36208Tq5.f36326a[i3];
            }
            c36208Tq5 = c36208Tq5.f36331f;
            Intrinsics.checkNotNull(c36208Tq5);
        } while (c36208Tq5 != this.f86657b);
        return i;
    }

    @Override // p000.InterfaceC45453n30
    /* renamed from: i0 */
    public C42488i30 mo24533N(int i) {
        C36208Tq5 m34568S = m34568S(4);
        byte[] bArr = m34568S.f36326a;
        int i2 = m34568S.f36328c;
        int i3 = i2 + 1;
        bArr[i2] = (byte) ((i >>> 24) & KotlinVersion.MAX_COMPONENT_VALUE);
        int i4 = i3 + 1;
        bArr[i3] = (byte) ((i >>> 16) & KotlinVersion.MAX_COMPONENT_VALUE);
        int i5 = i4 + 1;
        bArr[i4] = (byte) ((i >>> 8) & KotlinVersion.MAX_COMPONENT_VALUE);
        bArr[i5] = (byte) (i & KotlinVersion.MAX_COMPONENT_VALUE);
        m34568S.f36328c = i5 + 1;
        m34571O(size() + 4);
        return this;
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return true;
    }

    /* renamed from: k */
    public final C42488i30 m34555k() {
        C42488i30 c42488i30 = new C42488i30();
        if (size() != 0) {
            C36208Tq5 c36208Tq5 = this.f86657b;
            Intrinsics.checkNotNull(c36208Tq5);
            C36208Tq5 m82373d = c36208Tq5.m82373d();
            c42488i30.f86657b = m82373d;
            m82373d.f36332g = m82373d;
            m82373d.f36331f = m82373d;
            for (C36208Tq5 c36208Tq52 = c36208Tq5.f36331f; c36208Tq52 != c36208Tq5; c36208Tq52 = c36208Tq52.f36331f) {
                C36208Tq5 c36208Tq53 = m82373d.f36332g;
                Intrinsics.checkNotNull(c36208Tq53);
                Intrinsics.checkNotNull(c36208Tq52);
                c36208Tq53.m82374c(c36208Tq52.m82373d());
            }
            c42488i30.m34571O(size());
        }
        return c42488i30;
    }

    /* renamed from: k0 */
    public C42488i30 m34554k0(long j) {
        C36208Tq5 m34568S = m34568S(8);
        byte[] bArr = m34568S.f36326a;
        int i = m34568S.f36328c;
        int i2 = i + 1;
        bArr[i] = (byte) ((j >>> 56) & 255);
        int i3 = i2 + 1;
        bArr[i2] = (byte) ((j >>> 48) & 255);
        int i4 = i3 + 1;
        bArr[i3] = (byte) ((j >>> 40) & 255);
        int i5 = i4 + 1;
        bArr[i4] = (byte) ((j >>> 32) & 255);
        int i6 = i5 + 1;
        bArr[i5] = (byte) ((j >>> 24) & 255);
        int i7 = i6 + 1;
        bArr[i6] = (byte) ((j >>> 16) & 255);
        int i8 = i7 + 1;
        bArr[i7] = (byte) ((j >>> 8) & 255);
        bArr[i8] = (byte) (j & 255);
        m34568S.f36328c = i8 + 1;
        m34571O(size() + 8);
        return this;
    }

    /* renamed from: l */
    public final C42488i30 m34553l(C42488i30 out, long j, long j2) {
        Intrinsics.checkNotNullParameter(out, "out");
        FJ6.m107320b(size(), j, j2);
        if (j2 != 0) {
            out.m34571O(out.size() + j2);
            C36208Tq5 c36208Tq5 = this.f86657b;
            while (true) {
                Intrinsics.checkNotNull(c36208Tq5);
                int i = c36208Tq5.f36328c;
                int i2 = c36208Tq5.f36327b;
                if (j < i - i2) {
                    break;
                }
                j -= i - i2;
                c36208Tq5 = c36208Tq5.f36331f;
            }
            while (j2 > 0) {
                Intrinsics.checkNotNull(c36208Tq5);
                C36208Tq5 m82373d = c36208Tq5.m82373d();
                int i3 = m82373d.f36327b + ((int) j);
                m82373d.f36327b = i3;
                m82373d.f36328c = Math.min(i3 + ((int) j2), m82373d.f36328c);
                C36208Tq5 c36208Tq52 = out.f86657b;
                if (c36208Tq52 == null) {
                    m82373d.f36332g = m82373d;
                    m82373d.f36331f = m82373d;
                    out.f86657b = m82373d;
                } else {
                    Intrinsics.checkNotNull(c36208Tq52);
                    C36208Tq5 c36208Tq53 = c36208Tq52.f36332g;
                    Intrinsics.checkNotNull(c36208Tq53);
                    c36208Tq53.m82374c(m82373d);
                }
                j2 -= m82373d.f36328c - m82373d.f36327b;
                c36208Tq5 = c36208Tq5.f36331f;
                j = 0;
            }
        }
        return this;
    }

    @Override // p000.InterfaceC45453n30
    /* renamed from: l0 */
    public C42488i30 mo24536G2(int i) {
        C36208Tq5 m34568S = m34568S(2);
        byte[] bArr = m34568S.f36326a;
        int i2 = m34568S.f36328c;
        int i3 = i2 + 1;
        bArr[i2] = (byte) ((i >>> 8) & KotlinVersion.MAX_COMPONENT_VALUE);
        bArr[i3] = (byte) (i & KotlinVersion.MAX_COMPONENT_VALUE);
        m34568S.f36328c = i3 + 1;
        m34571O(size() + 2);
        return this;
    }

    @Override // p000.InterfaceC45453n30
    /* renamed from: m */
    public C42488i30 mo24535H1() {
        return this;
    }

    @Override // p000.InterfaceC45453n30
    /* renamed from: n */
    public C42488i30 mo24531T1() {
        return this;
    }

    /* renamed from: n0 */
    public C42488i30 m34549n0(String string, int i, int i2, Charset charset) {
        boolean z;
        boolean z2;
        Intrinsics.checkNotNullParameter(string, "string");
        Intrinsics.checkNotNullParameter(charset, "charset");
        boolean z3 = true;
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (i2 >= i) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                if (i2 > string.length()) {
                    z3 = false;
                }
                if (z3) {
                    if (Intrinsics.areEqual(charset, Charsets.UTF_8)) {
                        return mo24526g0(string, i, i2);
                    }
                    String substring = string.substring(i, i2);
                    Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                    byte[] bytes = substring.getBytes(charset);
                    Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
                    return mo24527f1(bytes, 0, bytes.length);
                }
                throw new IllegalArgumentException(("endIndex > string.length: " + i2 + " > " + string.length()).toString());
            }
            throw new IllegalArgumentException(("endIndex < beginIndex: " + i2 + " < " + i).toString());
        }
        throw new IllegalArgumentException(("beginIndex < 0: " + i).toString());
    }

    @Override // p000.InterfaceC46046o30
    /* renamed from: o */
    public boolean mo21935o(long j) {
        return this.f86658c >= j;
    }

    /* renamed from: o0 */
    public C42488i30 m34548o0(String string, Charset charset) {
        Intrinsics.checkNotNullParameter(string, "string");
        Intrinsics.checkNotNullParameter(charset, "charset");
        return m34549n0(string, 0, string.length(), charset);
    }

    @Override // p000.InterfaceC46046o30
    /* renamed from: o2 */
    public String mo21934o2() throws EOFException {
        return mo21942V1(LongCompanionObject.MAX_VALUE);
    }

    @JvmName(name = "getByte")
    /* renamed from: p */
    public final byte m34547p(long j) {
        FJ6.m107320b(size(), j, 1L);
        C36208Tq5 c36208Tq5 = this.f86657b;
        if (c36208Tq5 != null) {
            if (size() - j < j) {
                long size = size();
                while (size > j) {
                    c36208Tq5 = c36208Tq5.f36332g;
                    Intrinsics.checkNotNull(c36208Tq5);
                    size -= c36208Tq5.f36328c - c36208Tq5.f36327b;
                }
                Intrinsics.checkNotNull(c36208Tq5);
                return c36208Tq5.f36326a[(int) ((c36208Tq5.f36327b + j) - size)];
            }
            long j2 = 0;
            while (true) {
                long j3 = (c36208Tq5.f36328c - c36208Tq5.f36327b) + j2;
                if (j3 <= j) {
                    c36208Tq5 = c36208Tq5.f36331f;
                    Intrinsics.checkNotNull(c36208Tq5);
                    j2 = j3;
                } else {
                    Intrinsics.checkNotNull(c36208Tq5);
                    return c36208Tq5.f36326a[(int) ((c36208Tq5.f36327b + j) - j2)];
                }
            }
        } else {
            Intrinsics.checkNotNull(null);
            throw null;
        }
    }

    @Override // p000.InterfaceC46046o30
    /* renamed from: p3 */
    public boolean mo21933p3(long j, M70 bytes) {
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        return m34540y(j, bytes, 0, bytes.size());
    }

    @Override // p000.InterfaceC46046o30
    public InterfaceC46046o30 peek() {
        return C34928Oe3.m91759d(new ZP3(this));
    }

    /* renamed from: q */
    public long m34546q(byte b, long j, long j2) {
        C36208Tq5 c36208Tq5;
        int i;
        long j3 = 0;
        boolean z = false;
        if (0 <= j && j <= j2) {
            z = true;
        }
        if (z) {
            if (j2 > size()) {
                j2 = size();
            }
            if (j == j2 || (c36208Tq5 = this.f86657b) == null) {
                return -1L;
            }
            if (size() - j < j) {
                j3 = size();
                while (j3 > j) {
                    c36208Tq5 = c36208Tq5.f36332g;
                    Intrinsics.checkNotNull(c36208Tq5);
                    j3 -= c36208Tq5.f36328c - c36208Tq5.f36327b;
                }
                while (j3 < j2) {
                    byte[] bArr = c36208Tq5.f36326a;
                    int min = (int) Math.min(c36208Tq5.f36328c, (c36208Tq5.f36327b + j2) - j3);
                    i = (int) ((c36208Tq5.f36327b + j) - j3);
                    while (i < min) {
                        if (bArr[i] != b) {
                            i++;
                        }
                    }
                    j3 += c36208Tq5.f36328c - c36208Tq5.f36327b;
                    c36208Tq5 = c36208Tq5.f36331f;
                    Intrinsics.checkNotNull(c36208Tq5);
                    j = j3;
                }
                return -1L;
            }
            while (true) {
                long j4 = (c36208Tq5.f36328c - c36208Tq5.f36327b) + j3;
                if (j4 > j) {
                    break;
                }
                c36208Tq5 = c36208Tq5.f36331f;
                Intrinsics.checkNotNull(c36208Tq5);
                j3 = j4;
            }
            while (j3 < j2) {
                byte[] bArr2 = c36208Tq5.f36326a;
                int min2 = (int) Math.min(c36208Tq5.f36328c, (c36208Tq5.f36327b + j2) - j3);
                i = (int) ((c36208Tq5.f36327b + j) - j3);
                while (i < min2) {
                    if (bArr2[i] != b) {
                        i++;
                    }
                }
                j3 += c36208Tq5.f36328c - c36208Tq5.f36327b;
                c36208Tq5 = c36208Tq5.f36331f;
                Intrinsics.checkNotNull(c36208Tq5);
                j = j3;
            }
            return -1L;
            return (i - c36208Tq5.f36327b) + j3;
        }
        throw new IllegalArgumentException(("size=" + size() + " fromIndex=" + j + " toIndex=" + j2).toString());
    }

    /* renamed from: r */
    public long m34545r(M70 bytes, long j) throws IOException {
        boolean z;
        boolean z2;
        long j2 = j;
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        if (bytes.size() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            long j3 = 0;
            if (j2 >= 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                C36208Tq5 c36208Tq5 = this.f86657b;
                if (c36208Tq5 != null) {
                    if (size() - j2 < j2) {
                        long size = size();
                        while (size > j2) {
                            c36208Tq5 = c36208Tq5.f36332g;
                            Intrinsics.checkNotNull(c36208Tq5);
                            size -= c36208Tq5.f36328c - c36208Tq5.f36327b;
                        }
                        byte[] mo43596k = bytes.mo43596k();
                        byte b = mo43596k[0];
                        int size2 = bytes.size();
                        long size3 = (size() - size2) + 1;
                        while (size < size3) {
                            byte[] bArr = c36208Tq5.f36326a;
                            long j4 = size;
                            int min = (int) Math.min(c36208Tq5.f36328c, (c36208Tq5.f36327b + size3) - size);
                            for (int i = (int) ((c36208Tq5.f36327b + j2) - j4); i < min; i++) {
                                if (bArr[i] == b && BJ6.m114104c(c36208Tq5, i + 1, mo43596k, 1, size2)) {
                                    return (i - c36208Tq5.f36327b) + j4;
                                }
                            }
                            size = j4 + (c36208Tq5.f36328c - c36208Tq5.f36327b);
                            c36208Tq5 = c36208Tq5.f36331f;
                            Intrinsics.checkNotNull(c36208Tq5);
                            j2 = size;
                        }
                    } else {
                        while (true) {
                            long j5 = (c36208Tq5.f36328c - c36208Tq5.f36327b) + j3;
                            if (j5 > j2) {
                                break;
                            }
                            c36208Tq5 = c36208Tq5.f36331f;
                            Intrinsics.checkNotNull(c36208Tq5);
                            j3 = j5;
                        }
                        byte[] mo43596k2 = bytes.mo43596k();
                        byte b2 = mo43596k2[0];
                        int size4 = bytes.size();
                        long size5 = (size() - size4) + 1;
                        while (j3 < size5) {
                            byte[] bArr2 = c36208Tq5.f36326a;
                            long j6 = size5;
                            int min2 = (int) Math.min(c36208Tq5.f36328c, (c36208Tq5.f36327b + size5) - j3);
                            for (int i2 = (int) ((c36208Tq5.f36327b + j2) - j3); i2 < min2; i2++) {
                                if (bArr2[i2] == b2 && BJ6.m114104c(c36208Tq5, i2 + 1, mo43596k2, 1, size4)) {
                                    return (i2 - c36208Tq5.f36327b) + j3;
                                }
                            }
                            j3 += c36208Tq5.f36328c - c36208Tq5.f36327b;
                            c36208Tq5 = c36208Tq5.f36331f;
                            Intrinsics.checkNotNull(c36208Tq5);
                            j2 = j3;
                            size5 = j6;
                        }
                    }
                }
                return -1L;
            }
            throw new IllegalArgumentException(("fromIndex < 0: " + j2).toString());
        }
        throw new IllegalArgumentException("bytes is empty".toString());
    }

    @Override // p000.InterfaceC45453n30
    /* renamed from: r0 */
    public C42488i30 mo24530a2(String string) {
        Intrinsics.checkNotNullParameter(string, "string");
        return mo24526g0(string, 0, string.length());
    }

    @Override // p000.InterfaceC46046o30
    /* renamed from: r1 */
    public String mo21932r1() {
        return m34574D(this.f86658c, Charsets.UTF_8);
    }

    @Override // p000.InterfaceC46046o30
    /* renamed from: r2 */
    public byte[] mo21931r2(long j) throws EOFException {
        boolean z;
        if (j >= 0 && j <= 2147483647L) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (size() >= j) {
                byte[] bArr = new byte[(int) j];
                readFully(bArr);
                return bArr;
            }
            throw new EOFException();
        }
        throw new IllegalArgumentException(("byteCount: " + j).toString());
    }

    @Override // java.nio.channels.ReadableByteChannel
    public int read(ByteBuffer sink) throws IOException {
        Intrinsics.checkNotNullParameter(sink, "sink");
        C36208Tq5 c36208Tq5 = this.f86657b;
        if (c36208Tq5 == null) {
            return -1;
        }
        int min = Math.min(sink.remaining(), c36208Tq5.f36328c - c36208Tq5.f36327b);
        sink.put(c36208Tq5.f36326a, c36208Tq5.f36327b, min);
        int i = c36208Tq5.f36327b + min;
        c36208Tq5.f36327b = i;
        this.f86658c -= min;
        if (i == c36208Tq5.f36328c) {
            this.f86657b = c36208Tq5.m82375b();
            C38799br5.m62277b(c36208Tq5);
        }
        return min;
    }

    @Override // p000.InterfaceC46046o30
    public byte readByte() throws EOFException {
        if (size() != 0) {
            C36208Tq5 c36208Tq5 = this.f86657b;
            Intrinsics.checkNotNull(c36208Tq5);
            int i = c36208Tq5.f36327b;
            int i2 = c36208Tq5.f36328c;
            int i3 = i + 1;
            byte b = c36208Tq5.f36326a[i];
            m34571O(size() - 1);
            if (i3 == i2) {
                this.f86657b = c36208Tq5.m82375b();
                C38799br5.m62277b(c36208Tq5);
            } else {
                c36208Tq5.f36327b = i3;
            }
            return b;
        }
        throw new EOFException();
    }

    @Override // p000.InterfaceC46046o30
    public void readFully(byte[] sink) throws EOFException {
        Intrinsics.checkNotNullParameter(sink, "sink");
        int i = 0;
        while (i < sink.length) {
            int read = read(sink, i, sink.length - i);
            if (read != -1) {
                i += read;
            } else {
                throw new EOFException();
            }
        }
    }

    @Override // p000.InterfaceC46046o30
    public int readInt() throws EOFException {
        if (size() >= 4) {
            C36208Tq5 c36208Tq5 = this.f86657b;
            Intrinsics.checkNotNull(c36208Tq5);
            int i = c36208Tq5.f36327b;
            int i2 = c36208Tq5.f36328c;
            if (i2 - i < 4) {
                return ((readByte() & UByte.MAX_VALUE) << 24) | ((readByte() & UByte.MAX_VALUE) << 16) | ((readByte() & UByte.MAX_VALUE) << 8) | (readByte() & UByte.MAX_VALUE);
            }
            byte[] bArr = c36208Tq5.f36326a;
            int i3 = i + 1;
            int i4 = i3 + 1;
            int i5 = ((bArr[i] & UByte.MAX_VALUE) << 24) | ((bArr[i3] & UByte.MAX_VALUE) << 16);
            int i6 = i4 + 1;
            int i7 = i5 | ((bArr[i4] & UByte.MAX_VALUE) << 8);
            int i8 = i6 + 1;
            int i9 = i7 | (bArr[i6] & UByte.MAX_VALUE);
            m34571O(size() - 4);
            if (i8 == i2) {
                this.f86657b = c36208Tq5.m82375b();
                C38799br5.m62277b(c36208Tq5);
            } else {
                c36208Tq5.f36327b = i8;
            }
            return i9;
        }
        throw new EOFException();
    }

    @Override // p000.InterfaceC46046o30
    public long readLong() throws EOFException {
        if (size() >= 8) {
            C36208Tq5 c36208Tq5 = this.f86657b;
            Intrinsics.checkNotNull(c36208Tq5);
            int i = c36208Tq5.f36327b;
            int i2 = c36208Tq5.f36328c;
            if (i2 - i < 8) {
                return ((readInt() & 4294967295L) << 32) | (4294967295L & readInt());
            }
            byte[] bArr = c36208Tq5.f36326a;
            int i3 = i + 1;
            int i4 = i3 + 1;
            int i5 = i4 + 1;
            int i6 = i5 + 1;
            int i7 = i6 + 1;
            int i8 = i7 + 1;
            long j = ((bArr[i] & 255) << 56) | ((bArr[i3] & 255) << 48) | ((bArr[i4] & 255) << 40) | ((bArr[i5] & 255) << 32) | ((bArr[i6] & 255) << 24) | ((bArr[i7] & 255) << 16);
            int i9 = i8 + 1;
            int i10 = i9 + 1;
            long j2 = j | ((bArr[i8] & 255) << 8) | (bArr[i9] & 255);
            m34571O(size() - 8);
            if (i10 == i2) {
                this.f86657b = c36208Tq5.m82375b();
                C38799br5.m62277b(c36208Tq5);
            } else {
                c36208Tq5.f36327b = i10;
            }
            return j2;
        }
        throw new EOFException();
    }

    @Override // p000.InterfaceC46046o30
    public short readShort() throws EOFException {
        if (size() >= 2) {
            C36208Tq5 c36208Tq5 = this.f86657b;
            Intrinsics.checkNotNull(c36208Tq5);
            int i = c36208Tq5.f36327b;
            int i2 = c36208Tq5.f36328c;
            if (i2 - i < 2) {
                return (short) (((readByte() & UByte.MAX_VALUE) << 8) | (readByte() & UByte.MAX_VALUE));
            }
            byte[] bArr = c36208Tq5.f36326a;
            int i3 = i + 1;
            int i4 = i3 + 1;
            int i5 = ((bArr[i] & UByte.MAX_VALUE) << 8) | (bArr[i3] & UByte.MAX_VALUE);
            m34571O(size() - 2);
            if (i4 == i2) {
                this.f86657b = c36208Tq5.m82375b();
                C38799br5.m62277b(c36208Tq5);
            } else {
                c36208Tq5.f36327b = i4;
            }
            return (short) i5;
        }
        throw new EOFException();
    }

    @JvmName(name = "size")
    public final long size() {
        return this.f86658c;
    }

    @Override // p000.InterfaceC46046o30
    public void skip(long j) throws EOFException {
        while (j > 0) {
            C36208Tq5 c36208Tq5 = this.f86657b;
            if (c36208Tq5 != null) {
                int min = (int) Math.min(j, c36208Tq5.f36328c - c36208Tq5.f36327b);
                long j2 = min;
                m34571O(size() - j2);
                j -= j2;
                int i = c36208Tq5.f36327b + min;
                c36208Tq5.f36327b = i;
                if (i == c36208Tq5.f36328c) {
                    this.f86657b = c36208Tq5.m82375b();
                    C38799br5.m62277b(c36208Tq5);
                }
            } else {
                throw new EOFException();
            }
        }
    }

    /* renamed from: t */
    public long m34543t(M70 targetBytes, long j) {
        boolean z;
        int i;
        int i2;
        Intrinsics.checkNotNullParameter(targetBytes, "targetBytes");
        long j2 = 0;
        if (j >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            C36208Tq5 c36208Tq5 = this.f86657b;
            if (c36208Tq5 == null) {
                return -1L;
            }
            if (size() - j < j) {
                j2 = size();
                while (j2 > j) {
                    c36208Tq5 = c36208Tq5.f36332g;
                    Intrinsics.checkNotNull(c36208Tq5);
                    j2 -= c36208Tq5.f36328c - c36208Tq5.f36327b;
                }
                if (targetBytes.size() == 2) {
                    byte m95808e = targetBytes.m95808e(0);
                    byte m95808e2 = targetBytes.m95808e(1);
                    while (j2 < size()) {
                        byte[] bArr = c36208Tq5.f36326a;
                        i = (int) ((c36208Tq5.f36327b + j) - j2);
                        int i3 = c36208Tq5.f36328c;
                        while (i < i3) {
                            byte b = bArr[i];
                            if (b != m95808e && b != m95808e2) {
                                i++;
                            }
                            i2 = c36208Tq5.f36327b;
                        }
                        j2 += c36208Tq5.f36328c - c36208Tq5.f36327b;
                        c36208Tq5 = c36208Tq5.f36331f;
                        Intrinsics.checkNotNull(c36208Tq5);
                        j = j2;
                    }
                    return -1L;
                }
                byte[] mo43596k = targetBytes.mo43596k();
                while (j2 < size()) {
                    byte[] bArr2 = c36208Tq5.f36326a;
                    i = (int) ((c36208Tq5.f36327b + j) - j2);
                    int i4 = c36208Tq5.f36328c;
                    while (i < i4) {
                        byte b2 = bArr2[i];
                        for (byte b3 : mo43596k) {
                            if (b2 == b3) {
                                i2 = c36208Tq5.f36327b;
                            }
                        }
                        i++;
                    }
                    j2 += c36208Tq5.f36328c - c36208Tq5.f36327b;
                    c36208Tq5 = c36208Tq5.f36331f;
                    Intrinsics.checkNotNull(c36208Tq5);
                    j = j2;
                }
                return -1L;
            }
            while (true) {
                long j3 = (c36208Tq5.f36328c - c36208Tq5.f36327b) + j2;
                if (j3 > j) {
                    break;
                }
                c36208Tq5 = c36208Tq5.f36331f;
                Intrinsics.checkNotNull(c36208Tq5);
                j2 = j3;
            }
            if (targetBytes.size() == 2) {
                byte m95808e3 = targetBytes.m95808e(0);
                byte m95808e4 = targetBytes.m95808e(1);
                while (j2 < size()) {
                    byte[] bArr3 = c36208Tq5.f36326a;
                    i = (int) ((c36208Tq5.f36327b + j) - j2);
                    int i5 = c36208Tq5.f36328c;
                    while (i < i5) {
                        byte b4 = bArr3[i];
                        if (b4 != m95808e3 && b4 != m95808e4) {
                            i++;
                        }
                        i2 = c36208Tq5.f36327b;
                    }
                    j2 += c36208Tq5.f36328c - c36208Tq5.f36327b;
                    c36208Tq5 = c36208Tq5.f36331f;
                    Intrinsics.checkNotNull(c36208Tq5);
                    j = j2;
                }
                return -1L;
            }
            byte[] mo43596k2 = targetBytes.mo43596k();
            while (j2 < size()) {
                byte[] bArr4 = c36208Tq5.f36326a;
                i = (int) ((c36208Tq5.f36327b + j) - j2);
                int i6 = c36208Tq5.f36328c;
                while (i < i6) {
                    byte b5 = bArr4[i];
                    for (byte b6 : mo43596k2) {
                        if (b5 == b6) {
                            i2 = c36208Tq5.f36327b;
                        }
                    }
                    i++;
                }
                j2 += c36208Tq5.f36328c - c36208Tq5.f36327b;
                c36208Tq5 = c36208Tq5.f36331f;
                Intrinsics.checkNotNull(c36208Tq5);
                j = j2;
            }
            return -1L;
            return (i - i2) + j2;
        }
        throw new IllegalArgumentException(("fromIndex < 0: " + j).toString());
    }

    @Override // p000.InterfaceC45453n30
    /* renamed from: t0 */
    public C42488i30 mo24526g0(String string, int i, int i2) {
        boolean z;
        boolean z2;
        boolean z3;
        char charAt;
        char c;
        boolean z4;
        Intrinsics.checkNotNullParameter(string, "string");
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (i2 >= i) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                if (i2 <= string.length()) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (z3) {
                    while (i < i2) {
                        char charAt2 = string.charAt(i);
                        if (charAt2 < 128) {
                            C36208Tq5 m34568S = m34568S(1);
                            byte[] bArr = m34568S.f36326a;
                            int i3 = m34568S.f36328c - i;
                            int min = Math.min(i2, 8192 - i3);
                            int i4 = i + 1;
                            bArr[i + i3] = (byte) charAt2;
                            while (true) {
                                i = i4;
                                if (i >= min || (charAt = string.charAt(i)) >= 128) {
                                    break;
                                }
                                i4 = i + 1;
                                bArr[i + i3] = (byte) charAt;
                            }
                            int i5 = m34568S.f36328c;
                            int i6 = (i3 + i) - i5;
                            m34568S.f36328c = i5 + i6;
                            m34571O(size() + i6);
                        } else {
                            if (charAt2 < 2048) {
                                C36208Tq5 m34568S2 = m34568S(2);
                                byte[] bArr2 = m34568S2.f36326a;
                                int i7 = m34568S2.f36328c;
                                bArr2[i7] = (byte) ((charAt2 >> 6) | 192);
                                bArr2[i7 + 1] = (byte) ((charAt2 & '?') | 128);
                                m34568S2.f36328c = i7 + 2;
                                m34571O(size() + 2);
                            } else if (charAt2 >= 55296 && charAt2 <= 57343) {
                                int i8 = i + 1;
                                if (i8 < i2) {
                                    c = string.charAt(i8);
                                } else {
                                    c = 0;
                                }
                                if (charAt2 <= 56319) {
                                    if (56320 <= c && c < 57344) {
                                        z4 = true;
                                    } else {
                                        z4 = false;
                                    }
                                    if (z4) {
                                        int i9 = (((charAt2 & 1023) << 10) | (c & 1023)) + 65536;
                                        C36208Tq5 m34568S3 = m34568S(4);
                                        byte[] bArr3 = m34568S3.f36326a;
                                        int i10 = m34568S3.f36328c;
                                        bArr3[i10] = (byte) ((i9 >> 18) | 240);
                                        bArr3[i10 + 1] = (byte) (((i9 >> 12) & 63) | 128);
                                        bArr3[i10 + 2] = (byte) (((i9 >> 6) & 63) | 128);
                                        bArr3[i10 + 3] = (byte) ((i9 & 63) | 128);
                                        m34568S3.f36328c = i10 + 4;
                                        m34571O(size() + 4);
                                        i += 2;
                                    }
                                }
                                mo24534M0(63);
                                i = i8;
                            } else {
                                C36208Tq5 m34568S4 = m34568S(3);
                                byte[] bArr4 = m34568S4.f36326a;
                                int i11 = m34568S4.f36328c;
                                bArr4[i11] = (byte) ((charAt2 >> '\f') | 224);
                                bArr4[i11 + 1] = (byte) ((63 & (charAt2 >> 6)) | 128);
                                bArr4[i11 + 2] = (byte) ((charAt2 & '?') | 128);
                                m34568S4.f36328c = i11 + 3;
                                m34571O(size() + 3);
                            }
                            i++;
                        }
                    }
                    return this;
                }
                throw new IllegalArgumentException(("endIndex > string.length: " + i2 + " > " + string.length()).toString());
            }
            throw new IllegalArgumentException(("endIndex < beginIndex: " + i2 + " < " + i).toString());
        }
        throw new IllegalArgumentException(("beginIndex < 0: " + i).toString());
    }

    @Override // p000.AN5
    public J46 timeout() {
        return J46.NONE;
    }

    public String toString() {
        return m34570P().toString();
    }

    /* renamed from: u0 */
    public C42488i30 m34541u0(int i) {
        if (i < 128) {
            mo24534M0(i);
        } else if (i < 2048) {
            C36208Tq5 m34568S = m34568S(2);
            byte[] bArr = m34568S.f36326a;
            int i2 = m34568S.f36328c;
            bArr[i2] = (byte) ((i >> 6) | 192);
            bArr[i2 + 1] = (byte) ((i & 63) | 128);
            m34568S.f36328c = i2 + 2;
            m34571O(size() + 2);
        } else {
            boolean z = false;
            if (55296 <= i && i < 57344) {
                z = true;
            }
            if (z) {
                mo24534M0(63);
            } else if (i < 65536) {
                C36208Tq5 m34568S2 = m34568S(3);
                byte[] bArr2 = m34568S2.f36326a;
                int i3 = m34568S2.f36328c;
                bArr2[i3] = (byte) ((i >> 12) | 224);
                bArr2[i3 + 1] = (byte) (((i >> 6) & 63) | 128);
                bArr2[i3 + 2] = (byte) ((i & 63) | 128);
                m34568S2.f36328c = i3 + 3;
                m34571O(size() + 3);
            } else if (i <= 1114111) {
                C36208Tq5 m34568S3 = m34568S(4);
                byte[] bArr3 = m34568S3.f36326a;
                int i4 = m34568S3.f36328c;
                bArr3[i4] = (byte) ((i >> 18) | 240);
                bArr3[i4 + 1] = (byte) (((i >> 12) & 63) | 128);
                bArr3[i4 + 2] = (byte) (((i >> 6) & 63) | 128);
                bArr3[i4 + 3] = (byte) ((i & 63) | 128);
                m34568S3.f36328c = i4 + 4;
                m34571O(size() + 4);
            } else {
                throw new IllegalArgumentException("Unexpected code point: 0x" + FJ6.m107311k(i));
            }
        }
        return this;
    }

    @Override // p000.InterfaceC45453n30
    /* renamed from: u3 */
    public OutputStream mo24523u3() {
        return new C23109c();
    }

    @Override // p000.InterfaceC46046o30
    /* renamed from: w3 */
    public InputStream mo21930w3() {
        return new C23108b();
    }

    @Override // java.nio.channels.WritableByteChannel
    public int write(ByteBuffer source) throws IOException {
        Intrinsics.checkNotNullParameter(source, "source");
        int remaining = source.remaining();
        int i = remaining;
        while (i > 0) {
            C36208Tq5 m34568S = m34568S(1);
            int min = Math.min(i, 8192 - m34568S.f36328c);
            source.get(m34568S.f36326a, m34568S.f36328c, min);
            i -= min;
            m34568S.f36328c += min;
        }
        this.f86658c += remaining;
        return remaining;
    }

    @Override // p000.InterfaceC46046o30
    /* renamed from: x1 */
    public long mo21929x1(M70 targetBytes) {
        Intrinsics.checkNotNullParameter(targetBytes, "targetBytes");
        return m34543t(targetBytes, 0L);
    }

    @Override // p000.InterfaceC46046o30
    /* renamed from: x2 */
    public void mo21928x2(long j) throws EOFException {
        if (this.f86658c < j) {
            throw new EOFException();
        }
    }

    /* renamed from: y */
    public boolean m34540y(long j, M70 bytes, int i, int i2) {
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        if (j < 0 || i < 0 || i2 < 0 || size() - j < i2 || bytes.size() - i < i2) {
            return false;
        }
        for (int i3 = 0; i3 < i2; i3++) {
            if (m34547p(i3 + j) != bytes.m95808e(i + i3)) {
                return false;
            }
        }
        return true;
    }

    @JvmOverloads
    /* renamed from: z */
    public final C23107a m34539z(C23107a unsafeCursor) {
        Intrinsics.checkNotNullParameter(unsafeCursor, "unsafeCursor");
        return BJ6.m114106a(this, unsafeCursor);
    }

    @Metadata(m28433d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016J \u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016J\b\u0010\b\u001a\u00020\u0002H\u0016J\b\u0010\n\u001a\u00020\tH\u0016J\b\u0010\f\u001a\u00020\u000bH\u0016¨\u0006\r"}, m28432d2 = {"i30$b", "Ljava/io/InputStream;", "", "read", "", "sink", "offset", "byteCount", "available", "", "close", "", "toString", "okio"}, m28431k = 1, m28430mv = {1, 6, 0})
    /* renamed from: i30$b */
    /* loaded from: classes8.dex */
    public static final class C23108b extends InputStream {
        public C23108b() {
        }

        @Override // java.io.InputStream
        public int available() {
            return (int) Math.min(C42488i30.this.size(), Integer.MAX_VALUE);
        }

        @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        @Override // java.io.InputStream
        public int read() {
            if (C42488i30.this.size() > 0) {
                return C42488i30.this.readByte() & UByte.MAX_VALUE;
            }
            return -1;
        }

        public String toString() {
            return C42488i30.this + ".inputStream()";
        }

        @Override // java.io.InputStream
        public int read(byte[] sink, int i, int i2) {
            Intrinsics.checkNotNullParameter(sink, "sink");
            return C42488i30.this.read(sink, i, i2);
        }
    }

    @Override // p000.InterfaceC50872wB5
    public void write(C42488i30 source, long j) {
        C36208Tq5 c36208Tq5;
        C36208Tq5 c36208Tq52;
        Intrinsics.checkNotNullParameter(source, "source");
        if (source != this) {
            FJ6.m107320b(source.size(), 0L, j);
            while (j > 0) {
                C36208Tq5 c36208Tq53 = source.f86657b;
                Intrinsics.checkNotNull(c36208Tq53);
                int i = c36208Tq53.f36328c;
                Intrinsics.checkNotNull(source.f86657b);
                if (j < i - c36208Tq5.f36327b) {
                    C36208Tq5 c36208Tq54 = this.f86657b;
                    if (c36208Tq54 != null) {
                        Intrinsics.checkNotNull(c36208Tq54);
                        c36208Tq52 = c36208Tq54.f36332g;
                    } else {
                        c36208Tq52 = null;
                    }
                    if (c36208Tq52 != null && c36208Tq52.f36330e) {
                        if ((c36208Tq52.f36328c + j) - (c36208Tq52.f36329d ? 0 : c36208Tq52.f36327b) <= FileAppender.DEFAULT_BUFFER_SIZE) {
                            C36208Tq5 c36208Tq55 = source.f86657b;
                            Intrinsics.checkNotNull(c36208Tq55);
                            c36208Tq55.m82370g(c36208Tq52, (int) j);
                            source.m34571O(source.size() - j);
                            m34571O(size() + j);
                            return;
                        }
                    }
                    C36208Tq5 c36208Tq56 = source.f86657b;
                    Intrinsics.checkNotNull(c36208Tq56);
                    source.f86657b = c36208Tq56.m82372e((int) j);
                }
                C36208Tq5 c36208Tq57 = source.f86657b;
                Intrinsics.checkNotNull(c36208Tq57);
                long j2 = c36208Tq57.f36328c - c36208Tq57.f36327b;
                source.f86657b = c36208Tq57.m82375b();
                C36208Tq5 c36208Tq58 = this.f86657b;
                if (c36208Tq58 == null) {
                    this.f86657b = c36208Tq57;
                    c36208Tq57.f36332g = c36208Tq57;
                    c36208Tq57.f36331f = c36208Tq57;
                } else {
                    Intrinsics.checkNotNull(c36208Tq58);
                    C36208Tq5 c36208Tq59 = c36208Tq58.f36332g;
                    Intrinsics.checkNotNull(c36208Tq59);
                    c36208Tq59.m82374c(c36208Tq57).m82376a();
                }
                source.m34571O(source.size() - j2);
                m34571O(size() + j2);
                j -= j2;
            }
            return;
        }
        throw new IllegalArgumentException("source == this".toString());
    }

    public int read(byte[] sink, int i, int i2) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        FJ6.m107320b(sink.length, i, i2);
        C36208Tq5 c36208Tq5 = this.f86657b;
        if (c36208Tq5 == null) {
            return -1;
        }
        int min = Math.min(i2, c36208Tq5.f36328c - c36208Tq5.f36327b);
        byte[] bArr = c36208Tq5.f36326a;
        int i3 = c36208Tq5.f36327b;
        ArraysKt.copyInto(bArr, sink, i, i3, i3 + min);
        c36208Tq5.f36327b += min;
        m34571O(size() - min);
        if (c36208Tq5.f36327b == c36208Tq5.f36328c) {
            this.f86657b = c36208Tq5.m82375b();
            C38799br5.m62277b(c36208Tq5);
        }
        return min;
    }

    @Override // p000.AN5
    public long read(C42488i30 sink, long j) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        if (j >= 0) {
            if (size() == 0) {
                return -1L;
            }
            if (j > size()) {
                j = size();
            }
            sink.write(this, j);
            return j;
        }
        throw new IllegalArgumentException(("byteCount < 0: " + j).toString());
    }
}
