.class public final LpI2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsj1;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lsj1<",
        "Ll20;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:LVH2;

.field public final b:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LP10;",
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
            "LP10;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LpI2;->a:LVH2;

    iput-object p2, p0, LpI2;->b:LY94;

    return-void
.end method

.method public static a(LVH2;LY94;)LpI2;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LVH2;",
            "LY94<",
            "LP10;",
            ">;)",
            "LpI2;"
        }
    .end annotation

    new-instance v0, LpI2;

    invoke-direct {v0, p0, p1}, LpI2;-><init>(LVH2;LY94;)V

    return-object v0
.end method

.method public static c(LVH2;LP10;)Ll20;
    .locals 0

    invoke-virtual {p0, p1}, LVH2;->t(LP10;)Ll20;

    move-result-object p0

    invoke-static {p0}, LxZ3;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ll20;

    return-object p0
.end method


# virtual methods
.method public b()Ll20;
    .locals 2

    iget-object v0, p0, LpI2;->a:LVH2;

    iget-object v1, p0, LpI2;->b:LY94;

    invoke-interface {v1}, LY94;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LP10;

    invoke-static {v0, v1}, LpI2;->c(LVH2;LP10;)Ll20;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LpI2;->b()Ll20;

    move-result-object v0

    return-object v0
.end method
