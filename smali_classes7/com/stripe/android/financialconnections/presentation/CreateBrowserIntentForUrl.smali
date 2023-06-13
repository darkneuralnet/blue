.class public final Lcom/stripe/android/financialconnections/presentation/CreateBrowserIntentForUrl;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\u0008\u00c0\u0002\u0018\u00002\u00020\u0001B\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0008\u001a\u00020\tH\u0002J\u0019\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u000c2\u0006\u0010\u0008\u001a\u00020\tH\u0086\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"
    }
    d2 = {
        "Lcom/stripe/android/financialconnections/presentation/CreateBrowserIntentForUrl;",
        "",
        "()V",
        "CHROME_PACKAGE",
        "",
        "FIREFOX_PACKAGE",
        "createCustomTabIntent",
        "Landroid/content/Intent;",
        "uri",
        "Landroid/net/Uri;",
        "invoke",
        "context",
        "Landroid/content/Context;",
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
        "SMAP\nCreateBrowserIntentForUrl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CreateBrowserIntentForUrl.kt\ncom/stripe/android/financialconnections/presentation/CreateBrowserIntentForUrl\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,43:1\n1#2:44\n*E\n"
    }
.end annotation


# static fields
.field private static final CHROME_PACKAGE:Ljava/lang/String; = "com.android.chrome"

.field private static final FIREFOX_PACKAGE:Ljava/lang/String; = "org.mozilla"

.field public static final INSTANCE:Lcom/stripe/android/financialconnections/presentation/CreateBrowserIntentForUrl;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/stripe/android/financialconnections/presentation/CreateBrowserIntentForUrl;

    invoke-direct {v0}, Lcom/stripe/android/financialconnections/presentation/CreateBrowserIntentForUrl;-><init>()V

    sput-object v0, Lcom/stripe/android/financialconnections/presentation/CreateBrowserIntentForUrl;->INSTANCE:Lcom/stripe/android/financialconnections/presentation/CreateBrowserIntentForUrl;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private final createCustomTabIntent(Landroid/net/Uri;)Landroid/content/Intent;
    .locals 2

    new-instance v0, LwF0$b;

    invoke-direct {v0}, LwF0$b;-><init>()V

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, LwF0$b;->f(I)LwF0$b;

    move-result-object v0

    invoke-virtual {v0}, LwF0$b;->a()LwF0;

    move-result-object v0

    iget-object v1, v0, LwF0;->a:Landroid/content/Intent;

    invoke-virtual {v1, p1}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;

    iget-object p1, v0, LwF0;->a:Landroid/content/Intent;

    const-string v0, "Builder()\n            .s\u2026uri }\n            .intent"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method


# virtual methods
.method public final invoke(Landroid/content/Context;Landroid/net/Uri;)Landroid/content/Intent;
    .locals 6

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "uri"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Landroid/content/Intent;

    const-string v1, "android.intent.action.VIEW"

    invoke-direct {v0, v1, p2}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    invoke-virtual {p1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object p1

    const/high16 v1, 0x10000

    invoke-virtual {p1, v0, v1}, Landroid/content/pm/PackageManager;->resolveActivity(Landroid/content/Intent;I)Landroid/content/pm/ResolveInfo;

    move-result-object p1

    const/4 v1, 0x0

    if-eqz p1, :cond_0

    iget-object p1, p1, Landroid/content/pm/ResolveInfo;->activityInfo:Landroid/content/pm/ActivityInfo;

    if-eqz p1, :cond_0

    iget-object p1, p1, Landroid/content/pm/ActivityInfo;->packageName:Ljava/lang/String;

    goto :goto_0

    :cond_0
    move-object p1, v1

    :goto_0
    const/4 v2, 0x2

    const/4 v3, 0x1

    const/4 v4, 0x0

    if-eqz p1, :cond_1

    const-string v5, "org.mozilla"

    invoke-static {p1, v5, v4, v2, v1}, Lkotlin/text/StringsKt;->contains$default(Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z

    move-result v5

    if-ne v5, v3, :cond_1

    move v5, v3

    goto :goto_1

    :cond_1
    move v5, v4

    :goto_1
    if-eqz v5, :cond_2

    goto :goto_3

    :cond_2
    if-eqz p1, :cond_3

    const-string v0, "com.android.chrome"

    invoke-static {p1, v0, v4, v2, v1}, Lkotlin/text/StringsKt;->contains$default(Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z

    move-result p1

    if-ne p1, v3, :cond_3

    goto :goto_2

    :cond_3
    move v3, v4

    :goto_2
    if-eqz v3, :cond_4

    invoke-direct {p0, p2}, Lcom/stripe/android/financialconnections/presentation/CreateBrowserIntentForUrl;->createCustomTabIntent(Landroid/net/Uri;)Landroid/content/Intent;

    move-result-object v0

    goto :goto_3

    :cond_4
    invoke-direct {p0, p2}, Lcom/stripe/android/financialconnections/presentation/CreateBrowserIntentForUrl;->createCustomTabIntent(Landroid/net/Uri;)Landroid/content/Intent;

    move-result-object v0

    :goto_3
    return-object v0
.end method
