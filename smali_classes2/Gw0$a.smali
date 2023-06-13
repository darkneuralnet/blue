.class public final LGw0$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LGw0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public static a(LGw0;Lio/reactivex/c;)Lio/reactivex/c;
    .locals 1

    const-string v0, "$receiver"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p1}, LbI4$a;->f(LbI4;Lio/reactivex/c;)Lio/reactivex/c;

    move-result-object p0

    return-object p0
.end method

.method public static b(LGw0;Lio/reactivex/F;)Lio/reactivex/F;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "LGw0;",
            "Lio/reactivex/F<",
            "TT;>;)",
            "Lio/reactivex/F<",
            "TT;>;"
        }
    .end annotation

    const-string v0, "$receiver"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p1}, LbI4$a;->j(LbI4;Lio/reactivex/F;)Lio/reactivex/F;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic getTutorialsByContext$default(LGw0;Lco/bird/android/model/constant/ConfigurableTutorialContext;Ljava/lang/String;ZILjava/lang/Object;)Lio/reactivex/F;
    .locals 0

    if-nez p5, :cond_1

    and-int/lit8 p4, p4, 0x2

    if-eqz p4, :cond_0

    const/4 p2, 0x0

    :cond_0
    invoke-interface {p0, p1, p2, p3}, LGw0;->i0(Lco/bird/android/model/constant/ConfigurableTutorialContext;Ljava/lang/String;Z)Lio/reactivex/F;

    move-result-object p0

    return-object p0

    :cond_1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    const-string p1, "Super calls with default arguments not supported in this target, function: getTutorialsByContext"

    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method
