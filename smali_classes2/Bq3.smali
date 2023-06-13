.class public final LBq3;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LTq4;",
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
            "Lbn;",
            ">;"
        }
    .end annotation
.end field

.field public final d:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LEa;",
            ">;"
        }
    .end annotation
.end field

.field public final e:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LPl1;",
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
            "LTq4;",
            ">;",
            "LY94<",
            "Ldr4;",
            ">;",
            "LY94<",
            "Lbn;",
            ">;",
            "LY94<",
            "LEa;",
            ">;",
            "LY94<",
            "LPl1;",
            ">;",
            "LY94<",
            "Le13;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LBq3;->a:LY94;

    iput-object p2, p0, LBq3;->b:LY94;

    iput-object p3, p0, LBq3;->c:LY94;

    iput-object p4, p0, LBq3;->d:LY94;

    iput-object p5, p0, LBq3;->e:LY94;

    iput-object p6, p0, LBq3;->f:LY94;

    return-void
.end method

.method public static a(LY94;LY94;LY94;LY94;LY94;LY94;)LBq3;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "LTq4;",
            ">;",
            "LY94<",
            "Ldr4;",
            ">;",
            "LY94<",
            "Lbn;",
            ">;",
            "LY94<",
            "LEa;",
            ">;",
            "LY94<",
            "LPl1;",
            ">;",
            "LY94<",
            "Le13;",
            ">;)",
            "LBq3;"
        }
    .end annotation

    new-instance v7, LBq3;

    move-object v0, v7

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    invoke-direct/range {v0 .. v6}, LBq3;-><init>(LY94;LY94;LY94;LY94;LY94;LY94;)V

    return-object v7
.end method

.method public static c(LTq4;Ldr4;Lbn;LEa;LPl1;Le13;LNm3;Lcom/uber/autodispose/ScopeProvider;LCw3;)Lyq3;
    .locals 11

    new-instance v10, Lyq3;

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

    invoke-direct/range {v0 .. v9}, Lyq3;-><init>(LTq4;Ldr4;Lbn;LEa;LPl1;Le13;LNm3;Lcom/uber/autodispose/ScopeProvider;LCw3;)V

    return-object v10
.end method


# virtual methods
.method public b(LNm3;Lcom/uber/autodispose/ScopeProvider;LCw3;)Lyq3;
    .locals 10

    iget-object v0, p0, LBq3;->a:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, LTq4;

    iget-object v0, p0, LBq3;->b:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Ldr4;

    iget-object v0, p0, LBq3;->c:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lbn;

    iget-object v0, p0, LBq3;->d:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, LEa;

    iget-object v0, p0, LBq3;->e:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, LPl1;

    iget-object v0, p0, LBq3;->f:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Le13;

    move-object v7, p1

    move-object v8, p2

    move-object v9, p3

    invoke-static/range {v1 .. v9}, LBq3;->c(LTq4;Ldr4;Lbn;LEa;LPl1;Le13;LNm3;Lcom/uber/autodispose/ScopeProvider;LCw3;)Lyq3;

    move-result-object p1

    return-object p1
.end method
