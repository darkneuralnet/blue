.class public final Lyq0$h;
.super Lw1;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lyq0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "h"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0007\u0010\u0008R\u0016\u0010\r\u001a\u00020\n8\u0002@\u0002X\u0082.\u00a2\u0006\u0006\n\u0004\u0008\u000b\u0010\u000c\u00a8\u0006\u0012"
    }
    d2 = {
        "Lyq0$h;",
        "Lw1;",
        "",
        "position",
        "",
        "bind",
        "LMf2;",
        "b",
        "LMf2;",
        "binding",
        "Lco/bird/android/model/constant/ComplaintResolutionField;",
        "c",
        "Lco/bird/android/model/constant/ComplaintResolutionField;",
        "field",
        "Landroid/view/View;",
        "view",
        "<init>",
        "(Lyq0;Landroid/view/View;)V",
        "co.bird.android.feature.complaintresolution"
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
        "SMAP\nComplaintResolutionAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ComplaintResolutionAdapter.kt\nco/bird/android/feature/complaintresolution/adapter/ComplaintResolutionAdapter$TakePhotoViewHolder\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,259:1\n18#2:260\n9#3,4:261\n*S KotlinDebug\n*F\n+ 1 ComplaintResolutionAdapter.kt\nco/bird/android/feature/complaintresolution/adapter/ComplaintResolutionAdapter$TakePhotoViewHolder\n*L\n173#1:260\n173#1:261,4\n*E\n"
    }
.end annotation


# instance fields
.field public final b:LMf2;

.field public c:Lco/bird/android/model/constant/ComplaintResolutionField;

.field public final synthetic d:Lyq0;


# direct methods
.method public constructor <init>(Lyq0;Landroid/view/View;)V
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

    iput-object p1, p0, Lyq0$h;->d:Lyq0;

    invoke-direct {p0, p2}, Lw1;-><init>(Landroid/view/View;)V

    invoke-static {p2}, LMf2;->a(Landroid/view/View;)LMf2;

    move-result-object p2

    const-string v0, "bind(view)"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p2, p0, Lyq0$h;->b:LMf2;

    invoke-virtual {p2}, LMf2;->b()Landroidx/constraintlayout/widget/ConstraintLayout;

    move-result-object v0

    const-string v1, "binding.root"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lyq0$h$a;

    invoke-direct {v1, p1, p0}, Lyq0$h$a;-><init>(Lyq0;Lyq0$h;)V

    invoke-static {v0, v1}, LMs2;->j(Landroid/view/View;Lkotlin/jvm/functions/Function1;)V

    iget-object p2, p2, LMf2;->c:Landroid/widget/ImageView;

    const-string v0, "binding.closeIcon"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lyq0$h$b;

    invoke-direct {v0, p1, p0}, Lyq0$h$b;-><init>(Lyq0;Lyq0$h;)V

    invoke-static {p2, v0}, LMs2;->j(Landroid/view/View;Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method public static final synthetic a(Lyq0$h;)Lco/bird/android/model/constant/ComplaintResolutionField;
    .locals 0

    iget-object p0, p0, Lyq0$h;->c:Lco/bird/android/model/constant/ComplaintResolutionField;

    return-object p0
.end method


# virtual methods
.method public bind(I)V
    .locals 6

    invoke-super {p0, p1}, Lw1;->bind(I)V

    iget-object v0, p0, Lyq0$h;->d:Lyq0;

    invoke-static {v0}, Lyq0;->access$getAdapterData(Lyq0;)LE6;

    move-result-object v0

    invoke-virtual {v0, p1}, LE6;->e(I)LG6;

    move-result-object p1

    invoke-virtual {p1}, LG6;->c()Ljava/lang/Object;

    move-result-object p1

    instance-of v0, p1, LAY5;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    move-object p1, v1

    :goto_0
    check-cast p1, LAY5;

    if-eqz p1, :cond_5

    iget-object v0, p0, Lyq0$h;->b:LMf2;

    iget-object v0, v0, LMf2;->d:Landroid/widget/TextView;

    invoke-virtual {p1}, LAY5;->c()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v0, p0, Lyq0$h;->b:LMf2;

    iget-object v0, v0, LMf2;->f:Landroid/widget/TextView;

    const-string v2, "binding.required"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, LAY5;->d()Z

    move-result v2

    const/4 v3, 0x0

    const/4 v4, 0x2

    invoke-static {v0, v2, v3, v4, v1}, Ltu6;->show$default(Landroid/view/View;ZIILjava/lang/Object;)V

    iget-object v0, p0, Lyq0$h;->b:LMf2;

    iget-object v0, v0, LMf2;->b:Landroid/widget/ImageView;

    const-string v2, "binding.cameraIcon"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, LAY5;->e()Ljava/lang/String;

    move-result-object v2

    const/4 v5, 0x1

    if-nez v2, :cond_1

    move v2, v5

    goto :goto_1

    :cond_1
    move v2, v3

    :goto_1
    invoke-static {v0, v2, v3, v4, v1}, Ltu6;->show$default(Landroid/view/View;ZIILjava/lang/Object;)V

    iget-object v0, p0, Lyq0$h;->b:LMf2;

    iget-object v0, v0, LMf2;->c:Landroid/widget/ImageView;

    const-string v2, "binding.closeIcon"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, LAY5;->e()Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_2

    goto :goto_2

    :cond_2
    move v5, v3

    :goto_2
    invoke-static {v0, v5, v3, v4, v1}, Ltu6;->show$default(Landroid/view/View;ZIILjava/lang/Object;)V

    invoke-virtual {p1}, LAY5;->e()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_3

    invoke-virtual {p0}, Lw1;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-static {v2}, Lcom/bumptech/glide/a;->t(Landroid/content/Context;)LUI4;

    move-result-object v2

    invoke-virtual {v2, v0}, LUI4;->k(Ljava/lang/String;)LrI4;

    move-result-object v0

    new-instance v2, LYI4;

    invoke-direct {v2}, LYI4;-><init>()V

    invoke-virtual {v2}, LLD;->f()LLD;

    move-result-object v2

    invoke-virtual {v0, v2}, LrI4;->G0(LLD;)LrI4;

    move-result-object v0

    iget-object v2, p0, Lyq0$h;->b:LMf2;

    iget-object v2, v2, LMf2;->e:Lcom/google/android/material/imageview/ShapeableImageView;

    invoke-virtual {v0, v2}, LrI4;->R0(Landroid/widget/ImageView;)LIt6;

    move-result-object v0

    goto :goto_3

    :cond_3
    move-object v0, v1

    :goto_3
    if-nez v0, :cond_4

    iget-object v0, p0, Lyq0$h;->b:LMf2;

    iget-object v0, v0, LMf2;->e:Lcom/google/android/material/imageview/ShapeableImageView;

    invoke-virtual {v0, v1}, Landroidx/appcompat/widget/AppCompatImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    :cond_4
    invoke-virtual {p1}, LAY5;->b()Lco/bird/android/model/constant/ComplaintResolutionField;

    move-result-object p1

    iput-object p1, p0, Lyq0$h;->c:Lco/bird/android/model/constant/ComplaintResolutionField;

    :cond_5
    return-void
.end method
