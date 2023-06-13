.class public final LxI2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsj1;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lsj1<",
        "LJT0;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:LVH2;

.field public final b:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LIT0;",
            ">;"
        }
    .end annotation
.end field

.field public final c:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lgl;",
            ">;"
        }
    .end annotation
.end field

.field public final d:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LRh6;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(LVH2;LY94;LY94;LY94;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LVH2;",
            "LY94<",
            "LIT0;",
            ">;",
            "LY94<",
            "Lgl;",
            ">;",
            "LY94<",
            "LRh6;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LxI2;->a:LVH2;

    iput-object p2, p0, LxI2;->b:LY94;

    iput-object p3, p0, LxI2;->c:LY94;

    iput-object p4, p0, LxI2;->d:LY94;

    return-void
.end method

.method public static a(LVH2;LY94;LY94;LY94;)LxI2;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LVH2;",
            "LY94<",
            "LIT0;",
            ">;",
            "LY94<",
            "Lgl;",
            ">;",
            "LY94<",
            "LRh6;",
            ">;)",
            "LxI2;"
        }
    .end annotation

    new-instance v0, LxI2;

    invoke-direct {v0, p0, p1, p2, p3}, LxI2;-><init>(LVH2;LY94;LY94;LY94;)V

    return-object v0
.end method

.method public static c(LVH2;LIT0;Lgl;LRh6;)LJT0;
    .locals 0

    invoke-virtual {p0, p1, p2, p3}, LVH2;->C(LIT0;Lgl;LRh6;)LJT0;

    move-result-object p0

    invoke-static {p0}, LxZ3;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, LJT0;

    return-object p0
.end method


# virtual methods
.method public b()LJT0;
    .locals 4

    iget-object v0, p0, LxI2;->a:LVH2;

    iget-object v1, p0, LxI2;->b:LY94;

    invoke-interface {v1}, LY94;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LIT0;

    iget-object v2, p0, LxI2;->c:LY94;

    invoke-interface {v2}, LY94;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lgl;

    iget-object v3, p0, LxI2;->d:LY94;

    invoke-interface {v3}, LY94;->get()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, LRh6;

    invoke-static {v0, v1, v2, v3}, LxI2;->c(LVH2;LIT0;Lgl;LRh6;)LJT0;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LxI2;->b()LJT0;

    move-result-object v0

    return-object v0
.end method
