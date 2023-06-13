.class public final LiD6$f;
.super Lw1;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LiD6;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "f"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\n\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0007\u0010\u0008\u00a8\u0006\u000e"
    }
    d2 = {
        "LiD6$f;",
        "Lw1;",
        "",
        "position",
        "",
        "bind",
        "Ltg2;",
        "b",
        "Ltg2;",
        "binding",
        "Landroid/view/View;",
        "view",
        "<init>",
        "(LiD6;Landroid/view/View;)V",
        "workorders_release"
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
        "SMAP\nWorkOrderDetailsAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WorkOrderDetailsAdapter.kt\nco/bird/android/feature/workorders/details/adapters/WorkOrderDetailsAdapter$RepairViewHolder\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,139:1\n18#2:140\n9#3,4:141\n*S KotlinDebug\n*F\n+ 1 WorkOrderDetailsAdapter.kt\nco/bird/android/feature/workorders/details/adapters/WorkOrderDetailsAdapter$RepairViewHolder\n*L\n104#1:140\n104#1:141,4\n*E\n"
    }
.end annotation


# instance fields
.field public final b:Ltg2;

.field public final synthetic c:LiD6;


# direct methods
.method public constructor <init>(LiD6;Landroid/view/View;)V
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

    iput-object p1, p0, LiD6$f;->c:LiD6;

    invoke-direct {p0, p2}, Lw1;-><init>(Landroid/view/View;)V

    invoke-static {p2}, Ltg2;->a(Landroid/view/View;)Ltg2;

    move-result-object p1

    const-string p2, "bind(view)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, LiD6$f;->b:Ltg2;

    return-void
.end method


# virtual methods
.method public bind(I)V
    .locals 4

    iget-object v0, p0, LiD6$f;->c:LiD6;

    invoke-static {v0}, LiD6;->access$getAdapterData(LiD6;)LE6;

    move-result-object v0

    invoke-virtual {v0}, LE6;->h()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LG6;

    invoke-virtual {p1}, LG6;->c()Ljava/lang/Object;

    move-result-object p1

    instance-of v0, p1, Lco/bird/android/model/LegacyRepair;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    move-object p1, v1

    :goto_0
    check-cast p1, Lco/bird/android/model/LegacyRepair;

    if-eqz p1, :cond_4

    iget-object v0, p0, LiD6$f;->c:LiD6;

    iget-object v2, p0, LiD6$f;->b:Ltg2;

    iget-object v2, v2, Ltg2;->d:Landroid/widget/TextView;

    invoke-virtual {p1}, Lco/bird/android/model/LegacyRepair;->getDisplay()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v2, p0, LiD6$f;->b:Ltg2;

    iget-object v2, v2, Ltg2;->f:Landroid/widget/TextView;

    invoke-static {v0}, LiD6;->access$getRepairDateFormat$p(LiD6;)Ljava/text/SimpleDateFormat;

    move-result-object v0

    invoke-virtual {p1}, Lco/bird/android/model/LegacyRepair;->getCreatedAt()Lorg/joda/time/DateTime;

    move-result-object v3

    if-eqz v3, :cond_1

    invoke-virtual {v3}, Lorg/joda/time/base/AbstractInstant;->toDate()Ljava/util/Date;

    move-result-object v3

    goto :goto_1

    :cond_1
    move-object v3, v1

    :goto_1
    invoke-virtual {v0, v3}, Ljava/text/DateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v0, p0, LiD6$f;->b:Ltg2;

    iget-object v0, v0, Ltg2;->e:Landroid/widget/TextView;

    invoke-virtual {p1}, Lco/bird/android/model/LegacyRepair;->getUser()Lco/bird/android/model/User;

    move-result-object v2

    if-eqz v2, :cond_2

    invoke-virtual {v2}, Lco/bird/android/model/User;->getOperatorRoles()Ljava/util/List;

    move-result-object v2

    if-eqz v2, :cond_2

    invoke-static {v2}, Lkotlin/collections/CollectionsKt;->first(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lco/bird/android/model/OperatorRole;

    if-eqz v2, :cond_2

    invoke-virtual {v2}, Lco/bird/android/model/OperatorRole;->getTitle()Ljava/lang/String;

    move-result-object v2

    goto :goto_2

    :cond_2
    move-object v2, v1

    :goto_2
    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v0, p0, LiD6$f;->b:Ltg2;

    iget-object v0, v0, Ltg2;->c:Landroid/widget/TextView;

    invoke-virtual {p1}, Lco/bird/android/model/LegacyRepair;->getUser()Lco/bird/android/model/User;

    move-result-object p1

    if-eqz p1, :cond_3

    invoke-virtual {p1}, Lco/bird/android/model/User;->getEmail()Ljava/lang/String;

    move-result-object v1

    :cond_3
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_4
    return-void
.end method
