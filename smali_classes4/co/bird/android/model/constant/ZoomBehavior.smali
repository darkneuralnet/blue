.class public final enum Lco/bird/android/model/constant/ZoomBehavior;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lco/bird/android/model/constant/ZoomBehavior;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0008\n\u0008\u0086\u0001\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\u0008\u0003j\u0002\u0008\u0004j\u0002\u0008\u0005j\u0002\u0008\u0006j\u0002\u0008\u0007j\u0002\u0008\u0008j\u0002\u0008\tj\u0002\u0008\n\u00a8\u0006\u000b"
    }
    d2 = {
        "Lco/bird/android/model/constant/ZoomBehavior;",
        "",
        "(Ljava/lang/String;I)V",
        "ALWAYS_VISIBLE",
        "ALWAYS_HIDDEN",
        "VISIBLE_ONLY_WHEN_INSIDE",
        "VISIBLE_WHEN_ZOOMED_OUT",
        "VISIBLE_WHEN_ZOOMED_IN",
        "VISIBLE_WHEN_ZOOMED_IN_OR_INSIDE",
        "VISIBLE_WHEN_ZOOMED_OUT_OR_INSIDE",
        "NO_FILL_WHEN_ZOOMED_IN",
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
.field private static final synthetic $VALUES:[Lco/bird/android/model/constant/ZoomBehavior;

.field public static final enum ALWAYS_HIDDEN:Lco/bird/android/model/constant/ZoomBehavior;

.field public static final enum ALWAYS_VISIBLE:Lco/bird/android/model/constant/ZoomBehavior;

.field public static final enum NO_FILL_WHEN_ZOOMED_IN:Lco/bird/android/model/constant/ZoomBehavior;

.field public static final enum VISIBLE_ONLY_WHEN_INSIDE:Lco/bird/android/model/constant/ZoomBehavior;

.field public static final enum VISIBLE_WHEN_ZOOMED_IN:Lco/bird/android/model/constant/ZoomBehavior;

.field public static final enum VISIBLE_WHEN_ZOOMED_IN_OR_INSIDE:Lco/bird/android/model/constant/ZoomBehavior;

.field public static final enum VISIBLE_WHEN_ZOOMED_OUT:Lco/bird/android/model/constant/ZoomBehavior;

.field public static final enum VISIBLE_WHEN_ZOOMED_OUT_OR_INSIDE:Lco/bird/android/model/constant/ZoomBehavior;


# direct methods
.method private static final synthetic $values()[Lco/bird/android/model/constant/ZoomBehavior;
    .locals 3

    const/16 v0, 0x8

    new-array v0, v0, [Lco/bird/android/model/constant/ZoomBehavior;

    const/4 v1, 0x0

    sget-object v2, Lco/bird/android/model/constant/ZoomBehavior;->ALWAYS_VISIBLE:Lco/bird/android/model/constant/ZoomBehavior;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    sget-object v2, Lco/bird/android/model/constant/ZoomBehavior;->ALWAYS_HIDDEN:Lco/bird/android/model/constant/ZoomBehavior;

    aput-object v2, v0, v1

    const/4 v1, 0x2

    sget-object v2, Lco/bird/android/model/constant/ZoomBehavior;->VISIBLE_ONLY_WHEN_INSIDE:Lco/bird/android/model/constant/ZoomBehavior;

    aput-object v2, v0, v1

    const/4 v1, 0x3

    sget-object v2, Lco/bird/android/model/constant/ZoomBehavior;->VISIBLE_WHEN_ZOOMED_OUT:Lco/bird/android/model/constant/ZoomBehavior;

    aput-object v2, v0, v1

    const/4 v1, 0x4

    sget-object v2, Lco/bird/android/model/constant/ZoomBehavior;->VISIBLE_WHEN_ZOOMED_IN:Lco/bird/android/model/constant/ZoomBehavior;

    aput-object v2, v0, v1

    const/4 v1, 0x5

    sget-object v2, Lco/bird/android/model/constant/ZoomBehavior;->VISIBLE_WHEN_ZOOMED_IN_OR_INSIDE:Lco/bird/android/model/constant/ZoomBehavior;

    aput-object v2, v0, v1

    const/4 v1, 0x6

    sget-object v2, Lco/bird/android/model/constant/ZoomBehavior;->VISIBLE_WHEN_ZOOMED_OUT_OR_INSIDE:Lco/bird/android/model/constant/ZoomBehavior;

    aput-object v2, v0, v1

    const/4 v1, 0x7

    sget-object v2, Lco/bird/android/model/constant/ZoomBehavior;->NO_FILL_WHEN_ZOOMED_IN:Lco/bird/android/model/constant/ZoomBehavior;

    aput-object v2, v0, v1

    return-object v0
.end method

.method public static constructor <clinit>()V
    .locals 3

    new-instance v0, Lco/bird/android/model/constant/ZoomBehavior;

    const-string v1, "ALWAYS_VISIBLE"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lco/bird/android/model/constant/ZoomBehavior;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lco/bird/android/model/constant/ZoomBehavior;->ALWAYS_VISIBLE:Lco/bird/android/model/constant/ZoomBehavior;

    new-instance v0, Lco/bird/android/model/constant/ZoomBehavior;

    const-string v1, "ALWAYS_HIDDEN"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lco/bird/android/model/constant/ZoomBehavior;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lco/bird/android/model/constant/ZoomBehavior;->ALWAYS_HIDDEN:Lco/bird/android/model/constant/ZoomBehavior;

    new-instance v0, Lco/bird/android/model/constant/ZoomBehavior;

    const-string v1, "VISIBLE_ONLY_WHEN_INSIDE"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lco/bird/android/model/constant/ZoomBehavior;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lco/bird/android/model/constant/ZoomBehavior;->VISIBLE_ONLY_WHEN_INSIDE:Lco/bird/android/model/constant/ZoomBehavior;

    new-instance v0, Lco/bird/android/model/constant/ZoomBehavior;

    const-string v1, "VISIBLE_WHEN_ZOOMED_OUT"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lco/bird/android/model/constant/ZoomBehavior;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lco/bird/android/model/constant/ZoomBehavior;->VISIBLE_WHEN_ZOOMED_OUT:Lco/bird/android/model/constant/ZoomBehavior;

    new-instance v0, Lco/bird/android/model/constant/ZoomBehavior;

    const-string v1, "VISIBLE_WHEN_ZOOMED_IN"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2}, Lco/bird/android/model/constant/ZoomBehavior;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lco/bird/android/model/constant/ZoomBehavior;->VISIBLE_WHEN_ZOOMED_IN:Lco/bird/android/model/constant/ZoomBehavior;

    new-instance v0, Lco/bird/android/model/constant/ZoomBehavior;

    const-string v1, "VISIBLE_WHEN_ZOOMED_IN_OR_INSIDE"

    const/4 v2, 0x5

    invoke-direct {v0, v1, v2}, Lco/bird/android/model/constant/ZoomBehavior;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lco/bird/android/model/constant/ZoomBehavior;->VISIBLE_WHEN_ZOOMED_IN_OR_INSIDE:Lco/bird/android/model/constant/ZoomBehavior;

    new-instance v0, Lco/bird/android/model/constant/ZoomBehavior;

    const-string v1, "VISIBLE_WHEN_ZOOMED_OUT_OR_INSIDE"

    const/4 v2, 0x6

    invoke-direct {v0, v1, v2}, Lco/bird/android/model/constant/ZoomBehavior;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lco/bird/android/model/constant/ZoomBehavior;->VISIBLE_WHEN_ZOOMED_OUT_OR_INSIDE:Lco/bird/android/model/constant/ZoomBehavior;

    new-instance v0, Lco/bird/android/model/constant/ZoomBehavior;

    const-string v1, "NO_FILL_WHEN_ZOOMED_IN"

    const/4 v2, 0x7

    invoke-direct {v0, v1, v2}, Lco/bird/android/model/constant/ZoomBehavior;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lco/bird/android/model/constant/ZoomBehavior;->NO_FILL_WHEN_ZOOMED_IN:Lco/bird/android/model/constant/ZoomBehavior;

    invoke-static {}, Lco/bird/android/model/constant/ZoomBehavior;->$values()[Lco/bird/android/model/constant/ZoomBehavior;

    move-result-object v0

    sput-object v0, Lco/bird/android/model/constant/ZoomBehavior;->$VALUES:[Lco/bird/android/model/constant/ZoomBehavior;

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

.method public static valueOf(Ljava/lang/String;)Lco/bird/android/model/constant/ZoomBehavior;
    .locals 1

    const-class v0, Lco/bird/android/model/constant/ZoomBehavior;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lco/bird/android/model/constant/ZoomBehavior;

    return-object p0
.end method

.method public static values()[Lco/bird/android/model/constant/ZoomBehavior;
    .locals 1

    sget-object v0, Lco/bird/android/model/constant/ZoomBehavior;->$VALUES:[Lco/bird/android/model/constant/ZoomBehavior;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lco/bird/android/model/constant/ZoomBehavior;

    return-object v0
.end method
