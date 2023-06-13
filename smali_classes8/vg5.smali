.class public Lvg5;
.super Ltg5;
.source "SourceFile"


# instance fields
.field public final d:[B


# direct methods
.method public constructor <init>([BLjava/lang/String;)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0, p2}, Ltg5;-><init>(ZLjava/lang/String;)V

    invoke-static {p1}, LAo;->d([B)[B

    move-result-object p1

    iput-object p1, p0, Lvg5;->d:[B

    return-void
.end method


# virtual methods
.method public b()[B
    .locals 1

    iget-object v0, p0, Lvg5;->d:[B

    invoke-static {v0}, LAo;->d([B)[B

    move-result-object v0

    return-object v0
.end method
