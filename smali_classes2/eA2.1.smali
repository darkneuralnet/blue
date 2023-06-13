.class public final LeA2;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LEa;",
            ">;"
        }
    .end annotation
.end field

.field public final b:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Ldr4;",
            ">;"
        }
    .end annotation
.end field

.field public final c:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LCx4;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(LY94;LY94;LY94;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "LEa;",
            ">;",
            "LY94<",
            "Ldr4;",
            ">;",
            "LY94<",
            "LCx4;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LeA2;->a:LY94;

    iput-object p2, p0, LeA2;->b:LY94;

    iput-object p3, p0, LeA2;->c:LY94;

    return-void
.end method

.method public static a(LY94;LY94;LY94;)LeA2;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "LEa;",
            ">;",
            "LY94<",
            "Ldr4;",
            ">;",
            "LY94<",
            "LCx4;",
            ">;)",
            "LeA2;"
        }
    .end annotation

    new-instance v0, LeA2;

    invoke-direct {v0, p0, p1, p2}, LeA2;-><init>(LY94;LY94;LY94;)V

    return-object v0
.end method

.method public static c(LEa;Ldr4;LCx4;LQA2;Lcom/uber/autodispose/ScopeProvider;LfA2;Le13;)LbA2;
    .locals 9

    new-instance v8, LbA2;

    move-object v0, v8

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    move-object v7, p6

    invoke-direct/range {v0 .. v7}, LbA2;-><init>(LEa;Ldr4;LCx4;LQA2;Lcom/uber/autodispose/ScopeProvider;LfA2;Le13;)V

    return-object v8
.end method


# virtual methods
.method public b(LQA2;Lcom/uber/autodispose/ScopeProvider;LfA2;Le13;)LbA2;
    .locals 8

    iget-object v0, p0, LeA2;->a:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, LEa;

    iget-object v0, p0, LeA2;->b:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Ldr4;

    iget-object v0, p0, LeA2;->c:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, LCx4;

    move-object v4, p1

    move-object v5, p2

    move-object v6, p3

    move-object v7, p4

    invoke-static/range {v1 .. v7}, LeA2;->c(LEa;Ldr4;LCx4;LQA2;Lcom/uber/autodispose/ScopeProvider;LfA2;Le13;)LbA2;

    move-result-object p1

    return-object p1
.end method
