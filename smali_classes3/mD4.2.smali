.class public final LmD4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsj1;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lsj1<",
        "LlD4;",
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
            "LnD4;",
            ">;"
        }
    .end annotation
.end field

.field public final c:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Le13;",
            ">;"
        }
    .end annotation
.end field

.field public final d:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LbD4;",
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
            "Lcom/uber/autodispose/ScopeProvider;",
            ">;",
            "LY94<",
            "LnD4;",
            ">;",
            "LY94<",
            "Le13;",
            ">;",
            "LY94<",
            "LbD4;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LmD4;->a:LY94;

    iput-object p2, p0, LmD4;->b:LY94;

    iput-object p3, p0, LmD4;->c:LY94;

    iput-object p4, p0, LmD4;->d:LY94;

    return-void
.end method

.method public static a(LY94;LY94;LY94;LY94;)LmD4;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "Lcom/uber/autodispose/ScopeProvider;",
            ">;",
            "LY94<",
            "LnD4;",
            ">;",
            "LY94<",
            "Le13;",
            ">;",
            "LY94<",
            "LbD4;",
            ">;)",
            "LmD4;"
        }
    .end annotation

    new-instance v0, LmD4;

    invoke-direct {v0, p0, p1, p2, p3}, LmD4;-><init>(LY94;LY94;LY94;LY94;)V

    return-object v0
.end method

.method public static c(Lcom/uber/autodispose/ScopeProvider;LnD4;Le13;LbD4;)LlD4;
    .locals 1

    new-instance v0, LlD4;

    invoke-direct {v0, p0, p1, p2, p3}, LlD4;-><init>(Lcom/uber/autodispose/ScopeProvider;LnD4;Le13;LbD4;)V

    return-object v0
.end method


# virtual methods
.method public b()LlD4;
    .locals 4

    iget-object v0, p0, LmD4;->a:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/uber/autodispose/ScopeProvider;

    iget-object v1, p0, LmD4;->b:LY94;

    invoke-interface {v1}, LY94;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LnD4;

    iget-object v2, p0, LmD4;->c:LY94;

    invoke-interface {v2}, LY94;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Le13;

    iget-object v3, p0, LmD4;->d:LY94;

    invoke-interface {v3}, LY94;->get()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, LbD4;

    invoke-static {v0, v1, v2, v3}, LmD4;->c(Lcom/uber/autodispose/ScopeProvider;LnD4;Le13;LbD4;)LlD4;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LmD4;->b()LlD4;

    move-result-object v0

    return-object v0
.end method
