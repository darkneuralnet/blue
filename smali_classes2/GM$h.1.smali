.class public final LGM$h;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LGM;-><init>(LV74;LOh;LVK;Llj5;LdD1;LEa;Ljd0;Lq54;Ljava/lang/String;Ljava/lang/String;Ldr4;LAe5;LRR;LVL1;LxB1;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Ljava/util/List<",
        "+",
        "Lco/bird/android/model/wire/WireBird;",
        ">;",
        "Lio/reactivex/B<",
        "+",
        "Lkotlin/Pair<",
        "+",
        "Ljava/util/List<",
        "+",
        "Lco/bird/android/model/wire/WireBird;",
        ">;+",
        "Landroid/location/Location;",
        ">;>;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001a\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0007\u001ar\u00122\u0008\u0001\u0012.\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00010\u0000\u0012\u0004\u0012\u00020\u0005 \u0006*\u0016\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00010\u0000\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00040\u0004 \u0006*8\u00122\u0008\u0001\u0012.\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00010\u0000\u0012\u0004\u0012\u00020\u0005 \u0006*\u0016\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00010\u0000\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00040\u0004\u0018\u00010\u00030\u00032\u000c\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u0000H\n\u00a2\u0006\u0004\u0008\u0007\u0010\u0008"
    }
    d2 = {
        "",
        "Lco/bird/android/model/wire/WireBird;",
        "privateBirds",
        "Lio/reactivex/B;",
        "Lkotlin/Pair;",
        "Landroid/location/Location;",
        "kotlin.jvm.PlatformType",
        "b",
        "(Ljava/util/List;)Lio/reactivex/B;"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:LGM;


# direct methods
.method public constructor <init>(LGM;)V
    .locals 0

    iput-object p1, p0, LGM$h;->g:LGM;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method

.method public static synthetic a(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lkotlin/Pair;
    .locals 0

    invoke-static {p0, p1}, LGM$h;->invoke$lambda$0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lkotlin/Pair;

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
.method public final b(Ljava/util/List;)Lio/reactivex/B;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lco/bird/android/model/wire/WireBird;",
            ">;)",
            "Lio/reactivex/B<",
            "+",
            "Lkotlin/Pair<",
            "Ljava/util/List<",
            "Lco/bird/android/model/wire/WireBird;",
            ">;",
            "Landroid/location/Location;",
            ">;>;"
        }
    .end annotation

    const-string v0, "privateBirds"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v0, p1

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    const/4 v1, 0x1

    xor-int/2addr v0, v1

    if-eqz v0, :cond_0

    iget-object v0, p0, LGM$h;->g:LGM;

    invoke-static {v0}, LGM;->access$getLocationManager$p(LGM;)Ldr4;

    move-result-object v0

    const/high16 v2, 0x41200000    # 10.0f

    invoke-interface {v0, v2, v1}, Ldr4;->g(FZ)Lio/reactivex/Observable;

    move-result-object v0

    new-instance v1, LGM$h$a;

    invoke-direct {v1, p1}, LGM$h$a;-><init>(Ljava/util/List;)V

    new-instance p1, LHM;

    invoke-direct {p1, v1}, LHM;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0, p1}, Lio/reactivex/Observable;->map(Lio/reactivex/functions/o;)Lio/reactivex/Observable;

    move-result-object p1

    goto :goto_0

    :cond_0
    invoke-static {}, Lio/reactivex/Observable;->empty()Lio/reactivex/Observable;

    move-result-object p1

    :goto_0
    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/util/List;

    invoke-virtual {p0, p1}, LGM$h;->b(Ljava/util/List;)Lio/reactivex/B;

    move-result-object p1

    return-object p1
.end method
