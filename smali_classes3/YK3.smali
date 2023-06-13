.class public final LYK3;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\n\u0008\u00c6\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\n\u0010\u000bR\u0017\u0010\u0006\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010\u0004\u001a\u0004\u0008\u0003\u0010\u0005R\u0017\u0010\t\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0007\u0010\u0004\u001a\u0004\u0008\u0008\u0010\u0005\u00a8\u0006\u000c"
    }
    d2 = {
        "LYK3;",
        "",
        "Lkotlin/text/Regex;",
        "b",
        "Lkotlin/text/Regex;",
        "()Lkotlin/text/Regex;",
        "SPACE",
        "c",
        "a",
        "SENTENCE_CASE_REGEX",
        "<init>",
        "()V",
        "extension_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# static fields
.field public static final a:LYK3;

.field public static final b:Lkotlin/text/Regex;

.field public static final c:Lkotlin/text/Regex;


# direct methods
.method public static constructor <clinit>()V
    .locals 4

    new-instance v0, LYK3;

    invoke-direct {v0}, LYK3;-><init>()V

    sput-object v0, LYK3;->a:LYK3;

    new-instance v0, Lkotlin/text/Regex;

    const-string v1, "\\s+"

    invoke-direct {v0, v1}, Lkotlin/text/Regex;-><init>(Ljava/lang/String;)V

    sput-object v0, LYK3;->b:Lkotlin/text/Regex;

    sget-object v0, Lkotlin/jvm/internal/StringCompanionObject;->INSTANCE:Lkotlin/jvm/internal/StringCompanionObject;

    const/4 v0, 0x3

    new-array v1, v0, [Ljava/lang/Object;

    const/4 v2, 0x0

    const-string v3, "(?<=[A-Z])(?=[A-Z][a-z])"

    aput-object v3, v1, v2

    const/4 v2, 0x1

    const-string v3, "(?<=[^A-Z])(?=[A-Z])"

    aput-object v3, v1, v2

    const/4 v2, 0x2

    const-string v3, "(?<=[A-Za-z])(?=[^A-Za-z])"

    aput-object v3, v1, v2

    invoke-static {v1, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v0

    const-string v1, "%s|%s|%s"

    invoke-static {v1, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "format(format, *args)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lkotlin/text/Regex;

    invoke-direct {v1, v0}, Lkotlin/text/Regex;-><init>(Ljava/lang/String;)V

    sput-object v1, LYK3;->c:Lkotlin/text/Regex;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()Lkotlin/text/Regex;
    .locals 1

    sget-object v0, LYK3;->c:Lkotlin/text/Regex;

    return-object v0
.end method

.method public final b()Lkotlin/text/Regex;
    .locals 1

    sget-object v0, LYK3;->b:Lkotlin/text/Regex;

    return-object v0
.end method
