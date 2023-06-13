.class public final LOk3;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LTk0;",
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
            "Lot5;",
            ">;"
        }
    .end annotation
.end field

.field public final d:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LH00;",
            ">;"
        }
    .end annotation
.end field

.field public final e:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Le13;",
            ">;"
        }
    .end annotation
.end field

.field public final f:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lgl;",
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
            "LTk0;",
            ">;",
            "LY94<",
            "Lom3;",
            ">;",
            "LY94<",
            "Lot5;",
            ">;",
            "LY94<",
            "LH00;",
            ">;",
            "LY94<",
            "Le13;",
            ">;",
            "LY94<",
            "Lgl;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LOk3;->a:LY94;

    iput-object p2, p0, LOk3;->b:LY94;

    iput-object p3, p0, LOk3;->c:LY94;

    iput-object p4, p0, LOk3;->d:LY94;

    iput-object p5, p0, LOk3;->e:LY94;

    iput-object p6, p0, LOk3;->f:LY94;

    return-void
.end method

.method public static a(LY94;LY94;LY94;LY94;LY94;LY94;)LOk3;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "LTk0;",
            ">;",
            "LY94<",
            "Lom3;",
            ">;",
            "LY94<",
            "Lot5;",
            ">;",
            "LY94<",
            "LH00;",
            ">;",
            "LY94<",
            "Le13;",
            ">;",
            "LY94<",
            "Lgl;",
            ">;)",
            "LOk3;"
        }
    .end annotation

    new-instance v7, LOk3;

    move-object v0, v7

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    invoke-direct/range {v0 .. v6}, LOk3;-><init>(LY94;LY94;LY94;LY94;LY94;LY94;)V

    return-object v7
.end method

.method public static c(LTk0;Lom3;Lot5;LH00;Le13;Lgl;LNm3;LPk3;Lcom/uber/autodispose/ScopeProvider;)LEk3;
    .locals 11

    new-instance v10, LEk3;

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

    invoke-direct/range {v0 .. v9}, LEk3;-><init>(LTk0;Lom3;Lot5;LH00;Le13;Lgl;LNm3;LPk3;Lcom/uber/autodispose/ScopeProvider;)V

    return-object v10
.end method


# virtual methods
.method public b(LNm3;LPk3;Lcom/uber/autodispose/ScopeProvider;)LEk3;
    .locals 10

    iget-object v0, p0, LOk3;->a:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, LTk0;

    iget-object v0, p0, LOk3;->b:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lom3;

    iget-object v0, p0, LOk3;->c:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lot5;

    iget-object v0, p0, LOk3;->d:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, LH00;

    iget-object v0, p0, LOk3;->e:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Le13;

    iget-object v0, p0, LOk3;->f:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lgl;

    move-object v7, p1

    move-object v8, p2

    move-object v9, p3

    invoke-static/range {v1 .. v9}, LOk3;->c(LTk0;Lom3;Lot5;LH00;Le13;Lgl;LNm3;LPk3;Lcom/uber/autodispose/ScopeProvider;)LEk3;

    move-result-object p1

    return-object p1
.end method
