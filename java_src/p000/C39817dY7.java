package p000;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import co.bird.android.model.LegacyRepairType;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.recaptcha.RecaptchaAction;
import com.google.android.gms.recaptcha.RecaptchaActionType;
/* renamed from: dY7  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C39817dY7 implements Parcelable.Creator<RecaptchaAction> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ RecaptchaAction createFromParcel(Parcel parcel) {
        int validateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        RecaptchaActionType recaptchaActionType = new RecaptchaActionType(LegacyRepairType.OTHER_KEY);
        Bundle bundle = new Bundle();
        String str = "";
        String str2 = "";
        while (parcel.dataPosition() < validateObjectHeader) {
            int readHeader = SafeParcelReader.readHeader(parcel);
            int fieldId = SafeParcelReader.getFieldId(readHeader);
            if (fieldId != 1) {
                if (fieldId != 2) {
                    if (fieldId != 3) {
                        if (fieldId != 4) {
                            SafeParcelReader.skipUnknownField(parcel, readHeader);
                        } else {
                            str2 = SafeParcelReader.createString(parcel, readHeader);
                        }
                    } else {
                        bundle = SafeParcelReader.createBundle(parcel, readHeader);
                    }
                } else {
                    str = SafeParcelReader.createString(parcel, readHeader);
                }
            } else {
                recaptchaActionType = (RecaptchaActionType) SafeParcelReader.createParcelable(parcel, readHeader, RecaptchaActionType.CREATOR);
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, validateObjectHeader);
        return new RecaptchaAction(recaptchaActionType, str, bundle, str2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ RecaptchaAction[] newArray(int i) {
        return new RecaptchaAction[i];
    }
}
