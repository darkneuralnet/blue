.class public final enum Lco/bird/android/app/feature/contractor/service/UserTrackerServicePlugin$b;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lco/bird/android/app/feature/contractor/service/UserTrackerServicePlugin;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lco/bird/android/app/feature/contractor/service/UserTrackerServicePlugin$b;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0008\u0005\u0008\u0086\u0001\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003j\u0002\u0008\u0004j\u0002\u0008\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "Lco/bird/android/app/feature/contractor/service/UserTrackerServicePlugin$b;",
        "",
        "<init>",
        "(Ljava/lang/String;I)V",
        "b",
        "c",
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
.field public static final enum b:Lco/bird/android/app/feature/contractor/service/UserTrackerServicePlugin$b;

.field public static final enum c:Lco/bird/android/app/feature/contractor/service/UserTrackerServicePlugin$b;

.field public static final synthetic d:[Lco/bird/android/app/feature/contractor/service/UserTrackerServicePlugin$b;


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    new-instance v0, Lco/bird/android/app/feature/contractor/service/UserTrackerServicePlugin$b;

    const-string v1, "TRACKING_ENABLED"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lco/bird/android/app/feature/contractor/service/UserTrackerServicePlugin$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lco/bird/android/app/feature/contractor/service/UserTrackerServicePlugin$b;->b:Lco/bird/android/app/feature/contractor/service/UserTrackerServicePlugin$b;

    new-instance v0, Lco/bird/android/app/feature/contractor/service/UserTrackerServicePlugin$b;

    const-string v1, "REQUIREMENTS_MISSING"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lco/bird/android/app/feature/contractor/service/UserTrackerServicePlugin$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lco/bird/android/app/feature/contractor/service/UserTrackerServicePlugin$b;->c:Lco/bird/android/app/feature/contractor/service/UserTrackerServicePlugin$b;

    invoke-static {}, Lco/bird/android/app/feature/contractor/service/UserTrackerServicePlugin$b;->a()[Lco/bird/android/app/feature/contractor/service/UserTrackerServicePlugin$b;

    move-result-object v0

    sput-object v0, Lco/bird/android/app/feature/contractor/service/UserTrackerServicePlugin$b;->d:[Lco/bird/android/app/feature/contractor/service/UserTrackerServicePlugin$b;

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

.method public static final synthetic a()[Lco/bird/android/app/feature/contractor/service/UserTrackerServicePlugin$b;
    .locals 3

    const/4 v0, 0x2

    new-array v0, v0, [Lco/bird/android/app/feature/contractor/service/UserTrackerServicePlugin$b;

    const/4 v1, 0x0

    sget-object v2, Lco/bird/android/app/feature/contractor/service/UserTrackerServicePlugin$b;->b:Lco/bird/android/app/feature/contractor/service/UserTrackerServicePlugin$b;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    sget-object v2, Lco/bird/android/app/feature/contractor/service/UserTrackerServicePlugin$b;->c:Lco/bird/android/app/feature/contractor/service/UserTrackerServicePlugin$b;

    aput-object v2, v0, v1

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lco/bird/android/app/feature/contractor/service/UserTrackerServicePlugin$b;
    .locals 1

    const-class v0, Lco/bird/android/app/feature/contractor/service/UserTrackerServicePlugin$b;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lco/bird/android/app/feature/contractor/service/UserTrackerServicePlugin$b;

    return-object p0
.end method

.method public static values()[Lco/bird/android/app/feature/contractor/service/UserTrackerServicePlugin$b;
    .locals 1

    sget-object v0, Lco/bird/android/app/feature/contractor/service/UserTrackerServicePlugin$b;->d:[Lco/bird/android/app/feature/contractor/service/UserTrackerServicePlugin$b;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lco/bird/android/app/feature/contractor/service/UserTrackerServicePlugin$b;

    return-object v0
.end method
