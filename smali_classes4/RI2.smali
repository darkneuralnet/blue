.class public final LRI2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsj1;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lsj1<",
        "LCx4;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:LVH2;

.field public final b:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LQx4;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(LVH2;LY94;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LVH2;",
            "LY94<",
            "LQx4;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LRI2;->a:LVH2;

    iput-object p2, p0, LRI2;->b:LY94;

    return-void
.end method

.method public static a(LVH2;LY94;)LRI2;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LVH2;",
            "LY94<",
            "LQx4;",
            ">;)",
            "LRI2;"
        }
    .end annotation

    new-instance v0, LRI2;

    invoke-direct {v0, p0, p1}, LRI2;-><init>(LVH2;LY94;)V

    return-object v0
.end method

.method public static c(LVH2;LQx4;)LCx4;
    .locals 0

    invoke-virtual {p0, p1}, LVH2;->W(LQx4;)LCx4;

    move-result-object p0

    invoke-static {p0}, LxZ3;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, LCx4;

    return-object p0
.end method


# virtual methods
.method public b()LCx4;
    .locals 2

    iget-object v0, p0, LRI2;->a:LVH2;

    iget-object v1, p0, LRI2;->b:LY94;

    invoke-interface {v1}, LY94;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LQx4;

    invoke-static {v0, v1}, LRI2;->c(LVH2;LQx4;)LCx4;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LRI2;->b()LCx4;

    move-result-object v0

    return-object v0
.end method
