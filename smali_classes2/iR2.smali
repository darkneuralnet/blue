.class public final LiR2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsj1;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lsj1<",
        "LhR2;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LaS2;",
            ">;"
        }
    .end annotation
.end field

.field public final b:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lco/bird/android/app/feature/map/presenter/LocationSelectionPresenterImplFactory;",
            ">;"
        }
    .end annotation
.end field

.field public final c:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lcom/uber/autodispose/ScopeProvider;",
            ">;"
        }
    .end annotation
.end field

.field public final d:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LvR2;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(LY94;LY94;LY94;LY94;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "LaS2;",
            ">;",
            "LY94<",
            "Lco/bird/android/app/feature/map/presenter/LocationSelectionPresenterImplFactory;",
            ">;",
            "LY94<",
            "Lcom/uber/autodispose/ScopeProvider;",
            ">;",
            "LY94<",
            "LvR2;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LiR2;->a:LY94;

    iput-object p2, p0, LiR2;->b:LY94;

    iput-object p3, p0, LiR2;->c:LY94;

    iput-object p4, p0, LiR2;->d:LY94;

    return-void
.end method

.method public static a(LY94;LY94;LY94;LY94;)LiR2;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "LaS2;",
            ">;",
            "LY94<",
            "Lco/bird/android/app/feature/map/presenter/LocationSelectionPresenterImplFactory;",
            ">;",
            "LY94<",
            "Lcom/uber/autodispose/ScopeProvider;",
            ">;",
            "LY94<",
            "LvR2;",
            ">;)",
            "LiR2;"
        }
    .end annotation

    new-instance v0, LiR2;

    invoke-direct {v0, p0, p1, p2, p3}, LiR2;-><init>(LY94;LY94;LY94;LY94;)V

    return-object v0
.end method

.method public static c(LaS2;Lco/bird/android/app/feature/map/presenter/LocationSelectionPresenterImplFactory;Lcom/uber/autodispose/ScopeProvider;LvR2;)LhR2;
    .locals 1

    new-instance v0, LhR2;

    invoke-direct {v0, p0, p1, p2, p3}, LhR2;-><init>(LaS2;Lco/bird/android/app/feature/map/presenter/LocationSelectionPresenterImplFactory;Lcom/uber/autodispose/ScopeProvider;LvR2;)V

    return-object v0
.end method


# virtual methods
.method public b()LhR2;
    .locals 4

    iget-object v0, p0, LiR2;->a:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LaS2;

    iget-object v1, p0, LiR2;->b:LY94;

    invoke-interface {v1}, LY94;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lco/bird/android/app/feature/map/presenter/LocationSelectionPresenterImplFactory;

    iget-object v2, p0, LiR2;->c:LY94;

    invoke-interface {v2}, LY94;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/uber/autodispose/ScopeProvider;

    iget-object v3, p0, LiR2;->d:LY94;

    invoke-interface {v3}, LY94;->get()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, LvR2;

    invoke-static {v0, v1, v2, v3}, LiR2;->c(LaS2;Lco/bird/android/app/feature/map/presenter/LocationSelectionPresenterImplFactory;Lcom/uber/autodispose/ScopeProvider;LvR2;)LhR2;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LiR2;->b()LhR2;

    move-result-object v0

    return-object v0
.end method
