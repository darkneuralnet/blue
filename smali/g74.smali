.class public final synthetic Lg74;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic b:Li74;

.field public final synthetic c:Ljava/util/ArrayList;

.field public final synthetic d:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Li74;Ljava/util/ArrayList;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lg74;->b:Li74;

    iput-object p2, p0, Lg74;->c:Ljava/util/ArrayList;

    iput-object p3, p0, Lg74;->d:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Lg74;->b:Li74;

    iget-object v1, p0, Lg74;->c:Ljava/util/ArrayList;

    iget-object v2, p0, Lg74;->d:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Li74;->f(Li74;Ljava/util/ArrayList;Ljava/lang/String;)LHG6;

    move-result-object v0

    return-object v0
.end method
