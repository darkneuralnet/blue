.class public final Lcom/stripe/android/ui/core/elements/PostConfirmHandlingPiStatusSpecs$CanceledSpec;
.super Lcom/stripe/android/ui/core/elements/PostConfirmHandlingPiStatusSpecs;
.source "SourceFile"


# annotations
.annotation runtime LVs5;
    value = "canceled"
.end annotation

.annotation runtime LWs5;
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/ui/core/elements/PostConfirmHandlingPiStatusSpecs;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "CanceledSpec"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u00c7\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u000f\u0010\u0003\u001a\u0008\u0012\u0004\u0012\u00020\u00000\u0002H\u00c6\u0001\u00a8\u0006\u0006"
    }
    d2 = {
        "Lcom/stripe/android/ui/core/elements/PostConfirmHandlingPiStatusSpecs$CanceledSpec;",
        "Lcom/stripe/android/ui/core/elements/PostConfirmHandlingPiStatusSpecs;",
        "LKj2;",
        "serializer",
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
.field private static final synthetic $cachedSerializer$delegate:Lkotlin/Lazy;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/Lazy<",
            "LKj2<",
            "Ljava/lang/Object;",
            ">;>;"
        }
    .end annotation
.end field

.field public static final $stable:I

.field public static final INSTANCE:Lcom/stripe/android/ui/core/elements/PostConfirmHandlingPiStatusSpecs$CanceledSpec;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/stripe/android/ui/core/elements/PostConfirmHandlingPiStatusSpecs$CanceledSpec;

    invoke-direct {v0}, Lcom/stripe/android/ui/core/elements/PostConfirmHandlingPiStatusSpecs$CanceledSpec;-><init>()V

    sput-object v0, Lcom/stripe/android/ui/core/elements/PostConfirmHandlingPiStatusSpecs$CanceledSpec;->INSTANCE:Lcom/stripe/android/ui/core/elements/PostConfirmHandlingPiStatusSpecs$CanceledSpec;

    sget-object v0, Lkotlin/LazyThreadSafetyMode;->PUBLICATION:Lkotlin/LazyThreadSafetyMode;

    sget-object v1, Lcom/stripe/android/ui/core/elements/PostConfirmHandlingPiStatusSpecs$CanceledSpec$$cachedSerializer$delegate$1;->INSTANCE:Lcom/stripe/android/ui/core/elements/PostConfirmHandlingPiStatusSpecs$CanceledSpec$$cachedSerializer$delegate$1;

    invoke-static {v0, v1}, Lkotlin/LazyKt;->lazy(Lkotlin/LazyThreadSafetyMode;Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    sput-object v0, Lcom/stripe/android/ui/core/elements/PostConfirmHandlingPiStatusSpecs$CanceledSpec;->$cachedSerializer$delegate:Lkotlin/Lazy;

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/stripe/android/ui/core/elements/PostConfirmHandlingPiStatusSpecs;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method private final synthetic get$cachedSerializer$delegate()Lkotlin/Lazy;
    .locals 1

    sget-object v0, Lcom/stripe/android/ui/core/elements/PostConfirmHandlingPiStatusSpecs$CanceledSpec;->$cachedSerializer$delegate:Lkotlin/Lazy;

    return-object v0
.end method


# virtual methods
.method public final serializer()LKj2;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LKj2<",
            "Lcom/stripe/android/ui/core/elements/PostConfirmHandlingPiStatusSpecs$CanceledSpec;",
            ">;"
        }
    .end annotation

    invoke-direct {p0}, Lcom/stripe/android/ui/core/elements/PostConfirmHandlingPiStatusSpecs$CanceledSpec;->get$cachedSerializer$delegate()Lkotlin/Lazy;

    move-result-object v0

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LKj2;

    return-object v0
.end method
