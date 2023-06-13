package p000;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
/* renamed from: ol8  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C46468ol8 implements Cloneable {

    /* renamed from: b */
    public Object f102454b;

    /* renamed from: c */
    public List<Object> f102455c = new ArrayList();

    /* renamed from: d */
    public final byte[] m20533d() throws IOException {
        byte[] bArr = new byte[m20531f()];
        m20532e(C39325ck8.m60952q(bArr));
        return bArr;
    }

    /* renamed from: e */
    public final void m20532e(C39325ck8 c39325ck8) throws IOException {
        if (this.f102454b != null) {
            throw new NoSuchMethodError();
        }
        Iterator<Object> it = this.f102455c.iterator();
        if (it.hasNext()) {
            it.next();
            throw new NoSuchMethodError();
        }
    }

    public final boolean equals(Object obj) {
        List<Object> list;
        if (obj == this) {
            return true;
        }
        if (obj instanceof C46468ol8) {
            C46468ol8 c46468ol8 = (C46468ol8) obj;
            if (this.f102454b == null || c46468ol8.f102454b == null) {
                List<Object> list2 = this.f102455c;
                if (list2 == null || (list = c46468ol8.f102455c) == null) {
                    try {
                        return Arrays.equals(m20533d(), c46468ol8.m20533d());
                    } catch (IOException e) {
                        throw new IllegalStateException(e);
                    }
                }
                return list2.equals(list);
            }
            throw null;
        }
        return false;
    }

    /* renamed from: f */
    public final int m20531f() {
        if (this.f102454b == null) {
            Iterator<Object> it = this.f102455c.iterator();
            if (it.hasNext()) {
                it.next();
                throw new NoSuchMethodError();
            }
            return 0;
        }
        throw new NoSuchMethodError();
    }

    /* renamed from: g */
    public final C46468ol8 clone() {
        Object clone;
        C46468ol8 c46468ol8 = new C46468ol8();
        try {
            List<Object> list = this.f102455c;
            if (list == null) {
                c46468ol8.f102455c = null;
            } else {
                c46468ol8.f102455c.addAll(list);
            }
            Object obj = this.f102454b;
            if (obj != null) {
                if (obj instanceof C35464Ql8) {
                    clone = (C35464Ql8) ((C35464Ql8) obj).clone();
                } else if (obj instanceof byte[]) {
                    clone = ((byte[]) obj).clone();
                } else {
                    int i = 0;
                    if (obj instanceof byte[][]) {
                        byte[][] bArr = (byte[][]) obj;
                        byte[][] bArr2 = new byte[bArr.length];
                        c46468ol8.f102454b = bArr2;
                        while (i < bArr.length) {
                            bArr2[i] = (byte[]) bArr[i].clone();
                            i++;
                        }
                    } else if (obj instanceof boolean[]) {
                        clone = ((boolean[]) obj).clone();
                    } else if (obj instanceof int[]) {
                        clone = ((int[]) obj).clone();
                    } else if (obj instanceof long[]) {
                        clone = ((long[]) obj).clone();
                    } else if (obj instanceof float[]) {
                        clone = ((float[]) obj).clone();
                    } else if (obj instanceof double[]) {
                        clone = ((double[]) obj).clone();
                    } else if (obj instanceof C35464Ql8[]) {
                        C35464Ql8[] c35464Ql8Arr = (C35464Ql8[]) obj;
                        C35464Ql8[] c35464Ql8Arr2 = new C35464Ql8[c35464Ql8Arr.length];
                        c46468ol8.f102454b = c35464Ql8Arr2;
                        while (i < c35464Ql8Arr.length) {
                            c35464Ql8Arr2[i] = (C35464Ql8) c35464Ql8Arr[i].clone();
                            i++;
                        }
                    }
                }
                c46468ol8.f102454b = clone;
            }
            return c46468ol8;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    public final int hashCode() {
        try {
            return Arrays.hashCode(m20533d()) + 527;
        } catch (IOException e) {
            throw new IllegalStateException(e);
        }
    }
}
