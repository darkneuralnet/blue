.class public final Ljp0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsj1;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lsj1<",
        "Lip0;",
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
            "LpJ;",
            ">;"
        }
    .end annotation
.end field

.field public final c:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lrd5;",
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
            "LRR;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(LY94;LY94;LY94;LY94;LY94;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "LaM;",
            ">;",
            "LY94<",
            "LpJ;",
            ">;",
            "LY94<",
            "Lrd5;",
            ">;",
            "LY94<",
            "Lgl;",
            ">;",
            "LY94<",
            "LRR;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ljp0;->a:LY94;

    iput-object p2, p0, Ljp0;->b:LY94;

    iput-object p3, p0, Ljp0;->c:LY94;

    iput-object p4, p0, Ljp0;->d:LY94;

    iput-object p5, p0, Ljp0;->e:LY94;

    return-void
.end method

.method public static a(LY94;LY94;LY94;LY94;LY94;)Ljp0;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "LaM;",
            ">;",
            "LY94<",
            "LpJ;",
            ">;",
            "LY94<",
            "Lrd5;",
            ">;",
            "LY94<",
            "Lgl;",
            ">;",
            "LY94<",
            "LRR;",
            ">;)",
            "Ljp0;"
        }
    .end annotation

    new-instance v6, Ljp0;

    move-object v0, v6

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    invoke-direct/range {v0 .. v5}, Ljp0;-><init>(LY94;LY94;LY94;LY94;LY94;)V

    return-object v6
.end method

.method public static c(LaM;LpJ;Lrd5;Lgl;LRR;)Lip0;
    .locals 7

    new-instance v6, Lip0;

    move-object v0, v6

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    invoke-direct/range {v0 .. v5}, Lip0;-><init>(LaM;LpJ;Lrd5;Lgl;LRR;)V

    return-object v6
.end method


# virtual methods
.method public b()Lip0;
    .locals 5

    iget-object v0, p0, Ljp0;->a:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LaM;

    iget-object v1, p0, Ljp0;->b:LY94;

    invoke-interface {v1}, LY94;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LpJ;

    iget-object v2, p0, Ljp0;->c:LY94;

    invoke-interface {v2}, LY94;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lrd5;

    iget-object v3, p0, Ljp0;->d:LY94;

    invoke-interface {v3}, LY94;->get()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lgl;

    iget-object v4, p0, Ljp0;->e:LY94;

    invoke-interface {v4}, LY94;->get()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, LRR;

    invoke-static {v0, v1, v2, v3, v4}, Ljp0;->c(LaM;LpJ;Lrd5;Lgl;LRR;)Lip0;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Ljp0;->b()Lip0;

    move-result-object v0

    return-object v0
.end method
