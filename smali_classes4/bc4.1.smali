.class public final Lbc4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LF6;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0004\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\t\u001a\u00020\u00082\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016\u00a8\u0006\u000c"
    }
    d2 = {
        "Lbc4;",
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
        "qualitycontrol_release"
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
        "SMAP\nQualityControlResultAdapterDiff.kt\nKotlin\n*S Kotlin\n*F\n+ 1 QualityControlResultAdapterDiff.kt\nco/bird/android/qualitycontrol/result/adapters/QualityControlResultAdapterDiff\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,27:1\n18#2:28\n18#2:33\n18#2:38\n18#2:43\n9#3,4:29\n9#3,4:34\n9#3,4:39\n9#3,4:44\n*S KotlinDebug\n*F\n+ 1 QualityControlResultAdapterDiff.kt\nco/bird/android/qualitycontrol/result/adapters/QualityControlResultAdapterDiff\n*L\n13#1:28\n14#1:33\n16#1:38\n17#1:43\n13#1:29,4\n14#1:34,4\n16#1:39,4\n17#1:44,4\n*E\n"
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
    .locals 4

    const-string v0, "adapterItem"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, LG6;->b()I

    move-result v0

    sget v1, Ljk4;->item_vehicle_pass_fail:I

    const/4 v2, 0x0

    if-ne v0, v1, :cond_2

    invoke-virtual {p1}, LG6;->c()Ljava/lang/Object;

    move-result-object p1

    instance-of v0, p1, Lkotlin/Pair;

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    move-object p1, v2

    :goto_0
    check-cast p1, Lkotlin/Pair;

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Lkotlin/Pair;->getFirst()Ljava/lang/Object;

    move-result-object p1

    move-object v2, p1

    check-cast v2, Ljava/lang/Boolean;

    :cond_1
    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    goto/16 :goto_2

    :cond_2
    sget v1, Ljk4;->item_qc_pass_fail_text:I

    if-ne v0, v1, :cond_4

    invoke-virtual {p1}, LG6;->c()Ljava/lang/Object;

    move-result-object p1

    instance-of v0, p1, Ljava/lang/Boolean;

    if-eqz v0, :cond_3

    move-object v2, p1

    :cond_3
    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    goto :goto_2

    :cond_4
    sget v1, Lmk4;->item_button_secondary:I

    if-ne v0, v1, :cond_5

    const-string p1, "Add Issues"

    goto :goto_2

    :cond_5
    sget v1, Ljk4;->item_inspection_failed_issue:I

    const-string v3, ""

    if-ne v0, v1, :cond_8

    invoke-virtual {p1}, LG6;->c()Ljava/lang/Object;

    move-result-object p1

    instance-of v0, p1, Ljb4;

    if-eqz v0, :cond_6

    move-object v2, p1

    :cond_6
    check-cast v2, Ljb4;

    if-eqz v2, :cond_7

    invoke-virtual {v2}, Ljb4;->b()Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_d

    :cond_7
    :goto_1
    move-object p1, v3

    goto :goto_2

    :cond_8
    sget v1, Ljk4;->item_auto_check:I

    if-ne v0, v1, :cond_a

    invoke-virtual {p1}, LG6;->c()Ljava/lang/Object;

    move-result-object p1

    instance-of v0, p1, Lco/bird/android/model/QCAutoCheck;

    if-eqz v0, :cond_9

    move-object v2, p1

    :cond_9
    check-cast v2, Lco/bird/android/model/QCAutoCheck;

    if-eqz v2, :cond_7

    invoke-virtual {v2}, Lco/bird/android/model/QCAutoCheck;->getDisplay()Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_d

    goto :goto_1

    :cond_a
    sget p1, Ljk4;->item_passed_qc_buttons:I

    if-ne v0, p1, :cond_b

    const-string p1, "Success Action Buttons"

    goto :goto_2

    :cond_b
    sget p1, Ljk4;->item_add_notes:I

    if-ne v0, p1, :cond_c

    const-string p1, "Add Notes"

    goto :goto_2

    :cond_c
    sget p1, Lmk4;->item_button:I

    if-ne v0, p1, :cond_7

    const-string p1, "Failed Submit"

    :cond_d
    :goto_2
    return-object p1
.end method

.method public c(LG6;LG6;)Z
    .locals 1

    const-string v0, "oldItem"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "newItem"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p1, 0x0

    return p1
.end method
