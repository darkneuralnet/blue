package com.google.android.gms.auth.api.identity;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
@SafeParcelable.Class(creator = "SavePasswordRequestCreator")
/* loaded from: classes5.dex */
public class SavePasswordRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<SavePasswordRequest> CREATOR = new zbi();
    @SafeParcelable.Field(getter = "getSignInPassword", m51606id = 1)
    private final SignInPassword zba;
    @SafeParcelable.Field(getter = "getSessionId", m51606id = 2)
    private final String zbb;

    /* loaded from: classes5.dex */
    public static final class Builder {
        private SignInPassword zba;
        private String zbb;

        public SavePasswordRequest build() {
            return new SavePasswordRequest(this.zba, this.zbb);
        }

        public Builder setSignInPassword(SignInPassword signInPassword) {
            this.zba = signInPassword;
            return this;
        }

        public final Builder zba(String str) {
            this.zbb = str;
            return this;
        }
    }

    @SafeParcelable.Constructor
    public SavePasswordRequest(@SafeParcelable.Param(m51605id = 1) SignInPassword signInPassword, @SafeParcelable.Param(m51605id = 2) String str) {
        this.zba = (SignInPassword) Preconditions.checkNotNull(signInPassword);
        this.zbb = str;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder zba(SavePasswordRequest savePasswordRequest) {
        Preconditions.checkNotNull(savePasswordRequest);
        Builder builder = builder();
        builder.setSignInPassword(savePasswordRequest.getSignInPassword());
        String str = savePasswordRequest.zbb;
        if (str != null) {
            builder.zba(str);
        }
        return builder;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof SavePasswordRequest)) {
            return false;
        }
        SavePasswordRequest savePasswordRequest = (SavePasswordRequest) obj;
        if (!Objects.equal(this.zba, savePasswordRequest.zba) || !Objects.equal(this.zbb, savePasswordRequest.zbb)) {
            return false;
        }
        return true;
    }

    public SignInPassword getSignInPassword() {
        return this.zba;
    }

    public int hashCode() {
        return Objects.hashCode(this.zba, this.zbb);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 1, getSignInPassword(), i, false);
        SafeParcelWriter.writeString(parcel, 2, this.zbb, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}