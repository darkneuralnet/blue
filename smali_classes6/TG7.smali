.class public final synthetic LTG7;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic b:LCI7;

.field public final synthetic c:LEm9;


# direct methods
.method public synthetic constructor <init>(LCI7;LEm9;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LTG7;->b:LCI7;

    iput-object p2, p0, LTG7;->c:LEm9;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, LTG7;->b:LCI7;

    iget-object v1, p0, LTG7;->c:LEm9;

    invoke-virtual {v0, v1}, LCI7;->b(LEm9;)LEm9;

    move-result-object v0

    return-object v0
.end method
