.class public final Lja5$f;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lja5;->e(Ljava/lang/String;)Lio/reactivex/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "LHM4<",
        "Lco/bird/api/response/RiderProfileResponse;",
        ">;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0010\u0005\u001a\u00020\u00042\u001a\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0001 \u0002*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00000\u0000H\n\u00a2\u0006\u0004\u0008\u0005\u0010\u0006"
    }
    d2 = {
        "LHM4;",
        "Lco/bird/api/response/RiderProfileResponse;",
        "kotlin.jvm.PlatformType",
        "it",
        "",
        "a",
        "(LHM4;)V"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nRiderProfileManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RiderProfileManager.kt\nco/bird/android/manager/ride/RiderProfileManagerImpl$setRiderProfile$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,87:1\n1#2:88\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic g:Lja5;


# direct methods
.method public constructor <init>(Lja5;)V
    .locals 0

    iput-object p1, p0, Lja5$f;->g:Lja5;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LHM4;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LHM4<",
            "Lco/bird/api/response/RiderProfileResponse;",
            ">;)V"
        }
    .end annotation

    invoke-virtual {p1}, LHM4;->f()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-virtual {p1}, LHM4;->a()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lco/bird/api/response/RiderProfileResponse;

    if-eqz p1, :cond_2

    iget-object v0, p0, Lja5$f;->g:Lja5;

    invoke-virtual {v0}, Lja5;->c()LZ84;

    move-result-object v1

    invoke-virtual {v1}, LZ84;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lco/bird/android/buava/Optional;

    invoke-virtual {v1}, Lco/bird/android/buava/Optional;->e()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LMZ;

    if-eqz v1, :cond_2

    invoke-virtual {v1}, LMZ;->b()Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    move-object v3, v2

    check-cast v3, Lco/bird/api/response/BeginnerModeRiderMapAction;

    invoke-virtual {v3}, Lco/bird/api/response/BeginnerModeRiderMapAction;->getAccelerationLevel()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1}, Lco/bird/api/response/RiderProfileResponse;->getAccelerationLevel()Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    goto :goto_0

    :cond_1
    const/4 v2, 0x0

    :goto_0
    check-cast v2, Lco/bird/api/response/BeginnerModeRiderMapAction;

    if-eqz v2, :cond_2

    invoke-static {v0}, Lja5;->access$getMutableSelectedAccelerationLevel$p(Lja5;)La94;

    move-result-object p1

    sget-object v0, Lco/bird/android/buava/Optional;->c:Lco/bird/android/buava/Optional$a;

    new-instance v1, Ll56;

    invoke-virtual {v2}, Lco/bird/api/response/BeginnerModeRiderMapAction;->getAsset()Lco/bird/android/model/wire/WireLegacyAsset;

    move-result-object v3

    invoke-virtual {v3}, Lco/bird/android/model/wire/WireLegacyAsset;->getMedia()Lco/bird/android/model/wire/WireAssetMedia;

    move-result-object v3

    invoke-virtual {v3}, Lco/bird/android/model/wire/WireAssetMedia;->getMediaUrl()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2}, Lco/bird/api/response/BeginnerModeRiderMapAction;->getMapToggleTitle()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2}, Lco/bird/api/response/BeginnerModeRiderMapAction;->getAccelerationLevel()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v3, v4, v2}, Ll56;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lco/bird/android/buava/Optional$a;->c(Ljava/lang/Object;)Lco/bird/android/buava/Optional;

    move-result-object v0

    invoke-virtual {p1, v0}, La94;->accept(Ljava/lang/Object;)V

    :cond_2
    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LHM4;

    invoke-virtual {p0, p1}, Lja5$f;->a(LHM4;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method
