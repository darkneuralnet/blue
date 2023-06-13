.class public final LLU0$F;
.super LLU0;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LLU0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "F"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0008\u00c6\u0001\u0018\u00002\u00020\u0001J\u001a\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016\u00a8\u0006\u0008"
    }
    d2 = {
        "LLU0$F;",
        "LLU0;",
        "Le13;",
        "navigator",
        "",
        "vararg",
        "",
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


# direct methods
.method public constructor <init>(Ljava/lang/String;I)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    const-class v0, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockUnlockActivity;

    const/4 v1, 0x0

    invoke-direct {p0, p1, p2, v0, v1}, LLU0;-><init>(Ljava/lang/String;ILjava/lang/Class;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method


# virtual methods
.method public c(Le13;Ljava/lang/Object;)V
    .locals 13

    const-string p2, "navigator"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v9, Lco/bird/android/model/wire/WireSmartlock;

    const-string v1, "lock"

    const/4 v2, 0x0

    const-string v3, "11:22:33:44:55:66"

    const-string v4, "token"

    const/4 v5, 0x0

    sget-object v6, Lco/bird/android/model/constant/SmartlockVendor;->NOKELOCK_CHINA:Lco/bird/android/model/constant/SmartlockVendor;

    const/16 v7, 0x12

    const/4 v8, 0x0

    move-object v0, v9

    invoke-direct/range {v0 .. v8}, Lco/bird/android/model/wire/WireSmartlock;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lco/bird/android/model/constant/SmartlockVendor;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sget-object v10, Lco/bird/android/model/constant/PhysicalLockPurpose;->LOCK_TO:Lco/bird/android/model/constant/PhysicalLockPurpose;

    new-instance p2, Lco/bird/android/model/wire/WirePhysicalLock;

    const-string v1, "physicallock"

    const-string v2, "bird"

    const-string v3, "cable"

    const/4 v4, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/16 v11, 0xf8

    const/4 v12, 0x0

    move-object v0, p2

    invoke-direct/range {v0 .. v12}, Lco/bird/android/model/wire/WirePhysicalLock;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lco/bird/android/model/wire/WireSmartlock;Lco/bird/android/model/constant/PhysicalLockPurpose;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v5, 0x0

    const/16 v7, 0x3c

    move-object v0, p1

    move-object v1, p2

    invoke-static/range {v0 .. v8}, Le13$a;->goToPhysicalLockIfEnabled$default(Le13;Lco/bird/android/model/wire/WirePhysicalLock;ZLjava/lang/Integer;Ljava/lang/String;ZLjava/lang/Boolean;ILjava/lang/Object;)Z

    return-void
.end method
