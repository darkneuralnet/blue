package com.facebook.share.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.share.model.ShareOpenGraphValueContainer;
/* loaded from: classes5.dex */
public final class ShareOpenGraphAction extends ShareOpenGraphValueContainer<ShareOpenGraphAction, C17352b> {
    public static final Parcelable.Creator<ShareOpenGraphAction> CREATOR = new C17351a();

    /* renamed from: com.facebook.share.model.ShareOpenGraphAction$a */
    /* loaded from: classes5.dex */
    public static class C17351a implements Parcelable.Creator<ShareOpenGraphAction> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public ShareOpenGraphAction createFromParcel(Parcel parcel) {
            return new ShareOpenGraphAction(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public ShareOpenGraphAction[] newArray(int i) {
            return new ShareOpenGraphAction[i];
        }
    }

    /* renamed from: com.facebook.share.model.ShareOpenGraphAction$b */
    /* loaded from: classes5.dex */
    public static final class C17352b extends ShareOpenGraphValueContainer.AbstractC17355a<ShareOpenGraphAction, C17352b> {
        /* renamed from: d */
        public ShareOpenGraphAction m52196d() {
            return new ShareOpenGraphAction(this, null);
        }

        /* renamed from: e */
        public C17352b m52195e(Parcel parcel) {
            return m52194f((ShareOpenGraphAction) parcel.readParcelable(ShareOpenGraphAction.class.getClassLoader()));
        }

        /* renamed from: f */
        public C17352b m52194f(ShareOpenGraphAction shareOpenGraphAction) {
            return shareOpenGraphAction == null ? this : ((C17352b) super.m52180c(shareOpenGraphAction)).m52193g(shareOpenGraphAction.m52199e());
        }

        /* renamed from: g */
        public C17352b m52193g(String str) {
            m52181b("og:type", str);
            return this;
        }
    }

    public /* synthetic */ ShareOpenGraphAction(C17352b c17352b, C17351a c17351a) {
        this(c17352b);
    }

    /* renamed from: e */
    public String m52199e() {
        return m52184c("og:type");
    }

    public ShareOpenGraphAction(C17352b c17352b) {
        super(c17352b);
    }

    public ShareOpenGraphAction(Parcel parcel) {
        super(parcel);
    }
}
