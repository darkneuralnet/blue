.class public final LjH3;
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
            "Ldr4;",
            ">;"
        }
    .end annotation
.end field

.field public final c:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LYR4;",
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

.field public final f:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Llh6;",
            ">;"
        }
    .end annotation
.end field

.field public final g:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LoF3;",
            ">;"
        }
    .end annotation
.end field

.field public final h:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LTq4;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(LY94;LY94;LY94;LY94;LY94;LY94;LY94;LY94;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "Lbn;",
            ">;",
            "LY94<",
            "Ldr4;",
            ">;",
            "LY94<",
            "LYR4;",
            ">;",
            "LY94<",
            "Lgl;",
            ">;",
            "LY94<",
            "LEa;",
            ">;",
            "LY94<",
            "Llh6;",
            ">;",
            "LY94<",
            "LoF3;",
            ">;",
            "LY94<",
            "LTq4;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LjH3;->a:LY94;

    iput-object p2, p0, LjH3;->b:LY94;

    iput-object p3, p0, LjH3;->c:LY94;

    iput-object p4, p0, LjH3;->d:LY94;

    iput-object p5, p0, LjH3;->e:LY94;

    iput-object p6, p0, LjH3;->f:LY94;

    iput-object p7, p0, LjH3;->g:LY94;

    iput-object p8, p0, LjH3;->h:LY94;

    return-void
.end method

.method public static a(LY94;LY94;LY94;LY94;LY94;LY94;LY94;LY94;)LjH3;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "Lbn;",
            ">;",
            "LY94<",
            "Ldr4;",
            ">;",
            "LY94<",
            "LYR4;",
            ">;",
            "LY94<",
            "Lgl;",
            ">;",
            "LY94<",
            "LEa;",
            ">;",
            "LY94<",
            "Llh6;",
            ">;",
            "LY94<",
            "LoF3;",
            ">;",
            "LY94<",
            "LTq4;",
            ">;)",
            "LjH3;"
        }
    .end annotation

    new-instance v9, LjH3;

    move-object v0, v9

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    invoke-direct/range {v0 .. v8}, LjH3;-><init>(LY94;LY94;LY94;LY94;LY94;LY94;LY94;LY94;)V

    return-object v9
.end method

.method public static c(Lbn;Ldr4;LYR4;Lgl;LEa;Llh6;LoF3;LTq4;Lcom/uber/autodispose/ScopeProvider;Lcom/uber/autodispose/ScopeProvider;LRH3;Lco/bird/android/app/feature/map/ui/MapParkingUi;Le13;LZr1;)LgH3;
    .locals 16

    new-instance v15, LgH3;

    move-object v0, v15

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move-object/from16 v4, p3

    move-object/from16 v5, p4

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    move-object/from16 v10, p9

    move-object/from16 v11, p10

    move-object/from16 v12, p11

    move-object/from16 v13, p12

    move-object/from16 v14, p13

    invoke-direct/range {v0 .. v14}, LgH3;-><init>(Lbn;Ldr4;LYR4;Lgl;LEa;Llh6;LoF3;LTq4;Lcom/uber/autodispose/ScopeProvider;Lcom/uber/autodispose/ScopeProvider;LRH3;Lco/bird/android/app/feature/map/ui/MapParkingUi;Le13;LZr1;)V

    return-object v15
.end method


# virtual methods
.method public b(Lcom/uber/autodispose/ScopeProvider;Lcom/uber/autodispose/ScopeProvider;LRH3;Lco/bird/android/app/feature/map/ui/MapParkingUi;Le13;LZr1;)LgH3;
    .locals 16

    move-object/from16 v0, p0

    iget-object v1, v0, LjH3;->a:LY94;

    invoke-interface {v1}, LY94;->get()Ljava/lang/Object;

    move-result-object v1

    move-object v2, v1

    check-cast v2, Lbn;

    iget-object v1, v0, LjH3;->b:LY94;

    invoke-interface {v1}, LY94;->get()Ljava/lang/Object;

    move-result-object v1

    move-object v3, v1

    check-cast v3, Ldr4;

    iget-object v1, v0, LjH3;->c:LY94;

    invoke-interface {v1}, LY94;->get()Ljava/lang/Object;

    move-result-object v1

    move-object v4, v1

    check-cast v4, LYR4;

    iget-object v1, v0, LjH3;->d:LY94;

    invoke-interface {v1}, LY94;->get()Ljava/lang/Object;

    move-result-object v1

    move-object v5, v1

    check-cast v5, Lgl;

    iget-object v1, v0, LjH3;->e:LY94;

    invoke-interface {v1}, LY94;->get()Ljava/lang/Object;

    move-result-object v1

    move-object v6, v1

    check-cast v6, LEa;

    iget-object v1, v0, LjH3;->f:LY94;

    invoke-interface {v1}, LY94;->get()Ljava/lang/Object;

    move-result-object v1

    move-object v7, v1

    check-cast v7, Llh6;

    iget-object v1, v0, LjH3;->g:LY94;

    invoke-interface {v1}, LY94;->get()Ljava/lang/Object;

    move-result-object v1

    move-object v8, v1

    check-cast v8, LoF3;

    iget-object v1, v0, LjH3;->h:LY94;

    invoke-interface {v1}, LY94;->get()Ljava/lang/Object;

    move-result-object v1

    move-object v9, v1

    check-cast v9, LTq4;

    move-object/from16 v10, p1

    move-object/from16 v11, p2

    move-object/from16 v12, p3

    move-object/from16 v13, p4

    move-object/from16 v14, p5

    move-object/from16 v15, p6

    invoke-static/range {v2 .. v15}, LjH3;->c(Lbn;Ldr4;LYR4;Lgl;LEa;Llh6;LoF3;LTq4;Lcom/uber/autodispose/ScopeProvider;Lcom/uber/autodispose/ScopeProvider;LRH3;Lco/bird/android/app/feature/map/ui/MapParkingUi;Le13;LZr1;)LgH3;

    move-result-object v1

    return-object v1
.end method
