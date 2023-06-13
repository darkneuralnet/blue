.class public final synthetic LmX8;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic b:LGX8;


# direct methods
.method public synthetic constructor <init>(LGX8;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LmX8;->b:LGX8;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, LmX8;->b:LGX8;

    invoke-virtual {v0}, LGX8;->a()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
