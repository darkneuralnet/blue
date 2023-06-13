.class public final LF50;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsj1;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lsj1<",
        "LD50;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lom3;",
            ">;"
        }
    .end annotation
.end field

.field public final b:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LGt5;",
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
            "LlE;",
            ">;"
        }
    .end annotation
.end field

.field public final e:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Le13;",
            ">;"
        }
    .end annotation
.end field

.field public final f:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lo50;",
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


# direct methods
.method public constructor <init>(LY94;LY94;LY94;LY94;LY94;LY94;LY94;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "Lom3;",
            ">;",
            "LY94<",
            "LGt5;",
            ">;",
            "LY94<",
            "Lcom/uber/autodispose/ScopeProvider;",
            ">;",
            "LY94<",
            "LlE;",
            ">;",
            "LY94<",
            "Le13;",
            ">;",
            "LY94<",
            "Lo50;",
            ">;",
            "LY94<",
            "LTq4;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LF50;->a:LY94;

    iput-object p2, p0, LF50;->b:LY94;

    iput-object p3, p0, LF50;->c:LY94;

    iput-object p4, p0, LF50;->d:LY94;

    iput-object p5, p0, LF50;->e:LY94;

    iput-object p6, p0, LF50;->f:LY94;

    iput-object p7, p0, LF50;->g:LY94;

    return-void
.end method

.method public static a(LY94;LY94;LY94;LY94;LY94;LY94;LY94;)LF50;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "Lom3;",
            ">;",
            "LY94<",
            "LGt5;",
            ">;",
            "LY94<",
            "Lcom/uber/autodispose/ScopeProvider;",
            ">;",
            "LY94<",
            "LlE;",
            ">;",
            "LY94<",
            "Le13;",
            ">;",
            "LY94<",
            "Lo50;",
            ">;",
            "LY94<",
            "LTq4;",
            ">;)",
            "LF50;"
        }
    .end annotation

    new-instance v8, LF50;

    move-object v0, v8

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    move-object v7, p6

    invoke-direct/range {v0 .. v7}, LF50;-><init>(LY94;LY94;LY94;LY94;LY94;LY94;LY94;)V

    return-object v8
.end method

.method public static c(Lom3;LGt5;Lcom/uber/autodispose/ScopeProvider;LlE;Le13;Lo50;LTq4;)LD50;
    .locals 9

    new-instance v8, LD50;

    move-object v0, v8

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    move-object v7, p6

    invoke-direct/range {v0 .. v7}, LD50;-><init>(Lom3;LGt5;Lcom/uber/autodispose/ScopeProvider;LlE;Le13;Lo50;LTq4;)V

    return-object v8
.end method


# virtual methods
.method public b()LD50;
    .locals 8

    iget-object v0, p0, LF50;->a:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lom3;

    iget-object v0, p0, LF50;->b:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, LGt5;

    iget-object v0, p0, LF50;->c:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lcom/uber/autodispose/ScopeProvider;

    iget-object v0, p0, LF50;->d:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, LlE;

    iget-object v0, p0, LF50;->e:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Le13;

    iget-object v0, p0, LF50;->f:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lo50;

    iget-object v0, p0, LF50;->g:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, LTq4;

    invoke-static/range {v1 .. v7}, LF50;->c(Lom3;LGt5;Lcom/uber/autodispose/ScopeProvider;LlE;Le13;Lo50;LTq4;)LD50;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LF50;->b()LD50;

    move-result-object v0

    return-object v0
.end method
