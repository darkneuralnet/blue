.class public final LJF3$M;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LJF3;->e(LFU4;Lf13;Lco/bird/android/model/wire/WireRide;ZZZLcom/uber/autodispose/ScopeProvider;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LJF3$M$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lco/bird/android/model/DialogResponse;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "Lco/bird/android/model/DialogResponse;",
        "kotlin.jvm.PlatformType",
        "response",
        "",
        "a",
        "(Lco/bird/android/model/DialogResponse;)V"
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
        "SMAP\nParkingManagerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ParkingManagerImpl.kt\nco/bird/android/manager/ride/ParkingManagerImpl$tryToPark$2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1466:1\n1#2:1467\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic g:Lco/bird/android/model/wire/WireRide;

.field public final synthetic h:LQM4;

.field public final synthetic i:Lco/bird/android/model/wire/configs/ParkingLocationVerificationMethod;

.field public final synthetic j:LJF3;

.field public final synthetic k:Lf13;

.field public final synthetic l:Lco/bird/android/model/wire/configs/Config;

.field public final synthetic m:LFH3;

.field public final synthetic n:LFU4;

.field public final synthetic o:Lcom/uber/autodispose/ScopeProvider;

.field public final synthetic p:Z


# direct methods
.method public constructor <init>(Lco/bird/android/model/wire/WireRide;LQM4;Lco/bird/android/model/wire/configs/ParkingLocationVerificationMethod;LJF3;Lf13;Lco/bird/android/model/wire/configs/Config;LFH3;LFU4;Lcom/uber/autodispose/ScopeProvider;Z)V
    .locals 0

    iput-object p1, p0, LJF3$M;->g:Lco/bird/android/model/wire/WireRide;

    iput-object p2, p0, LJF3$M;->h:LQM4;

    iput-object p3, p0, LJF3$M;->i:Lco/bird/android/model/wire/configs/ParkingLocationVerificationMethod;

    iput-object p4, p0, LJF3$M;->j:LJF3;

    iput-object p5, p0, LJF3$M;->k:Lf13;

    iput-object p6, p0, LJF3$M;->l:Lco/bird/android/model/wire/configs/Config;

    iput-object p7, p0, LJF3$M;->m:LFH3;

    iput-object p8, p0, LJF3$M;->n:LFU4;

    iput-object p9, p0, LJF3$M;->o:Lcom/uber/autodispose/ScopeProvider;

    iput-boolean p10, p0, LJF3$M;->p:Z

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lco/bird/android/model/DialogResponse;)V
    .locals 13

    iget-object v0, p0, LJF3$M;->g:Lco/bird/android/model/wire/WireRide;

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eqz v0, :cond_4

    iget-object v3, p0, LJF3$M;->m:LFH3;

    iget-object v4, p0, LJF3$M;->j:LJF3;

    iget-object v5, p0, LJF3$M;->h:LQM4;

    instance-of v6, v3, Ltz6;

    if-eqz v6, :cond_0

    check-cast v3, Ltz6;

    goto :goto_0

    :cond_0
    move-object v3, v1

    :goto_0
    if-eqz v3, :cond_1

    invoke-virtual {v3}, Ltz6;->g()Ljava/lang/Integer;

    move-result-object v3

    goto :goto_1

    :cond_1
    move-object v3, v1

    :goto_1
    invoke-static {v4}, LJF3;->access$getAnalyticsManager$p(LJF3;)LEa;

    move-result-object v6

    if-eqz v3, :cond_2

    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    sget-object v7, LgR4;->c:LgR4;

    invoke-interface {v7, v3}, LIc0;->a(Ljava/lang/Integer;)V

    goto :goto_2

    :cond_2
    sget-object v7, LgR4;->c:LgR4;

    :goto_2
    invoke-virtual {v5}, LQM4;->b()Z

    move-result v3

    sget-object v5, Lco/bird/android/model/DialogResponse;->OTHER:Lco/bird/android/model/DialogResponse;

    if-ne p1, v5, :cond_3

    move v5, v2

    goto :goto_3

    :cond_3
    const/4 v5, 0x0

    :goto_3
    invoke-static {v4, v0, v7, v3, v5}, LJF3;->access$toRideEndClientIssueAcknowledged(LJF3;Lco/bird/android/model/wire/WireRide;LgR4;ZZ)LyQ4;

    move-result-object v3

    invoke-interface {v6, v3}, LEa;->y(Lco/bird/android/model/analytics/AnalyticsEvent;)V

    const-string v3, "client_issue_displayed"

    const-string v5, "no_parking"

    invoke-virtual {v4, v0, v3, v5}, LJF3;->b(Lco/bird/android/model/wire/WireRide;Ljava/lang/String;Ljava/lang/String;)V

    :cond_4
    sget-object v0, Lco/bird/android/model/DialogResponse;->OTHER:Lco/bird/android/model/DialogResponse;

    if-ne p1, v0, :cond_d

    iget-object p1, p0, LJF3$M;->h:LQM4;

    instance-of v0, p1, LRM4;

    const/4 v3, 0x2

    if-eqz v0, :cond_8

    iget-object p1, p0, LJF3$M;->i:Lco/bird/android/model/wire/configs/ParkingLocationVerificationMethod;

    if-nez p1, :cond_5

    const/4 p1, -0x1

    goto :goto_4

    :cond_5
    sget-object v0, LJF3$M$a;->$EnumSwitchMapping$0:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v0, p1

    :goto_4
    if-eq p1, v2, :cond_7

    if-eq p1, v3, :cond_6

    iget-object p1, p0, LJF3$M;->j:LJF3;

    iget-object v0, p0, LJF3$M;->k:Lf13;

    iget-object v1, p0, LJF3$M;->l:Lco/bird/android/model/wire/configs/Config;

    iget-object v3, p0, LJF3$M;->g:Lco/bird/android/model/wire/WireRide;

    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-static {p1, v0, v1, v3, v2}, LJF3;->access$presentVps(LJF3;Lf13;Lco/bird/android/model/wire/configs/Config;Lco/bird/android/model/wire/WireRide;Z)Z

    goto/16 :goto_6

    :cond_6
    iget-object p1, p0, LJF3$M;->j:LJF3;

    iget-object v0, p0, LJF3$M;->k:Lf13;

    iget-object v1, p0, LJF3$M;->l:Lco/bird/android/model/wire/configs/Config;

    iget-object v3, p0, LJF3$M;->g:Lco/bird/android/model/wire/WireRide;

    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-static {p1, v0, v1, v3, v2}, LJF3;->access$presentVps(LJF3;Lf13;Lco/bird/android/model/wire/configs/Config;Lco/bird/android/model/wire/WireRide;Z)Z

    goto/16 :goto_6

    :cond_7
    iget-object p1, p0, LJF3$M;->j:LJF3;

    iget-object v0, p0, LJF3$M;->k:Lf13;

    iget-object v1, p0, LJF3$M;->l:Lco/bird/android/model/wire/configs/Config;

    iget-object v3, p0, LJF3$M;->g:Lco/bird/android/model/wire/WireRide;

    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-static {p1, v0, v1, v3, v2}, LJF3;->access$presentVpsV2(LJF3;Lf13;Lco/bird/android/model/wire/configs/Config;Lco/bird/android/model/wire/WireRide;Z)Z

    goto/16 :goto_6

    :cond_8
    instance-of p1, p1, LTZ1;

    if-eqz p1, :cond_c

    iget-object p1, p0, LJF3$M;->m:LFH3;

    invoke-virtual {p1}, LFH3;->c()LbF0;

    move-result-object p1

    if-eqz p1, :cond_b

    invoke-virtual {p1}, LbF0;->e()Lco/bird/android/model/ParkingNest;

    move-result-object p1

    if-eqz p1, :cond_b

    invoke-virtual {p1}, Lco/bird/android/model/ParkingNest;->getLocation()Lco/bird/android/model/wire/WireLocation;

    move-result-object p1

    if-eqz p1, :cond_b

    invoke-virtual {p1}, Lco/bird/android/model/wire/WireLocation;->fromLocation()Landroid/location/Location;

    move-result-object p1

    if-nez p1, :cond_9

    goto :goto_5

    :cond_9
    iget-object v0, p0, LJF3$M;->j:LJF3;

    invoke-static {v0}, LJF3;->access$getAreaManager$p(LJF3;)Lbn;

    move-result-object v0

    invoke-interface {v0}, Lbn;->V()LZ84;

    move-result-object v0

    invoke-virtual {v0}, LZ84;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    sget-object v4, LJF3$M$b;->g:LJF3$M$b;

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-static {v0, p1, v4, v2}, LoG3;->b(Ljava/util/List;Landroid/location/Location;Lkotlin/jvm/functions/Function1;Ljava/lang/Integer;)Ljava/util/List;

    move-result-object p1

    invoke-static {p1}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lco/bird/android/model/ParkingNest;

    if-nez p1, :cond_a

    return-void

    :cond_a
    iget-object v0, p0, LJF3$M;->j:LJF3;

    invoke-static {v0}, LJF3;->access$getReactiveLocationManager$p(LJF3;)Ldr4;

    move-result-object v0

    invoke-interface {v0}, Ldr4;->p()LZ84;

    move-result-object v0

    invoke-virtual {v0}, LZ84;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/location/Location;

    sget-object v4, LYw2;->a:LYw2;

    invoke-virtual {v0}, Landroid/location/Location;->getLatitude()D

    move-result-wide v5

    invoke-virtual {v0}, Landroid/location/Location;->getLongitude()D

    move-result-wide v7

    invoke-virtual {p1}, Lco/bird/android/model/ParkingNest;->getLocation()Lco/bird/android/model/wire/WireLocation;

    move-result-object v0

    invoke-virtual {v0}, Lco/bird/android/model/wire/WireLocation;->getLatitude()D

    move-result-wide v9

    invoke-virtual {p1}, Lco/bird/android/model/ParkingNest;->getLocation()Lco/bird/android/model/wire/WireLocation;

    move-result-object v0

    invoke-virtual {v0}, Lco/bird/android/model/wire/WireLocation;->getLongitude()D

    move-result-wide v11

    invoke-virtual/range {v4 .. v12}, LYw2;->b(DDDD)F

    move-result v0

    iget-object v2, p0, LJF3$M;->j:LJF3;

    invoke-static {v2}, LJF3;->access$getAreaManager$p(LJF3;)Lbn;

    move-result-object v2

    new-instance v4, Lco/bird/android/model/ParkingNestData;

    invoke-direct {v4, p1, v0}, Lco/bird/android/model/ParkingNestData;-><init>(Lco/bird/android/model/ParkingNest;F)V

    invoke-interface {v2, v4}, Lbn;->G(Lco/bird/android/model/ParkingNestData;)V

    iget-object v0, p0, LJF3$M;->n:LFU4;

    invoke-virtual {p1}, Lco/bird/android/model/ParkingNest;->getLocation()Lco/bird/android/model/wire/WireLocation;

    move-result-object p1

    invoke-virtual {p1}, Lco/bird/android/model/wire/WireLocation;->fromLocation()Landroid/location/Location;

    move-result-object p1

    invoke-static {v0, p1, v1, v3, v1}, LFU4$a;->zoomTo$default(LFU4;Landroid/location/Location;Ljava/lang/Float;ILjava/lang/Object;)V

    goto :goto_6

    :cond_b
    :goto_5
    return-void

    :cond_c
    iget-object v4, p0, LJF3$M;->j:LJF3;

    iget-object v5, p0, LJF3$M;->n:LFU4;

    iget-object v6, p0, LJF3$M;->k:Lf13;

    iget-object v7, p0, LJF3$M;->o:Lcom/uber/autodispose/ScopeProvider;

    iget-object v8, p0, LJF3$M;->g:Lco/bird/android/model/wire/WireRide;

    iget-boolean v9, p0, LJF3$M;->p:Z

    const/4 v10, 0x0

    invoke-static/range {v4 .. v10}, LJF3;->access$park(LJF3;LFU4;Lf13;Lcom/uber/autodispose/ScopeProvider;Lco/bird/android/model/wire/WireRide;ZZ)V

    :cond_d
    :goto_6
    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lco/bird/android/model/DialogResponse;

    invoke-virtual {p0, p1}, LJF3$M;->a(Lco/bird/android/model/DialogResponse;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method
