.class public final LET0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LJT0;",
            ">;"
        }
    .end annotation
.end field

.field public final b:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lgl;",
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
            "LJT0;",
            ">;",
            "LY94<",
            "Lgl;",
            ">;",
            "LY94<",
            "LEa;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LET0;->a:LY94;

    iput-object p2, p0, LET0;->b:LY94;

    iput-object p3, p0, LET0;->c:LY94;

    return-void
.end method

.method public static a(LY94;LY94;LY94;)LET0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "LJT0;",
            ">;",
            "LY94<",
            "Lgl;",
            ">;",
            "LY94<",
            "LEa;",
            ">;)",
            "LET0;"
        }
    .end annotation

    new-instance v0, LET0;

    invoke-direct {v0, p0, p1, p2}, LET0;-><init>(LY94;LY94;LY94;)V

    return-object v0
.end method

.method public static c(LJT0;Lgl;LEa;LFT0;Le13;Lcom/uber/autodispose/ScopeProvider;)LBT0;
    .locals 8

    new-instance v7, LBT0;

    move-object v0, v7

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    invoke-direct/range {v0 .. v6}, LBT0;-><init>(LJT0;Lgl;LEa;LFT0;Le13;Lcom/uber/autodispose/ScopeProvider;)V

    return-object v7
.end method


# virtual methods
.method public b(LFT0;Le13;Lcom/uber/autodispose/ScopeProvider;)LBT0;
    .locals 7

    iget-object v0, p0, LET0;->a:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, LJT0;

    iget-object v0, p0, LET0;->b:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lgl;

    iget-object v0, p0, LET0;->c:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, LEa;

    move-object v4, p1

    move-object v5, p2

    move-object v6, p3

    invoke-static/range {v1 .. v6}, LET0;->c(LJT0;Lgl;LEa;LFT0;Le13;Lcom/uber/autodispose/ScopeProvider;)LBT0;

    move-result-object p1

    return-object p1
.end method
