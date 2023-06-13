.class public final Ldu4$e;
.super Lw1;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ldu4;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "e"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0007\u0010\u0008R\u0014\u0010\r\u001a\u00020\n8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000b\u0010\u000c\u00a8\u0006\u0012"
    }
    d2 = {
        "Ldu4$e;",
        "Lw1;",
        "",
        "position",
        "",
        "bind",
        "LVe2;",
        "b",
        "LVe2;",
        "binding",
        "LWm2;",
        "c",
        "LWm2;",
        "groupTitleBinding",
        "Landroid/view/View;",
        "view",
        "<init>",
        "(Ldu4;Landroid/view/View;)V",
        "release-assignment_release"
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
        "SMAP\nReleaseAssignmentAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReleaseAssignmentAdapter.kt\nco/bird/android/feature/operator/releaseassignment/adapter/ReleaseAssignmentAdapter$ReleaseAssignmentViewHolder\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,157:1\n18#2:158\n9#3,4:159\n1#4:163\n*S KotlinDebug\n*F\n+ 1 ReleaseAssignmentAdapter.kt\nco/bird/android/feature/operator/releaseassignment/adapter/ReleaseAssignmentAdapter$ReleaseAssignmentViewHolder\n*L\n97#1:158\n97#1:159,4\n*E\n"
    }
.end annotation


# instance fields
.field public final b:LVe2;

.field public final c:LWm2;

.field public final synthetic d:Ldu4;


# direct methods
.method public constructor <init>(Ldu4;Landroid/view/View;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/view/View;",
            ")V"
        }
    .end annotation

    const-string v0, "view"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Ldu4$e;->d:Ldu4;

    invoke-direct {p0, p2}, Lw1;-><init>(Landroid/view/View;)V

    invoke-static {p2}, LVe2;->a(Landroid/view/View;)LVe2;

    move-result-object v0

    const-string v1, "bind(view)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, p0, Ldu4$e;->b:LVe2;

    invoke-static {p2}, LWm2;->a(Landroid/view/View;)LWm2;

    move-result-object p2

    invoke-static {p2, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p2, p0, Ldu4$e;->c:LWm2;

    iget-object p2, p2, LWm2;->b:Landroid/widget/ImageView;

    const-string v0, "groupTitleBinding.directions"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ldu4$e$a;

    invoke-direct {v0, p0, p1}, Ldu4$e$a;-><init>(Ldu4$e;Ldu4;)V

    invoke-static {p2, v0}, LMs2;->j(Landroid/view/View;Lkotlin/jvm/functions/Function1;)V

    return-void
.end method


# virtual methods
.method public bind(I)V
    .locals 7

    iget-object v0, p0, Ldu4$e;->d:Ldu4;

    invoke-static {v0}, Ldu4;->access$getAdapterData(Ldu4;)LE6;

    move-result-object v0

    invoke-virtual {v0, p1}, LE6;->e(I)LG6;

    move-result-object p1

    invoke-virtual {p1}, LG6;->c()Ljava/lang/Object;

    move-result-object p1

    instance-of v0, p1, Lkotlin/Pair;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    move-object p1, v1

    :goto_0
    check-cast p1, Lkotlin/Pair;

    if-eqz p1, :cond_7

    invoke-virtual {p1}, Lkotlin/Pair;->component1()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lco/bird/android/model/persistence/nestedstructures/ZoneAssignmentReleaseAssignment;

    invoke-virtual {p1}, Lkotlin/Pair;->component2()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lco/bird/android/model/persistence/ZoneAssignmentGroup;

    iget-object v2, p0, Ldu4$e;->c:LWm2;

    iget-object v2, v2, LWm2;->c:Landroid/widget/TextView;

    invoke-virtual {v0}, Lco/bird/android/model/persistence/nestedstructures/ZoneAssignmentReleaseAssignment;->getTitle()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v2, p0, Ldu4$e;->c:LWm2;

    iget-object v2, v2, LWm2;->c:Landroid/widget/TextView;

    invoke-virtual {p1}, Lco/bird/android/model/persistence/ZoneAssignmentGroup;->getColor()Lco/bird/android/model/persistence/nestedstructures/ThemedColors;

    move-result-object p1

    invoke-virtual {p1}, Lco/bird/android/model/persistence/nestedstructures/ThemedColors;->getLightMode()I

    move-result p1

    invoke-static {p1}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    move-result-object p1

    invoke-virtual {v2, p1}, Landroid/view/View;->setBackgroundTintList(Landroid/content/res/ColorStateList;)V

    iget-object p1, p0, Ldu4$e;->b:LVe2;

    iget-object p1, p1, LVe2;->c:Landroid/widget/ImageView;

    const-string v2, "binding.descriptionIcon"

    invoke-static {p1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Lco/bird/android/model/persistence/nestedstructures/ZoneAssignmentReleaseAssignment;->getDescriptionLeadingIcon()Lco/bird/android/model/constant/ClientIcon;

    move-result-object v2

    const/4 v3, 0x1

    const/4 v4, 0x0

    if-eqz v2, :cond_1

    move v2, v3

    goto :goto_1

    :cond_1
    move v2, v4

    :goto_1
    const/4 v5, 0x2

    invoke-static {p1, v2, v4, v5, v1}, Ltu6;->show$default(Landroid/view/View;ZIILjava/lang/Object;)V

    iget-object p1, p0, Ldu4$e;->b:LVe2;

    iget-object p1, p1, LVe2;->c:Landroid/widget/ImageView;

    invoke-virtual {v0}, Lco/bird/android/model/persistence/nestedstructures/ZoneAssignmentReleaseAssignment;->getDescriptionLeadingIcon()Lco/bird/android/model/constant/ClientIcon;

    move-result-object v2

    if-eqz v2, :cond_2

    invoke-virtual {p0}, Lw1;->getContext()Landroid/content/Context;

    move-result-object v6

    invoke-static {v2, v6}, LHk0;->a(Lco/bird/android/model/constant/ClientIcon;Landroid/content/Context;)Landroid/graphics/drawable/Drawable;

    move-result-object v2

    goto :goto_2

    :cond_2
    move-object v2, v1

    :goto_2
    invoke-virtual {p1, v2}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    iget-object p1, p0, Ldu4$e;->b:LVe2;

    iget-object p1, p1, LVe2;->c:Landroid/widget/ImageView;

    invoke-virtual {v0}, Lco/bird/android/model/persistence/nestedstructures/ZoneAssignmentReleaseAssignment;->getDescriptionLeadingIconColor()Lco/bird/android/model/persistence/nestedstructures/ThemedColors;

    move-result-object v2

    if-eqz v2, :cond_3

    invoke-virtual {v2}, Lco/bird/android/model/persistence/nestedstructures/ThemedColors;->getLightMode()I

    move-result v2

    invoke-static {v2}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    move-result-object v2

    goto :goto_3

    :cond_3
    move-object v2, v1

    :goto_3
    invoke-virtual {p1, v2}, Landroid/widget/ImageView;->setImageTintList(Landroid/content/res/ColorStateList;)V

    iget-object p1, p0, Ldu4$e;->b:LVe2;

    iget-object p1, p1, LVe2;->b:Landroid/widget/TextView;

    invoke-virtual {v0}, Lco/bird/android/model/persistence/nestedstructures/ZoneAssignmentReleaseAssignment;->getDescription()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object p1, p0, Ldu4$e;->b:LVe2;

    iget-object p1, p1, LVe2;->i:Landroid/widget/TextView;

    invoke-virtual {v0}, Lco/bird/android/model/persistence/nestedstructures/ZoneAssignmentReleaseAssignment;->getDescriptionSubtitle()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object p1, p0, Ldu4$e;->b:LVe2;

    iget-object p1, p1, LVe2;->e:Landroid/widget/TextView;

    invoke-virtual {v0}, Lco/bird/android/model/persistence/nestedstructures/ZoneAssignmentReleaseAssignment;->getDueAt()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object p1, p0, Ldu4$e;->b:LVe2;

    iget-object p1, p1, LVe2;->h:Landroid/widget/ImageView;

    const-string v2, "binding.status"

    invoke-static {p1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Lco/bird/android/model/persistence/nestedstructures/ZoneAssignmentReleaseAssignment;->getDueAtTrailingIcon()Lco/bird/android/model/constant/ClientIcon;

    move-result-object v2

    if-eqz v2, :cond_4

    goto :goto_4

    :cond_4
    move v3, v4

    :goto_4
    invoke-static {p1, v3, v4, v5, v1}, Ltu6;->show$default(Landroid/view/View;ZIILjava/lang/Object;)V

    iget-object p1, p0, Ldu4$e;->b:LVe2;

    iget-object p1, p1, LVe2;->h:Landroid/widget/ImageView;

    invoke-virtual {v0}, Lco/bird/android/model/persistence/nestedstructures/ZoneAssignmentReleaseAssignment;->getDueAtTrailingIcon()Lco/bird/android/model/constant/ClientIcon;

    move-result-object v2

    if-eqz v2, :cond_5

    invoke-virtual {p0}, Lw1;->getContext()Landroid/content/Context;

    move-result-object v3

    invoke-static {v2, v3}, LHk0;->a(Lco/bird/android/model/constant/ClientIcon;Landroid/content/Context;)Landroid/graphics/drawable/Drawable;

    move-result-object v2

    goto :goto_5

    :cond_5
    move-object v2, v1

    :goto_5
    invoke-virtual {p1, v2}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    iget-object p1, p0, Ldu4$e;->b:LVe2;

    iget-object p1, p1, LVe2;->h:Landroid/widget/ImageView;

    invoke-virtual {v0}, Lco/bird/android/model/persistence/nestedstructures/ZoneAssignmentReleaseAssignment;->getDueAtTrailingIconColor()Lco/bird/android/model/persistence/nestedstructures/ThemedColors;

    move-result-object v0

    if-eqz v0, :cond_6

    invoke-virtual {v0}, Lco/bird/android/model/persistence/nestedstructures/ThemedColors;->getLightMode()I

    move-result v0

    invoke-static {v0}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    move-result-object v1

    :cond_6
    invoke-virtual {p1, v1}, Landroid/widget/ImageView;->setImageTintList(Landroid/content/res/ColorStateList;)V

    :cond_7
    return-void
.end method
