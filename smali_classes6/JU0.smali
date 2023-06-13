.class public final synthetic LJU0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic b:LKU0;

.field public final synthetic c:Lsh1;


# direct methods
.method public synthetic constructor <init>(LKU0;Lsh1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LJU0;->b:LKU0;

    iput-object p2, p0, LJU0;->c:Lsh1;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, LJU0;->b:LKU0;

    iget-object v1, p0, LJU0;->c:Lsh1;

    invoke-static {v0, v1}, LKU0;->d(LKU0;Lsh1;)LXh;

    move-result-object v0

    return-object v0
.end method
