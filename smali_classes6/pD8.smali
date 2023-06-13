.class public final synthetic LpD8;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:LBD8;

.field public final synthetic c:I

.field public final synthetic d:Ljava/lang/Exception;

.field public final synthetic e:[B

.field public final synthetic f:Ljava/util/Map;


# direct methods
.method public synthetic constructor <init>(LBD8;ILjava/lang/Exception;[BLjava/util/Map;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LpD8;->b:LBD8;

    iput p2, p0, LpD8;->c:I

    iput-object p3, p0, LpD8;->d:Ljava/lang/Exception;

    iput-object p4, p0, LpD8;->e:[B

    iput-object p5, p0, LpD8;->f:Ljava/util/Map;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 5

    iget-object v0, p0, LpD8;->b:LBD8;

    iget v1, p0, LpD8;->c:I

    iget-object v2, p0, LpD8;->d:Ljava/lang/Exception;

    iget-object v3, p0, LpD8;->e:[B

    iget-object v4, p0, LpD8;->f:Ljava/util/Map;

    invoke-virtual {v0, v1, v2, v3, v4}, LBD8;->a(ILjava/lang/Exception;[BLjava/util/Map;)V

    return-void
.end method
