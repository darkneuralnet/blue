.class public final LYr1;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final d:Lad;


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:LX94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LX94<",
            "LU96;",
            ">;"
        }
    .end annotation
.end field

.field public c:LR96;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LR96<",
            "LkQ3;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    invoke-static {}, Lad;->e()Lad;

    move-result-object v0

    sput-object v0, LYr1;->d:Lad;

    return-void
.end method

.method public constructor <init>(LX94;Ljava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LX94<",
            "LU96;",
            ">;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, LYr1;->a:Ljava/lang/String;

    iput-object p1, p0, LYr1;->b:LX94;

    return-void
.end method


# virtual methods
.method public final a()Z
    .locals 5

    iget-object v0, p0, LYr1;->c:LR96;

    if-nez v0, :cond_1

    iget-object v0, p0, LYr1;->b:LX94;

    invoke-interface {v0}, LX94;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LU96;

    if-eqz v0, :cond_0

    iget-object v1, p0, LYr1;->a:Ljava/lang/String;

    const-string v2, "proto"

    invoke-static {v2}, LPc1;->b(Ljava/lang/String;)LPc1;

    move-result-object v2

    new-instance v3, LXr1;

    invoke-direct {v3}, LXr1;-><init>()V

    const-class v4, LkQ3;

    invoke-interface {v0, v1, v4, v2, v3}, LU96;->a(Ljava/lang/String;Ljava/lang/Class;LPc1;LC96;)LR96;

    move-result-object v0

    iput-object v0, p0, LYr1;->c:LR96;

    goto :goto_0

    :cond_0
    sget-object v0, LYr1;->d:Lad;

    const-string v1, "Flg TransportFactory is not available at the moment"

    invoke-virtual {v0, v1}, Lad;->j(Ljava/lang/String;)V

    :cond_1
    :goto_0
    iget-object v0, p0, LYr1;->c:LR96;

    if-eqz v0, :cond_2

    const/4 v0, 0x1

    goto :goto_1

    :cond_2
    const/4 v0, 0x0

    :goto_1
    return v0
.end method

.method public b(LkQ3;)V
    .locals 1

    invoke-virtual {p0}, LYr1;->a()Z

    move-result v0

    if-nez v0, :cond_0

    sget-object p1, LYr1;->d:Lad;

    const-string v0, "Unable to dispatch event because Flg Transport is not available"

    invoke-virtual {p1, v0}, Lad;->j(Ljava/lang/String;)V

    return-void

    :cond_0
    iget-object v0, p0, LYr1;->c:LR96;

    invoke-static {p1}, Lyg1;->d(Ljava/lang/Object;)Lyg1;

    move-result-object p1

    invoke-interface {v0, p1}, LR96;->a(Lyg1;)V

    return-void
.end method
