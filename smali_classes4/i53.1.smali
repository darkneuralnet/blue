.class public final Li53;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsj1;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lsj1<",
        "LVE;",
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

    iput-object p1, p0, Li53;->a:LP43;

    iput-object p2, p0, Li53;->b:LY94;

    return-void
.end method

.method public static a(LP43;LY94;)Li53;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LP43;",
            "LY94<",
            "LMN4;",
            ">;)",
            "Li53;"
        }
    .end annotation

    new-instance v0, Li53;

    invoke-direct {v0, p0, p1}, Li53;-><init>(LP43;LY94;)V

    return-object v0
.end method

.method public static c(LP43;LMN4;)LVE;
    .locals 0

    invoke-virtual {p0, p1}, LP43;->t(LMN4;)LVE;

    move-result-object p0

    invoke-static {p0}, LxZ3;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, LVE;

    return-object p0
.end method


# virtual methods
.method public b()LVE;
    .locals 2

    iget-object v0, p0, Li53;->a:LP43;

    iget-object v1, p0, Li53;->b:LY94;

    invoke-interface {v1}, LY94;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LMN4;

    invoke-static {v0, v1}, Li53;->c(LP43;LMN4;)LVE;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Li53;->b()LVE;

    move-result-object v0

    return-object v0
.end method
