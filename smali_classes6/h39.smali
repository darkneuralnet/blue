.class public final Lh39;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<V:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Ljava/lang/Runnable;"
    }
.end annotation


# instance fields
.field public final b:Lv39;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lv39<",
            "TV;>;"
        }
    .end annotation
.end field

.field public final c:LMb9;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LMb9<",
            "+TV;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lv39;LMb9;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lv39<",
            "TV;>;",
            "LMb9<",
            "+TV;>;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lh39;->b:Lv39;

    iput-object p2, p0, Lh39;->c:LMb9;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Lh39;->b:Lv39;

    invoke-static {v0}, Lv39;->p(Lv39;)Ljava/lang/Object;

    move-result-object v0

    if-eq v0, p0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lh39;->c:LMb9;

    invoke-static {v0}, Lv39;->r(LMb9;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {}, Lv39;->j()Lc39;

    move-result-object v1

    iget-object v2, p0, Lh39;->b:Lv39;

    invoke-virtual {v1, v2, p0, v0}, Lc39;->d(Lv39;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lh39;->b:Lv39;

    invoke-static {v0}, Lv39;->s(Lv39;)V

    :cond_1
    return-void
.end method
