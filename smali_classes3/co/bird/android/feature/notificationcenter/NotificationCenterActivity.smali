.class public final Lco/bird/android/feature/notificationcenter/NotificationCenterActivity;
.super Lco/bird/android/core/mrp/BaseActivityLite;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\n\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u001f\u0010 J\u0012\u0010\u0005\u001a\u00020\u00042\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014J\u0010\u0010\t\u001a\u00020\u00082\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0008\u0010\n\u001a\u00020\u0004H\u0002R\"\u0010\u0012\u001a\u00020\u000b8\u0006@\u0006X\u0087.\u00a2\u0006\u0012\n\u0004\u0008\u000c\u0010\r\u001a\u0004\u0008\u000e\u0010\u000f\"\u0004\u0008\u0010\u0010\u0011R\u0016\u0010\u0016\u001a\u00020\u00138\u0002@\u0002X\u0082.\u00a2\u0006\u0006\n\u0004\u0008\u0014\u0010\u0015R\"\u0010\u001e\u001a\u00020\u00178\u0000@\u0000X\u0080.\u00a2\u0006\u0012\n\u0004\u0008\u0018\u0010\u0019\u001a\u0004\u0008\u001a\u0010\u001b\"\u0004\u0008\u001c\u0010\u001d\u00a8\u0006!"
    }
    d2 = {
        "Lco/bird/android/feature/notificationcenter/NotificationCenterActivity;",
        "Lco/bird/android/core/mrp/BaseActivityLite;",
        "Landroid/os/Bundle;",
        "savedInstanceState",
        "",
        "onCreate",
        "Landroid/view/MenuItem;",
        "item",
        "",
        "onOptionsItemSelected",
        "P",
        "LAa3;",
        "j",
        "LAa3;",
        "R",
        "()LAa3;",
        "setFragmentNavigator",
        "(LAa3;)V",
        "fragmentNavigator",
        "Ls4;",
        "k",
        "Ls4;",
        "binding",
        "Lpa3;",
        "l",
        "Lpa3;",
        "Q",
        "()Lpa3;",
        "S",
        "(Lpa3;)V",
        "component",
        "<init>",
        "()V",
        "notification-center_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public j:LAa3;

.field public k:Ls4;

.field public l:Lpa3;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lco/bird/android/core/mrp/BaseActivityLite;-><init>()V

    return-void
.end method

.method public static final synthetic access$back(Lco/bird/android/feature/notificationcenter/NotificationCenterActivity;)V
    .locals 0

    invoke-virtual {p0}, Lco/bird/android/feature/notificationcenter/NotificationCenterActivity;->P()V

    return-void
.end method


# virtual methods
.method public final P()V
    .locals 1

    invoke-virtual {p0}, Lco/bird/android/feature/notificationcenter/NotificationCenterActivity;->Q()Lpa3;

    move-result-object v0

    invoke-interface {v0}, Lpa3;->b()LAa3;

    move-result-object v0

    invoke-virtual {v0}, LKA;->a()Z

    move-result v0

    if-nez v0, :cond_0

    sget-object v0, Lqa3;->b:Lqa3;

    invoke-virtual {v0}, LAk1;->a()V

    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    :cond_0
    return-void
.end method

.method public final Q()Lpa3;
    .locals 1

    iget-object v0, p0, Lco/bird/android/feature/notificationcenter/NotificationCenterActivity;->l:Lpa3;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "component"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public final R()LAa3;
    .locals 1

    iget-object v0, p0, Lco/bird/android/feature/notificationcenter/NotificationCenterActivity;->j:LAa3;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "fragmentNavigator"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public final S(Lpa3;)V
    .locals 1

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lco/bird/android/feature/notificationcenter/NotificationCenterActivity;->l:Lpa3;

    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 4

    invoke-super {p0, p1}, Lco/bird/android/core/mrp/BaseActivityLite;->onCreate(Landroid/os/Bundle;)V

    invoke-virtual {p0}, Landroidx/activity/ComponentActivity;->getOnBackPressedDispatcher()Landroidx/activity/OnBackPressedDispatcher;

    move-result-object p1

    new-instance v0, Lco/bird/android/feature/notificationcenter/NotificationCenterActivity$a;

    invoke-direct {v0, p0}, Lco/bird/android/feature/notificationcenter/NotificationCenterActivity$a;-><init>(Lco/bird/android/feature/notificationcenter/NotificationCenterActivity;)V

    invoke-virtual {p1, p0, v0}, Landroidx/activity/OnBackPressedDispatcher;->b(LLifecycleOwner;LVe3;)V

    invoke-virtual {p0}, Landroid/app/Activity;->getLayoutInflater()Landroid/view/LayoutInflater;

    move-result-object p1

    invoke-static {p1}, Ls4;->c(Landroid/view/LayoutInflater;)Ls4;

    move-result-object p1

    const-string v0, "inflate(layoutInflater)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lco/bird/android/feature/notificationcenter/NotificationCenterActivity;->k:Ls4;

    if-nez p1, :cond_0

    const-string p1, "binding"

    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 p1, 0x0

    :cond_0
    invoke-virtual {p1}, Ls4;->b()Landroid/widget/FrameLayout;

    move-result-object p1

    invoke-virtual {p0, p1}, Landroidx/appcompat/app/AppCompatActivity;->setContentView(Landroid/view/View;)V

    sget-object p1, Lqa3;->b:Lqa3;

    invoke-virtual {p0}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    move-result-object v0

    const-string v1, "application"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v1, 0x2

    new-array v1, v1, [Lkotlin/Pair;

    const-string v2, "fragment_manager"

    invoke-virtual {p0}, Landroidx/fragment/app/FragmentActivity;->getSupportFragmentManager()Landroidx/fragment/app/FragmentManager;

    move-result-object v3

    invoke-static {v2, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    sget v2, LFh4;->container:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const-string v3, "container_id"

    invoke-static {v3, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v1}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, LAk1;->b(Landroid/app/Application;Ljava/util/Map;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lpa3;

    invoke-virtual {p0, p1}, Lco/bird/android/feature/notificationcenter/NotificationCenterActivity;->S(Lpa3;)V

    invoke-virtual {p0}, Lco/bird/android/feature/notificationcenter/NotificationCenterActivity;->Q()Lpa3;

    move-result-object p1

    invoke-interface {p1, p0}, Lpa3;->a(Lco/bird/android/feature/notificationcenter/NotificationCenterActivity;)V

    invoke-virtual {p0}, Lco/bird/android/feature/notificationcenter/NotificationCenterActivity;->R()LAa3;

    move-result-object p1

    invoke-virtual {p1}, LAa3;->e()V

    return-void
.end method

.method public onOptionsItemSelected(Landroid/view/MenuItem;)Z
    .locals 2

    const-string v0, "item"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, Landroid/view/MenuItem;->getItemId()I

    move-result v0

    const v1, 0x102002c

    if-ne v0, v1, :cond_0

    invoke-virtual {p0}, Lco/bird/android/feature/notificationcenter/NotificationCenterActivity;->P()V

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    invoke-super {p0, p1}, Lco/bird/android/core/base/BaseCoreActivity;->onOptionsItemSelected(Landroid/view/MenuItem;)Z

    move-result p1

    :goto_0
    return p1
.end method
