package p000;

import android.util.Pair;
import ch.qos.logback.core.util.FileSize;
import com.google.android.play.core.internal.C17965f;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.FileChannel;
import java.security.DigestException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.Signature;
import java.security.SignatureException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.MGF1ParameterSpec;
import java.security.spec.PSSParameterSpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import kotlin.KotlinVersion;
import okhttp3.internal.http2.Settings;
/* renamed from: XN6 */
/* loaded from: classes6.dex */
public final class XN6 {
    /* renamed from: a */
    public static Pair<ByteBuffer, Long> m77070a(RandomAccessFile randomAccessFile) throws IOException {
        if (randomAccessFile.length() < 22) {
            return null;
        }
        Pair<ByteBuffer, Long> m77063h = m77063h(randomAccessFile, 0);
        return m77063h != null ? m77063h : m77063h(randomAccessFile, Settings.DEFAULT_INITIAL_WINDOW_SIZE);
    }

    /* renamed from: b */
    public static long m77069b(ByteBuffer byteBuffer) {
        m77062i(byteBuffer);
        return m77061j(byteBuffer, byteBuffer.position() + 16);
    }

    /* renamed from: c */
    public static void m77068c(ByteBuffer byteBuffer, long j) {
        m77062i(byteBuffer);
        int position = byteBuffer.position() + 16;
        if (j >= 0 && j <= 4294967295L) {
            byteBuffer.putInt(byteBuffer.position() + position, (int) j);
            return;
        }
        StringBuilder sb = new StringBuilder(47);
        sb.append("uint32 value of out range: ");
        sb.append(j);
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: d */
    public static long m77067d(ByteBuffer byteBuffer) {
        m77062i(byteBuffer);
        return m77061j(byteBuffer, byteBuffer.position() + 12);
    }

    /* renamed from: e */
    public static String m77066e(String str, String str2) {
        StringBuilder sb = new StringBuilder(str.length() + 1 + String.valueOf(str2).length());
        sb.append(str);
        sb.append(":");
        sb.append(str2);
        return sb.toString();
    }

    /* renamed from: f */
    public static String m77065f(String str, String str2, String str3) {
        int length = str.length();
        StringBuilder sb = new StringBuilder(length + 2 + String.valueOf(str2).length() + String.valueOf(str3).length());
        sb.append(str);
        sb.append(":");
        sb.append(str2);
        sb.append(":");
        sb.append(str3);
        return sb.toString();
    }

    /* renamed from: g */
    public static X509Certificate[][] m77064g(String str) throws C17965f, SecurityException, IOException {
        RandomAccessFile randomAccessFile = new RandomAccessFile(str, "r");
        try {
            Pair<ByteBuffer, Long> m77070a = m77070a(randomAccessFile);
            if (m77070a == null) {
                long length = randomAccessFile.length();
                StringBuilder sb = new StringBuilder(102);
                sb.append("Not an APK file: ZIP End of Central Directory record not found in file with ");
                sb.append(length);
                sb.append(" bytes");
                throw new C17965f(sb.toString());
            }
            ByteBuffer byteBuffer = (ByteBuffer) m77070a.first;
            long longValue = ((Long) m77070a.second).longValue();
            long j = (-20) + longValue;
            if (j >= 0) {
                randomAccessFile.seek(j);
                if (randomAccessFile.readInt() == 1347094023) {
                    throw new C17965f("ZIP64 APK not supported");
                }
            }
            long m77069b = m77069b(byteBuffer);
            if (m77069b >= longValue) {
                StringBuilder sb2 = new StringBuilder(122);
                sb2.append("ZIP Central Directory offset out of range: ");
                sb2.append(m77069b);
                sb2.append(". ZIP End of Central Directory offset: ");
                sb2.append(longValue);
                throw new C17965f(sb2.toString());
            } else if (m77067d(byteBuffer) + m77069b == longValue) {
                if (m77069b < 32) {
                    StringBuilder sb3 = new StringBuilder(87);
                    sb3.append("APK too small for APK Signing Block. ZIP Central Directory offset: ");
                    sb3.append(m77069b);
                    throw new C17965f(sb3.toString());
                }
                ByteBuffer allocate = ByteBuffer.allocate(24);
                ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
                allocate.order(byteOrder);
                randomAccessFile.seek(m77069b - allocate.capacity());
                randomAccessFile.readFully(allocate.array(), allocate.arrayOffset(), allocate.capacity());
                if (allocate.getLong(8) == 2334950737559900225L && allocate.getLong(16) == 3617552046287187010L) {
                    int i = 0;
                    long j2 = allocate.getLong(0);
                    if (j2 < allocate.capacity() || j2 > 2147483639) {
                        StringBuilder sb4 = new StringBuilder(57);
                        sb4.append("APK Signing Block size out of range: ");
                        sb4.append(j2);
                        throw new C17965f(sb4.toString());
                    }
                    int i2 = (int) (8 + j2);
                    long j3 = m77069b - i2;
                    if (j3 < 0) {
                        StringBuilder sb5 = new StringBuilder(59);
                        sb5.append("APK Signing Block offset out of range: ");
                        sb5.append(j3);
                        throw new C17965f(sb5.toString());
                    }
                    ByteBuffer allocate2 = ByteBuffer.allocate(i2);
                    allocate2.order(byteOrder);
                    randomAccessFile.seek(j3);
                    randomAccessFile.readFully(allocate2.array(), allocate2.arrayOffset(), allocate2.capacity());
                    long j4 = allocate2.getLong(0);
                    if (j4 != j2) {
                        StringBuilder sb6 = new StringBuilder(103);
                        sb6.append("APK Signing Block sizes in header and footer do not match: ");
                        sb6.append(j4);
                        sb6.append(" vs ");
                        sb6.append(j2);
                        throw new C17965f(sb6.toString());
                    }
                    Pair create = Pair.create(allocate2, Long.valueOf(j3));
                    ByteBuffer byteBuffer2 = (ByteBuffer) create.first;
                    long longValue2 = ((Long) create.second).longValue();
                    if (byteBuffer2.order() == byteOrder) {
                        int capacity = byteBuffer2.capacity() - 24;
                        if (capacity < 8) {
                            StringBuilder sb7 = new StringBuilder(38);
                            sb7.append("end < start: ");
                            sb7.append(capacity);
                            sb7.append(" < ");
                            sb7.append(8);
                            throw new IllegalArgumentException(sb7.toString());
                        }
                        int capacity2 = byteBuffer2.capacity();
                        if (capacity > byteBuffer2.capacity()) {
                            StringBuilder sb8 = new StringBuilder(41);
                            sb8.append("end > capacity: ");
                            sb8.append(capacity);
                            sb8.append(" > ");
                            sb8.append(capacity2);
                            throw new IllegalArgumentException(sb8.toString());
                        }
                        int limit = byteBuffer2.limit();
                        int position = byteBuffer2.position();
                        byteBuffer2.position(0);
                        byteBuffer2.limit(capacity);
                        byteBuffer2.position(8);
                        ByteBuffer slice = byteBuffer2.slice();
                        slice.order(byteBuffer2.order());
                        byteBuffer2.position(0);
                        byteBuffer2.limit(limit);
                        byteBuffer2.position(position);
                        while (slice.hasRemaining()) {
                            i++;
                            if (slice.remaining() < 8) {
                                StringBuilder sb9 = new StringBuilder(70);
                                sb9.append("Insufficient data to read size of APK Signing Block entry #");
                                sb9.append(i);
                                throw new C17965f(sb9.toString());
                            }
                            long j5 = slice.getLong();
                            if (j5 < 4 || j5 > 2147483647L) {
                                StringBuilder sb10 = new StringBuilder(76);
                                sb10.append("APK Signing Block entry #");
                                sb10.append(i);
                                sb10.append(" size out of range: ");
                                sb10.append(j5);
                                throw new C17965f(sb10.toString());
                            }
                            int i3 = (int) j5;
                            int position2 = slice.position() + i3;
                            if (i3 > slice.remaining()) {
                                int remaining = slice.remaining();
                                StringBuilder sb11 = new StringBuilder(91);
                                sb11.append("APK Signing Block entry #");
                                sb11.append(i);
                                sb11.append(" size out of range: ");
                                sb11.append(i3);
                                sb11.append(", available: ");
                                sb11.append(remaining);
                                throw new C17965f(sb11.toString());
                            } else if (slice.getInt() == 1896449818) {
                                X509Certificate[][] m77060k = m77060k(randomAccessFile.getChannel(), new C40902fN6(m77053r(slice, i3 - 4), longValue2, m77069b, longValue, byteBuffer));
                                randomAccessFile.close();
                                return m77060k;
                            } else {
                                slice.position(position2);
                            }
                        }
                        throw new C17965f("No APK Signature Scheme v2 block in APK Signing Block");
                    }
                    throw new IllegalArgumentException("ByteBuffer byte order must be little endian");
                }
                throw new C17965f("No APK Signing Block before ZIP Central Directory");
            } else {
                throw new C17965f("ZIP Central Directory is not immediately followed by End of Central Directory");
            }
        } finally {
            try {
                randomAccessFile.close();
            } catch (IOException unused) {
            }
        }
    }

    /* renamed from: h */
    public static Pair<ByteBuffer, Long> m77063h(RandomAccessFile randomAccessFile, int i) throws IOException {
        int i2;
        long length = randomAccessFile.length();
        if (length < 22) {
            return null;
        }
        ByteBuffer allocate = ByteBuffer.allocate(((int) Math.min(i, (-22) + length)) + 22);
        allocate.order(ByteOrder.LITTLE_ENDIAN);
        long capacity = length - allocate.capacity();
        randomAccessFile.seek(capacity);
        randomAccessFile.readFully(allocate.array(), allocate.arrayOffset(), allocate.capacity());
        m77062i(allocate);
        int capacity2 = allocate.capacity();
        if (capacity2 >= 22) {
            int i3 = capacity2 - 22;
            int min = Math.min(i3, (int) Settings.DEFAULT_INITIAL_WINDOW_SIZE);
            for (int i4 = 0; i4 < min; i4++) {
                i2 = i3 - i4;
                if (allocate.getInt(i2) == 101010256 && ((char) allocate.getShort(i2 + 20)) == i4) {
                    break;
                }
            }
        }
        i2 = -1;
        if (i2 == -1) {
            return null;
        }
        allocate.position(i2);
        ByteBuffer slice = allocate.slice();
        slice.order(ByteOrder.LITTLE_ENDIAN);
        return Pair.create(slice, Long.valueOf(capacity + i2));
    }

    /* renamed from: i */
    public static void m77062i(ByteBuffer byteBuffer) {
        if (byteBuffer.order() != ByteOrder.LITTLE_ENDIAN) {
            throw new IllegalArgumentException("ByteBuffer byte order must be little endian");
        }
    }

    /* renamed from: j */
    public static long m77061j(ByteBuffer byteBuffer, int i) {
        return byteBuffer.getInt(i) & 4294967295L;
    }

    /* renamed from: k */
    public static X509Certificate[][] m77060k(FileChannel fileChannel, C40902fN6 c40902fN6) throws SecurityException {
        ByteBuffer byteBuffer;
        long j;
        long j2;
        long j3;
        ByteBuffer byteBuffer2;
        HashMap hashMap = new HashMap();
        ArrayList arrayList = new ArrayList();
        try {
            CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
            try {
                byteBuffer = c40902fN6.f80025a;
                ByteBuffer m77052s = m77052s(byteBuffer);
                int i = 0;
                while (m77052s.hasRemaining()) {
                    i++;
                    try {
                        arrayList.add(m77059l(m77052s(m77052s), hashMap, certificateFactory));
                    } catch (IOException | SecurityException | BufferUnderflowException e) {
                        StringBuilder sb = new StringBuilder(48);
                        sb.append("Failed to parse/verify signer #");
                        sb.append(i);
                        sb.append(" block");
                        throw new SecurityException(sb.toString(), e);
                    }
                }
                if (i > 0) {
                    if (hashMap.isEmpty()) {
                        throw new SecurityException("No content digests found");
                    }
                    j = c40902fN6.f80026b;
                    j2 = c40902fN6.f80027c;
                    j3 = c40902fN6.f80028d;
                    byteBuffer2 = c40902fN6.f80029e;
                    m77058m(hashMap, fileChannel, j, j2, j3, byteBuffer2);
                    return (X509Certificate[][]) arrayList.toArray(new X509Certificate[arrayList.size()]);
                }
                throw new SecurityException("No signers found");
            } catch (IOException e2) {
                throw new SecurityException("Failed to read list of signers", e2);
            }
        } catch (CertificateException e3) {
            throw new RuntimeException("Failed to obtain X.509 CertificateFactory", e3);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0048, code lost:
        r11 = m77056o(r4);
        r12 = m77056o(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0050, code lost:
        if (r11 == 1) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0052, code lost:
        if (r12 == 1) goto L19;
     */
    /* JADX WARN: Removed duplicated region for block: B:119:0x025f  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x014b A[Catch: SignatureException -> 0x026f, InvalidAlgorithmParameterException -> 0x0271, InvalidKeyException -> 0x0273, InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | SignatureException | InvalidKeySpecException -> 0x0275, NoSuchAlgorithmException -> 0x0277, TryCatch #5 {InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | SignatureException | InvalidKeySpecException -> 0x0275, blocks: (B:68:0x0135, B:70:0x014b, B:71:0x014e), top: B:138:0x0135 }] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0157  */
    /* renamed from: l */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static X509Certificate[] m77059l(ByteBuffer byteBuffer, Map<Integer, byte[]> map, CertificateFactory certificateFactory) throws SecurityException, IOException {
        String str;
        String str2;
        Pair pair;
        String str3;
        AlgorithmParameterSpec algorithmParameterSpec;
        Signature signature;
        PSSParameterSpec pSSParameterSpec;
        String str4;
        ByteBuffer m77052s = m77052s(byteBuffer);
        ByteBuffer m77052s2 = m77052s(byteBuffer);
        byte[] m77051t = m77051t(byteBuffer);
        ArrayList arrayList = new ArrayList();
        byte[] bArr = null;
        int i = -1;
        byte[] bArr2 = null;
        int i2 = 0;
        while (m77052s2.hasRemaining()) {
            i2++;
            try {
                ByteBuffer m77052s3 = m77052s(m77052s2);
                if (m77052s3.remaining() < 8) {
                    throw new SecurityException("Signature record too short");
                }
                int i3 = m77052s3.getInt();
                arrayList.add(Integer.valueOf(i3));
                if (i3 != 513 && i3 != 514 && i3 != 769) {
                    switch (i3) {
                        case 257:
                        case 258:
                        case 259:
                        case 260:
                            break;
                        default:
                            continue;
                    }
                }
                bArr2 = m77051t(m77052s3);
                i = i3;
            } catch (IOException | BufferUnderflowException e) {
                StringBuilder sb = new StringBuilder(45);
                sb.append("Failed to parse signature record #");
                sb.append(i2);
                throw new SecurityException(sb.toString(), e);
            }
        }
        if (i == -1) {
            if (i2 == 0) {
                throw new SecurityException("No signatures found");
            }
            throw new SecurityException("No supported signatures found");
        }
        if (i == 513 || i == 514) {
            str = "EC";
        } else if (i != 769) {
            switch (i) {
                case 257:
                case 258:
                case 259:
                case 260:
                    str = "RSA";
                    break;
                default:
                    String valueOf = String.valueOf(Long.toHexString(i));
                    throw new IllegalArgumentException(valueOf.length() != 0 ? "Unknown signature algorithm: 0x".concat(valueOf) : new String("Unknown signature algorithm: 0x"));
            }
        } else {
            str = "DSA";
        }
        try {
            if (i == 513) {
                str2 = "SHA256withECDSA";
            } else if (i == 514) {
                str2 = "SHA512withECDSA";
            } else if (i != 769) {
                switch (i) {
                    case 257:
                        pSSParameterSpec = new PSSParameterSpec("SHA-256", "MGF1", MGF1ParameterSpec.SHA256, 32, 1);
                        str4 = "SHA256withRSA/PSS";
                        pair = Pair.create(str4, pSSParameterSpec);
                        break;
                    case 258:
                        pSSParameterSpec = new PSSParameterSpec("SHA-512", "MGF1", MGF1ParameterSpec.SHA512, 64, 1);
                        str4 = "SHA512withRSA/PSS";
                        pair = Pair.create(str4, pSSParameterSpec);
                        break;
                    case 259:
                        str2 = "SHA256withRSA";
                        break;
                    case 260:
                        str2 = "SHA512withRSA";
                        break;
                    default:
                        String valueOf2 = String.valueOf(Long.toHexString(i));
                        throw new IllegalArgumentException(valueOf2.length() != 0 ? "Unknown signature algorithm: 0x".concat(valueOf2) : new String("Unknown signature algorithm: 0x"));
                }
                str3 = (String) pair.first;
                algorithmParameterSpec = (AlgorithmParameterSpec) pair.second;
                PublicKey generatePublic = KeyFactory.getInstance(str).generatePublic(new X509EncodedKeySpec(m77051t));
                signature = Signature.getInstance(str3);
                signature.initVerify(generatePublic);
                if (algorithmParameterSpec != null) {
                    signature.setParameter(algorithmParameterSpec);
                }
                signature.update(m77052s);
                if (signature.verify(bArr2)) {
                    throw new SecurityException(String.valueOf(str3).concat(" signature did not verify"));
                }
                m77052s.clear();
                ByteBuffer m77052s4 = m77052s(m77052s);
                ArrayList arrayList2 = new ArrayList();
                int i4 = 0;
                while (m77052s4.hasRemaining()) {
                    i4++;
                    try {
                        ByteBuffer m77052s5 = m77052s(m77052s4);
                        if (m77052s5.remaining() < 8) {
                            throw new IOException("Record too short");
                        }
                        int i5 = m77052s5.getInt();
                        arrayList2.add(Integer.valueOf(i5));
                        if (i5 == i) {
                            bArr = m77051t(m77052s5);
                        }
                    } catch (IOException | BufferUnderflowException e2) {
                        StringBuilder sb2 = new StringBuilder(42);
                        sb2.append("Failed to parse digest record #");
                        sb2.append(i4);
                        throw new IOException(sb2.toString(), e2);
                    }
                }
                if (arrayList.equals(arrayList2)) {
                    int m77056o = m77056o(i);
                    byte[] put = map.put(Integer.valueOf(m77056o), bArr);
                    if (put == null || MessageDigest.isEqual(put, bArr)) {
                        ByteBuffer m77052s6 = m77052s(m77052s);
                        ArrayList arrayList3 = new ArrayList();
                        int i6 = 0;
                        while (m77052s6.hasRemaining()) {
                            i6++;
                            byte[] m77051t2 = m77051t(m77052s6);
                            try {
                                arrayList3.add(new DN6((X509Certificate) certificateFactory.generateCertificate(new ByteArrayInputStream(m77051t2)), m77051t2));
                            } catch (CertificateException e3) {
                                StringBuilder sb3 = new StringBuilder(41);
                                sb3.append("Failed to decode certificate #");
                                sb3.append(i6);
                                throw new SecurityException(sb3.toString(), e3);
                            }
                        }
                        if (arrayList3.isEmpty()) {
                            throw new SecurityException("No certificates listed");
                        }
                        if (Arrays.equals(m77051t, ((X509Certificate) arrayList3.get(0)).getPublicKey().getEncoded())) {
                            return (X509Certificate[]) arrayList3.toArray(new X509Certificate[arrayList3.size()]);
                        }
                        throw new SecurityException("Public key mismatch between certificate and signature record");
                    }
                    throw new SecurityException(m77055p(m77056o).concat(" contents digest does not match the digest specified by a preceding signer"));
                }
                throw new SecurityException("Signature algorithms don't match between digests and signatures records");
            } else {
                str2 = "SHA256withDSA";
            }
            PublicKey generatePublic2 = KeyFactory.getInstance(str).generatePublic(new X509EncodedKeySpec(m77051t));
            signature = Signature.getInstance(str3);
            signature.initVerify(generatePublic2);
            if (algorithmParameterSpec != null) {
            }
            signature.update(m77052s);
            if (signature.verify(bArr2)) {
            }
        } catch (InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | SignatureException | InvalidKeySpecException e4) {
            StringBuilder sb4 = new StringBuilder(String.valueOf(str3).length() + 27);
            sb4.append("Failed to verify ");
            sb4.append(str3);
            sb4.append(" signature");
            throw new SecurityException(sb4.toString(), e4);
        }
        pair = Pair.create(str2, null);
        str3 = (String) pair.first;
        algorithmParameterSpec = (AlgorithmParameterSpec) pair.second;
    }

    /* renamed from: m */
    public static void m77058m(Map<Integer, byte[]> map, FileChannel fileChannel, long j, long j2, long j3, ByteBuffer byteBuffer) throws SecurityException {
        if (map.isEmpty()) {
            throw new SecurityException("No digests provided");
        }
        RM6 rm6 = new RM6(fileChannel, 0L, j);
        RM6 rm62 = new RM6(fileChannel, j2, j3 - j2);
        ByteBuffer duplicate = byteBuffer.duplicate();
        duplicate.order(ByteOrder.LITTLE_ENDIAN);
        m77068c(duplicate, j);
        UK6 uk6 = new UK6(duplicate);
        int size = map.size();
        int[] iArr = new int[size];
        int i = 0;
        for (Integer num : map.keySet()) {
            iArr[i] = num.intValue();
            i++;
        }
        try {
            byte[][] m77057n = m77057n(iArr, new InterfaceC42079hM6[]{rm6, rm62, uk6});
            for (int i2 = 0; i2 < size; i2++) {
                int i3 = iArr[i2];
                if (!MessageDigest.isEqual(map.get(Integer.valueOf(i3)), m77057n[i2])) {
                    throw new SecurityException(m77055p(i3).concat(" digest of contents did not verify"));
                }
            }
        } catch (DigestException e) {
            throw new SecurityException("Failed to compute digest(s) of contents", e);
        }
    }

    /* renamed from: n */
    public static byte[][] m77057n(int[] iArr, InterfaceC42079hM6[] interfaceC42079hM6Arr) throws DigestException {
        long j;
        int i;
        int length;
        long j2 = 0;
        long j3 = 0;
        int i2 = 0;
        while (true) {
            j = FileSize.MB_COEFFICIENT;
            if (i2 >= 3) {
                break;
            }
            j3 += (interfaceC42079hM6Arr[i2].mo36508a() + 1048575) / FileSize.MB_COEFFICIENT;
            i2++;
        }
        if (j3 >= 2097151) {
            StringBuilder sb = new StringBuilder(37);
            sb.append("Too many chunks: ");
            sb.append(j3);
            throw new DigestException(sb.toString());
        }
        int i3 = (int) j3;
        byte[][] bArr = new byte[iArr.length];
        int i4 = 0;
        while (true) {
            length = iArr.length;
            if (i4 >= length) {
                break;
            }
            byte[] bArr2 = new byte[(m77054q(iArr[i4]) * i3) + 5];
            bArr2[0] = 90;
            m77050u(i3, bArr2);
            bArr[i4] = bArr2;
            i4++;
        }
        byte[] bArr3 = new byte[5];
        bArr3[0] = -91;
        MessageDigest[] messageDigestArr = new MessageDigest[length];
        for (int i5 = 0; i5 < iArr.length; i5++) {
            String m77055p = m77055p(iArr[i5]);
            try {
                messageDigestArr[i5] = MessageDigest.getInstance(m77055p);
            } catch (NoSuchAlgorithmException e) {
                throw new RuntimeException(m77055p.concat(" digest not supported"), e);
            }
        }
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        for (i = 3; i6 < i; i = 3) {
            InterfaceC42079hM6 interfaceC42079hM6 = interfaceC42079hM6Arr[i6];
            long j4 = j2;
            int i9 = i6;
            long mo36508a = interfaceC42079hM6.mo36508a();
            while (mo36508a > j2) {
                int min = (int) Math.min(mo36508a, j);
                m77050u(min, bArr3);
                for (int i10 = 0; i10 < length; i10++) {
                    messageDigestArr[i10].update(bArr3);
                }
                long j5 = j4;
                try {
                    interfaceC42079hM6.mo36507a(messageDigestArr, j5, min);
                    int i11 = 0;
                    while (i11 < iArr.length) {
                        int i12 = iArr[i11];
                        InterfaceC42079hM6 interfaceC42079hM62 = interfaceC42079hM6;
                        byte[] bArr4 = bArr[i11];
                        int m77054q = m77054q(i12);
                        byte[] bArr5 = bArr3;
                        MessageDigest messageDigest = messageDigestArr[i11];
                        MessageDigest[] messageDigestArr2 = messageDigestArr;
                        int digest = messageDigest.digest(bArr4, (i7 * m77054q) + 5, m77054q);
                        if (digest != m77054q) {
                            String algorithm = messageDigest.getAlgorithm();
                            StringBuilder sb2 = new StringBuilder(String.valueOf(algorithm).length() + 46);
                            sb2.append("Unexpected output size of ");
                            sb2.append(algorithm);
                            sb2.append(" digest: ");
                            sb2.append(digest);
                            throw new RuntimeException(sb2.toString());
                        }
                        i11++;
                        interfaceC42079hM6 = interfaceC42079hM62;
                        bArr3 = bArr5;
                        messageDigestArr = messageDigestArr2;
                    }
                    InterfaceC42079hM6 interfaceC42079hM63 = interfaceC42079hM6;
                    long j6 = min;
                    long j7 = j5 + j6;
                    mo36508a -= j6;
                    i7++;
                    j2 = 0;
                    j = FileSize.MB_COEFFICIENT;
                    interfaceC42079hM6 = interfaceC42079hM63;
                    j4 = j7;
                    bArr3 = bArr3;
                } catch (IOException e2) {
                    StringBuilder sb3 = new StringBuilder(59);
                    sb3.append("Failed to digest chunk #");
                    sb3.append(i7);
                    sb3.append(" of section #");
                    sb3.append(i8);
                    throw new DigestException(sb3.toString(), e2);
                }
            }
            i8++;
            i6 = i9 + 1;
            j2 = 0;
            j = FileSize.MB_COEFFICIENT;
        }
        byte[][] bArr6 = new byte[iArr.length];
        for (int i13 = 0; i13 < iArr.length; i13++) {
            int i14 = iArr[i13];
            byte[] bArr7 = bArr[i13];
            String m77055p2 = m77055p(i14);
            try {
                bArr6[i13] = MessageDigest.getInstance(m77055p2).digest(bArr7);
            } catch (NoSuchAlgorithmException e3) {
                throw new RuntimeException(m77055p2.concat(" digest not supported"), e3);
            }
        }
        return bArr6;
    }

    /* renamed from: o */
    public static int m77056o(int i) {
        if (i != 513) {
            if (i != 514) {
                if (i != 769) {
                    switch (i) {
                        case 257:
                        case 259:
                            return 1;
                        case 258:
                        case 260:
                            return 2;
                        default:
                            String valueOf = String.valueOf(Long.toHexString(i));
                            throw new IllegalArgumentException(valueOf.length() != 0 ? "Unknown signature algorithm: 0x".concat(valueOf) : new String("Unknown signature algorithm: 0x"));
                    }
                }
                return 1;
            }
            return 2;
        }
        return 1;
    }

    /* renamed from: p */
    public static String m77055p(int i) {
        if (i != 1) {
            if (i == 2) {
                return "SHA-512";
            }
            StringBuilder sb = new StringBuilder(44);
            sb.append("Unknown content digest algorthm: ");
            sb.append(i);
            throw new IllegalArgumentException(sb.toString());
        }
        return "SHA-256";
    }

    /* renamed from: q */
    public static int m77054q(int i) {
        if (i != 1) {
            if (i == 2) {
                return 64;
            }
            StringBuilder sb = new StringBuilder(44);
            sb.append("Unknown content digest algorthm: ");
            sb.append(i);
            throw new IllegalArgumentException(sb.toString());
        }
        return 32;
    }

    /* renamed from: r */
    public static ByteBuffer m77053r(ByteBuffer byteBuffer, int i) throws BufferUnderflowException {
        if (i < 0) {
            StringBuilder sb = new StringBuilder(17);
            sb.append("size: ");
            sb.append(i);
            throw new IllegalArgumentException(sb.toString());
        }
        int limit = byteBuffer.limit();
        int position = byteBuffer.position();
        int i2 = i + position;
        if (i2 < position || i2 > limit) {
            throw new BufferUnderflowException();
        }
        byteBuffer.limit(i2);
        try {
            ByteBuffer slice = byteBuffer.slice();
            slice.order(byteBuffer.order());
            byteBuffer.position(i2);
            return slice;
        } finally {
            byteBuffer.limit(limit);
        }
    }

    /* renamed from: s */
    public static ByteBuffer m77052s(ByteBuffer byteBuffer) throws IOException {
        if (byteBuffer.remaining() < 4) {
            int remaining = byteBuffer.remaining();
            StringBuilder sb = new StringBuilder(93);
            sb.append("Remaining buffer too short to contain length of length-prefixed field. Remaining: ");
            sb.append(remaining);
            throw new IOException(sb.toString());
        }
        int i = byteBuffer.getInt();
        if (i >= 0) {
            if (i <= byteBuffer.remaining()) {
                return m77053r(byteBuffer, i);
            }
            int remaining2 = byteBuffer.remaining();
            StringBuilder sb2 = new StringBuilder(101);
            sb2.append("Length-prefixed field longer than remaining buffer. Field length: ");
            sb2.append(i);
            sb2.append(", remaining: ");
            sb2.append(remaining2);
            throw new IOException(sb2.toString());
        }
        throw new IllegalArgumentException("Negative length");
    }

    /* renamed from: t */
    public static byte[] m77051t(ByteBuffer byteBuffer) throws IOException {
        int i = byteBuffer.getInt();
        if (i >= 0) {
            if (i <= byteBuffer.remaining()) {
                byte[] bArr = new byte[i];
                byteBuffer.get(bArr);
                return bArr;
            }
            int remaining = byteBuffer.remaining();
            StringBuilder sb = new StringBuilder(90);
            sb.append("Underflow while reading length-prefixed value. Length: ");
            sb.append(i);
            sb.append(", available: ");
            sb.append(remaining);
            throw new IOException(sb.toString());
        }
        throw new IOException("Negative length");
    }

    /* renamed from: u */
    public static void m77050u(int i, byte[] bArr) {
        bArr[1] = (byte) (i & KotlinVersion.MAX_COMPONENT_VALUE);
        bArr[2] = (byte) ((i >>> 8) & KotlinVersion.MAX_COMPONENT_VALUE);
        bArr[3] = (byte) ((i >>> 16) & KotlinVersion.MAX_COMPONENT_VALUE);
        bArr[4] = (byte) (i >> 24);
    }
}
