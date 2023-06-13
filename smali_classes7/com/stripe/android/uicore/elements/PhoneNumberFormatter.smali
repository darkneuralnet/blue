.class public abstract Lcom/stripe/android/uicore/elements/PhoneNumberFormatter;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;,
        Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Companion;,
        Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$WithRegion;,
        Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$UnknownRegion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\u0008\n\n\u0002\u0018\u0002\n\u0002\u0008\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u00080\u0018\u0000 \u00132\u00020\u0001:\u0004\u0013\u0014\u0015\u0016B\t\u0008\u0004\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H&R\u0014\u0010\u0008\u001a\u00020\u00028&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0006\u0010\u0007R\u0014\u0010\n\u001a\u00020\u00028&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\t\u0010\u0007R\u0014\u0010\u000c\u001a\u00020\u00028&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u000b\u0010\u0007R\u0014\u0010\u0010\u001a\u00020\r8&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u000e\u0010\u000f\u0082\u0001\u0002\u0017\u0018\u00a8\u0006\u0019"
    }
    d2 = {
        "Lcom/stripe/android/uicore/elements/PhoneNumberFormatter;",
        "",
        "",
        "input",
        "userInputFilter",
        "toE164Format",
        "getPrefix",
        "()Ljava/lang/String;",
        "prefix",
        "getPlaceholder",
        "placeholder",
        "getCountryCode",
        "countryCode",
        "LEu6;",
        "getVisualTransformation",
        "()LEu6;",
        "visualTransformation",
        "<init>",
        "()V",
        "Companion",
        "Metadata",
        "UnknownRegion",
        "WithRegion",
        "Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$UnknownRegion;",
        "Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$WithRegion;",
        "stripe-ui-core_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# static fields
.field private static final COUNTRY_PREFIX_MAX_LENGTH:I = 0x5

.field public static final Companion:Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Companion;

.field private static final E164_MAX_DIGITS:I = 0xf

.field private static final VALID_INPUT_RANGE:Lkotlin/ranges/CharRange;

.field private static final allMetadata:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 21

    new-instance v0, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter;->Companion:Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Companion;

    new-instance v0, Lkotlin/ranges/CharRange;

    const/16 v1, 0x30

    const/16 v2, 0x39

    invoke-direct {v0, v1, v2}, Lkotlin/ranges/CharRange;-><init>(CC)V

    sput-object v0, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter;->VALID_INPUT_RANGE:Lkotlin/ranges/CharRange;

    const/16 v0, 0xf0

    new-array v0, v0, [Lkotlin/Pair;

    new-instance v1, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v2, "+1"

    const-string v3, "US"

    const-string v4, "(###) ###-####"

    invoke-direct {v1, v2, v3, v4}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v3, "US"

    invoke-static {v3, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/4 v3, 0x0

    aput-object v1, v0, v3

    new-instance v1, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v3, "CA"

    invoke-direct {v1, v2, v3, v4}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v3, "CA"

    invoke-static {v3, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/4 v3, 0x1

    aput-object v1, v0, v3

    new-instance v1, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v3, "AG"

    invoke-direct {v1, v2, v3, v4}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v3, "AG"

    invoke-static {v3, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/4 v3, 0x2

    aput-object v1, v0, v3

    new-instance v1, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v3, "AS"

    invoke-direct {v1, v2, v3, v4}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v3, "AS"

    invoke-static {v3, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/4 v3, 0x3

    aput-object v1, v0, v3

    new-instance v1, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v3, "AI"

    invoke-direct {v1, v2, v3, v4}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v3, "AI"

    invoke-static {v3, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/4 v3, 0x4

    aput-object v1, v0, v3

    new-instance v1, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v3, "BB"

    invoke-direct {v1, v2, v3, v4}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v3, "BB"

    invoke-static {v3, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/4 v3, 0x5

    aput-object v1, v0, v3

    new-instance v1, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v3, "BM"

    invoke-direct {v1, v2, v3, v4}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v3, "BM"

    invoke-static {v3, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/4 v3, 0x6

    aput-object v1, v0, v3

    new-instance v1, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v3, "BS"

    invoke-direct {v1, v2, v3, v4}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v3, "BS"

    invoke-static {v3, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/4 v3, 0x7

    aput-object v1, v0, v3

    new-instance v1, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v3, "DM"

    invoke-direct {v1, v2, v3, v4}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v3, "DM"

    invoke-static {v3, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v3, 0x8

    aput-object v1, v0, v3

    new-instance v1, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v3, "DO"

    invoke-direct {v1, v2, v3, v4}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v3, "DO"

    invoke-static {v3, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v3, 0x9

    aput-object v1, v0, v3

    new-instance v1, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v3, "GD"

    invoke-direct {v1, v2, v3, v4}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v3, "GD"

    invoke-static {v3, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v3, 0xa

    aput-object v1, v0, v3

    new-instance v1, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v3, "GU"

    invoke-direct {v1, v2, v3, v4}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v3, "GU"

    invoke-static {v3, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v3, 0xb

    aput-object v1, v0, v3

    new-instance v1, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v3, "JM"

    invoke-direct {v1, v2, v3, v4}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v3, "JM"

    invoke-static {v3, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v3, 0xc

    aput-object v1, v0, v3

    new-instance v1, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v3, "KN"

    invoke-direct {v1, v2, v3, v4}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v3, "KN"

    invoke-static {v3, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v3, 0xd

    aput-object v1, v0, v3

    new-instance v1, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v3, "KY"

    invoke-direct {v1, v2, v3, v4}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v3, "KY"

    invoke-static {v3, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v3, 0xe

    aput-object v1, v0, v3

    new-instance v1, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v3, "LC"

    invoke-direct {v1, v2, v3, v4}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v3, "LC"

    invoke-static {v3, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v3, 0xf

    aput-object v1, v0, v3

    new-instance v1, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v3, "MP"

    invoke-direct {v1, v2, v3, v4}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v3, "MP"

    invoke-static {v3, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v3, 0x10

    aput-object v1, v0, v3

    new-instance v1, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v3, "MS"

    invoke-direct {v1, v2, v3, v4}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v3, "MS"

    invoke-static {v3, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v3, 0x11

    aput-object v1, v0, v3

    new-instance v1, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v3, "PR"

    invoke-direct {v1, v2, v3, v4}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v3, "PR"

    invoke-static {v3, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v3, 0x12

    aput-object v1, v0, v3

    new-instance v1, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v3, "SX"

    invoke-direct {v1, v2, v3, v4}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v3, "SX"

    invoke-static {v3, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v3, 0x13

    aput-object v1, v0, v3

    new-instance v1, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v3, "TC"

    invoke-direct {v1, v2, v3, v4}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v3, "TC"

    invoke-static {v3, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v3, 0x14

    aput-object v1, v0, v3

    new-instance v1, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v3, "TT"

    invoke-direct {v1, v2, v3, v4}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v3, "TT"

    invoke-static {v3, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v3, 0x15

    aput-object v1, v0, v3

    new-instance v1, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v3, "VC"

    invoke-direct {v1, v2, v3, v4}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v3, "VC"

    invoke-static {v3, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v3, 0x16

    aput-object v1, v0, v3

    new-instance v1, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v3, "VG"

    invoke-direct {v1, v2, v3, v4}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v3, "VG"

    invoke-static {v3, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v3, 0x17

    aput-object v1, v0, v3

    new-instance v1, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v3, "VI"

    invoke-direct {v1, v2, v3, v4}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, "VI"

    invoke-static {v2, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v2, 0x18

    aput-object v1, v0, v2

    new-instance v1, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v2, "+20"

    const-string v3, "EG"

    const-string v4, "### ### ####"

    invoke-direct {v1, v2, v3, v4}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, "EG"

    invoke-static {v2, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v2, 0x19

    aput-object v1, v0, v2

    new-instance v1, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v2, "+211"

    const-string v3, "SS"

    const-string v5, "### ### ###"

    invoke-direct {v1, v2, v3, v5}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, "SS"

    invoke-static {v2, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v2, 0x1a

    aput-object v1, v0, v2

    new-instance v1, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v2, "MA"

    const-string v3, "###-######"

    const-string v6, "+212"

    invoke-direct {v1, v6, v2, v3}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, "MA"

    invoke-static {v2, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v2, 0x1b

    aput-object v1, v0, v2

    new-instance v1, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v2, "EH"

    const-string v3, "###-######"

    const-string v6, "+212"

    invoke-direct {v1, v6, v2, v3}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, "EH"

    invoke-static {v2, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v2, 0x1c

    aput-object v1, v0, v2

    new-instance v1, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v2, "+213"

    const-string v3, "DZ"

    const-string v6, "### ## ## ##"

    invoke-direct {v1, v2, v3, v6}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, "DZ"

    invoke-static {v2, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v2, 0x1d

    aput-object v1, v0, v2

    new-instance v1, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v2, "+216"

    const-string v3, "TN"

    const-string v7, "## ### ###"

    invoke-direct {v1, v2, v3, v7}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, "TN"

    invoke-static {v2, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v2, 0x1e

    aput-object v1, v0, v2

    new-instance v1, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v2, "LY"

    const-string v3, "##-#######"

    const-string v8, "+218"

    invoke-direct {v1, v8, v2, v3}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, "LY"

    invoke-static {v2, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v2, 0x1f

    aput-object v1, v0, v2

    new-instance v1, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v2, "+220"

    const-string v3, "GM"

    const-string v8, "### ####"

    invoke-direct {v1, v2, v3, v8}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, "GM"

    invoke-static {v2, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v2, 0x20

    aput-object v1, v0, v2

    new-instance v1, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v2, "+221"

    const-string v3, "SN"

    const-string v9, "## ### ## ##"

    invoke-direct {v1, v2, v3, v9}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, "SN"

    invoke-static {v2, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v2, 0x21

    aput-object v1, v0, v2

    new-instance v1, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v2, "+222"

    const-string v3, "MR"

    const-string v10, "## ## ## ##"

    invoke-direct {v1, v2, v3, v10}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, "MR"

    invoke-static {v2, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v2, 0x22

    aput-object v1, v0, v2

    new-instance v1, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v2, "+223"

    const-string v3, "ML"

    invoke-direct {v1, v2, v3, v10}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, "ML"

    invoke-static {v2, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v2, 0x23

    aput-object v1, v0, v2

    new-instance v1, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v2, "+224"

    const-string v3, "GN"

    invoke-direct {v1, v2, v3, v6}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, "GN"

    invoke-static {v2, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v2, 0x24

    aput-object v1, v0, v2

    new-instance v1, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v2, "+225"

    const-string v3, "CI"

    invoke-direct {v1, v2, v3, v10}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, "CI"

    invoke-static {v2, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v2, 0x25

    aput-object v1, v0, v2

    new-instance v1, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v2, "+226"

    const-string v3, "BF"

    invoke-direct {v1, v2, v3, v10}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, "BF"

    invoke-static {v2, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v2, 0x26

    aput-object v1, v0, v2

    new-instance v1, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v2, "+227"

    const-string v3, "NE"

    invoke-direct {v1, v2, v3, v10}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, "NE"

    invoke-static {v2, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v2, 0x27

    aput-object v1, v0, v2

    new-instance v1, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v2, "+228"

    const-string v3, "TG"

    invoke-direct {v1, v2, v3, v10}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, "TG"

    invoke-static {v2, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v2, 0x28

    aput-object v1, v0, v2

    new-instance v1, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v2, "+229"

    const-string v3, "BJ"

    invoke-direct {v1, v2, v3, v10}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, "BJ"

    invoke-static {v2, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v2, 0x29

    aput-object v1, v0, v2

    new-instance v1, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v2, "+230"

    const-string v3, "MU"

    const-string v11, "#### ####"

    invoke-direct {v1, v2, v3, v11}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, "MU"

    invoke-static {v2, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v2, 0x2a

    aput-object v1, v0, v2

    new-instance v1, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v2, "+231"

    const-string v3, "LR"

    invoke-direct {v1, v2, v3, v5}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, "LR"

    invoke-static {v2, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v2, 0x2b

    aput-object v1, v0, v2

    new-instance v1, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v2, "+232"

    const-string v3, "SL"

    const-string v12, "## ######"

    invoke-direct {v1, v2, v3, v12}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, "SL"

    invoke-static {v2, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v2, 0x2c

    aput-object v1, v0, v2

    new-instance v1, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v2, "+233"

    const-string v3, "GH"

    const-string v13, "## ### ####"

    invoke-direct {v1, v2, v3, v13}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, "GH"

    invoke-static {v2, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v2, 0x2d

    aput-object v1, v0, v2

    new-instance v1, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v2, "+234"

    const-string v3, "NG"

    invoke-direct {v1, v2, v3, v4}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, "NG"

    invoke-static {v2, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v2, 0x2e

    aput-object v1, v0, v2

    new-instance v1, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v2, "+235"

    const-string v3, "TD"

    invoke-direct {v1, v2, v3, v10}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, "TD"

    invoke-static {v2, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v2, 0x2f

    aput-object v1, v0, v2

    new-instance v1, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v2, "+236"

    const-string v3, "CF"

    invoke-direct {v1, v2, v3, v10}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, "CF"

    invoke-static {v2, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v2, 0x30

    aput-object v1, v0, v2

    new-instance v1, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v2, "+237"

    const-string v3, "CM"

    invoke-direct {v1, v2, v3, v10}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, "CM"

    invoke-static {v2, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v2, 0x31

    aput-object v1, v0, v2

    new-instance v1, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v2, "CV"

    const-string v3, "### ## ##"

    const-string v14, "+238"

    invoke-direct {v1, v14, v2, v3}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, "CV"

    invoke-static {v2, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v2, 0x32

    aput-object v1, v0, v2

    new-instance v1, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v2, "+239"

    const-string v3, "ST"

    invoke-direct {v1, v2, v3, v8}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, "ST"

    invoke-static {v2, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v2, 0x33

    aput-object v1, v0, v2

    new-instance v1, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v2, "+240"

    const-string v3, "GQ"

    invoke-direct {v1, v2, v3, v5}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, "GQ"

    invoke-static {v2, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v2, 0x34

    aput-object v1, v0, v2

    new-instance v1, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v2, "+241"

    const-string v3, "GA"

    invoke-direct {v1, v2, v3, v10}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, "GA"

    invoke-static {v2, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v2, 0x35

    aput-object v1, v0, v2

    new-instance v1, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v2, "+242"

    const-string v3, "CG"

    invoke-direct {v1, v2, v3, v13}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, "CG"

    invoke-static {v2, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v2, 0x36

    aput-object v1, v0, v2

    new-instance v1, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v2, "+243"

    const-string v3, "CD"

    invoke-direct {v1, v2, v3, v5}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, "CD"

    invoke-static {v2, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v2, 0x37

    aput-object v1, v0, v2

    new-instance v1, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v2, "+244"

    const-string v3, "AO"

    invoke-direct {v1, v2, v3, v5}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, "AO"

    invoke-static {v2, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v2, 0x38

    aput-object v1, v0, v2

    new-instance v1, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v2, "+245"

    const-string v3, "GW"

    invoke-direct {v1, v2, v3, v8}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, "GW"

    invoke-static {v2, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v2, 0x39

    aput-object v1, v0, v2

    new-instance v1, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v2, "+246"

    const-string v3, "IO"

    invoke-direct {v1, v2, v3, v8}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, "IO"

    invoke-static {v2, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v2, 0x3a

    aput-object v1, v0, v2

    new-instance v1, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v2, "+247"

    const-string v3, "AC"

    const-string v14, ""

    invoke-direct {v1, v2, v3, v14}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, "AC"

    invoke-static {v2, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v2, 0x3b

    aput-object v1, v0, v2

    new-instance v1, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v2, "SC"

    const-string v3, "# ### ###"

    const-string v15, "+248"

    invoke-direct {v1, v15, v2, v3}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, "SC"

    invoke-static {v2, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v2, 0x3c

    aput-object v1, v0, v2

    new-instance v1, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v2, "+250"

    const-string v3, "RW"

    invoke-direct {v1, v2, v3, v5}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, "RW"

    invoke-static {v2, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v2, 0x3d

    aput-object v1, v0, v2

    new-instance v1, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v2, "+251"

    const-string v3, "ET"

    invoke-direct {v1, v2, v3, v13}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, "ET"

    invoke-static {v2, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v2, 0x3e

    aput-object v1, v0, v2

    new-instance v1, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v2, "+252"

    const-string v3, "SO"

    const-string v15, "## #######"

    invoke-direct {v1, v2, v3, v15}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, "SO"

    invoke-static {v2, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v2, 0x3f

    aput-object v1, v0, v2

    new-instance v1, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v2, "+253"

    const-string v3, "DJ"

    invoke-direct {v1, v2, v3, v10}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, "DJ"

    invoke-static {v2, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v2, 0x40

    aput-object v1, v0, v2

    new-instance v1, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v2, "+254"

    const-string v3, "KE"

    invoke-direct {v1, v2, v3, v15}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, "KE"

    invoke-static {v2, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v2, 0x41

    aput-object v1, v0, v2

    new-instance v1, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v2, "+255"

    const-string v3, "TZ"

    invoke-direct {v1, v2, v3, v5}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, "TZ"

    invoke-static {v2, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v2, 0x42

    aput-object v1, v0, v2

    new-instance v1, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v2, "UG"

    const-string v3, "### ######"

    move-object/from16 v16, v9

    const-string v9, "+256"

    invoke-direct {v1, v9, v2, v3}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, "UG"

    invoke-static {v2, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v2, 0x43

    aput-object v1, v0, v2

    new-instance v1, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v2, "+257"

    const-string v3, "BI"

    invoke-direct {v1, v2, v3, v10}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, "BI"

    invoke-static {v2, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v2, 0x44

    aput-object v1, v0, v2

    new-instance v1, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v2, "+258"

    const-string v3, "MZ"

    invoke-direct {v1, v2, v3, v13}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, "MZ"

    invoke-static {v2, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v2, 0x45

    aput-object v1, v0, v2

    new-instance v1, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v2, "+260"

    const-string v3, "ZM"

    invoke-direct {v1, v2, v3, v15}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, "ZM"

    invoke-static {v2, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v2, 0x46

    aput-object v1, v0, v2

    new-instance v1, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v2, "MG"

    const-string v3, "## ## ### ##"

    const-string v9, "+261"

    invoke-direct {v1, v9, v2, v3}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, "MG"

    invoke-static {v2, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v2, 0x47

    aput-object v1, v0, v2

    new-instance v1, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v2, "RE"

    const-string v3, "+262"

    invoke-direct {v1, v3, v2, v14}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, "RE"

    invoke-static {v2, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v2, 0x48

    aput-object v1, v0, v2

    new-instance v1, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v2, "TF"

    invoke-direct {v1, v3, v2, v14}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, "TF"

    invoke-static {v2, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v2, 0x49

    aput-object v1, v0, v2

    new-instance v1, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v2, "YT"

    invoke-direct {v1, v3, v2, v6}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, "YT"

    invoke-static {v2, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v2, 0x4a

    aput-object v1, v0, v2

    new-instance v1, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v2, "+263"

    const-string v3, "ZW"

    invoke-direct {v1, v2, v3, v13}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, "ZW"

    invoke-static {v2, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v2, 0x4b

    aput-object v1, v0, v2

    new-instance v1, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v2, "+264"

    const-string v3, "NA"

    invoke-direct {v1, v2, v3, v13}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, "NA"

    invoke-static {v2, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v2, 0x4c

    aput-object v1, v0, v2

    new-instance v1, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v2, "+265"

    const-string v3, "MW"

    invoke-direct {v1, v2, v3, v6}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, "MW"

    invoke-static {v2, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v2, 0x4d

    aput-object v1, v0, v2

    new-instance v1, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v2, "+266"

    const-string v3, "LS"

    invoke-direct {v1, v2, v3, v11}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, "LS"

    invoke-static {v2, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v2, 0x4e

    aput-object v1, v0, v2

    new-instance v1, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v2, "+267"

    const-string v3, "BW"

    invoke-direct {v1, v2, v3, v7}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, "BW"

    invoke-static {v2, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v2, 0x4f

    aput-object v1, v0, v2

    new-instance v1, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v2, "+268"

    const-string v3, "SZ"

    invoke-direct {v1, v2, v3, v11}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, "SZ"

    invoke-static {v2, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v2, 0x50

    aput-object v1, v0, v2

    new-instance v1, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v2, "KM"

    const-string v3, "### ## ##"

    const-string v9, "+269"

    invoke-direct {v1, v9, v2, v3}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, "KM"

    invoke-static {v2, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v2, 0x51

    aput-object v1, v0, v2

    new-instance v1, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v2, "+27"

    const-string v3, "ZA"

    invoke-direct {v1, v2, v3, v13}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, "ZA"

    invoke-static {v2, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v2, 0x52

    aput-object v1, v0, v2

    new-instance v1, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v2, "+290"

    const-string v3, "SH"

    invoke-direct {v1, v2, v3, v14}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, "SH"

    invoke-static {v2, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v2, 0x53

    aput-object v1, v0, v2

    new-instance v1, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v2, "+290"

    const-string v3, "TA"

    invoke-direct {v1, v2, v3, v14}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, "TA"

    invoke-static {v2, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v2, 0x54

    aput-object v1, v0, v2

    new-instance v1, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v2, "ER"

    const-string v3, "# ### ###"

    const-string v9, "+291"

    invoke-direct {v1, v9, v2, v3}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, "ER"

    invoke-static {v2, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v2, 0x55

    aput-object v1, v0, v2

    new-instance v1, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v2, "+297"

    const-string v3, "AW"

    invoke-direct {v1, v2, v3, v8}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, "AW"

    invoke-static {v2, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v2, 0x56

    aput-object v1, v0, v2

    new-instance v1, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v2, "FO"

    const-string v3, "######"

    const-string v9, "+298"

    invoke-direct {v1, v9, v2, v3}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, "FO"

    invoke-static {v2, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v2, 0x57

    aput-object v1, v0, v2

    new-instance v1, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v2, "+299"

    const-string v3, "GL"

    const-string v9, "## ## ##"

    invoke-direct {v1, v2, v3, v9}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, "GL"

    invoke-static {v2, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v2, 0x58

    aput-object v1, v0, v2

    new-instance v1, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v2, "+30"

    const-string v3, "GR"

    invoke-direct {v1, v2, v3, v4}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, "GR"

    invoke-static {v2, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v2, 0x59

    aput-object v1, v0, v2

    new-instance v1, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v2, "NL"

    const-string v3, "# ########"

    move-object/from16 v17, v4

    const-string v4, "+31"

    invoke-direct {v1, v4, v2, v3}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, "NL"

    invoke-static {v2, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v2, 0x5a

    aput-object v1, v0, v2

    new-instance v1, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v2, "+32"

    const-string v3, "BE"

    invoke-direct {v1, v2, v3, v6}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, "BE"

    invoke-static {v2, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v2, 0x5b

    aput-object v1, v0, v2

    new-instance v1, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v2, "FR"

    const-string v3, "# ## ## ## ##"

    const-string v4, "+33"

    invoke-direct {v1, v4, v2, v3}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, "FR"

    invoke-static {v2, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v2, 0x5c

    aput-object v1, v0, v2

    new-instance v1, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v2, "+34"

    const-string v3, "ES"

    invoke-direct {v1, v2, v3, v6}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, "ES"

    invoke-static {v2, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v2, 0x5d

    aput-object v1, v0, v2

    new-instance v1, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v2, "+350"

    const-string v3, "GI"

    const-string v4, "### #####"

    invoke-direct {v1, v2, v3, v4}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, "GI"

    invoke-static {v2, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v2, 0x5e

    aput-object v1, v0, v2

    new-instance v1, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v2, "+351"

    const-string v3, "PT"

    invoke-direct {v1, v2, v3, v5}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, "PT"

    invoke-static {v2, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v2, 0x5f

    aput-object v1, v0, v2

    new-instance v1, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v2, "LU"

    const-string v3, "## ## ## ###"

    move-object/from16 v18, v6

    const-string v6, "+352"

    invoke-direct {v1, v6, v2, v3}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, "LU"

    invoke-static {v2, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v2, 0x60

    aput-object v1, v0, v2

    new-instance v1, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v2, "+353"

    const-string v3, "IE"

    invoke-direct {v1, v2, v3, v13}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, "IE"

    invoke-static {v2, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v2, 0x61

    aput-object v1, v0, v2

    new-instance v1, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v2, "+354"

    const-string v3, "IS"

    invoke-direct {v1, v2, v3, v8}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, "IS"

    invoke-static {v2, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v2, 0x62

    aput-object v1, v0, v2

    new-instance v1, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v2, "+355"

    const-string v3, "AL"

    invoke-direct {v1, v2, v3, v13}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, "AL"

    invoke-static {v2, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v2, 0x63

    aput-object v1, v0, v2

    new-instance v1, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v2, "+356"

    const-string v3, "MT"

    invoke-direct {v1, v2, v3, v11}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, "MT"

    invoke-static {v2, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v2, 0x64

    aput-object v1, v0, v2

    new-instance v1, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v2, "+357"

    const-string v3, "CY"

    invoke-direct {v1, v2, v3, v12}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {v3, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v2, 0x65

    aput-object v1, v0, v2

    new-instance v1, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v2, "+358"

    const-string v6, "FI"

    move-object/from16 v19, v8

    move-object/from16 v8, v16

    invoke-direct {v1, v2, v6, v8}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, "FI"

    invoke-static {v2, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v2, 0x66

    aput-object v1, v0, v2

    new-instance v1, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v2, "+358"

    const-string v6, "AX"

    invoke-direct {v1, v2, v6, v14}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, "AX"

    invoke-static {v2, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v2, 0x67

    aput-object v1, v0, v2

    new-instance v1, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v2, "BG"

    const-string v6, "### ### ##"

    move-object/from16 v16, v3

    const-string v3, "+359"

    invoke-direct {v1, v3, v2, v6}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, "BG"

    invoke-static {v2, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v2, 0x68

    aput-object v1, v0, v2

    new-instance v1, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v2, "+36"

    const-string v3, "HU"

    invoke-direct {v1, v2, v3, v13}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, "HU"

    invoke-static {v2, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v2, 0x69

    aput-object v1, v0, v2

    new-instance v1, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v2, "+370"

    const-string v3, "LT"

    invoke-direct {v1, v2, v3, v4}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, "LT"

    invoke-static {v2, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v2, 0x6a

    aput-object v1, v0, v2

    new-instance v1, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v2, "+371"

    const-string v3, "LV"

    invoke-direct {v1, v2, v3, v7}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, "LV"

    invoke-static {v2, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v2, 0x6b

    aput-object v1, v0, v2

    new-instance v1, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v2, "+372"

    const-string v3, "EE"

    invoke-direct {v1, v2, v3, v11}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, "EE"

    invoke-static {v2, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v2, 0x6c

    aput-object v1, v0, v2

    new-instance v1, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v2, "MD"

    const-string v3, "### ## ###"

    const-string v6, "+373"

    invoke-direct {v1, v6, v2, v3}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, "MD"

    invoke-static {v2, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v2, 0x6d

    aput-object v1, v0, v2

    new-instance v1, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v2, "+374"

    const-string v3, "AM"

    invoke-direct {v1, v2, v3, v12}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, "AM"

    invoke-static {v2, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v2, 0x6e

    aput-object v1, v0, v2

    new-instance v1, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v2, "BY"

    const-string v3, "## ###-##-##"

    const-string v6, "+375"

    invoke-direct {v1, v6, v2, v3}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, "BY"

    invoke-static {v2, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v2, 0x6f

    aput-object v1, v0, v2

    new-instance v1, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v2, "AD"

    const-string v3, "### ###"

    const-string v6, "+376"

    invoke-direct {v1, v6, v2, v3}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, "AD"

    invoke-static {v2, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v2, 0x70

    aput-object v1, v0, v2

    new-instance v1, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v2, "MC"

    const-string v3, "# ## ## ## ##"

    const-string v6, "+377"

    invoke-direct {v1, v6, v2, v3}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, "MC"

    invoke-static {v2, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v2, 0x71

    aput-object v1, v0, v2

    new-instance v1, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v2, "+378"

    const-string v3, "SM"

    invoke-direct {v1, v2, v3, v10}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, "SM"

    invoke-static {v2, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v2, 0x72

    aput-object v1, v0, v2

    new-instance v1, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v2, "+379"

    const-string v3, "VA"

    invoke-direct {v1, v2, v3, v14}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, "VA"

    invoke-static {v2, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v2, 0x73

    aput-object v1, v0, v2

    new-instance v1, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v2, "+380"

    const-string v3, "UA"

    invoke-direct {v1, v2, v3, v13}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, "UA"

    invoke-static {v2, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v2, 0x74

    aput-object v1, v0, v2

    new-instance v1, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v2, "+381"

    const-string v3, "RS"

    invoke-direct {v1, v2, v3, v15}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, "RS"

    invoke-static {v2, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v2, 0x75

    aput-object v1, v0, v2

    new-instance v1, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v2, "+382"

    const-string v3, "ME"

    invoke-direct {v1, v2, v3, v7}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, "ME"

    invoke-static {v2, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v2, 0x76

    aput-object v1, v0, v2

    new-instance v1, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v2, "+383"

    const-string v3, "XK"

    invoke-direct {v1, v2, v3, v7}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, "XK"

    invoke-static {v2, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v2, 0x77

    aput-object v1, v0, v2

    new-instance v1, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v2, "+385"

    const-string v3, "HR"

    invoke-direct {v1, v2, v3, v13}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, "HR"

    invoke-static {v2, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v2, 0x78

    aput-object v1, v0, v2

    new-instance v1, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v2, "+386"

    const-string v3, "SI"

    invoke-direct {v1, v2, v3, v7}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, "SI"

    invoke-static {v2, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v2, 0x79

    aput-object v1, v0, v2

    new-instance v1, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v2, "BA"

    const-string v3, "## ###-###"

    const-string v6, "+387"

    invoke-direct {v1, v6, v2, v3}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, "BA"

    invoke-static {v2, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v2, 0x7a

    aput-object v1, v0, v2

    new-instance v1, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v2, "+389"

    const-string v3, "MK"

    invoke-direct {v1, v2, v3, v7}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, "MK"

    invoke-static {v2, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v2, 0x7b

    aput-object v1, v0, v2

    new-instance v1, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v2, "IT"

    const-string v3, "## #### ####"

    const-string v6, "+39"

    invoke-direct {v1, v6, v2, v3}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, "IT"

    invoke-static {v2, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v2, 0x7c

    aput-object v1, v0, v2

    new-instance v1, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v2, "+40"

    const-string v3, "RO"

    invoke-direct {v1, v2, v3, v13}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, "RO"

    invoke-static {v2, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v2, 0x7d

    aput-object v1, v0, v2

    new-instance v1, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v2, "+41"

    const-string v3, "CH"

    invoke-direct {v1, v2, v3, v8}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, "CH"

    invoke-static {v2, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v2, 0x7e

    aput-object v1, v0, v2

    new-instance v1, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v2, "+420"

    const-string v3, "CZ"

    invoke-direct {v1, v2, v3, v5}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, "CZ"

    invoke-static {v2, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v2, 0x7f

    aput-object v1, v0, v2

    new-instance v1, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v2, "+421"

    const-string v3, "SK"

    invoke-direct {v1, v2, v3, v5}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, "SK"

    invoke-static {v2, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v2, 0x80

    aput-object v1, v0, v2

    new-instance v1, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v2, "+423"

    const-string v3, "LI"

    invoke-direct {v1, v2, v3, v5}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, "LI"

    invoke-static {v2, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v2, 0x81

    aput-object v1, v0, v2

    new-instance v1, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v2, "AT"

    const-string v3, "### ######"

    const-string v6, "+43"

    invoke-direct {v1, v6, v2, v3}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, "AT"

    invoke-static {v2, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v2, 0x82

    aput-object v1, v0, v2

    new-instance v1, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v2, "+44"

    const-string v3, "GB"

    const-string v6, "#### ######"

    invoke-direct {v1, v2, v3, v6}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v3, "GB"

    invoke-static {v3, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v3, 0x83

    aput-object v1, v0, v3

    new-instance v1, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v3, "GG"

    invoke-direct {v1, v2, v3, v6}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v3, "GG"

    invoke-static {v3, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v3, 0x84

    aput-object v1, v0, v3

    new-instance v1, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v3, "JE"

    invoke-direct {v1, v2, v3, v6}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v3, "JE"

    invoke-static {v3, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v3, 0x85

    aput-object v1, v0, v3

    new-instance v1, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v3, "IM"

    invoke-direct {v1, v2, v3, v6}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, "IM"

    invoke-static {v2, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v2, 0x86

    aput-object v1, v0, v2

    new-instance v1, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v2, "+45"

    const-string v3, "DK"

    invoke-direct {v1, v2, v3, v10}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, "DK"

    invoke-static {v2, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v2, 0x87

    aput-object v1, v0, v2

    new-instance v1, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v2, "SE"

    const-string v3, "##-### ## ##"

    const-string v12, "+46"

    invoke-direct {v1, v12, v2, v3}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, "SE"

    invoke-static {v2, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v2, 0x88

    aput-object v1, v0, v2

    new-instance v1, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v2, "NO"

    const-string v3, "### ## ###"

    const-string v12, "+47"

    invoke-direct {v1, v12, v2, v3}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, "NO"

    invoke-static {v2, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v2, 0x89

    aput-object v1, v0, v2

    new-instance v1, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v2, "BV"

    invoke-direct {v1, v12, v2, v14}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, "BV"

    invoke-static {v2, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v2, 0x8a

    aput-object v1, v0, v2

    new-instance v1, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v2, "SJ"

    invoke-direct {v1, v12, v2, v10}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, "SJ"

    invoke-static {v2, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v2, 0x8b

    aput-object v1, v0, v2

    new-instance v1, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v2, "+48"

    const-string v3, "PL"

    invoke-direct {v1, v2, v3, v8}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, "PL"

    invoke-static {v2, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v2, 0x8c

    aput-object v1, v0, v2

    new-instance v1, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v2, "+49"

    const-string v3, "DE"

    const-string v12, "### #######"

    invoke-direct {v1, v2, v3, v12}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, "DE"

    invoke-static {v2, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v2, 0x8d

    aput-object v1, v0, v2

    new-instance v1, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v2, "+500"

    const-string v3, "FK"

    invoke-direct {v1, v2, v3, v14}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, "FK"

    invoke-static {v2, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v2, 0x8e

    aput-object v1, v0, v2

    new-instance v1, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v2, "+500"

    const-string v3, "GS"

    invoke-direct {v1, v2, v3, v14}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, "GS"

    invoke-static {v2, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v2, 0x8f

    aput-object v1, v0, v2

    new-instance v1, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v2, "BZ"

    const-string v3, "###-####"

    move-object/from16 v20, v10

    const-string v10, "+501"

    invoke-direct {v1, v10, v2, v3}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, "BZ"

    invoke-static {v2, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v2, 0x90

    aput-object v1, v0, v2

    new-instance v1, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v2, "+502"

    const-string v3, "GT"

    invoke-direct {v1, v2, v3, v11}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, "GT"

    invoke-static {v2, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v2, 0x91

    aput-object v1, v0, v2

    new-instance v1, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v2, "+503"

    const-string v3, "SV"

    invoke-direct {v1, v2, v3, v11}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, "SV"

    invoke-static {v2, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v2, 0x92

    aput-object v1, v0, v2

    new-instance v1, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v2, "HN"

    const-string v3, "####-####"

    const-string v10, "+504"

    invoke-direct {v1, v10, v2, v3}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, "HN"

    invoke-static {v2, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v2, 0x93

    aput-object v1, v0, v2

    new-instance v1, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v2, "+505"

    const-string v3, "NI"

    invoke-direct {v1, v2, v3, v11}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, "NI"

    invoke-static {v2, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v2, 0x94

    aput-object v1, v0, v2

    new-instance v1, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v2, "+506"

    const-string v3, "CR"

    invoke-direct {v1, v2, v3, v11}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, "CR"

    invoke-static {v2, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v2, 0x95

    aput-object v1, v0, v2

    new-instance v1, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v2, "PA"

    const-string v3, "####-####"

    const-string v10, "+507"

    invoke-direct {v1, v10, v2, v3}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, "PA"

    invoke-static {v2, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v2, 0x96

    aput-object v1, v0, v2

    new-instance v1, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v2, "+508"

    const-string v3, "PM"

    invoke-direct {v1, v2, v3, v9}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, "PM"

    invoke-static {v2, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v2, 0x97

    aput-object v1, v0, v2

    new-instance v1, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v2, "HT"

    const-string v3, "## ## ####"

    const-string v10, "+509"

    invoke-direct {v1, v10, v2, v3}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, "HT"

    invoke-static {v2, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v2, 0x98

    aput-object v1, v0, v2

    new-instance v1, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v2, "+51"

    const-string v3, "PE"

    invoke-direct {v1, v2, v3, v5}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, "PE"

    invoke-static {v2, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v2, 0x99

    aput-object v1, v0, v2

    new-instance v1, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v2, "MX"

    const-string v3, "### ### ### ####"

    const-string v10, "+52"

    invoke-direct {v1, v10, v2, v3}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, "MX"

    invoke-static {v2, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v2, 0x9a

    aput-object v1, v0, v2

    new-instance v1, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v2, "+537"

    move-object/from16 v3, v16

    invoke-direct {v1, v2, v3, v14}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {v3, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v2, 0x9b

    aput-object v1, v0, v2

    new-instance v1, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v2, "AR"

    const-string v3, "## ##-####-####"

    const-string v10, "+54"

    invoke-direct {v1, v10, v2, v3}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, "AR"

    invoke-static {v2, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v2, 0x9c

    aput-object v1, v0, v2

    new-instance v1, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v2, "BR"

    const-string v3, "## #####-####"

    const-string v10, "+55"

    invoke-direct {v1, v10, v2, v3}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, "BR"

    invoke-static {v2, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v2, 0x9d

    aput-object v1, v0, v2

    new-instance v1, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v2, "CL"

    const-string v3, "# #### ####"

    const-string v10, "+56"

    invoke-direct {v1, v10, v2, v3}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, "CL"

    invoke-static {v2, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v2, 0x9e

    aput-object v1, v0, v2

    new-instance v1, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v2, "+57"

    const-string v3, "CO"

    invoke-direct {v1, v2, v3, v12}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, "CO"

    invoke-static {v2, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v2, 0x9f

    aput-object v1, v0, v2

    new-instance v1, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v2, "VE"

    const-string v3, "###-#######"

    const-string v10, "+58"

    invoke-direct {v1, v10, v2, v3}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, "VE"

    invoke-static {v2, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v2, 0xa0

    aput-object v1, v0, v2

    new-instance v1, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v2, "+590"

    const-string v3, "BL"

    move-object/from16 v10, v18

    invoke-direct {v1, v2, v3, v10}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, "BL"

    invoke-static {v2, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v2, 0xa1

    aput-object v1, v0, v2

    new-instance v1, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v2, "+590"

    const-string v3, "MF"

    invoke-direct {v1, v2, v3, v14}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, "MF"

    invoke-static {v2, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v2, 0xa2

    aput-object v1, v0, v2

    new-instance v1, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v2, "+590"

    const-string v3, "GP"

    invoke-direct {v1, v2, v3, v10}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, "GP"

    invoke-static {v2, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v2, 0xa3

    aput-object v1, v0, v2

    new-instance v1, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v2, "BO"

    const-string v3, "########"

    move-object/from16 v16, v4

    const-string v4, "+591"

    invoke-direct {v1, v4, v2, v3}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, "BO"

    invoke-static {v2, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v2, 0xa4

    aput-object v1, v0, v2

    new-instance v1, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v2, "+592"

    const-string v3, "GY"

    move-object/from16 v4, v19

    invoke-direct {v1, v2, v3, v4}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, "GY"

    invoke-static {v2, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v2, 0xa5

    aput-object v1, v0, v2

    new-instance v1, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v2, "+593"

    const-string v3, "EC"

    invoke-direct {v1, v2, v3, v13}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, "EC"

    invoke-static {v2, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v2, 0xa6

    aput-object v1, v0, v2

    new-instance v1, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v2, "+594"

    const-string v3, "GF"

    invoke-direct {v1, v2, v3, v10}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, "GF"

    invoke-static {v2, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v2, 0xa7

    aput-object v1, v0, v2

    new-instance v1, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v2, "+595"

    const-string v3, "PY"

    invoke-direct {v1, v2, v3, v15}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, "PY"

    invoke-static {v2, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v2, 0xa8

    aput-object v1, v0, v2

    new-instance v1, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v2, "+596"

    const-string v3, "MQ"

    invoke-direct {v1, v2, v3, v10}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, "MQ"

    invoke-static {v2, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v2, 0xa9

    aput-object v1, v0, v2

    new-instance v1, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v2, "SR"

    const-string v3, "###-####"

    const-string v15, "+597"

    invoke-direct {v1, v15, v2, v3}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, "SR"

    invoke-static {v2, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v2, 0xaa

    aput-object v1, v0, v2

    new-instance v1, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v2, "+598"

    const-string v3, "UY"

    invoke-direct {v1, v2, v3, v11}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, "UY"

    invoke-static {v2, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v2, 0xab

    aput-object v1, v0, v2

    new-instance v1, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v2, "CW"

    const-string v3, "# ### ####"

    const-string v15, "+599"

    invoke-direct {v1, v15, v2, v3}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, "CW"

    invoke-static {v2, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v2, 0xac

    aput-object v1, v0, v2

    new-instance v1, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v2, "+599"

    const-string v3, "BQ"

    invoke-direct {v1, v2, v3, v4}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, "BQ"

    invoke-static {v2, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v2, 0xad

    aput-object v1, v0, v2

    new-instance v1, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v2, "MY"

    const-string v3, "##-### ####"

    const-string v15, "+60"

    invoke-direct {v1, v15, v2, v3}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, "MY"

    invoke-static {v2, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v2, 0xae

    aput-object v1, v0, v2

    new-instance v1, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v2, "+61"

    const-string v3, "AU"

    invoke-direct {v1, v2, v3, v5}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, "AU"

    invoke-static {v2, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v2, 0xaf

    aput-object v1, v0, v2

    new-instance v1, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v2, "ID"

    const-string v3, "###-###-###"

    const-string v15, "+62"

    invoke-direct {v1, v15, v2, v3}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, "ID"

    invoke-static {v2, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v2, 0xb0

    aput-object v1, v0, v2

    new-instance v1, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v2, "+63"

    const-string v3, "PH"

    invoke-direct {v1, v2, v3, v6}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, "PH"

    invoke-static {v2, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v2, 0xb1

    aput-object v1, v0, v2

    new-instance v1, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v2, "+64"

    const-string v3, "NZ"

    invoke-direct {v1, v2, v3, v13}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, "NZ"

    invoke-static {v2, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v2, 0xb2

    aput-object v1, v0, v2

    new-instance v1, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v2, "+65"

    const-string v3, "SG"

    invoke-direct {v1, v2, v3, v11}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, "SG"

    invoke-static {v2, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v2, 0xb3

    aput-object v1, v0, v2

    new-instance v1, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v2, "+66"

    const-string v3, "TH"

    invoke-direct {v1, v2, v3, v13}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, "TH"

    invoke-static {v2, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v2, 0xb4

    aput-object v1, v0, v2

    new-instance v1, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v2, "+670"

    const-string v3, "TL"

    invoke-direct {v1, v2, v3, v11}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, "TL"

    invoke-static {v2, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v2, 0xb5

    aput-object v1, v0, v2

    new-instance v1, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v2, "AQ"

    const-string v3, "## ####"

    const-string v6, "+672"

    invoke-direct {v1, v6, v2, v3}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, "AQ"

    invoke-static {v2, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v2, 0xb6

    aput-object v1, v0, v2

    new-instance v1, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v2, "+673"

    const-string v3, "BN"

    invoke-direct {v1, v2, v3, v4}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, "BN"

    invoke-static {v2, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v2, 0xb7

    aput-object v1, v0, v2

    new-instance v1, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v2, "+674"

    const-string v3, "NR"

    invoke-direct {v1, v2, v3, v4}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, "NR"

    invoke-static {v2, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v2, 0xb8

    aput-object v1, v0, v2

    new-instance v1, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v2, "+675"

    const-string v3, "PG"

    invoke-direct {v1, v2, v3, v4}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, "PG"

    invoke-static {v2, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v2, 0xb9

    aput-object v1, v0, v2

    new-instance v1, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v2, "+676"

    const-string v3, "TO"

    invoke-direct {v1, v2, v3, v4}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, "TO"

    invoke-static {v2, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v2, 0xba

    aput-object v1, v0, v2

    new-instance v1, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v2, "+677"

    const-string v3, "SB"

    invoke-direct {v1, v2, v3, v4}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, "SB"

    invoke-static {v2, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v2, 0xbb

    aput-object v1, v0, v2

    new-instance v1, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v2, "+678"

    const-string v3, "VU"

    invoke-direct {v1, v2, v3, v4}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, "VU"

    invoke-static {v2, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v2, 0xbc

    aput-object v1, v0, v2

    new-instance v1, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v2, "+679"

    const-string v3, "FJ"

    invoke-direct {v1, v2, v3, v4}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, "FJ"

    invoke-static {v2, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v2, 0xbd

    aput-object v1, v0, v2

    new-instance v1, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v2, "+681"

    const-string v3, "WF"

    invoke-direct {v1, v2, v3, v9}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, "WF"

    invoke-static {v2, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v2, 0xbe

    aput-object v1, v0, v2

    new-instance v1, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v2, "CK"

    const-string v3, "## ###"

    const-string v4, "+682"

    invoke-direct {v1, v4, v2, v3}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, "CK"

    invoke-static {v2, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v2, 0xbf

    aput-object v1, v0, v2

    new-instance v1, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v2, "+683"

    const-string v3, "NU"

    invoke-direct {v1, v2, v3, v14}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, "NU"

    invoke-static {v2, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v2, 0xc0

    aput-object v1, v0, v2

    new-instance v1, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v2, "+685"

    const-string v3, "WS"

    invoke-direct {v1, v2, v3, v14}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, "WS"

    invoke-static {v2, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v2, 0xc1

    aput-object v1, v0, v2

    new-instance v1, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v2, "+686"

    const-string v3, "KI"

    invoke-direct {v1, v2, v3, v14}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, "KI"

    invoke-static {v2, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v2, 0xc2

    aput-object v1, v0, v2

    new-instance v1, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v2, "NC"

    const-string v3, "########"

    const-string v4, "+687"

    invoke-direct {v1, v4, v2, v3}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, "NC"

    invoke-static {v2, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v2, 0xc3

    aput-object v1, v0, v2

    new-instance v1, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v2, "+688"

    const-string v3, "TV"

    invoke-direct {v1, v2, v3, v14}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, "TV"

    invoke-static {v2, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v2, 0xc4

    aput-object v1, v0, v2

    new-instance v1, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v2, "+689"

    const-string v3, "PF"

    invoke-direct {v1, v2, v3, v9}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, "PF"

    invoke-static {v2, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v2, 0xc5

    aput-object v1, v0, v2

    new-instance v1, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v2, "+690"

    const-string v3, "TK"

    invoke-direct {v1, v2, v3, v14}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, "TK"

    invoke-static {v2, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v2, 0xc6

    aput-object v1, v0, v2

    new-instance v1, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v2, "RU"

    const-string v3, "### ###-##-##"

    const-string v4, "+7"

    invoke-direct {v1, v4, v2, v3}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, "RU"

    invoke-static {v2, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v2, 0xc7

    aput-object v1, v0, v2

    new-instance v1, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v2, "+7"

    const-string v3, "KZ"

    invoke-direct {v1, v2, v3, v14}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, "KZ"

    invoke-static {v2, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v2, 0xc8

    aput-object v1, v0, v2

    new-instance v1, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v2, "JP"

    const-string v3, "##-####-####"

    const-string v4, "+81"

    invoke-direct {v1, v4, v2, v3}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, "JP"

    invoke-static {v2, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v2, 0xc9

    aput-object v1, v0, v2

    new-instance v1, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v2, "KR"

    const-string v3, "##-####-####"

    const-string v4, "+82"

    invoke-direct {v1, v4, v2, v3}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, "KR"

    invoke-static {v2, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v2, 0xca

    aput-object v1, v0, v2

    new-instance v1, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v2, "+84"

    const-string v3, "VN"

    invoke-direct {v1, v2, v3, v8}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, "VN"

    invoke-static {v2, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v2, 0xcb

    aput-object v1, v0, v2

    new-instance v1, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v2, "+852"

    const-string v3, "HK"

    invoke-direct {v1, v2, v3, v11}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, "HK"

    invoke-static {v2, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v2, 0xcc

    aput-object v1, v0, v2

    new-instance v1, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v2, "+853"

    const-string v3, "MO"

    invoke-direct {v1, v2, v3, v11}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, "MO"

    invoke-static {v2, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v2, 0xcd

    aput-object v1, v0, v2

    new-instance v1, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v2, "+855"

    const-string v3, "KH"

    invoke-direct {v1, v2, v3, v7}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, "KH"

    invoke-static {v2, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v2, 0xce

    aput-object v1, v0, v2

    new-instance v1, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v2, "LA"

    const-string v3, "## ## ### ###"

    const-string v4, "+856"

    invoke-direct {v1, v4, v2, v3}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, "LA"

    invoke-static {v2, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v2, 0xcf

    aput-object v1, v0, v2

    new-instance v1, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v2, "CN"

    const-string v3, "### #### ####"

    const-string v4, "+86"

    invoke-direct {v1, v4, v2, v3}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, "CN"

    invoke-static {v2, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v2, 0xd0

    aput-object v1, v0, v2

    new-instance v1, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v2, "+872"

    const-string v3, "PN"

    invoke-direct {v1, v2, v3, v14}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, "PN"

    invoke-static {v2, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v2, 0xd1

    aput-object v1, v0, v2

    new-instance v1, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v2, "BD"

    const-string v3, "####-######"

    const-string v4, "+880"

    invoke-direct {v1, v4, v2, v3}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, "BD"

    invoke-static {v2, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v2, 0xd2

    aput-object v1, v0, v2

    new-instance v1, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v2, "+886"

    const-string v3, "TW"

    invoke-direct {v1, v2, v3, v5}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, "TW"

    invoke-static {v2, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v2, 0xd3

    aput-object v1, v0, v2

    new-instance v1, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v2, "+90"

    const-string v3, "TR"

    move-object/from16 v4, v17

    invoke-direct {v1, v2, v3, v4}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, "TR"

    invoke-static {v2, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v2, 0xd4

    aput-object v1, v0, v2

    new-instance v1, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v2, "IN"

    const-string v3, "## ## ######"

    const-string v6, "+91"

    invoke-direct {v1, v6, v2, v3}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, "IN"

    invoke-static {v2, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v2, 0xd5

    aput-object v1, v0, v2

    new-instance v1, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v2, "+92"

    const-string v3, "PK"

    invoke-direct {v1, v2, v3, v12}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, "PK"

    invoke-static {v2, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v2, 0xd6

    aput-object v1, v0, v2

    new-instance v1, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v2, "+93"

    const-string v3, "AF"

    invoke-direct {v1, v2, v3, v13}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, "AF"

    invoke-static {v2, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v2, 0xd7

    aput-object v1, v0, v2

    new-instance v1, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v2, "LK"

    const-string v3, "## # ######"

    const-string v6, "+94"

    invoke-direct {v1, v6, v2, v3}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, "LK"

    invoke-static {v2, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v2, 0xd8

    aput-object v1, v0, v2

    new-instance v1, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v2, "MM"

    const-string v3, "# ### ####"

    const-string v6, "+95"

    invoke-direct {v1, v6, v2, v3}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, "MM"

    invoke-static {v2, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v2, 0xd9

    aput-object v1, v0, v2

    new-instance v1, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v2, "MV"

    const-string v3, "###-####"

    const-string v6, "+960"

    invoke-direct {v1, v6, v2, v3}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, "MV"

    invoke-static {v2, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v2, 0xda

    aput-object v1, v0, v2

    new-instance v1, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v2, "+961"

    const-string v3, "LB"

    invoke-direct {v1, v2, v3, v7}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, "LB"

    invoke-static {v2, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v2, 0xdb

    aput-object v1, v0, v2

    new-instance v1, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v2, "JO"

    const-string v3, "# #### ####"

    const-string v6, "+962"

    invoke-direct {v1, v6, v2, v3}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, "JO"

    invoke-static {v2, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v2, 0xdc

    aput-object v1, v0, v2

    new-instance v1, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v2, "+964"

    const-string v3, "IQ"

    invoke-direct {v1, v2, v3, v4}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, "IQ"

    invoke-static {v2, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v2, 0xdd

    aput-object v1, v0, v2

    new-instance v1, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v2, "+965"

    const-string v3, "KW"

    move-object/from16 v4, v16

    invoke-direct {v1, v2, v3, v4}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, "KW"

    invoke-static {v2, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v2, 0xde

    aput-object v1, v0, v2

    new-instance v1, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v2, "+966"

    const-string v3, "SA"

    invoke-direct {v1, v2, v3, v13}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, "SA"

    invoke-static {v2, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v2, 0xdf

    aput-object v1, v0, v2

    new-instance v1, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v2, "+967"

    const-string v3, "YE"

    invoke-direct {v1, v2, v3, v5}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, "YE"

    invoke-static {v2, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v2, 0xe0

    aput-object v1, v0, v2

    new-instance v1, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v2, "+968"

    const-string v3, "OM"

    invoke-direct {v1, v2, v3, v11}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, "OM"

    invoke-static {v2, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v2, 0xe1

    aput-object v1, v0, v2

    new-instance v1, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v2, "+970"

    const-string v3, "PS"

    invoke-direct {v1, v2, v3, v5}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, "PS"

    invoke-static {v2, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v2, 0xe2

    aput-object v1, v0, v2

    new-instance v1, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v2, "+971"

    const-string v3, "AE"

    invoke-direct {v1, v2, v3, v13}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, "AE"

    invoke-static {v2, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v2, 0xe3

    aput-object v1, v0, v2

    new-instance v1, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v2, "IL"

    const-string v3, "##-###-####"

    const-string v4, "+972"

    invoke-direct {v1, v4, v2, v3}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, "IL"

    invoke-static {v2, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v2, 0xe4

    aput-object v1, v0, v2

    new-instance v1, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v2, "+973"

    const-string v3, "BH"

    invoke-direct {v1, v2, v3, v11}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, "BH"

    invoke-static {v2, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v2, 0xe5

    aput-object v1, v0, v2

    new-instance v1, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v2, "+974"

    const-string v3, "QA"

    invoke-direct {v1, v2, v3, v11}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, "QA"

    invoke-static {v2, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v2, 0xe6

    aput-object v1, v0, v2

    new-instance v1, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v2, "+975"

    const-string v3, "BT"

    move-object/from16 v4, v20

    invoke-direct {v1, v2, v3, v4}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, "BT"

    invoke-static {v2, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v2, 0xe7

    aput-object v1, v0, v2

    new-instance v1, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v2, "+976"

    const-string v3, "MN"

    invoke-direct {v1, v2, v3, v11}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, "MN"

    invoke-static {v2, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v2, 0xe8

    aput-object v1, v0, v2

    new-instance v1, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v2, "NP"

    const-string v3, "###-#######"

    const-string v4, "+977"

    invoke-direct {v1, v4, v2, v3}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, "NP"

    invoke-static {v2, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v2, 0xe9

    aput-object v1, v0, v2

    new-instance v1, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v2, "TJ"

    const-string v3, "### ## ####"

    const-string v4, "+992"

    invoke-direct {v1, v4, v2, v3}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, "TJ"

    invoke-static {v2, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v2, 0xea

    aput-object v1, v0, v2

    new-instance v1, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v2, "TM"

    const-string v3, "## ##-##-##"

    const-string v4, "+993"

    invoke-direct {v1, v4, v2, v3}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, "TM"

    invoke-static {v2, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v2, 0xeb

    aput-object v1, v0, v2

    new-instance v1, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v2, "+994"

    const-string v3, "AZ"

    invoke-direct {v1, v2, v3, v8}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, "AZ"

    invoke-static {v2, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v2, 0xec

    aput-object v1, v0, v2

    new-instance v1, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v2, "+995"

    const-string v3, "GE"

    invoke-direct {v1, v2, v3, v10}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, "GE"

    invoke-static {v2, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v2, 0xed

    aput-object v1, v0, v2

    new-instance v1, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v2, "+996"

    const-string v3, "KG"

    invoke-direct {v1, v2, v3, v5}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, "KG"

    invoke-static {v2, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v2, 0xee

    aput-object v1, v0, v2

    new-instance v1, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v2, "+998"

    const-string v3, "UZ"

    invoke-direct {v1, v2, v3, v8}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, "UZ"

    invoke-static {v2, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v2, 0xef

    aput-object v1, v0, v2

    invoke-static {v0}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v0

    sput-object v0, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter;->allMetadata:Ljava/util/Map;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    invoke-direct {p0}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter;-><init>()V

    return-void
.end method

.method public static final synthetic access$getAllMetadata$cp()Ljava/util/Map;
    .locals 1

    sget-object v0, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter;->allMetadata:Ljava/util/Map;

    return-object v0
.end method

.method public static final synthetic access$getVALID_INPUT_RANGE$cp()Lkotlin/ranges/CharRange;
    .locals 1

    sget-object v0, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter;->VALID_INPUT_RANGE:Lkotlin/ranges/CharRange;

    return-object v0
.end method


# virtual methods
.method public abstract getCountryCode()Ljava/lang/String;
.end method

.method public abstract getPlaceholder()Ljava/lang/String;
.end method

.method public abstract getPrefix()Ljava/lang/String;
.end method

.method public abstract getVisualTransformation()LEu6;
.end method

.method public abstract toE164Format(Ljava/lang/String;)Ljava/lang/String;
.end method

.method public abstract userInputFilter(Ljava/lang/String;)Ljava/lang/String;
.end method
