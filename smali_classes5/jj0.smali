.class public final Ljj0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\n\n\u0002\u0018\u0002\n\u0002\u0008\n\u0008\u00c6\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u001c\u0010\u0010J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u000e\u0010\t\u001a\u00020\u00082\u0006\u0010\u0007\u001a\u00020\u0006J\u0017\u0010\n\u001a\u00020\u00082\u0006\u0010\u0003\u001a\u00020\u0002H\u0000\u00a2\u0006\u0004\u0008\n\u0010\u000bR \u0010\r\u001a\u00020\u00068\u0006X\u0086D\u00a2\u0006\u0012\n\u0004\u0008\u0005\u0010\u000c\u0012\u0004\u0008\u000f\u0010\u0010\u001a\u0004\u0008\r\u0010\u000eR\u0016\u0010\u0012\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0011\u0010\u000cR\"\u0010\u0019\u001a\u00020\u00138\u0000@\u0000X\u0080\u000e\u00a2\u0006\u0012\n\u0004\u0008\u0014\u0010\u0015\u001a\u0004\u0008\u0011\u0010\u0016\"\u0004\u0008\u0017\u0010\u0018R\u0017\u0010\u001b\u001a\u00020\u00068F\u00a2\u0006\u000c\u0012\u0004\u0008\u001a\u0010\u0010\u001a\u0004\u0008\u0014\u0010\u000e\u00a8\u0006\u001d"
    }
    d2 = {
        "Ljj0;",
        "",
        "Landroid/content/Context;",
        "context",
        "Landroid/content/Intent;",
        "b",
        "",
        "enabled",
        "",
        "e",
        "a",
        "(Landroid/content/Context;)V",
        "Z",
        "isOp",
        "()Z",
        "isOp$annotations",
        "()V",
        "c",
        "_isEnabled",
        "LEx2;",
        "d",
        "LEx2;",
        "()LEx2;",
        "setLogger$com_github_ChuckerTeam_Chucker_library",
        "(LEx2;)V",
        "logger",
        "isEnabled$annotations",
        "isEnabled",
        "<init>",
        "com.github.ChuckerTeam.Chucker.library"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nChucker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Chucker.kt\ncom/chuckerteam/chucker/api/Chucker\n+ 2 Context.kt\nandroidx/core/content/ContextKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,112:1\n31#2:113\n1747#3,3:114\n*S KotlinDebug\n*F\n+ 1 Chucker.kt\ncom/chuckerteam/chucker/api/Chucker\n*L\n68#1:113\n69#1:114,3\n*E\n"
    }
.end annotation


# static fields
.field public static final a:Ljj0;

.field public static final b:Z

.field public static c:Z

.field public static d:LEx2;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Ljj0;

    invoke-direct {v0}, Ljj0;-><init>()V

    sput-object v0, Ljj0;->a:Ljj0;

    const/4 v0, 0x1

    sput-boolean v0, Ljj0;->b:Z

    new-instance v0, Ljj0$a;

    invoke-direct {v0}, Ljj0$a;-><init>()V

    sput-object v0, Ljj0;->d:LEx2;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static final b(Landroid/content/Context;)Landroid/content/Intent;
    .locals 2
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    const-string v0, "context"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Landroid/content/Intent;

    const-class v1, Lcom/chuckerteam/chucker/internal/ui/MainActivity;

    invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const/high16 p0, 0x10000000

    invoke-virtual {v0, p0}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    move-result-object p0

    const-string v0, "Intent(context, MainActi\u2026t.FLAG_ACTIVITY_NEW_TASK)"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method


# virtual methods
.method public final a(Landroid/content/Context;)V
    .locals 6

    const-string v0, "ShortcutManager addDynamicShortcuts failed "

    const-string v1, "context"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x19

    if-ge v1, v2, :cond_0

    return-void

    :cond_0
    const-class v1, Landroid/content/pm/ShortcutManager;

    invoke-static {p1, v1}, LNA0;->j(Landroid/content/Context;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1}, Lbj0;->a(Ljava/lang/Object;)Landroid/content/pm/ShortcutManager;

    move-result-object v1

    if-nez v1, :cond_1

    return-void

    :cond_1
    invoke-static {v1}, Lcj0;->a(Landroid/content/pm/ShortcutManager;)Ljava/util/List;

    move-result-object v2

    const-string v3, "shortcutManager.dynamicShortcuts"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v2, Ljava/lang/Iterable;

    instance-of v3, v2, Ljava/util/Collection;

    const-string v4, "chuckerShortcutId"

    const/4 v5, 0x0

    if-eqz v3, :cond_2

    move-object v3, v2

    check-cast v3, Ljava/util/Collection;

    invoke-interface {v3}, Ljava/util/Collection;->isEmpty()Z

    move-result v3

    if-eqz v3, :cond_2

    goto :goto_0

    :cond_2
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_3
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_4

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    invoke-static {v3}, Ldj0;->a(Ljava/lang/Object;)Landroid/content/pm/ShortcutInfo;

    move-result-object v3

    invoke-static {v3}, Lej0;->a(Landroid/content/pm/ShortcutInfo;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_3

    const/4 v5, 0x1

    :cond_4
    :goto_0
    if-eqz v5, :cond_5

    return-void

    :cond_5
    invoke-static {}, Laj0;->a()V

    invoke-static {p1, v4}, LXi0;->a(Landroid/content/Context;Ljava/lang/String;)Landroid/content/pm/ShortcutInfo$Builder;

    move-result-object v2

    sget v3, Lal4;->chucker_shortcut_label:I

    invoke-virtual {p1, v3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v4

    invoke-static {v2, v4}, Lfj0;->a(Landroid/content/pm/ShortcutInfo$Builder;Ljava/lang/CharSequence;)Landroid/content/pm/ShortcutInfo$Builder;

    move-result-object v2

    invoke-virtual {p1, v3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Lgj0;->a(Landroid/content/pm/ShortcutInfo$Builder;Ljava/lang/CharSequence;)Landroid/content/pm/ShortcutInfo$Builder;

    move-result-object v2

    sget v3, LVk4;->chucker_ic_launcher:I

    invoke-static {p1, v3}, Landroid/graphics/drawable/Icon;->createWithResource(Landroid/content/Context;I)Landroid/graphics/drawable/Icon;

    move-result-object v3

    invoke-static {v2, v3}, Lhj0;->a(Landroid/content/pm/ShortcutInfo$Builder;Landroid/graphics/drawable/Icon;)Landroid/content/pm/ShortcutInfo$Builder;

    move-result-object v2

    invoke-static {p1}, Ljj0;->b(Landroid/content/Context;)Landroid/content/Intent;

    move-result-object p1

    const-string v3, "android.intent.action.VIEW"

    invoke-virtual {p1, v3}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    move-result-object p1

    invoke-static {v2, p1}, Lij0;->a(Landroid/content/pm/ShortcutInfo$Builder;Landroid/content/Intent;)Landroid/content/pm/ShortcutInfo$Builder;

    move-result-object p1

    invoke-static {p1}, LYi0;->a(Landroid/content/pm/ShortcutInfo$Builder;)Landroid/content/pm/ShortcutInfo;

    move-result-object p1

    const-string v2, "Builder(context, SHORTCU\u2026EW))\n            .build()"

    invoke-static {p1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    :try_start_0
    invoke-static {p1}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    invoke-static {v1, p1}, LZi0;->a(Landroid/content/pm/ShortcutManager;Ljava/util/List;)Z
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception p1

    sget-object v1, LEx2;->a:LEx2$a;

    invoke-virtual {v1, v0, p1}, LEx2$a;->b(Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_1

    :catch_1
    move-exception p1

    sget-object v1, LEx2;->a:LEx2$a;

    invoke-virtual {v1, v0, p1}, LEx2$a;->b(Ljava/lang/String;Ljava/lang/Throwable;)V

    :goto_1
    return-void
.end method

.method public final c()LEx2;
    .locals 1

    sget-object v0, Ljj0;->d:LEx2;

    return-object v0
.end method

.method public final d()Z
    .locals 1

    sget-boolean v0, Ljj0;->c:Z

    return v0
.end method

.method public final e(Z)V
    .locals 0

    sput-boolean p1, Ljj0;->c:Z

    return-void
.end method
