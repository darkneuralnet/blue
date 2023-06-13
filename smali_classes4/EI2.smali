.class public final LEI2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsj1;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lsj1<",
        "LPl1;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:LVH2;

.field public final b:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lgl;",
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
            "Lgl;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LEI2;->a:LVH2;

    iput-object p2, p0, LEI2;->b:LY94;

    return-void
.end method

.method public static a(LVH2;LY94;)LEI2;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LVH2;",
            "LY94<",
            "Lgl;",
            ">;)",
            "LEI2;"
        }
    .end annotation

    new-instance v0, LEI2;

    invoke-direct {v0, p0, p1}, LEI2;-><init>(LVH2;LY94;)V

    return-object v0
.end method

.method public static c(LVH2;Lgl;)LPl1;
    .locals 0

    invoke-virtual {p0, p1}, LVH2;->J(Lgl;)LPl1;

    move-result-object p0

    invoke-static {p0}, LxZ3;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, LPl1;

    return-object p0
.end method


# virtual methods
.method public b()LPl1;
    .locals 2

    iget-object v0, p0, LEI2;->a:LVH2;

    iget-object v1, p0, LEI2;->b:LY94;

    invoke-interface {v1}, LY94;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lgl;

    invoke-static {v0, v1}, LEI2;->c(LVH2;Lgl;)LPl1;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LEI2;->b()LPl1;

    move-result-object v0

    return-object v0
.end method
