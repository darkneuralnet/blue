.class public final synthetic LrM3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic b:LvM3;


# direct methods
.method public synthetic constructor <init>(LvM3;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LrM3;->b:LvM3;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, LrM3;->b:LvM3;

    invoke-static {v0}, LvM3;->u(LvM3;)Lcom/stripe/android/model/PaymentIntent;

    move-result-object v0

    return-object v0
.end method
