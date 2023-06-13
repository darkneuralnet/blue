.class public final synthetic Lyb1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LO80$c;


# instance fields
.field public final synthetic a:Ljava/util/concurrent/atomic/AtomicReference;


# direct methods
.method public synthetic constructor <init>(Ljava/util/concurrent/atomic/AtomicReference;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lyb1;->a:Ljava/util/concurrent/atomic/AtomicReference;

    return-void
.end method


# virtual methods
.method public final a(LO80$a;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lyb1;->a:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-static {v0, p1}, LOb1;->v(Ljava/util/concurrent/atomic/AtomicReference;LO80$a;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
