package com.google.android.play.core.review;

import android.app.PendingIntent;
/* renamed from: com.google.android.play.core.review.a */
/* loaded from: classes6.dex */
final class C17966a extends ReviewInfo {

    /* renamed from: b */
    public final PendingIntent f73712b;

    public C17966a(PendingIntent pendingIntent) {
        if (pendingIntent == null) {
            throw new NullPointerException("Null pendingIntent");
        }
        this.f73712b = pendingIntent;
    }

    @Override // com.google.android.play.core.review.ReviewInfo
    /* renamed from: a */
    public final PendingIntent mo48460a() {
        return this.f73712b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ReviewInfo) {
            return this.f73712b.equals(((ReviewInfo) obj).mo48460a());
        }
        return false;
    }

    public final int hashCode() {
        return this.f73712b.hashCode() ^ 1000003;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f73712b);
        StringBuilder sb = new StringBuilder(valueOf.length() + 26);
        sb.append("ReviewInfo{pendingIntent=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
