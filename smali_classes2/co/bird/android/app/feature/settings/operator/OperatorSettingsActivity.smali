.class public final Lco/bird/android/app/feature/settings/operator/OperatorSettingsActivity;
.super Lco/bird/android/core/mrp/BaseActivityLite;
.source "SourceFile"

# interfaces
.implements Lwt3;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007\u00a2\u0006\u0004\u0008!\u0010\"J\u0012\u0010\u0006\u001a\u00020\u00052\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0014J\u0012\u0010\t\u001a\u000c\u0012\u0008\u0012\u0006\u0012\u0002\u0008\u00030\u00080\u0007H\u0016J\u0010\u0010\u000c\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\nH\u0016R\"\u0010\u0014\u001a\u00020\r8\u0006@\u0006X\u0087.\u00a2\u0006\u0012\n\u0004\u0008\u000e\u0010\u000f\u001a\u0004\u0008\u0010\u0010\u0011\"\u0004\u0008\u0012\u0010\u0013R\"\u0010\u001c\u001a\u00020\u00158\u0006@\u0006X\u0087.\u00a2\u0006\u0012\n\u0004\u0008\u0016\u0010\u0017\u001a\u0004\u0008\u0018\u0010\u0019\"\u0004\u0008\u001a\u0010\u001bR\u0014\u0010 \u001a\u00020\u001d8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001e\u0010\u001f\u00a8\u0006#"
    }
    d2 = {
        "Lco/bird/android/app/feature/settings/operator/OperatorSettingsActivity;",
        "Lco/bird/android/core/mrp/BaseActivityLite;",
        "Lwt3;",
        "Landroid/os/Bundle;",
        "savedInstanceState",
        "",
        "onCreate",
        "Lio/reactivex/Observable;",
        "LRa6;",
        "I0",
        "Lxt3;",
        "state",
        "R",
        "Lvt3;",
        "j",
        "Lvt3;",
        "Q",
        "()Lvt3;",
        "setPresenter",
        "(Lvt3;)V",
        "presenter",
        "Lpt3;",
        "k",
        "Lpt3;",
        "P",
        "()Lpt3;",
        "setConverter",
        "(Lpt3;)V",
        "converter",
        "Lot3;",
        "l",
        "Lot3;",
        "adapter",
        "<init>",
        "()V",
        "app_birdRelease"
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
        "SMAP\nOperatorSettingsActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OperatorSettingsActivity.kt\nco/bird/android/app/feature/settings/operator/OperatorSettingsActivity\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,73:1\n1#2:74\n*E\n"
    }
.end annotation


# instance fields
.field public j:Lvt3;

.field public k:Lpt3;

.field public final l:Lot3;


# direct methods
.method public static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lco/bird/android/core/mrp/BaseActivityLite;-><init>()V

    new-instance v0, Lot3;

    invoke-direct {v0}, Lot3;-><init>()V

    iput-object v0, p0, Lco/bird/android/app/feature/settings/operator/OperatorSettingsActivity;->l:Lot3;

    return-void
.end method


# virtual methods
.method public I0()Lio/reactivex/Observable;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "LRa6<",
            "*>;>;"
        }
    .end annotation

    iget-object v0, p0, Lco/bird/android/app/feature/settings/operator/OperatorSettingsActivity;->l:Lot3;

    invoke-virtual {v0}, Lot3;->I0()Lio/reactivex/Observable;

    move-result-object v0

    return-object v0
.end method

.method public final P()Lpt3;
    .locals 1

    iget-object v0, p0, Lco/bird/android/app/feature/settings/operator/OperatorSettingsActivity;->k:Lpt3;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "converter"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public final Q()Lvt3;
    .locals 1

    iget-object v0, p0, Lco/bird/android/app/feature/settings/operator/OperatorSettingsActivity;->j:Lvt3;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "presenter"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public R(Lxt3;)V
    .locals 1

    const-string v0, "state"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, LqY3;

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lco/bird/android/app/feature/settings/operator/OperatorSettingsActivity;->P()Lpt3;

    move-result-object v0

    check-cast p1, LqY3;

    invoke-virtual {p1}, LqY3;->b()Ljava/util/List;

    move-result-object p1

    invoke-virtual {v0, p1}, Lpt3;->a(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    iget-object v0, p0, Lco/bird/android/app/feature/settings/operator/OperatorSettingsActivity;->l:Lot3;

    check-cast p1, Ljava/util/Collection;

    invoke-virtual {v0, p1}, LMy;->u(Ljava/util/Collection;)V

    :cond_0
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 4

    invoke-super {p0, p1}, Lco/bird/android/core/mrp/BaseActivityLite;->onCreate(Landroid/os/Bundle;)V

    invoke-virtual {p0}, Landroid/app/Activity;->getLayoutInflater()Landroid/view/LayoutInflater;

    move-result-object p1

    invoke-static {p1}, LA4;->c(Landroid/view/LayoutInflater;)LA4;

    move-result-object p1

    const-string v0, "inflate(layoutInflater)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, LA4;->b()Landroidx/recyclerview/widget/RecyclerView;

    move-result-object v0

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->setContentView(Landroid/view/View;)V

    invoke-static {}, Lco/bird/android/app/feature/settings/operator/a;->a()Lco/bird/android/app/feature/settings/operator/b$a;

    move-result-object v0

    sget-object v1, LoG2;->a:LoG2;

    invoke-virtual {p0}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    move-result-object v2

    const-string v3, "application"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1, v2}, LoG2;->a(Landroid/content/Context;)LlG2;

    move-result-object v1

    invoke-interface {v0, v1}, Lco/bird/android/app/feature/settings/operator/b$a;->a(LlG2;)Lco/bird/android/app/feature/settings/operator/b;

    move-result-object v0

    invoke-interface {v0, p0}, Lco/bird/android/app/feature/settings/operator/b;->a(Lco/bird/android/app/feature/settings/operator/OperatorSettingsActivity;)V

    invoke-virtual {p0}, Lco/bird/android/app/feature/settings/operator/OperatorSettingsActivity;->Q()Lvt3;

    move-result-object v0

    invoke-virtual {v0, p0}, Lvt3;->r(Lwt3;)V

    iget-object p1, p1, LA4;->b:Landroidx/recyclerview/widget/RecyclerView;

    new-instance v0, Landroidx/recyclerview/widget/LinearLayoutManager;

    invoke-direct {v0, p0}, Landroidx/recyclerview/widget/LinearLayoutManager;-><init>(Landroid/content/Context;)V

    invoke-virtual {p1, v0}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/RecyclerView$p;)V

    new-instance v0, Landroidx/recyclerview/widget/g;

    invoke-direct {v0}, Landroidx/recyclerview/widget/g;-><init>()V

    invoke-virtual {p1, v0}, Landroidx/recyclerview/widget/RecyclerView;->setItemAnimator(Landroidx/recyclerview/widget/RecyclerView$m;)V

    iget-object v0, p0, Lco/bird/android/app/feature/settings/operator/OperatorSettingsActivity;->l:Lot3;

    invoke-virtual {p1, v0}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$h;)V

    return-void
.end method

.method public bridge synthetic render(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lxt3;

    invoke-virtual {p0, p1}, Lco/bird/android/app/feature/settings/operator/OperatorSettingsActivity;->R(Lxt3;)V

    return-void
.end method
