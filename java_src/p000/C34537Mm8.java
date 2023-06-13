package p000;

import android.net.Uri;
import android.text.TextUtils;
import android.util.LogPrinter;
import com.google.android.gms.common.internal.ImagesContract;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.ArrayList;
import java.util.Collections;
@VisibleForTesting
/* renamed from: Mm8  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C34537Mm8 implements Zq9 {

    /* renamed from: c */
    public static final Uri f23558c;

    /* renamed from: b */
    public final LogPrinter f23559b = new LogPrinter(4, "GA/LogCatTransport");

    static {
        Uri.Builder builder = new Uri.Builder();
        builder.scheme("uri");
        builder.authority(ImagesContract.LOCAL);
        f23558c = builder.build();
    }

    @Override // p000.Zq9
    /* renamed from: a */
    public final void mo72399a(C34366Lt8 c34366Lt8) {
        ArrayList arrayList = new ArrayList(c34366Lt8.m96228e());
        Collections.sort(arrayList, new C37273Ye8(this));
        StringBuilder sb = new StringBuilder();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            String obj = ((AbstractC47966rH8) arrayList.get(i)).toString();
            if (!TextUtils.isEmpty(obj)) {
                if (sb.length() != 0) {
                    sb.append(", ");
                }
                sb.append(obj);
            }
        }
        this.f23559b.println(sb.toString());
    }

    @Override // p000.Zq9
    public final Uri zzb() {
        return f23558c;
    }
}
