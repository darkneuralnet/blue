.class public final Li25$B1;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Li25;->Q5(Landroid/content/Intent;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Ljava/lang/Boolean;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n\u00a2\u0006\u0004\u0008\u0005\u0010\u0006"
    }
    d2 = {
        "<anonymous>",
        "",
        "isDestinationSelection",
        "",
        "kotlin.jvm.PlatformType",
        "invoke",
        "(Ljava/lang/Boolean;)V"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field public final synthetic g:Li25;


# direct methods
.method public constructor <init>(Li25;)V
    .locals 0

    iput-object p1, p0, Li25$B1;->g:Li25;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p0, p1}, Li25$B1;->invoke(Ljava/lang/Boolean;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Ljava/lang/Boolean;)V
    .locals 3

    const-string v0, "isDestinationSelection"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    iget-object p1, p0, Li25$B1;->g:Li25;

    invoke-static {p1}, Li25;->access$deselectCurrentBird(Li25;)V

    iget-object p1, p0, Li25$B1;->g:Li25;

    invoke-static {p1}, Li25;->access$getRideUi$p(Li25;)LP75;

    move-result-object p1

    invoke-interface {p1, v0}, LP75;->R7(Z)V

    iget-object p1, p0, Li25$B1;->g:Li25;

    invoke-static {p1}, Li25;->access$getRideUi$p(Li25;)LP75;

    move-result-object p1

    invoke-interface {p1, v0}, LP75;->Xi(Z)V

    iget-object p1, p0, Li25$B1;->g:Li25;

    invoke-static {p1}, Li25;->access$getRideUi$p(Li25;)LP75;

    move-result-object p1

    invoke-interface {p1, v0}, LP75;->de(Z)V

    iget-object p1, p0, Li25$B1;->g:Li25;

    invoke-static {p1}, Li25;->access$getRideUi$p(Li25;)LP75;

    move-result-object p1

    invoke-interface {p1, v0}, LP75;->M6(Z)V

    iget-object p1, p0, Li25$B1;->g:Li25;

    invoke-static {p1}, Li25;->access$getRideUi$p(Li25;)LP75;

    move-result-object p1

    invoke-interface {p1}, LP75;->n7()V

    goto :goto_0

    :cond_0
    iget-object p1, p0, Li25$B1;->g:Li25;

    invoke-static {p1}, Li25;->access$getRideUi$p(Li25;)LP75;

    move-result-object p1

    const/4 v1, 0x1

    invoke-interface {p1, v1}, LP75;->R7(Z)V

    iget-object p1, p0, Li25$B1;->g:Li25;

    invoke-static {p1}, Li25;->access$getRideUi$p(Li25;)LP75;

    move-result-object p1

    invoke-interface {p1, v1}, LP75;->Xi(Z)V

    iget-object p1, p0, Li25$B1;->g:Li25;

    invoke-static {p1}, Li25;->access$getRideUi$p(Li25;)LP75;

    move-result-object p1

    invoke-interface {p1, v1}, LP75;->de(Z)V

    iget-object p1, p0, Li25$B1;->g:Li25;

    invoke-static {p1}, Li25;->access$getRideUi$p(Li25;)LP75;

    move-result-object p1

    iget-object v2, p0, Li25$B1;->g:Li25;

    invoke-static {v2}, Li25;->access$getPrivateBirdsManager$p(Li25;)Lq54;

    move-result-object v2

    invoke-interface {v2}, Lq54;->o()Z

    move-result v2

    if-nez v2, :cond_1

    iget-object v2, p0, Li25$B1;->g:Li25;

    invoke-static {v2}, Li25;->access$getPrivateBirdsManager$p(Li25;)Lq54;

    move-result-object v2

    invoke-interface {v2}, Lq54;->q()Z

    move-result v2

    if-eqz v2, :cond_2

    :cond_1
    move v0, v1

    :cond_2
    invoke-interface {p1, v0}, LP75;->M6(Z)V

    :goto_0
    return-void
.end method