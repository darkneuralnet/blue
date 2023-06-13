.class public final LjZ8;
.super Loe8;
.source "SourceFile"


# instance fields
.field public b:LqM8;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LqM8<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field public c:LqM8;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LqM8<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field public d:LuT8;

.field public e:Ljava/net/HttpURLConnection;


# direct methods
.method public constructor <init>()V
    .locals 2

    sget-object v0, LQG8;->a:LQG8;

    sget-object v1, LtN8;->a:LtN8;

    invoke-direct {p0}, Loe8;-><init>()V

    iput-object v0, p0, LjZ8;->b:LqM8;

    iput-object v1, p0, LjZ8;->c:LqM8;

    const/4 v0, 0x0

    iput-object v0, p0, LjZ8;->d:LuT8;

    return-void
.end method


# virtual methods
.method public final b(LuT8;II)Ljava/net/HttpURLConnection;
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    new-instance p2, Lit8;

    const/16 p3, 0x5400

    invoke-direct {p2, p3}, Lit8;-><init>(I)V

    iput-object p2, p0, LjZ8;->b:LqM8;

    new-instance p2, LlA8;

    const/4 p3, -0x1

    invoke-direct {p2, p3}, LlA8;-><init>(I)V

    iput-object p2, p0, LjZ8;->c:LqM8;

    iput-object p1, p0, LjZ8;->d:LuT8;

    iget-object p1, p0, LjZ8;->b:LqM8;

    invoke-interface {p1}, LqM8;->zza()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    iget-object p2, p0, LjZ8;->c:LqM8;

    invoke-interface {p2}, LqM8;->zza()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {p1, p2}, Lhm8;->b(II)V

    iget-object p1, p0, LjZ8;->d:LuT8;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-interface {p1}, LuT8;->zza()Ljava/net/URLConnection;

    move-result-object p1

    check-cast p1, Ljava/net/HttpURLConnection;

    iput-object p1, p0, LjZ8;->e:Ljava/net/HttpURLConnection;

    return-object p1
.end method

.method public final close()V
    .locals 1

    iget-object v0, p0, LjZ8;->e:Ljava/net/HttpURLConnection;

    invoke-static {}, Lhm8;->a()V

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/net/HttpURLConnection;->disconnect()V

    :cond_0
    return-void
.end method
