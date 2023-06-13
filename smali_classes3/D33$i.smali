.class public final LD33$i;
.super Lw1;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LD33;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "i"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\n\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0007\u0010\u0008\u00a8\u0006\u000e"
    }
    d2 = {
        "LD33$i;",
        "Lw1;",
        "",
        "position",
        "",
        "bind",
        "LDd2;",
        "b",
        "LDd2;",
        "binding",
        "Landroid/view/View;",
        "view",
        "<init>",
        "(LD33;Landroid/view/View;)V",
        "nest-flight-sheet_release"
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
        "SMAP\nNestFlightSheetAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NestFlightSheetAdapter.kt\nco/bird/android/feature/nestflightsheet/adapters/NestFlightSheetAdapter$StatusViewHolder\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,463:1\n18#2:464\n9#3,4:465\n*S KotlinDebug\n*F\n+ 1 NestFlightSheetAdapter.kt\nco/bird/android/feature/nestflightsheet/adapters/NestFlightSheetAdapter$StatusViewHolder\n*L\n191#1:464\n191#1:465,4\n*E\n"
    }
.end annotation


# instance fields
.field public final b:LDd2;

.field public final synthetic c:LD33;


# direct methods
.method public constructor <init>(LD33;Landroid/view/View;)V
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

    iput-object p1, p0, LD33$i;->c:LD33;

    invoke-direct {p0, p2}, Lw1;-><init>(Landroid/view/View;)V

    invoke-static {p2}, LDd2;->a(Landroid/view/View;)LDd2;

    move-result-object p1

    const-string p2, "bind(view)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, LD33$i;->b:LDd2;

    return-void
.end method


# virtual methods
.method public bind(I)V
    .locals 6

    iget-object v0, p0, LD33$i;->c:LD33;

    invoke-static {v0}, LD33;->access$getAdapterData(LD33;)LE6;

    move-result-object v0

    invoke-virtual {v0, p1}, LE6;->e(I)LG6;

    move-result-object p1

    invoke-virtual {p1}, LG6;->c()Ljava/lang/Object;

    move-result-object p1

    instance-of v0, p1, Lco/bird/android/model/persistence/nestedstructures/NestStatus;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    move-object p1, v1

    :goto_0
    check-cast p1, Lco/bird/android/model/persistence/nestedstructures/NestStatus;

    if-eqz p1, :cond_4

    iget-object v0, p0, LD33$i;->c:LD33;

    invoke-virtual {p1}, Lco/bird/android/model/persistence/nestedstructures/NestStatus;->getClaimExpiresAt()Lorg/joda/time/DateTime;

    move-result-object v2

    const/4 v3, 0x0

    if-eqz v2, :cond_1

    iget-object v1, p0, LD33$i;->b:LDd2;

    iget-object v1, v1, LDd2;->c:Landroid/widget/ImageView;

    iget-object v2, p0, Landroidx/recyclerview/widget/RecyclerView$D;->itemView:Landroid/view/View;

    invoke-virtual {v2}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v2

    sget v4, Lrg4;->ic_filled_clock:I

    invoke-static {v2, v4}, LNA0;->e(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    iget-object v1, p0, LD33$i;->b:LDd2;

    iget-object v1, v1, LDd2;->c:Landroid/widget/ImageView;

    invoke-static {v3}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/view/View;->setBackgroundTintList(Landroid/content/res/ColorStateList;)V

    iget-object v1, p0, LD33$i;->b:LDd2;

    iget-object v1, v1, LDd2;->c:Landroid/widget/ImageView;

    invoke-virtual {v1, v3, v3, v3, v3}, Landroid/view/View;->setPaddingRelative(IIII)V

    goto :goto_1

    :cond_1
    iget-object v2, p0, LD33$i;->b:LDd2;

    iget-object v2, v2, LDd2;->c:Landroid/widget/ImageView;

    invoke-virtual {p1}, Lco/bird/android/model/persistence/nestedstructures/NestStatus;->getNestIcon()Lco/bird/android/model/constant/NestIcon;

    move-result-object v4

    if-eqz v4, :cond_2

    iget-object v1, p0, Landroidx/recyclerview/widget/RecyclerView$D;->itemView:Landroid/view/View;

    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    const-string v5, "itemView.context"

    invoke-static {v1, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v4, v1}, LS33;->a(Lco/bird/android/model/constant/NestIcon;Landroid/content/Context;)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    :cond_2
    invoke-virtual {v2, v1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    iget-object v1, p0, LD33$i;->b:LDd2;

    iget-object v1, v1, LDd2;->c:Landroid/widget/ImageView;

    invoke-virtual {p1}, Lco/bird/android/model/persistence/nestedstructures/NestStatus;->getIconBackgroundColor()Lco/bird/android/model/persistence/nestedstructures/ThemedColors;

    move-result-object v2

    if-eqz v2, :cond_3

    invoke-virtual {v2}, Lco/bird/android/model/persistence/nestedstructures/ThemedColors;->getLightMode()I

    move-result v3

    :cond_3
    invoke-static {v3}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/view/View;->setBackgroundTintList(Landroid/content/res/ColorStateList;)V

    const/4 v1, 0x4

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-static {v1}, Ltd3;->b(Ljava/lang/Number;)F

    move-result v1

    float-to-int v1, v1

    iget-object v2, p0, LD33$i;->b:LDd2;

    iget-object v2, v2, LDd2;->c:Landroid/widget/ImageView;

    invoke-virtual {v2, v1, v1, v1, v1}, Landroid/view/View;->setPaddingRelative(IIII)V

    :goto_1
    iget-object v1, p0, LD33$i;->b:LDd2;

    iget-object v1, v1, LDd2;->d:Landroid/widget/TextView;

    invoke-virtual {p1}, Lco/bird/android/model/persistence/nestedstructures/NestStatus;->getTitle()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v1, p0, LD33$i;->b:LDd2;

    iget-object v1, v1, LDd2;->b:Landroid/widget/TextView;

    invoke-virtual {p1}, Lco/bird/android/model/persistence/nestedstructures/NestStatus;->getDetails()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-static {v0}, LD33;->access$getBottomSheet$p(LD33;)Lco/bird/android/bottomsheet/BaseBottomSheet;

    move-result-object p1

    if-eqz p1, :cond_4

    iget-object v0, p0, LD33$i;->b:LDd2;

    invoke-virtual {v0}, LDd2;->b()Landroidx/constraintlayout/widget/ConstraintLayout;

    move-result-object v0

    const-string v1, "binding.root"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "status"

    invoke-virtual {p1, v1, v0}, Lco/bird/android/bottomsheet/BaseBottomSheet;->n(Ljava/lang/CharSequence;Landroid/view/View;)V

    :cond_4
    return-void
.end method
