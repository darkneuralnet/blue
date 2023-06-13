.class public interface abstract LXl3;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008f\u0018\u00002\u00020\u0001J\u0014\u0010\u0005\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00040\u00030\u0002H&J\u001c\u0010\t\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00080\u00030\u00022\u0006\u0010\u0007\u001a\u00020\u0006H&J\u0008\u0010\u000b\u001a\u00020\nH&J\u0016\u0010\r\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u00022\u0006\u0010\u000c\u001a\u00020\u0006H&J\u001c\u0010\u000f\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00080\u00030\u00022\u0006\u0010\u000e\u001a\u00020\u0006H&J$\u0010\u0013\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00120\u00030\u00022\u0006\u0010\u000c\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0010H&J.\u0010\u0016\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00120\u00030\u00022\u0018\u0010\u0015\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00100\u00140\u0003H&R\u001a\u0010\u001b\u001a\u0008\u0012\u0004\u0012\u00020\u00180\u00178&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0019\u0010\u001a\u00a8\u0006\u001c"
    }
    d2 = {
        "LXl3;",
        "",
        "Lio/reactivex/F;",
        "",
        "Lco/bird/android/model/wire/WirePartCategory;",
        "b",
        "",
        "categoryId",
        "Lco/bird/android/model/wire/WireInventoryPart;",
        "f",
        "Lio/reactivex/c;",
        "e",
        "sku",
        "a",
        "query",
        "c",
        "",
        "quantity",
        "Lco/bird/api/response/AdjustInventoryCountResponse;",
        "d",
        "Lkotlin/Pair;",
        "parts",
        "h",
        "Lio/reactivex/Observable;",
        "Lco/bird/api/response/InventoryStatusResponse;",
        "g",
        "()Lio/reactivex/Observable;",
        "healthStatus",
        "core-interface_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# virtual methods
.method public abstract a(Ljava/lang/String;)Lio/reactivex/F;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lio/reactivex/F<",
            "Lco/bird/android/model/wire/WireInventoryPart;",
            ">;"
        }
    .end annotation
.end method

.method public abstract b()Lio/reactivex/F;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/F<",
            "Ljava/util/List<",
            "Lco/bird/android/model/wire/WirePartCategory;",
            ">;>;"
        }
    .end annotation
.end method

.method public abstract c(Ljava/lang/String;)Lio/reactivex/F;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lio/reactivex/F<",
            "Ljava/util/List<",
            "Lco/bird/android/model/wire/WireInventoryPart;",
            ">;>;"
        }
    .end annotation
.end method

.method public abstract d(Ljava/lang/String;I)Lio/reactivex/F;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "I)",
            "Lio/reactivex/F<",
            "Ljava/util/List<",
            "Lco/bird/api/response/AdjustInventoryCountResponse;",
            ">;>;"
        }
    .end annotation
.end method

.method public abstract e()Lio/reactivex/c;
.end method

.method public abstract f(Ljava/lang/String;)Lio/reactivex/F;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lio/reactivex/F<",
            "Ljava/util/List<",
            "Lco/bird/android/model/wire/WireInventoryPart;",
            ">;>;"
        }
    .end annotation
.end method

.method public abstract g()Lio/reactivex/Observable;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "Lco/bird/api/response/InventoryStatusResponse;",
            ">;"
        }
    .end annotation
.end method

.method public abstract h(Ljava/util/List;)Lio/reactivex/F;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lkotlin/Pair<",
            "Ljava/lang/String;",
            "Ljava/lang/Integer;",
            ">;>;)",
            "Lio/reactivex/F<",
            "Ljava/util/List<",
            "Lco/bird/api/response/AdjustInventoryCountResponse;",
            ">;>;"
        }
    .end annotation
.end method
