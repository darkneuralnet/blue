.class public final synthetic LrS5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lt5;


# instance fields
.field public final synthetic b:Lkotlin/jvm/functions/Function1;


# direct methods
.method public synthetic constructor <init>(Lkotlin/jvm/functions/Function1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LrS5;->b:Lkotlin/jvm/functions/Function1;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, LrS5;->b:Lkotlin/jvm/functions/Function1;

    check-cast p1, Lcom/stripe/android/stripe3ds2/transaction/ChallengeResult;

    invoke-static {v0, p1}, Lcom/stripe/android/payments/core/authentication/threeds2/Stripe3ds2TransactionActivity;->w(Lkotlin/jvm/functions/Function1;Lcom/stripe/android/stripe3ds2/transaction/ChallengeResult;)V

    return-void
.end method
