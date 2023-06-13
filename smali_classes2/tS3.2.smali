.class public final LtS3;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001aG\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u00062\n\u0008\u0002\u0010\t\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0004\u0008\u000b\u0010\u000c\u00a8\u0006\r"
    }
    d2 = {
        "Landroid/content/Context;",
        "context",
        "Lco/bird/android/model/wire/configs/Config;",
        "config",
        "Lco/bird/android/model/wire/WirePhysicalLock;",
        "physicalLock",
        "",
        "unlocking",
        "showForPrivateBird",
        "isHelmetLock",
        "Landroid/content/Intent;",
        "a",
        "(Landroid/content/Context;Lco/bird/android/model/wire/configs/Config;Lco/bird/android/model/wire/WirePhysicalLock;ZZLjava/lang/Boolean;)Landroid/content/Intent;",
        "app_birdRelease"
    }
    k = 0x2
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nPhysicalLockIntentCreator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PhysicalLockIntentCreator.kt\nco/bird/android/app/feature/physicallock/PhysicalLockIntentCreatorKt\n+ 2 IntentBuilder.kt\nco/bird/android/navigator/IntentBuilderKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,43:1\n30#2,2:44\n32#2:47\n61#2,26:48\n33#2:74\n34#2:76\n30#2,2:77\n32#2:80\n61#2,26:81\n33#2:107\n34#2:109\n13579#3:46\n13580#3:75\n13579#3:79\n13580#3:108\n*S KotlinDebug\n*F\n+ 1 PhysicalLockIntentCreator.kt\nco/bird/android/app/feature/physicallock/PhysicalLockIntentCreatorKt\n*L\n33#1:44,2\n33#1:47\n33#1:48,26\n33#1:74\n33#1:76\n35#1:77,2\n35#1:80\n35#1:81,26\n35#1:107\n35#1:109\n33#1:46\n33#1:75\n35#1:79\n35#1:108\n*E\n"
    }
.end annotation


# direct methods
.method public static final a(Landroid/content/Context;Lco/bird/android/model/wire/configs/Config;Lco/bird/android/model/wire/WirePhysicalLock;ZZLjava/lang/Boolean;)Landroid/content/Intent;
    .locals 2

    const-string v0, "context"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "config"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    if-eqz p2, :cond_4

    if-nez p4, :cond_1

    if-eqz p3, :cond_0

    invoke-virtual {p1}, Lco/bird/android/model/wire/configs/Config;->getEnablePhysicalLockUnlock()Z

    move-result v1

    if-eqz v1, :cond_4

    :cond_0
    if-nez p3, :cond_1

    invoke-virtual {p1}, Lco/bird/android/model/wire/configs/Config;->getEnablePhysicalLockLock()Z

    move-result v1

    if-nez v1, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {p2}, Lco/bird/android/model/wire/WirePhysicalLock;->isBrainBasedBluetooth()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-virtual {p1}, Lco/bird/android/model/wire/configs/Config;->getRideConfig()Lco/bird/android/model/wire/configs/RideConfig;

    move-result-object p1

    invoke-virtual {p1}, Lco/bird/android/model/wire/configs/RideConfig;->getSmartlockConfig()Lco/bird/android/model/wire/configs/SmartlockRideConfig;

    move-result-object p1

    invoke-virtual {p1}, Lco/bird/android/model/wire/configs/SmartlockRideConfig;->getEnableMechanicalCableLock()Ljava/lang/Boolean;

    move-result-object p1

    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_2

    return-object v0

    :cond_2
    invoke-virtual {p2}, Lco/bird/android/model/wire/WirePhysicalLock;->getSmartlock()Lco/bird/android/model/wire/WireSmartlock;

    move-result-object p1

    if-nez p1, :cond_3

    invoke-virtual {p2}, Lco/bird/android/model/wire/WirePhysicalLock;->isBrainBasedBluetooth()Z

    move-result p1

    if-nez p1, :cond_3

    new-instance p1, Landroid/content/Intent;

    const-class v0, Lco/bird/android/app/feature/physicallock/PhysicalLockActivity;

    invoke-direct {p1, p0, v0}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    goto :goto_0

    :cond_3
    new-instance p1, Landroid/content/Intent;

    const-class v0, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockUnlockActivity;

    invoke-direct {p1, p0, v0}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    :goto_0
    const-string p0, "physical_lock"

    invoke-virtual {p1, p0, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    const-string p0, "physical_lock_unlocking"

    invoke-virtual {p1, p0, p3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    const-string p0, "private_bird"

    invoke-virtual {p1, p0, p4}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    const-string p0, "helmet_lock"

    invoke-virtual {p1, p0, p5}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/io/Serializable;)Landroid/content/Intent;

    return-object p1

    :cond_4
    :goto_1
    return-object v0
.end method

.method public static synthetic physicalLockIntent$default(Landroid/content/Context;Lco/bird/android/model/wire/configs/Config;Lco/bird/android/model/wire/WirePhysicalLock;ZZLjava/lang/Boolean;ILjava/lang/Object;)Landroid/content/Intent;
    .locals 6

    and-int/lit8 p7, p6, 0x10

    if-eqz p7, :cond_0

    const/4 p4, 0x0

    :cond_0
    move v4, p4

    and-int/lit8 p4, p6, 0x20

    if-eqz p4, :cond_1

    sget-object p5, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    :cond_1
    move-object v5, p5

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v3, p3

    invoke-static/range {v0 .. v5}, LtS3;->a(Landroid/content/Context;Lco/bird/android/model/wire/configs/Config;Lco/bird/android/model/wire/WirePhysicalLock;ZZLjava/lang/Boolean;)Landroid/content/Intent;

    move-result-object p0

    return-object p0
.end method
