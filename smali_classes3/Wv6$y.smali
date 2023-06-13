.class public final LWv6$y;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LWv6;->N(LYv6;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lcom/google/ar/core/ArCoreApk$InstallStatus;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "Lcom/google/ar/core/ArCoreApk$InstallStatus;",
        "kotlin.jvm.PlatformType",
        "it",
        "",
        "a",
        "(Lcom/google/ar/core/ArCoreApk$InstallStatus;)V"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:LWv6;


# direct methods
.method public constructor <init>(LWv6;)V
    .locals 0

    iput-object p1, p0, LWv6$y;->g:LWv6;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lcom/google/ar/core/ArCoreApk$InstallStatus;)V
    .locals 10

    iget-object p1, p0, LWv6$y;->g:LWv6;

    sget-object v0, Lx;->a:Lx;

    invoke-virtual {p1, v0}, Lf1;->h(Ljava/lang/Object;)V

    iget-object p1, p0, LWv6$y;->g:LWv6;

    invoke-static {p1}, LWv6;->access$getArManager$p(LWv6;)Ltm;

    move-result-object v0

    sget-object v1, Lco/bird/android/model/wire/configs/ParkingLocationVerificationMethod;->GOOGLE_VPS:Lco/bird/android/model/wire/configs/ParkingLocationVerificationMethod;

    iget-object p1, p0, LWv6$y;->g:LWv6;

    invoke-static {p1}, LWv6;->access$getRideId$p(LWv6;)Ljava/lang/String;

    move-result-object v2

    iget-object p1, p0, LWv6$y;->g:LWv6;

    invoke-static {p1}, LWv6;->access$getBird$p(LWv6;)Lco/bird/android/model/wire/WireBird;

    move-result-object p1

    invoke-virtual {p1}, Lco/bird/android/model/wire/WireBird;->getId()Ljava/lang/String;

    move-result-object v3

    iget-object p1, p0, LWv6$y;->g:LWv6;

    invoke-static {p1}, LWv6;->access$getParkingNest(LWv6;)Lco/bird/android/model/ParkingNest;

    move-result-object p1

    const/4 v4, 0x0

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lco/bird/android/model/ParkingNest;->getId()Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :cond_0
    move-object p1, v4

    :goto_0
    iget-object v5, p0, LWv6$y;->g:LWv6;

    invoke-static {v5}, LWv6;->access$getParkingNest(LWv6;)Lco/bird/android/model/ParkingNest;

    move-result-object v5

    if-eqz v5, :cond_1

    iget-object v6, p0, LWv6$y;->g:LWv6;

    const/4 v7, 0x1

    invoke-static {v6, v5, v4, v7, v4}, LWv6;->l0(LWv6;Lco/bird/android/model/ParkingNest;Landroid/location/Location;ILjava/lang/Object;)Z

    move-result v4

    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v4

    :cond_1
    move-object v5, v4

    iget-object v4, p0, LWv6$y;->g:LWv6;

    invoke-static {v4}, LWv6;->access$getStartScanningTime$p(LWv6;)Lorg/joda/time/DateTime;

    move-result-object v6

    const/4 v7, 0x0

    const/16 v8, 0x40

    const/4 v9, 0x0

    move-object v4, p1

    invoke-static/range {v0 .. v9}, Ltm$a;->startArSession$default(Ltm;Lco/bird/android/model/wire/configs/ParkingLocationVerificationMethod;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lorg/joda/time/DateTime;Ljava/lang/Boolean;ILjava/lang/Object;)V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lcom/google/ar/core/ArCoreApk$InstallStatus;

    invoke-virtual {p0, p1}, LWv6$y;->a(Lcom/google/ar/core/ArCoreApk$InstallStatus;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method
