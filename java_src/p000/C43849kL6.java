package p000;

import android.util.Log;
import java.io.File;
/* renamed from: kL6  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C43849kL6 implements NK6 {

    /* renamed from: a */
    public final /* synthetic */ int f94277a = 0;

    public C43849kL6() {
    }

    @Override // p000.NK6
    /* renamed from: a */
    public final boolean mo29049a(Object obj, File file, File file2) {
        int i = this.f94277a;
        if (i != 0) {
            if (i != 1) {
                return true;
            }
            return new File((String) C46814pL6.m19452g(obj.getClass(), String.class, File.class, file, File.class, file2)).exists();
        }
        try {
            return !((Boolean) C46814pL6.m19453f(Class.forName("dalvik.system.DexFile"), Boolean.class, String.class, file.getPath())).booleanValue();
        } catch (ClassNotFoundException unused) {
            Log.e("SplitCompat", "Unexpected missing dalvik.system.DexFile.");
            return false;
        }
    }

    public C43849kL6(byte[] bArr) {
    }

    public C43849kL6(char[] cArr) {
    }
}
