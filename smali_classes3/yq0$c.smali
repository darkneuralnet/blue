.class public final Lyq0$c;
.super Lw1;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lyq0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "c"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\n\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0007\u0010\u0008\u00a8\u0006\u000e"
    }
    d2 = {
        "Lyq0$c;",
        "Lw1;",
        "",
        "position",
        "",
        "bind",
        "Lwb2;",
        "b",
        "Lwb2;",
        "binding",
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
        "SMAP\nComplaintResolutionAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ComplaintResolutionAdapter.kt\nco/bird/android/feature/complaintresolution/adapter/ComplaintResolutionAdapter$HeaderViewHolder\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,259:1\n18#2:260\n9#3,4:261\n*S KotlinDebug\n*F\n+ 1 ComplaintResolutionAdapter.kt\nco/bird/android/feature/complaintresolution/adapter/ComplaintResolutionAdapter$HeaderViewHolder\n*L\n231#1:260\n231#1:261,4\n*E\n"
    }
.end annotation


# instance fields
.field public final b:Lwb2;

.field public final synthetic c:Lyq0;


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

    iput-object p1, p0, Lyq0$c;->c:Lyq0;

    invoke-direct {p0, p2}, Lw1;-><init>(Landroid/view/View;)V

    invoke-static {p2}, Lwb2;->a(Landroid/view/View;)Lwb2;

    move-result-object p1

    const-string p2, "bind(view)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lyq0$c;->b:Lwb2;

    return-void
.end method


# virtual methods
.method public bind(I)V
    .locals 5

    iget-object v0, p0, Lyq0$c;->c:Lyq0;

    invoke-static {v0}, Lyq0;->access$getAdapterData(Lyq0;)LE6;

    move-result-object v0

    invoke-virtual {v0, p1}, LE6;->e(I)LG6;

    move-result-object p1

    invoke-virtual {p1}, LG6;->c()Ljava/lang/Object;

    move-result-object p1

    instance-of v0, p1, LIH1;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    move-object p1, v1

    :goto_0
    check-cast p1, LIH1;

    if-eqz p1, :cond_1

    iget-object v0, p0, Lyq0$c;->b:Lwb2;

    iget-object v0, v0, Lwb2;->d:Landroid/widget/TextView;

    const-string v2, "binding.title"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, LIH1;->d()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    const/4 v4, 0x2

    invoke-static {v0, v2, v3, v4, v1}, Ltu6;->setTextAndVisibility$default(Landroid/widget/TextView;Ljava/lang/CharSequence;IILjava/lang/Object;)V

    iget-object v0, p0, Lyq0$c;->b:Lwb2;

    iget-object v0, v0, Lwb2;->b:Landroid/widget/TextView;

    const-string v2, "binding.body"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, LIH1;->b()Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v2, v3, v4, v1}, Ltu6;->setTextAndVisibility$default(Landroid/widget/TextView;Ljava/lang/CharSequence;IILjava/lang/Object;)V

    iget-object v0, p0, Lyq0$c;->b:Lwb2;

    iget-object v0, v0, Lwb2;->c:Landroid/widget/ImageView;

    const-string v2, "binding.mainImage"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, LIH1;->c()Z

    move-result p1

    invoke-static {v0, p1, v3, v4, v1}, Ltu6;->show$default(Landroid/view/View;ZIILjava/lang/Object;)V

    :cond_1
    return-void
.end method
