.class public final Lyq0$d;
.super Lw1;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lyq0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "d"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0007\u0010\u0008R\u0016\u0010\r\u001a\u00020\n8\u0002@\u0002X\u0082.\u00a2\u0006\u0006\n\u0004\u0008\u000b\u0010\u000c\u00a8\u0006\u0012"
    }
    d2 = {
        "Lyq0$d;",
        "Lw1;",
        "",
        "position",
        "",
        "bind",
        "Lnb2;",
        "b",
        "Lnb2;",
        "binding",
        "Lga2;",
        "c",
        "Lga2;",
        "category",
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
        "SMAP\nComplaintResolutionAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ComplaintResolutionAdapter.kt\nco/bird/android/feature/complaintresolution/adapter/ComplaintResolutionAdapter$IssueCategoryViewHolder\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,259:1\n18#2:260\n9#3,4:261\n*S KotlinDebug\n*F\n+ 1 ComplaintResolutionAdapter.kt\nco/bird/android/feature/complaintresolution/adapter/ComplaintResolutionAdapter$IssueCategoryViewHolder\n*L\n251#1:260\n251#1:261,4\n*E\n"
    }
.end annotation


# instance fields
.field public final b:Lnb2;

.field public c:Lga2;

.field public final synthetic d:Lyq0;


# direct methods
.method public constructor <init>(Lyq0;Landroid/view/View;)V
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

    iput-object p1, p0, Lyq0$d;->d:Lyq0;

    invoke-direct {p0, p2}, Lw1;-><init>(Landroid/view/View;)V

    invoke-static {p2}, Lnb2;->a(Landroid/view/View;)Lnb2;

    move-result-object p2

    const-string v0, "bind(view)"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p2, p0, Lyq0$d;->b:Lnb2;

    invoke-virtual {p2}, Lnb2;->b()Lcom/google/android/material/card/MaterialCardView;

    move-result-object p2

    const-string v0, "binding.root"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lyq0$d$a;

    invoke-direct {v0, p1, p0}, Lyq0$d$a;-><init>(Lyq0;Lyq0$d;)V

    invoke-static {p2, v0}, LMs2;->j(Landroid/view/View;Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method public static final synthetic a(Lyq0$d;)Lga2;
    .locals 0

    iget-object p0, p0, Lyq0$d;->c:Lga2;

    return-object p0
.end method


# virtual methods
.method public bind(I)V
    .locals 3

    invoke-super {p0, p1}, Lw1;->bind(I)V

    iget-object v0, p0, Lyq0$d;->d:Lyq0;

    invoke-static {v0}, Lyq0;->access$getAdapterData(Lyq0;)LE6;

    move-result-object v0

    invoke-virtual {v0, p1}, LE6;->e(I)LG6;

    move-result-object p1

    invoke-virtual {p1}, LG6;->c()Ljava/lang/Object;

    move-result-object p1

    instance-of v0, p1, Lga2;

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    check-cast p1, Lga2;

    if-eqz p1, :cond_1

    iget-object v0, p0, Lyq0$d;->b:Lnb2;

    iget-object v0, v0, Lnb2;->d:Landroid/widget/TextView;

    invoke-virtual {p0}, Lw1;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {p1}, Lga2;->c()I

    move-result v2

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v0, p0, Lyq0$d;->b:Lnb2;

    iget-object v0, v0, Lnb2;->c:Landroid/widget/ImageView;

    invoke-virtual {p0}, Lw1;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {p1}, Lga2;->b()I

    move-result v2

    invoke-static {v1, v2}, LNA0;->e(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    iput-object p1, p0, Lyq0$d;->c:Lga2;

    :cond_1
    return-void
.end method
