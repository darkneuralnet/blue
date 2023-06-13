.class public Lpk5$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/reactivex/functions/f;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lpk5;->b(Lio/reactivex/y;Ldd4;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic b:Ljava/lang/Object;

.field public final synthetic c:Lpk5;


# direct methods
.method public constructor <init>(Lpk5;Ljava/lang/Object;)V
    .locals 0

    iput-object p1, p0, Lpk5$a;->c:Lpk5;

    iput-object p2, p0, Lpk5$a;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public cancel()V
    .locals 3

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Object;

    const-string v1, "Scan operation is requested to stop."

    invoke-static {v1, v0}, Lye5;->k(Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v0, p0, Lpk5$a;->c:Lpk5;

    iget-object v1, v0, Lpk5;->b:Lpd5;

    iget-object v2, p0, Lpk5$a;->b:Ljava/lang/Object;

    invoke-virtual {v0, v1, v2}, Lpk5;->f(Lpd5;Ljava/lang/Object;)V

    return-void
.end method
