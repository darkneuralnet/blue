package com.stripe.android.paymentsheet.model;

import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
@Metadata(m28433d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001B\u0007\b\u0004¢\u0006\u0002\u0010\u0002J\b\u0010\u0007\u001a\u00020\bH&R\u0012\u0010\u0003\u001a\u00020\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u0002\t\n¨\u0006\u000b"}, m28432d2 = {"Lcom/stripe/android/paymentsheet/model/ClientSecret;", "Landroid/os/Parcelable;", "()V", "value", "", "getValue", "()Ljava/lang/String;", "validate", "", "Lcom/stripe/android/paymentsheet/model/PaymentIntentClientSecret;", "Lcom/stripe/android/paymentsheet/model/SetupIntentClientSecret;", "paymentsheet_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public abstract class ClientSecret implements Parcelable {
    public /* synthetic */ ClientSecret(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract String getValue();

    public abstract void validate();

    private ClientSecret() {
    }
}
