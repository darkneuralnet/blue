.class public final Lcom/fasterxml/jackson/module/kotlin/KotlinSerializers;
.super Lcom/fasterxml/jackson/databind/ser/Serializers$Base;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0008\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J*\u0010\u0003\u001a\u0008\u0012\u0002\u0008\u0003\u0018\u00010\u00042\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\u00082\u0008\u0010\t\u001a\u0004\u0018\u00010\nH\u0016\u00a8\u0006\u000b"
    }
    d2 = {
        "Lcom/fasterxml/jackson/module/kotlin/KotlinSerializers;",
        "Lcom/fasterxml/jackson/databind/ser/Serializers$Base;",
        "()V",
        "findSerializer",
        "Lcom/fasterxml/jackson/databind/JsonSerializer;",
        "config",
        "Lcom/fasterxml/jackson/databind/SerializationConfig;",
        "type",
        "Lcom/fasterxml/jackson/databind/JavaType;",
        "beanDesc",
        "Lcom/fasterxml/jackson/databind/BeanDescription;",
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


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/fasterxml/jackson/databind/ser/Serializers$Base;-><init>()V

    return-void
.end method


# virtual methods
.method public findSerializer(Lcom/fasterxml/jackson/databind/SerializationConfig;Lcom/fasterxml/jackson/databind/JavaType;Lcom/fasterxml/jackson/databind/BeanDescription;)Lcom/fasterxml/jackson/databind/JsonSerializer;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/fasterxml/jackson/databind/SerializationConfig;",
            "Lcom/fasterxml/jackson/databind/JavaType;",
            "Lcom/fasterxml/jackson/databind/BeanDescription;",
            ")",
            "Lcom/fasterxml/jackson/databind/JsonSerializer<",
            "*>;"
        }
    .end annotation

    const-string p1, "type"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p2}, Lcom/fasterxml/jackson/databind/JavaType;->getRawClass()Ljava/lang/Class;

    move-result-object p1

    const-class p2, Lkotlin/sequences/Sequence;

    invoke-virtual {p2, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result p2

    if-eqz p2, :cond_0

    sget-object p1, Lcom/fasterxml/jackson/module/kotlin/SequenceSerializer;->INSTANCE:Lcom/fasterxml/jackson/module/kotlin/SequenceSerializer;

    goto :goto_0

    :cond_0
    const-class p2, Lkotlin/UByte;

    invoke-virtual {p2, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result p2

    if-eqz p2, :cond_1

    sget-object p1, Lcom/fasterxml/jackson/module/kotlin/UByteSerializer;->INSTANCE:Lcom/fasterxml/jackson/module/kotlin/UByteSerializer;

    goto :goto_0

    :cond_1
    const-class p2, Lkotlin/UShort;

    invoke-virtual {p2, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result p2

    if-eqz p2, :cond_2

    sget-object p1, Lcom/fasterxml/jackson/module/kotlin/UShortSerializer;->INSTANCE:Lcom/fasterxml/jackson/module/kotlin/UShortSerializer;

    goto :goto_0

    :cond_2
    const-class p2, Lkotlin/UInt;

    invoke-virtual {p2, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result p2

    if-eqz p2, :cond_3

    sget-object p1, Lcom/fasterxml/jackson/module/kotlin/UIntSerializer;->INSTANCE:Lcom/fasterxml/jackson/module/kotlin/UIntSerializer;

    goto :goto_0

    :cond_3
    const-class p2, Lkotlin/ULong;

    invoke-virtual {p2, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result p2

    if-eqz p2, :cond_4

    sget-object p1, Lcom/fasterxml/jackson/module/kotlin/ULongSerializer;->INSTANCE:Lcom/fasterxml/jackson/module/kotlin/ULongSerializer;

    goto :goto_0

    :cond_4
    const-string p2, "rawClass"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Lcom/fasterxml/jackson/module/kotlin/ExtensionsKt;->isUnboxableValueClass(Ljava/lang/Class;)Z

    move-result p2

    if-eqz p2, :cond_5

    sget-object p2, Lcom/fasterxml/jackson/module/kotlin/ValueClassSerializer;->Companion:Lcom/fasterxml/jackson/module/kotlin/ValueClassSerializer$Companion;

    invoke-virtual {p2, p1}, Lcom/fasterxml/jackson/module/kotlin/ValueClassSerializer$Companion;->from(Ljava/lang/Class;)Lcom/fasterxml/jackson/databind/ser/std/StdSerializer;

    move-result-object p1

    goto :goto_0

    :cond_5
    const/4 p1, 0x0

    :goto_0
    return-object p1
.end method
