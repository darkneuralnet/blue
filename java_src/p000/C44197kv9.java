package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.internal.recaptcha.zzv;
import com.google.android.gms.recaptcha.RecaptchaAction;
import com.google.android.gms.recaptcha.RecaptchaHandle;
/* renamed from: kv9  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C44197kv9 implements Parcelable.Creator<zzv> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ zzv createFromParcel(Parcel parcel) {
        int validateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        String str = "16.0.0";
        RecaptchaHandle recaptchaHandle = null;
        RecaptchaAction recaptchaAction = null;
        while (parcel.dataPosition() < validateObjectHeader) {
            int readHeader = SafeParcelReader.readHeader(parcel);
            int fieldId = SafeParcelReader.getFieldId(readHeader);
            if (fieldId != 1) {
                if (fieldId != 2) {
                    if (fieldId != 3) {
                        SafeParcelReader.skipUnknownField(parcel, readHeader);
                    } else {
                        str = SafeParcelReader.createString(parcel, readHeader);
                    }
                } else {
                    recaptchaAction = (RecaptchaAction) SafeParcelReader.createParcelable(parcel, readHeader, RecaptchaAction.CREATOR);
                }
            } else {
                recaptchaHandle = (RecaptchaHandle) SafeParcelReader.createParcelable(parcel, readHeader, RecaptchaHandle.CREATOR);
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, validateObjectHeader);
        return new zzv(recaptchaHandle, recaptchaAction, str);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ zzv[] newArray(int i) {
        return new zzv[i];
    }
}
