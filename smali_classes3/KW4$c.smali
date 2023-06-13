.class public final LKW4$c;
.super Lw1;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LKW4;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "c"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\n\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0007\u0010\u0008\u00a8\u0006\u000e"
    }
    d2 = {
        "LKW4$c;",
        "Lw1;",
        "",
        "position",
        "",
        "bind",
        "Lpf2;",
        "b",
        "Lpf2;",
        "binding",
        "Landroid/view/View;",
        "view",
        "<init>",
        "(LKW4;Landroid/view/View;)V",
        "ride-pass_release"
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
        "SMAP\nRidePassV4DetailsAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RidePassV4DetailsAdapter.kt\nco/bird/android/feature/ridepass/v4/details/adapter/RidePassV4DetailsAdapter$HeaderViewHolder\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,78:1\n18#2:79\n9#3,4:80\n*S KotlinDebug\n*F\n+ 1 RidePassV4DetailsAdapter.kt\nco/bird/android/feature/ridepass/v4/details/adapter/RidePassV4DetailsAdapter$HeaderViewHolder\n*L\n41#1:79\n41#1:80,4\n*E\n"
    }
.end annotation


# instance fields
.field public final b:Lpf2;

.field public final synthetic c:LKW4;


# direct methods
.method public constructor <init>(LKW4;Landroid/view/View;)V
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

    iput-object p1, p0, LKW4$c;->c:LKW4;

    invoke-direct {p0, p2}, Lw1;-><init>(Landroid/view/View;)V

    invoke-static {p2}, Lpf2;->a(Landroid/view/View;)Lpf2;

    move-result-object p1

    const-string p2, "bind(view)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, LKW4$c;->b:Lpf2;

    return-void
.end method


# virtual methods
.method public bind(I)V
    .locals 11

    iget-object v0, p0, LKW4$c;->c:LKW4;

    invoke-static {v0}, LKW4;->access$getAdapterData(LKW4;)LE6;

    move-result-object v0

    invoke-virtual {v0, p1}, LE6;->e(I)LG6;

    move-result-object p1

    invoke-virtual {p1}, LG6;->c()Ljava/lang/Object;

    move-result-object p1

    instance-of v0, p1, LTU4;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    move-object p1, v1

    :goto_0
    check-cast p1, LTU4;

    if-eqz p1, :cond_4

    invoke-virtual {p1}, LTU4;->b()Lco/bird/android/model/persistence/RidePassView;

    move-result-object v0

    iget-object v2, p0, LKW4$c;->b:Lpf2;

    iget-object v2, v2, Lpf2;->f:Landroid/widget/TextView;

    invoke-virtual {v0}, Lco/bird/android/model/persistence/RidePassView;->getTitle()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v2, p0, LKW4$c;->b:Lpf2;

    iget-object v2, v2, Lpf2;->e:Landroid/widget/TextView;

    invoke-virtual {v0}, Lco/bird/android/model/persistence/RidePassView;->getDetailBody()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    sget-object v4, Lxx1;->a:Lxx1;

    invoke-virtual {v0}, Lco/bird/android/model/persistence/RidePassView;->getPrice()J

    move-result-wide v5

    invoke-virtual {v0}, Lco/bird/android/model/persistence/RidePassView;->getCurrency()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, LmS5;->o(Ljava/lang/String;)Ljava/util/Currency;

    move-result-object v7

    const/4 v8, 0x0

    const/4 v9, 0x4

    const/4 v10, 0x0

    invoke-static/range {v4 .. v10}, Lxx1;->currency$default(Lxx1;JLjava/util/Currency;LUx1;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, LTU4;->c()Z

    move-result p1

    if-eqz p1, :cond_1

    iget-object p1, p0, LKW4$c;->b:Lpf2;

    iget-object p1, p1, Lpf2;->f:Landroid/widget/TextView;

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    sget v3, Lnl4;->plus_tax:I

    invoke-virtual {p1, v3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p1

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, " "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    goto :goto_1

    :cond_1
    const-string p1, ""

    :goto_1
    invoke-virtual {v0}, Lco/bird/android/model/persistence/RidePassView;->getSubscriptionPlan()Lco/bird/android/model/persistence/nestedstructures/RidePassSubscriptionPlanView;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Lco/bird/android/model/persistence/nestedstructures/RidePassSubscriptionPlanView;->getBillingIntervalDescription()Ljava/lang/String;

    move-result-object v1

    :cond_2
    iget-object v0, p0, LKW4$c;->b:Lpf2;

    iget-object v0, v0, Lpf2;->d:Landroid/widget/TextView;

    if-eqz v1, :cond_3

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "/"

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    goto :goto_2

    :cond_3
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    :goto_2
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_4
    return-void
.end method
