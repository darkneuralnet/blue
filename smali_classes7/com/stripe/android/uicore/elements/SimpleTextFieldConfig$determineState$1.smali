.class public final Lcom/stripe/android/uicore/elements/SimpleTextFieldConfig$determineState$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/stripe/android/uicore/elements/TextFieldState;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/uicore/elements/SimpleTextFieldConfig;->determineState(Ljava/lang/String;)Lcom/stripe/android/uicore/elements/TextFieldState;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0005*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\n\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\u0016J\u0008\u0010\u0004\u001a\u00020\u0005H\u0016J\u0008\u0010\u0006\u001a\u00020\u0005H\u0016J\u0008\u0010\u0007\u001a\u00020\u0005H\u0016J\u0010\u0010\u0008\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u0005H\u0016\u00a8\u0006\n"
    }
    d2 = {
        "com/stripe/android/uicore/elements/SimpleTextFieldConfig$determineState$1",
        "Lcom/stripe/android/uicore/elements/TextFieldState;",
        "getError",
        "Lcom/stripe/android/uicore/elements/FieldError;",
        "isBlank",
        "",
        "isFull",
        "isValid",
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


# instance fields
.field final synthetic $input:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/stripe/android/uicore/elements/SimpleTextFieldConfig$determineState$1;->$input:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getError()Lcom/stripe/android/uicore/elements/FieldError;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public isBlank()Z
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/uicore/elements/SimpleTextFieldConfig$determineState$1;->$input:Ljava/lang/String;

    invoke-static {v0}, Lkotlin/text/StringsKt;->isBlank(Ljava/lang/CharSequence;)Z

    move-result v0

    return v0
.end method

.method public isFull()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public isValid()Z
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/uicore/elements/SimpleTextFieldConfig$determineState$1;->$input:Ljava/lang/String;

    invoke-static {v0}, Lkotlin/text/StringsKt;->isBlank(Ljava/lang/CharSequence;)Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    return v0
.end method

.method public shouldShowError(Z)Z
    .locals 0

    const/4 p1, 0x0

    return p1
.end method
