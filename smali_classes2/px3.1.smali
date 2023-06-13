.class public final Lpx3;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lqx3;",
            ">;"
        }
    .end annotation
.end field

.field public final b:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lom3;",
            ">;"
        }
    .end annotation
.end field

.field public final c:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LDQ3;",
            ">;"
        }
    .end annotation
.end field

.field public final d:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LYy6;",
            ">;"
        }
    .end annotation
.end field

.field public final e:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LTq4;",
            ">;"
        }
    .end annotation
.end field

.field public final f:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Le13;",
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
            "Lqx3;",
            ">;",
            "LY94<",
            "Lom3;",
            ">;",
            "LY94<",
            "LDQ3;",
            ">;",
            "LY94<",
            "LYy6;",
            ">;",
            "LY94<",
            "LTq4;",
            ">;",
            "LY94<",
            "Le13;",
            ">;",
            "LY94<",
            "Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider<",
            "LRE;",
            ">;>;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpx3;->a:LY94;

    iput-object p2, p0, Lpx3;->b:LY94;

    iput-object p3, p0, Lpx3;->c:LY94;

    iput-object p4, p0, Lpx3;->d:LY94;

    iput-object p5, p0, Lpx3;->e:LY94;

    iput-object p6, p0, Lpx3;->f:LY94;

    iput-object p7, p0, Lpx3;->g:LY94;

    return-void
.end method

.method public static a(LY94;LY94;LY94;LY94;LY94;LY94;LY94;)Lpx3;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "Lqx3;",
            ">;",
            "LY94<",
            "Lom3;",
            ">;",
            "LY94<",
            "LDQ3;",
            ">;",
            "LY94<",
            "LYy6;",
            ">;",
            "LY94<",
            "LTq4;",
            ">;",
            "LY94<",
            "Le13;",
            ">;",
            "LY94<",
            "Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider<",
            "LRE;",
            ">;>;)",
            "Lpx3;"
        }
    .end annotation

    new-instance v8, Lpx3;

    move-object v0, v8

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    move-object v7, p6

    invoke-direct/range {v0 .. v7}, Lpx3;-><init>(LY94;LY94;LY94;LY94;LY94;LY94;LY94;)V

    return-object v8
.end method

.method public static c(Lco/bird/android/app/feature/map/ui/MapUi;Lco/bird/android/app/feature/map/ui/MapWarehouseMarkerUi;Lqx3;Lom3;LDQ3;LYy6;LTq4;Le13;Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;)Lmx3;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/bird/android/app/feature/map/ui/MapUi;",
            "Lco/bird/android/app/feature/map/ui/MapWarehouseMarkerUi;",
            "Lqx3;",
            "Lom3;",
            "LDQ3;",
            "LYy6;",
            "LTq4;",
            "Le13;",
            "Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider<",
            "LRE;",
            ">;)",
            "Lmx3;"
        }
    .end annotation

    new-instance v10, Lmx3;

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

    invoke-direct/range {v0 .. v9}, Lmx3;-><init>(Lco/bird/android/app/feature/map/ui/MapUi;Lco/bird/android/app/feature/map/ui/MapWarehouseMarkerUi;Lqx3;Lom3;LDQ3;LYy6;LTq4;Le13;Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;)V

    return-object v10
.end method


# virtual methods
.method public b(Lco/bird/android/app/feature/map/ui/MapUi;Lco/bird/android/app/feature/map/ui/MapWarehouseMarkerUi;)Lmx3;
    .locals 10

    iget-object v0, p0, Lpx3;->a:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lqx3;

    iget-object v0, p0, Lpx3;->b:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lom3;

    iget-object v0, p0, Lpx3;->c:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, LDQ3;

    iget-object v0, p0, Lpx3;->d:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, LYy6;

    iget-object v0, p0, Lpx3;->e:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, LTq4;

    iget-object v0, p0, Lpx3;->f:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Le13;

    iget-object v0, p0, Lpx3;->g:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v9, v0

    check-cast v9, Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;

    move-object v1, p1

    move-object v2, p2

    invoke-static/range {v1 .. v9}, Lpx3;->c(Lco/bird/android/app/feature/map/ui/MapUi;Lco/bird/android/app/feature/map/ui/MapWarehouseMarkerUi;Lqx3;Lom3;LDQ3;LYy6;LTq4;Le13;Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;)Lmx3;

    move-result-object p1

    return-object p1
.end method
