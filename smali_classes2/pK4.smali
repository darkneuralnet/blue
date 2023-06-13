.class public final LpK4;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LEa;",
            ">;"
        }
    .end annotation
.end field

.field public final b:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LTq4;",
            ">;"
        }
    .end annotation
.end field

.field public final c:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LMK4;",
            ">;"
        }
    .end annotation
.end field

.field public final d:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LpU4;",
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


# direct methods
.method public constructor <init>(LY94;LY94;LY94;LY94;LY94;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "LEa;",
            ">;",
            "LY94<",
            "LTq4;",
            ">;",
            "LY94<",
            "LMK4;",
            ">;",
            "LY94<",
            "LpU4;",
            ">;",
            "LY94<",
            "Le13;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LpK4;->a:LY94;

    iput-object p2, p0, LpK4;->b:LY94;

    iput-object p3, p0, LpK4;->c:LY94;

    iput-object p4, p0, LpK4;->d:LY94;

    iput-object p5, p0, LpK4;->e:LY94;

    return-void
.end method

.method public static a(LY94;LY94;LY94;LY94;LY94;)LpK4;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "LEa;",
            ">;",
            "LY94<",
            "LTq4;",
            ">;",
            "LY94<",
            "LMK4;",
            ">;",
            "LY94<",
            "LpU4;",
            ">;",
            "LY94<",
            "Le13;",
            ">;)",
            "LpK4;"
        }
    .end annotation

    new-instance v6, LpK4;

    move-object v0, v6

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    invoke-direct/range {v0 .. v5}, LpK4;-><init>(LY94;LY94;LY94;LY94;LY94;)V

    return-object v6
.end method

.method public static c(LEa;LTq4;LMK4;LpU4;Le13;LsJ4;LqK4;Lcom/uber/autodispose/ScopeProvider;)LiK4;
    .locals 10

    new-instance v9, LiK4;

    move-object v0, v9

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    invoke-direct/range {v0 .. v8}, LiK4;-><init>(LEa;LTq4;LMK4;LpU4;Le13;LsJ4;LqK4;Lcom/uber/autodispose/ScopeProvider;)V

    return-object v9
.end method


# virtual methods
.method public b(LsJ4;LqK4;Lcom/uber/autodispose/ScopeProvider;)LiK4;
    .locals 9

    iget-object v0, p0, LpK4;->a:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, LEa;

    iget-object v0, p0, LpK4;->b:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, LTq4;

    iget-object v0, p0, LpK4;->c:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, LMK4;

    iget-object v0, p0, LpK4;->d:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, LpU4;

    iget-object v0, p0, LpK4;->e:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Le13;

    move-object v6, p1

    move-object v7, p2

    move-object v8, p3

    invoke-static/range {v1 .. v8}, LpK4;->c(LEa;LTq4;LMK4;LpU4;Le13;LsJ4;LqK4;Lcom/uber/autodispose/ScopeProvider;)LiK4;

    move-result-object p1

    return-object p1
.end method
