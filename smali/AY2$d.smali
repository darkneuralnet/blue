.class public final LAY2$d;
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
        "Landroidx/lifecycle/r;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0001\u0010\u0002"
    }
    d2 = {
        "Landroidx/lifecycle/r;",
        "b",
        "()Landroidx/lifecycle/r;"
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

    iput-object p1, p0, LAY2$d;->g:LAY2;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final b()Landroidx/lifecycle/r;
    .locals 4

    new-instance v0, Landroidx/lifecycle/r;

    iget-object v1, p0, LAY2$d;->g:LAY2;

    invoke-static {v1}, LAY2;->a(LAY2;)Landroid/content/Context;

    move-result-object v1

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    goto :goto_0

    :cond_0
    move-object v1, v2

    :goto_0
    instance-of v3, v1, Landroid/app/Application;

    if-eqz v3, :cond_1

    move-object v2, v1

    check-cast v2, Landroid/app/Application;

    :cond_1
    iget-object v1, p0, LAY2$d;->g:LAY2;

    invoke-virtual {v1}, LAY2;->d()Landroid/os/Bundle;

    move-result-object v3

    invoke-direct {v0, v2, v1, v3}, Landroidx/lifecycle/r;-><init>(Landroid/app/Application;LPi5;Landroid/os/Bundle;)V

    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LAY2$d;->b()Landroidx/lifecycle/r;

    move-result-object v0

    return-object v0
.end method
