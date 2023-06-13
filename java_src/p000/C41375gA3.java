package p000;

import android.util.Rational;
import android.util.Size;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
/* renamed from: gA3  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C41375gA3 {

    /* renamed from: a */
    public final String f81715a;

    /* renamed from: b */
    public final C36761Wa0 f81716b;

    /* renamed from: d */
    public final C51756xh1 f81718d;

    /* renamed from: c */
    public final C36132Ti1 f81717c = (C36132Ti1) S21.m86079a(C36132Ti1.class);

    /* renamed from: e */
    public final PY5 f81719e = new PY5();

    public C41375gA3(String str, C36761Wa0 c36761Wa0) {
        this.f81715a = str;
        this.f81716b = c36761Wa0;
        this.f81718d = new C51756xh1(str);
    }

    /* renamed from: c */
    public static List<Size> m39958c(List<Size> list, List<Size> list2) {
        if (list == null) {
            return list2;
        }
        if (list2 == null) {
            return list;
        }
        ArrayList arrayList = new ArrayList(list);
        arrayList.addAll(list2);
        return arrayList;
    }

    /* renamed from: a */
    public final Size[] m39960a(Size[] sizeArr, int i) {
        C36132Ti1 c36132Ti1 = this.f81717c;
        if (c36132Ti1 == null) {
            return sizeArr;
        }
        return (Size[]) m39958c(Arrays.asList(sizeArr), Arrays.asList(c36132Ti1.m83141d(i))).toArray(new Size[0]);
    }

    /* renamed from: b */
    public Size[] m39959b(Size[] sizeArr, int i) {
        return m39957d(m39956e(m39960a(sizeArr, i), i));
    }

    /* renamed from: d */
    public final Size[] m39957d(Size[] sizeArr) {
        Rational rational;
        if (sizeArr == null) {
            return null;
        }
        int m90117a = this.f81719e.m90117a(this.f81715a, this.f81716b);
        if (m90117a != 0) {
            if (m90117a != 1) {
                if (m90117a != 2) {
                    rational = null;
                } else {
                    Size size = (Size) Collections.max(Arrays.asList(sizeArr), new C36194Tp0());
                    rational = new Rational(size.getWidth(), size.getHeight());
                }
            } else {
                rational = C4240Jo.f18256c;
            }
        } else {
            rational = C4240Jo.f18254a;
        }
        if (rational == null) {
            return sizeArr;
        }
        ArrayList arrayList = new ArrayList();
        for (Size size2 : sizeArr) {
            if (C4240Jo.m99687a(size2, rational)) {
                arrayList.add(size2);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return (Size[]) arrayList.toArray(new Size[0]);
    }

    /* renamed from: e */
    public final Size[] m39956e(Size[] sizeArr, int i) {
        if (sizeArr == null) {
            return null;
        }
        List<Size> m4880a = this.f81718d.m4880a(i);
        ArrayList arrayList = new ArrayList(Arrays.asList(sizeArr));
        arrayList.removeAll(m4880a);
        if (arrayList.isEmpty()) {
            return null;
        }
        return (Size[]) arrayList.toArray(new Size[0]);
    }
}
