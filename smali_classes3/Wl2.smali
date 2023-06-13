.class public final LWl2;
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
        "LWl2;",
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
        "SMAP\nLandingAdapterDiff.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LandingAdapterDiff.kt\nco/bird/android/feature/transferorder/landing/adapters/LandingAdapterDiff\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,33:1\n18#2:34\n18#2:39\n18#2:44\n18#2:49\n18#2:54\n9#3,4:35\n9#3,4:40\n9#3,4:45\n9#3,4:50\n9#3,4:55\n*S KotlinDebug\n*F\n+ 1 LandingAdapterDiff.kt\nco/bird/android/feature/transferorder/landing/adapters/LandingAdapterDiff\n*L\n14#1:34\n15#1:39\n16#1:44\n17#1:49\n27#1:54\n14#1:35,4\n15#1:40,4\n16#1:45,4\n17#1:50,4\n27#1:55,4\n*E\n"
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

    sget v1, LQj4;->item_order_item_date_range:I

    if-ne v0, v1, :cond_0

    const-string p1, "calendar_picker"

    goto :goto_1

    :cond_0
    sget v1, LQj4;->item_order_item_header:I

    const/4 v2, 0x0

    const-string v3, ""

    if-ne v0, v1, :cond_2

    invoke-virtual {p1}, LG6;->c()Ljava/lang/Object;

    move-result-object p1

    instance-of v0, p1, LVl0;

    if-eqz v0, :cond_1

    move-object v2, p1

    :cond_1
    check-cast v2, LVl0;

    if-eqz v2, :cond_8

    invoke-virtual {v2}, LVl0;->d()Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_9

    goto :goto_0

    :cond_2
    sget v1, LQj4;->item_order_item_date_subheader:I

    if-ne v0, v1, :cond_4

    invoke-virtual {p1}, LG6;->c()Ljava/lang/Object;

    move-result-object p1

    instance-of v0, p1, Ljava/lang/String;

    if-eqz v0, :cond_3

    move-object v2, p1

    :cond_3
    move-object p1, v2

    check-cast p1, Ljava/lang/String;

    if-nez p1, :cond_9

    goto :goto_0

    :cond_4
    sget v1, LQj4;->item_order_item_empty:I

    if-ne v0, v1, :cond_6

    invoke-virtual {p1}, LG6;->c()Ljava/lang/Object;

    move-result-object p1

    instance-of v0, p1, Ljava/lang/String;

    if-eqz v0, :cond_5

    move-object v2, p1

    :cond_5
    move-object p1, v2

    check-cast p1, Ljava/lang/String;

    if-nez p1, :cond_9

    goto :goto_0

    :cond_6
    sget v1, LQj4;->item_order_item:I

    if-ne v0, v1, :cond_8

    invoke-virtual {p1}, LG6;->c()Ljava/lang/Object;

    move-result-object p1

    instance-of v0, p1, LXl2;

    if-eqz v0, :cond_7

    move-object v2, p1

    :cond_7
    check-cast v2, LXl2;

    if-eqz v2, :cond_8

    invoke-virtual {v2}, LXl2;->b()Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_9

    :cond_8
    :goto_0
    move-object p1, v3

    :cond_9
    :goto_1
    return-object p1
.end method

.method public c(LG6;LG6;)Z
    .locals 3

    const-string v0, "oldItem"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "newItem"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, LG6;->c()Ljava/lang/Object;

    move-result-object p1

    instance-of v0, p1, LVl0;

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    goto :goto_1

    :cond_0
    instance-of v0, p1, Ljava/lang/String;

    const/4 v2, 0x0

    if-eqz v0, :cond_2

    invoke-virtual {p2}, LG6;->c()Ljava/lang/Object;

    move-result-object p2

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_1

    goto :goto_1

    :cond_1
    move v1, v2

    goto :goto_1

    :cond_2
    instance-of v0, p1, LXl2;

    if-eqz v0, :cond_4

    invoke-virtual {p2}, LG6;->c()Ljava/lang/Object;

    move-result-object p2

    instance-of v0, p2, LXl2;

    if-eqz v0, :cond_3

    goto :goto_0

    :cond_3
    const/4 p2, 0x0

    :goto_0
    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_1

    :cond_4
    :goto_1
    return v1
.end method
