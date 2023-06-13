.class public final Lcom/stripe/android/core/model/CountryCode$Companion;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/core/model/CountryCode;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u000c\u0008\u0087\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0015\u0010\u0016J\u0010\u0010\u0005\u001a\u00020\u00042\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002J\u0010\u0010\u0006\u001a\u00020\u00042\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002J\u0010\u0010\u0007\u001a\u00020\u00042\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002J\u000e\u0010\n\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0008J\u000f\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u000bH\u00c6\u0001R\u0017\u0010\r\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\r\u0010\u000e\u001a\u0004\u0008\u000f\u0010\u0010R\u0017\u0010\u0011\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0011\u0010\u000e\u001a\u0004\u0008\u0012\u0010\u0010R\u0017\u0010\u0013\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0013\u0010\u000e\u001a\u0004\u0008\u0014\u0010\u0010\u00a8\u0006\u0017"
    }
    d2 = {
        "Lcom/stripe/android/core/model/CountryCode$Companion;",
        "",
        "Lcom/stripe/android/core/model/CountryCode;",
        "countryCode",
        "",
        "isUS",
        "isCA",
        "isGB",
        "",
        "value",
        "create",
        "LKj2;",
        "serializer",
        "US",
        "Lcom/stripe/android/core/model/CountryCode;",
        "getUS",
        "()Lcom/stripe/android/core/model/CountryCode;",
        "CA",
        "getCA",
        "GB",
        "getGB",
        "<init>",
        "()V",
        "stripe-core_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    invoke-direct {p0}, Lcom/stripe/android/core/model/CountryCode$Companion;-><init>()V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/String;)Lcom/stripe/android/core/model/CountryCode;
    .locals 2

    const-string v0, "value"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/stripe/android/core/model/CountryCode;

    sget-object v1, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {p1, v1}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object p1

    const-string v1, "this as java.lang.String).toUpperCase(Locale.ROOT)"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v0, p1}, Lcom/stripe/android/core/model/CountryCode;-><init>(Ljava/lang/String;)V

    return-object v0
.end method

.method public final getCA()Lcom/stripe/android/core/model/CountryCode;
    .locals 1

    invoke-static {}, Lcom/stripe/android/core/model/CountryCode;->access$getCA$cp()Lcom/stripe/android/core/model/CountryCode;

    move-result-object v0

    return-object v0
.end method

.method public final getGB()Lcom/stripe/android/core/model/CountryCode;
    .locals 1

    invoke-static {}, Lcom/stripe/android/core/model/CountryCode;->access$getGB$cp()Lcom/stripe/android/core/model/CountryCode;

    move-result-object v0

    return-object v0
.end method

.method public final getUS()Lcom/stripe/android/core/model/CountryCode;
    .locals 1

    invoke-static {}, Lcom/stripe/android/core/model/CountryCode;->access$getUS$cp()Lcom/stripe/android/core/model/CountryCode;

    move-result-object v0

    return-object v0
.end method

.method public final isCA(Lcom/stripe/android/core/model/CountryCode;)Z
    .locals 1

    invoke-virtual {p0}, Lcom/stripe/android/core/model/CountryCode$Companion;->getCA()Lcom/stripe/android/core/model/CountryCode;

    move-result-object v0

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final isGB(Lcom/stripe/android/core/model/CountryCode;)Z
    .locals 1

    invoke-virtual {p0}, Lcom/stripe/android/core/model/CountryCode$Companion;->getGB()Lcom/stripe/android/core/model/CountryCode;

    move-result-object v0

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final isUS(Lcom/stripe/android/core/model/CountryCode;)Z
    .locals 1

    invoke-virtual {p0}, Lcom/stripe/android/core/model/CountryCode$Companion;->getUS()Lcom/stripe/android/core/model/CountryCode;

    move-result-object v0

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final serializer()LKj2;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LKj2<",
            "Lcom/stripe/android/core/model/CountryCode;",
            ">;"
        }
    .end annotation

    sget-object v0, Lcom/stripe/android/core/model/CountryCode$$serializer;->INSTANCE:Lcom/stripe/android/core/model/CountryCode$$serializer;

    return-object v0
.end method
