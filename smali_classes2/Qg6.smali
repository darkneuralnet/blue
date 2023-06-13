.class public final LQg6;
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
            "Llg6;",
            ">;"
        }
    .end annotation
.end field

.field public final c:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LWg6;",
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
            "Lwi2;",
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
            "Llg6;",
            ">;",
            "LY94<",
            "LWg6;",
            ">;",
            "LY94<",
            "Lgl;",
            ">;",
            "LY94<",
            "Lwi2;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LQg6;->a:LY94;

    iput-object p2, p0, LQg6;->b:LY94;

    iput-object p3, p0, LQg6;->c:LY94;

    iput-object p4, p0, LQg6;->d:LY94;

    iput-object p5, p0, LQg6;->e:LY94;

    return-void
.end method

.method public static a(LY94;LY94;LY94;LY94;LY94;)LQg6;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "LEa;",
            ">;",
            "LY94<",
            "Llg6;",
            ">;",
            "LY94<",
            "LWg6;",
            ">;",
            "LY94<",
            "Lgl;",
            ">;",
            "LY94<",
            "Lwi2;",
            ">;)",
            "LQg6;"
        }
    .end annotation

    new-instance v6, LQg6;

    move-object v0, v6

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    invoke-direct/range {v0 .. v5}, LQg6;-><init>(LY94;LY94;LY94;LY94;LY94;)V

    return-object v6
.end method

.method public static c(LEa;Llg6;LWg6;Lgl;Lwi2;Lcom/uber/autodispose/ScopeProvider;LRg6;Lg9;Le13;Ljava/lang/Integer;)LKg6;
    .locals 12

    new-instance v11, LKg6;

    move-object v0, v11

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object/from16 v5, p4

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    move-object/from16 v10, p9

    invoke-direct/range {v0 .. v10}, LKg6;-><init>(LEa;Llg6;LWg6;Lgl;Lwi2;Lcom/uber/autodispose/ScopeProvider;LRg6;Lg9;Le13;Ljava/lang/Integer;)V

    return-object v11
.end method


# virtual methods
.method public b(Lcom/uber/autodispose/ScopeProvider;LRg6;Lg9;Le13;Ljava/lang/Integer;)LKg6;
    .locals 12

    move-object v0, p0

    iget-object v1, v0, LQg6;->a:LY94;

    invoke-interface {v1}, LY94;->get()Ljava/lang/Object;

    move-result-object v1

    move-object v2, v1

    check-cast v2, LEa;

    iget-object v1, v0, LQg6;->b:LY94;

    invoke-interface {v1}, LY94;->get()Ljava/lang/Object;

    move-result-object v1

    move-object v3, v1

    check-cast v3, Llg6;

    iget-object v1, v0, LQg6;->c:LY94;

    invoke-interface {v1}, LY94;->get()Ljava/lang/Object;

    move-result-object v1

    move-object v4, v1

    check-cast v4, LWg6;

    iget-object v1, v0, LQg6;->d:LY94;

    invoke-interface {v1}, LY94;->get()Ljava/lang/Object;

    move-result-object v1

    move-object v5, v1

    check-cast v5, Lgl;

    iget-object v1, v0, LQg6;->e:LY94;

    invoke-interface {v1}, LY94;->get()Ljava/lang/Object;

    move-result-object v1

    move-object v6, v1

    check-cast v6, Lwi2;

    move-object v7, p1

    move-object v8, p2

    move-object v9, p3

    move-object/from16 v10, p4

    move-object/from16 v11, p5

    invoke-static/range {v2 .. v11}, LQg6;->c(LEa;Llg6;LWg6;Lgl;Lwi2;Lcom/uber/autodispose/ScopeProvider;LRg6;Lg9;Le13;Ljava/lang/Integer;)LKg6;

    move-result-object v1

    return-object v1
.end method
