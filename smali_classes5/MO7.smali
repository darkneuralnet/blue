.class public final LMO7;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:I

.field public final b:LPQ7;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-object v0, LPQ7;->b:LPQ7;

    iput-object v0, p0, LMO7;->b:LPQ7;

    return-void
.end method


# virtual methods
.method public final a(I)LMO7;
    .locals 0

    iput p1, p0, LMO7;->a:I

    return-object p0
.end method

.method public final b()LfR7;
    .locals 3

    new-instance v0, LwO7;

    iget v1, p0, LMO7;->a:I

    iget-object v2, p0, LMO7;->b:LPQ7;

    invoke-direct {v0, v1, v2}, LwO7;-><init>(ILPQ7;)V

    return-object v0
.end method
