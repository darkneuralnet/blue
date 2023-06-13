.class public final Landroidx/compose/ui/platform/f$v;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/ui/platform/f;->d0(LVp5;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function0<",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n\u00a2\u0006\u0002\u0008\u0002"
    }
    d2 = {
        "<anonymous>",
        "",
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


# instance fields
.field public final synthetic g:LVp5;

.field public final synthetic h:Landroidx/compose/ui/platform/f;


# direct methods
.method public constructor <init>(LVp5;Landroidx/compose/ui/platform/f;)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/ui/platform/f$v;->g:LVp5;

    iput-object p2, p0, Landroidx/compose/ui/platform/f$v;->h:Landroidx/compose/ui/platform/f;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Landroidx/compose/ui/platform/f$v;->invoke()V

    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0
.end method

.method public final invoke()V
    .locals 15

    iget-object v0, p0, Landroidx/compose/ui/platform/f$v;->g:LVp5;

    invoke-virtual {v0}, LVp5;->a()LQp5;

    move-result-object v0

    iget-object v1, p0, Landroidx/compose/ui/platform/f$v;->g:LVp5;

    invoke-virtual {v1}, LVp5;->e()LQp5;

    move-result-object v1

    iget-object v2, p0, Landroidx/compose/ui/platform/f$v;->g:LVp5;

    invoke-virtual {v2}, LVp5;->b()Ljava/lang/Float;

    move-result-object v2

    iget-object v3, p0, Landroidx/compose/ui/platform/f$v;->g:LVp5;

    invoke-virtual {v3}, LVp5;->c()Ljava/lang/Float;

    move-result-object v3

    const/4 v4, 0x0

    if-eqz v0, :cond_0

    if-eqz v2, :cond_0

    invoke-virtual {v0}, LQp5;->c()Lkotlin/jvm/functions/Function0;

    move-result-object v5

    invoke-interface {v5}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Number;

    invoke-virtual {v5}, Ljava/lang/Number;->floatValue()F

    move-result v5

    invoke-virtual {v2}, Ljava/lang/Float;->floatValue()F

    move-result v2

    sub-float/2addr v5, v2

    goto :goto_0

    :cond_0
    move v5, v4

    :goto_0
    if-eqz v1, :cond_1

    if-eqz v3, :cond_1

    invoke-virtual {v1}, LQp5;->c()Lkotlin/jvm/functions/Function0;

    move-result-object v2

    invoke-interface {v2}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->floatValue()F

    move-result v2

    invoke-virtual {v3}, Ljava/lang/Float;->floatValue()F

    move-result v3

    sub-float/2addr v2, v3

    goto :goto_1

    :cond_1
    move v2, v4

    :goto_1
    cmpg-float v3, v5, v4

    const/4 v6, 0x0

    const/4 v7, 0x1

    if-nez v3, :cond_2

    move v3, v7

    goto :goto_2

    :cond_2
    move v3, v6

    :goto_2
    if-eqz v3, :cond_4

    cmpg-float v3, v2, v4

    if-nez v3, :cond_3

    move v6, v7

    :cond_3
    if-nez v6, :cond_8

    :cond_4
    iget-object v3, p0, Landroidx/compose/ui/platform/f$v;->h:Landroidx/compose/ui/platform/f;

    iget-object v4, p0, Landroidx/compose/ui/platform/f$v;->g:LVp5;

    invoke-virtual {v4}, LVp5;->d()I

    move-result v4

    invoke-static {v3, v4}, Landroidx/compose/ui/platform/f;->i(Landroidx/compose/ui/platform/f;I)I

    move-result v3

    iget-object v8, p0, Landroidx/compose/ui/platform/f$v;->h:Landroidx/compose/ui/platform/f;

    const/16 v10, 0x800

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    const/4 v12, 0x0

    const/16 v13, 0x8

    const/4 v14, 0x0

    move v9, v3

    invoke-static/range {v8 .. v14}, Landroidx/compose/ui/platform/f;->a0(Landroidx/compose/ui/platform/f;IILjava/lang/Integer;Ljava/util/List;ILjava/lang/Object;)Z

    iget-object v4, p0, Landroidx/compose/ui/platform/f$v;->h:Landroidx/compose/ui/platform/f;

    const/16 v6, 0x1000

    invoke-virtual {v4, v3, v6}, Landroidx/compose/ui/platform/f;->r(II)Landroid/view/accessibility/AccessibilityEvent;

    move-result-object v3

    if-eqz v0, :cond_5

    invoke-virtual {v0}, LQp5;->c()Lkotlin/jvm/functions/Function0;

    move-result-object v4

    invoke-interface {v4}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->floatValue()F

    move-result v4

    float-to-int v4, v4

    invoke-virtual {v3, v4}, Landroid/view/accessibility/AccessibilityRecord;->setScrollX(I)V

    invoke-virtual {v0}, LQp5;->a()Lkotlin/jvm/functions/Function0;

    move-result-object v4

    invoke-interface {v4}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->floatValue()F

    move-result v4

    float-to-int v4, v4

    invoke-virtual {v3, v4}, Landroid/view/accessibility/AccessibilityRecord;->setMaxScrollX(I)V

    :cond_5
    if-eqz v1, :cond_6

    invoke-virtual {v1}, LQp5;->c()Lkotlin/jvm/functions/Function0;

    move-result-object v4

    invoke-interface {v4}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->floatValue()F

    move-result v4

    float-to-int v4, v4

    invoke-virtual {v3, v4}, Landroid/view/accessibility/AccessibilityRecord;->setScrollY(I)V

    invoke-virtual {v1}, LQp5;->a()Lkotlin/jvm/functions/Function0;

    move-result-object v4

    invoke-interface {v4}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->floatValue()F

    move-result v4

    float-to-int v4, v4

    invoke-virtual {v3, v4}, Landroid/view/accessibility/AccessibilityRecord;->setMaxScrollY(I)V

    :cond_6
    sget v4, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v6, 0x1c

    if-lt v4, v6, :cond_7

    float-to-int v4, v5

    float-to-int v2, v2

    invoke-static {v3, v4, v2}, Landroidx/compose/ui/platform/f$c;->a(Landroid/view/accessibility/AccessibilityEvent;II)V

    :cond_7
    iget-object v2, p0, Landroidx/compose/ui/platform/f$v;->h:Landroidx/compose/ui/platform/f;

    invoke-static {v2, v3}, Landroidx/compose/ui/platform/f;->j(Landroidx/compose/ui/platform/f;Landroid/view/accessibility/AccessibilityEvent;)Z

    :cond_8
    if-eqz v0, :cond_9

    iget-object v2, p0, Landroidx/compose/ui/platform/f$v;->g:LVp5;

    invoke-virtual {v0}, LQp5;->c()Lkotlin/jvm/functions/Function0;

    move-result-object v0

    invoke-interface {v0}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Float;

    invoke-virtual {v2, v0}, LVp5;->g(Ljava/lang/Float;)V

    :cond_9
    if-eqz v1, :cond_a

    iget-object v0, p0, Landroidx/compose/ui/platform/f$v;->g:LVp5;

    invoke-virtual {v1}, LQp5;->c()Lkotlin/jvm/functions/Function0;

    move-result-object v1

    invoke-interface {v1}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Float;

    invoke-virtual {v0, v1}, LVp5;->h(Ljava/lang/Float;)V

    :cond_a
    return-void
.end method
