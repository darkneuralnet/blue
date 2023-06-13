.class public final Lcom/stripe/android/uicore/elements/AddressElementKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u001a3\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0008\u001a\u00020\tH\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\n\u001a3\u0010\u000b\u001a\u00020\u00012\u0006\u0010\u000c\u001a\u00020\r2\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0008\u001a\u00020\tH\u0080@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000e\u0082\u0002\u0004\n\u0002\u0008\u0019\u00a8\u0006\u000f"
    }
    d2 = {
        "updateLine1ConfigForAutocompleteAffordance",
        "",
        "textConfig",
        "Lcom/stripe/android/uicore/elements/SimpleTextFieldConfig;",
        "countryCode",
        "",
        "addressType",
        "Lcom/stripe/android/uicore/elements/AddressType;",
        "isPlacesAvailable",
        "Lcom/stripe/android/uicore/elements/IsPlacesAvailable;",
        "(Lcom/stripe/android/uicore/elements/SimpleTextFieldConfig;Ljava/lang/String;Lcom/stripe/android/uicore/elements/AddressType;Lcom/stripe/android/uicore/elements/IsPlacesAvailable;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "updateLine1WithAutocompleteAffordance",
        "field",
        "Lcom/stripe/android/uicore/elements/SectionFieldElement;",
        "(Lcom/stripe/android/uicore/elements/SectionFieldElement;Ljava/lang/String;Lcom/stripe/android/uicore/elements/AddressType;Lcom/stripe/android/uicore/elements/IsPlacesAvailable;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "stripe-ui-core_release"
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
.method public static final synthetic access$updateLine1ConfigForAutocompleteAffordance(Lcom/stripe/android/uicore/elements/SimpleTextFieldConfig;Ljava/lang/String;Lcom/stripe/android/uicore/elements/AddressType;Lcom/stripe/android/uicore/elements/IsPlacesAvailable;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lcom/stripe/android/uicore/elements/AddressElementKt;->updateLine1ConfigForAutocompleteAffordance(Lcom/stripe/android/uicore/elements/SimpleTextFieldConfig;Ljava/lang/String;Lcom/stripe/android/uicore/elements/AddressType;Lcom/stripe/android/uicore/elements/IsPlacesAvailable;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method private static final updateLine1ConfigForAutocompleteAffordance(Lcom/stripe/android/uicore/elements/SimpleTextFieldConfig;Ljava/lang/String;Lcom/stripe/android/uicore/elements/AddressType;Lcom/stripe/android/uicore/elements/IsPlacesAvailable;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/uicore/elements/SimpleTextFieldConfig;",
            "Ljava/lang/String;",
            "Lcom/stripe/android/uicore/elements/AddressType;",
            "Lcom/stripe/android/uicore/elements/IsPlacesAvailable;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p2, Lcom/stripe/android/uicore/address/AutocompleteCapableAddressType;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lcom/stripe/android/uicore/address/AutocompleteCapableAddressType;

    goto :goto_0

    :cond_0
    move-object v0, v1

    :goto_0
    if-eqz v0, :cond_1

    invoke-interface {v0, p1, p3}, Lcom/stripe/android/uicore/address/AutocompleteCapableAddressType;->supportsAutoComplete(Ljava/lang/String;Lcom/stripe/android/uicore/elements/IsPlacesAvailable;)Z

    move-result p1

    invoke-static {p1}, Lkotlin/coroutines/jvm/internal/Boxing;->boxBoolean(Z)Ljava/lang/Boolean;

    move-result-object p1

    goto :goto_1

    :cond_1
    move-object p1, v1

    :goto_1
    const/4 p3, 0x1

    invoke-static {p3}, Lkotlin/coroutines/jvm/internal/Boxing;->boxBoolean(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    sget p1, Lcom/stripe/android/uicore/R$drawable;->stripe_ic_search:I

    sget v0, Lcom/stripe/android/uicore/R$string;->address_search_content_description:I

    new-instance v1, Lcom/stripe/android/uicore/elements/TextFieldIcon$Trailing;

    invoke-static {v0}, Lkotlin/coroutines/jvm/internal/Boxing;->boxInt(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v2, Lcom/stripe/android/uicore/elements/AddressElementKt$updateLine1ConfigForAutocompleteAffordance$icon$1;

    invoke-direct {v2, p2}, Lcom/stripe/android/uicore/elements/AddressElementKt$updateLine1ConfigForAutocompleteAffordance$icon$1;-><init>(Lcom/stripe/android/uicore/elements/AddressType;)V

    invoke-direct {v1, p1, v0, p3, v2}, Lcom/stripe/android/uicore/elements/TextFieldIcon$Trailing;-><init>(ILjava/lang/Integer;ZLkotlin/jvm/functions/Function0;)V

    :cond_2
    invoke-virtual {p0}, Lcom/stripe/android/uicore/elements/SimpleTextFieldConfig;->getTrailingIcon()LGX2;

    move-result-object p0

    invoke-interface {p0, v1, p4}, LBX2;->emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p0

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object p1

    if-ne p0, p1, :cond_3

    return-object p0

    :cond_3
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method public static final updateLine1WithAutocompleteAffordance(Lcom/stripe/android/uicore/elements/SectionFieldElement;Ljava/lang/String;Lcom/stripe/android/uicore/elements/AddressType;Lcom/stripe/android/uicore/elements/IsPlacesAvailable;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/uicore/elements/SectionFieldElement;",
            "Ljava/lang/String;",
            "Lcom/stripe/android/uicore/elements/AddressType;",
            "Lcom/stripe/android/uicore/elements/IsPlacesAvailable;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-interface {p0}, Lcom/stripe/android/uicore/elements/SectionFieldElement;->getIdentifier()Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object v0

    sget-object v1, Lcom/stripe/android/uicore/elements/IdentifierSpec;->Companion:Lcom/stripe/android/uicore/elements/IdentifierSpec$Companion;

    invoke-virtual {v1}, Lcom/stripe/android/uicore/elements/IdentifierSpec$Companion;->getLine1()Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    instance-of v0, p0, Lcom/stripe/android/uicore/elements/SimpleTextElement;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    check-cast p0, Lcom/stripe/android/uicore/elements/SimpleTextElement;

    goto :goto_0

    :cond_0
    move-object p0, v1

    :goto_0
    if-eqz p0, :cond_1

    invoke-virtual {p0}, Lcom/stripe/android/uicore/elements/SimpleTextElement;->getController()Lcom/stripe/android/uicore/elements/TextFieldController;

    move-result-object p0

    goto :goto_1

    :cond_1
    move-object p0, v1

    :goto_1
    instance-of v0, p0, Lcom/stripe/android/uicore/elements/SimpleTextFieldController;

    if-eqz v0, :cond_2

    check-cast p0, Lcom/stripe/android/uicore/elements/SimpleTextFieldController;

    goto :goto_2

    :cond_2
    move-object p0, v1

    :goto_2
    if-eqz p0, :cond_3

    invoke-virtual {p0}, Lcom/stripe/android/uicore/elements/SimpleTextFieldController;->getTextFieldConfig()Lcom/stripe/android/uicore/elements/TextFieldConfig;

    move-result-object p0

    goto :goto_3

    :cond_3
    move-object p0, v1

    :goto_3
    instance-of v0, p0, Lcom/stripe/android/uicore/elements/SimpleTextFieldConfig;

    if-eqz v0, :cond_4

    move-object v1, p0

    check-cast v1, Lcom/stripe/android/uicore/elements/SimpleTextFieldConfig;

    :cond_4
    if-eqz v1, :cond_6

    invoke-static {v1, p1, p2, p3, p4}, Lcom/stripe/android/uicore/elements/AddressElementKt;->updateLine1ConfigForAutocompleteAffordance(Lcom/stripe/android/uicore/elements/SimpleTextFieldConfig;Ljava/lang/String;Lcom/stripe/android/uicore/elements/AddressType;Lcom/stripe/android/uicore/elements/IsPlacesAvailable;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p0

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object p1

    if-ne p0, p1, :cond_5

    return-object p0

    :cond_5
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0

    :cond_6
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method
