.class public LMC1$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LMC1$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LMC1;->a(LMC1$b;)LMC1$b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "LMC1$b<",
        "TT;>;"
    }
.end annotation


# instance fields
.field public volatile a:Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TT;"
        }
    .end annotation
.end field

.field public final synthetic b:LMC1$b;


# direct methods
.method public constructor <init>(LMC1$b;)V
    .locals 0

    iput-object p1, p0, LMC1$a;->b:LMC1$b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public get()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    iget-object v0, p0, LMC1$a;->a:Ljava/lang/Object;

    if-nez v0, :cond_1

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, LMC1$a;->a:Ljava/lang/Object;

    if-nez v0, :cond_0

    iget-object v0, p0, LMC1$a;->b:LMC1$b;

    invoke-interface {v0}, LMC1$b;->get()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, LzZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    iput-object v0, p0, LMC1$a;->a:Ljava/lang/Object;

    :cond_0
    monitor-exit p0

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0

    :cond_1
    :goto_0
    iget-object v0, p0, LMC1$a;->a:Ljava/lang/Object;

    return-object v0
.end method
