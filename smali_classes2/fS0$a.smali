.class public final LfS0$a;
.super Lw1;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LfS0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "a"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0008\u0008\u0086\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u000b\u001a\u00020\u0006\u0012\u0006\u0010\u0011\u001a\u00020\u000c\u00a2\u0006\u0004\u0008\u0018\u0010\u0019J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0017\u0010\u000b\u001a\u00020\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0007\u0010\u0008\u001a\u0004\u0008\t\u0010\nR\u0017\u0010\u0011\u001a\u00020\u000c8\u0006\u00a2\u0006\u000c\n\u0004\u0008\r\u0010\u000e\u001a\u0004\u0008\u000f\u0010\u0010R\u0014\u0010\u0015\u001a\u00020\u00128\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0013\u0010\u0014R\u0014\u0010\u0017\u001a\u00020\u00128\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0016\u0010\u0014\u00a8\u0006\u001a"
    }
    d2 = {
        "LfS0$a;",
        "Lw1;",
        "",
        "position",
        "",
        "bind",
        "Landroid/view/View;",
        "b",
        "Landroid/view/View;",
        "getView",
        "()Landroid/view/View;",
        "view",
        "LfS0;",
        "c",
        "LfS0;",
        "getAdapter",
        "()LfS0;",
        "adapter",
        "Landroid/widget/TextView;",
        "d",
        "Landroid/widget/TextView;",
        "title",
        "e",
        "description",
        "<init>",
        "(LfS0;Landroid/view/View;LfS0;)V",
        "app_birdRelease"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final b:Landroid/view/View;

.field public final c:LfS0;

.field public final d:Landroid/widget/TextView;

.field public final e:Landroid/widget/TextView;

.field public final synthetic f:LfS0;


# direct methods
.method public constructor <init>(LfS0;Landroid/view/View;LfS0;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/view/View;",
            "LfS0;",
            ")V"
        }
    .end annotation

    const-string v0, "view"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "adapter"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, LfS0$a;->f:LfS0;

    invoke-direct {p0, p2}, Lw1;-><init>(Landroid/view/View;)V

    iput-object p2, p0, LfS0$a;->b:Landroid/view/View;

    iput-object p3, p0, LfS0$a;->c:LfS0;

    sget p1, LVg4;->title:I

    invoke-static {p2, p1}, Ltu6;->h(Landroid/view/View;I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, LfS0$a;->d:Landroid/widget/TextView;

    sget p1, LVg4;->description:I

    invoke-static {p2, p1}, Ltu6;->h(Landroid/view/View;I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, LfS0$a;->e:Landroid/widget/TextView;

    return-void
.end method


# virtual methods
.method public bind(I)V
    .locals 2

    iget-object v0, p0, LfS0$a;->c:LfS0;

    invoke-virtual {v0, p1}, Lct4;->q(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lco/bird/android/model/BirdProblem;

    iget-object v0, p0, LfS0$a;->d:Landroid/widget/TextView;

    invoke-virtual {p1}, Lco/bird/android/model/BirdProblem;->getTitle()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v0, p0, LfS0$a;->e:Landroid/widget/TextView;

    invoke-virtual {p1}, Lco/bird/android/model/BirdProblem;->getDescription()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method
