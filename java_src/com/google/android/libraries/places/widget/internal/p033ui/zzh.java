package com.google.android.libraries.places.widget.internal.p033ui;

import android.content.Context;
import androidx.fragment.app.C11672e;
import androidx.fragment.app.Fragment;
import com.google.android.libraries.places.api.Places;
import com.google.android.libraries.places.api.net.PlacesClient;
import com.google.android.libraries.places.internal.zzas;
import com.google.android.libraries.places.internal.zzav;
import com.google.android.libraries.places.internal.zzes;
import com.google.android.libraries.places.internal.zzet;
import com.google.android.libraries.places.internal.zzex;
import com.google.android.libraries.places.internal.zzfl;
import com.google.android.libraries.places.internal.zzgj;
import com.google.android.libraries.places.internal.zzgk;
/* renamed from: com.google.android.libraries.places.widget.internal.ui.zzh */
/* loaded from: classes6.dex */
public final class zzh extends C11672e {
    private final int zza;
    private final PlacesClient zzb;
    private final zzfl zzc;
    private final zzgj zzd;
    private final zzas zze;

    public zzh(int i, Context context, zzfl zzflVar) {
        this.zza = i;
        Context applicationContext = context.getApplicationContext();
        zzes zzd = zzet.zzd(applicationContext);
        zzd.zzd(2);
        zzet zze = zzd.zze();
        zzex zzexVar = new zzex(applicationContext);
        this.zzb = Places.zza(applicationContext, zze);
        this.zzc = zzflVar;
        this.zzd = new zzgk(zzexVar, zze, null);
        this.zze = new zzav();
    }

    @Override // androidx.fragment.app.C11672e
    public final Fragment instantiate(ClassLoader classLoader, String str) {
        if (C11672e.loadFragmentClass(classLoader, str) == AutocompleteImplFragment.class) {
            return new AutocompleteImplFragment(this.zza, this.zzb, this.zzc, this.zzd, this.zze);
        }
        return super.instantiate(classLoader, str);
    }
}
