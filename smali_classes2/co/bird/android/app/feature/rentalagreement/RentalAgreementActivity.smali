.class public final Lco/bird/android/app/feature/rentalagreement/RentalAgreementActivity;
.super Lco/bird/android/core/mvp/BaseActivity;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lco/bird/android/app/feature/rentalagreement/RentalAgreementActivity$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u000c\u0008\u0007\u0018\u0000 \u00192\u00020\u0001:\u0001\u001aB\u0007\u00a2\u0006\u0004\u0008\u0017\u0010\u0018J\u0012\u0010\u0005\u001a\u00020\u00042\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014J\u0008\u0010\u0006\u001a\u00020\u0004H\u0016R\"\u0010\u000e\u001a\u00020\u00078\u0006@\u0006X\u0087.\u00a2\u0006\u0012\n\u0004\u0008\u0008\u0010\t\u001a\u0004\u0008\n\u0010\u000b\"\u0004\u0008\u000c\u0010\rR$\u0010\u0016\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\u0010\u0010\u0011\u001a\u0004\u0008\u0012\u0010\u0013\"\u0004\u0008\u0014\u0010\u0015\u00a8\u0006\u001b"
    }
    d2 = {
        "Lco/bird/android/app/feature/rentalagreement/RentalAgreementActivity;",
        "Lco/bird/android/core/mvp/BaseActivity;",
        "Landroid/os/Bundle;",
        "savedInstanceState",
        "",
        "onCreate",
        "onBackPressed",
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
        "D",
        "a",
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
        "SMAP\nRentalAgreementActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RentalAgreementActivity.kt\nco/bird/android/app/feature/rentalagreement/RentalAgreementActivity\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,70:1\n37#2,2:71\n*S KotlinDebug\n*F\n+ 1 RentalAgreementActivity.kt\nco/bird/android/app/feature/rentalagreement/RentalAgreementActivity\n*L\n36#1:71,2\n*E\n"
    }
.end annotation


# static fields
.field public static final D:Lco/bird/android/app/feature/rentalagreement/RentalAgreementActivity$a;

.field public static final E:I


# instance fields
.field public B:LOg6;

.field public C:LCg6;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lco/bird/android/app/feature/rentalagreement/RentalAgreementActivity$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lco/bird/android/app/feature/rentalagreement/RentalAgreementActivity$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lco/bird/android/app/feature/rentalagreement/RentalAgreementActivity;->D:Lco/bird/android/app/feature/rentalagreement/RentalAgreementActivity$a;

    const/16 v0, 0x8

    sput v0, Lco/bird/android/app/feature/rentalagreement/RentalAgreementActivity;->E:I

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

    iget-object v0, p0, Lco/bird/android/app/feature/rentalagreement/RentalAgreementActivity;->B:LOg6;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "agreementPresenterFactory"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public onBackPressed()V
    .locals 3

    iget-object v0, p0, Lco/bird/android/app/feature/rentalagreement/RentalAgreementActivity;->C:LCg6;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-interface {v0}, LCg6;->onBackPressed()Z

    move-result v0

    const/4 v2, 0x1

    if-ne v0, v2, :cond_0

    move v1, v2

    :cond_0
    if-nez v1, :cond_1

    invoke-super {p0}, Lco/bird/android/core/base/BaseCoreActivity;->onBackPressed()V

    :cond_1
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 13

    invoke-super {p0, p1}, Lco/bird/android/core/mvp/BaseActivity;->onCreate(Landroid/os/Bundle;)V

    sget-object p1, LH22;->a:LH22;

    invoke-virtual {p1, p0}, LH22;->R(Lco/bird/android/app/feature/rentalagreement/RentalAgreementActivity;)V

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

    if-nez v0, :cond_0

    const/4 v0, 0x0

    :cond_0
    move-object v2, v0

    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const-string v1, "co.bird.android.user_guest_id"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const-string v1, "aggressively_triggered"

    const/4 v4, 0x0

    invoke-virtual {v0, v1, v4}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v0

    new-array v1, v4, [Lco/bird/android/model/AgreementRole;

    invoke-interface {p1, v1}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [Lco/bird/android/model/AgreementRole;

    array-length v1, p1

    invoke-static {p1, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v6

    new-instance v10, Lco/bird/android/app/feature/rentalagreement/RentalAgreementActivity$b;

    move-object v1, v10

    move v4, v0

    move-object v5, p0

    invoke-direct/range {v1 .. v6}, Lco/bird/android/app/feature/rentalagreement/RentalAgreementActivity$b;-><init>(Ljava/lang/String;Ljava/lang/String;ZLco/bird/android/app/feature/rentalagreement/RentalAgreementActivity;[Ljava/lang/Object;)V

    invoke-virtual {p0}, Lco/bird/android/app/feature/rentalagreement/RentalAgreementActivity;->j0()LOg6;

    move-result-object v7

    invoke-virtual {p0}, Lco/bird/android/core/mvp/BaseActivity;->Z()Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;

    move-result-object v8

    new-instance v9, LSg6;

    const p1, 0x1020002

    invoke-static {p0, p1}, LfB0;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object p1

    invoke-direct {v9, p1, p0}, LSg6;-><init>(Landroid/view/View;Lco/bird/android/core/mvp/BaseActivity;)V

    invoke-virtual {p0}, Lco/bird/android/core/mvp/BaseActivity;->w()Le13;

    move-result-object v11

    const/4 v12, 0x0

    invoke-interface/range {v7 .. v12}, LOg6;->a(Lcom/uber/autodispose/ScopeProvider;LRg6;Lg9;Le13;Ljava/lang/Integer;)LKg6;

    move-result-object p1

    invoke-virtual {p1}, LKg6;->q()V

    iput-object p1, p0, Lco/bird/android/app/feature/rentalagreement/RentalAgreementActivity;->C:LCg6;

    return-void
.end method
