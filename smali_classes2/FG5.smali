.class public final LFG5;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LMD;",
            ">;"
        }
    .end annotation
.end field

.field public final b:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LhI5;",
            ">;"
        }
    .end annotation
.end field

.field public final c:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LJy4;",
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
            "LMD;",
            ">;",
            "LY94<",
            "LhI5;",
            ">;",
            "LY94<",
            "LJy4;",
            ">;",
            "LY94<",
            "Lgl;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LFG5;->a:LY94;

    iput-object p2, p0, LFG5;->b:LY94;

    iput-object p3, p0, LFG5;->c:LY94;

    iput-object p4, p0, LFG5;->d:LY94;

    return-void
.end method

.method public static a(LY94;LY94;LY94;LY94;)LFG5;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "LMD;",
            ">;",
            "LY94<",
            "LhI5;",
            ">;",
            "LY94<",
            "LJy4;",
            ">;",
            "LY94<",
            "Lgl;",
            ">;)",
            "LFG5;"
        }
    .end annotation

    new-instance v0, LFG5;

    invoke-direct {v0, p0, p1, p2, p3}, LFG5;-><init>(LY94;LY94;LY94;LY94;)V

    return-object v0
.end method

.method public static c(LMD;LhI5;LJy4;Lgl;LDQ3;Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;LFF5;Le13;)Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationPresenter;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LMD;",
            "LhI5;",
            "LJy4;",
            "Lgl;",
            "LDQ3;",
            "Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider<",
            "LRE;",
            ">;",
            "LFF5;",
            "Le13;",
            ")",
            "Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationPresenter;"
        }
    .end annotation

    new-instance v9, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationPresenter;

    move-object v0, v9

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    invoke-direct/range {v0 .. v8}, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationPresenter;-><init>(LMD;LhI5;LJy4;Lgl;LDQ3;Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;LFF5;Le13;)V

    return-object v9
.end method


# virtual methods
.method public b(LDQ3;Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;LFF5;Le13;)Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationPresenter;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LDQ3;",
            "Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider<",
            "LRE;",
            ">;",
            "LFF5;",
            "Le13;",
            ")",
            "Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationPresenter;"
        }
    .end annotation

    iget-object v0, p0, LFG5;->a:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, LMD;

    iget-object v0, p0, LFG5;->b:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, LhI5;

    iget-object v0, p0, LFG5;->c:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, LJy4;

    iget-object v0, p0, LFG5;->d:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lgl;

    move-object v5, p1

    move-object v6, p2

    move-object v7, p3

    move-object v8, p4

    invoke-static/range {v1 .. v8}, LFG5;->c(LMD;LhI5;LJy4;Lgl;LDQ3;Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;LFF5;Le13;)Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationPresenter;

    move-result-object p1

    return-object p1
.end method
