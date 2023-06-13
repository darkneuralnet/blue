.class public LrM5;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:D

.field public b:LUj2;


# direct methods
.method public constructor <init>(D)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p1, p0, LrM5;->a:D

    new-instance v0, LUj2;

    invoke-direct {v0, p1, p2}, LUj2;-><init>(D)V

    iput-object v0, p0, LrM5;->b:LUj2;

    return-void
.end method


# virtual methods
.method public a(LyB0;)LyB0;
    .locals 1

    iget-object v0, p0, LrM5;->b:LUj2;

    invoke-virtual {v0, p1}, LUj2;->b(LyB0;)LSj2;

    move-result-object p1

    invoke-virtual {p1}, LSj2;->a()LyB0;

    move-result-object p1

    return-object p1
.end method
