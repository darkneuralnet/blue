.class public final Lcom/fasterxml/jackson/module/kotlin/ConstructorValueCreator;
.super Lcom/fasterxml/jackson/module/kotlin/ValueCreator;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Lcom/fasterxml/jackson/module/kotlin/ValueCreator<",
        "TT;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0005\u0008\u0000\u0018\u0000*\u0004\u0008\u0000\u0010\u00012\u0008\u0012\u0004\u0012\u0002H\u00010\u0002B\u0013\u0012\u000c\u0010\u0003\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u0004\u00a2\u0006\u0002\u0010\u0005R\u0014\u0010\u0006\u001a\u00020\u0007X\u0094\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0008\u0010\tR\u001a\u0010\u0003\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u0004X\u0094\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\n\u0010\u000b\u00a8\u0006\u000c"
    }
    d2 = {
        "Lcom/fasterxml/jackson/module/kotlin/ConstructorValueCreator;",
        "T",
        "Lcom/fasterxml/jackson/module/kotlin/ValueCreator;",
        "callable",
        "Lkotlin/reflect/KFunction;",
        "(Lkotlin/reflect/KFunction;)V",
        "accessible",
        "",
        "getAccessible",
        "()Z",
        "getCallable",
        "()Lkotlin/reflect/KFunction;",
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
.field private final accessible:Z

.field private final callable:Lkotlin/reflect/KFunction;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/reflect/KFunction<",
            "TT;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lkotlin/reflect/KFunction;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/reflect/KFunction<",
            "+TT;>;)V"
        }
    .end annotation

    const-string v0, "callable"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/fasterxml/jackson/module/kotlin/ValueCreator;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object p1, p0, Lcom/fasterxml/jackson/module/kotlin/ConstructorValueCreator;->callable:Lkotlin/reflect/KFunction;

    invoke-virtual {p0}, Lcom/fasterxml/jackson/module/kotlin/ConstructorValueCreator;->getCallable()Lkotlin/reflect/KFunction;

    move-result-object p1

    invoke-static {p1}, Lkotlin/reflect/jvm/KCallablesJvm;->isAccessible(Lkotlin/reflect/KCallable;)Z

    move-result p1

    iput-boolean p1, p0, Lcom/fasterxml/jackson/module/kotlin/ConstructorValueCreator;->accessible:Z

    invoke-virtual {p0}, Lcom/fasterxml/jackson/module/kotlin/ConstructorValueCreator;->getAccessible()Z

    move-result p1

    if-nez p1, :cond_0

    invoke-virtual {p0}, Lcom/fasterxml/jackson/module/kotlin/ConstructorValueCreator;->getCallable()Lkotlin/reflect/KFunction;

    move-result-object p1

    const/4 v0, 0x1

    invoke-static {p1, v0}, Lkotlin/reflect/jvm/KCallablesJvm;->setAccessible(Lkotlin/reflect/KCallable;Z)V

    :cond_0
    return-void
.end method


# virtual methods
.method public getAccessible()Z
    .locals 1

    iget-boolean v0, p0, Lcom/fasterxml/jackson/module/kotlin/ConstructorValueCreator;->accessible:Z

    return v0
.end method

.method public getCallable()Lkotlin/reflect/KFunction;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/reflect/KFunction<",
            "TT;>;"
        }
    .end annotation

    iget-object v0, p0, Lcom/fasterxml/jackson/module/kotlin/ConstructorValueCreator;->callable:Lkotlin/reflect/KFunction;

    return-object v0
.end method
