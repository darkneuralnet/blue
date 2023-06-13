.class public final LrQ4;
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
            "LYR4;",
            ">;"
        }
    .end annotation
.end field

.field public final c:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LEa;",
            ">;"
        }
    .end annotation
.end field

.field public final d:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LGI3;",
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
            "LYR4;",
            ">;",
            "LY94<",
            "LEa;",
            ">;",
            "LY94<",
            "LGI3;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LrQ4;->a:LY94;

    iput-object p2, p0, LrQ4;->b:LY94;

    iput-object p3, p0, LrQ4;->c:LY94;

    iput-object p4, p0, LrQ4;->d:LY94;

    return-void
.end method

.method public static a(LY94;LY94;LY94;LY94;)LrQ4;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "LTq4;",
            ">;",
            "LY94<",
            "LYR4;",
            ">;",
            "LY94<",
            "LEa;",
            ">;",
            "LY94<",
            "LGI3;",
            ">;)",
            "LrQ4;"
        }
    .end annotation

    new-instance v0, LrQ4;

    invoke-direct {v0, p0, p1, p2, p3}, LrQ4;-><init>(LY94;LY94;LY94;LY94;)V

    return-object v0
.end method

.method public static c(LTq4;LYR4;LEa;LGI3;Lcom/uber/autodispose/ScopeProvider;Le13;LsQ4;)LiQ4;
    .locals 9

    new-instance v8, LiQ4;

    move-object v0, v8

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    move-object v7, p6

    invoke-direct/range {v0 .. v7}, LiQ4;-><init>(LTq4;LYR4;LEa;LGI3;Lcom/uber/autodispose/ScopeProvider;Le13;LsQ4;)V

    return-object v8
.end method


# virtual methods
.method public b(Lcom/uber/autodispose/ScopeProvider;Le13;LsQ4;)LiQ4;
    .locals 8

    iget-object v0, p0, LrQ4;->a:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, LTq4;

    iget-object v0, p0, LrQ4;->b:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, LYR4;

    iget-object v0, p0, LrQ4;->c:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, LEa;

    iget-object v0, p0, LrQ4;->d:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, LGI3;

    move-object v5, p1

    move-object v6, p2

    move-object v7, p3

    invoke-static/range {v1 .. v7}, LrQ4;->c(LTq4;LYR4;LEa;LGI3;Lcom/uber/autodispose/ScopeProvider;Le13;LsQ4;)LiQ4;

    move-result-object p1

    return-object p1
.end method
