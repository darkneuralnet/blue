.class public final Lfo;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsj1;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lsj1<",
        "LYn;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LXm;",
            ">;"
        }
    .end annotation
.end field

.field public final b:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LTk3;",
            ">;"
        }
    .end annotation
.end field

.field public final c:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LVK;",
            ">;"
        }
    .end annotation
.end field

.field public final d:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LDB1;",
            ">;"
        }
    .end annotation
.end field

.field public final e:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lxx4;",
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
            "LXm;",
            ">;",
            "LY94<",
            "LTk3;",
            ">;",
            "LY94<",
            "LVK;",
            ">;",
            "LY94<",
            "LDB1;",
            ">;",
            "LY94<",
            "Lxx4;",
            ">;",
            "LY94<",
            "Lgl;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lfo;->a:LY94;

    iput-object p2, p0, Lfo;->b:LY94;

    iput-object p3, p0, Lfo;->c:LY94;

    iput-object p4, p0, Lfo;->d:LY94;

    iput-object p5, p0, Lfo;->e:LY94;

    iput-object p6, p0, Lfo;->f:LY94;

    return-void
.end method

.method public static a(LY94;LY94;LY94;LY94;LY94;LY94;)Lfo;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "LXm;",
            ">;",
            "LY94<",
            "LTk3;",
            ">;",
            "LY94<",
            "LVK;",
            ">;",
            "LY94<",
            "LDB1;",
            ">;",
            "LY94<",
            "Lxx4;",
            ">;",
            "LY94<",
            "Lgl;",
            ">;)",
            "Lfo;"
        }
    .end annotation

    new-instance v7, Lfo;

    move-object v0, v7

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    invoke-direct/range {v0 .. v6}, Lfo;-><init>(LY94;LY94;LY94;LY94;LY94;LY94;)V

    return-object v7
.end method

.method public static c(LXm;LTk3;LVK;LDB1;Lxx4;Lgl;)LYn;
    .locals 8

    new-instance v7, LYn;

    move-object v0, v7

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    invoke-direct/range {v0 .. v6}, LYn;-><init>(LXm;LTk3;LVK;LDB1;Lxx4;Lgl;)V

    return-object v7
.end method


# virtual methods
.method public b()LYn;
    .locals 7

    iget-object v0, p0, Lfo;->a:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, LXm;

    iget-object v0, p0, Lfo;->b:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, LTk3;

    iget-object v0, p0, Lfo;->c:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, LVK;

    iget-object v0, p0, Lfo;->d:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, LDB1;

    iget-object v0, p0, Lfo;->e:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lxx4;

    iget-object v0, p0, Lfo;->f:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lgl;

    invoke-static/range {v1 .. v6}, Lfo;->c(LXm;LTk3;LVK;LDB1;Lxx4;Lgl;)LYn;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lfo;->b()LYn;

    move-result-object v0

    return-object v0
.end method
