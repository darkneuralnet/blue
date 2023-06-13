.class public final La04$b$a;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = La04$b;-><init>(La04;Landroid/view/View;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Landroid/view/View;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0008\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n\u00a2\u0006\u0002\u0008\u0004"
    }
    d2 = {
        "<anonymous>",
        "",
        "it",
        "Landroid/view/View;",
        "invoke"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nPreloadAmountAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PreloadAmountAdapter.kt\nco/bird/android/feature/payment/adapters/PreloadAmountAdapter$PreloadAmountViewHolder$1\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,74:1\n18#2:75\n9#3,4:76\n*S KotlinDebug\n*F\n+ 1 PreloadAmountAdapter.kt\nco/bird/android/feature/payment/adapters/PreloadAmountAdapter$PreloadAmountViewHolder$1\n*L\n44#1:75\n44#1:76,4\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic g:La04;

.field public final synthetic h:La04$b;


# direct methods
.method public constructor <init>(La04;La04$b;)V
    .locals 0

    iput-object p1, p0, La04$b$a;->g:La04;

    iput-object p2, p0, La04$b$a;->h:La04$b;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Landroid/view/View;

    invoke-virtual {p0, p1}, La04$b$a;->invoke(Landroid/view/View;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Landroid/view/View;)V
    .locals 3

    iget-object p1, p0, La04$b$a;->g:La04;

    invoke-static {p1}, La04;->access$getAdapterData(La04;)LE6;

    move-result-object p1

    iget-object v0, p0, La04$b$a;->h:La04$b;

    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView$D;->getAbsoluteAdapterPosition()I

    move-result v0

    invoke-virtual {p1, v0}, LE6;->e(I)LG6;

    move-result-object p1

    invoke-virtual {p1}, LG6;->c()Ljava/lang/Object;

    move-result-object p1

    instance-of v0, p1, Lc04;

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    check-cast p1, Lc04;

    if-eqz p1, :cond_1

    iget-object p1, p0, La04$b$a;->g:La04;

    iget-object v0, p0, La04$b$a;->h:La04$b;

    invoke-static {p1}, La04;->access$getPositionSelected$p(La04;)I

    move-result v1

    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView$D;->getAbsoluteAdapterPosition()I

    move-result v2

    if-eq v1, v2, :cond_1

    invoke-static {p1}, La04;->access$getPositionSelected$p(La04;)I

    move-result v1

    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView$D;->getAbsoluteAdapterPosition()I

    move-result v0

    invoke-static {p1, v0}, La04;->access$setPositionSelected$p(La04;I)V

    invoke-virtual {p1, v1}, Landroidx/recyclerview/widget/RecyclerView$h;->notifyItemChanged(I)V

    invoke-static {p1}, La04;->access$getPositionSelected$p(La04;)I

    move-result v0

    invoke-virtual {p1, v0}, Landroidx/recyclerview/widget/RecyclerView$h;->notifyItemChanged(I)V

    :cond_1
    return-void
.end method
