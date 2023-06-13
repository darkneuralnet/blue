package com.google.android.gms.location;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelableSerializer;
import com.google.android.gms.common.util.VisibleForTesting;
import java.lang.reflect.Array;
import java.util.Collections;
import java.util.List;
@SafeParcelable.Class(creator = "ActivityRecognitionResultCreator")
@SafeParcelable.Reserved({1000})
/* loaded from: classes6.dex */
public class ActivityRecognitionResult extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<ActivityRecognitionResult> CREATOR = new zzk();
    @SafeParcelable.Field(m51606id = 1)
    List<DetectedActivity> zza;
    @SafeParcelable.Field(m51606id = 2)
    long zzb;
    @SafeParcelable.Field(m51606id = 3)
    long zzc;
    @SafeParcelable.Field(m51606id = 4)
    int zzd;
    @SafeParcelable.Field(m51606id = 5)
    Bundle zze;

    @VisibleForTesting
    public ActivityRecognitionResult(DetectedActivity detectedActivity, long j, long j2) {
        this(Collections.singletonList(detectedActivity), j, j2, 0, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ActivityRecognitionResult extractResult(Intent intent) {
        Bundle extras;
        ActivityRecognitionResult activityRecognitionResult;
        if (hasResult(intent) && (extras = intent.getExtras()) != null) {
            Object obj = extras.get("com.google.android.location.internal.EXTRA_ACTIVITY_RESULT");
            if (obj instanceof byte[]) {
                activityRecognitionResult = (ActivityRecognitionResult) SafeParcelableSerializer.deserializeFromBytes((byte[]) obj, CREATOR);
            } else if (obj instanceof ActivityRecognitionResult) {
                activityRecognitionResult = (ActivityRecognitionResult) obj;
            }
            if (activityRecognitionResult == null) {
                return activityRecognitionResult;
            }
            List<ActivityRecognitionResult> zza = zza(intent);
            if (zza == null || zza.isEmpty()) {
                return null;
            }
            return zza.get(zza.size() - 1);
        }
        activityRecognitionResult = null;
        if (activityRecognitionResult == null) {
        }
    }

    public static boolean hasResult(Intent intent) {
        if (intent == null) {
            return false;
        }
        if (intent.hasExtra("com.google.android.location.internal.EXTRA_ACTIVITY_RESULT")) {
            return true;
        }
        List<ActivityRecognitionResult> zza = zza(intent);
        if (zza == null || zza.isEmpty()) {
            return false;
        }
        return true;
    }

    public static List<ActivityRecognitionResult> zza(Intent intent) {
        if (intent != null && intent.hasExtra("com.google.android.location.internal.EXTRA_ACTIVITY_RESULT_LIST")) {
            return SafeParcelableSerializer.deserializeIterableFromIntentExtra(intent, "com.google.android.location.internal.EXTRA_ACTIVITY_RESULT_LIST", CREATOR);
        }
        return null;
    }

    private static boolean zzb(Bundle bundle, Bundle bundle2) {
        int length;
        if (bundle == null) {
            if (bundle2 == null) {
                return true;
            }
            return false;
        } else if (bundle2 == null || bundle.size() != bundle2.size()) {
            return false;
        } else {
            for (String str : bundle.keySet()) {
                if (!bundle2.containsKey(str)) {
                    return false;
                }
                Object obj = bundle.get(str);
                Object obj2 = bundle2.get(str);
                if (obj == null) {
                    if (obj2 != null) {
                        return false;
                    }
                } else if (obj instanceof Bundle) {
                    if (!zzb(bundle.getBundle(str), bundle2.getBundle(str))) {
                        return false;
                    }
                } else if (obj.getClass().isArray()) {
                    if (obj2 != null && obj2.getClass().isArray() && (length = Array.getLength(obj)) == Array.getLength(obj2)) {
                        for (int i = 0; i < length; i++) {
                            if (Objects.equal(Array.get(obj, i), Array.get(obj2, i))) {
                            }
                        }
                        continue;
                    }
                    return false;
                } else if (!obj.equals(obj2)) {
                    return false;
                }
            }
            return true;
        }
    }

    @ShowFirstParty
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            ActivityRecognitionResult activityRecognitionResult = (ActivityRecognitionResult) obj;
            if (this.zzb == activityRecognitionResult.zzb && this.zzc == activityRecognitionResult.zzc && this.zzd == activityRecognitionResult.zzd && Objects.equal(this.zza, activityRecognitionResult.zza) && zzb(this.zze, activityRecognitionResult.zze)) {
                return true;
            }
        }
        return false;
    }

    public int getActivityConfidence(int i) {
        for (DetectedActivity detectedActivity : this.zza) {
            if (detectedActivity.getType() == i) {
                return detectedActivity.getConfidence();
            }
        }
        return 0;
    }

    public long getElapsedRealtimeMillis() {
        return this.zzc;
    }

    public DetectedActivity getMostProbableActivity() {
        return this.zza.get(0);
    }

    public List<DetectedActivity> getProbableActivities() {
        return this.zza;
    }

    public long getTime() {
        return this.zzb;
    }

    @ShowFirstParty
    public final int hashCode() {
        return Objects.hashCode(Long.valueOf(this.zzb), Long.valueOf(this.zzc), Integer.valueOf(this.zzd), this.zza, this.zze);
    }

    public String toString() {
        String valueOf = String.valueOf(this.zza);
        long j = this.zzb;
        long j2 = this.zzc;
        StringBuilder sb = new StringBuilder(valueOf.length() + 124);
        sb.append("ActivityRecognitionResult [probableActivities=");
        sb.append(valueOf);
        sb.append(", timeMillis=");
        sb.append(j);
        sb.append(", elapsedRealtimeMillis=");
        sb.append(j2);
        sb.append("]");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeTypedList(parcel, 1, this.zza, false);
        SafeParcelWriter.writeLong(parcel, 2, this.zzb);
        SafeParcelWriter.writeLong(parcel, 3, this.zzc);
        SafeParcelWriter.writeInt(parcel, 4, this.zzd);
        SafeParcelWriter.writeBundle(parcel, 5, this.zze, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public ActivityRecognitionResult(List<DetectedActivity> list, long j, long j2) {
        this(list, j, j2, 0, null);
    }

    @ShowFirstParty
    @SafeParcelable.Constructor
    public ActivityRecognitionResult(@SafeParcelable.Param(m51605id = 1) List<DetectedActivity> list, @SafeParcelable.Param(m51605id = 2) long j, @SafeParcelable.Param(m51605id = 3) long j2, @SafeParcelable.Param(m51605id = 4) int i, @SafeParcelable.Param(m51605id = 5) Bundle bundle) {
        boolean z = true;
        Preconditions.checkArgument(list != null && list.size() > 0, "Must have at least 1 detected activity");
        Preconditions.checkArgument((j <= 0 || j2 <= 0) ? false : z, "Must set times");
        this.zza = list;
        this.zzb = j;
        this.zzc = j2;
        this.zzd = i;
        this.zze = bundle;
    }
}
