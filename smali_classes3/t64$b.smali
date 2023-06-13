.class public final Lt64$b;
.super Lf86$g;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lt64;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "b"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0082\u0004\u0018\u00002\u00060\u0001R\u00020\u0002B\u000f\u0012\u0006\u0010\u0008\u001a\u00020\u0007\u00a2\u0006\u0004\u0008\t\u0010\nJ\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016\u00a8\u0006\u000b"
    }
    d2 = {
        "Lt64$b;",
        "Lf86$g;",
        "Lf86;",
        "",
        "position",
        "",
        "bind",
        "Landroid/view/View;",
        "view",
        "<init>",
        "(Lt64;Landroid/view/View;)V",
        "co.bird.android.feature.transfer-order"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic d:Lt64;


# direct methods
.method public constructor <init>(Lt64;Landroid/view/View;)V
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

    iput-object p1, p0, Lt64$b;->d:Lt64;

    invoke-direct {p0, p1, p2}, Lf86$g;-><init>(Lf86;Landroid/view/View;)V

    return-void
.end method


# virtual methods
.method public bind(I)V
    .locals 2

    invoke-super {p0, p1}, Lf86$g;->bind(I)V

    invoke-virtual {p0}, Lf86$g;->a()LBb2;

    move-result-object p1

    iget-object p1, p1, LBb2;->f:Landroid/widget/TextView;

    const-string v0, "binding.viewAction"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    const/4 v1, 0x4

    invoke-static {p1, v0, v1}, Ltu6;->s(Landroid/view/View;ZI)V

    return-void
.end method
