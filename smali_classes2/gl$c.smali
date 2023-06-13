.class public final Lgl$c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lgl;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "c"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\n\u0008\u0086\u0008\u0018\u00002\u00020\u0001B\u0019\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0014\u0010\u0015J\u001f\u0010\u0006\u001a\u00020\u00002\n\u0008\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u0004H\u00c6\u0001J\t\u0010\u0008\u001a\u00020\u0007H\u00d6\u0001J\t\u0010\n\u001a\u00020\tH\u00d6\u0001J\u0013\u0010\r\u001a\u00020\u000c2\u0008\u0010\u000b\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010\u000e\u001a\u0004\u0008\u000f\u0010\u0010R\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0005\u0010\u0011\u001a\u0004\u0008\u0012\u0010\u0013\u00a8\u0006\u0016"
    }
    d2 = {
        "Lgl$c;",
        "",
        "Lco/bird/android/model/wire/WireBird;",
        "wireBird",
        "Lco/bird/android/model/itemlease/ItemLease;",
        "itemLease",
        "a",
        "",
        "toString",
        "",
        "hashCode",
        "other",
        "",
        "equals",
        "Lco/bird/android/model/wire/WireBird;",
        "c",
        "()Lco/bird/android/model/wire/WireBird;",
        "Lco/bird/android/model/itemlease/ItemLease;",
        "b",
        "()Lco/bird/android/model/itemlease/ItemLease;",
        "<init>",
        "(Lco/bird/android/model/wire/WireBird;Lco/bird/android/model/itemlease/ItemLease;)V",
        "config_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field private final itemLease:Lco/bird/android/model/itemlease/ItemLease;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "item_lease"
    .end annotation

    .annotation runtime Lft5;
        value = "item_lease"
    .end annotation
.end field

.field private final wireBird:Lco/bird/android/model/wire/WireBird;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "wire_bird"
    .end annotation

    .annotation runtime Lft5;
        value = "wire_bird"
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lco/bird/android/model/wire/WireBird;Lco/bird/android/model/itemlease/ItemLease;)V
    .locals 1

    const-string v0, "itemLease"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lgl$c;->wireBird:Lco/bird/android/model/wire/WireBird;

    iput-object p2, p0, Lgl$c;->itemLease:Lco/bird/android/model/itemlease/ItemLease;

    return-void
.end method

.method public static synthetic copy$default(Lgl$c;Lco/bird/android/model/wire/WireBird;Lco/bird/android/model/itemlease/ItemLease;ILjava/lang/Object;)Lgl$c;
    .locals 0

    and-int/lit8 p4, p3, 0x1

    if-eqz p4, :cond_0

    iget-object p1, p0, Lgl$c;->wireBird:Lco/bird/android/model/wire/WireBird;

    :cond_0
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    iget-object p2, p0, Lgl$c;->itemLease:Lco/bird/android/model/itemlease/ItemLease;

    :cond_1
    invoke-virtual {p0, p1, p2}, Lgl$c;->a(Lco/bird/android/model/wire/WireBird;Lco/bird/android/model/itemlease/ItemLease;)Lgl$c;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final a(Lco/bird/android/model/wire/WireBird;Lco/bird/android/model/itemlease/ItemLease;)Lgl$c;
    .locals 1

    const-string v0, "itemLease"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lgl$c;

    invoke-direct {v0, p1, p2}, Lgl$c;-><init>(Lco/bird/android/model/wire/WireBird;Lco/bird/android/model/itemlease/ItemLease;)V

    return-object v0
.end method

.method public final b()Lco/bird/android/model/itemlease/ItemLease;
    .locals 1

    iget-object v0, p0, Lgl$c;->itemLease:Lco/bird/android/model/itemlease/ItemLease;

    return-object v0
.end method

.method public final c()Lco/bird/android/model/wire/WireBird;
    .locals 1

    iget-object v0, p0, Lgl$c;->wireBird:Lco/bird/android/model/wire/WireBird;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lgl$c;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lgl$c;

    iget-object v1, p0, Lgl$c;->wireBird:Lco/bird/android/model/wire/WireBird;

    iget-object v3, p1, Lgl$c;->wireBird:Lco/bird/android/model/wire/WireBird;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lgl$c;->itemLease:Lco/bird/android/model/itemlease/ItemLease;

    iget-object p1, p1, Lgl$c;->itemLease:Lco/bird/android/model/itemlease/ItemLease;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_3

    return v2

    :cond_3
    return v0
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Lgl$c;->wireBird:Lco/bird/android/model/wire/WireBird;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Lco/bird/android/model/wire/WireBird;->hashCode()I

    move-result v0

    :goto_0
    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lgl$c;->itemLease:Lco/bird/android/model/itemlease/ItemLease;

    invoke-virtual {v1}, Lco/bird/android/model/itemlease/ItemLease;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    iget-object v0, p0, Lgl$c;->wireBird:Lco/bird/android/model/wire/WireBird;

    iget-object v1, p0, Lgl$c;->itemLease:Lco/bird/android/model/itemlease/ItemLease;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "PersistedLeaseDetail(wireBird="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", itemLease="

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
