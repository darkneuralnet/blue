.class public final Lcom/stripe/android/core/utils/PluginDetector;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/core/utils/PluginDetector$PluginType;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0005\n\u0002\u0010\u000b\n\u0002\u0008\u0003\u0008\u00c7\u0002\u0018\u00002\u00020\u0001:\u0001\u000cB\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0004H\u0002R\u0016\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0007\u0010\u0008\u00a8\u0006\r"
    }
    d2 = {
        "Lcom/stripe/android/core/utils/PluginDetector;",
        "",
        "()V",
        "TAG",
        "",
        "kotlin.jvm.PlatformType",
        "pluginType",
        "getPluginType",
        "()Ljava/lang/String;",
        "isPlugin",
        "",
        "className",
        "PluginType",
        "stripe-core_release"
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
        "SMAP\nPluginDetector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PluginDetector.kt\ncom/stripe/android/core/utils/PluginDetector\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,41:1\n1282#2,2:42\n*S KotlinDebug\n*F\n+ 1 PluginDetector.kt\ncom/stripe/android/core/utils/PluginDetector\n*L\n18#1:42,2\n*E\n"
    }
.end annotation


# static fields
.field public static final INSTANCE:Lcom/stripe/android/core/utils/PluginDetector;

.field private static final TAG:Ljava/lang/String;

.field private static final pluginType:Ljava/lang/String;


# direct methods
.method public static constructor <clinit>()V
    .locals 7

    new-instance v0, Lcom/stripe/android/core/utils/PluginDetector;

    invoke-direct {v0}, Lcom/stripe/android/core/utils/PluginDetector;-><init>()V

    sput-object v0, Lcom/stripe/android/core/utils/PluginDetector;->INSTANCE:Lcom/stripe/android/core/utils/PluginDetector;

    const-class v0, Lcom/stripe/android/core/utils/PluginDetector;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/stripe/android/core/utils/PluginDetector;->TAG:Ljava/lang/String;

    invoke-static {}, Lcom/stripe/android/core/utils/PluginDetector$PluginType;->values()[Lcom/stripe/android/core/utils/PluginDetector$PluginType;

    move-result-object v0

    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    const/4 v3, 0x0

    if-ge v2, v1, :cond_1

    aget-object v4, v0, v2

    sget-object v5, Lcom/stripe/android/core/utils/PluginDetector;->INSTANCE:Lcom/stripe/android/core/utils/PluginDetector;

    invoke-virtual {v4}, Lcom/stripe/android/core/utils/PluginDetector$PluginType;->getClassName()Ljava/lang/String;

    move-result-object v6

    invoke-direct {v5, v6}, Lcom/stripe/android/core/utils/PluginDetector;->isPlugin(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    move-object v4, v3

    :goto_1
    if-eqz v4, :cond_2

    invoke-virtual {v4}, Lcom/stripe/android/core/utils/PluginDetector$PluginType;->getPluginName()Ljava/lang/String;

    move-result-object v3

    :cond_2
    sput-object v3, Lcom/stripe/android/core/utils/PluginDetector;->pluginType:Ljava/lang/String;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private final isPlugin(Ljava/lang/String;)Z
    .locals 3

    :try_start_0
    invoke-static {p1}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    const/4 p1, 0x1

    goto :goto_0

    :catch_0
    move-exception v0

    sget-object v1, Lcom/stripe/android/core/utils/PluginDetector;->TAG:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, " not found: "

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v1, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    const/4 p1, 0x0

    :goto_0
    return p1
.end method


# virtual methods
.method public final getPluginType()Ljava/lang/String;
    .locals 1

    sget-object v0, Lcom/stripe/android/core/utils/PluginDetector;->pluginType:Ljava/lang/String;

    return-object v0
.end method
