.class public final LRo0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsj1;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lsj1<",
        "LQo0;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Luo0;",
            ">;"
        }
    .end annotation
.end field

.field public final b:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lcom/uber/autodispose/ScopeProvider;",
            ">;"
        }
    .end annotation
.end field

.field public final c:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Llp0;",
            ">;"
        }
    .end annotation
.end field

.field public final d:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LJo0;",
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
            "Luo0;",
            ">;",
            "LY94<",
            "Lcom/uber/autodispose/ScopeProvider;",
            ">;",
            "LY94<",
            "Llp0;",
            ">;",
            "LY94<",
            "LJo0;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LRo0;->a:LY94;

    iput-object p2, p0, LRo0;->b:LY94;

    iput-object p3, p0, LRo0;->c:LY94;

    iput-object p4, p0, LRo0;->d:LY94;

    return-void
.end method

.method public static a(LY94;LY94;LY94;LY94;)LRo0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "Luo0;",
            ">;",
            "LY94<",
            "Lcom/uber/autodispose/ScopeProvider;",
            ">;",
            "LY94<",
            "Llp0;",
            ">;",
            "LY94<",
            "LJo0;",
            ">;)",
            "LRo0;"
        }
    .end annotation

    new-instance v0, LRo0;

    invoke-direct {v0, p0, p1, p2, p3}, LRo0;-><init>(LY94;LY94;LY94;LY94;)V

    return-object v0
.end method

.method public static c(Luo0;Lcom/uber/autodispose/ScopeProvider;Llp0;LJo0;)LQo0;
    .locals 1

    new-instance v0, LQo0;

    invoke-direct {v0, p0, p1, p2, p3}, LQo0;-><init>(Luo0;Lcom/uber/autodispose/ScopeProvider;Llp0;LJo0;)V

    return-object v0
.end method


# virtual methods
.method public b()LQo0;
    .locals 4

    iget-object v0, p0, LRo0;->a:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Luo0;

    iget-object v1, p0, LRo0;->b:LY94;

    invoke-interface {v1}, LY94;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/uber/autodispose/ScopeProvider;

    iget-object v2, p0, LRo0;->c:LY94;

    invoke-interface {v2}, LY94;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Llp0;

    iget-object v3, p0, LRo0;->d:LY94;

    invoke-interface {v3}, LY94;->get()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, LJo0;

    invoke-static {v0, v1, v2, v3}, LRo0;->c(Luo0;Lcom/uber/autodispose/ScopeProvider;Llp0;LJo0;)LQo0;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LRo0;->b()LQo0;

    move-result-object v0

    return-object v0
.end method
