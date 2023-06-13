.class public final LYn$c;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LYn;->r1(Landroid/location/Location;Ljava/util/Set;Lco/bird/android/model/constant/MapMode;)Lio/reactivex/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lco/bird/android/model/wire/WireRiderZoneCellsResponse;",
        "Lio/reactivex/K<",
        "+",
        "Lkotlin/Pair<",
        "+",
        "Lco/bird/android/model/wire/WireRiderZoneCellsResponse;",
        "+",
        "Ljava/util/List<",
        "+",
        "Ljava/lang/String;",
        ">;>;>;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\u0008\u0003\u0010\u0007\u001ar\u00122\u0008\u0001\u0012.\u0012\u0004\u0012\u00020\u0000\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00050\u0004 \u0006*\u0016\u0012\u0004\u0012\u00020\u0000\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u00030\u0003 \u0006*8\u00122\u0008\u0001\u0012.\u0012\u0004\u0012\u00020\u0000\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00050\u0004 \u0006*\u0016\u0012\u0004\u0012\u00020\u0000\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0007\u0010\u0008"
    }
    d2 = {
        "Lco/bird/android/model/wire/WireRiderZoneCellsResponse;",
        "results",
        "Lio/reactivex/K;",
        "Lkotlin/Pair;",
        "",
        "",
        "kotlin.jvm.PlatformType",
        "b",
        "(Lco/bird/android/model/wire/WireRiderZoneCellsResponse;)Lio/reactivex/K;"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:LYn;

.field public final synthetic h:Lco/bird/android/model/constant/MapMode;


# direct methods
.method public constructor <init>(LYn;Lco/bird/android/model/constant/MapMode;)V
    .locals 0

    iput-object p1, p0, LYn$c;->g:LYn;

    iput-object p2, p0, LYn$c;->h:Lco/bird/android/model/constant/MapMode;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method

.method public static synthetic a(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lkotlin/Pair;
    .locals 0

    invoke-static {p0, p1}, LYn$c;->invoke$lambda$0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p0

    return-object p0
.end method

.method public static final invoke$lambda$0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lkotlin/Pair;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lkotlin/Pair;

    return-object p0
.end method


# virtual methods
.method public final b(Lco/bird/android/model/wire/WireRiderZoneCellsResponse;)Lio/reactivex/K;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/bird/android/model/wire/WireRiderZoneCellsResponse;",
            ")",
            "Lio/reactivex/K<",
            "+",
            "Lkotlin/Pair<",
            "Lco/bird/android/model/wire/WireRiderZoneCellsResponse;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;>;>;"
        }
    .end annotation

    const-string v0, "results"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LYn$c;->g:LYn;

    invoke-static {v0}, LYn;->access$getAreaDao$p(LYn;)LXm;

    move-result-object v0

    iget-object v1, p0, LYn$c;->g:LYn;

    invoke-static {v1}, LYn;->access$getPreference$p(LYn;)Lgl;

    move-result-object v1

    iget-object v2, p0, LYn$c;->h:Lco/bird/android/model/constant/MapMode;

    invoke-static {v1, v2}, Leo;->access$role(Lgl;Lco/bird/android/model/constant/MapMode;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, LXm;->f(Ljava/lang/String;)Lio/reactivex/F;

    move-result-object v0

    new-instance v1, LYn$c$a;

    invoke-direct {v1, p1}, LYn$c$a;-><init>(Lco/bird/android/model/wire/WireRiderZoneCellsResponse;)V

    new-instance p1, LZn;

    invoke-direct {p1, v1}, LZn;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0, p1}, Lio/reactivex/F;->I(Lio/reactivex/functions/o;)Lio/reactivex/F;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lco/bird/android/model/wire/WireRiderZoneCellsResponse;

    invoke-virtual {p0, p1}, LYn$c;->b(Lco/bird/android/model/wire/WireRiderZoneCellsResponse;)Lio/reactivex/K;

    move-result-object p1

    return-object p1
.end method
