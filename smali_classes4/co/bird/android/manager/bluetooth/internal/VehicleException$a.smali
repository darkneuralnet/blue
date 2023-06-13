.class public final enum Lco/bird/android/manager/bluetooth/internal/VehicleException$a;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lco/bird/android/manager/bluetooth/internal/VehicleException;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lco/bird/android/manager/bluetooth/internal/VehicleException$a;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0008\n\u0008\u0086\u0001\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003j\u0002\u0008\u0004j\u0002\u0008\u0005j\u0002\u0008\u0006j\u0002\u0008\u0007j\u0002\u0008\u0008j\u0002\u0008\tj\u0002\u0008\n\u00a8\u0006\u000b"
    }
    d2 = {
        "Lco/bird/android/manager/bluetooth/internal/VehicleException$a;",
        "",
        "<init>",
        "(Ljava/lang/String;I)V",
        "b",
        "c",
        "d",
        "e",
        "f",
        "g",
        "h",
        "bluetooth_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# static fields
.field public static final enum b:Lco/bird/android/manager/bluetooth/internal/VehicleException$a;

.field public static final enum c:Lco/bird/android/manager/bluetooth/internal/VehicleException$a;

.field public static final enum d:Lco/bird/android/manager/bluetooth/internal/VehicleException$a;

.field public static final enum e:Lco/bird/android/manager/bluetooth/internal/VehicleException$a;

.field public static final enum f:Lco/bird/android/manager/bluetooth/internal/VehicleException$a;

.field public static final enum g:Lco/bird/android/manager/bluetooth/internal/VehicleException$a;

.field public static final enum h:Lco/bird/android/manager/bluetooth/internal/VehicleException$a;

.field public static final synthetic i:[Lco/bird/android/manager/bluetooth/internal/VehicleException$a;


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    new-instance v0, Lco/bird/android/manager/bluetooth/internal/VehicleException$a;

    const-string v1, "ON_READ_LOCK"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lco/bird/android/manager/bluetooth/internal/VehicleException$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lco/bird/android/manager/bluetooth/internal/VehicleException$a;->b:Lco/bird/android/manager/bluetooth/internal/VehicleException$a;

    new-instance v0, Lco/bird/android/manager/bluetooth/internal/VehicleException$a;

    const-string v1, "ON_READ_AUTH"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lco/bird/android/manager/bluetooth/internal/VehicleException$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lco/bird/android/manager/bluetooth/internal/VehicleException$a;->c:Lco/bird/android/manager/bluetooth/internal/VehicleException$a;

    new-instance v0, Lco/bird/android/manager/bluetooth/internal/VehicleException$a;

    const-string v1, "ON_READ_UNKNOWN"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lco/bird/android/manager/bluetooth/internal/VehicleException$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lco/bird/android/manager/bluetooth/internal/VehicleException$a;->d:Lco/bird/android/manager/bluetooth/internal/VehicleException$a;

    new-instance v0, Lco/bird/android/manager/bluetooth/internal/VehicleException$a;

    const-string v1, "READ"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lco/bird/android/manager/bluetooth/internal/VehicleException$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lco/bird/android/manager/bluetooth/internal/VehicleException$a;->e:Lco/bird/android/manager/bluetooth/internal/VehicleException$a;

    new-instance v0, Lco/bird/android/manager/bluetooth/internal/VehicleException$a;

    const-string v1, "WRITE"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2}, Lco/bird/android/manager/bluetooth/internal/VehicleException$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lco/bird/android/manager/bluetooth/internal/VehicleException$a;->f:Lco/bird/android/manager/bluetooth/internal/VehicleException$a;

    new-instance v0, Lco/bird/android/manager/bluetooth/internal/VehicleException$a;

    const-string v1, "DISCOVERY"

    const/4 v2, 0x5

    invoke-direct {v0, v1, v2}, Lco/bird/android/manager/bluetooth/internal/VehicleException$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lco/bird/android/manager/bluetooth/internal/VehicleException$a;->g:Lco/bird/android/manager/bluetooth/internal/VehicleException$a;

    new-instance v0, Lco/bird/android/manager/bluetooth/internal/VehicleException$a;

    const-string v1, "CONNECTION"

    const/4 v2, 0x6

    invoke-direct {v0, v1, v2}, Lco/bird/android/manager/bluetooth/internal/VehicleException$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lco/bird/android/manager/bluetooth/internal/VehicleException$a;->h:Lco/bird/android/manager/bluetooth/internal/VehicleException$a;

    invoke-static {}, Lco/bird/android/manager/bluetooth/internal/VehicleException$a;->a()[Lco/bird/android/manager/bluetooth/internal/VehicleException$a;

    move-result-object v0

    sput-object v0, Lco/bird/android/manager/bluetooth/internal/VehicleException$a;->i:[Lco/bird/android/manager/bluetooth/internal/VehicleException$a;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static final synthetic a()[Lco/bird/android/manager/bluetooth/internal/VehicleException$a;
    .locals 3

    const/4 v0, 0x7

    new-array v0, v0, [Lco/bird/android/manager/bluetooth/internal/VehicleException$a;

    const/4 v1, 0x0

    sget-object v2, Lco/bird/android/manager/bluetooth/internal/VehicleException$a;->b:Lco/bird/android/manager/bluetooth/internal/VehicleException$a;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    sget-object v2, Lco/bird/android/manager/bluetooth/internal/VehicleException$a;->c:Lco/bird/android/manager/bluetooth/internal/VehicleException$a;

    aput-object v2, v0, v1

    const/4 v1, 0x2

    sget-object v2, Lco/bird/android/manager/bluetooth/internal/VehicleException$a;->d:Lco/bird/android/manager/bluetooth/internal/VehicleException$a;

    aput-object v2, v0, v1

    const/4 v1, 0x3

    sget-object v2, Lco/bird/android/manager/bluetooth/internal/VehicleException$a;->e:Lco/bird/android/manager/bluetooth/internal/VehicleException$a;

    aput-object v2, v0, v1

    const/4 v1, 0x4

    sget-object v2, Lco/bird/android/manager/bluetooth/internal/VehicleException$a;->f:Lco/bird/android/manager/bluetooth/internal/VehicleException$a;

    aput-object v2, v0, v1

    const/4 v1, 0x5

    sget-object v2, Lco/bird/android/manager/bluetooth/internal/VehicleException$a;->g:Lco/bird/android/manager/bluetooth/internal/VehicleException$a;

    aput-object v2, v0, v1

    const/4 v1, 0x6

    sget-object v2, Lco/bird/android/manager/bluetooth/internal/VehicleException$a;->h:Lco/bird/android/manager/bluetooth/internal/VehicleException$a;

    aput-object v2, v0, v1

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lco/bird/android/manager/bluetooth/internal/VehicleException$a;
    .locals 1

    const-class v0, Lco/bird/android/manager/bluetooth/internal/VehicleException$a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lco/bird/android/manager/bluetooth/internal/VehicleException$a;

    return-object p0
.end method

.method public static values()[Lco/bird/android/manager/bluetooth/internal/VehicleException$a;
    .locals 1

    sget-object v0, Lco/bird/android/manager/bluetooth/internal/VehicleException$a;->i:[Lco/bird/android/manager/bluetooth/internal/VehicleException$a;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lco/bird/android/manager/bluetooth/internal/VehicleException$a;

    return-object v0
.end method
