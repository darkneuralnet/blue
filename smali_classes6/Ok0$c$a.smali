.class public LOk0$c$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/reactivex/functions/o;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LOk0$c;->a(Lnd5$b;)Lio/reactivex/Observable;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lio/reactivex/functions/o<",
        "Ljava/lang/Boolean;",
        "Lde5$a;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic b:LOk0$c;


# direct methods
.method public constructor <init>(LOk0$c;)V
    .locals 0

    iput-object p1, p0, LOk0$c$a;->b:LOk0$c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Boolean;)Lde5$a;
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_0

    sget-object p1, Lde5$a;->f:Lde5$a;

    goto :goto_0

    :cond_0
    sget-object p1, Lde5$a;->e:Lde5$a;

    :goto_0
    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p0, p1}, LOk0$c$a;->a(Ljava/lang/Boolean;)Lde5$a;

    move-result-object p1

    return-object p1
.end method
