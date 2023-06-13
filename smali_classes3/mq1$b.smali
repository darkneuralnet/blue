.class public final Lmq1$b;
.super Lmq1$d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lmq1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "b"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0082\u0004\u0018\u00002\u00060\u0001R\u00020\u0002B\u0019\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0008\u0008\u0002\u0010\n\u001a\u00020\u0007\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016R\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0008\u0010\tR\u0014\u0010\u000e\u001a\u00020\u000b8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u000c\u0010\r\u00a8\u0006\u0013"
    }
    d2 = {
        "Lmq1$b;",
        "Lmq1$d;",
        "Lmq1;",
        "",
        "position",
        "",
        "bind",
        "LOb2;",
        "e",
        "LOb2;",
        "fleetRatingBinding",
        "Landroid/widget/ImageView;",
        "j",
        "()Landroid/widget/ImageView;",
        "chevron",
        "Landroid/view/View;",
        "view",
        "<init>",
        "(Lmq1;Landroid/view/View;LOb2;)V",
        "co.bird.android.feature.fleet-status"
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
        "SMAP\nFleetStateAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FleetStateAdapter.kt\nco/bird/android/feature/fleetstatus/state/status/adapters/FleetStateAdapter$FleetRatingViewHolder\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,230:1\n18#2:231\n9#3,4:232\n*S KotlinDebug\n*F\n+ 1 FleetStateAdapter.kt\nco/bird/android/feature/fleetstatus/state/status/adapters/FleetStateAdapter$FleetRatingViewHolder\n*L\n152#1:231\n152#1:232,4\n*E\n"
    }
.end annotation


# instance fields
.field public final e:LOb2;

.field public final synthetic f:Lmq1;


# direct methods
.method public constructor <init>(Lmq1;Landroid/view/View;LOb2;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/view/View;",
            "LOb2;",
            ")V"
        }
    .end annotation

    const-string v0, "view"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "fleetRatingBinding"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lmq1$b;->f:Lmq1;

    invoke-direct {p0, p1, p2, p3}, Lmq1$d;-><init>(Lmq1;Landroid/view/View;LKp6;)V

    iput-object p3, p0, Lmq1$b;->e:LOb2;

    return-void
.end method

.method public synthetic constructor <init>(Lmq1;Landroid/view/View;LOb2;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p4, p4, 0x2

    if-eqz p4, :cond_0

    invoke-static {p2}, LOb2;->a(Landroid/view/View;)LOb2;

    move-result-object p3

    const-string p4, "bind(view)"

    invoke-static {p3, p4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_0
    invoke-direct {p0, p1, p2, p3}, Lmq1$b;-><init>(Lmq1;Landroid/view/View;LOb2;)V

    return-void
.end method


# virtual methods
.method public bind(I)V
    .locals 3

    invoke-super {p0, p1}, Lmq1$d;->bind(I)V

    iget-object v0, p0, Lmq1$b;->f:Lmq1;

    invoke-static {v0}, Lmq1;->access$getAdapterData(Lmq1;)LE6;

    move-result-object v0

    invoke-virtual {v0, p1}, LE6;->e(I)LG6;

    move-result-object p1

    invoke-virtual {p1}, LG6;->c()Ljava/lang/Object;

    move-result-object p1

    instance-of v0, p1, Lco/bird/android/model/persistence/nestedstructures/FleetRating;

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    check-cast p1, Lco/bird/android/model/persistence/nestedstructures/FleetRating;

    if-eqz p1, :cond_1

    iget-object v0, p0, Lmq1$b;->e:LOb2;

    iget-object v0, v0, LOb2;->e:Lco/bird/android/widget/standardcomponents/LabeledRatingItemView;

    invoke-virtual {p1}, Lco/bird/android/model/persistence/nestedstructures/FleetRating;->getRating()D

    move-result-wide v1

    double-to-float v1, v1

    invoke-virtual {v0, v1}, Lco/bird/android/widget/standardcomponents/LabeledRatingItemView;->setRating(F)V

    iget-object v0, p0, Lmq1$b;->e:LOb2;

    iget-object v0, v0, LOb2;->c:Landroid/widget/TextView;

    invoke-virtual {p1}, Lco/bird/android/model/persistence/nestedstructures/FleetRating;->getDescription()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_1
    return-void
.end method

.method public j()Landroid/widget/ImageView;
    .locals 2

    iget-object v0, p0, Lmq1$b;->e:LOb2;

    iget-object v0, v0, LOb2;->b:Landroid/widget/ImageView;

    const-string v1, "fleetRatingBinding.chevron"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method
