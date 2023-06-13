.class public final LIZ8;
.super Len7;
.source "SourceFile"


# instance fields
.field public final synthetic d:LD99;


# direct methods
.method public constructor <init>(Lg59;Ljava/lang/String;LD99;)V
    .locals 0

    iput-object p3, p0, LIZ8;->d:LD99;

    const-string p1, "getValue"

    invoke-direct {p0, p1}, Len7;-><init>(Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public final d(Lam8;Ljava/util/List;)LXs7;
    .locals 2

    const-string v0, "getValue"

    const/4 v1, 0x2

    invoke-static {v0, v1, p2}, Lbt8;->h(Ljava/lang/String;ILjava/util/List;)V

    const/4 v0, 0x0

    invoke-interface {p2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LXs7;

    invoke-virtual {p1, v0}, Lam8;->b(LXs7;)LXs7;

    move-result-object v0

    const/4 v1, 0x1

    invoke-interface {p2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, LXs7;

    invoke-virtual {p1, p2}, Lam8;->b(LXs7;)LXs7;

    move-result-object p1

    invoke-interface {v0}, LXs7;->zzi()Ljava/lang/String;

    move-result-object p2

    iget-object v0, p0, LIZ8;->d:LD99;

    invoke-interface {v0, p2}, LD99;->zza(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    if-eqz p2, :cond_0

    new-instance p1, Liw7;

    invoke-direct {p1, p2}, Liw7;-><init>(Ljava/lang/String;)V

    :cond_0
    return-object p1
.end method
