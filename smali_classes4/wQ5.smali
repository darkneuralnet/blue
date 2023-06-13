.class public final LwQ5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsj1;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lsj1<",
        "LvQ5;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lcom/uber/autodispose/ScopeProvider;",
            ">;"
        }
    .end annotation
.end field

.field public final b:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Le13;",
            ">;"
        }
    .end annotation
.end field

.field public final c:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LxQ5;",
            ">;"
        }
    .end annotation
.end field

.field public final d:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lio/reactivex/subjects/h<",
            "LnQ5$b;",
            ">;>;"
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
            "Lcom/uber/autodispose/ScopeProvider;",
            ">;",
            "LY94<",
            "Le13;",
            ">;",
            "LY94<",
            "LxQ5;",
            ">;",
            "LY94<",
            "Lio/reactivex/subjects/h<",
            "LnQ5$b;",
            ">;>;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LwQ5;->a:LY94;

    iput-object p2, p0, LwQ5;->b:LY94;

    iput-object p3, p0, LwQ5;->c:LY94;

    iput-object p4, p0, LwQ5;->d:LY94;

    return-void
.end method

.method public static a(LY94;LY94;LY94;LY94;)LwQ5;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "Lcom/uber/autodispose/ScopeProvider;",
            ">;",
            "LY94<",
            "Le13;",
            ">;",
            "LY94<",
            "LxQ5;",
            ">;",
            "LY94<",
            "Lio/reactivex/subjects/h<",
            "LnQ5$b;",
            ">;>;)",
            "LwQ5;"
        }
    .end annotation

    new-instance v0, LwQ5;

    invoke-direct {v0, p0, p1, p2, p3}, LwQ5;-><init>(LY94;LY94;LY94;LY94;)V

    return-object v0
.end method

.method public static c(Lcom/uber/autodispose/ScopeProvider;Le13;LxQ5;Lio/reactivex/subjects/h;)LvQ5;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/uber/autodispose/ScopeProvider;",
            "Le13;",
            "LxQ5;",
            "Lio/reactivex/subjects/h<",
            "LnQ5$b;",
            ">;)",
            "LvQ5;"
        }
    .end annotation

    new-instance v0, LvQ5;

    invoke-direct {v0, p0, p1, p2, p3}, LvQ5;-><init>(Lcom/uber/autodispose/ScopeProvider;Le13;LxQ5;Lio/reactivex/subjects/h;)V

    return-object v0
.end method


# virtual methods
.method public b()LvQ5;
    .locals 4

    iget-object v0, p0, LwQ5;->a:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/uber/autodispose/ScopeProvider;

    iget-object v1, p0, LwQ5;->b:LY94;

    invoke-interface {v1}, LY94;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Le13;

    iget-object v2, p0, LwQ5;->c:LY94;

    invoke-interface {v2}, LY94;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LxQ5;

    iget-object v3, p0, LwQ5;->d:LY94;

    invoke-interface {v3}, LY94;->get()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lio/reactivex/subjects/h;

    invoke-static {v0, v1, v2, v3}, LwQ5;->c(Lcom/uber/autodispose/ScopeProvider;Le13;LxQ5;Lio/reactivex/subjects/h;)LvQ5;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LwQ5;->b()LvQ5;

    move-result-object v0

    return-object v0
.end method
