package com.facebook.share.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes5.dex */
public final class GameRequestContent implements ShareModel {
    public static final Parcelable.Creator<GameRequestContent> CREATOR = new C17332a();

    /* renamed from: b */
    public final String f69784b;

    /* renamed from: c */
    public final String f69785c;

    /* renamed from: d */
    public final List<String> f69786d;

    /* renamed from: e */
    public final String f69787e;

    /* renamed from: f */
    public final String f69788f;

    /* renamed from: g */
    public final EnumC17333b f69789g;

    /* renamed from: h */
    public final String f69790h;

    /* renamed from: i */
    public final EnumC17334c f69791i;

    /* renamed from: j */
    public final List<String> f69792j;

    /* renamed from: com.facebook.share.model.GameRequestContent$a */
    /* loaded from: classes5.dex */
    public static class C17332a implements Parcelable.Creator<GameRequestContent> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public GameRequestContent createFromParcel(Parcel parcel) {
            return new GameRequestContent(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public GameRequestContent[] newArray(int i) {
            return new GameRequestContent[i];
        }
    }

    /* renamed from: com.facebook.share.model.GameRequestContent$b */
    /* loaded from: classes5.dex */
    public enum EnumC17333b {
        SEND,
        ASKFOR,
        TURN,
        INVITE
    }

    /* renamed from: com.facebook.share.model.GameRequestContent$c */
    /* loaded from: classes5.dex */
    public enum EnumC17334c {
        APP_USERS,
        APP_NON_USERS,
        EVERYBODY
    }

    public GameRequestContent(Parcel parcel) {
        this.f69784b = parcel.readString();
        this.f69785c = parcel.readString();
        this.f69786d = parcel.createStringArrayList();
        this.f69787e = parcel.readString();
        this.f69788f = parcel.readString();
        this.f69789g = (EnumC17333b) parcel.readSerializable();
        this.f69790h = parcel.readString();
        this.f69791i = (EnumC17334c) parcel.readSerializable();
        ArrayList<String> createStringArrayList = parcel.createStringArrayList();
        this.f69792j = createStringArrayList;
        parcel.readStringList(createStringArrayList);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f69784b);
        parcel.writeString(this.f69785c);
        parcel.writeStringList(this.f69786d);
        parcel.writeString(this.f69787e);
        parcel.writeString(this.f69788f);
        parcel.writeSerializable(this.f69789g);
        parcel.writeString(this.f69790h);
        parcel.writeSerializable(this.f69791i);
        parcel.writeStringList(this.f69792j);
    }
}
