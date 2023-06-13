.class public final LKr5;
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
            "LEa;",
            ">;"
        }
    .end annotation
.end field

.field public final c:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LpU4;",
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
            "LTq4;",
            ">;",
            "LY94<",
            "LEa;",
            ">;",
            "LY94<",
            "LpU4;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LKr5;->a:LY94;

    iput-object p2, p0, LKr5;->b:LY94;

    iput-object p3, p0, LKr5;->c:LY94;

    return-void
.end method

.method public static a(LY94;LY94;LY94;)LKr5;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "LTq4;",
            ">;",
            "LY94<",
            "LEa;",
            ">;",
            "LY94<",
            "LpU4;",
            ">;)",
            "LKr5;"
        }
    .end annotation

    new-instance v0, LKr5;

    invoke-direct {v0, p0, p1, p2}, LKr5;-><init>(LY94;LY94;LY94;)V

    return-object v0
.end method

.method public static c(LTq4;LEa;LpU4;LLr5;Lcom/uber/autodispose/ScopeProvider;)LHr5;
    .locals 7

    new-instance v6, LHr5;

    move-object v0, v6

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    invoke-direct/range {v0 .. v5}, LHr5;-><init>(LTq4;LEa;LpU4;LLr5;Lcom/uber/autodispose/ScopeProvider;)V

    return-object v6
.end method


# virtual methods
.method public b(LLr5;Lcom/uber/autodispose/ScopeProvider;)LHr5;
    .locals 3

    iget-object v0, p0, LKr5;->a:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LTq4;

    iget-object v1, p0, LKr5;->b:LY94;

    invoke-interface {v1}, LY94;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LEa;

    iget-object v2, p0, LKr5;->c:LY94;

    invoke-interface {v2}, LY94;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LpU4;

    invoke-static {v0, v1, v2, p1, p2}, LKr5;->c(LTq4;LEa;LpU4;LLr5;Lcom/uber/autodispose/ScopeProvider;)LHr5;

    move-result-object p1

    return-object p1
.end method
