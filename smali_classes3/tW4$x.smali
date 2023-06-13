.class public final LtW4$x;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LtW4;->S(LxW4;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "LJa4;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "LJa4;",
        "kotlin.jvm.PlatformType",
        "<name for destructuring parameter 0>",
        "",
        "a",
        "(LJa4;)V"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:LtW4;


# direct methods
.method public constructor <init>(LtW4;)V
    .locals 0

    iput-object p1, p0, LtW4$x;->g:LtW4;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LJa4;)V
    .locals 2

    invoke-virtual {p1}, LJa4;->a()Z

    move-result v0

    invoke-virtual {p1}, LJa4;->b()Landroid/content/Intent;

    move-result-object p1

    if-eqz v0, :cond_0

    iget-object p1, p0, LtW4$x;->g:LtW4;

    sget-object v0, LbA5;->a:LbA5;

    invoke-virtual {p1, v0}, Lf1;->h(Ljava/lang/Object;)V

    goto :goto_1

    :cond_0
    iget-object v0, p0, LtW4$x;->g:LtW4;

    new-instance v1, LiM3;

    invoke-static {p1}, LX52;->b(Landroid/content/Intent;)Lco/bird/android/navigator/ActivityResult;

    move-result-object p1

    check-cast p1, Lco/bird/android/navigator/PurchasePaymentActivityResult;

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Lco/bird/android/navigator/PurchasePaymentActivityResult;->b()Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    :goto_0
    invoke-direct {v1, p1}, LiM3;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lf1;->h(Ljava/lang/Object;)V

    :goto_1
    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LJa4;

    invoke-virtual {p0, p1}, LtW4$x;->a(LJa4;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method
