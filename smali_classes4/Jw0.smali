.class public final LJw0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsj1;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lsj1<",
        "LIw0;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LEa6;",
            ">;"
        }
    .end annotation
.end field

.field public final b:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LRv0;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(LY94;LY94;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "LEa6;",
            ">;",
            "LY94<",
            "LRv0;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LJw0;->a:LY94;

    iput-object p2, p0, LJw0;->b:LY94;

    return-void
.end method

.method public static a(LY94;LY94;)LJw0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "LEa6;",
            ">;",
            "LY94<",
            "LRv0;",
            ">;)",
            "LJw0;"
        }
    .end annotation

    new-instance v0, LJw0;

    invoke-direct {v0, p0, p1}, LJw0;-><init>(LY94;LY94;)V

    return-object v0
.end method

.method public static c(LEa6;LRv0;)LIw0;
    .locals 1

    new-instance v0, LIw0;

    invoke-direct {v0, p0, p1}, LIw0;-><init>(LEa6;LRv0;)V

    return-object v0
.end method


# virtual methods
.method public b()LIw0;
    .locals 2

    iget-object v0, p0, LJw0;->a:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LEa6;

    iget-object v1, p0, LJw0;->b:LY94;

    invoke-interface {v1}, LY94;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LRv0;

    invoke-static {v0, v1}, LJw0;->c(LEa6;LRv0;)LIw0;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LJw0;->b()LIw0;

    move-result-object v0

    return-object v0
.end method
