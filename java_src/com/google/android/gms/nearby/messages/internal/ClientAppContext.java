package com.google.android.gms.nearby.messages.internal;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Locale;
@SafeParcelable.Class(creator = "ClientAppContextCreator")
/* loaded from: classes6.dex */
public final class ClientAppContext extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<ClientAppContext> CREATOR = new C39206cY7();
    @SafeParcelable.VersionField(m51603id = 1)

    /* renamed from: b */
    public final int f71666b;
    @SafeParcelable.Field(m51606id = 2)

    /* renamed from: c */
    public final String f71667c;
    @SafeParcelable.Field(m51606id = 3)

    /* renamed from: d */
    public final String f71668d;
    @SafeParcelable.Field(m51606id = 4)

    /* renamed from: e */
    public final boolean f71669e;
    @SafeParcelable.Field(m51606id = 5)
    @Deprecated

    /* renamed from: f */
    public final int f71670f;
    @SafeParcelable.Field(m51606id = 6)

    /* renamed from: g */
    public final String f71671g;

    @SafeParcelable.Constructor
    public ClientAppContext(@SafeParcelable.Param(m51605id = 1) int i, @SafeParcelable.Param(m51605id = 2) String str, @SafeParcelable.Param(m51605id = 3) String str2, @SafeParcelable.Param(m51605id = 4) boolean z, @SafeParcelable.Param(m51605id = 5) int i2, @SafeParcelable.Param(m51605id = 6) String str3) {
        this.f71666b = i;
        this.f71667c = (String) Preconditions.checkNotNull(str);
        if (str2 != null && !str2.isEmpty() && !str2.startsWith("0p:")) {
            Log.w("NearbyMessages", String.format(Locale.US, "ClientAppContext: 0P identifier(%s) without 0P prefix(%s)", str2, "0p:"));
            if (str2.length() != 0) {
                str2 = "0p:".concat(str2);
            } else {
                str2 = new String("0p:");
            }
        }
        this.f71668d = str2;
        this.f71669e = z;
        this.f71670f = i2;
        this.f71671g = str3;
    }

    /* renamed from: s */
    public static final ClientAppContext m50561s(ClientAppContext clientAppContext, String str, String str2, boolean z) {
        if (clientAppContext != null) {
            return clientAppContext;
        }
        if (str == null && str2 == null) {
            return null;
        }
        return new ClientAppContext(1, str, str2, z, 0, null);
    }

    /* renamed from: u */
    public static boolean m50560u(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return TextUtils.isEmpty(str2);
        }
        return str.equals(str2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ClientAppContext)) {
            return false;
        }
        ClientAppContext clientAppContext = (ClientAppContext) obj;
        if (m50560u(this.f71667c, clientAppContext.f71667c) && m50560u(this.f71668d, clientAppContext.f71668d) && this.f71669e == clientAppContext.f71669e && m50560u(this.f71671g, clientAppContext.f71671g) && this.f71670f == clientAppContext.f71670f) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.f71667c, this.f71668d, Boolean.valueOf(this.f71669e), this.f71671g, Integer.valueOf(this.f71670f));
    }

    public final String toString() {
        return String.format(Locale.US, "{realClientPackageName: %s, zeroPartyIdentifier: %s, useRealClientApiKey: %b, apiKey: %s, callingContext: %d}", this.f71667c, this.f71668d, Boolean.valueOf(this.f71669e), this.f71671g, Integer.valueOf(this.f71670f));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.f71666b);
        SafeParcelWriter.writeString(parcel, 2, this.f71667c, false);
        SafeParcelWriter.writeString(parcel, 3, this.f71668d, false);
        SafeParcelWriter.writeBoolean(parcel, 4, this.f71669e);
        SafeParcelWriter.writeInt(parcel, 5, this.f71670f);
        SafeParcelWriter.writeString(parcel, 6, this.f71671g, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
