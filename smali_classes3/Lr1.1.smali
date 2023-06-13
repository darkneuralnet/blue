.class public final LLr1;
.super Landroidx/fragment/app/Fragment;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LLr1$a;,
        LLr1$b;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u000c\u0018\u0000 \u001b2\u00020\u0001:\u0002\u001c\u0012B\u0007\u00a2\u0006\u0004\u0008\u0019\u0010\u001aJ&\u0010\t\u001a\u0004\u0018\u00010\u00082\u0006\u0010\u0003\u001a\u00020\u00022\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016J\u001a\u0010\u000c\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u00082\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016J\u0008\u0010\r\u001a\u00020\u000bH\u0016J\u0010\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016R\"\u0010\u0018\u001a\u00020\u00118\u0006@\u0006X\u0087.\u00a2\u0006\u0012\n\u0004\u0008\u0012\u0010\u0013\u001a\u0004\u0008\u0014\u0010\u0015\"\u0004\u0008\u0016\u0010\u0017\u00a8\u0006\u001d"
    }
    d2 = {
        "LLr1;",
        "Landroidx/fragment/app/Fragment;",
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
        "",
        "hidden",
        "onHiddenChanged",
        "LTr1;",
        "b",
        "LTr1;",
        "a5",
        "()LTr1;",
        "setPresenter",
        "(LTr1;)V",
        "presenter",
        "<init>",
        "()V",
        "c",
        "a",
        "co.bird.android.feature.fleet-status"
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
        "SMAP\nFleetsOverviewFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FleetsOverviewFragment.kt\nco/bird/android/feature/fleetstatus/common/fleets/FleetsOverviewFragment\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/android/lifecycle/KotlinExtensionsKt\n+ 3 Bundle+.kt\nco/bird/android/library/extension/Bundle_Kt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 Enum+.kt\nco/bird/android/library/extension/Enum_Kt\n+ 6 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,89:1\n64#2:90\n6#3:91\n1#4:92\n13#5,2:93\n15#5,2:97\n1109#6,2:95\n*S KotlinDebug\n*F\n+ 1 FleetsOverviewFragment.kt\nco/bird/android/feature/fleetstatus/common/fleets/FleetsOverviewFragment\n*L\n52#1:90\n54#1:91\n54#1:92\n54#1:93,2\n54#1:97,2\n54#1:95,2\n*E\n"
    }
.end annotation


# static fields
.field public static final c:LLr1$a;


# instance fields
.field public b:LTr1;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, LLr1$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LLr1$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, LLr1;->c:LLr1$a;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Landroidx/fragment/app/Fragment;-><init>()V

    return-void
.end method


# virtual methods
.method public final a5()LTr1;
    .locals 1

    iget-object v0, p0, LLr1;->b:LTr1;

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

    invoke-static {p1}, Lhy1;->c(Landroid/view/LayoutInflater;)Lhy1;

    move-result-object p1

    invoke-virtual {p1}, Lhy1;->b()Landroid/widget/FrameLayout;

    move-result-object p1

    return-object p1
.end method

.method public onHiddenChanged(Z)V
    .locals 0

    invoke-super {p0, p1}, Landroidx/fragment/app/Fragment;->onHiddenChanged(Z)V

    if-nez p1, :cond_0

    invoke-virtual {p0}, LLr1;->a5()LTr1;

    move-result-object p1

    invoke-virtual {p1}, LTr1;->k()V

    :cond_0
    return-void
.end method

.method public onResume()V
    .locals 1

    invoke-super {p0}, Landroidx/fragment/app/Fragment;->onResume()V

    invoke-virtual {p0}, LLr1;->a5()LTr1;

    move-result-object v0

    invoke-virtual {v0}, LTr1;->g()V

    return-void
.end method

.method public onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V
    .locals 16

    move-object/from16 v0, p0

    const-string v1, "Array contains no element matching the predicate."

    const-class v2, Lmp1;

    const-string v3, "view"

    move-object/from16 v4, p1

    invoke-static {v4, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static/range {p1 .. p1}, Lhy1;->a(Landroid/view/View;)Lhy1;

    move-result-object v9

    const-string v3, "bind(view)"

    invoke-static {v9, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual/range {p0 .. p0}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    move-result-object v3

    instance-of v4, v3, Lco/bird/android/feature/fleetstatus/common/FleetActivity;

    const/4 v5, 0x0

    if-eqz v4, :cond_0

    check-cast v3, Lco/bird/android/feature/fleetstatus/common/FleetActivity;

    move-object v7, v3

    goto :goto_0

    :cond_0
    move-object v7, v5

    :goto_0
    if-nez v7, :cond_1

    return-void

    :cond_1
    invoke-static {}, LyJ0;->a()LLr1$b$a;

    move-result-object v4

    sget-object v3, LoG2;->a:LoG2;

    invoke-virtual {v7}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    move-result-object v6

    const-string v8, "activity.application"

    invoke-static {v6, v8}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v3, v6}, LoG2;->a(Landroid/content/Context;)LlG2;

    move-result-object v3

    invoke-virtual {v7}, Lco/bird/android/feature/fleetstatus/common/FleetActivity;->j0()Lco/bird/android/feature/fleetstatus/common/FleetActivity$a;

    move-result-object v6

    sget-object v8, Ljy1;->b:Ljy1;

    invoke-static {v0, v8}, Lcom/uber/autodispose/android/lifecycle/AndroidLifecycleScopeProvider;->i(LLifecycleOwner;Lcom/uber/autodispose/lifecycle/CorrespondingEventsFunction;)Lcom/uber/autodispose/android/lifecycle/AndroidLifecycleScopeProvider;

    move-result-object v8

    const-string v10, "AndroidLifecycleScopePro\u2026m(this, boundaryResolver)"

    invoke-static {v8, v10}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual/range {p0 .. p0}, Landroidx/fragment/app/Fragment;->getArguments()Landroid/os/Bundle;

    move-result-object v10

    if-eqz v10, :cond_8

    const-string v11, "fleet_overview_purpose"

    invoke-virtual {v10, v11}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    if-eqz v10, :cond_6

    :try_start_0
    invoke-virtual {v2}, Ljava/lang/Class;->getEnumConstants()[Ljava/lang/Object;

    move-result-object v11

    invoke-static {v11}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    array-length v12, v11

    const/4 v13, 0x0

    :goto_1
    if-ge v13, v12, :cond_3

    aget-object v14, v11, v13

    move-object v15, v14

    check-cast v15, Ljava/lang/Enum;

    invoke-virtual {v15}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v15

    const/4 v5, 0x1

    invoke-static {v15, v10, v5}, Lkotlin/text/StringsKt;->equals(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v5

    if-eqz v5, :cond_2

    const-string v5, "{\n    E::class.java.enum\u2026.equals(name, true) }\n  }"

    invoke-static {v14, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v14, Ljava/lang/Enum;

    move-object v5, v14

    goto :goto_3

    :cond_2
    add-int/lit8 v13, v13, 0x1

    goto :goto_1

    :cond_3
    new-instance v5, Ljava/util/NoSuchElementException;

    invoke-direct {v5, v1}, Ljava/util/NoSuchElementException;-><init>(Ljava/lang/String;)V

    throw v5
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    invoke-virtual {v2}, Ljava/lang/Class;->getEnumConstants()[Ljava/lang/Object;

    move-result-object v2

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    array-length v5, v2

    const/4 v10, 0x0

    :goto_2
    if-ge v10, v5, :cond_5

    aget-object v11, v2, v10

    move-object v12, v11

    check-cast v12, Ljava/lang/Enum;

    invoke-virtual {v12}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v13

    const-string v14, "UNKNOWN"

    invoke-static {v13, v14}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_4

    const-string v1, "{\n    E::class.java.enum\u2026m.name == \"UNKNOWN\" }\n  }"

    invoke-static {v11, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v5, v12

    goto :goto_3

    :cond_4
    add-int/lit8 v10, v10, 0x1

    goto :goto_2

    :cond_5
    new-instance v2, Ljava/util/NoSuchElementException;

    invoke-direct {v2, v1}, Ljava/util/NoSuchElementException;-><init>(Ljava/lang/String;)V

    throw v2

    :cond_6
    :goto_3
    check-cast v5, Lmp1;

    if-nez v5, :cond_7

    goto :goto_4

    :cond_7
    move-object v10, v5

    goto :goto_5

    :cond_8
    :goto_4
    sget-object v1, Lmp1;->b:Lmp1;

    move-object v10, v1

    :goto_5
    move-object v5, v3

    invoke-interface/range {v4 .. v10}, LLr1$b$a;->a(LlG2;Lco/bird/android/feature/fleetstatus/common/FleetActivity$a;Lco/bird/android/core/mvp/BaseActivity;Lcom/uber/autodispose/ScopeProvider;Lhy1;Lmp1;)LLr1$b;

    move-result-object v1

    invoke-interface {v1, v0}, LLr1$b;->a(LLr1;)V

    return-void
.end method
