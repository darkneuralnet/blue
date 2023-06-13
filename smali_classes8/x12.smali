.class public Lx12;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LNW3;


# instance fields
.field public a:LWB1;


# direct methods
.method public constructor <init>(LWB1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lx12;->a:LWB1;

    return-void
.end method


# virtual methods
.method public a(LyB0;)I
    .locals 2

    new-instance v0, LMW3;

    invoke-direct {v0}, LMW3;-><init>()V

    iget-object v1, p0, Lx12;->a:LWB1;

    invoke-virtual {v0, p1, v1}, LMW3;->b(LyB0;LWB1;)I

    move-result p1

    return p1
.end method
