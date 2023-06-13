.class public final Lfq;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsj1;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lsj1<",
        "Lhq;",
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
            "LRh6;",
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


# direct methods
.method public constructor <init>(Ldq;LY94;LY94;LY94;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldq;",
            "LY94<",
            "Lgl;",
            ">;",
            "LY94<",
            "LRh6;",
            ">;",
            "LY94<",
            "LLp;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lfq;->a:Ldq;

    iput-object p2, p0, Lfq;->b:LY94;

    iput-object p3, p0, Lfq;->c:LY94;

    iput-object p4, p0, Lfq;->d:LY94;

    return-void
.end method

.method public static a(Ldq;LY94;LY94;LY94;)Lfq;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldq;",
            "LY94<",
            "Lgl;",
            ">;",
            "LY94<",
            "LRh6;",
            ">;",
            "LY94<",
            "LLp;",
            ">;)",
            "Lfq;"
        }
    .end annotation

    new-instance v0, Lfq;

    invoke-direct {v0, p0, p1, p2, p3}, Lfq;-><init>(Ldq;LY94;LY94;LY94;)V

    return-object v0
.end method

.method public static c(Ldq;Lgl;LRh6;LLp;)Lhq;
    .locals 0

    invoke-virtual {p0, p1, p2, p3}, Ldq;->b(Lgl;LRh6;LLp;)Lhq;

    move-result-object p0

    invoke-static {p0}, LxZ3;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lhq;

    return-object p0
.end method


# virtual methods
.method public b()Lhq;
    .locals 4

    iget-object v0, p0, Lfq;->a:Ldq;

    iget-object v1, p0, Lfq;->b:LY94;

    invoke-interface {v1}, LY94;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lgl;

    iget-object v2, p0, Lfq;->c:LY94;

    invoke-interface {v2}, LY94;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LRh6;

    iget-object v3, p0, Lfq;->d:LY94;

    invoke-interface {v3}, LY94;->get()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, LLp;

    invoke-static {v0, v1, v2, v3}, Lfq;->c(Ldq;Lgl;LRh6;LLp;)Lhq;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lfq;->b()Lhq;

    move-result-object v0

    return-object v0
.end method
