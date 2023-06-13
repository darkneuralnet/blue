.class public final LAY$g;
.super Landroid/util/LruCache;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LAY;-><init>(Landroid/content/Context;Landroid/content/Intent;LKn6;Lsm6;Ldr4;LkJ;LTq4;LEg1;LEa;LYR4;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/util/LruCache<",
        "Ljava/lang/String;",
        "Lco/bird/android/model/wire/WireRide;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0008\u0003*\u0001\u0000\u0008\n\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001J\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00032\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0002H\u0014\u00a8\u0006\u0006"
    }
    d2 = {
        "AY$g",
        "Landroid/util/LruCache;",
        "",
        "Lco/bird/android/model/wire/WireRide;",
        "birdId",
        "a",
        "app_birdRelease"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nBluetoothTrackerServicePlugin.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BluetoothTrackerServicePlugin.kt\nco/bird/android/app/feature/bluetooth/service/BluetoothTrackerServicePlugin$rideCache$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,276:1\n1#2:277\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic a:LAY;


# direct methods
.method public constructor <init>(LAY;)V
    .locals 0

    iput-object p1, p0, LAY$g;->a:LAY;

    const/4 p1, 0x5

    invoke-direct {p0, p1}, Landroid/util/LruCache;-><init>(I)V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;)Lco/bird/android/model/wire/WireRide;
    .locals 1

    if-eqz p1, :cond_0

    iget-object v0, p0, LAY$g;->a:LAY;

    invoke-static {v0}, LAY;->access$getRideManager$p(LAY;)LYR4;

    move-result-object v0

    invoke-interface {v0, p1}, LYR4;->q1(Ljava/lang/String;)Lco/bird/android/model/RideState;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lco/bird/android/model/RideState;->getRide()Lco/bird/android/model/wire/WireRide;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return-object p1
.end method

.method public bridge synthetic create(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/String;

    invoke-virtual {p0, p1}, LAY$g;->a(Ljava/lang/String;)Lco/bird/android/model/wire/WireRide;

    move-result-object p1

    return-object p1
.end method
