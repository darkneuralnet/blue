.class public Lay0$d$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/reactivex/functions/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lay0$d;->subscribe(Lio/reactivex/H;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lio/reactivex/functions/q<",
        "Lke5$a;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic b:Lay0$d;


# direct methods
.method public constructor <init>(Lay0$d;)V
    .locals 0

    iput-object p1, p0, Lay0$d$a;->b:Lay0$d;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lke5$a;)Z
    .locals 1

    sget-object v0, Lke5$a;->d:Lke5$a;

    if-ne p1, v0, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public bridge synthetic test(Ljava/lang/Object;)Z
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    check-cast p1, Lke5$a;

    invoke-virtual {p0, p1}, Lay0$d$a;->a(Lke5$a;)Z

    move-result p1

    return p1
.end method
