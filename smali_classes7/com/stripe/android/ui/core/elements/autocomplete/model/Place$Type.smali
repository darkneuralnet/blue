.class public final enum Lcom/stripe/android/ui/core/elements/autocomplete/model/Place$Type;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/ui/core/elements/autocomplete/model/Place;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "Type"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/stripe/android/ui/core/elements/autocomplete/model/Place$Type;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0015\u0008\u0086\u0001\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\u0008\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0005\u0010\u0006j\u0002\u0008\u0007j\u0002\u0008\u0008j\u0002\u0008\tj\u0002\u0008\nj\u0002\u0008\u000bj\u0002\u0008\u000cj\u0002\u0008\rj\u0002\u0008\u000ej\u0002\u0008\u000fj\u0002\u0008\u0010j\u0002\u0008\u0011j\u0002\u0008\u0012j\u0002\u0008\u0013j\u0002\u0008\u0014j\u0002\u0008\u0015j\u0002\u0008\u0016j\u0002\u0008\u0017\u00a8\u0006\u0018"
    }
    d2 = {
        "Lcom/stripe/android/ui/core/elements/autocomplete/model/Place$Type;",
        "",
        "value",
        "",
        "(Ljava/lang/String;ILjava/lang/String;)V",
        "getValue",
        "()Ljava/lang/String;",
        "ADMINISTRATIVE_AREA_LEVEL_1",
        "ADMINISTRATIVE_AREA_LEVEL_2",
        "ADMINISTRATIVE_AREA_LEVEL_3",
        "ADMINISTRATIVE_AREA_LEVEL_4",
        "COUNTRY",
        "LOCALITY",
        "NEIGHBORHOOD",
        "POSTAL_TOWN",
        "POSTAL_CODE",
        "PREMISE",
        "ROUTE",
        "STREET_NUMBER",
        "SUBLOCALITY",
        "SUBLOCALITY_LEVEL_1",
        "SUBLOCALITY_LEVEL_2",
        "SUBLOCALITY_LEVEL_3",
        "SUBLOCALITY_LEVEL_4",
        "payments-ui-core_release"
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
.field private static final synthetic $VALUES:[Lcom/stripe/android/ui/core/elements/autocomplete/model/Place$Type;

.field public static final enum ADMINISTRATIVE_AREA_LEVEL_1:Lcom/stripe/android/ui/core/elements/autocomplete/model/Place$Type;

.field public static final enum ADMINISTRATIVE_AREA_LEVEL_2:Lcom/stripe/android/ui/core/elements/autocomplete/model/Place$Type;

.field public static final enum ADMINISTRATIVE_AREA_LEVEL_3:Lcom/stripe/android/ui/core/elements/autocomplete/model/Place$Type;

.field public static final enum ADMINISTRATIVE_AREA_LEVEL_4:Lcom/stripe/android/ui/core/elements/autocomplete/model/Place$Type;

.field public static final enum COUNTRY:Lcom/stripe/android/ui/core/elements/autocomplete/model/Place$Type;

.field public static final enum LOCALITY:Lcom/stripe/android/ui/core/elements/autocomplete/model/Place$Type;

.field public static final enum NEIGHBORHOOD:Lcom/stripe/android/ui/core/elements/autocomplete/model/Place$Type;

.field public static final enum POSTAL_CODE:Lcom/stripe/android/ui/core/elements/autocomplete/model/Place$Type;

.field public static final enum POSTAL_TOWN:Lcom/stripe/android/ui/core/elements/autocomplete/model/Place$Type;

.field public static final enum PREMISE:Lcom/stripe/android/ui/core/elements/autocomplete/model/Place$Type;

.field public static final enum ROUTE:Lcom/stripe/android/ui/core/elements/autocomplete/model/Place$Type;

.field public static final enum STREET_NUMBER:Lcom/stripe/android/ui/core/elements/autocomplete/model/Place$Type;

.field public static final enum SUBLOCALITY:Lcom/stripe/android/ui/core/elements/autocomplete/model/Place$Type;

.field public static final enum SUBLOCALITY_LEVEL_1:Lcom/stripe/android/ui/core/elements/autocomplete/model/Place$Type;

.field public static final enum SUBLOCALITY_LEVEL_2:Lcom/stripe/android/ui/core/elements/autocomplete/model/Place$Type;

.field public static final enum SUBLOCALITY_LEVEL_3:Lcom/stripe/android/ui/core/elements/autocomplete/model/Place$Type;

.field public static final enum SUBLOCALITY_LEVEL_4:Lcom/stripe/android/ui/core/elements/autocomplete/model/Place$Type;


# instance fields
.field private final value:Ljava/lang/String;


# direct methods
.method private static final synthetic $values()[Lcom/stripe/android/ui/core/elements/autocomplete/model/Place$Type;
    .locals 3

    const/16 v0, 0x11

    new-array v0, v0, [Lcom/stripe/android/ui/core/elements/autocomplete/model/Place$Type;

    const/4 v1, 0x0

    sget-object v2, Lcom/stripe/android/ui/core/elements/autocomplete/model/Place$Type;->ADMINISTRATIVE_AREA_LEVEL_1:Lcom/stripe/android/ui/core/elements/autocomplete/model/Place$Type;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    sget-object v2, Lcom/stripe/android/ui/core/elements/autocomplete/model/Place$Type;->ADMINISTRATIVE_AREA_LEVEL_2:Lcom/stripe/android/ui/core/elements/autocomplete/model/Place$Type;

    aput-object v2, v0, v1

    const/4 v1, 0x2

    sget-object v2, Lcom/stripe/android/ui/core/elements/autocomplete/model/Place$Type;->ADMINISTRATIVE_AREA_LEVEL_3:Lcom/stripe/android/ui/core/elements/autocomplete/model/Place$Type;

    aput-object v2, v0, v1

    const/4 v1, 0x3

    sget-object v2, Lcom/stripe/android/ui/core/elements/autocomplete/model/Place$Type;->ADMINISTRATIVE_AREA_LEVEL_4:Lcom/stripe/android/ui/core/elements/autocomplete/model/Place$Type;

    aput-object v2, v0, v1

    const/4 v1, 0x4

    sget-object v2, Lcom/stripe/android/ui/core/elements/autocomplete/model/Place$Type;->COUNTRY:Lcom/stripe/android/ui/core/elements/autocomplete/model/Place$Type;

    aput-object v2, v0, v1

    const/4 v1, 0x5

    sget-object v2, Lcom/stripe/android/ui/core/elements/autocomplete/model/Place$Type;->LOCALITY:Lcom/stripe/android/ui/core/elements/autocomplete/model/Place$Type;

    aput-object v2, v0, v1

    const/4 v1, 0x6

    sget-object v2, Lcom/stripe/android/ui/core/elements/autocomplete/model/Place$Type;->NEIGHBORHOOD:Lcom/stripe/android/ui/core/elements/autocomplete/model/Place$Type;

    aput-object v2, v0, v1

    const/4 v1, 0x7

    sget-object v2, Lcom/stripe/android/ui/core/elements/autocomplete/model/Place$Type;->POSTAL_TOWN:Lcom/stripe/android/ui/core/elements/autocomplete/model/Place$Type;

    aput-object v2, v0, v1

    const/16 v1, 0x8

    sget-object v2, Lcom/stripe/android/ui/core/elements/autocomplete/model/Place$Type;->POSTAL_CODE:Lcom/stripe/android/ui/core/elements/autocomplete/model/Place$Type;

    aput-object v2, v0, v1

    const/16 v1, 0x9

    sget-object v2, Lcom/stripe/android/ui/core/elements/autocomplete/model/Place$Type;->PREMISE:Lcom/stripe/android/ui/core/elements/autocomplete/model/Place$Type;

    aput-object v2, v0, v1

    const/16 v1, 0xa

    sget-object v2, Lcom/stripe/android/ui/core/elements/autocomplete/model/Place$Type;->ROUTE:Lcom/stripe/android/ui/core/elements/autocomplete/model/Place$Type;

    aput-object v2, v0, v1

    const/16 v1, 0xb

    sget-object v2, Lcom/stripe/android/ui/core/elements/autocomplete/model/Place$Type;->STREET_NUMBER:Lcom/stripe/android/ui/core/elements/autocomplete/model/Place$Type;

    aput-object v2, v0, v1

    const/16 v1, 0xc

    sget-object v2, Lcom/stripe/android/ui/core/elements/autocomplete/model/Place$Type;->SUBLOCALITY:Lcom/stripe/android/ui/core/elements/autocomplete/model/Place$Type;

    aput-object v2, v0, v1

    const/16 v1, 0xd

    sget-object v2, Lcom/stripe/android/ui/core/elements/autocomplete/model/Place$Type;->SUBLOCALITY_LEVEL_1:Lcom/stripe/android/ui/core/elements/autocomplete/model/Place$Type;

    aput-object v2, v0, v1

    const/16 v1, 0xe

    sget-object v2, Lcom/stripe/android/ui/core/elements/autocomplete/model/Place$Type;->SUBLOCALITY_LEVEL_2:Lcom/stripe/android/ui/core/elements/autocomplete/model/Place$Type;

    aput-object v2, v0, v1

    const/16 v1, 0xf

    sget-object v2, Lcom/stripe/android/ui/core/elements/autocomplete/model/Place$Type;->SUBLOCALITY_LEVEL_3:Lcom/stripe/android/ui/core/elements/autocomplete/model/Place$Type;

    aput-object v2, v0, v1

    const/16 v1, 0x10

    sget-object v2, Lcom/stripe/android/ui/core/elements/autocomplete/model/Place$Type;->SUBLOCALITY_LEVEL_4:Lcom/stripe/android/ui/core/elements/autocomplete/model/Place$Type;

    aput-object v2, v0, v1

    return-object v0
.end method

.method public static constructor <clinit>()V
    .locals 4

    new-instance v0, Lcom/stripe/android/ui/core/elements/autocomplete/model/Place$Type;

    const/4 v1, 0x0

    const-string v2, "administrative_area_level_1"

    const-string v3, "ADMINISTRATIVE_AREA_LEVEL_1"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/ui/core/elements/autocomplete/model/Place$Type;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/ui/core/elements/autocomplete/model/Place$Type;->ADMINISTRATIVE_AREA_LEVEL_1:Lcom/stripe/android/ui/core/elements/autocomplete/model/Place$Type;

    new-instance v0, Lcom/stripe/android/ui/core/elements/autocomplete/model/Place$Type;

    const/4 v1, 0x1

    const-string v2, "administrative_area_level_2"

    const-string v3, "ADMINISTRATIVE_AREA_LEVEL_2"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/ui/core/elements/autocomplete/model/Place$Type;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/ui/core/elements/autocomplete/model/Place$Type;->ADMINISTRATIVE_AREA_LEVEL_2:Lcom/stripe/android/ui/core/elements/autocomplete/model/Place$Type;

    new-instance v0, Lcom/stripe/android/ui/core/elements/autocomplete/model/Place$Type;

    const/4 v1, 0x2

    const-string v2, "administrative_area_level_3"

    const-string v3, "ADMINISTRATIVE_AREA_LEVEL_3"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/ui/core/elements/autocomplete/model/Place$Type;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/ui/core/elements/autocomplete/model/Place$Type;->ADMINISTRATIVE_AREA_LEVEL_3:Lcom/stripe/android/ui/core/elements/autocomplete/model/Place$Type;

    new-instance v0, Lcom/stripe/android/ui/core/elements/autocomplete/model/Place$Type;

    const/4 v1, 0x3

    const-string v2, "administrative_area_level_4"

    const-string v3, "ADMINISTRATIVE_AREA_LEVEL_4"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/ui/core/elements/autocomplete/model/Place$Type;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/ui/core/elements/autocomplete/model/Place$Type;->ADMINISTRATIVE_AREA_LEVEL_4:Lcom/stripe/android/ui/core/elements/autocomplete/model/Place$Type;

    new-instance v0, Lcom/stripe/android/ui/core/elements/autocomplete/model/Place$Type;

    const/4 v1, 0x4

    const-string v2, "country"

    const-string v3, "COUNTRY"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/ui/core/elements/autocomplete/model/Place$Type;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/ui/core/elements/autocomplete/model/Place$Type;->COUNTRY:Lcom/stripe/android/ui/core/elements/autocomplete/model/Place$Type;

    new-instance v0, Lcom/stripe/android/ui/core/elements/autocomplete/model/Place$Type;

    const/4 v1, 0x5

    const-string v2, "locality"

    const-string v3, "LOCALITY"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/ui/core/elements/autocomplete/model/Place$Type;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/ui/core/elements/autocomplete/model/Place$Type;->LOCALITY:Lcom/stripe/android/ui/core/elements/autocomplete/model/Place$Type;

    new-instance v0, Lcom/stripe/android/ui/core/elements/autocomplete/model/Place$Type;

    const/4 v1, 0x6

    const-string v2, "neighborhood"

    const-string v3, "NEIGHBORHOOD"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/ui/core/elements/autocomplete/model/Place$Type;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/ui/core/elements/autocomplete/model/Place$Type;->NEIGHBORHOOD:Lcom/stripe/android/ui/core/elements/autocomplete/model/Place$Type;

    new-instance v0, Lcom/stripe/android/ui/core/elements/autocomplete/model/Place$Type;

    const/4 v1, 0x7

    const-string v2, "postal_town"

    const-string v3, "POSTAL_TOWN"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/ui/core/elements/autocomplete/model/Place$Type;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/ui/core/elements/autocomplete/model/Place$Type;->POSTAL_TOWN:Lcom/stripe/android/ui/core/elements/autocomplete/model/Place$Type;

    new-instance v0, Lcom/stripe/android/ui/core/elements/autocomplete/model/Place$Type;

    const/16 v1, 0x8

    const-string v2, "postal_code"

    const-string v3, "POSTAL_CODE"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/ui/core/elements/autocomplete/model/Place$Type;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/ui/core/elements/autocomplete/model/Place$Type;->POSTAL_CODE:Lcom/stripe/android/ui/core/elements/autocomplete/model/Place$Type;

    new-instance v0, Lcom/stripe/android/ui/core/elements/autocomplete/model/Place$Type;

    const/16 v1, 0x9

    const-string v2, "premise"

    const-string v3, "PREMISE"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/ui/core/elements/autocomplete/model/Place$Type;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/ui/core/elements/autocomplete/model/Place$Type;->PREMISE:Lcom/stripe/android/ui/core/elements/autocomplete/model/Place$Type;

    new-instance v0, Lcom/stripe/android/ui/core/elements/autocomplete/model/Place$Type;

    const/16 v1, 0xa

    const-string v2, "route"

    const-string v3, "ROUTE"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/ui/core/elements/autocomplete/model/Place$Type;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/ui/core/elements/autocomplete/model/Place$Type;->ROUTE:Lcom/stripe/android/ui/core/elements/autocomplete/model/Place$Type;

    new-instance v0, Lcom/stripe/android/ui/core/elements/autocomplete/model/Place$Type;

    const/16 v1, 0xb

    const-string v2, "street_number"

    const-string v3, "STREET_NUMBER"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/ui/core/elements/autocomplete/model/Place$Type;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/ui/core/elements/autocomplete/model/Place$Type;->STREET_NUMBER:Lcom/stripe/android/ui/core/elements/autocomplete/model/Place$Type;

    new-instance v0, Lcom/stripe/android/ui/core/elements/autocomplete/model/Place$Type;

    const/16 v1, 0xc

    const-string v2, "sublocality"

    const-string v3, "SUBLOCALITY"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/ui/core/elements/autocomplete/model/Place$Type;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/ui/core/elements/autocomplete/model/Place$Type;->SUBLOCALITY:Lcom/stripe/android/ui/core/elements/autocomplete/model/Place$Type;

    new-instance v0, Lcom/stripe/android/ui/core/elements/autocomplete/model/Place$Type;

    const/16 v1, 0xd

    const-string v2, "sublocality_level_1"

    const-string v3, "SUBLOCALITY_LEVEL_1"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/ui/core/elements/autocomplete/model/Place$Type;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/ui/core/elements/autocomplete/model/Place$Type;->SUBLOCALITY_LEVEL_1:Lcom/stripe/android/ui/core/elements/autocomplete/model/Place$Type;

    new-instance v0, Lcom/stripe/android/ui/core/elements/autocomplete/model/Place$Type;

    const/16 v1, 0xe

    const-string v2, "sublocality_level_2"

    const-string v3, "SUBLOCALITY_LEVEL_2"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/ui/core/elements/autocomplete/model/Place$Type;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/ui/core/elements/autocomplete/model/Place$Type;->SUBLOCALITY_LEVEL_2:Lcom/stripe/android/ui/core/elements/autocomplete/model/Place$Type;

    new-instance v0, Lcom/stripe/android/ui/core/elements/autocomplete/model/Place$Type;

    const/16 v1, 0xf

    const-string v2, "sublocality_level_3"

    const-string v3, "SUBLOCALITY_LEVEL_3"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/ui/core/elements/autocomplete/model/Place$Type;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/ui/core/elements/autocomplete/model/Place$Type;->SUBLOCALITY_LEVEL_3:Lcom/stripe/android/ui/core/elements/autocomplete/model/Place$Type;

    new-instance v0, Lcom/stripe/android/ui/core/elements/autocomplete/model/Place$Type;

    const/16 v1, 0x10

    const-string v2, "sublocality_level_4"

    const-string v3, "SUBLOCALITY_LEVEL_4"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/ui/core/elements/autocomplete/model/Place$Type;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/ui/core/elements/autocomplete/model/Place$Type;->SUBLOCALITY_LEVEL_4:Lcom/stripe/android/ui/core/elements/autocomplete/model/Place$Type;

    invoke-static {}, Lcom/stripe/android/ui/core/elements/autocomplete/model/Place$Type;->$values()[Lcom/stripe/android/ui/core/elements/autocomplete/model/Place$Type;

    move-result-object v0

    sput-object v0, Lcom/stripe/android/ui/core/elements/autocomplete/model/Place$Type;->$VALUES:[Lcom/stripe/android/ui/core/elements/autocomplete/model/Place$Type;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;ILjava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-object p3, p0, Lcom/stripe/android/ui/core/elements/autocomplete/model/Place$Type;->value:Ljava/lang/String;

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/stripe/android/ui/core/elements/autocomplete/model/Place$Type;
    .locals 1

    const-class v0, Lcom/stripe/android/ui/core/elements/autocomplete/model/Place$Type;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/stripe/android/ui/core/elements/autocomplete/model/Place$Type;

    return-object p0
.end method

.method public static values()[Lcom/stripe/android/ui/core/elements/autocomplete/model/Place$Type;
    .locals 1

    sget-object v0, Lcom/stripe/android/ui/core/elements/autocomplete/model/Place$Type;->$VALUES:[Lcom/stripe/android/ui/core/elements/autocomplete/model/Place$Type;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/stripe/android/ui/core/elements/autocomplete/model/Place$Type;

    return-object v0
.end method


# virtual methods
.method public final getValue()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/ui/core/elements/autocomplete/model/Place$Type;->value:Ljava/lang/String;

    return-object v0
.end method
