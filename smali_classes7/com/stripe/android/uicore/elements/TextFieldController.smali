.class public interface abstract Lcom/stripe/android/uicore/elements/TextFieldController;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/stripe/android/uicore/elements/InputController;
.implements Lcom/stripe/android/uicore/elements/SectionFieldComposable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/uicore/elements/TextFieldController$DefaultImpls;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0014\u0008g\u0018\u00002\u00020\u00012\u00020\u0002J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0004\u001a\u00020\u0003H&J\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\u0008\u001a\u00020\u0007H&JU\u0010\u0019\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u000c2\u0006\u0010\u000f\u001a\u00020\u000e2\u000c\u0010\u0012\u001a\u0008\u0012\u0004\u0012\u00020\u00110\u00102\u0008\u0010\u0013\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0014H\u0017\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\u0008\u0017\u0010\u0018R\u0016\u0010\u001d\u001a\u0004\u0018\u00010\u001a8&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u001b\u0010\u001cR\u0014\u0010 \u001a\u00020\u00038&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u001e\u0010\u001fR\u001c\u0010%\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\"0!8&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008#\u0010$R\u001d\u0010)\u001a\u00020&8&X\u00a6\u0004\u00f8\u0001\u0001\u00f8\u0001\u0000\u00f8\u0001\u0002\u00a2\u0006\u0006\u001a\u0004\u0008\'\u0010(R\u001d\u0010,\u001a\u00020*8&X\u00a6\u0004\u00f8\u0001\u0001\u00f8\u0001\u0000\u00f8\u0001\u0002\u00a2\u0006\u0006\u001a\u0004\u0008+\u0010(R\u001c\u0010/\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010-0!8&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008.\u0010$R\u0014\u00103\u001a\u0002008&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u00081\u00102R\u0014\u00106\u001a\u00020\u00078&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u00084\u00105R\u001a\u00108\u001a\u0008\u0012\u0004\u0012\u00020\u00050!8&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u00087\u0010$R\u001a\u0010:\u001a\u0008\u0012\u0004\u0012\u00020\u00030!8&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u00089\u0010$R\u001a\u0010<\u001a\u0008\u0012\u0004\u0012\u00020\u00070!8&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008;\u0010$R\u001a\u0010>\u001a\u0008\u0012\u0004\u0012\u00020\u00070!8&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008=\u0010$R\u001c\u0010@\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030!8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008?\u0010$R\u0014\u0010\u000b\u001a\u00020\u00078VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008A\u00105R\u001a\u0010C\u001a\u0008\u0012\u0004\u0012\u00020\u00030!8&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008B\u0010$\u0082\u0002\u000f\n\u0005\u0008\u00a1\u001e0\u0001\n\u0002\u0008\u0019\n\u0002\u0008!\u00a8\u0006D"
    }
    d2 = {
        "Lcom/stripe/android/uicore/elements/TextFieldController;",
        "Lcom/stripe/android/uicore/elements/InputController;",
        "Lcom/stripe/android/uicore/elements/SectionFieldComposable;",
        "",
        "displayFormatted",
        "Lcom/stripe/android/uicore/elements/TextFieldState;",
        "onValueChange",
        "",
        "newHasFocus",
        "",
        "onFocusChange",
        "enabled",
        "Lcom/stripe/android/uicore/elements/SectionFieldElement;",
        "field",
        "LgV2;",
        "modifier",
        "",
        "Lcom/stripe/android/uicore/elements/IdentifierSpec;",
        "hiddenIdentifiers",
        "lastTextFieldIdentifier",
        "Landroidx/compose/ui/focus/c;",
        "nextFocusDirection",
        "previousFocusDirection",
        "ComposeUI-MxjM1cc",
        "(ZLcom/stripe/android/uicore/elements/SectionFieldElement;LgV2;Ljava/util/Set;Lcom/stripe/android/uicore/elements/IdentifierSpec;IILEt0;I)V",
        "ComposeUI",
        "LRu;",
        "getAutofillType",
        "()LRu;",
        "autofillType",
        "getDebugLabel",
        "()Ljava/lang/String;",
        "debugLabel",
        "LEu1;",
        "Lcom/stripe/android/uicore/elements/TextFieldIcon;",
        "getTrailingIcon",
        "()LEu1;",
        "trailingIcon",
        "Lal2;",
        "getCapitalization-IUNYP9k",
        "()I",
        "capitalization",
        "Lcl2;",
        "getKeyboardType-PjHm6EE",
        "keyboardType",
        "",
        "getLabel",
        "label",
        "LEu6;",
        "getVisualTransformation",
        "()LEu6;",
        "visualTransformation",
        "getShowOptionalLabel",
        "()Z",
        "showOptionalLabel",
        "getFieldState",
        "fieldState",
        "getFieldValue",
        "fieldValue",
        "getVisibleError",
        "visibleError",
        "getLoading",
        "loading",
        "getPlaceHolder",
        "placeHolder",
        "getEnabled",
        "getContentDescription",
        "contentDescription",
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
.method public abstract ComposeUI-MxjM1cc(ZLcom/stripe/android/uicore/elements/SectionFieldElement;LgV2;Ljava/util/Set;Lcom/stripe/android/uicore/elements/IdentifierSpec;IILEt0;I)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z",
            "Lcom/stripe/android/uicore/elements/SectionFieldElement;",
            "LgV2;",
            "Ljava/util/Set<",
            "Lcom/stripe/android/uicore/elements/IdentifierSpec;",
            ">;",
            "Lcom/stripe/android/uicore/elements/IdentifierSpec;",
            "II",
            "LEt0;",
            "I)V"
        }
    .end annotation
.end method

.method public abstract getAutofillType()LRu;
.end method

.method public abstract getCapitalization-IUNYP9k()I
.end method

.method public abstract getContentDescription()LEu1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LEu1<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end method

.method public abstract getDebugLabel()Ljava/lang/String;
.end method

.method public abstract getEnabled()Z
.end method

.method public abstract getFieldState()LEu1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LEu1<",
            "Lcom/stripe/android/uicore/elements/TextFieldState;",
            ">;"
        }
    .end annotation
.end method

.method public abstract getFieldValue()LEu1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LEu1<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end method

.method public abstract getKeyboardType-PjHm6EE()I
.end method

.method public abstract getLabel()LEu1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LEu1<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end method

.method public abstract getLoading()LEu1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LEu1<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end method

.method public abstract getPlaceHolder()LEu1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LEu1<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end method

.method public abstract getShowOptionalLabel()Z
.end method

.method public abstract getTrailingIcon()LEu1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LEu1<",
            "Lcom/stripe/android/uicore/elements/TextFieldIcon;",
            ">;"
        }
    .end annotation
.end method

.method public abstract getVisibleError()LEu1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LEu1<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end method

.method public abstract getVisualTransformation()LEu6;
.end method

.method public abstract onFocusChange(Z)V
.end method

.method public abstract onValueChange(Ljava/lang/String;)Lcom/stripe/android/uicore/elements/TextFieldState;
.end method
