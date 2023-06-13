.class public final LXk6;
.super Landroidx/fragment/app/Fragment;
.source "SourceFile"

# interfaces
.implements Lut4;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LXk6$a;,
        LXk6$b;,
        LXk6$c;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0008\u0018\u0000 \u001e2\u00020\u00012\u00020\u0002:\u0003\u001f\u0011\u0019B\u0007\u00a2\u0006\u0004\u0008\u001c\u0010\u001dJ&\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0004\u001a\u00020\u00032\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0007H\u0016J\u001a\u0010\r\u001a\u00020\u000c2\u0006\u0010\u000b\u001a\u00020\t2\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0007H\u0016J\u0008\u0010\u000e\u001a\u00020\u000cH\u0016J\u0008\u0010\u000f\u001a\u00020\u000cH\u0016R\"\u0010\u0017\u001a\u00020\u00108\u0006@\u0006X\u0087.\u00a2\u0006\u0012\n\u0004\u0008\u0011\u0010\u0012\u001a\u0004\u0008\u0013\u0010\u0014\"\u0004\u0008\u0015\u0010\u0016R\u0016\u0010\u001b\u001a\u00020\u00188\u0002@\u0002X\u0082.\u00a2\u0006\u0006\n\u0004\u0008\u0019\u0010\u001a\u00a8\u0006 "
    }
    d2 = {
        "LXk6;",
        "Landroidx/fragment/app/Fragment;",
        "Lut4;",
        "Landroid/view/LayoutInflater;",
        "inflater",
        "Landroid/view/ViewGroup;",
        "container",
        "Landroid/os/Bundle;",
        "savedInstanceState",
        "Landroid/view/View;",
        "onCreateView",
        "view",
        "",
        "onViewCreated",
        "onResume",
        "refresh",
        "Lal6;",
        "b",
        "Lal6;",
        "a5",
        "()Lal6;",
        "setPresenter",
        "(Lal6;)V",
        "presenter",
        "Lkn0;",
        "c",
        "Lkn0;",
        "commandCenterComponent",
        "<init>",
        "()V",
        "d",
        "a",
        "co.bird.android.feature.commandcenter"
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
        "SMAP\nVehicleDetailsFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VehicleDetailsFragment.kt\nco/bird/android/feature/commandcenter/vehicledetails/VehicleDetailsFragment\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/android/lifecycle/KotlinExtensionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,118:1\n64#2:119\n1#3:120\n*S KotlinDebug\n*F\n+ 1 VehicleDetailsFragment.kt\nco/bird/android/feature/commandcenter/vehicledetails/VehicleDetailsFragment\n*L\n62#1:119\n*E\n"
    }
.end annotation


# static fields
.field public static final d:LXk6$a;


# instance fields
.field public b:Lal6;

.field public c:Lkn0;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, LXk6$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LXk6$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, LXk6;->d:LXk6$a;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Landroidx/fragment/app/Fragment;-><init>()V

    return-void
.end method


# virtual methods
.method public final a5()Lal6;
    .locals 1

    iget-object v0, p0, LXk6;->b:Lal6;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "presenter"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 0

    const-string p3, "inflater"

    invoke-static {p1, p3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p3, 0x0

    invoke-static {p1, p2, p3}, LDy1;->d(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)LDy1;

    move-result-object p1

    invoke-virtual {p1}, LDy1;->b()Landroidx/recyclerview/widget/RecyclerView;

    move-result-object p1

    return-object p1
.end method

.method public onResume()V
    .locals 1

    invoke-super {p0}, Landroidx/fragment/app/Fragment;->onResume()V

    invoke-virtual {p0}, LXk6;->a5()Lal6;

    move-result-object v0

    invoke-interface {v0}, Luo0;->onResume()V

    return-void
.end method

.method public onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V
    .locals 6

    const-string p2, "view"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, LDy1;->a(Landroid/view/View;)LDy1;

    move-result-object v5

    const-string p1, "bind(view)"

    invoke-static {v5, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    move-result-object p1

    instance-of p2, p1, Lco/bird/android/core/mvp/BaseActivity;

    const/4 v0, 0x0

    if-eqz p2, :cond_0

    check-cast p1, Lco/bird/android/core/mvp/BaseActivity;

    move-object v3, p1

    goto :goto_0

    :cond_0
    move-object v3, v0

    :goto_0
    if-nez v3, :cond_1

    return-void

    :cond_1
    sget-object p1, Lun0;->a:Lun0;

    invoke-virtual {v3}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    move-result-object p2

    const-string v1, "activity.application"

    invoke-static {p2, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1, p2}, Lun0;->a(Landroid/app/Application;)Lkn0;

    move-result-object p1

    iput-object p1, p0, LXk6;->c:Lkn0;

    invoke-static {}, LsR0;->a()LXk6$b$a;

    move-result-object p1

    sget-object p2, LoG2;->a:LoG2;

    invoke-virtual {v3}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    move-result-object v2

    invoke-static {v2, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p2, v2}, LoG2;->a(Landroid/content/Context;)LlG2;

    move-result-object v1

    iget-object p2, p0, LXk6;->c:Lkn0;

    if-nez p2, :cond_2

    const-string p2, "commandCenterComponent"

    invoke-static {p2}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v2, v0

    goto :goto_1

    :cond_2
    move-object v2, p2

    :goto_1
    sget-object p2, Ljy1;->b:Ljy1;

    invoke-static {p0, p2}, Lcom/uber/autodispose/android/lifecycle/AndroidLifecycleScopeProvider;->i(LLifecycleOwner;Lcom/uber/autodispose/lifecycle/CorrespondingEventsFunction;)Lcom/uber/autodispose/android/lifecycle/AndroidLifecycleScopeProvider;

    move-result-object v4

    const-string p2, "AndroidLifecycleScopePro\u2026m(this, boundaryResolver)"

    invoke-static {v4, p2}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v0, p1

    invoke-interface/range {v0 .. v5}, LXk6$b$a;->a(LlG2;Lkn0;Lco/bird/android/core/mvp/BaseActivity;Lcom/uber/autodispose/ScopeProvider;LDy1;)LXk6$b;

    move-result-object p1

    invoke-interface {p1, p0}, LXk6$b;->a(LXk6;)V

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getArguments()Landroid/os/Bundle;

    move-result-object p1

    if-eqz p1, :cond_3

    const-string p2, "bird"

    invoke-virtual {p1, p2}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object p1

    check-cast p1, Lco/bird/android/model/wire/WireBird;

    if-eqz p1, :cond_3

    invoke-virtual {p1}, Lco/bird/android/model/wire/WireBird;->getId()Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_3

    invoke-virtual {p0}, LXk6;->a5()Lal6;

    move-result-object p2

    invoke-interface {p2, p1}, Luo0;->u1(Ljava/lang/String;)V

    :cond_3
    return-void
.end method

.method public refresh()V
    .locals 1

    invoke-virtual {p0}, LXk6;->a5()Lal6;

    move-result-object v0

    invoke-interface {v0}, LXm0;->refresh()V

    return-void
.end method
