.class public final Lco/bird/android/feature/birdratinghistory/BirdRatingHistoryActivity;
.super Lco/bird/android/core/mrp/BaseActivityLite;
.source "SourceFile"

# interfaces
.implements LKR;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0018\u00002\u00020\u00012\u00020\u0002B\u0007\u00a2\u0006\u0004\u0008\u001e\u0010\u001fJ\u0012\u0010\u0006\u001a\u00020\u00052\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0014J\u0010\u0010\t\u001a\u00020\u00052\u0006\u0010\u0008\u001a\u00020\u0007H\u0016R\"\u0010\u0011\u001a\u00020\n8\u0006@\u0006X\u0087.\u00a2\u0006\u0012\n\u0004\u0008\u000b\u0010\u000c\u001a\u0004\u0008\r\u0010\u000e\"\u0004\u0008\u000f\u0010\u0010R\"\u0010\u0019\u001a\u00020\u00128\u0006@\u0006X\u0087.\u00a2\u0006\u0012\n\u0004\u0008\u0013\u0010\u0014\u001a\u0004\u0008\u0015\u0010\u0016\"\u0004\u0008\u0017\u0010\u0018R\u0016\u0010\u001d\u001a\u00020\u001a8\u0002@\u0002X\u0082.\u00a2\u0006\u0006\n\u0004\u0008\u001b\u0010\u001c\u00a8\u0006 "
    }
    d2 = {
        "Lco/bird/android/feature/birdratinghistory/BirdRatingHistoryActivity;",
        "Lco/bird/android/core/mrp/BaseActivityLite;",
        "LKR;",
        "Landroid/os/Bundle;",
        "savedInstanceState",
        "",
        "onCreate",
        "LQR;",
        "state",
        "R",
        "LJR;",
        "j",
        "LJR;",
        "Q",
        "()LJR;",
        "setPresenter",
        "(LJR;)V",
        "presenter",
        "LxR;",
        "k",
        "LxR;",
        "P",
        "()LxR;",
        "setAdapter",
        "(LxR;)V",
        "adapter",
        "Ld3;",
        "l",
        "Ld3;",
        "binding",
        "<init>",
        "()V",
        "co.bird.android.feature.bird-rating-history"
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
        "SMAP\nBirdRatingHistoryActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BirdRatingHistoryActivity.kt\nco/bird/android/feature/birdratinghistory/BirdRatingHistoryActivity\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,45:1\n1#2:46\n*E\n"
    }
.end annotation


# instance fields
.field public j:LJR;

.field public k:LxR;

.field public l:Ld3;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lco/bird/android/core/mrp/BaseActivityLite;-><init>()V

    return-void
.end method


# virtual methods
.method public final P()LxR;
    .locals 1

    iget-object v0, p0, Lco/bird/android/feature/birdratinghistory/BirdRatingHistoryActivity;->k:LxR;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "adapter"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public final Q()LJR;
    .locals 1

    iget-object v0, p0, Lco/bird/android/feature/birdratinghistory/BirdRatingHistoryActivity;->j:LJR;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "presenter"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public R(LQR;)V
    .locals 4

    const-string v0, "state"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, LA22;

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lco/bird/android/feature/birdratinghistory/BirdRatingHistoryActivity;->P()LxR;

    move-result-object v0

    check-cast p1, LA22;

    invoke-virtual {p1}, LA22;->b()Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/util/Collection;

    invoke-virtual {v0, p1}, LMy;->u(Ljava/util/Collection;)V

    goto :goto_0

    :cond_0
    instance-of v0, p1, LCt2;

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Lco/bird/android/core/mrp/BaseActivityLite;->F()Lsx4;

    move-result-object v0

    check-cast p1, LCt2;

    invoke-virtual {p1}, LCt2;->a()Z

    move-result p1

    const/4 v2, 0x0

    const/4 v3, 0x2

    invoke-static {v0, p1, v2, v3, v1}, LS74$a;->showProgress$default(LS74;ZIILjava/lang/Object;)V

    goto :goto_0

    :cond_1
    instance-of v0, p1, Lcg1;

    if-eqz v0, :cond_3

    check-cast p1, Lcg1;

    invoke-virtual {p1}, Lcg1;->a()Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_2

    invoke-virtual {p0}, Lco/bird/android/core/mrp/BaseActivityLite;->F()Lsx4;

    move-result-object v0

    invoke-virtual {v0, p1}, LXC;->error(Ljava/lang/String;)V

    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    :cond_2
    if-nez v1, :cond_3

    invoke-virtual {p0}, Lco/bird/android/core/mrp/BaseActivityLite;->F()Lsx4;

    move-result-object p1

    invoke-virtual {p1}, LXC;->errorGeneric()V

    :cond_3
    :goto_0
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 3

    invoke-super {p0, p1}, Lco/bird/android/core/mrp/BaseActivityLite;->onCreate(Landroid/os/Bundle;)V

    invoke-static {}, Lco/bird/android/feature/birdratinghistory/b;->a()Lco/bird/android/feature/birdratinghistory/a$a;

    move-result-object p1

    invoke-virtual {p0}, Lco/bird/android/core/mrp/BaseActivityLite;->H()LlG2;

    move-result-object v0

    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v1

    const-string v2, "bird_id"

    invoke-virtual {v1, v2}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_0

    return-void

    :cond_0
    invoke-interface {p1, v0, p0, v1}, Lco/bird/android/feature/birdratinghistory/a$a;->a(LlG2;Landroid/app/Activity;Ljava/lang/String;)Lco/bird/android/feature/birdratinghistory/a;

    move-result-object p1

    invoke-interface {p1, p0}, Lco/bird/android/feature/birdratinghistory/a;->a(Lco/bird/android/feature/birdratinghistory/BirdRatingHistoryActivity;)V

    invoke-virtual {p0}, Landroid/app/Activity;->getLayoutInflater()Landroid/view/LayoutInflater;

    move-result-object p1

    invoke-static {p1}, Ld3;->c(Landroid/view/LayoutInflater;)Ld3;

    move-result-object p1

    const-string v0, "inflate(layoutInflater)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lco/bird/android/feature/birdratinghistory/BirdRatingHistoryActivity;->l:Ld3;

    const/4 v0, 0x0

    const-string v1, "binding"

    if-nez p1, :cond_1

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object p1, v0

    :cond_1
    invoke-virtual {p1}, Ld3;->b()Landroidx/recyclerview/widget/RecyclerView;

    move-result-object p1

    invoke-virtual {p0, p1}, Landroidx/appcompat/app/AppCompatActivity;->setContentView(Landroid/view/View;)V

    iget-object p1, p0, Lco/bird/android/feature/birdratinghistory/BirdRatingHistoryActivity;->l:Ld3;

    if-nez p1, :cond_2

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    goto :goto_0

    :cond_2
    move-object v0, p1

    :goto_0
    iget-object p1, v0, Ld3;->b:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {p0}, Lco/bird/android/feature/birdratinghistory/BirdRatingHistoryActivity;->P()LxR;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$h;)V

    invoke-virtual {p0}, Lco/bird/android/feature/birdratinghistory/BirdRatingHistoryActivity;->Q()LJR;

    move-result-object p1

    invoke-virtual {p1, p0}, LJR;->r(LKR;)V

    return-void
.end method

.method public bridge synthetic render(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, LQR;

    invoke-virtual {p0, p1}, Lco/bird/android/feature/birdratinghistory/BirdRatingHistoryActivity;->R(LQR;)V

    return-void
.end method
