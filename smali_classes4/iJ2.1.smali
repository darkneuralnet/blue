.class public final LiJ2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsj1;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lsj1<",
        "LAb4;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:LVH2;

.field public final b:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LEa;",
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
            "LEa;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LiJ2;->a:LVH2;

    iput-object p2, p0, LiJ2;->b:LY94;

    return-void
.end method

.method public static a(LVH2;LY94;)LiJ2;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LVH2;",
            "LY94<",
            "LEa;",
            ">;)",
            "LiJ2;"
        }
    .end annotation

    new-instance v0, LiJ2;

    invoke-direct {v0, p0, p1}, LiJ2;-><init>(LVH2;LY94;)V

    return-object v0
.end method

.method public static c(LVH2;LEa;)LAb4;
    .locals 0

    invoke-virtual {p0, p1}, LVH2;->n0(LEa;)LAb4;

    move-result-object p0

    invoke-static {p0}, LxZ3;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, LAb4;

    return-object p0
.end method


# virtual methods
.method public b()LAb4;
    .locals 2

    iget-object v0, p0, LiJ2;->a:LVH2;

    iget-object v1, p0, LiJ2;->b:LY94;

    invoke-interface {v1}, LY94;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LEa;

    invoke-static {v0, v1}, LiJ2;->c(LVH2;LEa;)LAb4;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LiJ2;->b()LAb4;

    move-result-object v0

    return-object v0
.end method