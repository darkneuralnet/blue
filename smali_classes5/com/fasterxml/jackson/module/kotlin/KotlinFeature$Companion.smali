.class public final Lcom/fasterxml/jackson/module/kotlin/KotlinFeature$Companion;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/fasterxml/jackson/module/kotlin/KotlinFeature;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u00048@X\u0080\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0005\u0010\u0006\u00a8\u0006\u0007"
    }
    d2 = {
        "Lcom/fasterxml/jackson/module/kotlin/KotlinFeature$Companion;",
        "",
        "()V",
        "defaults",
        "Ljava/util/BitSet;",
        "getDefaults$jackson_module_kotlin",
        "()Ljava/util/BitSet;",
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
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    invoke-direct {p0}, Lcom/fasterxml/jackson/module/kotlin/KotlinFeature$Companion;-><init>()V

    return-void
.end method


# virtual methods
.method public final getDefaults$jackson_module_kotlin()Ljava/util/BitSet;
    .locals 7

    const/4 v0, 0x0

    invoke-static {v0}, Lcom/fasterxml/jackson/module/kotlin/ExtensionsKt;->toBitSet(I)Ljava/util/BitSet;

    move-result-object v1

    invoke-static {}, Lcom/fasterxml/jackson/module/kotlin/KotlinFeature;->values()[Lcom/fasterxml/jackson/module/kotlin/KotlinFeature;

    move-result-object v2

    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    array-length v4, v2

    :goto_0
    if-ge v0, v4, :cond_1

    aget-object v5, v2, v0

    invoke-static {v5}, Lcom/fasterxml/jackson/module/kotlin/KotlinFeature;->access$getEnabledByDefault$p(Lcom/fasterxml/jackson/module/kotlin/KotlinFeature;)Z

    move-result v6

    if-eqz v6, :cond_0

    invoke-interface {v3, v5}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/fasterxml/jackson/module/kotlin/KotlinFeature;

    invoke-virtual {v2}, Lcom/fasterxml/jackson/module/kotlin/KotlinFeature;->getBitSet$jackson_module_kotlin()Ljava/util/BitSet;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/util/BitSet;->or(Ljava/util/BitSet;)V

    goto :goto_1

    :cond_2
    return-object v1
.end method
