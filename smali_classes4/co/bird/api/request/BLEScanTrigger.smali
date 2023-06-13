.class public final enum Lco/bird/api/request/BLEScanTrigger;
.super Ljava/lang/Enum;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lco/bird/api/request/BLEScanTrigger;",
        ">;",
        "Landroid/os/Parcelable;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0087\u0001\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002B\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0003J\t\u0010\u0004\u001a\u00020\u0005H\u00d6\u0001J\u0019\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0008\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0005H\u00d6\u0001j\u0002\u0008\u000bj\u0002\u0008\u000cj\u0002\u0008\rj\u0002\u0008\u000e\u00a8\u0006\u000f"
    }
    d2 = {
        "Lco/bird/api/request/BLEScanTrigger;",
        "",
        "Landroid/os/Parcelable;",
        "(Ljava/lang/String;I)V",
        "describeContents",
        "",
        "writeToParcel",
        "",
        "parcel",
        "Landroid/os/Parcel;",
        "flags",
        "APP_LAUNCH",
        "PERIODIC",
        "BIRD_FINDER",
        "REMOTE_NOTIFICATION",
        "co.bird.android.api"
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
.field private static final synthetic $VALUES:[Lco/bird/api/request/BLEScanTrigger;

.field public static final enum APP_LAUNCH:Lco/bird/api/request/BLEScanTrigger;

.field public static final enum BIRD_FINDER:Lco/bird/api/request/BLEScanTrigger;

.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lco/bird/api/request/BLEScanTrigger;",
            ">;"
        }
    .end annotation
.end field

.field public static final enum PERIODIC:Lco/bird/api/request/BLEScanTrigger;

.field public static final enum REMOTE_NOTIFICATION:Lco/bird/api/request/BLEScanTrigger;


# direct methods
.method private static final synthetic $values()[Lco/bird/api/request/BLEScanTrigger;
    .locals 3

    const/4 v0, 0x4

    new-array v0, v0, [Lco/bird/api/request/BLEScanTrigger;

    const/4 v1, 0x0

    sget-object v2, Lco/bird/api/request/BLEScanTrigger;->APP_LAUNCH:Lco/bird/api/request/BLEScanTrigger;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    sget-object v2, Lco/bird/api/request/BLEScanTrigger;->PERIODIC:Lco/bird/api/request/BLEScanTrigger;

    aput-object v2, v0, v1

    const/4 v1, 0x2

    sget-object v2, Lco/bird/api/request/BLEScanTrigger;->BIRD_FINDER:Lco/bird/api/request/BLEScanTrigger;

    aput-object v2, v0, v1

    const/4 v1, 0x3

    sget-object v2, Lco/bird/api/request/BLEScanTrigger;->REMOTE_NOTIFICATION:Lco/bird/api/request/BLEScanTrigger;

    aput-object v2, v0, v1

    return-object v0
.end method

.method public static constructor <clinit>()V
    .locals 3

    new-instance v0, Lco/bird/api/request/BLEScanTrigger;

    const-string v1, "APP_LAUNCH"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lco/bird/api/request/BLEScanTrigger;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lco/bird/api/request/BLEScanTrigger;->APP_LAUNCH:Lco/bird/api/request/BLEScanTrigger;

    new-instance v0, Lco/bird/api/request/BLEScanTrigger;

    const-string v1, "PERIODIC"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lco/bird/api/request/BLEScanTrigger;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lco/bird/api/request/BLEScanTrigger;->PERIODIC:Lco/bird/api/request/BLEScanTrigger;

    new-instance v0, Lco/bird/api/request/BLEScanTrigger;

    const-string v1, "BIRD_FINDER"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lco/bird/api/request/BLEScanTrigger;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lco/bird/api/request/BLEScanTrigger;->BIRD_FINDER:Lco/bird/api/request/BLEScanTrigger;

    new-instance v0, Lco/bird/api/request/BLEScanTrigger;

    const-string v1, "REMOTE_NOTIFICATION"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lco/bird/api/request/BLEScanTrigger;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lco/bird/api/request/BLEScanTrigger;->REMOTE_NOTIFICATION:Lco/bird/api/request/BLEScanTrigger;

    invoke-static {}, Lco/bird/api/request/BLEScanTrigger;->$values()[Lco/bird/api/request/BLEScanTrigger;

    move-result-object v0

    sput-object v0, Lco/bird/api/request/BLEScanTrigger;->$VALUES:[Lco/bird/api/request/BLEScanTrigger;

    new-instance v0, Lco/bird/api/request/BLEScanTrigger$Creator;

    invoke-direct {v0}, Lco/bird/api/request/BLEScanTrigger$Creator;-><init>()V

    sput-object v0, Lco/bird/api/request/BLEScanTrigger;->CREATOR:Landroid/os/Parcelable$Creator;

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

.method public static valueOf(Ljava/lang/String;)Lco/bird/api/request/BLEScanTrigger;
    .locals 1

    const-class v0, Lco/bird/api/request/BLEScanTrigger;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lco/bird/api/request/BLEScanTrigger;

    return-object p0
.end method

.method public static values()[Lco/bird/api/request/BLEScanTrigger;
    .locals 1

    sget-object v0, Lco/bird/api/request/BLEScanTrigger;->$VALUES:[Lco/bird/api/request/BLEScanTrigger;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lco/bird/api/request/BLEScanTrigger;

    return-object v0
.end method


# virtual methods
.method public describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 0

    const-string p2, "out"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    return-void
.end method
