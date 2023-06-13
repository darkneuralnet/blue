.class public final Leu5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsj1;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lsj1<",
        "Lqx1;",
        ">;"
    }
.end annotation


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
            "Lom3;",
            ">;"
        }
    .end annotation
.end field

.field public final c:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LRh6;",
            ">;"
        }
    .end annotation
.end field

.field public final d:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Ldr4;",
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

.field public final f:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lde5;",
            ">;"
        }
    .end annotation
.end field

.field public final g:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Landroid/content/Intent;",
            ">;"
        }
    .end annotation
.end field

.field public final h:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lgl;",
            ">;"
        }
    .end annotation
.end field

.field public final i:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LLifecycleOwner;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(LY94;LY94;LY94;LY94;LY94;LY94;LY94;LY94;LY94;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "Landroid/content/Context;",
            ">;",
            "LY94<",
            "Lom3;",
            ">;",
            "LY94<",
            "LRh6;",
            ">;",
            "LY94<",
            "Ldr4;",
            ">;",
            "LY94<",
            "LTq4;",
            ">;",
            "LY94<",
            "Lde5;",
            ">;",
            "LY94<",
            "Landroid/content/Intent;",
            ">;",
            "LY94<",
            "Lgl;",
            ">;",
            "LY94<",
            "LLifecycleOwner;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Leu5;->a:LY94;

    iput-object p2, p0, Leu5;->b:LY94;

    iput-object p3, p0, Leu5;->c:LY94;

    iput-object p4, p0, Leu5;->d:LY94;

    iput-object p5, p0, Leu5;->e:LY94;

    iput-object p6, p0, Leu5;->f:LY94;

    iput-object p7, p0, Leu5;->g:LY94;

    iput-object p8, p0, Leu5;->h:LY94;

    iput-object p9, p0, Leu5;->i:LY94;

    return-void
.end method

.method public static a(LY94;LY94;LY94;LY94;LY94;LY94;LY94;LY94;LY94;)Leu5;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "Landroid/content/Context;",
            ">;",
            "LY94<",
            "Lom3;",
            ">;",
            "LY94<",
            "LRh6;",
            ">;",
            "LY94<",
            "Ldr4;",
            ">;",
            "LY94<",
            "LTq4;",
            ">;",
            "LY94<",
            "Lde5;",
            ">;",
            "LY94<",
            "Landroid/content/Intent;",
            ">;",
            "LY94<",
            "Lgl;",
            ">;",
            "LY94<",
            "LLifecycleOwner;",
            ">;)",
            "Leu5;"
        }
    .end annotation

    new-instance v10, Leu5;

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

    invoke-direct/range {v0 .. v9}, Leu5;-><init>(LY94;LY94;LY94;LY94;LY94;LY94;LY94;LY94;LY94;)V

    return-object v10
.end method

.method public static c(Landroid/content/Context;Lom3;LRh6;Ldr4;LTq4;Lde5;Landroid/content/Intent;Lgl;LLifecycleOwner;)Lqx1;
    .locals 0

    invoke-static/range {p0 .. p8}, Lau5;->d(Landroid/content/Context;Lom3;LRh6;Ldr4;LTq4;Lde5;Landroid/content/Intent;Lgl;LLifecycleOwner;)Lqx1;

    move-result-object p0

    invoke-static {p0}, LxZ3;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lqx1;

    return-object p0
.end method


# virtual methods
.method public b()Lqx1;
    .locals 10

    iget-object v0, p0, Leu5;->a:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Landroid/content/Context;

    iget-object v0, p0, Leu5;->b:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lom3;

    iget-object v0, p0, Leu5;->c:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, LRh6;

    iget-object v0, p0, Leu5;->d:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Ldr4;

    iget-object v0, p0, Leu5;->e:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, LTq4;

    iget-object v0, p0, Leu5;->f:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lde5;

    iget-object v0, p0, Leu5;->g:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Landroid/content/Intent;

    iget-object v0, p0, Leu5;->h:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Lgl;

    iget-object v0, p0, Leu5;->i:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v9, v0

    check-cast v9, LLifecycleOwner;

    invoke-static/range {v1 .. v9}, Leu5;->c(Landroid/content/Context;Lom3;LRh6;Ldr4;LTq4;Lde5;Landroid/content/Intent;Lgl;LLifecycleOwner;)Lqx1;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Leu5;->b()Lqx1;

    move-result-object v0

    return-object v0
.end method
