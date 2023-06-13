.class public Lv41$e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/reactivex/functions/o;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lv41;-><init>(Ljava/lang/String;Lpd5;Lio/reactivex/Observable;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lio/reactivex/functions/o<",
        "Lcom/polidea/rxandroidble2/exceptions/BleException;",
        "Lio/reactivex/B<",
        "*>;>;"
    }
.end annotation


# instance fields
.field public final synthetic b:Lv41;


# direct methods
.method public constructor <init>(Lv41;)V
    .locals 0

    iput-object p1, p0, Lv41$e;->b:Lv41;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/polidea/rxandroidble2/exceptions/BleException;)Lio/reactivex/B;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/polidea/rxandroidble2/exceptions/BleException;",
            ")",
            "Lio/reactivex/B<",
            "*>;"
        }
    .end annotation

    invoke-static {p1}, Lio/reactivex/Observable;->error(Ljava/lang/Throwable;)Lio/reactivex/Observable;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    check-cast p1, Lcom/polidea/rxandroidble2/exceptions/BleException;

    invoke-virtual {p0, p1}, Lv41$e;->a(Lcom/polidea/rxandroidble2/exceptions/BleException;)Lio/reactivex/B;

    move-result-object p1

    return-object p1
.end method
