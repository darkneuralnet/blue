.class public final LR43;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsj1;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lsj1<",
        "LfH;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:LP43;

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
.method public constructor <init>(LP43;LY94;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LP43;",
            "LY94<",
            "LMN4;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LR43;->a:LP43;

    iput-object p2, p0, LR43;->b:LY94;

    return-void
.end method

.method public static a(LP43;LMN4;)LfH;
    .locals 0

    invoke-virtual {p0, p1}, LP43;->c(LMN4;)LfH;

    move-result-object p0

    invoke-static {p0}, LxZ3;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, LfH;

    return-object p0
.end method

.method public static b(LP43;LY94;)LR43;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LP43;",
            "LY94<",
            "LMN4;",
            ">;)",
            "LR43;"
        }
    .end annotation

    new-instance v0, LR43;

    invoke-direct {v0, p0, p1}, LR43;-><init>(LP43;LY94;)V

    return-object v0
.end method


# virtual methods
.method public c()LfH;
    .locals 2

    iget-object v0, p0, LR43;->a:LP43;

    iget-object v1, p0, LR43;->b:LY94;

    invoke-interface {v1}, LY94;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LMN4;

    invoke-static {v0, v1}, LR43;->a(LP43;LMN4;)LfH;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LR43;->c()LfH;

    move-result-object v0

    return-object v0
.end method
