package p000;

import android.annotation.SuppressLint;
/* renamed from: QF */
/* loaded from: classes.dex */
public class C6743QF implements InterfaceC32011Bs2 {

    /* renamed from: b */
    public final InterfaceC32011Bs2 f30096b;

    /* renamed from: c */
    public int f30097c = 0;

    /* renamed from: d */
    public int f30098d = -1;

    /* renamed from: e */
    public int f30099e = -1;

    /* renamed from: f */
    public Object f30100f = null;

    public C6743QF(InterfaceC32011Bs2 interfaceC32011Bs2) {
        this.f30096b = interfaceC32011Bs2;
    }

    /* renamed from: a */
    public void m88700a() {
        int i = this.f30097c;
        if (i == 0) {
            return;
        }
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    this.f30096b.onChanged(this.f30098d, this.f30099e, this.f30100f);
                }
            } else {
                this.f30096b.onRemoved(this.f30098d, this.f30099e);
            }
        } else {
            this.f30096b.onInserted(this.f30098d, this.f30099e);
        }
        this.f30100f = null;
        this.f30097c = 0;
    }

    @Override // p000.InterfaceC32011Bs2
    @SuppressLint({"UnknownNullness"})
    public void onChanged(int i, int i2, Object obj) {
        int i3;
        if (this.f30097c == 3) {
            int i4 = this.f30098d;
            int i5 = this.f30099e;
            if (i <= i4 + i5 && (i3 = i + i2) >= i4 && this.f30100f == obj) {
                this.f30098d = Math.min(i, i4);
                this.f30099e = Math.max(i5 + i4, i3) - this.f30098d;
                return;
            }
        }
        m88700a();
        this.f30098d = i;
        this.f30099e = i2;
        this.f30100f = obj;
        this.f30097c = 3;
    }

    @Override // p000.InterfaceC32011Bs2
    public void onInserted(int i, int i2) {
        int i3;
        if (this.f30097c == 1 && i >= (i3 = this.f30098d)) {
            int i4 = this.f30099e;
            if (i <= i3 + i4) {
                this.f30099e = i4 + i2;
                this.f30098d = Math.min(i, i3);
                return;
            }
        }
        m88700a();
        this.f30098d = i;
        this.f30099e = i2;
        this.f30097c = 1;
    }

    @Override // p000.InterfaceC32011Bs2
    public void onMoved(int i, int i2) {
        m88700a();
        this.f30096b.onMoved(i, i2);
    }

    @Override // p000.InterfaceC32011Bs2
    public void onRemoved(int i, int i2) {
        int i3;
        if (this.f30097c == 2 && (i3 = this.f30098d) >= i && i3 <= i + i2) {
            this.f30099e += i2;
            this.f30098d = i;
            return;
        }
        m88700a();
        this.f30098d = i;
        this.f30099e = i2;
        this.f30097c = 2;
    }
}
