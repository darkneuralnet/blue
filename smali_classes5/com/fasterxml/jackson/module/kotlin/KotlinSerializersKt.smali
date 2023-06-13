.class public final Lcom/fasterxml/jackson/module/kotlin/KotlinSerializersKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u0012\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u0006\u0012\u0002\u0008\u00030\u0002H\u0002\u00a8\u0006\u0003"
    }
    d2 = {
        "getStaticJsonValueGetter",
        "Ljava/lang/reflect/Method;",
        "Ljava/lang/Class;",
        "jackson-module-kotlin"
    }
    k = 0x2
    mv = {
        0x1,
        0x5,
        0x1
    }
    xi = 0x30
.end annotation


# direct methods
.method public static final synthetic access$getStaticJsonValueGetter(Ljava/lang/Class;)Ljava/lang/reflect/Method;
    .locals 0

    invoke-static {p0}, Lcom/fasterxml/jackson/module/kotlin/KotlinSerializersKt;->getStaticJsonValueGetter(Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object p0

    return-object p0
.end method

.method private static final getStaticJsonValueGetter(Ljava/lang/Class;)Ljava/lang/reflect/Method;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;)",
            "Ljava/lang/reflect/Method;"
        }
    .end annotation

    invoke-virtual {p0}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    move-result-object p0

    const-string v0, "this.declaredMethods"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    array-length v0, p0

    const/4 v1, 0x0

    move v2, v1

    :goto_0
    if-ge v2, v0, :cond_4

    aget-object v3, p0, v2

    invoke-virtual {v3}, Ljava/lang/reflect/Method;->getModifiers()I

    move-result v4

    invoke-static {v4}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    move-result v4

    if-eqz v4, :cond_2

    invoke-virtual {v3}, Ljava/lang/reflect/AccessibleObject;->getAnnotations()[Ljava/lang/annotation/Annotation;

    move-result-object v4

    const-string v5, "method.annotations"

    invoke-static {v4, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    array-length v5, v4

    move v6, v1

    :goto_1
    const/4 v7, 0x1

    if-ge v6, v5, :cond_1

    aget-object v8, v4, v6

    instance-of v8, v8, Lcom/fasterxml/jackson/annotation/JsonValue;

    if-eqz v8, :cond_0

    move v4, v7

    goto :goto_2

    :cond_0
    add-int/lit8 v6, v6, 0x1

    goto :goto_1

    :cond_1
    move v4, v1

    :goto_2
    if-eqz v4, :cond_2

    goto :goto_3

    :cond_2
    move v7, v1

    :goto_3
    if-eqz v7, :cond_3

    goto :goto_4

    :cond_3
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_4
    const/4 v3, 0x0

    :goto_4
    return-object v3
.end method
