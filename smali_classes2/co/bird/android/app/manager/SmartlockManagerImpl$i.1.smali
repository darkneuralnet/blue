.class public final enum Lco/bird/android/app/manager/SmartlockManagerImpl$i;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lco/bird/android/app/manager/SmartlockManagerImpl;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "i"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lco/bird/android/app/manager/SmartlockManagerImpl$i;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0008\t\u0008\u0086\u0001\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\u0008\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0007\u0010\u0008R\u0017\u0010\u0006\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010\u0004\u001a\u0004\u0008\u0003\u0010\u0005j\u0002\u0008\tj\u0002\u0008\n\u00a8\u0006\u000b"
    }
    d2 = {
        "Lco/bird/android/app/manager/SmartlockManagerImpl$i;",
        "",
        "Ljava/util/UUID;",
        "b",
        "Ljava/util/UUID;",
        "()Ljava/util/UUID;",
        "uuid",
        "<init>",
        "(Ljava/lang/String;ILjava/util/UUID;)V",
        "c",
        "d",
        "app_birdRelease"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# static fields
.field public static final enum c:Lco/bird/android/app/manager/SmartlockManagerImpl$i;

.field public static final enum d:Lco/bird/android/app/manager/SmartlockManagerImpl$i;

.field public static final synthetic e:[Lco/bird/android/app/manager/SmartlockManagerImpl$i;


# instance fields
.field public final b:Ljava/util/UUID;


# direct methods
.method public static constructor <clinit>()V
    .locals 4

    new-instance v0, Lco/bird/android/app/manager/SmartlockManagerImpl$i;

    const-string v1, "000036f5-0000-1000-8000-00805f9b34fb"

    invoke-static {v1}, Ljava/util/UUID;->fromString(Ljava/lang/String;)Ljava/util/UUID;

    move-result-object v1

    const-string v2, "fromString(\"000036f5-0000-1000-8000-00805f9b34fb\")"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "WRITE"

    const/4 v3, 0x0

    invoke-direct {v0, v2, v3, v1}, Lco/bird/android/app/manager/SmartlockManagerImpl$i;-><init>(Ljava/lang/String;ILjava/util/UUID;)V

    sput-object v0, Lco/bird/android/app/manager/SmartlockManagerImpl$i;->c:Lco/bird/android/app/manager/SmartlockManagerImpl$i;

    new-instance v0, Lco/bird/android/app/manager/SmartlockManagerImpl$i;

    const-string v1, "000036f6-0000-1000-8000-00805f9b34fb"

    invoke-static {v1}, Ljava/util/UUID;->fromString(Ljava/lang/String;)Ljava/util/UUID;

    move-result-object v1

    const-string v2, "fromString(\"000036f6-0000-1000-8000-00805f9b34fb\")"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "NOTIFY"

    const/4 v3, 0x1

    invoke-direct {v0, v2, v3, v1}, Lco/bird/android/app/manager/SmartlockManagerImpl$i;-><init>(Ljava/lang/String;ILjava/util/UUID;)V

    sput-object v0, Lco/bird/android/app/manager/SmartlockManagerImpl$i;->d:Lco/bird/android/app/manager/SmartlockManagerImpl$i;

    invoke-static {}, Lco/bird/android/app/manager/SmartlockManagerImpl$i;->a()[Lco/bird/android/app/manager/SmartlockManagerImpl$i;

    move-result-object v0

    sput-object v0, Lco/bird/android/app/manager/SmartlockManagerImpl$i;->e:[Lco/bird/android/app/manager/SmartlockManagerImpl$i;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;ILjava/util/UUID;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/UUID;",
            ")V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-object p3, p0, Lco/bird/android/app/manager/SmartlockManagerImpl$i;->b:Ljava/util/UUID;

    return-void
.end method

.method public static final synthetic a()[Lco/bird/android/app/manager/SmartlockManagerImpl$i;
    .locals 3

    const/4 v0, 0x2

    new-array v0, v0, [Lco/bird/android/app/manager/SmartlockManagerImpl$i;

    const/4 v1, 0x0

    sget-object v2, Lco/bird/android/app/manager/SmartlockManagerImpl$i;->c:Lco/bird/android/app/manager/SmartlockManagerImpl$i;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    sget-object v2, Lco/bird/android/app/manager/SmartlockManagerImpl$i;->d:Lco/bird/android/app/manager/SmartlockManagerImpl$i;

    aput-object v2, v0, v1

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lco/bird/android/app/manager/SmartlockManagerImpl$i;
    .locals 1

    const-class v0, Lco/bird/android/app/manager/SmartlockManagerImpl$i;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lco/bird/android/app/manager/SmartlockManagerImpl$i;

    return-object p0
.end method

.method public static values()[Lco/bird/android/app/manager/SmartlockManagerImpl$i;
    .locals 1

    sget-object v0, Lco/bird/android/app/manager/SmartlockManagerImpl$i;->e:[Lco/bird/android/app/manager/SmartlockManagerImpl$i;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lco/bird/android/app/manager/SmartlockManagerImpl$i;

    return-object v0
.end method


# virtual methods
.method public final b()Ljava/util/UUID;
    .locals 1

    iget-object v0, p0, Lco/bird/android/app/manager/SmartlockManagerImpl$i;->b:Ljava/util/UUID;

    return-object v0
.end method
