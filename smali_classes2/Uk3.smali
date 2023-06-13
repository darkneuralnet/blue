.class public final LUk3;
.super LHA;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0007\u0018\u00002\u00020\u0001B1\u0008\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\u001e\u001a\u00020\u001d\u0012\u0006\u0010 \u001a\u00020\u001f\u0012\u0006\u0010\"\u001a\u00020!\u0012\u0006\u0010$\u001a\u00020#\u00a2\u0006\u0004\u0008%\u0010&R\u001a\u0010\u0007\u001a\u00020\u00028\u0014X\u0094\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010\u0004\u001a\u0004\u0008\u0005\u0010\u0006R\u001a\u0010\r\u001a\u00020\u00088\u0014X\u0094\u0004\u00a2\u0006\u000c\n\u0004\u0008\t\u0010\n\u001a\u0004\u0008\u000b\u0010\u000cR\u001a\u0010\u0013\u001a\u00020\u000e8\u0014X\u0094\u0004\u00a2\u0006\u000c\n\u0004\u0008\u000f\u0010\u0010\u001a\u0004\u0008\u0011\u0010\u0012R\u001a\u0010\u0019\u001a\u00020\u00148\u0014X\u0094\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0015\u0010\u0016\u001a\u0004\u0008\u0017\u0010\u0018R\u001a\u0010\u001c\u001a\u00020\u00148\u0014X\u0094\u0004\u00a2\u0006\u000c\n\u0004\u0008\u001a\u0010\u0016\u001a\u0004\u0008\u001b\u0010\u0018\u00a8\u0006\'"
    }
    d2 = {
        "LUk3;",
        "LHA;",
        "LTo2;",
        "j",
        "LTo2;",
        "Vl",
        "()LTo2;",
        "assetManager",
        "Landroid/view/ViewGroup;",
        "k",
        "Landroid/view/ViewGroup;",
        "Zl",
        "()Landroid/view/ViewGroup;",
        "bannerView",
        "Landroid/widget/ImageView;",
        "l",
        "Landroid/widget/ImageView;",
        "Wl",
        "()Landroid/widget/ImageView;",
        "bannerImage",
        "Landroid/widget/TextView;",
        "m",
        "Landroid/widget/TextView;",
        "Yl",
        "()Landroid/widget/TextView;",
        "bannerTitle",
        "n",
        "Xl",
        "bannerSubtitle",
        "Lco/bird/android/core/mvp/BaseActivity;",
        "activity",
        "LJf;",
        "adapter",
        "Lbg;",
        "converter",
        "LCt6;",
        "binding",
        "<init>",
        "(LTo2;Lco/bird/android/core/mvp/BaseActivity;LJf;Lbg;LCt6;)V",
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
.field public final j:LTo2;

.field public final k:Landroid/view/ViewGroup;

.field public final l:Landroid/widget/ImageView;

.field public final m:Landroid/widget/TextView;

.field public final n:Landroid/widget/TextView;


# direct methods
.method public static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(LTo2;Lco/bird/android/core/mvp/BaseActivity;LJf;Lbg;LCt6;)V
    .locals 1

    const-string v0, "assetManager"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "activity"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "adapter"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "converter"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "binding"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p2, p3, p4}, LHA;-><init>(Lco/bird/android/core/mvp/BaseActivity;LJf;Lbg;)V

    iput-object p1, p0, LUk3;->j:LTo2;

    invoke-virtual {p5}, LCt6;->b()Landroid/widget/RelativeLayout;

    move-result-object p1

    const-string p2, "binding.root"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, LUk3;->k:Landroid/view/ViewGroup;

    iget-object p1, p5, LCt6;->c:Landroid/widget/ImageView;

    const-string p2, "binding.bannerImage"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, LUk3;->l:Landroid/widget/ImageView;

    iget-object p1, p5, LCt6;->e:Landroid/widget/TextView;

    const-string p2, "binding.bannerTitle"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, LUk3;->m:Landroid/widget/TextView;

    iget-object p1, p5, LCt6;->d:Landroid/widget/TextView;

    const-string p2, "binding.bannerSubtitle"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, LUk3;->n:Landroid/widget/TextView;

    return-void
.end method


# virtual methods
.method public Vl()LTo2;
    .locals 1

    iget-object v0, p0, LUk3;->j:LTo2;

    return-object v0
.end method

.method public Wl()Landroid/widget/ImageView;
    .locals 1

    iget-object v0, p0, LUk3;->l:Landroid/widget/ImageView;

    return-object v0
.end method

.method public Xl()Landroid/widget/TextView;
    .locals 1

    iget-object v0, p0, LUk3;->n:Landroid/widget/TextView;

    return-object v0
.end method

.method public Yl()Landroid/widget/TextView;
    .locals 1

    iget-object v0, p0, LUk3;->m:Landroid/widget/TextView;

    return-object v0
.end method

.method public Zl()Landroid/view/ViewGroup;
    .locals 1

    iget-object v0, p0, LUk3;->k:Landroid/view/ViewGroup;

    return-object v0
.end method
