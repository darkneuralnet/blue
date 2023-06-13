.class public final Lcom/fasterxml/jackson/module/kotlin/KotlinValueInstantiator;
.super Lcom/fasterxml/jackson/databind/deser/std/StdValueInstantiator;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\u0008\u0000\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\u0008\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\nJ/\u0010\u000b\u001a\u0004\u0018\u00010\u000c2\u0006\u0010\r\u001a\u00020\u000e2\u000e\u0010\u000f\u001a\n\u0012\u0006\u0008\u0001\u0012\u00020\u00110\u00102\u0006\u0010\u0012\u001a\u00020\u0013H\u0016\u00a2\u0006\u0002\u0010\u0014J\u000c\u0010\u0015\u001a\u00020\u0006*\u00020\u0011H\u0002J\u000c\u0010\u0016\u001a\u00020\u0006*\u00020\u0017H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0008\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0018"
    }
    d2 = {
        "Lcom/fasterxml/jackson/module/kotlin/KotlinValueInstantiator;",
        "Lcom/fasterxml/jackson/databind/deser/std/StdValueInstantiator;",
        "src",
        "cache",
        "Lcom/fasterxml/jackson/module/kotlin/ReflectionCache;",
        "nullToEmptyCollection",
        "",
        "nullToEmptyMap",
        "nullIsSameAsDefault",
        "strictNullChecks",
        "(Lcom/fasterxml/jackson/databind/deser/std/StdValueInstantiator;Lcom/fasterxml/jackson/module/kotlin/ReflectionCache;ZZZZ)V",
        "createFromObjectWith",
        "",
        "ctxt",
        "Lcom/fasterxml/jackson/databind/DeserializationContext;",
        "props",
        "",
        "Lcom/fasterxml/jackson/databind/deser/SettableBeanProperty;",
        "buffer",
        "Lcom/fasterxml/jackson/databind/deser/impl/PropertyValueBuffer;",
        "(Lcom/fasterxml/jackson/databind/DeserializationContext;[Lcom/fasterxml/jackson/databind/deser/SettableBeanProperty;Lcom/fasterxml/jackson/databind/deser/impl/PropertyValueBuffer;)Ljava/lang/Object;",
        "hasInjectableValueId",
        "isPrimitive",
        "Lkotlin/reflect/KParameter;",
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


# instance fields
.field private final cache:Lcom/fasterxml/jackson/module/kotlin/ReflectionCache;

.field private final nullIsSameAsDefault:Z

.field private final nullToEmptyCollection:Z

.field private final nullToEmptyMap:Z

.field private final strictNullChecks:Z


# direct methods
.method public constructor <init>(Lcom/fasterxml/jackson/databind/deser/std/StdValueInstantiator;Lcom/fasterxml/jackson/module/kotlin/ReflectionCache;ZZZZ)V
    .locals 1

    const-string v0, "src"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "cache"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Lcom/fasterxml/jackson/databind/deser/std/StdValueInstantiator;-><init>(Lcom/fasterxml/jackson/databind/deser/std/StdValueInstantiator;)V

    iput-object p2, p0, Lcom/fasterxml/jackson/module/kotlin/KotlinValueInstantiator;->cache:Lcom/fasterxml/jackson/module/kotlin/ReflectionCache;

    iput-boolean p3, p0, Lcom/fasterxml/jackson/module/kotlin/KotlinValueInstantiator;->nullToEmptyCollection:Z

    iput-boolean p4, p0, Lcom/fasterxml/jackson/module/kotlin/KotlinValueInstantiator;->nullToEmptyMap:Z

    iput-boolean p5, p0, Lcom/fasterxml/jackson/module/kotlin/KotlinValueInstantiator;->nullIsSameAsDefault:Z

    iput-boolean p6, p0, Lcom/fasterxml/jackson/module/kotlin/KotlinValueInstantiator;->strictNullChecks:Z

    return-void
.end method

.method private final hasInjectableValueId(Lcom/fasterxml/jackson/databind/deser/SettableBeanProperty;)Z
    .locals 0

    invoke-virtual {p1}, Lcom/fasterxml/jackson/databind/deser/SettableBeanProperty;->getInjectableValueId()Ljava/lang/Object;

    move-result-object p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method private final isPrimitive(Lkotlin/reflect/KParameter;)Z
    .locals 1

    invoke-interface {p1}, Lkotlin/reflect/KParameter;->getType()Lkotlin/reflect/KType;

    move-result-object p1

    invoke-static {p1}, Lkotlin/reflect/jvm/ReflectJvmMapping;->getJavaType(Lkotlin/reflect/KType;)Ljava/lang/reflect/Type;

    move-result-object p1

    instance-of v0, p1, Ljava/lang/Class;

    if-eqz v0, :cond_0

    check-cast p1, Ljava/lang/Class;

    invoke-virtual {p1}, Ljava/lang/Class;->isPrimitive()Z

    move-result p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method


# virtual methods
.method public createFromObjectWith(Lcom/fasterxml/jackson/databind/DeserializationContext;[Lcom/fasterxml/jackson/databind/deser/SettableBeanProperty;Lcom/fasterxml/jackson/databind/deser/impl/PropertyValueBuffer;)Ljava/lang/Object;
    .locals 20

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move-object/from16 v3, p3

    const-string v4, "ctxt"

    invoke-static {v1, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v4, "props"

    invoke-static {v2, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v4, "buffer"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v4, v0, Lcom/fasterxml/jackson/module/kotlin/KotlinValueInstantiator;->cache:Lcom/fasterxml/jackson/module/kotlin/ReflectionCache;

    iget-object v5, v0, Lcom/fasterxml/jackson/databind/deser/std/StdValueInstantiator;->_withArgsCreator:Lcom/fasterxml/jackson/databind/introspect/AnnotatedWithParams;

    const-string v6, "_withArgsCreator"

    invoke-static {v5, v6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v4, v5}, Lcom/fasterxml/jackson/module/kotlin/ReflectionCache;->valueCreatorFromJava(Lcom/fasterxml/jackson/databind/introspect/AnnotatedWithParams;)Lcom/fasterxml/jackson/module/kotlin/ValueCreator;

    move-result-object v4

    if-nez v4, :cond_0

    invoke-super/range {p0 .. p3}, Lcom/fasterxml/jackson/databind/deser/ValueInstantiator;->createFromObjectWith(Lcom/fasterxml/jackson/databind/DeserializationContext;[Lcom/fasterxml/jackson/databind/deser/SettableBeanProperty;Lcom/fasterxml/jackson/databind/deser/impl/PropertyValueBuffer;)Ljava/lang/Object;

    move-result-object v1

    return-object v1

    :cond_0
    instance-of v5, v4, Lcom/fasterxml/jackson/module/kotlin/MethodValueCreator;

    const/4 v6, 0x1

    const/4 v7, 0x0

    if-eqz v5, :cond_1

    array-length v5, v2

    add-int/2addr v5, v6

    new-array v8, v5, [Lkotlin/reflect/KParameter;

    move-object v9, v4

    check-cast v9, Lcom/fasterxml/jackson/module/kotlin/MethodValueCreator;

    invoke-virtual {v9}, Lcom/fasterxml/jackson/module/kotlin/MethodValueCreator;->getInstanceParameter()Lkotlin/reflect/KParameter;

    move-result-object v10

    aput-object v10, v8, v7

    new-array v5, v5, [Ljava/lang/Object;

    invoke-virtual {v9}, Lcom/fasterxml/jackson/module/kotlin/MethodValueCreator;->getCompanionObjectInstance()Ljava/lang/Object;

    move-result-object v9

    aput-object v9, v5, v7

    move v9, v6

    goto :goto_0

    :cond_1
    array-length v5, v2

    new-array v8, v5, [Lkotlin/reflect/KParameter;

    new-array v5, v5, [Ljava/lang/Object;

    move v9, v7

    :goto_0
    invoke-virtual {v4}, Lcom/fasterxml/jackson/module/kotlin/ValueCreator;->getValueParameters()Ljava/util/List;

    move-result-object v10

    check-cast v10, Ljava/lang/Iterable;

    invoke-interface {v10}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v10

    move v11, v7

    :goto_1
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    move-result v12

    if-eqz v12, :cond_2b

    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v12

    add-int/lit8 v13, v11, 0x1

    if-gez v11, :cond_2

    invoke-static {}, Lkotlin/collections/CollectionsKt;->throwIndexOverflow()V

    :cond_2
    check-cast v12, Lkotlin/reflect/KParameter;

    aget-object v11, v2, v11

    invoke-virtual {v3, v11}, Lcom/fasterxml/jackson/databind/deser/impl/PropertyValueBuffer;->hasParameter(Lcom/fasterxml/jackson/databind/deser/SettableBeanProperty;)Z

    move-result v14

    xor-int/2addr v14, v6

    if-eqz v14, :cond_3

    invoke-interface {v12}, Lkotlin/reflect/KParameter;->isOptional()Z

    move-result v15

    if-eqz v15, :cond_3

    goto :goto_4

    :cond_3
    if-eqz v14, :cond_7

    invoke-direct {v0, v12}, Lcom/fasterxml/jackson/module/kotlin/KotlinValueInstantiator;->isPrimitive(Lkotlin/reflect/KParameter;)Z

    move-result v16

    if-nez v16, :cond_7

    invoke-direct {v0, v11}, Lcom/fasterxml/jackson/module/kotlin/KotlinValueInstantiator;->hasInjectableValueId(Lcom/fasterxml/jackson/databind/deser/SettableBeanProperty;)Z

    move-result v16

    if-eqz v16, :cond_4

    goto :goto_3

    :cond_4
    invoke-interface {v12}, Lkotlin/reflect/KParameter;->getType()Lkotlin/reflect/KType;

    move-result-object v16

    invoke-interface/range {v16 .. v16}, Lkotlin/reflect/KType;->isMarkedNullable()Z

    move-result v16

    if-eqz v16, :cond_5

    :goto_2
    const/4 v15, 0x0

    goto :goto_6

    :cond_5
    invoke-virtual {v11}, Lcom/fasterxml/jackson/databind/deser/SettableBeanProperty;->getValueDeserializer()Lcom/fasterxml/jackson/databind/JsonDeserializer;

    move-result-object v15

    if-nez v15, :cond_6

    goto :goto_2

    :cond_6
    invoke-virtual {v15, v1}, Lcom/fasterxml/jackson/databind/JsonDeserializer;->getAbsentValue(Lcom/fasterxml/jackson/databind/DeserializationContext;)Ljava/lang/Object;

    move-result-object v15

    goto :goto_6

    :cond_7
    :goto_3
    invoke-virtual {v3, v11}, Lcom/fasterxml/jackson/databind/deser/impl/PropertyValueBuffer;->getParameter(Lcom/fasterxml/jackson/databind/deser/SettableBeanProperty;)Ljava/lang/Object;

    move-result-object v15

    iget-boolean v6, v0, Lcom/fasterxml/jackson/module/kotlin/KotlinValueInstantiator;->nullIsSameAsDefault:Z

    if-eqz v6, :cond_8

    if-nez v15, :cond_8

    invoke-interface {v12}, Lkotlin/reflect/KParameter;->isOptional()Z

    move-result v6

    if-eqz v6, :cond_8

    :goto_4
    move v11, v13

    :goto_5
    const/4 v6, 0x1

    goto :goto_1

    :cond_8
    :goto_6
    if-nez v15, :cond_b

    iget-boolean v6, v0, Lcom/fasterxml/jackson/module/kotlin/KotlinValueInstantiator;->nullToEmptyCollection:Z

    if-eqz v6, :cond_9

    invoke-virtual {v11}, Lcom/fasterxml/jackson/databind/deser/SettableBeanProperty;->getType()Lcom/fasterxml/jackson/databind/JavaType;

    move-result-object v6

    invoke-virtual {v6}, Lcom/fasterxml/jackson/databind/JavaType;->isCollectionLikeType()Z

    move-result v6

    if-nez v6, :cond_a

    :cond_9
    iget-boolean v6, v0, Lcom/fasterxml/jackson/module/kotlin/KotlinValueInstantiator;->nullToEmptyMap:Z

    if-eqz v6, :cond_b

    invoke-virtual {v11}, Lcom/fasterxml/jackson/databind/deser/SettableBeanProperty;->getType()Lcom/fasterxml/jackson/databind/JavaType;

    move-result-object v6

    invoke-virtual {v6}, Lcom/fasterxml/jackson/databind/JavaType;->isMapLikeType()Z

    move-result v6

    if-eqz v6, :cond_b

    :cond_a
    new-instance v6, Lcom/fasterxml/jackson/databind/deser/impl/NullsAsEmptyProvider;

    invoke-virtual {v11}, Lcom/fasterxml/jackson/databind/deser/SettableBeanProperty;->getValueDeserializer()Lcom/fasterxml/jackson/databind/JsonDeserializer;

    move-result-object v15

    invoke-direct {v6, v15}, Lcom/fasterxml/jackson/databind/deser/impl/NullsAsEmptyProvider;-><init>(Lcom/fasterxml/jackson/databind/JsonDeserializer;)V

    invoke-virtual {v6, v1}, Lcom/fasterxml/jackson/databind/deser/impl/NullsAsEmptyProvider;->getNullValue(Lcom/fasterxml/jackson/databind/DeserializationContext;)Ljava/lang/Object;

    move-result-object v15

    :cond_b
    invoke-interface {v12}, Lkotlin/reflect/KParameter;->getType()Lkotlin/reflect/KType;

    move-result-object v6

    invoke-static {v6}, Lkotlin/reflect/jvm/ReflectJvmMapping;->getJavaType(Lkotlin/reflect/KType;)Ljava/lang/reflect/Type;

    move-result-object v6

    instance-of v6, v6, Ljava/lang/reflect/TypeVariable;

    if-nez v15, :cond_c

    if-eqz v14, :cond_c

    invoke-virtual {v11}, Lcom/fasterxml/jackson/databind/introspect/ConcreteBeanPropertyBase;->isRequired()Z

    move-result v14

    if-eqz v14, :cond_c

    const/4 v14, 0x1

    goto :goto_7

    :cond_c
    move v14, v7

    :goto_7
    const-string v7, "MissingKotlinParameterEx\u2026alueClass, jsonProp.name)"

    const-string v2, "jsonProp.name"

    const-string v3, "Instantiation of "

    if-nez v14, :cond_2a

    if-nez v6, :cond_d

    if-nez v15, :cond_d

    invoke-interface {v12}, Lkotlin/reflect/KParameter;->getType()Lkotlin/reflect/KType;

    move-result-object v6

    invoke-interface {v6}, Lkotlin/reflect/KType;->isMarkedNullable()Z

    move-result v6

    if-eqz v6, :cond_2a

    :cond_d
    iget-boolean v6, v0, Lcom/fasterxml/jackson/module/kotlin/KotlinValueInstantiator;->strictNullChecks:Z

    if-eqz v6, :cond_28

    if-eqz v15, :cond_28

    invoke-virtual {v11}, Lcom/fasterxml/jackson/databind/deser/SettableBeanProperty;->getType()Lcom/fasterxml/jackson/databind/JavaType;

    move-result-object v6

    invoke-virtual {v6}, Lcom/fasterxml/jackson/databind/JavaType;->isCollectionLikeType()Z

    move-result v6

    if-eqz v6, :cond_15

    invoke-interface {v12}, Lkotlin/reflect/KParameter;->getType()Lkotlin/reflect/KType;

    move-result-object v6

    invoke-interface {v6}, Lkotlin/reflect/KType;->getArguments()Ljava/util/List;

    move-result-object v6

    const/4 v14, 0x0

    invoke-static {v6, v14}, Lkotlin/collections/CollectionsKt;->getOrNull(Ljava/util/List;I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lkotlin/reflect/KTypeProjection;

    if-nez v6, :cond_f

    :cond_e
    :goto_8
    const/4 v6, 0x0

    goto :goto_9

    :cond_f
    invoke-virtual {v6}, Lkotlin/reflect/KTypeProjection;->getType()Lkotlin/reflect/KType;

    move-result-object v6

    if-nez v6, :cond_10

    goto :goto_8

    :cond_10
    invoke-interface {v6}, Lkotlin/reflect/KType;->isMarkedNullable()Z

    move-result v6

    if-nez v6, :cond_e

    const/4 v6, 0x1

    :goto_9
    if-eqz v6, :cond_15

    move-object v6, v15

    check-cast v6, Ljava/util/Collection;

    check-cast v6, Ljava/lang/Iterable;

    instance-of v14, v6, Ljava/util/Collection;

    if-eqz v14, :cond_12

    move-object v14, v6

    check-cast v14, Ljava/util/Collection;

    invoke-interface {v14}, Ljava/util/Collection;->isEmpty()Z

    move-result v14

    if-eqz v14, :cond_12

    :cond_11
    const/4 v6, 0x0

    goto :goto_b

    :cond_12
    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :cond_13
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v14

    if-eqz v14, :cond_11

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v14

    if-nez v14, :cond_14

    const/4 v14, 0x1

    goto :goto_a

    :cond_14
    const/4 v14, 0x0

    :goto_a
    if-eqz v14, :cond_13

    const/4 v6, 0x1

    :goto_b
    if-eqz v6, :cond_15

    invoke-interface {v12}, Lkotlin/reflect/KParameter;->getType()Lkotlin/reflect/KType;

    move-result-object v6

    invoke-interface {v6}, Lkotlin/reflect/KType;->getArguments()Ljava/util/List;

    move-result-object v6

    const/4 v14, 0x0

    invoke-interface {v6, v14}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lkotlin/reflect/KTypeProjection;

    invoke-virtual {v6}, Lkotlin/reflect/KTypeProjection;->getType()Lkotlin/reflect/KType;

    move-result-object v6

    const-string v14, "collection"

    move-object/from16 v16, v6

    goto :goto_c

    :cond_15
    const/4 v14, 0x0

    const/16 v16, 0x0

    :goto_c
    invoke-virtual {v11}, Lcom/fasterxml/jackson/databind/deser/SettableBeanProperty;->getType()Lcom/fasterxml/jackson/databind/JavaType;

    move-result-object v6

    invoke-virtual {v6}, Lcom/fasterxml/jackson/databind/JavaType;->isMapLikeType()Z

    move-result v6

    if-eqz v6, :cond_1d

    invoke-interface {v12}, Lkotlin/reflect/KParameter;->getType()Lkotlin/reflect/KType;

    move-result-object v6

    invoke-interface {v6}, Lkotlin/reflect/KType;->getArguments()Ljava/util/List;

    move-result-object v6

    move-object/from16 v17, v10

    const/4 v10, 0x1

    invoke-static {v6, v10}, Lkotlin/collections/CollectionsKt;->getOrNull(Ljava/util/List;I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lkotlin/reflect/KTypeProjection;

    if-nez v6, :cond_17

    :cond_16
    :goto_d
    const/4 v6, 0x0

    goto :goto_e

    :cond_17
    invoke-virtual {v6}, Lkotlin/reflect/KTypeProjection;->getType()Lkotlin/reflect/KType;

    move-result-object v6

    if-nez v6, :cond_18

    goto :goto_d

    :cond_18
    invoke-interface {v6}, Lkotlin/reflect/KType;->isMarkedNullable()Z

    move-result v6

    if-nez v6, :cond_16

    const/4 v6, 0x1

    :goto_e
    if-eqz v6, :cond_1e

    move-object v6, v15

    check-cast v6, Ljava/util/Map;

    invoke-interface {v6}, Ljava/util/Map;->isEmpty()Z

    move-result v10

    if-eqz v10, :cond_1a

    :cond_19
    const/4 v6, 0x0

    goto :goto_10

    :cond_1a
    invoke-interface {v6}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v6

    invoke-interface {v6}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :cond_1b
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v10

    if-eqz v10, :cond_19

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ljava/util/Map$Entry;

    invoke-interface {v10}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v10

    if-nez v10, :cond_1c

    const/4 v10, 0x1

    goto :goto_f

    :cond_1c
    const/4 v10, 0x0

    :goto_f
    if-eqz v10, :cond_1b

    const/4 v6, 0x1

    :goto_10
    if-eqz v6, :cond_1e

    invoke-interface {v12}, Lkotlin/reflect/KParameter;->getType()Lkotlin/reflect/KType;

    move-result-object v6

    invoke-interface {v6}, Lkotlin/reflect/KType;->getArguments()Ljava/util/List;

    move-result-object v6

    const/4 v10, 0x1

    invoke-interface {v6, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lkotlin/reflect/KTypeProjection;

    invoke-virtual {v6}, Lkotlin/reflect/KTypeProjection;->getType()Lkotlin/reflect/KType;

    move-result-object v16

    const-string v14, "map"

    goto :goto_11

    :cond_1d
    move-object/from16 v17, v10

    :cond_1e
    const/4 v10, 0x1

    :goto_11
    invoke-virtual {v11}, Lcom/fasterxml/jackson/databind/deser/SettableBeanProperty;->getType()Lcom/fasterxml/jackson/databind/JavaType;

    move-result-object v6

    invoke-virtual {v6}, Lcom/fasterxml/jackson/databind/JavaType;->isArrayType()Z

    move-result v6

    if-eqz v6, :cond_25

    invoke-interface {v12}, Lkotlin/reflect/KParameter;->getType()Lkotlin/reflect/KType;

    move-result-object v6

    invoke-interface {v6}, Lkotlin/reflect/KType;->getArguments()Ljava/util/List;

    move-result-object v6

    const/4 v10, 0x0

    invoke-static {v6, v10}, Lkotlin/collections/CollectionsKt;->getOrNull(Ljava/util/List;I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lkotlin/reflect/KTypeProjection;

    if-nez v6, :cond_20

    :cond_1f
    :goto_12
    const/4 v6, 0x0

    goto :goto_13

    :cond_20
    invoke-virtual {v6}, Lkotlin/reflect/KTypeProjection;->getType()Lkotlin/reflect/KType;

    move-result-object v6

    if-nez v6, :cond_21

    goto :goto_12

    :cond_21
    invoke-interface {v6}, Lkotlin/reflect/KType;->isMarkedNullable()Z

    move-result v6

    if-nez v6, :cond_1f

    const/4 v6, 0x1

    :goto_13
    if-eqz v6, :cond_25

    move-object v6, v15

    check-cast v6, [Ljava/lang/Object;

    array-length v10, v6

    move/from16 v18, v13

    const/4 v13, 0x0

    :goto_14
    if-ge v13, v10, :cond_24

    aget-object v19, v6, v13

    if-nez v19, :cond_22

    const/16 v19, 0x1

    goto :goto_15

    :cond_22
    const/16 v19, 0x0

    :goto_15
    if-eqz v19, :cond_23

    const/4 v6, 0x1

    goto :goto_16

    :cond_23
    add-int/lit8 v13, v13, 0x1

    goto :goto_14

    :cond_24
    const/4 v6, 0x0

    :goto_16
    if-eqz v6, :cond_26

    invoke-interface {v12}, Lkotlin/reflect/KParameter;->getType()Lkotlin/reflect/KType;

    move-result-object v6

    invoke-interface {v6}, Lkotlin/reflect/KType;->getArguments()Ljava/util/List;

    move-result-object v6

    const/4 v10, 0x0

    invoke-interface {v6, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lkotlin/reflect/KTypeProjection;

    invoke-virtual {v6}, Lkotlin/reflect/KTypeProjection;->getType()Lkotlin/reflect/KType;

    move-result-object v16

    const-string v14, "array"

    goto :goto_17

    :cond_25
    move/from16 v18, v13

    :cond_26
    const/4 v10, 0x0

    :goto_17
    move-object/from16 v6, v16

    if-eqz v14, :cond_29

    if-nez v6, :cond_27

    goto :goto_18

    :cond_27
    new-instance v4, Lcom/fasterxml/jackson/module/kotlin/MissingKotlinParameterException;

    invoke-virtual/range {p1 .. p1}, Lcom/fasterxml/jackson/databind/DeserializationContext;->getParser()Lcom/fasterxml/jackson/core/JsonParser;

    move-result-object v1

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v3, 0x20

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v3, " failed for JSON property "

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11}, Lcom/fasterxml/jackson/databind/deser/SettableBeanProperty;->getName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v3, " due to null value in a "

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v3, " that does not allow null values"

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v4, v12, v1, v3}, Lcom/fasterxml/jackson/module/kotlin/MissingKotlinParameterException;-><init>(Lkotlin/reflect/KParameter;Lcom/fasterxml/jackson/core/JsonParser;Ljava/lang/String;)V

    invoke-virtual/range {p0 .. p0}, Lcom/fasterxml/jackson/databind/deser/std/StdValueInstantiator;->getValueClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v11}, Lcom/fasterxml/jackson/databind/deser/SettableBeanProperty;->getName()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v4, v1, v3}, Lcom/fasterxml/jackson/module/kotlin/ExtensionsKt;->wrapWithPath(Lcom/fasterxml/jackson/databind/JsonMappingException;Ljava/lang/Object;Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonMappingException;

    move-result-object v1

    invoke-static {v1, v7}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    throw v1

    :cond_28
    move-object/from16 v17, v10

    move/from16 v18, v13

    const/4 v10, 0x0

    :cond_29
    :goto_18
    aput-object v15, v5, v9

    aput-object v12, v8, v9

    add-int/lit8 v9, v9, 0x1

    move-object/from16 v2, p2

    move-object/from16 v3, p3

    move v7, v10

    move-object/from16 v10, v17

    move/from16 v11, v18

    goto/16 :goto_5

    :cond_2a
    new-instance v4, Lcom/fasterxml/jackson/module/kotlin/MissingKotlinParameterException;

    invoke-virtual/range {p1 .. p1}, Lcom/fasterxml/jackson/databind/DeserializationContext;->getParser()Lcom/fasterxml/jackson/core/JsonParser;

    move-result-object v1

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual/range {p0 .. p0}, Lcom/fasterxml/jackson/databind/deser/std/StdValueInstantiator;->getValueTypeDesc()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v3, " value failed for JSON property "

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11}, Lcom/fasterxml/jackson/databind/deser/SettableBeanProperty;->getName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v3, " due to missing (therefore NULL) value for creator parameter "

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-interface {v12}, Lkotlin/reflect/KParameter;->getName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v3, " which is a non-nullable type"

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v4, v12, v1, v3}, Lcom/fasterxml/jackson/module/kotlin/MissingKotlinParameterException;-><init>(Lkotlin/reflect/KParameter;Lcom/fasterxml/jackson/core/JsonParser;Ljava/lang/String;)V

    invoke-virtual/range {p0 .. p0}, Lcom/fasterxml/jackson/databind/deser/std/StdValueInstantiator;->getValueClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v11}, Lcom/fasterxml/jackson/databind/deser/SettableBeanProperty;->getName()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v4, v1, v3}, Lcom/fasterxml/jackson/module/kotlin/ExtensionsKt;->wrapWithPath(Lcom/fasterxml/jackson/databind/JsonMappingException;Ljava/lang/Object;Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonMappingException;

    move-result-object v1

    invoke-static {v1, v7}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    throw v1

    :cond_2b
    move v10, v7

    array-length v2, v5

    if-ne v9, v2, :cond_2c

    instance-of v2, v4, Lcom/fasterxml/jackson/module/kotlin/ConstructorValueCreator;

    if-eqz v2, :cond_2c

    invoke-super {v0, v1, v5}, Lcom/fasterxml/jackson/databind/deser/std/StdValueInstantiator;->createFromObjectWith(Lcom/fasterxml/jackson/databind/DeserializationContext;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    goto :goto_1a

    :cond_2c
    invoke-virtual {v4, v1}, Lcom/fasterxml/jackson/module/kotlin/ValueCreator;->checkAccessibility(Lcom/fasterxml/jackson/databind/DeserializationContext;)V

    new-instance v1, Ljava/util/LinkedHashMap;

    invoke-direct {v1}, Ljava/util/LinkedHashMap;-><init>()V

    new-instance v2, Ljava/util/ArrayList;

    array-length v3, v8

    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    array-length v3, v8

    move v7, v10

    :goto_19
    if-ge v7, v3, :cond_2e

    aget-object v6, v8, v7

    add-int/lit8 v9, v10, 0x1

    if-eqz v6, :cond_2d

    aget-object v10, v5, v10

    invoke-interface {v1, v6, v10}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_2d
    sget-object v6, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-interface {v2, v6}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    add-int/lit8 v7, v7, 0x1

    move v10, v9

    goto :goto_19

    :cond_2e
    invoke-virtual {v4, v1}, Lcom/fasterxml/jackson/module/kotlin/ValueCreator;->callBy(Ljava/util/Map;)Ljava/lang/Object;

    move-result-object v1

    :goto_1a
    return-object v1
.end method
