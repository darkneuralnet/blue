.class public final LoP7;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:I

.field public final b:LsR7;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-object v0, LsR7;->b:LsR7;

    iput-object v0, p0, LoP7;->b:LsR7;

    return-void
.end method


# virtual methods
.method public final a(I)LoP7;
    .locals 0

    iput p1, p0, LoP7;->a:I

    return-object p0
.end method

.method public final b()LHR7;
    .locals 3

    new-instance v0, LZO7;

    iget v1, p0, LoP7;->a:I

    iget-object v2, p0, LoP7;->b:LsR7;

    invoke-direct {v0, v1, v2}, LZO7;-><init>(ILsR7;)V

    return-object v0
.end method
