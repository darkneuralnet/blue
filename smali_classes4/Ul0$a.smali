.class public LUl0$a;
.super Lw1;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LUl0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "a"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u0008\u0094\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u000e\u001a\u00020\u0007\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u0012\u0010\t\u001a\u00020\u00052\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0007H\u0016R\u0014\u0010\r\u001a\u00020\n8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000b\u0010\u000c\u00a8\u0006\u0011"
    }
    d2 = {
        "LUl0$a;",
        "Lw1;",
        "Landroid/view/View$OnClickListener;",
        "",
        "position",
        "",
        "bind",
        "Landroid/view/View;",
        "v",
        "onClick",
        "Lco/bird/android/widget/standardcomponents/CollapsableHeaderView;",
        "b",
        "Lco/bird/android/widget/standardcomponents/CollapsableHeaderView;",
        "header",
        "view",
        "<init>",
        "(LUl0;Landroid/view/View;)V",
        "widget_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nCollapsableAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CollapsableAdapter.kt\nco/bird/android/widget/adapter/CollapsableAdapter$HeaderViewHolder\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,76:1\n18#2:77\n9#3,4:78\n*S KotlinDebug\n*F\n+ 1 CollapsableAdapter.kt\nco/bird/android/widget/adapter/CollapsableAdapter$HeaderViewHolder\n*L\n14#1:77\n14#1:78,4\n*E\n"
    }
.end annotation


# instance fields
.field public final b:Lco/bird/android/widget/standardcomponents/CollapsableHeaderView;

.field public final synthetic c:LUl0;


# direct methods
.method public constructor <init>(LUl0;Landroid/view/View;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/view/View;",
            ")V"
        }
    .end annotation

    const-string v0, "view"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, LUl0$a;->c:LUl0;

    invoke-direct {p0, p2}, Lw1;-><init>(Landroid/view/View;)V

    check-cast p2, Lco/bird/android/widget/standardcomponents/CollapsableHeaderView;

    iput-object p2, p0, LUl0$a;->b:Lco/bird/android/widget/standardcomponents/CollapsableHeaderView;

    return-void
.end method

.method public static final synthetic access$getHeader$p(LUl0$a;)Lco/bird/android/widget/standardcomponents/CollapsableHeaderView;
    .locals 0

    iget-object p0, p0, LUl0$a;->b:Lco/bird/android/widget/standardcomponents/CollapsableHeaderView;

    return-object p0
.end method


# virtual methods
.method public bind(I)V
    .locals 5

    iget-object v0, p0, LUl0$a;->c:LUl0;

    invoke-virtual {v0}, LMy;->o()LE6;

    move-result-object v0

    invoke-virtual {v0}, LE6;->h()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LG6;

    invoke-virtual {v0}, LG6;->c()Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, LVl0;

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    move-object v0, v2

    :goto_0
    check-cast v0, LVl0;

    if-eqz v0, :cond_5

    iget-object v1, p0, LUl0$a;->c:LUl0;

    iget-object v3, p0, LUl0$a;->b:Lco/bird/android/widget/standardcomponents/CollapsableHeaderView;

    invoke-virtual {v0}, LVl0;->d()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v3, p0, LUl0$a;->b:Lco/bird/android/widget/standardcomponents/CollapsableHeaderView;

    invoke-virtual {v0}, LVl0;->b()Z

    move-result v4

    invoke-virtual {v3, v4}, Lco/bird/android/widget/standardcomponents/CollapsableHeaderView;->setCollapsable(Z)V

    invoke-virtual {v0}, LVl0;->c()Z

    move-result v3

    const/4 v4, 0x0

    invoke-virtual {v0, v4}, LVl0;->e(Z)V

    iget-object v0, p0, LUl0$a;->b:Lco/bird/android/widget/standardcomponents/CollapsableHeaderView;

    invoke-virtual {v0}, Lco/bird/android/widget/standardcomponents/CollapsableHeaderView;->f()Z

    move-result v0

    if-eqz v0, :cond_4

    iget-object v0, p0, LUl0$a;->b:Lco/bird/android/widget/standardcomponents/CollapsableHeaderView;

    if-eqz v3, :cond_1

    sget-object p1, Lco/bird/android/widget/standardcomponents/CollapsableHeaderView$a;->c:Lco/bird/android/widget/standardcomponents/CollapsableHeaderView$a;

    goto :goto_1

    :cond_1
    invoke-virtual {v1, p1}, LMy;->q(I)LH6;

    move-result-object p1

    invoke-virtual {p1}, LH6;->c()Ljava/util/List;

    move-result-object p1

    invoke-static {p1}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LG6;

    if-eqz p1, :cond_2

    invoke-virtual {p1}, LG6;->d()Z

    move-result p1

    const/4 v1, 0x1

    if-ne p1, v1, :cond_2

    move v4, v1

    :cond_2
    if-eqz v4, :cond_3

    sget-object p1, Lco/bird/android/widget/standardcomponents/CollapsableHeaderView$a;->d:Lco/bird/android/widget/standardcomponents/CollapsableHeaderView$a;

    goto :goto_1

    :cond_3
    sget-object p1, Lco/bird/android/widget/standardcomponents/CollapsableHeaderView$a;->c:Lco/bird/android/widget/standardcomponents/CollapsableHeaderView$a;

    :goto_1
    invoke-virtual {v0, p1}, Lco/bird/android/widget/standardcomponents/CollapsableHeaderView;->setArrowDirection(Lco/bird/android/widget/standardcomponents/CollapsableHeaderView$a;)V

    iget-object p1, p0, Landroidx/recyclerview/widget/RecyclerView$D;->itemView:Landroid/view/View;

    invoke-virtual {p1, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_2

    :cond_4
    iget-object p1, p0, Landroidx/recyclerview/widget/RecyclerView$D;->itemView:Landroid/view/View;

    invoke-virtual {p1, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :cond_5
    :goto_2
    return-void
.end method

.method public onClick(Landroid/view/View;)V
    .locals 2

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$D;->getAdapterPosition()I

    move-result p1

    const/4 v0, -0x1

    if-ne p1, v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, LUl0$a;->c:LUl0;

    new-instance v1, LUl0$a$a;

    invoke-direct {v1, p0}, LUl0$a$a;-><init>(LUl0$a;)V

    invoke-virtual {v0, p1, v1}, LUl0;->v(ILkotlin/jvm/functions/Function1;)V

    return-void
.end method
