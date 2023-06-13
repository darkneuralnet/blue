.class public final Lcom/fasterxml/jackson/module/kotlin/ValueClassStaticJsonValueSerializer$Companion;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/fasterxml/jackson/module/kotlin/ValueClassStaticJsonValueSerializer;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0002J2\u0010\u0003\u001a\n\u0012\u0004\u0012\u0002H\u0005\u0018\u00010\u0004\"\u0004\u0008\u0001\u0010\u00052\u000e\u0010\u0006\u001a\n\u0012\u0006\u0008\u0001\u0012\u00020\u00010\u00072\u000c\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u0002H\u00050\u0007\u00a8\u0006\t"
    }
    d2 = {
        "Lcom/fasterxml/jackson/module/kotlin/ValueClassStaticJsonValueSerializer$Companion;",
        "",
        "()V",
        "createdOrNull",
        "Lcom/fasterxml/jackson/module/kotlin/ValueClassStaticJsonValueSerializer;",
        "T",
        "outerClazz",
        "Ljava/lang/Class;",
        "innerClazz",
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

    invoke-direct {p0}, Lcom/fasterxml/jackson/module/kotlin/ValueClassStaticJsonValueSerializer$Companion;-><init>()V

    return-void
.end method


# virtual methods
.method public final createdOrNull(Ljava/lang/Class;Ljava/lang/Class;)Lcom/fasterxml/jackson/module/kotlin/ValueClassStaticJsonValueSerializer;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Class<",
            "+",
            "Ljava/lang/Object;",
            ">;",
            "Ljava/lang/Class<",
            "TT;>;)",
            "Lcom/fasterxml/jackson/module/kotlin/ValueClassStaticJsonValueSerializer<",
            "TT;>;"
        }
    .end annotation

    const-string v0, "outerClazz"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "innerClazz"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Lcom/fasterxml/jackson/module/kotlin/KotlinSerializersKt;->access$getStaticJsonValueGetter(Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object p1

    const/4 v0, 0x0

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    new-instance v1, Lcom/fasterxml/jackson/module/kotlin/ValueClassStaticJsonValueSerializer;

    invoke-direct {v1, p2, p1, v0}, Lcom/fasterxml/jackson/module/kotlin/ValueClassStaticJsonValueSerializer;-><init>(Ljava/lang/Class;Ljava/lang/reflect/Method;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object v0, v1

    :goto_0
    return-object v0
.end method
