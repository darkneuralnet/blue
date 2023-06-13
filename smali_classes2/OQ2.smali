.class public final LOQ2;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LiO;",
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


# direct methods
.method public constructor <init>(LY94;LY94;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "LiO;",
            ">;",
            "LY94<",
            "Ldr4;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LOQ2;->a:LY94;

    iput-object p2, p0, LOQ2;->b:LY94;

    return-void
.end method

.method public static a(LY94;LY94;)LOQ2;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "LiO;",
            ">;",
            "LY94<",
            "Ldr4;",
            ">;)",
            "LOQ2;"
        }
    .end annotation

    new-instance v0, LOQ2;

    invoke-direct {v0, p0, p1}, LOQ2;-><init>(LY94;LY94;)V

    return-object v0
.end method

.method public static c(LiO;Ldr4;LPQ2;Lcom/uber/autodispose/ScopeProvider;Le13;LTq4;)LLQ2;
    .locals 8

    new-instance v7, LLQ2;

    move-object v0, v7

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    invoke-direct/range {v0 .. v6}, LLQ2;-><init>(LiO;Ldr4;LPQ2;Lcom/uber/autodispose/ScopeProvider;Le13;LTq4;)V

    return-object v7
.end method


# virtual methods
.method public b(LPQ2;Lcom/uber/autodispose/ScopeProvider;Le13;LTq4;)LLQ2;
    .locals 7

    iget-object v0, p0, LOQ2;->a:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, LiO;

    iget-object v0, p0, LOQ2;->b:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Ldr4;

    move-object v3, p1

    move-object v4, p2

    move-object v5, p3

    move-object v6, p4

    invoke-static/range {v1 .. v6}, LOQ2;->c(LiO;Ldr4;LPQ2;Lcom/uber/autodispose/ScopeProvider;Le13;LTq4;)LLQ2;

    move-result-object p1

    return-object p1
.end method
