.class public final Lhq0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lbn;",
            ">;"
        }
    .end annotation
.end field

.field public final b:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LaM;",
            ">;"
        }
    .end annotation
.end field

.field public final c:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lco/bird/android/app/feature/map/ui/LocationSelectionUiImplFactory;",
            ">;"
        }
    .end annotation
.end field

.field public final d:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lco/bird/android/app/feature/map/presenter/LocationSelectionPresenterImplFactory;",
            ">;"
        }
    .end annotation
.end field

.field public final e:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LVq4;",
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
            "Lbn;",
            ">;",
            "LY94<",
            "LaM;",
            ">;",
            "LY94<",
            "Lco/bird/android/app/feature/map/ui/LocationSelectionUiImplFactory;",
            ">;",
            "LY94<",
            "Lco/bird/android/app/feature/map/presenter/LocationSelectionPresenterImplFactory;",
            ">;",
            "LY94<",
            "LVq4;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lhq0;->a:LY94;

    iput-object p2, p0, Lhq0;->b:LY94;

    iput-object p3, p0, Lhq0;->c:LY94;

    iput-object p4, p0, Lhq0;->d:LY94;

    iput-object p5, p0, Lhq0;->e:LY94;

    return-void
.end method

.method public static a(LY94;LY94;LY94;LY94;LY94;)Lhq0;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "Lbn;",
            ">;",
            "LY94<",
            "LaM;",
            ">;",
            "LY94<",
            "Lco/bird/android/app/feature/map/ui/LocationSelectionUiImplFactory;",
            ">;",
            "LY94<",
            "Lco/bird/android/app/feature/map/presenter/LocationSelectionPresenterImplFactory;",
            ">;",
            "LY94<",
            "LVq4;",
            ">;)",
            "Lhq0;"
        }
    .end annotation

    new-instance v6, Lhq0;

    move-object v0, v6

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    invoke-direct/range {v0 .. v5}, Lhq0;-><init>(LY94;LY94;LY94;LY94;LY94;)V

    return-object v6
.end method

.method public static c(Lbn;LaM;Lco/bird/android/app/feature/map/ui/LocationSelectionUiImplFactory;Lco/bird/android/app/feature/map/presenter/LocationSelectionPresenterImplFactory;LVq4;Lco/bird/android/core/mvp/BaseActivity;Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;Landroid/view/ViewGroup;Le13;)Leq0;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lbn;",
            "LaM;",
            "Lco/bird/android/app/feature/map/ui/LocationSelectionUiImplFactory;",
            "Lco/bird/android/app/feature/map/presenter/LocationSelectionPresenterImplFactory;",
            "LVq4;",
            "Lco/bird/android/core/mvp/BaseActivity;",
            "Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider<",
            "LRE;",
            ">;",
            "Landroid/view/ViewGroup;",
            "Le13;",
            ")",
            "Leq0;"
        }
    .end annotation

    new-instance v10, Leq0;

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

    invoke-direct/range {v0 .. v9}, Leq0;-><init>(Lbn;LaM;Lco/bird/android/app/feature/map/ui/LocationSelectionUiImplFactory;Lco/bird/android/app/feature/map/presenter/LocationSelectionPresenterImplFactory;LVq4;Lco/bird/android/core/mvp/BaseActivity;Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;Landroid/view/ViewGroup;Le13;)V

    return-object v10
.end method


# virtual methods
.method public b(Lco/bird/android/core/mvp/BaseActivity;Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;Landroid/view/ViewGroup;Le13;)Leq0;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/bird/android/core/mvp/BaseActivity;",
            "Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider<",
            "LRE;",
            ">;",
            "Landroid/view/ViewGroup;",
            "Le13;",
            ")",
            "Leq0;"
        }
    .end annotation

    iget-object v0, p0, Lhq0;->a:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lbn;

    iget-object v0, p0, Lhq0;->b:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, LaM;

    iget-object v0, p0, Lhq0;->c:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lco/bird/android/app/feature/map/ui/LocationSelectionUiImplFactory;

    iget-object v0, p0, Lhq0;->d:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lco/bird/android/app/feature/map/presenter/LocationSelectionPresenterImplFactory;

    iget-object v0, p0, Lhq0;->e:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, LVq4;

    move-object v6, p1

    move-object v7, p2

    move-object v8, p3

    move-object v9, p4

    invoke-static/range {v1 .. v9}, Lhq0;->c(Lbn;LaM;Lco/bird/android/app/feature/map/ui/LocationSelectionUiImplFactory;Lco/bird/android/app/feature/map/presenter/LocationSelectionPresenterImplFactory;LVq4;Lco/bird/android/core/mvp/BaseActivity;Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;Landroid/view/ViewGroup;Le13;)Leq0;

    move-result-object p1

    return-object p1
.end method
