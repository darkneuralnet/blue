.class public final LL53;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsj1;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lsj1<",
        "Ln21;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:LP43;

.field public final b:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lo21;",
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
            "Lo21;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LL53;->a:LP43;

    iput-object p2, p0, LL53;->b:LY94;

    return-void
.end method

.method public static a(LP43;LY94;)LL53;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LP43;",
            "LY94<",
            "Lo21;",
            ">;)",
            "LL53;"
        }
    .end annotation

    new-instance v0, LL53;

    invoke-direct {v0, p0, p1}, LL53;-><init>(LP43;LY94;)V

    return-object v0
.end method

.method public static c(LP43;Lo21;)Ln21;
    .locals 0

    invoke-virtual {p0, p1}, LP43;->W(Lo21;)Ln21;

    move-result-object p0

    invoke-static {p0}, LxZ3;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ln21;

    return-object p0
.end method


# virtual methods
.method public b()Ln21;
    .locals 2

    iget-object v0, p0, LL53;->a:LP43;

    iget-object v1, p0, LL53;->b:LY94;

    invoke-interface {v1}, LY94;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lo21;

    invoke-static {v0, v1}, LL53;->c(LP43;Lo21;)Ln21;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LL53;->b()Ln21;

    move-result-object v0

    return-object v0
.end method
