.class public final Ljr;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LEg1;",
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
            "Llh6;",
            ">;"
        }
    .end annotation
.end field

.field public final d:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lqi1;",
            ">;"
        }
    .end annotation
.end field

.field public final e:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lgl;",
            ">;"
        }
    .end annotation
.end field

.field public final f:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LTq4;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(LY94;LY94;LY94;LY94;LY94;LY94;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "LEg1;",
            ">;",
            "LY94<",
            "Lgl;",
            ">;",
            "LY94<",
            "Llh6;",
            ">;",
            "LY94<",
            "Lqi1;",
            ">;",
            "LY94<",
            "Lgl;",
            ">;",
            "LY94<",
            "LTq4;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ljr;->a:LY94;

    iput-object p2, p0, Ljr;->b:LY94;

    iput-object p3, p0, Ljr;->c:LY94;

    iput-object p4, p0, Ljr;->d:LY94;

    iput-object p5, p0, Ljr;->e:LY94;

    iput-object p6, p0, Ljr;->f:LY94;

    return-void
.end method

.method public static a(LY94;LY94;LY94;LY94;LY94;LY94;)Ljr;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "LEg1;",
            ">;",
            "LY94<",
            "Lgl;",
            ">;",
            "LY94<",
            "Llh6;",
            ">;",
            "LY94<",
            "Lqi1;",
            ">;",
            "LY94<",
            "Lgl;",
            ">;",
            "LY94<",
            "LTq4;",
            ">;)",
            "Ljr;"
        }
    .end annotation

    new-instance v7, Ljr;

    move-object v0, v7

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    invoke-direct/range {v0 .. v6}, Ljr;-><init>(LY94;LY94;LY94;LY94;LY94;LY94;)V

    return-object v7
.end method

.method public static c(Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;LEg1;Lgl;Llh6;Lqi1;Lgl;LTq4;Landroid/content/res/Resources;Lco/bird/android/app/feature/autopay/b;Le13;Z)Lgr;
    .locals 13
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider<",
            "LRE;",
            ">;",
            "LEg1;",
            "Lgl;",
            "Llh6;",
            "Lqi1;",
            "Lgl;",
            "LTq4;",
            "Landroid/content/res/Resources;",
            "Lco/bird/android/app/feature/autopay/b;",
            "Le13;",
            "Z)",
            "Lgr;"
        }
    .end annotation

    new-instance v12, Lgr;

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

    move/from16 v11, p10

    invoke-direct/range {v0 .. v11}, Lgr;-><init>(Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;LEg1;Lgl;Llh6;Lqi1;Lgl;LTq4;Landroid/content/res/Resources;Lco/bird/android/app/feature/autopay/b;Le13;Z)V

    return-object v12
.end method


# virtual methods
.method public b(Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;Landroid/content/res/Resources;Lco/bird/android/app/feature/autopay/b;Le13;Z)Lgr;
    .locals 13
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider<",
            "LRE;",
            ">;",
            "Landroid/content/res/Resources;",
            "Lco/bird/android/app/feature/autopay/b;",
            "Le13;",
            "Z)",
            "Lgr;"
        }
    .end annotation

    move-object v0, p0

    iget-object v1, v0, Ljr;->a:LY94;

    invoke-interface {v1}, LY94;->get()Ljava/lang/Object;

    move-result-object v1

    move-object v3, v1

    check-cast v3, LEg1;

    iget-object v1, v0, Ljr;->b:LY94;

    invoke-interface {v1}, LY94;->get()Ljava/lang/Object;

    move-result-object v1

    move-object v4, v1

    check-cast v4, Lgl;

    iget-object v1, v0, Ljr;->c:LY94;

    invoke-interface {v1}, LY94;->get()Ljava/lang/Object;

    move-result-object v1

    move-object v5, v1

    check-cast v5, Llh6;

    iget-object v1, v0, Ljr;->d:LY94;

    invoke-interface {v1}, LY94;->get()Ljava/lang/Object;

    move-result-object v1

    move-object v6, v1

    check-cast v6, Lqi1;

    iget-object v1, v0, Ljr;->e:LY94;

    invoke-interface {v1}, LY94;->get()Ljava/lang/Object;

    move-result-object v1

    move-object v7, v1

    check-cast v7, Lgl;

    iget-object v1, v0, Ljr;->f:LY94;

    invoke-interface {v1}, LY94;->get()Ljava/lang/Object;

    move-result-object v1

    move-object v8, v1

    check-cast v8, LTq4;

    move-object v2, p1

    move-object v9, p2

    move-object/from16 v10, p3

    move-object/from16 v11, p4

    move/from16 v12, p5

    invoke-static/range {v2 .. v12}, Ljr;->c(Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;LEg1;Lgl;Llh6;Lqi1;Lgl;LTq4;Landroid/content/res/Resources;Lco/bird/android/app/feature/autopay/b;Le13;Z)Lgr;

    move-result-object v1

    return-object v1
.end method
