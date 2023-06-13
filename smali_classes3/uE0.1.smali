.class public final LuE0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsj1;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lsj1<",
        "LqE0;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LfF;",
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
            "Lcom/uber/autodispose/ScopeProvider;",
            ">;"
        }
    .end annotation
.end field

.field public final d:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LvE0;",
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
            "LfF;",
            ">;",
            "LY94<",
            "Le13;",
            ">;",
            "LY94<",
            "Lcom/uber/autodispose/ScopeProvider;",
            ">;",
            "LY94<",
            "LvE0;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LuE0;->a:LY94;

    iput-object p2, p0, LuE0;->b:LY94;

    iput-object p3, p0, LuE0;->c:LY94;

    iput-object p4, p0, LuE0;->d:LY94;

    return-void
.end method

.method public static a(LY94;LY94;LY94;LY94;)LuE0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "LfF;",
            ">;",
            "LY94<",
            "Le13;",
            ">;",
            "LY94<",
            "Lcom/uber/autodispose/ScopeProvider;",
            ">;",
            "LY94<",
            "LvE0;",
            ">;)",
            "LuE0;"
        }
    .end annotation

    new-instance v0, LuE0;

    invoke-direct {v0, p0, p1, p2, p3}, LuE0;-><init>(LY94;LY94;LY94;LY94;)V

    return-object v0
.end method

.method public static c(LfF;Le13;Lcom/uber/autodispose/ScopeProvider;LvE0;)LqE0;
    .locals 1

    new-instance v0, LqE0;

    invoke-direct {v0, p0, p1, p2, p3}, LqE0;-><init>(LfF;Le13;Lcom/uber/autodispose/ScopeProvider;LvE0;)V

    return-object v0
.end method


# virtual methods
.method public b()LqE0;
    .locals 4

    iget-object v0, p0, LuE0;->a:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LfF;

    iget-object v1, p0, LuE0;->b:LY94;

    invoke-interface {v1}, LY94;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Le13;

    iget-object v2, p0, LuE0;->c:LY94;

    invoke-interface {v2}, LY94;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/uber/autodispose/ScopeProvider;

    iget-object v3, p0, LuE0;->d:LY94;

    invoke-interface {v3}, LY94;->get()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, LvE0;

    invoke-static {v0, v1, v2, v3}, LuE0;->c(LfF;Le13;Lcom/uber/autodispose/ScopeProvider;LvE0;)LqE0;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LuE0;->b()LqE0;

    move-result-object v0

    return-object v0
.end method
