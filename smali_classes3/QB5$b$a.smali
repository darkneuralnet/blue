.class public final LQB5$b$a;
.super Ld36;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LQB5$b;-><init>(LQB5;Landroid/view/View;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0002\u0008\u0002*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J(\u0010\t\u001a\u00020\u00082\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0016\u00a8\u0006\n"
    }
    d2 = {
        "QB5$b$a",
        "Ld36;",
        "",
        "s",
        "",
        "start",
        "before",
        "count",
        "",
        "onTextChanged",
        "co.bird.android.feature.transfer-order"
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
        "SMAP\nSkuInvestigationAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SkuInvestigationAdapter.kt\nco/bird/android/feature/transferorder/sku/investigation/adapters/SkuInvestigationAdapter$MissingSkuViewHolder$4\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,82:1\n18#2:83\n9#3,4:84\n*S KotlinDebug\n*F\n+ 1 SkuInvestigationAdapter.kt\nco/bird/android/feature/transferorder/sku/investigation/adapters/SkuInvestigationAdapter$MissingSkuViewHolder$4\n*L\n66#1:83\n66#1:84,4\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic b:LQB5$b;

.field public final synthetic c:LQB5;


# direct methods
.method public constructor <init>(LQB5$b;LQB5;)V
    .locals 0

    iput-object p1, p0, LQB5$b$a;->b:LQB5$b;

    iput-object p2, p0, LQB5$b$a;->c:LQB5;

    invoke-direct {p0}, Ld36;-><init>()V

    return-void
.end method


# virtual methods
.method public onTextChanged(Ljava/lang/CharSequence;III)V
    .locals 0

    const-string p2, "s"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p2, p0, LQB5$b$a;->b:LQB5$b;

    invoke-static {p2}, LQB5$b;->access$getBinding$p(LQB5$b;)LHf2;

    move-result-object p2

    iget-object p2, p2, LHf2;->f:Landroid/widget/RadioButton;

    invoke-virtual {p2}, Landroid/widget/CompoundButton;->isChecked()Z

    move-result p2

    if-eqz p2, :cond_1

    iget-object p2, p0, LQB5$b$a;->c:LQB5;

    invoke-static {p2}, LQB5;->access$getAdapterData(LQB5;)LE6;

    move-result-object p2

    iget-object p3, p0, LQB5$b$a;->b:LQB5$b;

    invoke-virtual {p3}, Landroidx/recyclerview/widget/RecyclerView$D;->getAdapterPosition()I

    move-result p3

    invoke-virtual {p2, p3}, LE6;->e(I)LG6;

    move-result-object p2

    invoke-virtual {p2}, LG6;->c()Ljava/lang/Object;

    move-result-object p2

    instance-of p3, p2, LhC5;

    if-eqz p3, :cond_0

    goto :goto_0

    :cond_0
    const/4 p2, 0x0

    :goto_0
    check-cast p2, LhC5;

    if-eqz p2, :cond_1

    iget-object p3, p0, LQB5$b$a;->c:LQB5;

    invoke-static {p3}, LQB5;->access$getMissingSkuReasonInputSubject$p(LQB5;)Lio/reactivex/subjects/d;

    move-result-object p3

    invoke-virtual {p2}, LhC5;->b()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p2, p1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p1

    invoke-virtual {p3, p1}, Lio/reactivex/subjects/d;->onNext(Ljava/lang/Object;)V

    :cond_1
    return-void
.end method
