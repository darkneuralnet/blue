.class public final LsT;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LVq4;",
            ">;"
        }
    .end annotation
.end field

.field public final b:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LFO2;",
            ">;"
        }
    .end annotation
.end field

.field public final c:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LEg1;",
            ">;"
        }
    .end annotation
.end field

.field public final d:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lgl;",
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
            "LVq4;",
            ">;",
            "LY94<",
            "LFO2;",
            ">;",
            "LY94<",
            "LEg1;",
            ">;",
            "LY94<",
            "Lgl;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LsT;->a:LY94;

    iput-object p2, p0, LsT;->b:LY94;

    iput-object p3, p0, LsT;->c:LY94;

    iput-object p4, p0, LsT;->d:LY94;

    return-void
.end method

.method public static a(LY94;LY94;LY94;LY94;)LsT;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "LVq4;",
            ">;",
            "LY94<",
            "LFO2;",
            ">;",
            "LY94<",
            "LEg1;",
            ">;",
            "LY94<",
            "Lgl;",
            ">;)",
            "LsT;"
        }
    .end annotation

    new-instance v0, LsT;

    invoke-direct {v0, p0, p1, p2, p3}, LsT;-><init>(LY94;LY94;LY94;LY94;)V

    return-object v0
.end method

.method public static c(LVq4;LFO2;LEg1;Lgl;Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;Landroid/content/res/Resources;LtT;Le13;LDQ3;)LpT;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LVq4;",
            "LFO2;",
            "LEg1;",
            "Lgl;",
            "Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider<",
            "LRE;",
            ">;",
            "Landroid/content/res/Resources;",
            "LtT;",
            "Le13;",
            "LDQ3;",
            ")",
            "LpT;"
        }
    .end annotation

    new-instance v10, LpT;

    move-object v0, v10

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    invoke-direct/range {v0 .. v9}, LpT;-><init>(LVq4;LFO2;LEg1;Lgl;Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;Landroid/content/res/Resources;LtT;Le13;LDQ3;)V

    return-object v10
.end method


# virtual methods
.method public b(Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;Landroid/content/res/Resources;LtT;Le13;LDQ3;)LpT;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider<",
            "LRE;",
            ">;",
            "Landroid/content/res/Resources;",
            "LtT;",
            "Le13;",
            "LDQ3;",
            ")",
            "LpT;"
        }
    .end annotation

    iget-object v0, p0, LsT;->a:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, LVq4;

    iget-object v0, p0, LsT;->b:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, LFO2;

    iget-object v0, p0, LsT;->c:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, LEg1;

    iget-object v0, p0, LsT;->d:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lgl;

    move-object v5, p1

    move-object v6, p2

    move-object v7, p3

    move-object v8, p4

    move-object v9, p5

    invoke-static/range {v1 .. v9}, LsT;->c(LVq4;LFO2;LEg1;Lgl;Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;Landroid/content/res/Resources;LtT;Le13;LDQ3;)LpT;

    move-result-object p1

    return-object p1
.end method
