package p000;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
/* renamed from: q70  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C47272q70 {

    /* renamed from: e */
    public static final Comparator<byte[]> f104711e = new C27501a();

    /* renamed from: a */
    public final List<byte[]> f104712a = new ArrayList();

    /* renamed from: b */
    public final List<byte[]> f104713b = new ArrayList(64);

    /* renamed from: c */
    public int f104714c = 0;

    /* renamed from: d */
    public final int f104715d;

    /* renamed from: q70$a */
    /* loaded from: classes.dex */
    public class C27501a implements Comparator<byte[]> {
        @Override // java.util.Comparator
        /* renamed from: a */
        public int compare(byte[] bArr, byte[] bArr2) {
            return bArr.length - bArr2.length;
        }
    }

    public C47272q70(int i) {
        this.f104715d = i;
    }

    /* renamed from: a */
    public synchronized byte[] m18157a(int i) {
        for (int i2 = 0; i2 < this.f104713b.size(); i2++) {
            byte[] bArr = this.f104713b.get(i2);
            if (bArr.length >= i) {
                this.f104714c -= bArr.length;
                this.f104713b.remove(i2);
                this.f104712a.remove(bArr);
                return bArr;
            }
        }
        return new byte[i];
    }

    /* renamed from: b */
    public synchronized void m18156b(byte[] bArr) {
        if (bArr != null) {
            if (bArr.length <= this.f104715d) {
                this.f104712a.add(bArr);
                int binarySearch = Collections.binarySearch(this.f104713b, bArr, f104711e);
                if (binarySearch < 0) {
                    binarySearch = (-binarySearch) - 1;
                }
                this.f104713b.add(binarySearch, bArr);
                this.f104714c += bArr.length;
                m18155c();
            }
        }
    }

    /* renamed from: c */
    public final synchronized void m18155c() {
        while (this.f104714c > this.f104715d) {
            byte[] remove = this.f104712a.remove(0);
            this.f104713b.remove(remove);
            this.f104714c -= remove.length;
        }
    }
}
