.class public final Ls46$c;
.super Lw1;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ls46;
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
        "Ls46$c;",
        "Lw1;",
        "",
        "position",
        "",
        "bind",
        "Lco/bird/android/widget/VehicleSummaryView;",
        "b",
        "Lco/bird/android/widget/VehicleSummaryView;",
        "vehicleSummary",
        "Landroid/view/View;",
        "view",
        "<init>",
        "(Ls46;Landroid/view/View;)V",
        "co.bird.android.feature.commandcenter"
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
        "SMAP\nTimelineAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TimelineAdapter.kt\nco/bird/android/feature/commandcenter/timeline/adapters/TimelineAdapter$VehicleSummaryViewHolder\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,103:1\n18#2:104\n9#3,4:105\n1#4:109\n*S KotlinDebug\n*F\n+ 1 TimelineAdapter.kt\nco/bird/android/feature/commandcenter/timeline/adapters/TimelineAdapter$VehicleSummaryViewHolder\n*L\n65#1:104\n65#1:105,4\n*E\n"
    }
.end annotation


# instance fields
.field public final b:Lco/bird/android/widget/VehicleSummaryView;

.field public final synthetic c:Ls46;


# direct methods
.method public constructor <init>(Ls46;Landroid/view/View;)V
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

    iput-object p1, p0, Ls46$c;->c:Ls46;

    invoke-direct {p0, p2}, Lw1;-><init>(Landroid/view/View;)V

    check-cast p2, Lco/bird/android/widget/VehicleSummaryView;

    iput-object p2, p0, Ls46$c;->b:Lco/bird/android/widget/VehicleSummaryView;

    return-void
.end method


# virtual methods
.method public bind(I)V
    .locals 1

    iget-object v0, p0, Ls46$c;->c:Ls46;

    invoke-static {v0}, Ls46;->access$getAdapterData(Ls46;)LE6;

    move-result-object v0

    invoke-virtual {v0, p1}, LE6;->e(I)LG6;

    move-result-object p1

    invoke-virtual {p1}, LG6;->c()Ljava/lang/Object;

    move-result-object p1

    instance-of v0, p1, Lun6;

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    check-cast p1, Lun6;

    if-eqz p1, :cond_1

    iget-object v0, p0, Ls46$c;->b:Lco/bird/android/widget/VehicleSummaryView;

    invoke-virtual {v0, p1}, Lco/bird/android/widget/VehicleSummaryView;->e(Lun6;)V

    :cond_1
    return-void
.end method
