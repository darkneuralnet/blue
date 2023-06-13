.class public final LAY2$e;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LAY2;-><init>(Landroid/content/Context;LHY2;Landroid/os/Bundle;Landroidx/lifecycle/f$b;LYY2;Ljava/lang/String;Landroid/os/Bundle;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function0<",
        "Landroidx/lifecycle/p;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0001\u0010\u0002"
    }
    d2 = {
        "Landroidx/lifecycle/p;",
        "b",
        "()Landroidx/lifecycle/p;"
    }
    k = 0x3
    mv = {
        0x1,
        0x6,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:LAY2;


# direct methods
.method public constructor <init>(LAY2;)V
    .locals 0

    iput-object p1, p0, LAY2$e;->g:LAY2;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final b()Landroidx/lifecycle/p;
    .locals 4

    iget-object v0, p0, LAY2$e;->g:LAY2;

    invoke-static {v0}, LAY2;->c(LAY2;)Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, LAY2$e;->g:LAY2;

    invoke-static {v0}, LAY2;->b(LAY2;)Landroidx/lifecycle/j;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/lifecycle/j;->b()Landroidx/lifecycle/f$b;

    move-result-object v0

    sget-object v1, Landroidx/lifecycle/f$b;->b:Landroidx/lifecycle/f$b;

    if-eq v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_1

    new-instance v0, Landroidx/lifecycle/u;

    iget-object v1, p0, LAY2$e;->g:LAY2;

    new-instance v2, LAY2$b;

    iget-object v3, p0, LAY2$e;->g:LAY2;

    invoke-direct {v2, v3}, LAY2$b;-><init>(LPi5;)V

    invoke-direct {v0, v1, v2}, Landroidx/lifecycle/u;-><init>(LXr6;Landroidx/lifecycle/u$b;)V

    const-class v1, LAY2$c;

    invoke-virtual {v0, v1}, Landroidx/lifecycle/u;->a(Ljava/lang/Class;)LOr6;

    move-result-object v0

    check-cast v0, LAY2$c;

    invoke-virtual {v0}, LAY2$c;->e()Landroidx/lifecycle/p;

    move-result-object v0

    return-object v0

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "You cannot access the NavBackStackEntry\'s SavedStateHandle after the NavBackStackEntry is destroyed."

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "You cannot access the NavBackStackEntry\'s SavedStateHandle until it is added to the NavController\'s back stack (i.e., the Lifecycle of the NavBackStackEntry reaches the CREATED state)."

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LAY2$e;->b()Landroidx/lifecycle/p;

    move-result-object v0

    return-object v0
.end method
