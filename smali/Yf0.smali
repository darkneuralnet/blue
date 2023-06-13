.class public final LYf0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u00c6\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0018\u0010\u0019J%\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u0014\u0010\u000b\u001a\u0008\u0012\u0004\u0012\u00020\t0\u00062\u0006\u0010\n\u001a\u00020\tJ\u001e\u0010\u000f\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u00062\u0006\u0010\u000c\u001a\u00020\u00022\u0008\u0010\u000e\u001a\u0004\u0018\u00010\rJ\u0010\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u0002H\u0002J\u0010\u0010\u0012\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0002J\u0010\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u0013H\u0002J\u0010\u0010\u0017\u001a\u00020\u00162\u0006\u0010\n\u001a\u00020\tH\u0002\u00a8\u0006\u001a"
    }
    d2 = {
        "LYf0;",
        "",
        "",
        "number",
        "",
        "enableLuhnCheck",
        "LYk1;",
        "e",
        "(Ljava/lang/String;Ljava/lang/Boolean;)LYk1;",
        "Lvi1;",
        "expiryDate",
        "f",
        "securityCode",
        "LT11;",
        "cardType",
        "g",
        "normalizedNumber",
        "c",
        "a",
        "",
        "month",
        "d",
        "Ljava/util/Calendar;",
        "b",
        "<init>",
        "()V",
        "card_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x5,
        0x1
    }
.end annotation


# static fields
.field public static final a:LYf0;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, LYf0;

    invoke-direct {v0}, LYf0;-><init>()V

    sput-object v0, LYf0;->a:LYf0;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lvi1;)Z
    .locals 1

    sget-object v0, Lvi1;->d:Lvi1;

    if-eq p1, v0, :cond_0

    invoke-virtual {p1}, Lvi1;->a()I

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Lvi1;->b()I

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Lvi1;->a()I

    move-result v0

    invoke-virtual {p0, v0}, LYf0;->d(I)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Lvi1;->b()I

    move-result p1

    if-lez p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public final b(Lvi1;)Ljava/util/Calendar;
    .locals 3

    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/Calendar;->clear()V

    invoke-virtual {p1}, Lvi1;->b()I

    move-result v1

    invoke-virtual {p1}, Lvi1;->a()I

    move-result p1

    const/4 v2, 0x1

    sub-int/2addr p1, v2

    invoke-virtual {v0, v1, p1, v2}, Ljava/util/Calendar;->set(III)V

    const/4 p1, 0x2

    invoke-virtual {v0, p1, v2}, Ljava/util/Calendar;->add(II)V

    const/4 p1, 0x5

    const/4 v1, -0x1

    invoke-virtual {v0, p1, v1}, Ljava/util/Calendar;->add(II)V

    const-string p1, "expiryCalendar"

    invoke-static {v0, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public final c(Ljava/lang/String;)Z
    .locals 8

    new-instance v0, Ljava/lang/StringBuffer;

    invoke-direct {v0, p1}, Ljava/lang/StringBuffer;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/lang/StringBuffer;->reverse()Ljava/lang/StringBuffer;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v0, "StringBuffer(normalizedNumber).reverse().toString()"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    const/16 v1, 0xa

    const/4 v2, 0x0

    if-ltz v0, :cond_3

    move v3, v2

    move v4, v3

    move v5, v4

    :goto_0
    add-int/lit8 v6, v3, 0x1

    invoke-virtual {p1, v3}, Ljava/lang/String;->charAt(I)C

    move-result v7

    invoke-static {v7, v1}, Ljava/lang/Character;->digit(CI)I

    move-result v7

    rem-int/lit8 v3, v3, 0x2

    if-nez v3, :cond_0

    add-int/2addr v5, v7

    goto :goto_1

    :cond_0
    mul-int/lit8 v3, v7, 0x2

    add-int/2addr v4, v3

    const/4 v3, 0x5

    if-lt v7, v3, :cond_1

    add-int/lit8 v4, v4, -0x9

    :cond_1
    :goto_1
    if-le v6, v0, :cond_2

    goto :goto_2

    :cond_2
    move v3, v6

    goto :goto_0

    :cond_3
    move v4, v2

    move v5, v4

    :goto_2
    add-int/2addr v5, v4

    rem-int/2addr v5, v1

    if-nez v5, :cond_4

    const/4 v2, 0x1

    :cond_4
    return v2
.end method

.method public final d(I)Z
    .locals 3

    const/4 v0, 0x0

    const/4 v1, 0x1

    if-gt v1, p1, :cond_0

    const/16 v2, 0xc

    if-gt p1, v2, :cond_0

    move v0, v1

    :cond_0
    return v0
.end method

.method public final e(Ljava/lang/String;Ljava/lang/Boolean;)LYk1;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/Boolean;",
            ")",
            "LYk1<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    const-string v0, "number"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    new-array v1, v0, [C

    invoke-static {p1, v1}, LhS5;->b(Ljava/lang/String;[C)Ljava/lang/String;

    move-result-object v1

    const-string v2, "normalize(number)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v2

    new-array v0, v0, [C

    invoke-static {v1, v0}, LhS5;->a(Ljava/lang/String;[C)Z

    move-result v0

    if-nez v0, :cond_0

    new-instance p2, Lwj6$a;

    sget v0, LZk4;->checkout_card_number_not_valid:I

    invoke-direct {p2, v0}, Lwj6$a;-><init>(I)V

    goto :goto_1

    :cond_0
    const/16 v0, 0x13

    if-gt v2, v0, :cond_4

    const/16 v0, 0x8

    if-ge v2, v0, :cond_1

    goto :goto_0

    :cond_1
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_2

    sget-object p2, Lwj6$b;->a:Lwj6$b;

    goto :goto_1

    :cond_2
    invoke-virtual {p0, v1}, LYf0;->c(Ljava/lang/String;)Z

    move-result p2

    if-eqz p2, :cond_3

    sget-object p2, Lwj6$b;->a:Lwj6$b;

    goto :goto_1

    :cond_3
    new-instance p2, Lwj6$a;

    sget v0, LZk4;->checkout_card_number_not_valid:I

    invoke-direct {p2, v0}, Lwj6$a;-><init>(I)V

    goto :goto_1

    :cond_4
    :goto_0
    new-instance p2, Lwj6$a;

    sget v0, LZk4;->checkout_card_number_not_valid:I

    invoke-direct {p2, v0}, Lwj6$a;-><init>(I)V

    :goto_1
    new-instance v0, LYk1;

    invoke-direct {v0, p1, p2}, LYk1;-><init>(Ljava/lang/Object;Lwj6;)V

    return-object v0
.end method

.method public final f(Lvi1;)LYk1;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lvi1;",
            ")",
            "LYk1<",
            "Lvi1;",
            ">;"
        }
    .end annotation

    const-string v0, "expiryDate"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, LYf0;->a(Lvi1;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0, p1}, LYf0;->b(Lvi1;)Ljava/util/Calendar;

    move-result-object v0

    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v1

    const/4 v2, 0x1

    const/16 v3, 0x1e

    invoke-virtual {v1, v2, v3}, Ljava/util/Calendar;->add(II)V

    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v2

    const/4 v3, 0x2

    const/4 v4, -0x3

    invoke-virtual {v2, v3, v4}, Ljava/util/Calendar;->add(II)V

    invoke-virtual {v0, v2}, Ljava/util/Calendar;->compareTo(Ljava/util/Calendar;)I

    move-result v2

    if-ltz v2, :cond_0

    invoke-virtual {v0, v1}, Ljava/util/Calendar;->compareTo(Ljava/util/Calendar;)I

    move-result v0

    if-gtz v0, :cond_0

    new-instance v0, LYk1;

    sget-object v1, Lwj6$b;->a:Lwj6$b;

    invoke-direct {v0, p1, v1}, LYk1;-><init>(Ljava/lang/Object;Lwj6;)V

    return-object v0

    :cond_0
    new-instance v0, LYk1;

    new-instance v1, Lwj6$a;

    sget v2, LZk4;->checkout_expiry_date_not_valid:I

    invoke-direct {v1, v2}, Lwj6$a;-><init>(I)V

    invoke-direct {v0, p1, v1}, LYk1;-><init>(Ljava/lang/Object;Lwj6;)V

    return-object v0
.end method

.method public final g(Ljava/lang/String;LT11;)LYk1;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "LT11;",
            ")",
            "LYk1<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    const-string v0, "securityCode"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    new-array v1, v0, [C

    invoke-static {p1, v1}, LhS5;->b(Ljava/lang/String;[C)Ljava/lang/String;

    move-result-object p1

    const-string v1, "normalize(securityCode)"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v1

    new-instance v2, Lwj6$a;

    sget v3, LZk4;->checkout_security_code_not_valid:I

    invoke-direct {v2, v3}, Lwj6$a;-><init>(I)V

    new-array v0, v0, [C

    invoke-static {p1, v0}, LhS5;->a(Ljava/lang/String;[C)Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_3

    :cond_0
    const/4 v0, 0x0

    if-nez p2, :cond_1

    move-object v3, v0

    goto :goto_0

    :cond_1
    invoke-virtual {p2}, LT11;->c()Lcom/adyen/checkout/card/api/model/Brand$c;

    move-result-object v3

    :goto_0
    sget-object v4, Lcom/adyen/checkout/card/api/model/Brand$c;->e:Lcom/adyen/checkout/card/api/model/Brand$c;

    if-ne v3, v4, :cond_2

    if-nez v1, :cond_2

    sget-object v2, Lwj6$b;->a:Lwj6$b;

    goto :goto_3

    :cond_2
    if-nez p2, :cond_3

    move-object v3, v0

    goto :goto_1

    :cond_3
    invoke-virtual {p2}, LT11;->b()LXf0;

    move-result-object v3

    :goto_1
    sget-object v4, LXf0;->d:LXf0;

    if-ne v3, v4, :cond_4

    const/4 v3, 0x4

    if-ne v1, v3, :cond_4

    sget-object v2, Lwj6$b;->a:Lwj6$b;

    goto :goto_3

    :cond_4
    if-nez p2, :cond_5

    goto :goto_2

    :cond_5
    invoke-virtual {p2}, LT11;->b()LXf0;

    move-result-object v0

    :goto_2
    if-eq v0, v4, :cond_6

    const/4 p2, 0x3

    if-ne v1, p2, :cond_6

    sget-object v2, Lwj6$b;->a:Lwj6$b;

    :cond_6
    :goto_3
    new-instance p2, LYk1;

    invoke-direct {p2, p1, v2}, LYk1;-><init>(Ljava/lang/Object;Lwj6;)V

    return-object p2
.end method
