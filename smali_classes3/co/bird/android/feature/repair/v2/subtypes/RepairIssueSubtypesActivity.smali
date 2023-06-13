.class public final Lco/bird/android/feature/repair/v2/subtypes/RepairIssueSubtypesActivity;
.super Lco/bird/android/core/mvp/BaseActivity;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lco/bird/android/feature/repair/v2/subtypes/RepairIssueSubtypesActivity$a;,
        Lco/bird/android/feature/repair/v2/subtypes/RepairIssueSubtypesActivity$b;,
        Lco/bird/android/feature/repair/v2/subtypes/RepairIssueSubtypesActivity$c;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\n\u0018\u0000 \u001a2\u00020\u0001:\u0003\u001b\u001c\u001dB\u0007\u00a2\u0006\u0004\u0008\u0018\u0010\u0019J\u0012\u0010\u0005\u001a\u00020\u00042\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014J\"\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0008\u001a\u00020\u00062\u0008\u0010\n\u001a\u0004\u0018\u00010\tH\u0014R\"\u0010\u0013\u001a\u00020\u000c8\u0006@\u0006X\u0087.\u00a2\u0006\u0012\n\u0004\u0008\r\u0010\u000e\u001a\u0004\u0008\u000f\u0010\u0010\"\u0004\u0008\u0011\u0010\u0012R\u0016\u0010\u0017\u001a\u00020\u00148\u0002@\u0002X\u0082.\u00a2\u0006\u0006\n\u0004\u0008\u0015\u0010\u0016\u00a8\u0006\u001e"
    }
    d2 = {
        "Lco/bird/android/feature/repair/v2/subtypes/RepairIssueSubtypesActivity;",
        "Lco/bird/android/core/mvp/BaseActivity;",
        "Landroid/os/Bundle;",
        "savedInstanceState",
        "",
        "onCreate",
        "",
        "requestCode",
        "resultCode",
        "Landroid/content/Intent;",
        "data",
        "onActivityResult",
        "LYy4;",
        "B",
        "LYy4;",
        "j0",
        "()LYy4;",
        "setPresenter",
        "(LYy4;)V",
        "presenter",
        "LNy4;",
        "C",
        "LNy4;",
        "component",
        "<init>",
        "()V",
        "D",
        "a",
        "b",
        "c",
        "repair_release"
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
        "SMAP\nRepairIssueSubtypesActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RepairIssueSubtypesActivity.kt\nco/bird/android/feature/repair/v2/subtypes/RepairIssueSubtypesActivity\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/android/lifecycle/KotlinExtensionsKt\n*L\n1#1,136:1\n44#2:137\n*S KotlinDebug\n*F\n+ 1 RepairIssueSubtypesActivity.kt\nco/bird/android/feature/repair/v2/subtypes/RepairIssueSubtypesActivity\n*L\n58#1:137\n*E\n"
    }
.end annotation


# static fields
.field public static final D:Lco/bird/android/feature/repair/v2/subtypes/RepairIssueSubtypesActivity$a;


# instance fields
.field public B:LYy4;

.field public C:LNy4;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lco/bird/android/feature/repair/v2/subtypes/RepairIssueSubtypesActivity$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lco/bird/android/feature/repair/v2/subtypes/RepairIssueSubtypesActivity$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lco/bird/android/feature/repair/v2/subtypes/RepairIssueSubtypesActivity;->D:Lco/bird/android/feature/repair/v2/subtypes/RepairIssueSubtypesActivity$a;

    return-void
.end method

.method public constructor <init>()V
    .locals 6

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x7

    const/4 v5, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v5}, Lco/bird/android/core/mvp/BaseActivity;-><init>(ZLjava/lang/Integer;Ljava/lang/Boolean;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method


# virtual methods
.method public final j0()LYy4;
    .locals 1

    iget-object v0, p0, Lco/bird/android/feature/repair/v2/subtypes/RepairIssueSubtypesActivity;->B:LYy4;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "presenter"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public onActivityResult(IILandroid/content/Intent;)V
    .locals 2

    invoke-super {p0, p1, p2, p3}, Lco/bird/android/core/base/BaseCoreActivity;->onActivityResult(IILandroid/content/Intent;)V

    const/16 v0, 0x2712

    const/4 v1, -0x1

    if-eq p1, v0, :cond_1

    const/16 p3, 0x272b

    if-eq p1, p3, :cond_0

    goto :goto_0

    :cond_0
    if-ne p2, v1, :cond_4

    invoke-virtual {p0}, Lco/bird/android/core/mvp/BaseActivity;->w()Le13;

    move-result-object p1

    invoke-interface {p1, v1}, Le13;->b1(I)V

    goto :goto_0

    :cond_1
    if-ne p2, v1, :cond_4

    if-eqz p3, :cond_4

    const-string p1, "repair_types"

    invoke-virtual {p3, p1}, Landroid/content/Intent;->getParcelableExtra(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object p1

    check-cast p1, Lco/bird/android/model/RepairType;

    if-nez p1, :cond_2

    goto :goto_0

    :cond_2
    const-string p2, "part"

    invoke-virtual {p3, p2}, Landroid/content/Intent;->getParcelableExtra(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object p2

    check-cast p2, Lco/bird/android/model/wire/WirePart;

    if-nez p2, :cond_3

    return-void

    :cond_3
    invoke-virtual {p0}, Lco/bird/android/feature/repair/v2/subtypes/RepairIssueSubtypesActivity;->j0()LYy4;

    move-result-object p3

    invoke-interface {p3, p1, p2}, LYy4;->b(Lco/bird/android/model/RepairType;Lco/bird/android/model/wire/WirePart;)V

    nop

    :cond_4
    :goto_0
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 11

    invoke-super {p0, p1}, Lco/bird/android/core/mvp/BaseActivity;->onCreate(Landroid/os/Bundle;)V

    sget v0, LEj4;->activity_repair_v2_subtypes:I

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->setContentView(I)V

    sget-object v0, LPy4;->b:LPy4;

    invoke-virtual {p0}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    move-result-object v1

    const-string v2, "application"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v3, 0x2

    const/4 v4, 0x0

    invoke-static {v0, v1, v4, v3, v4}, LAk1;->component$default(LAk1;Landroid/app/Application;Ljava/util/Map;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LNy4;

    iput-object v0, p0, Lco/bird/android/feature/repair/v2/subtypes/RepairIssueSubtypesActivity;->C:LNy4;

    invoke-static {}, Lco/bird/android/feature/repair/v2/subtypes/a;->a()Lco/bird/android/feature/repair/v2/subtypes/RepairIssueSubtypesActivity$b$a;

    move-result-object v0

    sget-object v1, LoG2;->a:LoG2;

    invoke-virtual {p0}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    move-result-object v3

    invoke-static {v3, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1, v3}, LoG2;->a(Landroid/content/Context;)LlG2;

    move-result-object v1

    iget-object v2, p0, Lco/bird/android/feature/repair/v2/subtypes/RepairIssueSubtypesActivity;->C:LNy4;

    if-nez v2, :cond_0

    const-string v2, "component"

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v2, v4

    :cond_0
    invoke-static {p0}, Lcom/uber/autodispose/android/lifecycle/AndroidLifecycleScopeProvider;->b(LLifecycleOwner;)Lcom/uber/autodispose/android/lifecycle/AndroidLifecycleScopeProvider;

    move-result-object v4

    const-string v3, "AndroidLifecycleScopeProvider.from(this)"

    invoke-static {v4, v3}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    sget v3, LRh4;->supertype:I

    invoke-virtual {p0, v3}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object v3

    const-string v5, "findViewById(R.id.supertype)"

    invoke-static {v3, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v5, v3

    check-cast v5, Landroid/widget/TextView;

    sget v3, LRh4;->repairsNeeded:I

    invoke-virtual {p0, v3}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object v3

    const-string v6, "findViewById(R.id.repairsNeeded)"

    invoke-static {v3, v6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v6, v3

    check-cast v6, Landroid/widget/TextView;

    sget v3, LRh4;->asset:I

    invoke-virtual {p0, v3}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object v3

    const-string v7, "findViewById(R.id.asset)"

    invoke-static {v3, v7}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v7, v3

    check-cast v7, Landroid/widget/ImageView;

    sget v3, LRh4;->logRepairs:I

    invoke-virtual {p0, v3}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object v3

    const-string v8, "findViewById(R.id.logRepairs)"

    invoke-static {v3, v8}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v8, v3

    check-cast v8, Landroid/widget/Button;

    sget v3, LRh4;->reroute:I

    invoke-virtual {p0, v3}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object v3

    const-string v9, "findViewById(R.id.reroute)"

    invoke-static {v3, v9}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v9, v3

    check-cast v9, Landroid/widget/Button;

    sget v3, LRh4;->recyclerView:I

    invoke-virtual {p0, v3}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object v3

    const-string v10, "findViewById(R.id.recyclerView)"

    invoke-static {v3, v10}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v10, v3

    check-cast v10, Landroidx/recyclerview/widget/RecyclerView;

    move-object v3, p0

    invoke-interface/range {v0 .. v10}, Lco/bird/android/feature/repair/v2/subtypes/RepairIssueSubtypesActivity$b$a;->a(LlG2;LNy4;Lco/bird/android/core/mvp/BaseActivity;Lcom/uber/autodispose/ScopeProvider;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/ImageView;Landroid/widget/Button;Landroid/widget/Button;Landroidx/recyclerview/widget/RecyclerView;)Lco/bird/android/feature/repair/v2/subtypes/RepairIssueSubtypesActivity$b;

    move-result-object v0

    invoke-interface {v0, p0}, Lco/bird/android/feature/repair/v2/subtypes/RepairIssueSubtypesActivity$b;->a(Lco/bird/android/feature/repair/v2/subtypes/RepairIssueSubtypesActivity;)V

    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const-string v1, "bird"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->getParcelableExtra(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lco/bird/android/model/wire/WireBird;

    if-nez v0, :cond_1

    return-void

    :cond_1
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v1

    const-string v2, "issue"

    invoke-virtual {v1, v2}, Landroid/content/Intent;->getParcelableExtra(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v1

    check-cast v1, Lco/bird/android/model/Issue;

    if-nez v1, :cond_2

    return-void

    :cond_2
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v2

    const-string v3, "previously_selected_repairs"

    invoke-virtual {v2, v3}, Landroid/content/Intent;->getParcelableArrayListExtra(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v2

    if-nez v2, :cond_3

    return-void

    :cond_3
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v3

    const-string v4, "repair_types"

    invoke-virtual {v3, v4}, Landroid/content/Intent;->getParcelableArrayListExtra(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v3

    if-nez v3, :cond_4

    return-void

    :cond_4
    invoke-virtual {p0}, Lco/bird/android/feature/repair/v2/subtypes/RepairIssueSubtypesActivity;->j0()LYy4;

    move-result-object v4

    invoke-interface {v4, v0, v1, v2, v3}, LYy4;->a(Lco/bird/android/model/wire/WireBird;Lco/bird/android/model/Issue;Ljava/util/List;Ljava/util/List;)V

    return-void
.end method
