.class public final LDz1$d$a;
.super LDz1$d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LDz1$d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0014\u0010\n\u001a\u00020\t*\u00020\u00062\u0006\u0010\u0008\u001a\u00020\u0007H\u0002R\u0014\u0010\u000e\u001a\u00020\u000b8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000c\u0010\r\u00a8\u0006\u0013"
    }
    d2 = {
        "LDz1$d$a;",
        "LDz1$d;",
        "LDz1$a;",
        "benefitRow",
        "",
        "q",
        "",
        "",
        "locked",
        "Landroid/graphics/drawable/Drawable;",
        "r",
        "Lfc2;",
        "e",
        "Lfc2;",
        "binding",
        "Landroid/view/View;",
        "view",
        "<init>",
        "(Landroid/view/View;)V",
        "frequent-flyer_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final e:Lfc2;


# direct methods
.method public constructor <init>(Landroid/view/View;)V
    .locals 1

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, LDz1$d;-><init>(Landroid/view/View;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static {p1}, Lfc2;->a(Landroid/view/View;)Lfc2;

    move-result-object p1

    const-string v0, "bind(view)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, LDz1$d$a;->e:Lfc2;

    return-void
.end method


# virtual methods
.method public final q(LDz1$a;)V
    .locals 3

    const-string v0, "benefitRow"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LDz1$d$a;->e:Lfc2;

    iget-object v0, v0, Lfc2;->b:Landroid/widget/ImageView;

    invoke-virtual {p1}, LDz1$a;->c()I

    move-result v1

    invoke-virtual {p1}, LDz1$a;->b()Lco/bird/android/model/wire/WireBenefit;

    move-result-object v2

    invoke-virtual {v2}, Lco/bird/android/model/wire/WireBenefit;->getUnlocked()Z

    move-result v2

    xor-int/lit8 v2, v2, 0x1

    invoke-virtual {p0, v1, v2}, LDz1$d$a;->r(IZ)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    iget-object v0, p0, LDz1$d$a;->e:Lfc2;

    iget-object v0, v0, Lfc2;->d:Landroid/widget/TextView;

    invoke-virtual {p1}, LDz1$a;->b()Lco/bird/android/model/wire/WireBenefit;

    move-result-object v1

    invoke-virtual {v1}, Lco/bird/android/model/wire/WireBenefit;->getTitle()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v0, p0, LDz1$d$a;->e:Lfc2;

    iget-object v0, v0, Lfc2;->c:Landroid/widget/TextView;

    invoke-virtual {p1}, LDz1$a;->b()Lco/bird/android/model/wire/WireBenefit;

    move-result-object p1

    invoke-virtual {p1}, Lco/bird/android/model/wire/WireBenefit;->getDescription()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public final r(IZ)Landroid/graphics/drawable/Drawable;
    .locals 1

    if-eqz p1, :cond_3

    const/4 v0, 0x1

    if-eq p1, v0, :cond_1

    invoke-static {p0}, Lqr6;->a(Landroidx/recyclerview/widget/RecyclerView$D;)Landroid/content/Context;

    move-result-object p1

    if-eqz p2, :cond_0

    sget p2, Lrg4;->ic_yellow_badge_locked:I

    goto :goto_0

    :cond_0
    sget p2, Lrg4;->ic_yellow_badge:I

    :goto_0
    invoke-static {p1, p2}, LfB0;->i(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    goto :goto_2

    :cond_1
    invoke-static {p0}, Lqr6;->a(Landroidx/recyclerview/widget/RecyclerView$D;)Landroid/content/Context;

    move-result-object p1

    if-eqz p2, :cond_2

    sget p2, Lrg4;->ic_blue_badge_locked:I

    goto :goto_1

    :cond_2
    sget p2, Lrg4;->ic_blue_badge:I

    :goto_1
    invoke-static {p1, p2}, LfB0;->i(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    goto :goto_2

    :cond_3
    invoke-static {p0}, Lqr6;->a(Landroidx/recyclerview/widget/RecyclerView$D;)Landroid/content/Context;

    move-result-object p1

    sget p2, Lrg4;->ic_green_badge:I

    invoke-static {p1, p2}, LfB0;->i(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    :goto_2
    return-object p1
.end method
