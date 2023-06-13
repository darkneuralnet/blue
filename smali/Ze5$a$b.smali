.class public LZe5$a$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/reactivex/functions/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LZe5$a;->a(Lio/reactivex/m;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic b:Lq72$c;

.field public final synthetic c:LZe5$a;


# direct methods
.method public constructor <init>(LZe5$a;Lq72$c;)V
    .locals 0

    iput-object p1, p0, LZe5$a$b;->c:LZe5$a;

    iput-object p2, p0, LZe5$a$b;->b:Lq72$c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    iget-object v0, p0, LZe5$a$b;->c:LZe5$a;

    iget-object v0, v0, LZe5$a;->b:LEb5;

    invoke-virtual {v0}, LEb5;->k()Lq72;

    move-result-object v0

    iget-object v1, p0, LZe5$a$b;->b:Lq72$c;

    invoke-virtual {v0, v1}, Lq72;->p(Lq72$c;)V

    return-void
.end method
