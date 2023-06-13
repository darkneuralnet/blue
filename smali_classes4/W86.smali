.class public final LW86;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsj1;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lsj1<",
        "LV86;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lgl;",
            ">;"
        }
    .end annotation
.end field

.field public final b:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lh86;",
            ">;"
        }
    .end annotation
.end field

.field public final c:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Llh6;",
            ">;"
        }
    .end annotation
.end field

.field public final d:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LTq4;",
            ">;"
        }
    .end annotation
.end field

.field public final e:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LVp3;",
            ">;"
        }
    .end annotation
.end field

.field public final f:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lcj3;",
            ">;"
        }
    .end annotation
.end field

.field public final g:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Ljp5;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(LY94;LY94;LY94;LY94;LY94;LY94;LY94;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "Lgl;",
            ">;",
            "LY94<",
            "Lh86;",
            ">;",
            "LY94<",
            "Llh6;",
            ">;",
            "LY94<",
            "LTq4;",
            ">;",
            "LY94<",
            "LVp3;",
            ">;",
            "LY94<",
            "Lcj3;",
            ">;",
            "LY94<",
            "Ljp5;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LW86;->a:LY94;

    iput-object p2, p0, LW86;->b:LY94;

    iput-object p3, p0, LW86;->c:LY94;

    iput-object p4, p0, LW86;->d:LY94;

    iput-object p5, p0, LW86;->e:LY94;

    iput-object p6, p0, LW86;->f:LY94;

    iput-object p7, p0, LW86;->g:LY94;

    return-void
.end method

.method public static a(LY94;LY94;LY94;LY94;LY94;LY94;LY94;)LW86;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "Lgl;",
            ">;",
            "LY94<",
            "Lh86;",
            ">;",
            "LY94<",
            "Llh6;",
            ">;",
            "LY94<",
            "LTq4;",
            ">;",
            "LY94<",
            "LVp3;",
            ">;",
            "LY94<",
            "Lcj3;",
            ">;",
            "LY94<",
            "Ljp5;",
            ">;)",
            "LW86;"
        }
    .end annotation

    new-instance v8, LW86;

    move-object v0, v8

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    move-object v7, p6

    invoke-direct/range {v0 .. v7}, LW86;-><init>(LY94;LY94;LY94;LY94;LY94;LY94;LY94;)V

    return-object v8
.end method

.method public static c(Lgl;Lh86;Llh6;LTq4;LVp3;Lcj3;Ljp5;)LV86;
    .locals 9

    new-instance v8, LV86;

    move-object v0, v8

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    move-object v7, p6

    invoke-direct/range {v0 .. v7}, LV86;-><init>(Lgl;Lh86;Llh6;LTq4;LVp3;Lcj3;Ljp5;)V

    return-object v8
.end method


# virtual methods
.method public b()LV86;
    .locals 8

    iget-object v0, p0, LW86;->a:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lgl;

    iget-object v0, p0, LW86;->b:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lh86;

    iget-object v0, p0, LW86;->c:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Llh6;

    iget-object v0, p0, LW86;->d:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, LTq4;

    iget-object v0, p0, LW86;->e:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, LVp3;

    iget-object v0, p0, LW86;->f:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lcj3;

    iget-object v0, p0, LW86;->g:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Ljp5;

    invoke-static/range {v1 .. v7}, LW86;->c(Lgl;Lh86;Llh6;LTq4;LVp3;Lcj3;Ljp5;)LV86;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LW86;->b()LV86;

    move-result-object v0

    return-object v0
.end method
