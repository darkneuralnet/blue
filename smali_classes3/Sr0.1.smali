.class public final synthetic LSr0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/reactivex/functions/a;


# instance fields
.field public final synthetic b:Lzr0;

.field public final synthetic c:Ljava/util/List;


# direct methods
.method public synthetic constructor <init>(Lzr0;Ljava/util/List;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LSr0;->b:Lzr0;

    iput-object p2, p0, LSr0;->c:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, LSr0;->b:Lzr0;

    iget-object v1, p0, LSr0;->c:Ljava/util/List;

    invoke-static {v0, v1}, Lzr0$z;->b(Lzr0;Ljava/util/List;)V

    return-void
.end method
