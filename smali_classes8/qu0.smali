.class public final Lqu0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lqu0$a;
    }
.end annotation


# instance fields
.field public final a:Ljava/util/BitSet;


# direct methods
.method public constructor <init>(Ljava/util/BitSet;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lqu0;->a:Ljava/util/BitSet;

    return-void
.end method

.method public static a([Ljava/lang/Object;Ljava/util/function/Predicate;)Lqu0;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">([TT;",
            "Ljava/util/function/Predicate<",
            "TT;>;)",
            "Lqu0;"
        }
    .end annotation

    new-instance v0, Ljava/util/BitSet;

    array-length v1, p0

    invoke-direct {v0, v1}, Ljava/util/BitSet;-><init>(I)V

    array-length v1, p0

    const/4 v2, 0x0

    move v3, v2

    :goto_0
    if-ge v2, v1, :cond_1

    aget-object v4, p0, v2

    invoke-interface {p1, v4}, Ljava/util/function/Predicate;->test(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_0

    invoke-virtual {v0, v3}, Ljava/util/BitSet;->set(I)V

    :cond_0
    add-int/lit8 v3, v3, 0x1

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    new-instance p0, Lqu0;

    invoke-direct {p0, v0}, Lqu0;-><init>(Ljava/util/BitSet;)V

    return-object p0
.end method


# virtual methods
.method public b(Lqu0$a;)V
    .locals 3

    const/4 v0, 0x0

    :goto_0
    iget-object v1, p0, Lqu0;->a:Ljava/util/BitSet;

    invoke-virtual {v1, v0}, Ljava/util/BitSet;->nextSetBit(I)I

    move-result v0

    const/4 v1, -0x1

    if-le v0, v1, :cond_1

    iget-object v2, p0, Lqu0;->a:Ljava/util/BitSet;

    invoke-virtual {v2, v0}, Ljava/util/BitSet;->nextClearBit(I)I

    move-result v2

    if-ne v2, v1, :cond_0

    iget-object v1, p0, Lqu0;->a:Ljava/util/BitSet;

    invoke-virtual {v1}, Ljava/util/BitSet;->size()I

    move-result v1

    invoke-interface {p1, v0, v1}, Lqu0$a;->a(II)V

    return-void

    :cond_0
    invoke-interface {p1, v0, v2}, Lqu0$a;->a(II)V

    move v0, v2

    goto :goto_0

    :cond_1
    return-void
.end method
