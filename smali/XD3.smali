.class public final synthetic LXD3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LxA1;


# instance fields
.field public final synthetic a:LxA1;


# direct methods
.method public synthetic constructor <init>(LxA1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LXD3;->a:LxA1;

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, LXD3;->a:LxA1;

    check-cast p1, Ljava/util/List;

    invoke-static {v0, p1}, LYD3;->n(LxA1;Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method
