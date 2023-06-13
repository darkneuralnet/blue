.class public final Lco/bird/android/feature/bulkscanner/report/serviceprogress/BulkServiceCenterStatusReportActivity;
.super Lco/bird/android/core/mvp/BaseActivity;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lco/bird/android/feature/bulkscanner/report/serviceprogress/BulkServiceCenterStatusReportActivity$a;,
        Lco/bird/android/feature/bulkscanner/report/serviceprogress/BulkServiceCenterStatusReportActivity$b;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u000c\u0018\u00002\u00020\u0001:\u0002\u0010\u0011B\u0007\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u0012\u0010\u0005\u001a\u00020\u00042\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014R\"\u0010\r\u001a\u00020\u00068\u0006@\u0006X\u0087.\u00a2\u0006\u0012\n\u0004\u0008\u0007\u0010\u0008\u001a\u0004\u0008\t\u0010\n\"\u0004\u0008\u000b\u0010\u000c\u00a8\u0006\u0012"
    }
    d2 = {
        "Lco/bird/android/feature/bulkscanner/report/serviceprogress/BulkServiceCenterStatusReportActivity;",
        "Lco/bird/android/core/mvp/BaseActivity;",
        "Landroid/os/Bundle;",
        "savedInstanceState",
        "",
        "onCreate",
        "LM40;",
        "B",
        "LM40;",
        "j0",
        "()LM40;",
        "setPresenter",
        "(LM40;)V",
        "presenter",
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
        "SMAP\nBulkServiceCenterStatusReportActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BulkServiceCenterStatusReportActivity.kt\nco/bird/android/feature/bulkscanner/report/serviceprogress/BulkServiceCenterStatusReportActivity\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/android/lifecycle/KotlinExtensionsKt\n*L\n1#1,76:1\n44#2:77\n*S KotlinDebug\n*F\n+ 1 BulkServiceCenterStatusReportActivity.kt\nco/bird/android/feature/bulkscanner/report/serviceprogress/BulkServiceCenterStatusReportActivity\n*L\n35#1:77\n*E\n"
    }
.end annotation


# instance fields
.field public B:LM40;


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
.method public final j0()LM40;
    .locals 1

    iget-object v0, p0, Lco/bird/android/feature/bulkscanner/report/serviceprogress/BulkServiceCenterStatusReportActivity;->B:LM40;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "presenter"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 6

    invoke-super {p0, p1}, Lco/bird/android/core/mvp/BaseActivity;->onCreate(Landroid/os/Bundle;)V

    invoke-virtual {p0}, Landroid/app/Activity;->getLayoutInflater()Landroid/view/LayoutInflater;

    move-result-object p1

    invoke-static {p1}, Lf3;->c(Landroid/view/LayoutInflater;)Lf3;

    move-result-object v5

    const-string p1, "inflate(layoutInflater)"

    invoke-static {v5, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v5}, Lf3;->b()Landroidx/constraintlayout/widget/ConstraintLayout;

    move-result-object p1

    invoke-virtual {p0, p1}, Landroidx/appcompat/app/AppCompatActivity;->setContentView(Landroid/view/View;)V

    invoke-virtual {p0}, Lco/bird/android/core/mvp/BaseActivity;->D()V

    invoke-static {}, Lco/bird/android/feature/bulkscanner/report/serviceprogress/a;->a()Lco/bird/android/feature/bulkscanner/report/serviceprogress/BulkServiceCenterStatusReportActivity$a$a;

    move-result-object v0

    sget-object p1, LoG2;->a:LoG2;

    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    const-string v2, "applicationContext"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1, v1}, LoG2;->a(Landroid/content/Context;)LlG2;

    move-result-object v1

    new-instance v2, Lco/bird/android/feature/bulkscanner/report/serviceprogress/BulkServiceCenterStatusReportActivity$b;

    invoke-direct {v2}, Lco/bird/android/feature/bulkscanner/report/serviceprogress/BulkServiceCenterStatusReportActivity$b;-><init>()V

    invoke-static {p0}, Lcom/uber/autodispose/android/lifecycle/AndroidLifecycleScopeProvider;->b(LLifecycleOwner;)Lcom/uber/autodispose/android/lifecycle/AndroidLifecycleScopeProvider;

    move-result-object v4

    const-string p1, "AndroidLifecycleScopeProvider.from(this)"

    invoke-static {v4, p1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v3, p0

    invoke-interface/range {v0 .. v5}, Lco/bird/android/feature/bulkscanner/report/serviceprogress/BulkServiceCenterStatusReportActivity$a$a;->a(LlG2;Lco/bird/android/feature/bulkscanner/report/serviceprogress/BulkServiceCenterStatusReportActivity$b;Lco/bird/android/core/mvp/BaseActivity;Lcom/uber/autodispose/ScopeProvider;Lf3;)Lco/bird/android/feature/bulkscanner/report/serviceprogress/BulkServiceCenterStatusReportActivity$a;

    move-result-object p1

    invoke-interface {p1, p0}, Lco/bird/android/feature/bulkscanner/report/serviceprogress/BulkServiceCenterStatusReportActivity$a;->a(Lco/bird/android/feature/bulkscanner/report/serviceprogress/BulkServiceCenterStatusReportActivity;)V

    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object p1

    const-string v0, "service_center_status"

    invoke-virtual {p1, v0}, Landroid/content/Intent;->getParcelableExtra(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    check-cast p1, Lco/bird/android/model/wire/WireServiceCenterStatus;

    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const-string v1, "notes"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v1

    const-string v2, "session_id"

    invoke-virtual {v1, v2}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {p0}, Lco/bird/android/feature/bulkscanner/report/serviceprogress/BulkServiceCenterStatusReportActivity;->j0()LM40;

    move-result-object v2

    invoke-virtual {v2, p1, v0, v1}, LM40;->v(Lco/bird/android/model/wire/WireServiceCenterStatus;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method
