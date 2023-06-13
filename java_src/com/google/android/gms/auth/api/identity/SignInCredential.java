package com.google.android.gms.auth.api.identity;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
@SafeParcelable.Class(creator = "SignInCredentialCreator")
/* loaded from: classes5.dex */
public final class SignInCredential extends AbstractSafeParcelable {
    public static final Parcelable.Creator<SignInCredential> CREATOR = new zbk();
    @SafeParcelable.Field(getter = "getId", m51606id = 1)
    private final String zba;
    @SafeParcelable.Field(getter = "getDisplayName", m51606id = 2)
    private final String zbb;
    @SafeParcelable.Field(getter = "getGivenName", m51606id = 3)
    private final String zbc;
    @SafeParcelable.Field(getter = "getFamilyName", m51606id = 4)
    private final String zbd;
    @SafeParcelable.Field(getter = "getProfilePictureUri", m51606id = 5)
    private final Uri zbe;
    @SafeParcelable.Field(getter = "getPassword", m51606id = 6)
    private final String zbf;
    @SafeParcelable.Field(getter = "getGoogleIdToken", m51606id = 7)
    private final String zbg;

    @SafeParcelable.Constructor
    public SignInCredential(@SafeParcelable.Param(m51605id = 1) String str, @SafeParcelable.Param(m51605id = 2) String str2, @SafeParcelable.Param(m51605id = 3) String str3, @SafeParcelable.Param(m51605id = 4) String str4, @SafeParcelable.Param(m51605id = 5) Uri uri, @SafeParcelable.Param(m51605id = 6) String str5, @SafeParcelable.Param(m51605id = 7) String str6) {
        this.zba = Preconditions.checkNotEmpty(str);
        this.zbb = str2;
        this.zbc = str3;
        this.zbd = str4;
        this.zbe = uri;
        this.zbf = str5;
        this.zbg = str6;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof SignInCredential)) {
            return false;
        }
        SignInCredential signInCredential = (SignInCredential) obj;
        if (!Objects.equal(this.zba, signInCredential.zba) || !Objects.equal(this.zbb, signInCredential.zbb) || !Objects.equal(this.zbc, signInCredential.zbc) || !Objects.equal(this.zbd, signInCredential.zbd) || !Objects.equal(this.zbe, signInCredential.zbe) || !Objects.equal(this.zbf, signInCredential.zbf) || !Objects.equal(this.zbg, signInCredential.zbg)) {
            return false;
        }
        return true;
    }

    public String getDisplayName() {
        return this.zbb;
    }

    public String getFamilyName() {
        return this.zbd;
    }

    public String getGivenName() {
        return this.zbc;
    }

    public String getGoogleIdToken() {
        return this.zbg;
    }

    public String getId() {
        return this.zba;
    }

    public String getPassword() {
        return this.zbf;
    }

    public Uri getProfilePictureUri() {
        return this.zbe;
    }

    public int hashCode() {
        return Objects.hashCode(this.zba, this.zbb, this.zbc, this.zbd, this.zbe, this.zbf, this.zbg);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, getId(), false);
        SafeParcelWriter.writeString(parcel, 2, getDisplayName(), false);
        SafeParcelWriter.writeString(parcel, 3, getGivenName(), false);
        SafeParcelWriter.writeString(parcel, 4, getFamilyName(), false);
        SafeParcelWriter.writeParcelable(parcel, 5, getProfilePictureUri(), i, false);
        SafeParcelWriter.writeString(parcel, 6, getPassword(), false);
        SafeParcelWriter.writeString(parcel, 7, getGoogleIdToken(), false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
