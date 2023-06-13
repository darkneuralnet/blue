.class public final synthetic Ljf6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic b:[B

.field public final synthetic c:Lkf6;

.field public final synthetic d:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>([BLkf6;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ljf6;->b:[B

    iput-object p2, p0, Ljf6;->c:Lkf6;

    iput-object p3, p0, Ljf6;->d:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Ljf6;->b:[B

    iget-object v1, p0, Ljf6;->c:Lkf6;

    iget-object v2, p0, Ljf6;->d:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Lkf6;->m([BLkf6;Ljava/lang/String;)Ljava/io/File;

    move-result-object v0

    return-object v0
.end method
