.class public final LRj2;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u00c6\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u0014\u0010\u0005\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0014\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002\u00a8\u0006\n"
    }
    d2 = {
        "LRj2;",
        "",
        "",
        "birthDateOrTaxNumber",
        "LYk1;",
        "a",
        "cardPassword",
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
.field public static final a:LRj2;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, LRj2;

    invoke-direct {v0}, LRj2;-><init>()V

    sput-object v0, LRj2;->a:LRj2;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;)LYk1;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "LYk1<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    const-string v0, "birthDateOrTaxNumber"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x6

    if-ne v0, v1, :cond_0

    sget-object v1, LrT0;->a:LrT0;

    const-string v2, "yyMMdd"

    invoke-virtual {v1, p1, v2}, LrT0;->a(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    sget-object v0, Lwj6$b;->a:Lwj6$b;

    goto :goto_0

    :cond_0
    const/16 v1, 0xa

    if-ne v0, v1, :cond_1

    sget-object v0, Lwj6$b;->a:Lwj6$b;

    goto :goto_0

    :cond_1
    new-instance v0, Lwj6$a;

    sget v1, LZk4;->checkout_kcp_birth_date_or_tax_number_invalid:I

    invoke-direct {v0, v1}, Lwj6$a;-><init>(I)V

    :goto_0
    new-instance v1, LYk1;

    invoke-direct {v1, p1, v0}, LYk1;-><init>(Ljava/lang/Object;Lwj6;)V

    return-object v1
.end method

.method public final b(Ljava/lang/String;)LYk1;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "LYk1<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    const-string v0, "cardPassword"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    sget-object v0, Lwj6$b;->a:Lwj6$b;

    goto :goto_0

    :cond_0
    new-instance v0, Lwj6$a;

    sget v1, LZk4;->checkout_kcp_password_invalid:I

    invoke-direct {v0, v1}, Lwj6$a;-><init>(I)V

    :goto_0
    new-instance v1, LYk1;

    invoke-direct {v1, p1, v0}, LYk1;-><init>(Ljava/lang/Object;Lwj6;)V

    return-object v1
.end method
