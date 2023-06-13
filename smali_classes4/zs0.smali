.class public final Lzs0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lys0;
.implements Lbr4;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u000f\u00a2\u0006\u0004\u0008\u0013\u0010\u0014JA\u0010\r\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u000c0\u000b0\n2\u0006\u0010\u0004\u001a\u00020\u00032\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u00052\u0008\u0010\t\u001a\u0004\u0018\u00010\u0008H\u0016\u00a2\u0006\u0004\u0008\r\u0010\u000eR\u0014\u0010\u0012\u001a\u00020\u000f8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0010\u0010\u0011\u00a8\u0006\u0015"
    }
    d2 = {
        "Lzs0;",
        "Lys0;",
        "Lbr4;",
        "Lco/bird/android/model/NonComplianceWarningKind;",
        "warningKind",
        "",
        "rideId",
        "currency",
        "",
        "amount",
        "Lio/reactivex/F;",
        "LHM4;",
        "Lco/bird/android/model/NonComplianceWarning;",
        "c",
        "(Lco/bird/android/model/NonComplianceWarningKind;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)Lio/reactivex/F;",
        "Lxs0;",
        "b",
        "Lxs0;",
        "complianceClient",
        "<init>",
        "(Lxs0;)V",
        "ride_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final b:Lxs0;


# direct methods
.method public constructor <init>(Lxs0;)V
    .locals 1

    const-string v0, "complianceClient"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lzs0;->b:Lxs0;

    return-void
.end method


# virtual methods
.method public c(Lco/bird/android/model/NonComplianceWarningKind;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)Lio/reactivex/F;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/bird/android/model/NonComplianceWarningKind;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/Integer;",
            ")",
            "Lio/reactivex/F<",
            "LHM4<",
            "Lco/bird/android/model/NonComplianceWarning;",
            ">;>;"
        }
    .end annotation

    const-string v0, "warningKind"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lzs0;->b:Lxs0;

    new-instance v1, Lco/bird/api/request/NonComplianceWarningBody;

    invoke-direct {v1, p1, p2, p3, p4}, Lco/bird/api/request/NonComplianceWarningBody;-><init>(Lco/bird/android/model/NonComplianceWarningKind;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V

    invoke-interface {v0, v1}, Lxs0;->a(Lco/bird/api/request/NonComplianceWarningBody;)Lio/reactivex/F;

    move-result-object p1

    invoke-virtual {p0, p1}, Lzs0;->d(Lio/reactivex/F;)Lio/reactivex/F;

    move-result-object p1

    const-string p2, "complianceClient\n      .\u2026unt))\n      .schedulers()"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public c()Lio/reactivex/i;
    .locals 1

    invoke-static {p0}, Lbr4$a;->e(Lbr4;)Lio/reactivex/i;

    move-result-object v0

    return-object v0
.end method

.method public d(Lio/reactivex/F;)Lio/reactivex/F;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lio/reactivex/F<",
            "TT;>;)",
            "Lio/reactivex/F<",
            "TT;>;"
        }
    .end annotation

    invoke-static {p0, p1}, Lbr4$a;->p(Lbr4;Lio/reactivex/F;)Lio/reactivex/F;

    move-result-object p1

    return-object p1
.end method

.method public m()Lio/reactivex/v;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">()",
            "Lio/reactivex/v<",
            "TT;TT;>;"
        }
    .end annotation

    invoke-static {p0}, Lbr4$a;->g(Lbr4;)Lio/reactivex/v;

    move-result-object v0

    return-object v0
.end method

.method public o()Lio/reactivex/C;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">()",
            "Lio/reactivex/C<",
            "TT;TT;>;"
        }
    .end annotation

    invoke-static {p0}, Lbr4$a;->i(Lbr4;)Lio/reactivex/C;

    move-result-object v0

    return-object v0
.end method

.method public s()Lio/reactivex/L;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">()",
            "Lio/reactivex/L<",
            "TT;TT;>;"
        }
    .end annotation

    invoke-static {p0}, Lbr4$a;->k(Lbr4;)Lio/reactivex/L;

    move-result-object v0

    return-object v0
.end method
