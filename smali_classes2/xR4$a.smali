.class public final LxR4$a;
.super Lw1;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LxR4;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u000b\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u00102\u001a\u000201\u0012\u0006\u0010\u0016\u001a\u00020\u0012\u00a2\u0006\u0004\u00083\u00104J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J \u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00082\u0006\u0010\n\u001a\u00020\u0008H\u0002J\u001a\u0010\u0011\u001a\u00020\u00102\u0008\u0010\r\u001a\u0004\u0018\u00010\u000c2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002R\u0017\u0010\u0016\u001a\u00020\u00128\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000b\u0010\u0013\u001a\u0004\u0008\u0014\u0010\u0015R\u0017\u0010\u001c\u001a\u00020\u00178\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0018\u0010\u0019\u001a\u0004\u0008\u001a\u0010\u001bR\u0017\u0010\u001f\u001a\u00020\u00178\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001d\u0010\u0019\u001a\u0004\u0008\u001e\u0010\u001bR\u0017\u0010$\u001a\u00020 8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0014\u0010!\u001a\u0004\u0008\"\u0010#R\u0017\u0010*\u001a\u00020%8\u0006\u00a2\u0006\u000c\n\u0004\u0008&\u0010\'\u001a\u0004\u0008(\u0010)R\u0017\u0010-\u001a\u00020\u00178\u0006\u00a2\u0006\u000c\n\u0004\u0008+\u0010\u0019\u001a\u0004\u0008,\u0010\u001bR\u0017\u00100\u001a\u00020\u00178\u0006\u00a2\u0006\u000c\n\u0004\u0008.\u0010\u0019\u001a\u0004\u0008/\u0010\u001b\u00a8\u00065"
    }
    d2 = {
        "LxR4$a;",
        "Lw1;",
        "",
        "position",
        "",
        "bind",
        "Lco/bird/android/model/wire/WireRide;",
        "ride",
        "",
        "billedMinutes",
        "hideTime",
        "b",
        "Lco/bird/android/model/wire/WireRideTransaction;",
        "transaction",
        "Ljava/util/Currency;",
        "fallbackCurrency",
        "",
        "a",
        "LxR4;",
        "LxR4;",
        "e",
        "()LxR4;",
        "adapter",
        "Landroid/widget/TextView;",
        "c",
        "Landroid/widget/TextView;",
        "getTimestamp",
        "()Landroid/widget/TextView;",
        "timestamp",
        "d",
        "getDistance",
        "distance",
        "Landroid/widget/ImageView;",
        "Landroid/widget/ImageView;",
        "getDistanceIcon",
        "()Landroid/widget/ImageView;",
        "distanceIcon",
        "Landroid/widget/LinearLayout;",
        "f",
        "Landroid/widget/LinearLayout;",
        "getDurationSection",
        "()Landroid/widget/LinearLayout;",
        "durationSection",
        "g",
        "getDuration",
        "duration",
        "h",
        "getCost",
        "cost",
        "Landroid/view/View;",
        "view",
        "<init>",
        "(Landroid/view/View;LxR4;)V",
        "app_birdRelease"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final b:LxR4;

.field public final c:Landroid/widget/TextView;

.field public final d:Landroid/widget/TextView;

.field public final e:Landroid/widget/ImageView;

.field public final f:Landroid/widget/LinearLayout;

.field public final g:Landroid/widget/TextView;

.field public final h:Landroid/widget/TextView;


# direct methods
.method public static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Landroid/view/View;LxR4;)V
    .locals 1

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "adapter"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Lw1;-><init>(Landroid/view/View;)V

    iput-object p2, p0, LxR4$a;->b:LxR4;

    sget p2, LVg4;->timestamp:I

    invoke-static {p1, p2}, Ltu6;->h(Landroid/view/View;I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Landroid/widget/TextView;

    iput-object p2, p0, LxR4$a;->c:Landroid/widget/TextView;

    sget p2, LVg4;->distance:I

    invoke-static {p1, p2}, Ltu6;->h(Landroid/view/View;I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Landroid/widget/TextView;

    iput-object p2, p0, LxR4$a;->d:Landroid/widget/TextView;

    sget p2, LVg4;->distanceIcon:I

    invoke-static {p1, p2}, Ltu6;->h(Landroid/view/View;I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Landroid/widget/ImageView;

    iput-object p2, p0, LxR4$a;->e:Landroid/widget/ImageView;

    sget p2, LVg4;->durationSection:I

    invoke-static {p1, p2}, Ltu6;->h(Landroid/view/View;I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Landroid/widget/LinearLayout;

    iput-object p2, p0, LxR4$a;->f:Landroid/widget/LinearLayout;

    sget p2, LVg4;->duration:I

    invoke-static {p1, p2}, Ltu6;->h(Landroid/view/View;I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Landroid/widget/TextView;

    iput-object p2, p0, LxR4$a;->g:Landroid/widget/TextView;

    sget p2, LVg4;->cost:I

    invoke-static {p1, p2}, Ltu6;->h(Landroid/view/View;I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Landroid/widget/TextView;

    iput-object p2, p0, LxR4$a;->h:Landroid/widget/TextView;

    new-instance p2, LxR4$a$a;

    invoke-direct {p2, p0}, LxR4$a$a;-><init>(LxR4$a;)V

    invoke-static {p1, p2}, LMs2;->j(Landroid/view/View;Lkotlin/jvm/functions/Function1;)V

    return-void
.end method


# virtual methods
.method public final a(Lco/bird/android/model/wire/WireRideTransaction;Ljava/util/Currency;)Ljava/lang/String;
    .locals 7

    if-eqz p1, :cond_0

    sget-object v0, Lxx1;->a:Lxx1;

    invoke-virtual {p1}, Lco/bird/android/model/wire/WireRideTransaction;->getAmount()J

    move-result-wide v1

    const/4 v3, -0x1

    int-to-long v3, v3

    mul-long/2addr v1, v3

    invoke-virtual {p1}, Lco/bird/android/model/wire/WireRideTransaction;->getCurrency()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, LmS5;->o(Ljava/lang/String;)Ljava/util/Currency;

    move-result-object v3

    const/4 v4, 0x0

    const/4 v5, 0x4

    const/4 v6, 0x0

    invoke-static/range {v0 .. v6}, Lxx1;->currency$default(Lxx1;JLjava/util/Currency;LUx1;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_1

    :cond_0
    sget-object v0, Lxx1;->a:Lxx1;

    const-wide/16 v1, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x4

    const/4 v6, 0x0

    move-object v3, p2

    invoke-static/range {v0 .. v6}, Lxx1;->currency$default(Lxx1;JLjava/util/Currency;LUx1;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    :cond_1
    return-object p1
.end method

.method public final b(Lco/bird/android/model/wire/WireRide;ZZ)V
    .locals 6

    if-eqz p3, :cond_0

    iget-object p1, p0, LxR4$a;->f:Landroid/widget/LinearLayout;

    invoke-static {p1}, Ltu6;->l(Landroid/view/View;)V

    goto :goto_1

    :cond_0
    if-eqz p2, :cond_2

    invoke-virtual {p1}, Lco/bird/android/model/wire/WireRide;->getBilledMinutes()Ljava/lang/Integer;

    move-result-object p2

    if-eqz p2, :cond_1

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result v2

    iget-object p2, p0, LxR4$a;->g:Landroid/widget/TextView;

    sget-object v0, Lxx1;->a:Lxx1;

    iget-object p3, p0, LxR4$a;->b:LxR4;

    invoke-virtual {p3}, Lct4;->u()Landroid/content/Context;

    move-result-object v1

    const/4 v3, 0x0

    const/4 v4, 0x4

    const/4 v5, 0x0

    invoke-static/range {v0 .. v5}, Lxx1;->durationMinute$default(Lxx1;Landroid/content/Context;IZILjava/lang/Object;)Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p2, p3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    goto :goto_0

    :cond_1
    const/4 p2, 0x0

    :goto_0
    if-nez p2, :cond_3

    iget-object p2, p0, LxR4$a;->g:Landroid/widget/TextView;

    sget-object p3, Lxx1;->a:Lxx1;

    invoke-virtual {p1}, Lco/bird/android/model/wire/WireRide;->durationSeconds()I

    move-result p1

    invoke-virtual {p3, p1}, Lxx1;->j(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_1

    :cond_2
    iget-object p2, p0, LxR4$a;->g:Landroid/widget/TextView;

    sget-object p3, Lxx1;->a:Lxx1;

    invoke-virtual {p1}, Lco/bird/android/model/wire/WireRide;->durationSeconds()I

    move-result p1

    invoke-virtual {p3, p1}, Lxx1;->j(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_3
    :goto_1
    return-void
.end method

.method public bind(I)V
    .locals 17

    move-object/from16 v0, p0

    move/from16 v1, p1

    iget-object v2, v0, LxR4$a;->b:LxR4;

    invoke-virtual {v2, v1}, Lct4;->q(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lco/bird/api/response/RideSummary;

    invoke-virtual {v2}, Lco/bird/api/response/RideSummary;->getTransaction()Lco/bird/android/model/wire/WireRideTransaction;

    move-result-object v2

    iget-object v3, v0, LxR4$a;->b:LxR4;

    invoke-virtual {v3, v1}, Lct4;->q(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lco/bird/api/response/RideSummary;

    invoke-virtual {v1}, Lco/bird/api/response/RideSummary;->getRide()Lco/bird/android/model/wire/WireRide;

    move-result-object v1

    invoke-virtual {v1}, Lco/bird/android/model/wire/WireRide;->getCompletedAt()Lorg/joda/time/DateTime;

    move-result-object v3

    iget-object v4, v0, LxR4$a;->c:Landroid/widget/TextView;

    const/4 v5, 0x2

    const/4 v6, 0x0

    if-eqz v3, :cond_0

    sget-object v7, Lxx1;->a:Lxx1;

    invoke-static {v7, v3, v6, v5, v6}, Lxx1;->shortDateAndTimeOfDay$default(Lxx1;Lorg/joda/time/DateTime;Ljava/lang/String;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    goto :goto_0

    :cond_0
    invoke-virtual {v4}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v3

    sget v7, Lnl4;->ride_history_ride_in_progress:I

    invoke-virtual {v3, v7}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v3

    :goto_0
    invoke-virtual {v4, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v3, v0, LxR4$a;->h:Landroid/widget/TextView;

    invoke-virtual {v1}, Lco/bird/android/model/wire/WireRide;->getCurrency()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, LmS5;->o(Ljava/lang/String;)Ljava/util/Currency;

    move-result-object v4

    invoke-virtual {v0, v2, v4}, LxR4$a;->a(Lco/bird/android/model/wire/WireRideTransaction;Ljava/util/Currency;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v3, v0, LxR4$a;->h:Landroid/widget/TextView;

    const/4 v4, 0x1

    const/4 v7, 0x0

    if-eqz v2, :cond_1

    move v2, v4

    goto :goto_1

    :cond_1
    move v2, v7

    :goto_1
    invoke-static {v3, v2, v7, v5, v6}, Ltu6;->show$default(Landroid/view/View;ZIILjava/lang/Object;)V

    iget-object v2, v0, LxR4$a;->d:Landroid/widget/TextView;

    sget-object v8, Lxx1;->a:Lxx1;

    invoke-virtual {v2}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v9

    const-string v3, "distance.context"

    invoke-static {v9, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1}, Lco/bird/android/model/wire/WireRide;->getDistance()D

    move-result-wide v10

    const-wide/16 v12, 0x0

    const/4 v14, 0x0

    const/16 v15, 0xc

    const/16 v16, 0x0

    invoke-static/range {v8 .. v16}, Lxx1;->distance$default(Lxx1;Landroid/content/Context;DDZILjava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v2, v0, LxR4$a;->d:Landroid/widget/TextView;

    invoke-virtual {v1}, Lco/bird/android/model/wire/WireRide;->getDistance()D

    move-result-wide v8

    const-wide/16 v10, 0x0

    cmpg-double v3, v8, v10

    if-nez v3, :cond_2

    move v3, v4

    goto :goto_2

    :cond_2
    move v3, v7

    :goto_2
    xor-int/2addr v3, v4

    invoke-static {v2, v3, v7, v5, v6}, Ltu6;->show$default(Landroid/view/View;ZIILjava/lang/Object;)V

    iget-object v2, v0, LxR4$a;->e:Landroid/widget/ImageView;

    invoke-virtual {v1}, Lco/bird/android/model/wire/WireRide;->getDistance()D

    move-result-wide v8

    cmpg-double v3, v8, v10

    if-nez v3, :cond_3

    move v3, v4

    goto :goto_3

    :cond_3
    move v3, v7

    :goto_3
    xor-int/2addr v3, v4

    invoke-static {v2, v3, v7, v5, v6}, Ltu6;->show$default(Landroid/view/View;ZIILjava/lang/Object;)V

    iget-object v2, v0, LxR4$a;->b:LxR4;

    invoke-virtual {v2}, LxR4;->E()Z

    move-result v2

    iget-object v3, v0, LxR4$a;->b:LxR4;

    invoke-virtual {v3}, LxR4;->F()Z

    move-result v3

    if-nez v3, :cond_5

    invoke-virtual {v1}, Lco/bird/android/model/wire/WireRide;->durationSeconds()I

    move-result v3

    if-nez v3, :cond_4

    goto :goto_4

    :cond_4
    move v4, v7

    :cond_5
    :goto_4
    invoke-virtual {v0, v1, v2, v4}, LxR4$a;->b(Lco/bird/android/model/wire/WireRide;ZZ)V

    return-void
.end method

.method public final e()LxR4;
    .locals 1

    iget-object v0, p0, LxR4$a;->b:LxR4;

    return-object v0
.end method
