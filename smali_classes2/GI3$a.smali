.class public final LGI3$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LGI3;
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
.method public static a(LGI3;)Lio/reactivex/i;
    .locals 0

    invoke-static {p0}, Lbr4$a;->e(Lbr4;)Lio/reactivex/i;

    move-result-object p0

    return-object p0
.end method

.method public static b(LGI3;)Lio/reactivex/v;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "LGI3;",
            ")",
            "Lio/reactivex/v<",
            "TT;TT;>;"
        }
    .end annotation

    invoke-static {p0}, Lbr4$a;->g(Lbr4;)Lio/reactivex/v;

    move-result-object p0

    return-object p0
.end method

.method public static c(LGI3;)Lio/reactivex/C;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "LGI3;",
            ")",
            "Lio/reactivex/C<",
            "TT;TT;>;"
        }
    .end annotation

    invoke-static {p0}, Lbr4$a;->i(Lbr4;)Lio/reactivex/C;

    move-result-object p0

    return-object p0
.end method

.method public static d(LGI3;)Lio/reactivex/L;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "LGI3;",
            ")",
            "Lio/reactivex/L<",
            "TT;TT;>;"
        }
    .end annotation

    invoke-static {p0}, Lbr4$a;->k(Lbr4;)Lio/reactivex/L;

    move-result-object p0

    return-object p0
.end method

.method public static e(LGI3;Lio/reactivex/F;)Lio/reactivex/F;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "LGI3;",
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
