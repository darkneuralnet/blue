.class public final synthetic LcW5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LO80$c;


# instance fields
.field public final synthetic a:Ljava/util/concurrent/atomic/AtomicReference;

.field public final synthetic b:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Ljava/util/concurrent/atomic/AtomicReference;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LcW5;->a:Ljava/util/concurrent/atomic/AtomicReference;

    iput-object p2, p0, LcW5;->b:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final a(LO80$a;)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, LcW5;->a:Ljava/util/concurrent/atomic/AtomicReference;

    iget-object v1, p0, LcW5;->b:Ljava/lang/String;

    invoke-static {v0, v1, p1}, Landroidx/camera/core/o;->g(Ljava/util/concurrent/atomic/AtomicReference;Ljava/lang/String;LO80$a;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
