.class public final LhL7;
.super Lxz7;
.source "SourceFile"


# instance fields
.field public final transient d:Lvy7;

.field public final transient e:Lbw7;


# direct methods
.method public constructor <init>(Lvy7;Lbw7;)V
    .locals 0

    invoke-direct {p0}, Lxz7;-><init>()V

    iput-object p1, p0, LhL7;->d:Lvy7;

    iput-object p2, p0, LhL7;->e:Lbw7;

    return-void
.end method


# virtual methods
.method public final a([Ljava/lang/Object;I)I
    .locals 1

    iget-object p2, p0, LhL7;->e:Lbw7;

    const/4 v0, 0x0

    invoke-virtual {p2, p1, v0}, Lns7;->a([Ljava/lang/Object;I)I

    move-result p1

    return p1
.end method

.method public final contains(Ljava/lang/Object;)Z
    .locals 1

    iget-object v0, p0, LhL7;->d:Lvy7;

    invoke-virtual {v0, p1}, Lvy7;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final e()LZM7;
    .locals 2

    iget-object v0, p0, LhL7;->e:Lbw7;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lbw7;->u(I)LqN7;

    move-result-object v0

    return-object v0
.end method

.method public final synthetic iterator()Ljava/util/Iterator;
    .locals 2

    iget-object v0, p0, LhL7;->e:Lbw7;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lbw7;->u(I)LqN7;

    move-result-object v0

    return-object v0
.end method

.method public final size()I
    .locals 1

    iget-object v0, p0, LhL7;->d:Lvy7;

    invoke-interface {v0}, Ljava/util/Map;->size()I

    move-result v0

    return v0
.end method
