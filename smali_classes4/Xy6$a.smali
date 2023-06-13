.class public LXy6$a;
.super Lcf1;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LXy6;-><init>(LEb5;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcf1<",
        "Lco/bird/android/model/persistence/WarehouseMarker;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic d:LXy6;


# direct methods
.method public constructor <init>(LXy6;LEb5;)V
    .locals 0

    iput-object p1, p0, LXy6$a;->d:LXy6;

    invoke-direct {p0, p2}, Lcf1;-><init>(LEb5;)V

    return-void
.end method


# virtual methods
.method public e()Ljava/lang/String;
    .locals 1

    const-string v0, "INSERT OR IGNORE INTO `warehouse_markers` (`id`,`location`) VALUES (?,?)"

    return-object v0
.end method

.method public bridge synthetic i(LqV5;Ljava/lang/Object;)V
    .locals 0

    check-cast p2, Lco/bird/android/model/persistence/WarehouseMarker;

    invoke-virtual {p0, p1, p2}, LXy6$a;->p(LqV5;Lco/bird/android/model/persistence/WarehouseMarker;)V

    return-void
.end method

.method public p(LqV5;Lco/bird/android/model/persistence/WarehouseMarker;)V
    .locals 2

    invoke-virtual {p2}, Lco/bird/android/model/persistence/WarehouseMarker;->getId()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    if-nez v0, :cond_0

    invoke-interface {p1, v1}, LoV5;->m1(I)V

    goto :goto_0

    :cond_0
    invoke-virtual {p2}, Lco/bird/android/model/persistence/WarehouseMarker;->getId()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, LoV5;->G0(ILjava/lang/String;)V

    :goto_0
    sget-object v0, Lco/bird/android/persistence/common/impl/Converters;->a:Lco/bird/android/persistence/common/impl/Converters;

    invoke-virtual {p2}, Lco/bird/android/model/persistence/WarehouseMarker;->getLocation()Lco/bird/android/model/Point;

    move-result-object p2

    invoke-static {p2}, Lco/bird/android/persistence/common/impl/Converters;->i(Lco/bird/android/model/Point;)Ljava/lang/String;

    move-result-object p2

    const/4 v0, 0x2

    if-nez p2, :cond_1

    invoke-interface {p1, v0}, LoV5;->m1(I)V

    goto :goto_1

    :cond_1
    invoke-interface {p1, v0, p2}, LoV5;->G0(ILjava/lang/String;)V

    :goto_1
    return-void
.end method
