.class public final synthetic LXN7;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lk69;


# instance fields
.field public final synthetic a:LmO7;

.field public final synthetic b:Ljava/lang/String;

.field public final synthetic c:Ljava/lang/String;

.field public final synthetic d:LOU7;

.field public final synthetic e:Ljava/util/concurrent/atomic/AtomicReference;


# direct methods
.method public synthetic constructor <init>(LmO7;Ljava/lang/String;Ljava/lang/String;LOU7;Ljava/util/concurrent/atomic/AtomicReference;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LXN7;->a:LmO7;

    iput-object p2, p0, LXN7;->b:Ljava/lang/String;

    iput-object p3, p0, LXN7;->c:Ljava/lang/String;

    iput-object p4, p0, LXN7;->d:LOU7;

    iput-object p5, p0, LXN7;->e:Ljava/util/concurrent/atomic/AtomicReference;

    return-void
.end method


# virtual methods
.method public final zza(Ljava/lang/Object;)LMb9;
    .locals 6

    iget-object v0, p0, LXN7;->a:LmO7;

    iget-object v1, p0, LXN7;->b:Ljava/lang/String;

    iget-object v2, p0, LXN7;->c:Ljava/lang/String;

    iget-object v3, p0, LXN7;->d:LOU7;

    iget-object v4, p0, LXN7;->e:Ljava/util/concurrent/atomic/AtomicReference;

    move-object v5, p1

    check-cast v5, Lz18;

    invoke-virtual/range {v0 .. v5}, LmO7;->d(Ljava/lang/String;Ljava/lang/String;LOU7;Ljava/util/concurrent/atomic/AtomicReference;Lz18;)LMb9;

    move-result-object p1

    return-object p1
.end method
