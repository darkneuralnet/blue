.class public final LA9;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LYR4;",
            ">;"
        }
    .end annotation
.end field

.field public final b:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lm9;",
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
            "LYR4;",
            ">;",
            "LY94<",
            "Lm9;",
            ">;",
            "LY94<",
            "LTq4;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LA9;->a:LY94;

    iput-object p2, p0, LA9;->b:LY94;

    iput-object p3, p0, LA9;->c:LY94;

    return-void
.end method

.method public static a(LY94;LY94;LY94;)LA9;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "LYR4;",
            ">;",
            "LY94<",
            "Lm9;",
            ">;",
            "LY94<",
            "LTq4;",
            ">;)",
            "LA9;"
        }
    .end annotation

    new-instance v0, LA9;

    invoke-direct {v0, p0, p1, p2}, LA9;-><init>(LY94;LY94;LY94;)V

    return-object v0
.end method

.method public static c(Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;LYR4;Lm9;LTq4;LB9;)Lx9;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider<",
            "LRE;",
            ">;",
            "LYR4;",
            "Lm9;",
            "LTq4;",
            "LB9;",
            ")",
            "Lx9;"
        }
    .end annotation

    new-instance v6, Lx9;

    move-object v0, v6

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    invoke-direct/range {v0 .. v5}, Lx9;-><init>(Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;LYR4;Lm9;LTq4;LB9;)V

    return-object v6
.end method


# virtual methods
.method public b(Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;LB9;)Lx9;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider<",
            "LRE;",
            ">;",
            "LB9;",
            ")",
            "Lx9;"
        }
    .end annotation

    iget-object v0, p0, LA9;->a:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LYR4;

    iget-object v1, p0, LA9;->b:LY94;

    invoke-interface {v1}, LY94;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lm9;

    iget-object v2, p0, LA9;->c:LY94;

    invoke-interface {v2}, LY94;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LTq4;

    invoke-static {p1, v0, v1, v2, p2}, LA9;->c(Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;LYR4;Lm9;LTq4;LB9;)Lx9;

    move-result-object p1

    return-object p1
.end method
