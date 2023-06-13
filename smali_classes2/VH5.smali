.class public final LVH5;
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

.field public final e:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LEa;",
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
            ">;",
            "LY94<",
            "LEa;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LVH5;->a:LY94;

    iput-object p2, p0, LVH5;->b:LY94;

    iput-object p3, p0, LVH5;->c:LY94;

    iput-object p4, p0, LVH5;->d:LY94;

    iput-object p5, p0, LVH5;->e:LY94;

    return-void
.end method

.method public static a(LY94;LY94;LY94;LY94;LY94;)LVH5;
    .locals 7
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
            ">;",
            "LY94<",
            "LEa;",
            ">;)",
            "LVH5;"
        }
    .end annotation

    new-instance v6, LVH5;

    move-object v0, v6

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    invoke-direct/range {v0 .. v5}, LVH5;-><init>(LY94;LY94;LY94;LY94;LY94;)V

    return-object v6
.end method

.method public static c(LMD;LhI5;LJy4;Lgl;LEa;LDQ3;Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;Lco/bird/android/app/feature/physicallock/smartlock/b;Le13;)Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LMD;",
            "LhI5;",
            "LJy4;",
            "Lgl;",
            "LEa;",
            "LDQ3;",
            "Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider<",
            "LRE;",
            ">;",
            "Lco/bird/android/app/feature/physicallock/smartlock/b;",
            "Le13;",
            ")",
            "Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter;"
        }
    .end annotation

    new-instance v10, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter;

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

    invoke-direct/range {v0 .. v9}, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter;-><init>(LMD;LhI5;LJy4;Lgl;LEa;LDQ3;Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;Lco/bird/android/app/feature/physicallock/smartlock/b;Le13;)V

    return-object v10
.end method


# virtual methods
.method public b(LDQ3;Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;Lco/bird/android/app/feature/physicallock/smartlock/b;Le13;)Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LDQ3;",
            "Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider<",
            "LRE;",
            ">;",
            "Lco/bird/android/app/feature/physicallock/smartlock/b;",
            "Le13;",
            ")",
            "Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter;"
        }
    .end annotation

    iget-object v0, p0, LVH5;->a:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, LMD;

    iget-object v0, p0, LVH5;->b:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, LhI5;

    iget-object v0, p0, LVH5;->c:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, LJy4;

    iget-object v0, p0, LVH5;->d:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lgl;

    iget-object v0, p0, LVH5;->e:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, LEa;

    move-object v6, p1

    move-object v7, p2

    move-object v8, p3

    move-object v9, p4

    invoke-static/range {v1 .. v9}, LVH5;->c(LMD;LhI5;LJy4;Lgl;LEa;LDQ3;Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;Lco/bird/android/app/feature/physicallock/smartlock/b;Le13;)Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter;

    move-result-object p1

    return-object p1
.end method
