.class public final Lcom/stripe/android/paymentsheet/addresselement/AddressSpecFactory;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/paymentsheet/addresselement/AddressSpecFactory$WhenMappings;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0008\u00c0\u0002\u0018\u00002\u00020\u0001B\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0002J&\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u00082\u000c\u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\nJ\u0010\u0010\u000c\u001a\u00020\r2\u0008\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u00a8\u0006\u0010"
    }
    d2 = {
        "Lcom/stripe/android/paymentsheet/addresselement/AddressSpecFactory;",
        "",
        "()V",
        "create",
        "Lcom/stripe/android/ui/core/elements/AddressSpec;",
        "condensedForm",
        "",
        "config",
        "Lcom/stripe/android/paymentsheet/addresselement/AddressLauncher$Configuration;",
        "onNavigation",
        "Lkotlin/Function0;",
        "",
        "parsePhoneNumberConfig",
        "Lcom/stripe/android/uicore/elements/PhoneNumberState;",
        "configuration",
        "Lcom/stripe/android/paymentsheet/addresselement/AddressLauncher$AdditionalFieldsConfiguration$FieldConfiguration;",
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


# static fields
.field public static final INSTANCE:Lcom/stripe/android/paymentsheet/addresselement/AddressSpecFactory;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/stripe/android/paymentsheet/addresselement/AddressSpecFactory;

    invoke-direct {v0}, Lcom/stripe/android/paymentsheet/addresselement/AddressSpecFactory;-><init>()V

    sput-object v0, Lcom/stripe/android/paymentsheet/addresselement/AddressSpecFactory;->INSTANCE:Lcom/stripe/android/paymentsheet/addresselement/AddressSpecFactory;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final create(ZLcom/stripe/android/paymentsheet/addresselement/AddressLauncher$Configuration;Lkotlin/jvm/functions/Function0;)Lcom/stripe/android/ui/core/elements/AddressSpec;
    .locals 29
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z",
            "Lcom/stripe/android/paymentsheet/addresselement/AddressLauncher$Configuration;",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;)",
            "Lcom/stripe/android/ui/core/elements/AddressSpec;"
        }
    .end annotation

    move-object/from16 v0, p3

    const-string v1, "onNavigation"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v1, 0x0

    if-eqz p2, :cond_0

    invoke-virtual/range {p2 .. p2}, Lcom/stripe/android/paymentsheet/addresselement/AddressLauncher$Configuration;->getAdditionalFields()Lcom/stripe/android/paymentsheet/addresselement/AddressLauncher$AdditionalFieldsConfiguration;

    move-result-object v2

    if-eqz v2, :cond_0

    invoke-virtual {v2}, Lcom/stripe/android/paymentsheet/addresselement/AddressLauncher$AdditionalFieldsConfiguration;->getPhone()Lcom/stripe/android/paymentsheet/addresselement/AddressLauncher$AdditionalFieldsConfiguration$FieldConfiguration;

    move-result-object v2

    move-object/from16 v3, p0

    goto :goto_0

    :cond_0
    move-object/from16 v3, p0

    move-object v2, v1

    :goto_0
    invoke-virtual {v3, v2}, Lcom/stripe/android/paymentsheet/addresselement/AddressSpecFactory;->parsePhoneNumberConfig(Lcom/stripe/android/paymentsheet/addresselement/AddressLauncher$AdditionalFieldsConfiguration$FieldConfiguration;)Lcom/stripe/android/uicore/elements/PhoneNumberState;

    move-result-object v2

    if-eqz p1, :cond_3

    new-instance v12, Lcom/stripe/android/ui/core/elements/AddressSpec;

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    new-instance v9, Lcom/stripe/android/uicore/elements/AddressType$ShippingCondensed;

    if-eqz p2, :cond_1

    invoke-virtual/range {p2 .. p2}, Lcom/stripe/android/paymentsheet/addresselement/AddressLauncher$Configuration;->getGooglePlacesApiKey()Ljava/lang/String;

    move-result-object v4

    goto :goto_1

    :cond_1
    move-object v4, v1

    :goto_1
    if-eqz p2, :cond_2

    invoke-virtual/range {p2 .. p2}, Lcom/stripe/android/paymentsheet/addresselement/AddressLauncher$Configuration;->getAutocompleteCountries()Ljava/util/Set;

    move-result-object v10

    goto :goto_2

    :cond_2
    move-object v10, v1

    :goto_2
    invoke-direct {v9, v4, v10, v2, v0}, Lcom/stripe/android/uicore/elements/AddressType$ShippingCondensed;-><init>(Ljava/lang/String;Ljava/util/Set;Lcom/stripe/android/uicore/elements/PhoneNumberState;Lkotlin/jvm/functions/Function0;)V

    const/4 v10, 0x7

    const/4 v11, 0x0

    move-object v4, v12

    invoke-direct/range {v4 .. v11}, Lcom/stripe/android/ui/core/elements/AddressSpec;-><init>(Lcom/stripe/android/uicore/elements/IdentifierSpec;Ljava/util/Set;Ljava/util/Set;ZLcom/stripe/android/uicore/elements/AddressType;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto :goto_5

    :cond_3
    new-instance v12, Lcom/stripe/android/ui/core/elements/AddressSpec;

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    new-instance v4, Lcom/stripe/android/uicore/elements/AddressType$ShippingExpanded;

    if-eqz p2, :cond_4

    invoke-virtual/range {p2 .. p2}, Lcom/stripe/android/paymentsheet/addresselement/AddressLauncher$Configuration;->getGooglePlacesApiKey()Ljava/lang/String;

    move-result-object v5

    goto :goto_3

    :cond_4
    move-object v5, v1

    :goto_3
    if-eqz p2, :cond_5

    invoke-virtual/range {p2 .. p2}, Lcom/stripe/android/paymentsheet/addresselement/AddressLauncher$Configuration;->getAutocompleteCountries()Ljava/util/Set;

    move-result-object v6

    goto :goto_4

    :cond_5
    move-object v6, v1

    :goto_4
    invoke-direct {v4, v5, v6, v2, v0}, Lcom/stripe/android/uicore/elements/AddressType$ShippingExpanded;-><init>(Ljava/lang/String;Ljava/util/Set;Lcom/stripe/android/uicore/elements/PhoneNumberState;Lkotlin/jvm/functions/Function0;)V

    const/16 v19, 0x7

    const/16 v20, 0x0

    move-object v13, v12

    move-object/from16 v18, v4

    invoke-direct/range {v13 .. v20}, Lcom/stripe/android/ui/core/elements/AddressSpec;-><init>(Lcom/stripe/android/uicore/elements/IdentifierSpec;Ljava/util/Set;Ljava/util/Set;ZLcom/stripe/android/uicore/elements/AddressType;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    :goto_5
    if-eqz p2, :cond_6

    invoke-virtual/range {p2 .. p2}, Lcom/stripe/android/paymentsheet/addresselement/AddressLauncher$Configuration;->getAllowedCountries()Ljava/util/Set;

    move-result-object v23

    if-eqz v23, :cond_6

    const/16 v22, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x1d

    const/16 v28, 0x0

    move-object/from16 v21, v12

    invoke-static/range {v21 .. v28}, Lcom/stripe/android/ui/core/elements/AddressSpec;->copy$default(Lcom/stripe/android/ui/core/elements/AddressSpec;Lcom/stripe/android/uicore/elements/IdentifierSpec;Ljava/util/Set;Ljava/util/Set;ZLcom/stripe/android/uicore/elements/AddressType;ILjava/lang/Object;)Lcom/stripe/android/ui/core/elements/AddressSpec;

    move-result-object v1

    :cond_6
    if-nez v1, :cond_7

    goto :goto_6

    :cond_7
    move-object v12, v1

    :goto_6
    return-object v12
.end method

.method public final parsePhoneNumberConfig(Lcom/stripe/android/paymentsheet/addresselement/AddressLauncher$AdditionalFieldsConfiguration$FieldConfiguration;)Lcom/stripe/android/uicore/elements/PhoneNumberState;
    .locals 2

    const/4 v0, -0x1

    if-nez p1, :cond_0

    move p1, v0

    goto :goto_0

    :cond_0
    sget-object v1, Lcom/stripe/android/paymentsheet/addresselement/AddressSpecFactory$WhenMappings;->$EnumSwitchMapping$0:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v1, p1

    :goto_0
    if-eq p1, v0, :cond_4

    const/4 v0, 0x1

    if-eq p1, v0, :cond_3

    const/4 v0, 0x2

    if-eq p1, v0, :cond_2

    const/4 v0, 0x3

    if-ne p1, v0, :cond_1

    sget-object p1, Lcom/stripe/android/uicore/elements/PhoneNumberState;->REQUIRED:Lcom/stripe/android/uicore/elements/PhoneNumberState;

    goto :goto_1

    :cond_1
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_2
    sget-object p1, Lcom/stripe/android/uicore/elements/PhoneNumberState;->OPTIONAL:Lcom/stripe/android/uicore/elements/PhoneNumberState;

    goto :goto_1

    :cond_3
    sget-object p1, Lcom/stripe/android/uicore/elements/PhoneNumberState;->HIDDEN:Lcom/stripe/android/uicore/elements/PhoneNumberState;

    goto :goto_1

    :cond_4
    sget-object p1, Lcom/stripe/android/uicore/elements/PhoneNumberState;->OPTIONAL:Lcom/stripe/android/uicore/elements/PhoneNumberState;

    :goto_1
    return-object p1
.end method
