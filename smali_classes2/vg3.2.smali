.class public final Lvg3;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LCx4;",
            ">;"
        }
    .end annotation
.end field

.field public final b:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LEa;",
            ">;"
        }
    .end annotation
.end field

.field public final c:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lco/bird/android/app/feature/map/presenter/LocationSelectionPresenterImplFactory;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(LY94;LY94;LY94;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "LCx4;",
            ">;",
            "LY94<",
            "LEa;",
            ">;",
            "LY94<",
            "Lco/bird/android/app/feature/map/presenter/LocationSelectionPresenterImplFactory;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lvg3;->a:LY94;

    iput-object p2, p0, Lvg3;->b:LY94;

    iput-object p3, p0, Lvg3;->c:LY94;

    return-void
.end method

.method public static a(LY94;LY94;LY94;)Lvg3;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "LCx4;",
            ">;",
            "LY94<",
            "LEa;",
            ">;",
            "LY94<",
            "Lco/bird/android/app/feature/map/presenter/LocationSelectionPresenterImplFactory;",
            ">;)",
            "Lvg3;"
        }
    .end annotation

    new-instance v0, Lvg3;

    invoke-direct {v0, p0, p1, p2}, Lvg3;-><init>(LY94;LY94;LY94;)V

    return-object v0
.end method

.method public static c(LCx4;LEa;Lco/bird/android/app/feature/map/presenter/LocationSelectionPresenterImplFactory;LQA2;Lcom/uber/autodispose/ScopeProvider;Lco/bird/android/app/feature/map/ui/LocationSelectionUi;)Log3;
    .locals 8

    new-instance v7, Log3;

    move-object v0, v7

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    invoke-direct/range {v0 .. v6}, Log3;-><init>(LCx4;LEa;Lco/bird/android/app/feature/map/presenter/LocationSelectionPresenterImplFactory;LQA2;Lcom/uber/autodispose/ScopeProvider;Lco/bird/android/app/feature/map/ui/LocationSelectionUi;)V

    return-object v7
.end method


# virtual methods
.method public b(LQA2;Lcom/uber/autodispose/ScopeProvider;Lco/bird/android/app/feature/map/ui/LocationSelectionUi;)Log3;
    .locals 7

    iget-object v0, p0, Lvg3;->a:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, LCx4;

    iget-object v0, p0, Lvg3;->b:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, LEa;

    iget-object v0, p0, Lvg3;->c:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lco/bird/android/app/feature/map/presenter/LocationSelectionPresenterImplFactory;

    move-object v4, p1

    move-object v5, p2

    move-object v6, p3

    invoke-static/range {v1 .. v6}, Lvg3;->c(LCx4;LEa;Lco/bird/android/app/feature/map/presenter/LocationSelectionPresenterImplFactory;LQA2;Lcom/uber/autodispose/ScopeProvider;Lco/bird/android/app/feature/map/ui/LocationSelectionUi;)Log3;

    move-result-object p1

    return-object p1
.end method
