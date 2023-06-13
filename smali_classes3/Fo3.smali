.class public final LFo3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LF6;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0004\u0008\u0000\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\t\u001a\u00020\u00082\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016\u00a8\u0006\u000c"
    }
    d2 = {
        "LFo3;",
        "LF6;",
        "LG6;",
        "adapterItem",
        "",
        "b",
        "oldItem",
        "newItem",
        "",
        "c",
        "<init>",
        "()V",
        "co.bird.android.feature.transfer-order"
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
        "SMAP\nOperatorOrderDetailsAdapterDiff.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OperatorOrderDetailsAdapterDiff.kt\nco/bird/android/feature/transferorder/operator/details/adapters/OperatorOrderDetailsAdapterDiff\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,43:1\n18#2:44\n18#2:49\n18#2:54\n18#2:59\n18#2:64\n18#2:69\n18#2:74\n18#2:79\n18#2:84\n9#3,4:45\n9#3,4:50\n9#3,4:55\n9#3,4:60\n9#3,4:65\n9#3,4:70\n9#3,4:75\n9#3,4:80\n9#3,4:85\n*S KotlinDebug\n*F\n+ 1 OperatorOrderDetailsAdapterDiff.kt\nco/bird/android/feature/transferorder/operator/details/adapters/OperatorOrderDetailsAdapterDiff\n*L\n15#1:44\n17#1:49\n18#1:54\n19#1:59\n20#1:64\n28#1:69\n31#1:74\n34#1:79\n37#1:84\n15#1:45,4\n17#1:50,4\n18#1:55,4\n19#1:60,4\n20#1:65,4\n28#1:70,4\n31#1:75,4\n34#1:80,4\n37#1:85,4\n*E\n"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/util/List;Ljava/util/List;)Landroidx/recyclerview/widget/h$e;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "LH6;",
            ">;",
            "Ljava/util/List<",
            "LH6;",
            ">;)",
            "Landroidx/recyclerview/widget/h$e;"
        }
    .end annotation

    invoke-static {p0, p1, p2}, LF6$a;->a(LF6;Ljava/util/List;Ljava/util/List;)Landroidx/recyclerview/widget/h$e;

    move-result-object p1

    return-object p1
.end method

.method public b(LG6;)Ljava/lang/String;
    .locals 5

    const-string v0, "adapterItem"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, LG6;->b()I

    move-result v0

    sget v1, LQj4;->item_operator_order_header:I

    const/4 v2, 0x0

    const-string v3, ""

    if-ne v0, v1, :cond_2

    invoke-virtual {p1}, LG6;->c()Ljava/lang/Object;

    move-result-object p1

    instance-of v0, p1, Lnp3;

    if-eqz v0, :cond_0

    move-object v2, p1

    :cond_0
    check-cast v2, Lnp3;

    if-eqz v2, :cond_c

    invoke-virtual {v2}, Lnp3;->c()Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_1

    goto/16 :goto_1

    :cond_1
    move-object v3, p1

    goto/16 :goto_1

    :cond_2
    sget v1, LQj4;->item_operator_order_location:I

    const/4 v4, 0x1

    if-ne v0, v1, :cond_3

    goto :goto_0

    :cond_3
    sget v1, LQj4;->item_operator_order_delivery_point:I

    if-ne v0, v1, :cond_4

    goto :goto_0

    :cond_4
    const/4 v4, 0x0

    :goto_0
    if-eqz v4, :cond_6

    invoke-virtual {p1}, LG6;->c()Ljava/lang/Object;

    move-result-object p1

    instance-of v0, p1, Lco/bird/android/model/persistence/OperatorOrderView;

    if-eqz v0, :cond_5

    move-object v2, p1

    :cond_5
    check-cast v2, Lco/bird/android/model/persistence/OperatorOrderView;

    if-eqz v2, :cond_c

    invoke-virtual {v2}, Lco/bird/android/model/persistence/OperatorOrderView;->getLocationName()Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_1

    goto :goto_1

    :cond_6
    sget v1, LQj4;->item_operator_order_date:I

    if-ne v0, v1, :cond_8

    invoke-virtual {p1}, LG6;->c()Ljava/lang/Object;

    move-result-object p1

    instance-of v0, p1, LBo3;

    if-eqz v0, :cond_7

    move-object v2, p1

    :cond_7
    check-cast v2, LBo3;

    if-eqz v2, :cond_c

    invoke-virtual {v2}, LBo3;->b()Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_1

    goto :goto_1

    :cond_8
    sget v1, LQj4;->item_operator_order_bill_of_lading:I

    if-ne v0, v1, :cond_a

    invoke-virtual {p1}, LG6;->c()Ljava/lang/Object;

    move-result-object p1

    instance-of v0, p1, Lco/bird/android/model/persistence/OperatorOrderView;

    if-eqz v0, :cond_9

    move-object v2, p1

    :cond_9
    check-cast v2, Lco/bird/android/model/persistence/OperatorOrderView;

    if-eqz v2, :cond_c

    invoke-virtual {v2}, Lco/bird/android/model/persistence/OperatorOrderView;->getBolStatusText()Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_1

    goto :goto_1

    :cond_a
    sget v1, LQj4;->item_operator_order_detail:I

    if-ne v0, v1, :cond_c

    invoke-virtual {p1}, LG6;->c()Ljava/lang/Object;

    move-result-object p1

    instance-of v0, p1, LCo3;

    if-eqz v0, :cond_b

    move-object v2, p1

    :cond_b
    check-cast v2, LCo3;

    if-eqz v2, :cond_c

    invoke-virtual {v2}, LCo3;->c()Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_1

    :cond_c
    :goto_1
    return-object v3
.end method

.method public c(LG6;LG6;)Z
    .locals 4

    const-string v0, "oldItem"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "newItem"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, LG6;->c()Ljava/lang/Object;

    move-result-object p1

    instance-of v0, p1, Lnp3;

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-eqz v0, :cond_1

    invoke-virtual {p2}, LG6;->c()Ljava/lang/Object;

    move-result-object p2

    instance-of v0, p2, Lnp3;

    if-eqz v0, :cond_0

    move-object v2, p2

    :cond_0
    invoke-static {p1, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_8

    goto :goto_0

    :cond_1
    instance-of v0, p1, Lco/bird/android/model/persistence/OperatorOrderView;

    if-eqz v0, :cond_3

    invoke-virtual {p2}, LG6;->c()Ljava/lang/Object;

    move-result-object p2

    instance-of v0, p2, Lco/bird/android/model/persistence/OperatorOrderView;

    if-eqz v0, :cond_2

    move-object v2, p2

    :cond_2
    invoke-static {p1, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_8

    goto :goto_0

    :cond_3
    instance-of v0, p1, LBo3;

    if-eqz v0, :cond_5

    invoke-virtual {p2}, LG6;->c()Ljava/lang/Object;

    move-result-object p2

    instance-of v0, p2, LBo3;

    if-eqz v0, :cond_4

    move-object v2, p2

    :cond_4
    invoke-static {p1, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_8

    goto :goto_0

    :cond_5
    instance-of v0, p1, LCo3;

    if-eqz v0, :cond_7

    invoke-virtual {p2}, LG6;->c()Ljava/lang/Object;

    move-result-object p2

    instance-of v0, p2, LCo3;

    if-eqz v0, :cond_6

    move-object v2, p2

    :cond_6
    invoke-static {p1, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_8

    :cond_7
    :goto_0
    move v1, v3

    :cond_8
    return v1
.end method
