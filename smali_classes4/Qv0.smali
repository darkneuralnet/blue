.class public final LQv0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u0008\u00c6\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0003*\u0004\u0018\u00010\u0002H\u0007J\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0002*\u0004\u0018\u00010\u0003H\u0007J\u0016\u0010\u0008\u001a\u0004\u0018\u00010\u0003*\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006H\u0007J\u0016\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006*\u0004\u0018\u00010\u0003H\u0007R\u0014\u0010\u000c\u001a\u00020\n8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0008\u0010\u000bR\u001c\u0010\u0010\u001a\n \u000e*\u0004\u0018\u00010\r0\r8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0005\u0010\u000fR\u001c\u0010\u0011\u001a\n \u000e*\u0004\u0018\u00010\r0\r8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\t\u0010\u000f\u00a8\u0006\u0014"
    }
    d2 = {
        "LQv0;",
        "",
        "Lco/bird/android/model/persistence/nestedstructures/LegacyAsset;",
        "",
        "a",
        "c",
        "",
        "Lco/bird/android/model/persistence/nestedstructures/TutorialPage;",
        "b",
        "d",
        "Lwi2;",
        "Lwi2;",
        "deserializer",
        "Ljava/lang/reflect/Type;",
        "kotlin.jvm.PlatformType",
        "Ljava/lang/reflect/Type;",
        "tutorialPageTypeToken",
        "stringListToken",
        "<init>",
        "()V",
        "co.bird.android.lib.persistence.configurable-tutorial.impl"
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
        "SMAP\nConfigurableTutorialConverters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConfigurableTutorialConverters.kt\nco/bird/android/persistence/announcements/converters/ConfigurableTutorialConverters\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,34:1\n1#2:35\n*E\n"
    }
.end annotation


# static fields
.field public static final a:LQv0;

.field public static final b:Lwi2;

.field public static final c:Ljava/lang/reflect/Type;

.field public static final d:Ljava/lang/reflect/Type;


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    new-instance v0, LQv0;

    invoke-direct {v0}, LQv0;-><init>()V

    sput-object v0, LQv0;->a:LQv0;

    sget-object v0, Lco/bird/android/persistence/common/impl/Converters;->a:Lco/bird/android/persistence/common/impl/Converters;

    invoke-virtual {v0}, Lco/bird/android/persistence/common/impl/Converters;->a()Lwi2;

    move-result-object v0

    sput-object v0, LQv0;->b:Lwi2;

    new-instance v0, LQv0$a;

    invoke-direct {v0}, LQv0$a;-><init>()V

    invoke-virtual {v0}, LFb6;->getType()Ljava/lang/reflect/Type;

    move-result-object v0

    sput-object v0, LQv0;->c:Ljava/lang/reflect/Type;

    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/reflect/Type;

    const/4 v1, 0x0

    const-class v2, Ljava/lang/String;

    aput-object v2, v0, v1

    const-class v1, Ljava/util/List;

    invoke-static {v1, v0}, LFb6;->getParameterized(Ljava/lang/reflect/Type;[Ljava/lang/reflect/Type;)LFb6;

    move-result-object v0

    invoke-virtual {v0}, LFb6;->getType()Ljava/lang/reflect/Type;

    move-result-object v0

    sput-object v0, LQv0;->d:Ljava/lang/reflect/Type;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static final a(Lco/bird/android/model/persistence/nestedstructures/LegacyAsset;)Ljava/lang/String;
    .locals 1
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    if-eqz p0, :cond_0

    sget-object v0, LQv0;->b:Lwi2;

    invoke-virtual {v0, p0}, Lwi2;->i(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return-object p0
.end method

.method public static final b(Ljava/util/List;)Ljava/lang/String;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lco/bird/android/model/persistence/nestedstructures/TutorialPage;",
            ">;)",
            "Ljava/lang/String;"
        }
    .end annotation

    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    if-eqz p0, :cond_0

    sget-object v0, LQv0;->b:Lwi2;

    invoke-virtual {v0, p0}, Lwi2;->i(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return-object p0
.end method

.method public static final c(Ljava/lang/String;)Lco/bird/android/model/persistence/nestedstructures/LegacyAsset;
    .locals 2
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    if-eqz p0, :cond_0

    sget-object v0, LQv0;->b:Lwi2;

    const-class v1, Lco/bird/android/model/persistence/nestedstructures/LegacyAsset;

    invoke-static {v1}, Lkotlin/jvm/internal/Reflection;->getOrCreateKotlinClass(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    move-result-object v1

    invoke-virtual {v0, p0, v1}, Lwi2;->c(Ljava/lang/String;Lkotlin/reflect/KClass;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lco/bird/android/model/persistence/nestedstructures/LegacyAsset;

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return-object p0
.end method

.method public static final d(Ljava/lang/String;)Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/List<",
            "Lco/bird/android/model/persistence/nestedstructures/TutorialPage;",
            ">;"
        }
    .end annotation

    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    if-eqz p0, :cond_0

    sget-object v0, LQv0;->b:Lwi2;

    sget-object v1, LQv0;->c:Ljava/lang/reflect/Type;

    const-string v2, "tutorialPageTypeToken"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, p0, v1}, Lwi2;->b(Ljava/lang/String;Ljava/lang/reflect/Type;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/util/List;

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return-object p0
.end method
