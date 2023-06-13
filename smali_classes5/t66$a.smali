.class public final Lt66$a;
.super Landroidx/recyclerview/widget/RecyclerView$D;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lt66;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "a"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\t\n\u0002\u0008\u0006\u0008\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\r\u001a\u00020\n\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0010\u0010\u0008\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002R\u0014\u0010\r\u001a\u00020\n8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000b\u0010\u000cR\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u000f\u0010\u0010\u00a8\u0006\u0014"
    }
    d2 = {
        "Lt66$a;",
        "Landroidx/recyclerview/widget/RecyclerView$D;",
        "Lcom/chuckerteam/chucker/internal/data/entity/a;",
        "transaction",
        "",
        "e",
        "LT94;",
        "resources",
        "i",
        "j",
        "Lrj0;",
        "b",
        "Lrj0;",
        "itemBinding",
        "",
        "c",
        "Ljava/lang/Long;",
        "transactionId",
        "<init>",
        "(Lt66;Lrj0;)V",
        "com.github.ChuckerTeam.Chucker.library"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final b:Lrj0;

.field public c:Ljava/lang/Long;

.field public final synthetic d:Lt66;


# direct methods
.method public constructor <init>(Lt66;Lrj0;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lrj0;",
            ")V"
        }
    .end annotation

    const-string v0, "itemBinding"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lt66$a;->d:Lt66;

    invoke-virtual {p2}, Lrj0;->b()Landroidx/constraintlayout/widget/ConstraintLayout;

    move-result-object v0

    invoke-direct {p0, v0}, Landroidx/recyclerview/widget/RecyclerView$D;-><init>(Landroid/view/View;)V

    iput-object p2, p0, Lt66$a;->b:Lrj0;

    iget-object p2, p0, Landroidx/recyclerview/widget/RecyclerView$D;->itemView:Landroid/view/View;

    new-instance v0, Ls66;

    invoke-direct {v0, p0, p1}, Ls66;-><init>(Lt66$a;Lt66;)V

    invoke-virtual {p2, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method public static synthetic a(Lt66$a;Lt66;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lt66$a;->b(Lt66$a;Lt66;Landroid/view/View;)V

    return-void
.end method

.method public static final b(Lt66$a;Lt66;Landroid/view/View;)V
    .locals 2

    const-string p2, "this$0"

    invoke-static {p0, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p2, "this$1"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p0, p0, Lt66$a;->c:Ljava/lang/Long;

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Ljava/lang/Number;->longValue()J

    move-result-wide v0

    invoke-static {p1}, Lt66;->v(Lt66;)Lkotlin/jvm/functions/Function1;

    move-result-object p0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    return-void
.end method


# virtual methods
.method public final e(Lcom/chuckerteam/chucker/internal/data/entity/a;)V
    .locals 5
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "SetTextI18n"
        }
    .end annotation

    const-string v0, "transaction"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/chuckerteam/chucker/internal/data/entity/a;->g()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    iput-object v0, p0, Lt66$a;->c:Ljava/lang/Long;

    iget-object v0, p0, Lt66$a;->b:Lrj0;

    invoke-virtual {p1}, Lcom/chuckerteam/chucker/internal/data/entity/a;->e()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lcom/chuckerteam/chucker/internal/data/entity/a;->d()Z

    move-result v2

    invoke-static {v0, v1, v2}, Lu66;->a(Lrj0;Ljava/lang/String;Z)V

    iget-object v1, v0, Lrj0;->h:Landroid/widget/TextView;

    invoke-virtual {p1}, Lcom/chuckerteam/chucker/internal/data/entity/a;->h()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    invoke-virtual {p1, v3}, Lcom/chuckerteam/chucker/internal/data/entity/a;->c(Z)Ljava/lang/String;

    move-result-object v3

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " "

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v1, v0, Lrj0;->g:Landroid/widget/TextView;

    invoke-virtual {p1}, Lcom/chuckerteam/chucker/internal/data/entity/a;->f()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v1, v0, Lrj0;->k:Landroid/widget/TextView;

    invoke-static {}, Ljava/text/DateFormat;->getTimeInstance()Ljava/text/DateFormat;

    move-result-object v2

    invoke-virtual {p1}, Lcom/chuckerteam/chucker/internal/data/entity/a;->i()Ljava/lang/Long;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/text/Format;->format(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-virtual {p1}, Lcom/chuckerteam/chucker/internal/data/entity/a;->m()Z

    move-result v1

    if-eqz v1, :cond_0

    new-instance v1, LT94$b;

    invoke-direct {v1}, LT94$b;-><init>()V

    goto :goto_0

    :cond_0
    new-instance v1, LT94$a;

    invoke-direct {v1}, LT94$a;-><init>()V

    :goto_0
    invoke-virtual {p0, v1}, Lt66$a;->i(LT94;)V

    invoke-virtual {p1}, Lcom/chuckerteam/chucker/internal/data/entity/a;->k()Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction$a;

    move-result-object v1

    sget-object v2, Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction$a;->c:Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction$a;

    if-ne v1, v2, :cond_1

    iget-object v1, v0, Lrj0;->b:Landroid/widget/TextView;

    invoke-virtual {p1}, Lcom/chuckerteam/chucker/internal/data/entity/a;->j()Ljava/lang/Integer;

    move-result-object v2

    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v1, v0, Lrj0;->c:Landroid/widget/TextView;

    invoke-virtual {p1}, Lcom/chuckerteam/chucker/internal/data/entity/a;->b()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v1, v0, Lrj0;->i:Landroid/widget/TextView;

    invoke-virtual {p1}, Lcom/chuckerteam/chucker/internal/data/entity/a;->l()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_1

    :cond_1
    iget-object v1, v0, Lrj0;->b:Landroid/widget/TextView;

    const-string v2, ""

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v1, v0, Lrj0;->c:Landroid/widget/TextView;

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v1, v0, Lrj0;->i:Landroid/widget/TextView;

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :goto_1
    invoke-virtual {p1}, Lcom/chuckerteam/chucker/internal/data/entity/a;->k()Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction$a;

    move-result-object v1

    sget-object v2, Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction$a;->d:Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction$a;

    if-ne v1, v2, :cond_2

    iget-object v0, v0, Lrj0;->b:Landroid/widget/TextView;

    const-string v1, "!!!"

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_2
    invoke-virtual {p0, p1}, Lt66$a;->j(Lcom/chuckerteam/chucker/internal/data/entity/a;)V

    return-void
.end method

.method public final i(LT94;)V
    .locals 3

    iget-object v0, p0, Lt66$a;->b:Lrj0;

    iget-object v0, v0, Lrj0;->j:Landroid/widget/ImageView;

    iget-object v1, p0, Landroidx/recyclerview/widget/RecyclerView$D;->itemView:Landroid/view/View;

    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {p1}, LT94;->b()I

    move-result v2

    invoke-static {v1, v2}, Lvi;->b(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    iget-object v0, p0, Lt66$a;->b:Lrj0;

    iget-object v0, v0, Lrj0;->j:Landroid/widget/ImageView;

    iget-object v1, p0, Landroidx/recyclerview/widget/RecyclerView$D;->itemView:Landroid/view/View;

    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {p1}, LT94;->a()I

    move-result p1

    invoke-static {v1, p1}, LNA0;->c(Landroid/content/Context;I)I

    move-result p1

    invoke-static {p1}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    move-result-object p1

    invoke-static {v0, p1}, LxY1;->c(Landroid/widget/ImageView;Landroid/content/res/ColorStateList;)V

    return-void
.end method

.method public final j(Lcom/chuckerteam/chucker/internal/data/entity/a;)V
    .locals 2

    invoke-virtual {p1}, Lcom/chuckerteam/chucker/internal/data/entity/a;->k()Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction$a;

    move-result-object v0

    sget-object v1, Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction$a;->d:Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction$a;

    if-ne v0, v1, :cond_0

    iget-object p1, p0, Lt66$a;->d:Lt66;

    invoke-static {p1}, Lt66;->t(Lt66;)I

    move-result p1

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Lcom/chuckerteam/chucker/internal/data/entity/a;->k()Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction$a;

    move-result-object v0

    sget-object v1, Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction$a;->b:Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction$a;

    if-ne v0, v1, :cond_1

    iget-object p1, p0, Lt66$a;->d:Lt66;

    invoke-static {p1}, Lt66;->u(Lt66;)I

    move-result p1

    goto :goto_0

    :cond_1
    invoke-virtual {p1}, Lcom/chuckerteam/chucker/internal/data/entity/a;->j()Ljava/lang/Integer;

    move-result-object v0

    if-nez v0, :cond_2

    iget-object p1, p0, Lt66$a;->d:Lt66;

    invoke-static {p1}, Lt66;->r(Lt66;)I

    move-result p1

    goto :goto_0

    :cond_2
    invoke-virtual {p1}, Lcom/chuckerteam/chucker/internal/data/entity/a;->j()Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    const/16 v1, 0x1f4

    if-lt v0, v1, :cond_3

    iget-object p1, p0, Lt66$a;->d:Lt66;

    invoke-static {p1}, Lt66;->q(Lt66;)I

    move-result p1

    goto :goto_0

    :cond_3
    invoke-virtual {p1}, Lcom/chuckerteam/chucker/internal/data/entity/a;->j()Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    const/16 v1, 0x190

    if-lt v0, v1, :cond_4

    iget-object p1, p0, Lt66$a;->d:Lt66;

    invoke-static {p1}, Lt66;->p(Lt66;)I

    move-result p1

    goto :goto_0

    :cond_4
    invoke-virtual {p1}, Lcom/chuckerteam/chucker/internal/data/entity/a;->j()Ljava/lang/Integer;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    const/16 v0, 0x12c

    if-lt p1, v0, :cond_5

    iget-object p1, p0, Lt66$a;->d:Lt66;

    invoke-static {p1}, Lt66;->o(Lt66;)I

    move-result p1

    goto :goto_0

    :cond_5
    iget-object p1, p0, Lt66$a;->d:Lt66;

    invoke-static {p1}, Lt66;->r(Lt66;)I

    move-result p1

    :goto_0
    iget-object v0, p0, Lt66$a;->b:Lrj0;

    iget-object v0, v0, Lrj0;->b:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setTextColor(I)V

    iget-object v0, p0, Lt66$a;->b:Lrj0;

    iget-object v0, v0, Lrj0;->h:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setTextColor(I)V

    return-void
.end method
