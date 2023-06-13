.class public final enum Lco/bird/android/model/constant/PaymentMethod;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lco/bird/android/model/constant/PaymentMethod;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\r\u0008\u0086\u0001\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004J\u0008\u0010\u0005\u001a\u00020\u0004H\u0016j\u0002\u0008\u0006j\u0002\u0008\u0007j\u0002\u0008\u0008j\u0002\u0008\tj\u0002\u0008\nj\u0002\u0008\u000bj\u0002\u0008\u000cj\u0002\u0008\rj\u0002\u0008\u000ej\u0002\u0008\u000fj\u0002\u0008\u0010\u00a8\u0006\u0011"
    }
    d2 = {
        "Lco/bird/android/model/constant/PaymentMethod;",
        "",
        "(Ljava/lang/String;I)V",
        "label",
        "",
        "toString",
        "BANCONTACT",
        "CARD",
        "EPS",
        "FPX",
        "GIROPAY",
        "GOOGLE_PAY",
        "IDEAL",
        "PAYPAL",
        "P24",
        "SOFORT",
        "UNKNOWN",
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
.field private static final synthetic $VALUES:[Lco/bird/android/model/constant/PaymentMethod;

.field public static final enum BANCONTACT:Lco/bird/android/model/constant/PaymentMethod;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "bancontact"
    .end annotation

    .annotation runtime Lft5;
        value = "bancontact"
    .end annotation
.end field

.field public static final enum CARD:Lco/bird/android/model/constant/PaymentMethod;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "card"
    .end annotation

    .annotation runtime Lft5;
        value = "card"
    .end annotation
.end field

.field public static final enum EPS:Lco/bird/android/model/constant/PaymentMethod;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "eps"
    .end annotation

    .annotation runtime Lft5;
        value = "eps"
    .end annotation
.end field

.field public static final enum FPX:Lco/bird/android/model/constant/PaymentMethod;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "fpx"
    .end annotation

    .annotation runtime Lft5;
        value = "fpx"
    .end annotation
.end field

.field public static final enum GIROPAY:Lco/bird/android/model/constant/PaymentMethod;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "giropay"
    .end annotation

    .annotation runtime Lft5;
        value = "giropay"
    .end annotation
.end field

.field public static final enum GOOGLE_PAY:Lco/bird/android/model/constant/PaymentMethod;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "google_pay"
    .end annotation

    .annotation runtime Lft5;
        value = "google_pay"
    .end annotation
.end field

.field public static final enum IDEAL:Lco/bird/android/model/constant/PaymentMethod;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "ideal"
    .end annotation

    .annotation runtime Lft5;
        value = "ideal"
    .end annotation
.end field

.field public static final enum P24:Lco/bird/android/model/constant/PaymentMethod;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "p24"
    .end annotation

    .annotation runtime Lft5;
        value = "p24"
    .end annotation
.end field

.field public static final enum PAYPAL:Lco/bird/android/model/constant/PaymentMethod;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "paypal"
    .end annotation

    .annotation runtime Lft5;
        value = "paypal"
    .end annotation
.end field

.field public static final enum SOFORT:Lco/bird/android/model/constant/PaymentMethod;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "sofort"
    .end annotation

    .annotation runtime Lft5;
        value = "sofort"
    .end annotation
.end field

.field public static final enum UNKNOWN:Lco/bird/android/model/constant/PaymentMethod;


# direct methods
.method private static final synthetic $values()[Lco/bird/android/model/constant/PaymentMethod;
    .locals 3

    const/16 v0, 0xb

    new-array v0, v0, [Lco/bird/android/model/constant/PaymentMethod;

    const/4 v1, 0x0

    sget-object v2, Lco/bird/android/model/constant/PaymentMethod;->BANCONTACT:Lco/bird/android/model/constant/PaymentMethod;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    sget-object v2, Lco/bird/android/model/constant/PaymentMethod;->CARD:Lco/bird/android/model/constant/PaymentMethod;

    aput-object v2, v0, v1

    const/4 v1, 0x2

    sget-object v2, Lco/bird/android/model/constant/PaymentMethod;->EPS:Lco/bird/android/model/constant/PaymentMethod;

    aput-object v2, v0, v1

    const/4 v1, 0x3

    sget-object v2, Lco/bird/android/model/constant/PaymentMethod;->FPX:Lco/bird/android/model/constant/PaymentMethod;

    aput-object v2, v0, v1

    const/4 v1, 0x4

    sget-object v2, Lco/bird/android/model/constant/PaymentMethod;->GIROPAY:Lco/bird/android/model/constant/PaymentMethod;

    aput-object v2, v0, v1

    const/4 v1, 0x5

    sget-object v2, Lco/bird/android/model/constant/PaymentMethod;->GOOGLE_PAY:Lco/bird/android/model/constant/PaymentMethod;

    aput-object v2, v0, v1

    const/4 v1, 0x6

    sget-object v2, Lco/bird/android/model/constant/PaymentMethod;->IDEAL:Lco/bird/android/model/constant/PaymentMethod;

    aput-object v2, v0, v1

    const/4 v1, 0x7

    sget-object v2, Lco/bird/android/model/constant/PaymentMethod;->PAYPAL:Lco/bird/android/model/constant/PaymentMethod;

    aput-object v2, v0, v1

    const/16 v1, 0x8

    sget-object v2, Lco/bird/android/model/constant/PaymentMethod;->P24:Lco/bird/android/model/constant/PaymentMethod;

    aput-object v2, v0, v1

    const/16 v1, 0x9

    sget-object v2, Lco/bird/android/model/constant/PaymentMethod;->SOFORT:Lco/bird/android/model/constant/PaymentMethod;

    aput-object v2, v0, v1

    const/16 v1, 0xa

    sget-object v2, Lco/bird/android/model/constant/PaymentMethod;->UNKNOWN:Lco/bird/android/model/constant/PaymentMethod;

    aput-object v2, v0, v1

    return-object v0
.end method

.method public static constructor <clinit>()V
    .locals 3

    new-instance v0, Lco/bird/android/model/constant/PaymentMethod;

    const-string v1, "BANCONTACT"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lco/bird/android/model/constant/PaymentMethod;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lco/bird/android/model/constant/PaymentMethod;->BANCONTACT:Lco/bird/android/model/constant/PaymentMethod;

    new-instance v0, Lco/bird/android/model/constant/PaymentMethod;

    const-string v1, "CARD"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lco/bird/android/model/constant/PaymentMethod;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lco/bird/android/model/constant/PaymentMethod;->CARD:Lco/bird/android/model/constant/PaymentMethod;

    new-instance v0, Lco/bird/android/model/constant/PaymentMethod;

    const-string v1, "EPS"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lco/bird/android/model/constant/PaymentMethod;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lco/bird/android/model/constant/PaymentMethod;->EPS:Lco/bird/android/model/constant/PaymentMethod;

    new-instance v0, Lco/bird/android/model/constant/PaymentMethod;

    const-string v1, "FPX"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lco/bird/android/model/constant/PaymentMethod;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lco/bird/android/model/constant/PaymentMethod;->FPX:Lco/bird/android/model/constant/PaymentMethod;

    new-instance v0, Lco/bird/android/model/constant/PaymentMethod;

    const-string v1, "GIROPAY"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2}, Lco/bird/android/model/constant/PaymentMethod;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lco/bird/android/model/constant/PaymentMethod;->GIROPAY:Lco/bird/android/model/constant/PaymentMethod;

    new-instance v0, Lco/bird/android/model/constant/PaymentMethod;

    const-string v1, "GOOGLE_PAY"

    const/4 v2, 0x5

    invoke-direct {v0, v1, v2}, Lco/bird/android/model/constant/PaymentMethod;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lco/bird/android/model/constant/PaymentMethod;->GOOGLE_PAY:Lco/bird/android/model/constant/PaymentMethod;

    new-instance v0, Lco/bird/android/model/constant/PaymentMethod;

    const-string v1, "IDEAL"

    const/4 v2, 0x6

    invoke-direct {v0, v1, v2}, Lco/bird/android/model/constant/PaymentMethod;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lco/bird/android/model/constant/PaymentMethod;->IDEAL:Lco/bird/android/model/constant/PaymentMethod;

    new-instance v0, Lco/bird/android/model/constant/PaymentMethod;

    const-string v1, "PAYPAL"

    const/4 v2, 0x7

    invoke-direct {v0, v1, v2}, Lco/bird/android/model/constant/PaymentMethod;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lco/bird/android/model/constant/PaymentMethod;->PAYPAL:Lco/bird/android/model/constant/PaymentMethod;

    new-instance v0, Lco/bird/android/model/constant/PaymentMethod;

    const-string v1, "P24"

    const/16 v2, 0x8

    invoke-direct {v0, v1, v2}, Lco/bird/android/model/constant/PaymentMethod;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lco/bird/android/model/constant/PaymentMethod;->P24:Lco/bird/android/model/constant/PaymentMethod;

    new-instance v0, Lco/bird/android/model/constant/PaymentMethod;

    const-string v1, "SOFORT"

    const/16 v2, 0x9

    invoke-direct {v0, v1, v2}, Lco/bird/android/model/constant/PaymentMethod;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lco/bird/android/model/constant/PaymentMethod;->SOFORT:Lco/bird/android/model/constant/PaymentMethod;

    new-instance v0, Lco/bird/android/model/constant/PaymentMethod;

    const-string v1, "UNKNOWN"

    const/16 v2, 0xa

    invoke-direct {v0, v1, v2}, Lco/bird/android/model/constant/PaymentMethod;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lco/bird/android/model/constant/PaymentMethod;->UNKNOWN:Lco/bird/android/model/constant/PaymentMethod;

    invoke-static {}, Lco/bird/android/model/constant/PaymentMethod;->$values()[Lco/bird/android/model/constant/PaymentMethod;

    move-result-object v0

    sput-object v0, Lco/bird/android/model/constant/PaymentMethod;->$VALUES:[Lco/bird/android/model/constant/PaymentMethod;

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

.method public static valueOf(Ljava/lang/String;)Lco/bird/android/model/constant/PaymentMethod;
    .locals 1

    const-class v0, Lco/bird/android/model/constant/PaymentMethod;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lco/bird/android/model/constant/PaymentMethod;

    return-object p0
.end method

.method public static values()[Lco/bird/android/model/constant/PaymentMethod;
    .locals 1

    sget-object v0, Lco/bird/android/model/constant/PaymentMethod;->$VALUES:[Lco/bird/android/model/constant/PaymentMethod;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lco/bird/android/model/constant/PaymentMethod;

    return-object v0
.end method


# virtual methods
.method public final label()Ljava/lang/String;
    .locals 10

    invoke-virtual {p0}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v1

    const-string v0, "this as java.lang.String).toLowerCase()"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "_"

    filled-new-array {v0}, [Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x6

    const/4 v6, 0x0

    invoke-static/range {v1 .. v6}, Lkotlin/text/StringsKt;->split$default(Ljava/lang/CharSequence;[Ljava/lang/String;ZIILjava/lang/Object;)Ljava/util/List;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Ljava/lang/Iterable;

    const-string v2, " "

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    sget-object v7, Lco/bird/android/model/constant/PaymentMethod$label$1;->INSTANCE:Lco/bird/android/model/constant/PaymentMethod$label$1;

    const/16 v8, 0x1e

    const/4 v9, 0x0

    invoke-static/range {v1 .. v9}, Lkotlin/collections/CollectionsKt;->joinToString$default(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    invoke-virtual {p0}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v0

    const-string v1, "this as java.lang.String).toLowerCase()"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method
