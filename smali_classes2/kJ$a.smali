.class public final LkJ$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LkJ;
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
.method public static a(LkJ;)Lio/reactivex/i;
    .locals 0

    invoke-static {p0}, Lbr4$a;->e(Lbr4;)Lio/reactivex/i;

    move-result-object p0

    return-object p0
.end method

.method public static b(LkJ;)Lio/reactivex/v;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "LkJ;",
            ")",
            "Lio/reactivex/v<",
            "TT;TT;>;"
        }
    .end annotation

    invoke-static {p0}, Lbr4$a;->g(Lbr4;)Lio/reactivex/v;

    move-result-object p0

    return-object p0
.end method

.method public static c(LkJ;)Lio/reactivex/C;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "LkJ;",
            ")",
            "Lio/reactivex/C<",
            "TT;TT;>;"
        }
    .end annotation

    invoke-static {p0}, Lbr4$a;->i(Lbr4;)Lio/reactivex/C;

    move-result-object p0

    return-object p0
.end method

.method public static d(LkJ;)Lio/reactivex/L;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "LkJ;",
            ")",
            "Lio/reactivex/L<",
            "TT;TT;>;"
        }
    .end annotation

    invoke-static {p0}, Lbr4$a;->k(Lbr4;)Lio/reactivex/L;

    move-result-object p0

    return-object p0
.end method

.method public static e(LkJ;Lio/reactivex/F;)Lio/reactivex/F;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "LkJ;",
            "Lio/reactivex/F<",
            "TT;>;)",
            "Lio/reactivex/F<",
            "TT;>;"
        }
    .end annotation

    const-string v0, "$receiver"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p1}, Lbr4$a;->p(Lbr4;Lio/reactivex/F;)Lio/reactivex/F;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic getToken$default(LkJ;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Lio/reactivex/F;
    .locals 1

    if-nez p6, :cond_4

    and-int/lit8 p6, p5, 0x1

    const/4 v0, 0x0

    if-eqz p6, :cond_0

    move-object p1, v0

    :cond_0
    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_1

    move-object p2, v0

    :cond_1
    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_2

    move-object p3, v0

    :cond_2
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_3

    move-object p4, v0

    :cond_3
    invoke-interface {p0, p1, p2, p3, p4}, LkJ;->q0(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)Lio/reactivex/F;

    move-result-object p0

    return-object p0

    :cond_4
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    const-string p1, "Super calls with default arguments not supported in this target, function: getToken"

    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static synthetic trackBird$default(LkJ;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Landroid/location/Location;ILjava/lang/Object;)Lio/reactivex/F;
    .locals 7

    if-nez p7, :cond_2

    and-int/lit8 p7, p6, 0x4

    const/4 v0, 0x0

    if-eqz p7, :cond_0

    move-object v4, v0

    goto :goto_0

    :cond_0
    move-object v4, p3

    :goto_0
    and-int/lit8 p3, p6, 0x8

    if-eqz p3, :cond_1

    move-object v5, v0

    goto :goto_1

    :cond_1
    move-object v5, p4

    :goto_1
    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v6, p5

    invoke-interface/range {v1 .. v6}, LkJ;->p1(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Landroid/location/Location;)Lio/reactivex/F;

    move-result-object p0

    return-object p0

    :cond_2
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    const-string p1, "Super calls with default arguments not supported in this target, function: trackBird"

    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method
