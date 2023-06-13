.class public final Lcom/stripe/android/uicore/elements/TextFieldStateConstants$Error$Invalid;
.super Lcom/stripe/android/uicore/elements/TextFieldStateConstants$Error;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/uicore/elements/TextFieldStateConstants$Error;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Invalid"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\u0008\u0007\n\u0002\u0010\u000b\n\u0002\u0008\u0003\u0008\u0007\u0018\u00002\u00020\u0001B#\u0012\u0008\u0008\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0012\u0008\u0002\u0010\u0004\u001a\u000c\u0012\u0006\u0008\u0001\u0012\u00020\u0006\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\u0007J\u0008\u0010\r\u001a\u00020\u000eH\u0016J\u0010\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000eH\u0016R\u0014\u0010\u0002\u001a\u00020\u0003X\u0094\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0008\u0010\tR \u0010\u0004\u001a\u000c\u0012\u0006\u0008\u0001\u0012\u00020\u0006\u0018\u00010\u0005X\u0094\u0004\u00a2\u0006\n\n\u0002\u0010\u000c\u001a\u0004\u0008\n\u0010\u000b\u00a8\u0006\u0011"
    }
    d2 = {
        "Lcom/stripe/android/uicore/elements/TextFieldStateConstants$Error$Invalid;",
        "Lcom/stripe/android/uicore/elements/TextFieldStateConstants$Error;",
        "errorMessageResId",
        "",
        "formatArgs",
        "",
        "",
        "(I[Ljava/lang/Object;)V",
        "getErrorMessageResId",
        "()I",
        "getFormatArgs",
        "()[Ljava/lang/Object;",
        "[Ljava/lang/Object;",
        "isBlank",
        "",
        "shouldShowError",
        "hasFocus",
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


# static fields
.field public static final $stable:I = 0x8


# instance fields
.field private final errorMessageResId:I

.field private final formatArgs:[Ljava/lang/Object;


# direct methods
.method public static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(I[Ljava/lang/Object;)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0}, Lcom/stripe/android/uicore/elements/TextFieldStateConstants$Error;-><init>(I[Ljava/lang/Object;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput p1, p0, Lcom/stripe/android/uicore/elements/TextFieldStateConstants$Error$Invalid;->errorMessageResId:I

    iput-object p2, p0, Lcom/stripe/android/uicore/elements/TextFieldStateConstants$Error$Invalid;->formatArgs:[Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(I[Ljava/lang/Object;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const/4 p2, 0x0

    :cond_0
    invoke-direct {p0, p1, p2}, Lcom/stripe/android/uicore/elements/TextFieldStateConstants$Error$Invalid;-><init>(I[Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public getErrorMessageResId()I
    .locals 1

    iget v0, p0, Lcom/stripe/android/uicore/elements/TextFieldStateConstants$Error$Invalid;->errorMessageResId:I

    return v0
.end method

.method public getFormatArgs()[Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/uicore/elements/TextFieldStateConstants$Error$Invalid;->formatArgs:[Ljava/lang/Object;

    return-object v0
.end method

.method public isBlank()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public shouldShowError(Z)Z
    .locals 0

    const/4 p1, 0x1

    return p1
.end method
