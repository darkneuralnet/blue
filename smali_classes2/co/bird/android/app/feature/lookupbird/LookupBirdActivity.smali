.class public final Lco/bird/android/app/feature/lookupbird/LookupBirdActivity;
.super Lco/bird/android/core/mvp/BaseActivity;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\n\u0008\u0007\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\"\u0010#J\u0012\u0010\u0005\u001a\u00020\u00042\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014J\u0010\u0010\t\u001a\u00020\u00082\u0006\u0010\u0007\u001a\u00020\u0006H\u0016R\"\u0010\u0011\u001a\u00020\n8\u0006@\u0006X\u0087.\u00a2\u0006\u0012\n\u0004\u0008\u000b\u0010\u000c\u001a\u0004\u0008\r\u0010\u000e\"\u0004\u0008\u000f\u0010\u0010R\"\u0010\u0019\u001a\u00020\u00128\u0006@\u0006X\u0086.\u00a2\u0006\u0012\n\u0004\u0008\u0013\u0010\u0014\u001a\u0004\u0008\u0015\u0010\u0016\"\u0004\u0008\u0017\u0010\u0018R\"\u0010!\u001a\u00020\u001a8\u0006@\u0006X\u0086.\u00a2\u0006\u0012\n\u0004\u0008\u001b\u0010\u001c\u001a\u0004\u0008\u001d\u0010\u001e\"\u0004\u0008\u001f\u0010 \u00a8\u0006$"
    }
    d2 = {
        "Lco/bird/android/app/feature/lookupbird/LookupBirdActivity;",
        "Lco/bird/android/core/mvp/BaseActivity;",
        "Landroid/os/Bundle;",
        "savedInstanceState",
        "",
        "onCreate",
        "Landroid/view/Menu;",
        "menu",
        "",
        "onCreateOptionsMenu",
        "LgD2;",
        "B",
        "LgD2;",
        "j0",
        "()LgD2;",
        "setFactory",
        "(LgD2;)V",
        "factory",
        "LZC2;",
        "C",
        "LZC2;",
        "k0",
        "()LZC2;",
        "n0",
        "(LZC2;)V",
        "presenter",
        "LjD2;",
        "D",
        "LjD2;",
        "m0",
        "()LjD2;",
        "o0",
        "(LjD2;)V",
        "ui",
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
.field public B:LgD2;

.field public C:LZC2;

.field public D:LjD2;


# direct methods
.method public static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 6

    const/4 v1, 0x0

    const/4 v2, 0x0

    sget-object v3, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    const/4 v4, 0x3

    const/4 v5, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v5}, Lco/bird/android/core/mvp/BaseActivity;-><init>(ZLjava/lang/Integer;Ljava/lang/Boolean;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method


# virtual methods
.method public final j0()LgD2;
    .locals 1

    iget-object v0, p0, Lco/bird/android/app/feature/lookupbird/LookupBirdActivity;->B:LgD2;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "factory"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public final k0()LZC2;
    .locals 1

    iget-object v0, p0, Lco/bird/android/app/feature/lookupbird/LookupBirdActivity;->C:LZC2;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "presenter"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public final m0()LjD2;
    .locals 1

    iget-object v0, p0, Lco/bird/android/app/feature/lookupbird/LookupBirdActivity;->D:LjD2;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "ui"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public final n0(LZC2;)V
    .locals 1

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lco/bird/android/app/feature/lookupbird/LookupBirdActivity;->C:LZC2;

    return-void
.end method

.method public final o0(LjD2;)V
    .locals 1

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lco/bird/android/app/feature/lookupbird/LookupBirdActivity;->D:LjD2;

    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 3

    invoke-super {p0, p1}, Lco/bird/android/core/mvp/BaseActivity;->onCreate(Landroid/os/Bundle;)V

    sget-object p1, LH22;->a:LH22;

    invoke-virtual {p1, p0}, LH22;->p2(Lco/bird/android/app/feature/lookupbird/LookupBirdActivity;)V

    sget p1, Lcj4;->activity_lookup_bird:I

    invoke-virtual {p0, p1}, Landroidx/appcompat/app/AppCompatActivity;->setContentView(I)V

    new-instance p1, LkD2;

    invoke-direct {p1, p0}, LkD2;-><init>(Lco/bird/android/core/mvp/BaseActivity;)V

    invoke-virtual {p0, p1}, Lco/bird/android/app/feature/lookupbird/LookupBirdActivity;->o0(LjD2;)V

    invoke-virtual {p0}, Lco/bird/android/app/feature/lookupbird/LookupBirdActivity;->j0()LgD2;

    move-result-object p1

    invoke-virtual {p0}, Lco/bird/android/core/mvp/BaseActivity;->Z()Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;

    move-result-object v0

    invoke-virtual {p0}, Lco/bird/android/app/feature/lookupbird/LookupBirdActivity;->m0()LjD2;

    move-result-object v1

    invoke-virtual {p0}, Lco/bird/android/core/mvp/BaseActivity;->w()Le13;

    move-result-object v2

    invoke-interface {p1, v0, v1, v2}, LgD2;->a(Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;LjD2;Le13;)LfD2;

    move-result-object p1

    invoke-virtual {p1}, LfD2;->a()V

    invoke-virtual {p0, p1}, Lco/bird/android/app/feature/lookupbird/LookupBirdActivity;->n0(LZC2;)V

    invoke-virtual {p0}, Lco/bird/android/app/feature/lookupbird/LookupBirdActivity;->k0()LZC2;

    move-result-object p1

    invoke-interface {p1}, LZC2;->a()V

    return-void
.end method

.method public onCreateOptionsMenu(Landroid/view/Menu;)Z
    .locals 3

    const-string v0, "menu"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Landroidx/appcompat/app/AppCompatActivity;->getMenuInflater()Landroid/view/MenuInflater;

    move-result-object v0

    sget v1, LUk4;->menu_bird_search:I

    invoke-virtual {v0, v1, p1}, Landroid/view/MenuInflater;->inflate(ILandroid/view/Menu;)V

    sget v0, LVg4;->next:I

    invoke-interface {p1, v0}, Landroid/view/Menu;->findItem(I)Landroid/view/MenuItem;

    move-result-object v0

    invoke-virtual {p0}, Lco/bird/android/app/feature/lookupbird/LookupBirdActivity;->m0()LjD2;

    move-result-object v1

    const-string v2, "item"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v1, v0}, LjD2;->t0(Landroid/view/MenuItem;)V

    invoke-virtual {p0}, Lco/bird/android/app/feature/lookupbird/LookupBirdActivity;->k0()LZC2;

    move-result-object v0

    invoke-interface {v0}, LZC2;->c()V

    invoke-super {p0, p1}, Lco/bird/android/core/mvp/BaseActivity;->onCreateOptionsMenu(Landroid/view/Menu;)Z

    move-result p1

    return p1
.end method
