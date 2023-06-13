.class public final synthetic LKO4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LX51;


# instance fields
.field public final synthetic a:LSO4;


# direct methods
.method public synthetic constructor <init>(LSO4;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LKO4;->a:LSO4;

    return-void
.end method


# virtual methods
.method public final a(D)D
    .locals 1

    iget-object v0, p0, LKO4;->a:LSO4;

    invoke-static {v0, p1, p2}, LSO4;->s(LSO4;D)D

    move-result-wide p1

    return-wide p1
.end method
