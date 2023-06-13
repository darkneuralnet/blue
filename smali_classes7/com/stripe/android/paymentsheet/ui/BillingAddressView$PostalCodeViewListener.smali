.class public interface abstract Lcom/stripe/android/paymentsheet/ui/BillingAddressView$PostalCodeViewListener;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/paymentsheet/ui/BillingAddressView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x609
    name = "PostalCodeViewListener"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0003\u0008f\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u00020\u00032\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\u001a\u0010\u0008\u001a\u00020\u00032\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\u001a\u0010\t\u001a\u00020\u00032\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&\u00a8\u0006\n"
    }
    d2 = {
        "Lcom/stripe/android/paymentsheet/ui/BillingAddressView$PostalCodeViewListener;",
        "",
        "onCountryChanged",
        "",
        "country",
        "Lcom/stripe/android/core/model/Country;",
        "isPostalValid",
        "",
        "onGainingFocus",
        "onLosingFocus",
        "paymentsheet_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# virtual methods
.method public abstract onCountryChanged(Lcom/stripe/android/core/model/Country;Z)V
.end method

.method public abstract onGainingFocus(Lcom/stripe/android/core/model/Country;Z)V
.end method

.method public abstract onLosingFocus(Lcom/stripe/android/core/model/Country;Z)V
.end method
