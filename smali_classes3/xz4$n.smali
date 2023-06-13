.class public final Lxz4$n;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lxz4;->N(Lco/bird/android/model/RepairType;Lco/bird/android/model/wire/WirePart;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lco/bird/android/model/wire/WireBird;",
        "Lio/reactivex/K<",
        "+",
        "Lco/bird/android/model/wire/WireBird;",
        ">;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0004\u001a*\u0012\u000e\u0008\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00000\u0000 \u0003*\u0014\u0012\u000e\u0008\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00000\u0000\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "Lco/bird/android/model/wire/WireBird;",
        "bird",
        "Lio/reactivex/K;",
        "kotlin.jvm.PlatformType",
        "b",
        "(Lco/bird/android/model/wire/WireBird;)Lio/reactivex/K;"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:Lxz4;

.field public final synthetic h:Lco/bird/android/model/wire/WirePart;


# direct methods
.method public constructor <init>(Lxz4;Lco/bird/android/model/wire/WirePart;)V
    .locals 0

    iput-object p1, p0, Lxz4$n;->g:Lxz4;

    iput-object p2, p0, Lxz4$n;->h:Lco/bird/android/model/wire/WirePart;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method

.method public static synthetic a(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lco/bird/android/model/wire/WireBird;
    .locals 0

    invoke-static {p0, p1}, Lxz4$n;->c(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lco/bird/android/model/wire/WireBird;

    move-result-object p0

    return-object p0
.end method

.method public static final c(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lco/bird/android/model/wire/WireBird;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lco/bird/android/model/wire/WireBird;

    return-object p0
.end method


# virtual methods
.method public final b(Lco/bird/android/model/wire/WireBird;)Lio/reactivex/K;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/bird/android/model/wire/WireBird;",
            ")",
            "Lio/reactivex/K<",
            "+",
            "Lco/bird/android/model/wire/WireBird;",
            ">;"
        }
    .end annotation

    const-string v0, "bird"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lxz4$n;->g:Lxz4;

    invoke-static {v0}, Lxz4;->access$getIdToolsManager$p(Lxz4;)LnS1;

    move-result-object v1

    const/4 v0, 0x1

    new-array v3, v0, [Lco/bird/android/model/wire/WirePart;

    const/4 v0, 0x0

    iget-object v2, p0, Lxz4$n;->h:Lco/bird/android/model/wire/WirePart;

    aput-object v2, v3, v0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/16 v6, 0xc

    const/4 v7, 0x0

    move-object v2, p1

    invoke-static/range {v1 .. v7}, LnS1$a;->attachParts$default(LnS1;Lco/bird/android/model/wire/WireBird;[Lco/bird/android/model/wire/WirePart;Ljava/lang/String;Lco/bird/android/model/RadarTagMetadata;ILjava/lang/Object;)Lio/reactivex/F;

    move-result-object v0

    new-instance v1, Lxz4$n$a;

    invoke-direct {v1, p1}, Lxz4$n$a;-><init>(Lco/bird/android/model/wire/WireBird;)V

    new-instance p1, LBz4;

    invoke-direct {p1, v1}, LBz4;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0, p1}, Lio/reactivex/F;->I(Lio/reactivex/functions/o;)Lio/reactivex/F;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lco/bird/android/model/wire/WireBird;

    invoke-virtual {p0, p1}, Lxz4$n;->b(Lco/bird/android/model/wire/WireBird;)Lio/reactivex/K;

    move-result-object p1

    return-object p1
.end method
