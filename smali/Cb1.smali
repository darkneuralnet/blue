.class public final synthetic LCb1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:LOb1;

.field public final synthetic c:Ljava/util/List;

.field public final synthetic d:Ljava/lang/Runnable;


# direct methods
.method public synthetic constructor <init>(LOb1;Ljava/util/List;Ljava/lang/Runnable;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LCb1;->b:LOb1;

    iput-object p2, p0, LCb1;->c:Ljava/util/List;

    iput-object p3, p0, LCb1;->d:Ljava/lang/Runnable;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, LCb1;->b:LOb1;

    iget-object v1, p0, LCb1;->c:Ljava/util/List;

    iget-object v2, p0, LCb1;->d:Ljava/lang/Runnable;

    invoke-static {v0, v1, v2}, LOb1;->n(LOb1;Ljava/util/List;Ljava/lang/Runnable;)V

    return-void
.end method
