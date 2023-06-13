.class public final LvN1$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/viewpager/widget/ViewPager$i;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LvN1;-><init>(Lco/bird/android/core/mvp/BaseActivity;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0007\n\u0002\u0008\u0005*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J \u0010\n\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0008\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0002H\u0016J\u0010\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002H\u0016\u00a8\u0006\u000c"
    }
    d2 = {
        "vN1$a",
        "Landroidx/viewpager/widget/ViewPager$i;",
        "",
        "state",
        "",
        "onPageScrollStateChanged",
        "position",
        "",
        "positionOffset",
        "positionOffsetPixels",
        "onPageScrolled",
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
.field public final synthetic b:LvN1;

.field public final synthetic c:Lco/bird/android/core/mvp/BaseActivity;


# direct methods
.method public constructor <init>(LvN1;Lco/bird/android/core/mvp/BaseActivity;)V
    .locals 0

    iput-object p1, p0, LvN1$a;->b:LvN1;

    iput-object p2, p0, LvN1$a;->c:Lco/bird/android/core/mvp/BaseActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onPageScrollStateChanged(I)V
    .locals 0

    return-void
.end method

.method public onPageScrolled(IFI)V
    .locals 0

    return-void
.end method

.method public onPageSelected(I)V
    .locals 2

    iget-object v0, p0, LvN1$a;->b:LvN1;

    invoke-virtual {v0}, LvN1;->Pl()LKa6;

    move-result-object v0

    invoke-virtual {v0}, LKa6;->getCount()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    if-ne p1, v0, :cond_0

    iget-object p1, p0, LvN1$a;->b:LvN1;

    invoke-static {p1}, LvN1;->access$getNextButton$p(LvN1;)Landroid/widget/Button;

    move-result-object p1

    iget-object v0, p0, LvN1$a;->c:Lco/bird/android/core/mvp/BaseActivity;

    sget v1, Lnl4;->how_to_ride_ready_to_go:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_0

    :cond_0
    iget-object p1, p0, LvN1$a;->b:LvN1;

    invoke-static {p1}, LvN1;->access$getNextButton$p(LvN1;)Landroid/widget/Button;

    move-result-object p1

    iget-object v0, p0, LvN1$a;->c:Lco/bird/android/core/mvp/BaseActivity;

    sget v1, Lnl4;->general_next_button:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :goto_0
    return-void
.end method
