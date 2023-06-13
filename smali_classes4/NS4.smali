.class public final synthetic LNS4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic b:[B

.field public final synthetic c:LIT4;

.field public final synthetic d:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>([BLIT4;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LNS4;->b:[B

    iput-object p2, p0, LNS4;->c:LIT4;

    iput-object p3, p0, LNS4;->d:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, LNS4;->b:[B

    iget-object v1, p0, LNS4;->c:LIT4;

    iget-object v2, p0, LNS4;->d:Ljava/lang/String;

    invoke-static {v0, v1, v2}, LIT4;->U1([BLIT4;Ljava/lang/String;)Ljava/io/File;

    move-result-object v0

    return-object v0
.end method
