package com.google.android.gms.auth.api.accounttransfer;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.server.response.FastJsonResponse;
import com.google.android.gms.internal.auth.zzbz;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
@SafeParcelable.Class(creator = "AuthenticatorTransferInfoCreator")
/* loaded from: classes5.dex */
public final class zzv extends zzbz {
    public static final Parcelable.Creator<zzv> CREATOR = new zzw();
    private static final HashMap<String, FastJsonResponse.Field<?, ?>> zzc;
    @SafeParcelable.Indicator
    final Set<Integer> zza;
    @SafeParcelable.VersionField(m51603id = 1)
    final int zzb;
    @SafeParcelable.Field(getter = "getAccountType", m51606id = 2)
    private String zzd;
    @SafeParcelable.Field(getter = "getStatus", m51606id = 3)
    private int zze;
    @SafeParcelable.Field(getter = "getTransferBytes", m51606id = 4)
    private byte[] zzf;
    @SafeParcelable.Field(getter = "getPendingIntent", m51606id = 5)
    private PendingIntent zzg;
    @SafeParcelable.Field(getter = "getDeviceMetaData", m51606id = 6)
    private DeviceMetaData zzh;

    static {
        HashMap<String, FastJsonResponse.Field<?, ?>> hashMap = new HashMap<>();
        zzc = hashMap;
        hashMap.put("accountType", FastJsonResponse.Field.forString("accountType", 2));
        hashMap.put("status", FastJsonResponse.Field.forInteger("status", 3));
        hashMap.put("transferBytes", FastJsonResponse.Field.forBase64("transferBytes", 4));
    }

    public zzv() {
        this.zza = new C30704yo(3);
        this.zzb = 1;
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final /* bridge */ /* synthetic */ Map getFieldMappings() {
        return zzc;
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final Object getFieldValue(FastJsonResponse.Field field) {
        int safeParcelableFieldId = field.getSafeParcelableFieldId();
        if (safeParcelableFieldId != 1) {
            if (safeParcelableFieldId != 2) {
                if (safeParcelableFieldId != 3) {
                    if (safeParcelableFieldId == 4) {
                        return this.zzf;
                    }
                    int safeParcelableFieldId2 = field.getSafeParcelableFieldId();
                    StringBuilder sb = new StringBuilder(37);
                    sb.append("Unknown SafeParcelable id=");
                    sb.append(safeParcelableFieldId2);
                    throw new IllegalStateException(sb.toString());
                }
                return Integer.valueOf(this.zze);
            }
            return this.zzd;
        }
        return Integer.valueOf(this.zzb);
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final boolean isFieldSet(FastJsonResponse.Field field) {
        return this.zza.contains(Integer.valueOf(field.getSafeParcelableFieldId()));
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final void setDecodedBytesInternal(FastJsonResponse.Field<?, ?> field, String str, byte[] bArr) {
        int safeParcelableFieldId = field.getSafeParcelableFieldId();
        if (safeParcelableFieldId == 4) {
            this.zzf = bArr;
            this.zza.add(Integer.valueOf(safeParcelableFieldId));
            return;
        }
        StringBuilder sb = new StringBuilder(59);
        sb.append("Field with id=");
        sb.append(safeParcelableFieldId);
        sb.append(" is not known to be an byte array.");
        throw new IllegalArgumentException(sb.toString());
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final void setIntegerInternal(FastJsonResponse.Field<?, ?> field, String str, int i) {
        int safeParcelableFieldId = field.getSafeParcelableFieldId();
        if (safeParcelableFieldId == 3) {
            this.zze = i;
            this.zza.add(Integer.valueOf(safeParcelableFieldId));
            return;
        }
        StringBuilder sb = new StringBuilder(52);
        sb.append("Field with id=");
        sb.append(safeParcelableFieldId);
        sb.append(" is not known to be an int.");
        throw new IllegalArgumentException(sb.toString());
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final void setStringInternal(FastJsonResponse.Field<?, ?> field, String str, String str2) {
        int safeParcelableFieldId = field.getSafeParcelableFieldId();
        if (safeParcelableFieldId == 2) {
            this.zzd = str2;
            this.zza.add(Integer.valueOf(safeParcelableFieldId));
            return;
        }
        throw new IllegalArgumentException(String.format("Field with id=%d is not known to be a string.", Integer.valueOf(safeParcelableFieldId)));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        Set<Integer> set = this.zza;
        if (set.contains(1)) {
            SafeParcelWriter.writeInt(parcel, 1, this.zzb);
        }
        if (set.contains(2)) {
            SafeParcelWriter.writeString(parcel, 2, this.zzd, true);
        }
        if (set.contains(3)) {
            SafeParcelWriter.writeInt(parcel, 3, this.zze);
        }
        if (set.contains(4)) {
            SafeParcelWriter.writeByteArray(parcel, 4, this.zzf, true);
        }
        if (set.contains(5)) {
            SafeParcelWriter.writeParcelable(parcel, 5, this.zzg, i, true);
        }
        if (set.contains(6)) {
            SafeParcelWriter.writeParcelable(parcel, 6, this.zzh, i, true);
        }
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    @SafeParcelable.Constructor
    public zzv(@SafeParcelable.Indicator Set<Integer> set, @SafeParcelable.Param(m51605id = 1) int i, @SafeParcelable.Param(m51605id = 2) String str, @SafeParcelable.Param(m51605id = 3) int i2, @SafeParcelable.Param(m51605id = 4) byte[] bArr, @SafeParcelable.Param(m51605id = 5) PendingIntent pendingIntent, @SafeParcelable.Param(m51605id = 6) DeviceMetaData deviceMetaData) {
        this.zza = set;
        this.zzb = i;
        this.zzd = str;
        this.zze = i2;
        this.zzf = bArr;
        this.zzg = pendingIntent;
        this.zzh = deviceMetaData;
    }
}
