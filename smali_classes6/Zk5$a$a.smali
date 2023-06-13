.class public LZk5$a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/reactivex/functions/o;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LZk5$a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lio/reactivex/functions/o<",
        "Lxe5;",
        "Lio/reactivex/Observable<",
        "*>;>;"
    }
.end annotation


# instance fields
.field public final synthetic b:LZk5$a;


# direct methods
.method public constructor <init>(LZk5$a;)V
    .locals 0

    iput-object p1, p0, LZk5$a$a;->b:LZk5$a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lxe5;)Lio/reactivex/Observable;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lxe5;",
            ")",
            "Lio/reactivex/Observable<",
            "*>;"
        }
    .end annotation

    iget-object p1, p0, LZk5$a$a;->b:LZk5$a;

    iget-object p1, p1, LZk5$a;->b:Lio/reactivex/Observable;

    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    check-cast p1, Lxe5;

    invoke-virtual {p0, p1}, LZk5$a$a;->a(Lxe5;)Lio/reactivex/Observable;

    move-result-object p1

    return-object p1
.end method
