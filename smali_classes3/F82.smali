.class public final synthetic LF82;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic b:LG82;

.field public final synthetic c:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(LG82;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LF82;->b:LG82;

    iput-object p2, p0, LF82;->c:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, LF82;->b:LG82;

    iget-object v1, p0, LF82;->c:Ljava/lang/String;

    invoke-static {v0, v1}, LG82;->n(LG82;Ljava/lang/String;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method
