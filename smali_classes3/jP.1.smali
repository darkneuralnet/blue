.class public final LjP;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LJQ;",
            ">;"
        }
    .end annotation
.end field

.field public final b:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LEa;",
            ">;"
        }
    .end annotation
.end field

.field public final c:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LTq4;",
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
            "LJQ;",
            ">;",
            "LY94<",
            "LEa;",
            ">;",
            "LY94<",
            "LTq4;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LjP;->a:LY94;

    iput-object p2, p0, LjP;->b:LY94;

    iput-object p3, p0, LjP;->c:LY94;

    return-void
.end method

.method public static a(LY94;LY94;LY94;)LjP;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "LJQ;",
            ">;",
            "LY94<",
            "LEa;",
            ">;",
            "LY94<",
            "LTq4;",
            ">;)",
            "LjP;"
        }
    .end annotation

    new-instance v0, LjP;

    invoke-direct {v0, p0, p1, p2}, LjP;-><init>(LY94;LY94;LY94;)V

    return-object v0
.end method

.method public static c(LJQ;LEa;LTq4;LkP;Le13;Lcom/uber/autodispose/ScopeProvider;)LfP;
    .locals 8

    new-instance v7, LfP;

    move-object v0, v7

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    invoke-direct/range {v0 .. v6}, LfP;-><init>(LJQ;LEa;LTq4;LkP;Le13;Lcom/uber/autodispose/ScopeProvider;)V

    return-object v7
.end method


# virtual methods
.method public b(LkP;Le13;Lcom/uber/autodispose/ScopeProvider;)LfP;
    .locals 7

    iget-object v0, p0, LjP;->a:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, LJQ;

    iget-object v0, p0, LjP;->b:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, LEa;

    iget-object v0, p0, LjP;->c:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, LTq4;

    move-object v4, p1

    move-object v5, p2

    move-object v6, p3

    invoke-static/range {v1 .. v6}, LjP;->c(LJQ;LEa;LTq4;LkP;Le13;Lcom/uber/autodispose/ScopeProvider;)LfP;

    move-result-object p1

    return-object p1
.end method
