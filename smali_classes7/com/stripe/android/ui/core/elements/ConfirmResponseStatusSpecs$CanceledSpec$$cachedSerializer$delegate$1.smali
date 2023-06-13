.class final Lcom/stripe/android/ui/core/elements/ConfirmResponseStatusSpecs$CanceledSpec$$cachedSerializer$delegate$1;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/ui/core/elements/ConfirmResponseStatusSpecs$CanceledSpec;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function0<",
        "LKj2<",
        "Ljava/lang/Object;",
        ">;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final INSTANCE:Lcom/stripe/android/ui/core/elements/ConfirmResponseStatusSpecs$CanceledSpec$$cachedSerializer$delegate$1;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/stripe/android/ui/core/elements/ConfirmResponseStatusSpecs$CanceledSpec$$cachedSerializer$delegate$1;

    invoke-direct {v0}, Lcom/stripe/android/ui/core/elements/ConfirmResponseStatusSpecs$CanceledSpec$$cachedSerializer$delegate$1;-><init>()V

    sput-object v0, Lcom/stripe/android/ui/core/elements/ConfirmResponseStatusSpecs$CanceledSpec$$cachedSerializer$delegate$1;->INSTANCE:Lcom/stripe/android/ui/core/elements/ConfirmResponseStatusSpecs$CanceledSpec$$cachedSerializer$delegate$1;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke()LKj2;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LKj2<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    new-instance v0, LTd3;

    sget-object v1, Lcom/stripe/android/ui/core/elements/ConfirmResponseStatusSpecs$CanceledSpec;->INSTANCE:Lcom/stripe/android/ui/core/elements/ConfirmResponseStatusSpecs$CanceledSpec;

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/annotation/Annotation;

    const-string v3, "canceled"

    invoke-direct {v0, v3, v1, v2}, LTd3;-><init>(Ljava/lang/String;Ljava/lang/Object;[Ljava/lang/annotation/Annotation;)V

    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/stripe/android/ui/core/elements/ConfirmResponseStatusSpecs$CanceledSpec$$cachedSerializer$delegate$1;->invoke()LKj2;

    move-result-object v0

    return-object v0
.end method
