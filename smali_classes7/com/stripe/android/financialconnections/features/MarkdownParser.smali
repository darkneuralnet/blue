.class public final Lcom/stripe/android/financialconnections/features/MarkdownParser;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0002\u0008\u0004\u0008\u00c0\u0002\u0018\u00002\u00020\u0001B\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0002J\u0015\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u0004H\u0000\u00a2\u0006\u0002\u0008\u0010R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R,\u0010\u0007\u001a \u0012\u001c\u0012\u001a\u0012\u0004\u0012\u00020\n\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000c\u0012\u0004\u0012\u00020\r0\u000b0\t0\u0008X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"
    }
    d2 = {
        "Lcom/stripe/android/financialconnections/features/MarkdownParser;",
        "",
        "()V",
        "REGEX_BOLD_ASTERISKS",
        "",
        "REGEX_BOLD_UNDERSCORES",
        "REGEX_LINK",
        "markDownToHtmlRegex",
        "",
        "Lkotlin/Pair;",
        "Lkotlin/text/Regex;",
        "Lkotlin/Function1;",
        "Lkotlin/text/MatchResult;",
        "",
        "toHtml",
        "string",
        "toHtml$financial_connections_release",
        "financial-connections_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nMarkdownParser.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MarkdownParser.kt\ncom/stripe/android/financialconnections/features/MarkdownParser\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,27:1\n1855#2,2:28\n*S KotlinDebug\n*F\n+ 1 MarkdownParser.kt\ncom/stripe/android/financialconnections/features/MarkdownParser\n*L\n21#1:28,2\n*E\n"
    }
.end annotation


# static fields
.field public static final INSTANCE:Lcom/stripe/android/financialconnections/features/MarkdownParser;

.field private static final REGEX_BOLD_ASTERISKS:Ljava/lang/String; = "\\*\\*(.*?)\\*\\*"

.field private static final REGEX_BOLD_UNDERSCORES:Ljava/lang/String; = "__([^_]+)__"

.field private static final REGEX_LINK:Ljava/lang/String; = "\\[([^]]+)]\\(([^)]+)\\)"

.field private static final markDownToHtmlRegex:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lkotlin/Pair<",
            "Lkotlin/text/Regex;",
            "Lkotlin/jvm/functions/Function1<",
            "Lkotlin/text/MatchResult;",
            "Ljava/lang/CharSequence;",
            ">;>;>;"
        }
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    new-instance v0, Lcom/stripe/android/financialconnections/features/MarkdownParser;

    invoke-direct {v0}, Lcom/stripe/android/financialconnections/features/MarkdownParser;-><init>()V

    sput-object v0, Lcom/stripe/android/financialconnections/features/MarkdownParser;->INSTANCE:Lcom/stripe/android/financialconnections/features/MarkdownParser;

    const/4 v0, 0x3

    new-array v0, v0, [Lkotlin/Pair;

    new-instance v1, Lkotlin/text/Regex;

    const-string v2, "\\*\\*(.*?)\\*\\*"

    invoke-direct {v1, v2}, Lkotlin/text/Regex;-><init>(Ljava/lang/String;)V

    sget-object v2, Lcom/stripe/android/financialconnections/features/MarkdownParser$markDownToHtmlRegex$1;->INSTANCE:Lcom/stripe/android/financialconnections/features/MarkdownParser$markDownToHtmlRegex$1;

    invoke-static {v1, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/4 v2, 0x0

    aput-object v1, v0, v2

    new-instance v1, Lkotlin/text/Regex;

    const-string v2, "__([^_]+)__"

    invoke-direct {v1, v2}, Lkotlin/text/Regex;-><init>(Ljava/lang/String;)V

    sget-object v2, Lcom/stripe/android/financialconnections/features/MarkdownParser$markDownToHtmlRegex$2;->INSTANCE:Lcom/stripe/android/financialconnections/features/MarkdownParser$markDownToHtmlRegex$2;

    invoke-static {v1, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/4 v2, 0x1

    aput-object v1, v0, v2

    new-instance v1, Lkotlin/text/Regex;

    const-string v2, "\\[([^]]+)]\\(([^)]+)\\)"

    invoke-direct {v1, v2}, Lkotlin/text/Regex;-><init>(Ljava/lang/String;)V

    sget-object v2, Lcom/stripe/android/financialconnections/features/MarkdownParser$markDownToHtmlRegex$3;->INSTANCE:Lcom/stripe/android/financialconnections/features/MarkdownParser$markDownToHtmlRegex$3;

    invoke-static {v1, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/4 v2, 0x2

    aput-object v1, v0, v2

    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    sput-object v0, Lcom/stripe/android/financialconnections/features/MarkdownParser;->markDownToHtmlRegex:Ljava/util/List;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final toHtml$financial_connections_release(Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    const-string v0, "string"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/stripe/android/financialconnections/features/MarkdownParser;->markDownToHtmlRegex:Ljava/util/List;

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lkotlin/Pair;

    invoke-virtual {v1}, Lkotlin/Pair;->component1()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lkotlin/text/Regex;

    invoke-virtual {v1}, Lkotlin/Pair;->component2()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lkotlin/jvm/functions/Function1;

    invoke-virtual {v2, p1, v1}, Lkotlin/text/Regex;->replace(Ljava/lang/CharSequence;Lkotlin/jvm/functions/Function1;)Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :cond_0
    return-object p1
.end method
