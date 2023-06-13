.class public final LNe4;
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
            "LaM;",
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
            "LBl5;",
            ">;"
        }
    .end annotation
.end field

.field public final e:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LpU4;",
            ">;"
        }
    .end annotation
.end field

.field public final f:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Ldr4;",
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
            "LaM;",
            ">;",
            "LY94<",
            "LEa;",
            ">;",
            "LY94<",
            "LBl5;",
            ">;",
            "LY94<",
            "LpU4;",
            ">;",
            "LY94<",
            "Ldr4;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LNe4;->a:LY94;

    iput-object p2, p0, LNe4;->b:LY94;

    iput-object p3, p0, LNe4;->c:LY94;

    iput-object p4, p0, LNe4;->d:LY94;

    iput-object p5, p0, LNe4;->e:LY94;

    iput-object p6, p0, LNe4;->f:LY94;

    return-void
.end method

.method public static a(LY94;LY94;LY94;LY94;LY94;LY94;)LNe4;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "LTq4;",
            ">;",
            "LY94<",
            "LaM;",
            ">;",
            "LY94<",
            "LEa;",
            ">;",
            "LY94<",
            "LBl5;",
            ">;",
            "LY94<",
            "LpU4;",
            ">;",
            "LY94<",
            "Ldr4;",
            ">;)",
            "LNe4;"
        }
    .end annotation

    new-instance v7, LNe4;

    move-object v0, v7

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    invoke-direct/range {v0 .. v6}, LNe4;-><init>(LY94;LY94;LY94;LY94;LY94;LY94;)V

    return-object v7
.end method

.method public static c(LTq4;LaM;LEa;LBl5;LpU4;Ldr4;LsJ4;Lve4;Lcom/uber/autodispose/ScopeProvider;)LHe4;
    .locals 11

    new-instance v10, LHe4;

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

    invoke-direct/range {v0 .. v9}, LHe4;-><init>(LTq4;LaM;LEa;LBl5;LpU4;Ldr4;LsJ4;Lve4;Lcom/uber/autodispose/ScopeProvider;)V

    return-object v10
.end method


# virtual methods
.method public b(LsJ4;Lve4;Lcom/uber/autodispose/ScopeProvider;)LHe4;
    .locals 10

    iget-object v0, p0, LNe4;->a:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, LTq4;

    iget-object v0, p0, LNe4;->b:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, LaM;

    iget-object v0, p0, LNe4;->c:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, LEa;

    iget-object v0, p0, LNe4;->d:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, LBl5;

    iget-object v0, p0, LNe4;->e:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, LpU4;

    iget-object v0, p0, LNe4;->f:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Ldr4;

    move-object v7, p1

    move-object v8, p2

    move-object v9, p3

    invoke-static/range {v1 .. v9}, LNe4;->c(LTq4;LaM;LEa;LBl5;LpU4;Ldr4;LsJ4;Lve4;Lcom/uber/autodispose/ScopeProvider;)LHe4;

    move-result-object p1

    return-object p1
.end method
