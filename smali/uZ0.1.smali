.class public LuZ0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final d:Ljava/lang/String;


# instance fields
.field public final a:LbE1;

.field public final b:Lfd5;

.field public final c:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Runnable;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const-string v0, "DelayedWorkTracker"

    invoke-static {v0}, LBx2;->i(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    sput-object v0, LuZ0;->d:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(LbE1;Lfd5;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LuZ0;->a:LbE1;

    iput-object p2, p0, LuZ0;->b:Lfd5;

    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iput-object p1, p0, LuZ0;->c:Ljava/util/Map;

    return-void
.end method


# virtual methods
.method public a(LHG6;)V
    .locals 5

    iget-object v0, p0, LuZ0;->c:Ljava/util/Map;

    iget-object v1, p1, LHG6;->a:Ljava/lang/String;

    invoke-interface {v0, v1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Runnable;

    if-eqz v0, :cond_0

    iget-object v1, p0, LuZ0;->b:Lfd5;

    invoke-interface {v1, v0}, Lfd5;->a(Ljava/lang/Runnable;)V

    :cond_0
    new-instance v0, LuZ0$a;

    invoke-direct {v0, p0, p1}, LuZ0$a;-><init>(LuZ0;LHG6;)V

    iget-object v1, p0, LuZ0;->c:Ljava/util/Map;

    iget-object v2, p1, LHG6;->a:Ljava/lang/String;

    invoke-interface {v1, v2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    invoke-virtual {p1}, LHG6;->c()J

    move-result-wide v3

    sub-long/2addr v3, v1

    iget-object p1, p0, LuZ0;->b:Lfd5;

    invoke-interface {p1, v3, v4, v0}, Lfd5;->b(JLjava/lang/Runnable;)V

    return-void
.end method

.method public b(Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, LuZ0;->c:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Runnable;

    if-eqz p1, :cond_0

    iget-object v0, p0, LuZ0;->b:Lfd5;

    invoke-interface {v0, p1}, Lfd5;->a(Ljava/lang/Runnable;)V

    :cond_0
    return-void
.end method
