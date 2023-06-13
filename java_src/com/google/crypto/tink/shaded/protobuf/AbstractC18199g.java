package com.google.crypto.tink.shaded.protobuf;

import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Locale;
import java.util.NoSuchElementException;
import kotlin.UByte;
/* renamed from: com.google.crypto.tink.shaded.protobuf.g */
/* loaded from: classes6.dex */
public abstract class AbstractC18199g implements Iterable<Byte>, Serializable {

    /* renamed from: c */
    public static final AbstractC18199g f74142c = new C18209j(C18238v.f74220d);

    /* renamed from: d */
    public static final InterfaceC18205f f74143d;

    /* renamed from: e */
    public static final Comparator<AbstractC18199g> f74144e;

    /* renamed from: b */
    public int f74145b = 0;

    /* renamed from: com.google.crypto.tink.shaded.protobuf.g$a */
    /* loaded from: classes6.dex */
    public class C18200a extends AbstractC18202c {

        /* renamed from: b */
        public int f74146b = 0;

        /* renamed from: c */
        public final int f74147c;

        public C18200a() {
            this.f74147c = AbstractC18199g.this.size();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f74146b < this.f74147c;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC18199g.InterfaceC18206g
        public byte nextByte() {
            int i = this.f74146b;
            if (i < this.f74147c) {
                this.f74146b = i + 1;
                return AbstractC18199g.this.mo47682s(i);
            }
            throw new NoSuchElementException();
        }
    }

    /* renamed from: com.google.crypto.tink.shaded.protobuf.g$b */
    /* loaded from: classes6.dex */
    public class C18201b implements Comparator<AbstractC18199g> {
        @Override // java.util.Comparator
        /* renamed from: a */
        public int compare(AbstractC18199g abstractC18199g, AbstractC18199g abstractC18199g2) {
            InterfaceC18206g it = abstractC18199g.iterator();
            InterfaceC18206g it2 = abstractC18199g2.iterator();
            while (it.hasNext() && it2.hasNext()) {
                int compare = Integer.compare(AbstractC18199g.m47708D(it.nextByte()), AbstractC18199g.m47708D(it2.nextByte()));
                if (compare != 0) {
                    return compare;
                }
            }
            return Integer.compare(abstractC18199g.size(), abstractC18199g2.size());
        }
    }

    /* renamed from: com.google.crypto.tink.shaded.protobuf.g$c */
    /* loaded from: classes6.dex */
    public static abstract class AbstractC18202c implements InterfaceC18206g {
        @Override // java.util.Iterator
        /* renamed from: a */
        public final Byte next() {
            return Byte.valueOf(nextByte());
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: com.google.crypto.tink.shaded.protobuf.g$d */
    /* loaded from: classes6.dex */
    public static final class C18203d implements InterfaceC18205f {
        private C18203d() {
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC18199g.InterfaceC18205f
        /* renamed from: a */
        public byte[] mo47678a(byte[] bArr, int i, int i2) {
            return Arrays.copyOfRange(bArr, i, i2 + i);
        }

        public /* synthetic */ C18203d(C18200a c18200a) {
            this();
        }
    }

    /* renamed from: com.google.crypto.tink.shaded.protobuf.g$e */
    /* loaded from: classes6.dex */
    public static final class C18204e extends C18209j {
        private static final long serialVersionUID = 1;

        /* renamed from: g */
        public final int f74149g;

        /* renamed from: h */
        public final int f74150h;

        public C18204e(byte[] bArr, int i, int i2) {
            super(bArr);
            AbstractC18199g.m47700e(i, i + i2, bArr.length);
            this.f74149g = i;
            this.f74150h = i2;
        }

        private void readObject(ObjectInputStream objectInputStream) throws IOException {
            throw new InvalidObjectException("BoundedByteStream instances are not to be serialized directly");
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC18199g.C18209j
        /* renamed from: N */
        public int mo47685N() {
            return this.f74149g;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC18199g.C18209j, com.google.crypto.tink.shaded.protobuf.AbstractC18199g
        /* renamed from: b */
        public byte mo47684b(int i) {
            AbstractC18199g.m47701c(i, size());
            return this.f74153f[this.f74149g + i];
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC18199g.C18209j, com.google.crypto.tink.shaded.protobuf.AbstractC18199g
        /* renamed from: o */
        public void mo47683o(byte[] bArr, int i, int i2, int i3) {
            System.arraycopy(this.f74153f, mo47685N() + i, bArr, i2, i3);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC18199g.C18209j, com.google.crypto.tink.shaded.protobuf.AbstractC18199g
        /* renamed from: s */
        public byte mo47682s(int i) {
            return this.f74153f[this.f74149g + i];
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC18199g.C18209j, com.google.crypto.tink.shaded.protobuf.AbstractC18199g
        public int size() {
            return this.f74150h;
        }

        public Object writeReplace() {
            return AbstractC18199g.m47704J(m47709C());
        }
    }

    /* renamed from: com.google.crypto.tink.shaded.protobuf.g$f */
    /* loaded from: classes6.dex */
    public interface InterfaceC18205f {
        /* renamed from: a */
        byte[] mo47678a(byte[] bArr, int i, int i2);
    }

    /* renamed from: com.google.crypto.tink.shaded.protobuf.g$g */
    /* loaded from: classes6.dex */
    public interface InterfaceC18206g extends Iterator<Byte> {
        byte nextByte();
    }

    /* renamed from: com.google.crypto.tink.shaded.protobuf.g$h */
    /* loaded from: classes6.dex */
    public static final class C18207h {

        /* renamed from: a */
        public final CodedOutputStream f74151a;

        /* renamed from: b */
        public final byte[] f74152b;

        public /* synthetic */ C18207h(int i, C18200a c18200a) {
            this(i);
        }

        /* renamed from: a */
        public AbstractC18199g m47691a() {
            this.f74151a.m48160c();
            return new C18209j(this.f74152b);
        }

        /* renamed from: b */
        public CodedOutputStream m47690b() {
            return this.f74151a;
        }

        public C18207h(int i) {
            byte[] bArr = new byte[i];
            this.f74152b = bArr;
            this.f74151a = CodedOutputStream.m48157d0(bArr);
        }
    }

    /* renamed from: com.google.crypto.tink.shaded.protobuf.g$i */
    /* loaded from: classes6.dex */
    public static abstract class AbstractC18208i extends AbstractC18199g {
    }

    /* renamed from: com.google.crypto.tink.shaded.protobuf.g$j */
    /* loaded from: classes6.dex */
    public static class C18209j extends AbstractC18208i {
        private static final long serialVersionUID = 1;

        /* renamed from: f */
        public final byte[] f74153f;

        public C18209j(byte[] bArr) {
            bArr.getClass();
            this.f74153f = bArr;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC18199g
        /* renamed from: A */
        public final AbstractC18199g mo47689A(int i, int i2) {
            int m47700e = AbstractC18199g.m47700e(i, i2, size());
            if (m47700e == 0) {
                return AbstractC18199g.f74142c;
            }
            return new C18204e(this.f74153f, mo47685N() + i, m47700e);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC18199g
        /* renamed from: F */
        public final String mo47688F(Charset charset) {
            return new String(this.f74153f, mo47685N(), size(), charset);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC18199g
        /* renamed from: L */
        public final void mo47687L(J70 j70) throws IOException {
            j70.mo48108a(this.f74153f, mo47685N(), size());
        }

        /* renamed from: M */
        public final boolean m47686M(AbstractC18199g abstractC18199g, int i, int i2) {
            if (i2 <= abstractC18199g.size()) {
                int i3 = i + i2;
                if (i3 <= abstractC18199g.size()) {
                    if (abstractC18199g instanceof C18209j) {
                        C18209j c18209j = (C18209j) abstractC18199g;
                        byte[] bArr = this.f74153f;
                        byte[] bArr2 = c18209j.f74153f;
                        int mo47685N = mo47685N() + i2;
                        int mo47685N2 = mo47685N();
                        int mo47685N3 = c18209j.mo47685N() + i;
                        while (mo47685N2 < mo47685N) {
                            if (bArr[mo47685N2] != bArr2[mo47685N3]) {
                                return false;
                            }
                            mo47685N2++;
                            mo47685N3++;
                        }
                        return true;
                    }
                    return abstractC18199g.mo47689A(i, i3).equals(mo47689A(0, i2));
                }
                throw new IllegalArgumentException("Ran off end of other: " + i + ", " + i2 + ", " + abstractC18199g.size());
            }
            throw new IllegalArgumentException("Length too large: " + i2 + size());
        }

        /* renamed from: N */
        public int mo47685N() {
            return 0;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC18199g
        /* renamed from: b */
        public byte mo47684b(int i) {
            return this.f74153f[i];
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC18199g
        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof AbstractC18199g) || size() != ((AbstractC18199g) obj).size()) {
                return false;
            }
            if (size() == 0) {
                return true;
            }
            if (obj instanceof C18209j) {
                C18209j c18209j = (C18209j) obj;
                int m47694z = m47694z();
                int m47694z2 = c18209j.m47694z();
                if (m47694z != 0 && m47694z2 != 0 && m47694z != m47694z2) {
                    return false;
                }
                return m47686M(c18209j, 0, size());
            }
            return obj.equals(this);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC18199g
        /* renamed from: o */
        public void mo47683o(byte[] bArr, int i, int i2, int i3) {
            System.arraycopy(this.f74153f, i, bArr, i2, i3);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC18199g
        /* renamed from: s */
        public byte mo47682s(int i) {
            return this.f74153f[i];
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC18199g
        public int size() {
            return this.f74153f.length;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC18199g
        /* renamed from: u */
        public final boolean mo47681u() {
            int mo47685N = mo47685N();
            return C18172T.m47832n(this.f74153f, mo47685N, size() + mo47685N);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC18199g
        /* renamed from: x */
        public final AbstractC18211h mo47680x() {
            return AbstractC18211h.m47673h(this.f74153f, mo47685N(), size(), true);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC18199g
        /* renamed from: y */
        public final int mo47679y(int i, int i2, int i3) {
            return C18238v.m47415i(i, this.f74153f, mo47685N() + i2, i3);
        }
    }

    /* renamed from: com.google.crypto.tink.shaded.protobuf.g$k */
    /* loaded from: classes6.dex */
    public static final class C18210k implements InterfaceC18205f {
        private C18210k() {
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC18199g.InterfaceC18205f
        /* renamed from: a */
        public byte[] mo47678a(byte[] bArr, int i, int i2) {
            byte[] bArr2 = new byte[i2];
            System.arraycopy(bArr, i, bArr2, 0, i2);
            return bArr2;
        }

        public /* synthetic */ C18210k(C18200a c18200a) {
            this();
        }
    }

    static {
        InterfaceC18205f c18203d;
        if (C23288ib.m33779c()) {
            c18203d = new C18210k(null);
        } else {
            c18203d = new C18203d(null);
        }
        f74143d = c18203d;
        f74144e = new C18201b();
    }

    /* renamed from: D */
    public static int m47708D(byte b) {
        return b & UByte.MAX_VALUE;
    }

    /* renamed from: J */
    public static AbstractC18199g m47704J(byte[] bArr) {
        return new C18209j(bArr);
    }

    /* renamed from: K */
    public static AbstractC18199g m47703K(byte[] bArr, int i, int i2) {
        return new C18204e(bArr, i, i2);
    }

    /* renamed from: c */
    public static void m47701c(int i, int i2) {
        if (((i2 - (i + 1)) | i) < 0) {
            if (i < 0) {
                throw new ArrayIndexOutOfBoundsException("Index < 0: " + i);
            }
            throw new ArrayIndexOutOfBoundsException("Index > length: " + i + ", " + i2);
        }
    }

    /* renamed from: e */
    public static int m47700e(int i, int i2, int i3) {
        int i4 = i2 - i;
        if ((i | i2 | i4 | (i3 - i2)) < 0) {
            if (i >= 0) {
                if (i2 < i) {
                    throw new IndexOutOfBoundsException("Beginning index larger than ending index: " + i + ", " + i2);
                }
                throw new IndexOutOfBoundsException("End index: " + i2 + " >= " + i3);
            }
            throw new IndexOutOfBoundsException("Beginning index: " + i + " < 0");
        }
        return i4;
    }

    /* renamed from: f */
    public static AbstractC18199g m47699f(byte[] bArr) {
        return m47698h(bArr, 0, bArr.length);
    }

    /* renamed from: h */
    public static AbstractC18199g m47698h(byte[] bArr, int i, int i2) {
        m47700e(i, i + i2, bArr.length);
        return new C18209j(f74143d.mo47678a(bArr, i, i2));
    }

    /* renamed from: j */
    public static AbstractC18199g m47697j(String str) {
        return new C18209j(str.getBytes(C18238v.f74218b));
    }

    /* renamed from: w */
    public static C18207h m47695w(int i) {
        return new C18207h(i, null);
    }

    /* renamed from: A */
    public abstract AbstractC18199g mo47689A(int i, int i2);

    /* renamed from: C */
    public final byte[] m47709C() {
        int size = size();
        if (size == 0) {
            return C18238v.f74220d;
        }
        byte[] bArr = new byte[size];
        mo47683o(bArr, 0, 0, size);
        return bArr;
    }

    /* renamed from: E */
    public final String m47707E(Charset charset) {
        return size() == 0 ? "" : mo47688F(charset);
    }

    /* renamed from: F */
    public abstract String mo47688F(Charset charset);

    /* renamed from: H */
    public final String m47706H() {
        return m47707E(C18238v.f74218b);
    }

    /* renamed from: I */
    public final String m47705I() {
        if (size() <= 50) {
            return K16.m99333b(this);
        }
        return K16.m99333b(mo47689A(0, 47)) + "...";
    }

    /* renamed from: L */
    public abstract void mo47687L(J70 j70) throws IOException;

    /* renamed from: b */
    public abstract byte mo47684b(int i);

    public abstract boolean equals(Object obj);

    public final int hashCode() {
        int i = this.f74145b;
        if (i == 0) {
            int size = size();
            i = mo47679y(size, 0, size);
            if (i == 0) {
                i = 1;
            }
            this.f74145b = i;
        }
        return i;
    }

    /* renamed from: o */
    public abstract void mo47683o(byte[] bArr, int i, int i2, int i3);

    /* renamed from: s */
    public abstract byte mo47682s(int i);

    public abstract int size();

    public final String toString() {
        return String.format(Locale.ROOT, "<ByteString@%s size=%d contents=\"%s\">", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(size()), m47705I());
    }

    /* renamed from: u */
    public abstract boolean mo47681u();

    @Override // java.lang.Iterable
    /* renamed from: v */
    public InterfaceC18206g iterator() {
        return new C18200a();
    }

    /* renamed from: x */
    public abstract AbstractC18211h mo47680x();

    /* renamed from: y */
    public abstract int mo47679y(int i, int i2, int i3);

    /* renamed from: z */
    public final int m47694z() {
        return this.f74145b;
    }
}
