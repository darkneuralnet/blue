.class public final synthetic LSb1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:LOb1$d;

.field public final synthetic c:LZd3$a;


# direct methods
.method public synthetic constructor <init>(LOb1$d;LZd3$a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LSb1;->b:LOb1$d;

    iput-object p2, p0, LSb1;->c:LZd3$a;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, LSb1;->b:LOb1$d;

    iget-object v1, p0, LSb1;->c:LZd3$a;

    invoke-static {v0, v1}, LOb1$d;->e(LOb1$d;LZd3$a;)V

    return-void
.end method
