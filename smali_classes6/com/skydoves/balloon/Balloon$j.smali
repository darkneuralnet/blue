.class public final Lcom/skydoves/balloon/Balloon$j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/skydoves/balloon/Balloon;->G0(Landroid/view/View;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0002\u0010\u0002\n\u0002\u0008\u0003\u0010\u0003\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0001\u0010\u0002"
    }
    d2 = {
        "",
        "run",
        "()V",
        "<anonymous>"
    }
    k = 0x3
    mv = {
        0x1,
        0x7,
        0x1
    }
.end annotation


# instance fields
.field public final synthetic b:Lcom/skydoves/balloon/Balloon;

.field public final synthetic c:Landroid/view/View;

.field public final synthetic d:[Landroid/view/View;

.field public final synthetic e:Lcom/skydoves/balloon/Balloon;

.field public final synthetic f:Landroid/view/View;

.field public final synthetic g:I

.field public final synthetic h:I


# direct methods
.method public constructor <init>(Lcom/skydoves/balloon/Balloon;Landroid/view/View;[Landroid/view/View;Lcom/skydoves/balloon/Balloon;Landroid/view/View;II)V
    .locals 0

    iput-object p1, p0, Lcom/skydoves/balloon/Balloon$j;->b:Lcom/skydoves/balloon/Balloon;

    iput-object p2, p0, Lcom/skydoves/balloon/Balloon$j;->c:Landroid/view/View;

    iput-object p3, p0, Lcom/skydoves/balloon/Balloon$j;->d:[Landroid/view/View;

    iput-object p4, p0, Lcom/skydoves/balloon/Balloon$j;->e:Lcom/skydoves/balloon/Balloon;

    iput-object p5, p0, Lcom/skydoves/balloon/Balloon$j;->f:Landroid/view/View;

    iput p6, p0, Lcom/skydoves/balloon/Balloon$j;->g:I

    iput p7, p0, Lcom/skydoves/balloon/Balloon$j;->h:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 5

    iget-object v0, p0, Lcom/skydoves/balloon/Balloon$j;->b:Lcom/skydoves/balloon/Balloon;

    iget-object v1, p0, Lcom/skydoves/balloon/Balloon$j;->c:Landroid/view/View;

    invoke-static {v0, v1}, Lcom/skydoves/balloon/Balloon;->o(Lcom/skydoves/balloon/Balloon;Landroid/view/View;)Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_6

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    iget-object v0, p0, Lcom/skydoves/balloon/Balloon$j;->b:Lcom/skydoves/balloon/Balloon;

    invoke-static {v0}, Lcom/skydoves/balloon/Balloon;->t(Lcom/skydoves/balloon/Balloon;)Lcom/skydoves/balloon/Balloon$a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/skydoves/balloon/Balloon$a;->x0()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_3

    iget-object v1, p0, Lcom/skydoves/balloon/Balloon$j;->b:Lcom/skydoves/balloon/Balloon;

    invoke-static {v1}, Lcom/skydoves/balloon/Balloon;->q(Lcom/skydoves/balloon/Balloon;)Lix;

    move-result-object v2

    invoke-static {v1}, Lcom/skydoves/balloon/Balloon;->t(Lcom/skydoves/balloon/Balloon;)Lcom/skydoves/balloon/Balloon$a;

    move-result-object v3

    invoke-virtual {v3}, Lcom/skydoves/balloon/Balloon$a;->z0()I

    move-result v3

    invoke-virtual {v2, v0, v3}, Lix;->g(Ljava/lang/String;I)Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-static {v1}, Lcom/skydoves/balloon/Balloon;->q(Lcom/skydoves/balloon/Balloon;)Lix;

    move-result-object v1

    invoke-virtual {v1, v0}, Lix;->f(Ljava/lang/String;)V

    goto :goto_1

    :cond_1
    invoke-static {v1}, Lcom/skydoves/balloon/Balloon;->t(Lcom/skydoves/balloon/Balloon;)Lcom/skydoves/balloon/Balloon$a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/skydoves/balloon/Balloon$a;->y0()Lkotlin/jvm/functions/Function0;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-interface {v0}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    :cond_2
    return-void

    :cond_3
    :goto_1
    iget-object v0, p0, Lcom/skydoves/balloon/Balloon$j;->b:Lcom/skydoves/balloon/Balloon;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/skydoves/balloon/Balloon;->B(Lcom/skydoves/balloon/Balloon;Z)V

    iget-object v0, p0, Lcom/skydoves/balloon/Balloon$j;->b:Lcom/skydoves/balloon/Balloon;

    invoke-static {v0}, Lcom/skydoves/balloon/Balloon;->t(Lcom/skydoves/balloon/Balloon;)Lcom/skydoves/balloon/Balloon$a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/skydoves/balloon/Balloon$a;->r()J

    move-result-wide v0

    const-wide/16 v2, -0x1

    cmp-long v2, v0, v2

    if-eqz v2, :cond_4

    iget-object v2, p0, Lcom/skydoves/balloon/Balloon$j;->b:Lcom/skydoves/balloon/Balloon;

    invoke-virtual {v2, v0, v1}, Lcom/skydoves/balloon/Balloon;->P(J)Z

    :cond_4
    iget-object v0, p0, Lcom/skydoves/balloon/Balloon$j;->b:Lcom/skydoves/balloon/Balloon;

    invoke-static {v0}, Lcom/skydoves/balloon/Balloon;->w(Lcom/skydoves/balloon/Balloon;)Z

    move-result v0

    const-string v1, "binding.balloonCard"

    if-eqz v0, :cond_5

    iget-object v0, p0, Lcom/skydoves/balloon/Balloon$j;->b:Lcom/skydoves/balloon/Balloon;

    invoke-static {v0}, Lcom/skydoves/balloon/Balloon;->s(Lcom/skydoves/balloon/Balloon;)LZw;

    move-result-object v2

    iget-object v2, v2, LZw;->d:Lcom/skydoves/balloon/radius/RadiusLayout;

    invoke-static {v2, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0, v2}, Lcom/skydoves/balloon/Balloon;->E(Lcom/skydoves/balloon/Balloon;Landroid/view/ViewGroup;)V

    goto :goto_2

    :cond_5
    iget-object v0, p0, Lcom/skydoves/balloon/Balloon$j;->b:Lcom/skydoves/balloon/Balloon;

    invoke-static {v0}, Lcom/skydoves/balloon/Balloon;->s(Lcom/skydoves/balloon/Balloon;)LZw;

    move-result-object v2

    iget-object v2, v2, LZw;->f:Lcom/skydoves/balloon/vectortext/VectorTextView;

    const-string v3, "binding.balloonText"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v3, p0, Lcom/skydoves/balloon/Balloon$j;->b:Lcom/skydoves/balloon/Balloon;

    invoke-static {v3}, Lcom/skydoves/balloon/Balloon;->s(Lcom/skydoves/balloon/Balloon;)LZw;

    move-result-object v3

    iget-object v3, v3, LZw;->d:Lcom/skydoves/balloon/radius/RadiusLayout;

    invoke-static {v3, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0, v2, v3}, Lcom/skydoves/balloon/Balloon;->z(Lcom/skydoves/balloon/Balloon;Landroid/widget/TextView;Landroid/view/View;)V

    :goto_2
    iget-object v0, p0, Lcom/skydoves/balloon/Balloon$j;->b:Lcom/skydoves/balloon/Balloon;

    invoke-static {v0}, Lcom/skydoves/balloon/Balloon;->s(Lcom/skydoves/balloon/Balloon;)LZw;

    move-result-object v0

    invoke-virtual {v0}, LZw;->b()Landroid/widget/FrameLayout;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1, v1}, Landroid/view/View;->measure(II)V

    iget-object v0, p0, Lcom/skydoves/balloon/Balloon$j;->b:Lcom/skydoves/balloon/Balloon;

    invoke-virtual {v0}, Lcom/skydoves/balloon/Balloon;->W()Landroid/widget/PopupWindow;

    move-result-object v0

    iget-object v1, p0, Lcom/skydoves/balloon/Balloon$j;->b:Lcom/skydoves/balloon/Balloon;

    invoke-virtual {v1}, Lcom/skydoves/balloon/Balloon;->c0()I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/PopupWindow;->setWidth(I)V

    iget-object v0, p0, Lcom/skydoves/balloon/Balloon$j;->b:Lcom/skydoves/balloon/Balloon;

    invoke-virtual {v0}, Lcom/skydoves/balloon/Balloon;->W()Landroid/widget/PopupWindow;

    move-result-object v0

    iget-object v1, p0, Lcom/skydoves/balloon/Balloon$j;->b:Lcom/skydoves/balloon/Balloon;

    invoke-virtual {v1}, Lcom/skydoves/balloon/Balloon;->a0()I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/PopupWindow;->setHeight(I)V

    iget-object v0, p0, Lcom/skydoves/balloon/Balloon$j;->b:Lcom/skydoves/balloon/Balloon;

    invoke-static {v0}, Lcom/skydoves/balloon/Balloon;->s(Lcom/skydoves/balloon/Balloon;)LZw;

    move-result-object v0

    iget-object v0, v0, LZw;->f:Lcom/skydoves/balloon/vectortext/VectorTextView;

    new-instance v1, Landroid/widget/FrameLayout$LayoutParams;

    const/4 v2, -0x1

    invoke-direct {v1, v2, v2}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    iget-object v0, p0, Lcom/skydoves/balloon/Balloon$j;->b:Lcom/skydoves/balloon/Balloon;

    iget-object v1, p0, Lcom/skydoves/balloon/Balloon$j;->c:Landroid/view/View;

    invoke-static {v0, v1}, Lcom/skydoves/balloon/Balloon;->x(Lcom/skydoves/balloon/Balloon;Landroid/view/View;)V

    iget-object v0, p0, Lcom/skydoves/balloon/Balloon$j;->b:Lcom/skydoves/balloon/Balloon;

    invoke-static {v0}, Lcom/skydoves/balloon/Balloon;->y(Lcom/skydoves/balloon/Balloon;)V

    iget-object v0, p0, Lcom/skydoves/balloon/Balloon$j;->b:Lcom/skydoves/balloon/Balloon;

    invoke-static {v0}, Lcom/skydoves/balloon/Balloon;->n(Lcom/skydoves/balloon/Balloon;)V

    iget-object v0, p0, Lcom/skydoves/balloon/Balloon$j;->b:Lcom/skydoves/balloon/Balloon;

    iget-object v1, p0, Lcom/skydoves/balloon/Balloon$j;->d:[Landroid/view/View;

    array-length v2, v1

    invoke-static {v1, v2}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [Landroid/view/View;

    invoke-static {v0, v1}, Lcom/skydoves/balloon/Balloon;->C(Lcom/skydoves/balloon/Balloon;[Landroid/view/View;)V

    iget-object v0, p0, Lcom/skydoves/balloon/Balloon$j;->b:Lcom/skydoves/balloon/Balloon;

    iget-object v1, p0, Lcom/skydoves/balloon/Balloon$j;->c:Landroid/view/View;

    invoke-static {v0, v1}, Lcom/skydoves/balloon/Balloon;->A(Lcom/skydoves/balloon/Balloon;Landroid/view/View;)V

    iget-object v0, p0, Lcom/skydoves/balloon/Balloon$j;->b:Lcom/skydoves/balloon/Balloon;

    invoke-static {v0}, Lcom/skydoves/balloon/Balloon;->l(Lcom/skydoves/balloon/Balloon;)V

    iget-object v0, p0, Lcom/skydoves/balloon/Balloon$j;->b:Lcom/skydoves/balloon/Balloon;

    invoke-static {v0}, Lcom/skydoves/balloon/Balloon;->D(Lcom/skydoves/balloon/Balloon;)V

    iget-object v0, p0, Lcom/skydoves/balloon/Balloon$j;->e:Lcom/skydoves/balloon/Balloon;

    invoke-virtual {v0}, Lcom/skydoves/balloon/Balloon;->W()Landroid/widget/PopupWindow;

    move-result-object v0

    iget-object v1, p0, Lcom/skydoves/balloon/Balloon$j;->f:Landroid/view/View;

    iget-object v2, p0, Lcom/skydoves/balloon/Balloon$j;->e:Lcom/skydoves/balloon/Balloon;

    invoke-static {v2}, Lcom/skydoves/balloon/Balloon;->t(Lcom/skydoves/balloon/Balloon;)Lcom/skydoves/balloon/Balloon$a;

    move-result-object v2

    invoke-virtual {v2}, Lcom/skydoves/balloon/Balloon$a;->A0()I

    move-result v2

    iget-object v3, p0, Lcom/skydoves/balloon/Balloon$j;->f:Landroid/view/View;

    invoke-virtual {v3}, Landroid/view/View;->getMeasuredWidth()I

    move-result v3

    div-int/lit8 v3, v3, 0x2

    iget-object v4, p0, Lcom/skydoves/balloon/Balloon$j;->e:Lcom/skydoves/balloon/Balloon;

    invoke-virtual {v4}, Lcom/skydoves/balloon/Balloon;->c0()I

    move-result v4

    div-int/lit8 v4, v4, 0x2

    sub-int/2addr v3, v4

    iget v4, p0, Lcom/skydoves/balloon/Balloon$j;->g:I

    add-int/2addr v3, v4

    mul-int/2addr v2, v3

    iget-object v3, p0, Lcom/skydoves/balloon/Balloon$j;->e:Lcom/skydoves/balloon/Balloon;

    invoke-virtual {v3}, Lcom/skydoves/balloon/Balloon;->a0()I

    move-result v3

    neg-int v3, v3

    iget-object v4, p0, Lcom/skydoves/balloon/Balloon$j;->f:Landroid/view/View;

    invoke-virtual {v4}, Landroid/view/View;->getMeasuredHeight()I

    move-result v4

    sub-int/2addr v3, v4

    iget v4, p0, Lcom/skydoves/balloon/Balloon$j;->h:I

    add-int/2addr v3, v4

    invoke-virtual {v0, v1, v2, v3}, Landroid/widget/PopupWindow;->showAsDropDown(Landroid/view/View;II)V

    :cond_6
    return-void
.end method
