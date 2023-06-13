.class public final LfI2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsj1;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lsj1<",
        "LfF;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:LVH2;

.field public final b:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LVE;",
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


# direct methods
.method public constructor <init>(LVH2;LY94;LY94;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LVH2;",
            "LY94<",
            "LVE;",
            ">;",
            "LY94<",
            "Llh6;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LfI2;->a:LVH2;

    iput-object p2, p0, LfI2;->b:LY94;

    iput-object p3, p0, LfI2;->c:LY94;

    return-void
.end method

.method public static a(LVH2;LY94;LY94;)LfI2;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LVH2;",
            "LY94<",
            "LVE;",
            ">;",
            "LY94<",
            "Llh6;",
            ">;)",
            "LfI2;"
        }
    .end annotation

    new-instance v0, LfI2;

    invoke-direct {v0, p0, p1, p2}, LfI2;-><init>(LVH2;LY94;LY94;)V

    return-object v0
.end method

.method public static c(LVH2;LVE;Llh6;)LfF;
    .locals 0

    invoke-virtual {p0, p1, p2}, LVH2;->j(LVE;Llh6;)LfF;

    move-result-object p0

    invoke-static {p0}, LxZ3;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, LfF;

    return-object p0
.end method


# virtual methods
.method public b()LfF;
    .locals 3

    iget-object v0, p0, LfI2;->a:LVH2;

    iget-object v1, p0, LfI2;->b:LY94;

    invoke-interface {v1}, LY94;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LVE;

    iget-object v2, p0, LfI2;->c:LY94;

    invoke-interface {v2}, LY94;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Llh6;

    invoke-static {v0, v1, v2}, LfI2;->c(LVH2;LVE;Llh6;)LfF;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LfI2;->b()LfF;

    move-result-object v0

    return-object v0
.end method
