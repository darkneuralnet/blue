package p000;

import android.util.Size;
import java.util.Comparator;
/* renamed from: Tp0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C36194Tp0 implements Comparator<Size> {

    /* renamed from: b */
    public boolean f36094b;

    public C36194Tp0() {
        this(false);
    }

    @Override // java.util.Comparator
    /* renamed from: a */
    public int compare(Size size, Size size2) {
        int signum = Long.signum((size.getWidth() * size.getHeight()) - (size2.getWidth() * size2.getHeight()));
        if (this.f36094b) {
            return signum * (-1);
        }
        return signum;
    }

    public C36194Tp0(boolean z) {
        this.f36094b = z;
    }
}
