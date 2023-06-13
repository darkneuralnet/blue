.class public final synthetic LRb1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:Ljava/util/Map$Entry;

.field public final synthetic c:Ll30;


# direct methods
.method public synthetic constructor <init>(Ljava/util/Map$Entry;Ll30;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LRb1;->b:Ljava/util/Map$Entry;

    iput-object p2, p0, LRb1;->c:Ll30;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, LRb1;->b:Ljava/util/Map$Entry;

    iget-object v1, p0, LRb1;->c:Ll30;

    invoke-static {v0, v1}, LOb1$d;->g(Ljava/util/Map$Entry;Ll30;)V

    return-void
.end method
