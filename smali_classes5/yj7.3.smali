.class public final Lyj7;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:I

.field public final b:Lom7;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-object v0, Lom7;->b:Lom7;

    iput-object v0, p0, Lyj7;->b:Lom7;

    return-void
.end method


# virtual methods
.method public final a(I)Lyj7;
    .locals 0

    iput p1, p0, Lyj7;->a:I

    return-object p0
.end method

.method public final b()Lin7;
    .locals 3

    new-instance v0, LFi7;

    iget v1, p0, Lyj7;->a:I

    iget-object v2, p0, Lyj7;->b:Lom7;

    invoke-direct {v0, v1, v2}, LFi7;-><init>(ILom7;)V

    return-object v0
.end method
