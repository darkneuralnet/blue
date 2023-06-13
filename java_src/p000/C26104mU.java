package p000;

import android.graphics.BitmapFactory;
import android.util.Pair;
import java.io.File;
/* renamed from: mU */
/* loaded from: classes8.dex */
public class C26104mU {
    /* renamed from: a */
    public static Pair<Integer, Integer> m25540a(File file) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(file.getAbsolutePath(), options);
        return Pair.create(Integer.valueOf(options.outWidth), Integer.valueOf(options.outHeight));
    }
}
