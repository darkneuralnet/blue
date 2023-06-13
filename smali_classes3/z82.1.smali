.class public final Lz82;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsj1;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lsj1<",
        "Ls82;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Llh6;",
            ">;"
        }
    .end annotation
.end field

.field public final b:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LA82;",
            ">;"
        }
    .end annotation
.end field

.field public final c:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lcom/uber/autodispose/ScopeProvider;",
            ">;"
        }
    .end annotation
.end field

.field public final d:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LI82;",
            ">;"
        }
    .end annotation
.end field

.field public final e:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LGt5;",
            ">;"
        }
    .end annotation
.end field

.field public final f:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LEa;",
            ">;"
        }
    .end annotation
.end field

.field public final g:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Le13;",
            ">;"
        }
    .end annotation
.end field

.field public final h:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lwi2;",
            ">;"
        }
    .end annotation
.end field

.field public final i:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LD82;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(LY94;LY94;LY94;LY94;LY94;LY94;LY94;LY94;LY94;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "Llh6;",
            ">;",
            "LY94<",
            "LA82;",
            ">;",
            "LY94<",
            "Lcom/uber/autodispose/ScopeProvider;",
            ">;",
            "LY94<",
            "LI82;",
            ">;",
            "LY94<",
            "LGt5;",
            ">;",
            "LY94<",
            "LEa;",
            ">;",
            "LY94<",
            "Le13;",
            ">;",
            "LY94<",
            "Lwi2;",
            ">;",
            "LY94<",
            "LD82;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lz82;->a:LY94;

    iput-object p2, p0, Lz82;->b:LY94;

    iput-object p3, p0, Lz82;->c:LY94;

    iput-object p4, p0, Lz82;->d:LY94;

    iput-object p5, p0, Lz82;->e:LY94;

    iput-object p6, p0, Lz82;->f:LY94;

    iput-object p7, p0, Lz82;->g:LY94;

    iput-object p8, p0, Lz82;->h:LY94;

    iput-object p9, p0, Lz82;->i:LY94;

    return-void
.end method

.method public static a(LY94;LY94;LY94;LY94;LY94;LY94;LY94;LY94;LY94;)Lz82;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "Llh6;",
            ">;",
            "LY94<",
            "LA82;",
            ">;",
            "LY94<",
            "Lcom/uber/autodispose/ScopeProvider;",
            ">;",
            "LY94<",
            "LI82;",
            ">;",
            "LY94<",
            "LGt5;",
            ">;",
            "LY94<",
            "LEa;",
            ">;",
            "LY94<",
            "Le13;",
            ">;",
            "LY94<",
            "Lwi2;",
            ">;",
            "LY94<",
            "LD82;",
            ">;)",
            "Lz82;"
        }
    .end annotation

    new-instance v10, Lz82;

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

    invoke-direct/range {v0 .. v9}, Lz82;-><init>(LY94;LY94;LY94;LY94;LY94;LY94;LY94;LY94;LY94;)V

    return-object v10
.end method

.method public static c(Llh6;LA82;Lcom/uber/autodispose/ScopeProvider;LI82;LGt5;LEa;Le13;Lwi2;LD82;)Ls82;
    .locals 11

    new-instance v10, Ls82;

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

    invoke-direct/range {v0 .. v9}, Ls82;-><init>(Llh6;LA82;Lcom/uber/autodispose/ScopeProvider;LI82;LGt5;LEa;Le13;Lwi2;LD82;)V

    return-object v10
.end method


# virtual methods
.method public b()Ls82;
    .locals 10

    iget-object v0, p0, Lz82;->a:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Llh6;

    iget-object v0, p0, Lz82;->b:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, LA82;

    iget-object v0, p0, Lz82;->c:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lcom/uber/autodispose/ScopeProvider;

    iget-object v0, p0, Lz82;->d:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, LI82;

    iget-object v0, p0, Lz82;->e:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, LGt5;

    iget-object v0, p0, Lz82;->f:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, LEa;

    iget-object v0, p0, Lz82;->g:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Le13;

    iget-object v0, p0, Lz82;->h:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Lwi2;

    iget-object v0, p0, Lz82;->i:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v9, v0

    check-cast v9, LD82;

    invoke-static/range {v1 .. v9}, Lz82;->c(Llh6;LA82;Lcom/uber/autodispose/ScopeProvider;LI82;LGt5;LEa;Le13;Lwi2;LD82;)Ls82;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lz82;->b()Ls82;

    move-result-object v0

    return-object v0
.end method
