.class public final LmR4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsj1;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lsj1<",
        "LlR4;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lgl;",
            ">;"
        }
    .end annotation
.end field

.field public final b:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LFk1;",
            ">;"
        }
    .end annotation
.end field

.field public final c:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Landroid/os/Handler;",
            ">;"
        }
    .end annotation
.end field

.field public final d:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lcom/uber/autodispose/ScopeProvider;",
            ">;"
        }
    .end annotation
.end field

.field public final e:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LnR4;",
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


# direct methods
.method public constructor <init>(LY94;LY94;LY94;LY94;LY94;LY94;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "Lgl;",
            ">;",
            "LY94<",
            "LFk1;",
            ">;",
            "LY94<",
            "Landroid/os/Handler;",
            ">;",
            "LY94<",
            "Lcom/uber/autodispose/ScopeProvider;",
            ">;",
            "LY94<",
            "LnR4;",
            ">;",
            "LY94<",
            "Le13;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LmR4;->a:LY94;

    iput-object p2, p0, LmR4;->b:LY94;

    iput-object p3, p0, LmR4;->c:LY94;

    iput-object p4, p0, LmR4;->d:LY94;

    iput-object p5, p0, LmR4;->e:LY94;

    iput-object p6, p0, LmR4;->f:LY94;

    return-void
.end method

.method public static a(LY94;LY94;LY94;LY94;LY94;LY94;)LmR4;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "Lgl;",
            ">;",
            "LY94<",
            "LFk1;",
            ">;",
            "LY94<",
            "Landroid/os/Handler;",
            ">;",
            "LY94<",
            "Lcom/uber/autodispose/ScopeProvider;",
            ">;",
            "LY94<",
            "LnR4;",
            ">;",
            "LY94<",
            "Le13;",
            ">;)",
            "LmR4;"
        }
    .end annotation

    new-instance v7, LmR4;

    move-object v0, v7

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    invoke-direct/range {v0 .. v6}, LmR4;-><init>(LY94;LY94;LY94;LY94;LY94;LY94;)V

    return-object v7
.end method

.method public static c(Lgl;LFk1;Landroid/os/Handler;Lcom/uber/autodispose/ScopeProvider;LnR4;Le13;)LlR4;
    .locals 8

    new-instance v7, LlR4;

    move-object v0, v7

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    invoke-direct/range {v0 .. v6}, LlR4;-><init>(Lgl;LFk1;Landroid/os/Handler;Lcom/uber/autodispose/ScopeProvider;LnR4;Le13;)V

    return-object v7
.end method


# virtual methods
.method public b()LlR4;
    .locals 7

    iget-object v0, p0, LmR4;->a:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lgl;

    iget-object v0, p0, LmR4;->b:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, LFk1;

    iget-object v0, p0, LmR4;->c:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Landroid/os/Handler;

    iget-object v0, p0, LmR4;->d:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/uber/autodispose/ScopeProvider;

    iget-object v0, p0, LmR4;->e:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, LnR4;

    iget-object v0, p0, LmR4;->f:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Le13;

    invoke-static/range {v1 .. v6}, LmR4;->c(Lgl;LFk1;Landroid/os/Handler;Lcom/uber/autodispose/ScopeProvider;LnR4;Le13;)LlR4;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LmR4;->b()LlR4;

    move-result-object v0

    return-object v0
.end method
