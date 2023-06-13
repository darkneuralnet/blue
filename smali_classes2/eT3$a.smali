.class public final LeT3$a;
.super Landroidx/viewpager/widget/ViewPager$l;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LeT3;->Je(Ljava/util/List;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016\u00a8\u0006\u0006"
    }
    d2 = {
        "eT3$a",
        "Landroidx/viewpager/widget/ViewPager$l;",
        "",
        "position",
        "",
        "onPageSelected",
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
.field public final synthetic b:LeT3;

.field public final synthetic c:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lco/bird/android/model/wire/WirePhysicalLockTutorialStep;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(LeT3;Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LeT3;",
            "Ljava/util/List<",
            "Lco/bird/android/model/wire/WirePhysicalLockTutorialStep;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, LeT3$a;->b:LeT3;

    iput-object p2, p0, LeT3$a;->c:Ljava/util/List;

    invoke-direct {p0}, Landroidx/viewpager/widget/ViewPager$l;-><init>()V

    return-void
.end method


# virtual methods
.method public onPageSelected(I)V
    .locals 2

    iget-object v0, p0, LeT3$a;->b:LeT3;

    invoke-static {v0}, LeT3;->access$getBinding$p(LeT3;)LUS3;

    move-result-object v0

    iget-object v0, v0, LUS3;->e:Lco/bird/android/app/feature/ridertutorial/widget/CircleIndicatorView;

    invoke-virtual {v0, p1}, Lco/bird/android/app/feature/ridertutorial/widget/CircleIndicatorView;->setSelectedIndex(I)V

    iget-object v0, p0, LeT3$a;->c:Ljava/util/List;

    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->getLastIndex(Ljava/util/List;)I

    move-result v0

    if-ne p1, v0, :cond_0

    sget p1, Lnl4;->physical_lock_tutorial_finish_button:I

    goto :goto_0

    :cond_0
    sget p1, Lnl4;->physical_lock_tutorial_continue_button:I

    :goto_0
    iget-object v0, p0, LeT3$a;->b:LeT3;

    invoke-static {v0}, LeT3;->access$getBinding$p(LeT3;)LUS3;

    move-result-object v0

    iget-object v0, v0, LUS3;->b:Landroid/widget/Button;

    iget-object v1, p0, LeT3$a;->b:LeT3;

    invoke-virtual {v1}, LxE;->getActivity()Lco/bird/android/core/mvp/BaseActivity;

    move-result-object v1

    invoke-virtual {v1, p1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method
