package com.google.android.gms.internal.gtm;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Pair;
import ch.qos.logback.core.CoreConstants;
import com.google.android.gms.analytics.CampaignTrackingReceiver;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.wrappers.Wrappers;
import com.stripe.android.stripe3ds2.transactions.MessageExtension;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public final class zzck extends zzbs {
    private boolean zza;
    private final zzce zzb;
    private final zzfe zzc;
    private final zzfc zzd;
    private final zzcc zze;
    private long zzf;
    private final zzcw zzg;
    private final zzcw zzh;
    private final zzfo zzi;
    private long zzj;
    private boolean zzk;

    public zzck(zzbv zzbvVar, zzbw zzbwVar) {
        super(zzbvVar);
        Preconditions.checkNotNull(zzbwVar);
        this.zzf = Long.MIN_VALUE;
        this.zzd = new zzfc(zzbvVar);
        this.zzb = new zzce(zzbvVar);
        this.zzc = new zzfe(zzbvVar);
        this.zze = new zzcc(zzbvVar);
        this.zzi = new zzfo(zzC());
        this.zzg = new zzcg(this, zzbvVar);
        this.zzh = new zzch(this, zzbvVar);
    }

    private final void zzag() {
        zzcy zzy = zzy();
        if (zzy.zze()) {
            zzy.zza();
        }
    }

    private final void zzah() {
        if (this.zzg.zzh()) {
            zzO("All hits dispatched or no network/service. Going to power save mode");
        }
        this.zzg.zzf();
    }

    private final void zzai() {
        long j;
        zzcy zzy = zzy();
        if (zzy.zzc() && !zzy.zze()) {
            Ql9.m87996h();
            zzW();
            try {
                j = this.zzb.zzc();
            } catch (SQLiteException e) {
                zzK("Failed to get min/max hit times from local store", e);
                j = 0;
            }
            if (j != 0) {
                long abs = Math.abs(zzC().currentTimeMillis() - j);
                zzw();
                if (abs <= zzeu.zzn.zzb().longValue()) {
                    zzw();
                    zzP("Dispatch alarm scheduled (ms)", Long.valueOf(zzct.zzd()));
                    zzy.zzb();
                }
            }
        }
    }

    private final void zzaj(zzbx zzbxVar, zzaw zzawVar) {
        Preconditions.checkNotNull(zzbxVar);
        Preconditions.checkNotNull(zzawVar);
        C48176re7 c48176re7 = new C48176re7(zzt());
        c48176re7.m15626f(zzbxVar.zzc());
        c48176re7.m15625g(zzbxVar.zzf());
        C34366Lt8 m15628d = c48176re7.m15628d();
        zzbe zzbeVar = (zzbe) m15628d.m96231b(zzbe.class);
        zzbeVar.zzk(MessageExtension.FIELD_DATA);
        zzbeVar.zzl(true);
        m15628d.m96226g(zzawVar);
        zzaz zzazVar = (zzaz) m15628d.m96231b(zzaz.class);
        zzav zzavVar = (zzav) m15628d.m96231b(zzav.class);
        for (Map.Entry<String, String> entry : zzbxVar.zzd().entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            if ("an".equals(key)) {
                zzavVar.zzk(value);
            } else if ("av".equals(key)) {
                zzavVar.zzl(value);
            } else if ("aid".equals(key)) {
                zzavVar.zzi(value);
            } else if ("aiid".equals(key)) {
                zzavVar.zzj(value);
            } else if ("uid".equals(key)) {
                zzbeVar.zzm(value);
            } else {
                zzazVar.zze(key, value);
            }
        }
        zzH("Sending installation campaign to", zzbxVar.zzc(), zzawVar);
        m15628d.m96223j(zzA().zza());
        m15628d.m96222k();
    }

    private final boolean zzak(String str) {
        return Wrappers.packageManager(zzo()).checkCallingOrSelfPermission(str) == 0;
    }

    public static /* bridge */ /* synthetic */ void zzc(zzck zzckVar) {
        try {
            zzckVar.zzb.zza();
            zzckVar.zzae();
        } catch (SQLiteException e) {
            zzckVar.zzS("Failed to delete stale hits", e);
        }
        zzcw zzcwVar = zzckVar.zzh;
        zzckVar.zzw();
        zzcwVar.zzg(CoreConstants.MILLIS_IN_ONE_DAY);
    }

    public final long zza() {
        long j = this.zzf;
        if (j != Long.MIN_VALUE) {
            return j;
        }
        zzw();
        long longValue = zzeu.zzi.zzb().longValue();
        zzft zzB = zzB();
        zzB.zzW();
        if (zzB.zzc) {
            zzft zzB2 = zzB();
            zzB2.zzW();
            return zzB2.zzd * 1000;
        }
        return longValue;
    }

    public final void zzaa() {
        zzW();
        Preconditions.checkState(!this.zza, "Analytics backend already started");
        this.zza = true;
        zzq().m87995i(new zzci(this));
    }

    public final void zzab() {
        zzW();
        zzw();
        Ql9.m87996h();
        Context zza = zzt().zza();
        if (!zzfi.zza(zza)) {
            zzR("AnalyticsReceiver is not registered or is disabled. Register the receiver for reliable dispatching on non-Google Play devices. See http://goo.gl/8Rd3yj for instructions.");
        } else if (!zzfn.zzh(zza)) {
            zzJ("AnalyticsService is not registered or is disabled. Analytics service at risk of not starting. See http://goo.gl/8Rd3yj for instructions.");
        }
        if (!CampaignTrackingReceiver.zzb(zza)) {
            zzR("CampaignTrackingReceiver is not registered, not exported or is disabled. Installation campaign tracking is not possible. See http://goo.gl/8Rd3yj for instructions.");
        }
        zzA().zza();
        if (!zzak("android.permission.ACCESS_NETWORK_STATE")) {
            zzJ("Missing required android.permission.ACCESS_NETWORK_STATE. Google Analytics disabled. See http://goo.gl/8Rd3yj for instructions");
            zzad();
        }
        if (!zzak("android.permission.INTERNET")) {
            zzJ("Missing required android.permission.INTERNET. Google Analytics disabled. See http://goo.gl/8Rd3yj for instructions");
            zzad();
        }
        if (zzfn.zzh(zzo())) {
            zzO("AnalyticsService registered in the app manifest and enabled");
        } else {
            zzw();
            zzR("AnalyticsService not registered in the app manifest. Hits might not be delivered reliably. See http://goo.gl/8Rd3yj for instructions.");
        }
        if (!this.zzk) {
            zzw();
            if (!this.zzb.zzac()) {
                zzi();
            }
        }
        zzae();
    }

    public final void zzad() {
        zzW();
        Ql9.m87996h();
        this.zzk = true;
        this.zze.zzc();
        zzae();
    }

    public final void zzae() {
        long min;
        Ql9.m87996h();
        zzW();
        if (!this.zzk) {
            zzw();
            if (zza() > 0) {
                if (this.zzb.zzac()) {
                    this.zzd.zzc();
                    zzah();
                    zzag();
                    return;
                }
                if (!zzeu.zzJ.zzb().booleanValue()) {
                    this.zzd.zza();
                    if (!this.zzd.zzd()) {
                        zzah();
                        zzag();
                        zzai();
                        return;
                    }
                }
                zzai();
                long zza = zza();
                long zzb = zzA().zzb();
                if (zzb != 0) {
                    min = zza - Math.abs(zzC().currentTimeMillis() - zzb);
                    if (min <= 0) {
                        zzw();
                        min = Math.min(zzct.zze(), zza);
                    }
                } else {
                    zzw();
                    min = Math.min(zzct.zze(), zza);
                }
                zzP("Dispatch scheduled (ms)", Long.valueOf(min));
                if (this.zzg.zzh()) {
                    this.zzg.zze(Math.max(1L, min + this.zzg.zzb()));
                    return;
                }
                this.zzg.zzg(min);
                return;
            }
        }
        this.zzd.zzc();
        zzah();
        zzag();
    }

    public final boolean zzaf() {
        boolean z;
        Ql9.m87996h();
        zzW();
        zzO("Dispatching a batch of local hits");
        if (!this.zze.zzg()) {
            zzw();
            z = true;
        } else {
            z = false;
        }
        boolean zze = true ^ this.zzc.zze();
        if (z && zze) {
            zzO("No network or service available. Will retry later");
            return false;
        }
        zzw();
        int zzh = zzct.zzh();
        zzw();
        long max = Math.max(zzh, zzct.zzg());
        ArrayList arrayList = new ArrayList();
        long j = 0;
        while (true) {
            try {
                this.zzb.zzm();
                arrayList.clear();
                try {
                    List<zzex> zzj = this.zzb.zzj(max);
                    if (zzj.isEmpty()) {
                        zzO("Store is empty, nothing to dispatch");
                        zzah();
                        zzag();
                        try {
                            this.zzb.zzab();
                            this.zzb.zzaa();
                            return false;
                        } catch (SQLiteException e) {
                            zzK("Failed to commit local dispatch transaction", e);
                            zzah();
                            zzag();
                            return false;
                        }
                    }
                    zzP("Hits loaded from store. count", Integer.valueOf(zzj.size()));
                    Iterator<zzex> it = zzj.iterator();
                    while (it.hasNext()) {
                        if (it.next().zzb() == j) {
                            zzL("Database contains successfully uploaded hit", Long.valueOf(j), Integer.valueOf(zzj.size()));
                            zzah();
                            zzag();
                            try {
                                this.zzb.zzab();
                                this.zzb.zzaa();
                                return false;
                            } catch (SQLiteException e2) {
                                zzK("Failed to commit local dispatch transaction", e2);
                                zzah();
                                zzag();
                                return false;
                            }
                        }
                    }
                    if (this.zze.zzg()) {
                        zzw();
                        zzO("Service connected, sending hits to the service");
                        while (!zzj.isEmpty()) {
                            zzex zzexVar = zzj.get(0);
                            if (!this.zze.zzh(zzexVar)) {
                                break;
                            }
                            j = Math.max(j, zzexVar.zzb());
                            zzj.remove(zzexVar);
                            zzG("Hit sent do device AnalyticsService for delivery", zzexVar);
                            try {
                                this.zzb.zzn(zzexVar.zzb());
                                arrayList.add(Long.valueOf(zzexVar.zzb()));
                            } catch (SQLiteException e3) {
                                zzK("Failed to remove hit that was send for delivery", e3);
                                zzah();
                                zzag();
                                try {
                                    this.zzb.zzab();
                                    this.zzb.zzaa();
                                    return false;
                                } catch (SQLiteException e4) {
                                    zzK("Failed to commit local dispatch transaction", e4);
                                    zzah();
                                    zzag();
                                    return false;
                                }
                            }
                        }
                    }
                    if (this.zzc.zze()) {
                        List<Long> zzc = this.zzc.zzc(zzj);
                        for (Long l : zzc) {
                            j = Math.max(j, l.longValue());
                        }
                        try {
                            this.zzb.zzZ(zzc);
                            arrayList.addAll(zzc);
                        } catch (SQLiteException e5) {
                            zzK("Failed to remove successfully uploaded hits", e5);
                            zzah();
                            zzag();
                            try {
                                this.zzb.zzab();
                                this.zzb.zzaa();
                                return false;
                            } catch (SQLiteException e6) {
                                zzK("Failed to commit local dispatch transaction", e6);
                                zzah();
                                zzag();
                                return false;
                            }
                        }
                    }
                    if (arrayList.isEmpty()) {
                        try {
                            this.zzb.zzab();
                            this.zzb.zzaa();
                            return false;
                        } catch (SQLiteException e7) {
                            zzK("Failed to commit local dispatch transaction", e7);
                            zzah();
                            zzag();
                            return false;
                        }
                    }
                    try {
                        this.zzb.zzab();
                        this.zzb.zzaa();
                    } catch (SQLiteException e8) {
                        zzK("Failed to commit local dispatch transaction", e8);
                        zzah();
                        zzag();
                        return false;
                    }
                } catch (SQLiteException e9) {
                    zzS("Failed to read hits from persisted store", e9);
                    zzah();
                    zzag();
                    try {
                        this.zzb.zzab();
                        this.zzb.zzaa();
                        return false;
                    } catch (SQLiteException e10) {
                        zzK("Failed to commit local dispatch transaction", e10);
                        zzah();
                        zzag();
                        return false;
                    }
                }
            } catch (Throwable th) {
                this.zzb.zzab();
                this.zzb.zzaa();
                throw th;
            }
            try {
                this.zzb.zzab();
                this.zzb.zzaa();
                throw th;
            } catch (SQLiteException e11) {
                zzK("Failed to commit local dispatch transaction", e11);
                zzah();
                zzag();
                return false;
            }
        }
    }

    public final long zzb(zzbx zzbxVar, boolean z) {
        Preconditions.checkNotNull(zzbxVar);
        zzW();
        Ql9.m87996h();
        try {
            try {
                this.zzb.zzm();
                zzce zzceVar = this.zzb;
                String zzb = zzbxVar.zzb();
                Preconditions.checkNotEmpty(zzb);
                zzceVar.zzW();
                Ql9.m87996h();
                int delete = zzceVar.zzf().delete("properties", "app_uid=? AND cid<>?", new String[]{"0", zzb});
                if (delete > 0) {
                    zzceVar.zzP("Deleted property records", Integer.valueOf(delete));
                }
                long zze = this.zzb.zze(0L, zzbxVar.zzb(), zzbxVar.zzc());
                zzbxVar.zze(1 + zze);
                zzce zzceVar2 = this.zzb;
                Preconditions.checkNotNull(zzbxVar);
                zzceVar2.zzW();
                Ql9.m87996h();
                SQLiteDatabase zzf = zzceVar2.zzf();
                Map<String, String> zzd = zzbxVar.zzd();
                Preconditions.checkNotNull(zzd);
                Uri.Builder builder = new Uri.Builder();
                for (Map.Entry<String, String> entry : zzd.entrySet()) {
                    builder.appendQueryParameter(entry.getKey(), entry.getValue());
                }
                String encodedQuery = builder.build().getEncodedQuery();
                if (encodedQuery == null) {
                    encodedQuery = "";
                }
                ContentValues contentValues = new ContentValues();
                contentValues.put("app_uid", (Long) 0L);
                contentValues.put("cid", zzbxVar.zzb());
                contentValues.put("tid", zzbxVar.zzc());
                contentValues.put("adid", Integer.valueOf(zzbxVar.zzf() ? 1 : 0));
                contentValues.put("hits_count", Long.valueOf(zzbxVar.zza()));
                contentValues.put("params", encodedQuery);
                try {
                    if (zzf.insertWithOnConflict("properties", null, contentValues, 5) == -1) {
                        zzceVar2.zzJ("Failed to insert/update a property (got -1)");
                    }
                } catch (SQLiteException e) {
                    zzceVar2.zzK("Error storing a property", e);
                }
                this.zzb.zzab();
                try {
                    this.zzb.zzaa();
                } catch (SQLiteException e2) {
                    zzK("Failed to end transaction", e2);
                }
                return zze;
            } catch (Throwable th) {
                try {
                    this.zzb.zzaa();
                } catch (SQLiteException e3) {
                    zzK("Failed to end transaction", e3);
                }
                throw th;
            }
        } catch (SQLiteException e4) {
            zzK("Failed to update Analytics property", e4);
            try {
                this.zzb.zzaa();
            } catch (SQLiteException e5) {
                zzK("Failed to end transaction", e5);
            }
            return -1L;
        }
    }

    @Override // com.google.android.gms.internal.gtm.zzbs
    public final void zzd() {
        this.zzb.zzX();
        this.zzc.zzX();
        this.zze.zzX();
    }

    public final void zzf(zzcz zzczVar) {
        zzg(zzczVar, this.zzj);
    }

    public final void zzg(zzcz zzczVar, long j) {
        long j2;
        Ql9.m87996h();
        zzW();
        long zzb = zzA().zzb();
        if (zzb != 0) {
            j2 = Math.abs(zzC().currentTimeMillis() - zzb);
        } else {
            j2 = -1;
        }
        zzG("Dispatching local hits. Elapsed time since last dispatch (ms)", Long.valueOf(j2));
        zzw();
        zzi();
        try {
            zzaf();
            zzA().zzi();
            zzae();
            if (zzczVar != null) {
                zzczVar.zza(null);
            }
            if (this.zzj != j) {
                this.zzd.zzb();
            }
        } catch (Exception e) {
            zzK("Local dispatch failed", e);
            zzA().zzi();
            zzae();
            if (zzczVar != null) {
                zzczVar.zza(e);
            }
        }
    }

    public final void zzi() {
        if (this.zzk) {
            return;
        }
        zzw();
        if (!zzct.zzl() || this.zze.zzg()) {
            return;
        }
        zzw();
        if (this.zzi.zzc(zzeu.zzO.zzb().longValue())) {
            this.zzi.zzb();
            zzO("Connecting to service");
            if (this.zze.zzf()) {
                zzO("Connected to service");
                this.zzi.zza();
                zzm();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x017e, code lost:
        if (r2 == 0) goto L61;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v11, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9, types: [android.database.Cursor] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzj(zzex zzexVar) {
        String zzk;
        SQLiteDatabase zzf;
        ArrayList arrayList;
        List<Long> list;
        Pair<String, Long> zza;
        zzex zzexVar2 = zzexVar;
        ?? r2 = "hit_id";
        Preconditions.checkNotNull(zzexVar);
        Ql9.m87996h();
        zzW();
        if (this.zzk) {
            zzF("Hit delivery not possible. Missing network permissions. See http://goo.gl/8Rd3yj for instructions");
        } else {
            zzP("Delivering hit", zzexVar2);
        }
        if (TextUtils.isEmpty(zzexVar.zzf()) && (zza = zzA().zze().zza()) != null) {
            String str = (String) zza.first;
            String valueOf = String.valueOf((Long) zza.second);
            StringBuilder sb = new StringBuilder(valueOf.length() + 1 + String.valueOf(str).length());
            sb.append(valueOf);
            sb.append(":");
            sb.append(str);
            String sb2 = sb.toString();
            HashMap hashMap = new HashMap(zzexVar.zzg());
            hashMap.put("_m", sb2);
            zzexVar2 = zzex.zze(this, zzexVar2, hashMap);
        }
        zzex zzexVar3 = zzexVar2;
        zzi();
        if (this.zze.zzh(zzexVar3)) {
            zzF("Hit sent to the device AnalyticsService for delivery");
            return;
        }
        zzw();
        try {
            zzce zzceVar = this.zzb;
            Preconditions.checkNotNull(zzexVar3);
            Ql9.m87996h();
            zzceVar.zzW();
            Preconditions.checkNotNull(zzexVar3);
            Uri.Builder builder = new Uri.Builder();
            for (Map.Entry<String, String> entry : zzexVar3.zzg().entrySet()) {
                String key = entry.getKey();
                if (!"ht".equals(key) && !"qt".equals(key) && !"AppUID".equals(key)) {
                    builder.appendQueryParameter(key, entry.getValue());
                }
            }
            String encodedQuery = builder.build().getEncodedQuery();
            if (encodedQuery == null) {
                encodedQuery = "";
            }
            String str2 = encodedQuery;
            if (str2.length() > 8192) {
                zzceVar.zzz().zzb(zzexVar3, "Hit length exceeds the maximum allowed size");
            } else {
                zzceVar.zzw();
                int intValue = zzeu.zzf.zzb().intValue();
                long zzb = zzceVar.zzb();
                Cursor cursor = null;
                if (zzb > intValue - 1) {
                    long j = (zzb - intValue) + 1;
                    Ql9.m87996h();
                    zzceVar.zzW();
                    if (j <= 0) {
                        list = Collections.emptyList();
                    } else {
                        try {
                            zzf = zzceVar.zzf();
                            arrayList = new ArrayList();
                        } catch (Throwable th) {
                            th = th;
                            cursor = r2;
                        }
                        try {
                            r2 = zzf.query("hits2", new String[]{"hit_id"}, null, null, null, null, String.format("%s ASC", "hit_id"), Long.toString(j));
                            try {
                                if (r2.moveToFirst()) {
                                    do {
                                        arrayList.add(Long.valueOf(r2.getLong(0)));
                                    } while (r2.moveToNext());
                                }
                            } catch (SQLiteException e) {
                                e = e;
                                zzceVar.zzS("Error selecting hit ids", e);
                            }
                        } catch (SQLiteException e2) {
                            e = e2;
                            r2 = 0;
                        } catch (Throwable th2) {
                            th = th2;
                            if (cursor != null) {
                                cursor.close();
                            }
                            throw th;
                        }
                        r2.close();
                        list = arrayList;
                    }
                    zzceVar.zzS("Store full, deleting hits to make room, count", Integer.valueOf(list.size()));
                    zzceVar.zzZ(list);
                }
                SQLiteDatabase zzf2 = zzceVar.zzf();
                ContentValues contentValues = new ContentValues();
                contentValues.put("hit_string", str2);
                contentValues.put("hit_time", Long.valueOf(zzexVar3.zzd()));
                contentValues.put("hit_app_id", Integer.valueOf(zzexVar3.zza()));
                if (zzexVar3.zzh()) {
                    zzceVar.zzw();
                    zzk = zzct.zzi();
                } else {
                    zzceVar.zzw();
                    zzk = zzct.zzk();
                }
                contentValues.put("hit_url", zzk);
                try {
                    long insert = zzf2.insert("hits2", null, contentValues);
                    if (insert == -1) {
                        zzceVar.zzJ("Failed to insert a hit (got -1)");
                    } else {
                        zzceVar.zzH("Hit saved to database. db-id, hit", Long.valueOf(insert), zzexVar3);
                    }
                } catch (SQLiteException e3) {
                    zzceVar.zzK("Error storing a hit", e3);
                }
            }
            zzae();
        } catch (SQLiteException e4) {
            zzK("Delivery failed to save hit to a database", e4);
            zzz().zzb(zzexVar3, "deliver: failed to insert hit to database");
        }
    }

    public final void zzk(zzbx zzbxVar) {
        Ql9.m87996h();
        zzG("Sending first hit to property", zzbxVar.zzc());
        zzfo zzf = zzA().zzf();
        zzw();
        if (zzf.zzc(zzct.zzc())) {
            return;
        }
        String zzg = zzA().zzg();
        if (TextUtils.isEmpty(zzg)) {
            return;
        }
        zzaw zzb = zzfs.zzb(zzz(), zzg);
        zzG("Found relevant installation campaign", zzb);
        zzaj(zzbxVar, zzb);
    }

    public final void zzl() {
        Ql9.m87996h();
        this.zzj = zzC().currentTimeMillis();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x004d A[LOOP:1: B:15:0x004d->B:22:0x0069, LOOP_START] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0080 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzm() {
        Ql9.m87996h();
        zzw();
        Ql9.m87996h();
        zzW();
        zzE();
        zzw();
        if (!zzct.zzl()) {
            zzR("Service client disabled. Can't dispatch local hits to device AnalyticsService");
        }
        if (!this.zze.zzg()) {
            zzO("Service not connected");
        } else if (this.zzb.zzac()) {
        } else {
            zzO("Dispatching local hits to device AnalyticsService");
            while (true) {
                try {
                    zzce zzceVar = this.zzb;
                    zzw();
                    List<zzex> zzj = zzceVar.zzj(zzct.zzh());
                    if (zzj.isEmpty()) {
                        while (true) {
                            if (!zzj.isEmpty()) {
                                zzex zzexVar = zzj.get(0);
                                if (!this.zze.zzh(zzexVar)) {
                                    zzae();
                                    return;
                                }
                                zzj.remove(zzexVar);
                                try {
                                    this.zzb.zzn(zzexVar.zzb());
                                } catch (SQLiteException e) {
                                    zzK("Failed to remove hit that was send for delivery", e);
                                    zzah();
                                    zzag();
                                    return;
                                }
                            }
                        }
                        zzce zzceVar2 = this.zzb;
                        zzw();
                        List<zzex> zzj2 = zzceVar2.zzj(zzct.zzh());
                        if (zzj2.isEmpty()) {
                            zzae();
                            return;
                        }
                    }
                } catch (SQLiteException e2) {
                    zzK("Failed to read hits from store", e2);
                    zzah();
                    zzag();
                    return;
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0103 A[Catch: all -> 0x0120, SQLiteException -> 0x0122, TRY_LEAVE, TryCatch #1 {SQLiteException -> 0x0122, blocks: (B:19:0x0073, B:21:0x00ae, B:25:0x00c4, B:27:0x00d9, B:30:0x00e0, B:32:0x00f7, B:31:0x00f2, B:34:0x00fd, B:36:0x0103), top: B:50:0x0073, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0115 A[LOOP:1: B:38:0x010f->B:40:0x0115, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzn(String str) {
        boolean z;
        Preconditions.checkNotEmpty(str);
        Ql9.m87996h();
        zzE();
        zzaw zzb = zzfs.zzb(zzz(), str);
        if (zzb == null) {
            zzS("Parsing failed. Ignoring invalid campaign data", str);
            return;
        }
        String zzg = zzA().zzg();
        if (str.equals(zzg)) {
            zzR("Ignoring duplicate install campaign");
        } else if (!TextUtils.isEmpty(zzg)) {
            zzL("Ignoring multiple install campaigns. original, new", zzg, str);
        } else {
            zzA().zzh(str);
            zzfo zzf = zzA().zzf();
            zzw();
            if (zzf.zzc(zzct.zzc())) {
                zzS("Campaign received too late, ignoring", zzb);
                return;
            }
            zzG("Received installation campaign", zzb);
            zzce zzceVar = this.zzb;
            zzceVar.zzW();
            Ql9.m87996h();
            SQLiteDatabase zzf2 = zzceVar.zzf();
            Cursor cursor = null;
            try {
                try {
                    zzceVar.zzw();
                    int intValue = zzeu.zzh.zzb().intValue();
                    cursor = zzf2.query("properties", new String[]{"cid", "tid", "adid", "hits_count", "params"}, "app_uid=?", new String[]{"0"}, null, null, null, String.valueOf(intValue));
                    ArrayList<zzbx> arrayList = new ArrayList();
                    if (cursor.moveToFirst()) {
                        do {
                            String string = cursor.getString(0);
                            String string2 = cursor.getString(1);
                            if (cursor.getInt(2) != 0) {
                                z = true;
                            } else {
                                z = false;
                            }
                            long j = cursor.getInt(3);
                            Map<String, String> zzl = zzceVar.zzl(cursor.getString(4));
                            if (!TextUtils.isEmpty(string) && !TextUtils.isEmpty(string2)) {
                                arrayList.add(new zzbx(0L, string, string2, z, j, zzl));
                            }
                            zzceVar.zzT("Read property with empty client id or tracker id", string, string2);
                        } while (cursor.moveToNext());
                        if (arrayList.size() >= intValue) {
                            zzceVar.zzR("Sending hits to too many properties. Campaign report might be incorrect");
                        }
                        cursor.close();
                        for (zzbx zzbxVar : arrayList) {
                            zzaj(zzbxVar, zzb);
                        }
                    }
                    if (arrayList.size() >= intValue) {
                    }
                    cursor.close();
                    while (r0.hasNext()) {
                    }
                } catch (SQLiteException e) {
                    zzceVar.zzK("Error loading hits from the database", e);
                    throw e;
                }
            } catch (Throwable th) {
                if (cursor != null) {
                    cursor.close();
                }
                throw th;
            }
        }
    }
}
