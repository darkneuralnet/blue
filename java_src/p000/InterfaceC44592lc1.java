package p000;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* renamed from: lc1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC44592lc1 {

    /* renamed from: lc1$a */
    /* loaded from: classes.dex */
    public static abstract class AbstractC25737a {
        /* renamed from: a */
        public static AbstractC25737a m27095a(int i, String str, int i2, int i3, int i4, int i5) {
            return new C29689vt(i, str, i2, i3, i4, i5);
        }

        /* renamed from: b */
        public abstract int mo7874b();

        /* renamed from: c */
        public abstract int mo7873c();

        /* renamed from: d */
        public abstract int mo7872d();

        /* renamed from: e */
        public abstract String mo7871e();

        /* renamed from: f */
        public abstract int mo7870f();

        /* renamed from: g */
        public abstract int mo7869g();
    }

    /* renamed from: lc1$b */
    /* loaded from: classes.dex */
    public static abstract class AbstractC25738b implements InterfaceC44592lc1 {
        /* renamed from: e */
        public static AbstractC25738b m27094e(int i, int i2, List<AbstractC25737a> list, List<AbstractC25739c> list2) {
            return new C29982wt(i, i2, Collections.unmodifiableList(new ArrayList(list)), Collections.unmodifiableList(new ArrayList(list2)));
        }
    }

    /* renamed from: lc1$c */
    /* loaded from: classes.dex */
    public static abstract class AbstractC25739c {
        /* renamed from: a */
        public static AbstractC25739c m27093a(int i, String str, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
            return new C30335xt(i, str, i2, i3, i4, i5, i6, i7, i8, i9);
        }

        /* renamed from: b */
        public abstract int mo4520b();

        /* renamed from: c */
        public abstract int mo4519c();

        /* renamed from: d */
        public abstract int mo4518d();

        /* renamed from: e */
        public abstract int mo4517e();

        /* renamed from: f */
        public abstract int mo4516f();

        /* renamed from: g */
        public abstract int mo4515g();

        /* renamed from: h */
        public abstract int mo4514h();

        /* renamed from: i */
        public abstract String mo4513i();

        /* renamed from: j */
        public abstract int mo4512j();

        /* renamed from: k */
        public abstract int mo4511k();
    }

    /* renamed from: a */
    int mo6193a();

    /* renamed from: b */
    List<AbstractC25737a> mo6192b();

    /* renamed from: c */
    int mo6191c();

    /* renamed from: d */
    List<AbstractC25739c> mo6190d();
}
