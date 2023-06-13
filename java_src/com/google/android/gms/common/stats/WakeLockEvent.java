package com.google.android.gms.common.stats;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import ch.qos.logback.classic.net.SyslogAppender;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.List;
@KeepForSdk
@SafeParcelable.Class(creator = "WakeLockEventCreator")
@Deprecated
/* loaded from: classes5.dex */
public final class WakeLockEvent extends StatsEvent {
    public static final Parcelable.Creator<WakeLockEvent> CREATOR = new zza();
    @SafeParcelable.VersionField(m51603id = 1)
    final int zza;
    @SafeParcelable.Field(getter = "getTimeMillis", m51606id = 2)
    private final long zzb;
    @SafeParcelable.Field(getter = "getEventType", m51606id = 11)
    private int zzc;
    @SafeParcelable.Field(getter = "getWakeLockName", m51606id = 4)
    private final String zzd;
    @SafeParcelable.Field(getter = "getSecondaryWakeLockName", m51606id = 10)
    private final String zze;
    @SafeParcelable.Field(getter = "getCodePackage", m51606id = 17)
    private final String zzf;
    @SafeParcelable.Field(getter = "getWakeLockType", m51606id = 5)
    private final int zzg;
    @SafeParcelable.Field(getter = "getCallingPackages", m51606id = 6)
    private final List zzh;
    @SafeParcelable.Field(getter = "getEventKey", m51606id = 12)
    private final String zzi;
    @SafeParcelable.Field(getter = "getElapsedRealtime", m51606id = 8)
    private final long zzj;
    @SafeParcelable.Field(getter = "getDeviceState", m51606id = 14)
    private int zzk;
    @SafeParcelable.Field(getter = "getHostPackage", m51606id = 13)
    private final String zzl;
    @SafeParcelable.Field(getter = "getBeginPowerPercentage", m51606id = 15)
    private final float zzm;
    @SafeParcelable.Field(getter = "getTimeout", m51606id = 16)
    private final long zzn;
    @SafeParcelable.Field(getter = "getAcquiredWithTimeout", m51606id = 18)
    private final boolean zzo;
    private long zzp = -1;

    @SafeParcelable.Constructor
    public WakeLockEvent(@SafeParcelable.Param(m51605id = 1) int i, @SafeParcelable.Param(m51605id = 2) long j, @SafeParcelable.Param(m51605id = 11) int i2, @SafeParcelable.Param(m51605id = 4) String str, @SafeParcelable.Param(m51605id = 5) int i3, @SafeParcelable.Param(m51605id = 6) List list, @SafeParcelable.Param(m51605id = 12) String str2, @SafeParcelable.Param(m51605id = 8) long j2, @SafeParcelable.Param(m51605id = 14) int i4, @SafeParcelable.Param(m51605id = 10) String str3, @SafeParcelable.Param(m51605id = 13) String str4, @SafeParcelable.Param(m51605id = 15) float f, @SafeParcelable.Param(m51605id = 16) long j3, @SafeParcelable.Param(m51605id = 17) String str5, @SafeParcelable.Param(m51605id = 18) boolean z) {
        this.zza = i;
        this.zzb = j;
        this.zzc = i2;
        this.zzd = str;
        this.zze = str3;
        this.zzf = str5;
        this.zzg = i3;
        this.zzh = list;
        this.zzi = str2;
        this.zzj = j2;
        this.zzk = i4;
        this.zzl = str4;
        this.zzm = f;
        this.zzn = j3;
        this.zzo = z;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.zza);
        SafeParcelWriter.writeLong(parcel, 2, this.zzb);
        SafeParcelWriter.writeString(parcel, 4, this.zzd, false);
        SafeParcelWriter.writeInt(parcel, 5, this.zzg);
        SafeParcelWriter.writeStringList(parcel, 6, this.zzh, false);
        SafeParcelWriter.writeLong(parcel, 8, this.zzj);
        SafeParcelWriter.writeString(parcel, 10, this.zze, false);
        SafeParcelWriter.writeInt(parcel, 11, this.zzc);
        SafeParcelWriter.writeString(parcel, 12, this.zzi, false);
        SafeParcelWriter.writeString(parcel, 13, this.zzl, false);
        SafeParcelWriter.writeInt(parcel, 14, this.zzk);
        SafeParcelWriter.writeFloat(parcel, 15, this.zzm);
        SafeParcelWriter.writeLong(parcel, 16, this.zzn);
        SafeParcelWriter.writeString(parcel, 17, this.zzf, false);
        SafeParcelWriter.writeBoolean(parcel, 18, this.zzo);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    @Override // com.google.android.gms.common.stats.StatsEvent
    public final int zza() {
        return this.zzc;
    }

    @Override // com.google.android.gms.common.stats.StatsEvent
    public final long zzb() {
        return this.zzp;
    }

    @Override // com.google.android.gms.common.stats.StatsEvent
    public final long zzc() {
        return this.zzb;
    }

    @Override // com.google.android.gms.common.stats.StatsEvent
    public final String zzd() {
        String join;
        List list = this.zzh;
        String str = this.zzd;
        int i = this.zzg;
        String str2 = "";
        if (list == null) {
            join = "";
        } else {
            join = TextUtils.join(",", list);
        }
        int i2 = this.zzk;
        String str3 = this.zze;
        if (str3 == null) {
            str3 = "";
        }
        String str4 = this.zzl;
        if (str4 == null) {
            str4 = "";
        }
        float f = this.zzm;
        String str5 = this.zzf;
        if (str5 != null) {
            str2 = str5;
        }
        boolean z = this.zzo;
        return SyslogAppender.DEFAULT_STACKTRACE_PATTERN + str + SyslogAppender.DEFAULT_STACKTRACE_PATTERN + i + SyslogAppender.DEFAULT_STACKTRACE_PATTERN + join + SyslogAppender.DEFAULT_STACKTRACE_PATTERN + i2 + SyslogAppender.DEFAULT_STACKTRACE_PATTERN + str3 + SyslogAppender.DEFAULT_STACKTRACE_PATTERN + str4 + SyslogAppender.DEFAULT_STACKTRACE_PATTERN + f + SyslogAppender.DEFAULT_STACKTRACE_PATTERN + str2 + SyslogAppender.DEFAULT_STACKTRACE_PATTERN + z;
    }
}
