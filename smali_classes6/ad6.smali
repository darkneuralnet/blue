.class public final Lad6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LnH6;


# instance fields
.field public final a:LF81;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, LF81;

    invoke-direct {v0}, LF81;-><init>()V

    iput-object v0, p0, Lad6;->a:LF81;

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;LQx;IILjava/util/Map;)LET;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "LQx;",
            "II",
            "Ljava/util/Map<",
            "Leb1;",
            "*>;)",
            "LET;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/zxing/WriterException;
        }
    .end annotation

    sget-object v0, LQx;->p:LQx;

    if-ne p2, v0, :cond_0

    iget-object v1, p0, Lad6;->a:LF81;

    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    const-string p2, "0"

    invoke-virtual {p2, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    sget-object v3, LQx;->i:LQx;

    move v4, p3

    move v5, p4

    move-object v6, p5

    invoke-virtual/range {v1 .. v6}, LF81;->a(Ljava/lang/String;LQx;IILjava/util/Map;)LET;

    move-result-object p1

    return-object p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-static {p2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    const-string p3, "Can only encode UPC-A, but got "

    invoke-virtual {p3, p2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
