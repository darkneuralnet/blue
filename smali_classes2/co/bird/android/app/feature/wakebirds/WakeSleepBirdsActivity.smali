.class public final Lco/bird/android/app/feature/wakebirds/WakeSleepBirdsActivity;
.super Lco/bird/android/core/mvp/BaseActivity;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lco/bird/android/app/feature/wakebirds/WakeSleepBirdsActivity$a;,
        Lco/bird/android/app/feature/wakebirds/WakeSleepBirdsActivity$b;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u000c\u0008\u0007\u0018\u00002\u00020\u0001:\u0002\u0010\u0011B\u0007\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u0012\u0010\u0005\u001a\u00020\u00042\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014R\"\u0010\r\u001a\u00020\u00068\u0006@\u0006X\u0087.\u00a2\u0006\u0012\n\u0004\u0008\u0007\u0010\u0008\u001a\u0004\u0008\t\u0010\n\"\u0004\u0008\u000b\u0010\u000c\u00a8\u0006\u0012"
    }
    d2 = {
        "Lco/bird/android/app/feature/wakebirds/WakeSleepBirdsActivity;",
        "Lco/bird/android/core/mvp/BaseActivity;",
        "Landroid/os/Bundle;",
        "savedInstanceState",
        "",
        "onCreate",
        "Lbx6;",
        "B",
        "Lbx6;",
        "j0",
        "()Lbx6;",
        "setPresenter",
        "(Lbx6;)V",
        "presenter",
        "<init>",
        "()V",
        "a",
        "b",
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
        "SMAP\nWakeSleepBirdsActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WakeSleepBirdsActivity.kt\nco/bird/android/app/feature/wakebirds/WakeSleepBirdsActivity\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/android/lifecycle/KotlinExtensionsKt\n*L\n1#1,75:1\n44#2:76\n*S KotlinDebug\n*F\n+ 1 WakeSleepBirdsActivity.kt\nco/bird/android/app/feature/wakebirds/WakeSleepBirdsActivity\n*L\n34#1:76\n*E\n"
    }
.end annotation


# instance fields
.field public B:Lbx6;


# direct methods
.method public static constructor <clinit>()V
    .locals 0

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
.method public final j0()Lbx6;
    .locals 1

    iget-object v0, p0, Lco/bird/android/app/feature/wakebirds/WakeSleepBirdsActivity;->B:Lbx6;

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

    invoke-static {p1}, Lv6;->c(Landroid/view/LayoutInflater;)Lv6;

    move-result-object v5

    const-string p1, "inflate(layoutInflater)"

    invoke-static {v5, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v5}, Lv6;->b()Landroid/widget/LinearLayout;

    move-result-object p1

    invoke-virtual {p0, p1}, Landroidx/appcompat/app/AppCompatActivity;->setContentView(Landroid/view/View;)V

    invoke-static {}, Lco/bird/android/app/feature/wakebirds/a;->a()Lco/bird/android/app/feature/wakebirds/WakeSleepBirdsActivity$a$a;

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

    invoke-virtual {p0}, Lco/bird/android/core/mvp/BaseActivity;->x()LDQ3;

    move-result-object v4

    move-object v2, p0

    invoke-interface/range {v0 .. v5}, Lco/bird/android/app/feature/wakebirds/WakeSleepBirdsActivity$a$a;->a(LlG2;Lco/bird/android/core/mvp/BaseActivity;Lcom/uber/autodispose/ScopeProvider;LDQ3;Lv6;)Lco/bird/android/app/feature/wakebirds/WakeSleepBirdsActivity$a;

    move-result-object p1

    invoke-interface {p1, p0}, Lco/bird/android/app/feature/wakebirds/WakeSleepBirdsActivity$a;->a(Lco/bird/android/app/feature/wakebirds/WakeSleepBirdsActivity;)V

    invoke-virtual {p0}, Lco/bird/android/app/feature/wakebirds/WakeSleepBirdsActivity;->j0()Lbx6;

    move-result-object p1

    invoke-interface {p1}, Lbx6;->a()V

    return-void
.end method
