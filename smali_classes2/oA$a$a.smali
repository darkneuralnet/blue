.class public final LoA$a$a;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LoA$a;-><init>(LoA;Landroid/view/View;)V
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
        "SMAP\nBaseCommandAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BaseCommandAdapter.kt\nco/bird/android/command/base/BaseCommandAdapter$CommandViewHolder$1\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,135:1\n18#2:136\n9#3,4:137\n*S KotlinDebug\n*F\n+ 1 BaseCommandAdapter.kt\nco/bird/android/command/base/BaseCommandAdapter$CommandViewHolder$1\n*L\n56#1:136\n56#1:137,4\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic g:LoA;

.field public final synthetic h:LoA$a;


# direct methods
.method public constructor <init>(LoA;LoA$a;)V
    .locals 0

    iput-object p1, p0, LoA$a$a;->g:LoA;

    iput-object p2, p0, LoA$a$a;->h:LoA$a;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Landroid/view/View;

    invoke-virtual {p0, p1}, LoA$a$a;->invoke(Landroid/view/View;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Landroid/view/View;)V
    .locals 2

    iget-object p1, p0, LoA$a$a;->g:LoA;

    invoke-static {p1}, LoA;->access$getAdapterData(LoA;)LE6;

    move-result-object p1

    invoke-virtual {p1}, LE6;->h()Ljava/util/List;

    move-result-object p1

    iget-object v0, p0, LoA$a$a;->h:LoA$a;

    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView$D;->getAdapterPosition()I

    move-result v0

    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LG6;

    invoke-virtual {p1}, LG6;->c()Ljava/lang/Object;

    move-result-object p1

    instance-of v0, p1, Lco/bird/android/model/VehicleCommand;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    move-object p1, v1

    :goto_0
    check-cast p1, Lco/bird/android/model/VehicleCommand;

    if-nez p1, :cond_1

    return-void

    :cond_1
    sget-object v0, Lco/bird/android/model/CommandMethod;->BLUETOOTH:Lco/bird/android/model/CommandMethod;

    invoke-virtual {p1, v0}, Lco/bird/android/model/VehicleCommand;->setMethod(Lco/bird/android/model/CommandMethod;)V

    iget-object v0, p0, LoA$a$a;->g:LoA;

    invoke-virtual {v0}, LoA;->y()Lio/reactivex/subjects/d;

    move-result-object v0

    invoke-virtual {v0, p1}, Lio/reactivex/subjects/d;->onNext(Ljava/lang/Object;)V

    iget-object v0, p0, LoA$a$a;->g:LoA;

    invoke-virtual {v0}, LoA;->A()Ljava/util/HashSet;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    iget-object p1, p0, LoA$a$a;->h:LoA$a;

    invoke-static {p1}, LoA$a;->access$getBinding$p(LoA$a;)Lqb2;

    move-result-object p1

    iget-object p1, p1, Lqb2;->b:Landroid/widget/Button;

    invoke-virtual {p1, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object p1, p0, LoA$a$a;->h:LoA$a;

    invoke-static {p1}, LoA$a;->access$getBinding$p(LoA$a;)Lqb2;

    move-result-object p1

    iget-object p1, p1, Lqb2;->c:Landroid/widget/ProgressBar;

    const-string v0, "binding.bluetoothProgressBar"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Ltu6;->r(Landroid/view/View;)V

    iget-object p1, p0, LoA$a$a;->h:LoA$a;

    invoke-static {p1}, LoA$a;->access$getBinding$p(LoA$a;)Lqb2;

    move-result-object p1

    iget-object p1, p1, Lqb2;->b:Landroid/widget/Button;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/view/View;->setEnabled(Z)V

    iget-object p1, p0, LoA$a$a;->h:LoA$a;

    invoke-static {p1}, LoA$a;->access$getBinding$p(LoA$a;)Lqb2;

    move-result-object p1

    iget-object p1, p1, Lqb2;->d:Landroid/widget/Button;

    invoke-virtual {p1, v0}, Landroid/view/View;->setEnabled(Z)V

    return-void
.end method
