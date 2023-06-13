.class public final Lgq;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsj1;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lsj1<",
        "LVo2;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:Ldq;

.field public final b:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LMN4;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ldq;LY94;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldq;",
            "LY94<",
            "LMN4;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lgq;->a:Ldq;

    iput-object p2, p0, Lgq;->b:LY94;

    return-void
.end method

.method public static a(Ldq;LY94;)Lgq;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldq;",
            "LY94<",
            "LMN4;",
            ">;)",
            "Lgq;"
        }
    .end annotation

    new-instance v0, Lgq;

    invoke-direct {v0, p0, p1}, Lgq;-><init>(Ldq;LY94;)V

    return-object v0
.end method

.method public static c(Ldq;LMN4;)LVo2;
    .locals 0

    invoke-virtual {p0, p1}, Ldq;->c(LMN4;)LVo2;

    move-result-object p0

    invoke-static {p0}, LxZ3;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, LVo2;

    return-object p0
.end method


# virtual methods
.method public b()LVo2;
    .locals 2

    iget-object v0, p0, Lgq;->a:Ldq;

    iget-object v1, p0, Lgq;->b:LY94;

    invoke-interface {v1}, LY94;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LMN4;

    invoke-static {v0, v1}, Lgq;->c(Ldq;LMN4;)LVo2;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lgq;->b()LVo2;

    move-result-object v0

    return-object v0
.end method
