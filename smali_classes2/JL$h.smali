.class public final LJL$h;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LJL;-><init>(LaM;Llp2;Lde5;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lco/bird/android/model/Vehicle;",
        "Ljava/lang/Boolean;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0003\u0010\u0004"
    }
    d2 = {
        "Lco/bird/android/model/Vehicle;",
        "it",
        "",
        "a",
        "(Lco/bird/android/model/Vehicle;)Ljava/lang/Boolean;"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:LJL;


# direct methods
.method public constructor <init>(LJL;)V
    .locals 0

    iput-object p1, p0, LJL$h;->g:LJL;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lco/bird/android/model/Vehicle;)Ljava/lang/Boolean;
    .locals 5

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Lco/bird/android/model/VehicleKt;->isIBeacon(Lco/bird/android/model/Vehicle;)Z

    move-result v0

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eqz v0, :cond_0

    iget-object v0, p0, LJL$h;->g:LJL;

    invoke-static {v0}, LJL;->access$getDiscoveredIBeaconCache$p(LJL;)Landroid/util/LruCache;

    move-result-object v0

    invoke-virtual {p1}, Lco/bird/android/model/Vehicle;->getBeaconHash()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Landroid/util/LruCache;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_1

    iget-object v0, p0, LJL$h;->g:LJL;

    invoke-static {v0}, LJL;->access$getIBeaconBlacklist$p(LJL;)Ljava/util/HashSet;

    move-result-object v0

    invoke-virtual {p1}, Lco/bird/android/model/Vehicle;->getBeaconHash()Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1}, Lkotlin/collections/CollectionsKt;->contains(Ljava/lang/Iterable;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_1

    goto :goto_0

    :cond_0
    iget-object v0, p0, LJL$h;->g:LJL;

    invoke-static {v0}, LJL;->access$getDiscoveredBirdVehicleCache$p(LJL;)Landroid/util/LruCache;

    move-result-object v0

    iget-object v3, p0, LJL$h;->g:LJL;

    invoke-virtual {p1}, Lco/bird/android/model/Vehicle;->getBird()Lco/bird/android/model/wire/WireBird;

    move-result-object v4

    invoke-static {v3, v4}, LJL;->access$getIdentifier(LJL;Lco/bird/android/model/wire/WireBird;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Landroid/util/LruCache;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_1

    iget-object v0, p0, LJL$h;->g:LJL;

    invoke-static {v0}, LJL;->access$getSerialNumberBlacklist$p(LJL;)Ljava/util/HashSet;

    move-result-object v0

    iget-object v3, p0, LJL$h;->g:LJL;

    invoke-virtual {p1}, Lco/bird/android/model/Vehicle;->getBird()Lco/bird/android/model/wire/WireBird;

    move-result-object p1

    invoke-static {v3, p1}, LJL;->access$getIdentifier(LJL;Lco/bird/android/model/wire/WireBird;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_1

    goto :goto_0

    :cond_1
    move v1, v2

    :goto_0
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lco/bird/android/model/Vehicle;

    invoke-virtual {p0, p1}, LJL$h;->a(Lco/bird/android/model/Vehicle;)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method
