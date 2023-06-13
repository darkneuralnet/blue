.class public final Lcom/adyen/checkout/core/model/ModelUtils;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final SERIALIZER_FIELD_NAME:Ljava/lang/String; = "SERIALIZER"


# direct methods
.method private constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lcom/adyen/checkout/core/exception/NoConstructorException;

    invoke-direct {v0}, Lcom/adyen/checkout/core/exception/NoConstructorException;-><init>()V

    throw v0
.end method

.method public static deserializeModel(Lorg/json/JSONObject;Ljava/lang/Class;)Lcom/adyen/checkout/core/model/ModelObject;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Lcom/adyen/checkout/core/model/ModelObject;",
            ">(",
            "Lorg/json/JSONObject;",
            "Ljava/lang/Class<",
            "TT;>;)TT;"
        }
    .end annotation

    invoke-static {p1}, Lcom/adyen/checkout/core/model/ModelUtils;->readModelSerializer(Ljava/lang/Class;)Lcom/adyen/checkout/core/model/ModelObject$Serializer;

    move-result-object p1

    invoke-interface {p1, p0}, Lcom/adyen/checkout/core/model/ModelObject$Serializer;->deserialize(Lorg/json/JSONObject;)Lcom/adyen/checkout/core/model/ModelObject;

    move-result-object p0

    return-object p0
.end method

.method public static deserializeOpt(Lorg/json/JSONObject;Lcom/adyen/checkout/core/model/ModelObject$Serializer;)Lcom/adyen/checkout/core/model/ModelObject;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Lcom/adyen/checkout/core/model/ModelObject;",
            ">(",
            "Lorg/json/JSONObject;",
            "Lcom/adyen/checkout/core/model/ModelObject$Serializer<",
            "TT;>;)TT;"
        }
    .end annotation

    if-nez p0, :cond_0

    const/4 p0, 0x0

    goto :goto_0

    :cond_0
    invoke-interface {p1, p0}, Lcom/adyen/checkout/core/model/ModelObject$Serializer;->deserialize(Lorg/json/JSONObject;)Lcom/adyen/checkout/core/model/ModelObject;

    move-result-object p0

    :goto_0
    return-object p0
.end method

.method public static deserializeOptList(Lorg/json/JSONArray;Lcom/adyen/checkout/core/model/ModelObject$Serializer;)Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Lcom/adyen/checkout/core/model/ModelObject;",
            ">(",
            "Lorg/json/JSONArray;",
            "Lcom/adyen/checkout/core/model/ModelObject$Serializer<",
            "TT;>;)",
            "Ljava/util/List<",
            "TT;>;"
        }
    .end annotation

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    const/4 v1, 0x0

    :goto_0
    invoke-virtual {p0}, Lorg/json/JSONArray;->length()I

    move-result v2

    if-ge v1, v2, :cond_2

    invoke-virtual {p0, v1}, Lorg/json/JSONArray;->optJSONObject(I)Lorg/json/JSONObject;

    move-result-object v2

    if-eqz v2, :cond_1

    invoke-interface {p1, v2}, Lcom/adyen/checkout/core/model/ModelObject$Serializer;->deserialize(Lorg/json/JSONObject;)Lcom/adyen/checkout/core/model/ModelObject;

    move-result-object v2

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_2
    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method private static readModelSerializer(Ljava/lang/Class;)Lcom/adyen/checkout/core/model/ModelObject$Serializer;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;)",
            "Lcom/adyen/checkout/core/model/ModelObject$Serializer<",
            "*>;"
        }
    .end annotation

    :try_start_0
    const-string v0, "SERIALIZER"

    invoke-virtual {p0, v0}, Ljava/lang/Class;->getField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/reflect/Field;->getModifiers()I

    move-result v1

    and-int/lit8 v1, v1, 0x8

    const/4 v2, 0x0

    if-eqz v1, :cond_1

    const-class v1, Lcom/adyen/checkout/core/model/ModelObject$Serializer;

    invoke-virtual {v0}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {v0, v2}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/adyen/checkout/core/model/ModelObject$Serializer;

    return-object v0

    :cond_0
    new-instance v0, Lcom/adyen/checkout/core/exception/BadModelException;

    invoke-direct {v0, p0, v2}, Lcom/adyen/checkout/core/exception/BadModelException;-><init>(Ljava/lang/Class;Ljava/lang/Throwable;)V

    throw v0

    :cond_1
    new-instance v0, Lcom/adyen/checkout/core/exception/BadModelException;

    invoke-direct {v0, p0, v2}, Lcom/adyen/checkout/core/exception/BadModelException;-><init>(Ljava/lang/Class;Ljava/lang/Throwable;)V

    throw v0
    :try_end_0
    .catch Ljava/lang/NoSuchFieldException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    move-exception v0

    goto :goto_0

    :catch_1
    move-exception v0

    :goto_0
    new-instance v1, Lcom/adyen/checkout/core/exception/BadModelException;

    invoke-direct {v1, p0, v0}, Lcom/adyen/checkout/core/exception/BadModelException;-><init>(Ljava/lang/Class;Ljava/lang/Throwable;)V

    throw v1
.end method

.method public static serializeOpt(Lcom/adyen/checkout/core/model/ModelObject;Lcom/adyen/checkout/core/model/ModelObject$Serializer;)Lorg/json/JSONObject;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Lcom/adyen/checkout/core/model/ModelObject;",
            ">(TT;",
            "Lcom/adyen/checkout/core/model/ModelObject$Serializer<",
            "TT;>;)",
            "Lorg/json/JSONObject;"
        }
    .end annotation

    if-nez p0, :cond_0

    const/4 p0, 0x0

    goto :goto_0

    :cond_0
    invoke-interface {p1, p0}, Lcom/adyen/checkout/core/model/ModelObject$Serializer;->serialize(Lcom/adyen/checkout/core/model/ModelObject;)Lorg/json/JSONObject;

    move-result-object p0

    :goto_0
    return-object p0
.end method

.method public static serializeOptList(Ljava/util/List;Lcom/adyen/checkout/core/model/ModelObject$Serializer;)Lorg/json/JSONArray;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Lcom/adyen/checkout/core/model/ModelObject;",
            ">(",
            "Ljava/util/List<",
            "TT;>;",
            "Lcom/adyen/checkout/core/model/ModelObject$Serializer<",
            "TT;>;)",
            "Lorg/json/JSONArray;"
        }
    .end annotation

    if-eqz p0, :cond_2

    invoke-interface {p0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_1

    :cond_0
    new-instance v0, Lorg/json/JSONArray;

    invoke-direct {v0}, Lorg/json/JSONArray;-><init>()V

    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/adyen/checkout/core/model/ModelObject;

    invoke-interface {p1, v1}, Lcom/adyen/checkout/core/model/ModelObject$Serializer;->serialize(Lcom/adyen/checkout/core/model/ModelObject;)Lorg/json/JSONObject;

    move-result-object v1

    invoke-virtual {v0, v1}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    goto :goto_0

    :cond_1
    return-object v0

    :cond_2
    :goto_1
    const/4 p0, 0x0

    return-object p0
.end method
