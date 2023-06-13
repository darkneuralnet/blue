.class public final LI59;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Comparator;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 4

    check-cast p1, LT69;

    check-cast p2, LT69;

    new-instance v0, Ls59;

    invoke-direct {v0, p1}, Ls59;-><init>(LT69;)V

    new-instance v1, Ls59;

    invoke-direct {v1, p2}, Ls59;-><init>(LT69;)V

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v0}, Lg69;->zza()B

    move-result v2

    and-int/lit16 v2, v2, 0xff

    invoke-interface {v1}, Lg69;->zza()B

    move-result v3

    and-int/lit16 v3, v3, 0xff

    invoke-static {v2, v3}, LA59;->a(II)I

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_1
    invoke-virtual {p1}, LT69;->c()I

    move-result p1

    invoke-virtual {p2}, LT69;->c()I

    move-result p2

    invoke-static {p1, p2}, LA59;->a(II)I

    move-result v2

    :goto_0
    return v2
.end method
