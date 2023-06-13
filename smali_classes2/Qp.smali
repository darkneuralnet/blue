.class public final LQp;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsj1;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lsj1<",
        "LPp;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lhq;",
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
            "Lhq;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LQp;->a:LY94;

    return-void
.end method

.method public static a(LY94;)LQp;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "Lhq;",
            ">;)",
            "LQp;"
        }
    .end annotation

    new-instance v0, LQp;

    invoke-direct {v0, p0}, LQp;-><init>(LY94;)V

    return-object v0
.end method

.method public static c(Lhq;)LPp;
    .locals 1

    new-instance v0, LPp;

    invoke-direct {v0, p0}, LPp;-><init>(Lhq;)V

    return-object v0
.end method


# virtual methods
.method public b()LPp;
    .locals 1

    iget-object v0, p0, LQp;->a:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lhq;

    invoke-static {v0}, LQp;->c(Lhq;)LPp;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LQp;->b()LPp;

    move-result-object v0

    return-object v0
.end method
