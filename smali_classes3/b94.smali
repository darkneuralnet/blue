.class public final Lb94;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000>\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001aI\u0010\u0008\u001a\u00020\u0007\"\u0004\u0008\u0000\u0010\u0000*\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00028\u00000\u00020\u00012\u0006\u0010\u0003\u001a\u00028\u00002\u001c\u0008\u0002\u0010\u0006\u001a\u0016\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0004j\n\u0012\u0004\u0012\u00028\u0000\u0018\u0001`\u0005\u00a2\u0006\u0004\u0008\u0008\u0010\t\"3\u0010\u000f\u001a\u0010\u0012\u000c\u0012\n \u000c*\u0004\u0018\u00018\u00008\u00000\u000b\"\u0008\u0008\u0000\u0010\u0000*\u00020\n*\u0008\u0012\u0004\u0012\u00028\u00000\u00018F\u00a2\u0006\u0006\u001a\u0004\u0008\r\u0010\u000e*p\u0010\u0014\u001a\u0004\u0008\u0000\u0010\u0000\"2\u0012\u0013\u0012\u00118\u0000\u00a2\u0006\u000c\u0008\u0011\u0012\u0008\u0008\u0012\u0012\u0004\u0008\u0008(\u0013\u0012\u0013\u0012\u00118\u0000\u00a2\u0006\u000c\u0008\u0011\u0012\u0008\u0008\u0012\u0012\u0004\u0008\u0008(\u0003\u0012\u0004\u0012\u00028\u00000\u001022\u0012\u0013\u0012\u00118\u0000\u00a2\u0006\u000c\u0008\u0011\u0012\u0008\u0008\u0012\u0012\u0004\u0008\u0008(\u0013\u0012\u0013\u0012\u00118\u0000\u00a2\u0006\u000c\u0008\u0011\u0012\u0008\u0008\u0012\u0012\u0004\u0008\u0008(\u0003\u0012\u0004\u0012\u00028\u00000\u0010*F\u0010\u0017\u001a\u0004\u0008\u0000\u0010\u0000\"\u001d\u0012\u0013\u0012\u00118\u0000\u00a2\u0006\u000c\u0008\u0011\u0012\u0008\u0008\u0012\u0012\u0004\u0008\u0008(\u0016\u0012\u0004\u0012\u00028\u00000\u00152\u001d\u0012\u0013\u0012\u00118\u0000\u00a2\u0006\u000c\u0008\u0011\u0012\u0008\u0008\u0012\u0012\u0004\u0008\u0008(\u0016\u0012\u0004\u0012\u00028\u00000\u0015\u00a8\u0006\u0018"
    }
    d2 = {
        "T",
        "La94;",
        "",
        "newValue",
        "Ljava/util/Comparator;",
        "Lkotlin/Comparator;",
        "comparator",
        "",
        "b",
        "(La94;Ljava/lang/Object;Ljava/util/Comparator;)V",
        "",
        "LZ84;",
        "kotlin.jvm.PlatformType",
        "a",
        "(La94;)LZ84;",
        "toPropertyObservable",
        "Lkotlin/Function2;",
        "Lkotlin/ParameterName;",
        "name",
        "oldValue",
        "Merger",
        "Lkotlin/Function1;",
        "currentValue",
        "Modifier",
        "rx_release"
    }
    k = 0x2
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# direct methods
.method public static final a(La94;)LZ84;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "La94<",
            "TT;>;)",
            "LZ84<",
            "TT;>;"
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, LZ84;->d:LZ84$a;

    invoke-virtual {v0, p0}, LZ84$a;->b(Lio/reactivex/Observable;)LZ84;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$upsert$isEqualTo(Ljava/lang/Object;Ljava/util/Comparator;Ljava/lang/Object;)Z
    .locals 0

    invoke-static {p0, p1, p2}, Lb94;->c(Ljava/lang/Object;Ljava/util/Comparator;Ljava/lang/Object;)Z

    move-result p0

    return p0
.end method

.method public static final b(La94;Ljava/lang/Object;Ljava/util/Comparator;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "La94<",
            "Ljava/util/List<",
            "TT;>;>;TT;",
            "Ljava/util/Comparator<",
            "TT;>;)V"
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lb94$a;

    invoke-direct {v0, p1, p2}, Lb94$a;-><init>(Ljava/lang/Object;Ljava/util/Comparator;)V

    invoke-virtual {p0, v0}, La94;->i(Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method public static final c(Ljava/lang/Object;Ljava/util/Comparator;Ljava/lang/Object;)Z
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(TT;",
            "Ljava/util/Comparator<",
            "TT;>;TT;)Z"
        }
    .end annotation

    if-eqz p1, :cond_1

    invoke-interface {p1, p0, p2}, Ljava/util/Comparator;->compare(Ljava/lang/Object;Ljava/lang/Object;)I

    move-result p0

    if-nez p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    goto :goto_0

    :cond_1
    invoke-static {p0, p2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    :goto_0
    return p0
.end method

.method public static synthetic upsert$default(La94;Ljava/lang/Object;Ljava/util/Comparator;ILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const/4 p2, 0x0

    :cond_0
    invoke-static {p0, p1, p2}, Lb94;->b(La94;Ljava/lang/Object;Ljava/util/Comparator;)V

    return-void
.end method
