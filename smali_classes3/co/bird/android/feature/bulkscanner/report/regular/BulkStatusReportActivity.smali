.class public final Lco/bird/android/feature/bulkscanner/report/regular/BulkStatusReportActivity;
.super Lco/bird/android/core/mvp/BaseActivity;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lco/bird/android/feature/bulkscanner/report/regular/BulkStatusReportActivity$a;,
        Lco/bird/android/feature/bulkscanner/report/regular/BulkStatusReportActivity$b;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u000c\u0018\u00002\u00020\u0001:\u0002!\"B\u0007\u00a2\u0006\u0004\u0008\u001f\u0010 J\u0012\u0010\u0005\u001a\u00020\u00042\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014J\u0008\u0010\u0006\u001a\u00020\u0004H\u0016R\"\u0010\u000e\u001a\u00020\u00078\u0006@\u0006X\u0087.\u00a2\u0006\u0012\n\u0004\u0008\u0008\u0010\t\u001a\u0004\u0008\n\u0010\u000b\"\u0004\u0008\u000c\u0010\rR\"\u0010\u0016\u001a\u00020\u000f8\u0006@\u0006X\u0087.\u00a2\u0006\u0012\n\u0004\u0008\u0010\u0010\u0011\u001a\u0004\u0008\u0012\u0010\u0013\"\u0004\u0008\u0014\u0010\u0015R\"\u0010\u001e\u001a\u00020\u00178\u0006@\u0006X\u0087.\u00a2\u0006\u0012\n\u0004\u0008\u0018\u0010\u0019\u001a\u0004\u0008\u001a\u0010\u001b\"\u0004\u0008\u001c\u0010\u001d\u00a8\u0006#"
    }
    d2 = {
        "Lco/bird/android/feature/bulkscanner/report/regular/BulkStatusReportActivity;",
        "Lco/bird/android/core/mvp/BaseActivity;",
        "Landroid/os/Bundle;",
        "savedInstanceState",
        "",
        "onCreate",
        "onBackPressed",
        "Ln60;",
        "B",
        "Ln60;",
        "k0",
        "()Ln60;",
        "setPresenter",
        "(Ln60;)V",
        "presenter",
        "Luk1;",
        "C",
        "Luk1;",
        "j0",
        "()Luk1;",
        "setAnnouncementPresenterFactory",
        "(Luk1;)V",
        "announcementPresenterFactory",
        "LRh6;",
        "D",
        "LRh6;",
        "m0",
        "()LRh6;",
        "setUserStream",
        "(LRh6;)V",
        "userStream",
        "<init>",
        "()V",
        "a",
        "b",
        "bulk-scanner_release"
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
        "SMAP\nBulkStatusReportActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BulkStatusReportActivity.kt\nco/bird/android/feature/bulkscanner/report/regular/BulkStatusReportActivity\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/android/lifecycle/KotlinExtensionsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,92:1\n44#2:93\n1549#3:94\n1620#3,3:95\n*S KotlinDebug\n*F\n+ 1 BulkStatusReportActivity.kt\nco/bird/android/feature/bulkscanner/report/regular/BulkStatusReportActivity\n*L\n41#1:93\n53#1:94\n53#1:95,3\n*E\n"
    }
.end annotation


# instance fields
.field public B:Ln60;

.field public C:Luk1;

.field public D:LRh6;


# direct methods
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
.method public final j0()Luk1;
    .locals 1

    iget-object v0, p0, Lco/bird/android/feature/bulkscanner/report/regular/BulkStatusReportActivity;->C:Luk1;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "announcementPresenterFactory"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public final k0()Ln60;
    .locals 1

    iget-object v0, p0, Lco/bird/android/feature/bulkscanner/report/regular/BulkStatusReportActivity;->B:Ln60;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "presenter"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public final m0()LRh6;
    .locals 1

    iget-object v0, p0, Lco/bird/android/feature/bulkscanner/report/regular/BulkStatusReportActivity;->D:LRh6;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "userStream"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public onBackPressed()V
    .locals 1

    invoke-virtual {p0}, Lco/bird/android/core/mvp/BaseActivity;->w()Le13;

    move-result-object v0

    invoke-interface {v0}, Le13;->e3()V

    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 10

    invoke-super {p0, p1}, Lco/bird/android/core/mvp/BaseActivity;->onCreate(Landroid/os/Bundle;)V

    invoke-virtual {p0}, Landroid/app/Activity;->getLayoutInflater()Landroid/view/LayoutInflater;

    move-result-object p1

    invoke-static {p1}, Lf3;->c(Landroid/view/LayoutInflater;)Lf3;

    move-result-object v4

    const-string p1, "inflate(layoutInflater)"

    invoke-static {v4, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v4}, Lf3;->b()Landroidx/constraintlayout/widget/ConstraintLayout;

    move-result-object p1

    invoke-virtual {p0, p1}, Landroidx/appcompat/app/AppCompatActivity;->setContentView(Landroid/view/View;)V

    invoke-virtual {p0}, Lco/bird/android/core/mvp/BaseActivity;->D()V

    invoke-static {}, Lco/bird/android/feature/bulkscanner/report/regular/a;->a()Lco/bird/android/feature/bulkscanner/report/regular/BulkStatusReportActivity$b$a;

    move-result-object v0

    sget-object p1, LoG2;->a:LoG2;

    invoke-virtual {p0}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    move-result-object v1

    const-string v2, "application"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1, v1}, LoG2;->a(Landroid/content/Context;)LlG2;

    move-result-object v1

    invoke-static {p0}, Lcom/uber/autodispose/android/lifecycle/AndroidLifecycleScopeProvider;->b(LLifecycleOwner;)Lcom/uber/autodispose/android/lifecycle/AndroidLifecycleScopeProvider;

    move-result-object v3

    const-string p1, "AndroidLifecycleScopeProvider.from(this)"

    invoke-static {v3, p1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Landroidx/fragment/app/FragmentActivity;->getSupportFragmentManager()Landroidx/fragment/app/FragmentManager;

    move-result-object v5

    const-string p1, "supportFragmentManager"

    invoke-static {v5, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Landroidx/activity/ComponentActivity;->getLifecycle()Landroidx/lifecycle/f;

    move-result-object v6

    const-string p1, "lifecycle"

    invoke-static {v6, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v2, p0

    invoke-interface/range {v0 .. v6}, Lco/bird/android/feature/bulkscanner/report/regular/BulkStatusReportActivity$b$a;->a(LlG2;Lco/bird/android/core/mvp/BaseActivity;Lcom/uber/autodispose/ScopeProvider;Lf3;Landroidx/fragment/app/FragmentManager;Landroidx/lifecycle/f;)Lco/bird/android/feature/bulkscanner/report/regular/BulkStatusReportActivity$b;

    move-result-object p1

    invoke-interface {p1, p0}, Lco/bird/android/feature/bulkscanner/report/regular/BulkStatusReportActivity$b;->a(Lco/bird/android/feature/bulkscanner/report/regular/BulkStatusReportActivity;)V

    invoke-virtual {p0}, Lco/bird/android/feature/bulkscanner/report/regular/BulkStatusReportActivity;->k0()Ln60;

    move-result-object p1

    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const-string v1, "intent"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1, v0}, Ln60;->L(Landroid/content/Intent;)V

    invoke-virtual {p0}, Lco/bird/android/feature/bulkscanner/report/regular/BulkStatusReportActivity;->j0()Luk1;

    move-result-object p1

    sget-object v0, Lco/bird/android/model/constant/AnnouncementContext;->BULK_SCANNER_STATUS:Lco/bird/android/model/constant/AnnouncementContext;

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-virtual {p0}, Lco/bird/android/feature/bulkscanner/report/regular/BulkStatusReportActivity;->m0()LRh6;

    move-result-object v1

    invoke-interface {v1}, LRh6;->a()Lco/bird/android/model/User;

    move-result-object v1

    const/4 v8, 0x0

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Lco/bird/android/model/User;->getOperatorRoles()Ljava/util/List;

    move-result-object v1

    if-eqz v1, :cond_0

    check-cast v1, Ljava/lang/Iterable;

    new-instance v5, Ljava/util/ArrayList;

    const/16 v6, 0xa

    invoke-static {v1, v6}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v6

    invoke-direct {v5, v6}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lco/bird/android/model/OperatorRole;

    invoke-virtual {v6}, Lco/bird/android/model/OperatorRole;->getRole()Ljava/lang/String;

    move-result-object v6

    invoke-interface {v5, v6}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    move-object v5, v8

    :cond_1
    const/4 v6, 0x7

    const/4 v7, 0x0

    new-instance v9, Lgk1$h;

    move-object v1, v9

    invoke-direct/range {v1 .. v7}, Lgk1$h;-><init>(Ljava/lang/Float;Ljava/lang/Integer;Ljava/lang/String;Ljava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {p1, v8, v0, v9}, Luk1;->a(LZr1;Lco/bird/android/model/constant/AnnouncementContext;Lgk1$h;)Lgk1;

    return-void
.end method
