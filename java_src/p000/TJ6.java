package p000;

import android.content.Context;
import android.content.res.AssetManager;
import android.util.Log;
import java.io.File;
import java.util.Set;
/* renamed from: TJ6 */
/* loaded from: classes6.dex */
public final class TJ6 {

    /* renamed from: a */
    public final C42672iM6 f35302a;

    public TJ6(C42672iM6 c42672iM6) {
        this.f35302a = c42672iM6;
    }

    /* renamed from: b */
    public static final int m83817b(AssetManager assetManager, File file) {
        int intValue = ((Integer) C46814pL6.m19458a(assetManager, "addAssetPath", Integer.class, String.class, file.getPath())).intValue();
        StringBuilder sb = new StringBuilder(39);
        sb.append("addAssetPath completed with ");
        sb.append(intValue);
        Log.d("SplitCompat", sb.toString());
        return intValue;
    }

    /* renamed from: a */
    public final synchronized void m83818a(Context context, Set<File> set) {
        AssetManager assets = context.getAssets();
        for (File file : set) {
            m83817b(assets, file);
        }
    }
}
