.class public final LQn6$b;
.super Lw1;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LQn6;
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
        "LQn6$b;",
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
        "(LQn6;Landroid/view/View;)V",
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
        "SMAP\nVehiclesInBatchAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VehiclesInBatchAdapter.kt\nco/bird/android/feature/servicecenter/batches/vehiclesinbatch/VehiclesInBatchAdapter$ButtonViewHolder\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,97:1\n18#2:98\n9#3,4:99\n*S KotlinDebug\n*F\n+ 1 VehiclesInBatchAdapter.kt\nco/bird/android/feature/servicecenter/batches/vehiclesinbatch/VehiclesInBatchAdapter$ButtonViewHolder\n*L\n62#1:98\n62#1:99,4\n*E\n"
    }
.end annotation


# instance fields
.field public final b:Landroid/widget/Button;

.field public final synthetic c:LQn6;


# direct methods
.method public constructor <init>(LQn6;Landroid/view/View;)V
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

    iput-object p1, p0, LQn6$b;->c:LQn6;

    invoke-direct {p0, p2}, Lw1;-><init>(Landroid/view/View;)V

    check-cast p2, Landroid/widget/Button;

    iput-object p2, p0, LQn6$b;->b:Landroid/widget/Button;

    new-instance v0, LRn6;

    invoke-direct {v0, p1}, LRn6;-><init>(LQn6;)V

    invoke-virtual {p2, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method public static synthetic a(LQn6;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1}, LQn6$b;->b(LQn6;Landroid/view/View;)V

    return-void
.end method

.method public static final b(LQn6;Landroid/view/View;)V
    .locals 0

    const-string p1, "this$0"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, LQn6;->access$getAddBirdsClickSubject$p(LQn6;)Lio/reactivex/subjects/d;

    move-result-object p0

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p0, p1}, Lio/reactivex/subjects/d;->onNext(Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public bind(I)V
    .locals 1

    iget-object v0, p0, LQn6$b;->c:LQn6;

    invoke-static {v0}, LQn6;->access$getAdapterData(LQn6;)LE6;

    move-result-object v0

    invoke-virtual {v0}, LE6;->h()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LG6;

    invoke-virtual {p1}, LG6;->c()Ljava/lang/Object;

    move-result-object p1

    instance-of v0, p1, Ljava/lang/String;

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    check-cast p1, Ljava/lang/String;

    iget-object v0, p0, LQn6$b;->b:Landroid/widget/Button;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method
