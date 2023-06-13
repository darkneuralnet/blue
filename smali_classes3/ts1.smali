.class public final Lts1;
.super Lhc5;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lts1$a;,
        Lts1$b;,
        Lts1$c;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u000e\u0018\u0000 \u00182\u00020\u0001:\u0003\u0019\u001a\u001bB\u0007\u00a2\u0006\u0004\u0008\u0016\u0010\u0017J&\u0010\t\u001a\u0004\u0018\u00010\u00082\u0006\u0010\u0003\u001a\u00020\u00022\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016J\u001a\u0010\u000c\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u00082\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016J\u0008\u0010\r\u001a\u00020\u000bH\u0016R\"\u0010\u0015\u001a\u00020\u000e8\u0006@\u0006X\u0087.\u00a2\u0006\u0012\n\u0004\u0008\u000f\u0010\u0010\u001a\u0004\u0008\u0011\u0010\u0012\"\u0004\u0008\u0013\u0010\u0014\u00a8\u0006\u001c"
    }
    d2 = {
        "Lts1;",
        "Lhc5;",
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
        "LDs1;",
        "e",
        "LDs1;",
        "a5",
        "()LDs1;",
        "setPresenter",
        "(LDs1;)V",
        "presenter",
        "<init>",
        "()V",
        "f",
        "a",
        "b",
        "c",
        "flight-sheet_release"
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
        "SMAP\nFlightSheetBottomSheetFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FlightSheetBottomSheetFragment.kt\nco/bird/android/flightsheet/dialogs/FlightSheetBottomSheetFragment\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/android/lifecycle/KotlinExtensionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,124:1\n64#2:125\n1#3:126\n*S KotlinDebug\n*F\n+ 1 FlightSheetBottomSheetFragment.kt\nco/bird/android/flightsheet/dialogs/FlightSheetBottomSheetFragment\n*L\n64#1:125\n*E\n"
    }
.end annotation


# static fields
.field public static final f:Lts1$a;


# instance fields
.field public e:LDs1;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lts1$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lts1$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lts1;->f:Lts1$a;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lhc5;-><init>()V

    return-void
.end method


# virtual methods
.method public final a5()LDs1;
    .locals 1

    iget-object v0, p0, Lts1;->e:LDs1;

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

    const-string p2, "inflater"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, LPZ;->c(Landroid/view/LayoutInflater;)LPZ;

    move-result-object p1

    invoke-virtual {p1}, LPZ;->b()Landroid/widget/LinearLayout;

    move-result-object p1

    return-object p1
.end method

.method public onResume()V
    .locals 1

    invoke-super {p0}, Lmi1;->onResume()V

    invoke-virtual {p0}, Lts1;->a5()LDs1;

    move-result-object v0

    invoke-virtual {v0}, LDs1;->onResume()V

    return-void
.end method

.method public onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V
    .locals 13

    const-string p2, "view"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    move-result-object p2

    instance-of v0, p2, Lco/bird/android/core/base/BaseCoreActivity;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    check-cast p2, Lco/bird/android/core/base/BaseCoreActivity;

    move-object v5, p2

    goto :goto_0

    :cond_0
    move-object v5, v1

    :goto_0
    if-nez v5, :cond_1

    return-void

    :cond_1
    invoke-static {p1}, LPZ;->a(Landroid/view/View;)LPZ;

    move-result-object v7

    const-string p1, "bind(view)"

    invoke-static {v7, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, LGJ0;->a()Lts1$b$a;

    move-result-object v2

    const-string p1, "factory()"

    invoke-static {v2, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p1, LoG2;->a:LoG2;

    invoke-virtual {v5}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    move-result-object p2

    const-string v0, "activity.application"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1, p2}, LoG2;->a(Landroid/content/Context;)LlG2;

    move-result-object v3

    new-instance v4, Lts1$c;

    invoke-virtual {v5}, Lco/bird/android/core/base/BaseCoreActivity;->y()LTq4;

    move-result-object p1

    invoke-direct {v4, p1}, Lts1$c;-><init>(LTq4;)V

    sget-object p1, Ljy1;->b:Ljy1;

    invoke-static {p0, p1}, Lcom/uber/autodispose/android/lifecycle/AndroidLifecycleScopeProvider;->i(LLifecycleOwner;Lcom/uber/autodispose/lifecycle/CorrespondingEventsFunction;)Lcom/uber/autodispose/android/lifecycle/AndroidLifecycleScopeProvider;

    move-result-object v6

    const-string p1, "AndroidLifecycleScopePro\u2026m(this, boundaryResolver)"

    invoke-static {v6, p1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v8, LYs1;

    const/4 p1, 0x3

    invoke-direct {v8, v1, v1, p1, v1}, LYs1;-><init>(Landroidx/recyclerview/widget/RecyclerView$o;LEa;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getArguments()Landroid/os/Bundle;

    move-result-object p1

    const/4 p2, 0x0

    if-eqz p1, :cond_2

    const-string v0, "repair_flow"

    invoke-virtual {p1, v0, p2}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;Z)Z

    move-result p1

    move v9, p1

    goto :goto_1

    :cond_2
    move v9, p2

    :goto_1
    const/4 v10, 0x0

    const/16 v11, 0x80

    const/4 v12, 0x0

    invoke-static/range {v2 .. v12}, Lts1$b$a$a;->create$default(Lts1$b$a;LlG2;Lts1$c;Lco/bird/android/core/base/BaseCoreActivity;Lcom/uber/autodispose/ScopeProvider;LPZ;LYs1;ZLco/bird/android/model/constant/FlightSheetContext;ILjava/lang/Object;)Lts1$b;

    move-result-object p1

    invoke-interface {p1, p0}, Lts1$b;->a(Lts1;)V

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getArguments()Landroid/os/Bundle;

    move-result-object p1

    if-eqz p1, :cond_3

    const-string p2, "bird"

    invoke-virtual {p1, p2}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_3

    invoke-virtual {p0}, Lts1;->a5()LDs1;

    move-result-object p2

    invoke-virtual {p2, p1}, LDs1;->b(Ljava/lang/String;)V

    :cond_3
    return-void
.end method
