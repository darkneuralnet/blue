.class public final LOI2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsj1;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lsj1<",
        "Llp2;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:LVH2;

.field public final b:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LMD;",
            ">;"
        }
    .end annotation
.end field

.field public final c:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lsm6;",
            ">;"
        }
    .end annotation
.end field

.field public final d:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LaY;",
            ">;"
        }
    .end annotation
.end field

.field public final e:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LKn6;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(LVH2;LY94;LY94;LY94;LY94;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LVH2;",
            "LY94<",
            "LMD;",
            ">;",
            "LY94<",
            "Lsm6;",
            ">;",
            "LY94<",
            "LaY;",
            ">;",
            "LY94<",
            "LKn6;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LOI2;->a:LVH2;

    iput-object p2, p0, LOI2;->b:LY94;

    iput-object p3, p0, LOI2;->c:LY94;

    iput-object p4, p0, LOI2;->d:LY94;

    iput-object p5, p0, LOI2;->e:LY94;

    return-void
.end method

.method public static a(LVH2;LY94;LY94;LY94;LY94;)LOI2;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LVH2;",
            "LY94<",
            "LMD;",
            ">;",
            "LY94<",
            "Lsm6;",
            ">;",
            "LY94<",
            "LaY;",
            ">;",
            "LY94<",
            "LKn6;",
            ">;)",
            "LOI2;"
        }
    .end annotation

    new-instance v6, LOI2;

    move-object v0, v6

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    invoke-direct/range {v0 .. v5}, LOI2;-><init>(LVH2;LY94;LY94;LY94;LY94;)V

    return-object v6
.end method

.method public static c(LVH2;LMD;Lsm6;LaY;LKn6;)Llp2;
    .locals 0

    invoke-virtual {p0, p1, p2, p3, p4}, LVH2;->T(LMD;Lsm6;LaY;LKn6;)Llp2;

    move-result-object p0

    invoke-static {p0}, LxZ3;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Llp2;

    return-object p0
.end method


# virtual methods
.method public b()Llp2;
    .locals 5

    iget-object v0, p0, LOI2;->a:LVH2;

    iget-object v1, p0, LOI2;->b:LY94;

    invoke-interface {v1}, LY94;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LMD;

    iget-object v2, p0, LOI2;->c:LY94;

    invoke-interface {v2}, LY94;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lsm6;

    iget-object v3, p0, LOI2;->d:LY94;

    invoke-interface {v3}, LY94;->get()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, LaY;

    iget-object v4, p0, LOI2;->e:LY94;

    invoke-interface {v4}, LY94;->get()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, LKn6;

    invoke-static {v0, v1, v2, v3, v4}, LOI2;->c(LVH2;LMD;Lsm6;LaY;LKn6;)Llp2;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LOI2;->b()Llp2;

    move-result-object v0

    return-object v0
.end method
