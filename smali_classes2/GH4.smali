.class public final LGH4;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LKp0;",
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
            "LEa;",
            ">;"
        }
    .end annotation
.end field

.field public final d:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Landroid/os/Handler;",
            ">;"
        }
    .end annotation
.end field

.field public final e:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LTq4;",
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
            "LKp0;",
            ">;",
            "LY94<",
            "Ldr4;",
            ">;",
            "LY94<",
            "LEa;",
            ">;",
            "LY94<",
            "Landroid/os/Handler;",
            ">;",
            "LY94<",
            "LTq4;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LGH4;->a:LY94;

    iput-object p2, p0, LGH4;->b:LY94;

    iput-object p3, p0, LGH4;->c:LY94;

    iput-object p4, p0, LGH4;->d:LY94;

    iput-object p5, p0, LGH4;->e:LY94;

    return-void
.end method

.method public static a(LY94;LY94;LY94;LY94;LY94;)LGH4;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "LKp0;",
            ">;",
            "LY94<",
            "Ldr4;",
            ">;",
            "LY94<",
            "LEa;",
            ">;",
            "LY94<",
            "Landroid/os/Handler;",
            ">;",
            "LY94<",
            "LTq4;",
            ">;)",
            "LGH4;"
        }
    .end annotation

    new-instance v6, LGH4;

    move-object v0, v6

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    invoke-direct/range {v0 .. v5}, LGH4;-><init>(LY94;LY94;LY94;LY94;LY94;)V

    return-object v6
.end method

.method public static c(LKp0;Ldr4;LEa;Landroid/os/Handler;LTq4;Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;LEg1;LHH4;LDQ3;Le13;LoY1;)LCH4;
    .locals 13
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LKp0;",
            "Ldr4;",
            "LEa;",
            "Landroid/os/Handler;",
            "LTq4;",
            "Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider<",
            "LRE;",
            ">;",
            "LEg1;",
            "LHH4;",
            "LDQ3;",
            "Le13;",
            "LoY1;",
            ")",
            "LCH4;"
        }
    .end annotation

    new-instance v12, LCH4;

    move-object v0, v12

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object/from16 v4, p3

    move-object/from16 v5, p4

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    move-object/from16 v10, p9

    move-object/from16 v11, p10

    invoke-direct/range {v0 .. v11}, LCH4;-><init>(LKp0;Ldr4;LEa;Landroid/os/Handler;LTq4;Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;LEg1;LHH4;LDQ3;Le13;LoY1;)V

    return-object v12
.end method


# virtual methods
.method public b(Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;LEg1;LHH4;LDQ3;Le13;LoY1;)LCH4;
    .locals 13
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider<",
            "LRE;",
            ">;",
            "LEg1;",
            "LHH4;",
            "LDQ3;",
            "Le13;",
            "LoY1;",
            ")",
            "LCH4;"
        }
    .end annotation

    move-object v0, p0

    iget-object v1, v0, LGH4;->a:LY94;

    invoke-interface {v1}, LY94;->get()Ljava/lang/Object;

    move-result-object v1

    move-object v2, v1

    check-cast v2, LKp0;

    iget-object v1, v0, LGH4;->b:LY94;

    invoke-interface {v1}, LY94;->get()Ljava/lang/Object;

    move-result-object v1

    move-object v3, v1

    check-cast v3, Ldr4;

    iget-object v1, v0, LGH4;->c:LY94;

    invoke-interface {v1}, LY94;->get()Ljava/lang/Object;

    move-result-object v1

    move-object v4, v1

    check-cast v4, LEa;

    iget-object v1, v0, LGH4;->d:LY94;

    invoke-interface {v1}, LY94;->get()Ljava/lang/Object;

    move-result-object v1

    move-object v5, v1

    check-cast v5, Landroid/os/Handler;

    iget-object v1, v0, LGH4;->e:LY94;

    invoke-interface {v1}, LY94;->get()Ljava/lang/Object;

    move-result-object v1

    move-object v6, v1

    check-cast v6, LTq4;

    move-object v7, p1

    move-object v8, p2

    move-object/from16 v9, p3

    move-object/from16 v10, p4

    move-object/from16 v11, p5

    move-object/from16 v12, p6

    invoke-static/range {v2 .. v12}, LGH4;->c(LKp0;Ldr4;LEa;Landroid/os/Handler;LTq4;Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;LEg1;LHH4;LDQ3;Le13;LoY1;)LCH4;

    move-result-object v1

    return-object v1
.end method
