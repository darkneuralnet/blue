.class public final Lz65$h;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lz65;-><init>(Lgl;LYR4;Lw65;Lp65;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function3<",
        "Landroid/view/View;",
        "Lcom/uber/autodispose/ScopeProvider;",
        "Lco/bird/android/library/flow/FlowActivity;",
        "Llv1;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n\u00a2\u0006\u0004\u0008\u0007\u0010\u0008"
    }
    d2 = {
        "Landroid/view/View;",
        "rootView",
        "Lcom/uber/autodispose/ScopeProvider;",
        "scopeProvider",
        "Lco/bird/android/library/flow/FlowActivity;",
        "activity",
        "Llv1;",
        "a",
        "(Landroid/view/View;Lcom/uber/autodispose/ScopeProvider;Lco/bird/android/library/flow/FlowActivity;)Llv1;"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:Lz65;


# direct methods
.method public constructor <init>(Lz65;)V
    .locals 0

    iput-object p1, p0, Lz65$h;->g:Lz65;

    const/4 p1, 0x3

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Landroid/view/View;Lcom/uber/autodispose/ScopeProvider;Lco/bird/android/library/flow/FlowActivity;)Llv1;
    .locals 2

    const-string v0, "rootView"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "scopeProvider"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "activity"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lz65$h;->g:Lz65;

    invoke-static {v0}, Lz65;->access$currentBird(Lz65;)Lco/bird/android/model/wire/WireBird;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lco/bird/android/model/wire/WireBird;->getModel()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v1, p0, Lz65$h;->g:Lz65;

    invoke-static {v1}, Lz65;->access$getPreference$p(Lz65;)Lgl;

    move-result-object v1

    invoke-virtual {v1, v0}, Lgl;->T2(Ljava/lang/String;)V

    :cond_0
    iget-object v0, p0, Lz65$h;->g:Lz65;

    invoke-static {v0}, Lz65;->access$getRiderTutorialPresenterFactory$p(Lz65;)Lw65;

    move-result-object v0

    new-instance v1, Ldb5;

    invoke-direct {v1, p3, p1}, Ldb5;-><init>(Lco/bird/android/core/mvp/BaseActivity;Landroid/view/View;)V

    iget-object p1, p0, Lz65$h;->g:Lz65;

    invoke-static {p1}, Lz65;->access$currentBird(Lz65;)Lco/bird/android/model/wire/WireBird;

    move-result-object p1

    if-eqz p1, :cond_1

    invoke-static {p1}, LF65;->a(Lco/bird/android/model/wire/WireBird;)Lco/bird/android/model/ridertutorial/TutorialKind;

    move-result-object p1

    if-nez p1, :cond_2

    :cond_1
    sget-object p1, Lco/bird/android/model/ridertutorial/TutorialKind;->CLASS_SCOOTER:Lco/bird/android/model/ridertutorial/TutorialKind;

    :cond_2
    invoke-interface {v0, p2, v1, p1}, Lw65;->a(Lcom/uber/autodispose/ScopeProvider;LZa5;Lco/bird/android/model/ridertutorial/TutorialKind;)Lv65;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Landroid/view/View;

    check-cast p2, Lcom/uber/autodispose/ScopeProvider;

    check-cast p3, Lco/bird/android/library/flow/FlowActivity;

    invoke-virtual {p0, p1, p2, p3}, Lz65$h;->a(Landroid/view/View;Lcom/uber/autodispose/ScopeProvider;Lco/bird/android/library/flow/FlowActivity;)Llv1;

    move-result-object p1

    return-object p1
.end method
