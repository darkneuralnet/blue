package p000;

import ch.qos.logback.core.net.SyslogConstants;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Iterator;
/* renamed from: Mv7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C34617Mv7 extends AbstractC44175kt7 {

    /* renamed from: k */
    public static final int[] f23821k = {1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, SyslogConstants.LOG_LOCAL2, 233, 377, 610, 987, 1597, 2584, 4181, 6765, 10946, 17711, 28657, 46368, 75025, 121393, 196418, 317811, 514229, 832040, 1346269, 2178309, 3524578, 5702887, 9227465, 14930352, 24157817, 39088169, 63245986, 102334155, 165580141, 267914296, 433494437, 701408733, 1134903170, 1836311903, Integer.MAX_VALUE};

    /* renamed from: f */
    public final int f23822f;

    /* renamed from: g */
    public final AbstractC44175kt7 f23823g;

    /* renamed from: h */
    public final AbstractC44175kt7 f23824h;

    /* renamed from: i */
    public final int f23825i;

    /* renamed from: j */
    public final int f23826j;

    public C34617Mv7(AbstractC44175kt7 abstractC44175kt7, AbstractC44175kt7 abstractC44175kt72) {
        this.f23823g = abstractC44175kt7;
        this.f23824h = abstractC44175kt72;
        int mo28217e = abstractC44175kt7.mo28217e();
        this.f23825i = mo28217e;
        this.f23822f = mo28217e + abstractC44175kt72.mo28217e();
        this.f23826j = Math.max(abstractC44175kt7.mo28215h(), abstractC44175kt72.mo28215h()) + 1;
    }

    /* renamed from: L */
    public static AbstractC44175kt7 m94563L(AbstractC44175kt7 abstractC44175kt7, AbstractC44175kt7 abstractC44175kt72) {
        if (abstractC44175kt72.mo28217e() == 0) {
            return abstractC44175kt7;
        }
        if (abstractC44175kt7.mo28217e() == 0) {
            return abstractC44175kt72;
        }
        int mo28217e = abstractC44175kt7.mo28217e() + abstractC44175kt72.mo28217e();
        if (mo28217e < 128) {
            return m94562M(abstractC44175kt7, abstractC44175kt72);
        }
        if (abstractC44175kt7 instanceof C34617Mv7) {
            C34617Mv7 c34617Mv7 = (C34617Mv7) abstractC44175kt7;
            if (c34617Mv7.f23824h.mo28217e() + abstractC44175kt72.mo28217e() < 128) {
                return new C34617Mv7(c34617Mv7.f23823g, m94562M(c34617Mv7.f23824h, abstractC44175kt72));
            } else if (c34617Mv7.f23823g.mo28215h() > c34617Mv7.f23824h.mo28215h() && c34617Mv7.f23826j > abstractC44175kt72.mo28215h()) {
                return new C34617Mv7(c34617Mv7.f23823g, new C34617Mv7(c34617Mv7.f23824h, abstractC44175kt72));
            }
        }
        if (mo28217e >= m94561N(Math.max(abstractC44175kt7.mo28215h(), abstractC44175kt72.mo28215h()) + 1)) {
            return new C34617Mv7(abstractC44175kt7, abstractC44175kt72);
        }
        return C34149Kv7.m98126a(new C34149Kv7(null), abstractC44175kt7, abstractC44175kt72);
    }

    /* renamed from: M */
    public static AbstractC44175kt7 m94562M(AbstractC44175kt7 abstractC44175kt7, AbstractC44175kt7 abstractC44175kt72) {
        int mo28217e = abstractC44175kt7.mo28217e();
        int mo28217e2 = abstractC44175kt72.mo28217e();
        byte[] bArr = new byte[mo28217e + mo28217e2];
        abstractC44175kt7.m28221K(bArr, 0, 0, mo28217e);
        abstractC44175kt72.m28221K(bArr, 0, mo28217e, mo28217e2);
        return new C42989it7(bArr);
    }

    /* renamed from: N */
    public static int m94561N(int i) {
        int[] iArr = f23821k;
        int length = iArr.length;
        if (i >= 47) {
            return Integer.MAX_VALUE;
        }
        return iArr[i];
    }

    @Override // p000.AbstractC44175kt7
    /* renamed from: A */
    public final InterfaceC35058Os7 mo28229A() {
        return new C33915Jv7(this);
    }

    @Override // p000.AbstractC44175kt7
    /* renamed from: a */
    public final byte mo28220a(int i) {
        AbstractC44175kt7.m28222J(i, this.f23822f);
        return mo28219b(i);
    }

    @Override // p000.AbstractC44175kt7
    /* renamed from: b */
    public final byte mo28219b(int i) {
        int i2 = this.f23825i;
        if (i < i2) {
            return this.f23823g.mo28219b(i);
        }
        return this.f23824h.mo28219b(i - i2);
    }

    @Override // p000.AbstractC44175kt7
    /* renamed from: e */
    public final int mo28217e() {
        return this.f23822f;
    }

    @Override // p000.AbstractC44175kt7
    public final boolean equals(Object obj) {
        boolean mo31672L;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC44175kt7)) {
            return false;
        }
        AbstractC44175kt7 abstractC44175kt7 = (AbstractC44175kt7) obj;
        if (this.f23822f != abstractC44175kt7.mo28217e()) {
            return false;
        }
        if (this.f23822f == 0) {
            return true;
        }
        int m28206z = m28206z();
        int m28206z2 = abstractC44175kt7.m28206z();
        if (m28206z != 0 && m28206z2 != 0 && m28206z != m28206z2) {
            return false;
        }
        C34383Lv7 c34383Lv7 = new C34383Lv7(this, null);
        AbstractC42396ht7 next = c34383Lv7.next();
        C34383Lv7 c34383Lv72 = new C34383Lv7(abstractC44175kt7, null);
        AbstractC42396ht7 next2 = c34383Lv72.next();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            int mo28217e = next.mo28217e() - i;
            int mo28217e2 = next2.mo28217e() - i2;
            int min = Math.min(mo28217e, mo28217e2);
            if (i == 0) {
                mo31672L = next.mo31672L(next2, i2, min);
            } else {
                mo31672L = next2.mo31672L(next, i, min);
            }
            if (!mo31672L) {
                return false;
            }
            i3 += min;
            int i4 = this.f23822f;
            if (i3 >= i4) {
                if (i3 == i4) {
                    return true;
                }
                throw new IllegalStateException();
            }
            if (min == mo28217e) {
                next = c34383Lv7.next();
                i = 0;
            } else {
                i += min;
            }
            if (min == mo28217e2) {
                next2 = c34383Lv72.next();
                i2 = 0;
            } else {
                i2 += min;
            }
        }
    }

    @Override // p000.AbstractC44175kt7
    /* renamed from: f */
    public final void mo28216f(byte[] bArr, int i, int i2, int i3) {
        int i4 = this.f23825i;
        if (i + i3 <= i4) {
            this.f23823g.mo28216f(bArr, i, i2, i3);
        } else if (i >= i4) {
            this.f23824h.mo28216f(bArr, i - i4, i2, i3);
        } else {
            int i5 = i4 - i;
            this.f23823g.mo28216f(bArr, i, i2, i5);
            this.f23824h.mo28216f(bArr, 0, i2 + i5, i3 - i5);
        }
    }

    @Override // p000.AbstractC44175kt7
    /* renamed from: h */
    public final int mo28215h() {
        return this.f23826j;
    }

    @Override // p000.AbstractC44175kt7, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new C33915Jv7(this);
    }

    @Override // p000.AbstractC44175kt7
    /* renamed from: j */
    public final boolean mo28214j() {
        return this.f23822f >= m94561N(this.f23826j);
    }

    @Override // p000.AbstractC44175kt7
    /* renamed from: o */
    public final int mo28213o(int i, int i2, int i3) {
        int i4 = this.f23825i;
        if (i2 + i3 <= i4) {
            return this.f23823g.mo28213o(i, i2, i3);
        }
        if (i2 >= i4) {
            return this.f23824h.mo28213o(i, i2 - i4, i3);
        }
        int i5 = i4 - i2;
        return this.f23824h.mo28213o(this.f23823g.mo28213o(i, i2, i5), 0, i3 - i5);
    }

    @Override // p000.AbstractC44175kt7
    /* renamed from: s */
    public final int mo28212s(int i, int i2, int i3) {
        int i4 = this.f23825i;
        if (i2 + i3 <= i4) {
            return this.f23823g.mo28212s(i, i2, i3);
        }
        if (i2 >= i4) {
            return this.f23824h.mo28212s(i, i2 - i4, i3);
        }
        int i5 = i4 - i2;
        return this.f23824h.mo28212s(this.f23823g.mo28212s(i, i2, i5), 0, i3 - i5);
    }

    @Override // p000.AbstractC44175kt7
    /* renamed from: u */
    public final AbstractC44175kt7 mo28211u(int i, int i2) {
        int m28207y = AbstractC44175kt7.m28207y(i, i2, this.f23822f);
        if (m28207y == 0) {
            return AbstractC44175kt7.f95165c;
        }
        if (m28207y == this.f23822f) {
            return this;
        }
        int i3 = this.f23825i;
        if (i2 <= i3) {
            return this.f23823g.mo28211u(i, i2);
        }
        if (i >= i3) {
            return this.f23824h.mo28211u(i - i3, i2 - i3);
        }
        AbstractC44175kt7 abstractC44175kt7 = this.f23823g;
        return new C34617Mv7(abstractC44175kt7.mo28211u(i, abstractC44175kt7.mo28217e()), this.f23824h.mo28211u(0, i2 - this.f23825i));
    }

    @Override // p000.AbstractC44175kt7
    /* renamed from: v */
    public final String mo28210v(Charset charset) {
        byte[] bArr;
        int i = this.f23822f;
        if (i == 0) {
            bArr = C46557ou7.f102754d;
        } else {
            byte[] bArr2 = new byte[i];
            mo28216f(bArr2, 0, 0, i);
            bArr = bArr2;
        }
        return new String(bArr, charset);
    }

    @Override // p000.AbstractC44175kt7
    /* renamed from: w */
    public final void mo28209w(AbstractC33654Is7 abstractC33654Is7) throws IOException {
        this.f23823g.mo28209w(abstractC33654Is7);
        this.f23824h.mo28209w(abstractC33654Is7);
    }

    @Override // p000.AbstractC44175kt7
    /* renamed from: x */
    public final boolean mo28208x() {
        int mo28212s = this.f23823g.mo28212s(0, 0, this.f23825i);
        AbstractC44175kt7 abstractC44175kt7 = this.f23824h;
        if (abstractC44175kt7.mo28212s(mo28212s, 0, abstractC44175kt7.mo28217e()) != 0) {
            return false;
        }
        return true;
    }

    public /* synthetic */ C34617Mv7(AbstractC44175kt7 abstractC44175kt7, AbstractC44175kt7 abstractC44175kt72, C33915Jv7 c33915Jv7) {
        this(abstractC44175kt7, abstractC44175kt72);
    }
}
