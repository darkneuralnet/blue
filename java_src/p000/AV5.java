package p000;

import android.util.Size;
import java.util.ArrayList;
import java.util.Comparator;
/* renamed from: AV5 */
/* loaded from: classes.dex */
public class AV5 {

    /* renamed from: b */
    public static final Size f643b = new Size(320, 240);

    /* renamed from: c */
    public static final Comparator<Size> f644c = new C36194Tp0();

    /* renamed from: a */
    public final C43209jG4 f645a = (C43209jG4) S21.m86079a(C43209jG4.class);

    /* renamed from: a */
    public Size[] m115702a(Size[] sizeArr) {
        if (this.f645a != null && C43209jG4.m30902d()) {
            ArrayList arrayList = new ArrayList();
            for (Size size : sizeArr) {
                if (f644c.compare(size, f643b) >= 0) {
                    arrayList.add(size);
                }
            }
            return (Size[]) arrayList.toArray(new Size[0]);
        }
        return sizeArr;
    }
}
