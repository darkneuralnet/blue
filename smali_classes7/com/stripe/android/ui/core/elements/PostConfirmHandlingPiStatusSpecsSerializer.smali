.class public final Lcom/stripe/android/ui/core/elements/PostConfirmHandlingPiStatusSpecsSerializer;
.super Lki2;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lki2<",
        "Lcom/stripe/android/ui/core/elements/PostConfirmHandlingPiStatusSpecs;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u00c7\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u0018\u0010\u0006\u001a\n\u0012\u0006\u0008\u0001\u0012\u00020\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0014\u00a8\u0006\t"
    }
    d2 = {
        "Lcom/stripe/android/ui/core/elements/PostConfirmHandlingPiStatusSpecsSerializer;",
        "Lki2;",
        "Lcom/stripe/android/ui/core/elements/PostConfirmHandlingPiStatusSpecs;",
        "Lxi2;",
        "element",
        "LE01;",
        "selectDeserializer",
        "<init>",
        "()V",
        "payments-ui-core_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# static fields
.field public static final $stable:I

.field public static final INSTANCE:Lcom/stripe/android/ui/core/elements/PostConfirmHandlingPiStatusSpecsSerializer;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/stripe/android/ui/core/elements/PostConfirmHandlingPiStatusSpecsSerializer;

    invoke-direct {v0}, Lcom/stripe/android/ui/core/elements/PostConfirmHandlingPiStatusSpecsSerializer;-><init>()V

    sput-object v0, Lcom/stripe/android/ui/core/elements/PostConfirmHandlingPiStatusSpecsSerializer;->INSTANCE:Lcom/stripe/android/ui/core/elements/PostConfirmHandlingPiStatusSpecsSerializer;

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    const-class v0, Lcom/stripe/android/ui/core/elements/PostConfirmHandlingPiStatusSpecs;

    invoke-static {v0}, Lkotlin/jvm/internal/Reflection;->getOrCreateKotlinClass(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    move-result-object v0

    invoke-direct {p0, v0}, Lki2;-><init>(Lkotlin/reflect/KClass;)V

    return-void
.end method


# virtual methods
.method public selectDeserializer(Lxi2;)LE01;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lxi2;",
            ")",
            "LE01<",
            "Lcom/stripe/android/ui/core/elements/PostConfirmHandlingPiStatusSpecs;",
            ">;"
        }
    .end annotation

    const-string v0, "element"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Lzi2;->k(Lxi2;)LSi2;

    move-result-object p1

    const-string v0, "type"

    invoke-virtual {p1, v0}, LSi2;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lxi2;

    if-eqz p1, :cond_0

    invoke-static {p1}, Lzi2;->l(Lxi2;)LYi2;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-virtual {p1}, LYi2;->a()Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    const-string v0, "finished"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    sget-object p1, Lcom/stripe/android/ui/core/elements/PostConfirmHandlingPiStatusSpecs$FinishedSpec;->INSTANCE:Lcom/stripe/android/ui/core/elements/PostConfirmHandlingPiStatusSpecs$FinishedSpec;

    invoke-virtual {p1}, Lcom/stripe/android/ui/core/elements/PostConfirmHandlingPiStatusSpecs$FinishedSpec;->serializer()LKj2;

    move-result-object p1

    goto :goto_1

    :cond_1
    const-string v0, "canceled"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    sget-object p1, Lcom/stripe/android/ui/core/elements/PostConfirmHandlingPiStatusSpecs$CanceledSpec;->INSTANCE:Lcom/stripe/android/ui/core/elements/PostConfirmHandlingPiStatusSpecs$CanceledSpec;

    invoke-virtual {p1}, Lcom/stripe/android/ui/core/elements/PostConfirmHandlingPiStatusSpecs$CanceledSpec;->serializer()LKj2;

    move-result-object p1

    goto :goto_1

    :cond_2
    sget-object p1, Lcom/stripe/android/ui/core/elements/PostConfirmHandlingPiStatusSpecs$CanceledSpec;->INSTANCE:Lcom/stripe/android/ui/core/elements/PostConfirmHandlingPiStatusSpecs$CanceledSpec;

    invoke-virtual {p1}, Lcom/stripe/android/ui/core/elements/PostConfirmHandlingPiStatusSpecs$CanceledSpec;->serializer()LKj2;

    move-result-object p1

    :goto_1
    return-object p1
.end method
