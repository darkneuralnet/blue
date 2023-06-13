.class public final LQO6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LwM6;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "LwM6<",
        "LfP6;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:LwM6;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LwM6<",
            "Landroid/content/Context;",
            ">;"
        }
    .end annotation
.end field

.field public final b:LwM6;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LwM6<",
            "LuK6;",
            ">;"
        }
    .end annotation
.end field

.field public final c:LwM6;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LwM6<",
            "LAM6;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(LwM6;LwM6;LwM6;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LwM6<",
            "Landroid/content/Context;",
            ">;",
            "LwM6<",
            "LuK6;",
            ">;",
            "LwM6<",
            "LAM6;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LQO6;->a:LwM6;

    iput-object p2, p0, LQO6;->b:LwM6;

    iput-object p3, p0, LQO6;->c:LwM6;

    return-void
.end method


# virtual methods
.method public final bridge synthetic a()Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, LQO6;->a:LwM6;

    check-cast v0, LTO6;

    invoke-virtual {v0}, LTO6;->b()Landroid/content/Context;

    move-result-object v0

    iget-object v1, p0, LQO6;->b:LwM6;

    invoke-static {v1}, LsM6;->c(LwM6;)LoM6;

    move-result-object v1

    iget-object v2, p0, LQO6;->c:LwM6;

    invoke-static {v2}, LsM6;->c(LwM6;)LoM6;

    move-result-object v2

    invoke-static {v0}, LwO6;->b(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_0

    invoke-interface {v1}, LoM6;->a()Ljava/lang/Object;

    move-result-object v0

    goto :goto_0

    :cond_0
    invoke-interface {v2}, LoM6;->a()Ljava/lang/Object;

    move-result-object v0

    :goto_0
    check-cast v0, LfP6;

    invoke-static {v0}, LpL6;->k(Ljava/lang/Object;)V

    return-object v0
.end method
