.class public final Ley3;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LCw3;",
            ">;"
        }
    .end annotation
.end field

.field public final b:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lfy3;",
            ">;"
        }
    .end annotation
.end field

.field public final c:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LQI6;",
            ">;"
        }
    .end annotation
.end field

.field public final d:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lot5;",
            ">;"
        }
    .end annotation
.end field

.field public final e:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LuI6;",
            ">;"
        }
    .end annotation
.end field

.field public final f:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LTq4;",
            ">;"
        }
    .end annotation
.end field

.field public final g:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider<",
            "LRE;",
            ">;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(LY94;LY94;LY94;LY94;LY94;LY94;LY94;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "LCw3;",
            ">;",
            "LY94<",
            "Lfy3;",
            ">;",
            "LY94<",
            "LQI6;",
            ">;",
            "LY94<",
            "Lot5;",
            ">;",
            "LY94<",
            "LuI6;",
            ">;",
            "LY94<",
            "LTq4;",
            ">;",
            "LY94<",
            "Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider<",
            "LRE;",
            ">;>;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ley3;->a:LY94;

    iput-object p2, p0, Ley3;->b:LY94;

    iput-object p3, p0, Ley3;->c:LY94;

    iput-object p4, p0, Ley3;->d:LY94;

    iput-object p5, p0, Ley3;->e:LY94;

    iput-object p6, p0, Ley3;->f:LY94;

    iput-object p7, p0, Ley3;->g:LY94;

    return-void
.end method

.method public static a(LY94;LY94;LY94;LY94;LY94;LY94;LY94;)Ley3;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "LCw3;",
            ">;",
            "LY94<",
            "Lfy3;",
            ">;",
            "LY94<",
            "LQI6;",
            ">;",
            "LY94<",
            "Lot5;",
            ">;",
            "LY94<",
            "LuI6;",
            ">;",
            "LY94<",
            "LTq4;",
            ">;",
            "LY94<",
            "Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider<",
            "LRE;",
            ">;>;)",
            "Ley3;"
        }
    .end annotation

    new-instance v8, Ley3;

    move-object v0, v8

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    move-object v7, p6

    invoke-direct/range {v0 .. v7}, Ley3;-><init>(LY94;LY94;LY94;LY94;LY94;LY94;LY94;)V

    return-object v8
.end method

.method public static c(Lco/bird/android/app/feature/map/ui/MapUi;Lco/bird/android/app/feature/map/ui/MapZoneMarkerUi;LCw3;Lfy3;LQI6;Lot5;LuI6;LTq4;Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;)LZx3;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/bird/android/app/feature/map/ui/MapUi;",
            "Lco/bird/android/app/feature/map/ui/MapZoneMarkerUi;",
            "LCw3;",
            "Lfy3;",
            "LQI6;",
            "Lot5;",
            "LuI6;",
            "LTq4;",
            "Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider<",
            "LRE;",
            ">;)",
            "LZx3;"
        }
    .end annotation

    new-instance v10, LZx3;

    move-object v0, v10

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    invoke-direct/range {v0 .. v9}, LZx3;-><init>(Lco/bird/android/app/feature/map/ui/MapUi;Lco/bird/android/app/feature/map/ui/MapZoneMarkerUi;LCw3;Lfy3;LQI6;Lot5;LuI6;LTq4;Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;)V

    return-object v10
.end method


# virtual methods
.method public b(Lco/bird/android/app/feature/map/ui/MapUi;Lco/bird/android/app/feature/map/ui/MapZoneMarkerUi;)LZx3;
    .locals 10

    iget-object v0, p0, Ley3;->a:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, LCw3;

    iget-object v0, p0, Ley3;->b:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lfy3;

    iget-object v0, p0, Ley3;->c:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, LQI6;

    iget-object v0, p0, Ley3;->d:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lot5;

    iget-object v0, p0, Ley3;->e:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, LuI6;

    iget-object v0, p0, Ley3;->f:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, LTq4;

    iget-object v0, p0, Ley3;->g:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v9, v0

    check-cast v9, Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;

    move-object v1, p1

    move-object v2, p2

    invoke-static/range {v1 .. v9}, Ley3;->c(Lco/bird/android/app/feature/map/ui/MapUi;Lco/bird/android/app/feature/map/ui/MapZoneMarkerUi;LCw3;Lfy3;LQI6;Lot5;LuI6;LTq4;Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;)LZx3;

    move-result-object p1

    return-object p1
.end method
