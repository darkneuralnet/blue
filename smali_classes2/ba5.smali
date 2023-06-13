.class public final Lba5;
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
            "Lco/bird/android/app/feature/autopay/a;",
            ">;"
        }
    .end annotation
.end field

.field public final c:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LLa5;",
            ">;"
        }
    .end annotation
.end field

.field public final d:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LTq4;",
            ">;"
        }
    .end annotation
.end field

.field public final e:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Llw0;",
            ">;"
        }
    .end annotation
.end field

.field public final f:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Le13;",
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
            "LYR4;",
            ">;",
            "LY94<",
            "Lco/bird/android/app/feature/autopay/a;",
            ">;",
            "LY94<",
            "LLa5;",
            ">;",
            "LY94<",
            "LTq4;",
            ">;",
            "LY94<",
            "Llw0;",
            ">;",
            "LY94<",
            "Le13;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lba5;->a:LY94;

    iput-object p2, p0, Lba5;->b:LY94;

    iput-object p3, p0, Lba5;->c:LY94;

    iput-object p4, p0, Lba5;->d:LY94;

    iput-object p5, p0, Lba5;->e:LY94;

    iput-object p6, p0, Lba5;->f:LY94;

    return-void
.end method

.method public static a(LY94;LY94;LY94;LY94;LY94;LY94;)Lba5;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "LYR4;",
            ">;",
            "LY94<",
            "Lco/bird/android/app/feature/autopay/a;",
            ">;",
            "LY94<",
            "LLa5;",
            ">;",
            "LY94<",
            "LTq4;",
            ">;",
            "LY94<",
            "Llw0;",
            ">;",
            "LY94<",
            "Le13;",
            ">;)",
            "Lba5;"
        }
    .end annotation

    new-instance v7, Lba5;

    move-object v0, v7

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    invoke-direct/range {v0 .. v6}, Lba5;-><init>(LY94;LY94;LY94;LY94;LY94;LY94;)V

    return-object v7
.end method

.method public static c(LYR4;Ldagger/Lazy;Ldagger/Lazy;LTq4;Llw0;Le13;Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;Lco/bird/android/core/mvp/BaseActivity;Ljava/util/Set;)LY95;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LYR4;",
            "Ldagger/Lazy<",
            "Lco/bird/android/app/feature/autopay/a;",
            ">;",
            "Ldagger/Lazy<",
            "LLa5;",
            ">;",
            "LTq4;",
            "Llw0;",
            "Le13;",
            "Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider<",
            "LRE;",
            ">;",
            "Lco/bird/android/core/mvp/BaseActivity;",
            "Ljava/util/Set<",
            "+",
            "Lco/bird/android/model/RideState$Status;",
            ">;)",
            "LY95;"
        }
    .end annotation

    new-instance v10, LY95;

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

    invoke-direct/range {v0 .. v9}, LY95;-><init>(LYR4;Ldagger/Lazy;Ldagger/Lazy;LTq4;Llw0;Le13;Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;Lco/bird/android/core/mvp/BaseActivity;Ljava/util/Set;)V

    return-object v10
.end method


# virtual methods
.method public b(Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;Lco/bird/android/core/mvp/BaseActivity;Ljava/util/Set;)LY95;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider<",
            "LRE;",
            ">;",
            "Lco/bird/android/core/mvp/BaseActivity;",
            "Ljava/util/Set<",
            "+",
            "Lco/bird/android/model/RideState$Status;",
            ">;)",
            "LY95;"
        }
    .end annotation

    iget-object v0, p0, Lba5;->a:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, LYR4;

    iget-object v0, p0, Lba5;->b:LY94;

    invoke-static {v0}, LV51;->a(LY94;)Ldagger/Lazy;

    move-result-object v2

    iget-object v0, p0, Lba5;->c:LY94;

    invoke-static {v0}, LV51;->a(LY94;)Ldagger/Lazy;

    move-result-object v3

    iget-object v0, p0, Lba5;->d:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, LTq4;

    iget-object v0, p0, Lba5;->e:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Llw0;

    iget-object v0, p0, Lba5;->f:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Le13;

    move-object v7, p1

    move-object v8, p2

    move-object v9, p3

    invoke-static/range {v1 .. v9}, Lba5;->c(LYR4;Ldagger/Lazy;Ldagger/Lazy;LTq4;Llw0;Le13;Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;Lco/bird/android/core/mvp/BaseActivity;Ljava/util/Set;)LY95;

    move-result-object p1

    return-object p1
.end method
