package p000;

import java.io.File;
import java.io.FilenameFilter;
/* renamed from: aN6  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final /* synthetic */ class C37920aN6 implements FilenameFilter {

    /* renamed from: a */
    public static final FilenameFilter f50379a = new C37920aN6();

    private C37920aN6() {
    }

    @Override // java.io.FilenameFilter
    public final boolean accept(File file, String str) {
        boolean matches;
        matches = C38513bN6.f57365a.matcher(str).matches();
        return matches;
    }
}
