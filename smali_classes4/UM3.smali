.class public final synthetic LUM3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic b:Lcom/stripe/android/model/Customer;

.field public final synthetic c:Lcom/stripe/android/model/Token;

.field public final synthetic d:LSM3;


# direct methods
.method public synthetic constructor <init>(Lcom/stripe/android/model/Customer;Lcom/stripe/android/model/Token;LSM3;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LUM3;->b:Lcom/stripe/android/model/Customer;

    iput-object p2, p0, LUM3;->c:Lcom/stripe/android/model/Token;

    iput-object p3, p0, LUM3;->d:LSM3;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, LUM3;->b:Lcom/stripe/android/model/Customer;

    iget-object v1, p0, LUM3;->c:Lcom/stripe/android/model/Token;

    iget-object v2, p0, LUM3;->d:LSM3;

    invoke-static {v0, v1, v2}, LSM3$e;->a(Lcom/stripe/android/model/Customer;Lcom/stripe/android/model/Token;LSM3;)Lio/reactivex/h;

    move-result-object v0

    return-object v0
.end method
