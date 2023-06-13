.class public final Ldu5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsj1;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lsj1<",
        "Lqx1;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Landroid/content/Context;",
            ">;"
        }
    .end annotation
.end field

.field public final b:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lsu2;",
            ">;"
        }
    .end annotation
.end field

.field public final c:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Landroid/content/Intent;",
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
            "Landroid/content/Context;",
            ">;",
            "LY94<",
            "Lsu2;",
            ">;",
            "LY94<",
            "Landroid/content/Intent;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ldu5;->a:LY94;

    iput-object p2, p0, Ldu5;->b:LY94;

    iput-object p3, p0, Ldu5;->c:LY94;

    return-void
.end method

.method public static a(LY94;LY94;LY94;)Ldu5;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "Landroid/content/Context;",
            ">;",
            "LY94<",
            "Lsu2;",
            ">;",
            "LY94<",
            "Landroid/content/Intent;",
            ">;)",
            "Ldu5;"
        }
    .end annotation

    new-instance v0, Ldu5;

    invoke-direct {v0, p0, p1, p2}, Ldu5;-><init>(LY94;LY94;LY94;)V

    return-object v0
.end method

.method public static c(Landroid/content/Context;Lsu2;Landroid/content/Intent;)Lqx1;
    .locals 0

    invoke-static {p0, p1, p2}, Lau5;->c(Landroid/content/Context;Lsu2;Landroid/content/Intent;)Lqx1;

    move-result-object p0

    invoke-static {p0}, LxZ3;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lqx1;

    return-object p0
.end method


# virtual methods
.method public b()Lqx1;
    .locals 3

    iget-object v0, p0, Ldu5;->a:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/Context;

    iget-object v1, p0, Ldu5;->b:LY94;

    invoke-interface {v1}, LY94;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lsu2;

    iget-object v2, p0, Ldu5;->c:LY94;

    invoke-interface {v2}, LY94;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/content/Intent;

    invoke-static {v0, v1, v2}, Ldu5;->c(Landroid/content/Context;Lsu2;Landroid/content/Intent;)Lqx1;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Ldu5;->b()Lqx1;

    move-result-object v0

    return-object v0
.end method
