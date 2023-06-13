.class public final LRw2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ltj1;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ltj1<",
        "LQw2;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:LZ94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LZ94<",
            "Lxi0;",
            ">;"
        }
    .end annotation
.end field

.field public final b:LZ94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LZ94<",
            "LBi0;",
            ">;"
        }
    .end annotation
.end field

.field public final c:LZ94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LZ94<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field public final d:LZ94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LZ94<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field public final e:LZ94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LZ94<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(LZ94;LZ94;LZ94;LZ94;LZ94;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LZ94<",
            "Lxi0;",
            ">;",
            "LZ94<",
            "LBi0;",
            ">;",
            "LZ94<",
            "Ljava/lang/Integer;",
            ">;",
            "LZ94<",
            "Ljava/lang/Integer;",
            ">;",
            "LZ94<",
            "Ljava/lang/Boolean;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LRw2;->a:LZ94;

    iput-object p2, p0, LRw2;->b:LZ94;

    iput-object p3, p0, LRw2;->c:LZ94;

    iput-object p4, p0, LRw2;->d:LZ94;

    iput-object p5, p0, LRw2;->e:LZ94;

    return-void
.end method

.method public static a(LZ94;LZ94;LZ94;LZ94;LZ94;)LRw2;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LZ94<",
            "Lxi0;",
            ">;",
            "LZ94<",
            "LBi0;",
            ">;",
            "LZ94<",
            "Ljava/lang/Integer;",
            ">;",
            "LZ94<",
            "Ljava/lang/Integer;",
            ">;",
            "LZ94<",
            "Ljava/lang/Boolean;",
            ">;)",
            "LRw2;"
        }
    .end annotation

    new-instance v6, LRw2;

    move-object v0, v6

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    invoke-direct/range {v0 .. v5}, LRw2;-><init>(LZ94;LZ94;LZ94;LZ94;LZ94;)V

    return-object v6
.end method

.method public static c(Lxi0;LBi0;IIZ)LQw2;
    .locals 7

    new-instance v6, LQw2;

    move-object v0, v6

    move-object v1, p0

    move-object v2, p1

    move v3, p2

    move v4, p3

    move v5, p4

    invoke-direct/range {v0 .. v5}, LQw2;-><init>(Lxi0;LBi0;IIZ)V

    return-object v6
.end method


# virtual methods
.method public b()LQw2;
    .locals 5

    iget-object v0, p0, LRw2;->a:LZ94;

    invoke-interface {v0}, LZ94;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lxi0;

    iget-object v1, p0, LRw2;->b:LZ94;

    invoke-interface {v1}, LZ94;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LBi0;

    iget-object v2, p0, LRw2;->c:LZ94;

    invoke-interface {v2}, LZ94;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    iget-object v3, p0, LRw2;->d:LZ94;

    invoke-interface {v3}, LZ94;->get()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Integer;

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    iget-object v4, p0, LRw2;->e:LZ94;

    invoke-interface {v4}, LZ94;->get()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Boolean;

    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v4

    invoke-static {v0, v1, v2, v3, v4}, LRw2;->c(Lxi0;LBi0;IIZ)LQw2;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LRw2;->b()LQw2;

    move-result-object v0

    return-object v0
.end method
