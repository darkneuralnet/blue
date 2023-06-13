package com.google.protobuf;

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
/* renamed from: com.google.protobuf.e */
/* loaded from: classes6.dex */
public abstract class AbstractC18504e implements Iterable<Byte>, Serializable {

    /* renamed from: c */
    public static final AbstractC18504e f74797c = new C18514j(C18544t.f74875d);

    /* renamed from: d */
    public static final InterfaceC18510f f74798d;

    /* renamed from: e */
    public static final Comparator<AbstractC18504e> f74799e;

    /* renamed from: b */
    public int f74800b = 0;

    /* renamed from: com.google.protobuf.e$a */
    /* loaded from: classes6.dex */
    public class C18505a extends AbstractC18507c {

        /* renamed from: b */
        public int f74801b = 0;

        /* renamed from: c */
        public final int f74802c;

        public C18505a() {
            this.f74802c = AbstractC18504e.this.size();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f74801b < this.f74802c;
        }

        @Override // com.google.protobuf.AbstractC18504e.InterfaceC18511g
        public byte nextByte() {
            int i = this.f74801b;
            if (i < this.f74802c) {
                this.f74801b = i + 1;
                return AbstractC18504e.this.mo46283o(i);
            }
            throw new NoSuchElementException();
        }
    }

    /* renamed from: com.google.protobuf.e$b */
    /* loaded from: classes6.dex */
    public class C18506b implements Comparator<AbstractC18504e> {
        @Override // java.util.Comparator
        /* renamed from: a */
        public int compare(AbstractC18504e abstractC18504e, AbstractC18504e abstractC18504e2) {
            InterfaceC18511g it = abstractC18504e.iterator();
            InterfaceC18511g it2 = abstractC18504e2.iterator();
            while (it.hasNext() && it2.hasNext()) {
                int compareTo = Integer.valueOf(AbstractC18504e.m46307C(it.nextByte())).compareTo(Integer.valueOf(AbstractC18504e.m46307C(it2.nextByte())));
                if (compareTo != 0) {
                    return compareTo;
                }
            }
            return Integer.valueOf(abstractC18504e.size()).compareTo(Integer.valueOf(abstractC18504e2.size()));
        }
    }

    /* renamed from: com.google.protobuf.e$c */
    /* loaded from: classes6.dex */
    public static abstract class AbstractC18507c implements InterfaceC18511g {
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

    /* renamed from: com.google.protobuf.e$d */
    /* loaded from: classes6.dex */
    public static final class C18508d implements InterfaceC18510f {
        private C18508d() {
        }

        @Override // com.google.protobuf.AbstractC18504e.InterfaceC18510f
        /* renamed from: a */
        public byte[] mo46278a(byte[] bArr, int i, int i2) {
            return Arrays.copyOfRange(bArr, i, i2 + i);
        }

        public /* synthetic */ C18508d(C18505a c18505a) {
            this();
        }
    }

    /* renamed from: com.google.protobuf.e$e */
    /* loaded from: classes6.dex */
    public static final class C18509e extends C18514j {
        private static final long serialVersionUID = 1;

        /* renamed from: g */
        public final int f74804g;

        /* renamed from: h */
        public final int f74805h;

        public C18509e(byte[] bArr, int i, int i2) {
            super(bArr);
            AbstractC18504e.m46299e(i, i + i2, bArr.length);
            this.f74804g = i;
            this.f74805h = i2;
        }

        private void readObject(ObjectInputStream objectInputStream) throws IOException {
            throw new InvalidObjectException("BoundedByteStream instances are not to be serialized directly");
        }

        @Override // com.google.protobuf.AbstractC18504e.C18514j
        /* renamed from: M */
        public int mo46286M() {
            return this.f74804g;
        }

        @Override // com.google.protobuf.AbstractC18504e.C18514j, com.google.protobuf.AbstractC18504e
        /* renamed from: b */
        public byte mo46285b(int i) {
            AbstractC18504e.m46300c(i, size());
            return this.f74808f[this.f74804g + i];
        }

        @Override // com.google.protobuf.AbstractC18504e.C18514j, com.google.protobuf.AbstractC18504e
        /* renamed from: j */
        public void mo46284j(byte[] bArr, int i, int i2, int i3) {
            System.arraycopy(this.f74808f, mo46286M() + i, bArr, i2, i3);
        }

        @Override // com.google.protobuf.AbstractC18504e.C18514j, com.google.protobuf.AbstractC18504e
        /* renamed from: o */
        public byte mo46283o(int i) {
            return this.f74808f[this.f74804g + i];
        }

        @Override // com.google.protobuf.AbstractC18504e.C18514j, com.google.protobuf.AbstractC18504e
        public int size() {
            return this.f74805h;
        }

        public Object writeReplace() {
            return AbstractC18504e.m46303I(m46308A());
        }
    }

    /* renamed from: com.google.protobuf.e$f */
    /* loaded from: classes6.dex */
    public interface InterfaceC18510f {
        /* renamed from: a */
        byte[] mo46278a(byte[] bArr, int i, int i2);
    }

    /* renamed from: com.google.protobuf.e$g */
    /* loaded from: classes6.dex */
    public interface InterfaceC18511g extends Iterator<Byte> {
        byte nextByte();
    }

    /* renamed from: com.google.protobuf.e$h */
    /* loaded from: classes6.dex */
    public static final class C18512h {

        /* renamed from: a */
        public final CodedOutputStream f74806a;

        /* renamed from: b */
        public final byte[] f74807b;

        public /* synthetic */ C18512h(int i, C18505a c18505a) {
            this(i);
        }

        /* renamed from: a */
        public AbstractC18504e m46291a() {
            this.f74806a.m46691c();
            return new C18514j(this.f74807b);
        }

        /* renamed from: b */
        public CodedOutputStream m46290b() {
            return this.f74806a;
        }

        public C18512h(int i) {
            byte[] bArr = new byte[i];
            this.f74807b = bArr;
            this.f74806a = CodedOutputStream.m46690c0(bArr);
        }
    }

    /* renamed from: com.google.protobuf.e$i */
    /* loaded from: classes6.dex */
    public static abstract class AbstractC18513i extends AbstractC18504e {
        @Override // com.google.protobuf.AbstractC18504e, java.lang.Iterable
        public /* bridge */ /* synthetic */ Iterator<Byte> iterator() {
            return super.iterator();
        }
    }

    /* renamed from: com.google.protobuf.e$j */
    /* loaded from: classes6.dex */
    public static class C18514j extends AbstractC18513i {
        private static final long serialVersionUID = 1;

        /* renamed from: f */
        public final byte[] f74808f;

        public C18514j(byte[] bArr) {
            bArr.getClass();
            this.f74808f = bArr;
        }

        @Override // com.google.protobuf.AbstractC18504e
        /* renamed from: E */
        public final String mo46289E(Charset charset) {
            return new String(this.f74808f, mo46286M(), size(), charset);
        }

        @Override // com.google.protobuf.AbstractC18504e
        /* renamed from: K */
        public final void mo46288K(I70 i70) throws IOException {
            i70.mo46638a(this.f74808f, mo46286M(), size());
        }

        /* renamed from: L */
        public final boolean m46287L(AbstractC18504e abstractC18504e, int i, int i2) {
            if (i2 <= abstractC18504e.size()) {
                int i3 = i + i2;
                if (i3 <= abstractC18504e.size()) {
                    if (abstractC18504e instanceof C18514j) {
                        C18514j c18514j = (C18514j) abstractC18504e;
                        byte[] bArr = this.f74808f;
                        byte[] bArr2 = c18514j.f74808f;
                        int mo46286M = mo46286M() + i2;
                        int mo46286M2 = mo46286M();
                        int mo46286M3 = c18514j.mo46286M() + i;
                        while (mo46286M2 < mo46286M) {
                            if (bArr[mo46286M2] != bArr2[mo46286M3]) {
                                return false;
                            }
                            mo46286M2++;
                            mo46286M3++;
                        }
                        return true;
                    }
                    return abstractC18504e.mo46279z(i, i3).equals(mo46279z(0, i2));
                }
                throw new IllegalArgumentException("Ran off end of other: " + i + ", " + i2 + ", " + abstractC18504e.size());
            }
            throw new IllegalArgumentException("Length too large: " + i2 + size());
        }

        /* renamed from: M */
        public int mo46286M() {
            return 0;
        }

        @Override // com.google.protobuf.AbstractC18504e
        /* renamed from: b */
        public byte mo46285b(int i) {
            return this.f74808f[i];
        }

        @Override // com.google.protobuf.AbstractC18504e
        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof AbstractC18504e) || size() != ((AbstractC18504e) obj).size()) {
                return false;
            }
            if (size() == 0) {
                return true;
            }
            if (obj instanceof C18514j) {
                C18514j c18514j = (C18514j) obj;
                int m46294y = m46294y();
                int m46294y2 = c18514j.m46294y();
                if (m46294y != 0 && m46294y2 != 0 && m46294y != m46294y2) {
                    return false;
                }
                return m46287L(c18514j, 0, size());
            }
            return obj.equals(this);
        }

        @Override // com.google.protobuf.AbstractC18504e
        /* renamed from: j */
        public void mo46284j(byte[] bArr, int i, int i2, int i3) {
            System.arraycopy(this.f74808f, i, bArr, i2, i3);
        }

        @Override // com.google.protobuf.AbstractC18504e
        /* renamed from: o */
        public byte mo46283o(int i) {
            return this.f74808f[i];
        }

        @Override // com.google.protobuf.AbstractC18504e
        /* renamed from: s */
        public final boolean mo46282s() {
            int mo46286M = mo46286M();
            return C18483O.m46374n(this.f74808f, mo46286M, size() + mo46286M);
        }

        @Override // com.google.protobuf.AbstractC18504e
        public int size() {
            return this.f74808f.length;
        }

        @Override // com.google.protobuf.AbstractC18504e
        /* renamed from: w */
        public final AbstractC18516f mo46281w() {
            return AbstractC18516f.m46273h(this.f74808f, mo46286M(), size(), true);
        }

        @Override // com.google.protobuf.AbstractC18504e
        /* renamed from: x */
        public final int mo46280x(int i, int i2, int i3) {
            return C18544t.m45992i(i, this.f74808f, mo46286M() + i2, i3);
        }

        @Override // com.google.protobuf.AbstractC18504e
        /* renamed from: z */
        public final AbstractC18504e mo46279z(int i, int i2) {
            int m46299e = AbstractC18504e.m46299e(i, i2, size());
            if (m46299e == 0) {
                return AbstractC18504e.f74797c;
            }
            return new C18509e(this.f74808f, mo46286M() + i, m46299e);
        }
    }

    /* renamed from: com.google.protobuf.e$k */
    /* loaded from: classes6.dex */
    public static final class C18515k implements InterfaceC18510f {
        private C18515k() {
        }

        @Override // com.google.protobuf.AbstractC18504e.InterfaceC18510f
        /* renamed from: a */
        public byte[] mo46278a(byte[] bArr, int i, int i2) {
            byte[] bArr2 = new byte[i2];
            System.arraycopy(bArr, i, bArr2, 0, i2);
            return bArr2;
        }

        public /* synthetic */ C18515k(C18505a c18505a) {
            this();
        }
    }

    static {
        InterfaceC18510f c18508d;
        if (C22700hb.m36173c()) {
            c18508d = new C18515k(null);
        } else {
            c18508d = new C18508d(null);
        }
        f74798d = c18508d;
        f74799e = new C18506b();
    }

    /* renamed from: C */
    public static int m46307C(byte b) {
        return b & UByte.MAX_VALUE;
    }

    /* renamed from: I */
    public static AbstractC18504e m46303I(byte[] bArr) {
        return new C18514j(bArr);
    }

    /* renamed from: J */
    public static AbstractC18504e m46302J(byte[] bArr, int i, int i2) {
        return new C18509e(bArr, i, i2);
    }

    /* renamed from: c */
    public static void m46300c(int i, int i2) {
        if (((i2 - (i + 1)) | i) < 0) {
            if (i < 0) {
                throw new ArrayIndexOutOfBoundsException("Index < 0: " + i);
            }
            throw new ArrayIndexOutOfBoundsException("Index > length: " + i + ", " + i2);
        }
    }

    /* renamed from: e */
    public static int m46299e(int i, int i2, int i3) {
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
    public static AbstractC18504e m46298f(byte[] bArr, int i, int i2) {
        m46299e(i, i + i2, bArr.length);
        return new C18514j(f74798d.mo46278a(bArr, i, i2));
    }

    /* renamed from: h */
    public static AbstractC18504e m46297h(String str) {
        return new C18514j(str.getBytes(C18544t.f74873b));
    }

    /* renamed from: v */
    public static C18512h m46295v(int i) {
        return new C18512h(i, null);
    }

    /* renamed from: A */
    public final byte[] m46308A() {
        int size = size();
        if (size == 0) {
            return C18544t.f74875d;
        }
        byte[] bArr = new byte[size];
        mo46284j(bArr, 0, 0, size);
        return bArr;
    }

    /* renamed from: D */
    public final String m46306D(Charset charset) {
        return size() == 0 ? "" : mo46289E(charset);
    }

    /* renamed from: E */
    public abstract String mo46289E(Charset charset);

    /* renamed from: F */
    public final String m46305F() {
        return m46306D(C18544t.f74873b);
    }

    /* renamed from: H */
    public final String m46304H() {
        if (size() <= 50) {
            return J16.m101296b(this);
        }
        return J16.m101296b(mo46279z(0, 47)) + "...";
    }

    /* renamed from: K */
    public abstract void mo46288K(I70 i70) throws IOException;

    /* renamed from: b */
    public abstract byte mo46285b(int i);

    public abstract boolean equals(Object obj);

    public final int hashCode() {
        int i = this.f74800b;
        if (i == 0) {
            int size = size();
            i = mo46280x(size, 0, size);
            if (i == 0) {
                i = 1;
            }
            this.f74800b = i;
        }
        return i;
    }

    /* renamed from: j */
    public abstract void mo46284j(byte[] bArr, int i, int i2, int i3);

    /* renamed from: o */
    public abstract byte mo46283o(int i);

    /* renamed from: s */
    public abstract boolean mo46282s();

    public abstract int size();

    public final String toString() {
        return String.format(Locale.ROOT, "<ByteString@%s size=%d contents=\"%s\">", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(size()), m46304H());
    }

    @Override // java.lang.Iterable
    /* renamed from: u */
    public InterfaceC18511g iterator() {
        return new C18505a();
    }

    /* renamed from: w */
    public abstract AbstractC18516f mo46281w();

    /* renamed from: x */
    public abstract int mo46280x(int i, int i2, int i3);

    /* renamed from: y */
    public final int m46294y() {
        return this.f74800b;
    }

    /* renamed from: z */
    public abstract AbstractC18504e mo46279z(int i, int i2);
}
