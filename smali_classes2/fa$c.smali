.class public Lfa$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LN10;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lfa;->d(Lfa$d;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "LN10<",
        "Ljava/lang/Void;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic a:Lfa$d;

.field public final synthetic b:Lfa;


# direct methods
.method public constructor <init>(Lfa;Lfa$d;)V
    .locals 0

    iput-object p1, p0, Lfa$c;->b:Lfa;

    iput-object p2, p0, Lfa$c;->a:Lfa$d;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Void;)V
    .locals 2

    iget-object p1, p0, Lfa$c;->b:Lfa;

    iget-object p1, p1, Lfa;->b:Ljava/util/Set;

    monitor-enter p1

    :try_start_0
    iget-object v0, p0, Lfa$c;->b:Lfa;

    iget-object v0, v0, Lfa;->b:Ljava/util/Set;

    iget-object v1, p0, Lfa$c;->a:Lfa$d;

    invoke-interface {v0, v1}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    monitor-exit p1

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public bridge synthetic onResponse(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Ljava/lang/Void;

    invoke-virtual {p0, p1}, Lfa$c;->a(Ljava/lang/Void;)V

    return-void
.end method
