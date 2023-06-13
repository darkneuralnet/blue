.class public final Lor1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsj1;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lsj1<",
        "Lnr1;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Ltq1;",
            ">;"
        }
    .end annotation
.end field

.field public final b:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lwq1;",
            ">;"
        }
    .end annotation
.end field

.field public final c:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lvr1;",
            ">;"
        }
    .end annotation
.end field

.field public final d:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lwo1;",
            ">;"
        }
    .end annotation
.end field

.field public final e:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LXo1;",
            ">;"
        }
    .end annotation
.end field

.field public final f:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lfp1;",
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
            "Ltq1;",
            ">;",
            "LY94<",
            "Lwq1;",
            ">;",
            "LY94<",
            "Lvr1;",
            ">;",
            "LY94<",
            "Lwo1;",
            ">;",
            "LY94<",
            "LXo1;",
            ">;",
            "LY94<",
            "Lfp1;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lor1;->a:LY94;

    iput-object p2, p0, Lor1;->b:LY94;

    iput-object p3, p0, Lor1;->c:LY94;

    iput-object p4, p0, Lor1;->d:LY94;

    iput-object p5, p0, Lor1;->e:LY94;

    iput-object p6, p0, Lor1;->f:LY94;

    return-void
.end method

.method public static a(LY94;LY94;LY94;LY94;LY94;LY94;)Lor1;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "Ltq1;",
            ">;",
            "LY94<",
            "Lwq1;",
            ">;",
            "LY94<",
            "Lvr1;",
            ">;",
            "LY94<",
            "Lwo1;",
            ">;",
            "LY94<",
            "LXo1;",
            ">;",
            "LY94<",
            "Lfp1;",
            ">;)",
            "Lor1;"
        }
    .end annotation

    new-instance v7, Lor1;

    move-object v0, v7

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    invoke-direct/range {v0 .. v6}, Lor1;-><init>(LY94;LY94;LY94;LY94;LY94;LY94;)V

    return-object v7
.end method

.method public static c(Ltq1;Lwq1;Lvr1;Lwo1;LXo1;Lfp1;)Lnr1;
    .locals 8

    new-instance v7, Lnr1;

    move-object v0, v7

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    invoke-direct/range {v0 .. v6}, Lnr1;-><init>(Ltq1;Lwq1;Lvr1;Lwo1;LXo1;Lfp1;)V

    return-object v7
.end method


# virtual methods
.method public b()Lnr1;
    .locals 7

    iget-object v0, p0, Lor1;->a:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Ltq1;

    iget-object v0, p0, Lor1;->b:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lwq1;

    iget-object v0, p0, Lor1;->c:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lvr1;

    iget-object v0, p0, Lor1;->d:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lwo1;

    iget-object v0, p0, Lor1;->e:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, LXo1;

    iget-object v0, p0, Lor1;->f:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lfp1;

    invoke-static/range {v1 .. v6}, Lor1;->c(Ltq1;Lwq1;Lvr1;Lwo1;LXo1;Lfp1;)Lnr1;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lor1;->b()Lnr1;

    move-result-object v0

    return-object v0
.end method
