.class public final Lyq0$b;
.super Lw1;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lyq0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "b"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0008\u0010\tR\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0003\u0010\u0004\u00a8\u0006\n"
    }
    d2 = {
        "Lyq0$b;",
        "Lw1;",
        "LMa2;",
        "b",
        "LMa2;",
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


# instance fields
.field public final b:LMa2;

.field public final synthetic c:Lyq0;


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

    iput-object p1, p0, Lyq0$b;->c:Lyq0;

    invoke-direct {p0, p2}, Lw1;-><init>(Landroid/view/View;)V

    invoke-static {p2}, LMa2;->a(Landroid/view/View;)LMa2;

    move-result-object p2

    const-string v0, "bind(view)"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p2, p0, Lyq0$b;->b:LMa2;

    iget-object v0, p2, LMa2;->b:Lco/bird/android/widget/EditTextBox;

    new-instance v1, Lyq0$b$a;

    invoke-direct {v1, p1}, Lyq0$b$a;-><init>(Lyq0;)V

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->addTextChangedListener(Landroid/text/TextWatcher;)V

    iget-object p1, p2, LMa2;->b:Lco/bird/android/widget/EditTextBox;

    invoke-virtual {p0}, Lw1;->getContext()Landroid/content/Context;

    move-result-object p2

    sget v0, LHg4;->frame_rectangle_border_rounded_transparent:I

    invoke-static {p2, v0}, LNA0;->e(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    return-void
.end method
