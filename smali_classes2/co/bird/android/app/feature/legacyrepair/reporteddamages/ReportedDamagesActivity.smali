.class public final Lco/bird/android/app/feature/legacyrepair/reporteddamages/ReportedDamagesActivity;
.super Lco/bird/android/core/mvp/BaseActivity;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0007\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u001e\u0010\u001fJ\u0012\u0010\u0005\u001a\u00020\u00042\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014R\"\u0010\r\u001a\u00020\u00068\u0006@\u0006X\u0087.\u00a2\u0006\u0012\n\u0004\u0008\u0007\u0010\u0008\u001a\u0004\u0008\t\u0010\n\"\u0004\u0008\u000b\u0010\u000cR\"\u0010\u0015\u001a\u00020\u000e8\u0006@\u0006X\u0087.\u00a2\u0006\u0012\n\u0004\u0008\u000f\u0010\u0010\u001a\u0004\u0008\u0011\u0010\u0012\"\u0004\u0008\u0013\u0010\u0014R\u0016\u0010\u0019\u001a\u00020\u00168\u0002@\u0002X\u0082.\u00a2\u0006\u0006\n\u0004\u0008\u0017\u0010\u0018R\u0016\u0010\u001d\u001a\u00020\u001a8\u0002@\u0002X\u0082.\u00a2\u0006\u0006\n\u0004\u0008\u001b\u0010\u001c\u00a8\u0006 "
    }
    d2 = {
        "Lco/bird/android/app/feature/legacyrepair/reporteddamages/ReportedDamagesActivity;",
        "Lco/bird/android/core/mvp/BaseActivity;",
        "Landroid/os/Bundle;",
        "savedInstanceState",
        "",
        "onCreate",
        "LPH4;",
        "B",
        "LPH4;",
        "j0",
        "()LPH4;",
        "setPresenterFactory",
        "(LPH4;)V",
        "presenterFactory",
        "LJy4;",
        "C",
        "LJy4;",
        "k0",
        "()LJy4;",
        "setRepairClient",
        "(LJy4;)V",
        "repairClient",
        "LSH4;",
        "D",
        "LSH4;",
        "ui",
        "LKH4;",
        "E",
        "LKH4;",
        "presenter",
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


# instance fields
.field public B:LPH4;

.field public C:LJy4;

.field public D:LSH4;

.field public E:LKH4;


# direct methods
.method public static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 6

    const/4 v1, 0x0

    sget v0, Lnl4;->mechanic_repair_flow_action_bar_title:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x0

    const/4 v4, 0x4

    const/4 v5, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v5}, Lco/bird/android/core/mvp/BaseActivity;-><init>(ZLjava/lang/Integer;Ljava/lang/Boolean;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method


# virtual methods
.method public final j0()LPH4;
    .locals 1

    iget-object v0, p0, Lco/bird/android/app/feature/legacyrepair/reporteddamages/ReportedDamagesActivity;->B:LPH4;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "presenterFactory"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public final k0()LJy4;
    .locals 1

    iget-object v0, p0, Lco/bird/android/app/feature/legacyrepair/reporteddamages/ReportedDamagesActivity;->C:LJy4;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "repairClient"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 5

    invoke-super {p0, p1}, Lco/bird/android/core/mvp/BaseActivity;->onCreate(Landroid/os/Bundle;)V

    invoke-virtual {p0}, Landroid/app/Activity;->getLayoutInflater()Landroid/view/LayoutInflater;

    move-result-object p1

    invoke-static {p1}, Lq5;->c(Landroid/view/LayoutInflater;)Lq5;

    move-result-object p1

    const-string v0, "inflate(layoutInflater)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lq5;->b()Landroidx/core/widget/NestedScrollView;

    move-result-object v0

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->setContentView(Landroid/view/View;)V

    sget-object v0, LH22;->a:LH22;

    invoke-virtual {v0, p0}, LH22;->Q0(Lco/bird/android/app/feature/legacyrepair/reporteddamages/ReportedDamagesActivity;)V

    new-instance v0, LTH4;

    invoke-direct {v0, p0, p1}, LTH4;-><init>(Lco/bird/android/core/mvp/BaseActivity;Lq5;)V

    iput-object v0, p0, Lco/bird/android/app/feature/legacyrepair/reporteddamages/ReportedDamagesActivity;->D:LSH4;

    invoke-virtual {p0}, Lco/bird/android/app/feature/legacyrepair/reporteddamages/ReportedDamagesActivity;->j0()LPH4;

    move-result-object p1

    invoke-virtual {p0}, Lco/bird/android/core/mvp/BaseActivity;->Z()Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;

    move-result-object v0

    iget-object v1, p0, Lco/bird/android/app/feature/legacyrepair/reporteddamages/ReportedDamagesActivity;->D:LSH4;

    const/4 v2, 0x0

    if-nez v1, :cond_0

    const-string v1, "ui"

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v1, v2

    :cond_0
    invoke-virtual {p0}, Lco/bird/android/core/mvp/BaseActivity;->w()Le13;

    move-result-object v3

    invoke-virtual {p0}, Lco/bird/android/app/feature/legacyrepair/reporteddamages/ReportedDamagesActivity;->k0()LJy4;

    move-result-object v4

    invoke-interface {p1, v0, v1, v3, v4}, LPH4;->a(Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;LSH4;Le13;LJy4;)LOH4;

    move-result-object p1

    iput-object p1, p0, Lco/bird/android/app/feature/legacyrepair/reporteddamages/ReportedDamagesActivity;->E:LKH4;

    if-nez p1, :cond_1

    const-string p1, "presenter"

    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    goto :goto_0

    :cond_1
    move-object v2, p1

    :goto_0
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object p1

    const-string v0, "intent"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v2, p1}, LKH4;->b(Landroid/content/Intent;)V

    return-void
.end method
