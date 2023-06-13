.class public final enum Lco/bird/android/model/constant/AutoPayPaymentType;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lco/bird/android/model/constant/AutoPayPaymentType$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lco/bird/android/model/constant/AutoPayPaymentType;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0008\u0006\u0008\u0086\u0001\u0018\u0000 \u00062\u0008\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0006B\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\u0008\u0003j\u0002\u0008\u0004j\u0002\u0008\u0005\u00a8\u0006\u0007"
    }
    d2 = {
        "Lco/bird/android/model/constant/AutoPayPaymentType;",
        "",
        "(Ljava/lang/String;I)V",
        "GOOGLE_PAY",
        "PAYPAL",
        "CARD",
        "Companion",
        "model-constant"
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
.field private static final synthetic $VALUES:[Lco/bird/android/model/constant/AutoPayPaymentType;

.field public static final enum CARD:Lco/bird/android/model/constant/AutoPayPaymentType;
    .annotation runtime Lco/bird/android/model/constant/annotation/SerializedEnumDefault;
    .end annotation
.end field

.field public static final Companion:Lco/bird/android/model/constant/AutoPayPaymentType$Companion;

.field private static final DEFAULT_OPTIONS:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lco/bird/android/model/constant/AutoPayPaymentType;",
            ">;"
        }
    .end annotation
.end field

.field public static final enum GOOGLE_PAY:Lco/bird/android/model/constant/AutoPayPaymentType;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "apple_google_pay"
    .end annotation

    .annotation runtime Lft5;
        value = "apple_google_pay"
    .end annotation
.end field

.field public static final enum PAYPAL:Lco/bird/android/model/constant/AutoPayPaymentType;


# direct methods
.method private static final synthetic $values()[Lco/bird/android/model/constant/AutoPayPaymentType;
    .locals 3

    const/4 v0, 0x3

    new-array v0, v0, [Lco/bird/android/model/constant/AutoPayPaymentType;

    const/4 v1, 0x0

    sget-object v2, Lco/bird/android/model/constant/AutoPayPaymentType;->GOOGLE_PAY:Lco/bird/android/model/constant/AutoPayPaymentType;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    sget-object v2, Lco/bird/android/model/constant/AutoPayPaymentType;->PAYPAL:Lco/bird/android/model/constant/AutoPayPaymentType;

    aput-object v2, v0, v1

    const/4 v1, 0x2

    sget-object v2, Lco/bird/android/model/constant/AutoPayPaymentType;->CARD:Lco/bird/android/model/constant/AutoPayPaymentType;

    aput-object v2, v0, v1

    return-object v0
.end method

.method public static constructor <clinit>()V
    .locals 8

    new-instance v0, Lco/bird/android/model/constant/AutoPayPaymentType;

    const-string v1, "GOOGLE_PAY"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lco/bird/android/model/constant/AutoPayPaymentType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lco/bird/android/model/constant/AutoPayPaymentType;->GOOGLE_PAY:Lco/bird/android/model/constant/AutoPayPaymentType;

    new-instance v1, Lco/bird/android/model/constant/AutoPayPaymentType;

    const-string v3, "PAYPAL"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4}, Lco/bird/android/model/constant/AutoPayPaymentType;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lco/bird/android/model/constant/AutoPayPaymentType;->PAYPAL:Lco/bird/android/model/constant/AutoPayPaymentType;

    new-instance v3, Lco/bird/android/model/constant/AutoPayPaymentType;

    const-string v5, "CARD"

    const/4 v6, 0x2

    invoke-direct {v3, v5, v6}, Lco/bird/android/model/constant/AutoPayPaymentType;-><init>(Ljava/lang/String;I)V

    sput-object v3, Lco/bird/android/model/constant/AutoPayPaymentType;->CARD:Lco/bird/android/model/constant/AutoPayPaymentType;

    invoke-static {}, Lco/bird/android/model/constant/AutoPayPaymentType;->$values()[Lco/bird/android/model/constant/AutoPayPaymentType;

    move-result-object v5

    sput-object v5, Lco/bird/android/model/constant/AutoPayPaymentType;->$VALUES:[Lco/bird/android/model/constant/AutoPayPaymentType;

    new-instance v5, Lco/bird/android/model/constant/AutoPayPaymentType$Companion;

    const/4 v7, 0x0

    invoke-direct {v5, v7}, Lco/bird/android/model/constant/AutoPayPaymentType$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v5, Lco/bird/android/model/constant/AutoPayPaymentType;->Companion:Lco/bird/android/model/constant/AutoPayPaymentType$Companion;

    const/4 v5, 0x3

    new-array v5, v5, [Lco/bird/android/model/constant/AutoPayPaymentType;

    aput-object v0, v5, v2

    aput-object v1, v5, v4

    aput-object v3, v5, v6

    invoke-static {v5}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    sput-object v0, Lco/bird/android/model/constant/AutoPayPaymentType;->DEFAULT_OPTIONS:Ljava/util/List;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static final synthetic access$getDEFAULT_OPTIONS$cp()Ljava/util/List;
    .locals 1

    sget-object v0, Lco/bird/android/model/constant/AutoPayPaymentType;->DEFAULT_OPTIONS:Ljava/util/List;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lco/bird/android/model/constant/AutoPayPaymentType;
    .locals 1

    const-class v0, Lco/bird/android/model/constant/AutoPayPaymentType;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lco/bird/android/model/constant/AutoPayPaymentType;

    return-object p0
.end method

.method public static values()[Lco/bird/android/model/constant/AutoPayPaymentType;
    .locals 1

    sget-object v0, Lco/bird/android/model/constant/AutoPayPaymentType;->$VALUES:[Lco/bird/android/model/constant/AutoPayPaymentType;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lco/bird/android/model/constant/AutoPayPaymentType;

    return-object v0
.end method
