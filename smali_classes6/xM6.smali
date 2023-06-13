.class public final synthetic LxM6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final b:LAM6;

.field public final c:I

.field public final d:Ljava/lang/String;


# direct methods
.method public constructor <init>(LAM6;ILjava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LxM6;->b:LAM6;

    iput p2, p0, LxM6;->c:I

    iput-object p3, p0, LxM6;->d:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, LxM6;->b:LAM6;

    iget v1, p0, LxM6;->c:I

    iget-object v2, p0, LxM6;->d:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, LAM6;->i(ILjava/lang/String;)V

    return-void
.end method
