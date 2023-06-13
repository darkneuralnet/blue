.class public final Lco/bird/android/app/feature/useragreement/UserAgreementActivity;
.super Lco/bird/android/core/mvp/BaseActivity;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\n\u0008\u0007\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0016\u0010\u0017J\u0012\u0010\u0005\u001a\u00020\u00042\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014R\"\u0010\r\u001a\u00020\u00068\u0006@\u0006X\u0087.\u00a2\u0006\u0012\n\u0004\u0008\u0007\u0010\u0008\u001a\u0004\u0008\t\u0010\n\"\u0004\u0008\u000b\u0010\u000cR$\u0010\u0015\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\u000f\u0010\u0010\u001a\u0004\u0008\u0011\u0010\u0012\"\u0004\u0008\u0013\u0010\u0014\u00a8\u0006\u0018"
    }
    d2 = {
        "Lco/bird/android/app/feature/useragreement/UserAgreementActivity;",
        "Lco/bird/android/core/mvp/BaseActivity;",
        "Landroid/os/Bundle;",
        "savedInstanceState",
        "",
        "onCreate",
        "LOg6;",
        "B",
        "LOg6;",
        "j0",
        "()LOg6;",
        "setAgreementPresenterFactory",
        "(LOg6;)V",
        "agreementPresenterFactory",
        "LCg6;",
        "C",
        "LCg6;",
        "getUserPresenter",
        "()LCg6;",
        "setUserPresenter",
        "(LCg6;)V",
        "userPresenter",
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
        "SMAP\nUserAgreementActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UserAgreementActivity.kt\nco/bird/android/app/feature/useragreement/UserAgreementActivity\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,39:1\n37#2,2:40\n*S KotlinDebug\n*F\n+ 1 UserAgreementActivity.kt\nco/bird/android/app/feature/useragreement/UserAgreementActivity\n*L\n28#1:40,2\n*E\n"
    }
.end annotation


# instance fields
.field public B:LOg6;

.field public C:LCg6;


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
.method public final j0()LOg6;
    .locals 1

    iget-object v0, p0, Lco/bird/android/app/feature/useragreement/UserAgreementActivity;->B:LOg6;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "agreementPresenterFactory"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 7

    invoke-super {p0, p1}, Lco/bird/android/core/mvp/BaseActivity;->onCreate(Landroid/os/Bundle;)V

    sget-object p1, LH22;->a:LH22;

    invoke-virtual {p1, p0}, LH22;->x2(Lco/bird/android/app/feature/useragreement/UserAgreementActivity;)V

    sget p1, Lcj4;->activity_webview:I

    invoke-virtual {p0, p1}, Landroidx/appcompat/app/AppCompatActivity;->setContentView(I)V

    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object p1

    const-string v0, "agreement_roles"

    invoke-virtual {p1, v0}, Landroid/content/Intent;->getParcelableArrayListExtra(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const-string v1, "partner_id"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    new-array v1, v1, [Lco/bird/android/model/AgreementRole;

    invoke-interface {p1, v1}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [Lco/bird/android/model/AgreementRole;

    array-length v1, p1

    invoke-static {p1, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p1

    new-instance v4, Lco/bird/android/app/feature/useragreement/UserAgreementActivity$a;

    invoke-direct {v4, v0, p0, p1}, Lco/bird/android/app/feature/useragreement/UserAgreementActivity$a;-><init>(Ljava/lang/String;Lco/bird/android/app/feature/useragreement/UserAgreementActivity;[Ljava/lang/Object;)V

    invoke-virtual {p0}, Lco/bird/android/app/feature/useragreement/UserAgreementActivity;->j0()LOg6;

    move-result-object v1

    invoke-virtual {p0}, Lco/bird/android/core/mvp/BaseActivity;->Z()Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;

    move-result-object v2

    new-instance v3, LSg6;

    const p1, 0x1020002

    invoke-static {p0, p1}, LfB0;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object p1

    invoke-direct {v3, p1, p0}, LSg6;-><init>(Landroid/view/View;Lco/bird/android/core/mvp/BaseActivity;)V

    invoke-virtual {p0}, Lco/bird/android/core/mvp/BaseActivity;->w()Le13;

    move-result-object v5

    const/4 v6, 0x0

    invoke-interface/range {v1 .. v6}, LOg6;->a(Lcom/uber/autodispose/ScopeProvider;LRg6;Lg9;Le13;Ljava/lang/Integer;)LKg6;

    move-result-object p1

    invoke-virtual {p1}, LKg6;->q()V

    iput-object p1, p0, Lco/bird/android/app/feature/useragreement/UserAgreementActivity;->C:LCg6;

    return-void
.end method
