.class public final synthetic LRO4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LX51;


# instance fields
.field public final synthetic a:D


# direct methods
.method public synthetic constructor <init>(D)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p1, p0, LRO4;->a:D

    return-void
.end method


# virtual methods
.method public final a(D)D
    .locals 2

    iget-wide v0, p0, LRO4;->a:D

    invoke-static {v0, v1, p1, p2}, LSO4;->u(DD)D

    move-result-wide p1

    return-wide p1
.end method
