.class public final enum Lco/bird/android/model/constant/HabitatType;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lco/bird/android/model/constant/HabitatType;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0007\u0008\u0086\u0001\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\u0008\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0005\u0010\u0006j\u0002\u0008\u0007j\u0002\u0008\u0008j\u0002\u0008\t\u00a8\u0006\n"
    }
    d2 = {
        "Lco/bird/android/model/constant/HabitatType;",
        "",
        "habitatId",
        "",
        "(Ljava/lang/String;ILjava/lang/String;)V",
        "getHabitatId",
        "()Ljava/lang/String;",
        "BIRD",
        "CIRC",
        "CITY_DEMO",
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
.field private static final synthetic $VALUES:[Lco/bird/android/model/constant/HabitatType;

.field public static final enum BIRD:Lco/bird/android/model/constant/HabitatType;

.field public static final enum CIRC:Lco/bird/android/model/constant/HabitatType;

.field public static final enum CITY_DEMO:Lco/bird/android/model/constant/HabitatType;


# instance fields
.field private final habitatId:Ljava/lang/String;


# direct methods
.method private static final synthetic $values()[Lco/bird/android/model/constant/HabitatType;
    .locals 3

    const/4 v0, 0x3

    new-array v0, v0, [Lco/bird/android/model/constant/HabitatType;

    const/4 v1, 0x0

    sget-object v2, Lco/bird/android/model/constant/HabitatType;->BIRD:Lco/bird/android/model/constant/HabitatType;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    sget-object v2, Lco/bird/android/model/constant/HabitatType;->CIRC:Lco/bird/android/model/constant/HabitatType;

    aput-object v2, v0, v1

    const/4 v1, 0x2

    sget-object v2, Lco/bird/android/model/constant/HabitatType;->CITY_DEMO:Lco/bird/android/model/constant/HabitatType;

    aput-object v2, v0, v1

    return-object v0
.end method

.method public static constructor <clinit>()V
    .locals 4

    new-instance v0, Lco/bird/android/model/constant/HabitatType;

    const/4 v1, 0x0

    const-string v2, "00000000-0000-0000-0000-000000000000"

    const-string v3, "BIRD"

    invoke-direct {v0, v3, v1, v2}, Lco/bird/android/model/constant/HabitatType;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lco/bird/android/model/constant/HabitatType;->BIRD:Lco/bird/android/model/constant/HabitatType;

    new-instance v0, Lco/bird/android/model/constant/HabitatType;

    const/4 v1, 0x1

    const-string v2, "f3612b08-65d8-4377-8c70-1086a926a33f"

    const-string v3, "CIRC"

    invoke-direct {v0, v3, v1, v2}, Lco/bird/android/model/constant/HabitatType;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lco/bird/android/model/constant/HabitatType;->CIRC:Lco/bird/android/model/constant/HabitatType;

    new-instance v0, Lco/bird/android/model/constant/HabitatType;

    const/4 v1, 0x2

    const-string v2, "8984f2c0-6a28-4c91-a93a-42fb75528351"

    const-string v3, "CITY_DEMO"

    invoke-direct {v0, v3, v1, v2}, Lco/bird/android/model/constant/HabitatType;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lco/bird/android/model/constant/HabitatType;->CITY_DEMO:Lco/bird/android/model/constant/HabitatType;

    invoke-static {}, Lco/bird/android/model/constant/HabitatType;->$values()[Lco/bird/android/model/constant/HabitatType;

    move-result-object v0

    sput-object v0, Lco/bird/android/model/constant/HabitatType;->$VALUES:[Lco/bird/android/model/constant/HabitatType;

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

    iput-object p3, p0, Lco/bird/android/model/constant/HabitatType;->habitatId:Ljava/lang/String;

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lco/bird/android/model/constant/HabitatType;
    .locals 1

    const-class v0, Lco/bird/android/model/constant/HabitatType;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lco/bird/android/model/constant/HabitatType;

    return-object p0
.end method

.method public static values()[Lco/bird/android/model/constant/HabitatType;
    .locals 1

    sget-object v0, Lco/bird/android/model/constant/HabitatType;->$VALUES:[Lco/bird/android/model/constant/HabitatType;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lco/bird/android/model/constant/HabitatType;

    return-object v0
.end method


# virtual methods
.method public final getHabitatId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/constant/HabitatType;->habitatId:Ljava/lang/String;

    return-object v0
.end method
