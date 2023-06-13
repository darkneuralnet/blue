.class public final LUM4;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\r\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\t\n\u0002\u0010%\n\u0002\u0010\u0008\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u000e\u0008\u00c6\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008,\u0010\u0017J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J$\u0010\u000c\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\u0008H\u0007J\u0010\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u0002H\u0007R(\u0010\u0018\u001a\u00020\u000f8\u0006@\u0006X\u0087.\u00a2\u0006\u0018\n\u0004\u0008\u0010\u0010\u0011\u0012\u0004\u0008\u0016\u0010\u0017\u001a\u0004\u0008\u0012\u0010\u0013\"\u0004\u0008\u0014\u0010\u0015R&\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\t0\u00198\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008\u001b\u0010\u001c\u001a\u0004\u0008\u001b\u0010\u001dR(\u0010%\u001a\u00020\u001f8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0018\n\u0004\u0008\u0012\u0010 \u0012\u0004\u0008$\u0010\u0017\u001a\u0004\u0008\u0010\u0010!\"\u0004\u0008\"\u0010#R*\u0010\u0007\u001a\u00020\u00062\u0006\u0010&\u001a\u00020\u00068F@FX\u0087\u000e\u00a2\u0006\u0012\u0012\u0004\u0008+\u0010\u0017\u001a\u0004\u0008\'\u0010(\"\u0004\u0008)\u0010*\u00a8\u0006-"
    }
    d2 = {
        "LUM4;",
        "",
        "Landroid/content/Context;",
        "context",
        "",
        "e",
        "Ljava/util/Locale;",
        "locale",
        "",
        "",
        "",
        "strings",
        "f",
        "base",
        "h",
        "LbS5;",
        "b",
        "LbS5;",
        "d",
        "()LbS5;",
        "g",
        "(LbS5;)V",
        "getStringRepository$annotations",
        "()V",
        "stringRepository",
        "",
        "",
        "c",
        "Ljava/util/Map;",
        "()Ljava/util/Map;",
        "managedStrings",
        "LAv2;",
        "LAv2;",
        "()LAv2;",
        "setLocaleProvider",
        "(LAv2;)V",
        "getLocaleProvider$annotations",
        "localeProvider",
        "value",
        "a",
        "()Ljava/util/Locale;",
        "setLocale",
        "(Ljava/util/Locale;)V",
        "getLocale$annotations",
        "<init>",
        "restring_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x7,
        0x1
    }
.end annotation


# static fields
.field public static final a:LUM4;

.field public static b:LbS5;

.field public static final c:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/Integer;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public static d:LAv2;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, LUM4;

    invoke-direct {v0}, LUM4;-><init>()V

    sput-object v0, LUM4;->a:LUM4;

    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    sput-object v0, LUM4;->c:Ljava/util/Map;

    sget-object v0, LWX0;->a:LWX0;

    sput-object v0, LUM4;->d:LAv2;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static final a()Ljava/util/Locale;
    .locals 1

    sget-object v0, LUM4;->d:LAv2;

    invoke-interface {v0}, LAv2;->a()Ljava/util/Locale;

    move-result-object v0

    return-object v0
.end method

.method public static final b()LAv2;
    .locals 1

    sget-object v0, LUM4;->d:LAv2;

    return-object v0
.end method

.method public static final d()LbS5;
    .locals 1

    sget-object v0, LUM4;->b:LbS5;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "stringRepository"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public static final e(Landroid/content/Context;)V
    .locals 3
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    const-string v0, "context"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lk80;

    new-instance v1, Lez5;

    new-instance v2, LUM4$a;

    invoke-direct {v2, p0}, LUM4$a;-><init>(Landroid/content/Context;)V

    invoke-direct {v1, v2}, Lez5;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-direct {v0, v1}, Lk80;-><init>(LIX2;)V

    invoke-static {v0}, LUM4;->g(LbS5;)V

    return-void
.end method

.method public static final f(Ljava/util/Locale;Ljava/util/Map;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Locale;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Ljava/lang/CharSequence;",
            ">;)V"
        }
    .end annotation

    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    const-string v0, "locale"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "strings"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, LUM4;->d()LbS5;

    move-result-object v0

    invoke-static {v0}, LcS5;->a(LbS5;)LIX2;

    move-result-object v0

    invoke-interface {v0}, LIX2;->c()Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0, p0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/util/Map;

    if-eqz p0, :cond_0

    invoke-interface {p0, p1}, Ljava/util/Map;->putAll(Ljava/util/Map;)V

    :cond_0
    return-void
.end method

.method public static final g(LbS5;)V
    .locals 1

    const-string v0, "<set-?>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    sput-object p0, LUM4;->b:LbS5;

    return-void
.end method

.method public static final h(Landroid/content/Context;)Landroid/content/Context;
    .locals 2
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    const-string v0, "base"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, LUM4;->b:LbS5;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-nez v0, :cond_1

    return-object p0

    :cond_1
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    instance-of v0, v0, LZM4;

    if-eqz v0, :cond_2

    return-object p0

    :cond_2
    sget-object v0, LVM4;->b:LVM4$a;

    invoke-static {}, LUM4;->d()LbS5;

    move-result-object v1

    invoke-virtual {v0, p0, v1}, LVM4$a;->a(Landroid/content/Context;LbS5;)LVM4;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final c()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/Integer;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    sget-object v0, LUM4;->c:Ljava/util/Map;

    return-object v0
.end method
