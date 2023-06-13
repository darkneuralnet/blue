.class public final LSU4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsj1;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lsj1<",
        "LRU4;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Le13;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(LY94;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "Le13;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LSU4;->a:LY94;

    return-void
.end method

.method public static a(LY94;)LSU4;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "Le13;",
            ">;)",
            "LSU4;"
        }
    .end annotation

    new-instance v0, LSU4;

    invoke-direct {v0, p0}, LSU4;-><init>(LY94;)V

    return-object v0
.end method

.method public static c(Le13;)LRU4;
    .locals 1

    new-instance v0, LRU4;

    invoke-direct {v0, p0}, LRU4;-><init>(Le13;)V

    return-object v0
.end method


# virtual methods
.method public b()LRU4;
    .locals 1

    iget-object v0, p0, LSU4;->a:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Le13;

    invoke-static {v0}, LSU4;->c(Le13;)LRU4;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LSU4;->b()LRU4;

    move-result-object v0

    return-object v0
.end method
