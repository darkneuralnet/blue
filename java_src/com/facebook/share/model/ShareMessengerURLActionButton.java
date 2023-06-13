package com.facebook.share.model;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
@Deprecated
/* loaded from: classes5.dex */
public final class ShareMessengerURLActionButton extends ShareMessengerActionButton {
    public static final Parcelable.Creator<ShareMessengerURLActionButton> CREATOR = new C17349a();

    /* renamed from: c */
    public final Uri f69850c;

    /* renamed from: d */
    public final Uri f69851d;

    /* renamed from: e */
    public final boolean f69852e;

    /* renamed from: f */
    public final boolean f69853f;

    /* renamed from: g */
    public final EnumC17350b f69854g;

    /* renamed from: com.facebook.share.model.ShareMessengerURLActionButton$a */
    /* loaded from: classes5.dex */
    public static class C17349a implements Parcelable.Creator<ShareMessengerURLActionButton> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public ShareMessengerURLActionButton createFromParcel(Parcel parcel) {
            return new ShareMessengerURLActionButton(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public ShareMessengerURLActionButton[] newArray(int i) {
            return new ShareMessengerURLActionButton[i];
        }
    }

    /* renamed from: com.facebook.share.model.ShareMessengerURLActionButton$b */
    /* loaded from: classes5.dex */
    public enum EnumC17350b {
        WebviewHeightRatioFull,
        WebviewHeightRatioTall,
        WebviewHeightRatioCompact
    }

    public ShareMessengerURLActionButton(Parcel parcel) {
        super(parcel);
        boolean z;
        this.f69850c = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
        if (parcel.readByte() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.f69852e = z;
        this.f69851d = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
        this.f69854g = (EnumC17350b) parcel.readSerializable();
        this.f69853f = parcel.readByte() != 0;
    }

    /* renamed from: b */
    public Uri m52206b() {
        return this.f69851d;
    }

    /* renamed from: c */
    public boolean m52205c() {
        return this.f69852e;
    }

    /* renamed from: d */
    public boolean m52204d() {
        return this.f69853f;
    }

    /* renamed from: e */
    public Uri m52203e() {
        return this.f69850c;
    }

    /* renamed from: g */
    public EnumC17350b m52202g() {
        return this.f69854g;
    }
}
