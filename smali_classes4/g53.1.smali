.class public final Lg53;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsj1;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lsj1<",
        "LZo;",
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

    iput-object p1, p0, Lg53;->a:LP43;

    iput-object p2, p0, Lg53;->b:LY94;

    return-void
.end method

.method public static a(LP43;LY94;)Lg53;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LP43;",
            "LY94<",
            "LMN4;",
            ">;)",
            "Lg53;"
        }
    .end annotation

    new-instance v0, Lg53;

    invoke-direct {v0, p0, p1}, Lg53;-><init>(LP43;LY94;)V

    return-object v0
.end method

.method public static c(LP43;LMN4;)LZo;
    .locals 0

    invoke-virtual {p0, p1}, LP43;->r(LMN4;)LZo;

    move-result-object p0

    invoke-static {p0}, LxZ3;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, LZo;

    return-object p0
.end method


# virtual methods
.method public b()LZo;
    .locals 2

    iget-object v0, p0, Lg53;->a:LP43;

    iget-object v1, p0, Lg53;->b:LY94;

    invoke-interface {v1}, LY94;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LMN4;

    invoke-static {v0, v1}, Lg53;->c(LP43;LMN4;)LZo;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lg53;->b()LZo;

    move-result-object v0

    return-object v0
.end method
