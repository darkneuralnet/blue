.class public final Lxa5;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LTq4;",
            ">;"
        }
    .end annotation
.end field

.field public final b:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LRh6;",
            ">;"
        }
    .end annotation
.end field

.field public final c:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lfa5;",
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


# direct methods
.method public constructor <init>(LY94;LY94;LY94;LY94;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "LTq4;",
            ">;",
            "LY94<",
            "LRh6;",
            ">;",
            "LY94<",
            "Lfa5;",
            ">;",
            "LY94<",
            "LYR4;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lxa5;->a:LY94;

    iput-object p2, p0, Lxa5;->b:LY94;

    iput-object p3, p0, Lxa5;->c:LY94;

    iput-object p4, p0, Lxa5;->d:LY94;

    return-void
.end method

.method public static a(LY94;LY94;LY94;LY94;)Lxa5;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "LTq4;",
            ">;",
            "LY94<",
            "LRh6;",
            ">;",
            "LY94<",
            "Lfa5;",
            ">;",
            "LY94<",
            "LYR4;",
            ">;)",
            "Lxa5;"
        }
    .end annotation

    new-instance v0, Lxa5;

    invoke-direct {v0, p0, p1, p2, p3}, Lxa5;-><init>(LY94;LY94;LY94;LY94;)V

    return-object v0
.end method

.method public static c(LTq4;LRh6;Lfa5;LYR4;Lya5;Lcom/uber/autodispose/ScopeProvider;)Lua5;
    .locals 8

    new-instance v7, Lua5;

    move-object v0, v7

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    invoke-direct/range {v0 .. v6}, Lua5;-><init>(LTq4;LRh6;Lfa5;LYR4;Lya5;Lcom/uber/autodispose/ScopeProvider;)V

    return-object v7
.end method


# virtual methods
.method public b(Lya5;Lcom/uber/autodispose/ScopeProvider;)Lua5;
    .locals 7

    iget-object v0, p0, Lxa5;->a:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, LTq4;

    iget-object v0, p0, Lxa5;->b:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, LRh6;

    iget-object v0, p0, Lxa5;->c:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lfa5;

    iget-object v0, p0, Lxa5;->d:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, LYR4;

    move-object v5, p1

    move-object v6, p2

    invoke-static/range {v1 .. v6}, Lxa5;->c(LTq4;LRh6;Lfa5;LYR4;Lya5;Lcom/uber/autodispose/ScopeProvider;)Lua5;

    move-result-object p1

    return-object p1
.end method
