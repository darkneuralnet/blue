.class public final Ldu4$b;
.super Lw1;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ldu4;
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
        "Ldu4$b;",
        "Lw1;",
        "",
        "position",
        "",
        "bind",
        "Lmb2;",
        "b",
        "Lmb2;",
        "binding",
        "Landroid/view/View;",
        "view",
        "<init>",
        "(Ldu4;Landroid/view/View;)V",
        "release-assignment_release"
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
        "SMAP\nReleaseAssignmentAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReleaseAssignmentAdapter.kt\nco/bird/android/feature/operator/releaseassignment/adapter/ReleaseAssignmentAdapter$CappedZoneReservationViewHolder\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,157:1\n18#2:158\n9#3,4:159\n*S KotlinDebug\n*F\n+ 1 ReleaseAssignmentAdapter.kt\nco/bird/android/feature/operator/releaseassignment/adapter/ReleaseAssignmentAdapter$CappedZoneReservationViewHolder\n*L\n148#1:158\n148#1:159,4\n*E\n"
    }
.end annotation


# instance fields
.field public final b:Lmb2;

.field public final synthetic c:Ldu4;


# direct methods
.method public constructor <init>(Ldu4;Landroid/view/View;)V
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

    iput-object p1, p0, Ldu4$b;->c:Ldu4;

    invoke-direct {p0, p2}, Lw1;-><init>(Landroid/view/View;)V

    invoke-static {p2}, Lmb2;->a(Landroid/view/View;)Lmb2;

    move-result-object p2

    const-string v0, "bind(view)"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p2, p0, Ldu4$b;->b:Lmb2;

    iget-object p2, p2, Lmb2;->e:Landroid/widget/TextView;

    const-string v0, "binding.cancel"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ldu4$b$a;

    invoke-direct {v0, p0, p1}, Ldu4$b$a;-><init>(Ldu4$b;Ldu4;)V

    invoke-static {p2, v0}, LMs2;->j(Landroid/view/View;Lkotlin/jvm/functions/Function1;)V

    return-void
.end method


# virtual methods
.method public bind(I)V
    .locals 5

    iget-object v0, p0, Ldu4$b;->c:Ldu4;

    invoke-static {v0}, Ldu4;->access$getAdapterData(Ldu4;)LE6;

    move-result-object v0

    invoke-virtual {v0, p1}, LE6;->e(I)LG6;

    move-result-object p1

    invoke-virtual {p1}, LG6;->c()Ljava/lang/Object;

    move-result-object p1

    instance-of v0, p1, Lco/bird/android/model/persistence/nestedstructures/ZoneAssignmentCappedZoneReservation;

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    check-cast p1, Lco/bird/android/model/persistence/nestedstructures/ZoneAssignmentCappedZoneReservation;

    if-eqz p1, :cond_1

    iget-object v0, p0, Ldu4$b;->b:Lmb2;

    iget-object v0, v0, Lmb2;->g:Landroid/widget/TextView;

    invoke-virtual {p1}, Lco/bird/android/model/persistence/nestedstructures/ZoneAssignmentCappedZoneReservation;->getBirdCode()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v0, p0, Ldu4$b;->b:Lmb2;

    iget-object v0, v0, Lmb2;->i:Landroid/widget/TextView;

    invoke-virtual {p1}, Lco/bird/android/model/persistence/nestedstructures/ZoneAssignmentCappedZoneReservation;->getTimeRemaining()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v0, p0, Ldu4$b;->b:Lmb2;

    iget-object v0, v0, Lmb2;->b:Lco/bird/android/widget/BatteryViewV2;

    invoke-virtual {p1}, Lco/bird/android/model/persistence/nestedstructures/ZoneAssignmentCappedZoneReservation;->getBatteryLevel()I

    move-result v1

    int-to-float v1, v1

    const/high16 v2, 0x42c80000    # 100.0f

    div-float/2addr v1, v2

    invoke-virtual {v0, v1}, Lco/bird/android/widget/BatteryViewV2;->setBatteryLevel(F)V

    iget-object v0, p0, Ldu4$b;->b:Lmb2;

    iget-object v0, v0, Lmb2;->c:Landroid/widget/TextView;

    invoke-virtual {p0}, Lw1;->getContext()Landroid/content/Context;

    move-result-object v1

    sget v2, Lnl4;->battery_percent:I

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    invoke-virtual {p1}, Lco/bird/android/model/persistence/nestedstructures/ZoneAssignmentCappedZoneReservation;->getBatteryLevel()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    const/4 v4, 0x0

    aput-object p1, v3, v4

    invoke-virtual {v1, v2, v3}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_1
    return-void
.end method
