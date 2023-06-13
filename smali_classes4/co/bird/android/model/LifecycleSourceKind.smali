.class public final enum Lco/bird/android/model/LifecycleSourceKind;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lco/bird/android/model/LifecycleSourceKind;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u000c\u0008\u0086\u0001\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0002J\u0008\u0010\u0003\u001a\u00020\u0004H\u0016j\u0002\u0008\u0005j\u0002\u0008\u0006j\u0002\u0008\u0007j\u0002\u0008\u0008j\u0002\u0008\tj\u0002\u0008\nj\u0002\u0008\u000bj\u0002\u0008\u000cj\u0002\u0008\rj\u0002\u0008\u000ej\u0002\u0008\u000f\u00a8\u0006\u0010"
    }
    d2 = {
        "Lco/bird/android/model/LifecycleSourceKind;",
        "",
        "(Ljava/lang/String;I)V",
        "toString",
        "",
        "ADMIN",
        "COMPLAINT",
        "EVENT",
        "INSPECTION",
        "JOB",
        "PARTNER_OPERATOR",
        "RIDE",
        "SCAN",
        "STICKER",
        "TASK",
        "TRACK",
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
.field private static final synthetic $VALUES:[Lco/bird/android/model/LifecycleSourceKind;

.field public static final enum ADMIN:Lco/bird/android/model/LifecycleSourceKind;

.field public static final enum COMPLAINT:Lco/bird/android/model/LifecycleSourceKind;

.field public static final enum EVENT:Lco/bird/android/model/LifecycleSourceKind;

.field public static final enum INSPECTION:Lco/bird/android/model/LifecycleSourceKind;

.field public static final enum JOB:Lco/bird/android/model/LifecycleSourceKind;

.field public static final enum PARTNER_OPERATOR:Lco/bird/android/model/LifecycleSourceKind;

.field public static final enum RIDE:Lco/bird/android/model/LifecycleSourceKind;

.field public static final enum SCAN:Lco/bird/android/model/LifecycleSourceKind;

.field public static final enum STICKER:Lco/bird/android/model/LifecycleSourceKind;

.field public static final enum TASK:Lco/bird/android/model/LifecycleSourceKind;

.field public static final enum TRACK:Lco/bird/android/model/LifecycleSourceKind;


# direct methods
.method private static final synthetic $values()[Lco/bird/android/model/LifecycleSourceKind;
    .locals 3

    const/16 v0, 0xb

    new-array v0, v0, [Lco/bird/android/model/LifecycleSourceKind;

    const/4 v1, 0x0

    sget-object v2, Lco/bird/android/model/LifecycleSourceKind;->ADMIN:Lco/bird/android/model/LifecycleSourceKind;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    sget-object v2, Lco/bird/android/model/LifecycleSourceKind;->COMPLAINT:Lco/bird/android/model/LifecycleSourceKind;

    aput-object v2, v0, v1

    const/4 v1, 0x2

    sget-object v2, Lco/bird/android/model/LifecycleSourceKind;->EVENT:Lco/bird/android/model/LifecycleSourceKind;

    aput-object v2, v0, v1

    const/4 v1, 0x3

    sget-object v2, Lco/bird/android/model/LifecycleSourceKind;->INSPECTION:Lco/bird/android/model/LifecycleSourceKind;

    aput-object v2, v0, v1

    const/4 v1, 0x4

    sget-object v2, Lco/bird/android/model/LifecycleSourceKind;->JOB:Lco/bird/android/model/LifecycleSourceKind;

    aput-object v2, v0, v1

    const/4 v1, 0x5

    sget-object v2, Lco/bird/android/model/LifecycleSourceKind;->PARTNER_OPERATOR:Lco/bird/android/model/LifecycleSourceKind;

    aput-object v2, v0, v1

    const/4 v1, 0x6

    sget-object v2, Lco/bird/android/model/LifecycleSourceKind;->RIDE:Lco/bird/android/model/LifecycleSourceKind;

    aput-object v2, v0, v1

    const/4 v1, 0x7

    sget-object v2, Lco/bird/android/model/LifecycleSourceKind;->SCAN:Lco/bird/android/model/LifecycleSourceKind;

    aput-object v2, v0, v1

    const/16 v1, 0x8

    sget-object v2, Lco/bird/android/model/LifecycleSourceKind;->STICKER:Lco/bird/android/model/LifecycleSourceKind;

    aput-object v2, v0, v1

    const/16 v1, 0x9

    sget-object v2, Lco/bird/android/model/LifecycleSourceKind;->TASK:Lco/bird/android/model/LifecycleSourceKind;

    aput-object v2, v0, v1

    const/16 v1, 0xa

    sget-object v2, Lco/bird/android/model/LifecycleSourceKind;->TRACK:Lco/bird/android/model/LifecycleSourceKind;

    aput-object v2, v0, v1

    return-object v0
.end method

.method public static constructor <clinit>()V
    .locals 3

    new-instance v0, Lco/bird/android/model/LifecycleSourceKind;

    const-string v1, "ADMIN"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lco/bird/android/model/LifecycleSourceKind;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lco/bird/android/model/LifecycleSourceKind;->ADMIN:Lco/bird/android/model/LifecycleSourceKind;

    new-instance v0, Lco/bird/android/model/LifecycleSourceKind;

    const-string v1, "COMPLAINT"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lco/bird/android/model/LifecycleSourceKind;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lco/bird/android/model/LifecycleSourceKind;->COMPLAINT:Lco/bird/android/model/LifecycleSourceKind;

    new-instance v0, Lco/bird/android/model/LifecycleSourceKind;

    const-string v1, "EVENT"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lco/bird/android/model/LifecycleSourceKind;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lco/bird/android/model/LifecycleSourceKind;->EVENT:Lco/bird/android/model/LifecycleSourceKind;

    new-instance v0, Lco/bird/android/model/LifecycleSourceKind;

    const-string v1, "INSPECTION"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lco/bird/android/model/LifecycleSourceKind;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lco/bird/android/model/LifecycleSourceKind;->INSPECTION:Lco/bird/android/model/LifecycleSourceKind;

    new-instance v0, Lco/bird/android/model/LifecycleSourceKind;

    const-string v1, "JOB"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2}, Lco/bird/android/model/LifecycleSourceKind;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lco/bird/android/model/LifecycleSourceKind;->JOB:Lco/bird/android/model/LifecycleSourceKind;

    new-instance v0, Lco/bird/android/model/LifecycleSourceKind;

    const-string v1, "PARTNER_OPERATOR"

    const/4 v2, 0x5

    invoke-direct {v0, v1, v2}, Lco/bird/android/model/LifecycleSourceKind;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lco/bird/android/model/LifecycleSourceKind;->PARTNER_OPERATOR:Lco/bird/android/model/LifecycleSourceKind;

    new-instance v0, Lco/bird/android/model/LifecycleSourceKind;

    const-string v1, "RIDE"

    const/4 v2, 0x6

    invoke-direct {v0, v1, v2}, Lco/bird/android/model/LifecycleSourceKind;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lco/bird/android/model/LifecycleSourceKind;->RIDE:Lco/bird/android/model/LifecycleSourceKind;

    new-instance v0, Lco/bird/android/model/LifecycleSourceKind;

    const-string v1, "SCAN"

    const/4 v2, 0x7

    invoke-direct {v0, v1, v2}, Lco/bird/android/model/LifecycleSourceKind;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lco/bird/android/model/LifecycleSourceKind;->SCAN:Lco/bird/android/model/LifecycleSourceKind;

    new-instance v0, Lco/bird/android/model/LifecycleSourceKind;

    const-string v1, "STICKER"

    const/16 v2, 0x8

    invoke-direct {v0, v1, v2}, Lco/bird/android/model/LifecycleSourceKind;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lco/bird/android/model/LifecycleSourceKind;->STICKER:Lco/bird/android/model/LifecycleSourceKind;

    new-instance v0, Lco/bird/android/model/LifecycleSourceKind;

    const-string v1, "TASK"

    const/16 v2, 0x9

    invoke-direct {v0, v1, v2}, Lco/bird/android/model/LifecycleSourceKind;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lco/bird/android/model/LifecycleSourceKind;->TASK:Lco/bird/android/model/LifecycleSourceKind;

    new-instance v0, Lco/bird/android/model/LifecycleSourceKind;

    const-string v1, "TRACK"

    const/16 v2, 0xa

    invoke-direct {v0, v1, v2}, Lco/bird/android/model/LifecycleSourceKind;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lco/bird/android/model/LifecycleSourceKind;->TRACK:Lco/bird/android/model/LifecycleSourceKind;

    invoke-static {}, Lco/bird/android/model/LifecycleSourceKind;->$values()[Lco/bird/android/model/LifecycleSourceKind;

    move-result-object v0

    sput-object v0, Lco/bird/android/model/LifecycleSourceKind;->$VALUES:[Lco/bird/android/model/LifecycleSourceKind;

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

.method public static valueOf(Ljava/lang/String;)Lco/bird/android/model/LifecycleSourceKind;
    .locals 1

    const-class v0, Lco/bird/android/model/LifecycleSourceKind;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lco/bird/android/model/LifecycleSourceKind;

    return-object p0
.end method

.method public static values()[Lco/bird/android/model/LifecycleSourceKind;
    .locals 1

    sget-object v0, Lco/bird/android/model/LifecycleSourceKind;->$VALUES:[Lco/bird/android/model/LifecycleSourceKind;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lco/bird/android/model/LifecycleSourceKind;

    return-object v0
.end method


# virtual methods
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
