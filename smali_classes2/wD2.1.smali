.class public final synthetic LwD2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LVD2;


# instance fields
.field public final synthetic a:Ljava/lang/String;

.field public final synthetic b:Ljava/util/concurrent/atomic/AtomicBoolean;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;Ljava/util/concurrent/atomic/AtomicBoolean;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LwD2;->a:Ljava/lang/String;

    iput-object p2, p0, LwD2;->b:Ljava/util/concurrent/atomic/AtomicBoolean;

    return-void
.end method


# virtual methods
.method public final onResult(Ljava/lang/Object;)V
    .locals 2

    iget-object v0, p0, LwD2;->a:Ljava/lang/String;

    iget-object v1, p0, LwD2;->b:Ljava/util/concurrent/atomic/AtomicBoolean;

    check-cast p1, LrD2;

    invoke-static {v0, v1, p1}, LAD2;->d(Ljava/lang/String;Ljava/util/concurrent/atomic/AtomicBoolean;LrD2;)V

    return-void
.end method
