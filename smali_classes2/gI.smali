.class public final LgI;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsj1;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lsj1<",
        "LTH;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LpJ;",
            ">;"
        }
    .end annotation
.end field

.field public final b:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LuL;",
            ">;"
        }
    .end annotation
.end field

.field public final c:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LfH;",
            ">;"
        }
    .end annotation
.end field

.field public final d:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lq54;",
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
            "LQh2;",
            ">;"
        }
    .end annotation
.end field

.field public final g:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Li66;",
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
            "LpJ;",
            ">;",
            "LY94<",
            "LuL;",
            ">;",
            "LY94<",
            "LfH;",
            ">;",
            "LY94<",
            "Lq54;",
            ">;",
            "LY94<",
            "LEa;",
            ">;",
            "LY94<",
            "LQh2;",
            ">;",
            "LY94<",
            "Li66;",
            ">;",
            "LY94<",
            "LTq4;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LgI;->a:LY94;

    iput-object p2, p0, LgI;->b:LY94;

    iput-object p3, p0, LgI;->c:LY94;

    iput-object p4, p0, LgI;->d:LY94;

    iput-object p5, p0, LgI;->e:LY94;

    iput-object p6, p0, LgI;->f:LY94;

    iput-object p7, p0, LgI;->g:LY94;

    iput-object p8, p0, LgI;->h:LY94;

    return-void
.end method

.method public static a(LY94;LY94;LY94;LY94;LY94;LY94;LY94;LY94;)LgI;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "LpJ;",
            ">;",
            "LY94<",
            "LuL;",
            ">;",
            "LY94<",
            "LfH;",
            ">;",
            "LY94<",
            "Lq54;",
            ">;",
            "LY94<",
            "LEa;",
            ">;",
            "LY94<",
            "LQh2;",
            ">;",
            "LY94<",
            "Li66;",
            ">;",
            "LY94<",
            "LTq4;",
            ">;)",
            "LgI;"
        }
    .end annotation

    new-instance v9, LgI;

    move-object v0, v9

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    invoke-direct/range {v0 .. v8}, LgI;-><init>(LY94;LY94;LY94;LY94;LY94;LY94;LY94;LY94;)V

    return-object v9
.end method

.method public static c(LpJ;LuL;LfH;Lq54;LEa;LQh2;Li66;LTq4;)LTH;
    .locals 10

    new-instance v9, LTH;

    move-object v0, v9

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    invoke-direct/range {v0 .. v8}, LTH;-><init>(LpJ;LuL;LfH;Lq54;LEa;LQh2;Li66;LTq4;)V

    return-object v9
.end method


# virtual methods
.method public b()LTH;
    .locals 9

    iget-object v0, p0, LgI;->a:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, LpJ;

    iget-object v0, p0, LgI;->b:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, LuL;

    iget-object v0, p0, LgI;->c:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, LfH;

    iget-object v0, p0, LgI;->d:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lq54;

    iget-object v0, p0, LgI;->e:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, LEa;

    iget-object v0, p0, LgI;->f:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, LQh2;

    iget-object v0, p0, LgI;->g:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Li66;

    iget-object v0, p0, LgI;->h:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, LTq4;

    invoke-static/range {v1 .. v8}, LgI;->c(LpJ;LuL;LfH;Lq54;LEa;LQh2;Li66;LTq4;)LTH;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LgI;->b()LTH;

    move-result-object v0

    return-object v0
.end method
