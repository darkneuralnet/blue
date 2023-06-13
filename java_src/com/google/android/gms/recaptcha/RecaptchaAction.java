package com.google.android.gms.recaptcha;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import co.bird.android.model.LegacyRepairType;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
@SafeParcelable.Class(creator = "RecaptchaActionCreator")
/* loaded from: classes6.dex */
public final class RecaptchaAction extends AbstractSafeParcelable {
    public static final Parcelable.Creator<RecaptchaAction> CREATOR = new C39817dY7();
    @SafeParcelable.Field(defaultValueUnchecked = "new com.google.android.gms.recaptcha.RecaptchaActionType(com.google.android.gms.recaptcha.RecaptchaActionType.OTHER)", getter = "getAction", m51606id = 1)

    /* renamed from: b */
    public final RecaptchaActionType f71775b;
    @SafeParcelable.Field(defaultValue = "", getter = "getCustomAction", m51606id = 2)

    /* renamed from: c */
    public final String f71776c;
    @SafeParcelable.Field(defaultValueUnchecked = "new android.os.Bundle()", getter = "getAdditionalArgs", m51606id = 3)

    /* renamed from: d */
    public final Bundle f71777d;
    @SafeParcelable.Field(defaultValue = "", getter = "getVerificationHistoryToken", m51606id = 4)

    /* renamed from: e */
    public final String f71778e;

    public RecaptchaAction(RecaptchaAction recaptchaAction, String str) {
        this(recaptchaAction.m50549s(), recaptchaAction.m50547v(), recaptchaAction.m50548u(), str);
    }

    /* renamed from: E */
    public String m50550E() {
        return this.f71778e;
    }

    /* renamed from: s */
    public RecaptchaActionType m50549s() {
        return this.f71775b;
    }

    public String toString() {
        if (LegacyRepairType.OTHER_KEY.equals(this.f71775b.f71779b) && !this.f71776c.isEmpty()) {
            return this.f71776c;
        }
        return this.f71775b.f71779b;
    }

    /* renamed from: u */
    public Bundle m50548u() {
        return this.f71777d;
    }

    /* renamed from: v */
    public String m50547v() {
        return this.f71776c;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 1, m50549s(), i, false);
        SafeParcelWriter.writeString(parcel, 2, m50547v(), false);
        SafeParcelWriter.writeBundle(parcel, 3, m50548u(), false);
        SafeParcelWriter.writeString(parcel, 4, m50550E(), false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public RecaptchaAction(RecaptchaActionType recaptchaActionType) {
        this(recaptchaActionType, "", new Bundle(), "");
    }

    @SafeParcelable.Constructor
    public RecaptchaAction(@SafeParcelable.Param(m51605id = 1) RecaptchaActionType recaptchaActionType, @SafeParcelable.Param(m51605id = 2) String str, @SafeParcelable.Param(m51605id = 3) Bundle bundle, @SafeParcelable.Param(m51605id = 4) String str2) {
        this.f71775b = recaptchaActionType;
        this.f71776c = str;
        this.f71777d = bundle;
        this.f71778e = str2;
    }
}
