.class public final synthetic Ler8;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lk69;


# instance fields
.field public final synthetic a:LOs8;

.field public final synthetic b:Lk69;

.field public final synthetic c:Ljava/util/concurrent/Executor;


# direct methods
.method public synthetic constructor <init>(LOs8;Lk69;Ljava/util/concurrent/Executor;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ler8;->a:LOs8;

    iput-object p2, p0, Ler8;->b:Lk69;

    iput-object p3, p0, Ler8;->c:Ljava/util/concurrent/Executor;

    return-void
.end method


# virtual methods
.method public final zza(Ljava/lang/Object;)LMb9;
    .locals 3

    iget-object v0, p0, Ler8;->a:LOs8;

    iget-object v1, p0, Ler8;->b:Lk69;

    iget-object v2, p0, Ler8;->c:Ljava/util/concurrent/Executor;

    invoke-virtual {v0, v1, v2, p1}, LOs8;->g(Lk69;Ljava/util/concurrent/Executor;Ljava/lang/Object;)LMb9;

    move-result-object p1

    return-object p1
.end method
