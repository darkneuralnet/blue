.class public final LH08;
.super Lbm9;
.source "SourceFile"

# interfaces
.implements LPp9;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lbm9<",
        "Lz18;",
        "LH08;",
        ">;",
        "LPp9;"
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 1

    invoke-static {}, Lz18;->w()Lz18;

    move-result-object v0

    invoke-direct {p0, v0}, Lbm9;-><init>(LEm9;)V

    return-void
.end method

.method public synthetic constructor <init>(Lu08;)V
    .locals 0

    invoke-static {}, Lz18;->w()Lz18;

    move-result-object p1

    invoke-direct {p0, p1}, Lbm9;-><init>(LEm9;)V

    return-void
.end method


# virtual methods
.method public final A(Ljava/lang/String;Lq28;)LH08;
    .locals 1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-boolean v0, p0, Lbm9;->d:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lbm9;->w()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lbm9;->d:Z

    :cond_0
    iget-object v0, p0, Lbm9;->c:LEm9;

    check-cast v0, Lz18;

    invoke-static {v0}, Lz18;->y(Lz18;)Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object p0
.end method

.method public final y(Ljava/lang/String;LR28;)LH08;
    .locals 1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-boolean v0, p0, Lbm9;->d:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lbm9;->w()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lbm9;->d:Z

    :cond_0
    iget-object v0, p0, Lbm9;->c:LEm9;

    check-cast v0, Lz18;

    invoke-static {v0}, Lz18;->A(Lz18;)Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object p0
.end method
