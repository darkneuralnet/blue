.class public final Lcq;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsj1;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lsj1<",
        "LZp;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lwi2;",
            ">;"
        }
    .end annotation
.end field

.field public final b:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lgl;",
            ">;"
        }
    .end annotation
.end field

.field public final c:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lhq;",
            ">;"
        }
    .end annotation
.end field

.field public final d:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LLp;",
            ">;"
        }
    .end annotation
.end field

.field public final e:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LVo2;",
            ">;"
        }
    .end annotation
.end field

.field public final f:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lcom/google/android/gms/auth/api/signin/GoogleSignInClient;",
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
            "Lwi2;",
            ">;",
            "LY94<",
            "Lgl;",
            ">;",
            "LY94<",
            "Lhq;",
            ">;",
            "LY94<",
            "LLp;",
            ">;",
            "LY94<",
            "LVo2;",
            ">;",
            "LY94<",
            "Lcom/google/android/gms/auth/api/signin/GoogleSignInClient;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcq;->a:LY94;

    iput-object p2, p0, Lcq;->b:LY94;

    iput-object p3, p0, Lcq;->c:LY94;

    iput-object p4, p0, Lcq;->d:LY94;

    iput-object p5, p0, Lcq;->e:LY94;

    iput-object p6, p0, Lcq;->f:LY94;

    return-void
.end method

.method public static a(LY94;LY94;LY94;LY94;LY94;LY94;)Lcq;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "Lwi2;",
            ">;",
            "LY94<",
            "Lgl;",
            ">;",
            "LY94<",
            "Lhq;",
            ">;",
            "LY94<",
            "LLp;",
            ">;",
            "LY94<",
            "LVo2;",
            ">;",
            "LY94<",
            "Lcom/google/android/gms/auth/api/signin/GoogleSignInClient;",
            ">;)",
            "Lcq;"
        }
    .end annotation

    new-instance v7, Lcq;

    move-object v0, v7

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    invoke-direct/range {v0 .. v6}, Lcq;-><init>(LY94;LY94;LY94;LY94;LY94;LY94;)V

    return-object v7
.end method

.method public static c(Lwi2;Lgl;Lhq;LLp;LVo2;Lcom/google/android/gms/auth/api/signin/GoogleSignInClient;)LZp;
    .locals 8

    new-instance v7, LZp;

    move-object v0, v7

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    invoke-direct/range {v0 .. v6}, LZp;-><init>(Lwi2;Lgl;Lhq;LLp;LVo2;Lcom/google/android/gms/auth/api/signin/GoogleSignInClient;)V

    return-object v7
.end method


# virtual methods
.method public b()LZp;
    .locals 7

    iget-object v0, p0, Lcq;->a:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lwi2;

    iget-object v0, p0, Lcq;->b:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lgl;

    iget-object v0, p0, Lcq;->c:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lhq;

    iget-object v0, p0, Lcq;->d:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, LLp;

    iget-object v0, p0, Lcq;->e:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, LVo2;

    iget-object v0, p0, Lcq;->f:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lcom/google/android/gms/auth/api/signin/GoogleSignInClient;

    invoke-static/range {v1 .. v6}, Lcq;->c(Lwi2;Lgl;Lhq;LLp;LVo2;Lcom/google/android/gms/auth/api/signin/GoogleSignInClient;)LZp;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcq;->b()LZp;

    move-result-object v0

    return-object v0
.end method
