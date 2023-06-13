.class public final Lma3$b$e;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lma3$b;-><init>(Lma3;Landroid/view/View;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function0<",
        "[",
        "LOT3;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u0000H\n\u00a2\u0006\u0004\u0008\u0002\u0010\u0003"
    }
    d2 = {
        "",
        "LOT3;",
        "b",
        "()[LOT3;"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:Lma3$b;


# direct methods
.method public constructor <init>(Lma3$b;)V
    .locals 0

    iput-object p1, p0, Lma3$b$e;->g:Lma3$b;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final b()[LOT3;
    .locals 8

    const/4 v0, 0x3

    new-array v1, v0, [LOT3;

    const/4 v2, 0x0

    move v3, v2

    :goto_0
    if-ge v3, v0, :cond_0

    iget-object v4, p0, Lma3$b$e;->g:Lma3$b;

    invoke-virtual {v4}, Lw1;->getContext()Landroid/content/Context;

    move-result-object v4

    invoke-static {v4}, LfB0;->j(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v4

    iget-object v5, p0, Lma3$b$e;->g:Lma3$b;

    invoke-static {v5}, Lma3$b;->a(Lma3$b;)LLd2;

    move-result-object v5

    iget-object v5, v5, LLd2;->c:Landroid/widget/FrameLayout;

    invoke-static {v4, v5, v2}, LQT3;->c(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)LQT3;

    move-result-object v4

    const-string v5, "inflate(context.layoutIn\u2026ter, binding.icon, false)"

    invoke-static {v4, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v4}, LQT3;->b()Landroidx/constraintlayout/widget/ConstraintLayout;

    move-result-object v5

    invoke-virtual {v5}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v5

    const-string v6, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams"

    invoke-static {v5, v6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v5, Landroid/widget/FrameLayout$LayoutParams;

    rsub-int/lit8 v6, v3, 0x2

    const/4 v7, 0x4

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-static {v7}, Ltd3;->b(Ljava/lang/Number;)F

    move-result v7

    float-to-int v7, v7

    mul-int/2addr v6, v7

    iput v6, v5, Landroid/widget/FrameLayout$LayoutParams;->topMargin:I

    invoke-virtual {v4}, LQT3;->b()Landroidx/constraintlayout/widget/ConstraintLayout;

    move-result-object v6

    invoke-virtual {v6, v5}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    invoke-virtual {v4}, LQT3;->b()Landroidx/constraintlayout/widget/ConstraintLayout;

    move-result-object v4

    invoke-static {v4}, LOT3;->a(Landroid/view/View;)LOT3;

    move-result-object v4

    aput-object v4, v1, v3

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_0
    return-object v1
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lma3$b$e;->b()[LOT3;

    move-result-object v0

    return-object v0
.end method
