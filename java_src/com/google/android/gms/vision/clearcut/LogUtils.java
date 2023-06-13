package com.google.android.gms.vision.clearcut;

import android.content.Context;
import android.content.pm.PackageManager;
import androidx.annotation.Keep;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.android.gms.internal.vision.AbstractC17554G;
import com.google.android.gms.internal.vision.C17566a;
import com.google.android.gms.internal.vision.C17577f;
import com.google.android.gms.internal.vision.C17587i;
import com.google.android.gms.internal.vision.C17589j;
import com.google.android.gms.internal.vision.C17598n;
import com.google.android.gms.internal.vision.C17600o;
import com.google.android.gms.internal.vision.zzs;
import java.util.ArrayList;
import java.util.List;
@Keep
/* loaded from: classes6.dex */
public class LogUtils {
    public static C17600o zza(long j, int i, String str, String str2, List<C17598n> list, zzs zzsVar) {
        C17587i.C17588a m50881u = C17587i.m50881u();
        C17577f.C17579b m50895A = C17577f.m50902u().m50892z(str2).m50894w(j).m50895A(i);
        m50895A.m50893y(list);
        ArrayList arrayList = new ArrayList();
        arrayList.add((C17577f) ((AbstractC17554G) m50895A.mo50971x()));
        return (C17600o) ((AbstractC17554G) C17600o.m50853u().m50849w((C17587i) ((AbstractC17554G) m50881u.m50875y(arrayList).m50876w((C17589j) ((AbstractC17554G) C17589j.m50869u().m50860y(zzsVar.f71351c).m50861w(zzsVar.f71350b).m50859z(zzsVar.f71352d).m50862A(zzsVar.f71353e).mo50971x())).mo50971x())).mo50971x());
    }

    private static String zzb(Context context) {
        try {
            return Wrappers.packageManager(context).getPackageInfo(context.getPackageName(), 0).versionName;
        } catch (PackageManager.NameNotFoundException e) {
            C32650El2.m108402b(e, "Unable to find calling package info for %s", context.getPackageName());
            return null;
        }
    }

    public static C17566a zza(Context context) {
        C17566a.C17567a m50915w = C17566a.m50920u().m50915w(context.getPackageName());
        String zzb = zzb(context);
        if (zzb != null) {
            m50915w.m50914y(zzb);
        }
        return (C17566a) ((AbstractC17554G) m50915w.mo50971x());
    }
}
