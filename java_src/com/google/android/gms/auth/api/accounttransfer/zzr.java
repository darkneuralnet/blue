package com.google.android.gms.auth.api.accounttransfer;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.server.response.FastJsonResponse;
import com.google.android.gms.internal.auth.zzbz;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
@SafeParcelable.Class(creator = "AccountTransferProgressCreator")
/* loaded from: classes5.dex */
public final class zzr extends zzbz {
    public static final Parcelable.Creator<zzr> CREATOR = new zzs();
    private static final C28385so<String, FastJsonResponse.Field<?, ?>> zzb;
    @SafeParcelable.VersionField(m51603id = 1)
    final int zza;
    @SafeParcelable.Field(getter = "getRegisteredAccountTypes", m51606id = 2)
    private List<String> zzc;
    @SafeParcelable.Field(getter = "getInProgressAccountTypes", m51606id = 3)
    private List<String> zzd;
    @SafeParcelable.Field(getter = "getSuccessAccountTypes", m51606id = 4)
    private List<String> zze;
    @SafeParcelable.Field(getter = "getFailedAccountTypes", m51606id = 5)
    private List<String> zzf;
    @SafeParcelable.Field(getter = "getEscrowedAccountTypes", m51606id = 6)
    private List<String> zzg;

    static {
        C28385so<String, FastJsonResponse.Field<?, ?>> c28385so = new C28385so<>();
        zzb = c28385so;
        c28385so.put("registered", FastJsonResponse.Field.forStrings("registered", 2));
        c28385so.put("in_progress", FastJsonResponse.Field.forStrings("in_progress", 3));
        c28385so.put("success", FastJsonResponse.Field.forStrings("success", 4));
        c28385so.put("failed", FastJsonResponse.Field.forStrings("failed", 5));
        c28385so.put("escrowed", FastJsonResponse.Field.forStrings("escrowed", 6));
    }

    public zzr() {
        this.zza = 1;
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final Map<String, FastJsonResponse.Field<?, ?>> getFieldMappings() {
        return zzb;
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final Object getFieldValue(FastJsonResponse.Field field) {
        switch (field.getSafeParcelableFieldId()) {
            case 1:
                return Integer.valueOf(this.zza);
            case 2:
                return this.zzc;
            case 3:
                return this.zzd;
            case 4:
                return this.zze;
            case 5:
                return this.zzf;
            case 6:
                return this.zzg;
            default:
                int safeParcelableFieldId = field.getSafeParcelableFieldId();
                StringBuilder sb = new StringBuilder(37);
                sb.append("Unknown SafeParcelable id=");
                sb.append(safeParcelableFieldId);
                throw new IllegalStateException(sb.toString());
        }
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final boolean isFieldSet(FastJsonResponse.Field field) {
        return true;
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final void setStringsInternal(FastJsonResponse.Field<?, ?> field, String str, ArrayList<String> arrayList) {
        int safeParcelableFieldId = field.getSafeParcelableFieldId();
        if (safeParcelableFieldId != 2) {
            if (safeParcelableFieldId != 3) {
                if (safeParcelableFieldId != 4) {
                    if (safeParcelableFieldId != 5) {
                        if (safeParcelableFieldId == 6) {
                            this.zzg = arrayList;
                            return;
                        }
                        throw new IllegalArgumentException(String.format("Field with id=%d is not known to be a string list.", Integer.valueOf(safeParcelableFieldId)));
                    }
                    this.zzf = arrayList;
                    return;
                }
                this.zze = arrayList;
                return;
            }
            this.zzd = arrayList;
            return;
        }
        this.zzc = arrayList;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.zza);
        SafeParcelWriter.writeStringList(parcel, 2, this.zzc, false);
        SafeParcelWriter.writeStringList(parcel, 3, this.zzd, false);
        SafeParcelWriter.writeStringList(parcel, 4, this.zze, false);
        SafeParcelWriter.writeStringList(parcel, 5, this.zzf, false);
        SafeParcelWriter.writeStringList(parcel, 6, this.zzg, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    @SafeParcelable.Constructor
    public zzr(@SafeParcelable.Param(m51605id = 1) int i, @SafeParcelable.Param(m51605id = 2) List<String> list, @SafeParcelable.Param(m51605id = 3) List<String> list2, @SafeParcelable.Param(m51605id = 4) List<String> list3, @SafeParcelable.Param(m51605id = 5) List<String> list4, @SafeParcelable.Param(m51605id = 6) List<String> list5) {
        this.zza = i;
        this.zzc = list;
        this.zzd = list2;
        this.zze = list3;
        this.zzf = list4;
        this.zzg = list5;
    }
}
