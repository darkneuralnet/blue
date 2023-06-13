.class public final LQI3$c;
.super Lw1;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LQI3;
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
        "LQI3$c;",
        "Lw1;",
        "",
        "position",
        "",
        "bind",
        "Ldf2;",
        "b",
        "Ldf2;",
        "binding",
        "Landroid/view/View;",
        "view",
        "<init>",
        "(LQI3;Landroid/view/View;)V",
        "repair_release"
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
        "SMAP\nPastRepairsAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PastRepairsAdapter.kt\nco/bird/android/feature/repair/pastrepairs/adapters/PastRepairsAdapter$PastRepairViewHolder\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,63:1\n18#2:64\n9#3,4:65\n*S KotlinDebug\n*F\n+ 1 PastRepairsAdapter.kt\nco/bird/android/feature/repair/pastrepairs/adapters/PastRepairsAdapter$PastRepairViewHolder\n*L\n44#1:64\n44#1:65,4\n*E\n"
    }
.end annotation


# instance fields
.field public final b:Ldf2;

.field public final synthetic c:LQI3;


# direct methods
.method public constructor <init>(LQI3;Landroid/view/View;)V
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

    iput-object p1, p0, LQI3$c;->c:LQI3;

    invoke-direct {p0, p2}, Lw1;-><init>(Landroid/view/View;)V

    invoke-static {p2}, Ldf2;->a(Landroid/view/View;)Ldf2;

    move-result-object p1

    const-string p2, "bind(view)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, LQI3$c;->b:Ldf2;

    return-void
.end method


# virtual methods
.method public bind(I)V
    .locals 7

    iget-object v0, p0, LQI3$c;->c:LQI3;

    invoke-static {v0}, LQI3;->access$getAdapterData(LQI3;)LE6;

    move-result-object v0

    invoke-virtual {v0, p1}, LE6;->e(I)LG6;

    move-result-object p1

    invoke-virtual {p1}, LG6;->c()Ljava/lang/Object;

    move-result-object p1

    instance-of v0, p1, Lco/bird/android/model/RepairLog;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    move-object p1, v1

    :goto_0
    check-cast p1, Lco/bird/android/model/RepairLog;

    if-eqz p1, :cond_3

    iget-object v0, p0, LQI3$c;->b:Ldf2;

    iget-object v0, v0, Ldf2;->c:Landroid/widget/TextView;

    invoke-virtual {p1}, Lco/bird/android/model/RepairLog;->getRepairSubType()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v0, p0, LQI3$c;->b:Ldf2;

    iget-object v0, v0, Ldf2;->b:Landroid/widget/TextView;

    iget-object v2, p0, Landroidx/recyclerview/widget/RecyclerView$D;->itemView:Landroid/view/View;

    invoke-virtual {v2}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v2

    sget v3, Lnl4;->past_repair_details_format:I

    const/4 v4, 0x2

    new-array v4, v4, [Ljava/lang/Object;

    const/4 v5, 0x0

    invoke-virtual {p1}, Lco/bird/android/model/RepairLog;->getRepairerEmail()Ljava/lang/String;

    move-result-object v6

    aput-object v6, v4, v5

    invoke-static {}, LQI3;->access$getDATE_FORMATTER$cp()Ljava/text/SimpleDateFormat;

    move-result-object v5

    invoke-virtual {p1}, Lco/bird/android/model/RepairLog;->getCreatedAtTime()Lorg/joda/time/DateTime;

    move-result-object p1

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Lorg/joda/time/base/AbstractInstant;->toDate()Ljava/util/Date;

    move-result-object v1

    :cond_1
    if-nez v1, :cond_2

    const-string v1, ""

    goto :goto_1

    :cond_2
    const-string p1, "repairLog.createdAtTime?.toDate() ?: \"\""

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    :goto_1
    invoke-virtual {v5, v1}, Ljava/text/Format;->format(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    const/4 v1, 0x1

    aput-object p1, v4, v1

    invoke-virtual {v2, v3, v4}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_3
    return-void
.end method
