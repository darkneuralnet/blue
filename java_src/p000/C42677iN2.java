package p000;

import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
@Metadata(m28433d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u000f\u001a\u00020\u0002\u0012\u0006\u0010\u0010\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0016\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002J\u001e\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0005J\u000e\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u0002R\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\n0\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\r¨\u0006\u0013"}, m28432d2 = {"LiN2;", "", "", "row", "col", "", C17296a.f69688o, "value", "", "c", "LRj6;", "b", "", "[LRj6;", "elements", "rows", "cols", "<init>", "(II)V", "ui_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: iN2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C42677iN2 {

    /* renamed from: a */
    public final C35678Rj6[] f87218a;

    public C42677iN2(int i, int i2) {
        C35678Rj6[] c35678Rj6Arr = new C35678Rj6[i];
        for (int i3 = 0; i3 < i; i3++) {
            c35678Rj6Arr[i3] = new C35678Rj6(i2);
        }
        this.f87218a = c35678Rj6Arr;
    }

    /* renamed from: a */
    public final float m34041a(int i, int i2) {
        return this.f87218a[i].m86416a(i2);
    }

    /* renamed from: b */
    public final C35678Rj6 m34040b(int i) {
        return this.f87218a[i];
    }

    /* renamed from: c */
    public final void m34039c(int i, int i2, float f) {
        this.f87218a[i].m86414c(i2, f);
    }
}
