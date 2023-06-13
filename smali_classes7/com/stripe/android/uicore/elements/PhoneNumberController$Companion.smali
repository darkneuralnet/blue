.class public final Lcom/stripe/android/uicore/elements/PhoneNumberController$Companion;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/uicore/elements/PhoneNumberController;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\u0008\u0087\u0003\u0018\u00002\u00020\u0001B\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0002J\u001c\u0010\u0003\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00062\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u00a8\u0006\u0008"
    }
    d2 = {
        "Lcom/stripe/android/uicore/elements/PhoneNumberController$Companion;",
        "",
        "()V",
        "createPhoneNumberController",
        "Lcom/stripe/android/uicore/elements/PhoneNumberController;",
        "initialValue",
        "",
        "initiallySelectedCountryCode",
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

    invoke-direct {p0}, Lcom/stripe/android/uicore/elements/PhoneNumberController$Companion;-><init>()V

    return-void
.end method

.method public static synthetic createPhoneNumberController$default(Lcom/stripe/android/uicore/elements/PhoneNumberController$Companion;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Lcom/stripe/android/uicore/elements/PhoneNumberController;
    .locals 0

    and-int/lit8 p4, p3, 0x1

    if-eqz p4, :cond_0

    const-string p1, ""

    :cond_0
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    const/4 p2, 0x0

    :cond_1
    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/uicore/elements/PhoneNumberController$Companion;->createPhoneNumberController(Ljava/lang/String;Ljava/lang/String;)Lcom/stripe/android/uicore/elements/PhoneNumberController;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final createPhoneNumberController(Ljava/lang/String;Ljava/lang/String;)Lcom/stripe/android/uicore/elements/PhoneNumberController;
    .locals 13

    const-string v0, "initialValue"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "+"

    const/4 v3, 0x0

    const/4 v4, 0x2

    const/4 v5, 0x0

    invoke-static {p1, v0, v3, v4, v5}, Lkotlin/text/StringsKt;->startsWith$default(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    move-result v0

    if-nez p2, :cond_0

    if-eqz v0, :cond_0

    sget-object v0, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter;->Companion:Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Companion;

    invoke-virtual {v0, p1}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Companion;->forPrefix(Ljava/lang/String;)Lcom/stripe/android/uicore/elements/PhoneNumberFormatter;

    move-result-object v5

    goto :goto_0

    :cond_0
    if-eqz p2, :cond_1

    sget-object v0, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter;->Companion:Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Companion;

    invoke-virtual {v0, p2}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Companion;->forCountry(Ljava/lang/String;)Lcom/stripe/android/uicore/elements/PhoneNumberFormatter;

    move-result-object v5

    :cond_1
    :goto_0
    if-eqz v5, :cond_2

    invoke-virtual {v5}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter;->getPrefix()Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Lkotlin/text/StringsKt;->removePrefix(Ljava/lang/String;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v5, v1}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter;->toE164Format(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lcom/stripe/android/uicore/elements/PhoneNumberController;

    invoke-static {v1, v0}, Lkotlin/text/StringsKt;->removePrefix(Ljava/lang/String;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v5}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter;->getCountryCode()Ljava/lang/String;

    move-result-object v8

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/16 v11, 0xc

    const/4 v12, 0x0

    move-object v6, v2

    invoke-direct/range {v6 .. v12}, Lcom/stripe/android/uicore/elements/PhoneNumberController;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/Set;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto :goto_1

    :cond_2
    new-instance v7, Lcom/stripe/android/uicore/elements/PhoneNumberController;

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/16 v5, 0xc

    const/4 v6, 0x0

    move-object v0, v7

    move-object v1, p1

    move-object v2, p2

    invoke-direct/range {v0 .. v6}, Lcom/stripe/android/uicore/elements/PhoneNumberController;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/Set;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object v2, v7

    :goto_1
    return-object v2
.end method
