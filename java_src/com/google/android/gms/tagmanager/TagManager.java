package com.google.android.gms.tagmanager;

import android.content.Context;
import android.net.Uri;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
@VisibleForTesting
/* loaded from: classes6.dex */
public class TagManager {
    private static TagManager zza;
    private final zzfp zzb;
    private final Context zzc;
    private final DataLayer zzd;
    private final zzey zze;
    private final ConcurrentMap<String, zzaa> zzf;
    private final zzap zzg;

    @VisibleForTesting
    public TagManager(Context context, zzfp zzfpVar, DataLayer dataLayer, zzey zzeyVar) {
        Context applicationContext = context.getApplicationContext();
        this.zzc = applicationContext;
        this.zze = zzeyVar;
        this.zzb = zzfpVar;
        this.zzf = new ConcurrentHashMap();
        this.zzd = dataLayer;
        dataLayer.zzg(new zzfm(this));
        dataLayer.zzg(new zzg(applicationContext));
        this.zzg = new zzap();
        Preconditions.checkNotNull(applicationContext);
        applicationContext.registerComponentCallbacks(new zzfo(this));
        Preconditions.checkNotNull(applicationContext);
        zzd.zzb(applicationContext);
    }

    public static TagManager getInstance(Context context) {
        TagManager tagManager;
        synchronized (TagManager.class) {
            if (zza == null) {
                if (context != null) {
                    zza = new TagManager(context, new zzfn(), new DataLayer(new zzbe(context)), zzff.zzg());
                } else {
                    zzdh.zza("TagManager.getInstance requires non-null context.");
                    throw null;
                }
            }
            tagManager = zza;
        }
        return tagManager;
    }

    public static /* bridge */ /* synthetic */ void zzb(TagManager tagManager, String str) {
        Preconditions.checkNotNull(tagManager.zzf);
        for (zzaa zzaaVar : tagManager.zzf.values()) {
            zzaaVar.zzd(str);
        }
    }

    public void dispatch() {
        this.zze.zza();
    }

    @VisibleForTesting
    public final boolean zzc(zzaa zzaaVar) {
        if (this.zzf.remove(zzaaVar.zza()) != null) {
            return true;
        }
        return false;
    }

    public final synchronized boolean zzd(Uri uri) {
        zzea zza2 = zzea.zza();
        if (zza2.zzd(uri)) {
            String zzc = zza2.zzc();
            int zze = zza2.zze();
            int i = zze - 1;
            if (zze != 0) {
                if (i != 0) {
                    if (i == 1 || i == 2) {
                        for (String str : this.zzf.keySet()) {
                            zzaa zzaaVar = this.zzf.get(str);
                            if (str.equals(zzc)) {
                                zzaaVar.zze(zza2.zzb());
                                zzaaVar.refresh();
                            } else if (zzaaVar.zzb() != null) {
                                zzaaVar.zze(null);
                                zzaaVar.refresh();
                            }
                        }
                    }
                } else {
                    zzaa zzaaVar2 = this.zzf.get(zzc);
                    if (zzaaVar2 != null) {
                        zzaaVar2.zze(null);
                        zzaaVar2.refresh();
                    }
                }
                return true;
            }
            throw null;
        }
        return false;
    }
}
