.class public Lry0$c;
.super Lio/reactivex/observers/d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lry0;->c()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lio/reactivex/observers/d<",
        "Lcom/polidea/rxandroidble2/exceptions/BleException;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic c:Lry0;


# direct methods
.method public constructor <init>(Lry0;)V
    .locals 0

    iput-object p1, p0, Lry0$c;->c:Lry0;

    invoke-direct {p0}, Lio/reactivex/observers/d;-><init>()V

    return-void
.end method


# virtual methods
.method public b(Lcom/polidea/rxandroidble2/exceptions/BleException;)V
    .locals 1

    iget-object v0, p0, Lry0$c;->c:Lry0;

    invoke-virtual {v0, p1}, Lry0;->e(Lcom/polidea/rxandroidble2/exceptions/BleException;)V

    return-void
.end method

.method public onComplete()V
    .locals 0

    return-void
.end method

.method public onError(Ljava/lang/Throwable;)V
    .locals 0

    return-void
.end method

.method public bridge synthetic onNext(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lcom/polidea/rxandroidble2/exceptions/BleException;

    invoke-virtual {p0, p1}, Lry0$c;->b(Lcom/polidea/rxandroidble2/exceptions/BleException;)V

    return-void
.end method
