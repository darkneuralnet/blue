.class public final synthetic Lvf6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LBX5$a;


# instance fields
.field public final synthetic a:LGk0;


# direct methods
.method public synthetic constructor <init>(LGk0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lvf6;->a:LGk0;

    return-void
.end method


# virtual methods
.method public final execute()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lvf6;->a:LGk0;

    invoke-interface {v0}, LGk0;->b()LJk0;

    move-result-object v0

    return-object v0
.end method
