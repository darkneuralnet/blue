package p000;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InvalidClassException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectStreamClass;
import java.util.HashSet;
import java.util.Set;
import kotlin.UByte;
/* renamed from: WH6 */
/* loaded from: classes8.dex */
public class WH6 {

    /* renamed from: WH6$a */
    /* loaded from: classes8.dex */
    public static class C8978a extends ObjectInputStream {

        /* renamed from: d */
        public static final Set f40739d;

        /* renamed from: b */
        public final Class f40740b;

        /* renamed from: c */
        public boolean f40741c;

        static {
            HashSet hashSet = new HashSet();
            f40739d = hashSet;
            hashSet.add("java.util.TreeMap");
            hashSet.add("java.lang.Integer");
            hashSet.add("java.lang.Number");
            hashSet.add("org.bouncycastle.pqc.crypto.xmss.BDS");
            hashSet.add("java.util.ArrayList");
            hashSet.add("org.bouncycastle.pqc.crypto.xmss.XMSSNode");
            hashSet.add("[B");
            hashSet.add("java.util.LinkedList");
            hashSet.add("java.util.Stack");
            hashSet.add("java.util.Vector");
            hashSet.add("[Ljava.lang.Object;");
            hashSet.add("org.bouncycastle.pqc.crypto.xmss.BDSTreeHash");
        }

        public C8978a(Class cls, InputStream inputStream) throws IOException {
            super(inputStream);
            this.f40741c = false;
            this.f40740b = cls;
        }

        @Override // java.io.ObjectInputStream
        public Class<?> resolveClass(ObjectStreamClass objectStreamClass) throws IOException, ClassNotFoundException {
            if (this.f40741c) {
                if (!f40739d.contains(objectStreamClass.getName())) {
                    throw new InvalidClassException("unexpected class: ", objectStreamClass.getName());
                }
            } else if (!objectStreamClass.getName().equals(this.f40740b.getName())) {
                throw new InvalidClassException("unexpected class: ", objectStreamClass.getName());
            } else {
                this.f40741c = true;
            }
            return super.resolveClass(objectStreamClass);
        }
    }

    /* renamed from: a */
    public static long m78621a(byte[] bArr, int i, int i2) {
        if (bArr != null) {
            long j = 0;
            for (int i3 = i; i3 < i + i2; i3++) {
                j = (j << 8) | (bArr[i3] & UByte.MAX_VALUE);
            }
            return j;
        }
        throw new NullPointerException("in == null");
    }

    /* renamed from: b */
    public static int m78620b(int i, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            if (((i >> i3) & 1) == 0) {
                return i3;
            }
        }
        return 0;
    }

    /* renamed from: c */
    public static byte[] m78619c(byte[] bArr) {
        if (bArr != null) {
            byte[] bArr2 = new byte[bArr.length];
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
            return bArr2;
        }
        throw new NullPointerException("in == null");
    }

    /* renamed from: d */
    public static byte[][] m78618d(byte[][] bArr) {
        if (m78611k(bArr)) {
            throw new NullPointerException("in has null pointers");
        }
        byte[][] bArr2 = new byte[bArr.length];
        for (int i = 0; i < bArr.length; i++) {
            byte[] bArr3 = new byte[bArr[i].length];
            bArr2[i] = bArr3;
            byte[] bArr4 = bArr[i];
            System.arraycopy(bArr4, 0, bArr3, 0, bArr4.length);
        }
        return bArr2;
    }

    /* renamed from: e */
    public static void m78617e(byte[] bArr, byte[] bArr2, int i) {
        if (bArr == null) {
            throw new NullPointerException("dst == null");
        }
        if (bArr2 == null) {
            throw new NullPointerException("src == null");
        }
        if (i < 0) {
            throw new IllegalArgumentException("offset hast to be >= 0");
        }
        if (bArr2.length + i > bArr.length) {
            throw new IllegalArgumentException("src length + offset must not be greater than size of destination");
        }
        for (int i2 = 0; i2 < bArr2.length; i2++) {
            bArr[i + i2] = bArr2[i2];
        }
    }

    /* renamed from: f */
    public static Object m78616f(byte[] bArr, Class cls) throws IOException, ClassNotFoundException {
        C8978a c8978a = new C8978a(cls, new ByteArrayInputStream(bArr));
        Object readObject = c8978a.readObject();
        if (c8978a.available() == 0) {
            if (cls.isInstance(readObject)) {
                return readObject;
            }
            throw new IOException("unexpected class found in ObjectInputStream");
        }
        throw new IOException("unexpected data found at end of ObjectInputStream");
    }

    /* renamed from: g */
    public static byte[] m78615g(byte[] bArr, int i, int i2) {
        if (bArr != null) {
            if (i >= 0) {
                if (i2 >= 0) {
                    if (i + i2 <= bArr.length) {
                        byte[] bArr2 = new byte[i2];
                        for (int i3 = 0; i3 < i2; i3++) {
                            bArr2[i3] = bArr[i + i3];
                        }
                        return bArr2;
                    }
                    throw new IllegalArgumentException("offset + length must not be greater then size of source array");
                }
                throw new IllegalArgumentException("length hast to be >= 0");
            }
            throw new IllegalArgumentException("offset hast to be >= 0");
        }
        throw new NullPointerException("src == null");
    }

    /* renamed from: h */
    public static int m78614h(P31 p31) {
        if (p31 != null) {
            String mo15579d = p31.mo15579d();
            if (mo15579d.equals("SHAKE128")) {
                return 32;
            }
            if (mo15579d.equals("SHAKE256")) {
                return 64;
            }
            return p31.mo15578e();
        }
        throw new NullPointerException("digest == null");
    }

    /* renamed from: i */
    public static int m78613i(long j, int i) {
        return (int) (j & ((1 << i) - 1));
    }

    /* renamed from: j */
    public static long m78612j(long j, int i) {
        return j >> i;
    }

    /* renamed from: k */
    public static boolean m78611k(byte[][] bArr) {
        if (bArr == null) {
            return true;
        }
        for (byte[] bArr2 : bArr) {
            if (bArr2 == null) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: l */
    public static boolean m78610l(int i, long j) {
        if (j >= 0) {
            return j < (1 << i);
        }
        throw new IllegalStateException("index must not be negative");
    }

    /* renamed from: m */
    public static boolean m78609m(long j, int i, int i2) {
        return j != 0 && (j + 1) % ((long) Math.pow((double) (1 << i), (double) i2)) == 0;
    }

    /* renamed from: n */
    public static boolean m78608n(long j, int i, int i2) {
        return j != 0 && j % ((long) Math.pow((double) (1 << i), (double) (i2 + 1))) == 0;
    }

    /* renamed from: o */
    public static int m78607o(int i) {
        int i2 = 0;
        while (true) {
            i >>= 1;
            if (i == 0) {
                return i2;
            }
            i2++;
        }
    }

    /* renamed from: p */
    public static byte[] m78606p(Object obj) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
        objectOutputStream.writeObject(obj);
        objectOutputStream.flush();
        return byteArrayOutputStream.toByteArray();
    }

    /* renamed from: q */
    public static byte[] m78605q(long j, int i) {
        byte[] bArr = new byte[i];
        for (int i2 = i - 1; i2 >= 0; i2--) {
            bArr[i2] = (byte) j;
            j >>>= 8;
        }
        return bArr;
    }
}
