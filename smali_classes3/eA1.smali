.class public final LeA1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsj1;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lsj1<",
        "LcA1;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LTq4;",
            ">;"
        }
    .end annotation
.end field

.field public final b:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LQz1;",
            ">;"
        }
    .end annotation
.end field

.field public final c:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Le13;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(LY94;LY94;LY94;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "LTq4;",
            ">;",
            "LY94<",
            "LQz1;",
            ">;",
            "LY94<",
            "Le13;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LeA1;->a:LY94;

    iput-object p2, p0, LeA1;->b:LY94;

    iput-object p3, p0, LeA1;->c:LY94;

    return-void
.end method

.method public static a(LY94;LY94;LY94;)LeA1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "LTq4;",
            ">;",
            "LY94<",
            "LQz1;",
            ">;",
            "LY94<",
            "Le13;",
            ">;)",
            "LeA1;"
        }
    .end annotation

    new-instance v0, LeA1;

    invoke-direct {v0, p0, p1, p2}, LeA1;-><init>(LY94;LY94;LY94;)V

    return-object v0
.end method

.method public static c(LTq4;LQz1;Le13;)LcA1;
    .locals 1

    new-instance v0, LcA1;

    invoke-direct {v0, p0, p1, p2}, LcA1;-><init>(LTq4;LQz1;Le13;)V

    return-object v0
.end method


# virtual methods
.method public b()LcA1;
    .locals 3

    iget-object v0, p0, LeA1;->a:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LTq4;

    iget-object v1, p0, LeA1;->b:LY94;

    invoke-interface {v1}, LY94;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LQz1;

    iget-object v2, p0, LeA1;->c:LY94;

    invoke-interface {v2}, LY94;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Le13;

    invoke-static {v0, v1, v2}, LeA1;->c(LTq4;LQz1;Le13;)LcA1;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LeA1;->b()LcA1;

    move-result-object v0

    return-object v0
.end method
