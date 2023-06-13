.class public abstract LXm;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\t\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0008\u0008\'\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\"\u0010#J\u0016\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\'J$\u0010\n\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\t0\u00080\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0005H\'J\u001e\u0010\r\u001a\u00020\u000c2\u0006\u0010\u0003\u001a\u00020\u00022\u000c\u0010\u000b\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u0008H\'J\u001e\u0010\u0011\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u00102\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000eH\'J\u0010\u0010\u0012\u001a\u00020\u000c2\u0006\u0010\u0003\u001a\u00020\u0002H\'J\u0008\u0010\u0013\u001a\u00020\u000cH\'J\u001c\u0010\u0014\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00020\u00080\u00102\u0006\u0010\u0003\u001a\u00020\u0002H\'J\"\u0010\u0016\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\t0\u00080\u00102\u000c\u0010\u0015\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u0008H\'J)\u0010\u001a\u001a\u0008\u0012\u0004\u0012\u00020\u00190\u00082\u0012\u0010\u0018\u001a\n\u0012\u0006\u0008\u0001\u0012\u00020\t0\u0017\"\u00020\tH%\u00a2\u0006\u0004\u0008\u001a\u0010\u001bJ#\u0010\u001d\u001a\u00020\u001c2\u0012\u0010\u0018\u001a\n\u0012\u0006\u0008\u0001\u0012\u00020\t0\u0017\"\u00020\tH%\u00a2\u0006\u0004\u0008\u001d\u0010\u001eJ\u001c\u0010 \u001a\u0008\u0012\u0004\u0012\u00020\u00020\u00082\u000c\u0010\u001f\u001a\u0008\u0012\u0004\u0012\u00020\u00190\u0008H%J#\u0010!\u001a\u00020\u001c2\u0012\u0010\u0018\u001a\n\u0012\u0006\u0008\u0001\u0012\u00020\t0\u0017\"\u00020\tH\u0017\u00a2\u0006\u0004\u0008!\u0010\u001e\u00a8\u0006$"
    }
    d2 = {
        "LXm;",
        "",
        "",
        "role",
        "Lio/reactivex/k;",
        "",
        "e",
        "offset",
        "",
        "Lco/bird/android/model/persistence/Area;",
        "a",
        "retainedAreaIds",
        "Lio/reactivex/c;",
        "i",
        "Lorg/joda/time/DateTime;",
        "before",
        "Lio/reactivex/F;",
        "j",
        "d",
        "c",
        "f",
        "ids",
        "b",
        "",
        "areas",
        "",
        "h",
        "([Lco/bird/android/model/persistence/Area;)Ljava/util/List;",
        "",
        "k",
        "([Lco/bird/android/model/persistence/Area;)V",
        "rowids",
        "g",
        "l",
        "<init>",
        "()V",
        "co.bird.android.lib.persistence.area.api"
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
.method public abstract a(Ljava/lang/String;I)Lio/reactivex/k;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "I)",
            "Lio/reactivex/k<",
            "Ljava/util/List<",
            "Lco/bird/android/model/persistence/Area;",
            ">;>;"
        }
    .end annotation
.end method

.method public abstract b(Ljava/util/List;)Lio/reactivex/F;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)",
            "Lio/reactivex/F<",
            "Ljava/util/List<",
            "Lco/bird/android/model/persistence/Area;",
            ">;>;"
        }
    .end annotation
.end method

.method public abstract c()Lio/reactivex/c;
.end method

.method public abstract d(Ljava/lang/String;)Lio/reactivex/c;
.end method

.method public abstract e(Ljava/lang/String;)Lio/reactivex/k;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lio/reactivex/k<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end method

.method public abstract f(Ljava/lang/String;)Lio/reactivex/F;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lio/reactivex/F<",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;>;"
        }
    .end annotation
.end method

.method public abstract g(Ljava/util/List;)Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/Long;",
            ">;)",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end method

.method public varargs abstract h([Lco/bird/android/model/persistence/Area;)Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([",
            "Lco/bird/android/model/persistence/Area;",
            ")",
            "Ljava/util/List<",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation
.end method

.method public abstract i(Ljava/lang/String;Ljava/util/List;)Lio/reactivex/c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)",
            "Lio/reactivex/c;"
        }
    .end annotation
.end method

.method public abstract j(Ljava/lang/String;Lorg/joda/time/DateTime;)Lio/reactivex/F;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lorg/joda/time/DateTime;",
            ")",
            "Lio/reactivex/F<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end method

.method public varargs abstract k([Lco/bird/android/model/persistence/Area;)V
.end method

.method public varargs l([Lco/bird/android/model/persistence/Area;)V
    .locals 2

    const-string v0, "areas"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Lkotlin/collections/ArraysKt;->toList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    new-instance v0, LXm$a;

    invoke-direct {v0, p0}, LXm$a;-><init>(LXm;)V

    const/16 v1, 0x3e7

    invoke-static {p1, v1, v0}, Lkotlin/collections/CollectionsKt;->chunked(Ljava/lang/Iterable;ILkotlin/jvm/functions/Function1;)Ljava/util/List;

    return-void
.end method
