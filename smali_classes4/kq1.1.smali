.class public final Lkq1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsj1;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lsj1<",
        "Ljq1;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lvp1;",
            ">;"
        }
    .end annotation
.end field

.field public final b:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lzp1;",
            ">;"
        }
    .end annotation
.end field

.field public final c:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LNp1;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(LY94;LY94;LY94;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "Lvp1;",
            ">;",
            "LY94<",
            "Lzp1;",
            ">;",
            "LY94<",
            "LNp1;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lkq1;->a:LY94;

    iput-object p2, p0, Lkq1;->b:LY94;

    iput-object p3, p0, Lkq1;->c:LY94;

    return-void
.end method

.method public static a(LY94;LY94;LY94;)Lkq1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "Lvp1;",
            ">;",
            "LY94<",
            "Lzp1;",
            ">;",
            "LY94<",
            "LNp1;",
            ">;)",
            "Lkq1;"
        }
    .end annotation

    new-instance v0, Lkq1;

    invoke-direct {v0, p0, p1, p2}, Lkq1;-><init>(LY94;LY94;LY94;)V

    return-object v0
.end method

.method public static c(Lvp1;Lzp1;LNp1;)Ljq1;
    .locals 1

    new-instance v0, Ljq1;

    invoke-direct {v0, p0, p1, p2}, Ljq1;-><init>(Lvp1;Lzp1;LNp1;)V

    return-object v0
.end method


# virtual methods
.method public b()Ljq1;
    .locals 3

    iget-object v0, p0, Lkq1;->a:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lvp1;

    iget-object v1, p0, Lkq1;->b:LY94;

    invoke-interface {v1}, LY94;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lzp1;

    iget-object v2, p0, Lkq1;->c:LY94;

    invoke-interface {v2}, LY94;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LNp1;

    invoke-static {v0, v1, v2}, Lkq1;->c(Lvp1;Lzp1;LNp1;)Ljq1;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lkq1;->b()Ljq1;

    move-result-object v0

    return-object v0
.end method
