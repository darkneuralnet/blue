.class public final LKS1$a$a;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LKS1$a;-><init>(LKS1;Landroid/view/View;)V
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

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nIdentificationAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IdentificationAdapter.kt\nco/bird/android/feature/identification/adapters/IdentificationAdapter$DebugViewHolder$1\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,165:1\n18#2:166\n9#3,4:167\n*S KotlinDebug\n*F\n+ 1 IdentificationAdapter.kt\nco/bird/android/feature/identification/adapters/IdentificationAdapter$DebugViewHolder$1\n*L\n133#1:166\n133#1:167,4\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic g:LKS1;

.field public final synthetic h:LKS1$a;


# direct methods
.method public constructor <init>(LKS1;LKS1$a;)V
    .locals 0

    iput-object p1, p0, LKS1$a$a;->g:LKS1;

    iput-object p2, p0, LKS1$a$a;->h:LKS1$a;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Landroid/view/View;

    invoke-virtual {p0, p1}, LKS1$a$a;->invoke(Landroid/view/View;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Landroid/view/View;)V
    .locals 3

    iget-object p1, p0, LKS1$a$a;->g:LKS1;

    invoke-static {p1}, LKS1;->access$getAdapterData(LKS1;)LE6;

    move-result-object p1

    iget-object v0, p0, LKS1$a$a;->h:LKS1$a;

    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView$D;->getAdapterPosition()I

    move-result v0

    invoke-virtual {p1, v0}, LE6;->e(I)LG6;

    move-result-object p1

    invoke-virtual {p1}, LG6;->c()Ljava/lang/Object;

    move-result-object p1

    instance-of v0, p1, LhT1;

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    check-cast p1, LhT1;

    if-eqz p1, :cond_5

    invoke-virtual {p1}, LhT1;->d()LgT1;

    move-result-object p1

    if-eqz p1, :cond_5

    iget-object v0, p0, LKS1$a$a;->g:LKS1;

    instance-of v1, p1, Lgg6;

    if-eqz v1, :cond_1

    invoke-static {v0}, LKS1;->access$getUserAgeClicksSubject$p(LKS1;)Lio/reactivex/subjects/d;

    move-result-object v0

    check-cast p1, Lgg6;

    invoke-virtual {p1}, Lgg6;->c()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {v0, p1}, Lio/reactivex/subjects/d;->onNext(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    instance-of v1, p1, Lui1;

    if-eqz v1, :cond_2

    invoke-static {v0}, LKS1;->access$getExpirationClicksSubject$p(LKS1;)Lio/reactivex/subjects/d;

    move-result-object v0

    check-cast p1, Lui1;

    invoke-virtual {p1}, Lui1;->c()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {v0, p1}, Lio/reactivex/subjects/d;->onNext(Ljava/lang/Object;)V

    goto :goto_1

    :cond_2
    instance-of v1, p1, LYm5;

    if-eqz v1, :cond_3

    invoke-static {v0}, LKS1;->access$getScoreClicksSubject$p(LKS1;)Lio/reactivex/subjects/d;

    move-result-object v0

    check-cast p1, LYm5;

    invoke-virtual {p1}, LYm5;->c()D

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object p1

    invoke-virtual {v0, p1}, Lio/reactivex/subjects/d;->onNext(Ljava/lang/Object;)V

    goto :goto_1

    :cond_3
    instance-of v1, p1, LY12;

    if-eqz v1, :cond_4

    invoke-static {v0}, LKS1;->access$getIngestionResultsClicksSubject$p(LKS1;)Lio/reactivex/subjects/d;

    move-result-object v0

    check-cast p1, LY12;

    invoke-virtual {p1}, LY12;->c()Lco/bird/android/model/identification/IdentificationIngestionResult;

    move-result-object p1

    invoke-virtual {v0, p1}, Lio/reactivex/subjects/d;->onNext(Ljava/lang/Object;)V

    goto :goto_1

    :cond_4
    instance-of v1, p1, LKq5;

    if-eqz v1, :cond_5

    invoke-static {v0}, LKS1;->access$getSecondsToResultClicksSubject$p(LKS1;)Lio/reactivex/subjects/d;

    move-result-object v0

    check-cast p1, LKq5;

    invoke-virtual {p1}, LKq5;->c()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {v0, p1}, Lio/reactivex/subjects/d;->onNext(Ljava/lang/Object;)V

    :cond_5
    :goto_1
    return-void
.end method
