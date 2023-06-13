.class public final Lq13;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LoF3;",
            ">;"
        }
    .end annotation
.end field

.field public final b:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Landroid/content/Context;",
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


# direct methods
.method public constructor <init>(LY94;LY94;LY94;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "LoF3;",
            ">;",
            "LY94<",
            "Landroid/content/Context;",
            ">;",
            "LY94<",
            "LEa;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lq13;->a:LY94;

    iput-object p2, p0, Lq13;->b:LY94;

    iput-object p3, p0, Lq13;->c:LY94;

    return-void
.end method

.method public static a(LY94;LY94;LY94;)Lq13;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "LoF3;",
            ">;",
            "LY94<",
            "Landroid/content/Context;",
            ">;",
            "LY94<",
            "LEa;",
            ">;)",
            "Lq13;"
        }
    .end annotation

    new-instance v0, Lq13;

    invoke-direct {v0, p0, p1, p2}, Lq13;-><init>(LY94;LY94;LY94;)V

    return-object v0
.end method

.method public static c(LoF3;Landroid/content/Context;LEa;Lr13;Lcom/uber/autodispose/ScopeProvider;Lma4;)Ln13;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LoF3;",
            "Landroid/content/Context;",
            "LEa;",
            "Lr13;",
            "Lcom/uber/autodispose/ScopeProvider;",
            "Lma4<",
            "LH2;",
            ">;)",
            "Ln13;"
        }
    .end annotation

    new-instance v7, Ln13;

    move-object v0, v7

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    invoke-direct/range {v0 .. v6}, Ln13;-><init>(LoF3;Landroid/content/Context;LEa;Lr13;Lcom/uber/autodispose/ScopeProvider;Lma4;)V

    return-object v7
.end method


# virtual methods
.method public b(Lr13;Lcom/uber/autodispose/ScopeProvider;Lma4;)Ln13;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lr13;",
            "Lcom/uber/autodispose/ScopeProvider;",
            "Lma4<",
            "LH2;",
            ">;)",
            "Ln13;"
        }
    .end annotation

    iget-object v0, p0, Lq13;->a:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, LoF3;

    iget-object v0, p0, Lq13;->b:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Landroid/content/Context;

    iget-object v0, p0, Lq13;->c:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, LEa;

    move-object v4, p1

    move-object v5, p2

    move-object v6, p3

    invoke-static/range {v1 .. v6}, Lq13;->c(LoF3;Landroid/content/Context;LEa;Lr13;Lcom/uber/autodispose/ScopeProvider;Lma4;)Ln13;

    move-result-object p1

    return-object p1
.end method
