.class public final Lg35$n;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lg35;->b(Landroid/content/Intent;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lkotlin/Unit;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0003*\u0004\u0018\u00010\u00010\u0001H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "<anonymous>",
        "",
        "it",
        "kotlin.jvm.PlatformType",
        "invoke",
        "(Lkotlin/Unit;)V"
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
.field public final synthetic g:Lg35;


# direct methods
.method public constructor <init>(Lg35;)V
    .locals 0

    iput-object p1, p0, Lg35$n;->g:Lg35;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lkotlin/Unit;

    invoke-virtual {p0, p1}, Lg35$n;->invoke(Lkotlin/Unit;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Lkotlin/Unit;)V
    .locals 3

    iget-object p1, p0, Lg35$n;->g:Lg35;

    invoke-static {p1}, Lg35;->access$getUi$p(Lg35;)Li35;

    move-result-object p1

    iget-object v0, p0, Lg35$n;->g:Lg35;

    invoke-static {v0}, Lg35;->access$getUi$p(Lg35;)Li35;

    move-result-object v0

    invoke-interface {v0}, Li35;->Jb()Z

    move-result v0

    const/4 v1, 0x1

    xor-int/2addr v0, v1

    invoke-interface {p1, v0}, Li35;->Fh(Z)V

    iget-object p1, p0, Lg35$n;->g:Lg35;

    invoke-static {p1}, Lg35;->access$getUi$p(Lg35;)Li35;

    move-result-object p1

    const/4 v0, 0x0

    invoke-interface {p1, v0}, Li35;->hi(Z)V

    iget-object p1, p0, Lg35$n;->g:Lg35;

    invoke-static {p1}, Lg35;->access$getUi$p(Lg35;)Li35;

    move-result-object p1

    iget-object v2, p0, Lg35$n;->g:Lg35;

    invoke-static {v2}, Lg35;->access$getUi$p(Lg35;)Li35;

    move-result-object v2

    invoke-interface {v2}, Li35;->Jb()Z

    move-result v2

    if-nez v2, :cond_1

    iget-object v2, p0, Lg35$n;->g:Lg35;

    invoke-static {v2}, Lg35;->access$getUi$p(Lg35;)Li35;

    move-result-object v2

    invoke-interface {v2}, Li35;->gh()Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_0
    move v1, v0

    :cond_1
    :goto_0
    invoke-interface {p1, v1}, Li35;->wj(Z)V

    return-void
.end method
