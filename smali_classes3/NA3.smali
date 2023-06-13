.class public final LNA3;
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
        "LNA3;",
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
        "ownedbirds_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
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
    .locals 1

    const-string v0, "adapterItem"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, LG6;->b()I

    move-result p1

    sget v0, LAj4;->item_bird_details:I

    if-ne p1, v0, :cond_0

    const-string p1, "details"

    goto :goto_0

    :cond_0
    sget v0, LAj4;->item_tamper_alarm:I

    if-ne p1, v0, :cond_1

    const-string p1, "tamper"

    goto :goto_0

    :cond_1
    sget v0, LAj4;->item_location:I

    if-ne p1, v0, :cond_2

    const-string p1, "location"

    goto :goto_0

    :cond_2
    sget v0, LAj4;->item_last_ridden:I

    if-ne p1, v0, :cond_3

    const-string p1, "last_ridden"

    goto :goto_0

    :cond_3
    sget v0, LAj4;->item_support:I

    if-ne p1, v0, :cond_4

    const-string p1, "support"

    goto :goto_0

    :cond_4
    sget v0, LAj4;->item_actions:I

    if-ne p1, v0, :cond_5

    const-string p1, "actions"

    goto :goto_0

    :cond_5
    sget v0, LAj4;->item_reset_trip_odometer:I

    if-ne p1, v0, :cond_6

    const-string p1, "trip"

    goto :goto_0

    :cond_6
    sget v0, LAj4;->item_reset_service_reminder:I

    if-ne p1, v0, :cond_7

    const-string p1, "service"

    goto :goto_0

    :cond_7
    const-string p1, ""

    :goto_0
    return-object p1
.end method

.method public c(LG6;LG6;)Z
    .locals 1

    const-string v0, "oldItem"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "newItem"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, LG6;->c()Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {p2}, LG6;->c()Ljava/lang/Object;

    move-result-object p2

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    xor-int/lit8 p1, p1, 0x1

    return p1
.end method
