.class public final LKZ5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LHZ5;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0018\u00002\u00020\u0001B\u0011\u0008\u0007\u0012\u0006\u0010\r\u001a\u00020\u000b\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u0016\u0010\u0005\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0014\u0010\u0007\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00020\u00060\u0004H\u0016J\u000c\u0010\t\u001a\u00020\u0008*\u00020\u0002H\u0002J\u000c\u0010\n\u001a\u00020\u0002*\u00020\u0008H\u0002R\u0014\u0010\r\u001a\u00020\u000b8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0007\u0010\u000c\u00a8\u0006\u0010"
    }
    d2 = {
        "LKZ5;",
        "LHZ5;",
        "Lco/bird/android/model/TaxInformation;",
        "info",
        "Lio/reactivex/F;",
        "b",
        "Lco/bird/android/buava/Optional;",
        "a",
        "Lco/bird/api/request/TaxInformationBody;",
        "g",
        "h",
        "LGZ5;",
        "LGZ5;",
        "taxInformationClient",
        "<init>",
        "(LGZ5;)V",
        "tax-information_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final a:LGZ5;


# direct methods
.method public constructor <init>(LGZ5;)V
    .locals 1

    const-string v0, "taxInformationClient"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LKZ5;->a:LGZ5;

    return-void
.end method

.method public static final synthetic access$toModel(LKZ5;Lco/bird/api/request/TaxInformationBody;)Lco/bird/android/model/TaxInformation;
    .locals 0

    invoke-virtual {p0, p1}, LKZ5;->h(Lco/bird/api/request/TaxInformationBody;)Lco/bird/android/model/TaxInformation;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lco/bird/android/buava/Optional;
    .locals 0

    invoke-static {p0, p1}, LKZ5;->e(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lco/bird/android/buava/Optional;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lco/bird/android/model/TaxInformation;
    .locals 0

    invoke-static {p0, p1}, LKZ5;->f(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lco/bird/android/model/TaxInformation;

    move-result-object p0

    return-object p0
.end method

.method public static final e(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lco/bird/android/buava/Optional;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lco/bird/android/buava/Optional;

    return-object p0
.end method

.method public static final f(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lco/bird/android/model/TaxInformation;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lco/bird/android/model/TaxInformation;

    return-object p0
.end method


# virtual methods
.method public a()Lio/reactivex/F;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/F<",
            "Lco/bird/android/buava/Optional<",
            "Lco/bird/android/model/TaxInformation;",
            ">;>;"
        }
    .end annotation

    iget-object v0, p0, LKZ5;->a:LGZ5;

    invoke-interface {v0}, LGZ5;->a()Lio/reactivex/F;

    move-result-object v0

    new-instance v1, LKZ5$a;

    invoke-direct {v1, p0}, LKZ5$a;-><init>(LKZ5;)V

    new-instance v2, LJZ5;

    invoke-direct {v2, v1}, LJZ5;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0, v2}, Lio/reactivex/F;->I(Lio/reactivex/functions/o;)Lio/reactivex/F;

    move-result-object v0

    const-string v1, "override fun getTaxInfor\u2026)?.toModel())\n      }\n  }"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public b(Lco/bird/android/model/TaxInformation;)Lio/reactivex/F;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/bird/android/model/TaxInformation;",
            ")",
            "Lio/reactivex/F<",
            "Lco/bird/android/model/TaxInformation;",
            ">;"
        }
    .end annotation

    const-string v0, "info"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LKZ5;->a:LGZ5;

    invoke-virtual {p0, p1}, LKZ5;->g(Lco/bird/android/model/TaxInformation;)Lco/bird/api/request/TaxInformationBody;

    move-result-object p1

    invoke-interface {v0, p1}, LGZ5;->b(Lco/bird/api/request/TaxInformationBody;)Lio/reactivex/F;

    move-result-object p1

    new-instance v0, LKZ5$b;

    invoke-direct {v0, p0}, LKZ5$b;-><init>(LKZ5;)V

    new-instance v1, LIZ5;

    invoke-direct {v1, v0}, LIZ5;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p1, v1}, Lio/reactivex/F;->I(Lio/reactivex/functions/o;)Lio/reactivex/F;

    move-result-object p1

    const-string v0, "override fun setTaxInfor\u2026.map { it.toModel() }\n  }"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public final g(Lco/bird/android/model/TaxInformation;)Lco/bird/api/request/TaxInformationBody;
    .locals 12

    new-instance v11, Lco/bird/api/request/TaxInformationBody;

    invoke-virtual {p1}, Lco/bird/android/model/TaxInformation;->getFirstName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lco/bird/android/model/TaxInformation;->getLastName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, Lco/bird/android/model/TaxInformation;->getFiscalCode()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1}, Lco/bird/android/model/TaxInformation;->getAddress()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p1}, Lco/bird/android/model/TaxInformation;->getPostalCode()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {p1}, Lco/bird/android/model/TaxInformation;->getCity()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {p1}, Lco/bird/android/model/TaxInformation;->getProvince()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {p1}, Lco/bird/android/model/TaxInformation;->getCountry()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {p1}, Lco/bird/android/model/TaxInformation;->getVatId()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {p1}, Lco/bird/android/model/TaxInformation;->getCompanyName()Ljava/lang/String;

    move-result-object v10

    move-object v0, v11

    invoke-direct/range {v0 .. v10}, Lco/bird/api/request/TaxInformationBody;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-object v11
.end method

.method public final h(Lco/bird/api/request/TaxInformationBody;)Lco/bird/android/model/TaxInformation;
    .locals 12

    new-instance v11, Lco/bird/android/model/TaxInformation;

    invoke-virtual {p1}, Lco/bird/api/request/TaxInformationBody;->getFirstName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lco/bird/api/request/TaxInformationBody;->getLastName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, Lco/bird/api/request/TaxInformationBody;->getFiscalCode()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1}, Lco/bird/api/request/TaxInformationBody;->getAddress()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p1}, Lco/bird/api/request/TaxInformationBody;->getPostalCode()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {p1}, Lco/bird/api/request/TaxInformationBody;->getCity()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {p1}, Lco/bird/api/request/TaxInformationBody;->getProvince()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {p1}, Lco/bird/api/request/TaxInformationBody;->getCountry()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {p1}, Lco/bird/api/request/TaxInformationBody;->getVatId()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {p1}, Lco/bird/api/request/TaxInformationBody;->getCompanyName()Ljava/lang/String;

    move-result-object v10

    move-object v0, v11

    invoke-direct/range {v0 .. v10}, Lco/bird/android/model/TaxInformation;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-object v11
.end method
