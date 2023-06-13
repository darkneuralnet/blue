.class public final enum Lco/bird/android/model/InaccessibleReason;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lco/bird/android/model/InaccessibleReason;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0006\n\u0002\u0010\u000e\n\u0002\u0008\u0007\u0008\u0086\u0001\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\u001b\u0008\u0002\u0012\u0008\u0008\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0008\u0008\u0001\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0005J\u0008\u0010\t\u001a\u00020\nH\u0016R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0008\u0010\u0007j\u0002\u0008\u000bj\u0002\u0008\u000cj\u0002\u0008\rj\u0002\u0008\u000ej\u0002\u0008\u000fj\u0002\u0008\u0010\u00a8\u0006\u0011"
    }
    d2 = {
        "Lco/bird/android/model/InaccessibleReason;",
        "",
        "label",
        "",
        "descriptionHint",
        "(Ljava/lang/String;III)V",
        "getDescriptionHint",
        "()I",
        "getLabel",
        "toString",
        "",
        "ON_PRIVATE_PROPERTY",
        "ON_BUSINESS_PROPERTY",
        "INSIDE_CAR",
        "SUBMERGED",
        "MISSING",
        "OTHER",
        "model_release"
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
.field private static final synthetic $VALUES:[Lco/bird/android/model/InaccessibleReason;

.field public static final enum INSIDE_CAR:Lco/bird/android/model/InaccessibleReason;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "inside_car"
    .end annotation

    .annotation runtime Lft5;
        value = "inside_car"
    .end annotation
.end field

.field public static final enum MISSING:Lco/bird/android/model/InaccessibleReason;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "missing"
    .end annotation

    .annotation runtime Lft5;
        value = "missing"
    .end annotation
.end field

.field public static final enum ON_BUSINESS_PROPERTY:Lco/bird/android/model/InaccessibleReason;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "on_business_property"
    .end annotation

    .annotation runtime Lft5;
        value = "on_business_property"
    .end annotation
.end field

.field public static final enum ON_PRIVATE_PROPERTY:Lco/bird/android/model/InaccessibleReason;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "on_private_property"
    .end annotation

    .annotation runtime Lft5;
        value = "on_private_property"
    .end annotation
.end field

.field public static final enum OTHER:Lco/bird/android/model/InaccessibleReason;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "other"
    .end annotation

    .annotation runtime Lft5;
        value = "other"
    .end annotation
.end field

.field public static final enum SUBMERGED:Lco/bird/android/model/InaccessibleReason;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "submerged"
    .end annotation

    .annotation runtime Lft5;
        value = "submerged"
    .end annotation
.end field


# instance fields
.field private final descriptionHint:I

.field private final label:I


# direct methods
.method private static final synthetic $values()[Lco/bird/android/model/InaccessibleReason;
    .locals 3

    const/4 v0, 0x6

    new-array v0, v0, [Lco/bird/android/model/InaccessibleReason;

    const/4 v1, 0x0

    sget-object v2, Lco/bird/android/model/InaccessibleReason;->ON_PRIVATE_PROPERTY:Lco/bird/android/model/InaccessibleReason;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    sget-object v2, Lco/bird/android/model/InaccessibleReason;->ON_BUSINESS_PROPERTY:Lco/bird/android/model/InaccessibleReason;

    aput-object v2, v0, v1

    const/4 v1, 0x2

    sget-object v2, Lco/bird/android/model/InaccessibleReason;->INSIDE_CAR:Lco/bird/android/model/InaccessibleReason;

    aput-object v2, v0, v1

    const/4 v1, 0x3

    sget-object v2, Lco/bird/android/model/InaccessibleReason;->SUBMERGED:Lco/bird/android/model/InaccessibleReason;

    aput-object v2, v0, v1

    const/4 v1, 0x4

    sget-object v2, Lco/bird/android/model/InaccessibleReason;->MISSING:Lco/bird/android/model/InaccessibleReason;

    aput-object v2, v0, v1

    const/4 v1, 0x5

    sget-object v2, Lco/bird/android/model/InaccessibleReason;->OTHER:Lco/bird/android/model/InaccessibleReason;

    aput-object v2, v0, v1

    return-object v0
.end method

.method public static constructor <clinit>()V
    .locals 5

    new-instance v0, Lco/bird/android/model/InaccessibleReason;

    sget v1, Lnl4;->inaccessible_reason_private_property_label:I

    sget v2, Lnl4;->inaccessible_reason_private_property_description_hint:I

    const-string v3, "ON_PRIVATE_PROPERTY"

    const/4 v4, 0x0

    invoke-direct {v0, v3, v4, v1, v2}, Lco/bird/android/model/InaccessibleReason;-><init>(Ljava/lang/String;III)V

    sput-object v0, Lco/bird/android/model/InaccessibleReason;->ON_PRIVATE_PROPERTY:Lco/bird/android/model/InaccessibleReason;

    new-instance v0, Lco/bird/android/model/InaccessibleReason;

    sget v1, Lnl4;->inaccessible_reason_business_property_label:I

    sget v2, Lnl4;->inaccessible_reason_business_property_description_hint:I

    const-string v3, "ON_BUSINESS_PROPERTY"

    const/4 v4, 0x1

    invoke-direct {v0, v3, v4, v1, v2}, Lco/bird/android/model/InaccessibleReason;-><init>(Ljava/lang/String;III)V

    sput-object v0, Lco/bird/android/model/InaccessibleReason;->ON_BUSINESS_PROPERTY:Lco/bird/android/model/InaccessibleReason;

    new-instance v0, Lco/bird/android/model/InaccessibleReason;

    sget v1, Lnl4;->inaccessible_reason_inside_car_label:I

    sget v2, Lnl4;->inaccessible_reason_inside_car_description_hint:I

    const-string v3, "INSIDE_CAR"

    const/4 v4, 0x2

    invoke-direct {v0, v3, v4, v1, v2}, Lco/bird/android/model/InaccessibleReason;-><init>(Ljava/lang/String;III)V

    sput-object v0, Lco/bird/android/model/InaccessibleReason;->INSIDE_CAR:Lco/bird/android/model/InaccessibleReason;

    new-instance v0, Lco/bird/android/model/InaccessibleReason;

    sget v1, Lnl4;->inaccessible_reason_submerged_label:I

    sget v2, Lnl4;->inaccessible_reason_submerged_description_hint:I

    const-string v3, "SUBMERGED"

    const/4 v4, 0x3

    invoke-direct {v0, v3, v4, v1, v2}, Lco/bird/android/model/InaccessibleReason;-><init>(Ljava/lang/String;III)V

    sput-object v0, Lco/bird/android/model/InaccessibleReason;->SUBMERGED:Lco/bird/android/model/InaccessibleReason;

    new-instance v0, Lco/bird/android/model/InaccessibleReason;

    sget v1, Lnl4;->inaccessible_reason_missing_label:I

    sget v2, Lnl4;->inaccessible_reason_missing_description_hint:I

    const-string v3, "MISSING"

    const/4 v4, 0x4

    invoke-direct {v0, v3, v4, v1, v2}, Lco/bird/android/model/InaccessibleReason;-><init>(Ljava/lang/String;III)V

    sput-object v0, Lco/bird/android/model/InaccessibleReason;->MISSING:Lco/bird/android/model/InaccessibleReason;

    new-instance v0, Lco/bird/android/model/InaccessibleReason;

    sget v1, Lnl4;->inaccessible_reason_other_label:I

    sget v2, Lnl4;->inaccessible_reason_other_description_hint:I

    const-string v3, "OTHER"

    const/4 v4, 0x5

    invoke-direct {v0, v3, v4, v1, v2}, Lco/bird/android/model/InaccessibleReason;-><init>(Ljava/lang/String;III)V

    sput-object v0, Lco/bird/android/model/InaccessibleReason;->OTHER:Lco/bird/android/model/InaccessibleReason;

    invoke-static {}, Lco/bird/android/model/InaccessibleReason;->$values()[Lco/bird/android/model/InaccessibleReason;

    move-result-object v0

    sput-object v0, Lco/bird/android/model/InaccessibleReason;->$VALUES:[Lco/bird/android/model/InaccessibleReason;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;III)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(II)V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput p3, p0, Lco/bird/android/model/InaccessibleReason;->label:I

    iput p4, p0, Lco/bird/android/model/InaccessibleReason;->descriptionHint:I

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lco/bird/android/model/InaccessibleReason;
    .locals 1

    const-class v0, Lco/bird/android/model/InaccessibleReason;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lco/bird/android/model/InaccessibleReason;

    return-object p0
.end method

.method public static values()[Lco/bird/android/model/InaccessibleReason;
    .locals 1

    sget-object v0, Lco/bird/android/model/InaccessibleReason;->$VALUES:[Lco/bird/android/model/InaccessibleReason;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lco/bird/android/model/InaccessibleReason;

    return-object v0
.end method


# virtual methods
.method public final getDescriptionHint()I
    .locals 1

    iget v0, p0, Lco/bird/android/model/InaccessibleReason;->descriptionHint:I

    return v0
.end method

.method public final getLabel()I
    .locals 1

    iget v0, p0, Lco/bird/android/model/InaccessibleReason;->label:I

    return v0
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
