.class public final LRK1$b;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LRK1;->G(Lio/reactivex/Observable;Lco/bird/android/model/wire/WireBird;)Lio/reactivex/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "LTk5;",
        "Lio/reactivex/K<",
        "+",
        "LTk5;",
        ">;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0004\u001a*\u0012\u000e\u0008\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00000\u0000 \u0003*\u0014\u0012\u000e\u0008\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00000\u0000\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "LTk5;",
        "scanResult",
        "Lio/reactivex/K;",
        "kotlin.jvm.PlatformType",
        "b",
        "(LTk5;)Lio/reactivex/K;"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:LRK1;

.field public final synthetic h:Lco/bird/android/model/wire/WireBird;


# direct methods
.method public constructor <init>(LRK1;Lco/bird/android/model/wire/WireBird;)V
    .locals 0

    iput-object p1, p0, LRK1$b;->g:LRK1;

    iput-object p2, p0, LRK1$b;->h:Lco/bird/android/model/wire/WireBird;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method

.method public static synthetic a(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)LTk5;
    .locals 0

    invoke-static {p0, p1}, LRK1$b;->c(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)LTk5;

    move-result-object p0

    return-object p0
.end method

.method public static final c(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)LTk5;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, LTk5;

    return-object p0
.end method


# virtual methods
.method public final b(LTk5;)Lio/reactivex/K;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LTk5;",
            ")",
            "Lio/reactivex/K<",
            "+",
            "LTk5;",
            ">;"
        }
    .end annotation

    const-string v0, "scanResult"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Object;

    const-string v1, "scanned bird smart lock, starting lease if necessary before unlocking"

    invoke-static {v1, v0}, Lg46;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v0, p0, LRK1$b;->g:LRK1;

    invoke-static {v0}, LRK1;->access$getItemLeaseManager$p(LRK1;)LMc2;

    move-result-object v0

    iget-object v1, p0, LRK1$b;->h:Lco/bird/android/model/wire/WireBird;

    sget-object v2, Lco/bird/android/model/itemlease/enum/ItemLeaseType;->HELMET:Lco/bird/android/model/itemlease/enum/ItemLeaseType;

    invoke-interface {v0, v1, v2}, LMc2;->l(Lco/bird/android/model/wire/WireBird;Lco/bird/android/model/itemlease/enum/ItemLeaseType;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {p1}, Lio/reactivex/F;->H(Ljava/lang/Object;)Lio/reactivex/F;

    move-result-object p1

    goto :goto_0

    :cond_0
    iget-object v0, p0, LRK1$b;->g:LRK1;

    invoke-static {v0}, LRK1;->access$getRideManager$p(LRK1;)LYR4;

    move-result-object v0

    invoke-interface {v0}, LYR4;->y()V

    iget-object v0, p0, LRK1$b;->g:LRK1;

    invoke-static {v0}, LRK1;->access$getItemLeaseManager$p(LRK1;)LMc2;

    move-result-object v0

    iget-object v1, p0, LRK1$b;->h:Lco/bird/android/model/wire/WireBird;

    invoke-interface {v0, v1}, LMc2;->E(Lco/bird/android/model/wire/WireBird;)Lio/reactivex/F;

    move-result-object v0

    new-instance v1, LRK1$b$a;

    invoke-direct {v1, p1}, LRK1$b$a;-><init>(LTk5;)V

    new-instance p1, LSK1;

    invoke-direct {p1, v1}, LSK1;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0, p1}, Lio/reactivex/F;->I(Lio/reactivex/functions/o;)Lio/reactivex/F;

    move-result-object p1

    :goto_0
    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LTk5;

    invoke-virtual {p0, p1}, LRK1$b;->b(LTk5;)Lio/reactivex/K;

    move-result-object p1

    return-object p1
.end method
