.class public abstract Lcom/stripe/android/StripeIntentResult;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/stripe/android/core/model/StripeModel;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/StripeIntentResult$WhenMappings;,
        Lcom/stripe/android/StripeIntentResult$Outcome;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T::",
        "Lcom/stripe/android/model/StripeIntent;",
        ">",
        "Ljava/lang/Object;",
        "Lcom/stripe/android/core/model/StripeModel;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\r\n\u0002\u0010\u000b\n\u0002\u0008\u0002\u0008\'\u0018\u0000*\n\u0008\u0000\u0010\u0001 \u0001*\u00020\u00022\u00020\u0003:\u0001\u001eB\u000f\u0008\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0018\u0010\u001a\u001a\u00020\u00052\u0006\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u0005H\u0002J\u0010\u0010\u0018\u001a\u00020\u00052\u0006\u0010\u001b\u001a\u00020\u0002H\u0002J\u0010\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001b\u001a\u00020\u0002H\u0002R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\u0008X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\t\u0010\nR\u0012\u0010\u000b\u001a\u00028\u0000X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u000c\u0010\rR$\u0010\u000e\u001a\u00020\u000f8\u0000@\u0000X\u0081\u000e\u00a2\u0006\u0014\n\u0000\u0012\u0004\u0008\u0010\u0010\u0011\u001a\u0004\u0008\u0012\u0010\u0013\"\u0004\u0008\u0014\u0010\u0015R\u0017\u0010\u0016\u001a\u00020\u00058F\u00a2\u0006\u000c\u0012\u0004\u0008\u0017\u0010\u0011\u001a\u0004\u0008\u0018\u0010\u0019R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001f"
    }
    d2 = {
        "Lcom/stripe/android/StripeIntentResult;",
        "T",
        "Lcom/stripe/android/model/StripeIntent;",
        "Lcom/stripe/android/core/model/StripeModel;",
        "outcomeFromFlow",
        "",
        "(I)V",
        "failureMessage",
        "",
        "getFailureMessage",
        "()Ljava/lang/String;",
        "intent",
        "getIntent",
        "()Lcom/stripe/android/model/StripeIntent;",
        "luxePostConfirmActionRepository",
        "Lcom/stripe/android/model/LuxePostConfirmActionRepository;",
        "getLuxePostConfirmActionRepository$payments_core_release$annotations",
        "()V",
        "getLuxePostConfirmActionRepository$payments_core_release",
        "()Lcom/stripe/android/model/LuxePostConfirmActionRepository;",
        "setLuxePostConfirmActionRepository$payments_core_release",
        "(Lcom/stripe/android/model/LuxePostConfirmActionRepository;)V",
        "outcome",
        "getOutcome$annotations",
        "getOutcome",
        "()I",
        "determineOutcome",
        "stripeIntent",
        "isRequireActionSuccessState",
        "",
        "Outcome",
        "payments-core_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final $stable:I = 0x8


# instance fields
.field private luxePostConfirmActionRepository:Lcom/stripe/android/model/LuxePostConfirmActionRepository;

.field private final outcomeFromFlow:I


# direct methods
.method public static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lcom/stripe/android/StripeIntentResult;->outcomeFromFlow:I

    sget-object p1, Lcom/stripe/android/model/LuxePostConfirmActionRepository;->Companion:Lcom/stripe/android/model/LuxePostConfirmActionRepository$Companion;

    invoke-virtual {p1}, Lcom/stripe/android/model/LuxePostConfirmActionRepository$Companion;->getInstance()Lcom/stripe/android/model/LuxePostConfirmActionRepository;

    move-result-object p1

    iput-object p1, p0, Lcom/stripe/android/StripeIntentResult;->luxePostConfirmActionRepository:Lcom/stripe/android/model/LuxePostConfirmActionRepository;

    return-void
.end method

.method private final determineOutcome(Lcom/stripe/android/model/StripeIntent;I)I
    .locals 0

    if-eqz p2, :cond_0

    return p2

    :cond_0
    invoke-direct {p0, p1}, Lcom/stripe/android/StripeIntentResult;->getOutcome(Lcom/stripe/android/model/StripeIntent;)I

    move-result p1

    return p1
.end method

.method public static synthetic getLuxePostConfirmActionRepository$payments_core_release$annotations()V
    .locals 0

    return-void
.end method

.method private final getOutcome(Lcom/stripe/android/model/StripeIntent;)I
    .locals 5

    iget-object v0, p0, Lcom/stripe/android/StripeIntentResult;->luxePostConfirmActionRepository:Lcom/stripe/android/model/LuxePostConfirmActionRepository;

    invoke-virtual {v0, p1}, Lcom/stripe/android/model/LuxePostConfirmActionRepository;->getPostAuthorizeIntentOutcome$payments_core_release(Lcom/stripe/android/model/StripeIntent;)Ljava/lang/Integer;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result p1

    goto :goto_4

    :cond_0
    invoke-interface {p1}, Lcom/stripe/android/model/StripeIntent;->getStatus()Lcom/stripe/android/model/StripeIntent$Status;

    move-result-object v0

    if-nez v0, :cond_1

    const/4 v0, -0x1

    goto :goto_0

    :cond_1
    sget-object v1, Lcom/stripe/android/StripeIntentResult$WhenMappings;->$EnumSwitchMapping$0:[I

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    aget v0, v1, v0

    :goto_0
    const/4 v1, 0x2

    const/4 v2, 0x3

    const/4 v3, 0x0

    const/4 v4, 0x1

    packed-switch v0, :pswitch_data_0

    :cond_2
    move p1, v3

    goto :goto_4

    :pswitch_0
    invoke-virtual {p0}, Lcom/stripe/android/StripeIntentResult;->getIntent()Lcom/stripe/android/model/StripeIntent;

    move-result-object p1

    invoke-interface {p1}, Lcom/stripe/android/model/StripeIntent;->getPaymentMethod()Lcom/stripe/android/model/PaymentMethod;

    move-result-object p1

    if-eqz p1, :cond_3

    iget-object p1, p1, Lcom/stripe/android/model/PaymentMethod;->type:Lcom/stripe/android/model/PaymentMethod$Type;

    if-eqz p1, :cond_3

    invoke-virtual {p1}, Lcom/stripe/android/model/PaymentMethod$Type;->hasDelayedSettlement()Z

    move-result p1

    if-ne p1, v4, :cond_3

    move p1, v4

    goto :goto_1

    :cond_3
    move p1, v3

    :goto_1
    if-eqz p1, :cond_2

    :goto_2
    :pswitch_1
    move p1, v4

    goto :goto_4

    :goto_3
    :pswitch_2
    move p1, v1

    goto :goto_4

    :cond_4
    :pswitch_3
    move p1, v2

    goto :goto_4

    :pswitch_4
    invoke-interface {p1}, Lcom/stripe/android/model/StripeIntent;->getNextActionData()Lcom/stripe/android/model/StripeIntent$NextActionData;

    move-result-object p1

    if-nez p1, :cond_5

    goto :goto_3

    :cond_5
    invoke-virtual {p0}, Lcom/stripe/android/StripeIntentResult;->getIntent()Lcom/stripe/android/model/StripeIntent;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/stripe/android/StripeIntentResult;->isRequireActionSuccessState(Lcom/stripe/android/model/StripeIntent;)Z

    move-result p1

    if-eqz p1, :cond_4

    goto :goto_2

    :goto_4
    return p1

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public static synthetic getOutcome$annotations()V
    .locals 0

    return-void
.end method

.method private final isRequireActionSuccessState(Lcom/stripe/android/model/StripeIntent;)Z
    .locals 1

    invoke-interface {p1}, Lcom/stripe/android/model/StripeIntent;->getNextActionType()Lcom/stripe/android/model/StripeIntent$NextActionType;

    move-result-object p1

    if-nez p1, :cond_0

    const/4 p1, -0x1

    goto :goto_0

    :cond_0
    sget-object v0, Lcom/stripe/android/StripeIntentResult$WhenMappings;->$EnumSwitchMapping$1:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v0, p1

    :goto_0
    packed-switch p1, :pswitch_data_0

    :pswitch_0
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :pswitch_1
    const/4 p1, 0x1

    goto :goto_1

    :pswitch_2
    const/4 p1, 0x0

    :goto_1
    return p1

    nop

    :pswitch_data_0
    .packed-switch -0x1
        :pswitch_2
        :pswitch_0
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
    .end packed-switch
.end method


# virtual methods
.method public abstract getFailureMessage()Ljava/lang/String;
.end method

.method public abstract getIntent()Lcom/stripe/android/model/StripeIntent;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation
.end method

.method public final getLuxePostConfirmActionRepository$payments_core_release()Lcom/stripe/android/model/LuxePostConfirmActionRepository;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/StripeIntentResult;->luxePostConfirmActionRepository:Lcom/stripe/android/model/LuxePostConfirmActionRepository;

    return-object v0
.end method

.method public final getOutcome()I
    .locals 2

    invoke-virtual {p0}, Lcom/stripe/android/StripeIntentResult;->getIntent()Lcom/stripe/android/model/StripeIntent;

    move-result-object v0

    iget v1, p0, Lcom/stripe/android/StripeIntentResult;->outcomeFromFlow:I

    invoke-direct {p0, v0, v1}, Lcom/stripe/android/StripeIntentResult;->determineOutcome(Lcom/stripe/android/model/StripeIntent;I)I

    move-result v0

    return v0
.end method

.method public final setLuxePostConfirmActionRepository$payments_core_release(Lcom/stripe/android/model/LuxePostConfirmActionRepository;)V
    .locals 1

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/stripe/android/StripeIntentResult;->luxePostConfirmActionRepository:Lcom/stripe/android/model/LuxePostConfirmActionRepository;

    return-void
.end method
