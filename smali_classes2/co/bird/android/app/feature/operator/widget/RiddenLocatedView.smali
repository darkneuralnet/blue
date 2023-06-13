.class public final Lco/bird/android/app/feature/operator/widget/RiddenLocatedView;
.super Landroid/widget/RelativeLayout;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u0007\u0018\u00002\u00020\u0001B\'\u0008\u0007\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\n\u0008\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\u0008\u0008\u0002\u0010\u0018\u001a\u00020\u000e\u00a2\u0006\u0004\u0008\u0019\u0010\u001aJ\"\u0010\u0008\u001a\u00020\u00072\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0006\u001a\u00020\u0005J\"\u0010\u0008\u001a\u00020\u00072\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u0006\u0010\n\u001a\u00020\tJ\u000e\u0010\r\u001a\u00020\u00072\u0006\u0010\u000c\u001a\u00020\u000bJ\u000c\u0010\u000f\u001a\u00020\u000e*\u00020\u0005H\u0002R\u0014\u0010\u0013\u001a\u00020\u00108\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0011\u0010\u0012\u00a8\u0006\u001b"
    }
    d2 = {
        "Lco/bird/android/app/feature/operator/widget/RiddenLocatedView;",
        "Landroid/widget/RelativeLayout;",
        "Lorg/joda/time/DateTime;",
        "lastRideAt",
        "lastTrackedAt",
        "Lco/bird/android/model/wire/WireBirdLabel;",
        "birdLabel",
        "",
        "setBirdData",
        "Lco/bird/android/model/wire/WireBird;",
        "bird",
        "",
        "title",
        "setTopStatusTitle",
        "",
        "a",
        "Lpt6;",
        "b",
        "Lpt6;",
        "binding",
        "Landroid/content/Context;",
        "context",
        "Landroid/util/AttributeSet;",
        "attrs",
        "defStyleAttr",
        "<init>",
        "(Landroid/content/Context;Landroid/util/AttributeSet;I)V",
        "app_birdRelease"
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
        "SMAP\nRiddenLocatedView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RiddenLocatedView.kt\nco/bird/android/app/feature/operator/widget/RiddenLocatedView\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,74:1\n1#2:75\n*E\n"
    }
.end annotation


# instance fields
.field public final b:Lpt6;


# direct methods
.method public static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 7
    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x6

    const/4 v6, 0x0

    move-object v1, p0

    move-object v2, p1

    invoke-direct/range {v1 .. v6}, Lco/bird/android/app/feature/operator/widget/RiddenLocatedView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 7
    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v4, 0x0

    const/4 v5, 0x4

    const/4 v6, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    invoke-direct/range {v1 .. v6}, Lco/bird/android/app/feature/operator/widget/RiddenLocatedView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 1
    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1, p2, p3}, Landroid/widget/RelativeLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    invoke-static {p1}, LfB0;->j(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object p2

    invoke-static {p2, p0}, Lpt6;->b(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Lpt6;

    move-result-object p2

    const-string p3, "inflate(context.layoutInflater, this)"

    invoke-static {p2, p3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p2, p0, Lco/bird/android/app/feature/operator/widget/RiddenLocatedView;->b:Lpt6;

    sget p2, LDf4;->birdWhite:I

    invoke-static {p1, p2}, LNA0;->c(Landroid/content/Context;I)I

    move-result p2

    invoke-virtual {p0, p2}, Landroid/view/View;->setBackgroundColor(I)V

    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object p1

    sget p2, Lcj4;->view_ridden_located:I

    invoke-virtual {p1, p2, p0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    return-void
.end method

.method public synthetic constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_0

    const/4 p2, 0x0

    :cond_0
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_1

    const/4 p3, 0x0

    :cond_1
    invoke-direct {p0, p1, p2, p3}, Lco/bird/android/app/feature/operator/widget/RiddenLocatedView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method


# virtual methods
.method public final a(Lco/bird/android/model/wire/WireBirdLabel;)I
    .locals 2

    :try_start_0
    invoke-virtual {p1}, Lco/bird/android/model/wire/WireBirdLabel;->getColor()I

    move-result p1

    const/16 v0, 0x10

    invoke-static {v0}, Lkotlin/text/CharsKt;->checkRadix(I)I

    move-result v0

    invoke-static {p1, v0}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    move-result-object p1

    const-string v0, "toString(this, checkRadix(radix))"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "#"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    const/high16 p1, -0x1000000

    :goto_0
    return p1
.end method

.method public final setBirdData(Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Lco/bird/android/model/wire/WireBird;)V
    .locals 3

    const-string v0, "bird"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lco/bird/android/app/feature/operator/widget/RiddenLocatedView;->b:Lpt6;

    iget-object v0, v0, Lpt6;->c:Landroid/widget/TextView;

    const-string v1, ""

    if-eqz p1, :cond_0

    sget-object v2, Lxx1;->a:Lxx1;

    invoke-virtual {v2, p1}, Lxx1;->v(Lorg/joda/time/DateTime;)Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    move-object p1, v1

    :goto_0
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object p1, p0, Lco/bird/android/app/feature/operator/widget/RiddenLocatedView;->b:Lpt6;

    iget-object p1, p1, Lpt6;->b:Landroid/widget/TextView;

    if-eqz p2, :cond_1

    sget-object v0, Lxx1;->a:Lxx1;

    invoke-virtual {v0, p2}, Lxx1;->v(Lorg/joda/time/DateTime;)Ljava/lang/String;

    move-result-object p2

    if-eqz p2, :cond_1

    move-object v1, p2

    :cond_1
    invoke-virtual {p1, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object p1, p0, Lco/bird/android/app/feature/operator/widget/RiddenLocatedView;->b:Lpt6;

    iget-object p1, p1, Lpt6;->d:Landroid/widget/TextView;

    invoke-static {p3}, LbP4;->access$statusText(Lco/bird/android/model/wire/WireBird;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object p1, p0, Lco/bird/android/app/feature/operator/widget/RiddenLocatedView;->b:Lpt6;

    iget-object p1, p1, Lpt6;->d:Landroid/widget/TextView;

    invoke-virtual {p3}, Lco/bird/android/model/wire/WireBird;->getLabel()Lco/bird/android/model/wire/WireBirdLabel;

    move-result-object p2

    invoke-virtual {p0, p2}, Lco/bird/android/app/feature/operator/widget/RiddenLocatedView;->a(Lco/bird/android/model/wire/WireBirdLabel;)I

    move-result p2

    invoke-virtual {p1, p2}, Landroid/view/View;->setBackgroundColor(I)V

    return-void
.end method

.method public final setBirdData(Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Lco/bird/android/model/wire/WireBirdLabel;)V
    .locals 3

    const-string v0, "birdLabel"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    iget-object v1, p0, Lco/bird/android/app/feature/operator/widget/RiddenLocatedView;->b:Lpt6;

    iget-object v1, v1, Lpt6;->c:Landroid/widget/TextView;

    sget-object v2, Lxx1;->a:Lxx1;

    invoke-virtual {v2, p1}, Lxx1;->v(Lorg/joda/time/DateTime;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    goto :goto_0

    :cond_0
    move-object p1, v0

    :goto_0
    if-nez p1, :cond_1

    iget-object p1, p0, Lco/bird/android/app/feature/operator/widget/RiddenLocatedView;->b:Lpt6;

    iget-object p1, p1, Lpt6;->c:Landroid/widget/TextView;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    sget v2, Lnl4;->bird_action_unknown:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_1
    if-eqz p2, :cond_2

    iget-object p1, p0, Lco/bird/android/app/feature/operator/widget/RiddenLocatedView;->b:Lpt6;

    iget-object p1, p1, Lpt6;->b:Landroid/widget/TextView;

    sget-object v0, Lxx1;->a:Lxx1;

    invoke-virtual {v0, p2}, Lxx1;->v(Lorg/joda/time/DateTime;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    :cond_2
    if-nez v0, :cond_3

    iget-object p1, p0, Lco/bird/android/app/feature/operator/widget/RiddenLocatedView;->b:Lpt6;

    iget-object p1, p1, Lpt6;->b:Landroid/widget/TextView;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p2

    sget v0, Lnl4;->bird_action_unknown:I

    invoke-virtual {p2, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_3
    iget-object p1, p0, Lco/bird/android/app/feature/operator/widget/RiddenLocatedView;->b:Lpt6;

    iget-object p1, p1, Lpt6;->d:Landroid/widget/TextView;

    invoke-virtual {p3}, Lco/bird/android/model/wire/WireBirdLabel;->getName()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object p1, p0, Lco/bird/android/app/feature/operator/widget/RiddenLocatedView;->b:Lpt6;

    iget-object p1, p1, Lpt6;->d:Landroid/widget/TextView;

    invoke-virtual {p0, p3}, Lco/bird/android/app/feature/operator/widget/RiddenLocatedView;->a(Lco/bird/android/model/wire/WireBirdLabel;)I

    move-result p2

    invoke-virtual {p1, p2}, Landroid/view/View;->setBackgroundColor(I)V

    return-void
.end method

.method public final setTopStatusTitle(Ljava/lang/String;)V
    .locals 1

    const-string v0, "title"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lco/bird/android/app/feature/operator/widget/RiddenLocatedView;->b:Lpt6;

    iget-object v0, v0, Lpt6;->e:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method
