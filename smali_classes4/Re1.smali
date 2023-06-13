.class public final LRe1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsj1;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lsj1<",
        "LNe1;",
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
            "LSM;",
            ">;"
        }
    .end annotation
.end field

.field public final c:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LNQ5;",
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
            "LSe1;",
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
            "Lom3;",
            ">;",
            "LY94<",
            "LSM;",
            ">;",
            "LY94<",
            "LNQ5;",
            ">;",
            "LY94<",
            "Lcom/uber/autodispose/ScopeProvider;",
            ">;",
            "LY94<",
            "LSe1;",
            ">;",
            "LY94<",
            "Le13;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LRe1;->a:LY94;

    iput-object p2, p0, LRe1;->b:LY94;

    iput-object p3, p0, LRe1;->c:LY94;

    iput-object p4, p0, LRe1;->d:LY94;

    iput-object p5, p0, LRe1;->e:LY94;

    iput-object p6, p0, LRe1;->f:LY94;

    return-void
.end method

.method public static a(LY94;LY94;LY94;LY94;LY94;LY94;)LRe1;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "Lom3;",
            ">;",
            "LY94<",
            "LSM;",
            ">;",
            "LY94<",
            "LNQ5;",
            ">;",
            "LY94<",
            "Lcom/uber/autodispose/ScopeProvider;",
            ">;",
            "LY94<",
            "LSe1;",
            ">;",
            "LY94<",
            "Le13;",
            ">;)",
            "LRe1;"
        }
    .end annotation

    new-instance v7, LRe1;

    move-object v0, v7

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    invoke-direct/range {v0 .. v6}, LRe1;-><init>(LY94;LY94;LY94;LY94;LY94;LY94;)V

    return-object v7
.end method

.method public static c(Lom3;LSM;LNQ5;Lcom/uber/autodispose/ScopeProvider;LSe1;Le13;)LNe1;
    .locals 8

    new-instance v7, LNe1;

    move-object v0, v7

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    invoke-direct/range {v0 .. v6}, LNe1;-><init>(Lom3;LSM;LNQ5;Lcom/uber/autodispose/ScopeProvider;LSe1;Le13;)V

    return-object v7
.end method


# virtual methods
.method public b()LNe1;
    .locals 7

    iget-object v0, p0, LRe1;->a:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lom3;

    iget-object v0, p0, LRe1;->b:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, LSM;

    iget-object v0, p0, LRe1;->c:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, LNQ5;

    iget-object v0, p0, LRe1;->d:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/uber/autodispose/ScopeProvider;

    iget-object v0, p0, LRe1;->e:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, LSe1;

    iget-object v0, p0, LRe1;->f:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Le13;

    invoke-static/range {v1 .. v6}, LRe1;->c(Lom3;LSM;LNQ5;Lcom/uber/autodispose/ScopeProvider;LSe1;Le13;)LNe1;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LRe1;->b()LNe1;

    move-result-object v0

    return-object v0
.end method
