.class public final enum Lco/bird/android/model/persistence/nestedstructures/FleetMarkerPinShape;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lco/bird/android/model/persistence/nestedstructures/FleetMarkerPinShape$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lco/bird/android/model/persistence/nestedstructures/FleetMarkerPinShape;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0008\u0007\u0008\u0086\u0001\u0018\u0000 \u00072\u0008\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0007B\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\u0008\u0003j\u0002\u0008\u0004j\u0002\u0008\u0005j\u0002\u0008\u0006\u00a8\u0006\u0008"
    }
    d2 = {
        "Lco/bird/android/model/persistence/nestedstructures/FleetMarkerPinShape;",
        "",
        "(Ljava/lang/String;I)V",
        "CIRCLE",
        "CIRCLE_NO_ANCHOR",
        "SQUARE",
        "TEARDROP",
        "Companion",
        "model-persistence_release"
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
.field private static final synthetic $VALUES:[Lco/bird/android/model/persistence/nestedstructures/FleetMarkerPinShape;

.field public static final enum CIRCLE:Lco/bird/android/model/persistence/nestedstructures/FleetMarkerPinShape;
    .annotation runtime Lco/bird/android/model/constant/annotation/SerializedEnumDefault;
    .end annotation
.end field

.field public static final enum CIRCLE_NO_ANCHOR:Lco/bird/android/model/persistence/nestedstructures/FleetMarkerPinShape;

.field public static final Companion:Lco/bird/android/model/persistence/nestedstructures/FleetMarkerPinShape$Companion;

.field public static final enum SQUARE:Lco/bird/android/model/persistence/nestedstructures/FleetMarkerPinShape;

.field public static final enum TEARDROP:Lco/bird/android/model/persistence/nestedstructures/FleetMarkerPinShape;


# direct methods
.method private static final synthetic $values()[Lco/bird/android/model/persistence/nestedstructures/FleetMarkerPinShape;
    .locals 3

    const/4 v0, 0x4

    new-array v0, v0, [Lco/bird/android/model/persistence/nestedstructures/FleetMarkerPinShape;

    const/4 v1, 0x0

    sget-object v2, Lco/bird/android/model/persistence/nestedstructures/FleetMarkerPinShape;->CIRCLE:Lco/bird/android/model/persistence/nestedstructures/FleetMarkerPinShape;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    sget-object v2, Lco/bird/android/model/persistence/nestedstructures/FleetMarkerPinShape;->CIRCLE_NO_ANCHOR:Lco/bird/android/model/persistence/nestedstructures/FleetMarkerPinShape;

    aput-object v2, v0, v1

    const/4 v1, 0x2

    sget-object v2, Lco/bird/android/model/persistence/nestedstructures/FleetMarkerPinShape;->SQUARE:Lco/bird/android/model/persistence/nestedstructures/FleetMarkerPinShape;

    aput-object v2, v0, v1

    const/4 v1, 0x3

    sget-object v2, Lco/bird/android/model/persistence/nestedstructures/FleetMarkerPinShape;->TEARDROP:Lco/bird/android/model/persistence/nestedstructures/FleetMarkerPinShape;

    aput-object v2, v0, v1

    return-object v0
.end method

.method public static constructor <clinit>()V
    .locals 3

    new-instance v0, Lco/bird/android/model/persistence/nestedstructures/FleetMarkerPinShape;

    const-string v1, "CIRCLE"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lco/bird/android/model/persistence/nestedstructures/FleetMarkerPinShape;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lco/bird/android/model/persistence/nestedstructures/FleetMarkerPinShape;->CIRCLE:Lco/bird/android/model/persistence/nestedstructures/FleetMarkerPinShape;

    new-instance v0, Lco/bird/android/model/persistence/nestedstructures/FleetMarkerPinShape;

    const-string v1, "CIRCLE_NO_ANCHOR"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lco/bird/android/model/persistence/nestedstructures/FleetMarkerPinShape;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lco/bird/android/model/persistence/nestedstructures/FleetMarkerPinShape;->CIRCLE_NO_ANCHOR:Lco/bird/android/model/persistence/nestedstructures/FleetMarkerPinShape;

    new-instance v0, Lco/bird/android/model/persistence/nestedstructures/FleetMarkerPinShape;

    const-string v1, "SQUARE"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lco/bird/android/model/persistence/nestedstructures/FleetMarkerPinShape;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lco/bird/android/model/persistence/nestedstructures/FleetMarkerPinShape;->SQUARE:Lco/bird/android/model/persistence/nestedstructures/FleetMarkerPinShape;

    new-instance v0, Lco/bird/android/model/persistence/nestedstructures/FleetMarkerPinShape;

    const-string v1, "TEARDROP"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lco/bird/android/model/persistence/nestedstructures/FleetMarkerPinShape;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lco/bird/android/model/persistence/nestedstructures/FleetMarkerPinShape;->TEARDROP:Lco/bird/android/model/persistence/nestedstructures/FleetMarkerPinShape;

    invoke-static {}, Lco/bird/android/model/persistence/nestedstructures/FleetMarkerPinShape;->$values()[Lco/bird/android/model/persistence/nestedstructures/FleetMarkerPinShape;

    move-result-object v0

    sput-object v0, Lco/bird/android/model/persistence/nestedstructures/FleetMarkerPinShape;->$VALUES:[Lco/bird/android/model/persistence/nestedstructures/FleetMarkerPinShape;

    new-instance v0, Lco/bird/android/model/persistence/nestedstructures/FleetMarkerPinShape$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lco/bird/android/model/persistence/nestedstructures/FleetMarkerPinShape$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lco/bird/android/model/persistence/nestedstructures/FleetMarkerPinShape;->Companion:Lco/bird/android/model/persistence/nestedstructures/FleetMarkerPinShape$Companion;

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

.method public static valueOf(Ljava/lang/String;)Lco/bird/android/model/persistence/nestedstructures/FleetMarkerPinShape;
    .locals 1

    const-class v0, Lco/bird/android/model/persistence/nestedstructures/FleetMarkerPinShape;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lco/bird/android/model/persistence/nestedstructures/FleetMarkerPinShape;

    return-object p0
.end method

.method public static values()[Lco/bird/android/model/persistence/nestedstructures/FleetMarkerPinShape;
    .locals 1

    sget-object v0, Lco/bird/android/model/persistence/nestedstructures/FleetMarkerPinShape;->$VALUES:[Lco/bird/android/model/persistence/nestedstructures/FleetMarkerPinShape;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lco/bird/android/model/persistence/nestedstructures/FleetMarkerPinShape;

    return-object v0
.end method
