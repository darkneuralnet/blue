package p000;

import android.annotation.TargetApi;
import android.graphics.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import p000.C43324jT2;
@TargetApi(19)
/* renamed from: kT2  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C43917kT2 implements InterfaceC42049hJ3, InterfaceC37834aE1 {

    /* renamed from: d */
    public final String f94418d;

    /* renamed from: f */
    public final C43324jT2 f94420f;

    /* renamed from: a */
    public final Path f94415a = new Path();

    /* renamed from: b */
    public final Path f94416b = new Path();

    /* renamed from: c */
    public final Path f94417c = new Path();

    /* renamed from: e */
    public final List<InterfaceC42049hJ3> f94419e = new ArrayList();

    /* renamed from: kT2$a */
    /* loaded from: classes2.dex */
    public static /* synthetic */ class C25165a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f94421a;

        static {
            int[] iArr = new int[C43324jT2.EnumC24846a.values().length];
            f94421a = iArr;
            try {
                iArr[C43324jT2.EnumC24846a.MERGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f94421a[C43324jT2.EnumC24846a.ADD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f94421a[C43324jT2.EnumC24846a.SUBTRACT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f94421a[C43324jT2.EnumC24846a.INTERSECT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f94421a[C43324jT2.EnumC24846a.EXCLUDE_INTERSECTIONS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public C43917kT2(C43324jT2 c43324jT2) {
        this.f94418d = c43324jT2.m30587c();
        this.f94420f = c43324jT2;
    }

    @Override // p000.InterfaceC37834aE1
    /* renamed from: b */
    public void mo28931b(ListIterator<InterfaceC36752Vz0> listIterator) {
        while (listIterator.hasPrevious() && listIterator.previous() != this) {
        }
        while (listIterator.hasPrevious()) {
            InterfaceC36752Vz0 previous = listIterator.previous();
            if (previous instanceof InterfaceC42049hJ3) {
                this.f94419e.add((InterfaceC42049hJ3) previous);
                listIterator.remove();
            }
        }
    }

    /* renamed from: c */
    public final void m28930c() {
        for (int i = 0; i < this.f94419e.size(); i++) {
            this.f94417c.addPath(this.f94419e.get(i).getPath());
        }
    }

    @TargetApi(19)
    /* renamed from: e */
    public final void m28929e(Path.Op op) {
        this.f94416b.reset();
        this.f94415a.reset();
        for (int size = this.f94419e.size() - 1; size >= 1; size--) {
            InterfaceC42049hJ3 interfaceC42049hJ3 = this.f94419e.get(size);
            if (interfaceC42049hJ3 instanceof C43151jA0) {
                C43151jA0 c43151jA0 = (C43151jA0) interfaceC42049hJ3;
                List<InterfaceC42049hJ3> m31048k = c43151jA0.m31048k();
                for (int size2 = m31048k.size() - 1; size2 >= 0; size2--) {
                    Path path = m31048k.get(size2).getPath();
                    path.transform(c43151jA0.m31047l());
                    this.f94416b.addPath(path);
                }
            } else {
                this.f94416b.addPath(interfaceC42049hJ3.getPath());
            }
        }
        InterfaceC42049hJ3 interfaceC42049hJ32 = this.f94419e.get(0);
        if (interfaceC42049hJ32 instanceof C43151jA0) {
            C43151jA0 c43151jA02 = (C43151jA0) interfaceC42049hJ32;
            List<InterfaceC42049hJ3> m31048k2 = c43151jA02.m31048k();
            for (int i = 0; i < m31048k2.size(); i++) {
                Path path2 = m31048k2.get(i).getPath();
                path2.transform(c43151jA02.m31047l());
                this.f94415a.addPath(path2);
            }
        } else {
            this.f94415a.set(interfaceC42049hJ32.getPath());
        }
        this.f94417c.op(this.f94415a, this.f94416b, op);
    }

    @Override // p000.InterfaceC36752Vz0
    /* renamed from: f */
    public void mo4988f(List<InterfaceC36752Vz0> list, List<InterfaceC36752Vz0> list2) {
        for (int i = 0; i < this.f94419e.size(); i++) {
            this.f94419e.get(i).mo4988f(list, list2);
        }
    }

    @Override // p000.InterfaceC42049hJ3
    public Path getPath() {
        this.f94417c.reset();
        if (this.f94420f.m30586d()) {
            return this.f94417c;
        }
        int i = C25165a.f94421a[this.f94420f.m30588b().ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        if (i == 5) {
                            m28929e(Path.Op.XOR);
                        }
                    } else {
                        m28929e(Path.Op.INTERSECT);
                    }
                } else {
                    m28929e(Path.Op.REVERSE_DIFFERENCE);
                }
            } else {
                m28929e(Path.Op.UNION);
            }
        } else {
            m28930c();
        }
        return this.f94417c;
    }
}
