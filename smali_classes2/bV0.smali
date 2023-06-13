.class public final LbV0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Landroid/content/Context;",
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
            "LAz6;",
            ">;"
        }
    .end annotation
.end field

.field public final d:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LcI4;",
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


# direct methods
.method public constructor <init>(LY94;LY94;LY94;LY94;LY94;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "Landroid/content/Context;",
            ">;",
            "LY94<",
            "Lgl;",
            ">;",
            "LY94<",
            "LAz6;",
            ">;",
            "LY94<",
            "LcI4;",
            ">;",
            "LY94<",
            "Le13;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LbV0;->a:LY94;

    iput-object p2, p0, LbV0;->b:LY94;

    iput-object p3, p0, LbV0;->c:LY94;

    iput-object p4, p0, LbV0;->d:LY94;

    iput-object p5, p0, LbV0;->e:LY94;

    return-void
.end method

.method public static a(LY94;LY94;LY94;LY94;LY94;)LbV0;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "Landroid/content/Context;",
            ">;",
            "LY94<",
            "Lgl;",
            ">;",
            "LY94<",
            "LAz6;",
            ">;",
            "LY94<",
            "LcI4;",
            ">;",
            "LY94<",
            "Le13;",
            ">;)",
            "LbV0;"
        }
    .end annotation

    new-instance v6, LbV0;

    move-object v0, v6

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    invoke-direct/range {v0 .. v5}, LbV0;-><init>(LY94;LY94;LY94;LY94;LY94;)V

    return-object v6
.end method

.method public static c(Landroid/content/Context;Lgl;LAz6;LcI4;Le13;Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;LeV0;)LWU0;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Lgl;",
            "LAz6;",
            "LcI4;",
            "Le13;",
            "Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider<",
            "LRE;",
            ">;",
            "LeV0;",
            ")",
            "LWU0;"
        }
    .end annotation

    new-instance v8, LWU0;

    move-object v0, v8

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    move-object v7, p6

    invoke-direct/range {v0 .. v7}, LWU0;-><init>(Landroid/content/Context;Lgl;LAz6;LcI4;Le13;Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;LeV0;)V

    return-object v8
.end method


# virtual methods
.method public b(Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;LeV0;)LWU0;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider<",
            "LRE;",
            ">;",
            "LeV0;",
            ")",
            "LWU0;"
        }
    .end annotation

    iget-object v0, p0, LbV0;->a:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Landroid/content/Context;

    iget-object v0, p0, LbV0;->b:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lgl;

    iget-object v0, p0, LbV0;->c:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, LAz6;

    iget-object v0, p0, LbV0;->d:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, LcI4;

    iget-object v0, p0, LbV0;->e:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Le13;

    move-object v6, p1

    move-object v7, p2

    invoke-static/range {v1 .. v7}, LbV0;->c(Landroid/content/Context;Lgl;LAz6;LcI4;Le13;Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;LeV0;)LWU0;

    move-result-object p1

    return-object p1
.end method
