.class public final synthetic Ls30;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic b:Lw30;

.field public final synthetic c:Ljava/io/File;


# direct methods
.method public synthetic constructor <init>(Lw30;Ljava/io/File;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ls30;->b:Lw30;

    iput-object p2, p0, Ls30;->c:Ljava/io/File;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Ls30;->b:Lw30;

    iget-object v1, p0, Ls30;->c:Ljava/io/File;

    invoke-static {v0, v1}, Lw30;->c(Lw30;Ljava/io/File;)Ljava/io/File;

    move-result-object v0

    return-object v0
.end method
