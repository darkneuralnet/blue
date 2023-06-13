.class public final Lco/bird/android/app/feature/nearbybirds/NearbyBirdsActivity;
.super Lco/bird/android/core/mvp/BaseActivity;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lco/bird/android/app/feature/nearbybirds/NearbyBirdsActivity$a;,
        Lco/bird/android/app/feature/nearbybirds/NearbyBirdsActivity$b;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\r\u0008\u0007\u0018\u0000 \"2\u00020\u0001:\u0002#$B\u0007\u00a2\u0006\u0004\u0008 \u0010!J\u0012\u0010\u0005\u001a\u00020\u00042\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014J\u0008\u0010\u0006\u001a\u00020\u0004H\u0014J\u0008\u0010\u0007\u001a\u00020\u0004H\u0014J\u0008\u0010\u0008\u001a\u00020\u0004H\u0016J\u0010\u0010\u000c\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016J\u0010\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0016R\"\u0010\u0017\u001a\u00020\u00108\u0006@\u0006X\u0087.\u00a2\u0006\u0012\n\u0004\u0008\u0011\u0010\u0012\u001a\u0004\u0008\u0013\u0010\u0014\"\u0004\u0008\u0015\u0010\u0016R\"\u0010\u001f\u001a\u00020\u00188\u0006@\u0006X\u0086.\u00a2\u0006\u0012\n\u0004\u0008\u0019\u0010\u001a\u001a\u0004\u0008\u001b\u0010\u001c\"\u0004\u0008\u001d\u0010\u001e\u00a8\u0006%"
    }
    d2 = {
        "Lco/bird/android/app/feature/nearbybirds/NearbyBirdsActivity;",
        "Lco/bird/android/core/mvp/BaseActivity;",
        "Landroid/os/Bundle;",
        "savedInstanceState",
        "",
        "onCreate",
        "onResume",
        "onDestroy",
        "onBackPressed",
        "Landroid/view/Menu;",
        "menu",
        "",
        "onCreateOptionsMenu",
        "Landroid/view/MenuItem;",
        "item",
        "onOptionsItemSelected",
        "Lu23;",
        "B",
        "Lu23;",
        "j0",
        "()Lu23;",
        "setPresenter",
        "(Lu23;)V",
        "presenter",
        "Ly23;",
        "C",
        "Ly23;",
        "k0",
        "()Ly23;",
        "m0",
        "(Ly23;)V",
        "ui",
        "<init>",
        "()V",
        "D",
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
        "SMAP\nNearbyBirdsActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NearbyBirdsActivity.kt\nco/bird/android/app/feature/nearbybirds/NearbyBirdsActivity\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/android/lifecycle/KotlinExtensionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,119:1\n44#2:120\n1#3:121\n*S KotlinDebug\n*F\n+ 1 NearbyBirdsActivity.kt\nco/bird/android/app/feature/nearbybirds/NearbyBirdsActivity\n*L\n49#1:120\n*E\n"
    }
.end annotation


# static fields
.field public static final D:Lco/bird/android/app/feature/nearbybirds/NearbyBirdsActivity$a;

.field public static final E:I


# instance fields
.field public B:Lu23;

.field public C:Ly23;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lco/bird/android/app/feature/nearbybirds/NearbyBirdsActivity$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lco/bird/android/app/feature/nearbybirds/NearbyBirdsActivity$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lco/bird/android/app/feature/nearbybirds/NearbyBirdsActivity;->D:Lco/bird/android/app/feature/nearbybirds/NearbyBirdsActivity$a;

    const/16 v0, 0x8

    sput v0, Lco/bird/android/app/feature/nearbybirds/NearbyBirdsActivity;->E:I

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
.method public final j0()Lu23;
    .locals 1

    iget-object v0, p0, Lco/bird/android/app/feature/nearbybirds/NearbyBirdsActivity;->B:Lu23;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "presenter"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public final k0()Ly23;
    .locals 1

    iget-object v0, p0, Lco/bird/android/app/feature/nearbybirds/NearbyBirdsActivity;->C:Ly23;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "ui"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public final m0(Ly23;)V
    .locals 1

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lco/bird/android/app/feature/nearbybirds/NearbyBirdsActivity;->C:Ly23;

    return-void
.end method

.method public onBackPressed()V
    .locals 1

    invoke-virtual {p0}, Lco/bird/android/app/feature/nearbybirds/NearbyBirdsActivity;->j0()Lu23;

    move-result-object v0

    invoke-virtual {v0}, Lu23;->T()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-super {p0}, Lco/bird/android/core/base/BaseCoreActivity;->onBackPressed()V

    :cond_0
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 8

    invoke-super {p0, p1}, Lco/bird/android/core/mvp/BaseActivity;->onCreate(Landroid/os/Bundle;)V

    sget p1, Lcj4;->activity_nearby_birds:I

    invoke-virtual {p0, p1}, Landroidx/appcompat/app/AppCompatActivity;->setContentView(I)V

    new-instance p1, Lz23;

    invoke-direct {p1, p0}, Lz23;-><init>(Lco/bird/android/core/mvp/BaseActivity;)V

    invoke-virtual {p0, p1}, Lco/bird/android/app/feature/nearbybirds/NearbyBirdsActivity;->m0(Ly23;)V

    invoke-static {}, Lco/bird/android/app/feature/nearbybirds/a;->a()Lco/bird/android/app/feature/nearbybirds/NearbyBirdsActivity$b$a;

    move-result-object v0

    sget-object p1, LoG2;->a:LoG2;

    invoke-virtual {p0}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    move-result-object v1

    const-string v2, "application"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1, v1}, LoG2;->a(Landroid/content/Context;)LlG2;

    move-result-object v1

    invoke-virtual {p0}, Lco/bird/android/app/feature/nearbybirds/NearbyBirdsActivity;->k0()Ly23;

    move-result-object v5

    const-string p1, "clipboard"

    invoke-virtual {p0, p1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    const-string v2, "null cannot be cast to non-null type android.content.ClipboardManager"

    invoke-static {p1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v3, p1

    check-cast v3, Landroid/content/ClipboardManager;

    invoke-static {p0}, Lcom/uber/autodispose/android/lifecycle/AndroidLifecycleScopeProvider;->b(LLifecycleOwner;)Lcom/uber/autodispose/android/lifecycle/AndroidLifecycleScopeProvider;

    move-result-object v4

    const-string p1, "AndroidLifecycleScopeProvider.from(this)"

    invoke-static {v4, p1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, Lio/reactivex/schedulers/a;->a()Lio/reactivex/E;

    move-result-object v6

    invoke-static {}, Lio/reactivex/schedulers/a;->a()Lio/reactivex/E;

    move-result-object v7

    const-string p1, "computation()"

    invoke-static {v6, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v7, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v2, p0

    invoke-interface/range {v0 .. v7}, Lco/bird/android/app/feature/nearbybirds/NearbyBirdsActivity$b$a;->a(LlG2;Lco/bird/android/core/mvp/BaseActivity;Landroid/content/ClipboardManager;Lcom/uber/autodispose/ScopeProvider;Ly23;Lio/reactivex/E;Lio/reactivex/E;)Lco/bird/android/app/feature/nearbybirds/NearbyBirdsActivity$b;

    move-result-object p1

    invoke-interface {p1, p0}, Lco/bird/android/app/feature/nearbybirds/NearbyBirdsActivity$b;->a(Lco/bird/android/app/feature/nearbybirds/NearbyBirdsActivity;)V

    invoke-virtual {p0}, Lco/bird/android/app/feature/nearbybirds/NearbyBirdsActivity;->j0()Lu23;

    move-result-object p1

    invoke-virtual {p0}, Landroid/app/Activity;->getCallingActivity()Landroid/content/ComponentName;

    move-result-object v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Lu23;->U(ZLandroid/os/Bundle;)V

    return-void
.end method

.method public onCreateOptionsMenu(Landroid/view/Menu;)Z
    .locals 3

    const-string v0, "menu"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Landroidx/appcompat/app/AppCompatActivity;->getMenuInflater()Landroid/view/MenuInflater;

    move-result-object v0

    sget v1, LUk4;->menu_nearby_birds:I

    invoke-virtual {v0, v1, p1}, Landroid/view/MenuInflater;->inflate(ILandroid/view/Menu;)V

    sget v0, LVg4;->infoButton:I

    invoke-interface {p1, v0}, Landroid/view/Menu;->findItem(I)Landroid/view/MenuItem;

    move-result-object v0

    invoke-interface {v0}, Landroid/view/MenuItem;->getIcon()Landroid/graphics/drawable/Drawable;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-static {v1}, LP61;->r(Landroid/graphics/drawable/Drawable;)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    if-eqz v1, :cond_1

    sget v2, LDf4;->white:I

    invoke-static {p0, v2}, LNA0;->c(Landroid/content/Context;I)I

    move-result v2

    invoke-static {v1, v2}, LP61;->n(Landroid/graphics/drawable/Drawable;I)V

    :cond_1
    invoke-interface {v0, v1}, Landroid/view/MenuItem;->setIcon(Landroid/graphics/drawable/Drawable;)Landroid/view/MenuItem;

    invoke-virtual {p0}, Lco/bird/android/app/feature/nearbybirds/NearbyBirdsActivity;->k0()Ly23;

    move-result-object v0

    invoke-interface {v0, p1}, Ly23;->Z0(Landroid/view/Menu;)V

    invoke-virtual {p0}, Lco/bird/android/app/feature/nearbybirds/NearbyBirdsActivity;->j0()Lu23;

    move-result-object p1

    invoke-virtual {p1}, Lu23;->b0()V

    const/4 p1, 0x1

    return p1
.end method

.method public onDestroy()V
    .locals 1

    invoke-super {p0}, Lco/bird/android/core/mvp/BaseActivity;->onDestroy()V

    invoke-virtual {p0}, Lco/bird/android/app/feature/nearbybirds/NearbyBirdsActivity;->j0()Lu23;

    move-result-object v0

    invoke-virtual {v0}, Lu23;->d0()V

    return-void
.end method

.method public onOptionsItemSelected(Landroid/view/MenuItem;)Z
    .locals 1

    const-string v0, "item"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lco/bird/android/app/feature/nearbybirds/NearbyBirdsActivity;->j0()Lu23;

    move-result-object v0

    invoke-virtual {v0, p1}, Lu23;->e0(Landroid/view/MenuItem;)Z

    move-result v0

    if-nez v0, :cond_1

    invoke-super {p0, p1}, Lco/bird/android/core/mvp/BaseActivity;->onOptionsItemSelected(Landroid/view/MenuItem;)Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    :goto_1
    return p1
.end method

.method public onResume()V
    .locals 1

    invoke-super {p0}, Lco/bird/android/core/base/BaseCoreActivity;->onResume()V

    invoke-virtual {p0}, Lco/bird/android/app/feature/nearbybirds/NearbyBirdsActivity;->j0()Lu23;

    move-result-object v0

    invoke-virtual {v0}, Lu23;->j0()V

    return-void
.end method
