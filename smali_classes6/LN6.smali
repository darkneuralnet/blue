.class public final LLN6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LwM6;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "LwM6<",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:LwM6;

.field public final synthetic b:I


# direct methods
.method public constructor <init>(LwM6;[S)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LwM6<",
            "Landroid/content/Context;",
            ">;[S)V"
        }
    .end annotation

    const/4 p2, 0x3

    iput p2, p0, LLN6;->b:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LLN6;->a:LwM6;

    return-void
.end method

.method public static b(LwM6;)LLN6;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LwM6<",
            "Landroid/content/Context;",
            ">;)",
            "LLN6;"
        }
    .end annotation

    new-instance v0, LLN6;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, LLN6;-><init>(LwM6;[S)V

    return-object v0
.end method


# virtual methods
.method public final bridge synthetic a()Ljava/lang/Object;
    .locals 2

    iget v0, p0, LLN6;->b:I

    if-eqz v0, :cond_2

    const/4 v1, 0x1

    if-eq v0, v1, :cond_1

    const/4 v1, 0x2

    if-eq v0, v1, :cond_0

    iget-object v0, p0, LLN6;->a:LwM6;

    invoke-interface {v0}, LwM6;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/Context;

    new-instance v1, LSO6;

    invoke-direct {v1, v0}, LSO6;-><init>(Landroid/content/Context;)V

    return-object v1

    :cond_0
    iget-object v0, p0, LLN6;->a:LwM6;

    check-cast v0, LTN6;

    invoke-virtual {v0}, LTN6;->b()Landroid/content/Context;

    move-result-object v0

    new-instance v1, LXO6;

    invoke-direct {v1, v0}, LXO6;-><init>(Landroid/content/Context;)V

    return-object v1

    :cond_1
    iget-object v0, p0, LLN6;->a:LwM6;

    check-cast v0, LTN6;

    invoke-virtual {v0}, LTN6;->b()Landroid/content/Context;

    move-result-object v0

    new-instance v1, LWJ6;

    invoke-direct {v1, v0}, LWJ6;-><init>(Landroid/content/Context;)V

    return-object v1

    :cond_2
    iget-object v0, p0, LLN6;->a:LwM6;

    invoke-interface {v0}, LwM6;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LZM6;

    invoke-static {v0}, LpL6;->k(Ljava/lang/Object;)V

    return-object v0
.end method
