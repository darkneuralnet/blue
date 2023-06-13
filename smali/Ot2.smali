.class public final LOt2;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\t\u0008\u00c7\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\n\u0010\u000bR\u001c\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0004\u0010\u0005R\u0013\u0010\t\u001a\u0004\u0018\u00010\u00038G\u00a2\u0006\u0006\u001a\u0004\u0008\u0007\u0010\u0008\u00a8\u0006\u000c"
    }
    d2 = {
        "LOt2;",
        "",
        "LU94;",
        "LE5;",
        "b",
        "LU94;",
        "LocalComposition",
        "a",
        "(LEt0;I)LE5;",
        "current",
        "<init>",
        "()V",
        "activity-compose_release"
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
        "SMAP\nActivityResultRegistry.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ActivityResultRegistry.kt\nandroidx/activity/compose/LocalActivityResultRegistryOwner\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 ActivityComposeUtils.kt\nandroidx/activity/compose/ActivityComposeUtilsKt\n*L\n1#1,161:1\n76#2:162\n76#2:163\n23#3,8:164\n*S KotlinDebug\n*F\n+ 1 ActivityResultRegistry.kt\nandroidx/activity/compose/LocalActivityResultRegistryOwner\n*L\n48#1:162\n49#1:163\n49#1:164,8\n*E\n"
    }
.end annotation


# static fields
.field public static final a:LOt2;

.field public static final b:LU94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LU94<",
            "LE5;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    new-instance v0, LOt2;

    invoke-direct {v0}, LOt2;-><init>()V

    sput-object v0, LOt2;->a:LOt2;

    sget-object v0, LOt2$a;->g:LOt2$a;

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-static {v2, v0, v1, v2}, Lgu0;->c(LEM5;Lkotlin/jvm/functions/Function0;ILjava/lang/Object;)LU94;

    move-result-object v0

    sput-object v0, LOt2;->b:LU94;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(LEt0;I)LE5;
    .locals 1
    .annotation build Lkotlin/jvm/JvmName;
        name = "getCurrent"
    .end annotation

    const p2, 0x548547d7

    invoke-interface {p1, p2}, LEt0;->F(I)V

    sget-object p2, LOt2;->b:LU94;

    invoke-interface {p1, p2}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, LE5;

    if-nez p2, :cond_2

    invoke-static {}, Landroidx/compose/ui/platform/h;->g()LU94;

    move-result-object p2

    invoke-interface {p1, p2}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Landroid/content/Context;

    :goto_0
    instance-of v0, p2, Landroid/content/ContextWrapper;

    if-eqz v0, :cond_1

    instance-of v0, p2, LE5;

    if-eqz v0, :cond_0

    goto :goto_1

    :cond_0
    check-cast p2, Landroid/content/ContextWrapper;

    invoke-virtual {p2}, Landroid/content/ContextWrapper;->getBaseContext()Landroid/content/Context;

    move-result-object p2

    const-string v0, "innerContext.baseContext"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_0

    :cond_1
    const/4 p2, 0x0

    :goto_1
    check-cast p2, LE5;

    :cond_2
    invoke-interface {p1}, LEt0;->Q()V

    return-object p2
.end method
