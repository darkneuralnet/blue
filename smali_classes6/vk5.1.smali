.class public Lvk5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Luk5;


# instance fields
.field public final a:Lpd5;

.field public final b:LNw2;


# direct methods
.method public constructor <init>(Lpd5;LNw2;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lvk5;->a:Lpd5;

    iput-object p2, p0, Lvk5;->b:LNw2;

    return-void
.end method


# virtual methods
.method public a(Z)V
    .locals 1

    iget-object v0, p0, Lvk5;->a:Lpd5;

    invoke-virtual {v0}, Lpd5;->b()Z

    move-result v0

    if-eqz v0, :cond_4

    iget-object v0, p0, Lvk5;->a:Lpd5;

    invoke-virtual {v0}, Lpd5;->c()Z

    move-result v0

    if-eqz v0, :cond_3

    iget-object v0, p0, Lvk5;->b:LNw2;

    invoke-interface {v0}, LNw2;->a()Z

    move-result v0

    if-eqz v0, :cond_2

    if-eqz p1, :cond_1

    iget-object p1, p0, Lvk5;->b:LNw2;

    invoke-interface {p1}, LNw2;->b()Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Lcom/polidea/rxandroidble2/exceptions/BleScanException;

    const/4 v0, 0x4

    invoke-direct {p1, v0}, Lcom/polidea/rxandroidble2/exceptions/BleScanException;-><init>(I)V

    throw p1

    :cond_1
    :goto_0
    return-void

    :cond_2
    new-instance p1, Lcom/polidea/rxandroidble2/exceptions/BleScanException;

    const/4 v0, 0x3

    invoke-direct {p1, v0}, Lcom/polidea/rxandroidble2/exceptions/BleScanException;-><init>(I)V

    throw p1

    :cond_3
    new-instance p1, Lcom/polidea/rxandroidble2/exceptions/BleScanException;

    const/4 v0, 0x1

    invoke-direct {p1, v0}, Lcom/polidea/rxandroidble2/exceptions/BleScanException;-><init>(I)V

    throw p1

    :cond_4
    new-instance p1, Lcom/polidea/rxandroidble2/exceptions/BleScanException;

    const/4 v0, 0x2

    invoke-direct {p1, v0}, Lcom/polidea/rxandroidble2/exceptions/BleScanException;-><init>(I)V

    throw p1
.end method
