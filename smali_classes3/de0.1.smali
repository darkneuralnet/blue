.class public final synthetic Lde0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic b:Lee0;


# direct methods
.method public synthetic constructor <init>(Lee0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lde0;->b:Lee0;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lde0;->b:Lee0;

    invoke-static {v0}, Lee0;->a(Lee0;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method
