.class public final LBD6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsj1;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lsj1<",
        "LyD6;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LaM;",
            ">;"
        }
    .end annotation
.end field

.field public final b:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Llh6;",
            ">;"
        }
    .end annotation
.end field

.field public final c:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LaG6;",
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
            "LCD6;",
            ">;"
        }
    .end annotation
.end field

.field public final f:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lcom/uber/autodispose/ScopeProvider;",
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
            "LkD6;",
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
            "LaM;",
            ">;",
            "LY94<",
            "Llh6;",
            ">;",
            "LY94<",
            "LaG6;",
            ">;",
            "LY94<",
            "LTq4;",
            ">;",
            "LY94<",
            "LCD6;",
            ">;",
            "LY94<",
            "Lcom/uber/autodispose/ScopeProvider;",
            ">;",
            "LY94<",
            "Le13;",
            ">;",
            "LY94<",
            "LkD6;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LBD6;->a:LY94;

    iput-object p2, p0, LBD6;->b:LY94;

    iput-object p3, p0, LBD6;->c:LY94;

    iput-object p4, p0, LBD6;->d:LY94;

    iput-object p5, p0, LBD6;->e:LY94;

    iput-object p6, p0, LBD6;->f:LY94;

    iput-object p7, p0, LBD6;->g:LY94;

    iput-object p8, p0, LBD6;->h:LY94;

    return-void
.end method

.method public static a(LY94;LY94;LY94;LY94;LY94;LY94;LY94;LY94;)LBD6;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "LaM;",
            ">;",
            "LY94<",
            "Llh6;",
            ">;",
            "LY94<",
            "LaG6;",
            ">;",
            "LY94<",
            "LTq4;",
            ">;",
            "LY94<",
            "LCD6;",
            ">;",
            "LY94<",
            "Lcom/uber/autodispose/ScopeProvider;",
            ">;",
            "LY94<",
            "Le13;",
            ">;",
            "LY94<",
            "LkD6;",
            ">;)",
            "LBD6;"
        }
    .end annotation

    new-instance v9, LBD6;

    move-object v0, v9

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    invoke-direct/range {v0 .. v8}, LBD6;-><init>(LY94;LY94;LY94;LY94;LY94;LY94;LY94;LY94;)V

    return-object v9
.end method

.method public static c(LaM;Llh6;LaG6;LTq4;LCD6;Lcom/uber/autodispose/ScopeProvider;Le13;LkD6;)LyD6;
    .locals 10

    new-instance v9, LyD6;

    move-object v0, v9

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    invoke-direct/range {v0 .. v8}, LyD6;-><init>(LaM;Llh6;LaG6;LTq4;LCD6;Lcom/uber/autodispose/ScopeProvider;Le13;LkD6;)V

    return-object v9
.end method


# virtual methods
.method public b()LyD6;
    .locals 9

    iget-object v0, p0, LBD6;->a:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, LaM;

    iget-object v0, p0, LBD6;->b:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Llh6;

    iget-object v0, p0, LBD6;->c:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, LaG6;

    iget-object v0, p0, LBD6;->d:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, LTq4;

    iget-object v0, p0, LBD6;->e:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, LCD6;

    iget-object v0, p0, LBD6;->f:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lcom/uber/autodispose/ScopeProvider;

    iget-object v0, p0, LBD6;->g:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Le13;

    iget-object v0, p0, LBD6;->h:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, LkD6;

    invoke-static/range {v1 .. v8}, LBD6;->c(LaM;Llh6;LaG6;LTq4;LCD6;Lcom/uber/autodispose/ScopeProvider;Le13;LkD6;)LyD6;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LBD6;->b()LyD6;

    move-result-object v0

    return-object v0
.end method
