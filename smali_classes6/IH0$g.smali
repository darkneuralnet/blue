.class public final LIH0$g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LC21;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LIH0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "g"
.end annotation


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:LIH0$c;

.field public final c:LIH0$g;

.field public d:LZ94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LZ94<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public e:LZ94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LZ94<",
            "Landroid/bluetooth/BluetoothDevice;",
            ">;"
        }
    .end annotation
.end field

.field public f:LZ94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LZ94<",
            "Lgy0$a;",
            ">;"
        }
    .end annotation
.end field

.field public g:LZ94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LZ94<",
            "LLy0;",
            ">;"
        }
    .end annotation
.end field

.field public h:LZ94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LZ94<",
            "LAG<",
            "Lke5$a;",
            ">;>;"
        }
    .end annotation
.end field

.field public i:LZ94;

.field public j:LZ94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LZ94<",
            "Lxy0;",
            ">;"
        }
    .end annotation
.end field

.field public k:LZ94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LZ94<",
            "LL46;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(LIH0$c;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p0, p0, LIH0$g;->c:LIH0$g;

    iput-object p1, p0, LIH0$g;->b:LIH0$c;

    iput-object p2, p0, LIH0$g;->a:Ljava/lang/String;

    invoke-virtual {p0, p2}, LIH0$g;->j(Ljava/lang/String;)V

    return-void
.end method

.method public synthetic constructor <init>(LIH0$c;Ljava/lang/String;LIH0$a;)V
    .locals 0

    invoke-direct {p0, p1, p2}, LIH0$g;-><init>(LIH0$c;Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic b(LIH0$g;)LZ94;
    .locals 0

    iget-object p0, p0, LIH0$g;->k:LZ94;

    return-object p0
.end method

.method public static synthetic c(LIH0$g;)LZ94;
    .locals 0

    iget-object p0, p0, LIH0$g;->j:LZ94;

    return-object p0
.end method

.method public static synthetic d(LIH0$g;)Landroid/bluetooth/BluetoothDevice;
    .locals 0

    invoke-virtual {p0}, LIH0$g;->i()Landroid/bluetooth/BluetoothDevice;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(LIH0$g;)LL46;
    .locals 0

    invoke-virtual {p0}, LIH0$g;->k()LL46;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(LIH0$g;)LIH0$c;
    .locals 0

    iget-object p0, p0, LIH0$g;->b:LIH0$c;

    return-object p0
.end method

.method public static synthetic g(LIH0$g;)LIH0$g;
    .locals 0

    iget-object p0, p0, LIH0$g;->c:LIH0$g;

    return-object p0
.end method

.method public static synthetic h(LIH0$g;)LZ94;
    .locals 0

    iget-object p0, p0, LIH0$g;->d:LZ94;

    return-object p0
.end method


# virtual methods
.method public a()Lne5;
    .locals 1

    iget-object v0, p0, LIH0$g;->i:LZ94;

    invoke-interface {v0}, LZ94;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lne5;

    return-object v0
.end method

.method public final i()Landroid/bluetooth/BluetoothDevice;
    .locals 2

    iget-object v0, p0, LIH0$g;->a:Ljava/lang/String;

    iget-object v1, p0, LIH0$g;->b:LIH0$c;

    invoke-static {v1}, LIH0$c;->d(LIH0$c;)Lpd5;

    move-result-object v1

    invoke-static {v0, v1}, LJ21;->c(Ljava/lang/String;Lpd5;)Landroid/bluetooth/BluetoothDevice;

    move-result-object v0

    return-object v0
.end method

.method public final j(Ljava/lang/String;)V
    .locals 3

    invoke-static {p1}, Le52;->a(Ljava/lang/Object;)Ltj1;

    move-result-object p1

    iput-object p1, p0, LIH0$g;->d:LZ94;

    iget-object v0, p0, LIH0$g;->b:LIH0$c;

    invoke-static {v0}, LIH0$c;->i(LIH0$c;)LZ94;

    move-result-object v0

    invoke-static {p1, v0}, LJ21;->a(LZ94;LZ94;)LJ21;

    move-result-object p1

    iput-object p1, p0, LIH0$g;->e:LZ94;

    new-instance p1, LIH0$g$a;

    invoke-direct {p1, p0}, LIH0$g$a;-><init>(LIH0$g;)V

    iput-object p1, p0, LIH0$g;->f:LZ94;

    iget-object p1, p0, LIH0$g;->b:LIH0$c;

    invoke-static {p1}, LIH0$c;->c(LIH0$c;)LZ94;

    move-result-object p1

    iget-object v0, p0, LIH0$g;->f:LZ94;

    iget-object v1, p0, LIH0$g;->b:LIH0$c;

    invoke-static {v1}, LIH0$c;->k(LIH0$c;)LZ94;

    move-result-object v1

    invoke-static {p1, v0, v1}, LMy0;->a(LZ94;LZ94;LZ94;)LMy0;

    move-result-object p1

    iput-object p1, p0, LIH0$g;->g:LZ94;

    invoke-static {}, LL21;->a()LL21;

    move-result-object p1

    invoke-static {p1}, LW51;->b(LZ94;)LZ94;

    move-result-object p1

    iput-object p1, p0, LIH0$g;->h:LZ94;

    iget-object v0, p0, LIH0$g;->e:LZ94;

    iget-object v1, p0, LIH0$g;->g:LZ94;

    iget-object v2, p0, LIH0$g;->b:LIH0$c;

    invoke-static {v2}, LIH0$c;->e(LIH0$c;)LZ94;

    move-result-object v2

    invoke-static {v0, v1, p1, v2}, Lre5;->a(LZ94;LZ94;LZ94;LZ94;)Lre5;

    move-result-object p1

    invoke-static {p1}, LW51;->b(LZ94;)LZ94;

    move-result-object p1

    iput-object p1, p0, LIH0$g;->i:LZ94;

    iget-object p1, p0, LIH0$g;->h:LZ94;

    invoke-static {p1}, LK21;->a(LZ94;)LK21;

    move-result-object p1

    invoke-static {p1}, LW51;->b(LZ94;)LZ94;

    move-result-object p1

    iput-object p1, p0, LIH0$g;->j:LZ94;

    invoke-static {}, Lmk0;->a()Lmk0;

    move-result-object p1

    invoke-static {p1}, LN21;->a(LZ94;)LN21;

    move-result-object p1

    iput-object p1, p0, LIH0$g;->k:LZ94;

    return-void
.end method

.method public final k()LL46;
    .locals 1

    invoke-static {}, Lmk0;->c()Lio/reactivex/E;

    move-result-object v0

    invoke-static {v0}, LM21;->a(Lio/reactivex/E;)LL46;

    move-result-object v0

    return-object v0
.end method
