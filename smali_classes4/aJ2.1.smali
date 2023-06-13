.class public final LaJ2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsj1;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lsj1<",
        "LVM3;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:LVH2;

.field public final b:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LEa;",
            ">;"
        }
    .end annotation
.end field

.field public final c:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LML3;",
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
            "LTq4;",
            ">;"
        }
    .end annotation
.end field

.field public final f:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LuS5;",
            ">;"
        }
    .end annotation
.end field

.field public final g:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Llg6;",
            ">;"
        }
    .end annotation
.end field

.field public final h:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Llh6;",
            ">;"
        }
    .end annotation
.end field

.field public final i:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LRh6;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(LVH2;LY94;LY94;LY94;LY94;LY94;LY94;LY94;LY94;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LVH2;",
            "LY94<",
            "LEa;",
            ">;",
            "LY94<",
            "LML3;",
            ">;",
            "LY94<",
            "Lgl;",
            ">;",
            "LY94<",
            "LTq4;",
            ">;",
            "LY94<",
            "LuS5;",
            ">;",
            "LY94<",
            "Llg6;",
            ">;",
            "LY94<",
            "Llh6;",
            ">;",
            "LY94<",
            "LRh6;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LaJ2;->a:LVH2;

    iput-object p2, p0, LaJ2;->b:LY94;

    iput-object p3, p0, LaJ2;->c:LY94;

    iput-object p4, p0, LaJ2;->d:LY94;

    iput-object p5, p0, LaJ2;->e:LY94;

    iput-object p6, p0, LaJ2;->f:LY94;

    iput-object p7, p0, LaJ2;->g:LY94;

    iput-object p8, p0, LaJ2;->h:LY94;

    iput-object p9, p0, LaJ2;->i:LY94;

    return-void
.end method

.method public static a(LVH2;LY94;LY94;LY94;LY94;LY94;LY94;LY94;LY94;)LaJ2;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LVH2;",
            "LY94<",
            "LEa;",
            ">;",
            "LY94<",
            "LML3;",
            ">;",
            "LY94<",
            "Lgl;",
            ">;",
            "LY94<",
            "LTq4;",
            ">;",
            "LY94<",
            "LuS5;",
            ">;",
            "LY94<",
            "Llg6;",
            ">;",
            "LY94<",
            "Llh6;",
            ">;",
            "LY94<",
            "LRh6;",
            ">;)",
            "LaJ2;"
        }
    .end annotation

    new-instance v10, LaJ2;

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

    invoke-direct/range {v0 .. v9}, LaJ2;-><init>(LVH2;LY94;LY94;LY94;LY94;LY94;LY94;LY94;LY94;)V

    return-object v10
.end method

.method public static c(LVH2;LEa;LML3;Lgl;LTq4;LuS5;Llg6;Llh6;LRh6;)LVM3;
    .locals 0

    invoke-virtual/range {p0 .. p8}, LVH2;->f0(LEa;LML3;Lgl;LTq4;LuS5;Llg6;Llh6;LRh6;)LVM3;

    move-result-object p0

    invoke-static {p0}, LxZ3;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, LVM3;

    return-object p0
.end method


# virtual methods
.method public b()LVM3;
    .locals 9

    iget-object v0, p0, LaJ2;->a:LVH2;

    iget-object v1, p0, LaJ2;->b:LY94;

    invoke-interface {v1}, LY94;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LEa;

    iget-object v2, p0, LaJ2;->c:LY94;

    invoke-interface {v2}, LY94;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LML3;

    iget-object v3, p0, LaJ2;->d:LY94;

    invoke-interface {v3}, LY94;->get()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lgl;

    iget-object v4, p0, LaJ2;->e:LY94;

    invoke-interface {v4}, LY94;->get()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, LTq4;

    iget-object v5, p0, LaJ2;->f:LY94;

    invoke-interface {v5}, LY94;->get()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, LuS5;

    iget-object v6, p0, LaJ2;->g:LY94;

    invoke-interface {v6}, LY94;->get()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Llg6;

    iget-object v7, p0, LaJ2;->h:LY94;

    invoke-interface {v7}, LY94;->get()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Llh6;

    iget-object v8, p0, LaJ2;->i:LY94;

    invoke-interface {v8}, LY94;->get()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, LRh6;

    invoke-static/range {v0 .. v8}, LaJ2;->c(LVH2;LEa;LML3;Lgl;LTq4;LuS5;Llg6;Llh6;LRh6;)LVM3;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LaJ2;->b()LVM3;

    move-result-object v0

    return-object v0
.end method
