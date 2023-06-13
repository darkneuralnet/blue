.class public Lkf1;
.super Lcom/fasterxml/jackson/databind/ObjectMapper;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u0016\u0018\u00002\u00020\u0001B)\u0008\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0016\u0008\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0008\u0018\u00010\u0007\u00a2\u0006\u0004\u0008\n\u0010\u000bB!\u0008\u0016\u0012\u0016\u0008\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0008\u0018\u00010\u0007\u00a2\u0006\u0004\u0008\n\u0010\u000cJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016\u00a8\u0006\r"
    }
    d2 = {
        "Lkf1;",
        "Lcom/fasterxml/jackson/databind/ObjectMapper;",
        "Lef1;",
        "cache",
        "Lnf1;",
        "a",
        "enumCache",
        "Lkotlin/Function1;",
        "Lif1;",
        "deserializerFactory",
        "<init>",
        "(Lef1;Lkotlin/jvm/functions/Function1;)V",
        "(Lkotlin/jvm/functions/Function1;)V",
        "jackson_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# direct methods
.method public constructor <init>(Lef1;Lkotlin/jvm/functions/Function1;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lef1;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lef1;",
            "+",
            "Lif1;",
            ">;)V"
        }
    .end annotation

    new-instance v0, Lcom/fasterxml/jackson/databind/deser/DefaultDeserializationContext$Impl;

    const/4 v1, 0x0

    if-eqz p2, :cond_0

    invoke-interface {p2, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lif1;

    if-nez p2, :cond_1

    :cond_0
    new-instance p2, Lif1;

    invoke-direct {p2, v1, p1}, Lif1;-><init>(Lcom/fasterxml/jackson/databind/cfg/DeserializerFactoryConfig;Lef1;)V

    :cond_1
    invoke-direct {v0, p2}, Lcom/fasterxml/jackson/databind/deser/DefaultDeserializationContext$Impl;-><init>(Lcom/fasterxml/jackson/databind/deser/DeserializerFactory;)V

    invoke-direct {p0, v1, v1, v0}, Lcom/fasterxml/jackson/databind/ObjectMapper;-><init>(Lcom/fasterxml/jackson/core/JsonFactory;Lcom/fasterxml/jackson/databind/ser/DefaultSerializerProvider;Lcom/fasterxml/jackson/databind/deser/DefaultDeserializationContext;)V

    invoke-virtual {p0, p1}, Lkf1;->a(Lef1;)Lnf1;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/fasterxml/jackson/databind/ObjectMapper;->setSerializerFactory(Lcom/fasterxml/jackson/databind/ser/SerializerFactory;)Lcom/fasterxml/jackson/databind/ObjectMapper;

    return-void
.end method

.method public constructor <init>(Lkotlin/jvm/functions/Function1;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lef1;",
            "+",
            "Lif1;",
            ">;)V"
        }
    .end annotation

    new-instance v0, Lef1;

    invoke-direct {v0}, Lef1;-><init>()V

    invoke-direct {p0, v0, p1}, Lkf1;-><init>(Lef1;Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/functions/Function1;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    const/4 p1, 0x0

    :cond_0
    invoke-direct {p0, p1}, Lkf1;-><init>(Lkotlin/jvm/functions/Function1;)V

    return-void
.end method


# virtual methods
.method public a(Lef1;)Lnf1;
    .locals 2

    const-string v0, "cache"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lnf1;

    const/4 v1, 0x0

    invoke-direct {v0, v1, p1}, Lnf1;-><init>(Lcom/fasterxml/jackson/databind/cfg/SerializerFactoryConfig;Lef1;)V

    return-object v0
.end method
