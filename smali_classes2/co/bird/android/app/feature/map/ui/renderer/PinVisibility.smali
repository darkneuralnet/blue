.class public final enum Lco/bird/android/app/feature/map/ui/renderer/PinVisibility;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lco/bird/android/app/feature/map/ui/renderer/PinVisibility;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0008\u0005\u0008\u0086\u0001\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\u0008\u0003j\u0002\u0008\u0004j\u0002\u0008\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "Lco/bird/android/app/feature/map/ui/renderer/PinVisibility;",
        "",
        "(Ljava/lang/String;I)V",
        "PIN_ONLY",
        "PIN_WITH_NAMES",
        "HIDDEN",
        "co.bird.android.feature.map"
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
.field private static final synthetic $VALUES:[Lco/bird/android/app/feature/map/ui/renderer/PinVisibility;

.field public static final enum HIDDEN:Lco/bird/android/app/feature/map/ui/renderer/PinVisibility;

.field public static final enum PIN_ONLY:Lco/bird/android/app/feature/map/ui/renderer/PinVisibility;

.field public static final enum PIN_WITH_NAMES:Lco/bird/android/app/feature/map/ui/renderer/PinVisibility;


# direct methods
.method private static final synthetic $values()[Lco/bird/android/app/feature/map/ui/renderer/PinVisibility;
    .locals 3

    const/4 v0, 0x3

    new-array v0, v0, [Lco/bird/android/app/feature/map/ui/renderer/PinVisibility;

    const/4 v1, 0x0

    sget-object v2, Lco/bird/android/app/feature/map/ui/renderer/PinVisibility;->PIN_ONLY:Lco/bird/android/app/feature/map/ui/renderer/PinVisibility;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    sget-object v2, Lco/bird/android/app/feature/map/ui/renderer/PinVisibility;->PIN_WITH_NAMES:Lco/bird/android/app/feature/map/ui/renderer/PinVisibility;

    aput-object v2, v0, v1

    const/4 v1, 0x2

    sget-object v2, Lco/bird/android/app/feature/map/ui/renderer/PinVisibility;->HIDDEN:Lco/bird/android/app/feature/map/ui/renderer/PinVisibility;

    aput-object v2, v0, v1

    return-object v0
.end method

.method public static constructor <clinit>()V
    .locals 3

    new-instance v0, Lco/bird/android/app/feature/map/ui/renderer/PinVisibility;

    const-string v1, "PIN_ONLY"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lco/bird/android/app/feature/map/ui/renderer/PinVisibility;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lco/bird/android/app/feature/map/ui/renderer/PinVisibility;->PIN_ONLY:Lco/bird/android/app/feature/map/ui/renderer/PinVisibility;

    new-instance v0, Lco/bird/android/app/feature/map/ui/renderer/PinVisibility;

    const-string v1, "PIN_WITH_NAMES"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lco/bird/android/app/feature/map/ui/renderer/PinVisibility;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lco/bird/android/app/feature/map/ui/renderer/PinVisibility;->PIN_WITH_NAMES:Lco/bird/android/app/feature/map/ui/renderer/PinVisibility;

    new-instance v0, Lco/bird/android/app/feature/map/ui/renderer/PinVisibility;

    const-string v1, "HIDDEN"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lco/bird/android/app/feature/map/ui/renderer/PinVisibility;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lco/bird/android/app/feature/map/ui/renderer/PinVisibility;->HIDDEN:Lco/bird/android/app/feature/map/ui/renderer/PinVisibility;

    invoke-static {}, Lco/bird/android/app/feature/map/ui/renderer/PinVisibility;->$values()[Lco/bird/android/app/feature/map/ui/renderer/PinVisibility;

    move-result-object v0

    sput-object v0, Lco/bird/android/app/feature/map/ui/renderer/PinVisibility;->$VALUES:[Lco/bird/android/app/feature/map/ui/renderer/PinVisibility;

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

.method public static valueOf(Ljava/lang/String;)Lco/bird/android/app/feature/map/ui/renderer/PinVisibility;
    .locals 1

    const-class v0, Lco/bird/android/app/feature/map/ui/renderer/PinVisibility;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lco/bird/android/app/feature/map/ui/renderer/PinVisibility;

    return-object p0
.end method

.method public static values()[Lco/bird/android/app/feature/map/ui/renderer/PinVisibility;
    .locals 1

    sget-object v0, Lco/bird/android/app/feature/map/ui/renderer/PinVisibility;->$VALUES:[Lco/bird/android/app/feature/map/ui/renderer/PinVisibility;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lco/bird/android/app/feature/map/ui/renderer/PinVisibility;

    return-object v0
.end method
