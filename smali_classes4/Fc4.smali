.class public final LFc4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsj1;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lsj1<",
        "LCc4;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LLc4;",
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
            "Lcc4;",
            ">;"
        }
    .end annotation
.end field

.field public final d:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LGc4;",
            ">;"
        }
    .end annotation
.end field

.field public final e:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LaG6;",
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

.field public final g:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LTq4;",
            ">;"
        }
    .end annotation
.end field

.field public final h:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LAb4;",
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
            "LLc4;",
            ">;",
            "LY94<",
            "Lcom/uber/autodispose/ScopeProvider;",
            ">;",
            "LY94<",
            "Lcc4;",
            ">;",
            "LY94<",
            "LGc4;",
            ">;",
            "LY94<",
            "LaG6;",
            ">;",
            "LY94<",
            "Le13;",
            ">;",
            "LY94<",
            "LTq4;",
            ">;",
            "LY94<",
            "LAb4;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LFc4;->a:LY94;

    iput-object p2, p0, LFc4;->b:LY94;

    iput-object p3, p0, LFc4;->c:LY94;

    iput-object p4, p0, LFc4;->d:LY94;

    iput-object p5, p0, LFc4;->e:LY94;

    iput-object p6, p0, LFc4;->f:LY94;

    iput-object p7, p0, LFc4;->g:LY94;

    iput-object p8, p0, LFc4;->h:LY94;

    return-void
.end method

.method public static a(LY94;LY94;LY94;LY94;LY94;LY94;LY94;LY94;)LFc4;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "LLc4;",
            ">;",
            "LY94<",
            "Lcom/uber/autodispose/ScopeProvider;",
            ">;",
            "LY94<",
            "Lcc4;",
            ">;",
            "LY94<",
            "LGc4;",
            ">;",
            "LY94<",
            "LaG6;",
            ">;",
            "LY94<",
            "Le13;",
            ">;",
            "LY94<",
            "LTq4;",
            ">;",
            "LY94<",
            "LAb4;",
            ">;)",
            "LFc4;"
        }
    .end annotation

    new-instance v9, LFc4;

    move-object v0, v9

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    invoke-direct/range {v0 .. v8}, LFc4;-><init>(LY94;LY94;LY94;LY94;LY94;LY94;LY94;LY94;)V

    return-object v9
.end method

.method public static c(LLc4;Lcom/uber/autodispose/ScopeProvider;Lcc4;LGc4;LaG6;Le13;LTq4;LAb4;)LCc4;
    .locals 10

    new-instance v9, LCc4;

    move-object v0, v9

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    invoke-direct/range {v0 .. v8}, LCc4;-><init>(LLc4;Lcom/uber/autodispose/ScopeProvider;Lcc4;LGc4;LaG6;Le13;LTq4;LAb4;)V

    return-object v9
.end method


# virtual methods
.method public b()LCc4;
    .locals 9

    iget-object v0, p0, LFc4;->a:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, LLc4;

    iget-object v0, p0, LFc4;->b:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lcom/uber/autodispose/ScopeProvider;

    iget-object v0, p0, LFc4;->c:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lcc4;

    iget-object v0, p0, LFc4;->d:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, LGc4;

    iget-object v0, p0, LFc4;->e:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, LaG6;

    iget-object v0, p0, LFc4;->f:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Le13;

    iget-object v0, p0, LFc4;->g:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, LTq4;

    iget-object v0, p0, LFc4;->h:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, LAb4;

    invoke-static/range {v1 .. v8}, LFc4;->c(LLc4;Lcom/uber/autodispose/ScopeProvider;Lcc4;LGc4;LaG6;Le13;LTq4;LAb4;)LCc4;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LFc4;->b()LCc4;

    move-result-object v0

    return-object v0
.end method
