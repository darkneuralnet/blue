package p000;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import com.stripe.android.stripe3ds2.transactions.MessageExtension;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.UByte;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmName;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;
@Metadata(m28433d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0005\n\u0002\b\u0006\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0016\b\u0016\u0018\u0000 \u001e2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u000fB\u0011\b\u0000\u0012\u0006\u00108\u001a\u00020!¢\u0006\u0004\bE\u0010FJ\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\u0010\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0002J\b\u0010\u000b\u001a\u00020\nH\u0016J\u0010\u0010\u000e\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0016J\b\u0010\u000f\u001a\u00020\nH\u0016J\u0006\u0010\u0010\u001a\u00020\u0000J\u0006\u0010\u0011\u001a\u00020\u0000J\u0006\u0010\u0012\u001a\u00020\u0000J\u0017\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\nH\u0010¢\u0006\u0004\b\u0014\u0010\u0015J\b\u0010\u0016\u001a\u00020\nH\u0016J\b\u0010\u0017\u001a\u00020\u0000H\u0016J\u0017\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0019\u001a\u00020\u0018H\u0010¢\u0006\u0004\b\u001b\u0010\u001cJ\u0018\u0010\u001e\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u0018H\u0087\u0002¢\u0006\u0004\b\u001e\u0010\u001cJ\u000f\u0010\u001f\u001a\u00020\u0018H\u0010¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010\"\u001a\u00020!H\u0010¢\u0006\u0004\b\"\u0010#J'\u0010(\u001a\u00020\u00052\u0006\u0010%\u001a\u00020$2\u0006\u0010&\u001a\u00020\u00182\u0006\u0010'\u001a\u00020\u0018H\u0010¢\u0006\u0004\b(\u0010)J(\u0010-\u001a\u00020,2\u0006\u0010&\u001a\u00020\u00182\u0006\u0010*\u001a\u00020\u00002\u0006\u0010+\u001a\u00020\u00182\u0006\u0010'\u001a\u00020\u0018H\u0016J(\u0010.\u001a\u00020,2\u0006\u0010&\u001a\u00020\u00182\u0006\u0010*\u001a\u00020!2\u0006\u0010+\u001a\u00020\u00182\u0006\u0010'\u001a\u00020\u0018H\u0016J\u000e\u00100\u001a\u00020,2\u0006\u0010/\u001a\u00020\u0000J\u0013\u00102\u001a\u00020,2\b\u0010*\u001a\u0004\u0018\u000101H\u0096\u0002J\b\u00103\u001a\u00020\u0018H\u0016J\u0011\u00104\u001a\u00020\u00182\u0006\u0010*\u001a\u00020\u0000H\u0096\u0002J\b\u00105\u001a\u00020\nH\u0016R\u001a\u00108\u001a\u00020!8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b4\u00106\u001a\u0004\b7\u0010#R\"\u00103\u001a\u00020\u00188\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0014\u00109\u001a\u0004\b:\u0010 \"\u0004\b;\u0010<R$\u0010C\u001a\u0004\u0018\u00010\n8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@\"\u0004\bA\u0010BR\u0011\u0010D\u001a\u00020\u00188G¢\u0006\u0006\u001a\u0004\bD\u0010 ¨\u0006G"}, m28432d2 = {"LM70;", "Ljava/io/Serializable;", "", "Ljava/io/ObjectInputStream;", "in", "", "readObject", "Ljava/io/ObjectOutputStream;", "out", "writeObject", "", "w", "Ljava/nio/charset/Charset;", "charset", "u", C17296a.f69688o, "m", "r", "s", "algorithm", "c", "(Ljava/lang/String;)LM70;", "j", "v", "", "pos", "", "l", "(I)B", "index", "e", "h", "()I", "", "k", "()[B", "Li30;", "buffer", "offset", "byteCount", "E", "(Li30;II)V", LegacyRepairType.OTHER_KEY, "otherOffset", "", "n", "o", "prefix", "t", "", "equals", "hashCode", "b", "toString", "[B", "f", MessageExtension.FIELD_DATA, "I", "g", "p", "(I)V", DateTokenConverter.CONVERTER_KEY, "Ljava/lang/String;", "i", "()Ljava/lang/String;", "q", "(Ljava/lang/String;)V", "utf8", "size", "<init>", "([B)V", "okio"}, m28431k = 1, m28430mv = {1, 6, 0})
/* renamed from: M70 */
/* loaded from: classes8.dex */
public class M70 implements Serializable, Comparable<M70> {

    /* renamed from: e */
    public static final C5195a f22644e = new C5195a(null);
    @JvmField

    /* renamed from: f */
    public static final M70 f22645f = new M70(new byte[0]);
    private static final long serialVersionUID = 1;

    /* renamed from: b */
    public final byte[] f22646b;

    /* renamed from: c */
    public transient int f22647c;

    /* renamed from: d */
    public transient String f22648d;

    @Metadata(m28433d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0012\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ'\u0010\u0007\u001a\u00020\u0006*\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\f\u0010\n\u001a\u00020\u0006*\u00020\tH\u0007J\u001d\u0010\r\u001a\u00020\u0006*\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u000e\u0010\u000f\u001a\u0004\u0018\u00010\u0006*\u00020\tH\u0007J\f\u0010\u0010\u001a\u00020\u0006*\u00020\tH\u0007J\u001b\u0010\u0012\u001a\u00020\u0006*\u00020\u00112\u0006\u0010\u0005\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u001b"}, m28432d2 = {"LM70$a;", "", "", "", "offset", "byteCount", "LM70;", "e", "([BII)LM70;", "", DateTokenConverter.CONVERTER_KEY, "Ljava/nio/charset/Charset;", "charset", "c", "(Ljava/lang/String;Ljava/nio/charset/Charset;)LM70;", C17296a.f69688o, "b", "Ljava/io/InputStream;", "g", "(Ljava/io/InputStream;I)LM70;", "EMPTY", "LM70;", "", "serialVersionUID", "J", "<init>", "()V", "okio"}, m28431k = 1, m28430mv = {1, 6, 0})
    /* renamed from: M70$a */
    /* loaded from: classes8.dex */
    public static final class C5195a {
        public /* synthetic */ C5195a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: f */
        public static /* synthetic */ M70 m95792f(C5195a c5195a, byte[] bArr, int i, int i2, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                i = 0;
            }
            if ((i3 & 2) != 0) {
                i2 = FJ6.m107319c();
            }
            return c5195a.m95793e(bArr, i, i2);
        }

        @JvmStatic
        /* renamed from: a */
        public final M70 m95797a(String str) {
            Intrinsics.checkNotNullParameter(str, "<this>");
            byte[] m115917a = AJ6.m115917a(str);
            if (m115917a != null) {
                return new M70(m115917a);
            }
            return null;
        }

        @JvmStatic
        /* renamed from: b */
        public final M70 m95796b(String str) {
            boolean z;
            Intrinsics.checkNotNullParameter(str, "<this>");
            if (str.length() % 2 == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                int length = str.length() / 2;
                byte[] bArr = new byte[length];
                for (int i = 0; i < length; i++) {
                    int i2 = i * 2;
                    bArr[i] = (byte) ((CJ6.m112349b(str.charAt(i2)) << 4) + CJ6.m112349b(str.charAt(i2 + 1)));
                }
                return new M70(bArr);
            }
            throw new IllegalArgumentException(("Unexpected hex string: " + str).toString());
        }

        @JvmStatic
        @JvmName(name = "encodeString")
        /* renamed from: c */
        public final M70 m95795c(String str, Charset charset) {
            Intrinsics.checkNotNullParameter(str, "<this>");
            Intrinsics.checkNotNullParameter(charset, "charset");
            byte[] bytes = str.getBytes(charset);
            Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
            return new M70(bytes);
        }

        @JvmStatic
        /* renamed from: d */
        public final M70 m95794d(String str) {
            Intrinsics.checkNotNullParameter(str, "<this>");
            M70 m70 = new M70(DJ6.m110576a(str));
            m70.m95802q(str);
            return m70;
        }

        @JvmStatic
        @JvmName(name = "of")
        /* renamed from: e */
        public final M70 m95793e(byte[] bArr, int i, int i2) {
            byte[] copyOfRange;
            Intrinsics.checkNotNullParameter(bArr, "<this>");
            int m107316f = FJ6.m107316f(bArr, i2);
            FJ6.m107320b(bArr.length, i, m107316f);
            copyOfRange = ArraysKt___ArraysJvmKt.copyOfRange(bArr, i, m107316f + i);
            return new M70(copyOfRange);
        }

        @JvmStatic
        @JvmName(name = "read")
        /* renamed from: g */
        public final M70 m95791g(InputStream inputStream, int i) throws IOException {
            boolean z;
            Intrinsics.checkNotNullParameter(inputStream, "<this>");
            int i2 = 0;
            if (i >= 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                byte[] bArr = new byte[i];
                while (i2 < i) {
                    int read = inputStream.read(bArr, i2, i - i2);
                    if (read != -1) {
                        i2 += read;
                    } else {
                        throw new EOFException();
                    }
                }
                return new M70(bArr);
            }
            throw new IllegalArgumentException(("byteCount < 0: " + i).toString());
        }

        private C5195a() {
        }
    }

    public M70(byte[] data) {
        Intrinsics.checkNotNullParameter(data, "data");
        this.f22646b = data;
    }

    @JvmStatic
    /* renamed from: d */
    public static final M70 m95809d(String str) {
        return f22644e.m95794d(str);
    }

    private final void readObject(ObjectInputStream objectInputStream) throws IOException {
        M70 m95791g = f22644e.m95791g(objectInputStream, objectInputStream.readInt());
        Field declaredField = M70.class.getDeclaredField("b");
        declaredField.setAccessible(true);
        declaredField.set(this, m95791g.f22646b);
    }

    private final void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.writeInt(this.f22646b.length);
        objectOutputStream.write(this.f22646b);
    }

    /* renamed from: E */
    public void mo43605E(C42488i30 buffer, int i, int i2) {
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        CJ6.m112347d(this, buffer, i, i2);
    }

    /* renamed from: a */
    public String mo43600a() {
        return AJ6.m115915c(m95807f(), null, 1, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x002e, code lost:
        if (r0 < r1) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0033, code lost:
        return 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:?, code lost:
        return -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0028, code lost:
        if (r7 < r8) goto L12;
     */
    @Override // java.lang.Comparable
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public int compareTo(M70 other) {
        Intrinsics.checkNotNullParameter(other, "other");
        int size = size();
        int size2 = other.size();
        int min = Math.min(size, size2);
        for (int i = 0; i < min; i++) {
            int m95808e = m95808e(i) & UByte.MAX_VALUE;
            int m95808e2 = other.m95808e(i) & UByte.MAX_VALUE;
            if (m95808e == m95808e2) {
            }
        }
        if (size == size2) {
            return 0;
        }
    }

    /* renamed from: c */
    public M70 mo43599c(String algorithm) {
        Intrinsics.checkNotNullParameter(algorithm, "algorithm");
        MessageDigest messageDigest = MessageDigest.getInstance(algorithm);
        messageDigest.update(this.f22646b, 0, size());
        byte[] digestBytes = messageDigest.digest();
        Intrinsics.checkNotNullExpressionValue(digestBytes, "digestBytes");
        return new M70(digestBytes);
    }

    @JvmName(name = "getByte")
    /* renamed from: e */
    public final byte m95808e(int i) {
        return mo43595l(i);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof M70) {
            M70 m70 = (M70) obj;
            if (m70.size() == m95807f().length && m70.mo43593o(0, m95807f(), 0, m95807f().length)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: f */
    public final byte[] m95807f() {
        return this.f22646b;
    }

    /* renamed from: g */
    public final int m95806g() {
        return this.f22647c;
    }

    /* renamed from: h */
    public int mo43598h() {
        return m95807f().length;
    }

    public int hashCode() {
        int m95806g = m95806g();
        if (m95806g == 0) {
            int hashCode = Arrays.hashCode(m95807f());
            m95803p(hashCode);
            return hashCode;
        }
        return m95806g;
    }

    /* renamed from: i */
    public final String m95805i() {
        return this.f22648d;
    }

    /* renamed from: j */
    public String mo43597j() {
        byte[] m95807f;
        String concatToString;
        char[] cArr = new char[m95807f().length * 2];
        int i = 0;
        for (byte b : m95807f()) {
            int i2 = i + 1;
            cArr[i] = CJ6.m112345f()[(b >> 4) & 15];
            i = i2 + 1;
            cArr[i2] = CJ6.m112345f()[b & 15];
        }
        concatToString = StringsKt__StringsJVMKt.concatToString(cArr);
        return concatToString;
    }

    /* renamed from: k */
    public byte[] mo43596k() {
        return m95807f();
    }

    /* renamed from: l */
    public byte mo43595l(int i) {
        return m95807f()[i];
    }

    /* renamed from: m */
    public final M70 m95804m() {
        return mo43599c("MD5");
    }

    /* renamed from: n */
    public boolean mo43594n(int i, M70 other, int i2, int i3) {
        Intrinsics.checkNotNullParameter(other, "other");
        return other.mo43593o(i2, m95807f(), i, i3);
    }

    /* renamed from: o */
    public boolean mo43593o(int i, byte[] other, int i2, int i3) {
        Intrinsics.checkNotNullParameter(other, "other");
        if (i >= 0 && i <= m95807f().length - i3 && i2 >= 0 && i2 <= other.length - i3 && FJ6.m107321a(m95807f(), i, other, i2, i3)) {
            return true;
        }
        return false;
    }

    /* renamed from: p */
    public final void m95803p(int i) {
        this.f22647c = i;
    }

    /* renamed from: q */
    public final void m95802q(String str) {
        this.f22648d = str;
    }

    /* renamed from: r */
    public final M70 m95801r() {
        return mo43599c("SHA-1");
    }

    /* renamed from: s */
    public final M70 m95800s() {
        return mo43599c("SHA-256");
    }

    @JvmName(name = "size")
    public final int size() {
        return mo43598h();
    }

    /* renamed from: t */
    public final boolean m95799t(M70 prefix) {
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        return mo43594n(0, prefix, 0, prefix.size());
    }

    public String toString() {
        boolean z;
        String replace$default;
        String replace$default2;
        String replace$default3;
        boolean z2;
        M70 m70;
        byte[] copyOfRange;
        String str;
        boolean z3 = true;
        if (m95807f().length == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            str = "[size=0]";
        } else {
            int m112350a = CJ6.m112350a(m95807f(), 64);
            if (m112350a == -1) {
                if (m95807f().length <= 64) {
                    str = "[hex=" + mo43597j() + ']';
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append("[size=");
                    sb.append(m95807f().length);
                    sb.append(" hex=");
                    int m107317e = FJ6.m107317e(this, 64);
                    if (m107317e <= m95807f().length) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (z2) {
                        if (m107317e + 0 < 0) {
                            z3 = false;
                        }
                        if (z3) {
                            if (m107317e != m95807f().length) {
                                copyOfRange = ArraysKt___ArraysJvmKt.copyOfRange(m95807f(), 0, m107317e);
                                m70 = new M70(copyOfRange);
                            } else {
                                m70 = this;
                            }
                            sb.append(m70.mo43597j());
                            sb.append("…]");
                            return sb.toString();
                        }
                        throw new IllegalArgumentException("endIndex < beginIndex".toString());
                    }
                    throw new IllegalArgumentException(("endIndex > length(" + m95807f().length + CoreConstants.RIGHT_PARENTHESIS_CHAR).toString());
                }
            } else {
                String m95798w = m95798w();
                String substring = m95798w.substring(0, m112350a);
                Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                replace$default = StringsKt__StringsJVMKt.replace$default(substring, "\\", "\\\\", false, 4, (Object) null);
                replace$default2 = StringsKt__StringsJVMKt.replace$default(replace$default, "\n", "\\n", false, 4, (Object) null);
                replace$default3 = StringsKt__StringsJVMKt.replace$default(replace$default2, "\r", "\\r", false, 4, (Object) null);
                if (m112350a < m95798w.length()) {
                    return "[size=" + m95807f().length + " text=" + replace$default3 + "…]";
                }
                return "[text=" + replace$default3 + ']';
            }
        }
        return str;
    }

    /* renamed from: u */
    public String mo43592u(Charset charset) {
        Intrinsics.checkNotNullParameter(charset, "charset");
        return new String(this.f22646b, charset);
    }

    /* renamed from: v */
    public M70 mo43591v() {
        byte b;
        for (int i = 0; i < m95807f().length; i++) {
            byte b2 = m95807f()[i];
            byte b3 = (byte) 65;
            if (b2 >= b3 && b2 <= (b = (byte) 90)) {
                byte[] m95807f = m95807f();
                byte[] copyOf = Arrays.copyOf(m95807f, m95807f.length);
                Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, size)");
                copyOf[i] = (byte) (b2 + 32);
                for (int i2 = i + 1; i2 < copyOf.length; i2++) {
                    byte b4 = copyOf[i2];
                    if (b4 >= b3 && b4 <= b) {
                        copyOf[i2] = (byte) (b4 + 32);
                    }
                }
                return new M70(copyOf);
            }
        }
        return this;
    }

    /* renamed from: w */
    public String m95798w() {
        String m95805i = m95805i();
        if (m95805i == null) {
            String m110575b = DJ6.m110575b(mo43596k());
            m95802q(m110575b);
            return m110575b;
        }
        return m95805i;
    }
}
