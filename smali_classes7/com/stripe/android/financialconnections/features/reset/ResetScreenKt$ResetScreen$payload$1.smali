.class final Lcom/stripe/android/financialconnections/features/reset/ResetScreenKt$ResetScreen$payload$1;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/financialconnections/features/reset/ResetScreenKt;->ResetScreen(LEt0;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lcom/stripe/android/financialconnections/features/reset/ResetState;",
        "Ldp<",
        "+",
        "Lkotlin/Unit;",
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
.field public static final INSTANCE:Lcom/stripe/android/financialconnections/features/reset/ResetScreenKt$ResetScreen$payload$1;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/stripe/android/financialconnections/features/reset/ResetScreenKt$ResetScreen$payload$1;

    invoke-direct {v0}, Lcom/stripe/android/financialconnections/features/reset/ResetScreenKt$ResetScreen$payload$1;-><init>()V

    sput-object v0, Lcom/stripe/android/financialconnections/features/reset/ResetScreenKt$ResetScreen$payload$1;->INSTANCE:Lcom/stripe/android/financialconnections/features/reset/ResetScreenKt$ResetScreen$payload$1;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Lcom/stripe/android/financialconnections/features/reset/ResetState;)Ldp;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/financialconnections/features/reset/ResetState;",
            ")",
            "Ldp<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/stripe/android/financialconnections/features/reset/ResetState;->getPayload()Ldp;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lcom/stripe/android/financialconnections/features/reset/ResetState;

    invoke-virtual {p0, p1}, Lcom/stripe/android/financialconnections/features/reset/ResetScreenKt$ResetScreen$payload$1;->invoke(Lcom/stripe/android/financialconnections/features/reset/ResetState;)Ldp;

    move-result-object p1

    return-object p1
.end method
