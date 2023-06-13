.class public final LLH2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsj1;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lsj1<",
        "LIH2;",
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
            "LMH2;",
            ">;"
        }
    .end annotation
.end field

.field public final c:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LrH2;",
            ">;"
        }
    .end annotation
.end field

.field public final d:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LYR4;",
            ">;"
        }
    .end annotation
.end field

.field public final e:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LWg6;",
            ">;"
        }
    .end annotation
.end field

.field public final f:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LpU4;",
            ">;"
        }
    .end annotation
.end field

.field public final g:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LoF3;",
            ">;"
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
            "Lcom/uber/autodispose/ScopeProvider;",
            ">;",
            "LY94<",
            "LMH2;",
            ">;",
            "LY94<",
            "LrH2;",
            ">;",
            "LY94<",
            "LYR4;",
            ">;",
            "LY94<",
            "LWg6;",
            ">;",
            "LY94<",
            "LpU4;",
            ">;",
            "LY94<",
            "LoF3;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LLH2;->a:LY94;

    iput-object p2, p0, LLH2;->b:LY94;

    iput-object p3, p0, LLH2;->c:LY94;

    iput-object p4, p0, LLH2;->d:LY94;

    iput-object p5, p0, LLH2;->e:LY94;

    iput-object p6, p0, LLH2;->f:LY94;

    iput-object p7, p0, LLH2;->g:LY94;

    return-void
.end method

.method public static a(LY94;LY94;LY94;LY94;LY94;LY94;LY94;)LLH2;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "Lcom/uber/autodispose/ScopeProvider;",
            ">;",
            "LY94<",
            "LMH2;",
            ">;",
            "LY94<",
            "LrH2;",
            ">;",
            "LY94<",
            "LYR4;",
            ">;",
            "LY94<",
            "LWg6;",
            ">;",
            "LY94<",
            "LpU4;",
            ">;",
            "LY94<",
            "LoF3;",
            ">;)",
            "LLH2;"
        }
    .end annotation

    new-instance v8, LLH2;

    move-object v0, v8

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    move-object v7, p6

    invoke-direct/range {v0 .. v7}, LLH2;-><init>(LY94;LY94;LY94;LY94;LY94;LY94;LY94;)V

    return-object v8
.end method

.method public static c(Lcom/uber/autodispose/ScopeProvider;LMH2;LrH2;LYR4;LWg6;LpU4;LoF3;)LIH2;
    .locals 9

    new-instance v8, LIH2;

    move-object v0, v8

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    move-object v7, p6

    invoke-direct/range {v0 .. v7}, LIH2;-><init>(Lcom/uber/autodispose/ScopeProvider;LMH2;LrH2;LYR4;LWg6;LpU4;LoF3;)V

    return-object v8
.end method


# virtual methods
.method public b()LIH2;
    .locals 8

    iget-object v0, p0, LLH2;->a:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lcom/uber/autodispose/ScopeProvider;

    iget-object v0, p0, LLH2;->b:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, LMH2;

    iget-object v0, p0, LLH2;->c:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, LrH2;

    iget-object v0, p0, LLH2;->d:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, LYR4;

    iget-object v0, p0, LLH2;->e:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, LWg6;

    iget-object v0, p0, LLH2;->f:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, LpU4;

    iget-object v0, p0, LLH2;->g:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, LoF3;

    invoke-static/range {v1 .. v7}, LLH2;->c(Lcom/uber/autodispose/ScopeProvider;LMH2;LrH2;LYR4;LWg6;LpU4;LoF3;)LIH2;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LLH2;->b()LIH2;

    move-result-object v0

    return-object v0
.end method
