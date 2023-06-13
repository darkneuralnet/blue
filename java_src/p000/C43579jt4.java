package p000;

import java.util.ArrayList;
import java.util.List;
/* renamed from: jt4  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C43579jt4 {

    /* renamed from: a */
    public final C49683uB1 f93506a;

    /* renamed from: b */
    public final List<C50275vB1> f93507b;

    public C43579jt4(C49683uB1 c49683uB1) {
        this.f93506a = c49683uB1;
        ArrayList arrayList = new ArrayList();
        this.f93507b = arrayList;
        arrayList.add(new C50275vB1(c49683uB1, new int[]{1}));
    }

    /* renamed from: a */
    public final C50275vB1 m29780a(int i) {
        if (i >= this.f93507b.size()) {
            List<C50275vB1> list = this.f93507b;
            C50275vB1 c50275vB1 = list.get(list.size() - 1);
            for (int size = this.f93507b.size(); size <= i; size++) {
                C49683uB1 c49683uB1 = this.f93506a;
                c50275vB1 = c50275vB1.m9034i(new C50275vB1(c49683uB1, new int[]{1, c49683uB1.m10683c((size - 1) + c49683uB1.m10682d())}));
                this.f93507b.add(c50275vB1);
            }
        }
        return this.f93507b.get(i);
    }

    /* renamed from: b */
    public void m29779b(int[] iArr, int i) {
        if (i != 0) {
            int length = iArr.length - i;
            if (length > 0) {
                C50275vB1 m29780a = m29780a(i);
                int[] iArr2 = new int[length];
                System.arraycopy(iArr, 0, iArr2, 0, length);
                int[] m9038e = new C50275vB1(this.f93506a, iArr2).m9033j(i, 1).m9041b(m29780a)[1].m9038e();
                int length2 = i - m9038e.length;
                for (int i2 = 0; i2 < length2; i2++) {
                    iArr[length + i2] = 0;
                }
                System.arraycopy(m9038e, 0, iArr, length + length2, m9038e.length);
                return;
            }
            throw new IllegalArgumentException("No data bytes provided");
        }
        throw new IllegalArgumentException("No error correction bytes");
    }
}
