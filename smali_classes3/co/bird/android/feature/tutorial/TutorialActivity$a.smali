.class public final Lco/bird/android/feature/tutorial/TutorialActivity$a;
.super Landroidx/viewpager2/widget/ViewPager2$i;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lco/bird/android/feature/tutorial/TutorialActivity;->onCreate(Landroid/os/Bundle;)V
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
        "co/bird/android/feature/tutorial/TutorialActivity$a",
        "Landroidx/viewpager2/widget/ViewPager2$i;",
        "",
        "position",
        "",
        "c",
        "co.bird.android.feature.tutorial"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic a:Lco/bird/android/feature/tutorial/TutorialActivity;


# direct methods
.method public constructor <init>(Lco/bird/android/feature/tutorial/TutorialActivity;)V
    .locals 0

    iput-object p1, p0, Lco/bird/android/feature/tutorial/TutorialActivity$a;->a:Lco/bird/android/feature/tutorial/TutorialActivity;

    invoke-direct {p0}, Landroidx/viewpager2/widget/ViewPager2$i;-><init>()V

    return-void
.end method


# virtual methods
.method public c(I)V
    .locals 2

    iget-object v0, p0, Lco/bird/android/feature/tutorial/TutorialActivity$a;->a:Lco/bird/android/feature/tutorial/TutorialActivity;

    invoke-static {v0}, Lco/bird/android/feature/tutorial/TutorialActivity;->access$getBinding$p(Lco/bird/android/feature/tutorial/TutorialActivity;)Lo6;

    move-result-object v0

    if-nez v0, :cond_0

    const-string v0, "binding"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v0, 0x0

    :cond_0
    iget-object v0, v0, Lo6;->c:Landroid/widget/Button;

    iget-object v1, p0, Lco/bird/android/feature/tutorial/TutorialActivity$a;->a:Lco/bird/android/feature/tutorial/TutorialActivity;

    invoke-static {v1}, Lco/bird/android/feature/tutorial/TutorialActivity;->access$getAdapter$p(Lco/bird/android/feature/tutorial/TutorialActivity;)LDa6;

    move-result-object v1

    invoke-virtual {v1, p1}, LDa6;->p(I)Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_1

    goto :goto_1

    :cond_1
    iget-object v1, p0, Lco/bird/android/feature/tutorial/TutorialActivity$a;->a:Lco/bird/android/feature/tutorial/TutorialActivity;

    invoke-static {v1}, Lco/bird/android/feature/tutorial/TutorialActivity;->access$getAdapter$p(Lco/bird/android/feature/tutorial/TutorialActivity;)LDa6;

    move-result-object v1

    invoke-virtual {v1}, LDa6;->getItemCount()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    if-ne p1, v1, :cond_2

    iget-object p1, p0, Lco/bird/android/feature/tutorial/TutorialActivity$a;->a:Lco/bird/android/feature/tutorial/TutorialActivity;

    sget v1, Lnl4;->general_done:I

    invoke-virtual {p1, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :cond_2
    iget-object p1, p0, Lco/bird/android/feature/tutorial/TutorialActivity$a;->a:Lco/bird/android/feature/tutorial/TutorialActivity;

    sget v1, Lnl4;->general_next_button:I

    invoke-virtual {p1, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p1

    :goto_0
    move-object v1, p1

    :goto_1
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method
