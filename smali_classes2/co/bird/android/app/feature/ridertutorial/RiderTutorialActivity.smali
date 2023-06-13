.class public final Lco/bird/android/app/feature/ridertutorial/RiderTutorialActivity;
.super Lco/bird/android/core/mvp/BaseActivity;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\n\u0008\u0007\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u0012\u0010\u0005\u001a\u00020\u00042\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014R\"\u0010\r\u001a\u00020\u00068\u0006@\u0006X\u0087.\u00a2\u0006\u0012\n\u0004\u0008\u0007\u0010\u0008\u001a\u0004\u0008\t\u0010\n\"\u0004\u0008\u000b\u0010\u000c\u00a8\u0006\u0010"
    }
    d2 = {
        "Lco/bird/android/app/feature/ridertutorial/RiderTutorialActivity;",
        "Lco/bird/android/core/mvp/BaseActivity;",
        "Landroid/os/Bundle;",
        "savedInstanceState",
        "",
        "onCreate",
        "LVa5;",
        "B",
        "LVa5;",
        "k0",
        "()LVa5;",
        "setPresenterFactory",
        "(LVa5;)V",
        "presenterFactory",
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
        "SMAP\nRiderTutorialActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RiderTutorialActivity.kt\nco/bird/android/app/feature/ridertutorial/RiderTutorialActivity\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n*L\n1#1,40:1\n180#2:41\n*S KotlinDebug\n*F\n+ 1 RiderTutorialActivity.kt\nco/bird/android/app/feature/ridertutorial/RiderTutorialActivity\n*L\n36#1:41\n*E\n"
    }
.end annotation


# instance fields
.field public B:LVa5;


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

.method public static synthetic j0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/app/feature/ridertutorial/RiderTutorialActivity;->onCreate$lambda$0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static final onCreate$lambda$0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final k0()LVa5;
    .locals 1

    iget-object v0, p0, Lco/bird/android/app/feature/ridertutorial/RiderTutorialActivity;->B:LVa5;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "presenterFactory"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 5

    sget-object v0, LH22;->a:LH22;

    invoke-virtual {v0, p0}, LH22;->o1(Lco/bird/android/app/feature/ridertutorial/RiderTutorialActivity;)V

    invoke-super {p0, p1}, Lco/bird/android/core/mvp/BaseActivity;->onCreate(Landroid/os/Bundle;)V

    sget p1, Lcj4;->rider_tutorial_dark:I

    invoke-virtual {p0, p1}, Landroidx/appcompat/app/AppCompatActivity;->setContentView(I)V

    sget-object p1, Lco/bird/android/model/ridertutorial/TutorialKind;->CLASS_SCOOTER:Lco/bird/android/model/ridertutorial/TutorialKind;

    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const-string v1, "tutorial_type"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->hasExtra(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object p1, Lco/bird/android/model/ridertutorial/TutorialKind;->Companion:Lco/bird/android/model/ridertutorial/TutorialKind$Companion;

    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {p1, v0}, Lco/bird/android/model/ridertutorial/TutorialKind$Companion;->from(Ljava/lang/String;)Lco/bird/android/model/ridertutorial/TutorialKind;

    move-result-object p1

    :cond_0
    new-instance v0, Ldb5;

    const/4 v1, 0x0

    const/4 v2, 0x2

    invoke-direct {v0, p0, v1, v2, v1}, Ldb5;-><init>(Lco/bird/android/core/mvp/BaseActivity;Landroid/view/View;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {p0}, Lco/bird/android/app/feature/ridertutorial/RiderTutorialActivity;->k0()LVa5;

    move-result-object v3

    invoke-virtual {p0}, Lco/bird/android/core/mvp/BaseActivity;->Z()Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;

    move-result-object v4

    invoke-interface {v3, v4, v0, v1}, LVa5;->a(Lcom/uber/autodispose/ScopeProvider;LZa5;LDU2;)LUa5;

    move-result-object v0

    invoke-static {v0, p1, v1, v2, v1}, LOa5$a;->onCreate$default(LOa5;Lco/bird/android/model/ridertutorial/TutorialKind;Lco/bird/android/model/constant/BirdModel;ILjava/lang/Object;)V

    invoke-virtual {v0}, LUa5;->observeDone()Lio/reactivex/Observable;

    move-result-object p1

    invoke-virtual {p0}, Lco/bird/android/core/mvp/BaseActivity;->Z()Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;

    move-result-object v0

    invoke-static {v0}, Lcom/uber/autodispose/AutoDispose;->a(Lcom/uber/autodispose/ScopeProvider;)Lcom/uber/autodispose/AutoDisposeConverter;

    move-result-object v0

    invoke-virtual {p1, v0}, Lio/reactivex/Observable;->as(Lio/reactivex/x;)Ljava/lang/Object;

    move-result-object p1

    const-string v0, "this.`as`(AutoDispose.autoDisposable(provider))"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lcom/uber/autodispose/ObservableSubscribeProxy;

    new-instance v0, Lco/bird/android/app/feature/ridertutorial/RiderTutorialActivity$a;

    invoke-direct {v0, p0}, Lco/bird/android/app/feature/ridertutorial/RiderTutorialActivity$a;-><init>(Lco/bird/android/app/feature/ridertutorial/RiderTutorialActivity;)V

    new-instance v1, LIa5;

    invoke-direct {v1, v0}, LIa5;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-interface {p1, v1}, Lcom/uber/autodispose/ObservableSubscribeProxy;->subscribe(Lio/reactivex/functions/g;)Lio/reactivex/disposables/c;

    return-void
.end method
