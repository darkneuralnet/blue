.class public final Lcom/stripe/android/uicore/elements/DateConfig$Companion;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/uicore/elements/DateConfig;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0004\u0008\u0087\u0003\u0018\u00002\u00020\u0001B\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0002J(\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0008\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0006H\u0007\u00a8\u0006\n"
    }
    d2 = {
        "Lcom/stripe/android/uicore/elements/DateConfig$Companion;",
        "",
        "()V",
        "determineTextFieldState",
        "Lcom/stripe/android/uicore/elements/TextFieldState;",
        "month1Based",
        "",
        "twoDigitYear",
        "current1BasedMonth",
        "currentYear",
        "stripe-ui-core_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    invoke-direct {p0}, Lcom/stripe/android/uicore/elements/DateConfig$Companion;-><init>()V

    return-void
.end method


# virtual methods
.method public final determineTextFieldState(IIII)Lcom/stripe/android/uicore/elements/TextFieldState;
    .locals 2

    rem-int/lit8 p4, p4, 0x64

    sub-int/2addr p2, p4

    const/4 p4, 0x2

    const/4 v0, 0x0

    if-gez p2, :cond_0

    new-instance p1, Lcom/stripe/android/uicore/elements/TextFieldStateConstants$Error$Invalid;

    sget p2, Lcom/stripe/android/uicore/R$string;->invalid_expiry_year:I

    invoke-direct {p1, p2, v0, p4, v0}, Lcom/stripe/android/uicore/elements/TextFieldStateConstants$Error$Invalid;-><init>(I[Ljava/lang/Object;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto :goto_0

    :cond_0
    const/16 v1, 0x32

    if-le p2, v1, :cond_1

    new-instance p1, Lcom/stripe/android/uicore/elements/TextFieldStateConstants$Error$Invalid;

    sget p2, Lcom/stripe/android/uicore/R$string;->invalid_expiry_year:I

    invoke-direct {p1, p2, v0, p4, v0}, Lcom/stripe/android/uicore/elements/TextFieldStateConstants$Error$Invalid;-><init>(I[Ljava/lang/Object;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto :goto_0

    :cond_1
    if-nez p2, :cond_2

    if-le p3, p1, :cond_2

    new-instance p1, Lcom/stripe/android/uicore/elements/TextFieldStateConstants$Error$Invalid;

    sget p2, Lcom/stripe/android/uicore/R$string;->invalid_expiry_month:I

    invoke-direct {p1, p2, v0, p4, v0}, Lcom/stripe/android/uicore/elements/TextFieldStateConstants$Error$Invalid;-><init>(I[Ljava/lang/Object;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto :goto_0

    :cond_2
    const/4 p2, 0x0

    const/4 p3, 0x1

    if-gt p3, p1, :cond_3

    const/16 p4, 0xd

    if-ge p1, p4, :cond_3

    move p2, p3

    :cond_3
    if-nez p2, :cond_4

    new-instance p1, Lcom/stripe/android/uicore/elements/TextFieldStateConstants$Error$Incomplete;

    sget p2, Lcom/stripe/android/uicore/R$string;->invalid_expiry_month:I

    invoke-direct {p1, p2}, Lcom/stripe/android/uicore/elements/TextFieldStateConstants$Error$Incomplete;-><init>(I)V

    goto :goto_0

    :cond_4
    sget-object p1, Lcom/stripe/android/uicore/elements/TextFieldStateConstants$Valid$Full;->INSTANCE:Lcom/stripe/android/uicore/elements/TextFieldStateConstants$Valid$Full;

    :goto_0
    return-object p1
.end method
