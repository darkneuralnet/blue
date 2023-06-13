.class public final LXe6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LNo5;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\r\u0008\u0086\u0008\u0018\u00002\u00020\u0001B/\u0012\n\u0008\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0008\u0002\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u0004\u0012\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0004\u0008\u001a\u0010\u001bJ1\u0010\u0008\u001a\u00020\u00002\n\u0008\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u000e\u0008\u0002\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u00042\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005H\u00c6\u0001J\t\u0010\n\u001a\u00020\tH\u00d6\u0001J\t\u0010\u000c\u001a\u00020\u000bH\u00d6\u0001J\u0013\u0010\u0010\u001a\u00020\u000f2\u0008\u0010\u000e\u001a\u0004\u0018\u00010\rH\u00d6\u0003R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0011\u0010\u0012\u001a\u0004\u0008\u0013\u0010\u0014R \u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u00048\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0015\u0010\u0016\u001a\u0004\u0008\u0011\u0010\u0017R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0013\u0010\u0018\u001a\u0004\u0008\u0015\u0010\u0019\u00a8\u0006\u001c"
    }
    d2 = {
        "LXe6;",
        "LNo5;",
        "Lco/bird/android/model/wire/WireSkuScanItem;",
        "scanItem",
        "",
        "Lco/bird/android/model/wire/WireItemScrapReason;",
        "reasons",
        "selectedReason",
        "d",
        "",
        "toString",
        "",
        "hashCode",
        "",
        "other",
        "",
        "equals",
        "a",
        "Lco/bird/android/model/wire/WireSkuScanItem;",
        "c",
        "()Lco/bird/android/model/wire/WireSkuScanItem;",
        "b",
        "Ljava/util/List;",
        "()Ljava/util/List;",
        "Lco/bird/android/model/wire/WireItemScrapReason;",
        "()Lco/bird/android/model/wire/WireItemScrapReason;",
        "<init>",
        "(Lco/bird/android/model/wire/WireSkuScanItem;Ljava/util/List;Lco/bird/android/model/wire/WireItemScrapReason;)V",
        "co.bird.android.feature.transfer-order"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final a:Lco/bird/android/model/wire/WireSkuScanItem;

.field public final b:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lco/bird/android/model/wire/WireItemScrapReason;",
            ">;"
        }
    .end annotation
.end field

.field public final c:Lco/bird/android/model/wire/WireItemScrapReason;


# direct methods
.method public constructor <init>()V
    .locals 6

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x7

    const/4 v5, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v5}, LXe6;-><init>(Lco/bird/android/model/wire/WireSkuScanItem;Ljava/util/List;Lco/bird/android/model/wire/WireItemScrapReason;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Lco/bird/android/model/wire/WireSkuScanItem;Ljava/util/List;Lco/bird/android/model/wire/WireItemScrapReason;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/bird/android/model/wire/WireSkuScanItem;",
            "Ljava/util/List<",
            "Lco/bird/android/model/wire/WireItemScrapReason;",
            ">;",
            "Lco/bird/android/model/wire/WireItemScrapReason;",
            ")V"
        }
    .end annotation

    const-string v0, "reasons"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LXe6;->a:Lco/bird/android/model/wire/WireSkuScanItem;

    iput-object p2, p0, LXe6;->b:Ljava/util/List;

    iput-object p3, p0, LXe6;->c:Lco/bird/android/model/wire/WireItemScrapReason;

    return-void
.end method

.method public synthetic constructor <init>(Lco/bird/android/model/wire/WireSkuScanItem;Ljava/util/List;Lco/bird/android/model/wire/WireItemScrapReason;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    and-int/lit8 p5, p4, 0x1

    const/4 v0, 0x0

    if-eqz p5, :cond_0

    move-object p1, v0

    :cond_0
    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_1

    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object p2

    :cond_1
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_2

    move-object p3, v0

    :cond_2
    invoke-direct {p0, p1, p2, p3}, LXe6;-><init>(Lco/bird/android/model/wire/WireSkuScanItem;Ljava/util/List;Lco/bird/android/model/wire/WireItemScrapReason;)V

    return-void
.end method

.method public static synthetic copy$default(LXe6;Lco/bird/android/model/wire/WireSkuScanItem;Ljava/util/List;Lco/bird/android/model/wire/WireItemScrapReason;ILjava/lang/Object;)LXe6;
    .locals 0

    and-int/lit8 p5, p4, 0x1

    if-eqz p5, :cond_0

    iget-object p1, p0, LXe6;->a:Lco/bird/android/model/wire/WireSkuScanItem;

    :cond_0
    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_1

    iget-object p2, p0, LXe6;->b:Ljava/util/List;

    :cond_1
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_2

    iget-object p3, p0, LXe6;->c:Lco/bird/android/model/wire/WireItemScrapReason;

    :cond_2
    invoke-virtual {p0, p1, p2, p3}, LXe6;->d(Lco/bird/android/model/wire/WireSkuScanItem;Ljava/util/List;Lco/bird/android/model/wire/WireItemScrapReason;)LXe6;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public a()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lco/bird/android/model/wire/WireItemScrapReason;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, LXe6;->b:Ljava/util/List;

    return-object v0
.end method

.method public b()Lco/bird/android/model/wire/WireItemScrapReason;
    .locals 1

    iget-object v0, p0, LXe6;->c:Lco/bird/android/model/wire/WireItemScrapReason;

    return-object v0
.end method

.method public c()Lco/bird/android/model/wire/WireSkuScanItem;
    .locals 1

    iget-object v0, p0, LXe6;->a:Lco/bird/android/model/wire/WireSkuScanItem;

    return-object v0
.end method

.method public final d(Lco/bird/android/model/wire/WireSkuScanItem;Ljava/util/List;Lco/bird/android/model/wire/WireItemScrapReason;)LXe6;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/bird/android/model/wire/WireSkuScanItem;",
            "Ljava/util/List<",
            "Lco/bird/android/model/wire/WireItemScrapReason;",
            ">;",
            "Lco/bird/android/model/wire/WireItemScrapReason;",
            ")",
            "LXe6;"
        }
    .end annotation

    const-string v0, "reasons"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LXe6;

    invoke-direct {v0, p1, p2, p3}, LXe6;-><init>(Lco/bird/android/model/wire/WireSkuScanItem;Ljava/util/List;Lco/bird/android/model/wire/WireItemScrapReason;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, LXe6;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, LXe6;

    iget-object v1, p0, LXe6;->a:Lco/bird/android/model/wire/WireSkuScanItem;

    iget-object v3, p1, LXe6;->a:Lco/bird/android/model/wire/WireSkuScanItem;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, LXe6;->b:Ljava/util/List;

    iget-object v3, p1, LXe6;->b:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, LXe6;->c:Lco/bird/android/model/wire/WireItemScrapReason;

    iget-object p1, p1, LXe6;->c:Lco/bird/android/model/wire/WireItemScrapReason;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_4

    return v2

    :cond_4
    return v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, LXe6;->a:Lco/bird/android/model/wire/WireSkuScanItem;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Lco/bird/android/model/wire/WireSkuScanItem;->hashCode()I

    move-result v0

    :goto_0
    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, LXe6;->b:Ljava/util/List;

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, LXe6;->c:Lco/bird/android/model/wire/WireItemScrapReason;

    if-nez v2, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Lco/bird/android/model/wire/WireItemScrapReason;->hashCode()I

    move-result v1

    :goto_1
    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 5

    iget-object v0, p0, LXe6;->a:Lco/bird/android/model/wire/WireSkuScanItem;

    iget-object v1, p0, LXe6;->b:Ljava/util/List;

    iget-object v2, p0, LXe6;->c:Lco/bird/android/model/wire/WireItemScrapReason;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "UpdateUi(scanItem="

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", reasons="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", selectedReason="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
