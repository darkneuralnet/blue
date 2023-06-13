.class public final synthetic Lvw8;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:LRC8;

.field public final synthetic c:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(LRC8;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lvw8;->b:LRC8;

    iput-object p2, p0, Lvw8;->c:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Lvw8;->b:LRC8;

    iget-object v1, p0, Lvw8;->c:Ljava/lang/String;

    iget-object v2, v0, Lns8;->a:LPn8;

    invoke-virtual {v2}, LPn8;->y()Lla8;

    move-result-object v2

    invoke-virtual {v2, v1}, Lla8;->t(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v0, v0, Lns8;->a:LPn8;

    invoke-virtual {v0}, LPn8;->y()Lla8;

    move-result-object v0

    invoke-virtual {v0}, Lla8;->s()V

    :cond_0
    return-void
.end method
