.class public final Lco/bird/android/widget/IssueView$a;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lco/bird/android/widget/IssueView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Landroid/view/View;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0008\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n\u00a2\u0006\u0002\u0008\u0004"
    }
    d2 = {
        "<anonymous>",
        "",
        "it",
        "Landroid/view/View;",
        "invoke"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field public final synthetic g:Lco/bird/android/widget/IssueView;


# direct methods
.method public constructor <init>(Lco/bird/android/widget/IssueView;)V
    .locals 0

    iput-object p1, p0, Lco/bird/android/widget/IssueView$a;->g:Lco/bird/android/widget/IssueView;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Landroid/view/View;

    invoke-virtual {p0, p1}, Lco/bird/android/widget/IssueView$a;->invoke(Landroid/view/View;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Landroid/view/View;)V
    .locals 2

    iget-object p1, p0, Lco/bird/android/widget/IssueView$a;->g:Lco/bird/android/widget/IssueView;

    invoke-virtual {p1}, Lco/bird/android/widget/IssueView;->f()Z

    move-result v0

    const/4 v1, 0x1

    xor-int/2addr v0, v1

    invoke-virtual {p1, v0}, Lco/bird/android/widget/IssueView;->setOn(Z)V

    iget-object p1, p0, Lco/bird/android/widget/IssueView$a;->g:Lco/bird/android/widget/IssueView;

    invoke-static {p1}, Lco/bird/android/widget/IssueView;->access$getSelectedSubject$p(Lco/bird/android/widget/IssueView;)Lio/reactivex/subjects/a;

    move-result-object p1

    iget-object v0, p0, Lco/bird/android/widget/IssueView$a;->g:Lco/bird/android/widget/IssueView;

    invoke-virtual {v0}, Lco/bird/android/widget/IssueView;->f()Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {p1, v0}, Lio/reactivex/subjects/a;->onNext(Ljava/lang/Object;)V

    iget-object p1, p0, Lco/bird/android/widget/IssueView$a;->g:Lco/bird/android/widget/IssueView;

    invoke-virtual {p1}, Lco/bird/android/widget/IssueView;->f()Z

    move-result p1

    if-ne p1, v1, :cond_0

    iget-object p1, p0, Lco/bird/android/widget/IssueView$a;->g:Lco/bird/android/widget/IssueView;

    invoke-virtual {p1}, Lco/bird/android/widget/SelectableButton;->c()V

    goto :goto_0

    :cond_0
    if-nez p1, :cond_1

    iget-object p1, p0, Lco/bird/android/widget/IssueView$a;->g:Lco/bird/android/widget/IssueView;

    invoke-virtual {p1}, Lco/bird/android/widget/SelectableButton;->b()V

    :cond_1
    :goto_0
    return-void
.end method
