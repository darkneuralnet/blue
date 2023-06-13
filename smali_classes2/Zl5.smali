.class public final LZl5;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0003\u001a\"\u0010\u0005\u001a\u00020\u0000*\u00020\u00002\n\u0008\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00012\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u001a$\u0010\u000b\u001a\u00020\u0000*\u00020\u00002\u0018\u0010\n\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0008\u0012\u0004\u0012\u00020\t0\u00070\u0006\u00a8\u0006\u000c"
    }
    d2 = {
        "LYl5;",
        "Lno/nordicsemi/android/support/v18/scanner/ScanFilter;",
        "scanFilter",
        "Lorg/joda/time/DateTime;",
        "excludeResultsOlderThan",
        "b",
        "",
        "Lkotlin/Function1;",
        "Lco/bird/android/bluetooth/model/ScannedDevice;",
        "",
        "filters",
        "a",
        "interface_release"
    }
    k = 0x2
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nScannedDevices+.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScannedDevices+.kt\nco/bird/android/bluetooth/util/ScannedDevices_Kt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,30:1\n1#2:31\n766#3:32\n857#3:33\n1855#3,2:34\n858#3:36\n*S KotlinDebug\n*F\n+ 1 ScannedDevices+.kt\nco/bird/android/bluetooth/util/ScannedDevices_Kt\n*L\n20#1:32\n20#1:33\n21#1:34,2\n20#1:36\n*E\n"
    }
.end annotation


# direct methods
.method public static final a(LYl5;Ljava/util/List;)LYl5;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LYl5;",
            "Ljava/util/List<",
            "+",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lco/bird/android/bluetooth/model/ScannedDevice;",
            "Ljava/lang/Boolean;",
            ">;>;)",
            "LYl5;"
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "filters"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, LYl5;->b()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    move-object v3, v2

    check-cast v3, Lco/bird/android/bluetooth/model/ScannedDevice;

    move-object v4, p1

    check-cast v4, Ljava/lang/Iterable;

    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_1
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_2

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lkotlin/jvm/functions/Function1;

    invoke-interface {v5, v3}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Boolean;

    invoke-virtual {v5}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v5

    if-nez v5, :cond_1

    const/4 v3, 0x0

    goto :goto_1

    :cond_2
    const/4 v3, 0x1

    :goto_1
    if-eqz v3, :cond_0

    invoke-interface {v1, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_3
    invoke-virtual {p0, v1}, LYl5;->a(Ljava/util/List;)LYl5;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic applyScanFilters$default(LYl5;Lno/nordicsemi/android/support/v18/scanner/ScanFilter;Lorg/joda/time/DateTime;ILjava/lang/Object;)LYl5;
    .locals 1

    and-int/lit8 p4, p3, 0x1

    const/4 v0, 0x0

    if-eqz p4, :cond_0

    move-object p1, v0

    :cond_0
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    move-object p2, v0

    :cond_1
    invoke-static {p0, p1, p2}, LZl5;->b(LYl5;Lno/nordicsemi/android/support/v18/scanner/ScanFilter;Lorg/joda/time/DateTime;)LYl5;

    move-result-object p0

    return-object p0
.end method

.method public static final b(LYl5;Lno/nordicsemi/android/support/v18/scanner/ScanFilter;Lorg/joda/time/DateTime;)LYl5;
    .locals 2

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    new-instance v1, LZl5$b;

    invoke-direct {v1, p1}, LZl5$b;-><init>(Lno/nordicsemi/android/support/v18/scanner/ScanFilter;)V

    goto :goto_0

    :cond_0
    move-object v1, v0

    :goto_0
    if-eqz p2, :cond_1

    new-instance v0, LZl5$a;

    invoke-direct {v0, p2}, LZl5$a;-><init>(Lorg/joda/time/DateTime;)V

    :cond_1
    const/4 p1, 0x2

    new-array p1, p1, [Lkotlin/jvm/functions/Function1;

    const/4 p2, 0x0

    aput-object v1, p1, p2

    const/4 p2, 0x1

    aput-object v0, p1, p2

    invoke-static {p1}, Lkotlin/collections/CollectionsKt;->listOfNotNull([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    invoke-static {p0, p1}, LZl5;->a(LYl5;Ljava/util/List;)LYl5;

    move-result-object p0

    return-object p0
.end method
