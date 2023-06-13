.class public Lf$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lh;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lf;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "b"
.end annotation


# instance fields
.field public final synthetic a:Lf;


# direct methods
.method public constructor <init>(Lf;)V
    .locals 0

    iput-object p1, p0, Lf$b;->a:Lf;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lf;Lf$a;)V
    .locals 0

    invoke-direct {p0, p1}, Lf$b;-><init>(Lf;)V

    return-void
.end method


# virtual methods
.method public a(II[B)Lg;
    .locals 3

    array-length v0, p3

    const/4 v1, 0x2

    if-ge v0, v1, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    const/4 v0, 0x1

    aget-byte v0, p3, v0

    and-int/lit16 v0, v0, 0xff

    shl-int/lit8 v0, v0, 0x8

    const/4 v1, 0x0

    aget-byte v1, p3, v1

    and-int/lit16 v1, v1, 0xff

    or-int/2addr v0, v1

    iget-object v1, p0, Lf$b;->a:Lf;

    invoke-static {v1}, Lf;->a(Lf;)Ljava/util/Map;

    move-result-object v1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/List;

    if-nez v1, :cond_1

    new-instance v1, Ld;

    invoke-direct {v1, p1, p2, p3, v0}, Ld;-><init>(II[BI)V

    return-object v1

    :cond_1
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Le;

    invoke-interface {v2, p1, p2, p3, v0}, Le;->a(II[BI)Ld;

    move-result-object v2

    if-eqz v2, :cond_2

    return-object v2

    :cond_3
    new-instance v1, Ld;

    invoke-direct {v1, p1, p2, p3, v0}, Ld;-><init>(II[BI)V

    return-object v1
.end method
