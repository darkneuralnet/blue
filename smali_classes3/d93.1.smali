.class public final Ld93;
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
        "Ld93;",
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
        "SMAP\nNonRepairAdapterDiff.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NonRepairAdapterDiff.kt\nco/bird/android/feature/repair/v3/issues/dialogs/nonrepair/adapters/NonRepairAdapterDiff\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,29:1\n18#2:30\n18#2:35\n9#3,4:31\n9#3,4:36\n*S KotlinDebug\n*F\n+ 1 NonRepairAdapterDiff.kt\nco/bird/android/feature/repair/v3/issues/dialogs/nonrepair/adapters/NonRepairAdapterDiff\n*L\n13#1:30\n22#1:35\n13#1:31,4\n22#1:36,4\n*E\n"
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
    .locals 3

    const-string v0, "adapterItem"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, LG6;->b()I

    move-result v0

    sget v1, LEj4;->item_non_repair:I

    if-ne v0, v1, :cond_0

    const-string p1, "non_repair"

    goto :goto_2

    :cond_0
    sget v1, LEj4;->item_non_repair_reason:I

    const-string v2, ""

    if-ne v0, v1, :cond_2

    invoke-virtual {p1}, LG6;->c()Ljava/lang/Object;

    move-result-object p1

    instance-of v0, p1, Lco/bird/android/model/NonRepairReason;

    if-eqz v0, :cond_1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    :goto_0
    check-cast p1, Lco/bird/android/model/NonRepairReason;

    if-eqz p1, :cond_3

    invoke-virtual {p1}, Lco/bird/android/model/NonRepairReason;->getReason()Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_4

    goto :goto_1

    :cond_2
    sget p1, LEj4;->item_non_repair_notes:I

    if-ne v0, p1, :cond_3

    const-string p1, "notes"

    goto :goto_2

    :cond_3
    :goto_1
    move-object p1, v2

    :cond_4
    :goto_2
    return-object p1
.end method

.method public c(LG6;LG6;)Z
    .locals 2

    const-string v0, "oldItem"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "newItem"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, LG6;->c()Ljava/lang/Object;

    move-result-object p1

    instance-of v0, p1, Lco/bird/android/model/NonRepairReason;

    const/4 v1, 0x0

    if-eqz v0, :cond_2

    invoke-virtual {p2}, LG6;->c()Ljava/lang/Object;

    move-result-object p2

    instance-of v0, p2, Lco/bird/android/model/NonRepairReason;

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p2, 0x0

    :goto_0
    check-cast p2, Lco/bird/android/model/NonRepairReason;

    const/4 v0, 0x1

    if-eqz p2, :cond_1

    check-cast p1, Lco/bird/android/model/NonRepairReason;

    invoke-virtual {p1}, Lco/bird/android/model/NonRepairReason;->getSelected()Z

    move-result p1

    invoke-virtual {p2}, Lco/bird/android/model/NonRepairReason;->getSelected()Z

    move-result p2

    if-ne p1, p2, :cond_1

    move p1, v0

    goto :goto_1

    :cond_1
    move p1, v1

    :goto_1
    if-nez p1, :cond_2

    move v1, v0

    :cond_2
    return v1
.end method