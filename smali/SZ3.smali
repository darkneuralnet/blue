.class public final LSZ3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LRZ3;


# instance fields
.field public final a:LEb5;

.field public final b:Lcf1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcf1<",
            "LQZ3;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(LEb5;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LSZ3;->a:LEb5;

    new-instance v0, LSZ3$a;

    invoke-direct {v0, p0, p1}, LSZ3$a;-><init>(LSZ3;LEb5;)V

    iput-object v0, p0, LSZ3;->b:Lcf1;

    return-void
.end method

.method public static c()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/Class<",
            "*>;>;"
        }
    .end annotation

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public a(LQZ3;)V
    .locals 1

    iget-object v0, p0, LSZ3;->a:LEb5;

    invoke-virtual {v0}, LEb5;->b()V

    iget-object v0, p0, LSZ3;->a:LEb5;

    invoke-virtual {v0}, LEb5;->c()V

    :try_start_0
    iget-object v0, p0, LSZ3;->b:Lcf1;

    invoke-virtual {v0, p1}, Lcf1;->k(Ljava/lang/Object;)V

    iget-object p1, p0, LSZ3;->a:LEb5;

    invoke-virtual {p1}, LEb5;->A()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object p1, p0, LSZ3;->a:LEb5;

    invoke-virtual {p1}, LEb5;->g()V

    return-void

    :catchall_0
    move-exception p1

    iget-object v0, p0, LSZ3;->a:LEb5;

    invoke-virtual {v0}, LEb5;->g()V

    throw p1
.end method

.method public b(Ljava/lang/String;)Ljava/lang/Long;
    .locals 4

    const-string v0, "SELECT long_value FROM Preference where `key`=?"

    const/4 v1, 0x1

    invoke-static {v0, v1}, LHb5;->c(Ljava/lang/String;I)LHb5;

    move-result-object v0

    if-nez p1, :cond_0

    invoke-virtual {v0, v1}, LHb5;->m1(I)V

    goto :goto_0

    :cond_0
    invoke-virtual {v0, v1, p1}, LHb5;->G0(ILjava/lang/String;)V

    :goto_0
    iget-object p1, p0, LSZ3;->a:LEb5;

    invoke-virtual {p1}, LEb5;->b()V

    iget-object p1, p0, LSZ3;->a:LEb5;

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-static {p1, v0, v1, v2}, LIF0;->c(LEb5;LpV5;ZLandroid/os/CancellationSignal;)Landroid/database/Cursor;

    move-result-object p1

    :try_start_0
    invoke-interface {p1}, Landroid/database/Cursor;->moveToFirst()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-interface {p1, v1}, Landroid/database/Cursor;->isNull(I)Z

    move-result v3

    if-eqz v3, :cond_1

    goto :goto_1

    :cond_1
    invoke-interface {p1, v1}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_2
    :goto_1
    invoke-interface {p1}, Landroid/database/Cursor;->close()V

    invoke-virtual {v0}, LHb5;->release()V

    return-object v2

    :catchall_0
    move-exception v1

    invoke-interface {p1}, Landroid/database/Cursor;->close()V

    invoke-virtual {v0}, LHb5;->release()V

    throw v1
.end method
