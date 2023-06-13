.class public final LZS2;
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
            "LiO;",
            ">;"
        }
    .end annotation
.end field

.field public final c:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Landroid/os/Handler;",
            ">;"
        }
    .end annotation
.end field

.field public final d:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LV74;",
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
            "LEa;",
            ">;",
            "LY94<",
            "LiO;",
            ">;",
            "LY94<",
            "Landroid/os/Handler;",
            ">;",
            "LY94<",
            "LV74;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LZS2;->a:LY94;

    iput-object p2, p0, LZS2;->b:LY94;

    iput-object p3, p0, LZS2;->c:LY94;

    iput-object p4, p0, LZS2;->d:LY94;

    return-void
.end method

.method public static a(LY94;LY94;LY94;LY94;)LZS2;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "LEa;",
            ">;",
            "LY94<",
            "LiO;",
            ">;",
            "LY94<",
            "Landroid/os/Handler;",
            ">;",
            "LY94<",
            "LV74;",
            ">;)",
            "LZS2;"
        }
    .end annotation

    new-instance v0, LZS2;

    invoke-direct {v0, p0, p1, p2, p3}, LZS2;-><init>(LY94;LY94;LY94;LY94;)V

    return-object v0
.end method

.method public static c(LEa;LiO;Landroid/os/Handler;LV74;Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;LDQ3;LcT2;Le13;)LWS2;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LEa;",
            "LiO;",
            "Landroid/os/Handler;",
            "LV74;",
            "Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider<",
            "LRE;",
            ">;",
            "LDQ3;",
            "LcT2;",
            "Le13;",
            ")",
            "LWS2;"
        }
    .end annotation

    new-instance v9, LWS2;

    move-object v0, v9

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    invoke-direct/range {v0 .. v8}, LWS2;-><init>(LEa;LiO;Landroid/os/Handler;LV74;Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;LDQ3;LcT2;Le13;)V

    return-object v9
.end method


# virtual methods
.method public b(Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;LDQ3;LcT2;Le13;)LWS2;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider<",
            "LRE;",
            ">;",
            "LDQ3;",
            "LcT2;",
            "Le13;",
            ")",
            "LWS2;"
        }
    .end annotation

    iget-object v0, p0, LZS2;->a:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, LEa;

    iget-object v0, p0, LZS2;->b:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, LiO;

    iget-object v0, p0, LZS2;->c:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Landroid/os/Handler;

    iget-object v0, p0, LZS2;->d:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, LV74;

    move-object v5, p1

    move-object v6, p2

    move-object v7, p3

    move-object v8, p4

    invoke-static/range {v1 .. v8}, LZS2;->c(LEa;LiO;Landroid/os/Handler;LV74;Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;LDQ3;LcT2;Le13;)LWS2;

    move-result-object p1

    return-object p1
.end method
