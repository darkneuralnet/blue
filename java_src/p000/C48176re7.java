package p000;

import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.gtm.zzbe;
import com.google.android.gms.internal.gtm.zzbi;
import com.google.android.gms.internal.gtm.zzbv;
import java.util.ListIterator;
@VisibleForTesting
/* renamed from: re7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C48176re7 extends TN8<C48176re7> {

    /* renamed from: d */
    public final zzbv f107400d;

    /* renamed from: e */
    public boolean f107401e;

    @VisibleForTesting
    public C48176re7(zzbv zzbvVar) {
        super(zzbvVar.zzd(), zzbvVar.zzr());
        this.f107400d = zzbvVar;
    }

    @Override // p000.TN8
    /* renamed from: a */
    public final void mo15629a(C34366Lt8 c34366Lt8) {
        zzbe zzbeVar = (zzbe) c34366Lt8.m96231b(zzbe.class);
        if (TextUtils.isEmpty(zzbeVar.zze())) {
            zzbeVar.zzj(this.f107400d.zzi().zzb());
        }
        if (this.f107401e && TextUtils.isEmpty(zzbeVar.zzd())) {
            zzbi zze = this.f107400d.zze();
            zzbeVar.zzi(zze.zza());
            zzbeVar.zzh(zze.zzb());
        }
    }

    /* renamed from: d */
    public final C34366Lt8 m15628d() {
        C34366Lt8 c34366Lt8 = new C34366Lt8(this.f35398b);
        c34366Lt8.m96226g(this.f107400d.zzh().zza());
        c34366Lt8.m96226g(this.f107400d.zzk().zza());
        m83704c(c34366Lt8);
        return c34366Lt8;
    }

    @VisibleForTesting
    /* renamed from: e */
    public final zzbv m15627e() {
        return this.f107400d;
    }

    /* renamed from: f */
    public final void m15626f(String str) {
        Preconditions.checkNotEmpty(str);
        Uri m94255b = NB7.m94255b(str);
        ListIterator<Zq9> listIterator = this.f35398b.m96227f().listIterator();
        while (listIterator.hasNext()) {
            if (m94255b.equals(listIterator.next().zzb())) {
                listIterator.remove();
            }
        }
        this.f35398b.m96227f().add(new NB7(this.f107400d, str));
    }

    /* renamed from: g */
    public final void m15625g(boolean z) {
        this.f107401e = z;
    }
}
