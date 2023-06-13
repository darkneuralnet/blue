.class public final Lp63;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsj1;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lsj1<",
        "Loa3;",
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

    iput-object p1, p0, Lp63;->a:LP43;

    iput-object p2, p0, Lp63;->b:LY94;

    return-void
.end method

.method public static a(LP43;LY94;)Lp63;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LP43;",
            "LY94<",
            "LMN4;",
            ">;)",
            "Lp63;"
        }
    .end annotation

    new-instance v0, Lp63;

    invoke-direct {v0, p0, p1}, Lp63;-><init>(LP43;LY94;)V

    return-object v0
.end method

.method public static c(LP43;LMN4;)Loa3;
    .locals 0

    invoke-virtual {p0, p1}, LP43;->C0(LMN4;)Loa3;

    move-result-object p0

    invoke-static {p0}, LxZ3;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Loa3;

    return-object p0
.end method


# virtual methods
.method public b()Loa3;
    .locals 2

    iget-object v0, p0, Lp63;->a:LP43;

    iget-object v1, p0, Lp63;->b:LY94;

    invoke-interface {v1}, LY94;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LMN4;

    invoke-static {v0, v1}, Lp63;->c(LP43;LMN4;)Loa3;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lp63;->b()Loa3;

    move-result-object v0

    return-object v0
.end method
