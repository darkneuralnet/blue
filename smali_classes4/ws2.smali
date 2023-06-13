.class public final Lws2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsj1;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lsj1<",
        "Lvs2;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LaG6;",
            ">;"
        }
    .end annotation
.end field

.field public final b:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LAb4;",
            ">;"
        }
    .end annotation
.end field

.field public final c:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lsu2;",
            ">;"
        }
    .end annotation
.end field

.field public final d:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Le13;",
            ">;"
        }
    .end annotation
.end field

.field public final e:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lcom/uber/autodispose/ScopeProvider;",
            ">;"
        }
    .end annotation
.end field

.field public final f:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LTq4;",
            ">;"
        }
    .end annotation
.end field

.field public final g:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lxs2;",
            ">;"
        }
    .end annotation
.end field

.field public final h:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Ljs2;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(LY94;LY94;LY94;LY94;LY94;LY94;LY94;LY94;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "LaG6;",
            ">;",
            "LY94<",
            "LAb4;",
            ">;",
            "LY94<",
            "Lsu2;",
            ">;",
            "LY94<",
            "Le13;",
            ">;",
            "LY94<",
            "Lcom/uber/autodispose/ScopeProvider;",
            ">;",
            "LY94<",
            "LTq4;",
            ">;",
            "LY94<",
            "Lxs2;",
            ">;",
            "LY94<",
            "Ljs2;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lws2;->a:LY94;

    iput-object p2, p0, Lws2;->b:LY94;

    iput-object p3, p0, Lws2;->c:LY94;

    iput-object p4, p0, Lws2;->d:LY94;

    iput-object p5, p0, Lws2;->e:LY94;

    iput-object p6, p0, Lws2;->f:LY94;

    iput-object p7, p0, Lws2;->g:LY94;

    iput-object p8, p0, Lws2;->h:LY94;

    return-void
.end method

.method public static a(LY94;LY94;LY94;LY94;LY94;LY94;LY94;LY94;)Lws2;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "LaG6;",
            ">;",
            "LY94<",
            "LAb4;",
            ">;",
            "LY94<",
            "Lsu2;",
            ">;",
            "LY94<",
            "Le13;",
            ">;",
            "LY94<",
            "Lcom/uber/autodispose/ScopeProvider;",
            ">;",
            "LY94<",
            "LTq4;",
            ">;",
            "LY94<",
            "Lxs2;",
            ">;",
            "LY94<",
            "Ljs2;",
            ">;)",
            "Lws2;"
        }
    .end annotation

    new-instance v9, Lws2;

    move-object v0, v9

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    invoke-direct/range {v0 .. v8}, Lws2;-><init>(LY94;LY94;LY94;LY94;LY94;LY94;LY94;LY94;)V

    return-object v9
.end method

.method public static c(LaG6;LAb4;Lsu2;Le13;Lcom/uber/autodispose/ScopeProvider;LTq4;Lxs2;Ljs2;)Lvs2;
    .locals 10

    new-instance v9, Lvs2;

    move-object v0, v9

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    invoke-direct/range {v0 .. v8}, Lvs2;-><init>(LaG6;LAb4;Lsu2;Le13;Lcom/uber/autodispose/ScopeProvider;LTq4;Lxs2;Ljs2;)V

    return-object v9
.end method


# virtual methods
.method public b()Lvs2;
    .locals 9

    iget-object v0, p0, Lws2;->a:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, LaG6;

    iget-object v0, p0, Lws2;->b:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, LAb4;

    iget-object v0, p0, Lws2;->c:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lsu2;

    iget-object v0, p0, Lws2;->d:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Le13;

    iget-object v0, p0, Lws2;->e:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lcom/uber/autodispose/ScopeProvider;

    iget-object v0, p0, Lws2;->f:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, LTq4;

    iget-object v0, p0, Lws2;->g:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lxs2;

    iget-object v0, p0, Lws2;->h:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Ljs2;

    invoke-static/range {v1 .. v8}, Lws2;->c(LaG6;LAb4;Lsu2;Le13;Lcom/uber/autodispose/ScopeProvider;LTq4;Lxs2;Ljs2;)Lvs2;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lws2;->b()Lvs2;

    move-result-object v0

    return-object v0
.end method
