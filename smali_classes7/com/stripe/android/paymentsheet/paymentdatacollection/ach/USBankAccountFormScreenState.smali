.class public abstract Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormScreenState;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormScreenState$NameAndEmailCollection;,
        Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormScreenState$MandateCollection;,
        Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormScreenState$VerifyWithMicrodeposits;,
        Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormScreenState$SavedAccount;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0005\n\u0002\u0010\u000e\n\u0002\u0008\u0008\n\u0002\u0010\u000b\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u00080\u0018\u00002\u00020\u0001:\u0004\u0013\u0014\u0015\u0016B\u0013\u0008\u0004\u0012\n\u0008\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0004J\"\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\t2\u0008\u0010\u0010\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0011\u001a\u00020\u0012H&R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0096\u0004\u00a2\u0006\n\n\u0002\u0010\u0007\u001a\u0004\u0008\u0005\u0010\u0006R\u0014\u0010\u0008\u001a\u0004\u0018\u00010\tX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\n\u0010\u000bR\u0012\u0010\u000c\u001a\u00020\tX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\r\u0010\u000b\u0082\u0001\u0004\u0017\u0018\u0019\u001a\u00a8\u0006\u001b"
    }
    d2 = {
        "Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormScreenState;",
        "",
        "error",
        "",
        "(Ljava/lang/Integer;)V",
        "getError",
        "()Ljava/lang/Integer;",
        "Ljava/lang/Integer;",
        "mandateText",
        "",
        "getMandateText",
        "()Ljava/lang/String;",
        "primaryButtonText",
        "getPrimaryButtonText",
        "updateInputs",
        "name",
        "email",
        "saveForFutureUsage",
        "",
        "MandateCollection",
        "NameAndEmailCollection",
        "SavedAccount",
        "VerifyWithMicrodeposits",
        "Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormScreenState$MandateCollection;",
        "Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormScreenState$NameAndEmailCollection;",
        "Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormScreenState$SavedAccount;",
        "Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormScreenState$VerifyWithMicrodeposits;",
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


# instance fields
.field private final error:Ljava/lang/Integer;


# direct methods
.method private constructor <init>(Ljava/lang/Integer;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormScreenState;->error:Ljava/lang/Integer;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Integer;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p2, p2, 0x1

    const/4 p3, 0x0

    if-eqz p2, :cond_0

    move-object p1, p3

    :cond_0
    invoke-direct {p0, p1, p3}, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormScreenState;-><init>(Ljava/lang/Integer;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Integer;Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormScreenState;-><init>(Ljava/lang/Integer;)V

    return-void
.end method


# virtual methods
.method public getError()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormScreenState;->error:Ljava/lang/Integer;

    return-object v0
.end method

.method public abstract getMandateText()Ljava/lang/String;
.end method

.method public abstract getPrimaryButtonText()Ljava/lang/String;
.end method

.method public abstract updateInputs(Ljava/lang/String;Ljava/lang/String;Z)Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormScreenState;
.end method
