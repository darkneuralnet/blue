.class public final Leq;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsj1;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lsj1<",
        "LLp;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:Ldq;

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
            "LMN4;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ldq;LY94;LY94;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldq;",
            "LY94<",
            "Lgl;",
            ">;",
            "LY94<",
            "LMN4;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Leq;->a:Ldq;

    iput-object p2, p0, Leq;->b:LY94;

    iput-object p3, p0, Leq;->c:LY94;

    return-void
.end method

.method public static a(Ldq;LY94;LY94;)Leq;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldq;",
            "LY94<",
            "Lgl;",
            ">;",
            "LY94<",
            "LMN4;",
            ">;)",
            "Leq;"
        }
    .end annotation

    new-instance v0, Leq;

    invoke-direct {v0, p0, p1, p2}, Leq;-><init>(Ldq;LY94;LY94;)V

    return-object v0
.end method

.method public static c(Ldq;Lgl;LMN4;)LLp;
    .locals 0

    invoke-virtual {p0, p1, p2}, Ldq;->a(Lgl;LMN4;)LLp;

    move-result-object p0

    invoke-static {p0}, LxZ3;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, LLp;

    return-object p0
.end method


# virtual methods
.method public b()LLp;
    .locals 3

    iget-object v0, p0, Leq;->a:Ldq;

    iget-object v1, p0, Leq;->b:LY94;

    invoke-interface {v1}, LY94;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lgl;

    iget-object v2, p0, Leq;->c:LY94;

    invoke-interface {v2}, LY94;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LMN4;

    invoke-static {v0, v1, v2}, Leq;->c(Ldq;Lgl;LMN4;)LLp;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Leq;->b()LLp;

    move-result-object v0

    return-object v0
.end method
