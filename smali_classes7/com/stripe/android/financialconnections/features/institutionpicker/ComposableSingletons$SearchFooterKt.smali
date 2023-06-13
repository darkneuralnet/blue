.class public final Lcom/stripe/android/financialconnections/features/institutionpicker/ComposableSingletons$SearchFooterKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
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
.field public static final INSTANCE:Lcom/stripe/android/financialconnections/features/institutionpicker/ComposableSingletons$SearchFooterKt;

.field public static lambda-1:Lkotlin/jvm/functions/Function2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function2<",
            "LEt0;",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    new-instance v0, Lcom/stripe/android/financialconnections/features/institutionpicker/ComposableSingletons$SearchFooterKt;

    invoke-direct {v0}, Lcom/stripe/android/financialconnections/features/institutionpicker/ComposableSingletons$SearchFooterKt;-><init>()V

    sput-object v0, Lcom/stripe/android/financialconnections/features/institutionpicker/ComposableSingletons$SearchFooterKt;->INSTANCE:Lcom/stripe/android/financialconnections/features/institutionpicker/ComposableSingletons$SearchFooterKt;

    const/4 v0, 0x0

    sget-object v1, Lcom/stripe/android/financialconnections/features/institutionpicker/ComposableSingletons$SearchFooterKt$lambda-1$1;->INSTANCE:Lcom/stripe/android/financialconnections/features/institutionpicker/ComposableSingletons$SearchFooterKt$lambda-1$1;

    const v2, -0x7ef9bdaa

    invoke-static {v2, v0, v1}, Ljt0;->c(IZLjava/lang/Object;)Lht0;

    move-result-object v0

    sput-object v0, Lcom/stripe/android/financialconnections/features/institutionpicker/ComposableSingletons$SearchFooterKt;->lambda-1:Lkotlin/jvm/functions/Function2;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final getLambda-1$financial_connections_release()Lkotlin/jvm/functions/Function2;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/jvm/functions/Function2<",
            "LEt0;",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    sget-object v0, Lcom/stripe/android/financialconnections/features/institutionpicker/ComposableSingletons$SearchFooterKt;->lambda-1:Lkotlin/jvm/functions/Function2;

    return-object v0
.end method
