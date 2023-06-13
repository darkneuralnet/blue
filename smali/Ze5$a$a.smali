.class public LZe5$a$a;
.super Lq72$c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LZe5$a;->a(Lio/reactivex/m;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic b:Lio/reactivex/m;

.field public final synthetic c:LZe5$a;


# direct methods
.method public constructor <init>(LZe5$a;[Ljava/lang/String;Lio/reactivex/m;)V
    .locals 0

    iput-object p1, p0, LZe5$a$a;->c:LZe5$a;

    iput-object p3, p0, LZe5$a$a;->b:Lio/reactivex/m;

    invoke-direct {p0, p2}, Lq72$c;-><init>([Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public c(Ljava/util/Set;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    iget-object p1, p0, LZe5$a$a;->b:Lio/reactivex/m;

    invoke-interface {p1}, Lio/reactivex/m;->isCancelled()Z

    move-result p1

    if-nez p1, :cond_0

    iget-object p1, p0, LZe5$a$a;->b:Lio/reactivex/m;

    sget-object v0, LZe5;->a:Ljava/lang/Object;

    invoke-interface {p1, v0}, Lio/reactivex/j;->onNext(Ljava/lang/Object;)V

    :cond_0
    return-void
.end method
