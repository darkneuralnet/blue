.class final Lcom/fasterxml/jackson/module/kotlin/ExtensionsKt$kotlinModule$1;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/fasterxml/jackson/module/kotlin/ExtensionsKt;->kotlinModule$default(Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Lcom/fasterxml/jackson/module/kotlin/KotlinModule;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lcom/fasterxml/jackson/module/kotlin/KotlinModule$Builder;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n"
    }
    d2 = {
        "Lcom/fasterxml/jackson/module/kotlin/KotlinModule$Builder;",
        "",
        "<anonymous>"
    }
    k = 0x3
    mv = {
        0x1,
        0x5,
        0x1
    }
.end annotation


# static fields
.field public static final INSTANCE:Lcom/fasterxml/jackson/module/kotlin/ExtensionsKt$kotlinModule$1;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/fasterxml/jackson/module/kotlin/ExtensionsKt$kotlinModule$1;

    invoke-direct {v0}, Lcom/fasterxml/jackson/module/kotlin/ExtensionsKt$kotlinModule$1;-><init>()V

    sput-object v0, Lcom/fasterxml/jackson/module/kotlin/ExtensionsKt$kotlinModule$1;->INSTANCE:Lcom/fasterxml/jackson/module/kotlin/ExtensionsKt$kotlinModule$1;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lcom/fasterxml/jackson/module/kotlin/KotlinModule$Builder;

    invoke-virtual {p0, p1}, Lcom/fasterxml/jackson/module/kotlin/ExtensionsKt$kotlinModule$1;->invoke(Lcom/fasterxml/jackson/module/kotlin/KotlinModule$Builder;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Lcom/fasterxml/jackson/module/kotlin/KotlinModule$Builder;)V
    .locals 1

    const-string v0, "$this$null"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method
