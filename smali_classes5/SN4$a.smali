.class public final LSN4$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/reactivex/functions/o;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LSN4;->g(Lio/reactivex/k;Lio/reactivex/E;Lio/reactivex/functions/g;Lio/reactivex/functions/o;)Lio/reactivex/functions/o;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lio/reactivex/functions/o<",
        "Lio/reactivex/k<",
        "+",
        "Ljava/lang/Throwable;",
        ">;",
        "Lio/reactivex/k<",
        "Ljava/lang/Object;",
        ">;>;"
    }
.end annotation


# instance fields
.field public final synthetic b:Lio/reactivex/k;

.field public final synthetic c:Lio/reactivex/functions/o;

.field public final synthetic d:Lio/reactivex/functions/g;

.field public final synthetic e:Lio/reactivex/E;


# direct methods
.method public constructor <init>(Lio/reactivex/k;Lio/reactivex/functions/o;Lio/reactivex/functions/g;Lio/reactivex/E;)V
    .locals 0

    iput-object p1, p0, LSN4$a;->b:Lio/reactivex/k;

    iput-object p2, p0, LSN4$a;->c:Lio/reactivex/functions/o;

    iput-object p3, p0, LSN4$a;->d:Lio/reactivex/functions/g;

    iput-object p4, p0, LSN4$a;->e:Lio/reactivex/E;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lio/reactivex/k;)Lio/reactivex/k;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/reactivex/k<",
            "+",
            "Ljava/lang/Throwable;",
            ">;)",
            "Lio/reactivex/k<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, LSN4$a;->b:Lio/reactivex/k;

    const-wide/16 v1, -0x1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-static {v1}, Lio/reactivex/k;->o0(Ljava/lang/Object;)Lio/reactivex/k;

    move-result-object v1

    invoke-virtual {v0, v1}, Lio/reactivex/k;->s(Lna4;)Lio/reactivex/k;

    move-result-object v0

    invoke-static {}, LSN4;->c()Lio/reactivex/functions/c;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Lio/reactivex/k;->w1(Lna4;Lio/reactivex/functions/c;)Lio/reactivex/k;

    move-result-object p1

    iget-object v0, p0, LSN4$a;->c:Lio/reactivex/functions/o;

    invoke-virtual {p1, v0}, Lio/reactivex/k;->W(Lio/reactivex/functions/o;)Lio/reactivex/k;

    move-result-object p1

    iget-object v0, p0, LSN4$a;->d:Lio/reactivex/functions/g;

    invoke-static {v0}, LSN4;->b(Lio/reactivex/functions/g;)Lio/reactivex/functions/g;

    move-result-object v0

    invoke-virtual {p1, v0}, Lio/reactivex/k;->K(Lio/reactivex/functions/g;)Lio/reactivex/k;

    move-result-object p1

    iget-object v0, p0, LSN4$a;->e:Lio/reactivex/E;

    invoke-static {v0}, LSN4;->a(Lio/reactivex/E;)Lio/reactivex/functions/o;

    move-result-object v0

    invoke-virtual {p1, v0}, Lio/reactivex/k;->W(Lio/reactivex/functions/o;)Lio/reactivex/k;

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

    check-cast p1, Lio/reactivex/k;

    invoke-virtual {p0, p1}, LSN4$a;->a(Lio/reactivex/k;)Lio/reactivex/k;

    move-result-object p1

    return-object p1
.end method
