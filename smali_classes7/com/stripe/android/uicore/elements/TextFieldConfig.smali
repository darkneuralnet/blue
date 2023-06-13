.class public interface abstract Lcom/stripe/android/uicore/elements/TextFieldConfig;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/uicore/elements/TextFieldConfig$DefaultImpls;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0005\u0008g\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H&J\u0010\u0010\t\u001a\u00020\u00022\u0006\u0010\u0008\u001a\u00020\u0002H&J\u0010\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0002H&R\u001d\u0010\u000f\u001a\u00020\u000c8&X\u00a6\u0004\u00f8\u0001\u0000\u00f8\u0001\u0001\u00f8\u0001\u0002\u00a2\u0006\u0006\u001a\u0004\u0008\r\u0010\u000eR\u0014\u0010\u0012\u001a\u00020\u00028&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0010\u0010\u0011R\u0016\u0010\u0016\u001a\u0004\u0018\u00010\u00138&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0014\u0010\u0015R\u001d\u0010\u0019\u001a\u00020\u00178&X\u00a6\u0004\u00f8\u0001\u0000\u00f8\u0001\u0001\u00f8\u0001\u0002\u00a2\u0006\u0006\u001a\u0004\u0008\u0018\u0010\u000eR\u0016\u0010\u001d\u001a\u0004\u0018\u00010\u001a8&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u001b\u0010\u001cR\u001c\u0010\"\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001f0\u001e8&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008 \u0010!R\u001a\u0010%\u001a\u0008\u0012\u0004\u0012\u00020#0\u001e8&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008$\u0010!R\u0016\u0010\'\u001a\u0004\u0018\u00010\u00028VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008&\u0010\u0011\u0082\u0002\u000f\n\u0002\u0008\u0019\n\u0005\u0008\u00a1\u001e0\u0001\n\u0002\u0008!\u00a8\u0006("
    }
    d2 = {
        "Lcom/stripe/android/uicore/elements/TextFieldConfig;",
        "",
        "",
        "input",
        "Lcom/stripe/android/uicore/elements/TextFieldState;",
        "determineState",
        "userTyped",
        "filter",
        "displayName",
        "convertToRaw",
        "rawValue",
        "convertFromRaw",
        "Lal2;",
        "getCapitalization-IUNYP9k",
        "()I",
        "capitalization",
        "getDebugLabel",
        "()Ljava/lang/String;",
        "debugLabel",
        "",
        "getLabel",
        "()Ljava/lang/Integer;",
        "label",
        "Lcl2;",
        "getKeyboard-PjHm6EE",
        "keyboard",
        "LEu6;",
        "getVisualTransformation",
        "()LEu6;",
        "visualTransformation",
        "LtP5;",
        "Lcom/stripe/android/uicore/elements/TextFieldIcon;",
        "getTrailingIcon",
        "()LtP5;",
        "trailingIcon",
        "",
        "getLoading",
        "loading",
        "getPlaceHolder",
        "placeHolder",
        "stripe-ui-core_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# virtual methods
.method public abstract convertFromRaw(Ljava/lang/String;)Ljava/lang/String;
.end method

.method public abstract convertToRaw(Ljava/lang/String;)Ljava/lang/String;
.end method

.method public abstract determineState(Ljava/lang/String;)Lcom/stripe/android/uicore/elements/TextFieldState;
.end method

.method public abstract filter(Ljava/lang/String;)Ljava/lang/String;
.end method

.method public abstract getCapitalization-IUNYP9k()I
.end method

.method public abstract getDebugLabel()Ljava/lang/String;
.end method

.method public abstract getKeyboard-PjHm6EE()I
.end method

.method public abstract getLabel()Ljava/lang/Integer;
.end method

.method public abstract getLoading()LtP5;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LtP5<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end method

.method public abstract getPlaceHolder()Ljava/lang/String;
.end method

.method public abstract getTrailingIcon()LtP5;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LtP5<",
            "Lcom/stripe/android/uicore/elements/TextFieldIcon;",
            ">;"
        }
    .end annotation
.end method

.method public abstract getVisualTransformation()LEu6;
.end method
