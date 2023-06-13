.class public final Lco/bird/android/app/feature/prepay/PaymentMethodActivity;
.super Lco/bird/android/core/mvp/BaseActivity;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lco/bird/android/app/feature/prepay/PaymentMethodActivity$a;,
        Lco/bird/android/app/feature/prepay/PaymentMethodActivity$b;,
        Lco/bird/android/app/feature/prepay/PaymentMethodActivity$c;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u000e\u0008\u0007\u0018\u0000 \u00102\u00020\u0001:\u0003\u0011\u0012\u0013B\u0007\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u0012\u0010\u0005\u001a\u00020\u00042\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014R\"\u0010\r\u001a\u00020\u00068\u0006@\u0006X\u0087.\u00a2\u0006\u0012\n\u0004\u0008\u0007\u0010\u0008\u001a\u0004\u0008\t\u0010\n\"\u0004\u0008\u000b\u0010\u000c\u00a8\u0006\u0014"
    }
    d2 = {
        "Lco/bird/android/app/feature/prepay/PaymentMethodActivity;",
        "Lco/bird/android/core/mvp/BaseActivity;",
        "Landroid/os/Bundle;",
        "savedInstanceState",
        "",
        "onCreate",
        "LQN3;",
        "B",
        "LQN3;",
        "j0",
        "()LQN3;",
        "setPresenter",
        "(LQN3;)V",
        "presenter",
        "<init>",
        "()V",
        "C",
        "a",
        "b",
        "c",
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
        "SMAP\nPaymentMethodActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PaymentMethodActivity.kt\nco/bird/android/app/feature/prepay/PaymentMethodActivity\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/android/lifecycle/KotlinExtensionsKt\n*L\n1#1,72:1\n44#2:73\n*S KotlinDebug\n*F\n+ 1 PaymentMethodActivity.kt\nco/bird/android/app/feature/prepay/PaymentMethodActivity\n*L\n31#1:73\n*E\n"
    }
.end annotation


# static fields
.field public static final C:Lco/bird/android/app/feature/prepay/PaymentMethodActivity$a;

.field public static final D:I


# instance fields
.field public B:LQN3;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lco/bird/android/app/feature/prepay/PaymentMethodActivity$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lco/bird/android/app/feature/prepay/PaymentMethodActivity$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lco/bird/android/app/feature/prepay/PaymentMethodActivity;->C:Lco/bird/android/app/feature/prepay/PaymentMethodActivity$a;

    const/16 v0, 0x8

    sput v0, Lco/bird/android/app/feature/prepay/PaymentMethodActivity;->D:I

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
.method public final j0()LQN3;
    .locals 1

    iget-object v0, p0, Lco/bird/android/app/feature/prepay/PaymentMethodActivity;->B:LQN3;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "presenter"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 3

    invoke-super {p0, p1}, Lco/bird/android/core/mvp/BaseActivity;->onCreate(Landroid/os/Bundle;)V

    sget p1, Lcj4;->activity_payment_method:I

    invoke-virtual {p0, p1}, Landroidx/appcompat/app/AppCompatActivity;->setContentView(I)V

    invoke-static {}, Lco/bird/android/app/feature/prepay/a;->a()Lco/bird/android/app/feature/prepay/PaymentMethodActivity$b$a;

    move-result-object p1

    sget-object v0, LoG2;->a:LoG2;

    invoke-virtual {p0}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    move-result-object v1

    const-string v2, "application"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, LoG2;->a(Landroid/content/Context;)LlG2;

    move-result-object v0

    invoke-static {p0}, Lcom/uber/autodispose/android/lifecycle/AndroidLifecycleScopeProvider;->b(LLifecycleOwner;)Lcom/uber/autodispose/android/lifecycle/AndroidLifecycleScopeProvider;

    move-result-object v1

    const-string v2, "AndroidLifecycleScopeProvider.from(this)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1, v0, p0, v1}, Lco/bird/android/app/feature/prepay/PaymentMethodActivity$b$a;->a(LlG2;Lco/bird/android/core/mvp/BaseActivity;Lcom/uber/autodispose/ScopeProvider;)Lco/bird/android/app/feature/prepay/PaymentMethodActivity$b;

    move-result-object p1

    invoke-interface {p1, p0}, Lco/bird/android/app/feature/prepay/PaymentMethodActivity$b;->a(Lco/bird/android/app/feature/prepay/PaymentMethodActivity;)V

    invoke-virtual {p0}, Lco/bird/android/app/feature/prepay/PaymentMethodActivity;->j0()LQN3;

    move-result-object p1

    invoke-interface {p1}, LQN3;->a()V

    return-void
.end method
