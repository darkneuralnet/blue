.class public final Lco/bird/android/library/flow/FlowActivity$b;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lco/bird/android/library/flow/FlowActivity;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function0<",
        "LJu1;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0001\u0010\u0002"
    }
    d2 = {
        "LJu1;",
        "b",
        "()LJu1;"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nFlowActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FlowActivity.kt\nco/bird/android/library/flow/FlowActivity$presenter$2\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/android/lifecycle/KotlinExtensionsKt\n*L\n1#1,136:1\n44#2:137\n*S KotlinDebug\n*F\n+ 1 FlowActivity.kt\nco/bird/android/library/flow/FlowActivity$presenter$2\n*L\n22#1:137\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic g:Lco/bird/android/library/flow/FlowActivity;


# direct methods
.method public constructor <init>(Lco/bird/android/library/flow/FlowActivity;)V
    .locals 0

    iput-object p1, p0, Lco/bird/android/library/flow/FlowActivity$b;->g:Lco/bird/android/library/flow/FlowActivity;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final b()LJu1;
    .locals 6

    new-instance v0, LJu1;

    iget-object v1, p0, Lco/bird/android/library/flow/FlowActivity$b;->g:Lco/bird/android/library/flow/FlowActivity;

    invoke-virtual {v1}, Lco/bird/android/library/flow/FlowActivity;->getCoordinator()LMu1;

    move-result-object v1

    invoke-virtual {v1}, LMu1;->a()Ljava/util/List;

    move-result-object v1

    new-instance v2, LLu1;

    iget-object v3, p0, Lco/bird/android/library/flow/FlowActivity$b;->g:Lco/bird/android/library/flow/FlowActivity;

    invoke-virtual {v3}, Landroidx/fragment/app/FragmentActivity;->getSupportFragmentManager()Landroidx/fragment/app/FragmentManager;

    move-result-object v4

    const-string v5, "supportFragmentManager"

    invoke-static {v4, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v2, v3, v4}, LLu1;-><init>(Lco/bird/android/library/flow/FlowActivity;Landroidx/fragment/app/FragmentManager;)V

    iget-object v3, p0, Lco/bird/android/library/flow/FlowActivity$b;->g:Lco/bird/android/library/flow/FlowActivity;

    invoke-static {v3}, Lcom/uber/autodispose/android/lifecycle/AndroidLifecycleScopeProvider;->b(LLifecycleOwner;)Lcom/uber/autodispose/android/lifecycle/AndroidLifecycleScopeProvider;

    move-result-object v3

    const-string v4, "AndroidLifecycleScopeProvider.from(this)"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v4, p0, Lco/bird/android/library/flow/FlowActivity$b;->g:Lco/bird/android/library/flow/FlowActivity;

    invoke-virtual {v4}, Lco/bird/android/core/mvp/BaseActivity;->w()Le13;

    move-result-object v4

    invoke-direct {v0, v1, v2, v3, v4}, LJu1;-><init>(Ljava/util/List;LLu1;Lcom/uber/autodispose/ScopeProvider;Le13;)V

    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lco/bird/android/library/flow/FlowActivity$b;->b()LJu1;

    move-result-object v0

    return-object v0
.end method
