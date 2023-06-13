.class public final synthetic Lcm0;
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

    iput-object p1, p0, Lcm0;->b:Lkotlin/jvm/functions/Function1;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, Lcm0;->b:Lkotlin/jvm/functions/Function1;

    check-cast p1, Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountResult;

    invoke-static {v0, p1}, Lcom/stripe/android/payments/bankaccount/CollectBankAccountLauncher$Companion;->b(Lkotlin/jvm/functions/Function1;Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountResult;)V

    return-void
.end method
