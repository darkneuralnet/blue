.class public final LVu4$d;
.super Lw1;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LVu4;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "d"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\n\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0007\u0010\u0008\u00a8\u0006\u000e"
    }
    d2 = {
        "LVu4$d;",
        "Lw1;",
        "",
        "position",
        "",
        "bind",
        "LSb2;",
        "b",
        "LSb2;",
        "binding",
        "Landroid/view/View;",
        "view",
        "<init>",
        "(LVu4;Landroid/view/View;)V",
        "release_release"
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
        "SMAP\nReleaseScanAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReleaseScanAdapter.kt\nco/bird/android/feature/release/adapters/ReleaseScanAdapter$VehicleViewHolder\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,160:1\n18#2:161\n9#3,4:162\n*S KotlinDebug\n*F\n+ 1 ReleaseScanAdapter.kt\nco/bird/android/feature/release/adapters/ReleaseScanAdapter$VehicleViewHolder\n*L\n139#1:161\n139#1:162,4\n*E\n"
    }
.end annotation


# instance fields
.field public final b:LSb2;

.field public final synthetic c:LVu4;


# direct methods
.method public constructor <init>(LVu4;Landroid/view/View;)V
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

    iput-object p1, p0, LVu4$d;->c:LVu4;

    invoke-direct {p0, p2}, Lw1;-><init>(Landroid/view/View;)V

    invoke-static {p2}, LSb2;->a(Landroid/view/View;)LSb2;

    move-result-object p2

    const-string v0, "bind(view)"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p2, p0, LVu4$d;->b:LSb2;

    iget-object p2, p2, LSb2;->e:Landroid/widget/ImageView;

    const-string v0, "binding.more"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LVu4$d$a;

    invoke-direct {v0, p1, p0}, LVu4$d$a;-><init>(LVu4;LVu4$d;)V

    invoke-static {p2, v0}, LMs2;->j(Landroid/view/View;Lkotlin/jvm/functions/Function1;)V

    return-void
.end method


# virtual methods
.method public bind(I)V
    .locals 10

    iget-object v0, p0, LVu4$d;->c:LVu4;

    invoke-static {v0}, LVu4;->access$getAdapterData(LVu4;)LE6;

    move-result-object v0

    invoke-virtual {v0, p1}, LE6;->e(I)LG6;

    move-result-object v0

    invoke-virtual {v0}, LG6;->c()Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, Lco/bird/android/model/wire/ReleaseValidationResult;

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    move-object v0, v2

    :goto_0
    check-cast v0, Lco/bird/android/model/wire/ReleaseValidationResult;

    if-eqz v0, :cond_5

    iget-object v1, p0, LVu4$d;->c:LVu4;

    iget-object v3, p0, LVu4$d;->b:LSb2;

    iget-object v3, v3, LSb2;->d:Landroid/widget/TextView;

    invoke-virtual {v0}, Lco/bird/android/model/wire/ReleaseValidationResult;->getBirdDisplayName()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-virtual {v0}, Lco/bird/android/model/wire/ReleaseValidationResult;->getBattery()Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x0

    if-eqz v3, :cond_1

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    goto :goto_1

    :cond_1
    move v3, v4

    :goto_1
    iget-object v5, p0, LVu4$d;->b:LSb2;

    iget-object v5, v5, LSb2;->b:Lco/bird/android/widget/BatteryViewV2;

    int-to-float v6, v3

    const/high16 v7, 0x42c80000    # 100.0f

    div-float/2addr v6, v7

    invoke-virtual {v5, v6}, Lco/bird/android/widget/BatteryViewV2;->setBatteryLevel(F)V

    iget-object v5, p0, LVu4$d;->b:LSb2;

    iget-object v5, v5, LSb2;->c:Landroid/widget/TextView;

    iget-object v6, p0, Landroidx/recyclerview/widget/RecyclerView$D;->itemView:Landroid/view/View;

    invoke-virtual {v6}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v6

    sget v7, Lnl4;->battery_percent:I

    const/4 v8, 0x1

    new-array v9, v8, [Ljava/lang/Object;

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    aput-object v3, v9, v4

    invoke-virtual {v6, v7, v9}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v5, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v3, p0, LVu4$d;->b:LSb2;

    iget-object v3, v3, LSb2;->f:Landroid/widget/ImageView;

    invoke-virtual {v0}, Lco/bird/android/model/wire/ReleaseValidationResult;->getStatusIcon()Lco/bird/android/model/constant/ClientIcon;

    move-result-object v4

    if-eqz v4, :cond_2

    iget-object v2, p0, Landroidx/recyclerview/widget/RecyclerView$D;->itemView:Landroid/view/View;

    invoke-virtual {v2}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v2

    const-string v5, "itemView.context"

    invoke-static {v2, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v4, v2}, LHk0;->a(Lco/bird/android/model/constant/ClientIcon;Landroid/content/Context;)Landroid/graphics/drawable/Drawable;

    move-result-object v2

    :cond_2
    invoke-virtual {v3, v2}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    invoke-virtual {v0}, Lco/bird/android/model/wire/ReleaseValidationResult;->getStatusIconBackgroundColor()Lco/bird/android/model/wire/WireThemedColors;

    move-result-object v2

    if-eqz v2, :cond_3

    invoke-virtual {v2}, Lco/bird/android/model/wire/WireThemedColors;->getLightMode()I

    move-result v2

    iget-object v3, p0, LVu4$d;->b:LSb2;

    iget-object v3, v3, LSb2;->f:Landroid/widget/ImageView;

    invoke-static {v2}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    move-result-object v2

    invoke-virtual {v3, v2}, Landroid/view/View;->setBackgroundTintList(Landroid/content/res/ColorStateList;)V

    :cond_3
    iget-object v2, p0, LVu4$d;->b:LSb2;

    iget-object v2, v2, LSb2;->g:Landroid/widget/TextView;

    invoke-virtual {v0}, Lco/bird/android/model/wire/ReleaseValidationResult;->getStatusDisplayName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    if-eq p1, v8, :cond_4

    const/4 v0, 0x2

    if-ne p1, v0, :cond_5

    invoke-virtual {v1, v8}, LMy;->getItemViewType(I)I

    move-result p1

    sget v0, LDj4;->item_release_lock:I

    if-ne p1, v0, :cond_5

    :cond_4
    invoke-virtual {v1}, LVu4;->v()LYP3;

    move-result-object p1

    if-eqz p1, :cond_5

    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView$D;->itemView:Landroid/view/View;

    const-string v1, "itemView"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "vehicle"

    invoke-virtual {p1, v1, v0}, LYP3;->c(Ljava/lang/CharSequence;Landroid/view/View;)V

    :cond_5
    return-void
.end method
