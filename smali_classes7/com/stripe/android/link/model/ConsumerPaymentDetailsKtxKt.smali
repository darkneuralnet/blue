.class public final Lcom/stripe/android/link/model/ConsumerPaymentDetailsKtxKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0016\n\u0000\n\u0002\u0010\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\"\u0018\u0010\u0000\u001a\u00020\u0001*\u00020\u00028@X\u0080\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0003\u0010\u0004\"\u0018\u0010\u0005\u001a\u00020\u0001*\u00020\u00068@X\u0080\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0007\u0010\u0008\"\u0018\u0010\t\u001a\u00020\u0001*\u00020\u00068@X\u0080\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\n\u0010\u0008\u00a8\u0006\u000b"
    }
    d2 = {
        "icon",
        "",
        "Lcom/stripe/android/model/ConsumerPaymentDetails$BankAccount;",
        "getIcon",
        "(Lcom/stripe/android/model/ConsumerPaymentDetails$BankAccount;)I",
        "removeConfirmation",
        "Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;",
        "getRemoveConfirmation",
        "(Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;)I",
        "removeLabel",
        "getRemoveLabel",
        "link_release"
    }
    k = 0x2
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public static final getIcon(Lcom/stripe/android/model/ConsumerPaymentDetails$BankAccount;)I
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    sget p0, Lcom/stripe/android/link/R$drawable;->ic_link_bank:I

    return p0
.end method

.method public static final getRemoveConfirmation(Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;)I
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p0, Lcom/stripe/android/model/ConsumerPaymentDetails$Card;

    if-eqz v0, :cond_0

    sget p0, Lcom/stripe/android/link/R$string;->wallet_remove_card_confirmation:I

    goto :goto_0

    :cond_0
    instance-of p0, p0, Lcom/stripe/android/model/ConsumerPaymentDetails$BankAccount;

    if-eqz p0, :cond_1

    sget p0, Lcom/stripe/android/link/R$string;->wallet_remove_account_confirmation:I

    :goto_0
    return p0

    :cond_1
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0
.end method

.method public static final getRemoveLabel(Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;)I
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p0, Lcom/stripe/android/model/ConsumerPaymentDetails$Card;

    if-eqz v0, :cond_0

    sget p0, Lcom/stripe/android/link/R$string;->wallet_remove_card:I

    goto :goto_0

    :cond_0
    instance-of p0, p0, Lcom/stripe/android/model/ConsumerPaymentDetails$BankAccount;

    if-eqz p0, :cond_1

    sget p0, Lcom/stripe/android/link/R$string;->wallet_remove_linked_account:I

    :goto_0
    return p0

    :cond_1
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0
.end method
