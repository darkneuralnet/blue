package p000;

import android.net.Uri;
import android.text.TextUtils;
import com.facebook.share.internal.C17296a;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.gtm.zzav;
import com.google.android.gms.internal.gtm.zzaw;
import com.google.android.gms.internal.gtm.zzax;
import com.google.android.gms.internal.gtm.zzay;
import com.google.android.gms.internal.gtm.zzaz;
import com.google.android.gms.internal.gtm.zzba;
import com.google.android.gms.internal.gtm.zzbb;
import com.google.android.gms.internal.gtm.zzbc;
import com.google.android.gms.internal.gtm.zzbd;
import com.google.android.gms.internal.gtm.zzbe;
import com.google.android.gms.internal.gtm.zzbf;
import com.google.android.gms.internal.gtm.zzbg;
import com.google.android.gms.internal.gtm.zzbh;
import com.google.android.gms.internal.gtm.zzbr;
import com.google.android.gms.internal.gtm.zzbt;
import com.google.android.gms.internal.gtm.zzbv;
import com.google.android.gms.internal.gtm.zzbx;
import com.google.android.gms.internal.gtm.zzex;
import com.google.android.gms.internal.gtm.zzfs;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* renamed from: NB7 */
/* loaded from: classes5.dex */
public final class NB7 extends zzbr implements Zq9 {

    /* renamed from: e */
    public static DecimalFormat f24245e;

    /* renamed from: b */
    public final zzbv f24246b;

    /* renamed from: c */
    public final String f24247c;

    /* renamed from: d */
    public final Uri f24248d;

    public NB7(zzbv zzbvVar, String str) {
        super(zzbvVar);
        Preconditions.checkNotEmpty(str);
        this.f24246b = zzbvVar;
        this.f24247c = str;
        this.f24248d = m94255b(str);
    }

    /* renamed from: b */
    public static Uri m94255b(String str) {
        Preconditions.checkNotEmpty(str);
        Uri.Builder builder = new Uri.Builder();
        builder.scheme("uri");
        builder.authority("google-analytics.com");
        builder.path(str);
        return builder.build();
    }

    /* renamed from: c */
    public static String m94254c(double d) {
        if (f24245e == null) {
            f24245e = new DecimalFormat("0.######");
        }
        return f24245e.format(d);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x003c, code lost:
        if (android.text.TextUtils.isEmpty(r6) != false) goto L8;
     */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0067 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:106:0x001e A[SYNTHETIC] */
    @VisibleForTesting
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Map<String, String> m94253d(C34366Lt8 c34366Lt8) {
        String str;
        String valueOf;
        HashMap hashMap = new HashMap();
        zzaz zzazVar = (zzaz) c34366Lt8.m96230c(zzaz.class);
        if (zzazVar != null) {
            for (Map.Entry<String, Object> entry : zzazVar.zzd().entrySet()) {
                Object value = entry.getValue();
                if (value != null) {
                    if (value instanceof String) {
                        valueOf = (String) value;
                    } else if (value instanceof Double) {
                        Double d = (Double) value;
                        if (d.doubleValue() != 0.0d) {
                            valueOf = m94254c(d.doubleValue());
                            if (valueOf != null) {
                                hashMap.put(entry.getKey(), valueOf);
                            }
                        }
                    } else {
                        if (value instanceof Boolean) {
                            if (value != Boolean.FALSE) {
                                valueOf = "1";
                            }
                        } else {
                            valueOf = String.valueOf(value);
                        }
                        if (valueOf != null) {
                        }
                    }
                }
                valueOf = null;
                if (valueOf != null) {
                }
            }
        }
        zzbe zzbeVar = (zzbe) c34366Lt8.m96230c(zzbe.class);
        if (zzbeVar != null) {
            m94252f(hashMap, "t", zzbeVar.zzf());
            m94252f(hashMap, "cid", zzbeVar.zze());
            m94252f(hashMap, "uid", zzbeVar.zzg());
            m94252f(hashMap, "sc", null);
            m94251g(hashMap, "ni", zzbeVar.zzo());
            m94252f(hashMap, "adid", zzbeVar.zzd());
            m94251g(hashMap, "ate", zzbeVar.zzn());
        }
        zzbf zzbfVar = (zzbf) c34366Lt8.m96230c(zzbf.class);
        if (zzbfVar != null) {
            m94252f(hashMap, "cd", null);
            double zzd = zzbfVar.zzd();
            if (zzd != 0.0d) {
                hashMap.put(C17296a.f69688o, m94254c(zzd));
            }
            m94252f(hashMap, "dr", null);
        }
        if (((zzbc) c34366Lt8.m96230c(zzbc.class)) != null) {
            m94252f(hashMap, "ec", null);
            m94252f(hashMap, "ea", null);
            m94252f(hashMap, "el", null);
        }
        zzaw zzawVar = (zzaw) c34366Lt8.m96230c(zzaw.class);
        if (zzawVar != null) {
            m94252f(hashMap, "cn", zzawVar.zzl());
            m94252f(hashMap, "cs", zzawVar.zzm());
            m94252f(hashMap, "cm", zzawVar.zzk());
            m94252f(hashMap, "ck", zzawVar.zzj());
            m94252f(hashMap, "cc", zzawVar.zzf());
            m94252f(hashMap, "ci", zzawVar.zzi());
            m94252f(hashMap, "anid", zzawVar.zze());
            m94252f(hashMap, "gclid", zzawVar.zzh());
            m94252f(hashMap, "dclid", zzawVar.zzg());
            m94252f(hashMap, "aclid", zzawVar.zzd());
        }
        if (((zzbd) c34366Lt8.m96230c(zzbd.class)) != null) {
            m94252f(hashMap, "exd", null);
        }
        if (((zzbg) c34366Lt8.m96230c(zzbg.class)) != null) {
            m94252f(hashMap, "sn", null);
            m94252f(hashMap, "sa", null);
            m94252f(hashMap, "st", null);
        }
        if (((zzbh) c34366Lt8.m96230c(zzbh.class)) != null) {
            m94252f(hashMap, "utv", null);
            m94252f(hashMap, "utc", null);
            m94252f(hashMap, "utl", null);
        }
        zzax zzaxVar = (zzax) c34366Lt8.m96230c(zzax.class);
        if (zzaxVar != null) {
            for (Map.Entry<Integer, String> entry2 : zzaxVar.zzd().entrySet()) {
                String m100230a = JY7.m100230a(entry2.getKey().intValue());
                if (!TextUtils.isEmpty(m100230a)) {
                    hashMap.put(m100230a, entry2.getValue());
                }
            }
        }
        zzay zzayVar = (zzay) c34366Lt8.m96230c(zzay.class);
        if (zzayVar != null) {
            for (Map.Entry<Integer, Double> entry3 : zzayVar.zzd().entrySet()) {
                String m100229b = JY7.m100229b(entry3.getKey().intValue());
                if (!TextUtils.isEmpty(m100229b)) {
                    hashMap.put(m100229b, m94254c(entry3.getValue().doubleValue()));
                }
            }
        }
        zzbb zzbbVar = (zzbb) c34366Lt8.m96230c(zzbb.class);
        if (zzbbVar != null) {
            int i = 1;
            for (C44914m84 c44914m84 : zzbbVar.zze()) {
                hashMap.putAll(c44914m84.m26293a(JY7.m100225f(i)));
                i++;
            }
            int i2 = 1;
            for (C46090o74 c46090o74 : zzbbVar.zzd()) {
                hashMap.putAll(c46090o74.m21756a(JY7.m100226e(i2)));
                i2++;
            }
            int i3 = 1;
            for (Map.Entry<String, List<C46090o74>> entry4 : zzbbVar.zzf().entrySet()) {
                String m100228c = JY7.m100228c(i3);
                int i4 = 1;
                for (C46090o74 c46090o742 : entry4.getValue()) {
                    String valueOf2 = String.valueOf(m100228c);
                    String valueOf3 = String.valueOf(JY7.m100227d(i4));
                    if (valueOf3.length() != 0) {
                        str = valueOf2.concat(valueOf3);
                    } else {
                        str = new String(valueOf2);
                    }
                    hashMap.putAll(c46090o742.m21756a(str));
                    i4++;
                }
                if (!TextUtils.isEmpty(entry4.getKey())) {
                    hashMap.put(String.valueOf(m100228c).concat("nm"), entry4.getKey());
                }
                i3++;
            }
        }
        zzba zzbaVar = (zzba) c34366Lt8.m96230c(zzba.class);
        if (zzbaVar != null) {
            m94252f(hashMap, "ul", zzbaVar.zzd());
            int i5 = zzbaVar.zza;
            int i6 = zzbaVar.zzb;
            if (i5 > 0 && i6 > 0) {
                StringBuilder sb = new StringBuilder(23);
                sb.append(i5);
                sb.append("x");
                sb.append(i6);
                hashMap.put("sr", sb.toString());
            }
        }
        zzav zzavVar = (zzav) c34366Lt8.m96230c(zzav.class);
        if (zzavVar != null) {
            m94252f(hashMap, "an", zzavVar.zzf());
            m94252f(hashMap, "aid", zzavVar.zzd());
            m94252f(hashMap, "aiid", zzavVar.zze());
            m94252f(hashMap, "av", zzavVar.zzg());
        }
        return hashMap;
    }

    /* renamed from: f */
    public static void m94252f(Map<String, String> map, String str, String str2) {
        if (!TextUtils.isEmpty(str2)) {
            map.put(str, str2);
        }
    }

    /* renamed from: g */
    public static void m94251g(Map<String, String> map, String str, boolean z) {
        if (z) {
            map.put(str, "1");
        }
    }

    @Override // p000.Zq9
    /* renamed from: a */
    public final void mo72399a(C34366Lt8 c34366Lt8) {
        Preconditions.checkNotNull(c34366Lt8);
        Preconditions.checkArgument(c34366Lt8.m96220m(), "Can't deliver not submitted measurement");
        Preconditions.checkNotMainThread("deliver should be called on worker thread");
        C34366Lt8 c34366Lt82 = new C34366Lt8(c34366Lt8);
        zzbe zzbeVar = (zzbe) c34366Lt82.m96231b(zzbe.class);
        if (TextUtils.isEmpty(zzbeVar.zzf())) {
            zzz().zzc(m94253d(c34366Lt82), "Ignoring measurement without type");
        } else if (TextUtils.isEmpty(zzbeVar.zze())) {
            zzz().zzc(m94253d(c34366Lt82), "Ignoring measurement without client id");
        } else if (!this.f24246b.zzc().m71783h()) {
            if (zzfs.zzj(0.0d, zzbeVar.zze())) {
                zzG("Sampling enabled. Hit sampled out. sampling rate", Double.valueOf(0.0d));
                return;
            }
            Map<String, String> m94253d = m94253d(c34366Lt82);
            m94253d.put("v", "1");
            m94253d.put("_v", zzbt.zzb);
            m94253d.put("tid", this.f24247c);
            if (this.f24246b.zzc().m71782i()) {
                StringBuilder sb = new StringBuilder();
                for (Map.Entry<String, String> entry : m94253d.entrySet()) {
                    if (sb.length() != 0) {
                        sb.append(", ");
                    }
                    sb.append(entry.getKey());
                    sb.append("=");
                    sb.append(entry.getValue());
                }
                zzN("Dry run is enabled. GoogleAnalytics would have sent", sb.toString());
                return;
            }
            HashMap hashMap = new HashMap();
            zzfs.zzg(hashMap, "uid", zzbeVar.zzg());
            zzav zzavVar = (zzav) c34366Lt8.m96230c(zzav.class);
            if (zzavVar != null) {
                zzfs.zzg(hashMap, "an", zzavVar.zzf());
                zzfs.zzg(hashMap, "aid", zzavVar.zzd());
                zzfs.zzg(hashMap, "av", zzavVar.zzg());
                zzfs.zzg(hashMap, "aiid", zzavVar.zze());
            }
            m94253d.put("_s", String.valueOf(zzs().zza(new zzbx(0L, zzbeVar.zze(), this.f24247c, !TextUtils.isEmpty(zzbeVar.zzd()), 0L, hashMap))));
            zzs().zzh(new zzex(zzz(), m94253d, c34366Lt8.m96232a(), true));
        }
    }

    @Override // p000.Zq9
    public final Uri zzb() {
        return this.f24248d;
    }
}
