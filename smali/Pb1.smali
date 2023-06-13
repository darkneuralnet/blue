.class public final synthetic LPb1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:LZd3$a;

.field public final synthetic c:Ll30;


# direct methods
.method public synthetic constructor <init>(LZd3$a;Ll30;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LPb1;->b:LZd3$a;

    iput-object p2, p0, LPb1;->c:Ll30;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, LPb1;->b:LZd3$a;

    iget-object v1, p0, LPb1;->c:Ll30;

    invoke-static {v0, v1}, LOb1$d;->h(LZd3$a;Ll30;)V

    return-void
.end method
