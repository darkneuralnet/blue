.class public LZe5$c$a;
.super Lq72$c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LZe5$c;->subscribe(Lio/reactivex/y;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic b:Lio/reactivex/y;

.field public final synthetic c:LZe5$c;


# direct methods
.method public constructor <init>(LZe5$c;[Ljava/lang/String;Lio/reactivex/y;)V
    .locals 0

    iput-object p1, p0, LZe5$c$a;->c:LZe5$c;

    iput-object p3, p0, LZe5$c$a;->b:Lio/reactivex/y;

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

    iget-object p1, p0, LZe5$c$a;->b:Lio/reactivex/y;

    sget-object v0, LZe5;->a:Ljava/lang/Object;

    invoke-interface {p1, v0}, Lio/reactivex/j;->onNext(Ljava/lang/Object;)V

    return-void
.end method
