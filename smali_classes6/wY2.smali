.class public final LwY2;
.super Lzy3;
.source "SourceFile"

# interfaces
.implements Ljava/io/Serializable;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lzy3<",
        "Ljava/lang/Comparable<",
        "*>;>;",
        "Ljava/io/Serializable;"
    }
.end annotation


# static fields
.field public static final b:LwY2;

.field private static final serialVersionUID:J


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, LwY2;

    invoke-direct {v0}, LwY2;-><init>()V

    sput-object v0, LwY2;->b:LwY2;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lzy3;-><init>()V

    return-void
.end method

.method private readResolve()Ljava/lang/Object;
    .locals 1

    sget-object v0, LwY2;->b:LwY2;

    return-object v0
.end method


# virtual methods
.method public bridge synthetic compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 0

    check-cast p1, Ljava/lang/Comparable;

    check-cast p2, Ljava/lang/Comparable;

    invoke-virtual {p0, p1, p2}, LwY2;->h(Ljava/lang/Comparable;Ljava/lang/Comparable;)I

    move-result p1

    return p1
.end method

.method public f()Lzy3;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<S::",
            "Ljava/lang/Comparable<",
            "*>;>()",
            "Lzy3<",
            "TS;>;"
        }
    .end annotation

    sget-object v0, LyO4;->b:LyO4;

    return-object v0
.end method

.method public h(Ljava/lang/Comparable;Ljava/lang/Comparable;)I
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Comparable<",
            "*>;",
            "Ljava/lang/Comparable<",
            "*>;)I"
        }
    .end annotation

    invoke-static {p1}, LEZ3;->n(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p2}, LEZ3;->n(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-interface {p1, p2}, Ljava/lang/Comparable;->compareTo(Ljava/lang/Object;)I

    move-result p1

    return p1
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    const-string v0, "Ordering.natural()"

    return-object v0
.end method
