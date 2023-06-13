.class public final Lcom/fasterxml/jackson/module/kotlin/KotlinModule;
.super Lcom/fasterxml/jackson/databind/module/SimpleModule;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/fasterxml/jackson/module/kotlin/KotlinModule$Companion;,
        Lcom/fasterxml/jackson/module/kotlin/KotlinModule$Builder;,
        Lcom/fasterxml/jackson/module/kotlin/KotlinModule$WhenMappings;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0008\n\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0018\u0000 \"2\u00020\u0001:\u0002!\"B\u001f\u0008\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0007B\'\u0008\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0008\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\tB\u000f\u0008\u0012\u0012\u0006\u0010\n\u001a\u00020\u000b\u00a2\u0006\u0002\u0010\u000cBC\u0008\u0007\u0012\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0005\u0012\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0005\u0012\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u0005\u0012\u0008\u0008\u0002\u0010\r\u001a\u00020\u000e\u0012\u0008\u0008\u0002\u0010\u000f\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0010J\u0010\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 H\u0016R\u0018\u0010\u0011\u001a\u000c\u0012\u0008\u0012\u0006\u0012\u0002\u0008\u00030\u00130\u0012X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0008\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0014\u0010\u0015R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0016\u0010\u0015R\u0011\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0017\u0010\u0015R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0018\u0010\u0019R\u0011\u0010\r\u001a\u00020\u000e\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001a\u0010\u001bR\u0011\u0010\u000f\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001c\u0010\u0015\u00a8\u0006#"
    }
    d2 = {
        "Lcom/fasterxml/jackson/module/kotlin/KotlinModule;",
        "Lcom/fasterxml/jackson/databind/module/SimpleModule;",
        "reflectionCacheSize",
        "",
        "nullToEmptyCollection",
        "",
        "nullToEmptyMap",
        "(IZZ)V",
        "nullIsSameAsDefault",
        "(IZZZ)V",
        "builder",
        "Lcom/fasterxml/jackson/module/kotlin/KotlinModule$Builder;",
        "(Lcom/fasterxml/jackson/module/kotlin/KotlinModule$Builder;)V",
        "singletonSupport",
        "Lcom/fasterxml/jackson/module/kotlin/SingletonSupport;",
        "strictNullChecks",
        "(IZZZLcom/fasterxml/jackson/module/kotlin/SingletonSupport;Z)V",
        "ignoredClassesForImplyingJsonCreator",
        "",
        "Lkotlin/reflect/KClass;",
        "getNullIsSameAsDefault",
        "()Z",
        "getNullToEmptyCollection",
        "getNullToEmptyMap",
        "getReflectionCacheSize",
        "()I",
        "getSingletonSupport",
        "()Lcom/fasterxml/jackson/module/kotlin/SingletonSupport;",
        "getStrictNullChecks",
        "setupModule",
        "",
        "context",
        "Lcom/fasterxml/jackson/databind/Module$SetupContext;",
        "Builder",
        "Companion",
        "jackson-module-kotlin"
    }
    k = 0x1
    mv = {
        0x1,
        0x5,
        0x1
    }
    xi = 0x30
.end annotation


# static fields
.field public static final Companion:Lcom/fasterxml/jackson/module/kotlin/KotlinModule$Companion;

.field public static final serialVersionUID:J = 0x1L


# instance fields
.field private final ignoredClassesForImplyingJsonCreator:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Lkotlin/reflect/KClass<",
            "*>;>;"
        }
    .end annotation
.end field

.field private final nullIsSameAsDefault:Z

.field private final nullToEmptyCollection:Z

.field private final nullToEmptyMap:Z

.field private final reflectionCacheSize:I

.field private final singletonSupport:Lcom/fasterxml/jackson/module/kotlin/SingletonSupport;

.field private final strictNullChecks:Z


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/fasterxml/jackson/module/kotlin/KotlinModule$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/fasterxml/jackson/module/kotlin/KotlinModule$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/fasterxml/jackson/module/kotlin/KotlinModule;->Companion:Lcom/fasterxml/jackson/module/kotlin/KotlinModule$Companion;

    return-void
.end method

.method public constructor <init>()V
    .locals 9
    .annotation runtime Lkotlin/Deprecated;
        level = .enum Lkotlin/DeprecationLevel;->WARNING:Lkotlin/DeprecationLevel;
        message = "Use KotlinModule.Builder instead of named constructor parameters."
        replaceWith = .subannotation Lkotlin/ReplaceWith;
            expression = "KotlinModule.Builder()\n            .withReflectionCacheSize(reflectionCacheSize)\n            .configure(KotlinFeature.NullToEmptyCollection, nullToEmptyCollection)\n            .configure(KotlinFeature.NullToEmptyMap, nullToEmptyMap)\n            .configure(KotlinFeature.NullIsSameAsDefault, nullIsSameAsDefault)\n            .configure(KotlinFeature.SingletonSupport, singletonSupport)\n            .configure(KotlinFeature.StrictNullChecks, strictNullChecks)\n            .build()"
            imports = {
                "com.fasterxml.jackson.module.kotlin.KotlinFeature"
            }
        .end subannotation
    .end annotation

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/16 v7, 0x3f

    const/4 v8, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v8}, Lcom/fasterxml/jackson/module/kotlin/KotlinModule;-><init>(IZZZLcom/fasterxml/jackson/module/kotlin/SingletonSupport;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public synthetic constructor <init>(IZZ)V
    .locals 1
    .annotation runtime Lkotlin/Deprecated;
        level = .enum Lkotlin/DeprecationLevel;->HIDDEN:Lkotlin/DeprecationLevel;
        message = "For ABI compatibility"
    .end annotation

    new-instance v0, Lcom/fasterxml/jackson/module/kotlin/KotlinModule$Builder;

    invoke-direct {v0}, Lcom/fasterxml/jackson/module/kotlin/KotlinModule$Builder;-><init>()V

    invoke-virtual {v0, p1}, Lcom/fasterxml/jackson/module/kotlin/KotlinModule$Builder;->withReflectionCacheSize(I)Lcom/fasterxml/jackson/module/kotlin/KotlinModule$Builder;

    move-result-object p1

    sget-object v0, Lcom/fasterxml/jackson/module/kotlin/KotlinFeature;->NullToEmptyCollection:Lcom/fasterxml/jackson/module/kotlin/KotlinFeature;

    invoke-virtual {p1, v0, p2}, Lcom/fasterxml/jackson/module/kotlin/KotlinModule$Builder;->configure(Lcom/fasterxml/jackson/module/kotlin/KotlinFeature;Z)Lcom/fasterxml/jackson/module/kotlin/KotlinModule$Builder;

    move-result-object p1

    sget-object p2, Lcom/fasterxml/jackson/module/kotlin/KotlinFeature;->NullToEmptyMap:Lcom/fasterxml/jackson/module/kotlin/KotlinFeature;

    invoke-virtual {p1, p2, p3}, Lcom/fasterxml/jackson/module/kotlin/KotlinModule$Builder;->configure(Lcom/fasterxml/jackson/module/kotlin/KotlinFeature;Z)Lcom/fasterxml/jackson/module/kotlin/KotlinModule$Builder;

    move-result-object p1

    sget-object p2, Lcom/fasterxml/jackson/module/kotlin/KotlinFeature;->NullIsSameAsDefault:Lcom/fasterxml/jackson/module/kotlin/KotlinFeature;

    invoke-virtual {p1, p2}, Lcom/fasterxml/jackson/module/kotlin/KotlinModule$Builder;->disable(Lcom/fasterxml/jackson/module/kotlin/KotlinFeature;)Lcom/fasterxml/jackson/module/kotlin/KotlinModule$Builder;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/fasterxml/jackson/module/kotlin/KotlinModule;-><init>(Lcom/fasterxml/jackson/module/kotlin/KotlinModule$Builder;)V

    return-void
.end method

.method public synthetic constructor <init>(IZZZ)V
    .locals 1
    .annotation runtime Lkotlin/Deprecated;
        level = .enum Lkotlin/DeprecationLevel;->HIDDEN:Lkotlin/DeprecationLevel;
        message = "For ABI compatibility"
    .end annotation

    new-instance v0, Lcom/fasterxml/jackson/module/kotlin/KotlinModule$Builder;

    invoke-direct {v0}, Lcom/fasterxml/jackson/module/kotlin/KotlinModule$Builder;-><init>()V

    invoke-virtual {v0, p1}, Lcom/fasterxml/jackson/module/kotlin/KotlinModule$Builder;->withReflectionCacheSize(I)Lcom/fasterxml/jackson/module/kotlin/KotlinModule$Builder;

    move-result-object p1

    sget-object v0, Lcom/fasterxml/jackson/module/kotlin/KotlinFeature;->NullToEmptyCollection:Lcom/fasterxml/jackson/module/kotlin/KotlinFeature;

    invoke-virtual {p1, v0, p2}, Lcom/fasterxml/jackson/module/kotlin/KotlinModule$Builder;->configure(Lcom/fasterxml/jackson/module/kotlin/KotlinFeature;Z)Lcom/fasterxml/jackson/module/kotlin/KotlinModule$Builder;

    move-result-object p1

    sget-object p2, Lcom/fasterxml/jackson/module/kotlin/KotlinFeature;->NullToEmptyMap:Lcom/fasterxml/jackson/module/kotlin/KotlinFeature;

    invoke-virtual {p1, p2, p3}, Lcom/fasterxml/jackson/module/kotlin/KotlinModule$Builder;->configure(Lcom/fasterxml/jackson/module/kotlin/KotlinFeature;Z)Lcom/fasterxml/jackson/module/kotlin/KotlinModule$Builder;

    move-result-object p1

    sget-object p2, Lcom/fasterxml/jackson/module/kotlin/KotlinFeature;->NullIsSameAsDefault:Lcom/fasterxml/jackson/module/kotlin/KotlinFeature;

    invoke-virtual {p1, p2, p4}, Lcom/fasterxml/jackson/module/kotlin/KotlinModule$Builder;->configure(Lcom/fasterxml/jackson/module/kotlin/KotlinFeature;Z)Lcom/fasterxml/jackson/module/kotlin/KotlinModule$Builder;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/fasterxml/jackson/module/kotlin/KotlinModule;-><init>(Lcom/fasterxml/jackson/module/kotlin/KotlinModule$Builder;)V

    return-void
.end method

.method public constructor <init>(IZZZLcom/fasterxml/jackson/module/kotlin/SingletonSupport;Z)V
    .locals 2
    .annotation runtime Lkotlin/Deprecated;
        level = .enum Lkotlin/DeprecationLevel;->WARNING:Lkotlin/DeprecationLevel;
        message = "Use KotlinModule.Builder instead of named constructor parameters."
        replaceWith = .subannotation Lkotlin/ReplaceWith;
            expression = "KotlinModule.Builder()\n            .withReflectionCacheSize(reflectionCacheSize)\n            .configure(KotlinFeature.NullToEmptyCollection, nullToEmptyCollection)\n            .configure(KotlinFeature.NullToEmptyMap, nullToEmptyMap)\n            .configure(KotlinFeature.NullIsSameAsDefault, nullIsSameAsDefault)\n            .configure(KotlinFeature.SingletonSupport, singletonSupport)\n            .configure(KotlinFeature.StrictNullChecks, strictNullChecks)\n            .build()"
            imports = {
                "com.fasterxml.jackson.module.kotlin.KotlinFeature"
            }
        .end subannotation
    .end annotation

    const-string v0, "singletonSupport"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v0, Lcom/fasterxml/jackson/module/kotlin/KotlinModule;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    sget-object v1, Lcom/fasterxml/jackson/module/kotlin/PackageVersion;->VERSION:Lcom/fasterxml/jackson/core/Version;

    invoke-direct {p0, v0, v1}, Lcom/fasterxml/jackson/databind/module/SimpleModule;-><init>(Ljava/lang/String;Lcom/fasterxml/jackson/core/Version;)V

    iput p1, p0, Lcom/fasterxml/jackson/module/kotlin/KotlinModule;->reflectionCacheSize:I

    iput-boolean p2, p0, Lcom/fasterxml/jackson/module/kotlin/KotlinModule;->nullToEmptyCollection:Z

    iput-boolean p3, p0, Lcom/fasterxml/jackson/module/kotlin/KotlinModule;->nullToEmptyMap:Z

    iput-boolean p4, p0, Lcom/fasterxml/jackson/module/kotlin/KotlinModule;->nullIsSameAsDefault:Z

    iput-object p5, p0, Lcom/fasterxml/jackson/module/kotlin/KotlinModule;->singletonSupport:Lcom/fasterxml/jackson/module/kotlin/SingletonSupport;

    iput-boolean p6, p0, Lcom/fasterxml/jackson/module/kotlin/KotlinModule;->strictNullChecks:Z

    invoke-static {}, Lkotlin/collections/SetsKt;->emptySet()Ljava/util/Set;

    move-result-object p1

    iput-object p1, p0, Lcom/fasterxml/jackson/module/kotlin/KotlinModule;->ignoredClassesForImplyingJsonCreator:Ljava/util/Set;

    return-void
.end method

.method public synthetic constructor <init>(IZZZLcom/fasterxml/jackson/module/kotlin/SingletonSupport;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 4

    and-int/lit8 p8, p7, 0x1

    if-eqz p8, :cond_0

    const/16 p1, 0x200

    :cond_0
    and-int/lit8 p8, p7, 0x2

    const/4 v0, 0x0

    if-eqz p8, :cond_1

    move p8, v0

    goto :goto_0

    :cond_1
    move p8, p2

    :goto_0
    and-int/lit8 p2, p7, 0x4

    if-eqz p2, :cond_2

    move v1, v0

    goto :goto_1

    :cond_2
    move v1, p3

    :goto_1
    and-int/lit8 p2, p7, 0x8

    if-eqz p2, :cond_3

    move v2, v0

    goto :goto_2

    :cond_3
    move v2, p4

    :goto_2
    and-int/lit8 p2, p7, 0x10

    if-eqz p2, :cond_4

    sget-object p5, Lcom/fasterxml/jackson/module/kotlin/SingletonSupport;->DISABLED:Lcom/fasterxml/jackson/module/kotlin/SingletonSupport;

    :cond_4
    move-object v3, p5

    and-int/lit8 p2, p7, 0x20

    if-eqz p2, :cond_5

    goto :goto_3

    :cond_5
    move v0, p6

    :goto_3
    move-object p2, p0

    move p3, p1

    move p4, p8

    move p5, v1

    move p6, v2

    move-object p7, v3

    move p8, v0

    invoke-direct/range {p2 .. p8}, Lcom/fasterxml/jackson/module/kotlin/KotlinModule;-><init>(IZZZLcom/fasterxml/jackson/module/kotlin/SingletonSupport;Z)V

    return-void
.end method

.method private constructor <init>(Lcom/fasterxml/jackson/module/kotlin/KotlinModule$Builder;)V
    .locals 7

    invoke-virtual {p1}, Lcom/fasterxml/jackson/module/kotlin/KotlinModule$Builder;->getReflectionCacheSize()I

    move-result v1

    sget-object v0, Lcom/fasterxml/jackson/module/kotlin/KotlinFeature;->NullToEmptyCollection:Lcom/fasterxml/jackson/module/kotlin/KotlinFeature;

    invoke-virtual {p1, v0}, Lcom/fasterxml/jackson/module/kotlin/KotlinModule$Builder;->isEnabled(Lcom/fasterxml/jackson/module/kotlin/KotlinFeature;)Z

    move-result v2

    sget-object v0, Lcom/fasterxml/jackson/module/kotlin/KotlinFeature;->NullToEmptyMap:Lcom/fasterxml/jackson/module/kotlin/KotlinFeature;

    invoke-virtual {p1, v0}, Lcom/fasterxml/jackson/module/kotlin/KotlinModule$Builder;->isEnabled(Lcom/fasterxml/jackson/module/kotlin/KotlinFeature;)Z

    move-result v3

    sget-object v0, Lcom/fasterxml/jackson/module/kotlin/KotlinFeature;->NullIsSameAsDefault:Lcom/fasterxml/jackson/module/kotlin/KotlinFeature;

    invoke-virtual {p1, v0}, Lcom/fasterxml/jackson/module/kotlin/KotlinModule$Builder;->isEnabled(Lcom/fasterxml/jackson/module/kotlin/KotlinFeature;)Z

    move-result v4

    sget-object v0, Lcom/fasterxml/jackson/module/kotlin/KotlinFeature;->SingletonSupport:Lcom/fasterxml/jackson/module/kotlin/KotlinFeature;

    invoke-virtual {p1, v0}, Lcom/fasterxml/jackson/module/kotlin/KotlinModule$Builder;->isEnabled(Lcom/fasterxml/jackson/module/kotlin/KotlinFeature;)Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object v0, Lcom/fasterxml/jackson/module/kotlin/SingletonSupport;->CANONICALIZE:Lcom/fasterxml/jackson/module/kotlin/SingletonSupport;

    goto :goto_0

    :cond_0
    sget-object v0, Lcom/fasterxml/jackson/module/kotlin/SingletonSupport;->DISABLED:Lcom/fasterxml/jackson/module/kotlin/SingletonSupport;

    :goto_0
    move-object v5, v0

    sget-object v0, Lcom/fasterxml/jackson/module/kotlin/KotlinFeature;->StrictNullChecks:Lcom/fasterxml/jackson/module/kotlin/KotlinFeature;

    invoke-virtual {p1, v0}, Lcom/fasterxml/jackson/module/kotlin/KotlinModule$Builder;->isEnabled(Lcom/fasterxml/jackson/module/kotlin/KotlinFeature;)Z

    move-result v6

    move-object v0, p0

    invoke-direct/range {v0 .. v6}, Lcom/fasterxml/jackson/module/kotlin/KotlinModule;-><init>(IZZZLcom/fasterxml/jackson/module/kotlin/SingletonSupport;Z)V

    return-void
.end method

.method public synthetic constructor <init>(Lcom/fasterxml/jackson/module/kotlin/KotlinModule$Builder;Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/fasterxml/jackson/module/kotlin/KotlinModule;-><init>(Lcom/fasterxml/jackson/module/kotlin/KotlinModule$Builder;)V

    return-void
.end method

.method private static final setupModule$addMixIn(Lcom/fasterxml/jackson/databind/Module$SetupContext;Ljava/lang/Class;Ljava/lang/Class;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/fasterxml/jackson/databind/Module$SetupContext;",
            "Ljava/lang/Class<",
            "*>;",
            "Ljava/lang/Class<",
            "*>;)V"
        }
    .end annotation

    invoke-interface {p0, p1, p2}, Lcom/fasterxml/jackson/databind/Module$SetupContext;->setMixInAnnotations(Ljava/lang/Class;Ljava/lang/Class;)V

    return-void
.end method


# virtual methods
.method public final getNullIsSameAsDefault()Z
    .locals 1

    iget-boolean v0, p0, Lcom/fasterxml/jackson/module/kotlin/KotlinModule;->nullIsSameAsDefault:Z

    return v0
.end method

.method public final getNullToEmptyCollection()Z
    .locals 1

    iget-boolean v0, p0, Lcom/fasterxml/jackson/module/kotlin/KotlinModule;->nullToEmptyCollection:Z

    return v0
.end method

.method public final getNullToEmptyMap()Z
    .locals 1

    iget-boolean v0, p0, Lcom/fasterxml/jackson/module/kotlin/KotlinModule;->nullToEmptyMap:Z

    return v0
.end method

.method public final getReflectionCacheSize()I
    .locals 1

    iget v0, p0, Lcom/fasterxml/jackson/module/kotlin/KotlinModule;->reflectionCacheSize:I

    return v0
.end method

.method public final getSingletonSupport()Lcom/fasterxml/jackson/module/kotlin/SingletonSupport;
    .locals 1

    iget-object v0, p0, Lcom/fasterxml/jackson/module/kotlin/KotlinModule;->singletonSupport:Lcom/fasterxml/jackson/module/kotlin/SingletonSupport;

    return-object v0
.end method

.method public final getStrictNullChecks()Z
    .locals 1

    iget-boolean v0, p0, Lcom/fasterxml/jackson/module/kotlin/KotlinModule;->strictNullChecks:Z

    return v0
.end method

.method public setupModule(Lcom/fasterxml/jackson/databind/Module$SetupContext;)V
    .locals 8

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super {p0, p1}, Lcom/fasterxml/jackson/databind/module/SimpleModule;->setupModule(Lcom/fasterxml/jackson/databind/Module$SetupContext;)V

    sget-object v0, Lcom/fasterxml/jackson/databind/MapperFeature;->USE_ANNOTATIONS:Lcom/fasterxml/jackson/databind/MapperFeature;

    invoke-interface {p1, v0}, Lcom/fasterxml/jackson/databind/Module$SetupContext;->isEnabled(Lcom/fasterxml/jackson/databind/MapperFeature;)Z

    move-result v0

    if-eqz v0, :cond_1

    new-instance v0, Lcom/fasterxml/jackson/module/kotlin/ReflectionCache;

    iget v1, p0, Lcom/fasterxml/jackson/module/kotlin/KotlinModule;->reflectionCacheSize:I

    invoke-direct {v0, v1}, Lcom/fasterxml/jackson/module/kotlin/ReflectionCache;-><init>(I)V

    new-instance v7, Lcom/fasterxml/jackson/module/kotlin/KotlinInstantiators;

    iget-boolean v3, p0, Lcom/fasterxml/jackson/module/kotlin/KotlinModule;->nullToEmptyCollection:Z

    iget-boolean v4, p0, Lcom/fasterxml/jackson/module/kotlin/KotlinModule;->nullToEmptyMap:Z

    iget-boolean v5, p0, Lcom/fasterxml/jackson/module/kotlin/KotlinModule;->nullIsSameAsDefault:Z

    iget-boolean v6, p0, Lcom/fasterxml/jackson/module/kotlin/KotlinModule;->strictNullChecks:Z

    move-object v1, v7

    move-object v2, v0

    invoke-direct/range {v1 .. v6}, Lcom/fasterxml/jackson/module/kotlin/KotlinInstantiators;-><init>(Lcom/fasterxml/jackson/module/kotlin/ReflectionCache;ZZZZ)V

    invoke-interface {p1, v7}, Lcom/fasterxml/jackson/databind/Module$SetupContext;->addValueInstantiators(Lcom/fasterxml/jackson/databind/deser/ValueInstantiators;)V

    iget-object v1, p0, Lcom/fasterxml/jackson/module/kotlin/KotlinModule;->singletonSupport:Lcom/fasterxml/jackson/module/kotlin/SingletonSupport;

    sget-object v2, Lcom/fasterxml/jackson/module/kotlin/KotlinModule$WhenMappings;->$EnumSwitchMapping$0:[I

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v1, v2, v1

    const/4 v2, 0x2

    if-eq v1, v2, :cond_0

    goto :goto_0

    :cond_0
    sget-object v1, Lcom/fasterxml/jackson/module/kotlin/KotlinBeanDeserializerModifier;->INSTANCE:Lcom/fasterxml/jackson/module/kotlin/KotlinBeanDeserializerModifier;

    invoke-interface {p1, v1}, Lcom/fasterxml/jackson/databind/Module$SetupContext;->addBeanDeserializerModifier(Lcom/fasterxml/jackson/databind/deser/BeanDeserializerModifier;)V

    :goto_0
    new-instance v7, Lcom/fasterxml/jackson/module/kotlin/KotlinAnnotationIntrospector;

    iget-boolean v4, p0, Lcom/fasterxml/jackson/module/kotlin/KotlinModule;->nullToEmptyCollection:Z

    iget-boolean v5, p0, Lcom/fasterxml/jackson/module/kotlin/KotlinModule;->nullToEmptyMap:Z

    iget-boolean v6, p0, Lcom/fasterxml/jackson/module/kotlin/KotlinModule;->nullIsSameAsDefault:Z

    move-object v1, v7

    move-object v2, p1

    move-object v3, v0

    invoke-direct/range {v1 .. v6}, Lcom/fasterxml/jackson/module/kotlin/KotlinAnnotationIntrospector;-><init>(Lcom/fasterxml/jackson/databind/Module$SetupContext;Lcom/fasterxml/jackson/module/kotlin/ReflectionCache;ZZZ)V

    invoke-interface {p1, v7}, Lcom/fasterxml/jackson/databind/Module$SetupContext;->insertAnnotationIntrospector(Lcom/fasterxml/jackson/databind/AnnotationIntrospector;)V

    new-instance v1, Lcom/fasterxml/jackson/module/kotlin/KotlinNamesAnnotationIntrospector;

    iget-object v2, p0, Lcom/fasterxml/jackson/module/kotlin/KotlinModule;->ignoredClassesForImplyingJsonCreator:Ljava/util/Set;

    invoke-direct {v1, p0, v0, v2}, Lcom/fasterxml/jackson/module/kotlin/KotlinNamesAnnotationIntrospector;-><init>(Lcom/fasterxml/jackson/module/kotlin/KotlinModule;Lcom/fasterxml/jackson/module/kotlin/ReflectionCache;Ljava/util/Set;)V

    invoke-interface {p1, v1}, Lcom/fasterxml/jackson/databind/Module$SetupContext;->appendAnnotationIntrospector(Lcom/fasterxml/jackson/databind/AnnotationIntrospector;)V

    new-instance v0, Lcom/fasterxml/jackson/module/kotlin/KotlinDeserializers;

    invoke-direct {v0}, Lcom/fasterxml/jackson/module/kotlin/KotlinDeserializers;-><init>()V

    invoke-interface {p1, v0}, Lcom/fasterxml/jackson/databind/Module$SetupContext;->addDeserializers(Lcom/fasterxml/jackson/databind/deser/Deserializers;)V

    sget-object v0, Lcom/fasterxml/jackson/module/kotlin/KotlinKeyDeserializers;->INSTANCE:Lcom/fasterxml/jackson/module/kotlin/KotlinKeyDeserializers;

    invoke-interface {p1, v0}, Lcom/fasterxml/jackson/databind/Module$SetupContext;->addKeyDeserializers(Lcom/fasterxml/jackson/databind/deser/KeyDeserializers;)V

    new-instance v0, Lcom/fasterxml/jackson/module/kotlin/KotlinSerializers;

    invoke-direct {v0}, Lcom/fasterxml/jackson/module/kotlin/KotlinSerializers;-><init>()V

    invoke-interface {p1, v0}, Lcom/fasterxml/jackson/databind/Module$SetupContext;->addSerializers(Lcom/fasterxml/jackson/databind/ser/Serializers;)V

    new-instance v0, Lcom/fasterxml/jackson/module/kotlin/KotlinKeySerializers;

    invoke-direct {v0}, Lcom/fasterxml/jackson/module/kotlin/KotlinKeySerializers;-><init>()V

    invoke-interface {p1, v0}, Lcom/fasterxml/jackson/databind/Module$SetupContext;->addKeySerializers(Lcom/fasterxml/jackson/databind/ser/Serializers;)V

    const-class v0, Lkotlin/ranges/IntRange;

    const-class v1, Lcom/fasterxml/jackson/module/kotlin/ClosedRangeMixin;

    invoke-static {p1, v0, v1}, Lcom/fasterxml/jackson/module/kotlin/KotlinModule;->setupModule$addMixIn(Lcom/fasterxml/jackson/databind/Module$SetupContext;Ljava/lang/Class;Ljava/lang/Class;)V

    const-class v0, Lkotlin/ranges/CharRange;

    invoke-static {p1, v0, v1}, Lcom/fasterxml/jackson/module/kotlin/KotlinModule;->setupModule$addMixIn(Lcom/fasterxml/jackson/databind/Module$SetupContext;Ljava/lang/Class;Ljava/lang/Class;)V

    const-class v0, Lkotlin/ranges/LongRange;

    invoke-static {p1, v0, v1}, Lcom/fasterxml/jackson/module/kotlin/KotlinModule;->setupModule$addMixIn(Lcom/fasterxml/jackson/databind/Module$SetupContext;Ljava/lang/Class;Ljava/lang/Class;)V

    const-class v0, Lkotlin/ranges/ClosedRange;

    invoke-static {p1, v0, v1}, Lcom/fasterxml/jackson/module/kotlin/KotlinModule;->setupModule$addMixIn(Lcom/fasterxml/jackson/databind/Module$SetupContext;Ljava/lang/Class;Ljava/lang/Class;)V

    return-void

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "The Jackson Kotlin module requires USE_ANNOTATIONS to be true or it cannot function"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
