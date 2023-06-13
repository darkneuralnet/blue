.class public final Lcv2;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0003\"\u0014\u0010\u0003\u001a\u00020\u00008\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0001\u0010\u0002\"\u0014\u0010\u0005\u001a\u00020\u00008\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0004\u0010\u0002\"\u001a\u0010\t\u001a\u0004\u0018\u00010\u0007*\u00020\u00068BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0001\u0010\u0008\u00a8\u0006\n"
    }
    d2 = {
        "Lkotlin/text/Regex;",
        "a",
        "Lkotlin/text/Regex;",
        "HTTP_REGEX",
        "b",
        "DIGIT_TOKEN_REGEX",
        "Lgl;",
        "",
        "(Lgl;)Ljava/lang/String;",
        "formattedLocalUrl",
        "co.bird.android.feature.localhost"
    }
    k = 0x2
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# static fields
.field public static final a:Lkotlin/text/Regex;

.field public static final b:Lkotlin/text/Regex;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lkotlin/text/Regex;

    const-string v1, "https?://"

    invoke-direct {v0, v1}, Lkotlin/text/Regex;-><init>(Ljava/lang/String;)V

    sput-object v0, Lcv2;->a:Lkotlin/text/Regex;

    new-instance v0, Lkotlin/text/Regex;

    const-string v1, "(:?%d)?\\/?$"

    invoke-direct {v0, v1}, Lkotlin/text/Regex;-><init>(Ljava/lang/String;)V

    sput-object v0, Lcv2;->b:Lkotlin/text/Regex;

    return-void
.end method

.method public static final a(Lgl;)Ljava/lang/String;
    .locals 2

    invoke-virtual {p0}, Lgl;->e0()Ljava/lang/String;

    move-result-object p0

    if-eqz p0, :cond_0

    sget-object v0, Lcv2;->b:Lkotlin/text/Regex;

    const-string v1, ""

    invoke-virtual {v0, p0, v1}, Lkotlin/text/Regex;->replace(Ljava/lang/CharSequence;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    if-eqz p0, :cond_0

    sget-object v0, Lcv2;->a:Lkotlin/text/Regex;

    invoke-virtual {v0, p0, v1}, Lkotlin/text/Regex;->replace(Ljava/lang/CharSequence;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return-object p0
.end method

.method public static final synthetic access$getDIGIT_TOKEN_REGEX$p()Lkotlin/text/Regex;
    .locals 1

    sget-object v0, Lcv2;->b:Lkotlin/text/Regex;

    return-object v0
.end method

.method public static final synthetic access$getFormattedLocalUrl(Lgl;)Ljava/lang/String;
    .locals 0

    invoke-static {p0}, Lcv2;->a(Lgl;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method
