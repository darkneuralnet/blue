package com.google.android.gms.nearby.messages;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.nearby.zzhj;
import java.util.Arrays;
@SafeParcelable.Class(creator = "MessageCreator")
/* loaded from: classes6.dex */
public class Message extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<Message> CREATOR = new C34230Le7();

    /* renamed from: h */
    public static final zzhj[] f71632h = {zzhj.f71128e};
    @SafeParcelable.VersionField(m51603id = 1000)

    /* renamed from: b */
    public final int f71633b;
    @SafeParcelable.Field(getter = "getContent", m51606id = 1)

    /* renamed from: c */
    public final byte[] f71634c;
    @SafeParcelable.Field(getter = "getType", m51606id = 2)

    /* renamed from: d */
    public final String f71635d;
    @SafeParcelable.Field(getter = "getNamespace", m51606id = 3)

    /* renamed from: e */
    public final String f71636e;
    @SafeParcelable.Field(m51606id = 4)
    @Deprecated

    /* renamed from: f */
    public final zzhj[] f71637f;
    @SafeParcelable.Field(getter = "getProjectId", m51606id = 5)

    /* renamed from: g */
    public final long f71638g;

    @SafeParcelable.Constructor
    public Message(@SafeParcelable.Param(m51605id = 1000) int i, @SafeParcelable.Param(m51605id = 1) byte[] bArr, @SafeParcelable.Param(m51605id = 3) String str, @SafeParcelable.Param(m51605id = 2) String str2, @SafeParcelable.Param(m51605id = 4) zzhj[] zzhjVarArr, @SafeParcelable.Param(m51605id = 5) long j) {
        boolean z;
        boolean z2;
        this.f71633b = i;
        this.f71635d = (String) Preconditions.checkNotNull(str2);
        this.f71636e = str == null ? "" : str;
        this.f71638g = j;
        Preconditions.checkNotNull(bArr);
        int length = bArr.length;
        if (length <= 102400) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkArgument(z, "Content length(%d) must not exceed MAX_CONTENT_SIZE_BYTES(%d)", Integer.valueOf(length), 102400);
        this.f71634c = bArr;
        this.f71637f = (zzhjVarArr == null || zzhjVarArr.length == 0) ? f71632h : zzhjVarArr;
        if (str2.length() <= 32) {
            z2 = true;
        } else {
            z2 = false;
        }
        Preconditions.checkArgument(z2, "Type length(%d) must not exceed MAX_TYPE_LENGTH(%d)", Integer.valueOf(str2.length()), 32);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Message)) {
            return false;
        }
        Message message = (Message) obj;
        if (TextUtils.equals(this.f71636e, message.f71636e) && TextUtils.equals(this.f71635d, message.f71635d) && Arrays.equals(this.f71634c, message.f71634c) && this.f71638g == message.f71638g) {
            return true;
        }
        return false;
    }

    public String getType() {
        return this.f71635d;
    }

    public int hashCode() {
        return Objects.hashCode(this.f71636e, this.f71635d, Integer.valueOf(Arrays.hashCode(this.f71634c)), Long.valueOf(this.f71638g));
    }

    /* renamed from: s */
    public byte[] m50568s() {
        return this.f71634c;
    }

    public String toString() {
        int length;
        String str = this.f71636e;
        String str2 = this.f71635d;
        byte[] bArr = this.f71634c;
        if (bArr == null) {
            length = 0;
        } else {
            length = bArr.length;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 59 + String.valueOf(str2).length());
        sb.append("Message{namespace='");
        sb.append(str);
        sb.append("', type='");
        sb.append(str2);
        sb.append("', content=[");
        sb.append(length);
        sb.append(" bytes]}");
        return sb.toString();
    }

    /* renamed from: u */
    public String m50567u() {
        return this.f71636e;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeByteArray(parcel, 1, m50568s(), false);
        SafeParcelWriter.writeString(parcel, 2, getType(), false);
        SafeParcelWriter.writeString(parcel, 3, m50567u(), false);
        SafeParcelWriter.writeTypedArray(parcel, 4, this.f71637f, i, false);
        SafeParcelWriter.writeLong(parcel, 5, this.f71638g);
        SafeParcelWriter.writeInt(parcel, 1000, this.f71633b);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
