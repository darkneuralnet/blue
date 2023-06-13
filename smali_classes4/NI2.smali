.class public final LNI2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsj1;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lsj1<",
        "Lla2;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:LVH2;

.field public final b:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lha2;",
            ">;"
        }
    .end annotation
.end field

.field public final c:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lmn4;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(LVH2;LY94;LY94;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LVH2;",
            "LY94<",
            "Lha2;",
            ">;",
            "LY94<",
            "Lmn4;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LNI2;->a:LVH2;

    iput-object p2, p0, LNI2;->b:LY94;

    iput-object p3, p0, LNI2;->c:LY94;

    return-void
.end method

.method public static a(LVH2;LY94;LY94;)LNI2;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LVH2;",
            "LY94<",
            "Lha2;",
            ">;",
            "LY94<",
            "Lmn4;",
            ">;)",
            "LNI2;"
        }
    .end annotation

    new-instance v0, LNI2;

    invoke-direct {v0, p0, p1, p2}, LNI2;-><init>(LVH2;LY94;LY94;)V

    return-object v0
.end method

.method public static c(LVH2;Lha2;Lmn4;)Lla2;
    .locals 0

    invoke-virtual {p0, p1, p2}, LVH2;->S(Lha2;Lmn4;)Lla2;

    move-result-object p0

    invoke-static {p0}, LxZ3;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lla2;

    return-object p0
.end method


# virtual methods
.method public b()Lla2;
    .locals 3

    iget-object v0, p0, LNI2;->a:LVH2;

    iget-object v1, p0, LNI2;->b:LY94;

    invoke-interface {v1}, LY94;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lha2;

    iget-object v2, p0, LNI2;->c:LY94;

    invoke-interface {v2}, LY94;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lmn4;

    invoke-static {v0, v1, v2}, LNI2;->c(LVH2;Lha2;Lmn4;)Lla2;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LNI2;->b()Lla2;

    move-result-object v0

    return-object v0
.end method
