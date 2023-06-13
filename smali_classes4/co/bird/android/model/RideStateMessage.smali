.class public final enum Lco/bird/android/model/RideStateMessage;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lco/bird/android/model/RideStateMessage;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0008\u0008\u0086\u0001\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\u0008\u0002\u0012\u0008\u0008\u0001\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0005\u0010\u0006j\u0002\u0008\u0007j\u0002\u0008\u0008j\u0002\u0008\tj\u0002\u0008\n\u00a8\u0006\u000b"
    }
    d2 = {
        "Lco/bird/android/model/RideStateMessage;",
        "",
        "text",
        "",
        "(Ljava/lang/String;II)V",
        "getText",
        "()I",
        "UNLOCKING",
        "LOCKING",
        "LOCKED",
        "RIDE_STARTED",
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
.field private static final synthetic $VALUES:[Lco/bird/android/model/RideStateMessage;

.field public static final enum LOCKED:Lco/bird/android/model/RideStateMessage;

.field public static final enum LOCKING:Lco/bird/android/model/RideStateMessage;

.field public static final enum RIDE_STARTED:Lco/bird/android/model/RideStateMessage;

.field public static final enum UNLOCKING:Lco/bird/android/model/RideStateMessage;


# instance fields
.field private final text:I


# direct methods
.method private static final synthetic $values()[Lco/bird/android/model/RideStateMessage;
    .locals 3

    const/4 v0, 0x4

    new-array v0, v0, [Lco/bird/android/model/RideStateMessage;

    const/4 v1, 0x0

    sget-object v2, Lco/bird/android/model/RideStateMessage;->UNLOCKING:Lco/bird/android/model/RideStateMessage;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    sget-object v2, Lco/bird/android/model/RideStateMessage;->LOCKING:Lco/bird/android/model/RideStateMessage;

    aput-object v2, v0, v1

    const/4 v1, 0x2

    sget-object v2, Lco/bird/android/model/RideStateMessage;->LOCKED:Lco/bird/android/model/RideStateMessage;

    aput-object v2, v0, v1

    const/4 v1, 0x3

    sget-object v2, Lco/bird/android/model/RideStateMessage;->RIDE_STARTED:Lco/bird/android/model/RideStateMessage;

    aput-object v2, v0, v1

    return-object v0
.end method

.method public static constructor <clinit>()V
    .locals 4

    new-instance v0, Lco/bird/android/model/RideStateMessage;

    const/4 v1, 0x0

    sget v2, Lnl4;->ride_unlocking:I

    const-string v3, "UNLOCKING"

    invoke-direct {v0, v3, v1, v2}, Lco/bird/android/model/RideStateMessage;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lco/bird/android/model/RideStateMessage;->UNLOCKING:Lco/bird/android/model/RideStateMessage;

    new-instance v0, Lco/bird/android/model/RideStateMessage;

    const/4 v1, 0x1

    sget v2, Lnl4;->ride_locking:I

    const-string v3, "LOCKING"

    invoke-direct {v0, v3, v1, v2}, Lco/bird/android/model/RideStateMessage;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lco/bird/android/model/RideStateMessage;->LOCKING:Lco/bird/android/model/RideStateMessage;

    new-instance v0, Lco/bird/android/model/RideStateMessage;

    const/4 v1, 0x2

    sget v2, Lnl4;->ride_locked:I

    const-string v3, "LOCKED"

    invoke-direct {v0, v3, v1, v2}, Lco/bird/android/model/RideStateMessage;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lco/bird/android/model/RideStateMessage;->LOCKED:Lco/bird/android/model/RideStateMessage;

    new-instance v0, Lco/bird/android/model/RideStateMessage;

    const/4 v1, 0x3

    sget v2, Lnl4;->ride_started:I

    const-string v3, "RIDE_STARTED"

    invoke-direct {v0, v3, v1, v2}, Lco/bird/android/model/RideStateMessage;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lco/bird/android/model/RideStateMessage;->RIDE_STARTED:Lco/bird/android/model/RideStateMessage;

    invoke-static {}, Lco/bird/android/model/RideStateMessage;->$values()[Lco/bird/android/model/RideStateMessage;

    move-result-object v0

    sput-object v0, Lco/bird/android/model/RideStateMessage;->$VALUES:[Lco/bird/android/model/RideStateMessage;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;II)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput p3, p0, Lco/bird/android/model/RideStateMessage;->text:I

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lco/bird/android/model/RideStateMessage;
    .locals 1

    const-class v0, Lco/bird/android/model/RideStateMessage;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lco/bird/android/model/RideStateMessage;

    return-object p0
.end method

.method public static values()[Lco/bird/android/model/RideStateMessage;
    .locals 1

    sget-object v0, Lco/bird/android/model/RideStateMessage;->$VALUES:[Lco/bird/android/model/RideStateMessage;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lco/bird/android/model/RideStateMessage;

    return-object v0
.end method


# virtual methods
.method public final getText()I
    .locals 1

    iget v0, p0, Lco/bird/android/model/RideStateMessage;->text:I

    return v0
.end method
