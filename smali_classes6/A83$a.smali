.class public LA83$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/reactivex/functions/o;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LA83;->a(Lio/reactivex/Observable;)Lio/reactivex/Observable;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lio/reactivex/functions/o<",
        "Lke5$c$a;",
        "Lio/reactivex/Observable<",
        "Lke5$c$a;",
        ">;>;"
    }
.end annotation


# instance fields
.field public final synthetic b:LA83;


# direct methods
.method public constructor <init>(LA83;)V
    .locals 0

    iput-object p1, p0, LA83$a;->b:LA83;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lke5$c$a;)Lio/reactivex/Observable;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lke5$c$a;",
            ")",
            "Lio/reactivex/Observable<",
            "Lke5$c$a;",
            ">;"
        }
    .end annotation

    invoke-virtual {p1}, Lke5$c$a;->a()Lcom/polidea/rxandroidble2/exceptions/BleGattException;

    move-result-object p1

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

    check-cast p1, Lke5$c$a;

    invoke-virtual {p0, p1}, LA83$a;->a(Lke5$c$a;)Lio/reactivex/Observable;

    move-result-object p1

    return-object p1
.end method
