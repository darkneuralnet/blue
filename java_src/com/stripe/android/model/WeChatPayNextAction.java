package com.stripe.android.model;

import android.os.Parcel;
import android.os.Parcelable;
import co.bird.android.model.LegacyRepairType;
import com.stripe.android.core.model.StripeModel;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0014\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\u0019\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u000fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u001c"}, m28432d2 = {"Lcom/stripe/android/model/WeChatPayNextAction;", "Lcom/stripe/android/core/model/StripeModel;", "paymentIntent", "Lcom/stripe/android/model/PaymentIntent;", "weChat", "Lcom/stripe/android/model/WeChat;", "(Lcom/stripe/android/model/PaymentIntent;Lcom/stripe/android/model/WeChat;)V", "getPaymentIntent", "()Lcom/stripe/android/model/PaymentIntent;", "getWeChat", "()Lcom/stripe/android/model/WeChat;", "component1", "component2", "copy", "describeContents", "", "equals", "", LegacyRepairType.OTHER_KEY, "", "hashCode", "toString", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public final class WeChatPayNextAction implements StripeModel {
    public static final int $stable = 8;
    public static final Parcelable.Creator<WeChatPayNextAction> CREATOR = new Creator();
    private final PaymentIntent paymentIntent;
    private final WeChat weChat;

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class Creator implements Parcelable.Creator<WeChatPayNextAction> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final WeChatPayNextAction createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new WeChatPayNextAction(PaymentIntent.CREATOR.createFromParcel(parcel), WeChat.CREATOR.createFromParcel(parcel));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final WeChatPayNextAction[] newArray(int i) {
            return new WeChatPayNextAction[i];
        }
    }

    public WeChatPayNextAction(PaymentIntent paymentIntent, WeChat weChat) {
        Intrinsics.checkNotNullParameter(paymentIntent, "paymentIntent");
        Intrinsics.checkNotNullParameter(weChat, "weChat");
        this.paymentIntent = paymentIntent;
        this.weChat = weChat;
    }

    public static /* synthetic */ WeChatPayNextAction copy$default(WeChatPayNextAction weChatPayNextAction, PaymentIntent paymentIntent, WeChat weChat, int i, Object obj) {
        if ((i & 1) != 0) {
            paymentIntent = weChatPayNextAction.paymentIntent;
        }
        if ((i & 2) != 0) {
            weChat = weChatPayNextAction.weChat;
        }
        return weChatPayNextAction.copy(paymentIntent, weChat);
    }

    public final PaymentIntent component1() {
        return this.paymentIntent;
    }

    public final WeChat component2() {
        return this.weChat;
    }

    public final WeChatPayNextAction copy(PaymentIntent paymentIntent, WeChat weChat) {
        Intrinsics.checkNotNullParameter(paymentIntent, "paymentIntent");
        Intrinsics.checkNotNullParameter(weChat, "weChat");
        return new WeChatPayNextAction(paymentIntent, weChat);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.stripe.android.core.model.StripeModel
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof WeChatPayNextAction) {
            WeChatPayNextAction weChatPayNextAction = (WeChatPayNextAction) obj;
            return Intrinsics.areEqual(this.paymentIntent, weChatPayNextAction.paymentIntent) && Intrinsics.areEqual(this.weChat, weChatPayNextAction.weChat);
        }
        return false;
    }

    public final PaymentIntent getPaymentIntent() {
        return this.paymentIntent;
    }

    public final WeChat getWeChat() {
        return this.weChat;
    }

    @Override // com.stripe.android.core.model.StripeModel
    public int hashCode() {
        return (this.paymentIntent.hashCode() * 31) + this.weChat.hashCode();
    }

    public String toString() {
        PaymentIntent paymentIntent = this.paymentIntent;
        WeChat weChat = this.weChat;
        return "WeChatPayNextAction(paymentIntent=" + paymentIntent + ", weChat=" + weChat + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        Intrinsics.checkNotNullParameter(out, "out");
        this.paymentIntent.writeToParcel(out, i);
        this.weChat.writeToParcel(out, i);
    }
}
