.class public final LlF$b;
.super Lw1;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LlF;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "b"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\n\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0007\u0010\u0008\u00a8\u0006\u000e"
    }
    d2 = {
        "LlF$b;",
        "Lw1;",
        "",
        "position",
        "",
        "bind",
        "Landroid/widget/Button;",
        "b",
        "Landroid/widget/Button;",
        "button",
        "Landroid/view/View;",
        "view",
        "<init>",
        "(LlF;Landroid/view/View;)V",
        "servicecenter_release"
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
        "SMAP\nBatchSearchAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BatchSearchAdapter.kt\nco/bird/android/feature/servicecenter/batches/batchsearch/BatchSearchAdapter$ButtonViewHolder\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,92:1\n18#2:93\n9#3,4:94\n*S KotlinDebug\n*F\n+ 1 BatchSearchAdapter.kt\nco/bird/android/feature/servicecenter/batches/batchsearch/BatchSearchAdapter$ButtonViewHolder\n*L\n63#1:93\n63#1:94,4\n*E\n"
    }
.end annotation


# instance fields
.field public final b:Landroid/widget/Button;

.field public final synthetic c:LlF;


# direct methods
.method public constructor <init>(LlF;Landroid/view/View;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/view/View;",
            ")V"
        }
    .end annotation

    const-string v0, "view"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, LlF$b;->c:LlF;

    invoke-direct {p0, p2}, Lw1;-><init>(Landroid/view/View;)V

    check-cast p2, Landroid/widget/Button;

    iput-object p2, p0, LlF$b;->b:Landroid/widget/Button;

    new-instance v0, LmF;

    invoke-direct {v0, p1}, LmF;-><init>(LlF;)V

    invoke-virtual {p2, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method public static synthetic a(LlF;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1}, LlF$b;->b(LlF;Landroid/view/View;)V

    return-void
.end method

.method public static final b(LlF;Landroid/view/View;)V
    .locals 1

    const-string p1, "this$0"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, LlF;->access$getLoadMoreClicksSubject$p(LlF;)Lio/reactivex/subjects/d;

    move-result-object p1

    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p1, v0}, Lio/reactivex/subjects/d;->onNext(Ljava/lang/Object;)V

    invoke-static {p0}, LlF;->access$getLoadMoreLimitSubject$p(LlF;)Lio/reactivex/subjects/a;

    move-result-object p1

    invoke-static {p0}, LlF;->access$getLoadMoreLimitSubject$p(LlF;)Lio/reactivex/subjects/a;

    move-result-object p0

    invoke-virtual {p0}, Lio/reactivex/subjects/a;->getValue()Ljava/lang/Object;

    move-result-object p0

    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    check-cast p0, Ljava/lang/Number;

    invoke-virtual {p0}, Ljava/lang/Number;->intValue()I

    move-result p0

    add-int/lit8 p0, p0, 0x14

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    invoke-virtual {p1, p0}, Lio/reactivex/subjects/a;->onNext(Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public bind(I)V
    .locals 2

    iget-object v0, p0, LlF$b;->b:Landroid/widget/Button;

    iget-object v1, p0, LlF$b;->c:LlF;

    invoke-static {v1}, LlF;->access$getAdapterData(LlF;)LE6;

    move-result-object v1

    invoke-virtual {v1}, LE6;->h()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LG6;

    invoke-virtual {p1}, LG6;->c()Ljava/lang/Object;

    move-result-object p1

    instance-of v1, p1, Ljava/lang/String;

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    check-cast p1, Ljava/lang/CharSequence;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method
