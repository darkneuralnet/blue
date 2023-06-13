.class public final LQn6$a;
.super Lw1;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LQn6;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "a"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\n\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0007\u0010\u0008\u00a8\u0006\u000e"
    }
    d2 = {
        "LQn6$a;",
        "Lw1;",
        "",
        "position",
        "",
        "bind",
        "LYa2;",
        "b",
        "LYa2;",
        "binding",
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
        "SMAP\nVehiclesInBatchAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VehiclesInBatchAdapter.kt\nco/bird/android/feature/servicecenter/batches/vehiclesinbatch/VehiclesInBatchAdapter$BirdViewHolder\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,97:1\n18#2:98\n18#2:103\n9#3,4:99\n9#3,4:104\n1#4:108\n*S KotlinDebug\n*F\n+ 1 VehiclesInBatchAdapter.kt\nco/bird/android/feature/servicecenter/batches/vehiclesinbatch/VehiclesInBatchAdapter$BirdViewHolder\n*L\n79#1:98\n72#1:103\n79#1:99,4\n72#1:104,4\n*E\n"
    }
.end annotation


# instance fields
.field public final b:LYa2;

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

    iput-object p1, p0, LQn6$a;->c:LQn6;

    invoke-direct {p0, p2}, Lw1;-><init>(Landroid/view/View;)V

    invoke-static {p2}, LYa2;->a(Landroid/view/View;)LYa2;

    move-result-object p2

    const-string v0, "bind(view)"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p2, p0, LQn6$a;->b:LYa2;

    invoke-virtual {p2}, LYa2;->b()Landroidx/constraintlayout/widget/ConstraintLayout;

    move-result-object p2

    new-instance v0, LPn6;

    invoke-direct {v0, p0, p1}, LPn6;-><init>(LQn6$a;LQn6;)V

    invoke-virtual {p2, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method public static synthetic a(LQn6$a;LQn6;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1, p2}, LQn6$a;->b(LQn6$a;LQn6;Landroid/view/View;)V

    return-void
.end method

.method public static final b(LQn6$a;LQn6;Landroid/view/View;)V
    .locals 1

    const-string p2, "this$0"

    invoke-static {p0, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p2, "this$1"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$D;->getAdapterPosition()I

    move-result p2

    const/4 v0, -0x1

    if-eq p2, v0, :cond_1

    invoke-static {p1}, LQn6;->access$getAdapterData(LQn6;)LE6;

    move-result-object p2

    invoke-virtual {p2}, LE6;->h()Ljava/util/List;

    move-result-object p2

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$D;->getAdapterPosition()I

    move-result p0

    invoke-interface {p2, p0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, LG6;

    invoke-virtual {p0}, LG6;->c()Ljava/lang/Object;

    move-result-object p0

    instance-of p2, p0, Lco/bird/android/model/wire/WireBird;

    if-eqz p2, :cond_0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    check-cast p0, Lco/bird/android/model/wire/WireBird;

    if-eqz p0, :cond_1

    invoke-static {p1}, LQn6;->access$getBirdClicksSubject$p(LQn6;)Lio/reactivex/subjects/d;

    move-result-object p1

    invoke-virtual {p1, p0}, Lio/reactivex/subjects/d;->onNext(Ljava/lang/Object;)V

    :cond_1
    return-void
.end method


# virtual methods
.method public bind(I)V
    .locals 4

    iget-object v0, p0, LQn6$a;->c:LQn6;

    invoke-static {v0}, LQn6;->access$getAdapterData(LQn6;)LE6;

    move-result-object v0

    invoke-virtual {v0}, LE6;->h()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LG6;

    invoke-virtual {p1}, LG6;->c()Ljava/lang/Object;

    move-result-object p1

    instance-of v0, p1, Lco/bird/android/model/wire/WireBird;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    move-object p1, v1

    :goto_0
    check-cast p1, Lco/bird/android/model/wire/WireBird;

    iget-object v0, p0, LQn6$a;->b:LYa2;

    iget-object v0, v0, LYa2;->e:Landroid/widget/TextView;

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Lco/bird/android/model/wire/WireBird;->getCode()Ljava/lang/String;

    move-result-object v1

    :cond_1
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    if-eqz p1, :cond_2

    invoke-virtual {p1}, Lco/bird/android/model/wire/WireBird;->getBatteryLevel()I

    move-result v0

    iget-object v1, p0, LQn6$a;->b:LYa2;

    iget-object v1, v1, LYa2;->d:Lco/bird/android/widget/BatteryView;

    invoke-virtual {p0}, Lw1;->getContext()Landroid/content/Context;

    move-result-object v2

    sget v3, LDf4;->colorPrimary:I

    invoke-static {v2, v3}, LNA0;->c(Landroid/content/Context;I)I

    move-result v2

    invoke-virtual {v1, v2}, Lco/bird/android/widget/BatteryView;->setColor(I)V

    iget-object v1, p0, LQn6$a;->b:LYa2;

    iget-object v1, v1, LYa2;->d:Lco/bird/android/widget/BatteryView;

    invoke-virtual {v1, v0}, Lco/bird/android/widget/BatteryView;->setPercent(I)V

    iget-object v0, p0, LQn6$a;->b:LYa2;

    iget-object v0, v0, LYa2;->c:Landroid/widget/TextView;

    sget-object v1, Lxx1;->a:Lxx1;

    invoke-virtual {p0}, Lw1;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-virtual {p1}, Lco/bird/android/model/wire/WireBird;->getBatteryLevel()I

    move-result p1

    const/4 v3, 0x1

    invoke-virtual {v1, v2, p1, v3}, Lxx1;->a(Landroid/content/Context;IZ)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_2
    return-void
.end method
