package com.google.android.play.core.review;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
/* loaded from: classes6.dex */
public abstract class ReviewInfo implements Parcelable {
    /* renamed from: b */
    public static ReviewInfo m48461b(PendingIntent pendingIntent) {
        return new C17966a(pendingIntent);
    }

    /* renamed from: a */
    public abstract PendingIntent mo48460a();

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(mo48460a(), 0);
    }
}
