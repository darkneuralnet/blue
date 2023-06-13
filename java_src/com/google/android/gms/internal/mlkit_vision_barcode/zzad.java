package com.google.android.gms.internal.mlkit_vision_barcode;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
@SafeParcelable.Class(creator = "BarcodeDetectorOptionsCreator")
@SafeParcelable.Reserved({1})
/* loaded from: classes5.dex */
public final class zzad extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzad> CREATOR = new C51189wj7();
    @SafeParcelable.Field(m51606id = 2)

    /* renamed from: b */
    public int f70574b;
    @SafeParcelable.Field(m51606id = 3)

    /* renamed from: c */
    public boolean f70575c;

    public zzad() {
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzad)) {
            return false;
        }
        zzad zzadVar = (zzad) obj;
        if (this.f70574b == zzadVar.f70574b && Objects.equal(Boolean.valueOf(this.f70575c), Boolean.valueOf(zzadVar.f70575c))) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(Integer.valueOf(this.f70574b), Boolean.valueOf(this.f70575c));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 2, this.f70574b);
        SafeParcelWriter.writeBoolean(parcel, 3, this.f70575c);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    @SafeParcelable.Constructor
    public zzad(@SafeParcelable.Param(m51605id = 2) int i, @SafeParcelable.Param(m51605id = 3) boolean z) {
        this.f70574b = i;
        this.f70575c = z;
    }
}
