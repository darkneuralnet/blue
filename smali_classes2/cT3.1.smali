.class public final LcT3;
.super Ljava/lang/Object;
.source "SourceFile"


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
            "LEa;",
            ">;"
        }
    .end annotation
.end field

.field public final c:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Le13;",
            ">;"
        }
    .end annotation
.end field

.field public final d:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LoI5;",
            ">;"
        }
    .end annotation
.end field

.field public final e:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LYR4;",
            ">;"
        }
    .end annotation
.end field

.field public final f:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LTq4;",
            ">;"
        }
    .end annotation
.end field

.field public final g:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LXc1;",
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
            "LEa;",
            ">;",
            "LY94<",
            "Le13;",
            ">;",
            "LY94<",
            "LoI5;",
            ">;",
            "LY94<",
            "LYR4;",
            ">;",
            "LY94<",
            "LTq4;",
            ">;",
            "LY94<",
            "LXc1;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LcT3;->a:LY94;

    iput-object p2, p0, LcT3;->b:LY94;

    iput-object p3, p0, LcT3;->c:LY94;

    iput-object p4, p0, LcT3;->d:LY94;

    iput-object p5, p0, LcT3;->e:LY94;

    iput-object p6, p0, LcT3;->f:LY94;

    iput-object p7, p0, LcT3;->g:LY94;

    return-void
.end method

.method public static a(LY94;LY94;LY94;LY94;LY94;LY94;LY94;)LcT3;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "Lgl;",
            ">;",
            "LY94<",
            "LEa;",
            ">;",
            "LY94<",
            "Le13;",
            ">;",
            "LY94<",
            "LoI5;",
            ">;",
            "LY94<",
            "LYR4;",
            ">;",
            "LY94<",
            "LTq4;",
            ">;",
            "LY94<",
            "LXc1;",
            ">;)",
            "LcT3;"
        }
    .end annotation

    new-instance v8, LcT3;

    move-object v0, v8

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    move-object v7, p6

    invoke-direct/range {v0 .. v7}, LcT3;-><init>(LY94;LY94;LY94;LY94;LY94;LY94;LY94;)V

    return-object v8
.end method

.method public static c(Lgl;LEa;Le13;LoI5;LYR4;LTq4;LXc1;Lcom/uber/autodispose/ScopeProvider;LdT3;)LZS3;
    .locals 11

    new-instance v10, LZS3;

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

    invoke-direct/range {v0 .. v9}, LZS3;-><init>(Lgl;LEa;Le13;LoI5;LYR4;LTq4;LXc1;Lcom/uber/autodispose/ScopeProvider;LdT3;)V

    return-object v10
.end method


# virtual methods
.method public b(Lcom/uber/autodispose/ScopeProvider;LdT3;)LZS3;
    .locals 10

    iget-object v0, p0, LcT3;->a:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lgl;

    iget-object v0, p0, LcT3;->b:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, LEa;

    iget-object v0, p0, LcT3;->c:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Le13;

    iget-object v0, p0, LcT3;->d:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, LoI5;

    iget-object v0, p0, LcT3;->e:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, LYR4;

    iget-object v0, p0, LcT3;->f:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, LTq4;

    iget-object v0, p0, LcT3;->g:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, LXc1;

    move-object v8, p1

    move-object v9, p2

    invoke-static/range {v1 .. v9}, LcT3;->c(Lgl;LEa;Le13;LoI5;LYR4;LTq4;LXc1;Lcom/uber/autodispose/ScopeProvider;LdT3;)LZS3;

    move-result-object p1

    return-object p1
.end method
