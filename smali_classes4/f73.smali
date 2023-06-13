.class public final Lf73;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsj1;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lsj1<",
        "Lokhttp3/OkHttpClient;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:LP43;

.field public final b:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Landroid/content/Context;",
            ">;"
        }
    .end annotation
.end field

.field public final c:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lokhttp3/OkHttpClient;",
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
            "LBc;",
            ">;"
        }
    .end annotation
.end field

.field public final f:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lde5;",
            ">;"
        }
    .end annotation
.end field

.field public final g:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Ln21;",
            ">;"
        }
    .end annotation
.end field

.field public final h:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Ldr4;",
            ">;"
        }
    .end annotation
.end field

.field public final i:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lqj0;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(LP43;LY94;LY94;LY94;LY94;LY94;LY94;LY94;LY94;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LP43;",
            "LY94<",
            "Landroid/content/Context;",
            ">;",
            "LY94<",
            "Lokhttp3/OkHttpClient;",
            ">;",
            "LY94<",
            "Lgl;",
            ">;",
            "LY94<",
            "LBc;",
            ">;",
            "LY94<",
            "Lde5;",
            ">;",
            "LY94<",
            "Ln21;",
            ">;",
            "LY94<",
            "Ldr4;",
            ">;",
            "LY94<",
            "Lqj0;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lf73;->a:LP43;

    iput-object p2, p0, Lf73;->b:LY94;

    iput-object p3, p0, Lf73;->c:LY94;

    iput-object p4, p0, Lf73;->d:LY94;

    iput-object p5, p0, Lf73;->e:LY94;

    iput-object p6, p0, Lf73;->f:LY94;

    iput-object p7, p0, Lf73;->g:LY94;

    iput-object p8, p0, Lf73;->h:LY94;

    iput-object p9, p0, Lf73;->i:LY94;

    return-void
.end method

.method public static a(LP43;LY94;LY94;LY94;LY94;LY94;LY94;LY94;LY94;)Lf73;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LP43;",
            "LY94<",
            "Landroid/content/Context;",
            ">;",
            "LY94<",
            "Lokhttp3/OkHttpClient;",
            ">;",
            "LY94<",
            "Lgl;",
            ">;",
            "LY94<",
            "LBc;",
            ">;",
            "LY94<",
            "Lde5;",
            ">;",
            "LY94<",
            "Ln21;",
            ">;",
            "LY94<",
            "Ldr4;",
            ">;",
            "LY94<",
            "Lqj0;",
            ">;)",
            "Lf73;"
        }
    .end annotation

    new-instance v10, Lf73;

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

    invoke-direct/range {v0 .. v9}, Lf73;-><init>(LP43;LY94;LY94;LY94;LY94;LY94;LY94;LY94;LY94;)V

    return-object v10
.end method

.method public static c(LP43;Landroid/content/Context;Lokhttp3/OkHttpClient;Lgl;LBc;Lde5;Ln21;Ldr4;Lqj0;)Lokhttp3/OkHttpClient;
    .locals 0

    invoke-virtual/range {p0 .. p8}, LP43;->t1(Landroid/content/Context;Lokhttp3/OkHttpClient;Lgl;LBc;Lde5;Ln21;Ldr4;Lqj0;)Lokhttp3/OkHttpClient;

    move-result-object p0

    invoke-static {p0}, LxZ3;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lokhttp3/OkHttpClient;

    return-object p0
.end method


# virtual methods
.method public b()Lokhttp3/OkHttpClient;
    .locals 9

    iget-object v0, p0, Lf73;->a:LP43;

    iget-object v1, p0, Lf73;->b:LY94;

    invoke-interface {v1}, LY94;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/content/Context;

    iget-object v2, p0, Lf73;->c:LY94;

    invoke-interface {v2}, LY94;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lokhttp3/OkHttpClient;

    iget-object v3, p0, Lf73;->d:LY94;

    invoke-interface {v3}, LY94;->get()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lgl;

    iget-object v4, p0, Lf73;->e:LY94;

    invoke-interface {v4}, LY94;->get()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, LBc;

    iget-object v5, p0, Lf73;->f:LY94;

    invoke-interface {v5}, LY94;->get()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lde5;

    iget-object v6, p0, Lf73;->g:LY94;

    invoke-interface {v6}, LY94;->get()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ln21;

    iget-object v7, p0, Lf73;->h:LY94;

    invoke-interface {v7}, LY94;->get()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ldr4;

    iget-object v8, p0, Lf73;->i:LY94;

    invoke-interface {v8}, LY94;->get()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lqj0;

    invoke-static/range {v0 .. v8}, Lf73;->c(LP43;Landroid/content/Context;Lokhttp3/OkHttpClient;Lgl;LBc;Lde5;Ln21;Ldr4;Lqj0;)Lokhttp3/OkHttpClient;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lf73;->b()Lokhttp3/OkHttpClient;

    move-result-object v0

    return-object v0
.end method
