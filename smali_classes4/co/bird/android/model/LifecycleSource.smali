.class public final enum Lco/bird/android/model/LifecycleSource;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lco/bird/android/model/LifecycleSource;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\r\u0008\u0086\u0001\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0002J\u0008\u0010\u0003\u001a\u00020\u0004H\u0016j\u0002\u0008\u0005j\u0002\u0008\u0006j\u0002\u0008\u0007j\u0002\u0008\u0008j\u0002\u0008\tj\u0002\u0008\nj\u0002\u0008\u000bj\u0002\u0008\u000cj\u0002\u0008\rj\u0002\u0008\u000ej\u0002\u0008\u000fj\u0002\u0008\u0010\u00a8\u0006\u0011"
    }
    d2 = {
        "Lco/bird/android/model/LifecycleSource;",
        "",
        "(Ljava/lang/String;I)V",
        "toString",
        "",
        "ADMIN",
        "DATA_MODEL",
        "GIG_CONTRACTOR",
        "HOURLY_CONTRACTOR",
        "OTHER",
        "PARTNER_OPERATOR",
        "PARTNER_ADMIN",
        "RIDER",
        "TRACKS",
        "VEHICLE",
        "BLUETOOTH_TRACE",
        "JOB",
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
.field private static final synthetic $VALUES:[Lco/bird/android/model/LifecycleSource;

.field public static final enum ADMIN:Lco/bird/android/model/LifecycleSource;

.field public static final enum BLUETOOTH_TRACE:Lco/bird/android/model/LifecycleSource;

.field public static final enum DATA_MODEL:Lco/bird/android/model/LifecycleSource;

.field public static final enum GIG_CONTRACTOR:Lco/bird/android/model/LifecycleSource;

.field public static final enum HOURLY_CONTRACTOR:Lco/bird/android/model/LifecycleSource;

.field public static final enum JOB:Lco/bird/android/model/LifecycleSource;

.field public static final enum OTHER:Lco/bird/android/model/LifecycleSource;

.field public static final enum PARTNER_ADMIN:Lco/bird/android/model/LifecycleSource;

.field public static final enum PARTNER_OPERATOR:Lco/bird/android/model/LifecycleSource;

.field public static final enum RIDER:Lco/bird/android/model/LifecycleSource;

.field public static final enum TRACKS:Lco/bird/android/model/LifecycleSource;

.field public static final enum VEHICLE:Lco/bird/android/model/LifecycleSource;


# direct methods
.method private static final synthetic $values()[Lco/bird/android/model/LifecycleSource;
    .locals 3

    const/16 v0, 0xc

    new-array v0, v0, [Lco/bird/android/model/LifecycleSource;

    const/4 v1, 0x0

    sget-object v2, Lco/bird/android/model/LifecycleSource;->ADMIN:Lco/bird/android/model/LifecycleSource;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    sget-object v2, Lco/bird/android/model/LifecycleSource;->DATA_MODEL:Lco/bird/android/model/LifecycleSource;

    aput-object v2, v0, v1

    const/4 v1, 0x2

    sget-object v2, Lco/bird/android/model/LifecycleSource;->GIG_CONTRACTOR:Lco/bird/android/model/LifecycleSource;

    aput-object v2, v0, v1

    const/4 v1, 0x3

    sget-object v2, Lco/bird/android/model/LifecycleSource;->HOURLY_CONTRACTOR:Lco/bird/android/model/LifecycleSource;

    aput-object v2, v0, v1

    const/4 v1, 0x4

    sget-object v2, Lco/bird/android/model/LifecycleSource;->OTHER:Lco/bird/android/model/LifecycleSource;

    aput-object v2, v0, v1

    const/4 v1, 0x5

    sget-object v2, Lco/bird/android/model/LifecycleSource;->PARTNER_OPERATOR:Lco/bird/android/model/LifecycleSource;

    aput-object v2, v0, v1

    const/4 v1, 0x6

    sget-object v2, Lco/bird/android/model/LifecycleSource;->PARTNER_ADMIN:Lco/bird/android/model/LifecycleSource;

    aput-object v2, v0, v1

    const/4 v1, 0x7

    sget-object v2, Lco/bird/android/model/LifecycleSource;->RIDER:Lco/bird/android/model/LifecycleSource;

    aput-object v2, v0, v1

    const/16 v1, 0x8

    sget-object v2, Lco/bird/android/model/LifecycleSource;->TRACKS:Lco/bird/android/model/LifecycleSource;

    aput-object v2, v0, v1

    const/16 v1, 0x9

    sget-object v2, Lco/bird/android/model/LifecycleSource;->VEHICLE:Lco/bird/android/model/LifecycleSource;

    aput-object v2, v0, v1

    const/16 v1, 0xa

    sget-object v2, Lco/bird/android/model/LifecycleSource;->BLUETOOTH_TRACE:Lco/bird/android/model/LifecycleSource;

    aput-object v2, v0, v1

    const/16 v1, 0xb

    sget-object v2, Lco/bird/android/model/LifecycleSource;->JOB:Lco/bird/android/model/LifecycleSource;

    aput-object v2, v0, v1

    return-object v0
.end method

.method public static constructor <clinit>()V
    .locals 3

    new-instance v0, Lco/bird/android/model/LifecycleSource;

    const-string v1, "ADMIN"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lco/bird/android/model/LifecycleSource;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lco/bird/android/model/LifecycleSource;->ADMIN:Lco/bird/android/model/LifecycleSource;

    new-instance v0, Lco/bird/android/model/LifecycleSource;

    const-string v1, "DATA_MODEL"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lco/bird/android/model/LifecycleSource;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lco/bird/android/model/LifecycleSource;->DATA_MODEL:Lco/bird/android/model/LifecycleSource;

    new-instance v0, Lco/bird/android/model/LifecycleSource;

    const-string v1, "GIG_CONTRACTOR"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lco/bird/android/model/LifecycleSource;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lco/bird/android/model/LifecycleSource;->GIG_CONTRACTOR:Lco/bird/android/model/LifecycleSource;

    new-instance v0, Lco/bird/android/model/LifecycleSource;

    const-string v1, "HOURLY_CONTRACTOR"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lco/bird/android/model/LifecycleSource;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lco/bird/android/model/LifecycleSource;->HOURLY_CONTRACTOR:Lco/bird/android/model/LifecycleSource;

    new-instance v0, Lco/bird/android/model/LifecycleSource;

    const-string v1, "OTHER"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2}, Lco/bird/android/model/LifecycleSource;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lco/bird/android/model/LifecycleSource;->OTHER:Lco/bird/android/model/LifecycleSource;

    new-instance v0, Lco/bird/android/model/LifecycleSource;

    const-string v1, "PARTNER_OPERATOR"

    const/4 v2, 0x5

    invoke-direct {v0, v1, v2}, Lco/bird/android/model/LifecycleSource;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lco/bird/android/model/LifecycleSource;->PARTNER_OPERATOR:Lco/bird/android/model/LifecycleSource;

    new-instance v0, Lco/bird/android/model/LifecycleSource;

    const-string v1, "PARTNER_ADMIN"

    const/4 v2, 0x6

    invoke-direct {v0, v1, v2}, Lco/bird/android/model/LifecycleSource;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lco/bird/android/model/LifecycleSource;->PARTNER_ADMIN:Lco/bird/android/model/LifecycleSource;

    new-instance v0, Lco/bird/android/model/LifecycleSource;

    const-string v1, "RIDER"

    const/4 v2, 0x7

    invoke-direct {v0, v1, v2}, Lco/bird/android/model/LifecycleSource;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lco/bird/android/model/LifecycleSource;->RIDER:Lco/bird/android/model/LifecycleSource;

    new-instance v0, Lco/bird/android/model/LifecycleSource;

    const-string v1, "TRACKS"

    const/16 v2, 0x8

    invoke-direct {v0, v1, v2}, Lco/bird/android/model/LifecycleSource;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lco/bird/android/model/LifecycleSource;->TRACKS:Lco/bird/android/model/LifecycleSource;

    new-instance v0, Lco/bird/android/model/LifecycleSource;

    const-string v1, "VEHICLE"

    const/16 v2, 0x9

    invoke-direct {v0, v1, v2}, Lco/bird/android/model/LifecycleSource;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lco/bird/android/model/LifecycleSource;->VEHICLE:Lco/bird/android/model/LifecycleSource;

    new-instance v0, Lco/bird/android/model/LifecycleSource;

    const-string v1, "BLUETOOTH_TRACE"

    const/16 v2, 0xa

    invoke-direct {v0, v1, v2}, Lco/bird/android/model/LifecycleSource;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lco/bird/android/model/LifecycleSource;->BLUETOOTH_TRACE:Lco/bird/android/model/LifecycleSource;

    new-instance v0, Lco/bird/android/model/LifecycleSource;

    const-string v1, "JOB"

    const/16 v2, 0xb

    invoke-direct {v0, v1, v2}, Lco/bird/android/model/LifecycleSource;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lco/bird/android/model/LifecycleSource;->JOB:Lco/bird/android/model/LifecycleSource;

    invoke-static {}, Lco/bird/android/model/LifecycleSource;->$values()[Lco/bird/android/model/LifecycleSource;

    move-result-object v0

    sput-object v0, Lco/bird/android/model/LifecycleSource;->$VALUES:[Lco/bird/android/model/LifecycleSource;

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

.method public static valueOf(Ljava/lang/String;)Lco/bird/android/model/LifecycleSource;
    .locals 1

    const-class v0, Lco/bird/android/model/LifecycleSource;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lco/bird/android/model/LifecycleSource;

    return-object p0
.end method

.method public static values()[Lco/bird/android/model/LifecycleSource;
    .locals 1

    sget-object v0, Lco/bird/android/model/LifecycleSource;->$VALUES:[Lco/bird/android/model/LifecycleSource;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lco/bird/android/model/LifecycleSource;

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
