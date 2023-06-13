.class public final LAi7;
.super LNf7;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x4

    invoke-direct {p0, v0}, LNf7;-><init>(I)V

    return-void
.end method

.method public constructor <init>(I)V
    .locals 0

    const/4 p1, 0x4

    invoke-direct {p0, p1}, LNf7;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final c(Ljava/lang/Object;)LAi7;
    .locals 0

    invoke-super {p0, p1}, LNf7;->a(Ljava/lang/Object;)LNf7;

    return-object p0
.end method

.method public final d(Ljava/util/Iterator;)LAi7;
    .locals 1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    invoke-super {p0, v0}, LNf7;->a(Ljava/lang/Object;)LNf7;

    goto :goto_0

    :cond_0
    return-object p0
.end method
