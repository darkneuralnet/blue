.class public final Ln60$r;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ln60;->L(Landroid/content/Intent;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lco/bird/api/response/OperatorBatchStatusResponse;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "Lco/bird/api/response/OperatorBatchStatusResponse;",
        "kotlin.jvm.PlatformType",
        "it",
        "",
        "a",
        "(Lco/bird/api/response/OperatorBatchStatusResponse;)V"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:Ln60;


# direct methods
.method public constructor <init>(Ln60;)V
    .locals 0

    iput-object p1, p0, Ln60$r;->g:Ln60;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lco/bird/api/response/OperatorBatchStatusResponse;)V
    .locals 3

    invoke-virtual {p1}, Lco/bird/api/response/OperatorBatchStatusResponse;->getBatchNotice()Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_0

    iget-object v0, p0, Ln60$r;->g:Ln60;

    invoke-static {v0}, Ln60;->access$getUi$p(Ln60;)LH60;

    move-result-object v1

    new-instance v2, Ln60$r$a;

    invoke-direct {v2, v0}, Ln60$r$a;-><init>(Ln60;)V

    invoke-interface {v1, p1, v2}, LH60;->T3(Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    if-nez p1, :cond_1

    iget-object p1, p0, Ln60$r;->g:Ln60;

    invoke-static {p1}, Ln60;->access$getNavigator$p(Ln60;)Le13;

    move-result-object p1

    const/4 v0, -0x1

    invoke-interface {p1, v0}, Le13;->b1(I)V

    :cond_1
    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lco/bird/api/response/OperatorBatchStatusResponse;

    invoke-virtual {p0, p1}, Ln60$r;->a(Lco/bird/api/response/OperatorBatchStatusResponse;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method
